package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.umeng.analytics.pro.d;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import org.conscrypt.EvpMdRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u008f\u0001\u0090\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020>H\u0007J\b\u0010G\u001a\u00020EH\u0007J\b\u0010H\u001a\u00020EH\u0007J\b\u0010I\u001a\u00020)H\u0007J\b\u0010J\u001a\u00020%H\u0007J\b\u0010K\u001a\u00020\u0004H\u0007J\n\u0010L\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010N\u001a\u0004\u0018\u00010%H\u0007J\b\u0010O\u001a\u00020)H\u0007J\b\u0010P\u001a\u00020)H\u0007J\n\u0010Q\u001a\u0004\u0018\u00010,H\u0007J\b\u0010R\u001a\u00020\u0016H\u0007J\b\u0010S\u001a\u00020\u0004H\u0007J\b\u0010T\u001a\u00020)H\u0007J\b\u0010U\u001a\u00020)H\u0007J\b\u0010V\u001a\u000201H\u0007J\b\u0010W\u001a\u00020\u0004H\u0007J\b\u0010X\u001a\u00020\u0004H\u0007J\b\u0010Y\u001a\u00020\u0004H\u0007J\b\u0010Z\u001a\u00020\u0004H\u0007J\u0010\u0010[\u001a\u00020)2\u0006\u0010N\u001a\u00020%H\u0007J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020>0]H\u0007J\b\u0010^\u001a\u00020)H\u0007J\b\u0010_\u001a\u00020`H\u0007J\b\u0010a\u001a\u00020\u0004H\u0007J\b\u0010b\u001a\u00020)H\u0007J\u0010\u0010c\u001a\u00020)2\u0006\u0010d\u001a\u00020\u0016H\u0007J\b\u0010:\u001a\u00020)H\u0007J\b\u0010e\u001a\u00020)H\u0007J\b\u0010;\u001a\u00020)H\u0007J\u0010\u0010f\u001a\u00020)2\u0006\u0010F\u001a\u00020>H\u0007J\u0017\u0010g\u001a\u00020E2\b\u0010N\u001a\u0004\u0018\u00010%H\u0001¢\u0006\u0002\bhJ\u0018\u0010i\u001a\u00020E2\u0006\u0010N\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004H\u0003J\u0018\u0010j\u001a\u00020E2\u0006\u0010N\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004H\u0007J\u0010\u0010k\u001a\u00020E2\u0006\u0010F\u001a\u00020>H\u0007J\u0010\u0010l\u001a\u00020E2\u0006\u0010$\u001a\u00020%H\u0007J\u001a\u0010l\u001a\u00020E2\u0006\u0010$\u001a\u00020%2\b\u0010m\u001a\u0004\u0018\u00010nH\u0007J\u0018\u0010l\u001a\u00020E2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0016H\u0007J\"\u0010l\u001a\u00020E2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u00162\b\u0010m\u001a\u0004\u0018\u00010nH\u0007J\u0010\u0010o\u001a\u00020E2\u0006\u0010p\u001a\u00020)H\u0007J\u0010\u0010q\u001a\u00020E2\u0006\u0010&\u001a\u00020\u0004H\u0007J\u0012\u0010r\u001a\u00020E2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010s\u001a\u00020E2\u0006\u0010p\u001a\u00020)H\u0007J\u0010\u0010t\u001a\u00020E2\u0006\u0010p\u001a\u00020)H\u0007J\u0010\u0010u\u001a\u00020E2\u0006\u0010*\u001a\u00020,H\u0007J\u0012\u0010v\u001a\u00020E2\b\u0010w\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010x\u001a\u00020E2\u0006\u0010p\u001a\u00020)H\u0007J\u001d\u0010y\u001a\u00020E2\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010{H\u0007¢\u0006\u0002\u0010|J-\u0010y\u001a\u00020E2\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010{2\u0006\u0010}\u001a\u00020\u00162\u0006\u0010~\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020E2\u0006\u00100\u001a\u000201H\u0007J\u0011\u0010\u0081\u0001\u001a\u00020E2\u0006\u00102\u001a\u00020\u0004H\u0007J\u0011\u0010\u0082\u0001\u001a\u00020E2\u0006\u00103\u001a\u00020\u0004H\u0007J\u0017\u0010\u0083\u0001\u001a\u00020E2\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0003\b\u0084\u0001J\u0012\u0010\u0085\u0001\u001a\u00020E2\u0007\u0010\u0086\u0001\u001a\u00020)H\u0007J\u0012\u0010\u0087\u0001\u001a\u00020E2\u0007\u0010\u0088\u0001\u001a\u00020)H\u0007J\u001a\u0010\u0089\u0001\u001a\u00020E2\u0006\u0010N\u001a\u00020%2\u0007\u0010\u008a\u0001\u001a\u00020)H\u0007J\u0011\u0010\u008b\u0001\u001a\u00020E2\u0006\u0010p\u001a\u00020)H\u0007J\u0012\u0010\u008c\u0001\u001a\u00020E2\u0007\u0010\u008d\u0001\u001a\u00020`H\u0007J\t\u0010\u008e\u0001\u001a\u00020EH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0091\u0001"}, d2 = {"Lcom/facebook/FacebookSdk;", "", "()V", "ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY", "", "APPLICATION_ID_PROPERTY", "APPLICATION_NAME_PROPERTY", "APP_EVENT_PREFERENCES", "ATTRIBUTION_PREFERENCES", "AUTO_INIT_ENABLED_PROPERTY", "AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY", "CALLBACK_OFFSET_CHANGED_AFTER_INIT", "CALLBACK_OFFSET_NEGATIVE", "CALLBACK_OFFSET_PROPERTY", "CLIENT_TOKEN_PROPERTY", "CLOUDBRIDGE_SAVED_CREDENTIALS", "CODELESS_DEBUG_LOG_ENABLED_PROPERTY", "DATA_PROCESSING_OPTIONS_PREFERENCES", "DATA_PROCESSION_OPTIONS", "DATA_PROCESSION_OPTIONS_COUNTRY", "DATA_PROCESSION_OPTIONS_STATE", "DEFAULT_CALLBACK_REQUEST_CODE_OFFSET", "", "FACEBOOK_COM", "FB_GG", "GAMING", "INSTAGRAM", "INSTAGRAM_COM", "LOCK", "Ljava/util/concurrent/locks/ReentrantLock;", "MAX_REQUEST_CODE_RANGE", "MONITOR_ENABLED_PROPERTY", "PUBLISH_ACTIVITY_PATH", "TAG", "WEB_DIALOG_THEME", "appClientToken", "applicationContext", "Landroid/content/Context;", "applicationId", "applicationName", "bypassAppSwitch", "", "cacheDir", "Lcom/facebook/internal/LockOnGetVariable;", "Ljava/io/File;", "callbackRequestCodeOffset", "codelessDebugLogEnabled", "Ljava/lang/Boolean;", "executor", "Ljava/util/concurrent/Executor;", "facebookDomain", "graphApiVersion", "graphRequestCreator", "Lcom/facebook/FacebookSdk$GraphRequestCreator;", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "instagramDomain", "isDebugEnabledField", "isFullyInitialized", "isLegacyTokenUpgradeSupported", "loggingBehaviors", "Ljava/util/HashSet;", "Lcom/facebook/LoggingBehavior;", "Lkotlin/collections/HashSet;", "onProgressThreshold", "Ljava/util/concurrent/atomic/AtomicLong;", "sdkInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "addLoggingBehavior", "", "behavior", "clearLoggingBehaviors", "fullyInitialize", "getAdvertiserIDCollectionEnabled", "getApplicationContext", "getApplicationId", "getApplicationName", "getApplicationSignature", d.R, "getAutoInitEnabled", "getAutoLogAppEventsEnabled", "getCacheDir", "getCallbackRequestCodeOffset", "getClientToken", "getCodelessDebugLogEnabled", "getCodelessSetupEnabled", "getExecutor", "getFacebookDomain", "getGraphApiVersion", "getGraphDomain", "getInstagramDomain", "getLimitEventAndDataUsage", "getLoggingBehaviors", "", "getMonitorEnabled", "getOnProgressThreshold", "", "getSdkVersion", "isDebugEnabled", "isFacebookRequestCode", "requestCode", "isInitialized", "isLoggingBehaviorEnabled", "loadDefaultsFromMetadata", "loadDefaultsFromMetadata$facebook_core_release", "publishInstallAndWaitForResponse", "publishInstallAsync", "removeLoggingBehavior", "sdkInitialize", "callback", "Lcom/facebook/FacebookSdk$InitializeCallback;", "setAdvertiserIDCollectionEnabled", "flag", "setApplicationId", "setApplicationName", "setAutoInitEnabled", "setAutoLogAppEventsEnabled", "setCacheDir", "setClientToken", "clientToken", "setCodelessDebugLogEnabled", "setDataProcessingOptions", "options", "", "([Ljava/lang/String;)V", "country", ServerProtocol.DIALOG_PARAM_STATE, "([Ljava/lang/String;II)V", "setExecutor", "setFacebookDomain", "setGraphApiVersion", "setGraphRequestCreator", "setGraphRequestCreator$facebook_core_release", "setIsDebugEnabled", "enabled", "setLegacyTokenUpgradeSupported", "supported", "setLimitEventAndDataUsage", "limitEventUsage", "setMonitorEnabled", "setOnProgressThreshold", "threshold", "updateGraphDebugBehavior", "GraphRequestCreator", "InitializeCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FacebookSdk {

    @NotNull
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";

    @NotNull
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";

    @NotNull
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";

    @NotNull
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";

    @NotNull
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";

    @NotNull
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";

    @NotNull
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";

    @NotNull
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";

    @NotNull
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";

    @NotNull
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";

    @NotNull
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";

    @NotNull
    public static final String CLOUDBRIDGE_SAVED_CREDENTIALS = "com.facebook.sdk.CloudBridgeSavedCredentials";

    @NotNull
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";

    @NotNull
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS = "data_processing_options";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";

    @NotNull
    public static final String FACEBOOK_COM = "facebook.com";

    @NotNull
    public static final String FB_GG = "fb.gg";

    @NotNull
    public static final String GAMING = "gaming";

    @NotNull
    public static final String INSTAGRAM = "instagram";

    @NotNull
    public static final String INSTAGRAM_COM = "instagram.com";
    private static final int MAX_REQUEST_CODE_RANGE = 100;

    @NotNull
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";

    @NotNull
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";

    @NotNull
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";

    @Nullable
    private static volatile String appClientToken;
    private static Context applicationContext;

    @Nullable
    private static volatile String applicationId;

    @Nullable
    private static volatile String applicationName;

    @JvmField
    public static boolean bypassAppSwitch;
    private static LockOnGetVariable<File> cacheDir;

    @Nullable
    private static volatile Boolean codelessDebugLogEnabled;

    @Nullable
    private static Executor executor;

    @NotNull
    private static volatile String facebookDomain;

    @NotNull
    private static String graphApiVersion;

    @NotNull
    private static GraphRequestCreator graphRequestCreator;

    @JvmField
    public static boolean hasCustomTabsPrefetching;

    @JvmField
    public static boolean ignoreAppSwitchToLoggedOut;

    @NotNull
    private static volatile String instagramDomain;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;

    @NotNull
    private static final AtomicBoolean sdkInitialized;

    @NotNull
    public static final FacebookSdk INSTANCE = new FacebookSdk();

    @Nullable
    private static final String TAG = FacebookSdk.class.getCanonicalName();

    @NotNull
    private static final HashSet<LoggingBehavior> loggingBehaviors = SetsKt.hashSetOf(LoggingBehavior.DEVELOPER_ERRORS);

    @NotNull
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;

    @NotNull
    private static final ReentrantLock LOCK = new ReentrantLock();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bá\u0080\u0001\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/facebook/FacebookSdk$GraphRequestCreator;", "", "createPostRequest", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "publishUrl", "", "publishParams", "Lorg/json/JSONObject;", "callback", "Lcom/facebook/GraphRequest$Callback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @VisibleForTesting
    public interface GraphRequestCreator {
        @NotNull
        GraphRequest createPostRequest(@Nullable AccessToken accessToken, @Nullable String publishUrl, @Nullable JSONObject publishParams, @Nullable GraphRequest.Callback callback);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookSdk$InitializeCallback;", "", "onInitialized", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface InitializeCallback {
        void onInitialized();
    }

    static {
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        graphApiVersion = ServerProtocol.getDefaultAPIVersion();
        sdkInitialized = new AtomicBoolean(false);
        instagramDomain = INSTAGRAM_COM;
        facebookDomain = FACEBOOK_COM;
        graphRequestCreator = OooOO0O.f12704Oooo;
    }

    private FacebookSdk() {
    }

    @JvmStatic
    public static final void addLoggingBehavior(@NotNull LoggingBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(behavior);
            INSTANCE.updateGraphDebugBehavior();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void clearLoggingBehaviors() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    @JvmStatic
    public static final boolean getAdvertiserIDCollectionEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getAdvertiserIDCollectionEnabled();
    }

    @JvmStatic
    @NotNull
    public static final Context getApplicationContext() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    @JvmStatic
    @NotNull
    public static final String getApplicationId() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @JvmStatic
    @Nullable
    public static final String getApplicationName() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return applicationName;
    }

    @JvmStatic
    @Nullable
    public static final String getApplicationSignature(@Nullable Context context) {
        PackageManager packageManager;
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return null;
        }
        try {
            Validate validate = Validate.INSTANCE;
            Validate.sdkInitialized();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null) {
                    if (!(signatureArr.length == 0)) {
                        MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.SHA1.JCA_NAME);
                        messageDigest.update(packageInfo.signatures[0].toByteArray());
                        return Base64.encodeToString(messageDigest.digest(), 9);
                    }
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean getAutoInitEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getAutoInitEnabled();
    }

    @JvmStatic
    public static final boolean getAutoLogAppEventsEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getAutoLogAppEventsEnabled();
    }

    @JvmStatic
    @Nullable
    public static final File getCacheDir() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        LockOnGetVariable<File> lockOnGetVariable = cacheDir;
        if (lockOnGetVariable != null) {
            return lockOnGetVariable.getValue();
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
        throw null;
    }

    @JvmStatic
    public static final int getCallbackRequestCodeOffset() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    @JvmStatic
    @NotNull
    public static final String getClientToken() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @JvmStatic
    public static final boolean getCodelessDebugLogEnabled() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        Boolean bool = codelessDebugLogEnabled;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @JvmStatic
    public static final boolean getCodelessSetupEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getCodelessSetupEnabled();
    }

    @JvmStatic
    @NotNull
    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    @JvmStatic
    @NotNull
    public static final String getGraphApiVersion() {
        Utility utility = Utility.INSTANCE;
        String str = TAG;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        Utility.logd(str, str2);
        return graphApiVersion;
    }

    @JvmStatic
    @NotNull
    public static final String getGraphDomain() {
        AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
        String graphDomain = currentAccessToken != null ? currentAccessToken.getGraphDomain() : null;
        Utility utility = Utility.INSTANCE;
        return Utility.getGraphDomainFromTokenDomain(graphDomain);
    }

    @JvmStatic
    @NotNull
    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    @JvmStatic
    public static final boolean getLimitEventAndDataUsage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    @JvmStatic
    @NotNull
    public static final Set<LoggingBehavior> getLoggingBehaviors() {
        Set<LoggingBehavior> setUnmodifiableSet;
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return setUnmodifiableSet;
    }

    @JvmStatic
    public static final boolean getMonitorEnabled() {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        return UserSettingsManager.getMonitorEnabled();
    }

    @JvmStatic
    public static final long getOnProgressThreshold() {
        Validate validate = Validate.INSTANCE;
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    @JvmStatic
    @NotNull
    public static final String getSdkVersion() {
        return FacebookSdkVersion.BUILD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: graphRequestCreator$lambda-0, reason: not valid java name */
    public static final GraphRequest m92graphRequestCreator$lambda0(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return GraphRequest.INSTANCE.newPostRequest(accessToken, str, jSONObject, callback);
    }

    @JvmStatic
    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    @JvmStatic
    public static final boolean isFacebookRequestCode(int requestCode) {
        int i = callbackRequestCodeOffset;
        return requestCode >= i && requestCode < i + 100;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final synchronized boolean isFullyInitialized() {
        return isFullyInitialized;
    }

    @JvmStatic
    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    @JvmStatic
    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    @JvmStatic
    public static final boolean isLoggingBehaviorEnabled(@NotNull LoggingBehavior behavior) {
        boolean z;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z = isDebugEnabled() && hashSet.contains(behavior);
        }
        return z;
    }

    @JvmStatic
    public static final void loadDefaultsFromMetadata$facebook_core_release(@Nullable Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, "fb", false, 2, null)) {
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        applicationId = strSubstring;
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
            }
            if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void publishInstallAndWaitForResponse(Context context, String applicationId2) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String strStringPlus = Intrinsics.stringPlus(applicationId2, "ping");
                long j = sharedPreferences.getLong(strStringPlus, 0L);
                try {
                    AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.INSTANCE;
                    JSONObject jSONObjectForGraphAPICall = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{applicationId2}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                    GraphRequest graphRequestCreatePostRequest = graphRequestCreator.createPostRequest(null, str, jSONObjectForGraphAPICall, null);
                    if (j == 0 && graphRequestCreatePostRequest.executeAndWait().getError() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(strStringPlus, System.currentTimeMillis());
                        editorEdit.apply();
                    }
                } catch (JSONException e) {
                    throw new FacebookException("An error occurred while publishing install.", e);
                }
            } catch (Exception e2) {
                Utility utility = Utility.INSTANCE;
                Utility.logd("Facebook-publish", e2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 3)
    public static final void publishInstallAsync(@NotNull Context context, @NotNull final String applicationId2) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
            final Context applicationContext2 = context.getApplicationContext();
            getExecutor().execute(new Runnable() { // from class: com.facebook.Oooo000
                @Override // java.lang.Runnable
                public final void run() {
                    FacebookSdk.m93publishInstallAsync$lambda15(applicationContext2, applicationId2);
                }
            });
            FeatureManager featureManager = FeatureManager.INSTANCE;
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDeviceEventProcessing)) {
                OnDeviceProcessingManager onDeviceProcessingManager = OnDeviceProcessingManager.INSTANCE;
                if (OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                    OnDeviceProcessingManager.sendInstallEventAsync(applicationId2, ATTRIBUTION_PREFERENCES);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: publishInstallAsync$lambda-15, reason: not valid java name */
    public static final void m93publishInstallAsync$lambda15(Context applicationContext2, String applicationId2) {
        Intrinsics.checkNotNullParameter(applicationId2, "$applicationId");
        FacebookSdk facebookSdk = INSTANCE;
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
        facebookSdk.publishInstallAndWaitForResponse(applicationContext2, applicationId2);
    }

    @JvmStatic
    public static final void removeLoggingBehavior(@NotNull LoggingBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(behavior);
        }
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2, int callbackRequestCodeOffset2) {
        Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
        sdkInitialize(applicationContext2, callbackRequestCodeOffset2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sdkInitialize$lambda-3, reason: not valid java name */
    public static final File m94sdkInitialize$lambda3() {
        Context context = applicationContext;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sdkInitialize$lambda-4, reason: not valid java name */
    public static final void m95sdkInitialize$lambda4(boolean z) {
        if (z) {
            InstrumentManager instrumentManager = InstrumentManager.INSTANCE;
            InstrumentManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sdkInitialize$lambda-5, reason: not valid java name */
    public static final void m96sdkInitialize$lambda5(boolean z) {
        if (z) {
            AppEventsManager appEventsManager = AppEventsManager.INSTANCE;
            AppEventsManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sdkInitialize$lambda-6, reason: not valid java name */
    public static final void m97sdkInitialize$lambda6(boolean z) {
        if (z) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sdkInitialize$lambda-7, reason: not valid java name */
    public static final void m98sdkInitialize$lambda7(boolean z) {
        if (z) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sdkInitialize$lambda-8, reason: not valid java name */
    public static final void m99sdkInitialize$lambda8(boolean z) {
        if (z) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sdkInitialize$lambda-9, reason: not valid java name */
    public static final Void m100sdkInitialize$lambda9(InitializeCallback initializeCallback) {
        AccessTokenManager.INSTANCE.getInstance().loadCurrentAccessToken();
        ProfileManager.INSTANCE.getInstance().loadCurrentProfile();
        if (AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
            Profile.Companion companion = Profile.INSTANCE;
            if (companion.getCurrentProfile() == null) {
                companion.fetchProfileForCurrentAccessToken();
            }
        }
        if (initializeCallback != null) {
            initializeCallback.onInitialized();
        }
        AppEventsLogger.Companion companion2 = AppEventsLogger.INSTANCE;
        companion2.initializeLib(getApplicationContext(), applicationId);
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.logIfAutoAppLinkEnabled();
        Context applicationContext2 = getApplicationContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext().applicationContext");
        companion2.newLogger(applicationContext2).flush();
        return null;
    }

    @JvmStatic
    public static final void setAdvertiserIDCollectionEnabled(boolean flag) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setAdvertiserIDCollectionEnabled(flag);
    }

    @JvmStatic
    public static final void setApplicationId(@NotNull String applicationId2) {
        Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
        Validate validate = Validate.INSTANCE;
        Validate.notEmpty(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    @JvmStatic
    public static final void setApplicationName(@Nullable String applicationName2) {
        applicationName = applicationName2;
    }

    @JvmStatic
    public static final void setAutoInitEnabled(boolean flag) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setAutoInitEnabled(flag);
        if (flag) {
            fullyInitialize();
        }
    }

    @JvmStatic
    public static final void setAutoLogAppEventsEnabled(boolean flag) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setAutoLogAppEventsEnabled(flag);
        if (flag) {
            Application application = (Application) getApplicationContext();
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
            ActivityLifecycleTracker.startTracking(application, getApplicationId());
        }
    }

    @JvmStatic
    public static final void setCacheDir(@NotNull File cacheDir2) {
        Intrinsics.checkNotNullParameter(cacheDir2, "cacheDir");
        cacheDir = new LockOnGetVariable<>(cacheDir2);
    }

    @JvmStatic
    public static final void setClientToken(@Nullable String clientToken) {
        appClientToken = clientToken;
    }

    @JvmStatic
    public static final void setCodelessDebugLogEnabled(boolean flag) {
        codelessDebugLogEnabled = Boolean.valueOf(flag);
    }

    @JvmStatic
    public static final void setDataProcessingOptions(@Nullable String[] options) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            setDataProcessingOptions(options, 0, 0);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    @JvmStatic
    public static final void setExecutor(@NotNull Executor executor2) {
        Intrinsics.checkNotNullParameter(executor2, "executor");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @JvmStatic
    public static final void setFacebookDomain(@NotNull String facebookDomain2) {
        Intrinsics.checkNotNullParameter(facebookDomain2, "facebookDomain");
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = facebookDomain2;
    }

    @JvmStatic
    public static final void setGraphApiVersion(@NotNull String graphApiVersion2) {
        Intrinsics.checkNotNullParameter(graphApiVersion2, "graphApiVersion");
        Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        Utility utility = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(graphApiVersion2) || Intrinsics.areEqual(graphApiVersion, graphApiVersion2)) {
            return;
        }
        graphApiVersion = graphApiVersion2;
    }

    @JvmStatic
    @VisibleForTesting
    public static final void setGraphRequestCreator$facebook_core_release(@NotNull GraphRequestCreator graphRequestCreator2) {
        Intrinsics.checkNotNullParameter(graphRequestCreator2, "graphRequestCreator");
        graphRequestCreator = graphRequestCreator2;
    }

    @JvmStatic
    public static final void setIsDebugEnabled(boolean enabled) {
        isDebugEnabledField = enabled;
    }

    @JvmStatic
    public static final void setLegacyTokenUpgradeSupported(boolean supported) {
        isLegacyTokenUpgradeSupported = supported;
    }

    @JvmStatic
    public static final void setLimitEventAndDataUsage(@NotNull Context context, boolean limitEventUsage) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", limitEventUsage).apply();
    }

    @JvmStatic
    public static final void setMonitorEnabled(boolean flag) {
        UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
        UserSettingsManager.setMonitorEnabled(flag);
    }

    @JvmStatic
    public static final void setOnProgressThreshold(long threshold) {
        onProgressThreshold.set(threshold);
    }

    private final void updateGraphDebugBehavior() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        if (hashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(loggingBehavior)) {
                return;
            }
            hashSet.add(loggingBehavior);
        }
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2, int callbackRequestCodeOffset2, @Nullable InitializeCallback callback) {
        Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
        if (sdkInitialized.get() && callbackRequestCodeOffset2 != callbackRequestCodeOffset) {
            throw new FacebookException(CALLBACK_OFFSET_CHANGED_AFTER_INIT);
        }
        if (callbackRequestCodeOffset2 >= 0) {
            callbackRequestCodeOffset = callbackRequestCodeOffset2;
            sdkInitialize(applicationContext2, callback);
        } else {
            throw new FacebookException(CALLBACK_OFFSET_NEGATIVE);
        }
    }

    @JvmStatic
    public static final void setDataProcessingOptions(@Nullable String[] options, int country, int state) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        if (options == null) {
            try {
                options = new String[0];
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DATA_PROCESSION_OPTIONS, new JSONArray((Collection) ArraysKt.toList(options)));
            jSONObject.put(DATA_PROCESSION_OPTIONS_COUNTRY, country);
            jSONObject.put(DATA_PROCESSION_OPTIONS_STATE, state);
            Context context = applicationContext;
            if (context != null) {
                context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSION_OPTIONS, jSONObject.toString()).apply();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2) {
        Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
        sdkInitialize(applicationContext2, (InitializeCallback) null);
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2, @Nullable final InitializeCallback callback) {
        Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
        AtomicBoolean atomicBoolean = sdkInitialized;
        if (atomicBoolean.get()) {
            if (callback != null) {
                callback.onInitialized();
            }
            return;
        }
        Validate validate = Validate.INSTANCE;
        Validate.hasFacebookActivity(applicationContext2, false);
        Validate.hasInternetPermissions(applicationContext2, false);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "applicationContext.applicationContext");
        applicationContext = applicationContext3;
        AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(applicationContext2);
        Context context = applicationContext;
        if (context != null) {
            loadDefaultsFromMetadata$facebook_core_release(context);
            String str = applicationId;
            if (!(str == null || str.length() == 0)) {
                String str2 = appClientToken;
                if (!(str2 == null || str2.length() == 0)) {
                    atomicBoolean.set(true);
                    if (getAutoInitEnabled()) {
                        fullyInitialize();
                    }
                    Context context2 = applicationContext;
                    if (context2 != null) {
                        if (context2 instanceof Application) {
                            UserSettingsManager userSettingsManager = UserSettingsManager.INSTANCE;
                            if (UserSettingsManager.getAutoLogAppEventsEnabled()) {
                                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                                Context context3 = applicationContext;
                                if (context3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                    throw null;
                                }
                                ActivityLifecycleTracker.startTracking((Application) context3, applicationId);
                            }
                        }
                        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                        FetchedAppSettingsManager.loadAppSettingsAsync();
                        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
                        NativeProtocol.updateAllAvailableProtocolVersionsAsync();
                        BoltsMeasurementEventListener.Companion companion = BoltsMeasurementEventListener.INSTANCE;
                        Context context4 = applicationContext;
                        if (context4 != null) {
                            companion.getInstance(context4);
                            cacheDir = new LockOnGetVariable<>((Callable) new Callable() { // from class: com.facebook.o000oOoO
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return FacebookSdk.m94sdkInitialize$lambda3();
                                }
                            });
                            FeatureManager featureManager = FeatureManager.INSTANCE;
                            FeatureManager.checkFeature(FeatureManager.Feature.Instrument, OooOo.f12713Oooo);
                            FeatureManager.checkFeature(FeatureManager.Feature.AppEvents, new FeatureManager.Callback() { // from class: com.facebook.OooOOO
                                @Override // com.facebook.internal.FeatureManager.Callback
                                public final void onCompleted(boolean z) {
                                    FacebookSdk.m96sdkInitialize$lambda5(z);
                                }
                            });
                            FeatureManager.checkFeature(FeatureManager.Feature.ChromeCustomTabsPrefetching, OooOo00.f12715Oooo);
                            FeatureManager.checkFeature(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, OooOOOO.f12710Oooo);
                            FeatureManager.checkFeature(FeatureManager.Feature.BypassAppSwitch, OooOOO0.f12708Oooo);
                            getExecutor().execute(new FutureTask(new Callable() { // from class: com.facebook.Oooo0
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return FacebookSdk.m100sdkInitialize$lambda9(callback);
                                }
                            }));
                            return;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    throw null;
                }
                throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }
}
