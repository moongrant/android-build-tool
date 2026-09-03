package p490o0o00OOO;

import android.os.Bundle;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.oOO00000;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48648OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48649OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48648OooO0Oo = o000o;
        this.f48649OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O o000o = this.f48648OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102189");
        long jLongValue = this.f48649OooO0o0.getUserId().getValue().longValue();
        oOO00000 ooo00000 = new oOO00000();
        Bundle bundle = new Bundle();
        bundle.putLong("user_id_key", jLongValue);
        ooo00000.setArguments(bundle);
        ooo00000.show(o000o.f48470OooO00o.getSupportFragmentManager(), "MagicCard");
        return Unit.INSTANCE;
    }
}
