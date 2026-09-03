package p536o0o0OOoo;

import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43805Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f43805Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        Intrinsics.checkNotNullParameter(url, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.YallaTeamLink);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f21217Oooo0oO = url;
        webPageInfo.f21224OoooOOO = true;
        WebActivity.f22108OoooooO.OooO00o(this.f43805Oooo0o, webPageInfo);
        return Unit.INSTANCE;
    }
}
