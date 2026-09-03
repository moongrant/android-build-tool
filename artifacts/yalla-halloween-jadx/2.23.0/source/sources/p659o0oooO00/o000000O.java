package p659o0oooO00;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000000O implements o00O000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f60174OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O000 f60175OooO0o0;

    public o000000O(o00O000o o00o000o2, o000O o000o) {
        this.f60174OooO0Oo = o00o000o2;
        this.f60175OooO0o0 = o000o;
    }

    @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o00O000 o00o001 = this.f60175OooO0o0;
        o000000 o000000Var = this.f60174OooO0Oo;
        o000000Var.OooO();
        try {
            try {
                o00o001.close();
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

    @Override // p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() throws IOException {
        o00O000 o00o001 = this.f60175OooO0o0;
        o000000 o000000Var = this.f60174OooO0Oo;
        o000000Var.OooO();
        try {
            try {
                o00o001.flush();
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

    @Override // p659o0oooO00.o00O000
    public final o00O00O timeout() {
        return this.f60174OooO0Oo;
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.sink(" + this.f60175OooO0o0 + ')';
    }

    @Override // p659o0oooO00.o00O000
    public final void write(@NotNull o00000O source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        oo00o.OooO0O0(source.f60177OooO0o0, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            o0O0ooO o0o0ooo = source.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo);
            while (j2 < 65536) {
                j2 += (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    o0o0ooo = o0o0ooo.f60253OooO0o;
                    Intrinsics.checkNotNull(o0o0ooo);
                }
            }
            o00O000 o00o001 = this.f60175OooO0o0;
            o000000 o000000Var = this.f60174OooO0Oo;
            o000000Var.OooO();
            try {
                try {
                    o00o001.write(source, j2);
                    Unit unit = Unit.INSTANCE;
                    if (o000000Var.OooOO0()) {
                        throw o000000Var.OooOO0O(null);
                    }
                    j -= j2;
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
    }
}
