package p501o0o00o;

import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41534Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(o000 o000Var) {
        super(1);
        this.f41534Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel it = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f41534Oooo0o.OooOooO(it);
        this.f41534Oooo0o.OooOOo();
        o00000.OooO00o oooO00o = o00000.f41437OooO0o0;
        if (Intrinsics.areEqual(it, o00000.f41439OooO0oo)) {
            o0O00000.OooO0OO("InRoom_gift_selectAllInMic");
            GiftPropModel giftPropModel = this.f41534Oooo0o.f41410OooOo0O;
            boolean z = false;
            if (giftPropModel != null && giftPropModel.isBlind()) {
                z = true;
            }
            if (z) {
                o000 o000Var = this.f41534Oooo0o;
                if (o000Var.f41409OooOo00 > 1) {
                    o000Var.OooOoo0(1);
                }
            } else {
                o000 o000Var2 = this.f41534Oooo0o;
                if (o000Var2.f41409OooOo00 > 17) {
                    o000Var2.OooOoo0(1);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
