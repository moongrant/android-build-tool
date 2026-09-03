package p031OoooO;

import Oooo000.o0000O00;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material.SwipeableState;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import p025Oooo0O0.OooOOO0;
import p025Oooo0O0.o0OO00O;
import p025Oooo0O0.o0OOO0o;
import p025Oooo0O0.o0Oo0oo;
import p025Oooo0O0.o0ooOOo;
import p026Oooo0OO.o000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f2828Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Map<Float, Object> f2829Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f2830Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Orientation f2831Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Object, o000O> f2832OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ boolean f2833OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000 f2834OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f2835OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ float f2836OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OO(Map<Float, Object> map, SwipeableState<Object> swipeableState, Orientation orientation, boolean z, o000 o000Var, boolean z2, o0O0O00 o0o0o00, Function2<Object, Object, ? extends o000O> function2, float f) {
        super(3);
        this.f2829Oooo0o = map;
        this.f2830Oooo0oO = swipeableState;
        this.f2831Oooo0oo = orientation;
        this.f2828Oooo = z;
        this.f2834OoooO00 = o000Var;
        this.f2833OoooO0 = z2;
        this.f2835OoooO0O = o0o0o00;
        this.f2832OoooO = function2;
        this.f2836OoooOO0 = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, 43594985);
        if (!(!this.f2829Oooo0o.isEmpty())) {
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (!(CollectionsKt.distinct(this.f2829Oooo0o.values()).size() == this.f2829Oooo0o.size())) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        OooO oooO = (OooO) ooo00o2.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
        SwipeableState<Object> swipeableState = this.f2830Oooo0oO;
        Map<Float, Object> newAnchors = this.f2829Oooo0o;
        Objects.requireNonNull(swipeableState);
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (swipeableState.OooO0Oo().isEmpty()) {
            Float fOooO00o = o0000O.OooO00o(newAnchors, swipeableState.OooO0o0());
            if (fOooO00o == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            swipeableState.f5914OooO0o0.setValue(fOooO00o);
            swipeableState.f5915OooO0oO.setValue(fOooO00o);
        }
        Map<Float, Object> map = this.f2829Oooo0o;
        SwipeableState<Object> swipeableState2 = this.f2830Oooo0oO;
        o00Oo00.OooO0Oo(map, swipeableState2, new o0000O0(swipeableState2, map, this.f2835OoooO0O, oooO, this.f2832OoooO, this.f2836OoooOO0, null), ooo00o2);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        boolean zBooleanValue = ((Boolean) this.f2830Oooo0oO.f5912OooO0Oo.getValue()).booleanValue();
        SwipeableState<Object> swipeableState3 = this.f2830Oooo0oO;
        OooOOO0 state = swipeableState3.f5923OooOOOo;
        Orientation orientation = this.f2831Oooo0oo;
        boolean z = this.f2828Oooo;
        o000 o000Var = this.f2834OoooO00;
        o0000O0O onDragStopped = new o0000O0O(swipeableState3, null);
        boolean z2 = this.f2833OoooO0;
        o0ooOOo onDragStarted = new o0ooOOo(null);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        o00OOOO0 o00oooo0OooO0OO = DraggableKt.OooO0OO(oooO00o, new o0OOO0o(state), o0Oo0oo.f1693Oooo0o, orientation, z, o000Var, new o0OO00O(zBooleanValue), onDragStarted, onDragStopped, z2);
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0OO;
    }
}
