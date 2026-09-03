package p091o000o0O;

import android.database.Cursor;
import android.os.Build;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOO0 f35283OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f35284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f35285OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f35286OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f35287OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO f35288OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f35289OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0 f35290OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O f35291OooO0oo;

    public class OooO extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class OooO00o extends o000O0O0.OooOOO0<o0Oo0oo> {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Code duplicated, block: B:87:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:88:0x01d2  */
        @Override // o000O0O0.OooOOO0
        public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, o0Oo0oo o0oo0oo2) throws Throwable {
            int i;
            int i2;
            Throwable th;
            ObjectOutputStream objectOutputStream;
            o0Oo0oo o0oo0oo3 = o0oo0oo2;
            String str = o0oo0oo3.f35262OooO00o;
            int i3 = 1;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, o000000O.OooO0o(o0oo0oo3.f35263OooO0O0));
            String str2 = o0oo0oo3.f35264OooO0OO;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = o0oo0oo3.f35265OooO0Oo;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] bArrOooO0O0 = androidx.work.OooO0O0.OooO0O0(o0oo0oo3.f35267OooO0o0);
            if (bArrOooO0O0 == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, bArrOooO0O0);
            }
            byte[] bArrOooO0O1 = androidx.work.OooO0O0.OooO0O0(o0oo0oo3.f35266OooO0o);
            if (bArrOooO0O1 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, bArrOooO0O1);
            }
            supportSQLiteStatement.bindLong(7, o0oo0oo3.f35268OooO0oO);
            supportSQLiteStatement.bindLong(8, o0oo0oo3.f35269OooO0oo);
            supportSQLiteStatement.bindLong(9, o0oo0oo3.f35261OooO);
            supportSQLiteStatement.bindLong(10, o0oo0oo3.f35271OooOO0O);
            BackoffPolicy backoffPolicy = o0oo0oo3.f35272OooOO0o;
            int i4 = o000000O.OooO00o.f35246OooO0O0[backoffPolicy.ordinal()];
            if (i4 == 1) {
                i = 0;
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
                }
                i = 1;
            }
            supportSQLiteStatement.bindLong(11, i);
            supportSQLiteStatement.bindLong(12, o0oo0oo3.f35274OooOOO0);
            supportSQLiteStatement.bindLong(13, o0oo0oo3.f35273OooOOO);
            supportSQLiteStatement.bindLong(14, o0oo0oo3.f35275OooOOOO);
            supportSQLiteStatement.bindLong(15, o0oo0oo3.f35276OooOOOo);
            supportSQLiteStatement.bindLong(16, o0oo0oo3.f35278OooOOo0 ? 1L : 0L);
            OutOfQuotaPolicy outOfQuotaPolicy = o0oo0oo3.f35277OooOOo;
            int i5 = o000000O.OooO00o.f35248OooO0Oo[outOfQuotaPolicy.ordinal()];
            if (i5 == 1) {
                i2 = 0;
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException("Could not convert " + outOfQuotaPolicy + " to int");
                }
                i2 = 1;
            }
            supportSQLiteStatement.bindLong(17, i2);
            p084o000Ooo0.OooO oooO = o0oo0oo3.f35270OooOO0;
            if (oooO == null) {
                androidx.appcompat.widget.OooO00o.OooO0O0(supportSQLiteStatement, 18, 19, 20, 21);
                androidx.appcompat.widget.OooO00o.OooO0O0(supportSQLiteStatement, 22, 23, 24, 25);
                return;
            }
            NetworkType networkType = oooO.f35083OooO00o;
            int i6 = o000000O.OooO00o.f35247OooO0OO[networkType.ordinal()];
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
            supportSQLiteStatement.bindLong(19, oooO.f35084OooO0O0 ? 1L : 0L);
            supportSQLiteStatement.bindLong(20, oooO.f35085OooO0OO ? 1L : 0L);
            supportSQLiteStatement.bindLong(21, oooO.f35086OooO0Oo ? 1L : 0L);
            supportSQLiteStatement.bindLong(22, oooO.f35088OooO0o0 ? 1L : 0L);
            supportSQLiteStatement.bindLong(23, oooO.f35087OooO0o);
            supportSQLiteStatement.bindLong(24, oooO.f35089OooO0oO);
            p084o000Ooo0.OooOO0 oooOO1 = oooO.f35090OooO0oo;
            byte[] byteArray = null;
            objectOutputStream = null;
            ObjectOutputStream objectOutputStream2 = null;
            if (oooOO1.f35097OooO00o.size() != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        try {
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                HashSet<o000Ooo0.OooOO0.OooO00o> hashSet = oooOO1.f35097OooO00o;
                                try {
                                    objectOutputStream.writeInt(hashSet.size());
                                    for (o000Ooo0.OooOO0.OooO00o oooO00o : hashSet) {
                                        objectOutputStream.writeUTF(oooO00o.f35098OooO00o.toString());
                                        objectOutputStream.writeBoolean(oooO00o.f35099OooO0O0);
                                    }
                                    objectOutputStream.close();
                                } catch (IOException e) {
                                    e = e;
                                    objectOutputStream2 = objectOutputStream;
                                    e.printStackTrace();
                                    if (objectOutputStream2 != null) {
                                        objectOutputStream2.close();
                                    }
                                    byteArrayOutputStream.close();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    if (byteArray == null) {
                                        supportSQLiteStatement.bindNull(25);
                                    } else {
                                        supportSQLiteStatement.bindBlob(25, byteArray);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (objectOutputStream != null) {
                                        try {
                                            objectOutputStream.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                        throw th;
                                    }
                                }
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        } catch (IOException e5) {
                            e = e5;
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (Throwable th3) {
                    th = th3;
                    objectOutputStream = objectOutputStream2;
                }
            }
            if (byteArray == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindBlob(25, byteArray);
            }
        }
    }

    public class OooO0O0 extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class OooO0OO extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class OooO0o extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class OooOO0 extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class OooOO0O extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class OooOOO extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public class OooOOO0 extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public oo0o0Oo(RoomDatabase roomDatabase) {
        this.f35284OooO00o = roomDatabase;
        this.f35285OooO0O0 = new OooO00o(roomDatabase);
        this.f35286OooO0OO = new OooO0O0(roomDatabase);
        this.f35287OooO0Oo = new OooO0OO(roomDatabase);
        this.f35289OooO0o0 = new OooO0o(roomDatabase);
        this.f35288OooO0o = new OooO(roomDatabase);
        this.f35290OooO0oO = new OooOO0(roomDatabase);
        this.f35291OooO0oo = new OooOO0O(roomDatabase);
        this.f35283OooO = new OooOOO0(roomDatabase);
        new OooOOO(roomDatabase);
    }

    public final ArrayList OooO(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                o0Oo0oo.OooO00o oooO00o = new o0Oo0oo.OooO00o();
                oooO00o.f35279OooO00o = cursorOooO0O0.getString(iOooO00o);
                oooO00o.f35280OooO0O0 = o000000O.OooO0o0(cursorOooO0O0.getInt(iOooO00o2));
                arrayList.add(oooO00o);
            }
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            return arrayList;
        } catch (Throwable th) {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            throw th;
        }
    }

    public final void OooO00o(String str) {
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        OooO0O0 oooO0O0 = this.f35286OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0O0.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oooO0O0.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    public final ArrayList OooO0O0() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        roomSQLiteQueryOooO00o.bindLong(1, 200);
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
            int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
            int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "output");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o000O.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
                int iOooO00o16 = o000O.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
                int iOooO00o17 = o000O.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
                int iOooO00o18 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
                int iOooO00o19 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
                int iOooO00o20 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
                int iOooO00o21 = o000O.OooO00o.OooO00o(cursorOooO0O0, "period_start_time");
                int iOooO00o22 = o000O.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
                int iOooO00o23 = o000O.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o24 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o25 = o000O.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    String string = cursorOooO0O0.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooO0O0.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    p084o000Ooo0.OooO oooO = new p084o000Ooo0.OooO();
                    int i4 = iOooO00o;
                    oooO.f35083OooO00o = o000000O.OooO0OO(cursorOooO0O0.getInt(iOooO00o));
                    oooO.f35084OooO0O0 = cursorOooO0O0.getInt(iOooO00o2) != 0;
                    oooO.f35085OooO0OO = cursorOooO0O0.getInt(iOooO00o3) != 0;
                    oooO.f35086OooO0Oo = cursorOooO0O0.getInt(iOooO00o4) != 0;
                    oooO.f35088OooO0o0 = cursorOooO0O0.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    int i6 = iOooO00o3;
                    oooO.f35087OooO0o = cursorOooO0O0.getLong(iOooO00o6);
                    oooO.f35089OooO0oO = cursorOooO0O0.getLong(iOooO00o7);
                    oooO.f35090OooO0oo = o000000O.OooO00o(cursorOooO0O0.getBlob(iOooO00o8));
                    o0Oo0oo o0oo0oo2 = new o0Oo0oo(string, string2);
                    o0oo0oo2.f35263OooO0O0 = o000000O.OooO0o0(cursorOooO0O0.getInt(iOooO00o10));
                    o0oo0oo2.f35265OooO0Oo = cursorOooO0O0.getString(iOooO00o12);
                    o0oo0oo2.f35267OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(iOooO00o13));
                    int i7 = i;
                    o0oo0oo2.f35266OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(i7));
                    int i8 = iOooO00o13;
                    int i9 = iOooO00o15;
                    o0oo0oo2.f35268OooO0oO = cursorOooO0O0.getLong(i9);
                    int i10 = iOooO00o4;
                    int i11 = iOooO00o16;
                    o0oo0oo2.f35269OooO0oo = cursorOooO0O0.getLong(i11);
                    int i12 = iOooO00o17;
                    o0oo0oo2.f35261OooO = cursorOooO0O0.getLong(i12);
                    int i13 = iOooO00o18;
                    o0oo0oo2.f35271OooOO0O = cursorOooO0O0.getInt(i13);
                    int i14 = iOooO00o19;
                    o0oo0oo2.f35272OooOO0o = o000000O.OooO0O0(cursorOooO0O0.getInt(i14));
                    int i15 = iOooO00o20;
                    o0oo0oo2.f35274OooOOO0 = cursorOooO0O0.getLong(i15);
                    int i16 = iOooO00o21;
                    o0oo0oo2.f35273OooOOO = cursorOooO0O0.getLong(i16);
                    int i17 = iOooO00o22;
                    o0oo0oo2.f35275OooOOOO = cursorOooO0O0.getLong(i17);
                    int i18 = iOooO00o23;
                    o0oo0oo2.f35276OooOOOo = cursorOooO0O0.getLong(i18);
                    int i19 = iOooO00o24;
                    o0oo0oo2.f35278OooOOo0 = cursorOooO0O0.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    o0oo0oo2.f35277OooOOo = o000000O.OooO0Oo(cursorOooO0O0.getInt(i20));
                    o0oo0oo2.f35270OooOO0 = oooO;
                    arrayList.add(o0oo0oo2);
                    i = i7;
                    iOooO00o2 = i5;
                    iOooO00o15 = i9;
                    iOooO00o16 = i11;
                    iOooO00o20 = i15;
                    iOooO00o21 = i16;
                    iOooO00o24 = i19;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o25 = i20;
                    iOooO00o23 = i18;
                    iOooO00o13 = i8;
                    iOooO00o9 = i2;
                    iOooO00o3 = i6;
                    iOooO00o22 = i17;
                    iOooO00o4 = i10;
                    iOooO00o17 = i12;
                    iOooO00o18 = i13;
                    iOooO00o19 = i14;
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

    public final ArrayList OooO0OO(int i) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        roomSQLiteQueryOooO00o.bindLong(1, i);
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
            int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
            int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "output");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o000O.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
                int iOooO00o16 = o000O.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
                int iOooO00o17 = o000O.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
                int iOooO00o18 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
                int iOooO00o19 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
                int iOooO00o20 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
                int iOooO00o21 = o000O.OooO00o.OooO00o(cursorOooO0O0, "period_start_time");
                int iOooO00o22 = o000O.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
                int iOooO00o23 = o000O.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o24 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o25 = o000O.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int i2 = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    String string = cursorOooO0O0.getString(iOooO00o9);
                    int i3 = iOooO00o9;
                    String string2 = cursorOooO0O0.getString(iOooO00o11);
                    int i4 = iOooO00o11;
                    p084o000Ooo0.OooO oooO = new p084o000Ooo0.OooO();
                    int i5 = iOooO00o;
                    oooO.f35083OooO00o = o000000O.OooO0OO(cursorOooO0O0.getInt(iOooO00o));
                    oooO.f35084OooO0O0 = cursorOooO0O0.getInt(iOooO00o2) != 0;
                    oooO.f35085OooO0OO = cursorOooO0O0.getInt(iOooO00o3) != 0;
                    oooO.f35086OooO0Oo = cursorOooO0O0.getInt(iOooO00o4) != 0;
                    oooO.f35088OooO0o0 = cursorOooO0O0.getInt(iOooO00o5) != 0;
                    int i6 = iOooO00o2;
                    int i7 = iOooO00o3;
                    oooO.f35087OooO0o = cursorOooO0O0.getLong(iOooO00o6);
                    oooO.f35089OooO0oO = cursorOooO0O0.getLong(iOooO00o7);
                    oooO.f35090OooO0oo = o000000O.OooO00o(cursorOooO0O0.getBlob(iOooO00o8));
                    o0Oo0oo o0oo0oo2 = new o0Oo0oo(string, string2);
                    o0oo0oo2.f35263OooO0O0 = o000000O.OooO0o0(cursorOooO0O0.getInt(iOooO00o10));
                    o0oo0oo2.f35265OooO0Oo = cursorOooO0O0.getString(iOooO00o12);
                    o0oo0oo2.f35267OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(iOooO00o13));
                    int i8 = i2;
                    o0oo0oo2.f35266OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(i8));
                    int i9 = iOooO00o15;
                    int i10 = iOooO00o13;
                    o0oo0oo2.f35268OooO0oO = cursorOooO0O0.getLong(i9);
                    int i11 = iOooO00o4;
                    int i12 = iOooO00o16;
                    o0oo0oo2.f35269OooO0oo = cursorOooO0O0.getLong(i12);
                    int i13 = iOooO00o17;
                    o0oo0oo2.f35261OooO = cursorOooO0O0.getLong(i13);
                    int i14 = iOooO00o18;
                    o0oo0oo2.f35271OooOO0O = cursorOooO0O0.getInt(i14);
                    int i15 = iOooO00o19;
                    o0oo0oo2.f35272OooOO0o = o000000O.OooO0O0(cursorOooO0O0.getInt(i15));
                    int i16 = iOooO00o20;
                    o0oo0oo2.f35274OooOOO0 = cursorOooO0O0.getLong(i16);
                    int i17 = iOooO00o21;
                    o0oo0oo2.f35273OooOOO = cursorOooO0O0.getLong(i17);
                    int i18 = iOooO00o22;
                    o0oo0oo2.f35275OooOOOO = cursorOooO0O0.getLong(i18);
                    int i19 = iOooO00o23;
                    o0oo0oo2.f35276OooOOOo = cursorOooO0O0.getLong(i19);
                    int i20 = iOooO00o24;
                    o0oo0oo2.f35278OooOOo0 = cursorOooO0O0.getInt(i20) != 0;
                    int i21 = iOooO00o25;
                    o0oo0oo2.f35277OooOOo = o000000O.OooO0Oo(cursorOooO0O0.getInt(i21));
                    o0oo0oo2.f35270OooOO0 = oooO;
                    arrayList.add(o0oo0oo2);
                    i2 = i8;
                    iOooO00o2 = i6;
                    iOooO00o24 = i20;
                    iOooO00o9 = i3;
                    iOooO00o11 = i4;
                    iOooO00o = i5;
                    iOooO00o25 = i21;
                    iOooO00o13 = i10;
                    iOooO00o15 = i9;
                    iOooO00o16 = i12;
                    iOooO00o20 = i16;
                    iOooO00o21 = i17;
                    iOooO00o23 = i19;
                    iOooO00o3 = i7;
                    iOooO00o22 = i18;
                    iOooO00o4 = i11;
                    iOooO00o17 = i13;
                    iOooO00o18 = i14;
                    iOooO00o19 = i15;
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

    public final ArrayList OooO0Oo() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
            int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
            int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "output");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o000O.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
                int iOooO00o16 = o000O.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
                int iOooO00o17 = o000O.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
                int iOooO00o18 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
                int iOooO00o19 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
                int iOooO00o20 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
                int iOooO00o21 = o000O.OooO00o.OooO00o(cursorOooO0O0, "period_start_time");
                int iOooO00o22 = o000O.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
                int iOooO00o23 = o000O.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o24 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o25 = o000O.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    String string = cursorOooO0O0.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooO0O0.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    p084o000Ooo0.OooO oooO = new p084o000Ooo0.OooO();
                    int i4 = iOooO00o;
                    oooO.f35083OooO00o = o000000O.OooO0OO(cursorOooO0O0.getInt(iOooO00o));
                    oooO.f35084OooO0O0 = cursorOooO0O0.getInt(iOooO00o2) != 0;
                    oooO.f35085OooO0OO = cursorOooO0O0.getInt(iOooO00o3) != 0;
                    oooO.f35086OooO0Oo = cursorOooO0O0.getInt(iOooO00o4) != 0;
                    oooO.f35088OooO0o0 = cursorOooO0O0.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    int i6 = iOooO00o3;
                    oooO.f35087OooO0o = cursorOooO0O0.getLong(iOooO00o6);
                    oooO.f35089OooO0oO = cursorOooO0O0.getLong(iOooO00o7);
                    oooO.f35090OooO0oo = o000000O.OooO00o(cursorOooO0O0.getBlob(iOooO00o8));
                    o0Oo0oo o0oo0oo2 = new o0Oo0oo(string, string2);
                    o0oo0oo2.f35263OooO0O0 = o000000O.OooO0o0(cursorOooO0O0.getInt(iOooO00o10));
                    o0oo0oo2.f35265OooO0Oo = cursorOooO0O0.getString(iOooO00o12);
                    o0oo0oo2.f35267OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(iOooO00o13));
                    int i7 = i;
                    o0oo0oo2.f35266OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(i7));
                    int i8 = iOooO00o13;
                    int i9 = iOooO00o15;
                    o0oo0oo2.f35268OooO0oO = cursorOooO0O0.getLong(i9);
                    int i10 = iOooO00o4;
                    int i11 = iOooO00o16;
                    o0oo0oo2.f35269OooO0oo = cursorOooO0O0.getLong(i11);
                    int i12 = iOooO00o17;
                    o0oo0oo2.f35261OooO = cursorOooO0O0.getLong(i12);
                    int i13 = iOooO00o18;
                    o0oo0oo2.f35271OooOO0O = cursorOooO0O0.getInt(i13);
                    int i14 = iOooO00o19;
                    o0oo0oo2.f35272OooOO0o = o000000O.OooO0O0(cursorOooO0O0.getInt(i14));
                    int i15 = iOooO00o20;
                    o0oo0oo2.f35274OooOOO0 = cursorOooO0O0.getLong(i15);
                    int i16 = iOooO00o21;
                    o0oo0oo2.f35273OooOOO = cursorOooO0O0.getLong(i16);
                    int i17 = iOooO00o22;
                    o0oo0oo2.f35275OooOOOO = cursorOooO0O0.getLong(i17);
                    int i18 = iOooO00o23;
                    o0oo0oo2.f35276OooOOOo = cursorOooO0O0.getLong(i18);
                    int i19 = iOooO00o24;
                    o0oo0oo2.f35278OooOOo0 = cursorOooO0O0.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    o0oo0oo2.f35277OooOOo = o000000O.OooO0Oo(cursorOooO0O0.getInt(i20));
                    o0oo0oo2.f35270OooOO0 = oooO;
                    arrayList.add(o0oo0oo2);
                    i = i7;
                    iOooO00o2 = i5;
                    iOooO00o15 = i9;
                    iOooO00o16 = i11;
                    iOooO00o20 = i15;
                    iOooO00o21 = i16;
                    iOooO00o24 = i19;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o25 = i20;
                    iOooO00o23 = i18;
                    iOooO00o13 = i8;
                    iOooO00o9 = i2;
                    iOooO00o3 = i6;
                    iOooO00o22 = i17;
                    iOooO00o4 = i10;
                    iOooO00o17 = i12;
                    iOooO00o18 = i13;
                    iOooO00o19 = i14;
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

    public final WorkInfo$State OooO0o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return cursorOooO0O0.moveToFirst() ? o000000O.OooO0o0(cursorOooO0O0.getInt(0)) : null;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    public final ArrayList OooO0o0() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
            int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
            int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "output");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o000O.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
                int iOooO00o16 = o000O.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
                int iOooO00o17 = o000O.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
                int iOooO00o18 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
                int iOooO00o19 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
                int iOooO00o20 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
                int iOooO00o21 = o000O.OooO00o.OooO00o(cursorOooO0O0, "period_start_time");
                int iOooO00o22 = o000O.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
                int iOooO00o23 = o000O.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o24 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o25 = o000O.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    String string = cursorOooO0O0.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooO0O0.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    p084o000Ooo0.OooO oooO = new p084o000Ooo0.OooO();
                    int i4 = iOooO00o;
                    oooO.f35083OooO00o = o000000O.OooO0OO(cursorOooO0O0.getInt(iOooO00o));
                    oooO.f35084OooO0O0 = cursorOooO0O0.getInt(iOooO00o2) != 0;
                    oooO.f35085OooO0OO = cursorOooO0O0.getInt(iOooO00o3) != 0;
                    oooO.f35086OooO0Oo = cursorOooO0O0.getInt(iOooO00o4) != 0;
                    oooO.f35088OooO0o0 = cursorOooO0O0.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    int i6 = iOooO00o3;
                    oooO.f35087OooO0o = cursorOooO0O0.getLong(iOooO00o6);
                    oooO.f35089OooO0oO = cursorOooO0O0.getLong(iOooO00o7);
                    oooO.f35090OooO0oo = o000000O.OooO00o(cursorOooO0O0.getBlob(iOooO00o8));
                    o0Oo0oo o0oo0oo2 = new o0Oo0oo(string, string2);
                    o0oo0oo2.f35263OooO0O0 = o000000O.OooO0o0(cursorOooO0O0.getInt(iOooO00o10));
                    o0oo0oo2.f35265OooO0Oo = cursorOooO0O0.getString(iOooO00o12);
                    o0oo0oo2.f35267OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(iOooO00o13));
                    int i7 = i;
                    o0oo0oo2.f35266OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(i7));
                    int i8 = iOooO00o13;
                    int i9 = iOooO00o15;
                    o0oo0oo2.f35268OooO0oO = cursorOooO0O0.getLong(i9);
                    int i10 = iOooO00o4;
                    int i11 = iOooO00o16;
                    o0oo0oo2.f35269OooO0oo = cursorOooO0O0.getLong(i11);
                    int i12 = iOooO00o17;
                    o0oo0oo2.f35261OooO = cursorOooO0O0.getLong(i12);
                    int i13 = iOooO00o18;
                    o0oo0oo2.f35271OooOO0O = cursorOooO0O0.getInt(i13);
                    int i14 = iOooO00o19;
                    o0oo0oo2.f35272OooOO0o = o000000O.OooO0O0(cursorOooO0O0.getInt(i14));
                    int i15 = iOooO00o20;
                    o0oo0oo2.f35274OooOOO0 = cursorOooO0O0.getLong(i15);
                    int i16 = iOooO00o21;
                    o0oo0oo2.f35273OooOOO = cursorOooO0O0.getLong(i16);
                    int i17 = iOooO00o22;
                    o0oo0oo2.f35275OooOOOO = cursorOooO0O0.getLong(i17);
                    int i18 = iOooO00o23;
                    o0oo0oo2.f35276OooOOOo = cursorOooO0O0.getLong(i18);
                    int i19 = iOooO00o24;
                    o0oo0oo2.f35278OooOOo0 = cursorOooO0O0.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    o0oo0oo2.f35277OooOOo = o000000O.OooO0Oo(cursorOooO0O0.getInt(i20));
                    o0oo0oo2.f35270OooOO0 = oooO;
                    arrayList.add(o0oo0oo2);
                    i = i7;
                    iOooO00o2 = i5;
                    iOooO00o15 = i9;
                    iOooO00o16 = i11;
                    iOooO00o20 = i15;
                    iOooO00o21 = i16;
                    iOooO00o24 = i19;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o25 = i20;
                    iOooO00o23 = i18;
                    iOooO00o13 = i8;
                    iOooO00o9 = i2;
                    iOooO00o3 = i6;
                    iOooO00o22 = i17;
                    iOooO00o4 = i10;
                    iOooO00o17 = i12;
                    iOooO00o18 = i13;
                    iOooO00o19 = i14;
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

    public final ArrayList OooO0oO(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(cursorOooO0O0.getString(0));
            }
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            return arrayList;
        } catch (Throwable th) {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            throw th;
        }
    }

    public final o0Oo0oo OooO0oo(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        o0Oo0oo o0oo0oo2;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o000O.OooO00o.OooO00o(cursorOooO0O0, "required_network_type");
            int iOooO00o2 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_charging");
            int iOooO00o3 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_device_idle");
            int iOooO00o4 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_battery_not_low");
            int iOooO00o5 = o000O.OooO00o.OooO00o(cursorOooO0O0, "requires_storage_not_low");
            int iOooO00o6 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_content_update_delay");
            int iOooO00o7 = o000O.OooO00o.OooO00o(cursorOooO0O0, "trigger_max_content_delay");
            int iOooO00o8 = o000O.OooO00o.OooO00o(cursorOooO0O0, "content_uri_triggers");
            int iOooO00o9 = o000O.OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o10 = o000O.OooO00o.OooO00o(cursorOooO0O0, "state");
            int iOooO00o11 = o000O.OooO00o.OooO00o(cursorOooO0O0, "worker_class_name");
            int iOooO00o12 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input_merger_class_name");
            int iOooO00o13 = o000O.OooO00o.OooO00o(cursorOooO0O0, "input");
            int iOooO00o14 = o000O.OooO00o.OooO00o(cursorOooO0O0, "output");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = o000O.OooO00o.OooO00o(cursorOooO0O0, "initial_delay");
                int iOooO00o16 = o000O.OooO00o.OooO00o(cursorOooO0O0, "interval_duration");
                int iOooO00o17 = o000O.OooO00o.OooO00o(cursorOooO0O0, "flex_duration");
                int iOooO00o18 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_attempt_count");
                int iOooO00o19 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_policy");
                int iOooO00o20 = o000O.OooO00o.OooO00o(cursorOooO0O0, "backoff_delay_duration");
                int iOooO00o21 = o000O.OooO00o.OooO00o(cursorOooO0O0, "period_start_time");
                int iOooO00o22 = o000O.OooO00o.OooO00o(cursorOooO0O0, "minimum_retention_duration");
                int iOooO00o23 = o000O.OooO00o.OooO00o(cursorOooO0O0, "schedule_requested_at");
                int iOooO00o24 = o000O.OooO00o.OooO00o(cursorOooO0O0, "run_in_foreground");
                int iOooO00o25 = o000O.OooO00o.OooO00o(cursorOooO0O0, "out_of_quota_policy");
                if (cursorOooO0O0.moveToFirst()) {
                    String string = cursorOooO0O0.getString(iOooO00o9);
                    String string2 = cursorOooO0O0.getString(iOooO00o11);
                    p084o000Ooo0.OooO oooO = new p084o000Ooo0.OooO();
                    oooO.f35083OooO00o = o000000O.OooO0OO(cursorOooO0O0.getInt(iOooO00o));
                    oooO.f35084OooO0O0 = cursorOooO0O0.getInt(iOooO00o2) != 0;
                    oooO.f35085OooO0OO = cursorOooO0O0.getInt(iOooO00o3) != 0;
                    oooO.f35086OooO0Oo = cursorOooO0O0.getInt(iOooO00o4) != 0;
                    oooO.f35088OooO0o0 = cursorOooO0O0.getInt(iOooO00o5) != 0;
                    oooO.f35087OooO0o = cursorOooO0O0.getLong(iOooO00o6);
                    oooO.f35089OooO0oO = cursorOooO0O0.getLong(iOooO00o7);
                    oooO.f35090OooO0oo = o000000O.OooO00o(cursorOooO0O0.getBlob(iOooO00o8));
                    o0oo0oo2 = new o0Oo0oo(string, string2);
                    o0oo0oo2.f35263OooO0O0 = o000000O.OooO0o0(cursorOooO0O0.getInt(iOooO00o10));
                    o0oo0oo2.f35265OooO0Oo = cursorOooO0O0.getString(iOooO00o12);
                    o0oo0oo2.f35267OooO0o0 = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(iOooO00o13));
                    o0oo0oo2.f35266OooO0o = androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(iOooO00o14));
                    o0oo0oo2.f35268OooO0oO = cursorOooO0O0.getLong(iOooO00o15);
                    o0oo0oo2.f35269OooO0oo = cursorOooO0O0.getLong(iOooO00o16);
                    o0oo0oo2.f35261OooO = cursorOooO0O0.getLong(iOooO00o17);
                    o0oo0oo2.f35271OooOO0O = cursorOooO0O0.getInt(iOooO00o18);
                    o0oo0oo2.f35272OooOO0o = o000000O.OooO0O0(cursorOooO0O0.getInt(iOooO00o19));
                    o0oo0oo2.f35274OooOOO0 = cursorOooO0O0.getLong(iOooO00o20);
                    o0oo0oo2.f35273OooOOO = cursorOooO0O0.getLong(iOooO00o21);
                    o0oo0oo2.f35275OooOOOO = cursorOooO0O0.getLong(iOooO00o22);
                    o0oo0oo2.f35276OooOOOo = cursorOooO0O0.getLong(iOooO00o23);
                    o0oo0oo2.f35278OooOOo0 = cursorOooO0O0.getInt(iOooO00o24) != 0;
                    o0oo0oo2.f35277OooOOo = o000000O.OooO0Oo(cursorOooO0O0.getInt(iOooO00o25));
                    o0oo0oo2.f35270OooOO0 = oooO;
                } else {
                    o0oo0oo2 = null;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return o0oo0oo2;
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

    public final int OooOO0(long j, String str) {
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        OooOO0O oooOO0O = this.f35291OooO0oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOO0O.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
            oooOO0O.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    public final void OooOO0O(String str, androidx.work.OooO0O0 oooO0O0) throws Throwable {
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        OooO0OO oooO0OO = this.f35287OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0OO.OooO00o();
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
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oooO0OO.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    public final void OooOO0o(long j, String str) {
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        OooO0o oooO0o = this.f35289OooO0o0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oooO0o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    public final int OooOOO0(WorkInfo$State workInfo$State, String... strArr) {
        RoomDatabase roomDatabase = this.f35284OooO00o;
        roomDatabase.OooO0O0();
        StringBuilder builder = new StringBuilder();
        builder.append("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i = 0; i < length; i++) {
            builder.append("?");
            if (i < length - 1) {
                builder.append(",");
            }
        }
        builder.append(")");
        String sql = builder.toString();
        Intrinsics.checkNotNullParameter(sql, "sql");
        roomDatabase.OooO00o();
        roomDatabase.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = roomDatabase.OooO0oO().getWritableDatabase().compileStatement(sql);
        supportSQLiteStatementCompileStatement.bindLong(1, o000000O.OooO0o(workInfo$State));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(i2);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i2, str);
            }
            i2++;
        }
        roomDatabase.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementCompileStatement.executeUpdateDelete();
            roomDatabase.OooOOO0();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
