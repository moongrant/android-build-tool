package p650o0ooo;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class k5 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebPageInfo, Unit> f58365OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k5(Function1<? super WebPageInfo, Unit> function1) {
        super(1);
        this.f58365OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
            webPageInfo.f32285OooO0oo = false;
            webPageInfo.f32280OooO = true;
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            webPageInfo.f32291OooOOOO = o0OOo000.f48310o00O0Oo;
            OooO00o.OooO0O0("102324");
            Function1<WebPageInfo, Unit> function1 = this.f58365OooO0Oo;
            if (function1 != null) {
                function1.invoke(webPageInfo);
            }
        }
        return Unit.INSTANCE;
    }
}
