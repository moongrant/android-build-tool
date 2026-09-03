package p361o0OOOoOo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.Oooo0;
import com.google.firebase.crashlytics.internal.model.o000oOoO;
import com.google.firebase.crashlytics.internal.model.o00Oo0;
import com.google.firebase.crashlytics.internal.model.o00Ooo;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p299o0O0Ooo0.o00000O0;
import p362o0OOOoo.o00oO0o;
import p367o0OOo00o.o00O0O;
import p367o0OOo00o.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f38439OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Map<String, Integer> f38440OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO f38442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOOO f38443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OoOo0 f38444OooO0Oo;

    static {
        HashMap map = new HashMap();
        f38440OooO0o0 = map;
        o00000O0.OooO00o(5, map, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        f38439OooO0o = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.13");
    }

    public o00000OO(Context context, o000OO o000oo2, OooOOOO oooOOOO, o0OoOo0 o0oooo1) {
        this.f38441OooO00o = context;
        this.f38442OooO0O0 = o000oo2;
        this.f38443OooO0OO = oooOOOO;
        this.f38444OooO0Oo = o0oooo1;
    }

    public final o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0138OooO00o> OooO00o() {
        Oooo0.OooO00o oooO00o = new Oooo0.OooO00o();
        oooO00o.f19024OooO00o = 0L;
        oooO00o.f19025OooO0O0 = 0L;
        String str = this.f38443OooO0OO.f38399OooO0Oo;
        Objects.requireNonNull(str, "Null name");
        oooO00o.f19026OooO0OO = str;
        oooO00o.f19027OooO0Oo = this.f38443OooO0OO.f38397OooO0O0;
        return new o00oO0o<>(Arrays.asList(oooO00o.OooO00o()));
    }

    public final CrashlyticsReport.OooO.OooO0o.OooO0OO OooO0O0(int i) {
        boolean z;
        Float fValueOf;
        int i2 = 2;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = this.f38441OooO00o.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
            } else {
                fValueOf = null;
                z = false;
            }
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z || fValueOf == null) {
            i2 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i2 = 3;
        }
        Context context = this.f38441OooO00o;
        if (!Oooo0.OooOO0() && ((SensorManager) context.getSystemService(ak.ac)).getDefaultSensor(8) != null) {
            z2 = true;
        }
        long jOooO0oo = Oooo0.OooO0oo();
        Context context2 = this.f38441OooO00o;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jOooO0oo - memoryInfo.availMem;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        o00Ooo.OooO00o oooO00o = new o00Ooo.OooO00o();
        oooO00o.f19065OooO00o = dValueOf;
        oooO00o.f19066OooO0O0 = Integer.valueOf(i2);
        oooO00o.f19067OooO0OO = Boolean.valueOf(z2);
        oooO00o.f19068OooO0Oo = Integer.valueOf(i);
        oooO00o.f19070OooO0o0 = Long.valueOf(j);
        oooO00o.f19069OooO0o = Long.valueOf(blockCount);
        return oooO00o.OooO00o();
    }

    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0140OooO0O0 OooO0OO(o00O0O o00o0o2, int i) {
        String str = o00o0o2.f38658OooO0O0;
        String str2 = o00o0o2.f38657OooO00o;
        StackTraceElement[] stackTraceElementArr = o00o0o2.f38659OooO0OO;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        o00O0O o00o0o3 = o00o0o2.f38660OooO0Oo;
        if (i >= 8) {
            o00O0O o00o0o4 = o00o0o3;
            while (o00o0o4 != null) {
                o00o0o4 = o00o0o4.f38660OooO0Oo;
                i2++;
            }
        }
        o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
        Objects.requireNonNull(str, "Null type");
        oooO0O0.f19038OooO00o = str;
        oooO0O0.f19039OooO0O0 = str2;
        oooO0O0.f19040OooO0OO = new o00oO0o<>(OooO0Oo(stackTraceElementArr, 4));
        oooO0O0.f19042OooO0o0 = Integer.valueOf(i2);
        if (o00o0o3 != null && i2 == 0) {
            oooO0O0.f19041OooO0Oo = OooO0OO(o00o0o3, i + 1);
        }
        return oooO0O0.OooO00o();
    }

    public final o00oO0o<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o.AbstractC0145OooO0O0> OooO0Oo(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            o00Oo0.OooO00o oooO00o = new o00Oo0.OooO00o();
            oooO00o.f19058OooO0o0 = Integer.valueOf(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            oooO00o.f19054OooO00o = Long.valueOf(jMax);
            Objects.requireNonNull(str, "Null symbol");
            oooO00o.f19055OooO0O0 = str;
            oooO00o.f19056OooO0OO = fileName;
            oooO00o.f19057OooO0Oo = Long.valueOf(lineNumber);
            arrayList.add(oooO00o.OooO00o());
        }
        return new o00oO0o<>(arrayList);
    }

    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0143OooO0o OooO0o(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        com.google.firebase.crashlytics.internal.model.o00O0O.OooO0O0 oooO0O0 = new com.google.firebase.crashlytics.internal.model.o00O0O.OooO0O0();
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        oooO0O0.f19046OooO00o = name;
        oooO0O0.f19047OooO0O0 = Integer.valueOf(i);
        oooO0O0.f19048OooO0OO = new o00oO0o<>(OooO0Oo(stackTraceElementArr, i));
        return oooO0O0.OooO00o();
    }

    public final CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.OooO0OO OooO0o0() {
        com.google.firebase.crashlytics.internal.model.o0OoOo0.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.o0OoOo0.OooO00o();
        oooO00o.f19082OooO00o = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        oooO00o.f19083OooO0O0 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        oooO00o.f19084OooO0OO = 0L;
        return oooO00o.OooO00o();
    }
}
