#Apprenticeship
http://portal.mhrdnats.gov.in/sites/default/files/file_upload/Indian_Railway_Rail_wheel_plant_bela.pdf

# Trade
https://www.jagranjosh.com/articles/ugc-net-previous-year-papers-1543489844-1

https://kumarbharat.com/



<?xml version="1.0" encoding="UTF-8"?>
<configuration>

	<property name="LOGS" value="./logs" />

	<appender name="Console" class="ch.qos.logback.core.ConsoleAppender">
		<layout class="ch.qos.logback.classic.PatternLayout">
			<Pattern>
				%black(%d{ISO8601}) %highlight(%-5level) [%blue(%t)]
				%yellow(%C{1.}): %msg%n%throwable
			</Pattern>
		</layout>
	</appender>

	<appender name="RollingFile"
		class="ch.qos.logback.core.rolling.RollingFileAppender">
		<file>${LOGS}/spring-boot-logger_${spring.profiles.active}.log</file>
		<encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
			<Pattern>%d %p %C{1.} [%t] %m%n</Pattern>
		</encoder>

		<rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
			<!-- rollover daily and when the file reaches 10 MegaBytes -->
			<fileNamePattern>${LOGS}/archived/spring-boot-logger-%d{yyyy-MM-dd}.%i.log
			</fileNamePattern>
			<timeBasedFileNamingAndTriggeringPolicy
				class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
				<maxFileSize>1MB</maxFileSize>
			</timeBasedFileNamingAndTriggeringPolicy>
		</rollingPolicy>
	</appender>


	<springProfile name="local">
		<root level="error">
			<appender-ref ref="RollingFile" />
			<appender-ref ref="Console" />
		</root>

		<logger name="com.cs.demo" level="error" additivity="false">
			<appender-ref ref="RollingFile" />
			<appender-ref ref="Console" />
		</logger>
	</springProfile>

	<springProfile name="dev">
		<root level="info">
			<appender-ref ref="RollingFile" />
			<appender-ref ref="Console" />
		</root>

		<logger name="com.cs.demo" level="info" additivity="false">
			<appender-ref ref="RollingFile" />
			<appender-ref ref="Console" />
		</logger>
	</springProfile>


</configuration>
