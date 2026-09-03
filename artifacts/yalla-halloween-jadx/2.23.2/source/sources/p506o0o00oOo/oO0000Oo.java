package p506o0o00oOo;

import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends Lambda implements Function1<List<BadgeBannerModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f50436OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(BadgeActivity badgeActivity) {
        super(1);
        this.f50436OooO0Oo = badgeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<BadgeBannerModel> list) {
        List<BadgeBannerModel> list2 = list;
        oO0000O oo0000o = this.f50436OooO0Oo.f26606OooOo0;
        if (oo0000o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0000o = null;
        }
        oo0000o.OooOoO0(list2);
        return Unit.INSTANCE;
    }
}
