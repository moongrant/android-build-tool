package com.yallatech.support.platform;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOOO.OooO00o.OooO0OO;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooO0O0;
import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOo0.o0OOO0o;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.OooOO0;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yallatech.support.platform.base.BaseReq;
import com.yallatech.support.platform.callback.YCSDKCallback;
import com.yallatech.support.platform.callback.YCSDKCallbackManager;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import com.yallatech.support.platform.exception.YallaException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.Oooo0;
import p003OooO0o0.o0OoOo0;
import p003OooO0o0.o0ooOOo;
import p609o0oo0OOO.h5;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bQ\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020\u001eH\u0001¢\u0006\u0004\b\"\u0010#J3\u0010+\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0013J\u0015\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001e¢\u0006\u0004\b/\u0010!J\u000f\u00101\u001a\u00020\u0007H\u0000¢\u0006\u0004\b0\u0010\u0013J\u000f\u00103\u001a\u00020\u0007H\u0000¢\u0006\u0004\b2\u0010\u0013J\u0017\u00108\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b9\u00107R\u0016\u0010.\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010=R\u0018\u0010F\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010=R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010=R\u0016\u0010\u001c\u001a\u00020L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010MR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010=R\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010=R\u0016\u0010P\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010=¨\u0006R"}, d2 = {"Lcom/yallatech/support/platform/YCSDKOpenKit;", "", "Ljava/util/concurrent/Executor;", "executor", "", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "", "applicationId", "setApplicationId", "(Ljava/lang/String;)V", "directUrl", "setDirectUrl", "getExecutor$lib_release", "()Ljava/util/concurrent/Executor;", "getExecutor", "applicationKey", "setApplicationKey", "getAppId$lib_release", "()Ljava/lang/String;", "getAppId", "getAppKey$lib_release", "getAppKey", "getDirectUrl$lib_release", "getDirectUrl", "", "isInitialized", "()Z", "sdkInitialized", "()V", "Landroid/content/Context;", "context", "loadDefaultsFromMetadata", "(Landroid/content/Context;)V", "getApplicationContext$lib_release", "()Landroid/content/Context;", "getApplicationContext", "Lcom/yallatech/support/platform/base/BaseReq;", "req", "Lcom/yallatech/support/platform/callback/YCSDKCallback;", "callback", "Lcom/yallatech/support/platform/callback/YCSDKCallbackManager;", "ycSDKCallbackManager", "sendReq", "(Landroid/content/Context;Lcom/yallatech/support/platform/base/BaseReq;Lcom/yallatech/support/platform/callback/YCSDKCallback;Lcom/yallatech/support/platform/callback/YCSDKCallbackManager;)V", "getVersion", "applicationContext", "sdkInitialize", "getUniqueId$lib_release", "getUniqueId", "getThirdApplicationId$lib_release", "getThirdApplicationId", "Ljava/lang/Runnable;", "runnable", "dispatchToMain$lib_release", "(Ljava/lang/Runnable;)V", "dispatchToMain", "dispatchToIO$lib_release", "dispatchToIO", "Landroid/content/Context;", "appKey", "Ljava/lang/String;", "uniqueID", "APPLICATION_KEY_MISS_TEXT", "APPLICATION_KEY_PROPERTY", "thirdApplicationId", "Ljava/util/concurrent/locks/ReentrantLock;", "LOCK", "Ljava/util/concurrent/locks/ReentrantLock;", "APPLICATION_ID_PREFIX", RemoteConfigConstants$RequestFieldKey.APP_ID, "Ljava/util/concurrent/Executor;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "APPLICATION_ID_MISS_TEXT", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "APPLICATION_DIRECTURL_MISS_TEXT", "APPLICATION_ID_PROPERTY", "APPLICATION_KEY_DIRECTURL", "<init>", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class YCSDKOpenKit {

    @NotNull
    private static final String APPLICATION_DIRECTURL_MISS_TEXT = "A valid yalla directUrl must be set in the AndroidManifest.xml or set by calling YallaChatSdk.setDirectUrl before initializing the sdk.";

    @NotNull
    private static final String APPLICATION_ID_MISS_TEXT = "A valid yalla app id must be set in the AndroidManifest.xml or set by calling YallaChatSdk.setApplicationId before initializing the sdk.";

    @NotNull
    private static final String APPLICATION_ID_PREFIX = "yc";

    @NotNull
    private static final String APPLICATION_ID_PROPERTY = "com.yallachat.sdk.appId";

    @NotNull
    private static final String APPLICATION_KEY_DIRECTURL = "com.yallachat.sdk.directUrl";

    @NotNull
    private static final String APPLICATION_KEY_MISS_TEXT = "A valid yalla app key must be set in the AndroidManifest.xml or set by calling YallaChatSdk.setApplicationKey before initializing the sdk.";

    @NotNull
    private static final String APPLICATION_KEY_PROPERTY = "com.yallachat.sdk.appKey";

    @Nullable
    private static volatile String appId;

    @Nullable
    private static volatile String appKey;
    private static Context applicationContext;

    @Nullable
    private static volatile String directUrl;

    @Nullable
    private static Executor executor;

    @Nullable
    private static String thirdApplicationId;

    @NotNull
    public static final YCSDKOpenKit INSTANCE = new YCSDKOpenKit();

    @NotNull
    private static final ReentrantLock LOCK = new ReentrantLock();

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private static String uniqueID = "";

    @NotNull
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    private YCSDKOpenKit() {
    }

    @JvmStatic
    @NotNull
    public static final String getAppId$lib_release() {
        INSTANCE.sdkInitialized();
        String str = appId;
        if (str != null) {
            return str;
        }
        throw new YallaException(APPLICATION_ID_MISS_TEXT);
    }

    @JvmStatic
    @NotNull
    public static final String getAppKey$lib_release() {
        INSTANCE.sdkInitialized();
        String str = appKey;
        if (str != null) {
            return str;
        }
        throw new YallaException(APPLICATION_KEY_MISS_TEXT);
    }

    @JvmStatic
    @NotNull
    public static final Context getApplicationContext$lib_release() {
        INSTANCE.sdkInitialized();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        return null;
    }

    @JvmStatic
    @NotNull
    public static final String getDirectUrl$lib_release() {
        INSTANCE.sdkInitialized();
        String str = directUrl;
        if (str != null) {
            return str;
        }
        throw new YallaException(APPLICATION_DIRECTURL_MISS_TEXT);
    }

    @JvmStatic
    @NotNull
    public static final Executor getExecutor$lib_release() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
            }
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

    private final boolean isInitialized() {
        return sdkInitialized.get();
    }

    private final void loadDefaultsFromMetadata(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n        context.pa… {\n        return\n      }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (appId == null) {
                Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof String) {
                    String str = (String) obj;
                    appId = str;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, APPLICATION_ID_PREFIX, false, 2, null)) {
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        appId = strSubstring;
                    }
                } else if (obj instanceof Number) {
                    throw new YallaException("App Id cannot be directly placed in the manifest.it must be prefixed by 'yc' or be placed in the string resource file.");
                }
            }
            if (appKey == null) {
                appKey = applicationInfo.metaData.getString(APPLICATION_KEY_PROPERTY);
            }
            if (directUrl == null) {
                directUrl = applicationInfo.metaData.getString(APPLICATION_KEY_DIRECTURL);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void sdkInitialized() {
        if (!isInitialized()) {
            throw new YallaException("The SDK has not been initialized, make sure to call YallaChatSdk.sdkInitialize() first.");
        }
    }

    public static /* synthetic */ void sendReq$default(YCSDKOpenKit yCSDKOpenKit, Context context, BaseReq baseReq, YCSDKCallback yCSDKCallback, YCSDKCallbackManager yCSDKCallbackManager, int i, Object obj) {
        if ((i & 8) != 0) {
            yCSDKCallbackManager = null;
        }
        yCSDKOpenKit.sendReq(context, baseReq, yCSDKCallback, yCSDKCallbackManager);
    }

    @JvmStatic
    public static final void setApplicationId(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (StringsKt.isBlank(applicationId)) {
            throw new YallaException("Argument applicationId cannot be empty");
        }
        appId = applicationId;
    }

    @JvmStatic
    public static final void setApplicationKey(@NotNull String applicationKey) {
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        if (StringsKt.isBlank(applicationKey)) {
            throw new YallaException("Argument applicationKey cannot be empty");
        }
        appKey = applicationKey;
    }

    @JvmStatic
    public static final void setDirectUrl(@NotNull String directUrl2) {
        Intrinsics.checkNotNullParameter(directUrl2, "directUrl");
        if (StringsKt.isBlank(directUrl2)) {
            throw new YallaException("Argument directUrl cannot be empty");
        }
        directUrl = directUrl2;
    }

    @JvmStatic
    public static final void setExecutor(@NotNull Executor executor2) {
        Intrinsics.checkNotNullParameter(executor2, "executor");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void dispatchToIO$lib_release(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        getExecutor$lib_release().execute(runnable);
    }

    public final void dispatchToMain$lib_release(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        handler.post(runnable);
    }

    @NotNull
    public final String getThirdApplicationId$lib_release() {
        sdkInitialized();
        String str = thirdApplicationId;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getUniqueId$lib_release() {
        if (StringsKt.isBlank(uniqueID)) {
            Context context = applicationContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context = null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("unique_id_sp", 0);
            String string = sharedPreferences.getString("unique_id", null);
            if (string == null) {
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()");
                string = StringsKt__StringsJVMKt.replace$default(string2, "-", "", false, 4, (Object) null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("unique_id", string);
                editorEdit.apply();
            }
            uniqueID = string;
        }
        return uniqueID;
    }

    @NotNull
    public final String getVersion() {
        return "1.2.0";
    }

    public final void sdkInitialize(@NotNull Context applicationContext2) {
        Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
        AtomicBoolean atomicBoolean = sdkInitialized;
        if (atomicBoolean.get()) {
            return;
        }
        Context applicationContext3 = applicationContext2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "applicationContext.applicationContext");
        applicationContext = applicationContext3;
        Context context = null;
        if (applicationContext3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            applicationContext3 = null;
        }
        loadDefaultsFromMetadata(applicationContext3);
        Context context2 = applicationContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        } else {
            context = context2;
        }
        thirdApplicationId = context.getApplicationInfo().packageName;
        String str = appId;
        if (str == null || StringsKt.isBlank(str)) {
            throw new YallaException(APPLICATION_ID_MISS_TEXT);
        }
        String str2 = appKey;
        if (str2 == null || StringsKt.isBlank(str2)) {
            throw new YallaException(APPLICATION_KEY_MISS_TEXT);
        }
        String str3 = directUrl;
        if (str3 == null || StringsKt.isBlank(str3)) {
            throw new YallaException(APPLICATION_DIRECTURL_MISS_TEXT);
        }
        atomicBoolean.set(true);
        Intrinsics.checkNotNullParameter("YLAuth", "<set-?>");
        h5.f57415OooO00o = "YLAuth";
        h5.f57416OooO0O0 = false;
    }

    public final void sendReq(@NotNull Context context, @NotNull BaseReq req, @Nullable YCSDKCallback callback, @Nullable YCSDKCallbackManager ycSDKCallbackManager) {
        OooO0O0 value;
        YCSDKCallbackManager yCSDKCallbackManager;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(req, "req");
        sdkInitialized();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(req, "req");
        int type = req.getType();
        if (type == 1) {
            value = OooO0O0.f71OooO00o.getValue();
        } else if (type == 2) {
            value = o0OOO0o.f79OooO00o.getValue();
        } else if (type == 3) {
            value = OooO0OO.f66OooO00o.getValue();
        } else if (type != 4) {
            value = type != 5 ? OooO0O0.f71OooO00o.getValue() : OooO00o.OooO00o.OooO00o.OooO00o.OooOOO.OooO0OO.f41OooO00o.getValue();
        } else {
            value = OooO00o.OooO00o.OooO00o.OooO00o.OooOOOO.OooO0O0.OooO0OO.f68OooO00o.getValue();
        }
        value.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(req, "req");
        ComponentCallbacks2 componentCallbacks2OooO00o = o0ooOOo.OooO00o(context);
        OooOO0 oooOO1 = null;
        OooOO0 oooOO2 = componentCallbacks2OooO00o instanceof OooOO0 ? (OooOO0) componentCallbacks2OooO00o : null;
        if (ycSDKCallbackManager == null) {
            yCSDKCallbackManager = null;
        } else {
            value.OooO0OO(ycSDKCallbackManager, callback);
            yCSDKCallbackManager = ycSDKCallbackManager;
        }
        if (yCSDKCallbackManager == null) {
            ycSDKCallbackManager = new YCSDKCallbackManagerImpl();
            Intrinsics.checkNotNull(ycSDKCallbackManager);
            value.OooO0OO(ycSDKCallbackManager, callback);
        }
        if (oooOO2 != null) {
            value.OooO0Oo(context, req, new o0OoOo0(ycSDKCallbackManager, oooOO2));
            oooOO1 = oooOO2;
        }
        if (oooOO1 == null) {
            value.OooO0Oo(context, req, new Oooo0(o0ooOOo.OooO00o(context)));
        }
    }
}
