package com.umeng.umcrash;

import OooO00o.OooO00o;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.launch.LaunchManager;
import com.efs.sdk.memoryinfo.UMMemoryMonitor;
import com.efs.sdk.pa.PAFactory;
import com.efs.sdk.pa.config.IEfsReporter;
import com.efs.sdk.pa.config.PackageLevel;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.measurement.AppMeasurement;
import com.uc.crashsdk.export.CrashApi;
import com.uc.crashsdk.export.CustomLogInfo;
import com.uc.crashsdk.export.ICrashClient;
import com.uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UMCrash {
    private static final boolean DEFAULT_VALUE_CRASH_ANR = true;
    private static final boolean DEFAULT_VALUE_CRASH_JAVA = true;
    private static final boolean DEFAULT_VALUE_CRASH_NATIVE = true;
    private static final boolean DEFAULT_VALUE_CRASH_UNEXP = false;
    private static final boolean DEFAULT_VALUE_LAUNCH = true;
    private static final boolean DEFAULT_VALUE_MEM = true;
    private static final boolean DEFAULT_VALUE_PA = true;
    private static final String KEY_ACTIITY_ON_CREATED = "onCreated";
    private static final String KEY_ACTIITY_ON_DESTROYED = "onDestroyed";
    private static final String KEY_ACTIITY_ON_PAUSED = "onPaused";
    private static final String KEY_ACTIITY_ON_RESUMED = "onResumed";
    private static final String KEY_ACTIITY_ON_STARTED = "onStarted";
    private static final String KEY_ACTIITY_ON_STOPPED = "onStopped";
    public static final String KEY_APM_DEFAULT_SECRET = "NEej8y@anWa*8hep";
    public static final String KEY_APM_ROOT_NAME = "UApm";
    public static final String KEY_CALLBACK_PAGE_ACTION = "um_action_log";
    public static final String KEY_CALLBACK_UMID = "um_umid";
    private static final String KEY_CALLBACK_USER_STRING = "um_user_string";
    public static final String KEY_ENABLE_ANR = "enableANRLog";
    public static final String KEY_ENABLE_CRASH_JAVA = "enableJavaLog";
    public static final String KEY_ENABLE_CRASH_NATIVE = "enableNativeLog";
    public static final String KEY_ENABLE_CRASH_UNEXP = "enableUnexpLog";
    public static final String KEY_ENABLE_LAUNCH = "enableLaunchLog";
    public static final String KEY_ENABLE_MEM = "enableMemLog";
    public static final String KEY_ENABLE_PA = "enablePaLog";
    public static final String KEY_HEADER_ACCESS = "um_access";
    public static final String KEY_HEADER_ACCESS_SUBTYPE = "um_access_subtype";
    public static final String KEY_HEADER_APPKEY = "um_app_key";
    public static final String KEY_HEADER_BESRIAL = "um_bserial";
    public static final String KEY_HEADER_BSVER = "um_bsver";
    public static final String KEY_HEADER_BVER = "um_bver";
    public static final String KEY_HEADER_CARRIER = "um_app_carrier";
    public static final String KEY_HEADER_CHANNEL = "um_app_channel";
    public static final String KEY_HEADER_CRASH_VERSION = "um_crash_sdk_version";
    public static final String KEY_HEADER_NETWORK_TYPE = "um_network_type";
    public static final String KEY_HEADER_OS = "um_os";
    public static final String KEY_HEADER_PROVIDER = "um_app_provider";
    public static final String KEY_HEADER_PUID = "um_app_puid";
    public static final String KEY_HEADER_START_TIME = "um_app_start_time";
    public static final String KEY_HEADER_UMID = "um_umid_header";
    private static final int KEY_MAX_LENGTH = 256;
    private static final int KEY_MAX_LENGTH_128 = 128;
    private static final String TAG = "UMCrash";
    private static String crashSdkVersion = "1.4.1";
    private static boolean isDebug = true;
    private static boolean isEncrypt = false;
    private static boolean isIntl = false;
    private static boolean isZip = true;
    private static Context mContext;
    private static UMCrashCallback mUMCrashCallback;
    public static EfsReporter sReporter;
    private static String userBesrial;
    private static String userBsver;
    private static String userBver;
    private static Object pageArrayLock = new Object();
    private static ArrayList<String> mArrayList = new ArrayList<>(10);
    private static boolean isPA = false;
    private static boolean isLa = false;
    private static boolean enableJavaLog = true;
    private static boolean enableNativeLog = true;
    private static boolean enableANRLog = true;
    private static boolean enablePaLog = true;
    private static boolean enableLaunchLog = true;
    private static boolean enableMemLog = true;

    public static class CrashClientImpl implements ICrashClient {
        private CrashClientImpl() {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onAddCrashStats(String str, int i, int i2) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public File onBeforeUploadLog(File file) {
            return file;
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onClientProcessLogGenerated(String str, File file, String str2) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onCrashRestarting(boolean z) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public String onGetCallbackInfo(String str, boolean z) {
            String strOnCallback;
            String string = null;
            if (!"um_action_log".equals(str)) {
                if (UMCrash.KEY_CALLBACK_UMID.equals(str)) {
                    return UMCrash.getUMID(UMCrash.mContext);
                }
                if (!UMCrash.KEY_CALLBACK_USER_STRING.equals(str) || UMCrash.mUMCrashCallback == null || (strOnCallback = UMCrash.mUMCrashCallback.onCallback()) == null) {
                    return null;
                }
                return strOnCallback.trim().getBytes().length > 256 ? UMCrashUtils.splitByByte(strOnCallback, 256) : strOnCallback;
            }
            try {
                if (UMCrash.mArrayList != null && UMCrash.mArrayList.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source", 0);
                    jSONObject.put("action_name", "page_view");
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < UMCrash.mArrayList.size(); i++) {
                        String str2 = (String) UMCrash.mArrayList.get(i);
                        if (str2 != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", str2);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("action_parameter", jSONArray);
                    string = jSONObject.toString();
                    if (UMCrash.isDebug) {
                        Log.i(UMCrash.TAG, "page json is " + string);
                    }
                }
            } catch (Throwable unused) {
            }
            return string;
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onLogGenerated(File file, String str) {
        }
    }

    public static void enableANRLog(boolean z) {
        enableANRLog = z;
    }

    public static void enableMemoryMonitor(boolean z) {
        UMMemoryMonitor.get().setEnable(z);
    }

    public static void enableNativeLog(boolean z) {
        enableNativeLog = z;
    }

    public static void generateCustomLog(Throwable th, String str) {
        if (th == null || TextUtils.isEmpty(str)) {
            Log.e(TAG, "generate custom log failed ! e is null or type is empty");
            return;
        }
        try {
            CustomLogInfo customLogInfoBuild = new UMCustomLogInfoBuilder(str).stack(th).build();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(KEY_CALLBACK_UMID);
            arrayList.add("um_action_log");
            customLogInfoBuild.mCallbacks = arrayList;
            CrashApi crashApi = CrashApi.getInstance();
            if (crashApi == null) {
                Log.e(TAG, "CrashApi is null, not init .");
            } else {
                crashApi.generateCustomLog(customLogInfoBuild);
            }
        } catch (Throwable unused) {
        }
    }

    public static String getUMAPMFlag() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, 0);
            jSONObject.put(AppMeasurement.CRASH_ORIGIN, 1);
            if (enableNativeLog) {
                jSONObject.put("crashNative", 1);
            } else {
                jSONObject.put("crashNative", 0);
            }
            if (enableANRLog) {
                jSONObject.put(LogType.ANR_TYPE, 1);
            } else {
                jSONObject.put(LogType.ANR_TYPE, 0);
            }
            if (isPA) {
                jSONObject.put("pa", 1);
            } else {
                jSONObject.put("pa", 0);
            }
            if (isLa) {
                jSONObject.put("la", 1);
            } else {
                jSONObject.put("la", 0);
            }
            if (UMMemoryMonitor.get().isEnable()) {
                jSONObject.put("mem", 1);
            } else {
                jSONObject.put("mem", 0);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String getUMID(Context context) {
        Class<UMConfigure> cls;
        Method method;
        String string = null;
        if (context == null) {
            return null;
        }
        try {
            cls = UMConfigure.class;
            UMLog uMLog = UMConfigure.umDebugLog;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getUMIDString", Context.class);
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, context);
                    if (objInvoke != null) {
                        string = objInvoke.toString();
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                }
            }
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b0 A[Catch: all -> 0x015e, TryCatch #7 {all -> 0x015e, blocks: (B:7:0x0012, B:9:0x005c, B:18:0x009e, B:20:0x00b0, B:21:0x00b8, B:23:0x00c0, B:24:0x00c8, B:26:0x00d0, B:42:0x0130, B:44:0x0134, B:45:0x014f, B:41:0x012d, B:17:0x0098, B:46:0x0157, B:11:0x0083, B:13:0x0089, B:15:0x008d, B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:99:0x0012, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00c0 A[Catch: all -> 0x015e, TryCatch #7 {all -> 0x015e, blocks: (B:7:0x0012, B:9:0x005c, B:18:0x009e, B:20:0x00b0, B:21:0x00b8, B:23:0x00c0, B:24:0x00c8, B:26:0x00d0, B:42:0x0130, B:44:0x0134, B:45:0x014f, B:41:0x012d, B:17:0x0098, B:46:0x0157, B:11:0x0083, B:13:0x0089, B:15:0x008d, B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:99:0x0012, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d0 A[Catch: all -> 0x015e, TRY_LEAVE, TryCatch #7 {all -> 0x015e, blocks: (B:7:0x0012, B:9:0x005c, B:18:0x009e, B:20:0x00b0, B:21:0x00b8, B:23:0x00c0, B:24:0x00c8, B:26:0x00d0, B:42:0x0130, B:44:0x0134, B:45:0x014f, B:41:0x012d, B:17:0x0098, B:46:0x0157, B:11:0x0083, B:13:0x0089, B:15:0x008d, B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:99:0x0012, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e9 A[Catch: all -> 0x012c, TRY_ENTER, TryCatch #6 {all -> 0x012c, blocks: (B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:97:0x00d8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0 A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:97:0x00d8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8 A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:97:0x00d8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:97:0x00d8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x010a A[Catch: all -> 0x012c, TryCatch #6 {all -> 0x012c, blocks: (B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:97:0x00d8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0134 A[Catch: all -> 0x015e, TryCatch #7 {all -> 0x015e, blocks: (B:7:0x0012, B:9:0x005c, B:18:0x009e, B:20:0x00b0, B:21:0x00b8, B:23:0x00c0, B:24:0x00c8, B:26:0x00d0, B:42:0x0130, B:44:0x0134, B:45:0x014f, B:41:0x012d, B:17:0x0098, B:46:0x0157, B:11:0x0083, B:13:0x0089, B:15:0x008d, B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:99:0x0012, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x014f A[Catch: all -> 0x015e, TryCatch #7 {all -> 0x015e, blocks: (B:7:0x0012, B:9:0x005c, B:18:0x009e, B:20:0x00b0, B:21:0x00b8, B:23:0x00c0, B:24:0x00c8, B:26:0x00d0, B:42:0x0130, B:44:0x0134, B:45:0x014f, B:41:0x012d, B:17:0x0098, B:46:0x0157, B:11:0x0083, B:13:0x0089, B:15:0x008d, B:27:0x00d8, B:30:0x00e9, B:35:0x0102, B:37:0x010a, B:38:0x0112, B:31:0x00f0, B:33:0x00f8, B:34:0x00fc), top: B:99:0x0012, inners: #4, #6 }] */
    public static void init(final Context context, String str, String str2) {
        String[] networkAccessMode;
        if (context == null || str == null) {
            Log.e(TAG, "context is null or appkey is null, init failed.");
            return;
        }
        mContext = context;
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("mDebug", isDebug);
            bundle.putBoolean("mEncryptLog", isEncrypt);
            bundle.putBoolean("mZipLog", isZip);
            bundle.putBoolean(KEY_ENABLE_CRASH_JAVA, enableJavaLog);
            bundle.putBoolean(KEY_ENABLE_CRASH_NATIVE, enableNativeLog);
            bundle.putBoolean(KEY_ENABLE_ANR, enableANRLog);
            bundle.putBoolean(KEY_ENABLE_CRASH_UNEXP, false);
            bundle.putBoolean("mIsInternational", isIntl);
            CrashApi crashApiCreateInstanceEx = CrashApi.createInstanceEx(context, str, isDebug, bundle, new CrashClientImpl());
            if (crashApiCreateInstanceEx != null) {
                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_APPKEY, str);
                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CHANNEL, str2);
                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_OS, "android");
                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_UMID, getUMID(context));
                try {
                    String[] activeUser = UMCrashUtils.getActiveUser(context);
                    if (activeUser == null || activeUser.length != 2) {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
                        if (!TextUtils.isEmpty(userBver)) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BVER, userBver);
                        }
                        if (!TextUtils.isEmpty(userBsver)) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BSVER, userBsver);
                        }
                        if (!TextUtils.isEmpty(userBesrial)) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BESRIAL, userBesrial);
                        }
                        try {
                            networkAccessMode = NetworkUtil.getNetworkAccessMode(context);
                            if ("Wi-Fi".equals(networkAccessMode[0])) {
                                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS, "wifi");
                            } else if ("2G/3G".equals(networkAccessMode[0])) {
                                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS, "2G/3G");
                            } else {
                                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS, "unknow");
                            }
                            if (!"".equals(networkAccessMode[1])) {
                                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
                            }
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_NETWORK_TYPE, "" + NetworkUtil.getNetworkTypeUmeng(context));
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (context instanceof Application) {
                            ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.umcrash.UMCrash.1
                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityCreated(Activity activity, Bundle bundle2) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_CREATED);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityDestroyed(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_DESTROYED);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityPaused(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_PAUSED);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityResumed(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_RESUMED);
                                    UMMemoryMonitor.get().onActivityResumed(activity);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivitySaveInstanceState(Activity activity, Bundle bundle2) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityStarted(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_STARTED);
                                    UMMemoryMonitor.get().onActivityStarted(activity);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityStopped(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_STOPPED);
                                    UMMemoryMonitor.get().onActivityStopped(activity);
                                }
                            });
                            crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_UMID, 1048593);
                            crashApiCreateInstanceEx.registerInfoCallback("um_action_log", 1048593);
                        } else {
                            Log.e(TAG, "context not instanceof application.");
                        }
                    } else {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PUID, activeUser[1]);
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PROVIDER, activeUser[0]);
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
                        if (!TextUtils.isEmpty(userBver)) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BVER, userBver);
                        }
                        if (!TextUtils.isEmpty(userBsver)) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BSVER, userBsver);
                        }
                        if (!TextUtils.isEmpty(userBesrial)) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BESRIAL, userBesrial);
                        }
                        networkAccessMode = NetworkUtil.getNetworkAccessMode(context);
                        if ("Wi-Fi".equals(networkAccessMode[0])) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS, "wifi");
                        } else if ("2G/3G".equals(networkAccessMode[0])) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS, "2G/3G");
                        } else {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS, "unknow");
                        }
                        if (!"".equals(networkAccessMode[1])) {
                            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
                        }
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_NETWORK_TYPE, "" + NetworkUtil.getNetworkTypeUmeng(context));
                        if (context instanceof Application) {
                            ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.umcrash.UMCrash.1
                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityCreated(Activity activity, Bundle bundle2) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_CREATED);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityDestroyed(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_DESTROYED);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityPaused(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_PAUSED);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityResumed(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_RESUMED);
                                    UMMemoryMonitor.get().onActivityResumed(activity);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivitySaveInstanceState(Activity activity, Bundle bundle2) {
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityStarted(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_STARTED);
                                    UMMemoryMonitor.get().onActivityStarted(activity);
                                }

                                @Override // android.app.Application.ActivityLifecycleCallbacks
                                public void onActivityStopped(Activity activity) {
                                    UMCrash.saveActivityState(activity.getLocalClassName(), UMCrash.KEY_ACTIITY_ON_STOPPED);
                                    UMMemoryMonitor.get().onActivityStopped(activity);
                                }
                            });
                            crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_UMID, 1048593);
                            crashApiCreateInstanceEx.registerInfoCallback("um_action_log", 1048593);
                        } else {
                            Log.e(TAG, "context not instanceof application.");
                        }
                    }
                } catch (Throwable unused) {
                    crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PUID, "");
                    crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PROVIDER, "");
                }
            } else {
                Log.e(TAG, "create CrashAPI is null.");
            }
        } catch (Throwable unused2) {
        }
        try {
            initReporter(context, str, str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            if (enablePaLog) {
                PAFactory.Builder builder = new PAFactory.Builder(context.getApplicationContext(), new IEfsReporter() { // from class: com.umeng.umcrash.UMCrash.2
                    @Override // com.efs.sdk.pa.config.IEfsReporter
                    public EfsReporter getReporter() {
                        return UMCrash.sReporter;
                    }
                });
                builder.packageLevel(PackageLevel.RELEASE);
                PAFactory pAFactoryBuild = builder.build();
                pAFactoryBuild.getPaInstance().start();
                isPA = pAFactoryBuild.getConfigManager().enableTracer();
            } else {
                Log.e(TAG, "enablePaLog is false");
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            if (enableLaunchLog) {
                LaunchManager.init(context, sReporter);
                try {
                    isLa = LaunchManager.getLaunchConfigManager().enableTracer();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                String uMId = UMUtils.getUMId(context);
                if (uMId == null || TextUtils.isEmpty(uMId)) {
                    if (isDebug) {
                        Log.i(TAG, "begin register common callback.  key is umid.");
                    }
                    ImprintHandler.getImprintService(context).registImprintCallback(ak.g, new UMImprintChangeCallback() { // from class: com.umeng.umcrash.UMCrash.3
                        @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                        public void onImprintValueChanged(String str3, String str4) {
                            if (UMCrash.isDebug) {
                                Log.i(UMCrash.TAG, "common callback.  key is " + str3 + "; value is " + str4);
                            }
                            try {
                                if (ak.g.equals(str3)) {
                                    LaunchManager.sendLaunchCache(context, str4);
                                    ImprintHandler.getImprintService(context).unregistImprintCallback(ak.g, this);
                                }
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                    });
                }
            } else {
                Log.e(TAG, "enableLaunchLog is false");
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            if (enableMemLog) {
                UMMemoryMonitor.get().start(context, sReporter);
            } else {
                Log.e(TAG, "enableMemLog is false");
            }
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
    }

    public static void initConfig(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean(KEY_ENABLE_CRASH_JAVA, true)) {
                enableJavaLog = true;
            } else {
                enableJavaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_CRASH_NATIVE, true)) {
                enableNativeLog = true;
            } else {
                enableNativeLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_ANR, true)) {
                enableANRLog = true;
            } else {
                enableANRLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_PA, true)) {
                enablePaLog = true;
            } else {
                enablePaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_LAUNCH, true)) {
                enableLaunchLog = true;
            } else {
                enableLaunchLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_MEM, true)) {
                enableMemLog = true;
            } else {
                enableMemLog = false;
            }
        }
    }

    private static void initReporter(Context context, String str, String str2) {
        HashMap map = new HashMap(1);
        map.put(KEY_HEADER_UMID, getUMID(context));
        map.put(KEY_HEADER_CHANNEL, str2);
        map.put(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
        map.put(KEY_HEADER_OS, "android");
        map.put(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
        try {
            String[] activeUser = UMCrashUtils.getActiveUser(context);
            if (activeUser != null && activeUser.length == 2) {
                map.put(KEY_HEADER_PUID, activeUser[1]);
                map.put(KEY_HEADER_PROVIDER, activeUser[0]);
            }
        } catch (Throwable unused) {
            map.put(KEY_HEADER_PUID, "");
            map.put(KEY_HEADER_PROVIDER, "");
        }
        if (!TextUtils.isEmpty(userBver)) {
            map.put(KEY_HEADER_BVER, userBver);
        }
        if (!TextUtils.isEmpty(userBsver)) {
            map.put(KEY_HEADER_BSVER, userBsver);
        }
        if (!TextUtils.isEmpty(userBesrial)) {
            map.put(KEY_HEADER_BESRIAL, userBesrial);
        }
        EfsReporter efsReporterBuild = new EfsReporter.Builder(context.getApplicationContext(), str, KEY_APM_DEFAULT_SECRET).debug(isDebug).efsDirRootName(KEY_APM_ROOT_NAME).printLogDetail(isDebug).intl(isIntl).build();
        sReporter = efsReporterBuild;
        efsReporterBuild.addPublicParams(map);
    }

    public static void registerUMCrashCallback(UMCrashCallback uMCrashCallback) {
        if (uMCrashCallback == null) {
            Log.e(TAG, "callback error.");
            return;
        }
        mUMCrashCallback = uMCrashCallback;
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().registerInfoCallback(KEY_CALLBACK_USER_STRING, 1048593);
        } else {
            Log.e(TAG, "callback error, instance is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveActivityState(String str, String str2) {
        try {
            ArrayList<String> arrayList = mArrayList;
            if (arrayList != null) {
                if (arrayList.size() >= 20) {
                    mArrayList.remove(0);
                }
                mArrayList.add(str + "-" + System.currentTimeMillis() + "-" + str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setAppVersion(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.trim().getBytes().length > 128) {
                    str = UMCrashUtils.splitByByte(str, 128);
                }
                userBver = str;
            } else if (isDebug) {
                Log.e(TAG, "version is null or empty !");
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2.trim().getBytes().length > 128) {
                    str2 = UMCrashUtils.splitByByte(str2, 128);
                }
                userBsver = str2;
            } else if (isDebug) {
                Log.e(TAG, "sub version is null or empty !");
            }
            if (!TextUtils.isEmpty(str3)) {
                if (str3.trim().getBytes().length > 128) {
                    str3 = UMCrashUtils.splitByByte(str3, 128);
                }
                userBesrial = str3;
            } else if (isDebug) {
                Log.e(TAG, "build id is null or empty !");
            }
            CrashApi crashApi = CrashApi.getInstance();
            if (crashApi != null) {
                if (!TextUtils.isEmpty(userBver)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BVER, userBver);
                }
                if (!TextUtils.isEmpty(userBsver)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BSVER, userBsver);
                }
                if (!TextUtils.isEmpty(userBesrial)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BESRIAL, userBesrial);
                }
            } else if (isDebug) {
                Log.e(TAG, "set app version. crashApi is null");
            }
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(userBver)) {
                map.put(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                map.put(KEY_HEADER_BSVER, userBsver);
            }
            if (!TextUtils.isEmpty(userBesrial)) {
                map.put(KEY_HEADER_BESRIAL, userBesrial);
            }
            EfsReporter efsReporter = sReporter;
            if (efsReporter != null) {
                efsReporter.addPublicParams(map);
            } else if (isDebug) {
                Log.e(TAG, "set app version.  sReporter is null");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setDebug(boolean z) {
        isDebug = z;
        LaunchManager.isDebug = z;
    }

    private static void useIntlServices(boolean z) {
        isIntl = z;
        if (isDebug) {
            String str = TAG;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("useIntlServices is ");
            sbOooO0o0.append(isIntl);
            Log.i(str, sbOooO0o0.toString());
        }
    }

    public static void generateCustomLog(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                CustomLogInfo customLogInfo = new CustomLogInfo(null, "exception");
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(KEY_CALLBACK_UMID);
                arrayList.add("um_action_log");
                customLogInfo.mCallbacks = arrayList;
                HashMap map = new HashMap(20);
                map.put(UMCustomLogInfoBuilder.LOG_KEY_CT, "exception");
                map.put(UMCustomLogInfoBuilder.LOG_KEY_AC, str2);
                StringBuffer stringBuffer = new StringBuffer();
                for (Map.Entry entry : map.entrySet()) {
                    stringBuffer.append((String) entry.getKey());
                    stringBuffer.append(CertificateUtil.DELIMITER);
                    stringBuffer.append((String) entry.getValue());
                    stringBuffer.append("\n");
                }
                String str3 = "Exception message:\nBack traces starts.\n" + str + "\nBack traces ends.";
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append(str3);
                    stringBuffer.append("\n");
                }
                customLogInfo.mData = stringBuffer;
                CrashApi crashApi = CrashApi.getInstance();
                if (crashApi == null) {
                    Log.e(TAG, "CrashApi is null, not init .");
                    return;
                } else {
                    crashApi.generateCustomLog(customLogInfo);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        Log.e(TAG, "generate custom log failed ! e is null or type is empty");
    }
}
