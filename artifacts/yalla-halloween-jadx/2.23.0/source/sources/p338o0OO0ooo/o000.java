package p338o0OO0ooo;

import com.squareup.okhttp.OooO0OO;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p336o0OO0oo0.o000oOoO;
import p659o0oooO00.o00;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 implements o00O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f43474OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f43475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000 f43476OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f43477OooO0oO;

    public o000(o0000 o0000Var, OooO0OO.OooO0O0 oooO0O0, o00 o00Var) {
        this.f43476OooO0o0 = o0000Var;
        this.f43475OooO0o = oooO0O0;
        this.f43477OooO0oO = o00Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zOooO0oo;
        if (!this.f43474OooO0Oo) {
            try {
                zOooO0oo = o000oOoO.OooO0oo(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zOooO0oo = false;
            }
            if (!zOooO0oo) {
                this.f43474OooO0Oo = true;
                ((OooO0OO.OooO0O0) this.f43475OooO0o).OooO00o();
            }
        }
        this.f43476OooO0o0.close();
    }

    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(o00000O o00000o, long j) throws IOException {
        try {
            long jO0000OO0 = this.f43476OooO0o0.o0000OO0(o00000o, j);
            o0000Ooo o0000ooo = this.f43477OooO0oO;
            if (jO0000OO0 == -1) {
                if (!this.f43474OooO0Oo) {
                    this.f43474OooO0Oo = true;
                    o0000ooo.close();
                }
                return -1L;
            }
            o00000o.OooOo0(o00000o.f60177OooO0o0 - jO0000OO0, jO0000OO0, o0000ooo.OooO0Oo());
            o0000ooo.OooOoO();
            return jO0000OO0;
        } catch (IOException e) {
            if (!this.f43474OooO0Oo) {
                this.f43474OooO0Oo = true;
                ((OooO0OO.OooO0O0) this.f43475OooO0o).OooO00o();
            }
            throw e;
        }
    }

    @Override // p659o0oooO00.o00O00
    public final o00O00O timeout() {
        return this.f43476OooO0o0.timeout();
    }
}
