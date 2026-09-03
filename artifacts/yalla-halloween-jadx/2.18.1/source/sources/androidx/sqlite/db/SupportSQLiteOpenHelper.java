package androidx.sqlite.db;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    public static class Configuration {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Context f9349OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f9350OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final OooO00o f9351OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f9352OooO0Oo;

        public Configuration(@NonNull Context context, @Nullable String str, @NonNull OooO00o oooO00o, boolean z) {
            this.f9349OooO00o = context;
            this.f9350OooO0O0 = str;
            this.f9351OooO0OO = oooO00o;
            this.f9352OooO0Oo = z;
        }
    }

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f9353OooO00o;

        public OooO00o(int i) {
            this.f9353OooO00o = i;
        }

        public final void OooO00o(String str) {
            if (str.equalsIgnoreCase(SQLiteDatabase.MEMORY) || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public abstract void OooO0O0();

        public abstract void OooO0OO(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0Oo(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public abstract void OooO0o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public abstract void OooO0o0(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);
    }

    public interface OooO0O0 {
        @NonNull
        SupportSQLiteOpenHelper create(@NonNull Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}
