package p497o0o00OoO;

import com.yalla.yalla.model.gift.GiftPropRoomShowModel;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p483o0o000Oo.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0000 f49828OooO0Oo = new o00O0000();

    public o00O0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        GiftPropRoomShowModel giftPropRoomShowModel = it instanceof GiftPropRoomShowModel ? (GiftPropRoomShowModel) it : null;
        if (giftPropRoomShowModel != null) {
            o000OOo o000ooo2 = OooO00o.f24527OooOOo0;
            o000ooo2.f48624OooO0o0.setValue(Integer.valueOf(giftPropRoomShowModel.getGiftId()));
            o000ooo2.f48623OooO0o.setValue(Integer.valueOf(giftPropRoomShowModel.getGiftPropTypeUser()));
        }
        OooO00o.f24527OooOOo0.f48625OooO0oO.postValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
