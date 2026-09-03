package p669oO0Oo;

import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000O f60453OooO0Oo = new o000O();

    public o000O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FaqRule);
        Intrinsics.checkNotNullExpressionValue(url, "it");
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32819OooO0o0 = url;
        webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.Member_Group_FAQ));
        OooO00o.f24977OooO0o.OooO0Oo(webPageInfo);
        return Unit.INSTANCE;
    }
}
