package p674o0oooo0;

import OooO00o.OooO00o;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOOo implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0o0Oo f52037Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O f52038Oooo0oO;

    public o00OOOOo(o0o0Oo o0o0oo, o0O0O0O o0o0o0o) {
        this.f52037Oooo0o = o0o0oo;
        this.f52038Oooo0oO = o0o0o0o;
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o0o0Oo o0o0oo = this.f52037Oooo0o;
        o0o0oo.OooO();
        try {
            try {
                long jOooo0O0 = this.f52038Oooo0oO.Oooo0O0(sink, j);
                if (o0o0oo.OooOO0()) {
                    throw o0o0oo.OooOO0O(null);
                }
                return jOooo0O0;
            } catch (IOException e) {
                if (o0o0oo.OooOO0()) {
                    throw o0o0oo.OooOO0O(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            o0o0oo.OooOO0();
            throw th;
        }
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o0o0Oo o0o0oo = this.f52037Oooo0o;
        o0o0oo.OooO();
        try {
            try {
                this.f52038Oooo0oO.close();
                Unit unit = Unit.INSTANCE;
                if (o0o0oo.OooOO0()) {
                    throw o0o0oo.OooOO0O(null);
                }
            } catch (IOException e) {
                if (!o0o0oo.OooOO0()) {
                    throw e;
                }
                throw o0o0oo.OooOO0O(e);
            }
        } catch (Throwable th) {
            o0o0oo.OooOO0();
            throw th;
        }
    }

    @Override // p674o0oooo0.o0O0O0O
    public final o0oO0O0o timeout() {
        return this.f52037Oooo0o;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AsyncTimeout.source(");
        sbOooO0o0.append(this.f52038Oooo0oO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
