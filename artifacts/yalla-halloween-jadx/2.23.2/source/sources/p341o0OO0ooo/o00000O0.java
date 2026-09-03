package p341o0OO0ooo;

import java.io.IOException;
import p340o0OO0ooO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f42639OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f42640OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f42641OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00000 f42642OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(o00000 o00000Var, Object[] objArr, int i, int i2) {
        super("OkHttp %s ping %08x%08x", objArr);
        this.f42642OooO0oo = o00000Var;
        this.f42639OooO0o = i;
        this.f42641OooO0oO = i2;
    }

    @Override // p340o0OO0ooO.o0ooOOo
    public final void OooO00o() {
        try {
            o00000 o00000Var = this.f42642OooO0oo;
            boolean z = this.f42640OooO0o0;
            int i = this.f42639OooO0o;
            int i2 = this.f42641OooO0oO;
            synchronized (o00000Var.f42623OooOo0O) {
                try {
                    o00000Var.f42623OooOo0O.OooO0oo(i, i2, z);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IOException unused) {
        }
    }
}
