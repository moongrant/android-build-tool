package p487o0o00O;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48894OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(WebActivity webActivity) {
        super(1);
        this.f48894OooO0Oo = webActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        WebPageInfo webPageInfo = null;
        WebActivity webActivity = this.f48894OooO0Oo;
        if (zBooleanValue) {
            int i = WebActivity.f25130OooOoO0;
            webActivity.OooOoO0().setLoadError(false);
            WebPageInfo webPageInfo2 = webActivity.f25137OooOo0O;
            if (webPageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo2 = null;
            }
            WebFrom webFrom = webPageInfo2.f32281OooO0Oo;
            WebFrom webFrom2 = WebFrom.LoginInstagram;
            WebPageInfo webPageInfo3 = webActivity.f25137OooOo0O;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo = webPageInfo3;
            }
            WebFrom webFrom3 = webPageInfo.f32281OooO0Oo;
        } else {
            int i2 = WebActivity.f25130OooOoO0;
            webActivity.OooOoO0().setToolbarTitle("");
            webActivity.OooOoO0().setLoadError(true);
            WebPageInfo webPageInfo4 = webActivity.f25137OooOo0O;
            if (webPageInfo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo4 = null;
            }
            WebFrom webFrom4 = webPageInfo4.f32281OooO0Oo;
            WebFrom webFrom5 = WebFrom.LoginInstagram;
            WebPageInfo webPageInfo5 = webActivity.f25137OooOo0O;
            if (webPageInfo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo = webPageInfo5;
            }
            WebFrom webFrom6 = webPageInfo.f32281OooO0Oo;
        }
        return Unit.INSTANCE;
    }
}
