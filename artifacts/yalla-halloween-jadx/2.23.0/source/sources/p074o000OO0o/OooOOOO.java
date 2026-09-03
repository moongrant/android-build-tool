package p074o000OO0o;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p422o0OoO0o.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public class OooOOOO implements OooOo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SQLiteProgram f34883OooO0Oo;

    public OooOOOO(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f34883OooO0Oo = delegate;
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f34883OooO0Oo.bindBlob(i, value);
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindDouble(int i, double d) {
        this.f34883OooO0Oo.bindDouble(i, d);
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindLong(int i, long j) {
        this.f34883OooO0Oo.bindLong(i, j);
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindNull(int i) {
        this.f34883OooO0Oo.bindNull(i);
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f34883OooO0Oo.bindString(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34883OooO0Oo.close();
    }
}
