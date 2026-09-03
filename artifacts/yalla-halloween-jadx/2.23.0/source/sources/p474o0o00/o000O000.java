package p474o0o00;

import android.view.View;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47245OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(LoginActivity loginActivity) {
        super(1);
        this.f47245OooO0Oo = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        webPageInfo.OooO0o0(o0000O.f44170o000oOoO);
        webPageInfo.OooO00o("type", FeedbackType.Suggestions);
        int i = WebActivity.f25584OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f47245OooO0Oo, webPageInfo);
        return Unit.INSTANCE;
    }
}
