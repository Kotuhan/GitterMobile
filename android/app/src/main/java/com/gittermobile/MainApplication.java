package com.gittermobile;

import android.app.Application;
import android.util.Log;
import android.app.Activity;

import com.facebook.react.ReactApplication;
import cl.json.RNSharePackage;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

import com.oblador.vectoricons.VectorIconsPackage;
import com.terrysahaidak.faye.FayeGitterPackage;
import com.aakashns.reactnativedialogs.ReactNativeDialogsPackage;
import com.terrysahaidak.bottomsheet.AndroidBottomSheetPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    protected boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        new MainReactPackage(),
            new RNSharePackage(),
        new VectorIconsPackage(),
        new ReactNativeDialogsPackage(),
        new FayeGitterPackage(),
        new RNDeviceInfo(),
        new AndroidBottomSheetPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
      return mReactNativeHost;
  }
}
