package p520o0o0O0oo;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class q6 extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f53326OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(UserInfoActivity userInfoActivity) {
        super(1);
        this.f53326OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo it = webPageInfo;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OO000.OooO0O0("305003", MapsKt.mapOf(new Pair("sources", 4)));
        this.f53326OooO0Oo.OooOooo().setHalfDialogWebPageInfo(it);
        return Unit.INSTANCE;
    }
}
