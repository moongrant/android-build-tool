package p341o0OO0ooo;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import p340o0OO0ooO.o0ooOOo;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f42708OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f42709OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f42710OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00000 f42711OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(o00000 o00000Var, Object[] objArr, int i, oo0OOoo oo0oooo, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f42711OooO0oo = o00000Var;
        this.f42709OooO0o0 = i;
        this.f42708OooO0o = oo0oooo;
        this.f42710OooO0oO = i2;
    }

    @Override // p340o0OO0ooO.o0ooOOo
    public final void OooO00o() {
        try {
            o000O00O.OooO00o oooO00o = this.f42711OooO0oo.f42614OooOOO;
            oo0OOoo oo0oooo = this.f42708OooO0o;
            int i = this.f42710OooO0oO;
            oooO00o.getClass();
            oo0oooo.skip(i);
            this.f42711OooO0oo.f42623OooOo0O.Oooo0oo(this.f42709OooO0o0, ErrorCode.CANCEL);
            synchronized (this.f42711OooO0oo) {
                this.f42711OooO0oo.f42624OooOo0o.remove(Integer.valueOf(this.f42709OooO0o0));
            }
        } catch (IOException unused) {
        }
    }
}
