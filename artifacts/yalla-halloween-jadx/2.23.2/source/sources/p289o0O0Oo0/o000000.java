package p289o0O0Oo0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import androidx.camera.core.impl.OooOOOO;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.o000oOoO;
import com.google.firebase.crashlytics.internal.model.o00Oo0;
import com.google.firebase.crashlytics.internal.model.o0OoOo0;
import com.google.firebase.crashlytics.internal.model.oo000o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p080o000OoO.o0Oo0oo;
import p291o0O0Oo0o.o00O0O;
import p292o0O0OoO.o00Ooo;
import p292o0O0OoO.o0ooOOo;
import p294o0O0OoOo.o00000;
import p294o0O0OoOo.o00000OO;
import p294o0O0OoOo.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f41494OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f41495OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f41496OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000 f41497OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f41498OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000OO f41499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0ooOOo f41500OooO0o0;

    static {
        HashMap map = new HashMap();
        f41494OooO0o = map;
        o0Oo0oo.OooO0O0(5, map, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        f41495OooO0oO = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.7");
    }

    public o000000(Context context, o0000 o0000Var, OooO0O0 oooO0O0, o00000 o00000Var, o00Ooo o00ooo2) {
        this.f41496OooO00o = context;
        this.f41497OooO0O0 = o0000Var;
        this.f41498OooO0OO = oooO0O0;
        this.f41499OooO0Oo = o00000Var;
        this.f41500OooO0o0 = o00ooo2;
    }

    public static o0OoOo0 OooO0OO(o0000Ooo o0000ooo, int i) {
        int i2 = 0;
        StackTraceElement[] stackTraceElementArr = o0000ooo.f41705OooO0OO;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        o0000Ooo o0000ooo2 = o0000ooo.f41706OooO0Oo;
        if (i >= 8) {
            for (o0000Ooo o0000ooo3 = o0000ooo2; o0000ooo3 != null; o0000ooo3 = o0000ooo3.f41706OooO0Oo) {
                i2++;
            }
        }
        String str = o0000ooo.f41704OooO0O0;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        String str2 = o0000ooo.f41703OooO00o;
        o00O0O o00o0o2 = new o00O0O(OooO0Oo(stackTraceElementArr, 4));
        Integer numValueOf = Integer.valueOf(i2);
        o0OoOo0 o0oooo0OooO0OO = (o0000ooo2 == null || i2 != 0) ? null : OooO0OO(o0000ooo2, i + 1);
        String strOooO00o = numValueOf == null ? OooOOOO.OooO00o("", " overflowCount") : "";
        if (strOooO00o.isEmpty()) {
            return new o0OoOo0(str, str2, o00o0o2, o0oooo0OooO0OO, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    public static o00O0O OooO0Oo(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            com.google.firebase.crashlytics.internal.model.o00Ooo.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.o00Ooo.OooO00o();
            oooO00o.f19652OooO0o0 = Integer.valueOf(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            oooO00o.f19648OooO00o = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            oooO00o.f19649OooO0O0 = str;
            oooO00o.f19650OooO0OO = fileName;
            oooO00o.f19651OooO0Oo = Long.valueOf(lineNumber);
            arrayList.add(oooO00o.OooO00o());
        }
        return new o00O0O(arrayList);
    }

    public static o00Oo0 OooO0o0(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        Integer numValueOf = Integer.valueOf(i);
        o00O0O o00o0o2 = new o00O0O(OooO0Oo(stackTraceElementArr, i));
        String strConcat = numValueOf == null ? "".concat(" importance") : "";
        if (strConcat.isEmpty()) {
            return new o00Oo0(name, numValueOf.intValue(), o00o0o2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final o00O0O<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o> OooO00o() {
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o[] abstractC0245OooO00oArr = new CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0245OooO00o[1];
        o000oOoO.OooO00o oooO00o = new o000oOoO.OooO00o();
        oooO00o.f19633OooO00o = 0L;
        oooO00o.f19634OooO0O0 = 0L;
        OooO0O0 oooO0O0 = this.f41498OooO0OO;
        String str = oooO0O0.f41460OooO0o0;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        oooO00o.f19635OooO0OO = str;
        oooO00o.f19636OooO0Oo = oooO0O0.f41456OooO0O0;
        abstractC0245OooO00oArr[0] = oooO00o.OooO00o();
        return new o00O0O<>(Arrays.asList(abstractC0245OooO00oArr));
    }

    public final oo000o OooO0O0(int i) {
        boolean z;
        Float fValueOf;
        Context context = this.f41496OooO00o;
        int i2 = 2;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
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
        if (!OooOO0O.OooO() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z2 = true;
        }
        long jOooO0oO = OooOO0O.OooO0oO();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jOooO0oO - memoryInfo.availMem;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        oo000o.OooO00o oooO00o = new oo000o.OooO00o();
        oooO00o.f19674OooO00o = dValueOf;
        oooO00o.f19675OooO0O0 = Integer.valueOf(i2);
        oooO00o.f19676OooO0OO = Boolean.valueOf(z2);
        oooO00o.f19677OooO0Oo = Integer.valueOf(i);
        oooO00o.f19679OooO0o0 = Long.valueOf(j);
        oooO00o.f19678OooO0o = Long.valueOf(blockCount);
        return oooO00o.OooO00o();
    }
}
