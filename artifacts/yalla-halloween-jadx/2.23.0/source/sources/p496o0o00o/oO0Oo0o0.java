package p496o0o00o;

import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.UserWelfareRecordActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p579o0oOoo.oOo0o00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareRecordActivity f49171OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0o0(UserWelfareRecordActivity userWelfareRecordActivity) {
        super(1);
        this.f49171OooO0Oo = userWelfareRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserKaVipHelpPage);
            webPageInfo.f32818OooO0o = true;
            Intrinsics.checkNotNullExpressionValue(url, "url");
            webPageInfo.OooO0o0(oOo0o00.OooO0O0(url, "tab", FeedbackType.Suggestions));
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f49171OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
