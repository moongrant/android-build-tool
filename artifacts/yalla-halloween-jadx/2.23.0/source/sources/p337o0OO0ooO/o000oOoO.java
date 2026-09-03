package p337o0OO0ooO;

import java.io.IOException;
import p336o0OO0oo0.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends OooOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f43382OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f43383OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f43384OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f43385OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(Oooo0 oooo0, Object[] objArr, int i, int i2) {
        super("OkHttp %s ping %08x%08x", objArr);
        this.f43385OooO0oo = oooo0;
        this.f43382OooO0o = i;
        this.f43384OooO0oO = i2;
    }

    @Override // p336o0OO0oo0.OooOOO
    public final void OooO00o() {
        try {
            Oooo0 oooo0 = this.f43385OooO0oo;
            boolean z = this.f43383OooO0o0;
            int i = this.f43382OooO0o;
            int i2 = this.f43384OooO0oO;
            synchronized (oooo0.f43350OooOo0O) {
                try {
                    oooo0.f43350OooOo0O.OooO0oo(i, i2, z);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IOException unused) {
        }
    }
}
