package p031OoooO;

import androidx.compose.material.SwipeableState;
import java.util.Map;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {607}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f2658Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f2659Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f2660Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Map<Float, Object> f2661Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Object, o000O> f2662OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooO f2663OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ float f2664OoooO0O;

    public static final class OooO00o extends Lambda implements Function2<Float, Float, Float> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Map<Float, Object> f2665Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<Object, Object, o000O> f2666Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO f2667Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Map<Float, Object> map, Function2<Object, Object, ? extends o000O> function2, OooO oooO) {
            super(2);
            this.f2665Oooo0o = map;
            this.f2666Oooo0oO = function2;
            this.f2667Oooo0oo = oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f, Float f2) {
            float fFloatValue = f.floatValue();
            float fFloatValue2 = f2.floatValue();
            return Float.valueOf(this.f2666Oooo0oO.invoke(MapsKt.getValue(this.f2665Oooo0o, Float.valueOf(fFloatValue)), MapsKt.getValue(this.f2665Oooo0o, Float.valueOf(fFloatValue2))).OooO00o(this.f2667Oooo0oo, fFloatValue, fFloatValue2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O0(SwipeableState<Object> swipeableState, Map<Float, Object> map, o0O0O00 o0o0o00, OooO oooO, Function2<Object, Object, ? extends o000O> function2, float f, Continuation<? super o0000O0> continuation) {
        super(2, continuation);
        this.f2660Oooo0oO = swipeableState;
        this.f2661Oooo0oo = map;
        this.f2658Oooo = o0o0o00;
        this.f2663OoooO00 = oooO;
        this.f2662OoooO0 = function2;
        this.f2664OoooO0O = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O0(this.f2660Oooo0oO, this.f2661Oooo0oo, this.f2658Oooo, this.f2663OoooO00, this.f2662OoooO0, this.f2664OoooO0O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2659Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Map<Float, ? extends Object> mapOooO0Oo = this.f2660Oooo0oO.OooO0Oo();
            SwipeableState<Object> swipeableState = this.f2660Oooo0oO;
            Map<Float, Object> map = this.f2661Oooo0oo;
            Objects.requireNonNull(swipeableState);
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            swipeableState.f5908OooO.setValue(map);
            SwipeableState<Object> swipeableState2 = this.f2660Oooo0oO;
            swipeableState2.f5922OooOOOO.setValue(this.f2658Oooo);
            SwipeableState<Object> swipeableState3 = this.f2660Oooo0oO;
            OooO00o oooO00o = new OooO00o(this.f2661Oooo0oo, this.f2662OoooO0, this.f2663OoooO00);
            Objects.requireNonNull(swipeableState3);
            Intrinsics.checkNotNullParameter(oooO00o, "<set-?>");
            swipeableState3.f5921OooOOO0.setValue(oooO00o);
            OooO oooO = this.f2663OoooO00;
            this.f2660Oooo0oO.f5920OooOOO.setValue(Float.valueOf(oooO.OoooOoo(this.f2664OoooO0O)));
            SwipeableState<Object> swipeableState4 = this.f2660Oooo0oO;
            Map<Float, ? extends Object> map2 = this.f2661Oooo0oo;
            this.f2659Oooo0o = 1;
            if (swipeableState4.OooO0o(mapOooO0Oo, map2, this) == coroutine_suspended) {
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
