package p519o0o0O0oO;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f52403OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(RoomVoteDialog roomVoteDialog) {
        super(0);
        this.f52403OooO0Oo = roomVoteDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f52403OooO0Oo.f27964OooOOoo = true;
        RoomGameConfig.Vote value = OooO0O0.f24995OoooOOO.OooO00o().f25037Oooo0oO.getValue();
        Long lValueOf = Long.valueOf(value != null ? value.getVoteId() : 0L);
        Room.EndVoteRequest.Builder builderNewBuilder = Room.EndVoteRequest.newBuilder();
        Intrinsics.checkNotNull(lValueOf);
        builderNewBuilder.setVoteId(lValueOf.longValue());
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1100001, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
