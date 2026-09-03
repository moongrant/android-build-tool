package p414o0Oo0o0o;

import OooO00o.OooO00o;
import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p413o0Oo0o0O.o0Oo0oo;
import p413o0Oo0o0O.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo extends o0Oo0oo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f39529Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooO0o f39530Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(o00000O0.OooO0o oooO0o, Object[] objArr, o0000O0O o0000o0o2) {
        super("OkHttp %s stream %d", objArr);
        this.f39530Oooo0oo = oooO0o;
        this.f39529Oooo0oO = o0000o0o2;
    }

    @Override // p413o0Oo0o0O.o0Oo0oo
    public final void OooO00o() {
        try {
            o000O000 o000o001 = o00000O0.this.f39437Oooo0oo;
            o0000O0O o0000o0o2 = this.f39529Oooo0oO;
            Objects.requireNonNull((o000O000.OooO00o) o000o001);
            o0000o0o2.OooO0OO(ErrorCode.REFUSED_STREAM);
        } catch (IOException e) {
            Logger logger = o0ooOOo.f39373OooO00o;
            Level level = Level.INFO;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("StreamHandler failure for ");
            sbOooO0o0.append(o00000O0.this.f39440OoooO00);
            logger.log(level, sbOooO0o0.toString(), (Throwable) e);
            try {
                this.f39529Oooo0oO.OooO0OO(ErrorCode.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
