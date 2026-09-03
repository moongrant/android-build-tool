package p519o0o0O0oO;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p469o0OoooOO.o0oO0O0o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class j5 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebPageInfo, Unit> f52381OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j5(Function1<? super WebPageInfo, Unit> function1) {
        super(1);
        this.f52381OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
            webPageInfo.f32821OooO0oo = false;
            webPageInfo.f32816OooO = true;
            Intrinsics.checkNotNullExpressionValue(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.f32827OooOOOO = o0oO0O0o.f47118o00O0OOo;
            o0OO000.OooO00o("102324");
            Function1<WebPageInfo, Unit> function1 = this.f52381OooO0Oo;
            if (function1 != null) {
                function1.invoke(webPageInfo);
            }
        }
        return Unit.INSTANCE;
    }
}
