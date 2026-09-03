package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.OooO0O0;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o00O0000.OooOO0O;
import o00O0000.OooOOO;
import o00O0000.OooOOO0;
import o00O0000.OooOo;
import o00O0000.OooOo00;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import o00O0000.o00oO0o;
import o00O0000.o0ooOOo;
import o00O0000.oo000o;
import p091o000o00o.o0000O0;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final String f9857OoooO0O = o0OoOo0.OooO0o0("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public static String OooO(@NonNull OooOo00 oooOo00, @NonNull oo000o oo000oVar, @NonNull OooOOO0 oooOOO0, @NonNull List<o00O0000.o0OoOo0> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (o00O0000.o0OoOo0 o0oooo1 : list) {
            OooOO0O oooOO0OOooO00o = ((OooOOO) oooOOO0).OooO00o(o0oooo1.f30152OooO00o);
            Integer numValueOf = oooOO0OOooO00o != null ? Integer.valueOf(oooOO0OOooO00o.f30127OooO0O0) : null;
            String str = o0oooo1.f30152OooO00o;
            OooOo oooOo = (OooOo) oooOo00;
            Objects.requireNonNull(oooOo);
            o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                o0000o0OooO0o.bindNull(1);
            } else {
                o0000o0OooO0o.bindString(1, str);
            }
            oooOo.f30133OooO00o.OooO0O0();
            Cursor cursorOooOOO = oooOo.f30133OooO00o.OooOOO(o0000o0OooO0o);
            try {
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    arrayList.add(cursorOooOOO.getString(0));
                }
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", o0oooo1.f30152OooO00o, o0oooo1.f30154OooO0OO, numValueOf, o0oooo1.f30153OooO0O0.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((o00oO0o) oo000oVar).OooO00o(o0oooo1.f30152OooO00o))));
            } catch (Throwable th) {
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.OooO00o OooO0oo() throws Throwable {
        o0000O0 o0000o1;
        ArrayList arrayList;
        OooOOO0 oooOOO0;
        OooOo00 oooOo00;
        oo000o oo000oVar;
        int i;
        WorkDatabase workDatabase = p107o000ooO0.o00oO0o.OooO0O0(this.f9727Oooo0o).f29976OooO0OO;
        o00O0O o00o0oOooOo0O = workDatabase.OooOo0O();
        OooOo00 OooOo01 = workDatabase.OooOo00();
        oo000o oo000oVarOooOo0o = workDatabase.OooOo0o();
        OooOOO0 oooOOO0OooOOoo = workDatabase.OooOOoo();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        o00Oo0 o00oo1 = (o00Oo0) o00o0oOooOo0O;
        Objects.requireNonNull(o00oo1);
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        o0000o0OooO0o.bindLong(1, jCurrentTimeMillis);
        o00oo1.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = o00oo1.f30139OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "required_network_type");
            int iOooO00o2 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "requires_charging");
            int iOooO00o3 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "requires_device_idle");
            int iOooO00o4 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "requires_battery_not_low");
            int iOooO00o5 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "requires_storage_not_low");
            int iOooO00o6 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "trigger_content_update_delay");
            int iOooO00o7 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "trigger_max_content_delay");
            int iOooO00o8 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "content_uri_triggers");
            int iOooO00o9 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o10 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, ServerProtocol.DIALOG_PARAM_STATE);
            int iOooO00o11 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "worker_class_name");
            int iOooO00o12 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "input_merger_class_name");
            int iOooO00o13 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "input");
            int iOooO00o14 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "output");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "initial_delay");
                int iOooO00o16 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "interval_duration");
                int iOooO00o17 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "flex_duration");
                int iOooO00o18 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "run_attempt_count");
                int iOooO00o19 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "backoff_policy");
                int iOooO00o20 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "backoff_delay_duration");
                int iOooO00o21 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "period_start_time");
                int iOooO00o22 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "minimum_retention_duration");
                int iOooO00o23 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "schedule_requested_at");
                int iOooO00o24 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "run_in_foreground");
                int iOooO00o25 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "out_of_quota_policy");
                int i2 = iOooO00o14;
                ArrayList arrayList2 = new ArrayList(cursorOooOOO.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!cursorOooOOO.moveToNext()) {
                        break;
                    }
                    String string = cursorOooOOO.getString(iOooO00o9);
                    String string2 = cursorOooOOO.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    p102o000oo.OooOO0O oooOO0O = new p102o000oo.OooOO0O();
                    int i4 = iOooO00o;
                    oooOO0O.f29789OooO00o = o0ooOOo.OooO0OO(cursorOooOOO.getInt(iOooO00o));
                    oooOO0O.f29790OooO0O0 = cursorOooOOO.getInt(iOooO00o2) != 0;
                    oooOO0O.f29791OooO0OO = cursorOooOOO.getInt(iOooO00o3) != 0;
                    oooOO0O.f29792OooO0Oo = cursorOooOOO.getInt(iOooO00o4) != 0;
                    oooOO0O.f29794OooO0o0 = cursorOooOOO.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o9;
                    int i6 = iOooO00o2;
                    oooOO0O.f29793OooO0o = cursorOooOOO.getLong(iOooO00o6);
                    oooOO0O.f29795OooO0oO = cursorOooOOO.getLong(iOooO00o7);
                    oooOO0O.f29796OooO0oo = o0ooOOo.OooO00o(cursorOooOOO.getBlob(iOooO00o8));
                    o00O0000.o0OoOo0 o0oooo1 = new o00O0000.o0OoOo0(string, string2);
                    o0oooo1.f30153OooO0O0 = o0ooOOo.OooO0o0(cursorOooOOO.getInt(iOooO00o10));
                    o0oooo1.f30155OooO0Oo = cursorOooOOO.getString(iOooO00o12);
                    o0oooo1.f30157OooO0o0 = OooO0O0.OooO00o(cursorOooOOO.getBlob(iOooO00o13));
                    int i7 = i2;
                    o0oooo1.f30156OooO0o = OooO0O0.OooO00o(cursorOooOOO.getBlob(i7));
                    int i8 = iOooO00o10;
                    i2 = i7;
                    int i9 = iOooO00o15;
                    o0oooo1.f30158OooO0oO = cursorOooOOO.getLong(i9);
                    int i10 = iOooO00o12;
                    int i11 = iOooO00o16;
                    o0oooo1.f30159OooO0oo = cursorOooOOO.getLong(i11);
                    int i12 = iOooO00o13;
                    int i13 = iOooO00o17;
                    o0oooo1.f30151OooO = cursorOooOOO.getLong(i13);
                    int i14 = iOooO00o18;
                    o0oooo1.f30161OooOO0O = cursorOooOOO.getInt(i14);
                    int i15 = iOooO00o19;
                    o0oooo1.f30162OooOO0o = o0ooOOo.OooO0O0(cursorOooOOO.getInt(i15));
                    iOooO00o17 = i13;
                    int i16 = iOooO00o20;
                    o0oooo1.f30164OooOOO0 = cursorOooOOO.getLong(i16);
                    int i17 = iOooO00o21;
                    o0oooo1.f30163OooOOO = cursorOooOOO.getLong(i17);
                    iOooO00o21 = i17;
                    int i18 = iOooO00o22;
                    o0oooo1.f30165OooOOOO = cursorOooOOO.getLong(i18);
                    iOooO00o22 = i18;
                    int i19 = iOooO00o23;
                    o0oooo1.f30166OooOOOo = cursorOooOOO.getLong(i19);
                    int i20 = iOooO00o24;
                    o0oooo1.f30168OooOOo0 = cursorOooOOO.getInt(i20) != 0;
                    int i21 = iOooO00o25;
                    o0oooo1.f30167OooOOo = o0ooOOo.OooO0Oo(cursorOooOOO.getInt(i21));
                    o0oooo1.f30160OooOO0 = oooOO0O;
                    arrayList.add(o0oooo1);
                    iOooO00o25 = i21;
                    iOooO00o10 = i8;
                    iOooO00o12 = i10;
                    iOooO00o23 = i19;
                    iOooO00o9 = i5;
                    iOooO00o24 = i20;
                    iOooO00o2 = i6;
                    iOooO00o15 = i9;
                    iOooO00o = i4;
                    arrayList2 = arrayList;
                    iOooO00o11 = i3;
                    iOooO00o20 = i16;
                    iOooO00o13 = i12;
                    iOooO00o16 = i11;
                    iOooO00o18 = i14;
                    iOooO00o19 = i15;
                }
                cursorOooOOO.close();
                o0000o1.release();
                List<o00O0000.o0OoOo0> listOooO0Oo = o00oo1.OooO0Oo();
                List listOooO0O0 = o00oo1.OooO0O0();
                if (arrayList.isEmpty()) {
                    oooOOO0 = oooOOO0OooOOoo;
                    oooOo00 = OooOo01;
                    oo000oVar = oo000oVarOooOo0o;
                    i = 0;
                } else {
                    o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
                    String str = f9857OoooO0O;
                    i = 0;
                    o0oooo0OooO0OO.OooO0Oo(str, "Recently completed work:\n\n", new Throwable[0]);
                    oooOOO0 = oooOOO0OooOOoo;
                    oooOo00 = OooOo01;
                    oo000oVar = oo000oVarOooOo0o;
                    o0OoOo0.OooO0OO().OooO0Oo(str, OooO(oooOo00, oo000oVar, oooOOO0, arrayList), new Throwable[0]);
                }
                if (!((ArrayList) listOooO0Oo).isEmpty()) {
                    o0OoOo0 o0oooo0OooO0OO2 = o0OoOo0.OooO0OO();
                    String str2 = f9857OoooO0O;
                    o0oooo0OooO0OO2.OooO0Oo(str2, "Running work:\n\n", new Throwable[i]);
                    o0OoOo0.OooO0OO().OooO0Oo(str2, OooO(oooOo00, oo000oVar, oooOOO0, listOooO0Oo), new Throwable[i]);
                }
                if (!((ArrayList) listOooO0O0).isEmpty()) {
                    o0OoOo0 o0oooo0OooO0OO3 = o0OoOo0.OooO0OO();
                    String str3 = f9857OoooO0O;
                    o0oooo0OooO0OO3.OooO0Oo(str3, "Enqueued work:\n\n", new Throwable[i]);
                    o0OoOo0.OooO0OO().OooO0Oo(str3, OooO(oooOo00, oo000oVar, oooOOO0, listOooO0O0), new Throwable[i]);
                }
                return new ListenableWorker.OooO00o.OooO0OO();
            } catch (Throwable th) {
                th = th;
                cursorOooOOO.close();
                o0000o1.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0000o1 = o0000o0OooO0o;
        }
    }
}
