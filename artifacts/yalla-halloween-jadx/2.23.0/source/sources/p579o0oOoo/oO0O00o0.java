package p579o0oOoo;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O00o0 extends Lambda implements Function2<WebPageInfo, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f56571OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00o0(oO0O0O00 oo0o0o00) {
        super(2);
        this.f56571OooO0Oo = oo0o0o00;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(WebPageInfo webPageInfo, Boolean bool) {
        WebPageInfo webPageInfo2 = webPageInfo;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        oO0O0O00 oo0o0o00 = this.f56571OooO0Oo;
        if (zBooleanValue) {
            oo0o0o00.f56575OooO0OO.setHalfDialogWebPageInfo(webPageInfo2);
        } else {
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(oo0o0o00.f56573OooO00o, webPageInfo2);
        }
        return Unit.INSTANCE;
    }
}
