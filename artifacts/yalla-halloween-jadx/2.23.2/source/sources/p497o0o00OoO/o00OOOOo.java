package p497o0o00OoO;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p650o0ooo.O0000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49870OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49869OooO0Oo = oo0o;
        this.f49870OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49869OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102198");
        MixedRoomActivity activity = oo0o.f49626OooO00o;
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        RoomUserInfoModel userModel = this.f49870OooO0o0;
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-354292179, true, new O0000000(userModel, OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.getValue())));
        return Unit.INSTANCE;
    }
}
