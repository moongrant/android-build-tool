package p497o0o00OoO;

import android.os.Bundle;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p650o0ooo.oO00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49874OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49875OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49874OooO0Oo = oo0o;
        this.f49875OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49874OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102189");
        RoomUserInfoModel roomUserInfoModel = this.f49875OooO0o0;
        if (roomUserInfoModel.getUserId().getValue().longValue() != 0) {
            long jLongValue = roomUserInfoModel.getUserId().getValue().longValue();
            oO00Oo0 oo00oo0 = new oO00Oo0();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id_key", jLongValue);
            oo00oo0.setArguments(bundle);
            oo00oo0.show(oo0o.f49626OooO00o.getSupportFragmentManager(), "MagicCard");
        }
        return Unit.INSTANCE;
    }
}
