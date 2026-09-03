package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48560OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48559OooO0Oo = o000o;
        this.f48560OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue = this.f48560OooO0o0.getUserId().getValue().longValue();
        o000O o000o = this.f48559OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102192");
        int i = PrivateChatActivity.f25694Oooo000;
        PrivateChatActivity.OooO00o.OooO00o(o000o.f48470OooO00o, Long.valueOf(jLongValue));
        return Unit.INSTANCE;
    }
}
