package p136o00OO0oO;

import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    public class OooO00o extends com.app.base.Function.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ String f31644OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f31645OooO0Oo;

        public OooO00o(String str, OooO0O0 oooO0O0) {
            this.f31644OooO0OO = str;
            this.f31645OooO0Oo = oooO0O0;
        }

        @Override // com.app.base.Function.OooO0OO.OooO0O0, com.app.base.Function.OooO0OO.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            ApiErrorCodeDB apiErrorCodeDBOooO0Oo = p491o0o00O00.OooO0OO.OooO00o().OooOOo0().OooO0Oo(this.f31644OooO0OO);
            if (this.f31645OooO0Oo == null || !com.yalla.support.common.util.OooO0OO.OooO0O0(apiErrorCodeDBOooO0Oo)) {
                return;
            }
            this.f31645OooO0Oo.OooO00o(apiErrorCodeDBOooO0Oo);
        }
    }

    public interface OooO0O0 {
        void OooO00o(ApiErrorCodeDB apiErrorCodeDB);
    }

    public final void OooO00o(String str, OooO0O0 oooO0O0) {
        ApiErrorCodeDB apiErrorCodeDBOooO0Oo = p491o0o00O00.OooO0OO.OooO00o().OooOOo0().OooO0Oo(str);
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(apiErrorCodeDBOooO0Oo)) {
            oooO0O0.OooO00o(apiErrorCodeDBOooO0Oo);
        } else {
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o00000OO.f32207OooO00o.OooO00o(new OooO00o(str, oooO0O0));
        }
    }
}
