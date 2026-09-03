package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import p071o000O0o0.o00000O0;
import p085o000OooO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static final C0167OooO00o f8401OooO00o = new C0167OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final OooO0O0 f8402OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public static final OooO0OO f8403OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public static final OooO0o f8404OooO0Oo = new OooO0o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public static final OooO f8406OooO0o0 = new OooO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public static final OooOO0 f8405OooO0o = new OooOO0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public static final OooOO0O f8407OooO0oO = new OooOO0O();

    public class OooO extends o00000O0 {
        public OooO() {
            super(7, 8);
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0167OooO00o extends o00000O0 {
        public C0167OooO00o() {
            super(1, 2);
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo", "DROP TABLE IF EXISTS alarmInfo", "INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class OooO0O0 extends o00000O0 {
        public OooO0O0() {
            super(3, 4);
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    public class OooO0OO extends o00000O0 {
        public OooO0OO() {
            super(4, 5);
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class OooO0o extends o00000O0 {
        public OooO0o() {
            super(6, 7);
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class OooOO0 extends o00000O0 {
        public OooOO0() {
            super(8, 9);
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class OooOO0O extends o00000O0 {
        public OooOO0O() {
            super(11, 12);
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class OooOOO extends o00000O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f8408OooO0OO;

        public OooOOO(@NonNull Context context) {
            super(9, 10);
            this.f8408OooO0OO = context;
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.f8408OooO0OO;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
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
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
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

    public static class OooOOO0 extends o00000O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f8409OooO0OO;

        public OooOOO0(@NonNull Context context, int i, int i2) {
            super(i, i2);
            this.f8409OooO0OO = context;
        }

        @Override // p071o000O0o0.o00000O0
        public final void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            if (this.f34852OooO0O0 >= 10) {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f8409OooO0OO.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }
}
