package p590o0oOooo0;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Lambda implements Function2<WebPageInfo, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ l f57120OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar) {
        super(2);
        this.f57120OooO0Oo = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(WebPageInfo webPageInfo, Boolean bool) {
        WebPageInfo webPageInfo2 = webPageInfo;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        l lVar = this.f57120OooO0Oo;
        if (zBooleanValue) {
            lVar.f57132OooO0OO.setHalfDialogWebPageInfo(webPageInfo2);
        } else {
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(lVar.f57130OooO00o, webPageInfo2);
        }
        return Unit.INSTANCE;
    }
}
