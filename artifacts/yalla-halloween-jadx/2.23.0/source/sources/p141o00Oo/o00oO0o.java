package p141o00Oo;

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
public final class o00oO0o extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ State<Float> f37527OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f37529OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f37530OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f37531OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f37532OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f37533OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ DraggableState f37534OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f37535OooOO0o;

    @DebugMetadata(c = "com.code.android.uikit.slider.core.CustomSliderKt$sliderTapModifier$2$1$1", f = "CustomSlider.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f37536OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f37537OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ long f37538OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f37539OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f37540OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f37541OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f37542OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, float f, MutableState<Float> mutableState, State<Float> state, Continuation<? super OooO00o> continuation) {
            super(3, continuation);
            this.f37540OooO0oO = z;
            this.f37541OooO0oo = f;
            this.f37536OooO = mutableState;
            this.f37542OooOO0 = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long packedValue = offset.getPackedValue();
            OooO00o oooO00o = new OooO00o(this.f37540OooO0oO, this.f37541OooO0oo, this.f37536OooO, this.f37542OooOO0, continuation);
            oooO00o.f37539OooO0o0 = pressGestureScope;
            oooO00o.f37538OooO0o = packedValue;
            return oooO00o.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f37537OooO0Oo;
            MutableState<Float> mutableState = this.f37536OooO;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = this.f37539OooO0o0;
                    long j = this.f37538OooO0o;
                    mutableState.setValue(Boxing.boxFloat((this.f37540OooO0oO ? this.f37541OooO0oo - Offset.m1436getXimpl(j) : Offset.m1436getXimpl(j)) - this.f37542OooOO0.getValue().floatValue()));
                    this.f37537OooO0Oo = 1;
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
        public final /* synthetic */ CoroutineScope f37543OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Float, Unit>> f37544OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ DraggableState f37545OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state) {
            super(1);
            this.f37543OooO0Oo = coroutineScope;
            this.f37545OooO0o0 = draggableState;
            this.f37544OooO0o = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getPackedValue();
            BuildersKt__Builders_commonKt.launch$default(this.f37543OooO0Oo, null, null, new o0ooOOo(this.f37545OooO0o0, this.f37544OooO0o, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00oO0o(boolean z, float f, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state2, Continuation<? super o00oO0o> continuation) {
        super(2, continuation);
        this.f37529OooO0o = z;
        this.f37531OooO0oO = f;
        this.f37532OooO0oo = mutableState;
        this.f37527OooO = state;
        this.f37533OooOO0 = coroutineScope;
        this.f37534OooOO0O = draggableState;
        this.f37535OooOO0o = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00oO0o o00oo0o2 = new o00oO0o(this.f37529OooO0o, this.f37531OooO0oO, this.f37532OooO0oo, this.f37527OooO, this.f37533OooOO0, this.f37534OooOO0O, this.f37535OooOO0o, continuation);
        o00oo0o2.f37530OooO0o0 = obj;
        return o00oo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((o00oO0o) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f37528OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f37530OooO0o0;
            OooO00o oooO00o = new OooO00o(this.f37529OooO0o, this.f37531OooO0oO, this.f37532OooO0oo, this.f37527OooO, null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f37533OooOO0, this.f37534OooOO0O, this.f37535OooOO0o);
            this.f37528OooO0Oo = 1;
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
