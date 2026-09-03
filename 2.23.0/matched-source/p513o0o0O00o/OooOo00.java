package p513o0o0O00o;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OfficialActionModel f51666OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f51667OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(OfficialActionModel officialActionModel, FragmentActivity fragmentActivity) {
        super(0);
        this.f51666OooO0Oo = officialActionModel;
        this.f51667OooO0o0 = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String url = this.f51666OooO0Oo.getH5EntranceUrl();
        if (url != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.f32816OooO = true;
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f51667OooO0o0, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
