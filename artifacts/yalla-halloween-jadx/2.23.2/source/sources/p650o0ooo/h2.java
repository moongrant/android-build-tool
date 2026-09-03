package p650o0ooo;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p483o0o000Oo.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f58264OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f58264OooO0Oo = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO00O o0oo00o2 = OooO00o.f24510OooO;
        o0oo00o2.f48639OooO0OO.setValue(Boolean.valueOf(this.f58264OooO0Oo.getRankWeek().getValue().intValue() > 0));
        o0oo00o2.f48638OooO0O0.setValue(Boolean.TRUE);
        o0oo0000.OooO00o.OooO0O0("102209");
        return Unit.INSTANCE;
    }
}
