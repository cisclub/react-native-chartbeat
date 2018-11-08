
package com.shukerullah.chartbeat;

import android.content.Context;

import com.chartbeat.androidsdk.Tracker;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class RNChartbeatModule extends ReactContextBaseJavaModule {

  public final String REACT_CLASS = "RNChartbeat";

  private final Context context;

  public RNChartbeatModule(ReactApplicationContext reactContext) {
    super(reactContext);
    context = reactContext.getApplicationContext();
  }

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  /**
   * initializes the tracker. If the tracker has already been initialized,
   * this call will be ignored.
   *
   * @param accountId
   *            your account id on the Chartbeat system. e.g. "12345"
   * @param domain
   *            the chartbeat dashboard domain name you want to report analytics data to, e.g.
   *            "mynewspaper.com"
   */
  @ReactMethod
  public void setupTracker(String accountId, String domain) {
    Tracker.setupTracker(accountId, domain, context);
  }

  @ReactMethod
  public void restartPingService() {
    Tracker.restartPingService(context);
  }

  /**
   * Call this to set the app referrer. This is a referrer that is external to
   * the app, such as another app or website. This should be called
   * immediately before calling trackView. If the tracker has not been
   * initialized, this call will be ignored.
   *
   * @param appReferrer
   *            the string representing the appReferrer.
   */
  @ReactMethod
  public void setAppReferrer(String appReferrer) {
    Tracker.setAppReferrer(appReferrer);
  }

  /**
   * Call this to set the app's push referrer. This is the id of the push alert referrer
   * This should be called
   * immediately before calling trackView. If the tracker has not been
   * initialized, this call will be ignored.
   *
   * @param pushReferrer
   *            the string representing the pushReferrer.
   */
  @ReactMethod
  public void setPushReferrer(String pushReferrer) {
    Tracker.setPushReferrer(pushReferrer);
  }

  /**
   * Stops the tracker if one has been previously started. Most apps will not
   * need to call this function.
   */
  @ReactMethod
  public void stopTracker() {
    Tracker.stopTracker();
  }

  /**
   * Pauses the tracker for idle applications
   */
  @ReactMethod
  public void pauseTracker() {
    Tracker.pauseTracker();
  }

  /**
   * Call this whenever you display a new view. Use this in views where you are not tracking position.
   *  If the tracker has not been initialized, this call will be ignored.
   *
   * @param viewId
   *            the id of the view being displayed. Must not be null.
   * @param viewTitle
   *            the title of the view. may be null.
   */
  @ReactMethod
  public void trackView(String viewId, String viewTitle) {
    Tracker.trackView(context, viewId, viewTitle);
  }

  /**
   * Call this whenever the user leaves an activity. This will be used as a
   * hint that the user might have left the app. If the tracker has not been
   * initialized, this call will be ignored.
   */
  @ReactMethod
  public void userLeftView(String viewId) {
    Tracker.userLeftView(viewId);
  }

  /**
   * Call this whenever the user interacts with your app. If the tracker has
   * not been initialized, this call will be ignored. You will likely want to
   * put this in your onUserInteraction() function of your activity.
   */
  @ReactMethod
  public static void userInteracted() {
    Tracker.userInteracted();
  }

  @ReactMethod
  public void userTyped() {
    Tracker.userTyped();
  }

  @ReactMethod
  public void setDomain(String domain) {
    Tracker.setDomain(domain);
  }

  @ReactMethod
  public void setSubdomain(String subdomain) {
    Tracker.setSubdomain(subdomain);
  }

  @ReactMethod
  public void setZones(String zones) {
    Tracker.setZones(zones);
  }

  @ReactMethod
  public void setAuthors(String authors) {
    Tracker.setAuthors(authors);
  }

  @ReactMethod
  public void setSections(String sections) {
    Tracker.setSections(sections);
  }

  @ReactMethod
  public void setViewLoadTime(float pageLoadTime) {
    Tracker.setViewLoadTime(pageLoadTime);
  }

  @ReactMethod
  public void setPosition(int scrollPositionTop, int scrollWindowHeight, int totalContentHeight, int fullyRenderedDocWidth) {
    Tracker.setPosition(scrollPositionTop, scrollWindowHeight, totalContentHeight, fullyRenderedDocWidth);
  }
}