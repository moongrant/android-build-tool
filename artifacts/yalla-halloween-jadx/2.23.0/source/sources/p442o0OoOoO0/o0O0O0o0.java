package p442o0OoOoO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.module.event.vm.RoomEventInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0oo0o f46255OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f46256OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomEventInfoViewModel f46257OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(o0O0oo0o o0o0oo0o, RoomEventInfoViewModel roomEventInfoViewModel, int i) {
        super(2);
        this.f46255OooO0Oo = o0o0oo0o;
        this.f46257OooO0o0 = roomEventInfoViewModel;
        this.f46256OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46256OooO0o | 1);
        o0O0oo0o.OooO0o(this.f46255OooO0Oo, this.f46257OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
