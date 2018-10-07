# react-native-chartbeat-cs

# Work in progress. Not for production use

## Getting started

`$ npm install react-native-chartbeat-cs --save`

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
  - Add `import com.reactlibrary.RNChartbeatPackage;` to the imports at the top of the file
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
import RNChartbeat from 'react-native-chartbeat-cs';

// TODO: What to do with the module?
RNChartbeat;
```
  
