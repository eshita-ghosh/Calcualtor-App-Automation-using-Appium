# Google Calcualtor App Automation using Selenium and Appium
# Technology Used
- Selenium
- TestNG
- Appium
- Android Studio
- Appium Inspector
# How to run this project:
- Clone this project
- Open Android Studio and Open the APK file:
- Set required configuration
- Hit this command in cmd for checking the connectivity with emulator : adb devices
- Open Appium Server with following command: appium -p 4723
- Open Appium Inspector
- Set desired capabilites in json format:
  {
 "appium:deviceName": "emulator",
  "appium:uuid": "emulator-5554",
  "platformName": "Android",
  "appium:platformVersion": "11",
  "appium:appPackage": "com.google.android.calculator",
  "appium:appActivity": "com.android.calculator2.Calculator",
  "appium:app": "F:\\calculator.apk"
  }
- Open Intellij Idea
- Put this command into the terminal: gradle clean test

# Prerequisites:
- Install jdk 11
- Install Android Studio latest version
- Install Appium Inspector
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME in the system environment

# Output:


https://github.com/eshita-ghosh/Calcualtor-App-Automation-using-Appium/assets/75900194/9793dd18-c496-45d4-a750-10db66445d7d


