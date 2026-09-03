package p642o0ooOOo;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@LayoutScopeMarker
@Stable
public final class o0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Object f59518OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f59519OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO0O0 f59520OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OOo000 f59521OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0OOo000 f59522OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0OOooO0 f59523OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0OOooO0 f59524OooO0oO;

    public o0OO0(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f59518OooO00o = id;
        ArrayList tasks = new ArrayList();
        this.f59519OooO0O0 = tasks;
        Integer PARENT = State.f4319OooO0o0;
        Intrinsics.checkNotNullExpressionValue(PARENT, "PARENT");
        this.f59520OooO0OO = new o0OO0O0(PARENT);
        this.f59521OooO0Oo = new o0OOo000(id, -2, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f59523OooO0o0 = new o0OOooO0(id, 0, tasks);
        this.f59522OooO0o = new o0OOo000(id, -1, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f59524OooO0oO = new o0OOooO0(id, 1, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        o0oo0000 baseDimension = o0oo0000.f59576OooO0Oo;
        Intrinsics.checkNotNullParameter(baseDimension, "baseDimension");
        Intrinsics.checkNotNullParameter(baseDimension, "baseDimension");
        float f = 0;
        Dp.m3765constructorimpl(f);
        Dp.m3765constructorimpl(f);
        Dp.m3765constructorimpl(f);
    }

    public final void OooO00o(@NotNull o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f59519OooO0O0.add(new o0OO00o0(this, value));
    }
}
