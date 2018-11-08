# react-native-chartbeat-cs

# Work in progress. Not for production use

## Getting started

`$ npm install react-native-chartbeat-cs --save`
or
`$ yarn add react-native-chartbeat-cs`

### Important

After running `npm install` and linking the library. You need to link the native "Chartbeat.framework" to your iOS project

### Mostly automatic installation

`$ react-native link react-native-chartbeat-cs`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-chartbeat-cs` and add `RNChartbeat.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNChartbeat.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.shukerullah.chartbeat.RNChartbeatPackage;` to the imports at the top of the file
- Add `new RNChartbeatPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:
   ```
   include ':react-native-chartbeat-cs'
   project(':react-native-chartbeat-cs').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-chartbeat-cs/android')
   ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
   ```
     compile project(':react-native-chartbeat-cs')
   ```

## Usage

```javascript
import { Platform } from "react-native";
import Chartbeat from "react-native-chartbeat-cs";

function setupTracker(accountId: number, domain: string) {
  if (Platform.OS === "ios") {
    Chartbeat.setupTrackerWithAccountId(accountId, domain);
  } else {
    Chartbeat.setupTracker(accountId.toString(), domain);
  }
}

function trackView(viewId: string, viewTitle: string) {
  if (Platform.OS === "ios") {
    Chartbeat.trackViewWithId(viewId, viewTitle);
  } else {
    Chartbeat.trackView(viewId, viewTitle);
  }
}

function setSections(sections: Array<string>) {
  if (Platform.OS === "ios") {
    Chartbeat.setSections(sections);
  } else {
    Chartbeat.setSections(sections.join());
  }
}

function setAuthors(authors: Array<string>) {
  if (Platform.OS === "ios") {
    Chartbeat.setAuthors(authors);
  } else {
    Chartbeat.setAuthors(authors.join());
  }
}

function stopTracker() {
  Chartbeat.stopTracker();
}
```
