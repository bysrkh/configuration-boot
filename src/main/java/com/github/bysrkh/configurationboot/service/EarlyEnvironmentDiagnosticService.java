/*
 * Check early environment diagnostic here
 *
 * MIT License
 * @author bysrkh
 * @since 2021-09-06
 */
package com.github.bysrkh.configurationboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;


import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SPRING_PROFILE;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SYSTEM_JAVA_NAME_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SYSTEM_JAVA_PATH_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SYSTEM_JAVA_RUNNING_MODE_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SYSTEM_JAVA_VENDOR_NAME_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SYSTEM_JAVA_VERSION_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SYSTEM_NAME_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.SYSTEM_VERSION_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.USER_CLASSPATH_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.USER_FILE_ENCODING_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.USER_LOCALE_LANGUAGE_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.USER_LOCALE_TERRITORY_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.USER_NAME_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.USER_PATH_PROPERTY;
import static com.github.bysrkh.configurationboot.util.constant.EarlyEnvironmentDiagnosticConstant.USER_TIMEZONE;

@Service
public class EarlyEnvironmentDiagnosticService {
    private static final Logger log = LoggerFactory.getLogger(EarlyEnvironmentDiagnosticService.class);

    private Environment env;

    /**
     * Check early environment diagnostic process
     */
    @PostConstruct
    public void showEarlyEnvironmentDiagnostic() {
        log.info("System Version : {} {}", env.getProperty(SYSTEM_NAME_PROPERTY),
                 env.getProperty(SYSTEM_VERSION_PROPERTY));
        log.info("User Logon : {}", env.getProperty(USER_NAME_PROPERTY));
        log.info("Locale : {}_{}.{}", env.getProperty(USER_LOCALE_LANGUAGE_PROPERTY),
                 env.getProperty(USER_LOCALE_TERRITORY_PROPERTY), env.getProperty(USER_FILE_ENCODING_PROPERTY));
        log.info("Date and Time Timezone : {}", env.getProperty(USER_TIMEZONE));
        log.info("User Home Directory : {}", env.getProperty(USER_PATH_PROPERTY));
        log.info("Java Version : {} {} {} {}", env.getProperty(SYSTEM_JAVA_VENDOR_NAME_PROPERTY),
                 env.getProperty(SYSTEM_JAVA_NAME_PROPERTY), env.getProperty(SYSTEM_JAVA_VERSION_PROPERTY),
                 env.getProperty(SYSTEM_JAVA_RUNNING_MODE_PROPERTY));
        log.info("Java Home : {}", env.getProperty(SYSTEM_JAVA_PATH_PROPERTY));
        log.info("Java Classpath : {}", env.getProperty(USER_CLASSPATH_PROPERTY));
        log.info("Application Environment Profile : {}", env.getProperty(SPRING_PROFILE));

    }

    @Autowired
    public void setEnv(Environment env) {
        this.env = env;
    }

}
