package components

import java.io.File

internal const val version = "3.0"
internal const val testProjectName = "KotlinSample"
internal const val defaultDebug = false
internal const val defaultMainModule = "app"
internal const val defaultVariant = "debug"
internal val mainModuleTest = "$testProjectName${File.separator}$defaultMainModule"
internal const val gradleTaskNameDoctor = "stringcarePreview"
internal const val gradleTaskNameObfuscate = "stringcareObfuscate"
internal const val extensionName = "stringcare"
internal const val winLib = "libsignKey.dll"
internal const val osxLib = "libsignKey.dylib"
internal const val wrapperOsX = "./gradlew"
internal const val wrapperWindows = "gradlew.bat"
internal const val copyCommandOsX = "cp"
internal const val copyCommandWindows = "copy"
internal const val emptyChar = ""
internal const val backupStringRes = "backupStringResources"
internal const val obfuscateStringRes = "obfuscateStringResources"
internal const val test = "Test"
internal const val pre = "pre"
internal const val build = "Build"
internal const val merge = "merge"
internal const val resources = "Resources"
