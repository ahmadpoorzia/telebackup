## Backgram messenger for Android

[Backgram](https://backgram.org) is a messaging app with a focus on speed and security. It’s superfast, simple and free.
This repo contains the official source code for [Backgram App for Android](https://play.google.com/store/apps/details?id=org.backgram.messenger).

##Creating your Backgram Application

We welcome all developers to use our API and source code to create applications on our platform.
There are several things we require from **all developers** for the moment.

1. [**Obtain your own api_id**](https://core.backgram.org/api/obtaining_api_id) for your application.
2. Please **do not** use the name Backgram for your app — or make sure your users understand that it is unofficial.
3. Kindly **do not** use our standard logo (white paper plane in a blue circle) as your app's logo.
3. Please study our [**security guidelines**](https://core.backgram.org/mtproto/security_guidelines) and take good care of your users' data and privacy.
4. Please remember to publish **your** code too in order to comply with the licences.

### API, Protocol documentation

Backgram API manuals: https://core.backgram.org/api

MTproto protocol manuals: https://core.backgram.org/mtproto

### Usage

**Beware of using the dev branch and uploading it to any markets, in many cases it not will work as expected**.

First of all, take a look at **src/main/java/org/backgram/messenger/BuildVars.java** and fill it with correct values.
Import the root folder into your IDE (tested on Android Studio), then run project.

### Localization

We moved all translations to https://translations.backgram.org/en/android/. Please use it.
