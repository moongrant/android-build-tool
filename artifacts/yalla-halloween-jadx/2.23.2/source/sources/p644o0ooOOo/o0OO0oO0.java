package p644o0ooOOo;

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
public final class o0OO0oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Object f58045OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f58046OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO f58047OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o f58048OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o f58049OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0OOO00 f58050OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0OOO00 f58051OooO0oO;

    public o0OO0oO0(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f58045OooO00o = id;
        ArrayList tasks = new ArrayList();
        this.f58046OooO0O0 = tasks;
        Integer PARENT = State.f4325OooO0o0;
        Intrinsics.checkNotNullExpressionValue(PARENT, "PARENT");
        this.f58047OooO0OO = new o0OO(PARENT);
        this.f58048OooO0Oo = new o(id, -2, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f58050OooO0o0 = new o0OOO00(id, 0, tasks);
        this.f58049OooO0o = new o(id, -1, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f58051OooO0oO = new o0OOO00(id, 1, tasks);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        oO0000O baseDimension = oO0000O.f58077OooO0Oo;
        Intrinsics.checkNotNullParameter(baseDimension, "baseDimension");
        Intrinsics.checkNotNullParameter(baseDimension, "baseDimension");
        float f = 0;
        Dp.m3775constructorimpl(f);
        Dp.m3775constructorimpl(f);
        Dp.m3775constructorimpl(f);
    }

    public final void OooO00o(@NotNull oO0000o0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f58046OooO0O0.add(new o0OO0o(this, value));
    }
}
