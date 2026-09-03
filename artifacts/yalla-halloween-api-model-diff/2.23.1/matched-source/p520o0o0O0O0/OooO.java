package p520o0o0O0O0;

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
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OfficialActionModel f52738OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f52739OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OfficialActionModel officialActionModel, FragmentActivity fragmentActivity) {
        super(0);
        this.f52738OooO0Oo = officialActionModel;
        this.f52739OooO0o0 = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String url = this.f52738OooO0Oo.getH5EntranceUrl();
        if (url != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32289OooO0o0 = url;
            webPageInfo.f32286OooO = true;
            int i = WebActivity.f25131OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f52739OooO0o0, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
