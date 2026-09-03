package p435o0OoOOO0;

import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOOO0;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements o00OO00O {
    @Override // p660o0ooo0o0.o00OO00O
    public final o00OOOO0 intercept(o00OO00O.OooO00o oooO00o) throws IOException {
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(ooo00o0o.f51883OooO0o);
        if (o00oooo0OooO0O0.f51443OoooO00 != 403) {
            return o00oooo0OooO0O0;
        }
        o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
        oooO00o2.f51454OooO0OO = 401;
        Intrinsics.checkNotNullParameter("Unauthorized", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f51455OooO0Oo = "Unauthorized";
        return oooO00o2.OooO00o();
    }
}
