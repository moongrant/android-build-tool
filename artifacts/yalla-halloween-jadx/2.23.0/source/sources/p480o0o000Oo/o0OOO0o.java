package p480o0o000Oo;

import android.content.SharedPreferences;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends o0ooOOo {
    public o0OOO0o() {
        super("sharedpreferences_xj");
    }

    public final void OooO(Boolean bool, String str, String str2, String str3, String str4) {
        OooO0o("isUp", bool.booleanValue());
        OooO0o0(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str);
        OooO0o0("Neme", str4);
        OooO0o0(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str2);
        OooO0o0("upLoadApkUrl", str3);
    }

    public final void OooO0oO() {
        OooO0o("isUp", false);
        OooO0o0(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "");
        OooO0o0("Neme", "");
        OooO0o0(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "");
        OooO0o0("upLoadApkUrl", "");
    }

    public final long OooO0oo() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String strConcat = "MAX_MESSAGE_TIME".concat(String.valueOf(o000000O.OooOOo0().getValue()));
        SharedPreferences sharedPreferences = this.f47688OooO00o;
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(strConcat, 0L);
    }

    public final void OooOO0(int i) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        OooO0OO(i, String.valueOf(o000000O.OooOOo0().getValue()).concat("USER_LEAVE_PAGE_MOMENT"));
    }

    public final void OooOO0O(long j) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        OooO0Oo(j, "MAX_MESSAGE_TIME".concat(String.valueOf(o000000O.OooOOo0().getValue())));
    }

    public final void OooOO0o(boolean z) {
        StringBuilder sb = new StringBuilder("NewTask");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        sb.append(o000000O.OooOOo0().getValue());
        OooO0o(sb.toString(), z);
    }
}
