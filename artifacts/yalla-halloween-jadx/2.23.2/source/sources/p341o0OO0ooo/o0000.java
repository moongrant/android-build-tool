package p341o0OO0ooo;

import com.squareup.okhttp.internal.framed.ErrorCode;
import p340o0OO0ooO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00000 f42602OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f42603OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(o00000 o00000Var, Object[] objArr, int i, ErrorCode errorCode) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f42602OooO0o = o00000Var;
        this.f42603OooO0o0 = i;
    }

    @Override // p340o0OO0ooO.o0ooOOo
    public final void OooO00o() {
        this.f42602OooO0o.f42614OooOOO.getClass();
        synchronized (this.f42602OooO0o) {
            this.f42602OooO0o.f42624OooOo0o.remove(Integer.valueOf(this.f42603OooO0o0));
        }
    }
}
