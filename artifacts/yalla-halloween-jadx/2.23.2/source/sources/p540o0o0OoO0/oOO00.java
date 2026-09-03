package p540o0o0OoO0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFollowAndJoinCheckVM f55001OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55002OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00(RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f55001OooO0Oo = roomFollowAndJoinCheckVM;
        this.f55002OooO0o0 = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O0O.OooO0Oo(this.f55001OooO0Oo.unfollowRoom(OooO00o.f24516OooO0o0.OooO0o0()), this.f55002OooO0o0, false, null, null, oOO000o.f55010OooO0Oo, 14);
        return Unit.INSTANCE;
    }
}
