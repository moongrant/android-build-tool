package p285o0O0OOoo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import androidx.camera.core.impl.OooOOOO;
import com.app.base.protobuf.OooO0OO;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.o000oOoO;
import com.google.firebase.crashlytics.internal.model.o00Oo0;
import com.google.firebase.crashlytics.internal.model.o00Ooo;
import com.google.firebase.crashlytics.internal.model.o0OoOo0;
import com.google.firebase.crashlytics.internal.model.oo000o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import oo0OOoo.OooO;
import oo0OOoo.OooO00o;
import oo0OOoo.OooO0o;
import p287o0O0Oo0.OooOO0;
import p291o0O0OoO0.o00000O0;
import p291o0O0OoO0.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f42152OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f42153OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f42154OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f42155OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOOO f42156OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f42157OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000Ooo f42158OooO0o0;

    static {
        HashMap map = new HashMap();
        f42152OooO0o = map;
        OooO0OO.OooO0OO(5, map, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        f42153OooO0oO = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.7");
    }

    public o0000oo(Context context, o000O000 o000o001, OooOOOO oooOOOO, OooO00o oooO00o, o00000O0 o00000o1) {
        this.f42154OooO00o = context;
        this.f42155OooO0O0 = o000o001;
        this.f42156OooO0OO = oooOOOO;
        this.f42157OooO0Oo = oooO00o;
        this.f42158OooO0o0 = o00000o1;
    }

    public static o0OoOo0 OooO0OO(OooO oooO, int i) {
        int i2 = 0;
        StackTraceElement[] stackTraceElementArr = oooO.f60898OooO0OO;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        OooO oooO2 = oooO.f60899OooO0Oo;
        if (i >= 8) {
            for (OooO oooO3 = oooO2; oooO3 != null; oooO3 = oooO3.f60899OooO0Oo) {
                i2++;
            }
        }
        String str = oooO.f60897OooO0O0;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        String str2 = oooO.f60896OooO00o;
        OooOO0 oooOO1 = new OooOO0(OooO0Oo(stackTraceElementArr, 4));
        Integer numValueOf = Integer.valueOf(i2);
        o0OoOo0 o0oooo0OooO0OO = (oooO2 == null || i2 != 0) ? null : OooO0OO(oooO2, i + 1);
        String strOooO00o = numValueOf == null ? OooOOOO.OooO00o("", " overflowCount") : "";
        if (strOooO00o.isEmpty()) {
            return new o0OoOo0(str, str2, oooOO1, o0oooo0OooO0OO, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    public static OooOO0 OooO0Oo(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            o00Ooo.OooO00o oooO00o = new o00Ooo.OooO00o();
            oooO00o.f20124OooO0o0 = Integer.valueOf(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            oooO00o.f20120OooO00o = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            oooO00o.f20121OooO0O0 = str;
            oooO00o.f20122OooO0OO = fileName;
            oooO00o.f20123OooO0Oo = Long.valueOf(lineNumber);
            arrayList.add(oooO00o.OooO00o());
        }
        return new OooOO0(arrayList);
    }

    public static o00Oo0 OooO0o0(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        Integer numValueOf = Integer.valueOf(i);
        OooOO0 oooOO1 = new OooOO0(OooO0Oo(stackTraceElementArr, i));
        String strConcat = numValueOf == null ? "".concat(" importance") : "";
        if (strConcat.isEmpty()) {
            return new o00Oo0(name, numValueOf.intValue(), oooOO1);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final OooOO0<CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o> OooO00o() {
        CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o[] abstractC0246OooO00oArr = new CrashlyticsReport.OooO.OooO0o.OooO00o.OooO0O0.AbstractC0246OooO00o[1];
        o000oOoO.OooO00o oooO00o = new o000oOoO.OooO00o();
        oooO00o.f20105OooO00o = 0L;
        oooO00o.f20106OooO0O0 = 0L;
        OooOOOO oooOOOO = this.f42156OooO0OO;
        String str = oooOOOO.f42098OooO0o0;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        oooO00o.f20107OooO0OO = str;
        oooO00o.f20108OooO0Oo = oooOOOO.f42094OooO0O0;
        abstractC0246OooO00oArr[0] = oooO00o.OooO00o();
        return new OooOO0<>(Arrays.asList(abstractC0246OooO00oArr));
    }

    public final oo000o OooO0O0(int i) {
        boolean z;
        Float fValueOf;
        Context context = this.f42154OooO00o;
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
        if (!o000oOoO.OooO() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z2 = true;
        }
        long jOooO0oO = o000oOoO.OooO0oO();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jOooO0oO - memoryInfo.availMem;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        oo000o.OooO00o oooO00o = new oo000o.OooO00o();
        oooO00o.f20146OooO00o = dValueOf;
        oooO00o.f20147OooO0O0 = Integer.valueOf(i2);
        oooO00o.f20148OooO0OO = Boolean.valueOf(z2);
        oooO00o.f20149OooO0Oo = Integer.valueOf(i);
        oooO00o.f20151OooO0o0 = Long.valueOf(j);
        oooO00o.f20150OooO0o = Long.valueOf(blockCount);
        return oooO00o.OooO00o();
    }
}
