package p496o0o00o;

import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function1<List<BadgeBannerModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f48980OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(BadgeActivity badgeActivity) {
        super(1);
        this.f48980OooO0Oo = badgeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<BadgeBannerModel> list) {
        List<BadgeBannerModel> list2 = list;
        o0000OO0 o0000oo1 = this.f48980OooO0Oo.f27072OooOo0;
        if (o0000oo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000oo1 = null;
        }
        o0000oo1.OooOoO0(list2);
        return Unit.INSTANCE;
    }
}
