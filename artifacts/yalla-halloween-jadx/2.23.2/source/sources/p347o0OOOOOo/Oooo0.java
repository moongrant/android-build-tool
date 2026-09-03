package p347o0OOOOOo;

import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o0OoOoOo {
    @Override // p641o0ooOO0o.o0OoOoOo
    public final o0O00o00 intercept(o0OoOoOo.OooO00o oooO00o) throws IOException {
        o000O o000o = (o000O) oooO00o;
        o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(o000o.f59401OooO0o0);
        if (o0o00o00OooO0OO.f57850OooO0oO != 403) {
            return o0o00o00OooO0OO;
        }
        o0O00o00.OooO00o oooO00o2 = new o0O00o00.OooO00o(o0o00o00OooO0OO);
        oooO00o2.f57863OooO0OO = YallaTeamMessage.JumpId.YallaPremium_Patrician;
        Intrinsics.checkNotNullParameter("Unauthorized", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f57864OooO0Oo = "Unauthorized";
        return oooO00o2.OooO00o();
    }
}
