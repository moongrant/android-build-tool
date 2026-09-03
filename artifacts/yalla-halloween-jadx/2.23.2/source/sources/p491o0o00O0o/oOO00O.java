package p491o0o00O0o;

import android.view.View;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f49071OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(LoginActivity loginActivity) {
        super(1);
        this.f49071OooO0Oo = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        webPageInfo.OooO0o0(Oooo0.f43429o000oOoO);
        webPageInfo.OooO00o("type", "1");
        int i = WebActivity.f25130OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f49071OooO0Oo, webPageInfo);
        return Unit.INSTANCE;
    }
}
