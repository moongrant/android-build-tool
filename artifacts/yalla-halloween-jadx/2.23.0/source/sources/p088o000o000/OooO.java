package p088o000o000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.OooO00o;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.o0OOO0o;
import p091o000o0O.OooOo;
import p091o000o0O.Oooo0;
import p091o000o0O.o00O0O;
import p093o000o0OO.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f35220OooO00o = o000oOoO.OooO0o0("Alarms");

    public static void OooO00o(int i, @NonNull Context context, @NonNull String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, OooO00o.OooO00o(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o000oOoO.OooO0OO().OooO00o(f35220OooO00o, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void OooO0O0(@NonNull Context context, @NonNull o0OOO0o o0ooo0o2, @NonNull String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
        o00O0O o00o0o2 = (o00O0O) workDatabase.OooOOo0();
        p091o000o0O.o000oOoO o000ooooOooO00o = o00o0o2.OooO00o(str);
        if (o000ooooOooO00o != null) {
            OooO00o(o000ooooOooO00o.f35250OooO0O0, context, str);
            int i = o000ooooOooO00o.f35250OooO0O0;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, OooO00o.OooO00o(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (o00oO0o.class) {
            workDatabase.OooO0OO();
            try {
                Long lOooO00o = ((Oooo0) workDatabase.OooOOOo()).OooO00o("next_alarm_manager_id");
                iIntValue = lOooO00o != null ? lOooO00o.intValue() : 0;
                ((Oooo0) workDatabase.OooOOOo()).OooO0O0(new OooOo("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.OooOOO0();
                workDatabase.OooOO0();
            } catch (Throwable th) {
                workDatabase.OooOO0();
                throw th;
            }
        }
        p091o000o0O.o000oOoO o000oooo2 = new p091o000o0O.o000oOoO(str, iIntValue);
        RoomDatabase roomDatabase = o00o0o2.f35251OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            o00o0o2.f35252OooO0O0.OooO0o(o000oooo2);
            roomDatabase.OooOOO0();
            roomDatabase.OooOO0();
            AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service2 = PendingIntent.getService(context, iIntValue, OooO00o.OooO00o(context, str), 201326592);
            if (alarmManager2 != null) {
                alarmManager2.setExact(0, j, service2);
            }
        } catch (Throwable th2) {
            roomDatabase.OooOO0();
            throw th2;
        }
    }
}
