package p662o0oooO;

import OooO00o.OooO00o;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import p664o0oooO00.oo0o0Oo;
import p667o0oooOO.s;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00oOoo.OooO f51592OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f51593OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List f51594OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(String str, o00O0O0 o00o0o0, o00oOoo.OooO oooO, List list) {
        super(str, true);
        this.f51593OooO0o0 = o00o0o0;
        this.f51592OooO0o = oooO;
        this.f51594OooO0oO = list;
    }

    @Override // p664o0oooO00.oo0o0Oo
    public final long OooO00o() {
        try {
            this.f51592OooO0o.f51689Oooo0oO.f51663Oooo0oO.OooO0OO(this.f51593OooO0o0);
            return -1L;
        } catch (IOException e) {
            s.OooO00o oooO00o = s.f51921OooO0OO;
            s sVar = s.f51919OooO00o;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Http2Connection.Listener failure for ");
            sbOooO0o0.append(this.f51592OooO0o.f51689Oooo0oO.f51661Oooo);
            sVar.OooO(sbOooO0o0.toString(), 4, e);
            try {
                this.f51593OooO0o0.OooO0OO(ErrorCode.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
