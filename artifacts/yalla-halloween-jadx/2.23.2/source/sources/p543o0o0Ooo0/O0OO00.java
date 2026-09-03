package p543o0o0Ooo0;

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
import o0oo0000.OooO00o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class O0OO00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55354OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0OO00(FragmentActivity fragmentActivity) {
        super(1);
        this.f55354OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            OooO00o.OooO0O0("105020");
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserLevel);
            webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.Level));
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f55354OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
