package p650o0ooo;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import p476o0OooooO.o0OOo000;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ g2 f58213OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var) {
        super(1);
        this.f58213OooO0Oo = g2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            OooO00o.OooO0OO("305003", MapsKt.mapOf(new Pair("sources", 3)));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserWealthLevel);
            webPageInfo.f32285OooO0oo = false;
            webPageInfo.f32280OooO = false;
            Intrinsics.checkNotNull(str2);
            webPageInfo.OooO0o0(c1.OooO0O0(str2, "selectUserId", String.valueOf(this.f58213OooO0Oo.f58242OooOooo)));
            webPageInfo.f32291OooOOOO = o0OOo000.f48310o00O0Oo;
            com.yalla.yalla.service.room.OooO00o.f24515OooO0o.OooO0Oo(webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
