package androidx.work.impl;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o000O.OooO0O0;
import o000O0O0.OooO;
import o000O0O0.OooOo;
import o000O0O0.o0Oo0oo;
import p085o000OooO.o00Oo0;
import p085o000OooO.o00oO0o;
import p091o000o0O.OooOOOO;
import p091o000o0O.OooOo00;
import p091o000o0O.Oooo0;
import p091o000o0O.Oooo000;
import p091o000o0O.o000000;
import p091o000o0O.o000OOo;
import p091o000o0O.o00O0O;
import p091o000o0O.o00Ooo;
import p091o000o0O.o0OO00O;
import p091o000o0O.o0OOO0o;
import p091o000o0O.o0OoOo0;
import p091o000o0O.o0ooOOo;
import p091o000o0O.oo000o;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f8412OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile oo0o0Oo f8413OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile OooOo00 f8414OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile o00O0O f8415OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile o000000 f8416OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile oo000o f8417OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile Oooo0 f8418OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile o0OOO0o f8419OooOo00;

    public class OooO00o extends o0Oo0oo.OooO00o {
        public OooO00o() {
            super(12);
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO00o(SupportSQLiteDatabase supportSQLiteDatabase) {
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0O0(SupportSQLiteDatabase db) {
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            db.execSQL("DROP TABLE IF EXISTS `WorkName`");
            db.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            db.execSQL("DROP TABLE IF EXISTS `Preference`");
            int i = WorkDatabase_Impl.f8412OooOo0O;
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = workDatabase_Impl.f7890OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    workDatabase_Impl.f7890OooO0oO.get(i2).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0OO(SupportSQLiteDatabase db) {
            int i = WorkDatabase_Impl.f8412OooOo0O;
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = workDatabase_Impl.f7890OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    workDatabase_Impl.f7890OooO0oO.get(i2).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f8412OooOo0O;
            workDatabase_Impl.f7884OooO00o = supportSQLiteDatabase;
            supportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.OooOO0O(supportSQLiteDatabase);
            List<? extends RoomDatabase.OooO0O0> list = WorkDatabase_Impl.this.f7890OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f7890OooO0oO.get(i2).OooO00o(supportSQLiteDatabase);
                }
            }
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase) {
            OooO0O0.OooO00o(supportSQLiteDatabase);
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0o0() {
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final o0Oo0oo.OooO0O0 OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new TableInfo.OooO00o(1, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSetOooO00o = o00oO0o.OooO00o(map, "prerequisite_id", new TableInfo.OooO00o(2, 1, "prerequisite_id", "TEXT", null, true), 2);
            hashSetOooO00o.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSetOooO00o.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new TableInfo.OooO0o(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id"));
            hashSet.add(new TableInfo.OooO0o(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id"));
            TableInfo tableInfo = new TableInfo("Dependency", map, hashSetOooO00o, hashSet);
            TableInfo tableInfoOooO00o = TableInfo.OooO00o(supportSQLiteDatabase, "Dependency");
            if (!tableInfo.equals(tableInfoOooO00o)) {
                return new o0Oo0oo.OooO0O0(false, p085o000OooO.oo000o.OooO00o("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", tableInfo, "\n Found:\n", tableInfoOooO00o));
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new TableInfo.OooO00o(1, 1, "id", "TEXT", null, true));
            map2.put("state", new TableInfo.OooO00o(0, 1, "state", "INTEGER", null, true));
            map2.put("worker_class_name", new TableInfo.OooO00o(0, 1, "worker_class_name", "TEXT", null, true));
            map2.put("input_merger_class_name", new TableInfo.OooO00o(0, 1, "input_merger_class_name", "TEXT", null, false));
            map2.put("input", new TableInfo.OooO00o(0, 1, "input", "BLOB", null, true));
            map2.put("output", new TableInfo.OooO00o(0, 1, "output", "BLOB", null, true));
            map2.put("initial_delay", new TableInfo.OooO00o(0, 1, "initial_delay", "INTEGER", null, true));
            map2.put("interval_duration", new TableInfo.OooO00o(0, 1, "interval_duration", "INTEGER", null, true));
            map2.put("flex_duration", new TableInfo.OooO00o(0, 1, "flex_duration", "INTEGER", null, true));
            map2.put("run_attempt_count", new TableInfo.OooO00o(0, 1, "run_attempt_count", "INTEGER", null, true));
            map2.put("backoff_policy", new TableInfo.OooO00o(0, 1, "backoff_policy", "INTEGER", null, true));
            map2.put("backoff_delay_duration", new TableInfo.OooO00o(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            map2.put("period_start_time", new TableInfo.OooO00o(0, 1, "period_start_time", "INTEGER", null, true));
            map2.put("minimum_retention_duration", new TableInfo.OooO00o(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            map2.put("schedule_requested_at", new TableInfo.OooO00o(0, 1, "schedule_requested_at", "INTEGER", null, true));
            map2.put("run_in_foreground", new TableInfo.OooO00o(0, 1, "run_in_foreground", "INTEGER", null, true));
            map2.put("out_of_quota_policy", new TableInfo.OooO00o(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            map2.put("required_network_type", new TableInfo.OooO00o(0, 1, "required_network_type", "INTEGER", null, false));
            map2.put("requires_charging", new TableInfo.OooO00o(0, 1, "requires_charging", "INTEGER", null, true));
            map2.put("requires_device_idle", new TableInfo.OooO00o(0, 1, "requires_device_idle", "INTEGER", null, true));
            map2.put("requires_battery_not_low", new TableInfo.OooO00o(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            map2.put("requires_storage_not_low", new TableInfo.OooO00o(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            map2.put("trigger_content_update_delay", new TableInfo.OooO00o(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            map2.put("trigger_max_content_delay", new TableInfo.OooO00o(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            HashSet hashSetOooO00o2 = o00oO0o.OooO00o(map2, "content_uri_triggers", new TableInfo.OooO00o(0, 1, "content_uri_triggers", "BLOB", null, false), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new TableInfo.OooO0o(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at"));
            hashSet2.add(new TableInfo.OooO0o(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time"));
            TableInfo tableInfo2 = new TableInfo("WorkSpec", map2, hashSetOooO00o2, hashSet2);
            TableInfo tableInfoOooO00o2 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkSpec");
            if (!tableInfo2.equals(tableInfoOooO00o2)) {
                return new o0Oo0oo.OooO0O0(false, p085o000OooO.oo000o.OooO00o("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", tableInfo2, "\n Found:\n", tableInfoOooO00o2));
            }
            HashMap map3 = new HashMap(2);
            map3.put(ViewHierarchyConstants.TAG_KEY, new TableInfo.OooO00o(1, 1, ViewHierarchyConstants.TAG_KEY, "TEXT", null, true));
            HashSet hashSetOooO00o3 = o00oO0o.OooO00o(map3, "work_spec_id", new TableInfo.OooO00o(2, 1, "work_spec_id", "TEXT", null, true), 1);
            hashSetOooO00o3.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new TableInfo.OooO0o(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id"));
            TableInfo tableInfo3 = new TableInfo("WorkTag", map3, hashSetOooO00o3, hashSet3);
            TableInfo tableInfoOooO00o3 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkTag");
            if (!tableInfo3.equals(tableInfoOooO00o3)) {
                return new o0Oo0oo.OooO0O0(false, p085o000OooO.oo000o.OooO00o("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfoOooO00o3));
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new TableInfo.OooO00o(1, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSetOooO00o4 = o00oO0o.OooO00o(map4, "system_id", new TableInfo.OooO00o(0, 1, "system_id", "INTEGER", null, true), 1);
            hashSetOooO00o4.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo4 = new TableInfo("SystemIdInfo", map4, hashSetOooO00o4, new HashSet(0));
            TableInfo tableInfoOooO00o4 = TableInfo.OooO00o(supportSQLiteDatabase, "SystemIdInfo");
            if (!tableInfo4.equals(tableInfoOooO00o4)) {
                return new o0Oo0oo.OooO0O0(false, p085o000OooO.oo000o.OooO00o("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", tableInfo4, "\n Found:\n", tableInfoOooO00o4));
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new TableInfo.OooO00o(1, 1, "name", "TEXT", null, true));
            HashSet hashSetOooO00o5 = o00oO0o.OooO00o(map5, "work_spec_id", new TableInfo.OooO00o(2, 1, "work_spec_id", "TEXT", null, true), 1);
            hashSetOooO00o5.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.OooO0o(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id"));
            TableInfo tableInfo5 = new TableInfo("WorkName", map5, hashSetOooO00o5, hashSet4);
            TableInfo tableInfoOooO00o5 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkName");
            if (!tableInfo5.equals(tableInfoOooO00o5)) {
                return new o0Oo0oo.OooO0O0(false, p085o000OooO.oo000o.OooO00o("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfoOooO00o5));
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new TableInfo.OooO00o(1, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSetOooO00o6 = o00oO0o.OooO00o(map6, "progress", new TableInfo.OooO00o(0, 1, "progress", "BLOB", null, true), 1);
            hashSetOooO00o6.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo6 = new TableInfo("WorkProgress", map6, hashSetOooO00o6, new HashSet(0));
            TableInfo tableInfoOooO00o6 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkProgress");
            if (!tableInfo6.equals(tableInfoOooO00o6)) {
                return new o0Oo0oo.OooO0O0(false, p085o000OooO.oo000o.OooO00o("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", tableInfo6, "\n Found:\n", tableInfoOooO00o6));
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new TableInfo.OooO00o(1, 1, "key", "TEXT", null, true));
            TableInfo tableInfo7 = new TableInfo("Preference", map7, o00oO0o.OooO00o(map7, "long_value", new TableInfo.OooO00o(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
            TableInfo tableInfoOooO00o7 = TableInfo.OooO00o(supportSQLiteDatabase, "Preference");
            return !tableInfo7.equals(tableInfoOooO00o7) ? new o0Oo0oo.OooO0O0(false, p085o000OooO.oo000o.OooO00o("Preference(androidx.work.impl.model.Preference).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfoOooO00o7)) : new o0Oo0oo.OooO0O0(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final OooOo OooO0Oo() {
        return new OooOo(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper OooO0o0(OooO oooO) {
        o0Oo0oo callback = new o0Oo0oo(oooO, new OooO00o(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = oooO.f34689OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return oooO.f34691OooO0OO.create(new SupportSQLiteOpenHelper.Configuration(context, oooO.f34690OooO0O0, callback, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooOOOO OooOOOO() {
        OooOo00 oooOo00;
        if (this.f8414OooOOOo != null) {
            return this.f8414OooOOOo;
        }
        synchronized (this) {
            if (this.f8414OooOOOo == null) {
                this.f8414OooOOOo = new OooOo00(this);
            }
            oooOo00 = this.f8414OooOOOo;
        }
        return oooOo00;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Oooo000 OooOOOo() {
        Oooo0 oooo0;
        if (this.f8418OooOo0 != null) {
            return this.f8418OooOo0;
        }
        synchronized (this) {
            if (this.f8418OooOo0 == null) {
                this.f8418OooOo0 = new Oooo0(this);
            }
            oooo0 = this.f8418OooOo0;
        }
        return oooo0;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o00Ooo OooOOo() {
        oo000o oo000oVar;
        if (this.f8417OooOOoo != null) {
            return this.f8417OooOOoo;
        }
        synchronized (this) {
            if (this.f8417OooOOoo == null) {
                this.f8417OooOOoo = new oo000o(this);
            }
            oo000oVar = this.f8417OooOOoo;
        }
        return oo000oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o0OoOo0 OooOOo0() {
        o00O0O o00o0o2;
        if (this.f8415OooOOo != null) {
            return this.f8415OooOOo;
        }
        synchronized (this) {
            if (this.f8415OooOOo == null) {
                this.f8415OooOOo = new o00O0O(this);
            }
            o00o0o2 = this.f8415OooOOo;
        }
        return o00o0o2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o0ooOOo OooOOoo() {
        o0OOO0o o0ooo0o2;
        if (this.f8419OooOo00 != null) {
            return this.f8419OooOo00;
        }
        synchronized (this) {
            if (this.f8419OooOo00 == null) {
                this.f8419OooOo00 = new o0OOO0o(this);
            }
            o0ooo0o2 = this.f8419OooOo00;
        }
        return o0ooo0o2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o000OOo OooOo0() {
        o000000 o000000Var;
        if (this.f8416OooOOo0 != null) {
            return this.f8416OooOOo0;
        }
        synchronized (this) {
            if (this.f8416OooOOo0 == null) {
                this.f8416OooOOo0 = new o000000(this);
            }
            o000000Var = this.f8416OooOOo0;
        }
        return o000000Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o0OO00O OooOo00() {
        oo0o0Oo oo0o0oo;
        if (this.f8413OooOOOO != null) {
            return this.f8413OooOOOO;
        }
        synchronized (this) {
            if (this.f8413OooOOOO == null) {
                this.f8413OooOOOO = new oo0o0Oo(this);
            }
            oo0o0oo = this.f8413OooOOOO;
        }
        return oo0o0oo;
    }
}
