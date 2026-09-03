package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49848OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(oo0O oo0o) {
        super(1);
        this.f49848OooO0Oo = oo0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        MutableStateFlow<Long> userId;
        Long l2 = l;
        if (l2 != null) {
            oo0O oo0o = this.f49848OooO0Oo;
            if (oo0o.OooO0o0().OooO0OO()) {
                RoomUserInfoModel roomUserInfoModel = oo0o.f49904OooO0o0;
                if (Intrinsics.areEqual(l2, (roomUserInfoModel == null || (userId = roomUserInfoModel.getUserId()) == null) ? null : userId.getValue())) {
                    Pair<Boolean, Boolean> pairOooO0Oo = oo0O.OooO0Oo(l2.longValue());
                    oo0o.OooO0o0().OooOOO0(pairOooO0Oo);
                    oo0o.OooO0o0().f58223OooOO0o.f45587OooO0o0.f45545OooO0OO.setImageResource(pairOooO0Oo.getFirst().booleanValue() ? o0Oo0oo.room_dialog_user_info_set_up_mic_down : o0Oo0oo.room_dialog_user_info_set_up_mic_up);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
