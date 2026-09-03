package p506o0o00oOo;

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
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareRecordActivity f50407OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(UserWelfareRecordActivity userWelfareRecordActivity) {
        super(1);
        this.f50407OooO0Oo = userWelfareRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserKaVipHelpPage);
            webPageInfo.f32282OooO0o = true;
            Intrinsics.checkNotNull(str2);
            webPageInfo.OooO0o0(c1.OooO0O0(str2, "tab", FeedbackType.Suggestions));
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f50407OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
