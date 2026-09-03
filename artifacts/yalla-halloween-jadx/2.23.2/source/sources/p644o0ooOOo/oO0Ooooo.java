package p644o0ooOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oO0Ooooo extends State {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ArrayList f58090OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Density f58091OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f58092OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public LayoutDirection f58093OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f58094OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f58095OooOO0O;

    public oO0Ooooo(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f58091OooO0o = density;
        this.f58092OooO0oO = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.f58090OooO = new ArrayList();
        this.f58094OooOO0 = true;
        this.f58095OooOO0O = new LinkedHashSet();
    }

    @Override // androidx.constraintlayout.core.state.State
    public final int OooO0O0(@Nullable Object obj) {
        if (obj instanceof Dp) {
            return this.f58091OooO0o.mo320roundToPx0680j_4(((Dp) obj).m3789unboximpl());
        }
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }
}
