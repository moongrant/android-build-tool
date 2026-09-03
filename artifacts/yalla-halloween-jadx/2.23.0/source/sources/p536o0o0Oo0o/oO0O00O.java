package p536o0o0Oo0o;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p469o0OoooOO.o0oO0O0o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f55146OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(AppCompatActivity appCompatActivity) {
        super(1);
        this.f55146OooO0Oo = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            o0OO000.OooO0O0("305003", MapsKt.mapOf(TuplesKt.to("sources", 1)));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
            webPageInfo.f32821OooO0oo = false;
            webPageInfo.f32816OooO = false;
            Intrinsics.checkNotNullExpressionValue(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.f32818OooO0o = true;
            webPageInfo.f32827OooOOOO = o0oO0O0o.f47118o00O0OOo;
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f55146OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
