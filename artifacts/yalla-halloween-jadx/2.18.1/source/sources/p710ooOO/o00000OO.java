package p710ooOO;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOO0O;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOOOO;
import p076o000OOo.OooOo00;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00000OO extends o00O00 implements OooOO0O, OooOOO<o00000OO> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final OooOo00<o00000OO> f53448Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Function1<o00000O0, Unit> f53449Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f53450Oooo0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00000OO(@NotNull Function1 focusPropertiesScope) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f53449Oooo0oO = focusPropertiesScope;
        this.f53450Oooo0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f53448Oooo = FocusPropertiesKt.f5999OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@NotNull o00000O0 focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f53449Oooo0oO.invoke(focusProperties);
        o00000OO o00000oo2 = (o00000OO) this.f53450Oooo0oo.getValue();
        if (o00000oo2 != null) {
            o00000oo2.OooO0O0(focusProperties);
        }
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f53450Oooo0oo.setValue((o00000OO) scope.OooO00o(FocusPropertiesKt.f5999OooO00o));
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o00000OO) && Intrinsics.areEqual(this.f53449Oooo0oO, ((o00000OO) obj).f53449Oooo0oO);
    }

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<o00000OO> getKey() {
        return this.f53448Oooo;
    }

    @Override // p076o000OOo.OooOOO
    public final o00000OO getValue() {
        return this;
    }

    public final int hashCode() {
        return this.f53449Oooo0oO.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
