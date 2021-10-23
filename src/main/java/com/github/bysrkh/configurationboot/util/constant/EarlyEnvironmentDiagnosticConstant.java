package com.github.bysrkh.configurationboot.util.constant;

/**
 * provides environment variable key as static string value for checking early environment diagnostic
 * <p>
 * It comprises of:
 * <ul>
 * <li>{@link EarlyEnvironmentDiagnosticConstant#SYSTEM_VERSION_PROPERTY}
 * <li>{@link EarlyEnvironmentDiagnosticConstant#SPRING_PROFILE}, etc
 * </ul>
 *
 * @author bysrkh
 * <br>
 * @version 0.0.1-SNAPSHOT
 * <br>
 * @since 2021-10-23
 */
public class EarlyEnvironmentDiagnosticConstant {

    /**
     * Running JVM application's file encoding information.
     * <p>
     * Follow command bellow to update the running JVM application's file encoding.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code setx _JAVA_OPTIONS "-Dfile.encoding=IANA name"}</pre>
     * <li>*NIX like GNU/Linux' bash shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-Dfile.encoding=IANA name '>> ~/.bashrc}</pre>
     *  <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-file.encoding=IANA name' >> ~/.zshrc}</pre>
     * </ul>
     *
     * @see <a href="https://www.iana.org/assignments/character-sets/character-sets.xhtml">List of IANA name</a>
     */
    public static final String USER_FILE_ENCODING_PROPERTY = "file.encoding";

    /**
     * Running JVM application's user working directory information.
     */
    public static final String USER_CLASSPATH_PROPERTY = "user.dir";

    /**
     * Running JVM application's user directory information.
     * <p>
     * Follow bellow command to compare system user directory  with current jvm user directory.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code echo %USERPROFILE%}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>@{@code echo $HOME}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>@{@code echo $HOME}</pre>
     * </ul>
     */
    public static final String USER_PATH_PROPERTY = "user.home";

    /**
     * Running JVM application's user logon information.
     * <p>
     * Follow bellow command to compare system user logon  with current jvm user logon.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code echo %USERNAME%}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code echo $USER}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code echo $USER}</pre>
     * </ul>
     */
    public static final String USER_NAME_PROPERTY = "user.name";

    /**
     * Running JVM application's tzdata database name of timezone information.
     * <p>
     * Follow the command bellow to compare system with current jvm's tzdata database name of timezone.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code tzutil.exe /l}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code timedatectl | grep “Time zone”}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code systemsetup -gettimezone}</pre>
     * </ul>
     * <p>
     * Follow the command bellow to update the running JVM appliation's timezone.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code setx _JAVA_OPTIONS "-Duser.timezone=tzdata database name here"}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-Duser.timezone=tzdata database name here' >> ~/.bashrc}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-Duser.timezone=tzdata database name here' >> ~/.zshrc}</pre>
     * </ul>
     *
     * @see
     * <a href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones">List of ISO-3166 language and country code</a>
     */
    public static final String USER_TIMEZONE = "user.timezone";

    /**
     * Running JVM application's environment profile information.
     * <p>
     * Follow the command bellow to update the running JVM appliation's environment profile.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code setx SPRING_PROFILES_ACTIVE "spring-profile-here"}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code echo 'export SPRING_PROFILES_ACTIVE=spring-profile-here' >> ~/.bashrc}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code echo 'export SPRING_PROFILES_ACTIVE=spring-profile-here' >> ~/.zshrc}</pre>
     * </ul>
     */
    public static final String SPRING_PROFILE = "spring.profiles.active";

    /**
     * Running JVM application's ISO-3166-1 alpha-2 code country.
     * <p>
     * Follow the command bellow to compare system with current jvm's application's ISO-3166-1 alpha-2 code country.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code systeminfo | findstr /B /C:”System Locale”}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code localectl status | grep “System Locale”}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code locale | grep "LANG"}</pre>
     * </ul>
     * Follow command bellow to update the running JVM appliation's ISO-3166-1 alpha-2 code country.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code setx _JAVA_OPTIONS "-Duser.country=ISO-3166-1 alpha-2 code country here"}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-Duser.country=ISO-3166-1 alpha-2 code country here' >> ~/.bashrc}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-Duser.country=ISO-3166-1 alpha-2 code country here' >> ~/.zshrc}</pre>
     * </ul>
     *
     * @see
     * <a href="https://docs.oracle.com/cd/E13214_01/wli/docs92/xref/xqisocodes.html">List of ISO-3166-1 alpha-2 language and code country</a>
     */
    public static final String USER_LOCALE_TERRITORY_PROPERTY = "user.country";

    /**
     * Running JVM application's ISO-3166-1 alpha-2 code country language.
     * <p>
     * Follow the command bellow to compare system with current jvm's application's ISO-3166-1 alpha-2 code language.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code systeminfo | findstr /B /C:”System Locale”}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code localectl status | grep “System Locale”}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code locale | grep "LANG"}</pre>
     * </ul>
     * Follow command bellow to update the running JVM appliation's ISO-3166-1 alpha-2 code language.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code setx _JAVA_OPTIONS "-Duser.language=ISO-3166-1 alpha-2 language country here"}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-Duser.language=ISO-3166-1 alpha-2 code country here' >> ~/.bashrc}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code echo 'export _JAVA_OPTIONS=-Duser.language=ISO-3166-1 alpha-2 code language here' >> ~/.zshrc}</pre>
     * </ul>
     *
     * @see
     * <a href="https://docs.oracle.com/cd/E13214_01/wli/docs92/xref/xqisocodes.html">List of ISO-3166-1 alpha-2 language and code country</a>
     */
    public static final String USER_LOCALE_LANGUAGE_PROPERTY = "user.language";

    /**
     * Running JVM application's JRE vendor name information.
     */
    public static final String SYSTEM_JAVA_VENDOR_NAME_PROPERTY = "java.vendor";

    /**
     * Running JVM application's JRE version number information.
     */
    public static final String SYSTEM_JAVA_VERSION_PROPERTY = "java.runtime.version";

    /**
     * Running JVM application's JRE directory location information.
     * <p>
     * Follow the command bellow to compare system with current jvm's JRE directory location information.
     * <ul>
     * <li>Windows' command prompt
     * <pre>{@code echo %JAVA_HOME%}</pre>
     * <li>*NIX-like GNU/Linux' bash shell
     * <pre>{@code echo $JAVA_HOME}</pre>
     * <li>SUS UNIX-03 macOS' zsh shell
     * <pre>{@code echo $JAVA_HOME}</pre>
     * </ul>
     */
    public static final String SYSTEM_JAVA_PATH_PROPERTY = "java.home";

    /**
     * Running JVM application's system name information.
     */
    public static final String SYSTEM_NAME_PROPERTY = "os.name";

    /**
     * Running JVM application's system version information.
     */
    public static final String SYSTEM_VERSION_PROPERTY = "os.version";

    /**
     * Running JVM application's JRE running mode information.
     */
    public static final String SYSTEM_JAVA_RUNNING_MODE_PROPERTY = "java.vm.name";

    /**
     * Running JVM application's JRE name information.
     */
    public static final String SYSTEM_JAVA_NAME_PROPERTY = "java.runtime.name";

}
