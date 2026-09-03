package p391o0OOooo0;

import com.code.android.util.OooOo00;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import com.yalla.yalla.util.Function.OooO;
import p384o0OOoo0O.o00oO0o;
import p408o0Oo0Oo0.o00Oo0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O {

    public class OooO00o extends OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f43565OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f43566OooO0OO;

        public OooO00o(String str, OooO0O0 oooO0O0) {
            this.f43565OooO0O0 = str;
            this.f43566OooO0OO = oooO0O0;
        }

        @Override // com.yalla.yalla.util.Function.OooO, com.yalla.yalla.util.Function.OooO0o
        public final void OooO0o0(String str) {
            o0000O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , onFinish");
            ApiErrorCodeDB apiErrorCodeDBOooO0OO = o00Oo0.OooO00o().OooOOOo().OooO0OO(this.f43565OooO0O0);
            OooO0O0 oooO0O0 = this.f43566OooO0OO;
            if (oooO0O0 == null || !OooOo00.OooO0O0(apiErrorCodeDBOooO0OO)) {
                return;
            }
            oooO0O0.OooO0OO(apiErrorCodeDBOooO0OO);
        }
    }

    public interface OooO0O0 {
        void OooO0OO(ApiErrorCodeDB apiErrorCodeDB);
    }

    public static void OooO00o(String str, OooO0O0 oooO0O0) {
        ApiErrorCodeDB apiErrorCodeDBOooO0OO = o00Oo0.OooO00o().OooOOOo().OooO0OO(str);
        if (OooOo00.OooO0O0(apiErrorCodeDBOooO0OO)) {
            oooO0O0.OooO0OO(apiErrorCodeDBOooO0OO);
        } else {
            o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
            p384o0OOoo0O.OooOo00.OooO00o(new OooO00o(str, oooO0O0));
        }
    }
}
