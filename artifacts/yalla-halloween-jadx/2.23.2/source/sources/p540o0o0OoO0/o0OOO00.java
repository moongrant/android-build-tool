package p540o0o0OoO0;

import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OOO00 f54845OooO0Oo = new o0OOO00();

    public o0OOO00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FaqRule);
        Intrinsics.checkNotNull(url);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32283OooO0o0 = url;
        webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.Member_Group_FAQ));
        OooO00o.f24515OooO0o.OooO0Oo(webPageInfo);
        return Unit.INSTANCE;
    }
}
