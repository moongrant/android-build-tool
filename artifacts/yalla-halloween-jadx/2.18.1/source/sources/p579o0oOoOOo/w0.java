package p579o0oOoOOo;

import android.view.View;
import com.app.base.interfaceType.FeedbackType;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p153o00Oo0oO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ x0 f46337Oooo0o;

    public w0(x0 x0Var) {
        this.f46337Oooo0o = x0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        webPageInfo.OooO0Oo(o0ooOOo.f32324o000oOoO);
        webPageInfo.OooO0OO(OooOOO.OooO0OO(R.string.agreement_lab));
        webPageInfo.OooO00o("type", FeedbackType.Suggestions);
        WebActivity.f22108OoooooO.OooO00o(this.f46337Oooo0o.f46355Oooo0o, webPageInfo);
        return null;
    }
}
