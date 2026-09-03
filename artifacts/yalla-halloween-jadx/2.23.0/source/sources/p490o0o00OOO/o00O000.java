package p490o0o00OOO;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.oOOo0000;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48635OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48636OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48635OooO0Oo = o000o;
        this.f48636OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O o000o = this.f48635OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102198");
        MixedRoomActivity activity = o000o.f48470OooO00o;
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        RoomUserInfoModel userModel = this.f48636OooO0o0;
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-354292179, true, new oOOo0000(userModel, OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue())));
        return Unit.INSTANCE;
    }
}
