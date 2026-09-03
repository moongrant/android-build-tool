package androidx.compose.material;

import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.Oooo000;
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
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
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
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0096\u0001\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00120%¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a@\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u00142\b\b\u0002\u0010.\u001a\u00020\u001cH\u0007\u001aH\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u0006\u0010/\u001a\u0002002\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u00142\b\b\u0002\u0010.\u001a\u00020\u001cH\u0007\u001a3\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120%2\u0006\u00104\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a9\u00107\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u0014H\u0007¢\u0006\u0002\u00109\u001aE\u00107\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u00142\b\b\u0002\u0010:\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010;\u001aA\u00107\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010:\u001a\u00020\u001c2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u0014H\u0007¢\u0006\u0002\u0010<\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\n\u0010>\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"MaxModalBottomSheetWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ModalBottomSheetPositionalThreshold", "ModalBottomSheetVelocityThreshold", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "ModalBottomSheetAnchorChangeCallback", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "Landroidx/compose/material/ModalBottomSheetValue;", "Landroidx/compose/material/ModalBottomSheetState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ModalBottomSheetLayout", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "isSkipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "material_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,831:1\n76#2:832\n76#2:833\n486#3,4:834\n490#3,2:842\n494#3:848\n25#4:838\n50#4:849\n49#4:850\n36#4:858\n50#4:865\n49#4:866\n50#4:873\n49#4:874\n1097#5,3:839\n1100#5,3:845\n1097#5,6:851\n1097#5,6:859\n1097#5,6:867\n1097#5,6:875\n486#6:844\n646#7:857\n81#8:881\n154#9:882\n154#9:883\n154#9:884\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n443#1:832\n577#1:833\n582#1:834,4\n582#1:842,2\n582#1:848\n582#1:838\n584#1:849\n584#1:850\n708#1:858\n709#1:865\n709#1:866\n721#1:873\n721#1:874\n582#1:839,3\n582#1:845,3\n584#1:851,6\n708#1:859,6\n709#1:867,6\n721#1:875,6\n582#1:844\n700#1:857\n701#1:881\n828#1:882\n829#1:883\n830#1:884\n*E\n"})
public final class ModalBottomSheetKt {
    private static final float ModalBottomSheetPositionalThreshold = Dp.m3775constructorimpl(56);
    private static final float ModalBottomSheetVelocityThreshold = Dp.m3775constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m3775constructorimpl(640);

    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        public AnonymousClass1(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
            this.$state = anchoredDraggableState;
            this.$orientation = orientation;
        }

