package p662o0oooO0O;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0OO0 implements ooo0Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0o0 f59757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ooo0Oo0 f59758OooO0o0;

    public o0O0OO0(o oVar, o0OOO0OO o0ooo0oo2) {
        this.f59757OooO0Oo = oVar;
        this.f59758OooO0o0 = o0ooo0oo2;
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ooo0Oo0 ooo0oo0 = this.f59758OooO0o0;
        o0O0O0o0 o0o0o0o0 = this.f59757OooO0Oo;
        o0o0o0o0.OooO();
        try {
            try {
                ooo0oo0.close();
                Unit unit = Unit.INSTANCE;
                if (o0o0o0o0.OooOO0()) {
                    throw o0o0o0o0.OooOO0O(null);
                }
            } catch (IOException e) {
                if (!o0o0o0o0.OooOO0()) {
                    throw e;
                }
                throw o0o0o0o0.OooOO0O(e);
            }
        } catch (Throwable th) {
            o0o0o0o0.OooOO0();
            throw th;
        }
    }

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() throws IOException {
        ooo0Oo0 ooo0oo0 = this.f59758OooO0o0;
        o0O0O0o0 o0o0o0o0 = this.f59757OooO0Oo;
        o0o0o0o0.OooO();
        try {
            try {
                ooo0oo0.flush();
                Unit unit = Unit.INSTANCE;
                if (o0o0o0o0.OooOO0()) {
                    throw o0o0o0o0.OooOO0O(null);
                }
            } catch (IOException e) {
                if (!o0o0o0o0.OooOO0()) {
                    throw e;
                }
                throw o0o0o0o0.OooOO0O(e);
            }
        } catch (Throwable th) {
            o0o0o0o0.OooOO0();
            throw th;
        }
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final oO00000o timeout() {
        return this.f59757OooO0Oo;
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.sink(" + this.f59758OooO0o0 + ')';
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final void write(@NotNull oo0OOoo source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        oO000.OooO0O0(source.f59828OooO0o0, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            oO0Oo oo0oo = source.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo);
            while (j2 < 65536) {
                j2 += (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    oo0oo = oo0oo.f59824OooO0o;
                    Intrinsics.checkNotNull(oo0oo);
                }
            }
            ooo0Oo0 ooo0oo0 = this.f59758OooO0o0;
            o0O0O0o0 o0o0o0o0 = this.f59757OooO0Oo;
            o0o0o0o0.OooO();
            try {
                try {
                    ooo0oo0.write(source, j2);
                    Unit unit = Unit.INSTANCE;
                    if (o0o0o0o0.OooOO0()) {
                        throw o0o0o0o0.OooOO0O(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!o0o0o0o0.OooOO0()) {
                        throw e;
                    }
                    throw o0o0o0o0.OooOO0O(e);
                }
            } catch (Throwable th) {
                o0o0o0o0.OooOO0();
                throw th;
            }
        }
    }
}
