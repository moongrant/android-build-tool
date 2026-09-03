package p690oO000o;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.appevents.AppEventsConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static volatile OooO0o f52691OooO = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Context f52692OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f52693OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static OooO f52694OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static Object f52695OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static OooO0OO f52696OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static HandlerThread f52697OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static String f52698OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static String f52699OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static volatile OooO0O0 f52700OooOO0;

    public static OooO0o OooO00o(Context context) {
        if (f52691OooO == null) {
            synchronized (OooO0o.class) {
                f52692OooO00o = context.getApplicationContext();
                f52691OooO = new OooO0o();
            }
        }
        if (f52700OooOO0 == null) {
            synchronized (OooO0o.class) {
                f52692OooO00o = context.getApplicationContext();
                HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
                f52697OooO0o0 = handlerThread;
                handlerThread.start();
                f52696OooO0o = new OooO0OO(f52697OooO0o0.getLooper());
                f52700OooOO0 = new OooO0O0(f52692OooO00o);
                OooO0OO();
            }
        }
        return f52691OooO;
    }

    public static void OooO0OO() {
        String str;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "persist.sys.identifierid.supported", "unknown");
            } catch (Exception e) {
                e.printStackTrace();
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                f52693OooO0O0 = "1".equals(str);
            }
        } catch (Throwable unused) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        f52693OooO0O0 = "1".equals(str);
    }

    public final void OooO0O0(int i, String str) {
        Object obj = f52695OooO0Oo;
        synchronized (obj) {
            Message messageObtainMessage = f52696OooO0o.obtainMessage();
            messageObtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            if (i == 1 || i == 2) {
                bundle.putString(AppsFlyerProperties.APP_ID, str);
            }
            messageObtainMessage.setData(bundle);
            f52696OooO0o.sendMessage(messageObtainMessage);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= 2000) {
                Log.d("VMS_IDLG_SDK_Client", "query timeout");
            } else if (i == 0) {
                f52699OooO0oo = f52698OooO0oO;
                f52698OooO0oO = null;
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                    }
                } else if (f52698OooO0oO != null) {
                    f52698OooO0oO = null;
                } else {
                    Log.e("VMS_IDLG_SDK_Client", "get aaid failed");
                }
                f52698OooO0oO = null;
            } else if (f52698OooO0oO != null) {
                f52698OooO0oO = null;
            } else {
                Log.e("VMS_IDLG_SDK_Client", "get vaid failed");
            }
        }
    }
}
