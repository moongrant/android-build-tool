package p271o00ooooo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.session.o00O00;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzem;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class oOOoOOO0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzem f40760OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(zzem zzemVar, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f40760OooO0Oo = zzemVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            zzem zzemVar = this.f40760OooO0Oo;
            o00O00.OooO00o(zzemVar.f40788OooO00o, "Opening the local database failed, dropping and recreating it");
            zzemVar.f40788OooO00o.zzf();
            if (!zzemVar.f40788OooO00o.zzaw().getDatabasePath("google_app_measurement_local.db").delete()) {
                zzemVar.f40788OooO00o.zzaA().zzd().zzb("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                zzemVar.f40788OooO00o.zzaA().zzd().zzb("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzal.OooO0O0(this.f40760OooO0Oo.f40788OooO00o.zzaA(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzal.OooO00o(this.f40760OooO0Oo.f40788OooO00o.zzaA(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
