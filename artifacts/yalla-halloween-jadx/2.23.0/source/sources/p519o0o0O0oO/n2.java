package p519o0o0O0oO;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteRankModel f52438OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(VoteRankModel voteRankModel) {
        super(1);
        this.f52438OooO0Oo = voteRankModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        long userId = this.f52438OooO0Oo.getUserId();
        if (userId > 0) {
            Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
            builderNewBuilder.setUserid(userId);
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
            }
        }
        return Unit.INSTANCE;
    }
}
