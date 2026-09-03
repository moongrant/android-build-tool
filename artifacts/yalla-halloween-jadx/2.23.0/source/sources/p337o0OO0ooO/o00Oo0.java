package p337o0OO0ooO;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import p336o0OO0oo0.OooOOO;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends OooOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00000O f43389OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f43390OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f43391OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f43392OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Oooo0 oooo0, Object[] objArr, int i, o00000O o00000o, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f43392OooO0oo = oooo0;
        this.f43390OooO0o0 = i;
        this.f43389OooO0o = o00000o;
        this.f43391OooO0oO = i2;
    }

    @Override // p336o0OO0oo0.OooOOO
    public final void OooO00o() {
        try {
            o00000O0.OooO00o oooO00o = this.f43392OooO0oo.f43341OooOOO;
            o00000O o00000o = this.f43389OooO0o;
            int i = this.f43391OooO0oO;
            oooO00o.getClass();
            o00000o.skip(i);
            this.f43392OooO0oo.f43350OooOo0O.Oooo0oO(this.f43390OooO0o0, ErrorCode.CANCEL);
            synchronized (this.f43392OooO0oo) {
                this.f43392OooO0oo.f43351OooOo0o.remove(Integer.valueOf(this.f43390OooO0o0));
            }
        } catch (IOException unused) {
        }
    }
}
