package o0000OO;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@LayoutScopeMarker
@Stable
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Object f27357OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Function1<o00000, Unit>> f27358OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOO0O f27359OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oo000o f27360OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final oo000o f27361OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f27362OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f27363OooO0oO;

    public OooOO0(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f27357OooO00o = id;
        ArrayList tasks = new ArrayList();
        this.f27358OooO0O0 = tasks;
        Integer PARENT = State.f6885OooO0o0;
        Intrinsics.checkNotNullExpressionValue(PARENT, "PARENT");
        this.f27359OooO0OO = new OooOO0O(PARENT);
        this.f27360OooO0Oo = new oo000o(id, -2, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f27362OooO0o0 = new OooOOO0(id, 0, tasks);
        this.f27361OooO0o = new oo000o(id, -1, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f27363OooO0oO = new OooOOO0(id, 1, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        o0Oo0oo baseDimension = o0Oo0oo.f27419Oooo0o;
        Intrinsics.checkNotNullParameter(baseDimension, "baseDimension");
        Intrinsics.checkNotNullParameter(baseDimension, "baseDimension");
    }
}
