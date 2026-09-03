package p105o000oo0o;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.OooO0O0;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends Lambda implements Function1<NavBackStackEntry, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f35706OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f35707OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f35708OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f35709OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayDeque<NavBackStackEntryState> f35710OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, OooO0O0 oooO0O0, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
        super(1);
        this.f35706OooO0Oo = booleanRef;
        this.f35708OooO0o0 = booleanRef2;
        this.f35707OooO0o = oooO0O0;
        this.f35709OooO0oO = z;
        this.f35710OooO0oo = arrayDeque;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NavBackStackEntry navBackStackEntry) {
        NavBackStackEntry entry = navBackStackEntry;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f35706OooO0Oo.element = true;
        this.f35708OooO0o0.element = true;
        this.f35707OooO0o.OooOOO(entry, this.f35709OooO0oO, this.f35710OooO0oo);
        return Unit.INSTANCE;
    }
}
