/**
 * <p>provides constant for EarlyEnvironmentDiagnosticService class</p>
 * MIT License
 *
 * @author bysrkh
 * @since 2021-10-19
 */

package com.github.bysrkh.configurationboot.util.constant;

public class EarlyEnvironmentDiagnosticConstant {

    /**
     * <p>Running JVM application's file encoding information.</p>
     * <p>Follow command bellow to update the running JVM appliation's timezone.</p>
     * <p><li>
     * <ul>Windows' command prompt</ul>
     * <code>setx _JAVA_OPTIONS "-Dfile.encoding=IANA name</code>
     * <ul>*NIX like GNU/Linux's bash shell</ul>
     * <code>echo 'export _JAVA_OPTIONS=-Dfile.encoding=IANA name' >> ~/.bashrc</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>echo 'export _JAVA_OPTIONS=-file.encoding=IANA name' >> ~/.zshrc</code>
     * </li>
     * </p>
     * <p>See the complete list on the<a href="https://www.iana.org/assignments/character-sets/character-sets
     * .xhtml">link</a>
     * </p>
     */
    public static final String USER_FILE_ENCODING_PROPERTY = "file.encoding";

    /*
     * <p>Running JVM application's user working directory information</p>
     */
    public static final String USER_CLASSPATH_PROPERTY = "user.dir";
    /*
     * <p>Running JVM application's user directory information</p>
     * <p>Follow bellow command to compare system user directory  with current jvm user directory.</p>
     * <ul>Windows's command prompt</ul>
     * <code>echo %USERPROFILE%</code>
     * <ul>*NIX-like GNU/Linux's bash shell</ul>
     * <code>echo $HOME</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>echo $HOME</code>
     * </li>
     */
    public static final String USER_PATH_PROPERTY = "user.home";
    /*
     * <p>Running JVM application's username logon information</p>
     * <p>Follow bellow command to compare system username logon with current jvm username logon.</p>
     * <ul>Windows's command prompt</ul>
     * <code>echo %USERNAME%</code>
     * <ul>*NIX-like GNU/Linux's bash shell</ul>
     * <code>echo $USER</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>echo $USER</code>
     * </li>
     */
    public static final String USER_NAME_PROPERTY = "user.name";

    /*
     * <p>Running JVM application's ISO-8601 timezone information.</p>
     * <p>Follow bellow command to compare system timezone with current jvm timezone.</p>
     * <li>
     * <ul>Windows's command prompt</ul>
     * <code>1. tzutil.exe /l</code>
     * <ul> *NIX-like GNU/Linux's bash shell</ul>
     * <code> timedatectl | grep “Time zone”</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>systemsetup -gettimezone</code>
     * </li>
     * <p>Follow command bellow to update the running JVM appliation's timezone.</p>
     * <li>
     * <ul>Windows' command prompt</ul>
     * <code>setx _JAVA_OPTIONS "-Duser.timezone=ISO-8601 code here</code>\
     * <ul>*NIX like GNU/Linux's bash shell/ul>
     * <code>echo 'export _JAVA_OPTIONS=-Duser.timezone=ISO-8601 code here' >> ~/.bashrc</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>echo 'export _JAVA_OPTIONS=-Duser.timezone=ISO-8601 code here' >> ~/.zshrc</code>
     * </li>
     */
    public static final String USER_TIMEZONE = "user.timezone";

