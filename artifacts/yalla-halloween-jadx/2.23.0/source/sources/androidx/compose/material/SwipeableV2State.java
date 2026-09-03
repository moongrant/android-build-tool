package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 h*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001hB\u007f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u0012.\b\u0002\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014J#\u0010T\u001a\u00020U2\u0006\u0010O\u001a\u00028\u00002\b\b\u0002\u0010V\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010WJ%\u0010X\u001a\u00028\u00002\u0006\u0010D\u001a\u00020\u00062\u0006\u0010(\u001a\u00028\u00002\u0006\u0010V\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010YJ\u000e\u0010Z\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u0006J\u0013\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00028\u0000¢\u0006\u0002\u0010^J\b\u0010_\u001a\u00020\u000fH\u0002J\u0006\u0010`\u001a\u00020\u0006J\u0019\u0010a\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010bJ\u0019\u0010c\u001a\u00020U2\u0006\u0010O\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010dJ!\u0010e\u001a\u00020\f2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0016H\u0000¢\u0006\u0002\bgRC\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00162\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR/\u0010 \u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R+\u0010(\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010,\u001a\u0004\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u000202X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u00106R+\u00107\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u001d\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001b\u0010=\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b>\u00109R\u001b\u0010A\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bB\u00109R/\u0010D\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u001d\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR:\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001b\u0010L\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\bM\u00109R\u001b\u0010O\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bP\u0010\"R\u001f\u0010\u0012\u001a\u00020\u0013X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010S\u001a\u0004\bR\u00109\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/material/SwipeableV2State;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "totalDistance", "Lkotlin/ExtensionFunctionType;", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "", "anchors", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationTarget", "getAnimationTarget", "()Ljava/lang/Object;", "setAnimationTarget", "(Ljava/lang/Object;)V", "animationTarget$delegate", "getConfirmValueChange$material_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "setCurrentValue", "currentValue$delegate", "density", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "maxOffset", "getMaxOffset", "maxOffset$delegate", "Landroidx/compose/runtime/State;", "minOffset", "getMinOffset", "minOffset$delegate", "offset", "getOffset", "()Ljava/lang/Float;", "setOffset", "(Ljava/lang/Float;)V", "offset$delegate", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function2;", "progress", "getProgress", "progress$delegate", "targetValue", "getTargetValue", "targetValue$delegate", "getVelocityThreshold-D9Ej5fM$material_release", "F", "animateTo", "", "velocity", "(Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "dispatchRawDelta", "delta", "hasAnchorForValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/Object;)Z", "requireDensity", "requireOffset", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAnchors", "newAnchors", "updateAnchors$material_release", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n76#2:656\n102#2,2:657\n76#2:659\n76#2:660\n102#2,2:661\n76#2:663\n76#2:664\n102#2,2:665\n76#2:667\n76#2:668\n76#2:669\n102#2,2:670\n76#2:672\n102#2,2:673\n288#3,2:675\n1#4:677\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n*L\n169#1:656\n169#1:657,2\n177#1:659\n200#1:660\n200#1:661,2\n223#1:663\n240#1:664\n240#1:665,2\n247#1:667\n253#1:668\n255#1:669\n255#1:670,2\n260#1:672\n260#1:673,2\n354#1:675,2\n*E\n"})
public final class SwipeableV2State<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: anchors$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState anchors;

    @NotNull
    private final AnimationSpec<Float> animationSpec;

    /* JADX INFO: renamed from: animationTarget$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animationTarget;

    @NotNull
    private final Function1<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: currentValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentValue;

    @Nullable
    private Density density;

    @NotNull
    private final DraggableState draggableState;

    /* JADX INFO: renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState lastVelocity;

    /* JADX INFO: renamed from: maxOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final State maxOffset;

    /* JADX INFO: renamed from: minOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final State minOffset;

    /* JADX INFO: renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState offset;

    @NotNull
    private final Function2<Density, Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final State progress;

    /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetValue;
    private final float velocityThreshold;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0089\u0001\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2,\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SwipeableV2State$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableV2State;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ParameterName;", "name", "distance", "Lkotlin/ExtensionFunctionType;", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "Saver-eqLRuRQ", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;F)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterialApi
        @NotNull
        /* JADX INFO: renamed from: Saver-eqLRuRQ, reason: not valid java name */
        public final <T> Saver<SwipeableV2State<T>, T> m1202SavereqLRuRQ(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final Function1<? super T, Boolean> confirmValueChange, @NotNull final Function2<? super Density, ? super Float, Float> positionalThreshold, final float velocityThreshold) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            return SaverKt.Saver(new Function2<SaverScope, SwipeableV2State<T>, T>() { // from class: androidx.compose.material.SwipeableV2State$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final T invoke(@NotNull SaverScope Saver, @NotNull SwipeableV2State<T> it) {
                    Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new Function1<T, SwipeableV2State<T>>() { // from class: androidx.compose.material.SwipeableV2State$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final SwipeableV2State<T> invoke(@NotNull T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new SwipeableV2State<>(it, animationSpec, confirmValueChange, positionalThreshold, velocityThreshold, null);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$animateTo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableV2State", f = "SwipeableV2.kt", i = {0}, l = {335}, m = "animateTo", n = {"this"}, s = {"L$0"})
    public static final class C07841 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07841(SwipeableV2State<T> swipeableV2State, Continuation<? super C07841> continuation) {
            super(continuation);
            this.this$0 = swipeableV2State;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.animateTo(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$animateTo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SwipeableV2State$animateTo$2", f = "SwipeableV2.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Float $targetOffset;
        final /* synthetic */ T $targetValue;
        final /* synthetic */ float $velocity;
        int label;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SwipeableV2State<T> swipeableV2State, T t, Float f, float f2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = swipeableV2State;
            this.$targetValue = t;
            this.$targetOffset = f;
            this.$velocity = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$targetValue, this.$targetOffset, this.$velocity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setAnimationTarget(this.$targetValue);
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                Float offset = this.this$0.getOffset();
                float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
                floatRef.element = fFloatValue;
                float fFloatValue2 = this.$targetOffset.floatValue();
                float f = this.$velocity;
                AnimationSpec<Float> animationSpec$material_release = this.this$0.getAnimationSpec$material_release();
                final SwipeableV2State<T> swipeableV2State = this.this$0;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material.SwipeableV2State.animateTo.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                        invoke(f2.floatValue(), f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f2, float f3) {
                        swipeableV2State.setOffset(Float.valueOf(f2));
                        floatRef.element = f2;
                        swipeableV2State.setLastVelocity(f3);
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animate(fFloatValue, fFloatValue2, f, animationSpec$material_release, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.setLastVelocity(0.0f);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$snapTo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableV2State", f = "SwipeableV2.kt", i = {0, 0}, l = {304}, m = "snapTo", n = {"this", "targetValue"}, s = {"L$0", "L$1"})
    public static final class C07851 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07851(SwipeableV2State<T> swipeableV2State, Continuation<? super C07851> continuation) {
            super(continuation);
            this.this$0 = swipeableV2State;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.snapTo(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$snapTo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SwipeableV2State$snapTo$2", f = "SwipeableV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C07862 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Float $targetOffset;
        final /* synthetic */ T $targetValue;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07862(SwipeableV2State<T> swipeableV2State, T t, Float f, Continuation<? super C07862> continuation) {
            super(2, continuation);
            this.this$0 = swipeableV2State;
            this.$targetValue = t;
            this.$targetOffset = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C07862 c07862 = new C07862(this.this$0, this.$targetValue, this.$targetOffset, continuation);
            c07862.L$0 = obj;
            return c07862;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07862) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DragScope dragScope = (DragScope) this.L$0;
            this.this$0.setAnimationTarget(this.$targetValue);
            dragScope.dragBy(this.$targetOffset.floatValue() - this.this$0.requireOffset());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 function1, Function2 function2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, animationSpec, function1, function2, f);
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float offset, T currentValue, float velocity) {
        Object objClosestAnchor;
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f = anchors$material_release.get(currentValue);
        Density densityRequireDensity = requireDensity();
        float fMo324toPx0680j_4 = densityRequireDensity.mo324toPx0680j_4(this.velocityThreshold);
        if (Intrinsics.areEqual(f, offset) || f == null) {
            return currentValue;
        }
        if (f.floatValue() < offset) {
            if (velocity >= fMo324toPx0680j_4) {
                return (T) SwipeableV2Kt.closestAnchor(anchors$material_release, offset, true);
            }
            objClosestAnchor = SwipeableV2Kt.closestAnchor(anchors$material_release, offset, true);
            if (offset < Math.abs(f.floatValue() + Math.abs(this.positionalThreshold.invoke(densityRequireDensity, Float.valueOf(Math.abs(((Number) MapsKt.getValue(anchors$material_release, objClosestAnchor)).floatValue() - f.floatValue()))).floatValue()))) {
                return currentValue;
            }
        } else {
            if (velocity <= (-fMo324toPx0680j_4)) {
                return (T) SwipeableV2Kt.closestAnchor(anchors$material_release, offset, false);
            }
            objClosestAnchor = SwipeableV2Kt.closestAnchor(anchors$material_release, offset, false);
            float fAbs = Math.abs(f.floatValue() - Math.abs(this.positionalThreshold.invoke(densityRequireDensity, Float.valueOf(Math.abs(f.floatValue() - ((Number) MapsKt.getValue(anchors$material_release, objClosestAnchor)).floatValue()))).floatValue()));
            if (offset < 0.0f) {
                if (Math.abs(offset) < fAbs) {
                    return currentValue;
                }
            } else if (offset > fAbs) {
                return currentValue;
            }
        }
        return (T) objClosestAnchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getAnimationTarget() {
        return this.animationTarget.getValue();
    }

    private final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationTarget(T t) {
        this.animationTarget.setValue(t);
    }

    private final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(Float f) {
        this.offset.setValue(f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x010a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object animateTo(T t, float f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C07841 c07841;
        T t2;
        boolean z;
        SwipeableV2State swipeableV2State;
        SwipeableV2State swipeableV2State2;
        float fRequireOffset;
        Iterator<T> it;
        T next;
        Map.Entry entry;
        Object currentValue;
        boolean z2;
        float fRequireOffset2;
        Iterator<T> it2;
        T next2;
        Map.Entry entry2;
        Object currentValue2;
        boolean z3;
        if (continuation instanceof C07841) {
            c07841 = (C07841) continuation;
            int i = c07841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c07841.label = i - Integer.MIN_VALUE;
            } else {
                c07841 = new C07841(this, continuation);
            }
        } else {
            c07841 = new C07841(this, continuation);
        }
        C07841 c07842 = c07841;
        Object obj = c07842.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c07842.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Float f2 = getAnchors$material_release().get(t);
            if (f2 != null) {
                try {
                    DraggableState draggableState = this.draggableState;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, t, f2, f, null);
                    c07842.L$0 = this;
                    c07842.label = 1;
                    t2 = null;
                    z = true;
                    try {
                        if (androidx.compose.foundation.gestures.OooO00o.OooO00o(draggableState, null, anonymousClass2, c07842, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableV2State2 = this;
                        swipeableV2State2.setAnimationTarget(t2);
                        fRequireOffset2 = swipeableV2State2.requireOffset();
                        it2 = swipeableV2State2.getAnchors$material_release().entrySet().iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = t2;
                                break;
                            }
                            next2 = it2.next();
                            if (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - fRequireOffset2) < 0.5f) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                        } while (!z3);
                        entry2 = (Map.Entry) next2;
                        if (entry2 != null) {
                            currentValue2 = entry2.getKey();
                        } else {
                            currentValue2 = t2;
                        }
                        if (currentValue2 == null) {
                            currentValue2 = swipeableV2State2.getCurrentValue();
                        }
                        swipeableV2State2.setCurrentValue(currentValue2);
                    } catch (Throwable th) {
                        th = th;
                        swipeableV2State = this;
                        swipeableV2State.setAnimationTarget(t2);
                        fRequireOffset = swipeableV2State.requireOffset();
                        it = swipeableV2State.getAnchors$material_release().entrySet().iterator();
                        do {
                            if (it.hasNext()) {
                                next = t2;
                                break;
                            }
                            next = it.next();
                            if (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - fRequireOffset) < 0.5f) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                        } while (!z2);
                        entry = (Map.Entry) next;
                        if (entry != null) {
                            currentValue = entry.getKey();
                        } else {
                            currentValue = t2;
                        }
                        if (currentValue == null) {
                            currentValue = swipeableV2State.getCurrentValue();
                        }
                        swipeableV2State.setCurrentValue(currentValue);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    t2 = null;
                    z = true;
                }
            } else {
                setCurrentValue(t);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SwipeableV2State swipeableV2State3 = (SwipeableV2State) c07842.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                t2 = null;
                z = true;
                swipeableV2State2 = swipeableV2State3;
                swipeableV2State2.setAnimationTarget(t2);
                fRequireOffset2 = swipeableV2State2.requireOffset();
                it2 = swipeableV2State2.getAnchors$material_release().entrySet().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = t2;
                        break;
                    }
                    next2 = it2.next();
                    if (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - fRequireOffset2) < 0.5f) {
                        z3 = z;
                    } else {
                        z3 = false;
                    }
                } while (!z3);
                entry2 = (Map.Entry) next2;
                if (entry2 != null) {
                    currentValue2 = entry2.getKey();
                } else {
                    currentValue2 = t2;
                }
                if (currentValue2 == null) {
                    currentValue2 = swipeableV2State2.getCurrentValue();
                }
                swipeableV2State2.setCurrentValue(currentValue2);
            } catch (Throwable th3) {
                th = th3;
                t2 = null;
                z = true;
                swipeableV2State = swipeableV2State3;
                swipeableV2State.setAnimationTarget(t2);
                fRequireOffset = swipeableV2State.requireOffset();
                it = swipeableV2State.getAnchors$material_release().entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        next = t2;
                        break;
                    }
                    next = it.next();
                    if (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - fRequireOffset) < 0.5f) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                } while (!z2);
                entry = (Map.Entry) next;
                if (entry != null) {
                    currentValue = entry.getKey();
                } else {
                    currentValue = t2;
                }
                if (currentValue == null) {
                    currentValue = swipeableV2State.getCurrentValue();
                }
                swipeableV2State.setCurrentValue(currentValue);
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final float dispatchRawDelta(float delta) {
        Float offset = getOffset();
        float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
        float fCoerceIn = RangesKt.coerceIn(delta + fFloatValue, getMinOffset(), getMaxOffset()) - fFloatValue;
        if (Math.abs(fCoerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(fCoerceIn);
        }
        return fCoerceIn;
    }

    @NotNull
    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.anchors.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$material_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    /* JADX INFO: renamed from: getDraggableState$material_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return ((Number) this.lastVelocity.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset.getValue()).floatValue();
    }

    @Nullable
    public final Float getOffset() {
        return (Float) this.offset.getValue();
    }

    @NotNull
    public final Function2<Density, Float, Float> getPositionalThreshold$material_release() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$material_release, reason: not valid java name and from getter */
    public final float getVelocityThreshold() {
        return this.velocityThreshold;
    }

    public final boolean hasAnchorForValue(T value) {
        return getAnchors$material_release().containsKey(value);
    }

    public final boolean isAnimationRunning() {
        return getAnimationTarget() != null;
    }

    public final float requireOffset() {
        Float offset = getOffset();
        if (offset != null) {
            return offset.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material_release(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.density = density;
    }

    @Nullable
    public final Object settle(float f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
            Object objAnimateTo = animateTo(tComputeTarget, f, continuation);
            return objAnimateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
        }
        Object objAnimateTo2 = animateTo(currentValue, f, continuation);
        return objAnimateTo2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo2 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object snapTo(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C07851 c07851;
        SwipeableV2State<T> swipeableV2State;
        if (continuation instanceof C07851) {
            c07851 = (C07851) continuation;
            int i = c07851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c07851.label = i - Integer.MIN_VALUE;
            } else {
                c07851 = new C07851(this, continuation);
            }
        } else {
            c07851 = new C07851(this, continuation);
        }
        C07851 c07852 = c07851;
        Object obj = c07852.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c07852.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Float f = getAnchors$material_release().get(t);
            if (f != null) {
                try {
                    DraggableState draggableState = this.draggableState;
                    C07862 c07862 = new C07862(this, t, f, null);
                    c07852.L$0 = this;
                    c07852.L$1 = t;
                    c07852.label = 1;
                    if (androidx.compose.foundation.gestures.OooO00o.OooO00o(draggableState, null, c07862, c07852, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    swipeableV2State = this;
                } catch (Throwable th) {
                    th = th;
                    swipeableV2State = this;
                    swipeableV2State.setAnimationTarget(null);
                    throw th;
                }
            } else {
                setCurrentValue(t);
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t = (T) c07852.L$1;
        swipeableV2State = (SwipeableV2State) c07852.L$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Throwable th2) {
            th = th2;
            swipeableV2State.setAnimationTarget(null);
            throw th;
        }
        swipeableV2State.setCurrentValue(t);
        swipeableV2State.setAnimationTarget(null);
        return Unit.INSTANCE;
    }

    public final boolean updateAnchors$material_release(@NotNull Map<T, Float> newAnchors) {
        boolean z;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        boolean zIsEmpty = getAnchors$material_release().isEmpty();
        setAnchors$material_release(newAnchors);
        if (zIsEmpty) {
            Float f = getAnchors$material_release().get(getCurrentValue());
            z = f != null;
            if (z) {
                setOffset(f);
            }
        } else {
            z = true;
        }
        return (z && zIsEmpty) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SwipeableV2State(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, Function2<? super Density, ? super Float, Float> function2, float f) {
        this.animationSpec = animationSpec;
        this.confirmValueChange = function1;
        this.positionalThreshold = function2;
        this.velocityThreshold = f;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material.SwipeableV2State$targetValue$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                T t2 = (T) this.this$0.getAnimationTarget();
                if (t2 != null) {
                    return t2;
                }
                SwipeableV2State<T> swipeableV2State = this.this$0;
                Float offset = swipeableV2State.getOffset();
                return offset != null ? (T) swipeableV2State.computeTarget(offset.floatValue(), swipeableV2State.getCurrentValue(), 0.0f) : swipeableV2State.getCurrentValue();
            }
        });
        this.offset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.progress = SnapshotStateKt.derivedStateOf(new Function0<Float>(this) { // from class: androidx.compose.material.SwipeableV2State$progress$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code duplicated, block: B:19:0x005a  */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                Float f2 = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getCurrentValue());
                float f3 = 0.0f;
                float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
                Float f4 = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getTargetValue());
                float fFloatValue2 = (f4 != null ? f4.floatValue() : 0.0f) - fFloatValue;
                if (Math.abs(fFloatValue2) > 1.0E-6f) {
                    float fRequireOffset = (this.this$0.requireOffset() - fFloatValue) / fFloatValue2;
                    if (fRequireOffset >= 1.0E-6f) {
                        if (fRequireOffset > 0.999999f) {
                            f3 = 1.0f;
                        } else {
                            f3 = fRequireOffset;
                        }
                    }
                } else {
                    f3 = 1.0f;
                }
                return Float.valueOf(f3);
            }
        });
        this.lastVelocity = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.minOffset = SnapshotStateKt.derivedStateOf(new Function0<Float>(this) { // from class: androidx.compose.material.SwipeableV2State$minOffset$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                Float fMinOrNull = SwipeableV2Kt.minOrNull(this.this$0.getAnchors$material_release());
                return Float.valueOf(fMinOrNull != null ? fMinOrNull.floatValue() : Float.NEGATIVE_INFINITY);
            }
        });
        this.maxOffset = SnapshotStateKt.derivedStateOf(new Function0<Float>(this) { // from class: androidx.compose.material.SwipeableV2State$maxOffset$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                Float fMaxOrNull = SwipeableV2Kt.maxOrNull(this.this$0.getAnchors$material_release());
                return Float.valueOf(fMaxOrNull != null ? fMaxOrNull.floatValue() : Float.POSITIVE_INFINITY);
            }
        });
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new Function1<Float, Unit>(this) { // from class: androidx.compose.material.SwipeableV2State$draggableState$1
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                invoke(f2.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2) {
                SwipeableV2State<T> swipeableV2State = this.this$0;
                Float offset = swipeableV2State.getOffset();
                swipeableV2State.setOffset(Float.valueOf(RangesKt.coerceIn((offset != null ? offset.floatValue() : 0.0f) + f2, this.this$0.getMinOffset(), this.this$0.getMaxOffset())));
            }
        });
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 function1, Function2 function2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableV2Defaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableV2State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(T t) {
                return Boolean.TRUE;
            }
        } : function1, (i & 8) != 0 ? SwipeableV2Defaults.INSTANCE.getPositionalThreshold() : function2, (i & 16) != 0 ? SwipeableV2Defaults.INSTANCE.m1198getVelocityThresholdD9Ej5fM() : f, null);
    }
}
