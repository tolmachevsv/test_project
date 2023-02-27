# Автотесты на интернет-магазин [Zara](https://www.zara.com/id/en/)

## :large_blue_circle: Используемые технологии и инструменты

| GitHub  | IntelliJ IDEA | Java | Gradle | JUnit 5 | Selenide | Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
| :---: |      :---:      | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="40" height="40">  | <img src="https://raw.githubusercontent.com/JetBrains/logos/318905148b7074a044586c6567d1ee76d8fb49e2/web/intellij-idea/intellij-idea.svg" width="30">  | <img src="https://upload.wikimedia.org/wikipedia/ru/thumb/3/39/Java_logo.svg/351px-Java_logo.svg.png?20230113103550" width="22"> | <img src="https://gradle.com/wp-content/themes/fuel/assets/img/branding/gradle-elephant-icon-dark-green.svg" width="40"> | <img src="https://user-images.githubusercontent.com/46191990/221414912-9f5a9181-6a58-4ba2-b3be-620d0d8fa19f.png" width="55"> | <img src="https://user-images.githubusercontent.com/46191990/221415200-6162a078-955f-4be3-8ae8-1350215805b0.jpeg" width="55"> | <img src="https://user-images.githubusercontent.com/46191990/221415486-ca8686f0-0d5a-4d40-8858-1a844a39937b.png" width="40"> | <img src="https://user-images.githubusercontent.com/46191990/221415747-8b6fc198-d237-4b57-b103-ee2e63f32724.jpeg" width="35"> | <img src="https://user-images.githubusercontent.com/46191990/221416348-be1f6557-2259-470f-a789-516cadffd527.jpeg" width="35"> | <img src="https://user-images.githubusercontent.com/46191990/221416709-a5038b76-c7c8-434c-a8d0-f567248f2b26.svg" width="70"> | <img src="https://user-images.githubusercontent.com/46191990/221416898-5bd22273-cdcd-4782-895e-a9181fda3733.jpg" width="40"> |

## :large_blue_circle: Run tests with terminal
``` 
gradle clean test 
-DselenoidUrl=[SELENOID_URL]
-Dbrowser=[BROWSER]
-DbrowserVersion=[BROWSER_VERSION] 
-DbrowserSize=[BROWSER_SIZE] 
-DbaseUrl=[BASE_URL] 
```
### Parameters
1. [SELENOID_URL] - Remote Selenoid server (default "*selenoid.autotests.cloud/wd/hub*")
2. [BROWSER] - Browser name (default "*chrome*")
3. [BROWSER_VERSION] - Browser version (default "*100*")
4. [BROWSER_SIZE] - Browser window size (default "*1920x1080*")
5. [BASE_URL] - Base URL (default "*https://www.zara.com/id/en/*")
## :large_blue_circle: Run tests with Jenkins job
1. Open the [Jenkins link](https://jenkins.autotests.cloud/job/08-sergeyt-java_jenkins_project/)
2. Click on the button "*Assemble with parameters*": 
<img src="https://user-images.githubusercontent.com/46191990/221453977-35be7ef9-1753-4545-aa73-b158ab3a2032.png" width=500>
3. You can change default parameter's values (optional) 
<img src="https://user-images.githubusercontent.com/46191990/221456886-3134f47b-ad83-425f-a6d0-7c3bc97688e7.png" width="900">
   
   - *TASK* parameter means which group of tests should be run (for example, if you want to run all of the tests - choose *test*, to run login tests only - choose *login_tests* etc)

4. Click on the button "*Assemble*"

## :large_blue_circle: Allure Reports
If you need to check test results you can open Allure Reports. Just click on the logo on the right in the run line: 
<img src="https://user-images.githubusercontent.com/46191990/221460269-727f2290-b5f8-4ac0-b35d-cdfa450b7457.png" width="500">

Allure Reports looks like this:

<img src="https://user-images.githubusercontent.com/46191990/221461067-a815132d-3797-4615-bc0a-f015a877bcb3.png" width="800">

## :large_blue_circle: Allure TestOps
Also you can open Allure TestOps to check test's progress while tests is running. You can do this by clicking Allure TestOps logo in the run line:
<img src="https://user-images.githubusercontent.com/46191990/221593711-f4bde050-b4f3-4145-913f-5fa8b4199644.png" width="500">

Allure TestOps looks like this:

<img src="https://user-images.githubusercontent.com/46191990/221596070-3a5b037d-0687-458e-af39-bf770c91a70c.png" width="800">

## :large_blue_circle: Telegram notification
This project has telegram notifications with some useful information and diagram which shows proportion of successful and failed tests.
Screenshot demonstrates this information:

<img src="https://user-images.githubusercontent.com/46191990/221599521-3d3cc7e5-e2d7-46d4-8d3e-05b395df9eb0.png" width="400">

## :large_blue_circle: Test run video
Video shows why most of my tests failed. This is because of the ***pop-up window*** that doesn't appear locally:

![video](https://user-images.githubusercontent.com/46191990/221604154-2a5a327c-3ad0-4df8-88cd-886eb30b1f62.gif)


