package p520o0o0O0oo;

import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class k8 extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53310OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(x6 x6Var) {
        super(1);
        this.f53310OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel it = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        x6 x6Var = this.f53310OooO0Oo;
        x6Var.OooOoOO(it);
        x6Var.OooOOo0();
        if (Intrinsics.areEqual(it, d6.f53266OooO0oO)) {
            o0OO000.OooO00o("102074");
            GiftPropModel giftPropModel = x6Var.f53384OooOOo;
            if ((giftPropModel != null && giftPropModel.isBlind()) || x6Var.f53383OooOOOo > 17) {
                x6Var.OooOoO(1);
            }
        } else {
            x6Var.OooOoO(x6Var.f53383OooOOOo);
        }
        return Unit.INSTANCE;
    }
}
