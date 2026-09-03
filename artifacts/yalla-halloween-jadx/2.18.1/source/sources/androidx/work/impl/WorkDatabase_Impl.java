package androidx.work.impl;

import android.content.Context;
import androidx.room.OooO;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import o00O0000.OooO0O0;
import o00O0000.OooO0OO;
import o00O0000.OooOO0;
import o00O0000.OooOOO;
import o00O0000.OooOOO0;
import o00O0000.OooOo;
import o00O0000.OooOo00;
import o00O0000.Oooo0;
import o00O0000.o000oOoO;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import o00O0000.o00oO0o;
import p023Oooo00O.o000O00;
import p091o000o00o.o00000O0;
import p092o000o0O.o00Ooo;
import p107o000ooO0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f9767OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile o00Oo0 f9768OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile o00oO0o f9769OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile OooO0OO f9770OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile OooOOO f9771OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile o000oOoO f9772OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile OooOo f9773OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public volatile OooOO0 f9774OooOo0O;

    public class OooO00o extends OooO.OooO00o {
        public OooO00o() {
            super(12);
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO00o(SupportSQLiteDatabase supportSQLiteDatabase) {
            o000O00.OooO0OO(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            o000O00.OooO0OO(supportSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            o000O00.OooO0OO(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0O0(SupportSQLiteDatabase supportSQLiteDatabase) {
            o000O00.OooO0OO(supportSQLiteDatabase, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f9767OooOo0o;
            List<RoomDatabase.OooO0O0> list = workDatabase_Impl.f9296OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f9296OooO0oO.get(i2));
                }
            }
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0OO() {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f9767OooOo0o;
            List<RoomDatabase.OooO0O0> list = workDatabase_Impl.f9296OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f9296OooO0oO.get(i2));
                }
            }
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f9767OooOo0o;
            workDatabase_Impl.f9290OooO00o = supportSQLiteDatabase;
            supportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.OooOO0o(supportSQLiteDatabase);
            List<RoomDatabase.OooO0O0> list = WorkDatabase_Impl.this.f9296OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f9296OooO0oO.get(i2).OooO00o(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase) {
            p092o000o0O.o00Oo0.OooO00o(supportSQLiteDatabase);
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0o0() {
        }

        @Override // androidx.room.OooO.OooO00o
        public final OooO.OooO0O0 OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new o00Ooo.OooO00o("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO00o = oo000o.OooO00o(map, "prerequisite_id", new o00Ooo.OooO00o("prerequisite_id", "TEXT", true, 2, null, 1), 2);
            hashSetOooO00o.add(new o00Ooo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSetOooO00o.add(new o00Ooo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new o00Ooo.OooO0o("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), null));
            hashSet.add(new o00Ooo.OooO0o("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), null));
            o00Ooo o00ooo2 = new o00Ooo("Dependency", map, hashSetOooO00o, hashSet);
            o00Ooo o00oooOooO00o = o00Ooo.OooO00o(supportSQLiteDatabase, "Dependency");
            if (!o00ooo2.equals(o00oooOooO00o)) {
                return new OooO.OooO0O0(false, p107o000ooO0.o00Ooo.OooO00o("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", o00ooo2, "\n Found:\n", o00oooOooO00o));
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new o00Ooo.OooO00o("id", "TEXT", true, 1, null, 1));
            map2.put(ServerProtocol.DIALOG_PARAM_STATE, new o00Ooo.OooO00o(ServerProtocol.DIALOG_PARAM_STATE, "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new o00Ooo.OooO00o("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new o00Ooo.OooO00o("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new o00Ooo.OooO00o("input", "BLOB", true, 0, null, 1));
            map2.put("output", new o00Ooo.OooO00o("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new o00Ooo.OooO00o("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new o00Ooo.OooO00o("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new o00Ooo.OooO00o("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new o00Ooo.OooO00o("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new o00Ooo.OooO00o("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new o00Ooo.OooO00o("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new o00Ooo.OooO00o("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new o00Ooo.OooO00o("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new o00Ooo.OooO00o("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new o00Ooo.OooO00o("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new o00Ooo.OooO00o("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new o00Ooo.OooO00o("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new o00Ooo.OooO00o("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new o00Ooo.OooO00o("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new o00Ooo.OooO00o("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new o00Ooo.OooO00o("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new o00Ooo.OooO00o("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new o00Ooo.OooO00o("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o2 = oo000o.OooO00o(map2, "content_uri_triggers", new o00Ooo.OooO00o("content_uri_triggers", "BLOB", false, 0, null, 1), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new o00Ooo.OooO0o("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), null));
            hashSet2.add(new o00Ooo.OooO0o("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time"), null));
            o00Ooo o00ooo3 = new o00Ooo("WorkSpec", map2, hashSetOooO00o2, hashSet2);
            o00Ooo o00oooOooO00o2 = o00Ooo.OooO00o(supportSQLiteDatabase, "WorkSpec");
            if (!o00ooo3.equals(o00oooOooO00o2)) {
                return new OooO.OooO0O0(false, p107o000ooO0.o00Ooo.OooO00o("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", o00ooo3, "\n Found:\n", o00oooOooO00o2));
            }
            HashMap map3 = new HashMap(2);
            map3.put(ViewHierarchyConstants.TAG_KEY, new o00Ooo.OooO00o(ViewHierarchyConstants.TAG_KEY, "TEXT", true, 1, null, 1));
            HashSet hashSetOooO00o3 = oo000o.OooO00o(map3, "work_spec_id", new o00Ooo.OooO00o("work_spec_id", "TEXT", true, 2, null, 1), 1);
            hashSetOooO00o3.add(new o00Ooo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new o00Ooo.OooO0o("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), null));
            o00Ooo o00ooo4 = new o00Ooo("WorkTag", map3, hashSetOooO00o3, hashSet3);
            o00Ooo o00oooOooO00o3 = o00Ooo.OooO00o(supportSQLiteDatabase, "WorkTag");
            if (!o00ooo4.equals(o00oooOooO00o3)) {
                return new OooO.OooO0O0(false, p107o000ooO0.o00Ooo.OooO00o("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", o00ooo4, "\n Found:\n", o00oooOooO00o3));
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new o00Ooo.OooO00o("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO00o4 = oo000o.OooO00o(map4, "system_id", new o00Ooo.OooO00o("system_id", "INTEGER", true, 0, null, 1), 1);
            hashSetOooO00o4.add(new o00Ooo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            o00Ooo o00ooo5 = new o00Ooo("SystemIdInfo", map4, hashSetOooO00o4, new HashSet(0));
            o00Ooo o00oooOooO00o4 = o00Ooo.OooO00o(supportSQLiteDatabase, "SystemIdInfo");
            if (!o00ooo5.equals(o00oooOooO00o4)) {
                return new OooO.OooO0O0(false, p107o000ooO0.o00Ooo.OooO00o("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", o00ooo5, "\n Found:\n", o00oooOooO00o4));
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new o00Ooo.OooO00o("name", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO00o5 = oo000o.OooO00o(map5, "work_spec_id", new o00Ooo.OooO00o("work_spec_id", "TEXT", true, 2, null, 1), 1);
            hashSetOooO00o5.add(new o00Ooo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new o00Ooo.OooO0o("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), null));
            o00Ooo o00ooo6 = new o00Ooo("WorkName", map5, hashSetOooO00o5, hashSet4);
            o00Ooo o00oooOooO00o5 = o00Ooo.OooO00o(supportSQLiteDatabase, "WorkName");
            if (!o00ooo6.equals(o00oooOooO00o5)) {
                return new OooO.OooO0O0(false, p107o000ooO0.o00Ooo.OooO00o("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", o00ooo6, "\n Found:\n", o00oooOooO00o5));
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new o00Ooo.OooO00o("work_spec_id", "TEXT", true, 1, null, 1));
            HashSet hashSetOooO00o6 = oo000o.OooO00o(map6, "progress", new o00Ooo.OooO00o("progress", "BLOB", true, 0, null, 1), 1);
            hashSetOooO00o6.add(new o00Ooo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            o00Ooo o00ooo7 = new o00Ooo("WorkProgress", map6, hashSetOooO00o6, new HashSet(0));
            o00Ooo o00oooOooO00o6 = o00Ooo.OooO00o(supportSQLiteDatabase, "WorkProgress");
            if (!o00ooo7.equals(o00oooOooO00o6)) {
                return new OooO.OooO0O0(false, p107o000ooO0.o00Ooo.OooO00o("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", o00ooo7, "\n Found:\n", o00oooOooO00o6));
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new o00Ooo.OooO00o("key", "TEXT", true, 1, null, 1));
            o00Ooo o00ooo8 = new o00Ooo("Preference", map7, oo000o.OooO00o(map7, "long_value", new o00Ooo.OooO00o("long_value", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
            o00Ooo o00oooOooO00o7 = o00Ooo.OooO00o(supportSQLiteDatabase, "Preference");
            return !o00ooo8.equals(o00oooOooO00o7) ? new OooO.OooO0O0(false, p107o000ooO0.o00Ooo.OooO00o("Preference(androidx.work.impl.model.Preference).\n Expected:\n", o00ooo8, "\n Found:\n", o00oooOooO00o7)) : new OooO.OooO0O0(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final o00000O0 OooO0Oo() {
        return new o00000O0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper OooO0o0(androidx.room.OooO00o oooO00o) {
        OooO oooO = new OooO(oooO00o, new OooO00o(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = oooO00o.f9275OooO0O0;
        String str = oooO00o.f9276OooO0OO;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return oooO00o.f9274OooO00o.create(new SupportSQLiteOpenHelper.Configuration(context, str, oooO, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o00O0000.OooO OooOOo() {
        OooOO0 oooOO1;
        if (this.f9774OooOo0O != null) {
            return this.f9774OooOo0O;
        }
        synchronized (this) {
            if (this.f9774OooOo0O == null) {
                this.f9774OooOo0O = new OooOO0(this);
            }
            oooOO1 = this.f9774OooOo0O;
        }
        return oooOO1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooO0O0 OooOOo0() {
        OooO0OO oooO0OO;
        if (this.f9770OooOOo0 != null) {
            return this.f9770OooOOo0;
        }
        synchronized (this) {
            if (this.f9770OooOOo0 == null) {
                this.f9770OooOOo0 = new OooO0OO(this);
            }
            oooO0OO = this.f9770OooOOo0;
        }
        return oooO0OO;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooOOO0 OooOOoo() {
        OooOOO oooOOO;
        if (this.f9771OooOOoo != null) {
            return this.f9771OooOOoo;
        }
        synchronized (this) {
            if (this.f9771OooOOoo == null) {
                this.f9771OooOOoo = new OooOOO(this);
            }
            oooOOO = this.f9771OooOOoo;
        }
        return oooOOO;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Oooo0 OooOo0() {
        o000oOoO o000oooo2;
        if (this.f9772OooOo0 != null) {
            return this.f9772OooOo0;
        }
        synchronized (this) {
            if (this.f9772OooOo0 == null) {
                this.f9772OooOo0 = new o000oOoO(this);
            }
            o000oooo2 = this.f9772OooOo0;
        }
        return o000oooo2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooOo00 OooOo00() {
        OooOo oooOo;
        if (this.f9773OooOo00 != null) {
            return this.f9773OooOo00;
        }
        synchronized (this) {
            if (this.f9773OooOo00 == null) {
                this.f9773OooOo00 = new OooOo(this);
            }
            oooOo = this.f9773OooOo00;
        }
        return oooOo;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o00O0O OooOo0O() {
        o00Oo0 o00oo1;
        if (this.f9768OooOOOo != null) {
            return this.f9768OooOOOo;
        }
        synchronized (this) {
            if (this.f9768OooOOOo == null) {
                this.f9768OooOOOo = new o00Oo0(this);
            }
            o00oo1 = this.f9768OooOOOo;
        }
        return o00oo1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o00O0000.oo000o OooOo0o() {
        o00oO0o o00oo0o2;
        if (this.f9769OooOOo != null) {
            return this.f9769OooOOo;
        }
        synchronized (this) {
            if (this.f9769OooOOo == null) {
                this.f9769OooOOo = new o00oO0o(this);
            }
            o00oo0o2 = this.f9769OooOOo;
        }
        return o00oo0o2;
    }
}
