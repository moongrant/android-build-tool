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
import java.util.List;
import java.util.Map;
import o00O0000.OooOOO;
import o00O0000.o00Oo0;
import p102o000oo.OooOO0O;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.o00oO0o;
import p108o000ooOO.oO00o00O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o implements OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final String f9781Oooo = o0OoOo0.OooO0o0("CommandHandler");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f9782Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Map<String, OooOOOO> f9783Oooo0oO = new HashMap();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Object f9784Oooo0oo = new Object();

    public OooO00o(@NonNull Context context) {
        this.f9782Oooo0o = context;
    }

    public static Intent OooO00o(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent OooO0O0(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent OooO0OO(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.OooOOOO>] */
    @Override // p107o000ooO0.OooOOOO
    public final void OooO0Oo(@NonNull String str, boolean z) {
        synchronized (this.f9784Oooo0oo) {
            OooOOOO oooOOOO = (OooOOOO) this.f9783Oooo0oO.remove(str);
            if (oooOOOO != null) {
                oooOOOO.OooO0Oo(str, z);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @WorkerThread
    public final void OooO0o0(@NonNull Intent intent, int i, @NonNull OooO0o oooO0o) throws Throwable {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o0OoOo0.OooO0OO().OooO00o(f9781Oooo, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f9782Oooo0o;
            OooO0O0 oooO0O0 = new OooO0O0(context, i, oooO0o);
            List<o00O0000.o0OoOo0> listOooO0o0 = ((o00Oo0) oooO0o.f9807OoooO00.f29976OooO0OO.OooOo0O()).OooO0o0();
            String str = ConstraintProxy.f9776OooO00o;
            ArrayList<o00O0000.o0OoOo0> arrayList = (ArrayList) listOooO0o0;
            Iterator it = arrayList.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                OooOO0O oooOO0O = ((o00O0000.o0OoOo0) it.next()).f30160OooOO0;
                z2 |= oooOO0O.f29792OooO0Oo;
                z3 |= oooOO0O.f29790OooO0O0;
                z4 |= oooOO0O.f29794OooO0o0;
                z5 |= oooOO0O.f29789OooO00o != NetworkType.NOT_REQUIRED;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f9777OooO00o;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            oooO0O0.f9789OooO0Oo.OooO0O0(listOooO0o0);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (o00O0000.o0OoOo0 o0oooo1 : arrayList) {
                String str3 = o0oooo1.f30152OooO00o;
                if (jCurrentTimeMillis >= o0oooo1.OooO00o() && (!o0oooo1.OooO0O0() || oooO0O0.f9789OooO0Oo.OooO00o(str3))) {
                    arrayList2.add(o0oooo1);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str4 = ((o00O0000.o0OoOo0) it2.next()).f30152OooO00o;
                Intent intentOooO0O0 = OooO0O0(oooO0O0.f9786OooO00o, str4);
                o0OoOo0.OooO0OO().OooO00o(OooO0O0.f9785OooO0o0, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                OooO0o oooO0o2 = oooO0O0.f9788OooO0OO;
                oooO0o2.OooO0o0(new OooO0o.OooO0O0(oooO0o2, intentOooO0O0, oooO0O0.f9787OooO0O0));
            }
            oooO0O0.f9789OooO0Oo.OooO0OO();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o0OoOo0.OooO0OO().OooO00o(f9781Oooo, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            oooO0o.f9807OoooO00.OooO0o0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty()) {
            z = false;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 1) {
                z = true;
                break;
            } else {
                if (extras.get(strArr[i2]) == null) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            o0OoOo0.OooO0OO().OooO0O0(f9781Oooo, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
            String str5 = f9781Oooo;
            o0oooo0OooO0OO.OooO00o(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = oooO0o.f9807OoooO00.f29976OooO0OO;
            workDatabase.OooO0OO();
            try {
                o00O0000.o0OoOo0 o0oooo0OooO0oo = ((o00Oo0) workDatabase.OooOo0O()).OooO0oo(string);
                if (o0oooo0OooO0oo == null) {
                    o0OoOo0.OooO0OO().OooO0o(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (o0oooo0OooO0oo.f30153OooO0O0.OooO00o()) {
                    o0OoOo0.OooO0OO().OooO0o(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long jOooO00o = o0oooo0OooO0oo.OooO00o();
                    if (o0oooo0OooO0oo.OooO0O0()) {
                        o0OoOo0.OooO0OO().OooO00o(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jOooO00o)), new Throwable[0]);
                        oO00o00O.OooO0O0(this.f9782Oooo0o, oooO0o.f9807OoooO00, string, jOooO00o);
                        oooO0o.OooO0o0(new OooO0o.OooO0O0(oooO0o, OooO00o(this.f9782Oooo0o), i));
                    } else {
                        o0OoOo0.OooO0OO().OooO00o(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jOooO00o)), new Throwable[0]);
                        oO00o00O.OooO0O0(this.f9782Oooo0o, oooO0o.f9807OoooO00, string, jOooO00o);
                    }
                    workDatabase.OooOOOO();
                }
                return;
            } finally {
                workDatabase.OooOO0O();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f9784Oooo0oo) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                o0OoOo0 o0oooo0OooO0OO2 = o0OoOo0.OooO0OO();
                String str6 = f9781Oooo;
                o0oooo0OooO0OO2.OooO00o(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                if (this.f9783Oooo0oO.containsKey(string2)) {
                    o0OoOo0.OooO0OO().OooO00o(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                } else {
                    OooO0OO oooO0OO = new OooO0OO(this.f9782Oooo0o, i, string2, oooO0o);
                    this.f9783Oooo0oO.put(string2, oooO0OO);
                    oooO0OO.OooO0o0();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                o0OoOo0.OooO0OO().OooO0o(f9781Oooo, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z6 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            o0OoOo0.OooO0OO().OooO00o(f9781Oooo, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            OooO0Oo(string3, z6);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        o0OoOo0.OooO0OO().OooO00o(f9781Oooo, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        oooO0o.f9807OoooO00.OooO0o(string4);
        Context context2 = this.f9782Oooo0o;
        o00oO0o o00oo0o2 = oooO0o.f9807OoooO00;
        String str7 = oO00o00O.f30019OooO00o;
        OooOOO oooOOO = (OooOOO) o00oo0o2.f29976OooO0OO.OooOOoo();
        o00O0000.OooOO0O oooOO0OOooO00o = oooOOO.OooO00o(string4);
        if (oooOO0OOooO00o != null) {
            oO00o00O.OooO00o(context2, string4, oooOO0OOooO00o.f30127OooO0O0);
            o0OoOo0.OooO0OO().OooO00o(oO00o00O.f30019OooO00o, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            oooOOO.OooO0OO(string4);
        }
        oooO0o.OooO0Oo(string4, false);
    }
}
