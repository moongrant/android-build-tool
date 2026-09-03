package p540o0o0OoO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOo0oooO f54901OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54902OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomFollowAndJoinCheckVM f54903OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54904OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO(oOo0oooO ooo0oooo, RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner, int i) {
        super(2);
        this.f54901OooO0Oo = ooo0oooo;
        this.f54903OooO0o0 = roomFollowAndJoinCheckVM;
        this.f54902OooO0o = lifecycleOwner;
        this.f54904OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54904OooO0oO | 1);
        RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM = this.f54903OooO0o0;
        LifecycleOwner lifecycleOwner = this.f54902OooO0o;
        oOo0oooO.OooO0Oo(this.f54901OooO0Oo, roomFollowAndJoinCheckVM, lifecycleOwner, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