    /*
     * <p>Running JVM application's spring profile</p>
     * <p>Follow command bellow to update the running JVM appliation's spring profile.</p>
     * <li>
     * <ul>Windows' command prompt</ul>
     * <code>setx SPRING_PROFILE_ACTIVE "sprofile profile here"</code>\
     * <ul>*NIX like GNU/Linux's bash shell/ul>
     * <code>echo 'export SPRING_PROFILE_ACTIVE=sprofile profile here' >> ~/.bashrc</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>echo 'export SPRING_PROFILE_ACTIVE=sprofile profile here' >> ~/.zshrc</code>
     * </li>
     *
    public static final String SPRING_PROFILE = "spring.profiles.active";


    /*
     * <p>Running JVM application's ISO-3166-1 alpha-2 code country</p>
     * <p>Follow bellow command to compare system user country with current jvm user country.</p>
     * <li>
     * <ul>Windows's command prompt</ul>
     * <code>systeminfo | findstr /B /C:”System Locale”</code>
     * <ul> *NIX-like GNU/Linux's bash shell</ul>
     * <code> localectl status | grep “System Locale”</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>locale | grep "LANG"</code>
     * </li>
     * <p>Follow command bellow to update the running JVM appliation's user country.</p>
     * <li>
     * <ul>Windows' command prompt</ul>
     * <code>setx _JAVA_OPTIONS "-Duser.country=ISO-639-1 code language"</code>\
     * <ul>*NIX like GNU/Linux's bash shell/ul>
     * <code>echo 'export _JAVA_OPTIONS=-Duser.country=ISO-3166-1 alpha-2 code country' >> ~/.bashrc</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>echo 'export _JAVA_OPTIONS=-Duser.countrye=ISO-3166-1 alpha-2 code country' >> ~/.zshrc</code>
     * </li>
     * See the complete list on the<a href="https://en.wikipedia.org/wiki/ISO_3166-1#Coding">link</>
     */
    public static final String USER_LOCALE_TERRITORY_PROPERTY = "user.country";

    /*
     * <p>Running JVM application's ISO-639-1 code language</p>
     * <p>Follow bellow command to compare system user language with current jvm user language.</p>
     * <li>
     * <ul>Windows's command prompt</ul>
     * <code>systeminfo | findstr /B /C:”System Locale”</code>
     * <ul> *NIX-like GNU/Linux's bash shell</ul>
     * <code> localectl status | grep “System Locale”</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>locale | grep "LANG"</code>
     * </li>
     * <p>Follow command bellow to update the running JVM appliation's code language.</p>
     * <li>
     * <ul>Windows' command prompt</ul>
     * <code>setx _JAVA_OPTIONS "-Duser.language=ISO-639-1 code language"</code>\
     * <ul>*NIX like GNU/Linux's bash shell/ul>
     * <code>echo 'export _JAVA_OPTIONS=-Duser.language=ISO-639-1 code language' >> ~/.bashrc</code>
     * <ul>SUS UNIX-03 macOS' zsh shell</ul>
     * <code>echo 'export _JAVA_OPTIONS=-Duser.language=ISO-639-1 code language' >> ~/.zshrc</code>
     * </li>
     * See the complete list on the<a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">link</>
     */
    public static final String USER_LOCALE_LANGUAGE_PROPERTY = "user.language";

    /*
     * <p>Running JVM application's JRE vendor name information</p>
     */
    public static final String SYSTEM_JAVA_VENDOR_NAME_PROPERTY = "java.vendor";

    /*
     * <p>Running JVM application's JRE version information</p>
     */
    public static final String SYSTEM_JAVA_VERSION_PROPERTY = "java.runtime.version";

    /*
     * <p>Running JVM application's JRE directory information</p>
     */
    public static final String SYSTEM_JAVA_PATH_PROPERTY = "java.home";

    /*
     * <p>Running JVM application's OS name information</p>
     */
    public static final String SYSTEM_NAME_PROPERTY = "os.name";

    /*
     * <p>Running JVM application's OS version information</p>
     */
    public static final String SYSTEM_VERSION_PROPERTY = "os.version";

    /*
     * <p>Running JVM application's OS JRE running mode information</p>
     */
    public static final String SYSTEM_JAVA_RUNNING_MODE_PROPERTY = "java.vm.name";

    /*
     * <p>Running JVM application's OS JRE running mode information</p>
     */
    public static final String SYSTEM_JAVA_NAME_PROPERTY = "java.runtime.name";

}
