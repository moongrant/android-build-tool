package p139o00OOOo0;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f31758Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f31758Oooo0o = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000 o00o000OooO = o00O000.OooO();
        String strValueOf = String.valueOf(this.f31758Oooo0o.getUserId());
        Objects.requireNonNull(o00o000OooO);
        if (o00O000.f32468OooO00o != null) {
            Room.InviteBarMemberRequest.Builder builderNewBuilder = Room.InviteBarMemberRequest.newBuilder();
            builderNewBuilder.setUserid(Long.parseLong(strValueOf));
            o00O000.f32468OooO00o.OooO0oO(10061, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
