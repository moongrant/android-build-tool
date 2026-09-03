package p416o0Oo0oO0;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p412o0Oo0o00.o000000O;
import p413o0Oo0o0O.o000000;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements o0O0O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oo00oO f39589Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f39590Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f39591Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f39592Oooo0oo;

    public o0OO00O(o0oOOo o0oooo2, o00Oo0 o00oo1, oo00oO oo00oo) {
        this.f39591Oooo0oO = o0oooo2;
        this.f39592Oooo0oo = o00oo1;
        this.f39589Oooo = oo00oo;
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
        try {
            long jOooo0O0 = this.f39591Oooo0oO.Oooo0O0(o0ooo2, j);
            if (jOooo0O0 != -1) {
                o0ooo2.OooOOo(this.f39589Oooo.OooO0OO(), o0ooo2.f52099Oooo0oO - jOooo0O0, jOooo0O0);
                this.f39589Oooo.Oooo0oo();
                return jOooo0O0;
            }
            if (!this.f39590Oooo0o) {
                this.f39590Oooo0o = true;
                this.f39589Oooo.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f39590Oooo0o) {
                this.f39590Oooo0o = true;
                ((o000000O.OooO0O0) this.f39592Oooo0oo).OooO00o();
            }
            throw e;
        }
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f39590Oooo0o) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!o000000.OooO0o0(this)) {
                this.f39590Oooo0o = true;
                ((o000000O.OooO0O0) this.f39592Oooo0oo).OooO00o();
            }
        }
        this.f39591Oooo0oO.close();
    }

    @Override // p674o0oooo0.o0O0O0O
    public final o0oO0O0o timeout() {
        return this.f39591Oooo0oO.timeout();
    }
}
