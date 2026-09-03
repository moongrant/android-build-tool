package p486o0o00O00;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48345OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(WebActivity webActivity) {
        super(1);
        this.f48345OooO0Oo = webActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        WebPageInfo webPageInfo = null;
        WebActivity webActivity = this.f48345OooO0Oo;
        if (zBooleanValue) {
            int i = WebActivity.f25584OooOoO0;
            webActivity.OooOoO0().setLoadError(false);
            WebPageInfo webPageInfo2 = webActivity.f25591OooOo0O;
            if (webPageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo2 = null;
            }
            WebFrom webFrom = webPageInfo2.f32817OooO0Oo;
            WebFrom webFrom2 = WebFrom.LoginInstagram;
            WebPageInfo webPageInfo3 = webActivity.f25591OooOo0O;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo = webPageInfo3;
            }
            WebFrom webFrom3 = webPageInfo.f32817OooO0Oo;
        } else {
            int i2 = WebActivity.f25584OooOoO0;
            webActivity.OooOoO0().setToolbarTitle("");
            webActivity.OooOoO0().setLoadError(true);
            WebPageInfo webPageInfo4 = webActivity.f25591OooOo0O;
            if (webPageInfo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo4 = null;
            }
            WebFrom webFrom4 = webPageInfo4.f32817OooO0Oo;
            WebFrom webFrom5 = WebFrom.LoginInstagram;
            WebPageInfo webPageInfo5 = webActivity.f25591OooOo0O;
            if (webPageInfo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo = webPageInfo5;
            }
            WebFrom webFrom6 = webPageInfo.f32817OooO0Oo;
        }
        return Unit.INSTANCE;
    }
}
