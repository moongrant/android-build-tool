package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48645OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48646OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48645OooO0Oo = o000o;
        this.f48646OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue = this.f48646OooO0o0.getIdLevel().getValue().intValue();
        o000O o000o = this.f48645OooO0Oo;
        o000o.getClass();
        if (iIntValue != 0) {
            o00O000o.f44500OooOO0o.observe(o000o.f48470OooO00o, new o00O0OO0(o000o));
        }
        return Unit.INSTANCE;
    }
}
