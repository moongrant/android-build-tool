package p544o0o0OoOO;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class c3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f44211Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(RoomBanEnterUser roomBanEnterUser) {
        super(0);
        this.f44211Oooo0o = roomBanEnterUser;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000 o00o000OooO = o00O000.OooO();
        RoomBanEnterUser roomBanEnterUser = this.f44211Oooo0o;
        Long lValueOf = roomBanEnterUser != null ? Long.valueOf(roomBanEnterUser.getUserId()) : null;
        Objects.requireNonNull(o00o000OooO);
        if (o00O000.f32468OooO00o != null) {
            Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
            builderNewBuilder.setUserid(lValueOf.longValue());
            o00O000.f32468OooO00o.OooO0oO(10068, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
