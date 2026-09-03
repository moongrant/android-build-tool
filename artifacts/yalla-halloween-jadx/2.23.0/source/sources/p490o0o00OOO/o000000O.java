package p490o0o00OOO;

import com.yalla.yalla.model.gift.GiftPropRoomShowModel;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0o000.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000O f48567OooO0Oo = new o000000O();

    public o000000O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        GiftPropRoomShowModel giftPropRoomShowModel = it instanceof GiftPropRoomShowModel ? (GiftPropRoomShowModel) it : null;
        if (giftPropRoomShowModel != null) {
            o00Ooo o00ooo2 = OooO00o.f24989OooOOo0;
            o00ooo2.f47453OooO0o0.setValue(Integer.valueOf(giftPropRoomShowModel.getGiftId()));
            o00ooo2.f47452OooO0o.setValue(Integer.valueOf(giftPropRoomShowModel.getGiftPropTypeUser()));
        }
        OooO00o.f24989OooOOo0.f47454OooO0oO.postValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
