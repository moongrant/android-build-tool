package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0016J\b\u0010%\u001a\u00020&H\u0002J%\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\n\u0010,\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u001dH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J \u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0002J%\u00107\u001a\u0002082\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\"\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020=H\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\"\u0010;\u001a\u00020<*\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dH\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010@J#\u0010B\u001a\u00020\u000b*\u00020\u00152\b\b\u0002\u00101\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\u00020\u001dX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "reverseDirection", "", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "animationState", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "focusedChildBoundsFromPreviousRemeasure", "Landroidx/compose/ui/geometry/Rect;", "isAnimationRunning", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "trackingFocusedChild", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "J", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "calculateScrollDelta", "", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "findBringIntoViewRequest", "getFocusedChildBounds", "launchAnimation", "onPlaced", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "relocationDistance", "leadingEdge", "trailingEdge", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "compareTo", "", "Landroidx/compose/ui/geometry/Size;", "other", "compareTo-iLBOSCw", "(JJ)I", "compareTo-TemP2vQ", "isMaxVisible", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n314#2,11:428\n1#3:439\n106#4,2:440\n108#4:453\n492#5,11:442\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n*L\n129#1:428,11\n326#1:440,2\n326#1:453\n326#1:442,11\n*E\n"})
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {

    @NotNull
    private final UpdatableAnimationState animationState;

    @NotNull
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests;

    @Nullable
    private LayoutCoordinates coordinates;

    @Nullable
    private LayoutCoordinates focusedChild;

    @Nullable
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;

    @NotNull
    private final Modifier modifier;

    @NotNull
    private final Orientation orientation;
    private final boolean reverseDirection;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final ScrollableState scrollState;
    private boolean trackingFocusedChild;
    private long viewportSize;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1#2:428\n*E\n"})
    public static final class Request {

        @NotNull
        private final CancellableContinuation<Unit> continuation;

        @NotNull
        private final Function0<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(@NotNull Function0<Rect> currentBounds, @NotNull CancellableContinuation<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(currentBounds, "currentBounds");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.currentBounds = currentBounds;
            this.continuation = continuation;
        }

        @NotNull
        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        @NotNull
        public String toString() {
            String strOooO00o;
            CoroutineName coroutineName = (CoroutineName) this.continuation.get$context().get(CoroutineName.INSTANCE);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb = new StringBuilder("Request@");
            String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            sb.append(string);
            if (name == null || (strOooO00o = o000oOoO.OooO00o("[", name, "](")) == null) {
                strOooO00o = "(";
            }
            sb.append(strOooO00o);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00411 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $animationJob;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00411(ContentInViewModifier contentInViewModifier, Job job, Continuation<? super C00411> continuation) {
                super(2, continuation);
                this.this$0 = contentInViewModifier;
                this.$animationJob = job;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00411 c00411 = new C00411(this.this$0, this.$animationJob, continuation);
                c00411.L$0 = obj;
                return c00411;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C00411) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final ScrollScope scrollScope = (ScrollScope) this.L$0;
                    this.this$0.animationState.setValue(this.this$0.calculateScrollDelta());
                    UpdatableAnimationState updatableAnimationState = this.this$0.animationState;
                    final ContentInViewModifier contentInViewModifier = this.this$0;
                    final Job job = this.$animationJob;
                    Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                            invoke(f.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f) {
                            float f2 = contentInViewModifier.reverseDirection ? 1.0f : -1.0f;
                            float fScrollBy = scrollScope.scrollBy(f2 * f) * f2;
                            if (fScrollBy < f) {
                                JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fScrollBy + " < " + f + ')', null, 2, null);
                            }
                        }
                    };
                    final ContentInViewModifier contentInViewModifier2 = this.this$0;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.2
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
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewModifier2.bringIntoViewRequests;
                            ContentInViewModifier contentInViewModifier3 = contentInViewModifier2;
                            while (true) {
                                if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                                    break;
                                }
                                Rect rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                if (!(rectInvoke == null ? true : ContentInViewModifier.m261isMaxVisibleO0kMr_c$default(contentInViewModifier3, rectInvoke, 0L, 1, null))) {
                                    break;
                                } else {
                                    ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.m4215constructorimpl(Unit.INSTANCE));
                                }
                            }
                            if (contentInViewModifier2.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewModifier2.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewModifier.m261isMaxVisibleO0kMr_c$default(contentInViewModifier2, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewModifier2.trackingFocusedChild = false;
                                }
                            }
                            contentInViewModifier2.animationState.setValue(contentInViewModifier2.calculateScrollDelta());
                        }
                    };
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(function1, function0, this) == coroutine_suspended) {
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

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ContentInViewModifier.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                        ContentInViewModifier.this.isAnimationRunning = true;
                        ScrollableState scrollableState = ContentInViewModifier.this.scrollState;
                        C00411 c00411 = new C00411(ContentInViewModifier.this, job, null);
                        this.label = 1;
                        if (OooO0o.OooO0o0(scrollableState, null, c00411, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ContentInViewModifier.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewModifier.this.isAnimationRunning = false;
                    ContentInViewModifier.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewModifier.this.trackingFocusedChild = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                ContentInViewModifier.this.isAnimationRunning = false;
                ContentInViewModifier.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                ContentInViewModifier.this.trackingFocusedChild = false;
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ContentInViewModifier(@NotNull CoroutineScope scope, @NotNull Orientation orientation, @NotNull ScrollableState scrollState, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.scope = scope;
        this.orientation = orientation;
        this.scrollState = scrollState;
        this.reverseDirection = z;
        this.bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
        this.viewportSize = IntSize.INSTANCE.m3940getZeroYbymL2g();
        this.animationState = new UpdatableAnimationState();
        this.modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier$modifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable LayoutCoordinates layoutCoordinates) {
                this.this$0.focusedChild = layoutCoordinates;
            }
        }), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (IntSize.m3933equalsimpl0(this.viewportSize, IntSize.INSTANCE.m3940getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM3945toSizeozmzZPI = IntSizeKt.m3945toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return relocationDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom(), Size.m1513getHeightimpl(jM3945toSizeozmzZPI));
        }
        if (i == 2) {
            return relocationDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight(), Size.m1516getWidthimpl(jM3945toSizeozmzZPI));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m257compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Intrinsics.compare(IntSize.m3934getHeightimpl(j), IntSize.m3934getHeightimpl(j2));
        }
        if (i == 2) {
            return Intrinsics.compare(IntSize.m3935getWidthimpl(j), IntSize.m3935getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m258compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Size.m1513getHeightimpl(j), Size.m1513getHeightimpl(j2));
        }
        if (i == 2) {
            return Float.compare(Size.m1516getWidthimpl(j), Size.m1516getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m259computeDestinationO0kMr_c(Rect childBounds, long containerSize) {
        return childBounds.m1484translatek4lQ0M(Offset.m1456unaryMinusF1C5BW0(m262relocationOffsetBMxPBkI(childBounds, containerSize)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect rectInvoke = ((Request) content[i]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    if (m258compareToiLBOSCw(rectInvoke.m1480getSizeNHjbRc(), IntSizeKt.m3945toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect;
                    }
                    rect = rectInvoke;
                }
                i--;
            } while (i >= 0);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.focusedChild) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m260isMaxVisibleO0kMr_c(Rect rect, long j) {
        return Offset.m1444equalsimpl0(m262relocationOffsetBMxPBkI(rect, j), Offset.INSTANCE.m1463getZeroF1C5BW0());
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m261isMaxVisibleO0kMr_c$default(ContentInViewModifier contentInViewModifier, Rect rect, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewModifier.viewportSize;
        }
        return contentInViewModifier.m260isMaxVisibleO0kMr_c(rect, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        if (!(!this.isAnimationRunning)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(null), 1, null);
    }

    private final float relocationDistance(float leadingEdge, float trailingEdge, float containerSize) {
        if ((leadingEdge >= 0.0f && trailingEdge <= containerSize) || (leadingEdge < 0.0f && trailingEdge > containerSize)) {
            return 0.0f;
        }
        float f = trailingEdge - containerSize;
        return Math.abs(leadingEdge) < Math.abs(f) ? leadingEdge : f;
    }

    /* JADX INFO: renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m262relocationOffsetBMxPBkI(Rect childBounds, long containerSize) {
        long jM3945toSizeozmzZPI = IntSizeKt.m3945toSizeozmzZPI(containerSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return OffsetKt.Offset(0.0f, relocationDistance(childBounds.getTop(), childBounds.getBottom(), Size.m1513getHeightimpl(jM3945toSizeozmzZPI)));
        }
        if (i == 2) {
            return OffsetKt.Offset(relocationDistance(childBounds.getLeft(), childBounds.getRight(), Size.m1516getWidthimpl(jM3945toSizeozmzZPI)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.OooO0O0.OooO00o(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.OooO0O0.OooO0O0(this, function1);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull Function0<Rect> function0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Rect rectInvoke = function0.invoke();
        boolean z = false;
        if (rectInvoke != null && !m261isMaxVisibleO0kMr_c$default(this, rectInvoke, 0L, 1, null)) {
            z = true;
        }
        if (!z) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        if (!IntSize.m3933equalsimpl0(this.viewportSize, IntSize.INSTANCE.m3940getZeroYbymL2g())) {
            return m259computeDestinationO0kMr_c(localRect, this.viewportSize);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.OooO0O0.OooO0OO(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.OooO0O0.OooO0Oo(this, obj, function2);
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.coordinates = coordinates;
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo263onRemeasuredozmzZPI(long size) {
        Rect focusedChildBounds;
        long j = this.viewportSize;
        this.viewportSize = size;
        if (m257compareToTemP2vQ(size, j) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m260isMaxVisibleO0kMr_c(rect, j) && !m260isMaxVisibleO0kMr_c(focusedChildBounds, size)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.OooO00o.OooO00o(this, modifier);
    }
}
