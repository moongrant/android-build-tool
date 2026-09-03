package p337o0OO0ooO;

import com.squareup.okhttp.internal.framed.ErrorCode;
import p336o0OO0oo0.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends OooOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f43393OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f43394OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(Oooo0 oooo0, Object[] objArr, int i, ErrorCode errorCode) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f43393OooO0o = oooo0;
        this.f43394OooO0o0 = i;
    }

    @Override // p336o0OO0oo0.OooOOO
    public final void OooO00o() {
        this.f43393OooO0o.f43341OooOOO.getClass();
        synchronized (this.f43393OooO0o) {
            this.f43393OooO0o.f43351OooOo0o.remove(Integer.valueOf(this.f43394OooO0o0));
        }
    }
}
