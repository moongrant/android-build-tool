package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48615OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(o000O o000o) {
        super(1);
        this.f48615OooO0Oo = o000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        MutableStateFlow<Long> userId;
        Long l2 = l;
        if (l2 != null) {
            o000O o000o = this.f48615OooO0Oo;
            if (o000o.OooO0o0().OooO0OO()) {
                RoomUserInfoModel roomUserInfoModel = o000o.f48596OooO0o0;
                if (Intrinsics.areEqual(l2, (roomUserInfoModel == null || (userId = roomUserInfoModel.getUserId()) == null) ? null : userId.getValue())) {
                    Pair<Boolean, Boolean> pairOooO0Oo = o000O.OooO0Oo(l2.longValue());
                    o000o.OooO0o0().OooOOO0(pairOooO0Oo);
                    o000o.OooO0o0().f52269OooOO0o.f58049OooO0o0.f57847OooO0OO.setImageResource(pairOooO0Oo.getFirst().booleanValue() ? oOo00OO0.room_dialog_user_info_set_up_mic_down : oOo00OO0.room_dialog_user_info_set_up_mic_up);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
