package p448o0OoOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.module.event.vm.RoomEventInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oO0Ooo f47477OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f47478OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomEventInfoViewModel f47479OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(o0oO0Ooo o0oo0ooo2, RoomEventInfoViewModel roomEventInfoViewModel, int i) {
        super(2);
        this.f47477OooO0Oo = o0oo0ooo2;
        this.f47479OooO0o0 = roomEventInfoViewModel;
        this.f47478OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47478OooO0o | 1);
        o0oO0Ooo.OooO0o(this.f47477OooO0Oo, this.f47479OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
