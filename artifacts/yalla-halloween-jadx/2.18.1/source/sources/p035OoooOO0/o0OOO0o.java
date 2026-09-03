package p035OoooOO0;

import android.content.Context;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import o000000.o00O0O;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import p026Oooo0OO.o000Oo0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oo0oO0;
import p145o00Oo0.OooOOOO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o0O0O00;
import p191o00o0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends o0000 implements oo0oO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00000O0> f3642Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f3643Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f3644Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3645OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final RippleContainer f3646OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o000000> f3647OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3648OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f3649OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f3650OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f3651o000oOoO;

    public o0OOO0o(boolean z, float f, oO0Oo oo0oo, oO0Oo oo0oo2, RippleContainer rippleContainer, DefaultConstructorMarker defaultConstructorMarker) {
        super(z, oo0oo2);
        this.f3643Oooo0oO = z;
        this.f3644Oooo0oo = f;
        this.f3642Oooo = oo0oo;
        this.f3647OoooO00 = oo0oo2;
        this.f3646OoooO0 = rippleContainer;
        this.f3648OoooO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f3645OoooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        this.f3649OoooOO0 = OooOo00.f30417OooO0OO;
        this.f3651o000oOoO = -1;
        this.f3650OoooOOO = new o0ooOOo(this);
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
        OooO0oo();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        OooO0oo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0.o0O0ooO
    public final void OooO0OO(@NotNull o00oO0o o00oo0o2) {
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        o00O0O o00o0o2 = (o00O0O) o00oo0o2;
        this.f3649OoooOO0 = o00o0o2.OooO0OO();
        this.f3651o000oOoO = Float.isNaN(this.f3644Oooo0oo) ? MathKt.roundToInt(o00000O.OooO00o(o00oo0o2, this.f3643Oooo0oO, o00o0o2.OooO0OO())) : o00o0o2.OoooooO(this.f3644Oooo0oo);
        long j = this.f3642Oooo.getValue().f32070OooO00o;
        float f = this.f3647OoooO00.getValue().f3582OooO0Oo;
        o00o0o2.o0ooOOo();
        OooO0o(o00oo0o2, this.f3644Oooo0oo, j);
        o0O0O00 o0o0o00OooO0o = o00o0o2.f26649Oooo0o.f33068Oooo0oO.OooO0o();
        ((Boolean) this.f3645OoooO.getValue()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.f3648OoooO0O.getValue();
        if (rippleHostView != null) {
            rippleHostView.OooO0o0(o00o0o2.OooO0OO(), this.f3651o000oOoO, j, f);
            rippleHostView.draw(OooOOOO.OooO00o(o0o0o00OooO0o));
        }
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList, java.util.List<androidx.compose.material.ripple.RippleHostView>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, java.util.Map<OoooOO0.o0OOO0o, androidx.compose.material.ripple.RippleHostView>] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList, java.util.List<androidx.compose.material.ripple.RippleHostView>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.material.ripple.RippleHostView, OoooOO0.o0OOO0o>] */
    @Override // p035OoooOO0.o0000
    public final void OooO0o0(@NotNull o000Oo0 interaction, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        RippleContainer rippleContainer = this.f3646OoooO0;
        Objects.requireNonNull(rippleContainer);
        Intrinsics.checkNotNullParameter(this, "<this>");
        o00000OO o00000oo2 = rippleContainer.f5948Oooo;
        Objects.requireNonNull(o00000oo2);
        Intrinsics.checkNotNullParameter(this, "indicationInstance");
        RippleHostView rippleHostView = (RippleHostView) o00000oo2.f3604OooO00o.get(this);
        if (rippleHostView == null) {
            rippleHostView = (RippleHostView) CollectionsKt.removeFirstOrNull(rippleContainer.f5951Oooo0oo);
            if (rippleHostView == null) {
                if (rippleContainer.f5952OoooO00 > CollectionsKt.getLastIndex(rippleContainer.f5950Oooo0oO)) {
                    Context context = rippleContainer.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    rippleHostView = new RippleHostView(context);
                    rippleContainer.addView(rippleHostView);
                    rippleContainer.f5950Oooo0oO.add(rippleHostView);
                } else {
                    rippleHostView = (RippleHostView) rippleContainer.f5950Oooo0oO.get(rippleContainer.f5952OoooO00);
                    o00000OO o00000oo3 = rippleContainer.f5948Oooo;
                    Objects.requireNonNull(o00000oo3);
                    Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
                    o0OOO0o o0ooo0o2 = (o0OOO0o) o00000oo3.f3605OooO0O0.get(rippleHostView);
                    if (o0ooo0o2 != null) {
                        o0ooo0o2.f3648OoooO0O.setValue(null);
                        rippleContainer.f5948Oooo.OooO00o(o0ooo0o2);
                        rippleHostView.OooO0OO();
                    }
                }
                int i = rippleContainer.f5952OoooO00;
                if (i < rippleContainer.f5949Oooo0o - 1) {
                    rippleContainer.f5952OoooO00 = i + 1;
                } else {
                    rippleContainer.f5952OoooO00 = 0;
                }
            }
            o00000OO o00000oo4 = rippleContainer.f5948Oooo;
            Objects.requireNonNull(o00000oo4);
            Intrinsics.checkNotNullParameter(this, "indicationInstance");
            Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
            o00000oo4.f3604OooO00o.put(this, rippleHostView);
            o00000oo4.f3605OooO0O0.put(rippleHostView, this);
        }
        rippleHostView.OooO0O0(interaction, this.f3643Oooo0oO, this.f3649OoooOO0, this.f3651o000oOoO, this.f3642Oooo.getValue().f32070OooO00o, this.f3647OoooO00.getValue().f3582OooO0Oo, this.f3650OoooOOO);
        this.f3648OoooO0O.setValue(rippleHostView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p035OoooOO0.o0000
    public final void OooO0oO(@NotNull o000Oo0 interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        RippleHostView rippleHostView = (RippleHostView) this.f3648OoooO0O.getValue();
        if (rippleHostView != null) {
            rippleHostView.OooO0Oo();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.compose.material.ripple.RippleHostView>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map<OoooOO0.o0OOO0o, androidx.compose.material.ripple.RippleHostView>] */
    public final void OooO0oo() {
        RippleContainer rippleContainer = this.f3646OoooO0;
        Objects.requireNonNull(rippleContainer);
        Intrinsics.checkNotNullParameter(this, "<this>");
        this.f3648OoooO0O.setValue(null);
        o00000OO o00000oo2 = rippleContainer.f5948Oooo;
        Objects.requireNonNull(o00000oo2);
        Intrinsics.checkNotNullParameter(this, "indicationInstance");
        RippleHostView rippleHostView = (RippleHostView) o00000oo2.f3604OooO00o.get(this);
        if (rippleHostView != null) {
            rippleHostView.OooO0OO();
            rippleContainer.f5948Oooo.OooO00o(this);
            rippleContainer.f5951Oooo0oo.add(rippleHostView);
        }
    }
}
