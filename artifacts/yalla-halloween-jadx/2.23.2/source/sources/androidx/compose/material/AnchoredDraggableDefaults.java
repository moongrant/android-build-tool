package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/AnchoredDraggableDefaults;", "", "()V", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getAnimationSpec$annotations", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "positionalThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "totalDistance", "getPositionalThreshold$annotations", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "velocityThreshold", "Lkotlin/Function0;", "getVelocityThreshold$annotations", "getVelocityThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "ReconcileAnimationOnAnchorChangedCallback", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "T", "state", "Landroidx/compose/material/AnchoredDraggableState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ReconcileAnimationOnAnchorChangedCallback$material_release", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,710:1\n76#2:711\n76#2:720\n1#3:712\n36#4:713\n36#4:721\n1097#5,6:714\n1097#5,6:722\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults\n*L\n655#1:711\n664#1:720\n655#1:713\n665#1:721\n655#1:714,6\n665#1:722,6\n*E\n"})
public final class AnchoredDraggableDefaults {

    @NotNull
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();

    @NotNull
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    private AnchoredDraggableDefaults() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getVelocityThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    @NotNull
    public final <T> AnchoredDraggableState.AnchorChangedCallback<T> ReconcileAnimationOnAnchorChangedCallback$material_release(@NotNull final AnchoredDraggableState<T> state, @NotNull final CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new AnchoredDraggableState.AnchorChangedCallback<T>() { // from class: androidx.compose.material.AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1
            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(T t, @NotNull Map<T, Float> previousAnchors, @NotNull Map<T, Float> newAnchors) {
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = previousAnchors.get(t);
                Float f2 = newAnchors.get(t);
                if (Intrinsics.areEqual(f, f2)) {
                    return;
                }
                if (f2 != null) {
                    BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1(state, t, null), 3, null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2(state, newAnchors, null), 3, null);
                }
            }
        };
    }

    @ExperimentalMaterialApi
    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    @JvmName(name = "getPositionalThreshold")
    @NotNull
    @Composable
    @ExperimentalMaterialApi
    public final Function1<Float, Float> getPositionalThreshold(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(82866976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(82866976, i, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-positionalThreshold> (AnchoredDraggable.kt:663)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<Float, Float>() { // from class: androidx.compose.material.AnchoredDraggableDefaults$positionalThreshold$1$1$1
                {
                    super(1);
                }

                @NotNull
                public final Float invoke(float f) {
                    return Float.valueOf(density.mo326toPx0680j_4(Dp.m3775constructorimpl(56)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f) {
                    return invoke(f.floatValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function1<Float, Float> function1 = (Function1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function1;
    }

    @JvmName(name = "getVelocityThreshold")
    @NotNull
    @Composable
    @ExperimentalMaterialApi
    public final Function0<Float> getVelocityThreshold(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2030704141);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030704141, i, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-velocityThreshold> (AnchoredDraggable.kt:654)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material.AnchoredDraggableDefaults$velocityThreshold$1$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(density.mo326toPx0680j_4(Dp.m3775constructorimpl(125)));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function0<Float> function0 = (Function0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function0;
    }
}
