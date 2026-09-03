package p509o0o00ooO;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f50877OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(long j) {
        super(1);
        this.f50877OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        long j = this.f50877OooO0Oo;
        if (j > 0) {
            Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
            builderNewBuilder.setUserid(j);
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
            }
        }
        return Unit.INSTANCE;
    }
}
