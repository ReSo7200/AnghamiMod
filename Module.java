package com.reso.anghamimod;

import android.app.AndroidAppHelper;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class Module implements IXposedHookLoadPackage {
    String AG_PACKAGE_NAME = "com.anghami";



    @Override
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam) {
        if (lpparam.packageName.equals(AG_PACKAGE_NAME)) {


            // Account related - ghost.local.Account
            // Set to Plus values
            XposedHelpers.findAndHookMethod("com.anghami.ghost.local.Account", lpparam.classLoader, "isPlusUser", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.ghost.local.Account", lpparam.classLoader, "isPlus", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return true
                    return true;
                }
            });


            // for GOLD
            XposedHelpers.findAndHookMethod("com.anghami.ghost.local.Account", lpparam.classLoader, "isGoldUser", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.local.Account", lpparam.classLoader, "isShowKaraoke", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });

            // for GOLD
            XposedHelpers.findAndHookMethod("com.anghami.ghost.local.Account", lpparam.classLoader, "isCanUseKaraoke", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            Class<?> accountClass = XposedHelpers.findClass("com.anghami.ghost.local.Account", lpparam.classLoader);


            XposedHelpers.findAndHookMethod("com.anghami.ghost.downloads.DownloadManager", lpparam.classLoader, "isOnLimitedPlan", accountClass, new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return false; // Set the new value here.


                }
            });


            // ProtoAccount Related
            // Set to Plus values

            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getMaxOfflineSongs", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return 100000;
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getMaxOfflineTime", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return 864000;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getMinSkipTime", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return 0;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getSkipsLimit", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return -1;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getRadioSkipsLimit", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return -1;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getSkipsAllowQueueChange", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return false;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getDisableCode", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getHasphone", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getLyricsfreeenabled", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return false
                    return false;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getUpsellOnPlayerRestrictions", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return false;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getIsViewingQueueEnabled", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account$Builder", lpparam.classLoader, "getCanGoLive", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getCanGoLiveFromStories", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getCanGoLiveFromContextSheet", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getCanGoLiveFromPlayer", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getCanGoLiveFromQueue", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });

            // Gold
            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getCanUseKaraoke", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.model.proto.ProtoAccount$Account", lpparam.classLoader, "getShowKaraokeUpsellButton", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });

            // TEST AND EXTRA

            XposedHelpers.findAndHookMethod("com.anghami.model.pojo.settings.UserInfo", lpparam.classLoader, "component5", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.model.pojo.settings.UserInfo", lpparam.classLoader, "isPlus", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return true;
                }
            });

            // Pass max claps value - useless server checks for the amount of claps

            XposedHelpers.findAndHookMethod("com.anghami.app.stories.live_radio.LiveRadioState", lpparam.classLoader, "getMaxClaps", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return Integer.MAX_VALUE;
                }
            });

            // One Clap = 10 Claps - useless or not IDC

            XposedHelpers.findAndHookMethod("com.anghami.app.stories.live_radio.fragment.LiveRadioViewHolder", lpparam.classLoader, "sendClaps", int.class, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    param.args[0] = 10;
                }
            });

            // Disable choose plans and stuff
            // Plus

            XposedHelpers.findAndHookMethod("com.anghami.app.subscribe.main.SubscribeViewModel", lpparam.classLoader, "getSubscribe", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    showToast("Exploited by Abdalhaleem Altamimi - Bug hunter");
                    return null;
                }

            });


            XposedHelpers.findAndHookMethod("com.anghami.app.subscribe.main.SubscribeViewModel", lpparam.classLoader, "onSKUsFetched", new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return null;
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.app.subscribe.main.f", lpparam.classLoader, "i", boolean.class, new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    return null;
                }
            });

            // Gold
            // First 3 has nothing to do

            XposedHelpers.findAndHookMethod("com.anghami.app.gold.GoldSubscriptionViewModel", lpparam.classLoader, "getSubSource", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Gold!");
                    XposedBridge.log("Here 0");
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.app.gold.GoldSubscriptionViewModel", lpparam.classLoader, "setSubSource", java.lang.String.class, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Gold! 1");
                    XposedBridge.log("Here 1");
                }
            });

            // Events
            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$GoldRewards$RewardsSettingsSelected$UserType", lpparam.classLoader, "toString", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Gold! 2");
                    XposedBridge.log("Here 2");
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$GoldSubscriptionSheet$GoldOpenIntroSheet$Builder", lpparam.classLoader, "build", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Gold! 3");
                    XposedBridge.log("Here 3");
                }
            });

            // compare subscriptions
            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$GoldSubscriptionSheet$GoldOpenCompareSheet$Builder", lpparam.classLoader, "build", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Gold! 4");
                    XposedBridge.log("Here 4");
                }
            });

            // Discover all gold plans
            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$GoldSubscriptionSheet$GoldOpenPlansSheet$Builder", lpparam.classLoader, "build", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Gold! 5");
                    XposedBridge.log("Here 5");
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$GoldSubscriptionSheet$GoldSubscribeClicked$Builder", lpparam.classLoader, "build", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Gold! 6");
                }
            });

            // Subscribe to Gold
            XposedHelpers.findAndHookMethod("com.anghami.app.gold.d", lpparam.classLoader, "onViewCreated", android.view.View.class, android.os.Bundle.class, new XC_MethodReplacement() {
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    // Always return the modified value
                    showToast("Can be enabled I guess");
                    return null;
                }
            });


            // Live Radio

            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$LiveRadio$StartBroadcasting$Builder", lpparam.classLoader, "build", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 1");
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$LiveRadio$StartBroadcastingFail$Builder", lpparam.classLoader, "build", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 2");
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.app.base.list_fragment.f", lpparam.classLoader, "onGoLiveClick", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 3");
                }
            });

            XposedHelpers.findAndHookMethod("com.anghami.app.base.list_fragment.f", lpparam.classLoader, "onLiveStoryClick", java.lang.String.class, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 4");
                }
            });

            Class<?> requestLiveStory = XposedHelpers.findClass("com.anghami.ghost.pojo.livestories.LiveStory", lpparam.classLoader);
            Class<?> classLiveStoryAnalatic = XposedHelpers.findClass("com.anghami.app.stories.live_radio.LiveStoriesAnalyticsSource", lpparam.classLoader);

            XposedHelpers.findAndHookMethod("com.anghami.app.base.list_fragment.f", lpparam.classLoader, "onLiveStoryClicked", requestLiveStory, classLiveStoryAnalatic, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 5");
                }
            });


            XposedHelpers.findAndHookMethod("a7.b", lpparam.classLoader, "goLive", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 6");
                }
            });


            XposedHelpers.findAndHookMethod("com.anghami.app.main.MainActivity", lpparam.classLoader, "goLive", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 7");
                }
            });

            Class<?> n4Class = XposedHelpers.findClass("eb.g$a", lpparam.classLoader);
            XposedHelpers.findAndHookMethod("com.anghami.app.main.MainActivity", lpparam.classLoader, "N4", n4Class, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Live! 8");
                }
            });

            // Profile
            Class<?> classtoFind = XposedHelpers.findClass("com.anghami.ghost.analytics.Events$Navigation$GoToProfile$Subscription", lpparam.classLoader);
            XposedHelpers.findAndHookMethod("com.anghami.ghost.analytics.Events$Navigation$GoToProfile$Builder", lpparam.classLoader, "subscription", classtoFind, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    showToast("Here is Profile! 1");
                    XposedBridge.log("Here 1");
                }
            });

            // Lyrics
            // Disable Upgrade button

            XposedHelpers.findAndHookMethod("com.anghami.app.lyrics.LyricsEpoxyController", lpparam.classLoader, "buildModels", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    XposedHelpers.setObjectField(param.thisObject, "lyricsUnlockButton", null);
                }
            });

            // Enable Lyrics

            // The lyrics are retrieved from an API, the API checks the SID of the user
            // Returns the full lyrics if the SID was for a plus user
            // So I intercepted the GET request and modified the SID param to a real plus user's one

            Class<?> requestClass = XposedHelpers.findClass("okhttp3.Request", lpparam.classLoader);

            XposedHelpers.findAndHookMethod(requestClass, "newBuilder", new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    // Load the okhttp3.Request and okhttp3.HttpUrl classes from the target app
                    ClassLoader targetClassLoader = lpparam.classLoader;
                    Class<?> requestClass = Class.forName("okhttp3.Request", false, targetClassLoader);
                    Class<?> httpUrlClass = Class.forName("okhttp3.HttpUrl", false, targetClassLoader);

                    // Check if the classes were successfully loaded
                    if (requestClass != null && httpUrlClass != null) {
                        // Extract the original Request.Builder object
                        Object requestBuilder = param.getResult();

                        // Check if it's a Request.Builder
                        if (requestBuilder != null && requestBuilder.getClass().getName().equals("okhttp3.Request$Builder")) {

                            // Cast to Request.Builder
                            Object builder = requestBuilder;

                            // Get the build method from the Request.Builder class
                            Method buildMethod = builder.getClass().getMethod("build");

                            // Invoke the build method to get the original Request
                            Object originalRequest = buildMethod.invoke(builder);

                            // Modify the Request's URL
                            Method urlMethod = originalRequest.getClass().getMethod("url");
                            Object originalUrl = urlMethod.invoke(originalRequest);

                            if (shouldModifyUrl(originalRequest)){

                                // Cast the originalUrl to okhttp3.HttpUrl
                                Object httpUrl = httpUrlClass.cast(originalUrl);

                                // Modify the 'sid' parameter in the HttpUrl
                                Object modifiedHttpUrl = modifySidParameter(httpUrl);

                                // Create a new Request with the updated HttpUrl
                                Method newBuilderMethod = requestClass.getMethod("newBuilder");
                                Object newRequestBuilder = newBuilderMethod.invoke(originalRequest); // Use originalRequest, not null
                                newRequestBuilder.getClass().getMethod("url", httpUrlClass).invoke(newRequestBuilder, modifiedHttpUrl);
                                Object newRequest = buildMethod.invoke(newRequestBuilder);

                                // Log the updated Request
                                //XposedBridge.log("Updated Request: " + newRequest.toString());

                                // Set the updated Request.Builder in the result to replace the original builder
                                param.setResult(newRequestBuilder);
                            }
                        }
                    }
                }
            });



        }
    }

    // Check if the request is an Lyrics one!
    private boolean shouldModifyUrl(Object originalRequest) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        // Get the URL from the original Request
        Method urlMethod = originalRequest.getClass().getMethod("url");
        Object originalUrl = urlMethod.invoke(originalRequest);

        // Check if originalUrl is not null
        if (originalUrl != null) {
            // Convert the originalUrl to a string

            String originalUrlString = originalUrl.toString();

            // Check if the URL contains the specified substring
            return originalUrlString.contains("/rest/v1/GETlyrics.view?output=jsonhp&songid=");
        }

        return false; // Return false if originalUrl is null
    }

    // Modify lyrics URL to have valid PLUS user SID
    private Object modifySidParameter(Object httpUrl) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (httpUrl != null) {
            // Get the query parameter names
            Method queryParameterNamesMethod = httpUrl.getClass().getMethod("queryParameterNames");
            Set<String> queryParameterNames = (Set<String>) queryParameterNamesMethod.invoke(httpUrl);

            // Create a new HttpUrl.Builder
            Object httpUrlBuilder = httpUrl.getClass().getMethod("newBuilder").invoke(httpUrl);

            // Modify the 'sid' parameter
            if (queryParameterNames.contains("sid")) {
                httpUrlBuilder.getClass().getMethod("setQueryParameter", String.class, String.class).invoke(httpUrlBuilder, "sid", "i7:dcljdkcec:2ps242qp91qq602n:ecefcledcicedf:WB:eig:ra:n7.0.21:36::n7.0.21:0:na:41sorr1s85");
            }

            // Build the modified HttpUrl
            return httpUrlBuilder.getClass().getMethod("build").invoke(httpUrlBuilder);
        }

        return httpUrl;
    }

    private void showToast(final String text) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(AndroidAppHelper.currentApplication().getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
