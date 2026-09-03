package p543o0o0Ooo0;

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
import o0oo0000.OooO00o;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f55449OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(AppCompatActivity appCompatActivity) {
        super(1);
        this.f55449OooO0Oo = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            OooO00o.OooO0OO("305003", MapsKt.mapOf(TuplesKt.to("sources", 1)));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
            webPageInfo.f32285OooO0oo = false;
            webPageInfo.f32280OooO = false;
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            webPageInfo.f32282OooO0o = true;
            webPageInfo.f32291OooOOOO = o0OOo000.f48310o00O0Oo;
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f55449OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
