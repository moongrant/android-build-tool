package o00O0OO;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o implements oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Oooo000 f36237OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f36238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f36239OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f36240OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f36241OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOOO f36242OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO f36243OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo00 f36244OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo f36245OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO00o f36246OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0O0 f36247OooOO0O;

    public class OooO extends p110o000ooo0.o0OO00O<o00Ooo> {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p110o000ooo0.o0OO00O
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o00Ooo o00ooo2) throws Throwable {
            int i;
            o00Ooo o00ooo3 = o00ooo2;
            String str = o00ooo3.f36216OooO00o;
            int i2 = 1;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, oo0o0Oo.OooO0oo(o00ooo3.f36217OooO0O0));
            String str2 = o00ooo3.f36218OooO0OO;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = o00ooo3.f36219OooO0Oo;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] bArrOooO0OO = androidx.work.OooO0O0.OooO0OO(o00ooo3.f36221OooO0o0);
            if (bArrOooO0OO == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, bArrOooO0OO);
            }
            byte[] bArrOooO0OO2 = androidx.work.OooO0O0.OooO0OO(o00ooo3.f36220OooO0o);
            if (bArrOooO0OO2 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, bArrOooO0OO2);
            }
            supportSQLiteStatement.bindLong(7, o00ooo3.f36222OooO0oO);
            supportSQLiteStatement.bindLong(8, o00ooo3.f36223OooO0oo);
            supportSQLiteStatement.bindLong(9, o00ooo3.f36215OooO);
            supportSQLiteStatement.bindLong(10, o00ooo3.f36225OooOO0O);
            BackoffPolicy backoffPolicy = o00ooo3.f36226OooOO0o;
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            int i3 = oo0o0Oo.OooO00o.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
            if (i3 == 1) {
                i = 0;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            supportSQLiteStatement.bindLong(11, i);
            supportSQLiteStatement.bindLong(12, o00ooo3.f36228OooOOO0);
            supportSQLiteStatement.bindLong(13, o00ooo3.f36227OooOOO);
            supportSQLiteStatement.bindLong(14, o00ooo3.f36229OooOOOO);
            supportSQLiteStatement.bindLong(15, o00ooo3.f36230OooOOOo);
            supportSQLiteStatement.bindLong(16, o00ooo3.f36232OooOOo0 ? 1L : 0L);
            OutOfQuotaPolicy policy = o00ooo3.f36231OooOOo;
            Intrinsics.checkNotNullParameter(policy, "policy");
            int i4 = oo0o0Oo.OooO00o.$EnumSwitchMapping$3[policy.ordinal()];
            if (i4 == 1) {
                i2 = 0;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            supportSQLiteStatement.bindLong(17, i2);
            supportSQLiteStatement.bindLong(18, o00ooo3.f36233OooOOoo);
            supportSQLiteStatement.bindLong(19, o00ooo3.f36234OooOo00);
            p115o00O00oO.Oooo0 oooo0 = o00ooo3.f36224OooOO0;
            if (oooo0 == null) {
                androidx.compose.runtime.OooO0OO.OooO0O0(supportSQLiteStatement, 20, 21, 22, 23);
                androidx.compose.runtime.OooO0OO.OooO0O0(supportSQLiteStatement, 24, 25, 26, 27);
                return;
            }
            supportSQLiteStatement.bindLong(20, oo0o0Oo.OooO0o(oooo0.f36131OooO00o));
            supportSQLiteStatement.bindLong(21, oooo0.f36132OooO0O0 ? 1L : 0L);
            supportSQLiteStatement.bindLong(22, oooo0.f36133OooO0OO ? 1L : 0L);
            supportSQLiteStatement.bindLong(23, oooo0.f36134OooO0Oo ? 1L : 0L);
            supportSQLiteStatement.bindLong(24, oooo0.f36136OooO0o0 ? 1L : 0L);
            supportSQLiteStatement.bindLong(25, oooo0.f36135OooO0o);
            supportSQLiteStatement.bindLong(26, oooo0.f36137OooO0oO);
            byte[] bArrOooO0oO = oo0o0Oo.OooO0oO(oooo0.f36138OooO0oo);
            if (bArrOooO0oO == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindBlob(27, bArrOooO0oO);
            }
        }
    }

    public class OooO00o extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class OooO0O0 extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class OooO0OO extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public class OooO0o extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    public class OooOO0 extends p110o000ooo0.o0Oo0oo<o00Ooo> {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // p110o000ooo0.o0Oo0oo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o00Ooo o00ooo2) throws Throwable {
            int i;
            o00Ooo o00ooo3 = o00ooo2;
            String str = o00ooo3.f36216OooO00o;
            int i2 = 1;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, oo0o0Oo.OooO0oo(o00ooo3.f36217OooO0O0));
            String str2 = o00ooo3.f36218OooO0OO;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = o00ooo3.f36219OooO0Oo;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] bArrOooO0OO = androidx.work.OooO0O0.OooO0OO(o00ooo3.f36221OooO0o0);
            if (bArrOooO0OO == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, bArrOooO0OO);
            }
            byte[] bArrOooO0OO2 = androidx.work.OooO0O0.OooO0OO(o00ooo3.f36220OooO0o);
            if (bArrOooO0OO2 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, bArrOooO0OO2);
            }
            supportSQLiteStatement.bindLong(7, o00ooo3.f36222OooO0oO);
            supportSQLiteStatement.bindLong(8, o00ooo3.f36223OooO0oo);
            supportSQLiteStatement.bindLong(9, o00ooo3.f36215OooO);
            supportSQLiteStatement.bindLong(10, o00ooo3.f36225OooOO0O);
            BackoffPolicy backoffPolicy = o00ooo3.f36226OooOO0o;
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            int i3 = oo0o0Oo.OooO00o.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
            if (i3 == 1) {
                i = 0;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            supportSQLiteStatement.bindLong(11, i);
            supportSQLiteStatement.bindLong(12, o00ooo3.f36228OooOOO0);
            supportSQLiteStatement.bindLong(13, o00ooo3.f36227OooOOO);
            supportSQLiteStatement.bindLong(14, o00ooo3.f36229OooOOOO);
            supportSQLiteStatement.bindLong(15, o00ooo3.f36230OooOOOo);
            supportSQLiteStatement.bindLong(16, o00ooo3.f36232OooOOo0 ? 1L : 0L);
            OutOfQuotaPolicy policy = o00ooo3.f36231OooOOo;
            Intrinsics.checkNotNullParameter(policy, "policy");
            int i4 = oo0o0Oo.OooO00o.$EnumSwitchMapping$3[policy.ordinal()];
            if (i4 == 1) {
                i2 = 0;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            supportSQLiteStatement.bindLong(17, i2);
            supportSQLiteStatement.bindLong(18, o00ooo3.f36233OooOOoo);
            supportSQLiteStatement.bindLong(19, o00ooo3.f36234OooOo00);
            p115o00O00oO.Oooo0 oooo0 = o00ooo3.f36224OooOO0;
            if (oooo0 != null) {
                supportSQLiteStatement.bindLong(20, oo0o0Oo.OooO0o(oooo0.f36131OooO00o));
                supportSQLiteStatement.bindLong(21, oooo0.f36132OooO0O0 ? 1L : 0L);
                supportSQLiteStatement.bindLong(22, oooo0.f36133OooO0OO ? 1L : 0L);
                supportSQLiteStatement.bindLong(23, oooo0.f36134OooO0Oo ? 1L : 0L);
                supportSQLiteStatement.bindLong(24, oooo0.f36136OooO0o0 ? 1L : 0L);
                supportSQLiteStatement.bindLong(25, oooo0.f36135OooO0o);
                supportSQLiteStatement.bindLong(26, oooo0.f36137OooO0oO);
                byte[] bArrOooO0oO = oo0o0Oo.OooO0oO(oooo0.f36138OooO0oo);
                if (bArrOooO0oO == null) {
                    supportSQLiteStatement.bindNull(27);
                } else {
                    supportSQLiteStatement.bindBlob(27, bArrOooO0oO);
                }
            } else {
                androidx.compose.runtime.OooO0OO.OooO0O0(supportSQLiteStatement, 20, 21, 22, 23);
                androidx.compose.runtime.OooO0OO.OooO0O0(supportSQLiteStatement, 24, 25, 26, 27);
            }
            String str4 = o00ooo3.f36216OooO00o;
            if (str4 == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindString(28, str4);
            }
        }
    }

    public class OooOO0O extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class OooOOO extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    public class OooOOO0 extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    public class OooOOOO extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class OooOo extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class OooOo00 extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    public class Oooo000 extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public o00oO0o(RoomDatabase roomDatabase) {
        this.f36238OooO00o = roomDatabase;
        this.f36239OooO0O0 = new OooO(roomDatabase);
        new OooOO0(roomDatabase);
        this.f36240OooO0OO = new OooOO0O(roomDatabase);
        this.f36241OooO0Oo = new OooOOO0(roomDatabase);
        this.f36243OooO0o0 = new OooOOO(roomDatabase);
        this.f36242OooO0o = new OooOOOO(roomDatabase);
        this.f36244OooO0oO = new OooOo00(roomDatabase);
        this.f36245OooO0oo = new OooOo(roomDatabase);
        this.f36237OooO = new Oooo000(roomDatabase);
        this.f36246OooOO0 = new OooO00o(roomDatabase);
        this.f36247OooOO0O = new OooO0O0(roomDatabase);
        new OooO0OO(roomDatabase);
        new OooO0o(roomDatabase);
    }

    @Override // o00O0OO.oo000o
    public final ArrayList OooO(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(0) ? null : cursorOooO0O0.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.oo000o
    public final void OooO00o(String str) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooOO0O oooOO0O = this.f36240OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOO0O.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oooOO0O.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final void OooO0O0(String str) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooOOO oooOOO = this.f36243OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOOO.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oooOOO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final int OooO0OO(long j, String str) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooO00o oooO00o = this.f36246OooOO0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO00o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            oooO00o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final ArrayList OooO0Oo(long j) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "output");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
            int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
            int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
            int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
            int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
            int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
            int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "last_enqueue_time");
            int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "period_count");
                int iOooO00o19 = o00.OooO00o.OooO00o(cursorOooO0O0, "generation");
                int iOooO00o20 = o00.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
                int iOooO00o21 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
                int iOooO00o22 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
                int iOooO00o23 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
                int iOooO00o24 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
                int iOooO00o25 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
                int iOooO00o26 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
                int iOooO00o27 = o00.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorOooO0O0.isNull(iOooO00o) ? null : cursorOooO0O0.getString(iOooO00o);
                    WorkInfo$State workInfo$StateOooO0o0 = oo0o0Oo.OooO0o0(cursorOooO0O0.getInt(iOooO00o2));
                    String string2 = cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3);
                    String string3 = cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4);
                    androidx.work.OooO0O0 oooO0O0OooO00o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getBlob(iOooO00o5));
                    androidx.work.OooO0O0 oooO0O0OooO00o2 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getBlob(iOooO00o6));
                    long j2 = cursorOooO0O0.getLong(iOooO00o7);
                    long j3 = cursorOooO0O0.getLong(iOooO00o8);
                    long j4 = cursorOooO0O0.getLong(iOooO00o9);
                    int i2 = cursorOooO0O0.getInt(iOooO00o10);
                    BackoffPolicy backoffPolicyOooO0O0 = oo0o0Oo.OooO0O0(cursorOooO0O0.getInt(iOooO00o11));
                    long j5 = cursorOooO0O0.getLong(iOooO00o12);
                    long j6 = cursorOooO0O0.getLong(iOooO00o13);
                    int i3 = i;
                    long j7 = cursorOooO0O0.getLong(i3);
                    int i4 = iOooO00o;
                    int i5 = iOooO00o15;
                    long j8 = cursorOooO0O0.getLong(i5);
                    iOooO00o15 = i5;
                    int i6 = iOooO00o16;
                    int i7 = cursorOooO0O0.getInt(i6);
                    iOooO00o16 = i6;
                    int i8 = iOooO00o17;
                    boolean z = i7 != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyOooO0Oo = oo0o0Oo.OooO0Oo(cursorOooO0O0.getInt(i8));
                    iOooO00o17 = i8;
                    int i9 = iOooO00o18;
                    int i10 = cursorOooO0O0.getInt(i9);
                    iOooO00o18 = i9;
                    int i11 = iOooO00o19;
                    int i12 = cursorOooO0O0.getInt(i11);
                    iOooO00o19 = i11;
                    int i13 = iOooO00o20;
                    NetworkType networkTypeOooO0OO = oo0o0Oo.OooO0OO(cursorOooO0O0.getInt(i13));
                    iOooO00o20 = i13;
                    iOooO00o21 = iOooO00o21;
                    boolean z2 = cursorOooO0O0.getInt(iOooO00o21) != 0;
                    boolean z3 = cursorOooO0O0.getInt(iOooO00o22) != 0;
                    boolean z4 = cursorOooO0O0.getInt(iOooO00o23) != 0;
                    boolean z5 = cursorOooO0O0.getInt(iOooO00o24) != 0;
                    long j9 = cursorOooO0O0.getLong(iOooO00o25);
                    iOooO00o25 = iOooO00o25;
                    int i14 = iOooO00o26;
                    long j10 = cursorOooO0O0.getLong(i14);
                    iOooO00o26 = i14;
                    int i15 = iOooO00o27;
                    if (!cursorOooO0O0.isNull(i15)) {
                        blob = cursorOooO0O0.getBlob(i15);
                    }
                    iOooO00o27 = i15;
                    arrayList.add(new o00Ooo(string, workInfo$StateOooO0o0, string2, string3, oooO0O0OooO00o, oooO0O0OooO00o2, j2, j3, j4, new p115o00O00oO.Oooo0(networkTypeOooO0OO, z2, z3, z4, z5, j9, j10, oo0o0Oo.OooO00o(blob)), i2, backoffPolicyOooO0O0, j5, j6, j7, j8, z, outOfQuotaPolicyOooO0Oo, i10, i12));
                    iOooO00o = i4;
                    i = i3;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList;
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

    @Override // o00O0OO.oo000o
    public final ArrayList OooO0o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(cursorOooO0O0.isNull(0) ? null : cursorOooO0O0.getString(0));
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.oo000o
    public final ArrayList OooO0o0() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "output");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
            int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
            int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
            int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
            int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
            int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
            int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "last_enqueue_time");
            int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "period_count");
                int iOooO00o19 = o00.OooO00o.OooO00o(cursorOooO0O0, "generation");
                int iOooO00o20 = o00.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
                int iOooO00o21 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
                int iOooO00o22 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
                int iOooO00o23 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
                int iOooO00o24 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
                int iOooO00o25 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
                int iOooO00o26 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
                int iOooO00o27 = o00.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorOooO0O0.isNull(iOooO00o) ? null : cursorOooO0O0.getString(iOooO00o);
                    WorkInfo$State workInfo$StateOooO0o0 = oo0o0Oo.OooO0o0(cursorOooO0O0.getInt(iOooO00o2));
                    String string2 = cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3);
                    String string3 = cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4);
                    androidx.work.OooO0O0 oooO0O0OooO00o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getBlob(iOooO00o5));
                    androidx.work.OooO0O0 oooO0O0OooO00o2 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getBlob(iOooO00o6));
                    long j = cursorOooO0O0.getLong(iOooO00o7);
                    long j2 = cursorOooO0O0.getLong(iOooO00o8);
                    long j3 = cursorOooO0O0.getLong(iOooO00o9);
                    int i2 = cursorOooO0O0.getInt(iOooO00o10);
                    BackoffPolicy backoffPolicyOooO0O0 = oo0o0Oo.OooO0O0(cursorOooO0O0.getInt(iOooO00o11));
                    long j4 = cursorOooO0O0.getLong(iOooO00o12);
                    long j5 = cursorOooO0O0.getLong(iOooO00o13);
                    int i3 = i;
                    long j6 = cursorOooO0O0.getLong(i3);
                    int i4 = iOooO00o;
                    int i5 = iOooO00o15;
                    long j7 = cursorOooO0O0.getLong(i5);
                    iOooO00o15 = i5;
                    iOooO00o16 = iOooO00o16;
                    boolean z = cursorOooO0O0.getInt(iOooO00o16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyOooO0Oo = oo0o0Oo.OooO0Oo(cursorOooO0O0.getInt(iOooO00o17));
                    iOooO00o17 = iOooO00o17;
                    int i6 = iOooO00o18;
                    int i7 = cursorOooO0O0.getInt(i6);
                    iOooO00o18 = i6;
                    int i8 = iOooO00o19;
                    int i9 = cursorOooO0O0.getInt(i8);
                    iOooO00o19 = i8;
                    int i10 = iOooO00o20;
                    NetworkType networkTypeOooO0OO = oo0o0Oo.OooO0OO(cursorOooO0O0.getInt(i10));
                    iOooO00o20 = i10;
                    iOooO00o21 = iOooO00o21;
                    boolean z2 = cursorOooO0O0.getInt(iOooO00o21) != 0;
                    boolean z3 = cursorOooO0O0.getInt(iOooO00o22) != 0;
                    boolean z4 = cursorOooO0O0.getInt(iOooO00o23) != 0;
                    boolean z5 = cursorOooO0O0.getInt(iOooO00o24) != 0;
                    long j8 = cursorOooO0O0.getLong(iOooO00o25);
                    iOooO00o25 = iOooO00o25;
                    int i11 = iOooO00o26;
                    long j9 = cursorOooO0O0.getLong(i11);
                    iOooO00o26 = i11;
                    int i12 = iOooO00o27;
                    if (!cursorOooO0O0.isNull(i12)) {
                        blob = cursorOooO0O0.getBlob(i12);
                    }
                    iOooO00o27 = i12;
                    arrayList.add(new o00Ooo(string, workInfo$StateOooO0o0, string2, string3, oooO0O0OooO00o, oooO0O0OooO00o2, j, j2, j3, new p115o00O00oO.Oooo0(networkTypeOooO0OO, z2, z3, z4, z5, j8, j9, oo0o0Oo.OooO00o(blob)), i2, backoffPolicyOooO0O0, j4, j5, j6, j7, z, outOfQuotaPolicyOooO0Oo, i7, i9));
                    iOooO00o = i4;
                    i = i3;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList;
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

    @Override // o00O0OO.oo000o
    public final WorkInfo$State OooO0oO(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            WorkInfo$State workInfo$StateOooO0o0 = null;
            if (cursorOooO0O0.moveToFirst()) {
                Integer numValueOf = cursorOooO0O0.isNull(0) ? null : Integer.valueOf(cursorOooO0O0.getInt(0));
                if (numValueOf != null) {
                    workInfo$StateOooO0o0 = oo0o0Oo.OooO0o0(numValueOf.intValue());
                }
            }
            return workInfo$StateOooO0o0;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.oo000o
    public final o00Ooo OooO0oo(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "output");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
            int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
            int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
            int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
            int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
            int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
            int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "last_enqueue_time");
            int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "period_count");
                int iOooO00o19 = o00.OooO00o.OooO00o(cursorOooO0O0, "generation");
                int iOooO00o20 = o00.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
                int iOooO00o21 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
                int iOooO00o22 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
                int iOooO00o23 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
                int iOooO00o24 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
                int iOooO00o25 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
                int iOooO00o26 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
                int iOooO00o27 = o00.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
                o00Ooo o00ooo2 = null;
                byte[] blob = null;
                if (cursorOooO0O0.moveToFirst()) {
                    String string = cursorOooO0O0.isNull(iOooO00o) ? null : cursorOooO0O0.getString(iOooO00o);
                    WorkInfo$State workInfo$StateOooO0o0 = oo0o0Oo.OooO0o0(cursorOooO0O0.getInt(iOooO00o2));
                    String string2 = cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3);
                    String string3 = cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4);
                    androidx.work.OooO0O0 oooO0O0OooO00o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getBlob(iOooO00o5));
                    androidx.work.OooO0O0 oooO0O0OooO00o2 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getBlob(iOooO00o6));
                    long j = cursorOooO0O0.getLong(iOooO00o7);
                    long j2 = cursorOooO0O0.getLong(iOooO00o8);
                    long j3 = cursorOooO0O0.getLong(iOooO00o9);
                    int i = cursorOooO0O0.getInt(iOooO00o10);
                    BackoffPolicy backoffPolicyOooO0O0 = oo0o0Oo.OooO0O0(cursorOooO0O0.getInt(iOooO00o11));
                    long j4 = cursorOooO0O0.getLong(iOooO00o12);
                    long j5 = cursorOooO0O0.getLong(iOooO00o13);
                    long j6 = cursorOooO0O0.getLong(iOooO00o14);
                    long j7 = cursorOooO0O0.getLong(iOooO00o15);
                    boolean z = cursorOooO0O0.getInt(iOooO00o16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyOooO0Oo = oo0o0Oo.OooO0Oo(cursorOooO0O0.getInt(iOooO00o17));
                    int i2 = cursorOooO0O0.getInt(iOooO00o18);
                    int i3 = cursorOooO0O0.getInt(iOooO00o19);
                    NetworkType networkTypeOooO0OO = oo0o0Oo.OooO0OO(cursorOooO0O0.getInt(iOooO00o20));
                    boolean z2 = cursorOooO0O0.getInt(iOooO00o21) != 0;
                    boolean z3 = cursorOooO0O0.getInt(iOooO00o22) != 0;
                    boolean z4 = cursorOooO0O0.getInt(iOooO00o23) != 0;
                    boolean z5 = cursorOooO0O0.getInt(iOooO00o24) != 0;
                    long j8 = cursorOooO0O0.getLong(iOooO00o25);
                    long j9 = cursorOooO0O0.getLong(iOooO00o26);
                    if (!cursorOooO0O0.isNull(iOooO00o27)) {
                        blob = cursorOooO0O0.getBlob(iOooO00o27);
                    }
                    o00ooo2 = new o00Ooo(string, workInfo$StateOooO0o0, string2, string3, oooO0O0OooO00o, oooO0O0OooO00o2, j, j2, j3, new p115o00O00oO.Oooo0(networkTypeOooO0OO, z2, z3, z4, z5, j8, j9, oo0o0Oo.OooO00o(blob)), i, backoffPolicyOooO0O0, j4, j5, j6, j7, z, outOfQuotaPolicyOooO0Oo, i2, i3);
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return o00ooo2;
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

    @Override // o00O0OO.oo000o
    public final int OooOO0() {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooO0O0 oooO0O0 = this.f36247OooOO0O;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0O0.OooO00o();
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            oooO0O0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final ArrayList OooOO0O() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        roomSQLiteQueryOooO00o.bindLong(1, 200);
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "output");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
            int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
            int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
            int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
            int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
            int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
            int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "last_enqueue_time");
            int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "period_count");
                int iOooO00o19 = o00.OooO00o.OooO00o(cursorOooO0O0, "generation");
                int iOooO00o20 = o00.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
                int iOooO00o21 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
                int iOooO00o22 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
                int iOooO00o23 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
                int iOooO00o24 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
                int iOooO00o25 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
                int iOooO00o26 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
                int iOooO00o27 = o00.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorOooO0O0.isNull(iOooO00o) ? null : cursorOooO0O0.getString(iOooO00o);
                    WorkInfo$State workInfo$StateOooO0o0 = oo0o0Oo.OooO0o0(cursorOooO0O0.getInt(iOooO00o2));
                    String string2 = cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3);
                    String string3 = cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4);
                    androidx.work.OooO0O0 oooO0O0OooO00o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getBlob(iOooO00o5));
                    androidx.work.OooO0O0 oooO0O0OooO00o2 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getBlob(iOooO00o6));
                    long j = cursorOooO0O0.getLong(iOooO00o7);
                    long j2 = cursorOooO0O0.getLong(iOooO00o8);
                    long j3 = cursorOooO0O0.getLong(iOooO00o9);
                    int i2 = cursorOooO0O0.getInt(iOooO00o10);
                    BackoffPolicy backoffPolicyOooO0O0 = oo0o0Oo.OooO0O0(cursorOooO0O0.getInt(iOooO00o11));
                    long j4 = cursorOooO0O0.getLong(iOooO00o12);
                    long j5 = cursorOooO0O0.getLong(iOooO00o13);
                    int i3 = i;
                    long j6 = cursorOooO0O0.getLong(i3);
                    int i4 = iOooO00o;
                    int i5 = iOooO00o15;
                    long j7 = cursorOooO0O0.getLong(i5);
                    iOooO00o15 = i5;
                    iOooO00o16 = iOooO00o16;
                    boolean z = cursorOooO0O0.getInt(iOooO00o16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyOooO0Oo = oo0o0Oo.OooO0Oo(cursorOooO0O0.getInt(iOooO00o17));
                    iOooO00o17 = iOooO00o17;
                    int i6 = iOooO00o18;
                    int i7 = cursorOooO0O0.getInt(i6);
                    iOooO00o18 = i6;
                    int i8 = iOooO00o19;
                    int i9 = cursorOooO0O0.getInt(i8);
                    iOooO00o19 = i8;
                    int i10 = iOooO00o20;
                    NetworkType networkTypeOooO0OO = oo0o0Oo.OooO0OO(cursorOooO0O0.getInt(i10));
                    iOooO00o20 = i10;
                    iOooO00o21 = iOooO00o21;
                    boolean z2 = cursorOooO0O0.getInt(iOooO00o21) != 0;
                    boolean z3 = cursorOooO0O0.getInt(iOooO00o22) != 0;
                    boolean z4 = cursorOooO0O0.getInt(iOooO00o23) != 0;
                    boolean z5 = cursorOooO0O0.getInt(iOooO00o24) != 0;
                    long j8 = cursorOooO0O0.getLong(iOooO00o25);
                    iOooO00o25 = iOooO00o25;
                    int i11 = iOooO00o26;
                    long j9 = cursorOooO0O0.getLong(i11);
                    iOooO00o26 = i11;
                    int i12 = iOooO00o27;
                    if (!cursorOooO0O0.isNull(i12)) {
                        blob = cursorOooO0O0.getBlob(i12);
                    }
                    iOooO00o27 = i12;
                    arrayList.add(new o00Ooo(string, workInfo$StateOooO0o0, string2, string3, oooO0O0OooO00o, oooO0O0OooO00o2, j, j2, j3, new p115o00O00oO.Oooo0(networkTypeOooO0OO, z2, z3, z4, z5, j8, j9, oo0o0Oo.OooO00o(blob)), i2, backoffPolicyOooO0O0, j4, j5, j6, j7, z, outOfQuotaPolicyOooO0Oo, i7, i9));
                    iOooO00o = i4;
                    i = i3;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList;
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

    @Override // o00O0OO.oo000o
    public final ArrayList OooOO0o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(new o00Ooo.OooO00o(oo0o0Oo.OooO0o0(cursorOooO0O0.getInt(1)), cursorOooO0O0.isNull(0) ? null : cursorOooO0O0.getString(0)));
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.oo000o
    public final int OooOOO(WorkInfo$State workInfo$State, String str) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooOOO0 oooOOO0 = this.f36241OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOOO0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, oo0o0Oo.OooO0oo(workInfo$State));
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            oooOOO0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final ArrayList OooOOO0(int i) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        roomSQLiteQueryOooO00o.bindLong(1, i);
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "output");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
            int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
            int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
            int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
            int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
            int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
            int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "last_enqueue_time");
            int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "period_count");
                int iOooO00o19 = o00.OooO00o.OooO00o(cursorOooO0O0, "generation");
                int iOooO00o20 = o00.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
                int iOooO00o21 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
                int iOooO00o22 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
                int iOooO00o23 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
                int iOooO00o24 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
                int iOooO00o25 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
                int iOooO00o26 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
                int iOooO00o27 = o00.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
                int i2 = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorOooO0O0.isNull(iOooO00o) ? null : cursorOooO0O0.getString(iOooO00o);
                    WorkInfo$State workInfo$StateOooO0o0 = oo0o0Oo.OooO0o0(cursorOooO0O0.getInt(iOooO00o2));
                    String string2 = cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3);
                    String string3 = cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4);
                    androidx.work.OooO0O0 oooO0O0OooO00o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getBlob(iOooO00o5));
                    androidx.work.OooO0O0 oooO0O0OooO00o2 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getBlob(iOooO00o6));
                    long j = cursorOooO0O0.getLong(iOooO00o7);
                    long j2 = cursorOooO0O0.getLong(iOooO00o8);
                    long j3 = cursorOooO0O0.getLong(iOooO00o9);
                    int i3 = cursorOooO0O0.getInt(iOooO00o10);
                    BackoffPolicy backoffPolicyOooO0O0 = oo0o0Oo.OooO0O0(cursorOooO0O0.getInt(iOooO00o11));
                    long j4 = cursorOooO0O0.getLong(iOooO00o12);
                    long j5 = cursorOooO0O0.getLong(iOooO00o13);
                    int i4 = i2;
                    long j6 = cursorOooO0O0.getLong(i4);
                    int i5 = iOooO00o;
                    int i6 = iOooO00o15;
                    long j7 = cursorOooO0O0.getLong(i6);
                    iOooO00o15 = i6;
                    iOooO00o16 = iOooO00o16;
                    boolean z = cursorOooO0O0.getInt(iOooO00o16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyOooO0Oo = oo0o0Oo.OooO0Oo(cursorOooO0O0.getInt(iOooO00o17));
                    iOooO00o17 = iOooO00o17;
                    int i7 = iOooO00o18;
                    int i8 = cursorOooO0O0.getInt(i7);
                    iOooO00o18 = i7;
                    int i9 = iOooO00o19;
                    int i10 = cursorOooO0O0.getInt(i9);
                    iOooO00o19 = i9;
                    int i11 = iOooO00o20;
                    NetworkType networkTypeOooO0OO = oo0o0Oo.OooO0OO(cursorOooO0O0.getInt(i11));
                    iOooO00o20 = i11;
                    iOooO00o21 = iOooO00o21;
                    boolean z2 = cursorOooO0O0.getInt(iOooO00o21) != 0;
                    boolean z3 = cursorOooO0O0.getInt(iOooO00o22) != 0;
                    boolean z4 = cursorOooO0O0.getInt(iOooO00o23) != 0;
                    boolean z5 = cursorOooO0O0.getInt(iOooO00o24) != 0;
                    long j8 = cursorOooO0O0.getLong(iOooO00o25);
                    iOooO00o25 = iOooO00o25;
                    int i12 = iOooO00o26;
                    long j9 = cursorOooO0O0.getLong(i12);
                    iOooO00o26 = i12;
                    int i13 = iOooO00o27;
                    if (!cursorOooO0O0.isNull(i13)) {
                        blob = cursorOooO0O0.getBlob(i13);
                    }
                    iOooO00o27 = i13;
                    arrayList.add(new o00Ooo(string, workInfo$StateOooO0o0, string2, string3, oooO0O0OooO00o, oooO0O0OooO00o2, j, j2, j3, new p115o00O00oO.Oooo0(networkTypeOooO0OO, z2, z3, z4, z5, j8, j9, oo0o0Oo.OooO00o(blob)), i3, backoffPolicyOooO0O0, j4, j5, j6, j7, z, outOfQuotaPolicyOooO0Oo, i8, i10));
                    iOooO00o = i5;
                    i2 = i4;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList;
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

    @Override // o00O0OO.oo000o
    public final void OooOOOO(String str, androidx.work.OooO0O0 oooO0O0) throws Throwable {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooOOOO oooOOOO = this.f36242OooO0o;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOOOO.OooO00o();
        byte[] bArrOooO0OO = androidx.work.OooO0O0.OooO0OO(oooO0O0);
        if (bArrOooO0OO == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindBlob(1, bArrOooO0OO);
        }
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oooOOOO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final void OooOOOo(long j, String str) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooOo00 oooOo00 = this.f36244OooO0oO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOo00.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oooOo00.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final boolean OooOOo() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        boolean z = false;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            if (cursorOooO0O0.moveToFirst() && cursorOooO0O0.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.oo000o
    public final ArrayList OooOOo0() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT * FROM workspec WHERE state=1");
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o4 = o00.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o5 = o00.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o6 = o00.OooO00o.OooO00o(cursorOooO0O0, "output");
            int iOooO00o7 = o00.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
            int iOooO00o8 = o00.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
            int iOooO00o9 = o00.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
            int iOooO00o10 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
            int iOooO00o11 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
            int iOooO00o12 = o00.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
            int iOooO00o13 = o00.OooO00o.OooO00o(cursorOooO0O0, "last_enqueue_time");
            int iOooO00o14 = o00.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o00.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o16 = o00.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o17 = o00.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int iOooO00o18 = o00.OooO00o.OooO00o(cursorOooO0O0, "period_count");
                int iOooO00o19 = o00.OooO00o.OooO00o(cursorOooO0O0, "generation");
                int iOooO00o20 = o00.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
                int iOooO00o21 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
                int iOooO00o22 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
                int iOooO00o23 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
                int iOooO00o24 = o00.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
                int iOooO00o25 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
                int iOooO00o26 = o00.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
                int iOooO00o27 = o00.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorOooO0O0.isNull(iOooO00o) ? null : cursorOooO0O0.getString(iOooO00o);
                    WorkInfo$State workInfo$StateOooO0o0 = oo0o0Oo.OooO0o0(cursorOooO0O0.getInt(iOooO00o2));
                    String string2 = cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3);
                    String string3 = cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4);
                    androidx.work.OooO0O0 oooO0O0OooO00o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getBlob(iOooO00o5));
                    androidx.work.OooO0O0 oooO0O0OooO00o2 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getBlob(iOooO00o6));
                    long j = cursorOooO0O0.getLong(iOooO00o7);
                    long j2 = cursorOooO0O0.getLong(iOooO00o8);
                    long j3 = cursorOooO0O0.getLong(iOooO00o9);
                    int i2 = cursorOooO0O0.getInt(iOooO00o10);
                    BackoffPolicy backoffPolicyOooO0O0 = oo0o0Oo.OooO0O0(cursorOooO0O0.getInt(iOooO00o11));
                    long j4 = cursorOooO0O0.getLong(iOooO00o12);
                    long j5 = cursorOooO0O0.getLong(iOooO00o13);
                    int i3 = i;
                    long j6 = cursorOooO0O0.getLong(i3);
                    int i4 = iOooO00o;
                    int i5 = iOooO00o15;
                    long j7 = cursorOooO0O0.getLong(i5);
                    iOooO00o15 = i5;
                    iOooO00o16 = iOooO00o16;
                    boolean z = cursorOooO0O0.getInt(iOooO00o16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyOooO0Oo = oo0o0Oo.OooO0Oo(cursorOooO0O0.getInt(iOooO00o17));
                    iOooO00o17 = iOooO00o17;
                    int i6 = iOooO00o18;
                    int i7 = cursorOooO0O0.getInt(i6);
                    iOooO00o18 = i6;
                    int i8 = iOooO00o19;
                    int i9 = cursorOooO0O0.getInt(i8);
                    iOooO00o19 = i8;
                    int i10 = iOooO00o20;
                    NetworkType networkTypeOooO0OO = oo0o0Oo.OooO0OO(cursorOooO0O0.getInt(i10));
                    iOooO00o20 = i10;
                    iOooO00o21 = iOooO00o21;
                    boolean z2 = cursorOooO0O0.getInt(iOooO00o21) != 0;
                    boolean z3 = cursorOooO0O0.getInt(iOooO00o22) != 0;
                    boolean z4 = cursorOooO0O0.getInt(iOooO00o23) != 0;
                    boolean z5 = cursorOooO0O0.getInt(iOooO00o24) != 0;
                    long j8 = cursorOooO0O0.getLong(iOooO00o25);
                    iOooO00o25 = iOooO00o25;
                    int i11 = iOooO00o26;
                    long j9 = cursorOooO0O0.getLong(i11);
                    iOooO00o26 = i11;
                    int i12 = iOooO00o27;
                    if (!cursorOooO0O0.isNull(i12)) {
                        blob = cursorOooO0O0.getBlob(i12);
                    }
                    iOooO00o27 = i12;
                    arrayList.add(new o00Ooo(string, workInfo$StateOooO0o0, string2, string3, oooO0O0OooO00o, oooO0O0OooO00o2, j, j2, j3, new p115o00O00oO.Oooo0(networkTypeOooO0OO, z2, z3, z4, z5, j8, j9, oo0o0Oo.OooO00o(blob)), i2, backoffPolicyOooO0O0, j4, j5, j6, j7, z, outOfQuotaPolicyOooO0Oo, i7, i9));
                    iOooO00o = i4;
                    i = i3;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList;
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

    @Override // o00O0OO.oo000o
    public final void OooOOoo(o00Ooo o00ooo2) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f36239OooO0O0.OooO0oO(o00ooo2);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // o00O0OO.oo000o
    public final int OooOo0(String str) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        OooOo oooOo = this.f36245OooO0oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOo.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            oooOo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.oo000o
    public final int OooOo00(String str) {
        RoomDatabase roomDatabase = this.f36238OooO00o;
        roomDatabase.OooO0O0();
        Oooo000 oooo000 = this.f36237OooO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooo000.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            oooo000.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
