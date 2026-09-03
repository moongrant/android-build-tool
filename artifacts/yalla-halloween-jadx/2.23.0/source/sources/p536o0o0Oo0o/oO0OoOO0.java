package p536o0o0Oo0o;

import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OoOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55168OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(FragmentActivity fragmentActivity) {
        super(1);
        this.f55168OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            o0OO000.OooO00o("105020");
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserLevel);
            webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.Level));
            Intrinsics.checkNotNullExpressionValue(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f55168OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
