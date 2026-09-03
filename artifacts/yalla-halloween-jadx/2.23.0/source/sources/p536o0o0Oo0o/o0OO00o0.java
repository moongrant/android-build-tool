package p536o0o0Oo0o;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f54979OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(AppCompatActivity appCompatActivity) {
        super(1);
        this.f54979OooO0Oo = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        Intrinsics.checkNotNullExpressionValue(url, "it");
        if (!(url.length() == 0)) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
            webPageInfo.f32816OooO = false;
            webPageInfo.f32818OooO0o = true;
            webPageInfo.f32827OooOOOO = o0oO0O0o.f47118o00O0OOo;
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f54979OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
