package p669oO0Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0OO f60779OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f60780OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomFollowAndJoinCheckVM f60781OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f60782OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(o0OOO0OO o0ooo0oo2, RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner, int i) {
        super(2);
        this.f60779OooO0Oo = o0ooo0oo2;
        this.f60781OooO0o0 = roomFollowAndJoinCheckVM;
        this.f60780OooO0o = lifecycleOwner;
        this.f60782OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f60782OooO0oO | 1);
        RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM = this.f60781OooO0o0;
        LifecycleOwner lifecycleOwner = this.f60780OooO0o;
        o0OOO0OO.OooO0Oo(this.f60779OooO0Oo, roomFollowAndJoinCheckVM, lifecycleOwner, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
