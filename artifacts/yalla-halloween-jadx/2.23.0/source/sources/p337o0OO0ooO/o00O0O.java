package p337o0OO0ooO;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p336o0OO0oo0.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends OooOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List f43386OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f43387OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f43388OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Oooo0 oooo0, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f43388OooO0oO = oooo0;
        this.f43387OooO0o0 = i;
        this.f43386OooO0o = arrayList;
    }

    @Override // p336o0OO0oo0.OooOOO
    public final void OooO00o() {
        this.f43388OooO0oO.f43341OooOOO.getClass();
        try {
            this.f43388OooO0oO.f43350OooOo0O.Oooo0oO(this.f43387OooO0o0, ErrorCode.CANCEL);
            synchronized (this.f43388OooO0oO) {
                this.f43388OooO0oO.f43351OooOo0o.remove(Integer.valueOf(this.f43387OooO0o0));
            }
        } catch (IOException unused) {
        }
    }
}
