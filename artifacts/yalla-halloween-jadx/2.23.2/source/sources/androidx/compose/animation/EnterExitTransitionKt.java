package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aT\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001aT\u0010\u001b\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001\u0000\u001aT\u0010\u001f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a\"\u0010#\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010$\u001a\u00020\u0004H\u0007\u001a\"\u0010%\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010'\u001a\u00020\u0004H\u0007\u001a9\u0010(\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aT\u00101\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001aT\u00104\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001\u0000\u001aT\u00106\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a>\u00108\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001\u0000\u001a@\u0010:\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a@\u0010<\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a>\u0010>\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001\u0000\u001a@\u0010@\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a@\u0010B\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a/\u0010D\u001a\u00020E*\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\u0010L\u001aB\u0010M\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u0006\u0010S\u001a\u00020KH\u0002\u001aB\u0010T\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u0006\u0010S\u001a\u00020KH\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020\u0012H\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020 H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006W²\u0006\n\u0010X\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010Z\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010[\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\\\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\\\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"DefaultAlpha", "Landroidx/compose/runtime/MutableFloatState;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "expandHorizontally", "Landroidx/compose/animation/EnterTransition;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "Landroidx/compose/animation/ExitTransition;", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "shrinkExpand", "transition", "expand", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "shrink", "labelPrefix", "slideInOut", "Landroidx/compose/animation/Slide;", "toAlignment", "animation_release", "shouldAnimateAlpha", "shouldAnimateScale", "alpha", "scale", "shouldAnimate"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1177:1\n36#2:1178\n36#2:1185\n25#2:1192\n25#2:1205\n67#2,3:1228\n66#2:1231\n36#2:1238\n1097#3,6:1179\n1097#3,6:1186\n1097#3,6:1193\n1097#3,6:1206\n1097#3,6:1232\n1097#3,6:1239\n940#4:1199\n858#4,5:1200\n940#4:1212\n858#4,5:1213\n853#4,10:1218\n81#5:1245\n107#5,2:1246\n81#5:1248\n107#5,2:1249\n81#5:1251\n81#5:1252\n81#5:1253\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n845#1:1178\n846#1:1185\n870#1:1192\n893#1:1205\n922#1:1228,3\n922#1:1231\n929#1:1238\n845#1:1179,6\n846#1:1186,6\n870#1:1193,6\n893#1:1206,6\n922#1:1232,6\n929#1:1239,6\n860#1:1199\n860#1:1200,5\n883#1:1212\n883#1:1213,5\n909#1:1218,10\n845#1:1245\n845#1:1246,2\n846#1:1248\n846#1:1249,2\n859#1:1251\n883#1:1252\n909#1:1253\n*E\n"})
public final class EnterExitTransitionKt {

    @NotNull
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m36invoke__ExYCQ(transformOrigin.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m36invoke__ExYCQ(long j) {
            return new AnimationVector2D(TransformOrigin.m2038getPivotFractionXimpl(j), TransformOrigin.m2039getPivotFractionYimpl(j));
        }
    }, new Function1<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m2030boximpl(m37invokeLIALnN8(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m37invokeLIALnN8(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TransformOriginKt.TransformOrigin(it.getV1(), it.getV2());
        }
    });

