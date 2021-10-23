<!-- 
    Written in 2021 by bysrkh
    Cirebon, Indonesia
    MIT-License
-->
---

# Table of Contents {#table-of-contents-table-of-contents}

|Contents|
|---|
|[Table of Content](#table-of-contents)|
|[Description](#description)|
|[How to Run](#how-to-run)|
|[Important Release Update](#important-release update)|
|[Discussion Channel](#discussion-channel)|

___

# Description {#description-description}

It is a configuration server for my entire spring-boot microservices in my github build
for [Spring Cloud version Hoxton.SR8][3]
___

# How to run {#how-to-run-how-to-run}

1. Setup ssh key pairs on current user
```shell
 # On Windows NT's command prompt, *NIX like GNU/Linux' bash shell, and SUS UNIX-03 macOS' zsh shell 
ssh-keygen -t rsa
# additional command on Windows NT's command prompt only to convert openssh version to legacy version
ssh-keygen -p -m pem
```
2. [Download][1] and install JDK
3. add `_JAVA_OPTIONS` and some necessary values into user's environment variable

```shell
    # On Windows NT's command prompt
    setx _JAVA_OPTIONS "_JAVA_OPTIONS=-Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en -Duser.timezone=Etc/UTC"
    
    # On *NIX like GNU/Linux' bash shell
    echo 'export _JAVA_OPTIONS=-Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en -Duser.timezone=Etc/UTC' >> ~/.bashrc
    
    # On SUS UNIX-03 macOS' zsh shell
    echo 'export _JAVA_OPTIONS=-Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en -Duser.timezone=Etc/UTC' >> ~/.zshrc
```

3. locate the working directory, then run program

```shell
    # On Windows NT's command prompt
    .\gradlew clean bootRun
    
    # On *NIX like GNU/Linux's bash shell and On SUS UNIX-03 macOS' zsh shell
    ./gradlew clean bootRun
```

---

# Important Release Update {#important-release-update-important-release-update}

|Version|Description|
|---:|---|
|v0.0.1-SNAPSHOT|initial development release, providing early environment diagnostic check, and providing README.md|

---

# Discussion Channel {#discussion-channel-discussion-channel}

I am really open for discussion on here

- [Facebook][4]
- [LinkedIn][5]
- [Email][6]

[1]: https://developers.redhat.com/products/openjdk/download "Visit this link to see list of JDK downloads"

[2]: https://www.postgresql.org/download/ "Visit this link to see list of SQL Database download"

[3]: https://spring.io/projects/spring-cloud "Visit this link to see the Spring Cloud release train matrix guide"

[4]: https://facebook.com/bysrkh "Visit my Facebook account"

[5]: https://linkedin.com/u/bysrkh "Visit my LinkedIn account"

[6]: mailto:bysrkh@gmail.com "Leave me an email here"