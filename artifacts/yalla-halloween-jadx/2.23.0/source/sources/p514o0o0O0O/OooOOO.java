package p514o0o0O0O;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Stable
@SourceDebugExtension({"SMAP\nSwipeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeState.kt\ncom/yalla/yalla/ui/composable/refresh/SwipeRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,92:1\n81#2:93\n107#2,2:94\n81#2:96\n107#2,2:97\n81#2:99\n107#2,2:100\n*S KotlinDebug\n*F\n+ 1 SwipeState.kt\ncom/yalla/yalla/ui/composable/refresh/SwipeRefreshState\n*L\n38#1:93\n38#1:94,2\n44#1:96\n44#1:97,2\n51#1:99\n51#1:100,2\n*E\n"})
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f51688OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f51689OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f51686OooO00o = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f51687OooO0O0 = new MutatorMutex();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f51690OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public OooOOO(float f, float f2) {
        this.f51688OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f2), null, 2, null);
        this.f51689OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
    }
}
