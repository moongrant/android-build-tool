package o000O0O0;

import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements SupportSQLiteOpenHelper, OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO f34770OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f34771OooO0o0;

    public final void OooO00o(File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    public final void OooO0OO(boolean z) {
        if (getDatabaseName() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
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
    @NotNull
    public final SupportSQLiteDatabase getWritableDatabase() {
        if (!this.f34771OooO0o0) {
            OooO0OO(true);
            this.f34771OooO0o0 = true;
        }
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
