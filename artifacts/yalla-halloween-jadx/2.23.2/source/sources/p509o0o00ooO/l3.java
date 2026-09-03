package p509o0o00ooO;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomChatInviteMemberTaskVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatInviteMemberTaskVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatInviteMemberTaskVH$setData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class l3 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final l3 f50728OooO0Oo = new l3();

    public l3() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(jLongValue);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
