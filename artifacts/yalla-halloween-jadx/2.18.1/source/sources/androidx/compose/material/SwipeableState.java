package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o000oOoO;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.oo000o;
import p025Oooo0O0.OooOOO0;
import p025Oooo0O0.o00Oo0;
import p031OoooO.o0000O;
import p031OoooO.o0000OO0;
import p031OoooO.o0O0O00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalMaterialApi
public final class SwipeableState<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f5908OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oo000o<Float> f5909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function1<T, Boolean> f5910OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f5911OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f5912OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Float> f5913OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Float> f5914OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Float> f5915OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Float> f5916OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Flow<Map<Float, T>> f5917OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f5918OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f5919OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f5920OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f5921OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f5922OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f5923OooOOOo;

    @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<o00Oo0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f5924Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ float f5925Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f5926Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(float f, SwipeableState<T> swipeableState, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f5925Oooo0oO = f;
            this.f5926Oooo0oo = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f5925Oooo0oO, this.f5926Oooo0oo, continuation);
            oooO.f5924Oooo0o = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00Oo0 o00oo1, Continuation<? super Unit> continuation) {
            return ((OooO) create(o00oo1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((o00Oo0) this.f5924Oooo0o).OooO00o(this.f5925Oooo0oO - this.f5926Oooo0oo.f5915OooO0oO.getValue().floatValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00Oo0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f5927Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f5928Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f5929Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f5930Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ oo000o<Float> f5931OoooO00;

        /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0036OooO00o extends Lambda implements Function1<Oooo0<Float, o0Oo0oo>, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00Oo0 f5932Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f5933Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0036OooO00o(o00Oo0 o00oo1, Ref.FloatRef floatRef) {
                super(1);
                this.f5932Oooo0o = o00oo1;
                this.f5933Oooo0oO = floatRef;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Oooo0<Float, o0Oo0oo> oooo0) {
                Oooo0<Float, o0Oo0oo> animateTo = oooo0;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                this.f5932Oooo0o.OooO00o(animateTo.OooO0o().floatValue() - this.f5933Oooo0oO.element);
                this.f5933Oooo0oO.element = animateTo.OooO0o().floatValue();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SwipeableState<T> swipeableState, float f, oo000o<Float> oo000oVar, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f5930Oooo0oo = swipeableState;
            this.f5927Oooo = f;
            this.f5931OoooO00 = oo000oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f5930Oooo0oo, this.f5927Oooo, this.f5931OoooO00, continuation);
            oooO00o.f5929Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00Oo0 o00oo1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5928Oooo0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o00Oo0 o00oo1 = (o00Oo0) this.f5929Oooo0oO;
                    Ref.FloatRef floatRef = new Ref.FloatRef();
                    floatRef.element = this.f5930Oooo0oo.f5915OooO0oO.getValue().floatValue();
                    this.f5930Oooo0oo.f5916OooO0oo.setValue(Boxing.boxFloat(this.f5927Oooo));
                    SwipeableState.OooO00o(this.f5930Oooo0oo, true);
                    Oooo0 oooo0OooO0o0 = o000oOoO.OooO0o0(floatRef.element);
                    Float fBoxFloat = Boxing.boxFloat(this.f5927Oooo);
                    oo000o<Float> oo000oVar = this.f5931OoooO00;
                    C0036OooO00o c0036OooO00o = new C0036OooO00o(o00oo1, floatRef);
                    this.f5928Oooo0o = 1;
                    if (Oooo0.OooO0OO(oooo0OooO0o0, fBoxFloat, oo000oVar, c0036OooO00o, this, 4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f5930Oooo0oo.f5916OooO0oo.setValue(null);
                SwipeableState.OooO00o(this.f5930Oooo0oo, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.f5930Oooo0oo.f5916OooO0oo.setValue(null);
                SwipeableState.OooO00o(this.f5930Oooo0oo, false);
                throw th;
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f5934Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(SwipeableState<T> swipeableState) {
            super(1);
            this.f5934Oooo0o = swipeableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f) {
            float fFloatValue = this.f5934Oooo0o.f5915OooO0oO.getValue().floatValue() + f.floatValue();
            SwipeableState<T> swipeableState = this.f5934Oooo0o;
            float fCoerceIn = RangesKt.coerceIn(fFloatValue, swipeableState.f5918OooOO0O, swipeableState.f5919OooOO0o);
            float f2 = fFloatValue - fCoerceIn;
            o0O0O00 o0o0o00 = (o0O0O00) this.f5934Oooo0o.f5922OooOOOO.getValue();
            float fSin = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (o0o0o00 != null) {
                float f3 = f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? o0o0o00.f2886OooO0O0 : o0o0o00.f2887OooO0OO;
                if (!(f3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    fSin = ((float) Math.sin((RangesKt.coerceIn(f2 / o0o0o00.f2885OooO00o, -1.0f, 1.0f) * 3.1415927f) / 2)) * (o0o0o00.f2885OooO00o / f3);
                }
            }
            this.f5934Oooo0o.f5914OooO0o0.setValue(Float.valueOf(fCoerceIn + fSin));
            this.f5934Oooo0o.f5913OooO0o.setValue(Float.valueOf(f2));
            this.f5934Oooo0o.f5915OooO0oO.setValue(Float.valueOf(fFloatValue));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Map<Float, ? extends T>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f5935Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(SwipeableState<T> swipeableState) {
            super(0);
            this.f5935Oooo0o = swipeableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f5935Oooo0o.OooO0Oo();
        }
    }

    @DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {159, 183, 186}, m = "processNewAnchors$material_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f5936Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public SwipeableState f5937Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Map f5938Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public float f5939Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f5940OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f5941OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(SwipeableState<T> swipeableState, Continuation<? super OooO0o> continuation) {
            super(continuation);
            this.f5941OoooO00 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f5936Oooo = obj;
            this.f5940OoooO0 |= Integer.MIN_VALUE;
            return this.f5941OoooO00.OooO0o(null, null, this);
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Float, Float, Float> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f5942Oooo0o = new OooOO0();

        public OooOO0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f, Float f2) {
            f.floatValue();
            f2.floatValue();
            return Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, @NotNull oo000o<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.f5909OooO00o = animationSpec;
        this.f5910OooO0O0 = confirmStateChange;
        this.f5911OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(t);
        this.f5912OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
        Float fValueOf = Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f5914OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(fValueOf);
        this.f5913OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(fValueOf);
        this.f5915OooO0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(fValueOf);
        this.f5916OooO0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f5908OooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(MapsKt.emptyMap());
        final Flow flowOooO0oO = o0OOO00.OooO0oO(new OooO0OO(this));
        this.f5917OooOO0 = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector, SuspendFunction {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5944Oooo0o;

                /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public /* synthetic */ Object f5945Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public int f5946Oooo0oO;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f5945Oooo0o = obj;
                        this.f5946Oooo0oO |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f5944Oooo0o = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.f5946Oooo0oO;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f5946Oooo0oO = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f5945Oooo0o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.f5946Oooo0oO;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.f5944Oooo0o;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.f5946Oooo0oO = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public final Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowOooO0oO.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, 1);
        this.f5918OooOO0O = Float.NEGATIVE_INFINITY;
        this.f5919OooOO0o = Float.POSITIVE_INFINITY;
        this.f5921OooOOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(OooOO0.f5942Oooo0o);
        this.f5920OooOOO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(fValueOf);
        this.f5922OooOOOO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        OooO0O0 onDelta = new OooO0O0(this);
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f5923OooOOOo = new OooOOO0(onDelta);
    }

    public static final void OooO00o(SwipeableState swipeableState, boolean z) {
        swipeableState.f5912OooO0Oo.setValue(Boolean.valueOf(z));
    }

    public static Object OooO0OO(SwipeableState swipeableState, Object obj, oo000o oo000oVar, Continuation continuation, int i, Object obj2) {
        Object objCollect = swipeableState.f5917OooOO0.collect(new o0000OO0(obj, swipeableState, swipeableState.f5909OooO00o), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final Object OooO0O0(float f, oo000o<Float> oo000oVar, Continuation<? super Unit> continuation) {
        Object objOooO00o = this.f5923OooOOOo.OooO00o(MutatePriority.Default, new OooO00o(this, f, oo000oVar, null), continuation);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    @NotNull
    public final Map<Float, T> OooO0Oo() {
        return (Map) this.f5908OooO.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.material.SwipeableState, androidx.compose.material.SwipeableState<T>] */
    @Nullable
    public final Object OooO0o(@NotNull Map<Float, ? extends T> map, @NotNull Map<Float, ? extends T> map2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO0o oooO0o;
        float fFloatValue;
        ?? r0;
        ?? r2;
        ?? r3;
        ?? r1;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f5940OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f5940OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, continuation);
            }
        } else {
            oooO0o = new OooO0o(this, continuation);
        }
        Object obj = oooO0o.f5936Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f5940OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (map.isEmpty()) {
                Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMinOrNull);
                this.f5918OooOO0O = fMinOrNull.floatValue();
                Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                Intrinsics.checkNotNull(fMaxOrNull);
                this.f5919OooOO0o = fMaxOrNull.floatValue();
                Float fOooO00o = o0000O.OooO00o(map2, OooO0o0());
                if (fOooO00o == null) {
                    throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                }
                float fFloatValue2 = fOooO00o.floatValue();
                oooO0o.f5940OoooO0 = 1;
                if (OooO0oo(fFloatValue2, oooO0o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (!Intrinsics.areEqual(map2, map)) {
                this.f5918OooOO0O = Float.NEGATIVE_INFINITY;
                this.f5919OooOO0o = Float.POSITIVE_INFINITY;
                Float value = this.f5916OooO0oo.getValue();
                Object next = null;
                if (value != null) {
                    Float fOooO00o2 = o0000O.OooO00o(map2, map.get(value));
                    if (fOooO00o2 != null) {
                        fFloatValue = fOooO00o2.floatValue();
                    } else {
                        Iterator<T> it = map2.keySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                float fAbs = Math.abs(((Number) next).floatValue() - value.floatValue());
                                do {
                                    Object next2 = it.next();
                                    float fAbs2 = Math.abs(((Number) next2).floatValue() - value.floatValue());
                                    if (Float.compare(fAbs, fAbs2) > 0) {
                                        next = next2;
                                        fAbs = fAbs2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        Intrinsics.checkNotNull(next);
                        fFloatValue = ((Number) next).floatValue();
                    }
                } else {
                    Object objOooO0o0 = map.get(this.f5914OooO0o0.getValue());
                    if (Intrinsics.areEqual(objOooO0o0, OooO0o0())) {
                        objOooO0o0 = OooO0o0();
                    }
                    Float fOooO00o3 = o0000O.OooO00o(map2, objOooO0o0);
                    if (fOooO00o3 != null) {
                        fFloatValue = fOooO00o3.floatValue();
                    } else {
                        Iterator<T> it2 = map2.keySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                float fAbs3 = Math.abs(((Number) next).floatValue() - this.f5914OooO0o0.getValue().floatValue());
                                do {
                                    Object next3 = it2.next();
                                    float fAbs4 = Math.abs(((Number) next3).floatValue() - this.f5914OooO0o0.getValue().floatValue());
                                    if (Float.compare(fAbs3, fAbs4) > 0) {
                                        next = next3;
                                        fAbs3 = fAbs4;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        Intrinsics.checkNotNull(next);
                        fFloatValue = ((Number) next).floatValue();
                    }
                }
                try {
                    oo000o<Float> oo000oVar = this.f5909OooO00o;
                    oooO0o.f5937Oooo0o = this;
                    oooO0o.f5938Oooo0oO = map2;
                    oooO0o.f5939Oooo0oo = fFloatValue;
                    oooO0o.f5940OoooO0 = 2;
                    if (OooO0O0(fFloatValue, oo000oVar, oooO0o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r3 = this;
                    r3.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull2);
                    r3.f5918OooOO0O = fMinOrNull2.floatValue();
                    Float fMaxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull2);
                    r3.f5919OooOO0o = fMaxOrNull2.floatValue();
                } catch (CancellationException unused) {
                    r2 = this;
                    oooO0o.f5937Oooo0o = r2;
                    oooO0o.f5938Oooo0oO = map2;
                    oooO0o.f5939Oooo0oo = fFloatValue;
                    oooO0o.f5940OoooO0 = 3;
                    if (r2.OooO0oo(fFloatValue, oooO0o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = r2;
                    r1.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull3 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull3);
                    r1.f5918OooOO0O = fMinOrNull3.floatValue();
                    Float fMaxOrNull3 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull3);
                    r1.f5919OooOO0o = fMaxOrNull3.floatValue();
                } catch (Throwable th) {
                    th = th;
                    r0 = this;
                    r0.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull4 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull4);
                    r0.f5918OooOO0O = fMinOrNull4.floatValue();
                    Float fMaxOrNull4 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull4);
                    r0.f5919OooOO0o = fMaxOrNull4.floatValue();
                    throw th;
                }
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                fFloatValue = oooO0o.f5939Oooo0oo;
                map2 = oooO0o.f5938Oooo0oO;
                r2 = oooO0o.f5937Oooo0o;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                        r3 = r2;
                        r3.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                        Float fMinOrNull5 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMinOrNull5);
                        r3.f5918OooOO0O = fMinOrNull5.floatValue();
                        Float fMaxOrNull5 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMaxOrNull5);
                        r3.f5919OooOO0o = fMaxOrNull5.floatValue();
                    } catch (CancellationException unused2) {
                        oooO0o.f5937Oooo0o = r2;
                        oooO0o.f5938Oooo0oO = map2;
                        oooO0o.f5939Oooo0oo = fFloatValue;
                        oooO0o.f5940OoooO0 = 3;
                        if (r2.OooO0oo(fFloatValue, oooO0o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r1 = r2;
                        r1.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                        Float fMinOrNull6 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMinOrNull6);
                        r1.f5918OooOO0O = fMinOrNull6.floatValue();
                        Float fMaxOrNull6 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(fMaxOrNull6);
                        r1.f5919OooOO0o = fMaxOrNull6.floatValue();
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r2;
                    r0.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull7 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull7);
                    r0.f5918OooOO0O = fMinOrNull7.floatValue();
                    Float fMaxOrNull7 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull7);
                    r0.f5919OooOO0o = fMaxOrNull7.floatValue();
                    throw th;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fFloatValue = oooO0o.f5939Oooo0oo;
                map2 = oooO0o.f5938Oooo0oO;
                r0 = oooO0o.f5937Oooo0o;
                try {
                    ResultKt.throwOnFailure(obj);
                    r1 = r0;
                    r1.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull8 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull8);
                    r1.f5918OooOO0O = fMinOrNull8.floatValue();
                    Float fMaxOrNull8 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull8);
                    r1.f5919OooOO0o = fMaxOrNull8.floatValue();
                } catch (Throwable th3) {
                    th = th3;
                    r0.OooO0oO(MapsKt.getValue(map2, Boxing.boxFloat(fFloatValue)));
                    Float fMinOrNull9 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull9);
                    r0.f5918OooOO0O = fMinOrNull9.floatValue();
                    Float fMaxOrNull9 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull9);
                    r0.f5919OooOO0o = fMaxOrNull9.floatValue();
                    throw th;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final T OooO0o0() {
        return this.f5911OooO0OO.getValue();
    }

    public final void OooO0oO(T t) {
        this.f5911OooO0OO.setValue(t);
    }

    public final Object OooO0oo(float f, Continuation<? super Unit> continuation) {
        Object objOooO00o = this.f5923OooOOOo.OooO00o(MutatePriority.Default, new OooO(f, this, null), continuation);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }
}
