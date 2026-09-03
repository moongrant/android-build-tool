package p337o0OO0ooO;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p336o0OO0oo0.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends OooOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List f43440OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f43441OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f43442OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(Oooo0 oooo0, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f43442OooO0oO = oooo0;
        this.f43441OooO0o0 = i;
        this.f43440OooO0o = arrayList;
    }

    @Override // p336o0OO0oo0.OooOOO
    public final void OooO00o() {
        this.f43442OooO0oO.f43341OooOOO.getClass();
        try {
            this.f43442OooO0oO.f43350OooOo0O.Oooo0oO(this.f43441OooO0o0, ErrorCode.CANCEL);
            synchronized (this.f43442OooO0oO) {
                this.f43442OooO0oO.f43351OooOo0o.remove(Integer.valueOf(this.f43441OooO0o0));
            }
        } catch (IOException unused) {
        }
    }
}
