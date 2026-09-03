package p511o0o0O;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51016OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(o00000OO o00000oo2) {
        super(1);
        this.f51016OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        String url;
        GiftPropModel giftPropModel2 = giftPropModel;
        if (giftPropModel2 == null || (url = giftPropModel2.getExplainUrl()) == null) {
            url = "";
        }
        OooO00o.OooO0O0("202039");
        o00000OO o00000oo2 = this.f51016OooO0Oo;
        o00000oo2.getClass();
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
        webPageInfo.f32285OooO0oo = false;
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32283OooO0o0 = url;
        webPageInfo.f32291OooOOOO = o0OOo000.f48190Oooooo;
        Function2<? super WebPageInfo, ? super Boolean, Unit> function2 = o00000oo2.f50963OooOO0o;
        if (function2 != null) {
            function2.invoke(webPageInfo, Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
