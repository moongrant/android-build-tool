package p502o0o00oOO;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomChatInviteMemberTaskVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatInviteMemberTaskVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatInviteMemberTaskVH$setData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class oOo000Oo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOo000Oo f49681OooO0Oo = new oOo000Oo();

    public oOo000Oo() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(jLongValue);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
