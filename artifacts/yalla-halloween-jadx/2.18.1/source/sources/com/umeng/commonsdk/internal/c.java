package com.umeng.commonsdk.internal;

import OooO00o.OooO00o;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.aa;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.an;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.SelfChecker;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.stateless.d;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.commonsdk.vchannel.Sender;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public class c implements UMLogDataProtocol {
    private static int b = 1;
    private static final String c = "info";
    private static final String d = "stat";
    private static Class<?> e = null;
    private static Method f = null;
    private static Method g = null;
    private static Method h = null;
    private static boolean i = false;
    private Context a;

    static {
        c();
    }

    public c(Context context) {
        if (context != null) {
            this.a = context.getApplicationContext();
        }
    }

    public static String b() {
        Method method;
        Class<?> cls = e;
        if (cls == null || (method = f) == null || h == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) h.invoke(objInvoke, new Object[0]) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void c() {
        try {
            e = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f = declaredMethod;
            }
            Method declaredMethod2 = e.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                g = declaredMethod2;
            }
            Method declaredMethod3 = e.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                h = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        am amVarA = am.a(this.a);
        an anVarA = amVarA.a(ao.c);
        if (anVarA != null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = anVarA.a;
                String str2 = anVarA.b;
                JSONObject jSONObjectA = new com.umeng.commonsdk.statistics.b().a(this.a.getApplicationContext(), new JSONObject(anVarA.c), new JSONObject(anVarA.d), anVarA.e, str2, anVarA.f);
                if (jSONObjectA == null || !jSONObjectA.has("exception")) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                amVarA.a(ao.c, str);
                amVarA.b();
            } catch (Throwable unused) {
            }
        }
    }

    private void e() {
        if (i) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.G)) {
                return;
            }
            i = false;
        } else {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G) || Build.VERSION.SDK_INT <= 28) {
                return;
            }
            i = true;
            a(this.a, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                    if (TextUtils.isEmpty(str)) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = c.this.a.getSharedPreferences(h.a, 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(h.b, str);
                            editorEdit.commit();
                        }
                    } catch (Throwable unused) {
                    }
                    UMWorkDispatch.sendEvent(c.this.a, a.w, b.a(c.this.a).a(), null);
                }
            });
        }
    }

    private void f() {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        i = true;
        UMConfigureImpl.registerInterruptFlag();
        UMConfigureImpl.init(this.a);
        b++;
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
        UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
            @Override // com.umeng.commonsdk.utils.onMessageSendListener
            public void onMessageSend() {
                if (c.this.a != null) {
                    UMWorkDispatch.sendEvent(c.this.a, a.x, b.a(c.this.a).a(), null);
                }
                UMConfigureImpl.removeMessageSendListener(this);
            }
        });
        b(this.a);
    }

    private void g() {
        if (b <= 0) {
            h();
            d(this.a);
        }
    }

    private void h() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.a)) {
            e(this.a);
            com.umeng.commonsdk.a.a(this.a);
            Context context = this.a;
            UMWorkDispatch.sendEvent(context, o.a.x, CoreProtocol.getInstance(context), null);
            Context context2 = this.a;
            UMWorkDispatch.sendEvent(context2, a.t, b.a(context2).a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i2) throws JSONException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        boolean z = true;
        boolean z2 = false;
        ULog.i("walle", "[internal] workEvent");
        try {
            switch (i2) {
                case a.f /* 32769 */:
                    ULog.i("walle", "[internal] workEvent send envelope");
                    Class<?> cls = Class.forName("com.umeng.commonsdk.internal.UMInternalManagerAgent");
                    cls.getMethod("sendInternalEnvelopeByStateful2", Context.class).invoke(cls, this.a);
                    break;
                case a.h /* 32771 */:
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("[internal] workEvent cache battery, event is ");
                    sbOooO0o0.append(obj.toString());
                    ULog.i("walle", sbOooO0o0.toString());
                    Class<?> cls2 = Class.forName("com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent");
                    cls2.getMethod("saveBattery", Context.class, String.class).invoke(cls2, this.a, (String) obj);
                    break;
                case a.k /* 32774 */:
                    Class<?> cls3 = Class.forName("com.umeng.commonsdk.internal.utils.ApplicationLayerUtilAgent");
                    cls3.getMethod("wifiChange", Context.class).invoke(cls3, this.a);
                    break;
                case a.l /* 32775 */:
                    Class<?> cls4 = Class.forName("com.umeng.commonsdk.internal.utils.InfoPreferenceAgent");
                    cls4.getMethod("saveUA", Context.class, String.class).invoke(cls4, this.a, (String) obj);
                    break;
                case a.m /* 32776 */:
                    SharedPreferences sharedPreferences = this.a.getApplicationContext().getSharedPreferences(c, 0);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString(d, (String) obj).commit();
                    }
                    break;
                case a.n /* 32777 */:
                    ULog.i("walle", "[internal] workEvent send envelope");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ak.aM, a.e);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ak.au, new JSONObject());
                    JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.a, jSONObject, jSONObject2);
                    if (jSONObjectBuildEnvelopeWithExtHeader != null && !jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                        ULog.i("walle", "[internal] workEvent send envelope back, result is ok");
                        break;
                    }
                    break;
                case a.f20252o /* 32779 */:
                    Sender.handleEvent(this.a, (com.umeng.commonsdk.vchannel.b) obj);
                    break;
                case a.p /* 32781 */:
                    if (!UMFrUtils.hasEnvelopeFile(this.a, UMLogDataProtocol.UMBusinessType.U_ZeroEnv)) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文");
                        a(this.a);
                    } else {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 零号报文信封文件已存在，尝试发送之!");
                    }
                    break;
                case a.s /* 32784 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 零号报文流程，接收到云控配置加载成功通知(成功收到零号报文应答)。");
                    f();
                    b--;
                    g();
                    break;
                case a.t /* 32785 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]接收到消费二级缓存数据通知.");
                    if (!am.a(this.a).c()) {
                        d();
                        if (!UMWorkDispatch.eventHasExist(a.t)) {
                            Context context = this.a;
                            UMWorkDispatch.sendEvent(context, a.t, b.a(context).a(), null);
                        }
                    } else {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]已消费完毕,二级缓存数据库为空.");
                    }
                    break;
                case a.u /* 32786 */:
                    UMCrashManager.buildEnvelope(this.a, obj);
                    break;
                case a.v /* 32787 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查动作。");
                    String strA = d.a(this.a, false);
                    String strA2 = d.a(this.a, true);
                    if (!TextUtils.isEmpty(strA)) {
                        File file = new File(strA);
                        if (file.exists() && file.isDirectory()) {
                            z2 = true;
                        }
                    }
                    if (TextUtils.isEmpty(strA2)) {
                        z = z2;
                    } else {
                        File file2 = new File(strA2);
                        if (!file2.exists() || !file2.isDirectory()) {
                            z = z2;
                        }
                    }
                    if (!z) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查，没有需要处理的目录，不需要处理。");
                    } else if (!com.umeng.commonsdk.stateless.b.a()) {
                        new com.umeng.commonsdk.stateless.b(this.a);
                        com.umeng.commonsdk.stateless.b.b();
                    } else {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查，Sender已创建，不需要处理。");
                    }
                    break;
                case a.w /* 32788 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新，触发 伪冷启动。");
                    com.umeng.commonsdk.statistics.b.a();
                    e();
                    if (FieldManager.allow(com.umeng.commonsdk.utils.b.E) && !UMWorkDispatch.eventHasExist()) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新 前台计数器功能 打开，触发 5秒周期检查机制");
                        Context context2 = this.a;
                        UMWorkDispatch.sendEventEx(context2, o.a.C, CoreProtocol.getInstance(context2), null, 5000L);
                    }
                    if (FieldManager.allow(com.umeng.commonsdk.utils.b.F)) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新 FirstResume功能 打开，触发 trigger");
                        l.a(this.a).b(this.a);
                    }
                    break;
                case a.x /* 32790 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 成功接收到(OAID)读取结束通知。");
                    b--;
                    g();
                    break;
                case a.y /* 32791 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 正常冷启动流程，接收到云控配置加载成功通知。");
                    c(this.a);
                    com.umeng.commonsdk.a.a(this.a);
                    d(this.a);
                    break;
                case a.z /* 32801 */:
                    SelfChecker.doCheck(this.a);
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    public String a() {
        Method method;
        Class<?> cls = e;
        if (cls == null || (method = f) == null || g == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) g.invoke(objInvoke, this.a) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void b(final Context context) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = aa.a(context);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(strA) && sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(h.c, (jCurrentTimeMillis2 - jCurrentTimeMillis) + "");
                        editorEdit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString(h.b, strA);
                        editorEdit2.commit();
                    }
                    if (Build.VERSION.SDK_INT > 28) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put("app_version", UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(ak.x, "Android");
            JSONObject jSONObjectBuildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (jSONObjectBuildZeroEnvelopeWithExtHeader != null && jSONObjectBuildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    private static void c(final Context context) {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
            @Override // com.umeng.commonsdk.listener.OnGetOaidListener
            public void onGetOaid(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                    if (sharedPreferences == null || sharedPreferences.getString(h.b, "").equalsIgnoreCase(str)) {
                        return;
                    }
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(h.b, str);
                    editorEdit.commit();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private static void e(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        File file = new File(OooO.OooO00o(sb, File.separator, ao.l));
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    private static void a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String strA = aa.a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(strA);
                }
            }
        }).start();
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private void d(Context context) {
        Object objInvoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> clsA = a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = clsA.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod2 == null || (objInvoke = declaredMethod2.invoke(clsA, new Object[0])) == null || (declaredMethod = clsA.getDeclaredMethod("init", Context.class, String.class, a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(objInvoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }
}
