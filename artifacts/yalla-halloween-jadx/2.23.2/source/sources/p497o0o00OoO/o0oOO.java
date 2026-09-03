package p497o0o00OoO;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49888OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49889OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49888OooO0Oo = oo0o;
        this.f49889OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue = this.f49889OooO0o0.getPremiumLevel().getValue().intValue();
        oo0O oo0o = this.f49888OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102193");
        int i = PremiumActivity.f26673Oooo0oO;
        PremiumActivity.OooO00o.OooO00o(oo0o.f49626OooO00o, PremiumLevel.INSTANCE.of(Integer.valueOf(iIntValue)));
        return Unit.INSTANCE;
    }
}
