package p198o00o0Oo;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.slider.core.CustomSliderKt$sliderTapModifier$2$1", f = "CustomSlider.kt", i = {}, l = {979}, m = "invokeSuspend", n = {}, s = {})
public final class o00OOO0 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ State<Float> f39127OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f39129OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f39130OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f39131OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f39132OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f39133OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ DraggableState f39134OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f39135OooOO0o;

    @DebugMetadata(c = "com.code.android.uikit.slider.core.CustomSliderKt$sliderTapModifier$2$1$1", f = "CustomSlider.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f39136OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f39137OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ long f39138OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f39139OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f39140OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f39141OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f39142OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, float f, MutableState<Float> mutableState, State<Float> state, Continuation<? super OooO00o> continuation) {
            super(3, continuation);
            this.f39140OooO0oO = z;
            this.f39141OooO0oo = f;
            this.f39136OooO = mutableState;
            this.f39142OooOO0 = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long packedValue = offset.getPackedValue();
            OooO00o oooO00o = new OooO00o(this.f39140OooO0oO, this.f39141OooO0oo, this.f39136OooO, this.f39142OooOO0, continuation);
            oooO00o.f39139OooO0o0 = pressGestureScope;
            oooO00o.f39138OooO0o = packedValue;
            return oooO00o.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f39137OooO0Oo;
            MutableState<Float> mutableState = this.f39136OooO;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = this.f39139OooO0o0;
                    long j = this.f39138OooO0o;
                    mutableState.setValue(Boxing.boxFloat((this.f39140OooO0oO ? this.f39141OooO0oo - Offset.m1447getXimpl(j) : Offset.m1447getXimpl(j)) - this.f39142OooOO0.getValue().floatValue()));
                    this.f39137OooO0Oo = 1;
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
                mutableState.setValue(Boxing.boxFloat(0.0f));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f39143OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Float, Unit>> f39144OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ DraggableState f39145OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state) {
            super(1);
            this.f39143OooO0Oo = coroutineScope;
            this.f39145OooO0o0 = draggableState;
            this.f39144OooO0o = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getPackedValue();
            BuildersKt__Builders_commonKt.launch$default(this.f39143OooO0Oo, null, null, new o00OOO0O(this.f39145OooO0o0, this.f39144OooO0o, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OOO0(boolean z, float f, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state2, Continuation<? super o00OOO0> continuation) {
        super(2, continuation);
        this.f39129OooO0o = z;
        this.f39131OooO0oO = f;
        this.f39132OooO0oo = mutableState;
        this.f39127OooO = state;
        this.f39133OooOO0 = coroutineScope;
        this.f39134OooOO0O = draggableState;
        this.f39135OooOO0o = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00OOO0 o00ooo1 = new o00OOO0(this.f39129OooO0o, this.f39131OooO0oO, this.f39132OooO0oo, this.f39127OooO, this.f39133OooOO0, this.f39134OooOO0O, this.f39135OooOO0o, continuation);
        o00ooo1.f39130OooO0o0 = obj;
        return o00ooo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((o00OOO0) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f39128OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f39130OooO0o0;
            OooO00o oooO00o = new OooO00o(this.f39129OooO0o, this.f39131OooO0oO, this.f39132OooO0oo, this.f39127OooO, null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f39133OooOO0, this.f39134OooOO0O, this.f39135OooOO0o);
            this.f39128OooO0Oo = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, oooO00o, oooO0O0, this, 3, null) == coroutine_suspended) {
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
