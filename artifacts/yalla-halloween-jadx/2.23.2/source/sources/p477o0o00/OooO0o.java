package p477o0o00;

import android.content.SharedPreferences;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends OooO0OO {
    public OooO0o() {
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
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strConcat = "MAX_MESSAGE_TIME".concat(String.valueOf(o0O00oO0.OooOOo0().getValue()));
        SharedPreferences sharedPreferences = this.f48377OooO00o;
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(strConcat, 0L);
    }

    public final void OooOO0(int i) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooO0OO(i, String.valueOf(o0O00oO0.OooOOo0().getValue()).concat("USER_LEAVE_PAGE_MOMENT"));
    }

    public final void OooOO0O(long j) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooO0Oo(j, "MAX_MESSAGE_TIME".concat(String.valueOf(o0O00oO0.OooOOo0().getValue())));
    }

    public final void OooOO0o(boolean z) {
        StringBuilder sb = new StringBuilder("NewTask");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        sb.append(o0O00oO0.OooOOo0().getValue());
        OooO0o(sb.toString(), z);
    }
}
