package p235o00oOoo;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p323o0O0ooO.o000;

/* JADX INFO: loaded from: classes2.dex */
public class o000O0o implements o000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SQLiteProgram f39931OooO0Oo;

    public o000O0o(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f39931OooO0Oo = delegate;
    }

    @Override // p323o0O0ooO.o000
    public final void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f39931OooO0Oo.bindBlob(i, value);
    }

    @Override // p323o0O0ooO.o000
    public final void bindDouble(int i, double d) {
        this.f39931OooO0Oo.bindDouble(i, d);
    }

    @Override // p323o0O0ooO.o000
    public final void bindLong(int i, long j) {
        this.f39931OooO0Oo.bindLong(i, j);
    }

    @Override // p323o0O0ooO.o000
    public final void bindNull(int i) {
        this.f39931OooO0Oo.bindNull(i);
    }

    @Override // p323o0O0ooO.o000
    public final void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f39931OooO0Oo.bindString(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39931OooO0Oo.close();
    }
}
