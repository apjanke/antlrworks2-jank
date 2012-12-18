@ECHO OFF

SET ANTLR4_VERSION=4.0-SNAPSHOT
SET ANTLR3_VERSION=3.5-rc-2
SET ST4_VERSION=4.0.7-rc-2

SET ANTLR3_MAVEN_HOME=%USERPROFILE%\.m2\repository\org\antlr
SET ANTLR4_MAVEN_HOME=%USERPROFILE%\.m2\repository\com\tunnelvisionlabs

SET ST4_RUNTIME_JAR=%ANTLR3_MAVEN_HOME%\ST4\%ST4_VERSION%\ST4-%ST4_VERSION%.jar
SET ANTLR3_RUNTIME_JAR=%ANTLR3_MAVEN_HOME%\antlr-runtime\%ANTLR3_VERSION%\antlr-runtime-%ANTLR3_VERSION%.jar
SET ANTLR3_RUNTIME_CLASSPATH=%ANTLR3_RUNTIME_JAR%
SET ANTLR4_RUNTIME_JAR=%ANTLR4_MAVEN_HOME%\antlr4-runtime\%ANTLR4_VERSION%\antlr4-runtime-%ANTLR4_VERSION%.jar
SET ANTLR4_RUNTIME_CLASSPATH=%ANTLR4_RUNTIME_JAR%

SET ST4_CLASSPATH=%ANTLR3_MAVEN_HOME%\ST4\%ST4_VERSION%\ST4-%ST4_VERSION%.jar;%ANTLR3_RUNTIME_CLASSPATH%

SET ANTLR3_TOOL_JAR=%ANTLR3_MAVEN_HOME%\antlr\%ANTLR3_VERSION%\antlr-%ANTLR3_VERSION%.jar
SET ANTLR3_CLASSPATH=%ANTLR3_TOOL_JAR%;%ST4_CLASSPATH%
SET ANTLR4_TOOL_JAR=%ANTLR4_MAVEN_HOME%\antlr4\%ANTLR4_VERSION%\antlr4-%ANTLR4_VERSION%.jar
SET ANTLR4_CLASSPATH=%ANTLR4_TOOL_JAR%;%ST4_CLASSPATH%;%ANTLR4_RUNTIME_CLASSPATH%

SET ANTLR3_TOOL=-cp %ANTLR3_CLASSPATH% org.antlr.Tool
SET ANTLR4_TOOL=-cp %ANTLR4_CLASSPATH% org.antlr.v4.Tool

SET SOURCE_ROOT=%CD%

SET ST4_RUNTIME_WRAPPER_DIR=org-stringtemplate-v4\release\modules\ext
SET ANTLR3_RUNTIME_WRAPPER_DIR=org-antlr-runtime\release\modules\ext
SET ANTLR3_TOOL_WRAPPER_DIR=org-antlr\release\modules\ext
SET ANTLR4_RUNTIME_WRAPPER_DIR=org-antlr-v4-runtime\release\modules\ext
SET ANTLR4_TOOL_WRAPPER_DIR=org-antlr-v4\release\modules\ext

IF NOT EXIST %ST4_RUNTIME_WRAPPER_DIR% (
    MKDIR %ST4_RUNTIME_WRAPPER_DIR%
)

ECHO Updating st4.jar (%ST4_VERSION%)
COPY %ST4_RUNTIME_JAR% %ST4_RUNTIME_WRAPPER_DIR%\st4.jar

IF NOT EXIST %ANTLR3_RUNTIME_WRAPPER_DIR% (
    MKDIR %ANTLR3_RUNTIME_WRAPPER_DIR%
)

ECHO Updating antlr3_runtime.jar (%ANTLR3_VERSION%)
COPY %ANTLR3_RUNTIME_JAR% %ANTLR3_RUNTIME_WRAPPER_DIR%\antlr3_runtime.jar

IF NOT EXIST %ANTLR3_TOOL_WRAPPER_DIR% (
    MKDIR %ANTLR3_TOOL_WRAPPER_DIR%
)

ECHO Updating antlr3.jar (%ANTLR3_VERSION%)
COPY %ANTLR3_TOOL_JAR% %ANTLR3_TOOL_WRAPPER_DIR%\antlr3.jar

IF NOT EXIST %ANTLR4_RUNTIME_WRAPPER_DIR% (
    MKDIR %ANTLR4_RUNTIME_WRAPPER_DIR%
)

ECHO Updating antlr4_runtime.jar (%ANTLR4_VERSION%)
COPY %ANTLR4_RUNTIME_JAR% %ANTLR4_RUNTIME_WRAPPER_DIR%\antlr4_runtime.jar

IF NOT EXIST %ANTLR4_TOOL_WRAPPER_DIR% (
    MKDIR %ANTLR4_TOOL_WRAPPER_DIR%
)

ECHO Updating antlr4.jar (%ANTLR4_VERSION%)
COPY %ANTLR4_TOOL_JAR% %ANTLR4_TOOL_WRAPPER_DIR%\antlr4.jar
