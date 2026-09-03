package p385o0OOooOO;

import com.code.android.util.OooOo00;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import com.yalla.yalla.util.Function.OooO;
import p377o0OOoOo.o0000O0;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p581o0oOoo00.o000OOo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O {

    public class OooO00o extends OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f44344OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f44345OooO0OO;

        public OooO00o(String str, OooO0O0 oooO0O0) {
            this.f44344OooO0O0 = str;
            this.f44345OooO0OO = oooO0O0;
        }

        @Override // com.yalla.yalla.util.Function.OooO, com.yalla.yalla.util.Function.OooO0o
        public final void OooO0o0(String str) {
            OooOOO0.OooO0O0("OkHttpCallback ,OkHttpCallback = , onFinish");
            ApiErrorCodeDB apiErrorCodeDBOooO0OO = o000OOo.OooO00o().OooOOOO().OooO0OO(this.f44344OooO0O0);
            OooO0O0 oooO0O0 = this.f44345OooO0OO;
            if (oooO0O0 == null || !OooOo00.OooO0O0(apiErrorCodeDBOooO0OO)) {
                return;
            }
            oooO0O0.OooO00o(apiErrorCodeDBOooO0OO);
        }
    }

    public interface OooO0O0 {
        void OooO00o(ApiErrorCodeDB apiErrorCodeDB);
    }

    public static void OooO00o(String str, OooO0O0 oooO0O0) {
        ApiErrorCodeDB apiErrorCodeDBOooO0OO = o000OOo.OooO00o().OooOOOO().OooO0OO(str);
        if (OooOo00.OooO0O0(apiErrorCodeDBOooO0OO)) {
            oooO0O0.OooO00o(apiErrorCodeDBOooO0OO);
        } else {
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            o0000O0.OooO00o(new OooO00o(str, oooO0O0));
        }
    }
}
