package p511o0o0O;

import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51025OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(o00000OO o00000oo2) {
        super(1);
        this.f51025OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel it = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        o00000OO o00000oo2 = this.f51025OooO0Oo;
        o00000oo2.OooOoOO(it);
        o00000oo2.OooOOOO();
        if (Intrinsics.areEqual(it, Oooo000.f50938OooO0oO)) {
            OooO00o.OooO0O0("102074");
            GiftPropModel giftPropModel = o00000oo2.f50968OooOOo;
            if ((giftPropModel != null && giftPropModel.isBlind()) || o00000oo2.f50967OooOOOo > 17) {
                o00000oo2.OooOoO(1);
            }
        } else {
            o00000oo2.OooOoO(o00000oo2.f50967OooOOOo);
        }
        return Unit.INSTANCE;
    }
}
