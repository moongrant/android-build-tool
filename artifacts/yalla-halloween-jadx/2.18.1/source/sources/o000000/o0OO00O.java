package o000000;

import androidx.compose.ui.node.LayoutNode;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o0OO00O f26658Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26659Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final p076o000OOo.OooOOO<?> f26660Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o0OO00O f26661Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final p036OoooOOO.o000OOo<o0Oo0oo> f26662OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f26663OoooO00;

    public o0OO00O(@NotNull LayoutNode layoutNode, @NotNull p076o000OOo.OooOOO<?> modifier) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f26659Oooo0o = layoutNode;
        this.f26660Oooo0oO = modifier;
        this.f26662OoooO0 = new p036OoooOOO.o000OOo<>(new o0Oo0oo[16]);
    }

    public final void OooO00o() {
        this.f26663OoooO00 = false;
        p036OoooOOO.o000OOo<o0Oo0oo> o000ooo2 = this.f26662OoooO0;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            o0Oo0oo[] o0oo0ooArr = o000ooo2.f3662Oooo0o;
            int i2 = 0;
            do {
                o0Oo0oo o0oo0oo2 = o0oo0ooArr[i2];
                o0oo0oo2.f26673Oooo0oO.OooOooO(o0Oo0oo.f26669OoooO0);
                o0oo0oo2.f26671Oooo = false;
                i2++;
            } while (i2 < i);
        }
        OooO0OO(this.f26660Oooo0oO.getKey(), false);
    }

    @Nullable
    public final p076o000OOo.OooOOO<?> OooO0O0(@NotNull p076o000OOo.OooOO0<?> local) {
        o0OO00O o0oo00o2;
        p076o000OOo.OooOOO<?> oooOOOOooO0O0;
        Intrinsics.checkNotNullParameter(local, "local");
        if (Intrinsics.areEqual(this.f26660Oooo0oO.getKey(), local)) {
            return this.f26660Oooo0oO;
        }
        o0OO00O o0oo00o3 = this.f26658Oooo;
        if (o0oo00o3 != null && (oooOOOOooO0O0 = o0oo00o3.OooO0O0(local)) != null) {
            return oooOOOOooO0O0;
        }
        LayoutNode layoutNodeOooOOoo = this.f26659Oooo0o.OooOOoo();
        if (layoutNodeOooOOoo == null || (o0oo00o2 = layoutNodeOooOOoo.f6176o0ooOOo) == null) {
            return null;
        }
        return o0oo00o2.OooO0O0(local);
    }

    public final void OooO0OO(p076o000OOo.OooOO0<?> local, boolean z) {
        Unit unit;
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0;
        int i;
        o00000 o00000Var;
        if (z && Intrinsics.areEqual(this.f26660Oooo0oO.getKey(), local)) {
            return;
        }
        p036OoooOOO.o000OOo<o0Oo0oo> o000ooo2 = this.f26662OoooO0;
        int i2 = o000ooo2.f3664Oooo0oo;
        int i3 = 0;
        if (i2 > 0) {
            o0Oo0oo[] o0oo0ooArr = o000ooo2.f3662Oooo0o;
            int i4 = 0;
            do {
                o0Oo0oo o0oo0oo2 = o0oo0ooArr[i4];
                Objects.requireNonNull(o0oo0oo2);
                Intrinsics.checkNotNullParameter(local, "local");
                if (o0oo0oo2.f26674Oooo0oo.OooO0o(local) && (o00000Var = o0oo0oo2.f26672Oooo0o.f26659Oooo0o.f6143OoooO0O) != null) {
                    o00000Var.OooOO0o(o0oo0oo2);
                }
                i4++;
            } while (i4 < i2);
        }
        o0OO00O o0oo00o2 = this.f26661Oooo0oo;
        if (o0oo00o2 != null) {
            o0oo00o2.OooO0OO(local, true);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || (i = (o000oooOooOo0 = this.f26659Oooo0o.OooOo0()).f3664Oooo0oo) <= 0) {
            return;
        }
        LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
        do {
            layoutNodeArr[i3].f6175o0ooOO0.OooO0OO(local, true);
            i3++;
        } while (i3 < i);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f26663OoooO00) {
            OooO0OO(this.f26660Oooo0oO.getKey(), false);
        }
        return Unit.INSTANCE;
    }
}
