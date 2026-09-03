package p433o0OoOOO0;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.Oooo0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000 f46923OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o000 o000Var) {
        super(1);
        this.f46923OooO0Oo = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        webPageInfo.OooO0o0(Oooo0.f43429o000oOoO);
        webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.agreement_lab));
        webPageInfo.OooO00o("type", "1");
        int i = WebActivity.f25130OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f46923OooO0Oo.f46847OooO0Oo, webPageInfo);
        return Unit.INSTANCE;
    }
}
