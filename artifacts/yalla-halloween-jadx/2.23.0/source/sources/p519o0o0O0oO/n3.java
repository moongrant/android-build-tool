package p519o0o0O0oO;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p377o0OOoOo.o0000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class n3 implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p3 f52439OooO0Oo;

    public n3(p3 p3Var) {
        this.f52439OooO0Oo = p3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        webPageInfo.OooO0o0(o0000O.f44170o000oOoO);
        webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.agreement_lab));
        webPageInfo.OooO00o("type", "1");
        int i = WebActivity.f25584OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f52439OooO0Oo.f53077OooO0Oo, webPageInfo);
        return null;
    }
}
