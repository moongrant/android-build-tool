package o0OOOOOO;

import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o0oOOo;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 implements o00OOO00 {
    @Override // p634o0ooO0oO.o00OOO00
    public final o0oOOo intercept(o00OOO00.OooO00o oooO00o) throws IOException {
        nc ncVar = (nc) oooO00o;
        o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(ncVar.f59720OooO0o0);
        if (o0ooooOooO0O0.f57345OooO0oO != 403) {
            return o0ooooOooO0O0;
        }
        o0oOOo.OooO00o oooO00o2 = new o0oOOo.OooO00o(o0ooooOooO0O0);
        oooO00o2.f57358OooO0OO = YallaTeamMessage.JumpId.YallaPremium_Patrician;
        Intrinsics.checkNotNullParameter("Unauthorized", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f57359OooO0Oo = "Unauthorized";
        return oooO00o2.OooO00o();
    }
}
