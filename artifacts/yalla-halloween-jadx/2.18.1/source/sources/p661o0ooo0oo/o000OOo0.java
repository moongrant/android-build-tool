package p661o0ooo0oo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo0 implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oo00oO f51491Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f51492Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f51493Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00 f51494Oooo0oo;

    public o000OOo0(o0oOOo o0oooo2, o00 o00Var, oo00oO oo00oo) {
        this.f51493Oooo0oO = o0oooo2;
        this.f51494Oooo0oo = o00Var;
        this.f51491Oooo = oo00oo;
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long jOooo0O0 = this.f51493Oooo0oO.Oooo0O0(sink, j);
            if (jOooo0O0 != -1) {
                sink.OooOOo(this.f51491Oooo.OooO0o0(), sink.f52099Oooo0oO - jOooo0O0, jOooo0O0);
                this.f51491Oooo.Oooo0oo();
                return jOooo0O0;
            }
            if (!this.f51492Oooo0o) {
                this.f51492Oooo0o = true;
                this.f51491Oooo.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f51492Oooo0o) {
                this.f51492Oooo0o = true;
                this.f51494Oooo0oo.OooO00o();
            }
            throw e;
        }
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f51492Oooo0o) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!o00OOO00.OooO(this)) {
                this.f51492Oooo0o = true;
                this.f51494Oooo0oo.OooO00o();
            }
        }
        this.f51493Oooo0oO.close();
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public final o0oO0O0o timeout() {
        return this.f51493Oooo0oO.timeout();
    }
}
