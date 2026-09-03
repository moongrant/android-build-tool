package p427o0OoOO00;

import com.geetest.captcha.GTCaptcha4Client;
import com.yalla.yalla.ui.fragment.moment.MomentDetailLikeFragment;
import kotlin.jvm.functions.Function0;
import o0OO0o.OooOOO0;
import p389o0OOoooO.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00Oo0 implements GTCaptcha4Client.OnWebViewShowListener, oo0o0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f45692OooO0Oo;

    public /* synthetic */ o00Oo0(Object obj) {
        this.f45692OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.oo0o0O0
    public final void OooO00o(OooOOO0 oooOOO0) {
        MomentDetailLikeFragment.init$lambda$0((MomentDetailLikeFragment) this.f45692OooO0Oo, oooOOO0);
    }

    @Override // com.geetest.captcha.GTCaptcha4Client.OnWebViewShowListener
    public final void onWebViewShow() {
        Function0 function0 = (Function0) this.f45692OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
