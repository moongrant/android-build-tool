package p151o00Oo0oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Placeable> f38046OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Placeable> f38047OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Pair<Placeable, Integer>> f38048OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f38049OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(Ref.ObjectRef<Placeable> objectRef, Ref.ObjectRef<Pair<Placeable, Integer>> objectRef2, Ref.ObjectRef<Placeable> objectRef3, MutableState<Integer> mutableState) {
        super(1);
        this.f38046OooO0Oo = objectRef;
        this.f38048OooO0o0 = objectRef2;
        this.f38047OooO0o = objectRef3;
        this.f38049OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, this.f38046OooO0Oo.element, this.f38049OooO0oO.getValue().intValue(), 0, 0.0f, 4, null);
        Pair<Placeable, Integer> pair = this.f38048OooO0o0.element;
        if (pair != null) {
            Placeable.PlacementScope.place$default(layout, pair.getFirst(), pair.getSecond().intValue(), 0, 0.0f, 4, null);
        }
        Placeable placeable = this.f38047OooO0o.element;
        if (placeable != null) {
            Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
