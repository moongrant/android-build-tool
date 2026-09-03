package p650o0ooo;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p384o0OOoo0O.Oooo0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p3 f58761OooO0Oo;

    public o3(p3 p3Var) {
        this.f58761OooO0Oo = p3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        webPageInfo.OooO0o0(Oooo0.f43429o000oOoO);
        webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.agreement_lab));
        webPageInfo.OooO00o("type", FeedbackType.Suggestions);
        int i = WebActivity.f25130OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f58761OooO0Oo.f59095OooO0Oo, webPageInfo);
        return null;
    }
}
