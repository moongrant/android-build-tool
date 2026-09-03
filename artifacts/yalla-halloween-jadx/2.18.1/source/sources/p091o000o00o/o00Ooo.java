package p091o000o00o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo implements SupportSQLiteOpenHelper, oo0o0Oo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final SupportSQLiteOpenHelper f29213Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final OooO00o f29214Oooo0oO;

    public static final class OooO00o implements SupportSQLiteDatabase {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw null;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f29214Oooo0oO.close();
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public final String getDatabaseName() {
        return this.f29213Oooo0o.getDatabaseName();
    }

    @Override // p091o000o00o.oo0o0Oo
    @NonNull
    public final SupportSQLiteOpenHelper getDelegate() {
        return this.f29213Oooo0o;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NonNull
    @RequiresApi(api = 24)
    public final SupportSQLiteDatabase getWritableDatabase() {
        Objects.requireNonNull(this.f29214Oooo0oO);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.f29213Oooo0o.setWriteAheadLoggingEnabled(z);
    }
}
