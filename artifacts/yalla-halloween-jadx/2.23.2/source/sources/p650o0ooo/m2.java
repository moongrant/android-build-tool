package p650o0ooo;

import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m2 extends Lambda implements Function1<RoomUserInfoDTO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final m2 f58385OooO0Oo = new m2();

    public m2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoDTO roomUserInfoDTO) {
        RoomUserInfoDTO roomUserInfoDTO2 = roomUserInfoDTO;
        if (roomUserInfoDTO2 != null) {
            OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0.postValue(NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO2));
        }
        return Unit.INSTANCE;
    }
}
