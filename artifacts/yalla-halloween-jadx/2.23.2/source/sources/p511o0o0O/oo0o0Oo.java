package p511o0o0O;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f51072OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(UserInfoActivity userInfoActivity) {
        super(1);
        this.f51072OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo it = webPageInfo;
        Intrinsics.checkNotNullParameter(it, "it");
        OooO00o.OooO0OO("305003", MapsKt.mapOf(new Pair("sources", 4)));
        this.f51072OooO0Oo.OooOooo().setHalfDialogWebPageInfo(it);
        return Unit.INSTANCE;
    }
}
