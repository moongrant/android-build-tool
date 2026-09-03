package p341o0OO0ooo;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.logging.Level;
import p340o0OO0ooO.o0ooOOo;
import p340o0OO0ooO.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00000.OooO0o f42689OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f42690OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(o00000.OooO0o oooO0o, Object[] objArr, o0000O0 o0000o1) {
        super("OkHttp %s stream %d", objArr);
        this.f42689OooO0o = oooO0o;
        this.f42690OooO0o0 = o0000o1;
    }

    @Override // p340o0OO0ooO.o0ooOOo
    public final void OooO00o() {
        o0000O0 o0000o1 = this.f42690OooO0o0;
        o00000.OooO0o oooO0o = this.f42689OooO0o;
        try {
            o00000.this.f42607OooO0o.getClass();
            o0000o1.OooO0OO(ErrorCode.REFUSED_STREAM);
        } catch (IOException e) {
            oo000o.f42598OooO00o.log(Level.INFO, "StreamHandler failure for " + o00000.this.f42610OooO0oo, (Throwable) e);
            try {
                o0000o1.OooO0OO(ErrorCode.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
