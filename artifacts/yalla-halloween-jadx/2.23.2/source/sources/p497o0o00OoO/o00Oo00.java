package p497o0o00OoO;

import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49871OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49872OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49871OooO0Oo = oo0o;
        this.f49872OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue = this.f49872OooO0o0.getVipLevel().getValue().intValue();
        this.f49871OooO0Oo.getClass();
        VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.INSTANCE.of(iIntValue), false, 2, null);
        return Unit.INSTANCE;
    }
}
