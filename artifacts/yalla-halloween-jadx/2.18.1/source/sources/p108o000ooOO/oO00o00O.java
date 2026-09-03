package p108o000ooOO;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.OooO00o;
import o00O0000.OooO0o;
import o00O0000.OooOO0;
import o00O0000.OooOO0O;
import o00O0000.OooOOO;
import p102o000oo.o0OoOo0;
import p107o000ooO0.o00oO0o;
import p326o0O0ooO.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO00o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f30019OooO00o = o0OoOo0.OooO0o0("Alarms");

    public static void OooO00o(@NonNull Context context, @NonNull String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, OooO00o.OooO0O0(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        o0OoOo0.OooO0OO().OooO00o(f30019OooO00o, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void OooO0O0(@NonNull Context context, @NonNull o00oO0o o00oo0o2, @NonNull String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = o00oo0o2.f29976OooO0OO;
        OooOOO oooOOO = (OooOOO) workDatabase.OooOOoo();
        OooOO0O oooOO0OOooO00o = oooOOO.OooO00o(str);
        if (oooOO0OOooO00o != null) {
            OooO00o(context, str, oooOO0OOooO00o.f30127OooO0O0);
            OooO0OO(context, str, oooOO0OOooO00o.f30127OooO0O0, j);
            return;
        }
        synchronized (o00O000o.class) {
            workDatabase.OooO0OO();
            try {
                Long lOooO00o = ((OooOO0) workDatabase.OooOOo()).OooO00o("next_alarm_manager_id");
                int i = 0;
                iIntValue = lOooO00o != null ? lOooO00o.intValue() : 0;
                if (iIntValue != Integer.MAX_VALUE) {
                    i = iIntValue + 1;
                }
                ((OooOO0) workDatabase.OooOOo()).OooO0O0(new OooO0o("next_alarm_manager_id", i));
                workDatabase.OooOOOO();
                workDatabase.OooOO0O();
            } catch (Throwable th) {
                workDatabase.OooOO0O();
                throw th;
            }
        }
        oooOOO.OooO0O0(new OooOO0O(str, iIntValue));
        OooO0OO(context, str, iIntValue, j);
    }

    public static void OooO0OO(@NonNull Context context, @NonNull String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, OooO00o.OooO0O0(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
