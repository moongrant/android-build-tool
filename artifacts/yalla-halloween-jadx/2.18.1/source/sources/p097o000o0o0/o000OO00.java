package p097o000o0o0;

import android.database.sqlite.SQLiteProgram;
import p095o000o0Oo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public class o000OO00 implements o00oO0o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final SQLiteProgram f29313Oooo0o;

    public o000OO00(SQLiteProgram sQLiteProgram) {
        this.f29313Oooo0o = sQLiteProgram;
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindBlob(int i, byte[] bArr) {
        this.f29313Oooo0o.bindBlob(i, bArr);
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindDouble(int i, double d) {
        this.f29313Oooo0o.bindDouble(i, d);
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindLong(int i, long j) {
        this.f29313Oooo0o.bindLong(i, j);
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindNull(int i) {
        this.f29313Oooo0o.bindNull(i);
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindString(int i, String str) {
        this.f29313Oooo0o.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29313Oooo0o.close();
    }
}
