package p536o0o0OOoo;

import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43823Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f43823Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo webPageInfo2 = webPageInfo;
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        if (webPageInfo2.f21218Oooo0oo) {
            PrivateChatActivity.OooOoO(this.f43823Oooo0o).setHalfDialogWebPageInfo(webPageInfo2);
        } else {
            WebActivity.f22108OoooooO.OooO00o(this.f43823Oooo0o, webPageInfo2);
        }
        return Unit.INSTANCE;
    }
}
