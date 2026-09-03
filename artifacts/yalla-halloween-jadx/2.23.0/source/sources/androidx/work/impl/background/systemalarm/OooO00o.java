package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.NetworkType;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p084o000Ooo0.OooO;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.OooOOOO;
import p085o000OooO.o0OOO0o;
import p089o000o00O.oo00o;
import p091o000o0O.o00O0O;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o implements OooOOOO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f8426OooO0oO = o000oOoO.OooO0o0("CommandHandler");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f8427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f8429OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f8428OooO0o = new Object();

    public OooO00o(@NonNull Context context) {
        this.f8427OooO0Oo = context;
    }

    public static Intent OooO00o(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent OooO0O0(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final boolean OooO0OO() {
        boolean z;
        synchronized (this.f8428OooO0o) {
            z = !this.f8429OooO0o0.isEmpty();
        }
        return z;
    }

    @WorkerThread
    public final void OooO0Oo(int i, @NonNull Intent intent, @NonNull OooO0o oooO0o) throws Throwable {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o000oOoO.OooO0OO().OooO00o(f8426OooO0oO, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            OooO0O0 oooO0O0 = new OooO0O0(this.f8427OooO0Oo, i, oooO0o);
            ArrayList<o0Oo0oo> arrayListOooO0o0 = ((oo0o0Oo) oooO0o.f8450OooO0oo.f35160OooO0OO.OooOo00()).OooO0o0();
            String str = ConstraintProxy.f8421OooO00o;
            Iterator it = arrayListOooO0o0.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                OooO oooO = ((o0Oo0oo) it.next()).f35270OooOO0;
                z |= oooO.f35086OooO0Oo;
                z2 |= oooO.f35084OooO0O0;
                z3 |= oooO.f35088OooO0o0;
                z4 |= oooO.f35083OooO00o != NetworkType.NOT_REQUIRED;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f8422OooO00o;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = oooO0O0.f8431OooO00o;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            oo00o oo00oVar = oooO0O0.f8433OooO0OO;
            oo00oVar.OooO0OO(arrayListOooO0o0);
            ArrayList arrayList = new ArrayList(arrayListOooO0o0.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (o0Oo0oo o0oo0oo2 : arrayListOooO0o0) {
                String str3 = o0oo0oo2.f35262OooO00o;
                if (jCurrentTimeMillis >= o0oo0oo2.OooO00o() && (!o0oo0oo2.OooO0O0() || oo00oVar.OooO00o(str3))) {
                    arrayList.add(o0oo0oo2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((o0Oo0oo) it2.next()).f35262OooO00o;
                Intent intentOooO00o = OooO00o(context, str4);
                o000oOoO.OooO0OO().OooO00o(OooO0O0.f8430OooO0Oo, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                oooO0o.OooO0o(new OooO0o.OooO0O0(oooO0O0.f8432OooO0O0, intentOooO00o, oooO0o));
            }
            oo00oVar.OooO0Oo();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o000oOoO.OooO0OO().OooO00o(f8426OooO0oO, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            oooO0o.f8450OooO0oo.OooO0o();
            return;
        }
        Bundle extras = intent.getExtras();
        if (!((extras == null || extras.isEmpty() || extras.get(new String[]{"KEY_WORKSPEC_ID"}[0]) == null) ? false : true)) {
            o000oOoO.OooO0OO().OooO0O0(f8426OooO0oO, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            String str5 = f8426OooO0oO;
            o000oOoO.OooO0OO().OooO00o(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = oooO0o.f8450OooO0oo.f35160OooO0OO;
            workDatabase.OooO0OO();
            try {
                o0Oo0oo o0oo0ooOooO0oo = ((oo0o0Oo) workDatabase.OooOo00()).OooO0oo(string);
                if (o0oo0ooOooO0oo == null) {
                    o000oOoO.OooO0OO().OooO0o(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (o0oo0ooOooO0oo.f35263OooO0O0.OooO00o()) {
                    o000oOoO.OooO0OO().OooO0o(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long jOooO00o = o0oo0ooOooO0oo.OooO00o();
                    boolean zOooO0O0 = o0oo0ooOooO0oo.OooO0O0();
                    Context context2 = this.f8427OooO0Oo;
                    o0OOO0o o0ooo0o2 = oooO0o.f8450OooO0oo;
                    if (zOooO0O0) {
                        o000oOoO.OooO0OO().OooO00o(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jOooO00o)), new Throwable[0]);
                        p088o000o000.OooO.OooO0O0(context2, o0ooo0o2, string, jOooO00o);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        oooO0o.OooO0o(new OooO0o.OooO0O0(i, intent3, oooO0o));
                    } else {
                        o000oOoO.OooO0OO().OooO00o(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jOooO00o)), new Throwable[0]);
                        p088o000o000.OooO.OooO0O0(context2, o0ooo0o2, string, jOooO00o);
                    }
                    workDatabase.OooOOO0();
                }
                return;
            } finally {
                workDatabase.OooOO0();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f8428OooO0o) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
                String str6 = f8426OooO0oO;
                o000ooooOooO0OO.OooO00o(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                if (this.f8429OooO0o0.containsKey(string2)) {
                    o000oOoO.OooO0OO().OooO00o(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                } else {
                    OooO0OO oooO0OO = new OooO0OO(this.f8427OooO0Oo, i, string2, oooO0o);
                    this.f8429OooO0o0.put(string2, oooO0OO);
                    oooO0OO.OooO0Oo();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                o000oOoO.OooO0OO().OooO0o(f8426OooO0oO, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z5 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            o000oOoO.OooO0OO().OooO00o(f8426OooO0oO, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            OooO0o0(string3, z5);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        o000oOoO.OooO0OO().OooO00o(f8426OooO0oO, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        oooO0o.f8450OooO0oo.OooO0oo(string4);
        String str7 = p088o000o000.OooO.f35220OooO00o;
        o00O0O o00o0o2 = (o00O0O) oooO0o.f8450OooO0oo.f35160OooO0OO.OooOOo0();
        p091o000o0O.o000oOoO o000ooooOooO00o = o00o0o2.OooO00o(string4);
        if (o000ooooOooO00o != null) {
            p088o000o000.OooO.OooO00o(o000ooooOooO00o.f35250OooO0O0, this.f8427OooO0Oo, string4);
            o000oOoO.OooO0OO().OooO00o(p088o000o000.OooO.f35220OooO00o, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            o00o0o2.OooO0O0(string4);
        }
        oooO0o.OooO0o0(string4, false);
    }

    @Override // p085o000OooO.OooOOOO
    public final void OooO0o0(@NonNull String str, boolean z) {
        synchronized (this.f8428OooO0o) {
            OooOOOO oooOOOO = (OooOOOO) this.f8429OooO0o0.remove(str);
            if (oooOOOO != null) {
                oooOOOO.OooO0o0(str, z);
            }
        }
    }
}
