# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile


# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line_active number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line_active number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# Отключить обфускацию
#-dontobfuscate

# Все модельки с сервера должны помечаться аннотацией @Keep, чтобы при обфускации не ломался парсинг json-данных

-include proguard-glide.pro
-include proguard-retrofit.pro
-include proguard-mobocards.pro

-keepclassmembers enum * { *; }

-keep class com.example.domain.interactor.** { *; }
-keep class androidx.appcompat.widget.** { *; }
-keep class endpass.android.endpass_sdk.App


-dontusemixedcaseclassnames
-verbose

-assumenosideeffects class android.util.Log {
  public static *** v(...);
  public static *** d(...);
  public static *** i(...);
  public static *** w(...);
  public static *** e(...);
}
-ignorewarnings
