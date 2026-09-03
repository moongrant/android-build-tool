package p426o0OoOO;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f45616OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(o0ooOOo o0ooooo) {
        super(1);
        this.f45616OooO0Oo = o0ooooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        webPageInfo.OooO0o0(o0000O.f44170o000oOoO);
        webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.agreement_lab));
        webPageInfo.OooO00o("type", "1");
        int i = WebActivity.f25584OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f45616OooO0Oo.f45664OooO0Oo, webPageInfo);
        return Unit.INSTANCE;
    }
}
