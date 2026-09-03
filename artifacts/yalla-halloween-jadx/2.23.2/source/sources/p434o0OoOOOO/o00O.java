package p434o0OoOOOO;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f46925OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(o00000OO o00000oo2) {
        super(1);
        this.f46925OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo webPageInfo2 = webPageInfo;
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        int i = WebActivity.f25130OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f46925OooO0Oo.f38487OooO00o, webPageInfo2);
        return Unit.INSTANCE;
    }
}