    @NotNull
    private static final MutableFloatState DefaultAlpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    @NotNull
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    @NotNull
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3884boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);

    @NotNull
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3927boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0329  */
    /* JADX WARN: Code duplicated, block: B:143:0x040b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0488  */
    /* JADX WARN: Code duplicated, block: B:199:0x0515  */
    /* JADX WARN: Code duplicated, block: B:53:0x01be  */
    /* JADX WARN: Code duplicated, block: B:79:0x0226  */
    @Composable
    @NotNull
    public static final Modifier createModifier(@NotNull Transition<EnterExitState> transition, @NotNull final EnterTransition enter, @NotNull final ExitTransition exit, @NotNull String label, @Nullable Composer composer, int i) {
        int i2;
        TransformOrigin transformOrigin;
        State stateCreateTransitionAnimation;
        float scale;
        TransformOrigin transformOriginM2030boximpl;
        TransformOrigin transformOriginM2030boximpl2;
        TransformOrigin transformOriginM2030boximpl3;
        long jM2043getCenterSzJe1aQ;
        float alpha;
        float alpha2;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(label, "label");
        composer.startReplaceableGroup(914000546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(914000546, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:819)");
        }
        Modifier modifierShrinkExpand = shrinkExpand(slideInOut(Modifier.INSTANCE, transition, SnapshotStateKt.rememberUpdatedState(enter.getData().getSlide(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData().getSlide(), composer, 0), label), transition, SnapshotStateKt.rememberUpdatedState(enter.getData().getChangeSize(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData().getChangeSize(), composer, 0), label);
        int i3 = i & 14;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        if (transition.getCurrentState() != transition.getTargetState() || transition.isSeeking()) {
            if (enter.getData().getFade() != null || exit.getData().getFade() != null) {
                createModifier$lambda$2(mutableState, true);
            }
            if (enter.getData().getScale() != null || exit.getData().getScale() != null) {
                createModifier$lambda$5(mutableState2, true);
            }
        } else {
            createModifier$lambda$2(mutableState, false);
            createModifier$lambda$5(mutableState2, false);
        }
        composer.startReplaceableGroup(1657241561);
        float scale2 = 1.0f;
        if (createModifier$lambda$1(mutableState)) {
            Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = new Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i4) {
                    FiniteAnimationSpec<Float> animationSpec;
                    Fade fade;
                    if (Oooo0.OooO00o(segment, "$this$animateFloat", composer2, -57153604)) {
                        ComposerKt.traceEventStart(-57153604, i4, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:860)");
                    }
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                        Fade fade2 = enter.getData().getFade();
                        if (fade2 == null || (animationSpec = fade2.getAnimationSpec()) == null) {
                            animationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                    } else if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit) || (fade = exit.getData().getFade()) == null || (animationSpec = fade.getAnimationSpec()) == null) {
                        animationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return animationSpec;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = label + " alpha";
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            String str = (String) objRememberedValue3;
            int i4 = i3 | 384;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i5 = i4 & 14;
            int i6 = i4 << 3;
            int i7 = (i6 & 57344) | i5 | (i6 & 896) | (i6 & 7168);
            composer.startReplaceableGroup(-142660079);
            int i8 = (i7 >> 9) & 112;
            EnterExitState currentState = transition.getCurrentState();
            composer.startReplaceableGroup(755689166);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755689166, i8, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:870)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i9 = iArr[currentState.ordinal()];
            if (i9 == 1) {
                alpha = 1.0f;
            } else if (i9 == 2) {
                Fade fade = enter.getData().getFade();
                if (fade != null) {
                    alpha = fade.getAlpha();
                } else {
                    alpha = 1.0f;
                }
            } else {
                if (i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Fade fade2 = exit.getData().getFade();
                if (fade2 != null) {
                    alpha = fade2.getAlpha();
                } else {
                    alpha = 1.0f;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            Float fValueOf = Float.valueOf(alpha);
            EnterExitState targetState = transition.getTargetState();
            composer.startReplaceableGroup(755689166);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755689166, i8, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:870)");
            }
            int i10 = iArr[targetState.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    Fade fade3 = enter.getData().getFade();
                    if (fade3 != null) {
                        alpha2 = fade3.getAlpha();
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Fade fade4 = exit.getData().getFade();
                    if (fade4 != null) {
                        alpha2 = fade4.getAlpha();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                i2 = -492369756;
                transformOrigin = null;
                stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(alpha2), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i7 >> 3) & 112)), vectorConverter, str, composer, (i7 & 14) | ((i7 << 9) & 57344) | ((i7 << 6) & 458752));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            alpha2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            i2 = -492369756;
            transformOrigin = null;
            stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(alpha2), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i7 >> 3) & 112)), vectorConverter, str, composer, (i7 & 14) | ((i7 << 9) & 57344) | ((i7 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            i2 = -492369756;
            transformOrigin = null;
            stateCreateTransitionAnimation = DefaultAlpha;
        }
        final State state = stateCreateTransitionAnimation;
        composer.endReplaceableGroup();
        if (createModifier$lambda$4(mutableState2)) {
            composer.startReplaceableGroup(1657242461);
            Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> function4 = new Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i11) {
                    FiniteAnimationSpec<Float> animationSpec;
                    Scale scale3;
                    if (Oooo0.OooO00o(segment, "$this$animateFloat", composer2, -53984035)) {
                        ComposerKt.traceEventStart(-53984035, i11, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:883)");
                    }
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                        Scale scale4 = enter.getData().getScale();
                        if (scale4 == null || (animationSpec = scale4.getAnimationSpec()) == null) {
                            animationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                    } else if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit) || (scale3 = exit.getData().getScale()) == null || (animationSpec = scale3.getAnimationSpec()) == null) {
                        animationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return animationSpec;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composer.startReplaceableGroup(i2);
            Object objRememberedValue4 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = label + " scale";
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            String str2 = (String) objRememberedValue4;
            int i11 = i3 | 384;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i12 = i11 & 14;
            int i13 = i11 << 3;
            int i14 = (i13 & 57344) | i12 | (i13 & 896) | (i13 & 7168);
            composer.startReplaceableGroup(-142660079);
            int i15 = (i14 >> 9) & 112;
            EnterExitState currentState2 = transition.getCurrentState();
            composer.startReplaceableGroup(-596129937);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596129937, i15, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:893)");
            }
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            int i16 = iArr2[currentState2.ordinal()];
            if (i16 == 1) {
                scale = 1.0f;
            } else if (i16 == 2) {
                Scale scale3 = enter.getData().getScale();
                if (scale3 != null) {
                    scale = scale3.getScale();
                } else {
                    scale = 1.0f;
                }
            } else {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scale4 = exit.getData().getScale();
                if (scale4 != null) {
                    scale = scale4.getScale();
                } else {
                    scale = 1.0f;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            Float fValueOf2 = Float.valueOf(scale);
            EnterExitState targetState2 = transition.getTargetState();
            composer.startReplaceableGroup(-596129937);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596129937, i15, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:893)");
            }
            int i17 = iArr2[targetState2.ordinal()];
            if (i17 != 1) {
                if (i17 == 2) {
                    Scale scale5 = enter.getData().getScale();
                    if (scale5 != null) {
                        scale2 = scale5.getScale();
                    }
                } else {
                    if (i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scale6 = exit.getData().getScale();
                    if (scale6 != null) {
                        scale2 = scale6.getScale();
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            final State stateCreateTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf2, Float.valueOf(scale2), function4.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter2, str2, composer, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (transition.getCurrentState() == EnterExitState.PreEnter) {
                Scale scale7 = enter.getData().getScale();
                if (scale7 == null && (scale7 = exit.getData().getScale()) == null) {
                    transformOriginM2030boximpl = transformOrigin;
                } else {
                    transformOriginM2030boximpl = TransformOrigin.m2030boximpl(scale7.m55getTransformOriginSzJe1aQ());
                }
            } else {
                Scale scale8 = exit.getData().getScale();
                if (scale8 == null && (scale8 = enter.getData().getScale()) == null) {
                    transformOriginM2030boximpl = transformOrigin;
                } else {
                    transformOriginM2030boximpl = TransformOrigin.m2030boximpl(scale8.m55getTransformOriginSzJe1aQ());
                }
            }
            TwoWayConverter<TransformOrigin, AnimationVector2D> twoWayConverter = TransformOriginVectorConverter;
            int i18 = i3 | 3136;
            composer.startReplaceableGroup(-142660079);
            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = new Function3<Transition.Segment<EnterExitState>, Composer, Integer, SpringSpec<TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1
                @Composable
                @NotNull
                public final SpringSpec<TransformOrigin> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i19) {
                    if (Oooo0.OooO00o(segment, "$this$null", composer2, -895531546)) {
                        ComposerKt.traceEventStart(-895531546, i19, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:852)");
                    }
                    SpringSpec<TransformOrigin> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            int i19 = (i18 >> 9) & 112;
            EnterExitState currentState3 = transition.getCurrentState();
            composer.startReplaceableGroup(-288165413);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288165413, i19, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:911)");
            }
            int i20 = iArr2[currentState3.ordinal()];
            if (i20 == 1) {
                transformOriginM2030boximpl2 = transformOriginM2030boximpl;
            } else if (i20 == 2) {
                Scale scale9 = enter.getData().getScale();
                if (scale9 == null && (scale9 = exit.getData().getScale()) == null) {
                    transformOriginM2030boximpl2 = transformOrigin;
                } else {
                    transformOriginM2030boximpl2 = TransformOrigin.m2030boximpl(scale9.m55getTransformOriginSzJe1aQ());
                }
            } else {
                if (i20 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scale10 = exit.getData().getScale();
                if (scale10 == null && (scale10 = enter.getData().getScale()) == null) {
                    transformOriginM2030boximpl2 = transformOrigin;
                } else {
                    transformOriginM2030boximpl2 = TransformOrigin.m2030boximpl(scale10.m55getTransformOriginSzJe1aQ());
                }
            }
            long packedValue = transformOriginM2030boximpl2 != null ? transformOriginM2030boximpl2.getPackedValue() : TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            TransformOrigin transformOriginM2030boximpl4 = TransformOrigin.m2030boximpl(packedValue);
            EnterExitState targetState3 = transition.getTargetState();
            composer.startReplaceableGroup(-288165413);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288165413, i19, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:911)");
            }
            int i21 = iArr2[targetState3.ordinal()];
            if (i21 != 1) {
                if (i21 == 2) {
                    Scale scale11 = enter.getData().getScale();
                    if (scale11 == null && (scale11 = exit.getData().getScale()) == null) {
                        transformOriginM2030boximpl3 = transformOrigin;
                    } else {
                        transformOriginM2030boximpl3 = TransformOrigin.m2030boximpl(scale11.m55getTransformOriginSzJe1aQ());
                    }
                } else {
                    if (i21 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scale12 = exit.getData().getScale();
                    if (scale12 == null && (scale12 = enter.getData().getScale()) == null) {
                        transformOriginM2030boximpl3 = transformOrigin;
                    } else {
                        transformOriginM2030boximpl3 = TransformOrigin.m2030boximpl(scale12.m55getTransformOriginSzJe1aQ());
                    }
                }
            }
            if (transformOriginM2030boximpl3 != null) {
                transformOriginM2030boximpl3 = transformOriginM2030boximpl;
                jM2043getCenterSzJe1aQ = transformOriginM2030boximpl3.getPackedValue();
            } else {
                transformOriginM2030boximpl3 = transformOriginM2030boximpl;
                jM2043getCenterSzJe1aQ = TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            final State stateCreateTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, transformOriginM2030boximpl4, TransformOrigin.m2030boximpl(jM2043getCenterSzJe1aQ), enterExitTransitionKt$createModifier$$inlined$animateValue$1.invoke(transition.getSegment(), composer, Integer.valueOf((i18 >> 3) & 112)), twoWayConverter, "TransformOriginInterruptionHandling", composer, (i18 & 14) | ((i18 << 9) & 57344) | ((i18 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1618982084);
            boolean zChanged3 = composer.changed(state) | composer.changed(stateCreateTransitionAnimation2) | composer.changed(stateCreateTransitionAnimation3);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.setAlpha(EnterExitTransitionKt.createModifier$lambda$8(state));
                        graphicsLayer.setScaleX(EnterExitTransitionKt.createModifier$lambda$11(stateCreateTransitionAnimation2));
                        graphicsLayer.setScaleY(EnterExitTransitionKt.createModifier$lambda$11(stateCreateTransitionAnimation2));
                        graphicsLayer.mo1850setTransformOrigin__ExYCQ(EnterExitTransitionKt.createModifier$lambda$13(stateCreateTransitionAnimation3));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            modifierShrinkExpand = GraphicsLayerModifierKt.graphicsLayer(modifierShrinkExpand, (Function1) objRememberedValue5);
            composer.endReplaceableGroup();
        } else if (createModifier$lambda$1(mutableState)) {
            composer.startReplaceableGroup(1657244550);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged4 = composer.changed(state);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.setAlpha(EnterExitTransitionKt.createModifier$lambda$8(state));
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            modifierShrinkExpand = GraphicsLayerModifierKt.graphicsLayer(modifierShrinkExpand, (Function1) objRememberedValue6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1657244642);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierShrinkExpand;
    }

    private static final boolean createModifier$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createModifier$lambda$13(State<TransformOrigin> state) {
        return state.getValue().getPackedValue();
    }

    private static final void createModifier$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean createModifier$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createModifier$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal expandFrom, boolean z, @NotNull final Function1<? super Integer, Integer> initialWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialWidth, "initialWidth");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3927boximpl(m38invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m38invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(initialWidth.invoke(Integer.valueOf(IntSize.m3935getWidthimpl(j))).intValue(), IntSize.m3934getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3927boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment expandFrom, boolean z, @NotNull Function1<? super IntSize, IntSize> initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3927boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandIn.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m3927boximpl(m39invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m39invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical expandFrom, boolean z, @NotNull final Function1<? super Integer, Integer> initialHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3927boximpl(m40invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m40invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m3935getWidthimpl(j), initialHeight.invoke(Integer.valueOf(IntSize.m3934getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3927boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m32scaleInL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, animationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m33scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ();
        }
        return m32scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m34scaleOutL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, animationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m35scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ();
        }
        return m34scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    private static final Modifier shrinkExpand(Modifier modifier, final Transition<EnterExitState> transition, final State<ChangeSize> state, final State<ChangeSize> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                Alignment alignment;
                Modifier modifierThen = modifier2;
                if (OooOOO.OooO0O0(modifierThen, "$this$composed", composer, -140634085)) {
                    ComposerKt.traceEventStart(-140634085, i, -1, "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1030)");
                }
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(transition2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                boolean z = true;
                if (transition.getCurrentState() == transition.getTargetState() && !transition.isSeeking()) {
                    invoke$lambda$2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    invoke$lambda$2(mutableState, true);
                }
                if (invoke$lambda$1(mutableState)) {
                    boolean zIsTransitioningTo = transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible);
                    State<ChangeSize> state3 = state;
                    State<ChangeSize> state4 = state2;
                    if (zIsTransitioningTo) {
                        ChangeSize value = state3.getValue();
                        if (value == null || (alignment = value.getAlignment()) == null) {
                            ChangeSize value2 = state4.getValue();
                            if (value2 != null) {
                                alignment = value2.getAlignment();
                            } else {
                                alignment = null;
                            }
                        }
                    } else {
                        ChangeSize value3 = state4.getValue();
                        if (value3 == null || (alignment = value3.getAlignment()) == null) {
                            ChangeSize value4 = state3.getValue();
                            if (value4 != null) {
                                alignment = value4.getAlignment();
                            } else {
                                alignment = null;
                            }
                        }
                    }
                    State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(alignment, composer, 0);
                    Transition<EnterExitState> transition3 = transition;
                    TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
                    String str2 = str;
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = str2 + " shrink/expand";
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter, (String) objRememberedValue2, composer, 448, 0);
                    composer.startMovableGroup(-1553213689, Boolean.valueOf(transition.getCurrentState() == transition.getTargetState()));
                    Transition<EnterExitState> transition4 = transition;
                    TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                    String str3 = str;
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = str3 + " InterruptionHandlingOffset";
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition4, vectorConverter2, (String) objRememberedValue3, composer, 448, 0);
                    composer.endMovableGroup();
                    Transition<EnterExitState> transition5 = transition;
                    State<ChangeSize> state5 = state;
                    State<ChangeSize> state6 = state2;
                    composer.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer.changed(transition5);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new ExpandShrinkModifier(deferredAnimationCreateDeferredAnimation, deferredAnimationCreateDeferredAnimation2, state5, state6, stateRememberUpdatedState);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceableGroup();
                    ExpandShrinkModifier expandShrinkModifier = (ExpandShrinkModifier) objRememberedValue4;
                    if (transition.getCurrentState() == transition.getTargetState()) {
                        expandShrinkModifier.setCurrentAlignment(null);
                    } else if (expandShrinkModifier.getCurrentAlignment() == null) {
                        Alignment topStart = (Alignment) stateRememberUpdatedState.getValue();
                        if (topStart == null) {
                            topStart = Alignment.INSTANCE.getTopStart();
                        }
                        expandShrinkModifier.setCurrentAlignment(topStart);
                    }
                    ChangeSize value5 = state.getValue();
                    if (!((value5 == null || value5.getClip()) ? false : true)) {
                        ChangeSize value6 = state2.getValue();
                        if (!((value6 == null || value6.getClip()) ? false : true)) {
                            z = false;
                        }
                    }
                    Modifier modifierClipToBounds = Modifier.INSTANCE;
                    if (!z) {
                        modifierClipToBounds = ClipKt.clipToBounds(modifierClipToBounds);
                    }
                    modifierThen = modifierThen.then(modifierClipToBounds).then(expandShrinkModifier);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal shrinkTowards, boolean z, @NotNull final Function1<? super Integer, Integer> targetWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3927boximpl(m41invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m41invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(targetWidth.invoke(Integer.valueOf(IntSize.m3935getWidthimpl(j))).intValue(), IntSize.m3934getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3927boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment shrinkTowards, boolean z, @NotNull Function1<? super IntSize, IntSize> targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3927boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m3927boximpl(m42invokemzRDjE0(intSize.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m42invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical shrinkTowards, boolean z, @NotNull final Function1<? super Integer, Integer> targetHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3927boximpl(m43invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m43invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m3935getWidthimpl(j), targetHeight.invoke(Integer.valueOf(IntSize.m3934getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m3927boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3884boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetX, "initialOffsetX");
        return slideIn(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3884boximpl(m44invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m44invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(initialOffsetX.invoke(Integer.valueOf(IntSize.m3935getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3884boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    private static final Modifier slideInOut(Modifier modifier, final Transition<EnterExitState> transition, final State<Slide> state, final State<Slide> state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                return mutableState.getValue().booleanValue();
            }

            private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                if (OooOOO.OooO0O0(modifier2, "$this$composed", composer, 158379472)) {
                    ComposerKt.traceEventStart(158379472, i, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:949)");
                }
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(transition2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                if (transition.getCurrentState() == transition.getTargetState() && !transition.isSeeking()) {
                    invoke$lambda$2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    invoke$lambda$2(mutableState, true);
                }
                if (invoke$lambda$1(mutableState)) {
                    Transition<EnterExitState> transition3 = transition;
                    TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                    String str2 = str;
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = str2 + " slide";
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter, (String) objRememberedValue2, composer, 448, 0);
                    Transition<EnterExitState> transition4 = transition;
                    State<Slide> state3 = state;
                    State<Slide> state4 = state2;
                    composer.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer.changed(transition4);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new SlideModifier(deferredAnimationCreateDeferredAnimation, state3, state4);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    modifier2 = modifier2.then((SlideModifier) objRememberedValue3);
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
        }, 1, null);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> initialOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetY, "initialOffsetY");
        return slideIn(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3884boximpl(m45invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m45invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, initialOffsetY.invoke(Integer.valueOf(IntSize.m3934getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3884boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3884boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetX, "targetOffsetX");
        return slideOut(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3884boximpl(m46invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m46invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(targetOffsetX.invoke(Integer.valueOf(IntSize.m3935getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3884boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull final Function1<? super Integer, Integer> targetOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetY, "targetOffsetY");
        return slideOut(animationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m3884boximpl(m47invokemHKZG7I(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m47invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, targetOffsetY.invoke(Integer.valueOf(IntSize.m3934getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m3884boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1
                @NotNull
                public final Integer invoke(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(horizontal, companion.getStart())) {
            return companion.getCenterStart();
        }
        return Intrinsics.areEqual(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(vertical, companion.getTop())) {
            return companion.getTopCenter();
        }
        return Intrinsics.areEqual(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
