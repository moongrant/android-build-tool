package p337o0OO0ooO;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.logging.Level;
import p336o0OO0oo0.OooOO0O;
import p336o0OO0oo0.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends OooOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0.OooO0o f43465OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f43466OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(Oooo0.OooO0o oooO0o, Object[] objArr, o0ooOOo o0ooooo) {
        super("OkHttp %s stream %d", objArr);
        this.f43465OooO0o = oooO0o;
        this.f43466OooO0o0 = o0ooooo;
    }

    @Override // p336o0OO0oo0.OooOOO
    public final void OooO00o() {
        o0ooOOo o0ooooo = this.f43466OooO0o0;
        Oooo0.OooO0o oooO0o = this.f43465OooO0o;
        try {
            Oooo0.this.f43334OooO0o.getClass();
            o0ooooo.OooO0OO(ErrorCode.REFUSED_STREAM);
        } catch (IOException e) {
            OooOO0O.f43303OooO00o.log(Level.INFO, "StreamHandler failure for " + Oooo0.this.f43337OooO0oo, (Throwable) e);
            try {
                o0ooooo.OooO0OO(ErrorCode.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