        @JvmName(name = "offsetToFloat")
        private final float offsetToFloat(long j) {
            return this.$orientation == Orientation.Horizontal ? Offset.m1447getXimpl(j) : Offset.m1448getYimpl(j);
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
            return this.$orientation == Orientation.Horizontal ? Velocity.m4000getXimpl(j) : Velocity.m4001getYimpl(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo333onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
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
                AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                float fVelocityToFloat = velocityToFloat(j2);
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = 1;
                if (anchoredDraggableState.settle(fVelocityToFloat, modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m3991boximpl(j2);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
        public long mo334onPostScrollDzOQY0M(long consumed, long available, int source) {
            return NestedScrollSource.m2604equalsimpl0(source, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI()) ? toOffset(this.$state.dispatchRawDelta(offsetToFloat(available))) : Offset.INSTANCE.m1463getZeroF1C5BW0();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* JADX INFO: renamed from: onPreFling-QWom1Mo */
        public Object mo335onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
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
                    j = Velocity.INSTANCE.m4011getZero9UxMQ8M();
                } else {
                    AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0 = j;
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = 1;
                    if (anchoredDraggableState.settle(fVelocityToFloat, modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
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
            return Velocity.m3991boximpl(j);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public long mo336onPreScrollOzD1aCk(long available, int source) {
            float fOffsetToFloat = offsetToFloat(available);
            return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m2604equalsimpl0(source, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI())) ? Offset.INSTANCE.m1463getZeroF1C5BW0() : toOffset(this.$state.dispatchRawDelta(fOffsetToFloat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new AnonymousClass1(anchoredDraggableState, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> ModalBottomSheetAnchorChangeCallback(final ModalBottomSheetState modalBottomSheetState, final CoroutineScope coroutineScope) {
        return new AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetAnchorChangeCallback.1

            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$WhenMappings */
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

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(@NotNull ModalBottomSheetValue prevTarget, @NotNull Map<ModalBottomSheetValue, Float> prevAnchors, @NotNull Map<ModalBottomSheetValue, Float> newAnchors) {
                ModalBottomSheetValue modalBottomSheetValue;
                Intrinsics.checkNotNullParameter(prevTarget, "prevTarget");
                Intrinsics.checkNotNullParameter(prevAnchors, "prevAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = prevAnchors.get(prevTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[prevTarget.ordinal()];
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
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1(modalBottomSheetState, modalBottomSheetValue, null), 3, null);
                } else {
                    if (modalBottomSheetState.trySnapTo$material_release(modalBottomSheetValue)) {
                        return;
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$2(modalBottomSheetState, modalBottomSheetValue, null), 3, null);
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x018d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:134:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:146:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:158:0x0215  */
    /* JADX WARN: Code duplicated, block: B:161:0x022a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0258  */
    /* JADX WARN: Code duplicated, block: B:167:0x0285  */
    /* JADX WARN: Code duplicated, block: B:169:0x028b  */
    /* JADX WARN: Code duplicated, block: B:172:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x0303  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    public static final void m1131ModalBottomSheetLayoutGs3lGvM(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, @Nullable Modifier modifier, @Nullable ModalBottomSheetState modalBottomSheetState, boolean z, @Nullable Shape shape, float f, long j, long j2, long j3, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        Shape shape2;
        int i7;
        int i8;
        long j4;
        long j5;
        int i9;
        Modifier modifier2;
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState;
        boolean z3;
        Shape large;
        float fM1130getElevationD9Ej5fM;
        long jM1043getSurface0d7_KjU;
        long jM1057contentColorForek8zF_U;
        long scrimColor;
        boolean z4;
        Shape shape3;
        float f2;
        long j6;
        long j7;
        long j8;
        int i10;
        final ModalBottomSheetState modalBottomSheetState2;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        final boolean z5;
        final Shape shape4;
        final float f3;
        final long j9;
        final long j10;
        final long j11;
        final ModalBottomSheetState modalBottomSheetState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-92970288);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                i3 |= 3072;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
            }
            if ((57344 & i) == 0) {
                shape2 = shape;
                if ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape2)) {
                    i13 = 8192;
                } else {
                    i13 = 16384;
                }
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                i3 |= 196608;
            } else if ((458752 & i) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j4 = j;
                    int i15 = composerStartRestartGroup.changed(j4) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
                    i3 |= i15;
                } else {
                    j4 = j;
                }
                i3 |= i15;
            } else {
                j4 = j;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i12 = Configuration.BLOCK_SIZE;
                } else {
                    i12 = 8388608;
                }
                i3 |= i12;
            }
            if ((234881024 & i) == 0) {
                j5 = j3;
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(j5)) {
                    i11 = 33554432;
                } else {
                    i11 = 67108864;
                }
                i3 |= i11;
            } else {
                j5 = j3;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i9 = 536870912;
                    } else {
                        i9 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i4 != 4 && (1533916891 & i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    modalBottomSheetState3 = modalBottomSheetState;
                    j11 = j5;
                    z5 = z2;
                    composer2 = composerStartRestartGroup;
                    j10 = j2;
                    j9 = j4;
                    shape4 = shape2;
                    f3 = f;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i14 != 0) {
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
                        if (i5 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i3 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if (i7 != 0) {
                            fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                        } else {
                            fM1130getElevationD9Ej5fM = f;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i3 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        z4 = z3;
                        shape3 = large;
                        f2 = fM1130getElevationD9Ej5fM;
                        j6 = jM1043getSurface0d7_KjU;
                        j7 = jM1057contentColorForek8zF_U;
                        j8 = scrimColor;
                        i10 = i3;
                        modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if (i4 != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i3 &= -234881025;
                        }
                        modifier2 = modifier;
                        f2 = f;
                        j7 = j2;
                        j6 = j4;
                        j8 = j5;
                        z4 = z2;
                        shape3 = shape2;
                        modalBottomSheetState2 = modalBottomSheetState;
                        i10 = i3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-92970288, i10, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(502769027);
                    if (modalBottomSheetState2.getDensity() == null) {
                        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
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
                                modalBottomSheetState2.setDensity$material_release(density);
                            }
                        }, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final Orientation orientation = Orientation.Vertical;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final AnchoredDraggableState.AnchorChangedCallback anchorChangedCallback = (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2;
                    final boolean z6 = z4;
                    final ModalBottomSheetState modalBottomSheetState4 = modalBottomSheetState2;
                    final Shape shape5 = shape3;
                    final long j12 = j6;
                    final int i16 = i10;
                    final long j13 = j7;
                    ModalBottomSheetState modalBottomSheetState5 = modalBottomSheetState2;
                    final float f4 = f2;
                    final long j14 = j8;
                    Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function3 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                            Modifier modifierNestedScroll$default;
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
                                ComposerKt.traceEventStart(-1731958854, i17, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                            }
                            final float fM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                            Modifier modifierSemantics$default = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i19 = i16;
                            long j15 = j14;
                            final ModalBottomSheetState modalBottomSheetState6 = modalBottomSheetState4;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            composer3.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function2.invoke(composer3, Integer.valueOf((i19 >> 27) & 14));
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1

                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
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
                                    if (modalBottomSheetState6.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState6, null), 3, null);
                                    }
                                }
                            };
                            ModalBottomSheetValue targetValue = modalBottomSheetState6.getAnchoredDraggableState$material_release().getTargetValue();
                            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                            ModalBottomSheetKt.m1132Scrim3JVO9M(j15, function0, targetValue != modalBottomSheetValue, composer3, (i19 >> 24) & 14);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m532widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion2.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                            composer3.startReplaceableGroup(1241536180);
                            if (z6) {
                                Object anchoredDraggableState$material_release = modalBottomSheetState4.getAnchoredDraggableState$material_release();
                                Orientation orientation2 = orientation;
                                ModalBottomSheetState modalBottomSheetState7 = modalBottomSheetState4;
                                composer3.startReplaceableGroup(511388516);
                                boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release) | composer3.changed(orientation2);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState7.getAnchoredDraggableState$material_release(), orientation2);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue3, null, 2, null);
                            } else {
                                modifierNestedScroll$default = modifierSemantics$default;
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierThen = modifierFillMaxWidth$default.then(modifierNestedScroll$default);
                            final ModalBottomSheetState modalBottomSheetState8 = modalBottomSheetState4;
                            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierThen, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                    return IntOffset.m3884boximpl(m1134invokeBjo55l4(density2));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1134invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState8.getAnchoredDraggableState$material_release().requireOffset()));
                                }
                            }), modalBottomSheetState4.getAnchoredDraggableState$material_release(), orientation, z6 && modalBottomSheetState4.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                            final ModalBottomSheetState modalBottomSheetState9 = modalBottomSheetState4;
                            final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback2 = anchorChangedCallback;
                            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                    m1135invokeozmzZPI(intSize.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                public final void m1135invokeozmzZPI(long j16) {
                                    float f5 = fM3742getMaxHeightimpl;
                                    ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState9;
                                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f5));
                                    float f6 = f5 / 2.0f;
                                    if (!modalBottomSheetState10.getIsSkipHalfExpanded() && IntSize.m3934getHeightimpl(j16) > f6) {
                                        mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f6));
                                    }
                                    if (IntSize.m3934getHeightimpl(j16) != 0) {
                                        mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f5 - IntSize.m3934getHeightimpl(j16))));
                                    }
                                    modalBottomSheetState9.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(mapCreateMapBuilder), anchorChangedCallback2);
                                }
                            });
                            if (z6) {
                                final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState4;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.5
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
                                            SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.1

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ ModalBottomSheetState $sheetState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C00901(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00901> continuation) {
                                                        super(2, continuation);
                                                        this.$sheetState = modalBottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C00901(this.$sheetState, continuation);
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
                                                        return ((C00901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                                    if (modalBottomSheetState11.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00901(modalBottomSheetState11, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                            if (modalBottomSheetState10.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                                final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState10;
                                                final CoroutineScope coroutineScope5 = coroutineScope3;
                                                SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.2

                                                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
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
                                                        if (modalBottomSheetState12.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState12, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            } else if (modalBottomSheetState10.getHasHalfExpandedState$material_release()) {
                                                final ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState10;
                                                final CoroutineScope coroutineScope6 = coroutineScope3;
                                                SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.3

                                                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
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
                                                        if (modalBottomSheetState13.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState13, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            }
                                        }
                                    }
                                }, 1, null);
                            }
                            Modifier modifierThen2 = modifierOnSizeChanged.then(modifierSemantics$default);
                            Shape shape6 = shape5;
                            long j16 = j12;
                            long j17 = j13;
                            float f5 = f4;
                            final Function3<ColumnScope, Composer, Integer, Unit> function4 = sheetContent;
                            final int i20 = i16;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1552994302, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.6
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
                                public final void invoke(@Nullable Composer composer4, int i21) {
                                    if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1552994302, i21, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function5 = function4;
                                    int i22 = (i20 << 9) & 7168;
                                    composer4.startReplaceableGroup(-483455358);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    int i23 = i22 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i23 & 112) | (i23 & 14));
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                                    int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer4);
                                    Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                                    if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                                    }
                                    androidx.compose.animation.OooOO0.OooO00o((i24 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                                    function5.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i21 = i16;
                            SurfaceKt.m1201SurfaceFjzlyU(modifierThen2, shape6, j16, j17, null, f5, composableLambda, composer3, ((i21 >> 9) & 112) | 1572864 | ((i21 >> 12) & 896) | ((i21 >> 12) & 7168) | (i21 & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, function3), composer2, ((i16 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    shape4 = shape3;
                    f3 = f2;
                    j9 = j6;
                    j10 = j7;
                    j11 = j8;
                    modalBottomSheetState3 = modalBottomSheetState5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$3
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
                        ModalBottomSheetKt.m1131ModalBottomSheetLayoutGs3lGvM(sheetContent, modifier3, modalBottomSheetState3, z5, shape4, f3, j9, j10, j11, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i9 = 805306368;
            i3 |= i9;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i10, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
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
                            modalBottomSheetState2.setDensity$material_release(density2);
                        }
                    }, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation2 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback2 = (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2;
                final boolean z7 = z4;
                final ModalBottomSheetState modalBottomSheetState6 = modalBottomSheetState2;
                final Shape shape6 = shape3;
                final long j15 = j6;
                final int i17 = i10;
                final long j16 = j7;
                ModalBottomSheetState modalBottomSheetState7 = modalBottomSheetState2;
                final float f5 = f2;
                final long j17 = j8;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function4 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                        Modifier modifierNestedScroll$default;
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
                            ComposerKt.traceEventStart(-1731958854, i18, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                        }
                        final float fM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        Modifier modifierSemantics$default = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i110 = i17;
                        long j18 = j17;
                        final ModalBottomSheetState modalBottomSheetState8 = modalBottomSheetState6;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i110 >> 27) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
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
                                if (modalBottomSheetState8.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState8, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState8.getAnchoredDraggableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1132Scrim3JVO9M(j18, function0, targetValue != modalBottomSheetValue, composer3, (i110 >> 24) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m532widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion2.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        composer3.startReplaceableGroup(1241536180);
                        if (z7) {
                            Object anchoredDraggableState$material_release = modalBottomSheetState6.getAnchoredDraggableState$material_release();
                            Orientation orientation3 = orientation2;
                            ModalBottomSheetState modalBottomSheetState9 = modalBottomSheetState6;
                            composer3.startReplaceableGroup(511388516);
                            boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release) | composer3.changed(orientation3);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState9.getAnchoredDraggableState$material_release(), orientation3);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue3, null, 2, null);
                        } else {
                            modifierNestedScroll$default = modifierSemantics$default;
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierThen = modifierFillMaxWidth$default.then(modifierNestedScroll$default);
                        final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState6;
                        Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierThen, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m3884boximpl(m1134invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1134invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState10.getAnchoredDraggableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState6.getAnchoredDraggableState$material_release(), orientation2, z7 && modalBottomSheetState6.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        final ModalBottomSheetState modalBottomSheetState11 = modalBottomSheetState6;
                        final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback3 = anchorChangedCallback2;
                        Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m1135invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m1135invokeozmzZPI(long j19) {
                                float f6 = fM3742getMaxHeightimpl;
                                ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState11;
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f6));
                                float f7 = f6 / 2.0f;
                                if (!modalBottomSheetState12.getIsSkipHalfExpanded() && IntSize.m3934getHeightimpl(j19) > f7) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f7));
                                }
                                if (IntSize.m3934getHeightimpl(j19) != 0) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f6 - IntSize.m3934getHeightimpl(j19))));
                                }
                                modalBottomSheetState11.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(mapCreateMapBuilder), anchorChangedCallback3);
                            }
                        });
                        if (z7) {
                            final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState6;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.5
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
                                        SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.1

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00901(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00901> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00901(this.$sheetState, continuation);
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
                                                    return ((C00901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                                if (modalBottomSheetState13.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00901(modalBottomSheetState13, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                        if (modalBottomSheetState12.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                            final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState12;
                                            final CoroutineScope coroutineScope5 = coroutineScope3;
                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.2

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState14.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState14, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else if (modalBottomSheetState12.getHasHalfExpandedState$material_release()) {
                                            final ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState12;
                                            final CoroutineScope coroutineScope6 = coroutineScope3;
                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.3

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState15.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState15, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            }, 1, null);
                        }
                        Modifier modifierThen2 = modifierOnSizeChanged.then(modifierSemantics$default);
                        Shape shape7 = shape6;
                        long j19 = j15;
                        long j110 = j16;
                        float f6 = f5;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = sheetContent;
                        final int i20 = i17;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1552994302, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.6
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
                            public final void invoke(@Nullable Composer composer4, int i21) {
                                if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1552994302, i21, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i22 = (i20 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i23 & 112) | (i23 & 14));
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                                int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer4);
                                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i24 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                                function6.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i21 = i17;
                        SurfaceKt.m1201SurfaceFjzlyU(modifierThen2, shape7, j19, j110, null, f6, composableLambda, composer3, ((i21 >> 9) & 112) | 1572864 | ((i21 >> 12) & 896) | ((i21 >> 12) & 7168) | (i21 & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, function4), composer2, ((i17 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                shape4 = shape3;
                f3 = f2;
                j9 = j6;
                j10 = j7;
                j11 = j8;
                modalBottomSheetState3 = modalBottomSheetState7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i10, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    final Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
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
                            modalBottomSheetState2.setDensity$material_release(density3);
                        }
                    }, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation3 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback3 = (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2;
                final boolean z8 = z4;
                final ModalBottomSheetState modalBottomSheetState8 = modalBottomSheetState2;
                final Shape shape7 = shape3;
                final long j18 = j6;
                final int i18 = i10;
                final long j19 = j7;
                ModalBottomSheetState modalBottomSheetState9 = modalBottomSheetState2;
                final float f6 = f2;
                final long j110 = j8;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function5 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                        Modifier modifierNestedScroll$default;
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
                            ComposerKt.traceEventStart(-1731958854, i19, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                        }
                        final float fM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        Modifier modifierSemantics$default = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i111 = i18;
                        long j111 = j110;
                        final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState8;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i111 >> 27) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
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
                                if (modalBottomSheetState10.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState10, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState10.getAnchoredDraggableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1132Scrim3JVO9M(j111, function0, targetValue != modalBottomSheetValue, composer3, (i111 >> 24) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m532widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion2.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        composer3.startReplaceableGroup(1241536180);
                        if (z8) {
                            Object anchoredDraggableState$material_release = modalBottomSheetState8.getAnchoredDraggableState$material_release();
                            Orientation orientation4 = orientation3;
                            ModalBottomSheetState modalBottomSheetState11 = modalBottomSheetState8;
                            composer3.startReplaceableGroup(511388516);
                            boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release) | composer3.changed(orientation4);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState11.getAnchoredDraggableState$material_release(), orientation4);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue3, null, 2, null);
                        } else {
                            modifierNestedScroll$default = modifierSemantics$default;
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierThen = modifierFillMaxWidth$default.then(modifierNestedScroll$default);
                        final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState8;
                        Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierThen, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                return IntOffset.m3884boximpl(m1134invokeBjo55l4(density4));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1134invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState12.getAnchoredDraggableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState8.getAnchoredDraggableState$material_release(), orientation3, z8 && modalBottomSheetState8.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        final ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState8;
                        final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback4 = anchorChangedCallback3;
                        Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m1135invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m1135invokeozmzZPI(long j112) {
                                float f7 = fM3742getMaxHeightimpl;
                                ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState13;
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f7));
                                float f8 = f7 / 2.0f;
                                if (!modalBottomSheetState14.getIsSkipHalfExpanded() && IntSize.m3934getHeightimpl(j112) > f8) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f8));
                                }
                                if (IntSize.m3934getHeightimpl(j112) != 0) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f7 - IntSize.m3934getHeightimpl(j112))));
                                }
                                modalBottomSheetState13.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(mapCreateMapBuilder), anchorChangedCallback4);
                            }
                        });
                        if (z8) {
                            final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState8;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.5
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
                                        SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.1

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00901(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00901> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00901(this.$sheetState, continuation);
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
                                                    return ((C00901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                                if (modalBottomSheetState15.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00901(modalBottomSheetState15, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                        if (modalBottomSheetState14.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                            final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState14;
                                            final CoroutineScope coroutineScope5 = coroutineScope3;
                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.2

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState16.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState16, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else if (modalBottomSheetState14.getHasHalfExpandedState$material_release()) {
                                            final ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState14;
                                            final CoroutineScope coroutineScope6 = coroutineScope3;
                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.3

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState17.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState17, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            }, 1, null);
                        }
                        Modifier modifierThen2 = modifierOnSizeChanged.then(modifierSemantics$default);
                        Shape shape8 = shape7;
                        long j112 = j18;
                        long j113 = j19;
                        float f7 = f6;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function6 = sheetContent;
                        final int i20 = i18;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1552994302, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.6
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
                            public final void invoke(@Nullable Composer composer4, int i21) {
                                if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1552994302, i21, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function7 = function6;
                                int i22 = (i20 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i23 & 112) | (i23 & 14));
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                                int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer4);
                                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i24 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                                function7.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i21 = i18;
                        SurfaceKt.m1201SurfaceFjzlyU(modifierThen2, shape8, j112, j113, null, f7, composableLambda, composer3, ((i21 >> 9) & 112) | 1572864 | ((i21 >> 12) & 896) | ((i21 >> 12) & 7168) | (i21 & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, function5), composer2, ((i18 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                shape4 = shape3;
                f3 = f2;
                j9 = j6;
                j10 = j7;
                j11 = j8;
                modalBottomSheetState3 = modalBottomSheetState9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$3
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
                    ModalBottomSheetKt.m1131ModalBottomSheetLayoutGs3lGvM(sheetContent, modifier4, modalBottomSheetState3, z5, shape4, f3, j9, j10, j11, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
        }
        if ((57344 & i) == 0) {
            shape2 = shape;
            if ((i2 & 16) == 0) {
                i13 = 8192;
            } else {
                i13 = 8192;
            }
            i3 |= i13;
        } else {
            shape2 = shape;
        }
        i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                j4 = j;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i3 |= i15;
            } else {
                j4 = j;
            }
            i3 |= i15;
        } else {
            j4 = j;
        }
        if ((i & 29360128) != 0) {
            if ((i2 & 128) == 0) {
                i12 = Configuration.BLOCK_SIZE;
            } else {
                i12 = Configuration.BLOCK_SIZE;
            }
            i3 |= i12;
        }
        if ((234881024 & i) == 0) {
            j5 = j3;
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                i11 = 33554432;
            } else {
                i11 = 33554432;
            }
            i3 |= i11;
        } else {
            j5 = j3;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i9 = 536870912;
                } else {
                    i9 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i10, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    final Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
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
                            modalBottomSheetState2.setDensity$material_release(density4);
                        }
                    }, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation4 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback4 = (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2;
                final boolean z9 = z4;
                final ModalBottomSheetState modalBottomSheetState10 = modalBottomSheetState2;
                final Shape shape8 = shape3;
                final long j111 = j6;
                final int i19 = i10;
                final long j112 = j7;
                ModalBottomSheetState modalBottomSheetState11 = modalBottomSheetState2;
                final float f7 = f2;
                final long j113 = j8;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function6 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                        Modifier modifierNestedScroll$default;
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
                            ComposerKt.traceEventStart(-1731958854, i110, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                        }
                        final float fM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        Modifier modifierSemantics$default = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i112 = i19;
                        long j114 = j113;
                        final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState10;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i112 >> 27) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
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
                                if (modalBottomSheetState12.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState12, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState12.getAnchoredDraggableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1132Scrim3JVO9M(j114, function0, targetValue != modalBottomSheetValue, composer3, (i112 >> 24) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m532widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion2.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        composer3.startReplaceableGroup(1241536180);
                        if (z9) {
                            Object anchoredDraggableState$material_release = modalBottomSheetState10.getAnchoredDraggableState$material_release();
                            Orientation orientation5 = orientation4;
                            ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState10;
                            composer3.startReplaceableGroup(511388516);
                            boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release) | composer3.changed(orientation5);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState13.getAnchoredDraggableState$material_release(), orientation5);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue3, null, 2, null);
                        } else {
                            modifierNestedScroll$default = modifierSemantics$default;
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierThen = modifierFillMaxWidth$default.then(modifierNestedScroll$default);
                        final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState10;
                        Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierThen, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density5) {
                                return IntOffset.m3884boximpl(m1134invokeBjo55l4(density5));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1134invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState14.getAnchoredDraggableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState10.getAnchoredDraggableState$material_release(), orientation4, z9 && modalBottomSheetState10.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        final ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState10;
                        final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback5 = anchorChangedCallback4;
                        Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m1135invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m1135invokeozmzZPI(long j115) {
                                float f8 = fM3742getMaxHeightimpl;
                                ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState15;
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f8));
                                float f9 = f8 / 2.0f;
                                if (!modalBottomSheetState16.getIsSkipHalfExpanded() && IntSize.m3934getHeightimpl(j115) > f9) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f9));
                                }
                                if (IntSize.m3934getHeightimpl(j115) != 0) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f8 - IntSize.m3934getHeightimpl(j115))));
                                }
                                modalBottomSheetState15.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(mapCreateMapBuilder), anchorChangedCallback5);
                            }
                        });
                        if (z9) {
                            final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState10;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.5
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
                                        SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.1

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00901(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00901> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00901(this.$sheetState, continuation);
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
                                                    return ((C00901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                                if (modalBottomSheetState17.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00901(modalBottomSheetState17, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                        if (modalBottomSheetState16.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                            final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState16;
                                            final CoroutineScope coroutineScope5 = coroutineScope3;
                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.2

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState18.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState18, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else if (modalBottomSheetState16.getHasHalfExpandedState$material_release()) {
                                            final ModalBottomSheetState modalBottomSheetState19 = modalBottomSheetState16;
                                            final CoroutineScope coroutineScope6 = coroutineScope3;
                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.3

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState19.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState19, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            }, 1, null);
                        }
                        Modifier modifierThen2 = modifierOnSizeChanged.then(modifierSemantics$default);
                        Shape shape9 = shape8;
                        long j115 = j111;
                        long j116 = j112;
                        float f8 = f7;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7 = sheetContent;
                        final int i20 = i19;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1552994302, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.6
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
                            public final void invoke(@Nullable Composer composer4, int i21) {
                                if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1552994302, i21, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function8 = function7;
                                int i22 = (i20 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i23 & 112) | (i23 & 14));
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                                int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer4);
                                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i24 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                                function8.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i21 = i19;
                        SurfaceKt.m1201SurfaceFjzlyU(modifierThen2, shape9, j115, j116, null, f8, composableLambda, composer3, ((i21 >> 9) & 112) | 1572864 | ((i21 >> 12) & 896) | ((i21 >> 12) & 7168) | (i21 & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, function6), composer2, ((i19 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                shape4 = shape3;
                f3 = f2;
                j9 = j6;
                j10 = j7;
                j11 = j8;
                modalBottomSheetState3 = modalBottomSheetState11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                } else {
                    if (i14 != 0) {
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
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i3 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if (i7 != 0) {
                        fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                    } else {
                        fM1130getElevationD9Ej5fM = f;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i3 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    z4 = z3;
                    shape3 = large;
                    f2 = fM1130getElevationD9Ej5fM;
                    j6 = jM1043getSurface0d7_KjU;
                    j7 = jM1057contentColorForek8zF_U;
                    j8 = scrimColor;
                    i10 = i3;
                    modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-92970288, i10, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                }
                composerStartRestartGroup.startReplaceableGroup(502769027);
                if (modalBottomSheetState2.getDensity() == null) {
                    final Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
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
                            modalBottomSheetState2.setDensity$material_release(density5);
                        }
                    }, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final Orientation orientation5 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback5 = (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2;
                final boolean z10 = z4;
                final ModalBottomSheetState modalBottomSheetState12 = modalBottomSheetState2;
                final Shape shape9 = shape3;
                final long j114 = j6;
                final int i110 = i10;
                final long j115 = j7;
                ModalBottomSheetState modalBottomSheetState13 = modalBottomSheetState2;
                final float f8 = f2;
                final long j116 = j8;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function7 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                        Modifier modifierNestedScroll$default;
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
                            ComposerKt.traceEventStart(-1731958854, i111, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                        }
                        final float fM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        Modifier modifierSemantics$default = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i113 = i110;
                        long j117 = j116;
                        final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState12;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function2.invoke(composer3, Integer.valueOf((i113 >> 27) & 14));
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1

                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
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
                                if (modalBottomSheetState14.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState14, null), 3, null);
                                }
                            }
                        };
                        ModalBottomSheetValue targetValue = modalBottomSheetState14.getAnchoredDraggableState$material_release().getTargetValue();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        ModalBottomSheetKt.m1132Scrim3JVO9M(j117, function0, targetValue != modalBottomSheetValue, composer3, (i113 >> 24) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m532widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion2.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        composer3.startReplaceableGroup(1241536180);
                        if (z10) {
                            Object anchoredDraggableState$material_release = modalBottomSheetState12.getAnchoredDraggableState$material_release();
                            Orientation orientation6 = orientation5;
                            ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState12;
                            composer3.startReplaceableGroup(511388516);
                            boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release) | composer3.changed(orientation6);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState15.getAnchoredDraggableState$material_release(), orientation6);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue3, null, 2, null);
                        } else {
                            modifierNestedScroll$default = modifierSemantics$default;
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierThen = modifierFillMaxWidth$default.then(modifierNestedScroll$default);
                        final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState12;
                        Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierThen, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density6) {
                                return IntOffset.m3884boximpl(m1134invokeBjo55l4(density6));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1134invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState16.getAnchoredDraggableState$material_release().requireOffset()));
                            }
                        }), modalBottomSheetState12.getAnchoredDraggableState$material_release(), orientation5, z10 && modalBottomSheetState12.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                        final ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState12;
                        final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback6 = anchorChangedCallback5;
                        Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m1135invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m1135invokeozmzZPI(long j118) {
                                float f9 = fM3742getMaxHeightimpl;
                                ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState17;
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f9));
                                float f10 = f9 / 2.0f;
                                if (!modalBottomSheetState18.getIsSkipHalfExpanded() && IntSize.m3934getHeightimpl(j118) > f10) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f10));
                                }
                                if (IntSize.m3934getHeightimpl(j118) != 0) {
                                    mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f9 - IntSize.m3934getHeightimpl(j118))));
                                }
                                modalBottomSheetState17.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(mapCreateMapBuilder), anchorChangedCallback6);
                            }
                        });
                        if (z10) {
                            final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState12;
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.5
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
                                        SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.1

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00901(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00901> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00901(this.$sheetState, continuation);
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
                                                    return ((C00901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                                if (modalBottomSheetState19.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00901(modalBottomSheetState19, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                        if (modalBottomSheetState18.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                            final ModalBottomSheetState modalBottomSheetState110 = modalBottomSheetState18;
                                            final CoroutineScope coroutineScope5 = coroutineScope3;
                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.2

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState110.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState110, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else if (modalBottomSheetState18.getHasHalfExpandedState$material_release()) {
                                            final ModalBottomSheetState modalBottomSheetState111 = modalBottomSheetState18;
                                            final CoroutineScope coroutineScope6 = coroutineScope3;
                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.3

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
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
                                                    if (modalBottomSheetState111.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState111, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            }, 1, null);
                        }
                        Modifier modifierThen2 = modifierOnSizeChanged.then(modifierSemantics$default);
                        Shape shape10 = shape9;
                        long j118 = j114;
                        long j119 = j115;
                        float f9 = f8;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function8 = sheetContent;
                        final int i20 = i110;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1552994302, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.6
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
                            public final void invoke(@Nullable Composer composer4, int i21) {
                                if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1552994302, i21, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function9 = function8;
                                int i22 = (i20 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i23 & 112) | (i23 & 14));
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                                int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer4);
                                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i24 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                                function9.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i21 = i110;
                        SurfaceKt.m1201SurfaceFjzlyU(modifierThen2, shape10, j118, j119, null, f9, composableLambda, composer3, ((i21 >> 9) & 112) | 1572864 | ((i21 >> 12) & 896) | ((i21 >> 12) & 7168) | (i21 & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, function7), composer2, ((i110 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                shape4 = shape3;
                f3 = f2;
                j9 = j6;
                j10 = j7;
                j11 = j8;
                modalBottomSheetState3 = modalBottomSheetState13;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$3
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
                    ModalBottomSheetKt.m1131ModalBottomSheetLayoutGs3lGvM(sheetContent, modifier5, modalBottomSheetState3, z5, shape4, f3, j9, j10, j11, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i9 = 805306368;
        i3 |= i9;
        if (i4 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i14 != 0) {
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
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -57345;
                } else {
                    large = shape2;
                }
                if (i7 != 0) {
                    fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                } else {
                    fM1130getElevationD9Ej5fM = f;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i3 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                z4 = z3;
                shape3 = large;
                f2 = fM1130getElevationD9Ej5fM;
                j6 = jM1043getSurface0d7_KjU;
                j7 = jM1057contentColorForek8zF_U;
                j8 = scrimColor;
                i10 = i3;
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            } else {
                if (i14 != 0) {
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
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -57345;
                } else {
                    large = shape2;
                }
                if (i7 != 0) {
                    fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                } else {
                    fM1130getElevationD9Ej5fM = f;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i3 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                z4 = z3;
                shape3 = large;
                f2 = fM1130getElevationD9Ej5fM;
                j6 = jM1043getSurface0d7_KjU;
                j7 = jM1057contentColorForek8zF_U;
                j8 = scrimColor;
                i10 = i3;
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92970288, i10, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
            }
            composerStartRestartGroup.startReplaceableGroup(502769027);
            if (modalBottomSheetState2.getDensity() == null) {
                final Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
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
                        modalBottomSheetState2.setDensity$material_release(density6);
                    }
                }, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final Orientation orientation6 = Orientation.Vertical;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback6 = (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2;
            final boolean z11 = z4;
            final ModalBottomSheetState modalBottomSheetState14 = modalBottomSheetState2;
            final Shape shape10 = shape3;
            final long j117 = j6;
            final int i111 = i10;
            final long j118 = j7;
            ModalBottomSheetState modalBottomSheetState15 = modalBottomSheetState2;
            final float f9 = f2;
            final long j119 = j8;
            Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function8 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i112) {
                    int i113;
                    Modifier modifierNestedScroll$default;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i112 & 14) == 0) {
                        i113 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i112;
                    } else {
                        i113 = i112;
                    }
                    if ((i113 & 91) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1731958854, i112, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                    }
                    final float fM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                    Modifier modifierSemantics$default = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i114 = i111;
                    long j1110 = j119;
                    final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState14;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    composer3.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composer3, Integer.valueOf((i114 >> 27) & 14));
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
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
                            if (modalBottomSheetState16.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState16, null), 3, null);
                            }
                        }
                    };
                    ModalBottomSheetValue targetValue = modalBottomSheetState16.getAnchoredDraggableState$material_release().getTargetValue();
                    ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                    ModalBottomSheetKt.m1132Scrim3JVO9M(j1110, function0, targetValue != modalBottomSheetValue, composer3, (i114 >> 24) & 14);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m532widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion2.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                    composer3.startReplaceableGroup(1241536180);
                    if (z11) {
                        Object anchoredDraggableState$material_release = modalBottomSheetState14.getAnchoredDraggableState$material_release();
                        Orientation orientation7 = orientation6;
                        ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState14;
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release) | composer3.changed(orientation7);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState17.getAnchoredDraggableState$material_release(), orientation7);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue3, null, 2, null);
                    } else {
                        modifierNestedScroll$default = modifierSemantics$default;
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierThen = modifierFillMaxWidth$default.then(modifierNestedScroll$default);
                    final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState14;
                    Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierThen, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density7) {
                            return IntOffset.m3884boximpl(m1134invokeBjo55l4(density7));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m1134invokeBjo55l4(@NotNull Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState18.getAnchoredDraggableState$material_release().requireOffset()));
                        }
                    }), modalBottomSheetState14.getAnchoredDraggableState$material_release(), orientation6, z11 && modalBottomSheetState14.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                    final ModalBottomSheetState modalBottomSheetState19 = modalBottomSheetState14;
                    final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback7 = anchorChangedCallback6;
                    Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m1135invokeozmzZPI(intSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m1135invokeozmzZPI(long j1111) {
                            float f10 = fM3742getMaxHeightimpl;
                            ModalBottomSheetState modalBottomSheetState110 = modalBottomSheetState19;
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f10));
                            float f11 = f10 / 2.0f;
                            if (!modalBottomSheetState110.getIsSkipHalfExpanded() && IntSize.m3934getHeightimpl(j1111) > f11) {
                                mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f11));
                            }
                            if (IntSize.m3934getHeightimpl(j1111) != 0) {
                                mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f10 - IntSize.m3934getHeightimpl(j1111))));
                            }
                            modalBottomSheetState19.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(mapCreateMapBuilder), anchorChangedCallback7);
                        }
                    });
                    if (z11) {
                        final ModalBottomSheetState modalBottomSheetState110 = modalBottomSheetState14;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.5
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
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.1

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00901(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00901> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00901(this.$sheetState, continuation);
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
                                                return ((C00901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                            if (modalBottomSheetState111.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00901(modalBottomSheetState111, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (modalBottomSheetState110.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState112 = modalBottomSheetState110;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.2

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
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
                                                if (modalBottomSheetState112.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState112, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else if (modalBottomSheetState110.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState113 = modalBottomSheetState110;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.3

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
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
                                                if (modalBottomSheetState113.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState113, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }
                        }, 1, null);
                    }
                    Modifier modifierThen2 = modifierOnSizeChanged.then(modifierSemantics$default);
                    Shape shape11 = shape10;
                    long j1111 = j117;
                    long j1112 = j118;
                    float f10 = f9;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function9 = sheetContent;
                    final int i20 = i111;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1552994302, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.6
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
                        public final void invoke(@Nullable Composer composer4, int i21) {
                            if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1552994302, i21, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                            }
                            Function3<ColumnScope, Composer, Integer, Unit> function10 = function9;
                            int i22 = (i20 << 9) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            int i23 = i22 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i23 & 112) | (i23 & 14));
                            composer4.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                            int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer4);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i24 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                            function10.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i21 = i111;
                    SurfaceKt.m1201SurfaceFjzlyU(modifierThen2, shape11, j1111, j1112, null, f10, composableLambda, composer3, ((i21 >> 9) & 112) | 1572864 | ((i21 >> 12) & 896) | ((i21 >> 12) & 7168) | (i21 & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, function8), composer2, ((i111 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z4;
            shape4 = shape3;
            f3 = f2;
            j9 = j6;
            j10 = j7;
            j11 = j8;
            modalBottomSheetState3 = modalBottomSheetState15;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i14 != 0) {
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
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -57345;
                } else {
                    large = shape2;
                }
                if (i7 != 0) {
                    fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                } else {
                    fM1130getElevationD9Ej5fM = f;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i3 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                z4 = z3;
                shape3 = large;
                f2 = fM1130getElevationD9Ej5fM;
                j6 = jM1043getSurface0d7_KjU;
                j7 = jM1057contentColorForek8zF_U;
                j8 = scrimColor;
                i10 = i3;
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            } else {
                if (i14 != 0) {
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
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i3 &= -57345;
                } else {
                    large = shape2;
                }
                if (i7 != 0) {
                    fM1130getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1130getElevationD9Ej5fM();
                } else {
                    fM1130getElevationD9Ej5fM = f;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i3 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                z4 = z3;
                shape3 = large;
                f2 = fM1130getElevationD9Ej5fM;
                j6 = jM1043getSurface0d7_KjU;
                j7 = jM1057contentColorForek8zF_U;
                j8 = scrimColor;
                i10 = i3;
                modalBottomSheetState2 = modalBottomSheetStateRememberModalBottomSheetState;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92970288, i10, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
            }
            composerStartRestartGroup.startReplaceableGroup(502769027);
            if (modalBottomSheetState2.getDensity() == null) {
                final Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
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
                        modalBottomSheetState2.setDensity$material_release(density7);
                    }
                }, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final Orientation orientation7 = Orientation.Vertical;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(modalBottomSheetState2) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState2, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback7 = (AnchoredDraggableState.AnchorChangedCallback) objRememberedValue2;
            final boolean z12 = z4;
            final ModalBottomSheetState modalBottomSheetState16 = modalBottomSheetState2;
            final Shape shape11 = shape3;
            final long j1110 = j6;
            final int i112 = i10;
            final long j1111 = j7;
            ModalBottomSheetState modalBottomSheetState17 = modalBottomSheetState2;
            final float f10 = f2;
            final long j1112 = j8;
            Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function9 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i113) {
                    int i114;
                    Modifier modifierNestedScroll$default;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i113 & 14) == 0) {
                        i114 = (composer3.changed(BoxWithConstraints) ? 4 : 2) | i113;
                    } else {
                        i114 = i113;
                    }
                    if ((i114 & 91) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1731958854, i113, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
                    }
                    final float fM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                    Modifier modifierSemantics$default = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSemantics$default, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i115 = i112;
                    long j1113 = j1112;
                    final ModalBottomSheetState modalBottomSheetState18 = modalBottomSheetState16;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    composer3.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composer3, Integer.valueOf((i115 >> 27) & 14));
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1

                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
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
                            if (modalBottomSheetState18.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState18, null), 3, null);
                            }
                        }
                    };
                    ModalBottomSheetValue targetValue = modalBottomSheetState18.getAnchoredDraggableState$material_release().getTargetValue();
                    ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                    ModalBottomSheetKt.m1132Scrim3JVO9M(j1113, function0, targetValue != modalBottomSheetValue, composer3, (i115 >> 24) & 14);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m532widthInVpY3zN4$default(BoxWithConstraints.align(modifierSemantics$default, companion2.getTopCenter()), 0.0f, ModalBottomSheetKt.MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                    composer3.startReplaceableGroup(1241536180);
                    if (z12) {
                        Object anchoredDraggableState$material_release = modalBottomSheetState16.getAnchoredDraggableState$material_release();
                        Orientation orientation8 = orientation7;
                        ModalBottomSheetState modalBottomSheetState19 = modalBottomSheetState16;
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release) | composer3.changed(orientation8);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState19.getAnchoredDraggableState$material_release(), orientation8);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierSemantics$default, (NestedScrollConnection) objRememberedValue3, null, 2, null);
                    } else {
                        modifierNestedScroll$default = modifierSemantics$default;
                    }
                    composer3.endReplaceableGroup();
                    Modifier modifierThen = modifierFillMaxWidth$default.then(modifierNestedScroll$default);
                    final ModalBottomSheetState modalBottomSheetState110 = modalBottomSheetState16;
                    Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifierThen, new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density8) {
                            return IntOffset.m3884boximpl(m1134invokeBjo55l4(density8));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m1134invokeBjo55l4(@NotNull Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(modalBottomSheetState110.getAnchoredDraggableState$material_release().requireOffset()));
                        }
                    }), modalBottomSheetState16.getAnchoredDraggableState$material_release(), orientation7, z12 && modalBottomSheetState16.getAnchoredDraggableState$material_release().getCurrentValue() != modalBottomSheetValue, false, null, 24, null);
                    final ModalBottomSheetState modalBottomSheetState111 = modalBottomSheetState16;
                    final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback8 = anchorChangedCallback7;
                    Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m1135invokeozmzZPI(intSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m1135invokeozmzZPI(long j1114) {
                            float f11 = fM3742getMaxHeightimpl;
                            ModalBottomSheetState modalBottomSheetState112 = modalBottomSheetState111;
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f11));
                            float f12 = f11 / 2.0f;
                            if (!modalBottomSheetState112.getIsSkipHalfExpanded() && IntSize.m3934getHeightimpl(j1114) > f12) {
                                mapCreateMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f12));
                            }
                            if (IntSize.m3934getHeightimpl(j1114) != 0) {
                                mapCreateMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f11 - IntSize.m3934getHeightimpl(j1114))));
                            }
                            modalBottomSheetState111.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(mapCreateMapBuilder), anchorChangedCallback8);
                        }
                    });
                    if (z12) {
                        final ModalBottomSheetState modalBottomSheetState112 = modalBottomSheetState16;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierSemantics$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.5
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
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.1

                                        /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00901(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00901> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00901(this.$sheetState, continuation);
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
                                                return ((C00901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                            if (modalBottomSheetState113.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00901(modalBottomSheetState113, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (modalBottomSheetState112.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState114 = modalBottomSheetState112;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.2

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
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
                                                if (modalBottomSheetState114.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(modalBottomSheetState114, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    } else if (modalBottomSheetState112.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState115 = modalBottomSheetState112;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.2.5.3

                                            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
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
                                                if (modalBottomSheetState115.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(modalBottomSheetState115, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }
                        }, 1, null);
                    }
                    Modifier modifierThen2 = modifierOnSizeChanged.then(modifierSemantics$default);
                    Shape shape12 = shape11;
                    long j1114 = j1110;
                    long j1115 = j1111;
                    float f11 = f10;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function10 = sheetContent;
                    final int i20 = i112;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1552994302, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.6
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
                        public final void invoke(@Nullable Composer composer4, int i21) {
                            if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1552994302, i21, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                            }
                            Function3<ColumnScope, Composer, Integer, Unit> function11 = function10;
                            int i22 = (i20 << 9) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            int i23 = i22 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, (i23 & 112) | (i23 & 14));
                            composer4.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
                            int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer4);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i24 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                            function11.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i21 = i112;
                    SurfaceKt.m1201SurfaceFjzlyU(modifierThen2, shape12, j1114, j1115, null, f11, composableLambda, composer3, ((i21 >> 9) & 112) | 1572864 | ((i21 >> 12) & 896) | ((i21 >> 12) & 7168) | (i21 & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, function9), composer2, ((i112 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z4;
            shape4 = shape3;
            f3 = f2;
            j9 = j6;
            j10 = j7;
            j11 = j8;
            modalBottomSheetState3 = modalBottomSheetState17;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier6 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$3
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

            public final void invoke(@Nullable Composer composer3, int i113) {
                ModalBottomSheetKt.m1131ModalBottomSheetLayoutGs3lGvM(sheetContent, modifier6, modalBottomSheetState3, z5, shape4, f3, j9, j10, j11, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull Density density, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        ModalBottomSheetState modalBottomSheetState = new ModalBottomSheetState(initialValue, animationSpec, z, confirmValueChange);
        modalBottomSheetState.setDensity$material_release(density);
        return modalBottomSheetState;
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, density, animationSpec, function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1132Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
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
                ComposerKt.traceEventStart(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:694)");
            }
            if (j != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                final String strM1199getString4foXLRw = Strings_androidKt.m1199getString4foXLRw(Strings.INSTANCE.m1193getCloseSheetUdPEhr4(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1010559499);
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
                    boolean zChanged2 = composerStartRestartGroup.changed(strM1199getString4foXLRw) | composerStartRestartGroup.changed(function0);
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
                                SemanticsPropertiesKt.setContentDescription(semantics, strM1199getString4foXLRw);
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
                Color colorM1671boximpl = Color.m1671boximpl(j);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged3 = composerStartRestartGroup.changed(colorM1671boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
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
                            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0OO(Canvas, j, 0L, 0L, ModalBottomSheetKt.Scrim_3J_VO9M$lambda$2(stateAnimateFloatAsState), null, null, 0, 118, null);
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
                ModalBottomSheetKt.m1132Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull final ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-126412120);
        final AnimationSpec<Float> animationSpec2 = (i2 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec;
        final Function1<? super ModalBottomSheetValue, Boolean> function2 = (i2 & 4) != 0 ? new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.rememberModalBottomSheetState.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        } : function1;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:436)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startMovableGroup(170051607, initialValue);
        final boolean z3 = z2;
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m1333rememberSaveable(new Object[]{initialValue, animationSpec2, Boolean.valueOf(z2), function2, density}, (Saver) ModalBottomSheetState.INSTANCE.Saver(animationSpec2, function2, z2, density), (String) null, (Function0) new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt.rememberModalBottomSheetState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModalBottomSheetState invoke() {
                return ModalBottomSheetKt.ModalBottomSheetState(initialValue, density, animationSpec2, function2, z3);
            }
        }, composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            ModalBottomSheetState(\n                initialValue = initialValue,\n                density =,\n                animationSpec = animationSpec,\n                isSkipHalfExpanded = isSkipHalfExpanded,\n                confirmStateChange = confirmValueChange\n            )\n            ", imports = {}))
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
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetState.3
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
            ComposerKt.traceEventStart(-409288536, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:490)");
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
            ComposerKt.traceEventStart(-1928569212, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:519)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, false, composer, (i & 14) | 3136 | (i & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetStateRememberModalBottomSheetState;
    }
}
