package androidx.compose.material;

import androidx.compose.animation.OooOo00;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001aq\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\u001226\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u00042!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00180\u001aH\u0002\u001a\u008c\u0001\u0010\u001b\u001a\u00020\u00182\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u001a¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u00072\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00180*¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a@\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00112\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002020\u001a2\b\b\u0002\u00103\u001a\u000202H\u0007\u001a3\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020&2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180*2\u0006\u00107\u001a\u000202H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a9\u0010:\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00112\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002020\u001aH\u0007¢\u0006\u0002\u0010<\u001aE\u0010:\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00112\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002020\u001a2\b\b\u0002\u0010=\u001a\u000202H\u0007¢\u0006\u0002\u0010>\u001aA\u0010:\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00112\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010=\u001a\u0002022\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002020\u001aH\u0007¢\u0006\u0002\u0010?\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"%\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"MaxModalBottomSheetWidth", "Landroidx/compose/ui/unit/Dp;", "F", "PositionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ExtensionFunctionType;", "VelocityThreshold", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/SwipeableV2State;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "ModalBottomSheetAnchorChangeHandler", "Landroidx/compose/material/AnchorChangeHandler;", "Landroidx/compose/material/ModalBottomSheetValue;", "Landroidx/compose/material/ModalBottomSheetState;", "animateTo", "Lkotlin/ParameterName;", "name", "target", "velocity", "", "snapTo", "Lkotlin/Function1;", "ModalBottomSheetLayout", "sheetContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-BzaUkTc", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "", "isSkipHalfExpanded", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n474#2,4:685\n478#2,2:693\n482#2:699\n25#3:689\n50#3:700\n49#3:701\n36#3:709\n50#3:716\n49#3:717\n50#3:724\n49#3:725\n1114#4,3:690\n1117#4,3:696\n1114#4,6:702\n1114#4,6:710\n1114#4,6:718\n1114#4,6:726\n474#5:695\n646#6:708\n76#7:732\n154#8:733\n154#8:734\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n443#1:685,4\n443#1:693,2\n443#1:699\n443#1:689\n445#1:700\n445#1:701\n561#1:709\n562#1:716\n562#1:717\n574#1:724\n574#1:725\n443#1:690,3\n443#1:696,3\n445#1:702,6\n561#1:710,6\n562#1:718,6\n574#1:726,6\n443#1:695\n553#1:708\n554#1:732\n682#1:733\n683#1:734\n*E\n"})
public final class ModalBottomSheetKt {

