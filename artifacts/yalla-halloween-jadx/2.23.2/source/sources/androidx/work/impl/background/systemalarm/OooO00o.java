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
import o00O0OO.OooOOO;
import o00O0OO.OooOOOO;
import o00O0OO.OooOo;
import o00O0OO.o00Ooo;
import oo00o.OooO;
import oo00o.o0OOO0o;
import oo00o.o0ooOOo;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.o00O00OO;
import p115o00O00oO.Oooo0;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o implements OooO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f11508OooO0oo = o0Oo0oo.OooO0o("CommandHandler");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f11509OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OOO0o f11512OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f11511OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f11510OooO0o = new Object();

    public OooO00o(@NonNull Context context, @NonNull o0OOO0o o0ooo0o2) {
        this.f11509OooO0Oo = context;
        this.f11512OooO0oO = o0ooo0o2;
    }

    public static OooOo OooO0OO(@NonNull Intent intent) {
        return new OooOo(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void OooO0o0(@NonNull Intent intent, @NonNull OooOo oooOo) {
        intent.putExtra("KEY_WORKSPEC_ID", oooOo.f36202OooO00o);
        intent.putExtra("KEY_WORKSPEC_GENERATION", oooOo.f36203OooO0O0);
    }

    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f11510OooO0o) {
            z = !this.f11511OooO0o0.isEmpty();
        }
        return z;
    }

    @WorkerThread
    public final void OooO0O0(int i, @NonNull Intent intent, @NonNull OooO0o oooO0o) {
        List<o0ooOOo> listOooO0O0;
        ArrayList arrayList;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o0Oo0oo.OooO0Oo().OooO00o(f11508OooO0oo, "Handling constraints changed " + intent);
            OooO0O0 oooO0O0 = new OooO0O0(this.f11509OooO0Oo, i, oooO0o);
            ArrayList<o00Ooo> arrayListOooO0o0 = oooO0o.f11536OooO0oo.f60221OooO0OO.OooOo0().OooO0o0();
            String str = ConstraintProxy.f11503OooO00o;
            Iterator it = arrayListOooO0o0.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                Oooo0 oooo0 = ((o00Ooo) it.next()).f36224OooOO0;
                z |= oooo0.f36134OooO0Oo;
                z2 |= oooo0.f36132OooO0O0;
                z3 |= oooo0.f36136OooO0o0;
                z4 |= oooo0.f36131OooO00o != NetworkType.NOT_REQUIRED;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f11504OooO00o;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = oooO0O0.f11514OooO00o;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            o00O0O0O.OooO0o oooO0o2 = oooO0O0.f11516OooO0OO;
            oooO0o2.OooO0Oo(arrayListOooO0o0);
            ArrayList<o00Ooo> arrayList2 = new ArrayList(arrayListOooO0o0.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (o00Ooo o00ooo2 : arrayListOooO0o0) {
                String str3 = o00ooo2.f36216OooO00o;
                if (jCurrentTimeMillis >= o00ooo2.OooO00o() && (!o00ooo2.OooO0O0() || oooO0o2.OooO0OO(str3))) {
                    arrayList2.add(o00ooo2);
                }
            }
            for (o00Ooo o00ooo3 : arrayList2) {
                String str4 = o00ooo3.f36216OooO00o;
                OooOo oooOoOooO00o = o00O0OO.o0ooOOo.OooO00o(o00ooo3);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                OooO0o0(intent3, oooOoOooO00o);
                o0Oo0oo.OooO0Oo().OooO00o(OooO0O0.f11513OooO0Oo, o000oOoO.OooO0O0("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((o00O0O) oooO0o.f11534OooO0o0).f36416OooO0OO.execute(new OooO0o.OooO0O0(oooO0O0.f11515OooO0O0, intent3, oooO0o));
            }
            oooO0o2.OooO0o0();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o0Oo0oo.OooO0Oo().OooO00o(f11508OooO0oo, "Handling reschedule " + intent + ", " + i);
            oooO0o.f11536OooO0oo.OooO0oO();
            return;
        }
        Bundle extras = intent.getExtras();
        if (!((extras == null || extras.isEmpty() || extras.get(new String[]{"KEY_WORKSPEC_ID"}[0]) == null) ? false : true)) {
            o0Oo0oo.OooO0Oo().OooO0O0(f11508OooO0oo, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            OooOo oooOoOooO0OO = OooO0OO(intent);
            String str5 = f11508OooO0oo;
            o0Oo0oo.OooO0Oo().OooO00o(str5, "Handling schedule work for " + oooOoOooO0OO);
            WorkDatabase workDatabase = oooO0o.f11536OooO0oo.f60221OooO0OO;
            workDatabase.OooO0OO();
            try {
                o00Ooo o00oooOooO0oo = workDatabase.OooOo0().OooO0oo(oooOoOooO0OO.f36202OooO00o);
                if (o00oooOooO0oo == null) {
                    o0Oo0oo.OooO0Oo().OooO0oO(str5, "Skipping scheduling " + oooOoOooO0OO + " because it's no longer in the DB");
                } else if (o00oooOooO0oo.f36217OooO0O0.OooO00o()) {
                    o0Oo0oo.OooO0Oo().OooO0oO(str5, "Skipping scheduling " + oooOoOooO0OO + "because it is finished.");
                } else {
                    long jOooO00o = o00oooOooO0oo.OooO00o();
                    boolean zOooO0O0 = o00oooOooO0oo.OooO0O0();
                    Context context2 = this.f11509OooO0Oo;
                    if (zOooO0O0) {
                        o0Oo0oo.OooO0Oo().OooO00o(str5, "Opportunistically setting an alarm for " + oooOoOooO0OO + "at " + jOooO00o);
                        o00O0O00.OooO00o.OooO0O0(context2, workDatabase, oooOoOooO0OO, jOooO00o);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((o00O0O) oooO0o.f11534OooO0o0).f36416OooO0OO.execute(new OooO0o.OooO0O0(i, intent4, oooO0o));
                    } else {
                        o0Oo0oo.OooO0Oo().OooO00o(str5, "Setting up Alarms for " + oooOoOooO0OO + "at " + jOooO00o);
                        o00O0O00.OooO00o.OooO0O0(context2, workDatabase, oooOoOooO0OO, jOooO00o);
                    }
                    workDatabase.OooOOO();
                }
                return;
            } finally {
                workDatabase.OooOO0();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f11510OooO0o) {
                OooOo oooOoOooO0OO2 = OooO0OO(intent);
                o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
                String str6 = f11508OooO0oo;
                o0oo0ooOooO0Oo.OooO00o(str6, "Handing delay met for " + oooOoOooO0OO2);
                if (this.f11511OooO0o0.containsKey(oooOoOooO0OO2)) {
                    o0Oo0oo.OooO0Oo().OooO00o(str6, "WorkSpec " + oooOoOooO0OO2 + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    OooO0OO oooO0OO = new OooO0OO(this.f11509OooO0Oo, i, oooO0o, this.f11512OooO0oO.OooO0Oo(oooOoOooO0OO2));
                    this.f11511OooO0o0.put(oooOoOooO0OO2, oooO0OO);
                    oooO0OO.OooO0o0();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                o0Oo0oo.OooO0Oo().OooO0oO(f11508OooO0oo, "Ignoring intent " + intent);
                return;
            }
            OooOo oooOoOooO0OO3 = OooO0OO(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            o0Oo0oo.OooO0Oo().OooO00o(f11508OooO0oo, "Handling onExecutionCompleted " + intent + ", " + i);
            OooO0Oo(oooOoOooO0OO3, z5);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        o0OOO0o o0ooo0o2 = this.f11512OooO0oO;
        if (zContainsKey) {
            int i2 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            o0ooOOo o0oooooOooO0OO = o0ooo0o2.OooO0OO(new OooOo(string, i2));
            if (o0oooooOooO0OO != null) {
                listOooO0O0 = arrayList;
                arrayList.add(o0oooooOooO0OO);
                listOooO0O0 = arrayList;
            }
        } else {
            listOooO0O0 = o0ooo0o2.OooO0O0(string);
        }
        listOooO0O0 = arrayList;
        for (o0ooOOo o0ooooo : listOooO0O0) {
            o0Oo0oo.OooO0Oo().OooO00o(f11508OooO0oo, o00O00OO.OooO00o("Handing stopWork work for ", string));
            oooO0o.f11536OooO0oo.OooO(o0ooooo);
            WorkDatabase workDatabase2 = oooO0o.f11536OooO0oo.f60221OooO0OO;
            OooOo oooOo = o0ooooo.f60300OooO00o;
            String str7 = o00O0O00.OooO00o.f36174OooO00o;
            OooOOOO oooOOOOOooOOo = workDatabase2.OooOOo();
            OooOOO oooOOOOooO0OO = oooOOOOOooOOo.OooO0OO(oooOo);
            if (oooOOOOooO0OO != null) {
                o00O0O00.OooO00o.OooO00o(this.f11509OooO0Oo, oooOo, oooOOOOooO0OO.f36201OooO0OO);
                o0Oo0oo.OooO0Oo().OooO00o(o00O0O00.OooO00o.f36174OooO00o, "Removing SystemIdInfo for workSpecId (" + oooOo + ")");
                oooOOOOOooOOo.OooO00o(oooOo);
            }
            oooO0o.OooO0Oo(o0ooooo.f60300OooO00o, false);
        }
    }

    @Override // oo00o.OooO
    public final void OooO0Oo(@NonNull OooOo oooOo, boolean z) {
        synchronized (this.f11510OooO0o) {
            OooO0OO oooO0OO = (OooO0OO) this.f11511OooO0o0.remove(oooOo);
            this.f11512OooO0oO.OooO0OO(oooOo);
            if (oooO0OO != null) {
                oooO0OO.OooO0oO(z);
            }
        }
    }
}
