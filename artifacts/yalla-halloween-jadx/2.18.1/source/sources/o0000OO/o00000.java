package o0000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00000 extends State {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final List<Object> f27386OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0000O0O.OooO f27387OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f27388OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public LayoutDirection f27389OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f27390OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Set<ConstraintWidget> f27391OooOO0O;

    public o00000(@NotNull o0000O0O.OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f27387OooO0o = density;
        this.f27388OooO0oO = o0000O0O.OooO0OO.OooO0O0(0, 0, 15);
        this.f27386OooO = new ArrayList();
        this.f27390OooOO0 = true;
        this.f27391OooOO0O = new LinkedHashSet();
    }

    @Override // androidx.constraintlayout.core.state.State
    public final int OooO0O0(@Nullable Object obj) {
        if (obj instanceof o0000O0O.OooOOO0) {
            return this.f27387OooO0o.OoooooO(((o0000O0O.OooOOO0) obj).f27306Oooo0o);
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
