package p511o0o0O;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51033OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(o00000OO o00000oo2) {
        super(1);
        this.f51033OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FirstChargeRewardUrlGiftDialog);
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            webPageInfo.f32280OooO = true;
            Function1<? super WebPageInfo, Unit> function1 = this.f51033OooO0Oo.f50965OooOOO0;
            if (function1 != null) {
                function1.invoke(webPageInfo);
            }
        }
        return Unit.INSTANCE;
    }
}
