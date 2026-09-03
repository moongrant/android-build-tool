package p674o0oooo0;

import OooO00o.OooO00o;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOO0 implements o0O00o00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0o0Oo f52035Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00o00 f52036Oooo0oO;

    public o00OOOO0(o0o0Oo o0o0oo, o0O00o00 o0o00o01) {
        this.f52035Oooo0o = o0o0oo;
        this.f52036Oooo0oO = o0o00o01;
    }

    @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o0o0Oo o0o0oo = this.f52035Oooo0o;
        o0o0oo.OooO();
        try {
            try {
                this.f52036Oooo0oO.close();
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

    @Override // p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() throws IOException {
        o0o0Oo o0o0oo = this.f52035Oooo0o;
        o0o0oo.OooO();
        try {
            try {
                this.f52036Oooo0oO.flush();
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

    @Override // p674o0oooo0.o0O00o00
    public final o0oO0O0o timeout() {
        return this.f52035Oooo0o;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AsyncTimeout.sink(");
        sbOooO0o0.append(this.f52036Oooo0oO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    @Override // p674o0oooo0.o0O00o00
    public final void write(@NotNull o0oOO source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        o00OOO0O.OooO0O0(source.f52099Oooo0oO, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            o0O00OOO o0o00ooo2 = source.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            while (j2 < 65536) {
                j2 += (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                    Intrinsics.checkNotNull(o0o00ooo2);
                }
            }
            o0o0Oo o0o0oo = this.f52035Oooo0o;
            o0o0oo.OooO();
            try {
                try {
                    this.f52036Oooo0oO.write(source, j2);
                    Unit unit = Unit.INSTANCE;
                    if (o0o0oo.OooOO0()) {
                        throw o0o0oo.OooOO0O(null);
                    }
                    j -= j2;
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
    }
}
