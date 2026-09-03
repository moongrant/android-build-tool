package o000O0O0;

import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements SupportSQLiteOpenHelper, OooOO0 {

    /* JADX INFO: renamed from: o000O0O0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0406OooO00o implements SupportSQLiteDatabase {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public final String getDatabaseName() {
        throw null;
    }

    @Override // o000O0O0.OooOO0
    @NotNull
    public final SupportSQLiteOpenHelper getDelegate() {
        return null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @NotNull
    public final SupportSQLiteDatabase getWritableDatabase() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
