package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import kotlin.UByte;
import org.conscrypt.EvpMdRef;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZIDManager {
    public static ZIDManager c;
    public boolean a = false;
    public boolean b = false;

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ IZIDCompletionCallback b;

        public a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.a = context;
            this.b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strA = ZIDManager.a(ZIDManager.this, this.a);
            if (TextUtils.isEmpty(strA)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(strA);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:19:0x004d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0073  */
        /* JADX WARN: Code duplicated, block: B:35:0x009a  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #0 {all -> 0x010a, blocks: (B:7:0x001b, B:9:0x0021, B:11:0x0028, B:14:0x0038, B:16:0x003e, B:18:0x0048, B:20:0x004e, B:23:0x005e, B:25:0x0064, B:27:0x006e, B:29:0x0074, B:32:0x008f, B:34:0x0095, B:36:0x009b, B:39:0x00a2, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:46:0x00b7, B:48:0x00c5, B:50:0x00da, B:52:0x00ed, B:53:0x00f0, B:55:0x00fa, B:56:0x00fd, B:58:0x0107), top: B:62:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00c5 A[Catch: all -> 0x010a, TryCatch #0 {all -> 0x010a, blocks: (B:7:0x001b, B:9:0x0021, B:11:0x0028, B:14:0x0038, B:16:0x003e, B:18:0x0048, B:20:0x004e, B:23:0x005e, B:25:0x0064, B:27:0x006e, B:29:0x0074, B:32:0x008f, B:34:0x0095, B:36:0x009b, B:39:0x00a2, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:46:0x00b7, B:48:0x00c5, B:50:0x00da, B:52:0x00ed, B:53:0x00f0, B:55:0x00fa, B:56:0x00fd, B:58:0x0107), top: B:62:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00da A[Catch: all -> 0x010a, TryCatch #0 {all -> 0x010a, blocks: (B:7:0x001b, B:9:0x0021, B:11:0x0028, B:14:0x0038, B:16:0x003e, B:18:0x0048, B:20:0x004e, B:23:0x005e, B:25:0x0064, B:27:0x006e, B:29:0x0074, B:32:0x008f, B:34:0x0095, B:36:0x009b, B:39:0x00a2, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:46:0x00b7, B:48:0x00c5, B:50:0x00da, B:52:0x00ed, B:53:0x00f0, B:55:0x00fa, B:56:0x00fd, B:58:0x0107), top: B:62:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00ed A[Catch: all -> 0x010a, TryCatch #0 {all -> 0x010a, blocks: (B:7:0x001b, B:9:0x0021, B:11:0x0028, B:14:0x0038, B:16:0x003e, B:18:0x0048, B:20:0x004e, B:23:0x005e, B:25:0x0064, B:27:0x006e, B:29:0x0074, B:32:0x008f, B:34:0x0095, B:36:0x009b, B:39:0x00a2, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:46:0x00b7, B:48:0x00c5, B:50:0x00da, B:52:0x00ed, B:53:0x00f0, B:55:0x00fa, B:56:0x00fd, B:58:0x0107), top: B:62:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00fa A[Catch: all -> 0x010a, TryCatch #0 {all -> 0x010a, blocks: (B:7:0x001b, B:9:0x0021, B:11:0x0028, B:14:0x0038, B:16:0x003e, B:18:0x0048, B:20:0x004e, B:23:0x005e, B:25:0x0064, B:27:0x006e, B:29:0x0074, B:32:0x008f, B:34:0x0095, B:36:0x009b, B:39:0x00a2, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:46:0x00b7, B:48:0x00c5, B:50:0x00da, B:52:0x00ed, B:53:0x00f0, B:55:0x00fa, B:56:0x00fd, B:58:0x0107), top: B:62:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0107 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #0 {all -> 0x010a, blocks: (B:7:0x001b, B:9:0x0021, B:11:0x0028, B:14:0x0038, B:16:0x003e, B:18:0x0048, B:20:0x004e, B:23:0x005e, B:25:0x0064, B:27:0x006e, B:29:0x0074, B:32:0x008f, B:34:0x0095, B:36:0x009b, B:39:0x00a2, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:46:0x00b7, B:48:0x00c5, B:50:0x00da, B:52:0x00ed, B:53:0x00f0, B:55:0x00fa, B:56:0x00fd, B:58:0x0107), top: B:62:0x001b }] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            String string;
            String id;
            String string2;
            String strC;
            String string3;
            String strB;
            String string4;
            String strA;
            JSONObject jSONObject;
            String strOptString;
            String string5;
            String string6;
            SharedPreferences sharedPreferencesA;
            SharedPreferences sharedPreferencesA2;
            SharedPreferences sharedPreferencesA3;
            SharedPreferences sharedPreferencesA4;
            ZIDManager zIDManager = ZIDManager.this;
            Context context = this.a;
            if (zIDManager.b) {
                return;
            }
            zIDManager.b = true;
            JSONObject jSONObject2 = new JSONObject();
            String string7 = "";
            if (context != null) {
                try {
                    SharedPreferences sharedPreferencesA5 = com.umeng.umzid.a.a(context);
                    if (sharedPreferencesA5 != null) {
                        string = sharedPreferencesA5.getString("zdata", null);
                    } else {
                        string = "";
                    }
                    id = Spy.getID();
                    jSONObject2.put("zdata", id);
                    jSONObject2.put("old_zdata", string);
                    if (context != null || (sharedPreferencesA4 = com.umeng.umzid.a.a(context)) == null) {
                        string2 = "";
                    } else {
                        string2 = sharedPreferencesA4.getString("oaid", "");
                        if (com.umeng.umzid.c.c(string2)) {
                            string2 = com.umeng.umzid.c.a(string2);
                        }
                    }
                    strC = com.umeng.umzid.c.c(context);
                    jSONObject2.put("old_oaid", string2);
                    jSONObject2.put("oaid", strC);
                    if (context != null || (sharedPreferencesA3 = com.umeng.umzid.a.a(context)) == null) {
                        string3 = "";
                    } else {
                        string3 = sharedPreferencesA3.getString("mac", "");
                        if (com.umeng.umzid.c.c(string3)) {
                            string3 = com.umeng.umzid.c.a(string3);
                        }
                    }
                    strB = com.umeng.umzid.c.b(context);
                    jSONObject2.put("mac", strB);
                    jSONObject2.put("old_mac", string3);
                    zIDManager.a(context, jSONObject2);
                    jSONObject2.put("aaid", com.umeng.umzid.c.a(context));
                    if (context != null || (sharedPreferencesA2 = com.umeng.umzid.a.a(context)) == null) {
                        string4 = "";
                    } else {
                        string4 = sharedPreferencesA2.getString("uabc", "");
                    }
                    jSONObject2.put("uabc", string4);
                    if (context != null && (sharedPreferencesA = com.umeng.umzid.a.a(context)) != null) {
                        string7 = sharedPreferencesA.getString("resetToken", "");
                    }
                    if (!TextUtils.isEmpty(string7)) {
                        jSONObject2.put("resetToken", string7);
                    }
                    strA = com.umeng.umzid.a.a("https://aaid.umeng.com/api/updateZdata", jSONObject2.toString());
                    if (!TextUtils.isEmpty(strA)) {
                        jSONObject = new JSONObject(strA);
                        if (Boolean.valueOf(jSONObject.optBoolean("suc")).booleanValue()) {
                            com.umeng.umzid.c.f(context, id);
                            com.umeng.umzid.c.a(context, strB);
                            com.umeng.umzid.c.b(context, strC);
                            strOptString = jSONObject.optString("aaid");
                            if (!TextUtils.isEmpty(strOptString)) {
                                com.umeng.umzid.c.e(context, strOptString);
                            }
                            string5 = jSONObject.getString("uabc");
                            if (!TextUtils.isEmpty(string5)) {
                                com.umeng.umzid.c.d(context, string5);
                            }
                            string6 = jSONObject.getString("resetToken");
                            if (!TextUtils.isEmpty(string6)) {
                                com.umeng.umzid.c.c(context, string6);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else {
                string = "";
                id = Spy.getID();
                jSONObject2.put("zdata", id);
                jSONObject2.put("old_zdata", string);
                if (context != null) {
                    string2 = "";
                } else {
                    string2 = "";
                }
                strC = com.umeng.umzid.c.c(context);
                jSONObject2.put("old_oaid", string2);
                jSONObject2.put("oaid", strC);
                if (context != null) {
                    string3 = "";
                } else {
                    string3 = "";
                }
                strB = com.umeng.umzid.c.b(context);
                jSONObject2.put("mac", strB);
                jSONObject2.put("old_mac", string3);
                zIDManager.a(context, jSONObject2);
                jSONObject2.put("aaid", com.umeng.umzid.c.a(context));
                if (context != null) {
                    string4 = "";
                } else {
                    string4 = "";
                }
                jSONObject2.put("uabc", string4);
                if (context != null) {
                    string7 = sharedPreferencesA.getString("resetToken", "");
                }
                if (!TextUtils.isEmpty(string7)) {
                    jSONObject2.put("resetToken", string7);
                }
                strA = com.umeng.umzid.a.a("https://aaid.umeng.com/api/updateZdata", jSONObject2.toString());
                if (!TextUtils.isEmpty(strA)) {
                    jSONObject = new JSONObject(strA);
                    if (Boolean.valueOf(jSONObject.optBoolean("suc")).booleanValue()) {
                        com.umeng.umzid.c.f(context, id);
                        com.umeng.umzid.c.a(context, strB);
                        com.umeng.umzid.c.b(context, strC);
                        strOptString = jSONObject.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            com.umeng.umzid.c.e(context, strOptString);
                        }
                        string5 = jSONObject.getString("uabc");
                        if (!TextUtils.isEmpty(string5)) {
                            com.umeng.umzid.c.d(context, string5);
                        }
                        string6 = jSONObject.getString("resetToken");
                        if (!TextUtils.isEmpty(string6)) {
                            com.umeng.umzid.c.c(context, string6);
                        }
                    }
                }
            }
            zIDManager.b = false;
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.a(ZIDManager.this, this.a);
        }
    }

    public static /* synthetic */ String a(ZIDManager zIDManager, Context context) {
        String strOptString = null;
        if (!zIDManager.a) {
            zIDManager.a = true;
            JSONObject jSONObject = new JSONObject();
            try {
                String id = Spy.getID();
                jSONObject.put("zdata", id);
                String strB = com.umeng.umzid.c.b(context);
                jSONObject.put("mac", strB);
                String strC = com.umeng.umzid.c.c(context);
                jSONObject.put("oaid", strC);
                zIDManager.a(context, jSONObject);
                String strA = com.umeng.umzid.a.a("https://aaid.umeng.com/api/postZdata", jSONObject.toString());
                if (!TextUtils.isEmpty(strA)) {
                    JSONObject jSONObject2 = new JSONObject(strA);
                    if (Boolean.valueOf(jSONObject2.optBoolean("suc")).booleanValue()) {
                        com.umeng.umzid.c.f(context, id);
                        com.umeng.umzid.c.a(context, strB);
                        com.umeng.umzid.c.b(context, strC);
                        strOptString = jSONObject2.optString("aaid");
                        if (!TextUtils.isEmpty(strOptString)) {
                            com.umeng.umzid.c.e(context, strOptString);
                        }
                        String string = jSONObject2.getString("uabc");
                        if (!TextUtils.isEmpty(string)) {
                            com.umeng.umzid.c.d(context, string);
                        }
                        String string2 = jSONObject2.getString("resetToken");
                        if (!TextUtils.isEmpty(string2)) {
                            com.umeng.umzid.c.c(context, string2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            zIDManager.a = false;
        }
        return strOptString;
    }

    public static synchronized ZIDManager getInstance() {
        if (c == null) {
            c = new ZIDManager();
        }
        return c;
    }

    public static String getSDKVersion() {
        return "1.4.0";
    }

    public synchronized String getZID(Context context) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String strA = com.umeng.umzid.c.a(applicationContext);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        com.umeng.umzid.b.a(new c(applicationContext));
        return "";
    }

    public synchronized void init(Context context, String str, IZIDCompletionCallback iZIDCompletionCallback) {
        SharedPreferences sharedPreferencesA;
        SharedPreferences.Editor editorEdit;
        try {
            if (context == null) {
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1001", "传入参数Context为null");
                }
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1003", "传入参数appkey为空");
                }
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null && str != null && !TextUtils.isEmpty(str) && (sharedPreferencesA = com.umeng.umzid.a.a(applicationContext)) != null && (editorEdit = sharedPreferencesA.edit()) != null) {
                editorEdit.putString("appkey", str).commit();
            }
            String strA = com.umeng.umzid.c.a(applicationContext);
            if (strA == null || TextUtils.isEmpty(strA)) {
                com.umeng.umzid.b.a(new a(applicationContext, iZIDCompletionCallback));
            } else {
                com.umeng.umzid.b.a(new b(applicationContext));
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onSuccess(strA);
                }
            }
            SharedPreferences sharedPreferencesA2 = com.umeng.umzid.a.a(context);
            if (TextUtils.isEmpty(sharedPreferencesA2 != null ? sharedPreferencesA2.getString("uuid", "") : "")) {
                String string = "";
                SharedPreferences sharedPreferencesA3 = com.umeng.umzid.a.a(context);
                try {
                    string = UUID.randomUUID().toString();
                } catch (Throwable unused) {
                }
                if (sharedPreferencesA3 != null) {
                    sharedPreferencesA3.edit().putString("uuid", string).commit();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #10 {all -> 0x009e, blocks: (B:30:0x0087, B:31:0x008b, B:33:0x0091), top: B:129:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    public final JSONObject a(Context context, JSONObject jSONObject) throws JSONException {
        Object obj;
        Locale locale;
        Calendar calendar;
        int rawOffset;
        Object obj2;
        String string;
        Object obj3;
        Object string2;
        Object country;
        SharedPreferences sharedPreferencesA;
        Object obj4 = "";
        jSONObject.putOpt("zdata_ver", Spy.getVersion());
        try {
            String str = DeviceConfig.LOG_TAG;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getAndroidId", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (objInvoke == null || !(objInvoke instanceof String)) {
                    obj = "";
                } else {
                    obj = (String) objInvoke;
                }
            } else {
                obj = "";
            }
        } catch (Throwable unused) {
        }
        jSONObject.putOpt("android_id", obj);
        String externalStorageState = Environment.getExternalStorageState();
        jSONObject.putOpt("storage", Long.valueOf("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState) ? Environment.getExternalStorageDirectory().getFreeSpace() : 0L));
        jSONObject.putOpt("os_version", Build.VERSION.RELEASE);
        Object string3 = null;
        if (context == null) {
            rawOffset = 8;
        } else {
            try {
                Configuration configuration = new Configuration();
                configuration.setToDefaults();
                Settings.System.getConfiguration(context.getContentResolver(), configuration);
                locale = configuration.locale;
            } catch (Throwable unused2) {
                locale = null;
            }
            if (locale == null) {
                try {
                    locale = Locale.getDefault();
                    calendar = Calendar.getInstance(locale);
                    if (calendar != null) {
                        rawOffset = calendar.getTimeZone().getRawOffset() / 3600000;
                    } else {
                        rawOffset = 8;
                    }
                } catch (Throwable unused3) {
                }
            } else {
                calendar = Calendar.getInstance(locale);
                if (calendar != null) {
                    rawOffset = calendar.getTimeZone().getRawOffset() / 3600000;
                } else {
                    rawOffset = 8;
                }
            }
        }
        jSONObject.putOpt(ak.M, Integer.valueOf(rawOffset));
        jSONObject.putOpt(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        try {
            String str2 = DeviceConfig.LOG_TAG;
            Method declaredMethod2 = DeviceConfig.class.getDeclaredMethod("getImeiNew", Context.class);
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
                Object objInvoke2 = declaredMethod2.invoke(DeviceConfig.class, context);
                if (objInvoke2 == null || !(objInvoke2 instanceof String)) {
                    obj2 = "";
                } else {
                    obj2 = (String) objInvoke2;
                }
            } else {
                obj2 = "";
            }
        } catch (Throwable unused4) {
        }
        jSONObject.putOpt("imei", obj2);
        try {
            Method declaredMethod3 = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod3.setAccessible(true);
            string = declaredMethod3.invoke(null, "net.hostname").toString();
            if (string != null) {
                try {
                    if (!string.equalsIgnoreCase("")) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
                            messageDigest.update(string.getBytes());
                            byte[] bArrDigest = messageDigest.digest();
                            StringBuffer stringBuffer = new StringBuffer();
                            for (byte b2 : bArrDigest) {
                                stringBuffer.append(Integer.toHexString(b2 & UByte.MAX_VALUE));
                            }
                            string = stringBuffer.toString();
                        } catch (Throwable unused5) {
                            string = "";
                        }
                    }
                } catch (Exception unused6) {
                }
            }
        } catch (Exception unused7) {
            string = null;
        }
        jSONObject.putOpt("hostname", string);
        jSONObject.putOpt("sdk_version", "1.4.0");
        jSONObject.putOpt(ak.f20239o, context == null ? null : context.getPackageName());
        jSONObject.putOpt(ak.u, "Android");
        SharedPreferences sharedPreferencesA2 = com.umeng.umzid.a.a(context);
        jSONObject.putOpt("uuid", sharedPreferencesA2 != null ? sharedPreferencesA2.getString("uuid", "") : "");
        jSONObject.putOpt("source_id", "umeng");
        try {
            obj3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            obj3 = null;
        }
        jSONObject.putOpt("app_version", obj3);
        try {
            string2 = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e2) {
            e2.printStackTrace();
            string2 = null;
        }
        jSONObject.putOpt(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, string2);
        try {
            country = context.getResources().getConfiguration().locale.getCountry();
        } catch (Exception e3) {
            e3.printStackTrace();
            country = null;
        }
        jSONObject.putOpt("country", country);
        if (context != null && (sharedPreferencesA = com.umeng.umzid.a.a(context)) != null) {
            string3 = sharedPreferencesA.getString("appkey", null);
        }
        jSONObject.putOpt("appkey", string3);
        try {
            String str3 = DeviceConfig.LOG_TAG;
            Method declaredMethod4 = DeviceConfig.class.getDeclaredMethod("getIdfa", Context.class);
            if (declaredMethod4 != null) {
                declaredMethod4.setAccessible(true);
                Object objInvoke3 = declaredMethod4.invoke(DeviceConfig.class, context);
                if (objInvoke3 != null && (objInvoke3 instanceof String)) {
                    obj4 = (String) objInvoke3;
                }
            }
        } catch (Throwable unused8) {
        }
        jSONObject.putOpt("gaid", obj4);
        return jSONObject;
    }
}
