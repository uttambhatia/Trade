import oracledb
import pandas as pd
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.application import MIMEApplication

# Step 1: Connect to Oracle Database using python-oracledb in thin mode
conn = oracledb.connect(
    user='',
    password='',
    dsn='localhost:1521/xe'  # Example: 'localhost:1521/XEPDB1'
)

# Step 2: Query employee records
query = "SELECT * FROM dual"
df = pd.read_sql(query, con=conn)
conn.close()

# Step 3: Save to CSV
csv_file = 'employee_records.csv'
df.to_csv(csv_file, index=False)

# Step 4: Compose and send email
def send_email(sender, receiver, subject, body, smtp_server, port, login, password, attachment_path):
    msg = MIMEMultipart()
    msg['From'] = sender
    msg['To'] = receiver
    msg['Subject'] = subject
    msg.attach(MIMEText(body, 'plain'))

    # Attach CSV file
    with open(attachment_path, 'rb') as file:
        part = MIMEApplication(file.read(), Name=attachment_path)
        part['Content-Disposition'] = f'attachment; filename="{attachment_path}"'
        msg.attach(part)

    # Send email via SMTP
    with smtplib.SMTP(smtp_server, port) as server:
        server.starttls()
        server.login(login, password)
        server.send_message(msg)

# Example email parameters
send_email(
    sender='@gmail.com',
    receiver='@gmail.com',
    subject='Employee Records',
    body='Please find attached the latest employee data.',
    smtp_server='smtp.gmail.com',
    port=587,
    login='@gmail.com',
    password='',
    attachment_path=csv_file
)
