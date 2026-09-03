package o00O0O00;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooOOO;
import o00O0OO.OooOOOO;
import o00O0OO.OooOo;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f36174OooO00o = o0Oo0oo.OooO0o("Alarms");

    /* JADX INFO: renamed from: o00O0O00.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(19)
    public static class C0415OooO00o {
        @DoNotInline
        public static void OooO00o(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    public static void OooO00o(@NonNull Context context, @NonNull OooOo oooOo, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = androidx.work.impl.background.systemalarm.OooO00o.f11508OooO0oo;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.OooO00o.OooO0o0(intent, oooOo);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o0Oo0oo.OooO0Oo().OooO00o(f36174OooO00o, "Cancelling existing alarm with (workSpecId, systemId) (" + oooOo + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void OooO0O0(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull OooOo generationalId, long j) {
        OooOOOO oooOOOOOooOOo = workDatabase.OooOOo();
        OooOOO oooOOOOooO0OO = oooOOOOOooOOo.OooO0OO(generationalId);
        if (oooOOOOooO0OO != null) {
            int i = oooOOOOooO0OO.f36201OooO0OO;
            OooO00o(context, generationalId, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = androidx.work.impl.background.systemalarm.OooO00o.f11508OooO0oo;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            androidx.work.impl.background.systemalarm.OooO00o.OooO0o0(intent, generationalId);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                C0415OooO00o.OooO00o(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        final o00O0OOO.OooOo oooOo = new o00O0OOO.OooOo(workDatabase);
        Object objOooOOO0 = oooOo.f36283OooO00o.OooOOO0(new Callable() { // from class: o00O0OOO.OooOOOO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                OooOo this$0 = oooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return Integer.valueOf(Oooo000.OooO0O0(this$0.f36283OooO00o, "next_alarm_manager_id"));
            }
        });
        Intrinsics.checkNotNullExpressionValue(objOooOOO0, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objOooOOO0).intValue();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        oooOOOOOooOOo.OooO0o0(new OooOOO(generationalId.f36202OooO00o, generationalId.f36203OooO0O0, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = androidx.work.impl.background.systemalarm.OooO00o.f11508OooO0oo;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.OooO00o.OooO0o0(intent2, generationalId);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            C0415OooO00o.OooO00o(alarmManager2, 0, j, service2);
        }
    }
}
