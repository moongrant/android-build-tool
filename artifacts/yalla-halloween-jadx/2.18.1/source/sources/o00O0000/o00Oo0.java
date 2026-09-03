package o00O0000;

import android.database.Cursor;
import android.os.Build;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.facebook.internal.ServerProtocol;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p023Oooo00O.o00O0;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOO0 f30138OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f30139OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<o0OoOo0> f30140OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f30141OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f30142OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO f30143OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f30144OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0 f30145OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O f30146OooO0oo;

    public class OooO extends o0000OO0 {
        public OooO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class OooO00o extends o000OOo<o0OoOo0> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.util.HashSet, java.util.Set<o000oo.OooOOO0$OooO00o>] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19, types: [java.io.ByteArrayOutputStream] */
        /* JADX WARN: Type inference failed for: r2v21, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r4v25 */
        /* JADX WARN: Type inference failed for: r4v26, types: [java.io.ObjectOutputStream] */
        /* JADX WARN: Type inference failed for: r4v30 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01c1 -> B:103:0x01c4). Please report as a decompilation issue!!! */
        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o0OoOo0 o0oooo1) throws Throwable {
            int i;
            int i2;
            Throwable th;
            ?? r4;
            ?? r2;
            o0OoOo0 o0oooo2 = o0oooo1;
            String str = o0oooo2.f30152OooO00o;
            int i3 = 1;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, o0ooOOo.OooO0o(o0oooo2.f30153OooO0O0));
            String str2 = o0oooo2.f30154OooO0OO;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = o0oooo2.f30155OooO0Oo;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] bArrOooO0O0 = androidx.work.OooO0O0.OooO0O0(o0oooo2.f30157OooO0o0);
            if (bArrOooO0O0 == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, bArrOooO0O0);
            }
            byte[] bArrOooO0O1 = androidx.work.OooO0O0.OooO0O0(o0oooo2.f30156OooO0o);
            if (bArrOooO0O1 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, bArrOooO0O1);
            }
            supportSQLiteStatement.bindLong(7, o0oooo2.f30158OooO0oO);
            supportSQLiteStatement.bindLong(8, o0oooo2.f30159OooO0oo);
            supportSQLiteStatement.bindLong(9, o0oooo2.f30151OooO);
            supportSQLiteStatement.bindLong(10, o0oooo2.f30161OooOO0O);
            BackoffPolicy backoffPolicy = o0oooo2.f30162OooOO0o;
            int i4 = o0ooOOo.OooO00o.f30172OooO0O0[backoffPolicy.ordinal()];
            if (i4 == 1) {
                i = 0;
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
                }
                i = 1;
            }
            supportSQLiteStatement.bindLong(11, i);
            supportSQLiteStatement.bindLong(12, o0oooo2.f30164OooOOO0);
            supportSQLiteStatement.bindLong(13, o0oooo2.f30163OooOOO);
            supportSQLiteStatement.bindLong(14, o0oooo2.f30165OooOOOO);
            supportSQLiteStatement.bindLong(15, o0oooo2.f30166OooOOOo);
            supportSQLiteStatement.bindLong(16, o0oooo2.f30168OooOOo0 ? 1L : 0L);
            OutOfQuotaPolicy outOfQuotaPolicy = o0oooo2.f30167OooOOo;
            int i5 = o0ooOOo.OooO00o.f30174OooO0Oo[outOfQuotaPolicy.ordinal()];
            if (i5 == 1) {
                i2 = 0;
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException("Could not convert " + outOfQuotaPolicy + " to int");
                }
                i2 = 1;
            }
            supportSQLiteStatement.bindLong(17, i2);
            p102o000oo.OooOO0O oooOO0O = o0oooo2.f30160OooOO0;
            if (oooOO0O == null) {
                o00O0.OooO0O0(supportSQLiteStatement, 18, 19, 20, 21);
                o00O0.OooO0O0(supportSQLiteStatement, 22, 23, 24, 25);
                return;
            }
            NetworkType networkType = oooOO0O.f29789OooO00o;
            int i6 = o0ooOOo.OooO00o.f30173OooO0OO[networkType.ordinal()];
            if (i6 == 1) {
                i3 = 0;
            } else if (i6 != 2) {
                if (i6 == 3) {
                    i3 = 2;
                } else if (i6 == 4) {
                    i3 = 3;
                } else if (i6 == 5) {
                    i3 = 4;
                } else {
                    if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                    }
                    i3 = 5;
                }
            }
            supportSQLiteStatement.bindLong(18, i3);
            supportSQLiteStatement.bindLong(19, oooOO0O.f29790OooO0O0 ? 1L : 0L);
            supportSQLiteStatement.bindLong(20, oooOO0O.f29791OooO0OO ? 1L : 0L);
            supportSQLiteStatement.bindLong(21, oooOO0O.f29792OooO0Oo ? 1L : 0L);
            supportSQLiteStatement.bindLong(22, oooOO0O.f29794OooO0o0 ? 1L : 0L);
            supportSQLiteStatement.bindLong(23, oooOO0O.f29793OooO0o);
            supportSQLiteStatement.bindLong(24, oooOO0O.f29795OooO0oO);
            p102o000oo.OooOOO0 oooOOO0 = oooOO0O.f29796OooO0oo;
            int iOooO00o = oooOOO0.OooO00o();
            byte[] byteArray = null;
            ObjectOutputStream objectOutputStream = null;
            byteArray = null;
            ?? byteArrayOutputStream = iOooO00o;
            if (iOooO00o != 0) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        try {
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                objectOutputStream2.writeInt(oooOOO0.OooO00o());
                                for (o000oo.OooOOO0.OooO00o oooO00o : oooOOO0.f29804OooO00o) {
                                    objectOutputStream2.writeUTF(oooO00o.f29805OooO00o.toString());
                                    objectOutputStream2.writeBoolean(oooO00o.f29806OooO0O0);
                                }
                                objectOutputStream2.close();
                            } catch (IOException e) {
                                e = e;
                                objectOutputStream = objectOutputStream2;
                                e.printStackTrace();
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r2 = byteArrayOutputStream;
                                r4 = objectOutputStream2;
                                if (r4 != 0) {
                                    try {
                                        r4.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                try {
                                    r2.close();
                                    throw th;
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = byteArray;
                            r2 = byteArrayOutputStream;
                        }
                    } catch (IOException e4) {
                        e = e4;
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream = byteArrayOutputStream;
            }
            if (byteArray == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindBlob(25, byteArray);
            }
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class OooO0OO extends o0000OO0 {
        public OooO0OO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class OooO0o extends o0000OO0 {
        public OooO0o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class OooOO0 extends o0000OO0 {
        public OooOO0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class OooOO0O extends o0000OO0 {
        public OooOO0O(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class OooOOO0 extends o0000OO0 {
        public OooOOO0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public o00Oo0(RoomDatabase roomDatabase) {
        this.f30139OooO00o = roomDatabase;
        this.f30140OooO0O0 = new OooO00o(roomDatabase);
        this.f30141OooO0OO = new OooO0O0(roomDatabase);
        this.f30142OooO0Oo = new OooO0OO(roomDatabase);
        this.f30144OooO0o0 = new OooO0o(roomDatabase);
        this.f30143OooO0o = new OooO(roomDatabase);
        this.f30145OooO0oO = new OooOO0(roomDatabase);
        this.f30146OooO0oo = new OooOO0O(roomDatabase);
        this.f30138OooO = new OooOOO0(roomDatabase);
        new AtomicBoolean(false);
    }

    public final List<o0OoOo0.OooO00o> OooO(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = p092o000o0O.o00O0O.OooO00o(cursorOooOOO, ServerProtocol.DIALOG_PARAM_STATE);
            ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
            while (cursorOooOOO.moveToNext()) {
                o0OoOo0.OooO00o oooO00o = new o0OoOo0.OooO00o();
                oooO00o.f30169OooO00o = cursorOooOOO.getString(iOooO00o);
                oooO00o.f30170OooO0O0 = o0ooOOo.OooO0o0(cursorOooOOO.getInt(iOooO00o2));
                arrayList.add(oooO00o);
            }
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            return arrayList;
        } catch (Throwable th) {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            throw th;
        }
    }

    public final void OooO00o(String str) {
        this.f30139OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30141OooO0OO.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        this.f30139OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30139OooO00o.OooOOOO();
        } finally {
            this.f30139OooO00o.OooOO0O();
            this.f30141OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final List OooO0O0() throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        o0000o0OooO0o.bindLong(1, 200);
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
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
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    String string = cursorOooOOO.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooOOO.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    p102o000oo.OooOO0O oooOO0O = new p102o000oo.OooOO0O();
                    int i4 = iOooO00o;
                    oooOO0O.f29789OooO00o = o0ooOOo.OooO0OO(cursorOooOOO.getInt(iOooO00o));
                    oooOO0O.f29790OooO0O0 = cursorOooOOO.getInt(iOooO00o2) != 0;
                    oooOO0O.f29791OooO0OO = cursorOooOOO.getInt(iOooO00o3) != 0;
                    oooOO0O.f29792OooO0Oo = cursorOooOOO.getInt(iOooO00o4) != 0;
                    oooOO0O.f29794OooO0o0 = cursorOooOOO.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    int i6 = iOooO00o3;
                    oooOO0O.f29793OooO0o = cursorOooOOO.getLong(iOooO00o6);
                    oooOO0O.f29795OooO0oO = cursorOooOOO.getLong(iOooO00o7);
                    oooOO0O.f29796OooO0oo = o0ooOOo.OooO00o(cursorOooOOO.getBlob(iOooO00o8));
                    o0OoOo0 o0oooo1 = new o0OoOo0(string, string2);
                    o0oooo1.f30153OooO0O0 = o0ooOOo.OooO0o0(cursorOooOOO.getInt(iOooO00o10));
                    o0oooo1.f30155OooO0Oo = cursorOooOOO.getString(iOooO00o12);
                    o0oooo1.f30157OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(iOooO00o13));
                    int i7 = i;
                    o0oooo1.f30156OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(i7));
                    i = i7;
                    int i8 = iOooO00o15;
                    o0oooo1.f30158OooO0oO = cursorOooOOO.getLong(i8);
                    int i9 = iOooO00o13;
                    int i10 = iOooO00o16;
                    o0oooo1.f30159OooO0oo = cursorOooOOO.getLong(i10);
                    int i11 = iOooO00o4;
                    int i12 = iOooO00o17;
                    o0oooo1.f30151OooO = cursorOooOOO.getLong(i12);
                    int i13 = iOooO00o18;
                    o0oooo1.f30161OooOO0O = cursorOooOOO.getInt(i13);
                    int i14 = iOooO00o19;
                    o0oooo1.f30162OooOO0o = o0ooOOo.OooO0O0(cursorOooOOO.getInt(i14));
                    iOooO00o17 = i12;
                    int i15 = iOooO00o20;
                    o0oooo1.f30164OooOOO0 = cursorOooOOO.getLong(i15);
                    int i16 = iOooO00o21;
                    o0oooo1.f30163OooOOO = cursorOooOOO.getLong(i16);
                    iOooO00o21 = i16;
                    int i17 = iOooO00o22;
                    o0oooo1.f30165OooOOOO = cursorOooOOO.getLong(i17);
                    int i18 = iOooO00o23;
                    o0oooo1.f30166OooOOOo = cursorOooOOO.getLong(i18);
                    int i19 = iOooO00o24;
                    o0oooo1.f30168OooOOo0 = cursorOooOOO.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    o0oooo1.f30167OooOOo = o0ooOOo.OooO0Oo(cursorOooOOO.getInt(i20));
                    o0oooo1.f30160OooOO0 = oooOO0O;
                    arrayList.add(o0oooo1);
                    iOooO00o25 = i20;
                    iOooO00o2 = i5;
                    iOooO00o13 = i9;
                    iOooO00o15 = i8;
                    iOooO00o16 = i10;
                    iOooO00o18 = i13;
                    iOooO00o23 = i18;
                    iOooO00o9 = i2;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o24 = i19;
                    iOooO00o22 = i17;
                    iOooO00o3 = i6;
                    iOooO00o20 = i15;
                    iOooO00o4 = i11;
                    iOooO00o19 = i14;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList;
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

    public final List<o0OoOo0> OooO0OO(int i) throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        o0000o0OooO0o.bindLong(1, i);
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
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
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    String string = cursorOooOOO.getString(iOooO00o9);
                    int i3 = iOooO00o9;
                    String string2 = cursorOooOOO.getString(iOooO00o11);
                    int i4 = iOooO00o11;
                    p102o000oo.OooOO0O oooOO0O = new p102o000oo.OooOO0O();
                    int i5 = iOooO00o;
                    oooOO0O.f29789OooO00o = o0ooOOo.OooO0OO(cursorOooOOO.getInt(iOooO00o));
                    oooOO0O.f29790OooO0O0 = cursorOooOOO.getInt(iOooO00o2) != 0;
                    oooOO0O.f29791OooO0OO = cursorOooOOO.getInt(iOooO00o3) != 0;
                    oooOO0O.f29792OooO0Oo = cursorOooOOO.getInt(iOooO00o4) != 0;
                    oooOO0O.f29794OooO0o0 = cursorOooOOO.getInt(iOooO00o5) != 0;
                    int i6 = iOooO00o2;
                    int i7 = iOooO00o3;
                    oooOO0O.f29793OooO0o = cursorOooOOO.getLong(iOooO00o6);
                    oooOO0O.f29795OooO0oO = cursorOooOOO.getLong(iOooO00o7);
                    oooOO0O.f29796OooO0oo = o0ooOOo.OooO00o(cursorOooOOO.getBlob(iOooO00o8));
                    o0OoOo0 o0oooo1 = new o0OoOo0(string, string2);
                    o0oooo1.f30153OooO0O0 = o0ooOOo.OooO0o0(cursorOooOOO.getInt(iOooO00o10));
                    o0oooo1.f30155OooO0Oo = cursorOooOOO.getString(iOooO00o12);
                    o0oooo1.f30157OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(iOooO00o13));
                    int i8 = i2;
                    o0oooo1.f30156OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(i8));
                    int i9 = iOooO00o15;
                    i2 = i8;
                    o0oooo1.f30158OooO0oO = cursorOooOOO.getLong(i9);
                    int i10 = iOooO00o13;
                    int i11 = iOooO00o16;
                    o0oooo1.f30159OooO0oo = cursorOooOOO.getLong(i11);
                    int i12 = iOooO00o4;
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
                    int i19 = iOooO00o23;
                    o0oooo1.f30166OooOOOo = cursorOooOOO.getLong(i19);
                    int i20 = iOooO00o24;
                    o0oooo1.f30168OooOOo0 = cursorOooOOO.getInt(i20) != 0;
                    int i21 = iOooO00o25;
                    o0oooo1.f30167OooOOo = o0ooOOo.OooO0Oo(cursorOooOOO.getInt(i21));
                    o0oooo1.f30160OooOO0 = oooOO0O;
                    arrayList.add(o0oooo1);
                    iOooO00o2 = i6;
                    iOooO00o25 = i21;
                    iOooO00o13 = i10;
                    iOooO00o15 = i9;
                    iOooO00o16 = i11;
                    iOooO00o18 = i14;
                    iOooO00o23 = i19;
                    iOooO00o9 = i3;
                    iOooO00o11 = i4;
                    iOooO00o = i5;
                    iOooO00o24 = i20;
                    iOooO00o22 = i18;
                    iOooO00o3 = i7;
                    iOooO00o20 = i16;
                    iOooO00o4 = i12;
                    iOooO00o19 = i15;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList;
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

    public final List<o0OoOo0> OooO0Oo() throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
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
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    String string = cursorOooOOO.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooOOO.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    p102o000oo.OooOO0O oooOO0O = new p102o000oo.OooOO0O();
                    int i4 = iOooO00o;
                    oooOO0O.f29789OooO00o = o0ooOOo.OooO0OO(cursorOooOOO.getInt(iOooO00o));
                    oooOO0O.f29790OooO0O0 = cursorOooOOO.getInt(iOooO00o2) != 0;
                    oooOO0O.f29791OooO0OO = cursorOooOOO.getInt(iOooO00o3) != 0;
                    oooOO0O.f29792OooO0Oo = cursorOooOOO.getInt(iOooO00o4) != 0;
                    oooOO0O.f29794OooO0o0 = cursorOooOOO.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    int i6 = iOooO00o3;
                    oooOO0O.f29793OooO0o = cursorOooOOO.getLong(iOooO00o6);
                    oooOO0O.f29795OooO0oO = cursorOooOOO.getLong(iOooO00o7);
                    oooOO0O.f29796OooO0oo = o0ooOOo.OooO00o(cursorOooOOO.getBlob(iOooO00o8));
                    o0OoOo0 o0oooo1 = new o0OoOo0(string, string2);
                    o0oooo1.f30153OooO0O0 = o0ooOOo.OooO0o0(cursorOooOOO.getInt(iOooO00o10));
                    o0oooo1.f30155OooO0Oo = cursorOooOOO.getString(iOooO00o12);
                    o0oooo1.f30157OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(iOooO00o13));
                    int i7 = i;
                    o0oooo1.f30156OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(i7));
                    i = i7;
                    int i8 = iOooO00o15;
                    o0oooo1.f30158OooO0oO = cursorOooOOO.getLong(i8);
                    int i9 = iOooO00o13;
                    int i10 = iOooO00o16;
                    o0oooo1.f30159OooO0oo = cursorOooOOO.getLong(i10);
                    int i11 = iOooO00o4;
                    int i12 = iOooO00o17;
                    o0oooo1.f30151OooO = cursorOooOOO.getLong(i12);
                    int i13 = iOooO00o18;
                    o0oooo1.f30161OooOO0O = cursorOooOOO.getInt(i13);
                    int i14 = iOooO00o19;
                    o0oooo1.f30162OooOO0o = o0ooOOo.OooO0O0(cursorOooOOO.getInt(i14));
                    iOooO00o17 = i12;
                    int i15 = iOooO00o20;
                    o0oooo1.f30164OooOOO0 = cursorOooOOO.getLong(i15);
                    int i16 = iOooO00o21;
                    o0oooo1.f30163OooOOO = cursorOooOOO.getLong(i16);
                    iOooO00o21 = i16;
                    int i17 = iOooO00o22;
                    o0oooo1.f30165OooOOOO = cursorOooOOO.getLong(i17);
                    int i18 = iOooO00o23;
                    o0oooo1.f30166OooOOOo = cursorOooOOO.getLong(i18);
                    int i19 = iOooO00o24;
                    o0oooo1.f30168OooOOo0 = cursorOooOOO.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    o0oooo1.f30167OooOOo = o0ooOOo.OooO0Oo(cursorOooOOO.getInt(i20));
                    o0oooo1.f30160OooOO0 = oooOO0O;
                    arrayList.add(o0oooo1);
                    iOooO00o25 = i20;
                    iOooO00o2 = i5;
                    iOooO00o13 = i9;
                    iOooO00o15 = i8;
                    iOooO00o16 = i10;
                    iOooO00o18 = i13;
                    iOooO00o23 = i18;
                    iOooO00o9 = i2;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o24 = i19;
                    iOooO00o22 = i17;
                    iOooO00o3 = i6;
                    iOooO00o20 = i15;
                    iOooO00o4 = i11;
                    iOooO00o19 = i14;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList;
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

    public final WorkInfo$State OooO0o(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return cursorOooOOO.moveToFirst() ? o0ooOOo.OooO0o0(cursorOooOOO.getInt(0)) : null;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    public final List<o0OoOo0> OooO0o0() throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
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
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    String string = cursorOooOOO.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooOOO.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    p102o000oo.OooOO0O oooOO0O = new p102o000oo.OooOO0O();
                    int i4 = iOooO00o;
                    oooOO0O.f29789OooO00o = o0ooOOo.OooO0OO(cursorOooOOO.getInt(iOooO00o));
                    oooOO0O.f29790OooO0O0 = cursorOooOOO.getInt(iOooO00o2) != 0;
                    oooOO0O.f29791OooO0OO = cursorOooOOO.getInt(iOooO00o3) != 0;
                    oooOO0O.f29792OooO0Oo = cursorOooOOO.getInt(iOooO00o4) != 0;
                    oooOO0O.f29794OooO0o0 = cursorOooOOO.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    int i6 = iOooO00o3;
                    oooOO0O.f29793OooO0o = cursorOooOOO.getLong(iOooO00o6);
                    oooOO0O.f29795OooO0oO = cursorOooOOO.getLong(iOooO00o7);
                    oooOO0O.f29796OooO0oo = o0ooOOo.OooO00o(cursorOooOOO.getBlob(iOooO00o8));
                    o0OoOo0 o0oooo1 = new o0OoOo0(string, string2);
                    o0oooo1.f30153OooO0O0 = o0ooOOo.OooO0o0(cursorOooOOO.getInt(iOooO00o10));
                    o0oooo1.f30155OooO0Oo = cursorOooOOO.getString(iOooO00o12);
                    o0oooo1.f30157OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(iOooO00o13));
                    int i7 = i;
                    o0oooo1.f30156OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(i7));
                    i = i7;
                    int i8 = iOooO00o15;
                    o0oooo1.f30158OooO0oO = cursorOooOOO.getLong(i8);
                    int i9 = iOooO00o13;
                    int i10 = iOooO00o16;
                    o0oooo1.f30159OooO0oo = cursorOooOOO.getLong(i10);
                    int i11 = iOooO00o4;
                    int i12 = iOooO00o17;
                    o0oooo1.f30151OooO = cursorOooOOO.getLong(i12);
                    int i13 = iOooO00o18;
                    o0oooo1.f30161OooOO0O = cursorOooOOO.getInt(i13);
                    int i14 = iOooO00o19;
                    o0oooo1.f30162OooOO0o = o0ooOOo.OooO0O0(cursorOooOOO.getInt(i14));
                    iOooO00o17 = i12;
                    int i15 = iOooO00o20;
                    o0oooo1.f30164OooOOO0 = cursorOooOOO.getLong(i15);
                    int i16 = iOooO00o21;
                    o0oooo1.f30163OooOOO = cursorOooOOO.getLong(i16);
                    iOooO00o21 = i16;
                    int i17 = iOooO00o22;
                    o0oooo1.f30165OooOOOO = cursorOooOOO.getLong(i17);
                    int i18 = iOooO00o23;
                    o0oooo1.f30166OooOOOo = cursorOooOOO.getLong(i18);
                    int i19 = iOooO00o24;
                    o0oooo1.f30168OooOOo0 = cursorOooOOO.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    o0oooo1.f30167OooOOo = o0ooOOo.OooO0Oo(cursorOooOOO.getInt(i20));
                    o0oooo1.f30160OooOO0 = oooOO0O;
                    arrayList.add(o0oooo1);
                    iOooO00o25 = i20;
                    iOooO00o2 = i5;
                    iOooO00o13 = i9;
                    iOooO00o15 = i8;
                    iOooO00o16 = i10;
                    iOooO00o18 = i13;
                    iOooO00o23 = i18;
                    iOooO00o9 = i2;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o24 = i19;
                    iOooO00o22 = i17;
                    iOooO00o3 = i6;
                    iOooO00o20 = i15;
                    iOooO00o4 = i11;
                    iOooO00o19 = i14;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList;
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

    public final List<String> OooO0oO(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
            while (cursorOooOOO.moveToNext()) {
                arrayList.add(cursorOooOOO.getString(0));
            }
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            return arrayList;
        } catch (Throwable th) {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            throw th;
        }
    }

    public final o0OoOo0 OooO0oo(String str) {
        o0000O0 o0000o1;
        o0OoOo0 o0oooo1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30139OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30139OooO00o.OooOOO(o0000o0OooO0o);
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
                if (cursorOooOOO.moveToFirst()) {
                    String string = cursorOooOOO.getString(iOooO00o9);
                    String string2 = cursorOooOOO.getString(iOooO00o11);
                    p102o000oo.OooOO0O oooOO0O = new p102o000oo.OooOO0O();
                    oooOO0O.f29789OooO00o = o0ooOOo.OooO0OO(cursorOooOOO.getInt(iOooO00o));
                    oooOO0O.f29790OooO0O0 = cursorOooOOO.getInt(iOooO00o2) != 0;
                    oooOO0O.f29791OooO0OO = cursorOooOOO.getInt(iOooO00o3) != 0;
                    oooOO0O.f29792OooO0Oo = cursorOooOOO.getInt(iOooO00o4) != 0;
                    oooOO0O.f29794OooO0o0 = cursorOooOOO.getInt(iOooO00o5) != 0;
                    oooOO0O.f29793OooO0o = cursorOooOOO.getLong(iOooO00o6);
                    oooOO0O.f29795OooO0oO = cursorOooOOO.getLong(iOooO00o7);
                    oooOO0O.f29796OooO0oo = o0ooOOo.OooO00o(cursorOooOOO.getBlob(iOooO00o8));
                    o0oooo1 = new o0OoOo0(string, string2);
                    o0oooo1.f30153OooO0O0 = o0ooOOo.OooO0o0(cursorOooOOO.getInt(iOooO00o10));
                    o0oooo1.f30155OooO0Oo = cursorOooOOO.getString(iOooO00o12);
                    o0oooo1.f30157OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(iOooO00o13));
                    o0oooo1.f30156OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(iOooO00o14));
                    o0oooo1.f30158OooO0oO = cursorOooOOO.getLong(iOooO00o15);
                    o0oooo1.f30159OooO0oo = cursorOooOOO.getLong(iOooO00o16);
                    o0oooo1.f30151OooO = cursorOooOOO.getLong(iOooO00o17);
                    o0oooo1.f30161OooOO0O = cursorOooOOO.getInt(iOooO00o18);
                    o0oooo1.f30162OooOO0o = o0ooOOo.OooO0O0(cursorOooOOO.getInt(iOooO00o19));
                    o0oooo1.f30164OooOOO0 = cursorOooOOO.getLong(iOooO00o20);
                    o0oooo1.f30163OooOOO = cursorOooOOO.getLong(iOooO00o21);
                    o0oooo1.f30165OooOOOO = cursorOooOOO.getLong(iOooO00o22);
                    o0oooo1.f30166OooOOOo = cursorOooOOO.getLong(iOooO00o23);
                    o0oooo1.f30168OooOOo0 = cursorOooOOO.getInt(iOooO00o24) != 0;
                    o0oooo1.f30167OooOOo = o0ooOOo.OooO0Oo(cursorOooOOO.getInt(iOooO00o25));
                    o0oooo1.f30160OooOO0 = oooOO0O;
                } else {
                    o0oooo1 = null;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return o0oooo1;
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

    public final int OooOO0(String str) {
        this.f30139OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30143OooO0o.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        this.f30139OooO00o.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30139OooO00o.OooOOOO();
            return iExecuteUpdateDelete;
        } finally {
            this.f30139OooO00o.OooOO0O();
            this.f30143OooO0o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final int OooOO0O(String str, long j) {
        this.f30139OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30146OooO0oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        this.f30139OooO00o.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30139OooO00o.OooOOOO();
            return iExecuteUpdateDelete;
        } finally {
            this.f30139OooO00o.OooOO0O();
            this.f30146OooO0oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final int OooOO0o(String str) {
        this.f30139OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30145OooO0oO.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        this.f30139OooO00o.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30139OooO00o.OooOOOO();
            return iExecuteUpdateDelete;
        } finally {
            this.f30139OooO00o.OooOO0O();
            this.f30145OooO0oO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final void OooOOO(String str, long j) {
        this.f30139OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30144OooO0o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        this.f30139OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30139OooO00o.OooOOOO();
        } finally {
            this.f30139OooO00o.OooOO0O();
            this.f30144OooO0o0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final void OooOOO0(String str, androidx.work.OooO0O0 oooO0O0) throws Throwable {
        this.f30139OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30142OooO0Oo.OooO00o();
        byte[] bArrOooO0O0 = androidx.work.OooO0O0.OooO0O0(oooO0O0);
        if (bArrOooO0O0 == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindBlob(1, bArrOooO0O0);
        }
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        this.f30139OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30139OooO00o.OooOOOO();
        } finally {
            this.f30139OooO00o.OooOO0O();
            this.f30142OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final int OooOOOO(WorkInfo$State workInfo$State, String... strArr) {
        this.f30139OooO00o.OooO0O0();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        RoomDatabase roomDatabase = this.f30139OooO00o;
        roomDatabase.OooO00o();
        roomDatabase.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = roomDatabase.f9293OooO0Oo.getWritableDatabase().compileStatement(string);
        supportSQLiteStatementCompileStatement.bindLong(1, o0ooOOo.OooO0o(workInfo$State));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(i2);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i2, str);
            }
            i2++;
        }
        this.f30139OooO00o.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.f30139OooO00o.OooOOOO();
            return iExecuteUpdateDelete;
        } finally {
            this.f30139OooO00o.OooOO0O();
        }
    }
}