    @NotNull
    private static final Function2<Density, Float, Float> PositionalThreshold = new Function2<Density, Float, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$PositionalThreshold$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Density density, Float f) {
            return invoke(density, f.floatValue());
        }

        @NotNull
        public final Float invoke(@NotNull Density density, float f) {
            Intrinsics.checkNotNullParameter(density, "$this$null");
            return Float.valueOf(density.mo324toPx0680j_4(Dp.m3765constructorimpl(56)));
        }
    };
    private static final float VelocityThreshold = Dp.m3765constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m3765constructorimpl(640);

    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ SwipeableV2State<?> $state;

        public AnonymousClass1(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
            this.$state = swipeableV2State;
            this.$orientation = orientation;
        }

        @JvmName(name = "offsetToFloat")
        private final float offsetToFloat(long j) {
            return this.$orientation == Orientation.Horizontal ? Offset.m1436getXimpl(j) : Offset.m1437getYimpl(j);
        }

        private final long toOffset(float f) {
            Orientation orientation = this.$orientation;
            float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
            if (orientation != Orientation.Vertical) {
                f = 0.0f;
            }
            return OffsetKt.Offset(f2, f);
        }

        @JvmName(name = "velocityToFloat")
        private final float velocityToFloat(long j) {
            return this.$orientation == Orientation.Horizontal ? Velocity.m3990getXimpl(j) : Velocity.m3991getYimpl(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo331onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
            ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1;
            if (continuation instanceof ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) {
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = (ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) continuation;
                int i = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = i - Integer.MIN_VALUE;
                } else {
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, continuation);
                }
            } else {
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, continuation);
            }
            Object obj = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SwipeableV2State<?> swipeableV2State = this.$state;
                float fVelocityToFloat = velocityToFloat(j2);
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = 1;
                if (swipeableV2State.settle(fVelocityToFloat, modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m3981boximpl(j2);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
        public long mo332onPostScrollDzOQY0M(long consumed, long available, int source) {
            return NestedScrollSource.m2594equalsimpl0(source, NestedScrollSource.INSTANCE.m2599getDragWNlRxjI()) ? toOffset(this.$state.dispatchRawDelta(offsetToFloat(available))) : Offset.INSTANCE.m1452getZeroF1C5BW0();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPreFling-QWom1Mo */
        public Object mo333onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
            ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1;
            if (continuation instanceof ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) {
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = (ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) continuation;
                int i = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = i - Integer.MIN_VALUE;
                } else {
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, continuation);
                }
            } else {
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, continuation);
            }
            Object obj = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                float fVelocityToFloat = velocityToFloat(j);
                float fRequireOffset = this.$state.requireOffset();
                if (fVelocityToFloat >= 0.0f || fRequireOffset <= this.$state.getMinOffset()) {
                    j = Velocity.INSTANCE.m4001getZero9UxMQ8M();
                } else {
                    SwipeableV2State<?> swipeableV2State = this.$state;
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0 = j;
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = 1;
                    if (swipeableV2State.settle(fVelocityToFloat, modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m3981boximpl(j);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public long mo334onPreScrollOzD1aCk(long available, int source) {
            float fOffsetToFloat = offsetToFloat(available);
            return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m2594equalsimpl0(source, NestedScrollSource.INSTANCE.m2599getDragWNlRxjI())) ? Offset.INSTANCE.m1452getZeroF1C5BW0() : toOffset(this.$state.dispatchRawDelta(fOffsetToFloat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        return new AnonymousClass1(swipeableV2State, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchorChangeHandler<ModalBottomSheetValue> ModalBottomSheetAnchorChangeHandler(final ModalBottomSheetState modalBottomSheetState, final Function2<? super ModalBottomSheetValue, ? super Float, Unit> function2, final Function1<? super ModalBottomSheetValue, Unit> function1) {
        return new AnchorChangeHandler<ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetAnchorChangeHandler.1

            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeHandler$1$WhenMappings */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchorChangeHandler
            public final void onAnchorsChanged(@NotNull ModalBottomSheetValue previousTarget, @NotNull Map<ModalBottomSheetValue, Float> previousAnchors, @NotNull Map<ModalBottomSheetValue, Float> newAnchors) {
                ModalBottomSheetValue modalBottomSheetValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = previousAnchors.get(previousTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i == 1) {
                    modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                    if (!newAnchors.containsKey(modalBottomSheetValue)) {
                        modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                        if (!newAnchors.containsKey(modalBottomSheetValue)) {
                            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        }
                    }
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, modalBottomSheetValue)).floatValue(), f)) {
                    return;
                }
                if (modalBottomSheetState.isAnimationRunning$material_release()) {
                    function2.invoke(modalBottomSheetValue, Float.valueOf(modalBottomSheetState.getLastVelocity$material_release()));
                } else {
                    function1.invoke(modalBottomSheetValue);
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01de  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:147:0x020e  */
    /* JADX WARN: Code duplicated, block: B:150:0x023b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0241  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02be  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalBottomSheetLayout-BzaUkTc, reason: not valid java name */
    public static final void m1115ModalBottomSheetLayoutBzaUkTc(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, @Nullable Modifier modifier, @Nullable ModalBottomSheetState modalBottomSheetState, @Nullable Shape shape, float f, long j, long j2, long j3, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        long j4;
        long j5;
        int i7;
        Modifier modifier2;
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState;
        Shape large;
        float fM1114getElevationD9Ej5fM;
        long jM1027getSurface0d7_KjU;
        long jM1041contentColorForek8zF_U;
        long scrimColor;
        int i8;
        final ModalBottomSheetState modalBottomSheetState2;
        Shape shape2;
        float f3;
        long j6;
        long j7;
        Object objOooO00o;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final Shape shape3;
        final float f4;
        final long j8;
        final long j9;
        final long j10;
        final ModalBottomSheetState modalBottomSheetState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1633763156);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0 || !composerStartRestartGroup.changed(shape)) {
                    i12 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                } else {
                    i12 = 2048;
                }
                i3 |= i12;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                i3 |= 24576;
                f2 = f;
            } else {
                f2 = f;
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
            }
            if ((458752 & i) != 0) {
                if ((i2 & 32) == 0 || !composerStartRestartGroup.changed(j)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if ((3670016 & i) == 0) {
                j4 = j2;
                if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j4)) {
                    i10 = 524288;
                } else {
                    i10 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                }
                i3 |= i10;
            } else {
                j4 = j2;
            }
            if ((29360128 & i) == 0) {
                if ((i2 & 128) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                        i9 = 8388608;
                    }
                    i3 |= i9;
                } else {
                    j5 = j3;
                }
                i9 = Configuration.BLOCK_SIZE;
                i3 |= i9;
            } else {
                j5 = j3;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                }
                if (i4 != 4 && (191739611 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    modalBottomSheetState3 = modalBottomSheetState;
                    shape3 = shape;
                    j9 = j4;
                    composer2 = composerStartRestartGroup;
                    long j11 = j5;
                    f4 = f2;
                    j8 = j;
                    j10 = j11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                            i3 &= -897;
                        } else {
                            modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                        }
                        if ((i2 & 8) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i3 &= -7169;
                        } else {
                            large = shape;
                        }
                        if (i5 != 0) {
                            fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                        } else {
                            fM1114getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 32) != 0) {
                            jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                            i3 &= -458753;
                        } else {
                            jM1027getSurface0d7_KjU = j;
                        }
                        if ((i2 & 64) != 0) {
                            jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        } else {
                            jM1041contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 128) != 0) {
                            shape2 = large;
                            f3 = fM1114getElevationD9Ej5fM;
                            j6 = jM1027getSurface0d7_KjU;
                            j7 = jM1041contentColorForek8zF_U;
                            scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i8 = i3 & (-29360129);
                            modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        } else {
                            scrimColor = j3;
                            i8 = i3;
                            modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                            shape2 = large;
                            f3 = fM1114getElevationD9Ej5fM;
                            j6 = jM1027getSurface0d7_KjU;
                            j7 = jM1041contentColorForek8zF_U;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if (i4 != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        modifier2 = modifier;
                        shape2 = shape;
                        j6 = j;
                        i8 = i3;
                        scrimColor = j5;
                        j7 = j4;
                        f3 = f2;
                        modalBottomSheetState2 = modalBottomSheetState;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1633763156, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
                    }
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final Orientation orientation = Orientation.Vertical;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                final /* synthetic */ ModalBottomSheetValue $target;
                                final /* synthetic */ float $velocity;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                    this.$target = modalBottomSheetValue;
                                    this.$velocity = f;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                        ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                        float f = this.$velocity;
                                        this.label = 1;
                                        if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f5) {
                                invoke(modalBottomSheetValue, f5.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull ModalBottomSheetValue target, float f5) {
                                Intrinsics.checkNotNullParameter(target, "target");
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f5, null), 3, null);
                            }
                        }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                final /* synthetic */ ModalBottomSheetValue $target;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                    this.$target = modalBottomSheetValue;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                        ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                        this.label = 1;
                                        if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                                invoke2(modalBottomSheetValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ModalBottomSheetValue target) {
                                Intrinsics.checkNotNullParameter(target, "target");
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final AnchorChangeHandler anchorChangeHandler = (AnchorChangeHandler) objRememberedValue;
                    final ModalBottomSheetState modalBottomSheetState4 = modalBottomSheetState2;
                    final Shape shape4 = shape2;
                    final long j12 = j6;
                    final long j13 = j7;
                    final int i14 = i8;
                    final float f5 = f3;
                    ModalBottomSheetState modalBottomSheetState5 = modalBottomSheetState2;
                    final long j14 = scrimColor;
                    Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function3 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i15) {
                            int i16;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i15 & 14) == 0) {
                                i16 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i15;
                            } else {
                                i16 = i15;
                            }
                            if ((i16 & 91) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1607356310, i15, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
                            }
                            final float fM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk());
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i17 = i14;
                            long j15 = j14;
                            final ModalBottomSheetState modalBottomSheetState6 = modalBottomSheetState4;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            composer3.startReplaceableGroup(733328855);
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composer3, Integer.valueOf((i17 >> 24) & 14));
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1

                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ ModalBottomSheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = modalBottomSheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$sheetState, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                            this.label = 1;
                                            if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (modalBottomSheetState6.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState6, null), 3, null);
                                    }
                                }
                            };
                            ModalBottomSheetValue targetValue = modalBottomSheetState6.getSwipeableState$material_release().getTargetValue();
                            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                            ModalBottomSheetKt.m1116Scrim3JVO9M(j15, function0, targetValue != modalBottomSheetValue, composer3, (i17 >> 21) & 14);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m530widthInVpY3zN4$default(BoxWithConstraints.align(companion2, companion3.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                            Object swipeableState$material_release = modalBottomSheetState4.getSwipeableState$material_release();
                            Orientation orientation2 = orientation;
                            ModalBottomSheetState modalBottomSheetState7 = modalBottomSheetState4;
                            composer3.startReplaceableGroup(511388516);
                            boolean zChanged2 = composer3.changed(swipeableState$material_release) | composer3.changed(orientation2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState7.getSwipeableState$material_release(), orientation2);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                            final ModalBottomSheetState modalBottomSheetState8 = modalBottomSheetState4;
                            Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierNestedScroll$default, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                    return IntOffset.m3874boximpl(m1118invokeBjo55l4(density2));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1118invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState8.getSwipeableState$material_release().requireOffset()));
                                }
                            }), modalBottomSheetState4.getSwipeableState$material_release(), orientation, modalBottomSheetState4.getSwipeableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                            SwipeableV2State<ModalBottomSheetValue> swipeableState$material_release2 = modalBottomSheetState4.getSwipeableState$material_release();
                            Set of = SetsKt.setOf((Object[]) new ModalBottomSheetValue[]{modalBottomSheetValue, ModalBottomSheetValue.HalfExpanded, ModalBottomSheetValue.Expanded});
                            AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler2 = anchorChangeHandler;
                            final ModalBottomSheetState modalBottomSheetState9 = modalBottomSheetState4;
                            Modifier modifierSwipeAnchors = SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material_release2, of, anchorChangeHandler2, new Function2<ModalBottomSheetValue, IntSize, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4

                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$WhenMappings */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[ModalBottomSheetValue.values().length];
                                        try {
                                            iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        try {
                                            iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Float invoke(ModalBottomSheetValue modalBottomSheetValue2, IntSize intSize) {
                                    return m1119invokeO0kMr_c(modalBottomSheetValue2, intSize.getPackedValue());
                                }

                                @Nullable
                                /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                                public final Float m1119invokeO0kMr_c(@NotNull ModalBottomSheetValue state, long j16) {
                                    Intrinsics.checkNotNullParameter(state, "state");
                                    int i18 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                    if (i18 == 1) {
                                        return Float.valueOf(fM3732getMaxHeightimpl);
                                    }
                                    if (i18 == 2) {
                                        if (IntSize.m3924getHeightimpl(j16) >= fM3732getMaxHeightimpl / 2.0f && !modalBottomSheetState9.isSkipHalfExpanded$material_release()) {
                                            return Float.valueOf(fM3732getMaxHeightimpl / 2.0f);
                                        }
                                        return null;
                                    }
                                    if (i18 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (IntSize.m3924getHeightimpl(j16) != 0) {
                                        return Float.valueOf(Math.max(0.0f, fM3732getMaxHeightimpl - IntSize.m3924getHeightimpl(j16)));
                                    }
                                    return null;
                                }
                            });
                            final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState4;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSwipeAnchors, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    if (modalBottomSheetState10.isVisible()) {
                                        final ModalBottomSheetState modalBottomSheetState11 = modalBottomSheetState10;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.1

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00871(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00871> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00871(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState11.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00871(modalBottomSheetState11, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                        if (modalBottomSheetState10.getSwipeableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                            final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState10;
                                            final CoroutineScope coroutineScope5 = coroutineScope3;
                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.2

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1, reason: invalid class name */
                                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ ModalBottomSheetState $sheetState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$sheetState = modalBottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$sheetState, continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                            this.label = 1;
                                                            if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Boolean invoke() {
                                                    if (modalBottomSheetState12.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState12, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else if (modalBottomSheetState10.getHasHalfExpandedState$material_release()) {
                                            final ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState10;
                                            final CoroutineScope coroutineScope6 = coroutineScope3;
                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.3

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1, reason: invalid class name */
                                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ ModalBottomSheetState $sheetState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$sheetState = modalBottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$sheetState, continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                            this.label = 1;
                                                            if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Boolean invoke() {
                                                    if (modalBottomSheetState13.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState13, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            }, 1, null);
                            Shape shape5 = shape4;
                            long j16 = j12;
                            long j17 = j13;
                            float f6 = f5;
                            final Function3<ColumnScope, Composer, Integer, Unit> function4 = sheetContent;
                            final int i18 = i14;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i19) {
                                    if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1793508390, i19, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function5 = function4;
                                    int i20 = (i18 << 9) & 7168;
                                    composer4.startReplaceableGroup(-483455358);
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    int i21 = i20 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i21 & 112) | (i21 & 14));
                                    Density density2 = (Density) OooO00o.OooO00o(composer4, -1323940314);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                                    int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                                    androidx.compose.animation.OooOO0.OooO00o((i22 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                                    function5.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i19 = i14;
                            SurfaceKt.m1185SurfaceFjzlyU(modifierSemantics$default, shape5, j16, j17, null, f6, composableLambda, composer3, ((i19 >> 6) & 112) | 1572864 | ((i19 >> 9) & 896) | ((i19 >> 9) & 7168) | ((i19 << 3) & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, function3), composer2, ((i14 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape2;
                    f4 = f3;
                    j8 = j6;
                    j9 = j7;
                    j10 = scrimColor;
                    modalBottomSheetState3 = modalBottomSheetState5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i15) {
                        ModalBottomSheetKt.m1115ModalBottomSheetLayoutBzaUkTc(sheetContent, modifier3, modalBottomSheetState3, shape3, f4, j8, j9, j10, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i7 = 100663296;
            i3 |= i7;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1633763156, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
                }
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation2 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f6) {
                            invoke(modalBottomSheetValue, f6.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f6) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f6, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f6) {
                            invoke(modalBottomSheetValue, f6.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f6) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f6, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler2 = (AnchorChangeHandler) objRememberedValue;
                final ModalBottomSheetState modalBottomSheetState6 = modalBottomSheetState2;
                final Shape shape5 = shape2;
                final long j15 = j6;
                final long j16 = j7;
                final int i15 = i8;
                final float f6 = f3;
                ModalBottomSheetState modalBottomSheetState7 = modalBottomSheetState2;
                final long j17 = scrimColor;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function4 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i16) {
                        int i17;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i16 & 14) == 0) {
                            i17 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i16;
                        } else {
                            i17 = i16;
                        }
                        if ((i17 & 91) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1607356310, i16, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
                        }
                        final float fM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk());
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i18 = i15;
                        long j18 = j17;
                        final ModalBottomSheetState modalBottomSheetState8 = modalBottomSheetState6;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i18 >> 24) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$sheetState, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                        this.label = 1;
                                        if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (modalBottomSheetState8.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState8, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState8.getSwipeableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1116Scrim3JVO9M(j18, function0, targetValue != modalBottomSheetValue, composer3, (i18 >> 21) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m530widthInVpY3zN4$default(BoxWithConstraints.align(companion2, companion3.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        Object swipeableState$material_release = modalBottomSheetState6.getSwipeableState$material_release();
                        Orientation orientation3 = orientation2;
                        ModalBottomSheetState modalBottomSheetState9 = modalBottomSheetState6;
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged2 = composer3.changed(swipeableState$material_release) | composer3.changed(orientation3);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState9.getSwipeableState$material_release(), orientation3);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                        final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState6;
                        Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierNestedScroll$default, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                return IntOffset.m3874boximpl(m1118invokeBjo55l4(density2));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1118invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState10.getSwipeableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState6.getSwipeableState$material_release(), orientation2, modalBottomSheetState6.getSwipeableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        SwipeableV2State<ModalBottomSheetValue> swipeableState$material_release2 = modalBottomSheetState6.getSwipeableState$material_release();
                        Set of = SetsKt.setOf((Object[]) new ModalBottomSheetValue[]{modalBottomSheetValue, ModalBottomSheetValue.HalfExpanded, ModalBottomSheetValue.Expanded});
                        AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler3 = anchorChangeHandler2;
                        final ModalBottomSheetState modalBottomSheetState11 = modalBottomSheetState6;
                        Modifier modifierSwipeAnchors = SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material_release2, of, anchorChangeHandler3, new Function2<ModalBottomSheetValue, IntSize, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$WhenMappings */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                                    try {
                                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Float invoke(ModalBottomSheetValue modalBottomSheetValue2, IntSize intSize) {
                                return m1119invokeO0kMr_c(modalBottomSheetValue2, intSize.getPackedValue());
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                            public final Float m1119invokeO0kMr_c(@NotNull ModalBottomSheetValue state, long j19) {
                                Intrinsics.checkNotNullParameter(state, "state");
                                int i19 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                if (i19 == 1) {
                                    return Float.valueOf(fM3732getMaxHeightimpl);
                                }
                                if (i19 == 2) {
                                    if (IntSize.m3924getHeightimpl(j19) >= fM3732getMaxHeightimpl / 2.0f && !modalBottomSheetState11.isSkipHalfExpanded$material_release()) {
                                        return Float.valueOf(fM3732getMaxHeightimpl / 2.0f);
                                    }
                                    return null;
                                }
                                if (i19 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (IntSize.m3924getHeightimpl(j19) != 0) {
                                    return Float.valueOf(Math.max(0.0f, fM3732getMaxHeightimpl - IntSize.m3924getHeightimpl(j19)));
                                }
                                return null;
                            }
                        });
                        final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState6;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSwipeAnchors, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                if (modalBottomSheetState12.isVisible()) {
                                    final ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState12;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.1

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00871(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00871> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00871(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState13.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00871(modalBottomSheetState13, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (modalBottomSheetState12.getSwipeableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState12;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.2

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState14.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState14, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else if (modalBottomSheetState12.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState12;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.3

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState15.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState15, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }
                        }, 1, null);
                        Shape shape6 = shape5;
                        long j19 = j15;
                        long j110 = j16;
                        float f7 = f6;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = sheetContent;
                        final int i19 = i15;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i110) {
                                if ((i110 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1793508390, i110, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i20 = (i19 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                int i21 = i20 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i21 & 112) | (i21 & 14));
                                Density density2 = (Density) OooO00o.OooO00o(composer4, -1323940314);
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                                int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                                androidx.compose.animation.OooOO0.OooO00o((i22 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                                function6.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i110 = i15;
                        SurfaceKt.m1185SurfaceFjzlyU(modifierSemantics$default, shape6, j19, j110, null, f7, composableLambda, composer3, ((i110 >> 6) & 112) | 1572864 | ((i110 >> 9) & 896) | ((i110 >> 9) & 7168) | ((i110 << 3) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, function4), composer2, ((i15 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape2;
                f4 = f3;
                j8 = j6;
                j9 = j7;
                j10 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1633763156, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
                }
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation3 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f7) {
                            invoke(modalBottomSheetValue, f7.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f7) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f7, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f7) {
                            invoke(modalBottomSheetValue, f7.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f7) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f7, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler3 = (AnchorChangeHandler) objRememberedValue;
                final ModalBottomSheetState modalBottomSheetState8 = modalBottomSheetState2;
                final Shape shape6 = shape2;
                final long j18 = j6;
                final long j19 = j7;
                final int i16 = i8;
                final float f7 = f3;
                ModalBottomSheetState modalBottomSheetState9 = modalBottomSheetState2;
                final long j110 = scrimColor;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function5 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i17) {
                        int i18;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i17 & 14) == 0) {
                            i18 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i17;
                        } else {
                            i18 = i17;
                        }
                        if ((i18 & 91) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1607356310, i17, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
                        }
                        final float fM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk());
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i19 = i16;
                        long j111 = j110;
                        final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState8;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i19 >> 24) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$sheetState, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                        this.label = 1;
                                        if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (modalBottomSheetState10.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState10, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState10.getSwipeableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1116Scrim3JVO9M(j111, function0, targetValue != modalBottomSheetValue, composer3, (i19 >> 21) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m530widthInVpY3zN4$default(BoxWithConstraints.align(companion2, companion3.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        Object swipeableState$material_release = modalBottomSheetState8.getSwipeableState$material_release();
                        Orientation orientation4 = orientation3;
                        ModalBottomSheetState modalBottomSheetState11 = modalBottomSheetState8;
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged2 = composer3.changed(swipeableState$material_release) | composer3.changed(orientation4);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState11.getSwipeableState$material_release(), orientation4);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                        final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState8;
                        Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierNestedScroll$default, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                return IntOffset.m3874boximpl(m1118invokeBjo55l4(density2));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1118invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState12.getSwipeableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState8.getSwipeableState$material_release(), orientation3, modalBottomSheetState8.getSwipeableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        SwipeableV2State<ModalBottomSheetValue> swipeableState$material_release2 = modalBottomSheetState8.getSwipeableState$material_release();
                        Set of = SetsKt.setOf((Object[]) new ModalBottomSheetValue[]{modalBottomSheetValue, ModalBottomSheetValue.HalfExpanded, ModalBottomSheetValue.Expanded});
                        AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler4 = anchorChangeHandler3;
                        final ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState8;
                        Modifier modifierSwipeAnchors = SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material_release2, of, anchorChangeHandler4, new Function2<ModalBottomSheetValue, IntSize, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$WhenMappings */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                                    try {
                                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Float invoke(ModalBottomSheetValue modalBottomSheetValue2, IntSize intSize) {
                                return m1119invokeO0kMr_c(modalBottomSheetValue2, intSize.getPackedValue());
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                            public final Float m1119invokeO0kMr_c(@NotNull ModalBottomSheetValue state, long j112) {
                                Intrinsics.checkNotNullParameter(state, "state");
                                int i110 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                if (i110 == 1) {
                                    return Float.valueOf(fM3732getMaxHeightimpl);
                                }
                                if (i110 == 2) {
                                    if (IntSize.m3924getHeightimpl(j112) >= fM3732getMaxHeightimpl / 2.0f && !modalBottomSheetState13.isSkipHalfExpanded$material_release()) {
                                        return Float.valueOf(fM3732getMaxHeightimpl / 2.0f);
                                    }
                                    return null;
                                }
                                if (i110 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (IntSize.m3924getHeightimpl(j112) != 0) {
                                    return Float.valueOf(Math.max(0.0f, fM3732getMaxHeightimpl - IntSize.m3924getHeightimpl(j112)));
                                }
                                return null;
                            }
                        });
                        final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState8;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSwipeAnchors, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                if (modalBottomSheetState14.isVisible()) {
                                    final ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState14;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.1

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00871(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00871> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00871(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState15.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00871(modalBottomSheetState15, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (modalBottomSheetState14.getSwipeableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState14;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.2

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState16.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState16, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else if (modalBottomSheetState14.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState14;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.3

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState17.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState17, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }
                        }, 1, null);
                        Shape shape7 = shape6;
                        long j112 = j18;
                        long j113 = j19;
                        float f8 = f7;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function6 = sheetContent;
                        final int i110 = i16;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i111) {
                                if ((i111 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1793508390, i111, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function7 = function6;
                                int i20 = (i110 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                int i21 = i20 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i21 & 112) | (i21 & 14));
                                Density density2 = (Density) OooO00o.OooO00o(composer4, -1323940314);
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                                int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                                androidx.compose.animation.OooOO0.OooO00o((i22 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                                function7.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i111 = i16;
                        SurfaceKt.m1185SurfaceFjzlyU(modifierSemantics$default, shape7, j112, j113, null, f8, composableLambda, composer3, ((i111 >> 6) & 112) | 1572864 | ((i111 >> 9) & 896) | ((i111 >> 9) & 7168) | ((i111 << 3) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, function5), composer2, ((i16 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape2;
                f4 = f3;
                j8 = j6;
                j9 = j7;
                j10 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i17) {
                    ModalBottomSheetKt.m1115ModalBottomSheetLayoutBzaUkTc(sheetContent, modifier4, modalBottomSheetState3, shape3, f4, j8, j9, j10, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        if ((i & 7168) != 0) {
            if ((i2 & 8) == 0) {
                i12 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else {
                i12 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i12;
        }
        i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
            f2 = f;
        } else {
            f2 = f;
            if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
        }
        if ((458752 & i) != 0) {
            if ((i2 & 32) == 0) {
                i11 = 65536;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((3670016 & i) == 0) {
            j4 = j2;
            if ((i2 & 64) == 0) {
                i10 = 524288;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        } else {
            j4 = j2;
        }
        if ((29360128 & i) == 0) {
            if ((i2 & 128) == 0) {
                j5 = j3;
                if (composerStartRestartGroup.changed(j5)) {
                    i9 = 8388608;
                }
                i3 |= i9;
            } else {
                j5 = j3;
            }
            i9 = Configuration.BLOCK_SIZE;
            i3 |= i9;
        } else {
            j5 = j3;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((234881024 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
            }
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1633763156, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
                }
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation4 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f8) {
                            invoke(modalBottomSheetValue, f8.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f8) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f8, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f8) {
                            invoke(modalBottomSheetValue, f8.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f8) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f8, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler4 = (AnchorChangeHandler) objRememberedValue;
                final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState2;
                final Shape shape7 = shape2;
                final long j111 = j6;
                final long j112 = j7;
                final int i17 = i8;
                final float f8 = f3;
                ModalBottomSheetState modalBottomSheetState11 = modalBottomSheetState2;
                final long j113 = scrimColor;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function6 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i18) {
                        int i19;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i18 & 14) == 0) {
                            i19 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i18;
                        } else {
                            i19 = i18;
                        }
                        if ((i19 & 91) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1607356310, i18, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
                        }
                        final float fM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk());
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i110 = i17;
                        long j114 = j113;
                        final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState10;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i110 >> 24) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$sheetState, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                        this.label = 1;
                                        if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (modalBottomSheetState12.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState12, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState12.getSwipeableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1116Scrim3JVO9M(j114, function0, targetValue != modalBottomSheetValue, composer3, (i110 >> 21) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m530widthInVpY3zN4$default(BoxWithConstraints.align(companion2, companion3.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        Object swipeableState$material_release = modalBottomSheetState10.getSwipeableState$material_release();
                        Orientation orientation5 = orientation4;
                        ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState10;
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged2 = composer3.changed(swipeableState$material_release) | composer3.changed(orientation5);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState13.getSwipeableState$material_release(), orientation5);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                        final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState10;
                        Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierNestedScroll$default, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                return IntOffset.m3874boximpl(m1118invokeBjo55l4(density2));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1118invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState14.getSwipeableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState10.getSwipeableState$material_release(), orientation4, modalBottomSheetState10.getSwipeableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        SwipeableV2State<ModalBottomSheetValue> swipeableState$material_release2 = modalBottomSheetState10.getSwipeableState$material_release();
                        Set of = SetsKt.setOf((Object[]) new ModalBottomSheetValue[]{modalBottomSheetValue, ModalBottomSheetValue.HalfExpanded, ModalBottomSheetValue.Expanded});
                        AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler5 = anchorChangeHandler4;
                        final ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState10;
                        Modifier modifierSwipeAnchors = SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material_release2, of, anchorChangeHandler5, new Function2<ModalBottomSheetValue, IntSize, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$WhenMappings */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                                    try {
                                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Float invoke(ModalBottomSheetValue modalBottomSheetValue2, IntSize intSize) {
                                return m1119invokeO0kMr_c(modalBottomSheetValue2, intSize.getPackedValue());
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                            public final Float m1119invokeO0kMr_c(@NotNull ModalBottomSheetValue state, long j115) {
                                Intrinsics.checkNotNullParameter(state, "state");
                                int i111 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                if (i111 == 1) {
                                    return Float.valueOf(fM3732getMaxHeightimpl);
                                }
                                if (i111 == 2) {
                                    if (IntSize.m3924getHeightimpl(j115) >= fM3732getMaxHeightimpl / 2.0f && !modalBottomSheetState15.isSkipHalfExpanded$material_release()) {
                                        return Float.valueOf(fM3732getMaxHeightimpl / 2.0f);
                                    }
                                    return null;
                                }
                                if (i111 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (IntSize.m3924getHeightimpl(j115) != 0) {
                                    return Float.valueOf(Math.max(0.0f, fM3732getMaxHeightimpl - IntSize.m3924getHeightimpl(j115)));
                                }
                                return null;
                            }
                        });
                        final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState10;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSwipeAnchors, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                if (modalBottomSheetState16.isVisible()) {
                                    final ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState16;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.1

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00871(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00871> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00871(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState17.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00871(modalBottomSheetState17, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (modalBottomSheetState16.getSwipeableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState16;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.2

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState18.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState18, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else if (modalBottomSheetState16.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState19 = modalBottomSheetState16;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.3

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState19.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState19, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }
                        }, 1, null);
                        Shape shape8 = shape7;
                        long j115 = j111;
                        long j116 = j112;
                        float f9 = f8;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7 = sheetContent;
                        final int i111 = i17;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i112) {
                                if ((i112 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1793508390, i112, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function8 = function7;
                                int i20 = (i111 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                int i21 = i20 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i21 & 112) | (i21 & 14));
                                Density density2 = (Density) OooO00o.OooO00o(composer4, -1323940314);
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                                int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                                androidx.compose.animation.OooOO0.OooO00o((i22 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                                function8.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i112 = i17;
                        SurfaceKt.m1185SurfaceFjzlyU(modifierSemantics$default, shape8, j115, j116, null, f9, composableLambda, composer3, ((i112 >> 6) & 112) | 1572864 | ((i112 >> 9) & 896) | ((i112 >> 9) & 7168) | ((i112 << 3) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, function6), composer2, ((i17 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape2;
                f4 = f3;
                j8 = j6;
                j9 = j7;
                j10 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                        i3 &= -897;
                    } else {
                        modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                    }
                    if ((i2 & 8) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -7169;
                    } else {
                        large = shape;
                    }
                    if (i5 != 0) {
                        fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                    } else {
                        fM1114getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 32) != 0) {
                        jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                        i3 &= -458753;
                    } else {
                        jM1027getSurface0d7_KjU = j;
                    }
                    if ((i2 & 64) != 0) {
                        jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                    } else {
                        jM1041contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 128) != 0) {
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i8 = i3 & (-29360129);
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        scrimColor = j3;
                        i8 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                        shape2 = large;
                        f3 = fM1114getElevationD9Ej5fM;
                        j6 = jM1027getSurface0d7_KjU;
                        j7 = jM1041contentColorForek8zF_U;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1633763156, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
                }
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation5 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f9) {
                            invoke(modalBottomSheetValue, f9.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f9) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f9, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            final /* synthetic */ float $velocity;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                                this.$velocity = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    float f = this.$velocity;
                                    this.label = 1;
                                    if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f9) {
                            invoke(modalBottomSheetValue, f9.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ModalBottomSheetValue target, float f9) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f9, null), 3, null);
                        }
                    }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            final /* synthetic */ ModalBottomSheetValue $target;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                                this.$target = modalBottomSheetValue;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                    this.label = 1;
                                    if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                            invoke2(modalBottomSheetValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ModalBottomSheetValue target) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler5 = (AnchorChangeHandler) objRememberedValue;
                final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState2;
                final Shape shape8 = shape2;
                final long j114 = j6;
                final long j115 = j7;
                final int i18 = i8;
                final float f9 = f3;
                ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState2;
                final long j116 = scrimColor;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function7 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i19) {
                        int i110;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i19 & 14) == 0) {
                            i110 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i19;
                        } else {
                            i110 = i19;
                        }
                        if ((i110 & 91) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1607356310, i19, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
                        }
                        final float fM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk());
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i111 = i18;
                        long j117 = j116;
                        final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState12;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i111 >> 24) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$sheetState, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                        this.label = 1;
                                        if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (modalBottomSheetState14.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState14, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState14.getSwipeableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1116Scrim3JVO9M(j117, function0, targetValue != modalBottomSheetValue, composer3, (i111 >> 21) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m530widthInVpY3zN4$default(BoxWithConstraints.align(companion2, companion3.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        Object swipeableState$material_release = modalBottomSheetState12.getSwipeableState$material_release();
                        Orientation orientation6 = orientation5;
                        ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState12;
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged2 = composer3.changed(swipeableState$material_release) | composer3.changed(orientation6);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState15.getSwipeableState$material_release(), orientation6);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                        final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState12;
                        Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierNestedScroll$default, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                return IntOffset.m3874boximpl(m1118invokeBjo55l4(density2));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1118invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState16.getSwipeableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState12.getSwipeableState$material_release(), orientation5, modalBottomSheetState12.getSwipeableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        SwipeableV2State<ModalBottomSheetValue> swipeableState$material_release2 = modalBottomSheetState12.getSwipeableState$material_release();
                        Set of = SetsKt.setOf((Object[]) new ModalBottomSheetValue[]{modalBottomSheetValue, ModalBottomSheetValue.HalfExpanded, ModalBottomSheetValue.Expanded});
                        AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler6 = anchorChangeHandler5;
                        final ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState12;
                        Modifier modifierSwipeAnchors = SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material_release2, of, anchorChangeHandler6, new Function2<ModalBottomSheetValue, IntSize, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$WhenMappings */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                                    try {
                                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Float invoke(ModalBottomSheetValue modalBottomSheetValue2, IntSize intSize) {
                                return m1119invokeO0kMr_c(modalBottomSheetValue2, intSize.getPackedValue());
                            }

                            @Nullable
                            /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                            public final Float m1119invokeO0kMr_c(@NotNull ModalBottomSheetValue state, long j118) {
                                Intrinsics.checkNotNullParameter(state, "state");
                                int i112 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                if (i112 == 1) {
                                    return Float.valueOf(fM3732getMaxHeightimpl);
                                }
                                if (i112 == 2) {
                                    if (IntSize.m3924getHeightimpl(j118) >= fM3732getMaxHeightimpl / 2.0f && !modalBottomSheetState17.isSkipHalfExpanded$material_release()) {
                                        return Float.valueOf(fM3732getMaxHeightimpl / 2.0f);
                                    }
                                    return null;
                                }
                                if (i112 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (IntSize.m3924getHeightimpl(j118) != 0) {
                                    return Float.valueOf(Math.max(0.0f, fM3732getMaxHeightimpl - IntSize.m3924getHeightimpl(j118)));
                                }
                                return null;
                            }
                        });
                        final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState12;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSwipeAnchors, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                if (modalBottomSheetState18.isVisible()) {
                                    final ModalBottomSheetState modalBottomSheetState19 = modalBottomSheetState18;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.1

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00871(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00871> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00871(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState19.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00871(modalBottomSheetState19, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (modalBottomSheetState18.getSwipeableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState110 = modalBottomSheetState18;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.2

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState110.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState110, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else if (modalBottomSheetState18.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState111 = modalBottomSheetState18;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.3

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1, reason: invalid class name */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (modalBottomSheetState111.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState111, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }
                        }, 1, null);
                        Shape shape9 = shape8;
                        long j118 = j114;
                        long j119 = j115;
                        float f10 = f9;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function8 = sheetContent;
                        final int i112 = i18;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i113) {
                                if ((i113 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1793508390, i113, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function9 = function8;
                                int i20 = (i112 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                int i21 = i20 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i21 & 112) | (i21 & 14));
                                Density density2 = (Density) OooO00o.OooO00o(composer4, -1323940314);
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                                int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                                androidx.compose.animation.OooOO0.OooO00o((i22 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                                function9.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i113 = i18;
                        SurfaceKt.m1185SurfaceFjzlyU(modifierSemantics$default, shape9, j118, j119, null, f10, composableLambda, composer3, ((i113 >> 6) & 112) | 1572864 | ((i113 >> 9) & 896) | ((i113 >> 9) & 7168) | ((i113 << 3) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, function7), composer2, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape2;
                f4 = f3;
                j8 = j6;
                j9 = j7;
                j10 = scrimColor;
                modalBottomSheetState3 = modalBottomSheetState13;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i19) {
                    ModalBottomSheetKt.m1115ModalBottomSheetLayoutBzaUkTc(sheetContent, modifier5, modalBottomSheetState3, shape3, f4, j8, j9, j10, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i7 = 100663296;
        i3 |= i7;
        if (i4 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i3 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if ((i2 & 8) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -7169;
                } else {
                    large = shape;
                }
                if (i5 != 0) {
                    fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                } else {
                    fM1114getElevationD9Ej5fM = f2;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM1027getSurface0d7_KjU = j;
                }
                if ((i2 & 64) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & 128) != 0) {
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i8 = i3 & (-29360129);
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    scrimColor = j3;
                    i8 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                }
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i3 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if ((i2 & 8) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -7169;
                } else {
                    large = shape;
                }
                if (i5 != 0) {
                    fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                } else {
                    fM1114getElevationD9Ej5fM = f2;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM1027getSurface0d7_KjU = j;
                }
                if ((i2 & 64) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & 128) != 0) {
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i8 = i3 & (-29360129);
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    scrimColor = j3;
                    i8 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1633763156, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
            }
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final Orientation orientation6 = Orientation.Vertical;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        final /* synthetic */ float $velocity;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                            this.$velocity = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                float f = this.$velocity;
                                this.label = 1;
                                if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f10) {
                        invoke(modalBottomSheetValue, f10.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ModalBottomSheetValue target, float f10) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f10, null), 3, null);
                    }
                }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                this.label = 1;
                                if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                        invoke2(modalBottomSheetValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ModalBottomSheetValue target) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        final /* synthetic */ float $velocity;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                            this.$velocity = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                float f = this.$velocity;
                                this.label = 1;
                                if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f10) {
                        invoke(modalBottomSheetValue, f10.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ModalBottomSheetValue target, float f10) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f10, null), 3, null);
                    }
                }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                this.label = 1;
                                if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                        invoke2(modalBottomSheetValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ModalBottomSheetValue target) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler6 = (AnchorChangeHandler) objRememberedValue;
            final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState2;
            final Shape shape9 = shape2;
            final long j117 = j6;
            final long j118 = j7;
            final int i19 = i8;
            final float f10 = f3;
            ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState2;
            final long j119 = scrimColor;
            Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function8 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i110) {
                    int i111;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i110 & 14) == 0) {
                        i111 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i110;
                    } else {
                        i111 = i110;
                    }
                    if ((i111 & 91) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1607356310, i110, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
                    }
                    final float fM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk());
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i112 = i19;
                    long j1110 = j119;
                    final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState14;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    composer3.startReplaceableGroup(733328855);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composer3, Integer.valueOf((i112 >> 24) & 14));
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    this.label = 1;
                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (modalBottomSheetState16.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState16, null), 3, null);
                            }
                        }
                    };
                    ModalBottomSheetValue targetValue = modalBottomSheetState16.getSwipeableState$material_release().getTargetValue();
                    ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                    ModalBottomSheetKt.m1116Scrim3JVO9M(j1110, function0, targetValue != modalBottomSheetValue, composer3, (i112 >> 21) & 14);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m530widthInVpY3zN4$default(BoxWithConstraints.align(companion2, companion3.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                    Object swipeableState$material_release = modalBottomSheetState14.getSwipeableState$material_release();
                    Orientation orientation7 = orientation6;
                    ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState14;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged2 = composer3.changed(swipeableState$material_release) | composer3.changed(orientation7);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState17.getSwipeableState$material_release(), orientation7);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                    final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState14;
                    Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierNestedScroll$default, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                            return IntOffset.m3874boximpl(m1118invokeBjo55l4(density2));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m1118invokeBjo55l4(@NotNull Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState18.getSwipeableState$material_release().requireOffset()));
                        }
                    }), modalBottomSheetState14.getSwipeableState$material_release(), orientation6, modalBottomSheetState14.getSwipeableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                    SwipeableV2State<ModalBottomSheetValue> swipeableState$material_release2 = modalBottomSheetState14.getSwipeableState$material_release();
                    Set of = SetsKt.setOf((Object[]) new ModalBottomSheetValue[]{modalBottomSheetValue, ModalBottomSheetValue.HalfExpanded, ModalBottomSheetValue.Expanded});
                    AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler7 = anchorChangeHandler6;
                    final ModalBottomSheetState modalBottomSheetState19 = modalBottomSheetState14;
                    Modifier modifierSwipeAnchors = SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material_release2, of, anchorChangeHandler7, new Function2<ModalBottomSheetValue, IntSize, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$WhenMappings */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ModalBottomSheetValue.values().length];
                                try {
                                    iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Float invoke(ModalBottomSheetValue modalBottomSheetValue2, IntSize intSize) {
                            return m1119invokeO0kMr_c(modalBottomSheetValue2, intSize.getPackedValue());
                        }

                        @Nullable
                        /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                        public final Float m1119invokeO0kMr_c(@NotNull ModalBottomSheetValue state, long j1111) {
                            Intrinsics.checkNotNullParameter(state, "state");
                            int i113 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                            if (i113 == 1) {
                                return Float.valueOf(fM3732getMaxHeightimpl);
                            }
                            if (i113 == 2) {
                                if (IntSize.m3924getHeightimpl(j1111) >= fM3732getMaxHeightimpl / 2.0f && !modalBottomSheetState19.isSkipHalfExpanded$material_release()) {
                                    return Float.valueOf(fM3732getMaxHeightimpl / 2.0f);
                                }
                                return null;
                            }
                            if (i113 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (IntSize.m3924getHeightimpl(j1111) != 0) {
                                return Float.valueOf(Math.max(0.0f, fM3732getMaxHeightimpl - IntSize.m3924getHeightimpl(j1111)));
                            }
                            return null;
                        }
                    });
                    final ModalBottomSheetState modalBottomSheetState110 = modalBottomSheetState14;
                    final CoroutineScope coroutineScope3 = coroutineScope;
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSwipeAnchors, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            if (modalBottomSheetState110.isVisible()) {
                                final ModalBottomSheetState modalBottomSheetState111 = modalBottomSheetState110;
                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.1

                                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
                                    public static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C00871(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00871> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C00871(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                this.label = 1;
                                                if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C00871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        if (modalBottomSheetState111.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00871(modalBottomSheetState111, null), 3, null);
                                        }
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                                if (modalBottomSheetState110.getSwipeableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                    final ModalBottomSheetState modalBottomSheetState112 = modalBottomSheetState110;
                                    final CoroutineScope coroutineScope5 = coroutineScope3;
                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.2

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1, reason: invalid class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState112.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState112, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                } else if (modalBottomSheetState110.getHasHalfExpandedState$material_release()) {
                                    final ModalBottomSheetState modalBottomSheetState113 = modalBottomSheetState110;
                                    final CoroutineScope coroutineScope6 = coroutineScope3;
                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.3

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1, reason: invalid class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState113.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState113, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }
                    }, 1, null);
                    Shape shape10 = shape9;
                    long j1111 = j117;
                    long j1112 = j118;
                    float f11 = f10;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function9 = sheetContent;
                    final int i113 = i19;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i114) {
                            if ((i114 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1793508390, i114, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                            }
                            Function3<ColumnScope, Composer, Integer, Unit> function10 = function9;
                            int i20 = (i113 << 9) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            int i21 = i20 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i21 & 112) | (i21 & 14));
                            Density density2 = (Density) OooO00o.OooO00o(composer4, -1323940314);
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                            int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                            androidx.compose.animation.OooOO0.OooO00o((i22 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                            function10.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i114 = i19;
                    SurfaceKt.m1185SurfaceFjzlyU(modifierSemantics$default, shape10, j1111, j1112, null, f11, composableLambda, composer3, ((i114 >> 6) & 112) | 1572864 | ((i114 >> 9) & 896) | ((i114 >> 9) & 7168) | ((i114 << 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, function8), composer2, ((i19 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape3 = shape2;
            f4 = f3;
            j8 = j6;
            j9 = j7;
            j10 = scrimColor;
            modalBottomSheetState3 = modalBottomSheetState15;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i3 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if ((i2 & 8) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -7169;
                } else {
                    large = shape;
                }
                if (i5 != 0) {
                    fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                } else {
                    fM1114getElevationD9Ej5fM = f2;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM1027getSurface0d7_KjU = j;
                }
                if ((i2 & 64) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & 128) != 0) {
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i8 = i3 & (-29360129);
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    scrimColor = j3;
                    i8 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                }
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, composerStartRestartGroup, 6, 14);
                    i3 &= -897;
                } else {
                    modalBottomSheetStateRememberModalBottomSheetState = modalBottomSheetState;
                }
                if ((i2 & 8) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -7169;
                } else {
                    large = shape;
                }
                if (i5 != 0) {
                    fM1114getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1114getElevationD9Ej5fM();
                } else {
                    fM1114getElevationD9Ej5fM = f2;
                }
                if ((i2 & 32) != 0) {
                    jM1027getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU();
                    i3 &= -458753;
                } else {
                    jM1027getSurface0d7_KjU = j;
                }
                if ((i2 & 64) != 0) {
                    jM1041contentColorForek8zF_U = ColorsKt.m1041contentColorForek8zF_U(jM1027getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -3670017;
                } else {
                    jM1041contentColorForek8zF_U = j2;
                }
                if ((i2 & 128) != 0) {
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i8 = i3 & (-29360129);
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    scrimColor = j3;
                    i8 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    shape2 = large;
                    f3 = fM1114getElevationD9Ej5fM;
                    j6 = jM1027getSurface0d7_KjU;
                    j7 = jM1041contentColorForek8zF_U;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1633763156, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)");
            }
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final Orientation orientation7 = Orientation.Vertical;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        final /* synthetic */ float $velocity;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                            this.$velocity = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                float f = this.$velocity;
                                this.label = 1;
                                if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f11) {
                        invoke(modalBottomSheetValue, f11.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ModalBottomSheetValue target, float f11) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f11, null), 3, null);
                    }
                }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                this.label = 1;
                                if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                        invoke2(modalBottomSheetValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ModalBottomSheetValue target) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = ModalBottomSheetAnchorChangeHandler(modalBottomSheetState2, new Function2<ModalBottomSheetValue, Float, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        final /* synthetic */ float $velocity;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                            this.$velocity = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, this.$velocity, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                float f = this.$velocity;
                                this.label = 1;
                                if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue, Float f11) {
                        invoke(modalBottomSheetValue, f11.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ModalBottomSheetValue target, float f11) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, f11, null), 3, null);
                    }
                }, new Function1<ModalBottomSheetValue, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2

                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ModalBottomSheetState $sheetState;
                        final /* synthetic */ ModalBottomSheetValue $target;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = modalBottomSheetState;
                            this.$target = modalBottomSheetValue;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$target, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                ModalBottomSheetValue modalBottomSheetValue = this.$target;
                                this.label = 1;
                                if (modalBottomSheetState.snapTo$material_release(modalBottomSheetValue, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetValue modalBottomSheetValue) {
                        invoke2(modalBottomSheetValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ModalBottomSheetValue target) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, target, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler7 = (AnchorChangeHandler) objRememberedValue;
            final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState2;
            final Shape shape10 = shape2;
            final long j1110 = j6;
            final long j1111 = j7;
            final int i110 = i8;
            final float f11 = f3;
            ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState2;
            final long j1112 = scrimColor;
            Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function9 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i111) {
                    int i112;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i111 & 14) == 0) {
                        i112 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i111;
                    } else {
                        i112 = i111;
                    }
                    if ((i112 & 91) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1607356310, i111, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:453)");
                    }
                    final float fM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk());
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i113 = i110;
                    long j1113 = j1112;
                    final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState16;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    composer3.startReplaceableGroup(733328855);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer3, composer3), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composer3, Integer.valueOf((i113 >> 24) & 14));
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    this.label = 1;
                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (modalBottomSheetState18.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState18, null), 3, null);
                            }
                        }
                    };
                    ModalBottomSheetValue targetValue = modalBottomSheetState18.getSwipeableState$material_release().getTargetValue();
                    ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                    ModalBottomSheetKt.m1116Scrim3JVO9M(j1113, function0, targetValue != modalBottomSheetValue, composer3, (i113 >> 21) & 14);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m530widthInVpY3zN4$default(BoxWithConstraints.align(companion2, companion3.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                    Object swipeableState$material_release = modalBottomSheetState16.getSwipeableState$material_release();
                    Orientation orientation8 = orientation7;
                    ModalBottomSheetState modalBottomSheetState19 = modalBottomSheetState16;
                    composer3.startReplaceableGroup(511388516);
                    boolean zChanged2 = composer3.changed(swipeableState$material_release) | composer3.changed(orientation8);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState19.getSwipeableState$material_release(), orientation8);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                    final ModalBottomSheetState modalBottomSheetState110 = modalBottomSheetState16;
                    Modifier modifierSwipeableV2$default = SwipeableV2Kt.swipeableV2$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierNestedScroll$default, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                            return IntOffset.m3874boximpl(m1118invokeBjo55l4(density2));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m1118invokeBjo55l4(@NotNull Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState110.getSwipeableState$material_release().requireOffset()));
                        }
                    }), modalBottomSheetState16.getSwipeableState$material_release(), orientation7, modalBottomSheetState16.getSwipeableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                    SwipeableV2State<ModalBottomSheetValue> swipeableState$material_release2 = modalBottomSheetState16.getSwipeableState$material_release();
                    Set of = SetsKt.setOf((Object[]) new ModalBottomSheetValue[]{modalBottomSheetValue, ModalBottomSheetValue.HalfExpanded, ModalBottomSheetValue.Expanded});
                    AnchorChangeHandler<ModalBottomSheetValue> anchorChangeHandler8 = anchorChangeHandler7;
                    final ModalBottomSheetState modalBottomSheetState111 = modalBottomSheetState16;
                    Modifier modifierSwipeAnchors = SwipeableV2Kt.swipeAnchors(modifierSwipeableV2$default, swipeableState$material_release2, of, anchorChangeHandler8, new Function2<ModalBottomSheetValue, IntSize, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$WhenMappings */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ModalBottomSheetValue.values().length];
                                try {
                                    iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Float invoke(ModalBottomSheetValue modalBottomSheetValue2, IntSize intSize) {
                            return m1119invokeO0kMr_c(modalBottomSheetValue2, intSize.getPackedValue());
                        }

                        @Nullable
                        /* JADX INFO: renamed from: invoke-O0kMr_c, reason: not valid java name */
                        public final Float m1119invokeO0kMr_c(@NotNull ModalBottomSheetValue state, long j1114) {
                            Intrinsics.checkNotNullParameter(state, "state");
                            int i114 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                            if (i114 == 1) {
                                return Float.valueOf(fM3732getMaxHeightimpl);
                            }
                            if (i114 == 2) {
                                if (IntSize.m3924getHeightimpl(j1114) >= fM3732getMaxHeightimpl / 2.0f && !modalBottomSheetState111.isSkipHalfExpanded$material_release()) {
                                    return Float.valueOf(fM3732getMaxHeightimpl / 2.0f);
                                }
                                return null;
                            }
                            if (i114 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (IntSize.m3924getHeightimpl(j1114) != 0) {
                                return Float.valueOf(Math.max(0.0f, fM3732getMaxHeightimpl - IntSize.m3924getHeightimpl(j1114)));
                            }
                            return null;
                        }
                    });
                    final ModalBottomSheetState modalBottomSheetState112 = modalBottomSheetState16;
                    final CoroutineScope coroutineScope3 = coroutineScope;
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSwipeAnchors, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            if (modalBottomSheetState112.isVisible()) {
                                final ModalBottomSheetState modalBottomSheetState113 = modalBottomSheetState112;
                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.1

                                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
                                    public static final class C00871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C00871(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00871> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C00871(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                this.label = 1;
                                                if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C00871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        if (modalBottomSheetState113.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00871(modalBottomSheetState113, null), 3, null);
                                        }
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                                if (modalBottomSheetState112.getSwipeableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                    final ModalBottomSheetState modalBottomSheetState114 = modalBottomSheetState112;
                                    final CoroutineScope coroutineScope5 = coroutineScope3;
                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.2

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1, reason: invalid class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState114.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState114, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                } else if (modalBottomSheetState112.getHasHalfExpandedState$material_release()) {
                                    final ModalBottomSheetState modalBottomSheetState115 = modalBottomSheetState112;
                                    final CoroutineScope coroutineScope6 = coroutineScope3;
                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.5.3

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1, reason: invalid class name */
                                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (modalBottomSheetState115.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState115, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }
                    }, 1, null);
                    Shape shape11 = shape10;
                    long j1114 = j1110;
                    long j1115 = j1111;
                    float f12 = f11;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function10 = sheetContent;
                    final int i114 = i110;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i115) {
                            if ((i115 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1793508390, i115, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:540)");
                            }
                            Function3<ColumnScope, Composer, Integer, Unit> function11 = function10;
                            int i20 = (i114 << 9) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            int i21 = i20 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i21 & 112) | (i21 & 14));
                            Density density2 = (Density) OooO00o.OooO00o(composer4, -1323940314);
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                            int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer4);
                            androidx.compose.animation.OooOO0.OooO00o((i22 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer4, composer4), composer4, 2058660585);
                            function11.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i115 = i110;
                    SurfaceKt.m1185SurfaceFjzlyU(modifierSemantics$default, shape11, j1114, j1115, null, f12, composableLambda, composer3, ((i115 >> 6) & 112) | 1572864 | ((i115 >> 9) & 896) | ((i115 >> 9) & 7168) | ((i115 << 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, function9), composer2, ((i110 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape3 = shape2;
            f4 = f3;
            j8 = j6;
            j9 = j7;
            j10 = scrimColor;
            modalBottomSheetState3 = modalBottomSheetState17;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier6 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i111) {
                ModalBottomSheetKt.m1115ModalBottomSheetLayoutBzaUkTc(sheetContent, modifier6, modalBottomSheetState3, shape3, f4, j8, j9, j10, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        return new ModalBottomSheetState(initialValue, animationSpec, z, confirmValueChange);
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 4) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1116Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(-526532668);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:547)");
            }
            if (j != Color.INSTANCE.m1706getUnspecified0d7_KjU()) {
                final State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 48, 12);
                final String strM1183getString4foXLRw = Strings_androidKt.m1183getString4foXLRw(Strings.INSTANCE.m1177getCloseSheetUdPEhr4(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1010553415);
                if (z) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    boolean zChanged2 = composerStartRestartGroup.changed(strM1183getString4foXLRw) | composerStartRestartGroup.changed(function0);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsPropertiesKt.setContentDescription(semantics, strM1183getString4foXLRw);
                                final Function0<Unit> function1 = function0;
                                SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        function1.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                } else {
                    modifierSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                Color colorM1660boximpl = Color.m1660boximpl(j);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged3 = composerStartRestartGroup.changed(colorM1660boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0OO(Canvas, j, 0L, 0L, ModalBottomSheetKt.Scrim_3J_VO9M$lambda$1(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                ModalBottomSheetKt.m1116Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull final ModalBottomSheetValue initialValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super ModalBottomSheetValue, Boolean> function1, final boolean z, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-126412120);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.rememberModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:313)");
        }
        composer.startMovableGroup(170046719, initialValue);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m1322rememberSaveable(new Object[]{initialValue, animationSpec, Boolean.valueOf(z), function1}, (Saver) ModalBottomSheetState.Companion.Saver(animationSpec, function1, z), (String) null, (Function0) new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt.rememberModalBottomSheetState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModalBottomSheetState invoke() {
                return ModalBottomSheetKt.ModalBottomSheetState(initialValue, animationSpec, function1, z);
            }
        }, composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @NotNull
    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, boolean z, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-409288536);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:362)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, z, composer, (i & 14) | 64 | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetStateRememberModalBottomSheetState;
    }

    @NotNull
    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-1928569212);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:389)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, false, composer, (i & 14) | 3136 | (i & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetStateRememberModalBottomSheetState;
    }
}
