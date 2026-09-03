package com.appsflyer;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.internal.ag;
import com.appsflyer.internal.ak;
import com.appsflyer.internal.bc;

/* JADX INFO: loaded from: classes2.dex */
public final class AFLogger {
    private static final long AFKeystoreWrapper = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int AFInAppEventType;

        LogLevel(int i) {
            this.AFInAppEventType = i;
        }

        public final int getLevel() {
            return this.AFInAppEventType;
        }
    }

    public static void AFInAppEventParameterName(String str, boolean z) {
        if (AFKeystoreWrapper(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (z) {
            if (ak.AFInAppEventType == null) {
                ak.AFInAppEventType = new ak();
            }
            ak.AFInAppEventType.valueOf(null, "I", AFKeystoreWrapper(str, true));
        }
    }

    public static void AFInAppEventType(String str) {
        AFInAppEventParameterName(str, true);
    }

    @NonNull
    private static String AFKeystoreWrapper(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFKeystoreWrapper);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void AppsFlyer2dXConversionCallback(String str) {
        AFInAppEventParameterName(str);
    }

    private static void valueOf(String str, Throwable th, boolean z, boolean z2) {
        if (AFKeystoreWrapper(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            String strAFKeystoreWrapper = AFKeystoreWrapper(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.4.3", strAFKeystoreWrapper, th);
            } else if (z) {
                Log.d("AppsFlyer_6.4.3", strAFKeystoreWrapper);
            }
        }
        if (ak.AFInAppEventType == null) {
            ak.AFInAppEventType = new ak();
        }
        ak akVar = ak.AFInAppEventType;
        Throwable cause = th.getCause();
        akVar.valueOf("exception", th.getClass().getSimpleName(), ak.AFKeystoreWrapper(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
        Application application = bc.AFKeystoreWrapper;
        if (application != null) {
            SharedPreferences.Editor editorEdit = ag.AFInAppEventParameterName(application).edit();
            Application application2 = bc.AFKeystoreWrapper;
            editorEdit.putLong("exception_number", (application2 == null ? -1L : ag.AFInAppEventParameterName(application2).getLong("exception_number", 0L)) + 1).apply();
        }
    }

    public static void values(String str) {
        if (!AFInAppEventParameterName()) {
            Log.d("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (ak.AFInAppEventType == null) {
            ak.AFInAppEventType = new ak();
        }
        ak.AFInAppEventType.valueOf(null, "F", str);
    }

    public static void AFInAppEventType(String str, Throwable th) {
        valueOf(str, th, true, true);
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (ak.AFInAppEventType == null) {
            ak.AFInAppEventType = new ak();
        }
        ak.AFInAppEventType.valueOf(null, "V", AFKeystoreWrapper(str, true));
    }

    public static void values(Throwable th) {
        valueOf(null, th, false, false);
    }

    public static void AFInAppEventParameterName(String str) {
        if (AFKeystoreWrapper(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (ak.AFInAppEventType == null) {
            ak.AFInAppEventType = new ak();
        }
        ak.AFInAppEventType.valueOf(null, "W", AFKeystoreWrapper(str, true));
    }

    private static boolean AFKeystoreWrapper(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFKeystoreWrapper(String str, Throwable th) {
        valueOf(str, th, true, false);
    }

    private static boolean AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void valueOf(String str) {
        if (AFKeystoreWrapper(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.4.3", AFKeystoreWrapper(str, false));
        }
        if (ak.AFInAppEventType == null) {
            ak.AFInAppEventType = new ak();
        }
        ak.AFInAppEventType.valueOf(null, "D", AFKeystoreWrapper(str, true));
    }
}
