package p524o0o0O0oO;

import android.view.View;
import com.app.base.interfaceType.FeedbackType;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0o0 f43084Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(o0O0o0 o0o0o0) {
        super(1);
        this.f43084Oooo0o = o0o0o0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        webPageInfo.OooO0Oo(o0ooOOo.f32324o000oOoO);
        webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.agreement_lab));
        webPageInfo.OooO00o("type", FeedbackType.Suggestions);
        WebActivity.f22108OoooooO.OooO00o(this.f43084Oooo0o.f43081OooO0Oo, webPageInfo);
        return Unit.INSTANCE;
    }
}
