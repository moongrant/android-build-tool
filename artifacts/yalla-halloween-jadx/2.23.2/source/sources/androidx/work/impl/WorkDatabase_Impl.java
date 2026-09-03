package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o00.OooO0O0;
import o0000O0O.OooO;
import o00O0OO.OooO0OO;
import o00O0OO.OooOO0O;
import o00O0OO.OooOOO0;
import o00O0OO.OooOOOO;
import o00O0OO.OooOo00;
import o00O0OO.Oooo0;
import o00O0OO.o000oOoO;
import o00O0OO.o00O0O;
import o00O0OO.o00Oo0;
import o00O0OO.o00oO0o;
import o00O0OO.o0OO00O;
import o00O0OO.o0Oo0oo;
import o00O0OO.oo000o;
import oo00o.o000000;
import p004OooO0oO.o0OoOo0;
import p110o000ooo0.o000000O;
import p110o000ooo0.o0000OO0;
import p110o000ooo0.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile OooO0OO f11495OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile o00oO0o f11496OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile o0OO00O f11497OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile OooOo00 f11498OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile o00Oo0 f11499OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile o000oOoO f11500OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile OooOO0O f11501OooOOoo;

    public class OooO00o extends o0000OO0.OooO00o {
        public OooO00o() {
            super(16);
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO00o(SupportSQLiteDatabase supportSQLiteDatabase) {
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0O0(SupportSQLiteDatabase db) {
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            db.execSQL("DROP TABLE IF EXISTS `WorkName`");
            db.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            db.execSQL("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = workDatabase_Impl.f10984OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    workDatabase_Impl.f10984OooO0oO.get(i).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0OO(SupportSQLiteDatabase db) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = workDatabase_Impl.f10984OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    workDatabase_Impl.f10984OooO0oO.get(i).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase) {
            WorkDatabase_Impl.this.f10978OooO00o = supportSQLiteDatabase;
            supportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.OooOO0O(supportSQLiteDatabase);
            List<? extends RoomDatabase.OooO0O0> list = WorkDatabase_Impl.this.f10984OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    WorkDatabase_Impl.this.f10984OooO0oO.get(i).OooO00o(supportSQLiteDatabase);
                }
            }
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase) {
            OooO0O0.OooO00o(supportSQLiteDatabase);
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0o0() {
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final o0000OO0.OooO0O0 OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new TableInfo.OooO00o(1, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSetOooO0OO = o0OoOo0.OooO0OO(map, "prerequisite_id", new TableInfo.OooO00o(2, 1, "prerequisite_id", "TEXT", null, true), 2);
            hashSetOooO0OO.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSetOooO0OO.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new TableInfo.OooO0o("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet.add(new TableInfo.OooO0o("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo("Dependency", map, hashSetOooO0OO, hashSet);
            TableInfo tableInfoOooO00o = TableInfo.OooO00o(supportSQLiteDatabase, "Dependency");
            if (!tableInfo.equals(tableInfoOooO00o)) {
                return new o0000OO0.OooO0O0(false, p004OooO0oO.o000oOoO.OooO00o("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", tableInfo, "\n Found:\n", tableInfoOooO00o));
            }
            HashMap map2 = new HashMap(27);
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
            map2.put("last_enqueue_time", new TableInfo.OooO00o(0, 1, "last_enqueue_time", "INTEGER", null, true));
            map2.put("minimum_retention_duration", new TableInfo.OooO00o(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            map2.put("schedule_requested_at", new TableInfo.OooO00o(0, 1, "schedule_requested_at", "INTEGER", null, true));
            map2.put("run_in_foreground", new TableInfo.OooO00o(0, 1, "run_in_foreground", "INTEGER", null, true));
            map2.put("out_of_quota_policy", new TableInfo.OooO00o(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            map2.put("period_count", new TableInfo.OooO00o(0, 1, "period_count", "INTEGER", AppEventsConstants.EVENT_PARAM_VALUE_NO, true));
            map2.put("generation", new TableInfo.OooO00o(0, 1, "generation", "INTEGER", AppEventsConstants.EVENT_PARAM_VALUE_NO, true));
            map2.put("required_network_type", new TableInfo.OooO00o(0, 1, "required_network_type", "INTEGER", null, true));
            map2.put("requires_charging", new TableInfo.OooO00o(0, 1, "requires_charging", "INTEGER", null, true));
            map2.put("requires_device_idle", new TableInfo.OooO00o(0, 1, "requires_device_idle", "INTEGER", null, true));
            map2.put("requires_battery_not_low", new TableInfo.OooO00o(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            map2.put("requires_storage_not_low", new TableInfo.OooO00o(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            map2.put("trigger_content_update_delay", new TableInfo.OooO00o(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            map2.put("trigger_max_content_delay", new TableInfo.OooO00o(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            HashSet hashSetOooO0OO2 = o0OoOo0.OooO0OO(map2, "content_uri_triggers", new TableInfo.OooO00o(0, 1, "content_uri_triggers", "BLOB", null, true), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new TableInfo.OooO0o("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet2.add(new TableInfo.OooO0o("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            TableInfo tableInfo2 = new TableInfo("WorkSpec", map2, hashSetOooO0OO2, hashSet2);
            TableInfo tableInfoOooO00o2 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkSpec");
            if (!tableInfo2.equals(tableInfoOooO00o2)) {
                return new o0000OO0.OooO0O0(false, p004OooO0oO.o000oOoO.OooO00o("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", tableInfo2, "\n Found:\n", tableInfoOooO00o2));
            }
            HashMap map3 = new HashMap(2);
            map3.put(ViewHierarchyConstants.TAG_KEY, new TableInfo.OooO00o(1, 1, ViewHierarchyConstants.TAG_KEY, "TEXT", null, true));
            HashSet hashSetOooO0OO3 = o0OoOo0.OooO0OO(map3, "work_spec_id", new TableInfo.OooO00o(2, 1, "work_spec_id", "TEXT", null, true), 1);
            hashSetOooO0OO3.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new TableInfo.OooO0o("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            TableInfo tableInfo3 = new TableInfo("WorkTag", map3, hashSetOooO0OO3, hashSet3);
            TableInfo tableInfoOooO00o3 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkTag");
            if (!tableInfo3.equals(tableInfoOooO00o3)) {
                return new o0000OO0.OooO0O0(false, p004OooO0oO.o000oOoO.OooO00o("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfoOooO00o3));
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new TableInfo.OooO00o(1, 1, "work_spec_id", "TEXT", null, true));
            map4.put("generation", new TableInfo.OooO00o(2, 1, "generation", "INTEGER", AppEventsConstants.EVENT_PARAM_VALUE_NO, true));
            HashSet hashSetOooO0OO4 = o0OoOo0.OooO0OO(map4, "system_id", new TableInfo.OooO00o(0, 1, "system_id", "INTEGER", null, true), 1);
            hashSetOooO0OO4.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo4 = new TableInfo("SystemIdInfo", map4, hashSetOooO0OO4, new HashSet(0));
            TableInfo tableInfoOooO00o4 = TableInfo.OooO00o(supportSQLiteDatabase, "SystemIdInfo");
            if (!tableInfo4.equals(tableInfoOooO00o4)) {
                return new o0000OO0.OooO0O0(false, p004OooO0oO.o000oOoO.OooO00o("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", tableInfo4, "\n Found:\n", tableInfoOooO00o4));
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new TableInfo.OooO00o(1, 1, "name", "TEXT", null, true));
            HashSet hashSetOooO0OO5 = o0OoOo0.OooO0OO(map5, "work_spec_id", new TableInfo.OooO00o(2, 1, "work_spec_id", "TEXT", null, true), 1);
            hashSetOooO0OO5.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.OooO0o("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            TableInfo tableInfo5 = new TableInfo("WorkName", map5, hashSetOooO0OO5, hashSet4);
            TableInfo tableInfoOooO00o5 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkName");
            if (!tableInfo5.equals(tableInfoOooO00o5)) {
                return new o0000OO0.OooO0O0(false, p004OooO0oO.o000oOoO.OooO00o("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfoOooO00o5));
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new TableInfo.OooO00o(1, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSetOooO0OO6 = o0OoOo0.OooO0OO(map6, "progress", new TableInfo.OooO00o(0, 1, "progress", "BLOB", null, true), 1);
            hashSetOooO0OO6.add(new TableInfo.OooO0O0("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo6 = new TableInfo("WorkProgress", map6, hashSetOooO0OO6, new HashSet(0));
            TableInfo tableInfoOooO00o6 = TableInfo.OooO00o(supportSQLiteDatabase, "WorkProgress");
            if (!tableInfo6.equals(tableInfoOooO00o6)) {
                return new o0000OO0.OooO0O0(false, p004OooO0oO.o000oOoO.OooO00o("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", tableInfo6, "\n Found:\n", tableInfoOooO00o6));
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new TableInfo.OooO00o(1, 1, "key", "TEXT", null, true));
            TableInfo tableInfo7 = new TableInfo("Preference", map7, o0OoOo0.OooO0OO(map7, "long_value", new TableInfo.OooO00o(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
            TableInfo tableInfoOooO00o7 = TableInfo.OooO00o(supportSQLiteDatabase, "Preference");
            return !tableInfo7.equals(tableInfoOooO00o7) ? new o0000OO0.OooO0O0(false, p004OooO0oO.o000oOoO.OooO00o("Preference(androidx.work.impl.model.Preference).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfoOooO00o7)) : new o0000OO0.OooO0O0(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> OooO() {
        HashMap map = new HashMap();
        map.put(oo000o.class, Collections.emptyList());
        map.put(o00O0OO.OooO0O0.class, Collections.emptyList());
        map.put(o0Oo0oo.class, Collections.emptyList());
        map.put(OooOOOO.class, Collections.emptyList());
        map.put(Oooo0.class, Collections.emptyList());
        map.put(o00O0O.class, Collections.emptyList());
        map.put(o00O0OO.OooO.class, Collections.emptyList());
        map.put(OooOOO0.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public final o000000O OooO0Oo() {
        return new o000000O(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final List OooO0o(@NonNull LinkedHashMap linkedHashMap) {
        return Arrays.asList(new o000000(), new oo00o.o000000O());
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper OooO0o0(o0ooOOo o0ooooo) {
        o0000OO0 callback = new o0000OO0(o0ooooo, new OooO00o(), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = o0ooooo.f35953OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = o0ooooo.f35954OooO0O0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        return o0ooooo.f35955OooO0OO.create(new SupportSQLiteOpenHelper.Configuration(context, str, callback, false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends oo00o.OooO0O0>> OooO0oo() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o00O0OO.OooO0O0 OooOOOo() {
        OooO0OO oooO0OO;
        if (this.f11495OooOOO != null) {
            return this.f11495OooOOO;
        }
        synchronized (this) {
            if (this.f11495OooOOO == null) {
                this.f11495OooOOO = new OooO0OO(this);
            }
            oooO0OO = this.f11495OooOOO;
        }
        return oooO0OO;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final OooOOOO OooOOo() {
        OooOo00 oooOo00;
        if (this.f11498OooOOOo != null) {
            return this.f11498OooOOOo;
        }
        synchronized (this) {
            if (this.f11498OooOOOo == null) {
                this.f11498OooOOOo = new OooOo00(this);
            }
            oooOo00 = this.f11498OooOOOo;
        }
        return oooOo00;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o00O0OO.OooO OooOOo0() {
        OooOO0O oooOO0O;
        if (this.f11501OooOOoo != null) {
            return this.f11501OooOOoo;
        }
        synchronized (this) {
            if (this.f11501OooOOoo == null) {
                this.f11501OooOOoo = new OooOO0O(this);
            }
            oooOO0O = this.f11501OooOOoo;
        }
        return oooOO0O;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Oooo0 OooOOoo() {
        o000oOoO o000oooo2;
        if (this.f11500OooOOo0 != null) {
            return this.f11500OooOOo0;
        }
        synchronized (this) {
            if (this.f11500OooOOo0 == null) {
                this.f11500OooOOo0 = new o000oOoO(this);
            }
            o000oooo2 = this.f11500OooOOo0;
        }
        return o000oooo2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final oo000o OooOo0() {
        o00oO0o o00oo0o2;
        if (this.f11496OooOOO0 != null) {
            return this.f11496OooOOO0;
        }
        synchronized (this) {
            if (this.f11496OooOOO0 == null) {
                this.f11496OooOOO0 = new o00oO0o(this);
            }
            o00oo0o2 = this.f11496OooOOO0;
        }
        return o00oo0o2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o00O0O OooOo00() {
        o00Oo0 o00oo1;
        if (this.f11499OooOOo != null) {
            return this.f11499OooOOo;
        }
        synchronized (this) {
            if (this.f11499OooOOo == null) {
                this.f11499OooOOo = new o00Oo0(this);
            }
            o00oo1 = this.f11499OooOOo;
        }
        return o00oo1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o0Oo0oo OooOo0O() {
        o0OO00O o0oo00o2;
        if (this.f11497OooOOOO != null) {
            return this.f11497OooOOOO;
        }
        synchronized (this) {
            if (this.f11497OooOOOO == null) {
                this.f11497OooOOOO = new o0OO00O(this);
            }
            o0oo00o2 = this.f11497OooOOOO;
        }
        return o0oo00o2;
    }
}
