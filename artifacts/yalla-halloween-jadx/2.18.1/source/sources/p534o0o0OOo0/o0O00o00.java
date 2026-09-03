package p534o0o0OOo0;

import android.view.View;
import com.app.base.interfaceType.FeedbackType;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p153o00Oo0oO.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f43551Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(LoginActivity loginActivity) {
        super(1);
        this.f43551Oooo0o = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        webPageInfo.OooO0Oo(o0ooOOo.f32324o000oOoO);
        webPageInfo.OooO00o("type", FeedbackType.Suggestions);
        WebActivity.f22108OoooooO.OooO00o(this.f43551Oooo0o, webPageInfo);
        return Unit.INSTANCE;
    }
}
