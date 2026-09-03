package p166o00OoOoo;

import OooO00o.OooO00o;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00O0o extends o0OoO00O {
    public o0O00O0o() {
        super("sharedpreferences_xj");
    }

    public final void OooO() {
        OooO0oo("isUp", false);
        OooO0oO(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "");
        OooO0oO("Neme", "");
        OooO0oO(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "");
        OooO0oO("upLoadApkUrl", "");
    }

    public final boolean OooOO0() {
        return OooO0Oo("isUp", false);
    }

    public final String OooOO0O() {
        return OooO0OO(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
    }

    public final long OooOO0o() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MAX_MESSAGE_TIME");
        sbOooO0o0.append(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
        return OooO0O0(sbOooO0o0.toString(), 0L);
    }

    public final void OooOOO(Boolean bool, String str, String str2, String str3, String str4) {
        OooO0oo("isUp", bool.booleanValue());
        OooO0oO(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str);
        OooO0oO("Neme", str4);
        OooO0oO(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str2);
        OooO0oO("upLoadApkUrl", str3);
    }

    public final boolean OooOOO0() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("FIRST_RECOMMEND_TOPIC");
        sbOooO0o0.append(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
        return OooO0Oo(sbOooO0o0.toString(), true);
    }

    public final void OooOOOO(int i) {
        OooO0o0(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()) + "USER_LEAVE_PAGE_MOMENT", i);
    }

    public final void OooOOOo(long j) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MAX_MESSAGE_TIME");
        sbOooO0o0.append(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
        OooO0o(sbOooO0o0.toString(), j);
    }

    public final boolean OooOOo(boolean z) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("NewTask");
        sbOooO0o0.append(OooOOO.f41216OooO00o.OooOo().getValue());
        return OooO0oo(sbOooO0o0.toString(), z);
    }

    public final void OooOOo0(long j) {
        OooO0o("MOMENT_STATISTICAL_TIME", j);
    }
}
