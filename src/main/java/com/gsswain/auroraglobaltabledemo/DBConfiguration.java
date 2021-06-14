package com.gsswain.auroraglobaltabledemo;

import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRdsInstance(
        dbInstanceIdentifier = "${rds.db-instance-identifier}",
        username = "${rds.username}",
        password = "${rds.password}",
        databaseName = "${rds.databaseName}",
        readReplicaSupport = true)
public class DBConfiguration {
}
