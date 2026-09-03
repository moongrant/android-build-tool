package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import o000O.OooO00o;
import o000O.OooO0O0;
import p084o000Ooo0.OooO;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.o0OOO0o;
import p091o000o0O.o000000;
import p091o000o0O.o000000O;
import p091o000o0O.o000OOo;
import p091o000o0O.o00O0O;
import p091o000o0O.o00Ooo;
import p091o000o0O.o0OO00O;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.o0OoOo0;
import p091o000o0O.oo000o;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f8495OooOO0 = o000oOoO.OooO0o0("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public static String OooO(@NonNull o00Ooo o00ooo2, @NonNull o000OOo o000ooo2, @NonNull o0OoOo0 o0oooo0, @NonNull ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) it.next();
            p091o000o0O.o000oOoO o000ooooOooO00o = ((o00O0O) o0oooo0).OooO00o(o0oo0oo2.f35262OooO00o);
            Integer numValueOf = o000ooooOooO00o != null ? Integer.valueOf(o000ooooOooO00o.f35250OooO0O0) : null;
            String str = o0oo0oo2.f35262OooO00o;
            oo000o oo000oVar = (oo000o) o00ooo2;
            oo000oVar.getClass();
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
            RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                roomSQLiteQueryOooO00o.bindNull(1);
            } else {
                roomSQLiteQueryOooO00o.bindString(1, str);
            }
            RoomDatabase roomDatabase = oo000oVar.f35281OooO00o;
            roomDatabase.OooO0O0();
            Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
            try {
                ArrayList arrayList2 = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    arrayList2.add(cursorOooO0O0.getString(0));
                }
                cursorOooO0O0.close();
                roomSQLiteQueryOooO00o.release();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", o0oo0oo2.f35262OooO00o, o0oo0oo2.f35264OooO0OO, numValueOf, o0oo0oo2.f35263OooO0O0.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ((o000000) o000ooo2).OooO00o(o0oo0oo2.f35262OooO00o))));
            } catch (Throwable th) {
                cursorOooO0O0.close();
                roomSQLiteQueryOooO00o.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.OooO00o OooO0oo() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        ArrayList arrayList;
        o0OoOo0 o0oooo0;
        o00Ooo o00ooo2;
        o000OOo o000ooo2;
        int i;
        WorkDatabase workDatabase = o0OOO0o.OooO0OO(this.f8371OooO0Oo).f35160OooO0OO;
        o0OO00O o0oo00oOooOo00 = workDatabase.OooOo00();
        o00Ooo o00oooOooOOo = workDatabase.OooOOo();
        o000OOo o000oooOooOo0 = workDatabase.OooOo0();
        o0OoOo0 o0oooo0OooOOo0 = workDatabase.OooOOo0();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        oo0o0Oo oo0o0oo = (oo0o0Oo) o0oo00oOooOo00;
        oo0o0oo.getClass();
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, jCurrentTimeMillis);
        RoomDatabase roomDatabase = oo0o0oo.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "output");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
                int iOooO00o16 = OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
                int iOooO00o17 = OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
                int iOooO00o18 = OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
                int iOooO00o19 = OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
                int iOooO00o20 = OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
                int iOooO00o21 = OooO00o.OooO00o(cursorOooO0O0, "period_start_time");
                int iOooO00o22 = OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
                int iOooO00o23 = OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o24 = OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o25 = OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int i2 = iOooO00o14;
                ArrayList arrayList2 = new ArrayList(cursorOooO0O0.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!cursorOooO0O0.moveToNext()) {
                        break;
                    }
                    String string = cursorOooO0O0.getString(iOooO00o9);
                    String string2 = cursorOooO0O0.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    OooO oooO = new OooO();
                    int i4 = iOooO00o;
                    oooO.f35083OooO00o = o000000O.OooO0OO(cursorOooO0O0.getInt(iOooO00o));
                    oooO.f35084OooO0O0 = cursorOooO0O0.getInt(iOooO00o2) != 0;
                    oooO.f35085OooO0OO = cursorOooO0O0.getInt(iOooO00o3) != 0;
                    oooO.f35086OooO0Oo = cursorOooO0O0.getInt(iOooO00o4) != 0;
                    oooO.f35088OooO0o0 = cursorOooO0O0.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o9;
                    oooO.f35087OooO0o = cursorOooO0O0.getLong(iOooO00o6);
                    oooO.f35089OooO0oO = cursorOooO0O0.getLong(iOooO00o7);
                    oooO.f35090OooO0oo = o000000O.OooO00o(cursorOooO0O0.getBlob(iOooO00o8));
                    o0Oo0oo o0oo0oo2 = new o0Oo0oo(string, string2);
                    o0oo0oo2.f35263OooO0O0 = o000000O.OooO0o0(cursorOooO0O0.getInt(iOooO00o10));
                    o0oo0oo2.f35265OooO0Oo = cursorOooO0O0.getString(iOooO00o12);
                    o0oo0oo2.f35267OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(iOooO00o13));
                    int i6 = i2;
                    o0oo0oo2.f35266OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(i6));
                    int i7 = iOooO00o10;
                    i2 = i6;
                    int i8 = iOooO00o15;
                    o0oo0oo2.f35268OooO0oO = cursorOooO0O0.getLong(i8);
                    int i9 = iOooO00o12;
                    int i10 = iOooO00o16;
                    o0oo0oo2.f35269OooO0oo = cursorOooO0O0.getLong(i10);
                    int i11 = iOooO00o13;
                    int i12 = iOooO00o17;
                    o0oo0oo2.f35261OooO = cursorOooO0O0.getLong(i12);
                    int i13 = iOooO00o18;
                    o0oo0oo2.f35271OooOO0O = cursorOooO0O0.getInt(i13);
                    int i14 = iOooO00o19;
                    o0oo0oo2.f35272OooOO0o = o000000O.OooO0O0(cursorOooO0O0.getInt(i14));
                    iOooO00o17 = i12;
                    int i15 = iOooO00o20;
                    o0oo0oo2.f35274OooOOO0 = cursorOooO0O0.getLong(i15);
                    int i16 = iOooO00o21;
                    o0oo0oo2.f35273OooOOO = cursorOooO0O0.getLong(i16);
                    iOooO00o21 = i16;
                    int i17 = iOooO00o22;
                    o0oo0oo2.f35275OooOOOO = cursorOooO0O0.getLong(i17);
                    iOooO00o22 = i17;
                    int i18 = iOooO00o23;
                    o0oo0oo2.f35276OooOOOo = cursorOooO0O0.getLong(i18);
                    int i19 = iOooO00o24;
                    o0oo0oo2.f35278OooOOo0 = cursorOooO0O0.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    o0oo0oo2.f35277OooOOo = o000000O.OooO0Oo(cursorOooO0O0.getInt(i20));
                    o0oo0oo2.f35270OooOO0 = oooO;
                    arrayList.add(o0oo0oo2);
                    iOooO00o25 = i20;
                    iOooO00o10 = i7;
                    iOooO00o12 = i9;
                    iOooO00o23 = i18;
                    iOooO00o = i4;
                    arrayList2 = arrayList;
                    iOooO00o24 = i19;
                    iOooO00o15 = i8;
                    iOooO00o11 = i3;
                    iOooO00o9 = i5;
                    iOooO00o20 = i15;
                    iOooO00o13 = i11;
                    iOooO00o16 = i10;
                    iOooO00o18 = i13;
                    iOooO00o19 = i14;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                ArrayList arrayListOooO0Oo = oo0o0oo.OooO0Oo();
                ArrayList arrayListOooO0O0 = oo0o0oo.OooO0O0();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = f8495OooOO0;
                if (zIsEmpty) {
                    o0oooo0 = o0oooo0OooOOo0;
                    o00ooo2 = o00oooOooOOo;
                    o000ooo2 = o000oooOooOo0;
                    i = 0;
                } else {
                    i = 0;
                    o000oOoO.OooO0OO().OooO0Oo(str, "Recently completed work:\n\n", new Throwable[0]);
                    o0oooo0 = o0oooo0OooOOo0;
                    o00ooo2 = o00oooOooOOo;
                    o000ooo2 = o000oooOooOo0;
                    o000oOoO.OooO0OO().OooO0Oo(str, OooO(o00ooo2, o000ooo2, o0oooo0, arrayList), new Throwable[0]);
                }
                if (!arrayListOooO0Oo.isEmpty()) {
                    o000oOoO.OooO0OO().OooO0Oo(str, "Running work:\n\n", new Throwable[i]);
                    o000oOoO.OooO0OO().OooO0Oo(str, OooO(o00ooo2, o000ooo2, o0oooo0, arrayListOooO0Oo), new Throwable[i]);
                }
                if (!arrayListOooO0O0.isEmpty()) {
                    o000oOoO.OooO0OO().OooO0Oo(str, "Enqueued work:\n\n", new Throwable[i]);
                    o000oOoO.OooO0OO().OooO0Oo(str, OooO(o00ooo2, o000ooo2, o0oooo0, arrayListOooO0O0), new Throwable[i]);
                }
                return new ListenableWorker.OooO00o.OooO0OO();
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }
}
