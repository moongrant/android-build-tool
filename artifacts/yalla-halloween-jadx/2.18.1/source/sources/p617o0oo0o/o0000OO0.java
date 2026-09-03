package p617o0oo0o;

import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000 f48484Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o000O000 o000o001) {
        super(1);
        this.f48484Oooo0o = o000o001;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo webPageInfo2 = webPageInfo;
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        if (webPageInfo2.f21218Oooo0oo) {
            o000O000.OooO00o(this.f48484Oooo0o).setHalfDialogWebPageInfo(webPageInfo2);
        } else {
            WebActivity.f22108OoooooO.OooO00o(this.f48484Oooo0o.f48496OooO00o, webPageInfo2);
        }
        return Unit.INSTANCE;
    }
}
