package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49883OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49884OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49883OooO0Oo = oo0o;
        this.f49884OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue = this.f49884OooO0o0.getIdLevel().getValue().intValue();
        oo0O oo0o = this.f49883OooO0Oo;
        oo0o.getClass();
        if (iIntValue != 0) {
            o00000OO.f56669OooOO0o.observe(oo0o.f49626OooO00o, new o00O0O0O(oo0o, 0));
        }
        return Unit.INSTANCE;
    }
}
