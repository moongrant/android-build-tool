package androidx.compose.material;

import androidx.compose.animation.OooOOO;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.statistical.net.NetStateExceptionType;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010'\u001ak\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00103\u001a}\u00104\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u00105\u001a\u00020/2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u00106\u001aK\u00107\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u00108\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u00105\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00109\u001aS\u0010:\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0003¢\u0006\u0002\u0010=\u001a1\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010D\u001a \u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002\u001a0\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a<\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a.\u0010P\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002\u001a\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010!\u001a\u00020\"H\u0002\u001aI\u0010T\u001a\u00020\u0012*\u00020U2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u00032\u0006\u00105\u001a\u00020/2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010W\u001a\u00020\u0003H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001a;\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\b\u0018\u00010[*\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a\u0098\u0001\u0010d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010h\u001a\u00020 2\u0006\u0010R\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u00140f2\u001e\u0010j\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120k0fH\u0002\u001a\\\u0010l\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"H\u0002\u001aj\u0010m\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020@2\u0006\u00105\u001a\u00020/2\u0006\u0010R\u001a\u00020\b2\u0006\u0010h\u001a\u00020 2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0018\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00140f2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbPressedElevation", "ThumbRadius", "getThumbRadius", "()F", "ThumbRippleRadius", "TrackHeight", "getTrackHeight", "CorrectValueSideEffect", "", "scaleToOffset", "Lkotlin/Function1;", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "RangeSlider", "onValueChange", "modifier", "enabled", "", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Slider", "interactionSource", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", NetStateExceptionType.Track, "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", "target", "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", "offset", "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1190:1\n25#2:1191\n36#2:1199\n25#2:1207\n25#2:1214\n36#2:1221\n456#2,8:1246\n464#2,3:1260\n467#2,3:1267\n456#2,8:1289\n464#2,3:1303\n36#2:1311\n36#2:1318\n467#2,3:1325\n456#2,8:1347\n464#2,3:1361\n25#2:1365\n50#2:1372\n49#2:1373\n467#2,3:1381\n83#2,3:1400\n1097#3,6:1192\n1097#3,6:1200\n1097#3,6:1208\n1097#3,6:1215\n1097#3,6:1222\n1097#3,6:1312\n1097#3,6:1319\n1097#3,6:1366\n1097#3,6:1374\n1097#3,6:1403\n1#4:1198\n92#5:1206\n92#5:1228\n92#5:1265\n88#5:1266\n92#5:1308\n88#5:1309\n88#5:1310\n66#6,6:1229\n72#6:1263\n76#6:1271\n66#6,6:1272\n72#6:1306\n76#6:1329\n66#6,6:1330\n72#6:1364\n76#6:1385\n78#7,11:1235\n91#7:1270\n78#7,11:1278\n91#7:1328\n78#7,11:1336\n91#7:1384\n4144#8,6:1254\n4144#8,6:1297\n4144#8,6:1355\n76#9:1264\n76#9:1307\n154#10:1380\n154#10:1410\n154#10:1411\n154#10:1412\n154#10:1413\n154#10:1414\n154#10:1415\n154#10:1416\n2333#11,14:1386\n135#12:1409\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n155#1:1191\n160#1:1199\n302#1:1207\n303#1:1214\n307#1:1221\n589#1:1246,8\n589#1:1260,3\n589#1:1267,3\n633#1:1289,8\n633#1:1303,3\n661#1:1311\n672#1:1318\n633#1:1325,3\n693#1:1347,8\n693#1:1361,3\n697#1:1365\n698#1:1372\n698#1:1373\n693#1:1381,3\n840#1:1400,3\n155#1:1192,6\n160#1:1200,6\n302#1:1208,6\n303#1:1215,6\n307#1:1222,6\n661#1:1312,6\n672#1:1319,6\n697#1:1366,6\n698#1:1374,6\n840#1:1403,6\n166#1:1206\n314#1:1228\n599#1:1265\n600#1:1266\n643#1:1308\n644#1:1309\n645#1:1310\n589#1:1229,6\n589#1:1263\n589#1:1271\n633#1:1272,6\n633#1:1306\n633#1:1329\n693#1:1330,6\n693#1:1364\n693#1:1385\n589#1:1235,11\n589#1:1270\n633#1:1278,11\n633#1:1328\n693#1:1336,11\n693#1:1384\n589#1:1254,6\n633#1:1297,6\n693#1:1355,6\n593#1:1264\n637#1:1307\n724#1:1380\n1149#1:1410\n1150#1:1411\n1151#1:1412\n1152#1:1413\n1155#1:1414\n1156#1:1415\n1157#1:1416\n798#1:1386,14\n935#1:1409\n*E\n"})
public final class SliderKt {

    @NotNull
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;

