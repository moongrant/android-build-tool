package p659o0oooO00;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000 implements o00O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f60166OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00 f60167OooO0o0;

    public o00000(o00O000o o00o000o2, o000Oo0 o000oo1) {
        this.f60166OooO0Oo = o00o000o2;
        this.f60167OooO0o0 = o000oo1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o00O00 o00o01 = this.f60167OooO0o0;
        o000000 o000000Var = this.f60166OooO0Oo;
        o000000Var.OooO();
        try {
            try {
                o00o01.close();
                Unit unit = Unit.INSTANCE;
                if (o000000Var.OooOO0()) {
                    throw o000000Var.OooOO0O(null);
                }
            } catch (IOException e) {
                if (!o000000Var.OooOO0()) {
                    throw e;
                }
                throw o000000Var.OooOO0O(e);
            }
        } catch (Throwable th) {
            o000000Var.OooOO0();
            throw th;
        }
    }

    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o00O00 o00o01 = this.f60167OooO0o0;
        o000000 o000000Var = this.f60166OooO0Oo;
        o000000Var.OooO();
        try {
            try {
                long jO0000OO0 = o00o01.o0000OO0(sink, j);
                if (o000000Var.OooOO0()) {
                    throw o000000Var.OooOO0O(null);
                }
                return jO0000OO0;
            } catch (IOException e) {
                if (o000000Var.OooOO0()) {
                    throw o000000Var.OooOO0O(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            o000000Var.OooOO0();
            throw th;
        }
    }

    @Override // p659o0oooO00.o00O00
    public final o00O00O timeout() {
        return this.f60166OooO0Oo;
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.source(" + this.f60167OooO0o0 + ')';
    }
}
