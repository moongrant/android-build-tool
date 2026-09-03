package p085o000OooO;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends RoomDatabase.OooO0O0 {
    @Override // androidx.room.RoomDatabase.OooO0O0
    public final void OooO00o(@NonNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.beginTransaction();
        try {
            int i = WorkDatabase.f8410OooOOO;
            db.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f8411OooOOO0) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }
}
