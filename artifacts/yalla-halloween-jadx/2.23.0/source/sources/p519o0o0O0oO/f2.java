package p519o0o0O0oO;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p469o0OoooOO.o0oO0O0o;
import p579o0oOoo.oOo0o00;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ g2 f52247OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var) {
        super(1);
        this.f52247OooO0Oo = g2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            o0OO000.OooO0O0("305003", MapsKt.mapOf(new Pair("sources", 3)));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
            webPageInfo.f32821OooO0oo = false;
            webPageInfo.f32816OooO = false;
            Intrinsics.checkNotNullExpressionValue(url, "url");
            webPageInfo.OooO0o0(oOo0o00.OooO0O0(url, "selectUserId", String.valueOf(this.f52247OooO0Oo.f52288OooOooo)));
            webPageInfo.f32827OooOOOO = o0oO0O0o.f47118o00O0OOo;
            OooO00o.f24977OooO0o.OooO0Oo(webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