    @NotNull
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m3775constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m3775constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m3775constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m3775constructorimpl(6);
    private static final float TrackHeight = Dp.m3775constructorimpl(4);

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1190:1\n76#2:1191\n76#2:1192\n25#3:1193\n25#3:1200\n25#3:1211\n83#3,3:1222\n50#3:1231\n49#3:1232\n50#3:1239\n49#3:1240\n1097#4,6:1194\n1097#4,6:1201\n1097#4,3:1212\n1100#4,3:1218\n1097#4,6:1225\n1097#4,6:1233\n1097#4,6:1241\n486#5,4:1207\n490#5,2:1215\n494#5:1221\n486#6:1217\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n316#1:1191\n321#1:1192\n332#1:1193\n333#1:1200\n350#1:1211\n375#1:1222,3\n417#1:1231\n417#1:1232\n425#1:1239\n425#1:1240\n332#1:1194,6\n333#1:1201,6\n350#1:1212,3\n350#1:1218,3\n375#1:1225,6\n417#1:1233,6\n425#1:1241,6\n350#1:1207,4\n350#1:1215,2\n350#1:1221\n350#1:1217\n*E\n"})
    public static final class C07412 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ int $steps;
        final /* synthetic */ List<Float> $tickFractions;
        final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C00922 extends FunctionReferenceImpl implements Function1<Float, Float> {
            final /* synthetic */ Ref.FloatRef $maxPx;
            final /* synthetic */ Ref.FloatRef $minPx;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00922(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = closedFloatingPointRange;
                this.$minPx = floatRef;
                this.$maxPx = floatRef2;
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(C07412.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Float, Float> {
            final /* synthetic */ Ref.FloatRef $maxPx;
            final /* synthetic */ Ref.FloatRef $minPx;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = closedFloatingPointRange;
                this.$minPx = floatRef;
                this.$maxPx = floatRef2;
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(C07412.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07412(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, int i2, Function0<Unit> function0, List<Float> list, SliderColors sliderColors) {
            super(3);
            this.$valueRange = closedFloatingPointRange;
            this.$value = closedFloatingPointRange2;
            this.$$dirty = i;
            this.$onValueChangeState = state;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$enabled = z;
            this.$steps = i2;
            this.$onValueChangeFinished = function0;
            this.$tickFractions = list;
            this.$colors = sliderColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
            return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
            return SliderKt.scale(floatRef.element, floatRef2.element, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((((i & 14) == 0 ? (composer.changed(BoxWithConstraints) ? 4 : 2) | i : i) & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652589923, i, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:314)");
            }
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            floatRef.element = fM3743getMaxWidthimpl - density.mo326toPx0680j_4(SliderKt.getThumbRadius());
            floatRef2.element = density.mo326toPx0680j_4(SliderKt.getThumbRadius());
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef2, floatRef, closedFloatingPointRange.getStart().floatValue()));
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef2, floatRef, closedFloatingPointRange3.getEndInclusive().floatValue()));
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            SliderKt.CorrectValueSideEffect(new C00922(this.$valueRange, floatRef2, floatRef), this.$valueRange, RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableFloatState, this.$value.getStart().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            SliderKt.CorrectValueSideEffect(new AnonymousClass3(this.$valueRange, floatRef2, floatRef), this.$valueRange, RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableFloatState2, this.$value.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            Object objOooO00o = OooOo00.OooO00o(composer, 773894976, -492369756);
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composer.endReplaceableGroup();
            final List<Float> list = this.$tickFractions;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$valueRange;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {361}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ boolean $isStart;
                    final /* synthetic */ Ref.FloatRef $maxPx;
                    final /* synthetic */ Ref.FloatRef $minPx;
                    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
                    final /* synthetic */ MutableFloatState $rawOffsetEnd;
                    final /* synthetic */ MutableFloatState $rawOffsetStart;
                    final /* synthetic */ float $target;
                    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(float f, float f2, Function0<Unit> function0, boolean z, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$current = f;
                        this.$target = f2;
                        this.$onValueChangeFinished = function0;
                        this.$isStart = z;
                        this.$rawOffsetStart = mutableFloatState;
                        this.$rawOffsetEnd = mutableFloatState2;
                        this.$onValueChangeState = state;
                        this.$minPx = floatRef;
                        this.$maxPx = floatRef2;
                        this.$valueRange = closedFloatingPointRange;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            Float fBoxFloat = Boxing.boxFloat(this.$target);
                            TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                            Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                            final boolean z = this.$isStart;
                            final MutableFloatState mutableFloatState = this.$rawOffsetStart;
                            final MutableFloatState mutableFloatState2 = this.$rawOffsetEnd;
                            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
                            final Ref.FloatRef floatRef = this.$minPx;
                            final Ref.FloatRef floatRef2 = this.$maxPx;
                            final ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
                            Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                                    invoke2(animatable);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    (z ? mutableFloatState : mutableFloatState2).setFloatValue(animateTo.getValue().floatValue());
                                    state.getValue().invoke(SliderKt.C07412.invoke$scaleToUserValue(floatRef, floatRef2, closedFloatingPointRange, RangesKt.rangeTo(mutableFloatState.getFloatValue(), mutableFloatState2.getFloatValue())));
                                }
                            };
                            this.label = 1;
                            if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Function0<Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
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
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    float floatValue = (z2 ? mutableFloatState : mutableFloatState2).getFloatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef2.element, floatRef.element);
                    if (!(floatValue == fSnapValueToTick)) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(floatValue, fSnapValueToTick, function0, z2, mutableFloatState, mutableFloatState2, state, floatRef2, floatRef, closedFloatingPointRange5, null), 3, null);
                        return;
                    }
                    Function0<Unit> function1 = function0;
                    if (function1 != null) {
                        function1.invoke();
                    }
                }
            }, composer, 0);
            final ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$value;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
            Object[] objArr = {mutableFloatState, mutableFloatState2, this.$valueRange, Float.valueOf(floatRef2.element), Float.valueOf(floatRef.element), closedFloatingPointRange6, state2};
            final ClosedFloatingPointRange<Float> closedFloatingPointRange7 = this.$valueRange;
            composer.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i2 = 0; i2 < 7; i2++) {
                zChanged |= composer.changed(objArr[i2]);
            }
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function2<Boolean, Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f) {
                        invoke(bool.booleanValue(), f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2, float f) {
                        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
                        if (z2) {
                            MutableFloatState mutableFloatState3 = mutableFloatState;
                            mutableFloatState3.setFloatValue(mutableFloatState3.getFloatValue() + f);
                            mutableFloatState2.setFloatValue(SliderKt.C07412.invoke$scaleToOffset(closedFloatingPointRange7, floatRef2, floatRef, closedFloatingPointRange6.getEndInclusive().floatValue()));
                            float floatValue = mutableFloatState2.getFloatValue();
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(RangesKt.coerceIn(mutableFloatState.getFloatValue(), floatRef2.element, floatValue), floatValue);
                        } else {
                            MutableFloatState mutableFloatState4 = mutableFloatState2;
                            mutableFloatState4.setFloatValue(mutableFloatState4.getFloatValue() + f);
                            mutableFloatState.setFloatValue(SliderKt.C07412.invoke$scaleToOffset(closedFloatingPointRange7, floatRef2, floatRef, closedFloatingPointRange6.getStart().floatValue()));
                            float floatValue2 = mutableFloatState.getFloatValue();
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(floatValue2, RangesKt.coerceIn(mutableFloatState2.getFloatValue(), floatValue2, floatRef.element));
                        }
                        state2.getValue().invoke(SliderKt.C07412.invoke$scaleToUserValue(floatRef2, floatRef, closedFloatingPointRange7, closedFloatingPointRangeRangeTo));
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(objRememberedValue3, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierRangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableFloatState, mutableFloatState2, this.$enabled, z, fM3743getMaxWidthimpl, this.$valueRange, stateRememberUpdatedState, stateRememberUpdatedState2);
            final float fCoerceIn = RangesKt.coerceIn(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
            final float fCoerceIn2 = RangesKt.coerceIn(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn);
            float fCalcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn2);
            int iFloor = (int) Math.floor(this.$steps * fCalcFraction2);
            int iFloor2 = (int) Math.floor((1.0f - fCalcFraction) * this.$steps);
            boolean z2 = this.$enabled;
            Object obj = this.$onValueChangeState;
            Object objValueOf = Float.valueOf(fCoerceIn2);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state3 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged2 = composer.changed(obj) | composer.changed(objValueOf);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        state3.getValue().invoke(RangesKt.rangeTo(f, fCoerceIn2));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics = SliderKt.sliderSemantics(companion2, fCoerceIn, z2, (Function1) objRememberedValue4, this.$onValueChangeFinished, RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), fCoerceIn2), iFloor);
            boolean z3 = this.$enabled;
            Object obj2 = this.$onValueChangeState;
            Object objValueOf2 = Float.valueOf(fCoerceIn);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state4 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged3 = composer.changed(obj2) | composer.changed(objValueOf2);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        state4.getValue().invoke(RangesKt.rangeTo(fCoerceIn, f));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics2 = SliderKt.sliderSemantics(companion2, fCoerceIn2, z3, (Function1) objRememberedValue5, this.$onValueChangeFinished, RangesKt.rangeTo(fCoerceIn, this.$valueRange.getEndInclusive().floatValue()), iFloor2);
            boolean z4 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f = floatRef.element - floatRef2.element;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i3 = this.$$dirty;
            SliderKt.RangeSliderImpl(z4, fCalcFraction, fCalcFraction2, list2, sliderColors, f, mutableInteractionSource, mutableInteractionSource2, modifierRangeSliderPressDragModifier, modifierSliderSemantics, modifierSliderSemantics2, composer, ((i3 >> 9) & 14) | 14159872 | ((i3 >> 9) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1190:1\n76#2:1191\n76#2:1192\n486#3,4:1193\n490#3,2:1201\n494#3:1207\n25#4:1197\n25#4:1208\n25#4:1215\n67#4,3:1222\n66#4:1225\n36#4:1232\n1097#5,3:1198\n1100#5,3:1204\n1097#5,6:1209\n1097#5,6:1216\n1097#5,6:1226\n1097#5,6:1233\n486#6:1203\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n*L\n177#1:1191\n182#1:1192\n193#1:1193,4\n193#1:1201,2\n193#1:1207\n193#1:1197\n194#1:1208\n195#1:1215\n197#1:1222,3\n197#1:1225\n237#1:1232\n193#1:1198,3\n193#1:1204,3\n194#1:1209,6\n195#1:1216,6\n197#1:1226,6\n237#1:1233,6\n193#1:1203\n*E\n"})
    public static final class C07433 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
        final /* synthetic */ List<Float> $tickFractions;
        final /* synthetic */ float $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$2, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Float, Float> {
            final /* synthetic */ Ref.FloatRef $maxPx;
            final /* synthetic */ Ref.FloatRef $minPx;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.$valueRange = closedFloatingPointRange;
                this.$minPx = floatRef;
                this.$maxPx = floatRef2;
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(C07433.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07433(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
            super(3);
            this.$valueRange = closedFloatingPointRange;
            this.$$dirty = i;
            this.$value = f;
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z;
            this.$tickFractions = list;
            this.$colors = sliderColors;
            this.$onValueChangeState = state;
            this.$onValueChangeFinished = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
            return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f) {
            return SliderKt.scale(floatRef.element, floatRef2.element, f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 14) == 0) {
                i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085116814, i, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:175)");
            }
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            floatRef.element = Math.max(fM3743getMaxWidthimpl - density.mo326toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
            floatRef2.element = Math.min(density.mo326toPx0680j_4(SliderKt.getThumbRadius()), floatRef.element);
            Object objOooO00o = OooOo00.OooO00o(composer, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composer.endReplaceableGroup();
            float f = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange, floatRef2, floatRef, f));
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            Object objValueOf = Float.valueOf(floatRef2.element);
            Object objValueOf2 = Float.valueOf(floatRef.element);
            final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            final State<Function1<Float, Unit>> state = this.$onValueChangeState;
            composer.startReplaceableGroup(1618982084);
            boolean zChanged = composer.changed(objValueOf) | composer.changed(objValueOf2) | composer.changed(closedFloatingPointRange2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                Object sliderDraggableState = new SliderDraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                        invoke(f2.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f2) {
                        MutableFloatState mutableFloatState3 = mutableFloatState;
                        mutableFloatState3.setFloatValue(mutableFloatState2.getFloatValue() + mutableFloatState3.getFloatValue() + f2);
                        mutableFloatState2.setFloatValue(0.0f);
                        state.getValue().invoke(Float.valueOf(SliderKt.C07433.invoke$scaleToUserValue(floatRef2, floatRef, closedFloatingPointRange2, RangesKt.coerceIn(mutableFloatState.getFloatValue(), floatRef2.element, floatRef.element))));
                    }
                });
                composer.updateRememberedValue(sliderDraggableState);
                objRememberedValue3 = sliderDraggableState;
            }
            composer.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState2 = (SliderDraggableState) objRememberedValue3;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, floatRef2, floatRef);
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$valueRange;
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(floatRef2.element, floatRef.element);
            float f2 = this.$value;
            int i3 = this.$$dirty;
            SliderKt.CorrectValueSideEffect(anonymousClass2, closedFloatingPointRange3, closedFloatingPointRangeRangeTo, mutableFloatState, f2, composer, ((i3 >> 9) & 112) | 3072 | ((i3 << 12) & 57344));
            final List<Float> list = this.$tickFractions;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ SliderDraggableState $draggableState;
                    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                    final /* synthetic */ float $target;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SliderDraggableState sliderDraggableState, float f, float f2, float f3, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f;
                        this.$target = f2;
                        this.$velocity = f3;
                        this.$onValueChangeFinished = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            SliderDraggableState sliderDraggableState = this.$draggableState;
                            float f = this.$current;
                            float f2 = this.$target;
                            float f3 = this.$velocity;
                            this.label = 1;
                            if (SliderKt.animateToTarget(sliderDraggableState, f, f2, f3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Function0<Unit> function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.invoke();
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
                public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                    invoke(f3.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f3) {
                    Function0<Unit> function1;
                    float floatValue = mutableFloatState.getFloatValue();
                    float fSnapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef2.element, floatRef.element);
                    if (!(floatValue == fSnapValueToTick)) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sliderDraggableState2, floatValue, fSnapValueToTick, f3, function0, null), 3, null);
                    } else {
                        if (sliderDraggableState2.isDragging() || (function1 = function0) == null) {
                            return;
                        }
                        function1.invoke();
                    }
                }
            }, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState2, this.$interactionSource, fM3743getMaxWidthimpl, z, mutableFloatState, stateRememberUpdatedState, mutableFloatState2, this.$enabled);
            Orientation orientation = Orientation.Horizontal;
            boolean zIsDragging = sliderDraggableState2.isDragging();
            boolean z2 = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(stateRememberUpdatedState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new SliderKt$Slider$3$drag$1$1(stateRememberUpdatedState, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierDraggable = DraggableKt.draggable(companion2, sliderDraggableState2, orientation, (252 & 4) != 0 ? true : z2, (252 & 8) != 0 ? null : mutableInteractionSource, (252 & 16) != 0 ? false : zIsDragging, (252 & 32) != 0 ? new DraggableKt.C06261(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : (Function3) objRememberedValue4, (252 & 128) != 0 ? false : z);
            float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), RangesKt.coerceIn(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue()));
            boolean z3 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f3 = floatRef.element - floatRef2.element;
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            Modifier modifierThen = modifierSliderTapModifier.then(modifierDraggable);
            int i4 = this.$$dirty;
            SliderKt.SliderImpl(z3, fCalcFraction, list2, sliderColors, f3, mutableInteractionSource2, modifierThen, composer, ((i4 >> 9) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE | ((i4 >> 15) & 7168) | ((i4 >> 6) & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$animateToTarget$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {955}, m = "invokeSuspend", n = {}, s = {})
    public static final class C07462 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07462(float f, float f2, float f3, Continuation<? super C07462> continuation) {
            super(2, continuation);
            this.$current = f;
            this.$target = f2;
            this.$velocity = f3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C07462 c07462 = new C07462(this.$current, this.$target, this.$velocity, continuation);
            c07462.L$0 = obj;
            return c07462;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07462) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float f = this.$current;
                floatRef.element = f;
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
                Float fBoxFloat = Boxing.boxFloat(this.$target);
                TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                Float fBoxFloat2 = Boxing.boxFloat(this.$velocity);
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.animateToTarget.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        dragScope.dragBy(animateTo.getValue().floatValue() - floatRef.element);
                        floatRef.element = animateTo.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {983}, m = "invokeSuspend", n = {}, s = {})
    public static final class C07471 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {985, 995, 1014}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            public static final class C00951 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {Constants.WARN_ADM_RECORD_AUDIO_LOWLEVEL}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = booleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                            DragInteraction dragInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == coroutine_suspended) {
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
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00951(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C00951> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C00951 c00951 = new C00951(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    c00951.L$0 = obj;
                    return c00951;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00951) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:41:0x0122  */
                /* JADX WARN: Code duplicated, block: B:43:0x0125  */
                /* JADX WARN: Code duplicated, block: B:56:0x017d A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:59:0x0186 A[Catch: CancellationException -> 0x0192, TryCatch #0 {CancellationException -> 0x0192, blocks: (B:57:0x017e, B:59:0x0186, B:60:0x018c, B:54:0x015e), top: B:67:0x015e }] */
                /* JADX WARN: Code duplicated, block: B:60:0x018c A[Catch: CancellationException -> 0x0192, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0192, blocks: (B:57:0x017e, B:59:0x0186, B:60:0x018c, B:54:0x015e), top: B:67:0x015e }] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objAwaitFirstDown$default;
                    AwaitPointerEventScope awaitPointerEventScope;
                    Ref.FloatRef floatRef;
                    Object objM1180awaitSlop8vUncbI;
                    DragInteraction.Start start;
                    final Ref.BooleanRef booleanRef;
                    AwaitPointerEventScope awaitPointerEventScope2;
                    PointerInputChange pointerInputChange;
                    Pair pair;
                    DragInteraction.Start start2;
                    Object objM285horizontalDragjO51t88;
                    State<Float> state;
                    boolean z;
                    float fM1078pointerSlopE8SPZFQ;
                    boolean z2;
                    DragInteraction cancel;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope3;
                        this.label = 1;
                        objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 2, null);
                        if (objAwaitFirstDown$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope = awaitPointerEventScope3;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                booleanRef = (Ref.BooleanRef) this.L$1;
                                start2 = (DragInteraction.Start) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    start = start2;
                                    objM285horizontalDragjO51t88 = obj;
                                    if (((Boolean) objM285horizontalDragjO51t88).booleanValue()) {
                                        cancel = new DragInteraction.Stop(start);
                                    } else {
                                        cancel = new DragInteraction.Cancel(start);
                                    }
                                } catch (CancellationException unused) {
                                    cancel = new DragInteraction.Cancel(start2);
                                }
                                this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            booleanRef = (Ref.BooleanRef) this.L$4;
                            floatRef = (Ref.FloatRef) this.L$3;
                            DragInteraction.Start start3 = (DragInteraction.Start) this.L$2;
                            PointerInputChange pointerInputChange2 = (PointerInputChange) this.L$1;
                            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            pointerInputChange = pointerInputChange2;
                            start = start3;
                            objM1180awaitSlop8vUncbI = obj;
                            pair = (Pair) objM1180awaitSlop8vUncbI;
                            if (pair != null) {
                                state = this.$rawOffsetEnd;
                                State<Float> state2 = this.$rawOffsetStart;
                                z = this.$isRtl;
                                fM1078pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m1078pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                                if (Math.abs(state.getValue().floatValue() - floatRef.element) < fM1078pointerSlopE8SPZFQ || Math.abs(state2.getValue().floatValue() - floatRef.element) >= fM1078pointerSlopE8SPZFQ) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    float fFloatValue = ((Number) pair.getSecond()).floatValue();
                                    booleanRef.element = z ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                                    floatRef.element = Offset.m1447getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst())) + floatRef.element;
                                }
                            }
                            this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                            try {
                                long id = pointerInputChange.getId();
                                final State<Function2<Boolean, Float, Unit>> state3 = this.$onDrag;
                                final boolean z3 = this.$isRtl;
                                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                        invoke2(pointerInputChange3);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull PointerInputChange it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        float fM1447getXimpl = Offset.m1447getXimpl(PointerEventKt.positionChange(it));
                                        Function2<Boolean, Float, Unit> value = state3.getValue();
                                        Boolean boolValueOf = Boolean.valueOf(booleanRef.element);
                                        if (z3) {
                                            fM1447getXimpl = -fM1447getXimpl;
                                        }
                                        value.invoke(boolValueOf, Float.valueOf(fM1447getXimpl));
                                    }
                                };
                                this.L$0 = start;
                                this.L$1 = booleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                objM285horizontalDragjO51t88 = DragGestureDetectorKt.m285horizontalDragjO51t88(awaitPointerEventScope2, id, function1, this);
                                if (objM285horizontalDragjO51t88 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) objM285horizontalDragjO51t88).booleanValue()) {
                                    cancel = new DragInteraction.Stop(start);
                                } else {
                                    cancel = new DragInteraction.Cancel(start);
                                }
                            } catch (CancellationException unused2) {
                                start2 = start;
                                cancel = new DragInteraction.Cancel(start2);
                            }
                            this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef.element));
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef, cancel, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = awaitPointerEventScope5;
                        objAwaitFirstDown$default = obj;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) objAwaitFirstDown$default;
                    DragInteraction.Start start4 = new DragInteraction.Start();
                    floatRef = new Ref.FloatRef();
                    float fM1447getXimpl = this.$isRtl ? this.$maxPx - Offset.m1447getXimpl(pointerInputChange3.getPosition()) : Offset.m1447getXimpl(pointerInputChange3.getPosition());
                    floatRef.element = fM1447getXimpl;
                    int iCompareOffsets = this.$rangeSliderLogic.compareOffsets(fM1447getXimpl);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    booleanRef2.element = iCompareOffsets == 0 ? this.$rawOffsetStart.getValue().floatValue() > floatRef.element : iCompareOffsets < 0;
                    long id2 = pointerInputChange3.getId();
                    int type = pointerInputChange3.getType();
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = pointerInputChange3;
                    this.L$2 = start4;
                    this.L$3 = floatRef;
                    this.L$4 = booleanRef2;
                    this.label = 2;
                    objM1180awaitSlop8vUncbI = SliderKt.m1180awaitSlop8vUncbI(awaitPointerEventScope, id2, type, this);
                    if (objM1180awaitSlop8vUncbI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    start = start4;
                    booleanRef = booleanRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange = pointerInputChange3;
                    pair = (Pair) objM1180awaitSlop8vUncbI;
                    if (pair != null) {
                        state = this.$rawOffsetEnd;
                        State<Float> state4 = this.$rawOffsetStart;
                        z = this.$isRtl;
                        fM1078pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m1078pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                        if (Math.abs(state.getValue().floatValue() - floatRef.element) < fM1078pointerSlopE8SPZFQ) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
                            booleanRef.element = z ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                            floatRef.element = Offset.m1447getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst())) + floatRef.element;
                        }
                    }
                    this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                    long id3 = pointerInputChange.getId();
                    final State<? extends Function2<? super Boolean, ? super Float, Unit>> state5 = this.$onDrag;
                    final boolean z4 = this.$isRtl;
                    Function1<PointerInputChange, Unit> function2 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange4) {
                            invoke2(pointerInputChange4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull PointerInputChange it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            float fM1447getXimpl2 = Offset.m1447getXimpl(PointerEventKt.positionChange(it));
                            Function2<Boolean, Float, Unit> value = state5.getValue();
                            Boolean boolValueOf = Boolean.valueOf(booleanRef.element);
                            if (z4) {
                                fM1447getXimpl2 = -fM1447getXimpl2;
                            }
                            value.invoke(boolValueOf, Float.valueOf(fM1447getXimpl2));
                        }
                    };
                    this.L$0 = start;
                    this.L$1 = booleanRef;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    objM285horizontalDragjO51t88 = DragGestureDetectorKt.m285horizontalDragjO51t88(awaitPointerEventScope2, id3, function2, this);
                    if (objM285horizontalDragjO51t88 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objM285horizontalDragjO51t88).booleanValue()) {
                        cancel = new DragInteraction.Stop(start);
                    } else {
                        cancel = new DragInteraction.Cancel(start);
                    }
                    this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef.element));
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef, cancel, null), 3, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00941(PointerInputScope pointerInputScope, boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C00941> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$isRtl = z;
                this.$maxPx = f;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00941 c00941 = new C00941(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                c00941.L$0 = obj;
                return c00941;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00951 c00951 = new C00951(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00951, this) == coroutine_suspended) {
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
                return ((C00941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07471(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2<? super Boolean, ? super Float, Unit>> state3, boolean z, float f, State<? extends Function1<? super Boolean, Unit>> state4, Continuation<? super C07471> continuation) {
            super(2, continuation);
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$rawOffsetStart = state;
            this.$rawOffsetEnd = state2;
            this.$onDrag = state3;
            this.$isRtl = z;
            this.$maxPx = f;
            this.$gestureEndAction = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C07471 c07471 = new C07471(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
            c07471.L$0 = obj;
            return c07471;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07471) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C00941 c00941 = new C00941((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(c00941, this) == coroutine_suspended) {
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
    }

    static {
        float fM3775constructorimpl = Dp.m3775constructorimpl(48);
        SliderHeight = fM3775constructorimpl;
        float fM3775constructorimpl2 = Dp.m3775constructorimpl(144);
        SliderMinWidth = fM3775constructorimpl2;
        DefaultSliderConstraints = SizeKt.m513heightInVpY3zN4$default(SizeKt.m532widthInVpY3zN4$default(Modifier.INSTANCE, fM3775constructorimpl2, 0.0f, 2, null), 0.0f, fM3775constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00cc: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    public static final void CorrectValueSideEffect(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00cc: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Code duplicated, block: B:107:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x015d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0162  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:115:0x0173  */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:118:0x0178  */
    /* JADX WARN: Code duplicated, block: B:121:0x017d  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:134:0x0200  */
    /* JADX WARN: Code duplicated, block: B:136:0x0203  */
    /* JADX WARN: Code duplicated, block: B:138:0x021f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0225  */
    /* JADX WARN: Code duplicated, block: B:143:0x028c  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x0119, please report this as an issue */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    public static final void RangeSlider(@NotNull final ClosedFloatingPointRange<Float> value, @NotNull final Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, @Nullable Function0<Unit> function0, @Nullable SliderColors sliderColors, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0<Unit> function1;
        int i11;
        Function0<Unit> function2;
        SliderColors sliderColorsM1176colorsq0g_0yA;
        Function0<Unit> function3;
        int i12;
        Modifier modifier3;
        boolean z3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i13;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableInteractionSource mutableInteractionSource;
        Object objRememberedValue2;
        MutableInteractionSource mutableInteractionSource2;
        boolean zChanged;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier4;
        final boolean z4;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final int i14;
        final Function0<Unit> function4;
        final SliderColors sliderColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1556183027);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                        int i16 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i4 |= i16;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    }
                    i4 |= i16;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        i8 = i;
                        if (composerStartRestartGroup.changed(i8)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                        function1 = function0;
                    } else {
                        function1 = function0;
                        if ((i2 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                    }
                    if ((i2 & 29360128) != 0) {
                        i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
                    }
                    if ((i4 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                function2 = null;
                            } else {
                                function2 = function1;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                                function3 = function2;
                                sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i13 = i8;
                                i12 = i4;
                            } else {
                                sliderColorsM1176colorsq0g_0yA = sliderColors;
                                function3 = function2;
                                i12 = i4;
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i13 = i8;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColorsM1176colorsq0g_0yA = sliderColors;
                                function3 = function1;
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i13 = i8;
                                i12 = i4 & (-29360129);
                            } else {
                                sliderColorsM1176colorsq0g_0yA = sliderColors;
                                function3 = function1;
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i13 = i8;
                                i12 = i4;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (!(i13 >= 0)) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                        Integer numValueOf = Integer.valueOf(i13);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = stepsToTickFractions(i13);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                        float f = ThumbRadius;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize, Dp.m3775constructorimpl(4 * f), Dp.m3775constructorimpl(f * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z4 = z3;
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        i14 = i13;
                        function4 = function3;
                        sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        i14 = i8;
                        composer2 = composerStartRestartGroup;
                        function4 = function1;
                        modifier4 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        sliderColors2 = sliderColors;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                            SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
                i4 |= 196608;
                i8 = i;
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                if ((i4 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i13 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                    Integer numValueOf2 = Integer.valueOf(i13);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f2 = ThumbRadius;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize2, Dp.m3775constructorimpl(4 * f2), Dp.m3775constructorimpl(f2 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState2, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z4 = z3;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i14 = i13;
                    function4 = function3;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i13 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                    Integer numValueOf3 = Integer.valueOf(i13);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf3);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierMinimumInteractiveComponentSize3 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f3 = ThumbRadius;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize3, Dp.m3775constructorimpl(4 * f3), Dp.m3775constructorimpl(f3 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState3, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z4 = z3;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i14 = i13;
                    function4 = function3;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 3072;
            z2 = z;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                    }
                    i4 |= i16;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i4 |= i16;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                if ((i4 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i13 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                    Integer numValueOf4 = Integer.valueOf(i13);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierMinimumInteractiveComponentSize4 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f4 = ThumbRadius;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize4, Dp.m3775constructorimpl(4 * f4), Dp.m3775constructorimpl(f4 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState4, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z4 = z3;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i14 = i13;
                    function4 = function3;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i13 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                    Integer numValueOf5 = Integer.valueOf(i13);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierMinimumInteractiveComponentSize5 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f5 = ThumbRadius;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize5, Dp.m3775constructorimpl(4 * f5), Dp.m3775constructorimpl(f5 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState5, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z4 = z3;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i14 = i13;
                    function4 = function3;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            if ((i4 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i13 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                Integer numValueOf6 = Integer.valueOf(i13);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierMinimumInteractiveComponentSize6 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f6 = ThumbRadius;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize6, Dp.m3775constructorimpl(4 * f6), Dp.m3775constructorimpl(f6 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState6, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z4 = z3;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i14 = i13;
                function4 = function3;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i13 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                Integer numValueOf7 = Integer.valueOf(i13);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf7);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierMinimumInteractiveComponentSize7 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f7 = ThumbRadius;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize7, Dp.m3775constructorimpl(4 * f7), Dp.m3775constructorimpl(f7 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState7, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z4 = z3;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i14 = i13;
                function4 = function3;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                    SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 384;
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                    }
                    i4 |= i16;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i4 |= i16;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                if ((i4 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i13 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                    Integer numValueOf8 = Integer.valueOf(i13);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf8);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierMinimumInteractiveComponentSize8 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f8 = ThumbRadius;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize8, Dp.m3775constructorimpl(4 * f8), Dp.m3775constructorimpl(f8 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState8, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z4 = z3;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i14 = i13;
                    function4 = function3;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            function3 = function2;
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                            i12 = i4;
                        } else {
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                            function3 = function2;
                            i12 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i13 = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (!(i13 >= 0)) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                    Integer numValueOf9 = Integer.valueOf(i13);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf9);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = stepsToTickFractions(i13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierMinimumInteractiveComponentSize9 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f9 = ThumbRadius;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize9, Dp.m3775constructorimpl(4 * f9), Dp.m3775constructorimpl(f9 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState9, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z4 = z3;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i14 = i13;
                    function4 = function3;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                        SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            if ((i4 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i13 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                Integer numValueOf10 = Integer.valueOf(i13);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf10);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierMinimumInteractiveComponentSize10 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f10 = ThumbRadius;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize10, Dp.m3775constructorimpl(4 * f10), Dp.m3775constructorimpl(f10 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState10, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z4 = z3;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i14 = i13;
                function4 = function3;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i13 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                Integer numValueOf11 = Integer.valueOf(i13);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf11);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierMinimumInteractiveComponentSize11 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f11 = ThumbRadius;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize11, Dp.m3775constructorimpl(4 * f11), Dp.m3775constructorimpl(f11 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState11, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z4 = z3;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i14 = i13;
                function4 = function3;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                    SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 3072;
        z2 = z;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                }
                i4 |= i16;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
            }
            i4 |= i16;
        } else {
            closedFloatingPointRangeRangeTo = closedFloatingPointRange;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                i8 = i;
                if (composerStartRestartGroup.changed(i8)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            if ((i4 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i13 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                Integer numValueOf12 = Integer.valueOf(i13);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf12);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierMinimumInteractiveComponentSize12 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f12 = ThumbRadius;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize12, Dp.m3775constructorimpl(4 * f12), Dp.m3775constructorimpl(f12 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState12, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z4 = z3;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i14 = i13;
                function4 = function3;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        function3 = function2;
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                        i12 = i4;
                    } else {
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                        function3 = function2;
                        i12 = i4;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i13 = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (!(i13 >= 0)) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
                Integer numValueOf13 = Integer.valueOf(i13);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf13);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = stepsToTickFractions(i13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierMinimumInteractiveComponentSize13 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f13 = ThumbRadius;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize13, Dp.m3775constructorimpl(4 * f13), Dp.m3775constructorimpl(f13 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState13, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z4 = z3;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i14 = i13;
                function4 = function3;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                    SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 196608;
        i8 = i;
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
        }
        if ((i2 & 29360128) != 0) {
            i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        if ((i4 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    function3 = function2;
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                    i12 = i4;
                } else {
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                    function3 = function2;
                    i12 = i4;
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                }
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    function3 = function2;
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                    i12 = i4;
                } else {
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                    function3 = function2;
                    i12 = i4;
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
            if (!(i13 >= 0)) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
            Integer numValueOf14 = Integer.valueOf(i13);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf14);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = stepsToTickFractions(i13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = stepsToTickFractions(i13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierMinimumInteractiveComponentSize14 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
            float f14 = ThumbRadius;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize14, Dp.m3775constructorimpl(4 * f14), Dp.m3775constructorimpl(f14 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState14, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z4 = z3;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            i14 = i13;
            function4 = function3;
            sliderColors2 = sliderColorsM1176colorsq0g_0yA;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    function3 = function2;
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                    i12 = i4;
                } else {
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                    function3 = function2;
                    i12 = i4;
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                }
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    function3 = function2;
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                    i12 = i4;
                } else {
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                    function3 = function2;
                    i12 = i4;
                    modifier3 = modifier2;
                    z3 = z2;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i13 = i8;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1556183027, i12, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
            if (!(i13 >= 0)) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i12 >> 3) & 14);
            Integer numValueOf15 = Integer.valueOf(i13);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf15);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = stepsToTickFractions(i13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = stepsToTickFractions(i13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierMinimumInteractiveComponentSize15 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
            float f15 = ThumbRadius;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize15, Dp.m3775constructorimpl(4 * f15), Dp.m3775constructorimpl(f15 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new C07412(closedFloatingPointRange2, value, i12, stateRememberUpdatedState15, mutableInteractionSource, mutableInteractionSource2, z3, i13, function3, (List) objRememberedValue3, sliderColorsM1176colorsq0g_0yA)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z4 = z3;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            i14 = i13;
            function4 = function3;
            sliderColors2 = sliderColorsM1176colorsq0g_0yA;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.3
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
                SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i14, function4, sliderColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final List<Float> list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-278895713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278895713, i, i2, "androidx.compose.material.RangeSliderImpl (Slider.kt:616)");
        }
        Strings.Companion companion = Strings.INSTANCE;
        final String strM1199getString4foXLRw = Strings_androidKt.m1199getString4foXLRw(companion.m1198getSliderRangeStartUdPEhr4(), composerStartRestartGroup, 6);
        final String strM1199getString4foXLRw2 = Strings_androidKt.m1199getString4foXLRw(companion.m1197getSliderRangeEndUdPEhr4(), composerStartRestartGroup, 6);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo326toPx0680j_4 = density.mo326toPx0680j_4(TrackHeight);
        float f4 = ThumbRadius;
        float fMo326toPx0680j_5 = density.mo326toPx0680j_4(f4);
        float fMo322toDpu2uoSUM = density.mo322toDpu2uoSUM(f3);
        float fM3775constructorimpl = Dp.m3775constructorimpl(f4 * 2);
        float fM3775constructorimpl2 = Dp.m3775constructorimpl(fMo322toDpu2uoSUM * f);
        float fM3775constructorimpl3 = Dp.m3775constructorimpl(fMo322toDpu2uoSUM * f2);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        int i3 = i >> 9;
        int i4 = i << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, list, fMo326toPx0680j_5, fMo326toPx0680j_4, composerStartRestartGroup, (i3 & 112) | 262144 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(strM1199getString4foXLRw);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
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
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i5 = i & 57344;
        int i6 = (i << 15) & 458752;
        m1177SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue), true, mutableInteractionSource).then(modifier2), fM3775constructorimpl2, mutableInteractionSource, sliderColors, z, fM3775constructorimpl, composerStartRestartGroup, (i3 & 7168) | 1572870 | i5 | i6);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(strM1199getString4foXLRw2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
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
                    SemanticsPropertiesKt.setContentDescription(semantics, strM1199getString4foXLRw2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        m1177SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue2), true, mutableInteractionSource2).then(modifier3), fM3775constructorimpl3, mutableInteractionSource2, sliderColors, z, fM3775constructorimpl, composerStartRestartGroup, ((i >> 12) & 7168) | 1572870 | i5 | i6);
        if (OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                SliderKt.RangeSliderImpl(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f A[PHI: r0 r3 r5 r6 r7 r8 r9
      0x016f: PHI (r0v10 androidx.compose.foundation.interaction.MutableInteractionSource) = 
      (r0v4 androidx.compose.foundation.interaction.MutableInteractionSource)
      (r0v15 androidx.compose.foundation.interaction.MutableInteractionSource)
     binds: [B:138:0x01bb, B:115:0x0169] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r3v14 kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>) = 
      (r3v10 kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>)
      (r3v18 kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>)
     binds: [B:138:0x01bb, B:115:0x0169] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r5v25 int) = (r5v21 int), (r5v29 int) binds: [B:138:0x01bb, B:115:0x0169] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r6v11 int) = (r6v8 int), (r6v13 int) binds: [B:138:0x01bb, B:115:0x0169] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r7v5 androidx.compose.ui.Modifier) = (r7v3 androidx.compose.ui.Modifier), (r7v2 androidx.compose.ui.Modifier) binds: [B:138:0x01bb, B:115:0x0169] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r8v8 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r8v6 kotlin.jvm.functions.Function0<kotlin.Unit>), (r8v11 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:138:0x01bb, B:115:0x0169] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r9v5 boolean) = (r9v3 boolean), (r9v2 boolean) binds: [B:138:0x01bb, B:115:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x017b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x018a  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:127:0x018f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:132:0x0198  */
    /* JADX WARN: Code duplicated, block: B:134:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:149:0x021a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0222  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Slider(final float f, @NotNull final Function1<? super Float, Unit> onValueChange, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, @Nullable Function0<Unit> function0, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SliderColors sliderColors, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        final int i14;
        Function0<Unit> function1;
        MutableInteractionSource mutableInteractionSource2;
        int i15;
        SliderColors sliderColorsM1176colorsq0g_0yA;
        Object objRememberedValue;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue2;
        final boolean z4;
        final SliderColors sliderColors2;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final Modifier modifier3;
        final Function0<Unit> function2;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1962335196);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        int i17 = composerStartRestartGroup.changed(closedFloatingPointRange2) ? 16384 : 8192;
                        i4 |= i17;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i4 |= i17;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        i8 = i;
                        if (composerStartRestartGroup.changed(i8)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i13 = 8388608;
                        } else {
                            i13 = Configuration.BLOCK_SIZE;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
                    }
                    if ((i4 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i7 != 0) {
                                i14 = 0;
                            } else {
                                i14 = i8;
                            }
                            if (i10 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (i12 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i15 = i4 & (-234881025);
                                sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            } else {
                                i15 = i4;
                                sliderColorsM1176colorsq0g_0yA = sliderColors;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                int i18 = i4 & (-234881025);
                                function1 = function0;
                                sliderColorsM1176colorsq0g_0yA = sliderColors;
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                                i14 = i8;
                                i15 = i18;
                                mutableInteractionSource2 = mutableInteractionSource;
                            } else {
                                function1 = function0;
                                mutableInteractionSource2 = mutableInteractionSource;
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                                i14 = i8;
                                i15 = i4;
                                sliderColorsM1176colorsq0g_0yA = sliderColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                        }
                        if (i14 >= 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                        Integer numValueOf = Integer.valueOf(i14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = stepsToTickFractions(i14);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list = (List) objRememberedValue2;
                        Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                        float f2 = ThumbRadius;
                        float f3 = 2;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize, Dp.m3775constructorimpl(f2 * f3), Dp.m3775constructorimpl(f2 * f3), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState, function1)), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        modifier3 = modifier2;
                        function2 = function1;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z4 = z2;
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        i14 = i8;
                        function2 = function0;
                        sliderColors2 = sliderColors;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i19) {
                            SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
                i4 |= 196608;
                i8 = i;
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i14 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf2 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list2 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f4 = ThumbRadius;
                    float f5 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize2, Dp.m3775constructorimpl(f4 * f5), Dp.m3775constructorimpl(f4 * f5), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list2, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState2, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i14 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf3 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list3 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize3 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f6 = ThumbRadius;
                    float f7 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize3, Dp.m3775constructorimpl(f6 * f7), Dp.m3775constructorimpl(f6 * f7), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list3, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState3, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 3072;
            z2 = z;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i4 |= i17;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i4 |= i17;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i14 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf4 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list4 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize4 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f8 = ThumbRadius;
                    float f9 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize4, Dp.m3775constructorimpl(f8 * f9), Dp.m3775constructorimpl(f8 * f9), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list4, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState4, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i14 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf5 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf5);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list5 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize5 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f10 = ThumbRadius;
                    float f11 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize5, Dp.m3775constructorimpl(f10 * f11), Dp.m3775constructorimpl(f10 * f11), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list5, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState5, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
            }
            if ((i4 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i14 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf6 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf6);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list6 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize6 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f12 = ThumbRadius;
                float f13 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize6, Dp.m3775constructorimpl(f12 * f13), Dp.m3775constructorimpl(f12 * f13), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list6, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState6, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i14 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf7 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf7);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list7 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize7 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f14 = ThumbRadius;
                float f15 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize7, Dp.m3775constructorimpl(f14 * f15), Dp.m3775constructorimpl(f14 * f15), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list7, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState7, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i19) {
                    SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 384;
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i4 |= i17;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i4 |= i17;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i13 = 8388608;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i14 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf8 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf8);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list8 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize8 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f16 = ThumbRadius;
                    float f17 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize8, Dp.m3775constructorimpl(f16 * f17), Dp.m3775constructorimpl(f16 * f17), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list8, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState8, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i14 = 0;
                        } else {
                            i14 = i8;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i12 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i15 = i4 & (-234881025);
                            sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            i15 = i4;
                            sliderColorsM1176colorsq0g_0yA = sliderColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i14 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                    Integer numValueOf9 = Integer.valueOf(i14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf9);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = stepsToTickFractions(i14);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list9 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize9 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f18 = ThumbRadius;
                    float f19 = 2;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize9, Dp.m3775constructorimpl(f18 * f19), Dp.m3775constructorimpl(f18 * f19), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list9, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState9, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
            }
            if ((i4 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i14 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf10 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf10);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list10 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize10 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f110 = ThumbRadius;
                float f111 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize10, Dp.m3775constructorimpl(f110 * f111), Dp.m3775constructorimpl(f110 * f111), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list10, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState10, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i14 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf11 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf11);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list11 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize11 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f112 = ThumbRadius;
                float f113 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize11, Dp.m3775constructorimpl(f112 * f113), Dp.m3775constructorimpl(f112 * f113), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list11, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState11, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i19) {
                    SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 3072;
        z2 = z;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                closedFloatingPointRange2 = closedFloatingPointRange;
                if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                }
                i4 |= i17;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i4 |= i17;
        } else {
            closedFloatingPointRange2 = closedFloatingPointRange;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                i8 = i;
                if (composerStartRestartGroup.changed(i8)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
            }
            if ((i4 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i14 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf12 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf12);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list12 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize12 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f114 = ThumbRadius;
                float f115 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize12, Dp.m3775constructorimpl(f114 * f115), Dp.m3775constructorimpl(f114 * f115), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list12, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState12, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i7 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i8;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i12 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i15 = i4 & (-234881025);
                        sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        i15 = i4;
                        sliderColorsM1176colorsq0g_0yA = sliderColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i14 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
                Integer numValueOf13 = Integer.valueOf(i14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf13);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = stepsToTickFractions(i14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list13 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize13 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f116 = ThumbRadius;
                float f117 = 2;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize13, Dp.m3775constructorimpl(f116 * f117), Dp.m3775constructorimpl(f116 * f117), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list13, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState13, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                sliderColors2 = sliderColorsM1176colorsq0g_0yA;
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i19) {
                    SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 196608;
        i8 = i;
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i13 = 8388608;
            } else {
                i13 = Configuration.BLOCK_SIZE;
            }
            i4 |= i13;
        }
        if ((i2 & 234881024) != 0) {
            i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : 67108864;
        }
        if ((i4 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i15 = i4 & (-234881025);
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    i15 = i4;
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                }
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i15 = i4 & (-234881025);
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    i15 = i4;
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
            }
            if (i14 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
            Integer numValueOf14 = Integer.valueOf(i14);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf14);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list14 = (List) objRememberedValue2;
            Modifier modifierMinimumInteractiveComponentSize14 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
            float f118 = ThumbRadius;
            float f119 = 2;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize14, Dp.m3775constructorimpl(f118 * f119), Dp.m3775constructorimpl(f118 * f119), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list14, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState14, function1)), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z2;
            sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
            modifier3 = modifier2;
            function2 = function1;
            mutableInteractionSource3 = mutableInteractionSource2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i15 = i4 & (-234881025);
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    i15 = i4;
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                }
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i7 != 0) {
                    i14 = 0;
                } else {
                    i14 = i8;
                }
                if (i10 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i12 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i15 = i4 & (-234881025);
                    sliderColorsM1176colorsq0g_0yA = SliderDefaults.INSTANCE.m1176colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    i15 = i4;
                    sliderColorsM1176colorsq0g_0yA = sliderColors;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1962335196, i15, -1, "androidx.compose.material.Slider (Slider.kt:145)");
            }
            if (i14 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i15 >> 3) & 14);
            Integer numValueOf15 = Integer.valueOf(i14);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf15);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = stepsToTickFractions(i14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list15 = (List) objRememberedValue2;
            Modifier modifierMinimumInteractiveComponentSize15 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
            float f1110 = ThumbRadius;
            float f1111 = 2;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m521requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize15, Dp.m3775constructorimpl(f1110 * f1111), Dp.m3775constructorimpl(f1110 * f1111), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function1, closedFloatingPointRangeRangeTo, i14), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new C07433(closedFloatingPointRangeRangeTo, i15, f, mutableInteractionSource2, z2, list15, sliderColorsM1176colorsq0g_0yA, stateRememberUpdatedState15, function1)), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z2;
            sliderColors2 = sliderColorsM1176colorsq0g_0yA;
            closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
            modifier3 = modifier2;
            function2 = function1;
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Slider.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i19) {
                SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i14, function2, mutableInteractionSource3, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SliderImpl(final boolean z, final float f, final List<Float> list, final SliderColors sliderColors, final float f2, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1679682785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i, -1, "androidx.compose.material.SliderImpl (Slider.kt:579)");
        }
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo326toPx0680j_4 = density.mo326toPx0680j_4(TrackHeight);
        float f3 = ThumbRadius;
        float fMo326toPx0680j_5 = density.mo326toPx0680j_4(f3);
        float fMo322toDpu2uoSUM = density.mo322toDpu2uoSUM(f2);
        float fM3775constructorimpl = Dp.m3775constructorimpl(f3 * 2);
        float fM3775constructorimpl2 = Dp.m3775constructorimpl(fMo322toDpu2uoSUM * f);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        int i2 = i >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, fMo326toPx0680j_5, fMo326toPx0680j_4, composerStartRestartGroup, (i2 & 112) | 265222 | ((i << 6) & 896) | ((i << 9) & 57344));
        m1177SliderThumbPcYyNuk(boxScopeInstance, companion2, fM3775constructorimpl2, mutableInteractionSource, sliderColors, z, fM3775constructorimpl, composerStartRestartGroup, (i2 & 7168) | 1572918 | ((i << 3) & 57344) | ((i << 15) & 458752));
        if (OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.SliderImpl.2
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
                SliderKt.SliderImpl(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1177SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(428907178);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        if ((2995931 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i2, -1, "androidx.compose.material.SliderThumb (Slider.kt:684)");
            }
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM482paddingqDBjuR0$default, companion.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i3 = i2 >> 9;
            int i4 = i3 & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableInteractionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i4 | 64);
            SpacerKt.Spacer(BackgroundKt.m170backgroundbw27NRU(ShadowKt.m1359shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m527sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, RippleKt.m1288rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z ? snapshotStateList.isEmpty() ^ true ? ThumbPressedElevation : ThumbDefaultElevation : Dp.m3775constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, composerStartRestartGroup, ((i2 >> 15) & 14) | (i3 & 112)).getValue().m1691unboximpl(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                SliderKt.m1177SliderThumbPcYyNuk(boxScope, modifier, f, mutableInteractionSource, sliderColors, z, f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f, final float f2, final List<Float> list, final float f3, final float f4, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1833126050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i, -1, "androidx.compose.material.Track (Slider.kt:730)");
        }
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        final State<Color> stateTrackColor = sliderColors.trackColor(z, false, composerStartRestartGroup, i2);
        final State<Color> stateTrackColor2 = sliderColors.trackColor(z, true, composerStartRestartGroup, i2);
        final State<Color> stateTickColor = sliderColors.tickColor(z, false, composerStartRestartGroup, i2);
        final State<Color> stateTickColor2 = sliderColors.tickColor(z, true, composerStartRestartGroup, i2);
        CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SliderKt.Track.1
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
                boolean z2 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long jOffset = OffsetKt.Offset(f3, Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()));
                long jOffset2 = OffsetKt.Offset(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc()) - f3, Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()));
                long j = z2 ? jOffset2 : jOffset;
                long j2 = z2 ? jOffset : jOffset2;
                long jM1691unboximpl = stateTrackColor.getValue().m1691unboximpl();
                float f5 = f4;
                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                long j3 = j2;
                long j4 = j;
                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(Canvas, jM1691unboximpl, j, j2, f5, companion.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(Canvas, stateTrackColor2.getValue().m1691unboximpl(), OffsetKt.Offset(((Offset.m1447getXimpl(j3) - Offset.m1447getXimpl(j4)) * f) + Offset.m1447getXimpl(j4), Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0())), OffsetKt.Offset(((Offset.m1447getXimpl(j3) - Offset.m1447getXimpl(j4)) * f2) + Offset.m1447getXimpl(j4), Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0())), f4, companion.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                List<Float> list2 = list;
                float f6 = f2;
                float f7 = f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Boolean boolValueOf = Boolean.valueOf(fFloatValue > f6 || fFloatValue < f7);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                State<Color> state = stateTickColor;
                State<Color> state2 = stateTickColor2;
                float f8 = f4;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(list3));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Offset.m1436boximpl(OffsetKt.Offset(Offset.m1447getXimpl(OffsetKt.m1470lerpWko1d7g(j4, j3, ((Number) it.next()).floatValue())), Offset.m1448getYimpl(Canvas.mo2117getCenterF1C5BW0()))));
                    }
                    long j5 = j3;
                    long j6 = j4;
                    androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo00o(Canvas, arrayList2, PointMode.INSTANCE.m1958getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m1691unboximpl(), f8, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    j4 = j6;
                    f8 = f8;
                    j3 = j5;
                }
            }
        }, composerStartRestartGroup, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt.Track.2
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
                SliderKt.Track(modifier, sliderColors, z, f, f2, list, f3, f4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object objOooO00o = androidx.compose.foundation.gestures.OooO00o.OooO00o(draggableState, null, new C07462(f, f2, f3, null), continuation, 1, null);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    public static final Object m1180awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            int i2 = sliderKt$awaitSlop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
            }
        } else {
            sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
        }
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$2 = sliderKt$awaitSlop$1;
        Object obj = sliderKt$awaitSlop$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sliderKt$awaitSlop$2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f) {
                    invoke(pointerInputChange, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull PointerInputChange pointerInput, float f) {
                    Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
                    pointerInput.consume();
                    floatRef2.element = f;
                }
            };
            sliderKt$awaitSlop$2.L$0 = floatRef2;
            sliderKt$awaitSlop$2.label = 1;
            Object objM1075awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m1075awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$2);
            if (objM1075awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM1075awaitHorizontalPointerSlopOrCancellationgDDlDlE;
            floatRef = floatRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) sliderKt$awaitSlop$2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C07471(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, f, state3, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, final boolean z, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final int i) {
        final float fCoerceIn = RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                if (!z) {
                    SemanticsPropertiesKt.disabled(semantics);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
                final int i2 = i;
                final float f2 = fCoerceIn;
                final Function1<Float, Unit> function2 = function1;
                final Function0<Unit> function3 = function0;
                SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material.SliderKt.sliderSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f3) {
                        return invoke(f3.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f3) {
                        int i3;
                        float fCoerceIn2 = RangesKt.coerceIn(f3, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        int i4 = i2;
                        boolean z2 = false;
                        if (i4 > 0 && (i3 = i4 + 1) >= 0) {
                            float fAbs = fCoerceIn2;
                            float f4 = fAbs;
                            int i5 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), i5 / (i2 + 1));
                                float f5 = fLerp - fCoerceIn2;
                                if (Math.abs(f5) <= fAbs) {
                                    fAbs = Math.abs(f5);
                                    f4 = fLerp;
                                }
                                if (i5 == i3) {
                                    break;
                                }
                                i5++;
                            }
                            fCoerceIn2 = f4;
                        }
                        if (!(fCoerceIn2 == f2)) {
                            function2.invoke(Float.valueOf(fCoerceIn2));
                            Function0<Unit> function4 = function3;
                            if (function4 != null) {
                                function4.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), f, closedFloatingPointRange, i);
    }

    public static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, Function1 function1, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        Function0 function2 = function0;
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, z, function1, function2, closedFloatingPointRange2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f, final boolean z, final State<Float> state, final State<? extends Function1<? super Float, Unit>> state2, final MutableState<Float> mutableState, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.compose.animation.OooOOO0.OooO00o(inspectorInfo, "$this$null", "sliderTapModifier").set("draggableState", draggableState);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Float.valueOf(f));
                androidx.compose.foundation.OooO00o.OooO00o(z, inspectorInfo.getProperties(), "isRtl", inspectorInfo).set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {910}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "pos", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {915}, m = "invokeSuspend", n = {}, s = {})
                public static final class C00971 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00971(boolean z, float f, MutableState<Float> mutableState, State<Float> state, Continuation<? super C00971> continuation) {
                        super(3, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                        return m1181invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m1181invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation<? super Unit> continuation) {
                        C00971 c00971 = new C00971(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                        c00971.L$0 = pressGestureScope;
                        c00971.J$0 = j;
                        return c00971.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j = this.J$0;
                                this.$pressOffset.setValue(Boxing.boxFloat((this.$isRtl ? this.$maxPx - Offset.m1447getXimpl(j) : Offset.m1447getXimpl(j)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(boolean z, float f, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00971 c00971 = new C00971(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final CoroutineScope coroutineScope = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<Function1<Float, Unit>> state = this.$gestureEndAction;
                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2.1.2

                            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", i = {}, l = {922}, m = "invokeSuspend", n = {}, s = {})
                            public static final class C00991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
                                int label;

                                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                public static final class C01001 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    public C01001(Continuation<? super C01001> continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        C01001 c01001 = new C01001(continuation);
                                        c01001.L$0 = obj;
                                        return c01001;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((C01001) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C00991(DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state, Continuation<? super C00991> continuation) {
                                    super(2, continuation);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new C00991(this.$draggableState, this.$gestureEndAction, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DraggableState draggableState = this.$draggableState;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C01001 c01001 = new C01001(null);
                                        this.label = 1;
                                        if (draggableState.drag(mutatePriority, c01001, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke(Boxing.boxFloat(0.0f));
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((C00991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m1182invokek4lQ0M(offset.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1182invokek4lQ0M(long j) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C00991(draggableState, state, null), 3, null);
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00971, function1, this, 3, null) == coroutine_suspended) {
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
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                if (OooOOO.OooO0O0(modifier2, "$this$composed", composer, 1945228890)) {
                    ComposerKt.traceEventStart(1945228890, i, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:905)");
                }
                if (z2) {
                    Object objOooO00o = OooOo00.OooO00o(composer, 773894976, -492369756);
                    if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
                    }
                    composer.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composer.endReplaceableGroup();
                    modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f), Boolean.valueOf(z)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(z, f, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifier2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, List<Float> list, float f2, float f3) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next).floatValue()) - f);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next2).floatValue()) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f4 = (Float) obj;
        return f4 != null ? MathHelpersKt.lerp(f2, f3, f4.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> stepsToTickFractions(int i) {
        if (i == 0) {
            return CollectionsKt.emptyList();
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(i3 / (i + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> scale(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3, float f4) {
        return RangesKt.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }
}
