package p617o0oo0o;

import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ p501o0o00o.o000 f48469Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(p501o0o00o.o000 o000Var) {
        super(1);
        this.f48469Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo webPageInfo2 = webPageInfo;
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        WebActivity.f22108OoooooO.OooO00o(this.f48469Oooo0o.f41395OooO0oO, webPageInfo2);
        return Unit.INSTANCE;
    }
}
