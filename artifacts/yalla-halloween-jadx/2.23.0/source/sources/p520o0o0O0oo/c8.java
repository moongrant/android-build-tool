package p520o0o0O0oo;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p469o0OoooOO.o0oO0O0o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class c8 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53262OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(x6 x6Var) {
        super(1);
        this.f53262OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        String url;
        GiftPropModel giftPropModel2 = giftPropModel;
        if (giftPropModel2 == null || (url = giftPropModel2.getExplainUrl()) == null) {
            url = "";
        }
        o0OO000.OooO00o("202039");
        x6 x6Var = this.f53262OooO0Oo;
        x6Var.getClass();
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
        webPageInfo.f32821OooO0oo = false;
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32819OooO0o0 = url;
        webPageInfo.f32827OooOOOO = o0oO0O0o.f46999OooooOO;
        Function2<? super WebPageInfo, ? super Boolean, Unit> function2 = x6Var.f53379OooOO0o;
        if (function2 != null) {
            function2.invoke(webPageInfo, Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
