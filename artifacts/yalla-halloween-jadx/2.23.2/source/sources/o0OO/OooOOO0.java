package o0OO;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p340o0OO0ooO.o000OOo;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 implements oO00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42208OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f42209OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o0 f42210OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f42211OooO0oO;

    public OooOOO0(o0O0o0 o0o0o0, com.squareup.okhttp.OooO0OO.OooO0O0 oooO0O0, o0OOo000 o0ooo001) {
        this.f42210OooO0o0 = o0o0o0;
        this.f42209OooO0o = oooO0O0;
        this.f42211OooO0oO = o0ooo001;
    }

    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
        try {
            long jOooOO0O = this.f42210OooO0o0.OooOO0O(oo0oooo, j);
            o0O0o00O o0o0o00o = this.f42211OooO0oO;
            if (jOooOO0O == -1) {
                if (!this.f42208OooO0Oo) {
                    this.f42208OooO0Oo = true;
                    o0o0o00o.close();
                }
                return -1L;
            }
            oo0oooo.OooOo0(oo0oooo.f59828OooO0o0 - jOooOO0O, jOooOO0O, o0o0o00o.OooO0Oo());
            o0o0o00o.OooOoO();
            return jOooOO0O;
        } catch (IOException e) {
            if (!this.f42208OooO0Oo) {
                this.f42208OooO0Oo = true;
                ((com.squareup.okhttp.OooO0OO.OooO0O0) this.f42209OooO0o).OooO00o();
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zOooO0oo;
        if (!this.f42208OooO0Oo) {
            try {
                zOooO0oo = o000OOo.OooO0oo(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zOooO0oo = false;
            }
            if (!zOooO0oo) {
                this.f42208OooO0Oo = true;
                ((com.squareup.okhttp.OooO0OO.OooO0O0) this.f42209OooO0o).OooO00o();
            }
        }
        this.f42210OooO0o0.close();
    }

    @Override // p662o0oooO0O.oO00000
    public final oO00000o timeout() {
        return this.f42210OooO0o0.timeout();
    }
}
