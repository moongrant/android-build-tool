package p490o0o00OOO;

import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48612OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48613OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48612OooO0Oo = o000o;
        this.f48613OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O o000o = this.f48612OooO0Oo;
        boolean z = o000o.f48595OooO0Oo.isVerify;
        RoomUserInfoModel roomUserInfoModel = this.f48613OooO0o0;
        if (z) {
            o000o.OooO0oO(roomUserInfoModel.getUserId().getValue().longValue());
        } else {
            o000o.OooO0o(roomUserInfoModel.getUserId().getValue().longValue(), o0000.OooO0OO(oO00OOo0.addbuddy));
        }
        return Unit.INSTANCE;
    }
}
