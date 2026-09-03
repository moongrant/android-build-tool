package p519o0o0O0oO;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f52810OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo0(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f52810OooO0Oo = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String uid = String.valueOf(this.f52810OooO0Oo.getUserId().getValue().longValue());
        Intrinsics.checkNotNullParameter(uid, "uid");
        Room.InviteBarMemberRequest.Builder builderNewBuilder = Room.InviteBarMemberRequest.newBuilder();
        builderNewBuilder.setUserid(Long.parseLong(uid));
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10061, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
