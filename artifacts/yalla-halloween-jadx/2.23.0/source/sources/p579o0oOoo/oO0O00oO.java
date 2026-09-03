package p579o0oOoo;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p520o0o0O0oo.x6;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O00oO extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f56572OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(x6 x6Var) {
        super(1);
        this.f56572OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo webPageInfo2 = webPageInfo;
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        int i = WebActivity.f25584OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f56572OooO0Oo.f53375OooO0oO, webPageInfo2);
        return Unit.INSTANCE;
    }
}
