package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import p023Oooo00O.o000O00;
import p713oooo00o.o0O000o0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static C0069OooO00o f9756OooO00o = new C0069OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static OooO0O0 f9757OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public static OooO0OO f9758OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public static OooO0o f9759OooO0Oo = new OooO0o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public static OooO f9761OooO0o0 = new OooO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public static OooOO0 f9760OooO0o = new OooOO0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public static OooOO0O f9762OooO0oO = new OooOO0O();

    public class OooO extends o0O000o0 {
        public OooO() {
            super(7, 8);
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0069OooO00o extends o0O000o0 {
        public C0069OooO00o() {
            super(1, 2);
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            o000O00.OooO0OO(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo", "DROP TABLE IF EXISTS alarmInfo", "INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class OooO0O0 extends o0O000o0 {
        public OooO0O0() {
            super(3, 4);
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            if (Build.VERSION.SDK_INT >= 23) {
                supportSQLiteDatabase.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    public class OooO0OO extends o0O000o0 {
        public OooO0OO() {
            super(4, 5);
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class OooO0o extends o0O000o0 {
        public OooO0o() {
            super(6, 7);
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class OooOO0 extends o0O000o0 {
        public OooOO0() {
            super(8, 9);
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class OooOO0O extends o0O000o0 {
        public OooOO0O() {
            super(11, 12);
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class OooOOO extends o0O000o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f9763OooO0OO;

        public OooOOO(@NonNull Context context) {
            super(9, 10);
            this.f9763OooO0OO = context;
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f9763OooO0OO.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                supportSQLiteDatabase.beginTransaction();
                try {
                    supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                    supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                    sharedPreferences.edit().clear().apply();
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    supportSQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            SharedPreferences sharedPreferences2 = this.f9763OooO0OO.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                supportSQLiteDatabase.beginTransaction();
                try {
                    supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    supportSQLiteDatabase.setTransactionSuccessful();
                } finally {
                    supportSQLiteDatabase.endTransaction();
                }
            }
        }
    }

    public static class OooOOO0 extends o0O000o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f9764OooO0OO;

        public OooOOO0(@NonNull Context context, int i, int i2) {
            super(i, i2);
            this.f9764OooO0OO = context;
        }

        @Override // p713oooo00o.o0O000o0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            if (this.f53610OooO0O0 >= 10) {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f9764OooO0OO.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }
}
