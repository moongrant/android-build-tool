package p497o0o00OoO;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p650o0ooo.o0OO0oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49865OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49866OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49865OooO0Oo = oo0o;
        this.f49866OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49865OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102194");
        MixedRoomActivity activity = oo0o.f49626OooO00o;
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        RoomUserInfoModel userModel = this.f49866OooO0o0;
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-1781378273, true, new o0OO0oO0(userModel)));
        return Unit.INSTANCE;
    }
}
