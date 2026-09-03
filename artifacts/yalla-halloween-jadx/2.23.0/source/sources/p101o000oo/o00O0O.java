package p101o000oo;

import coil.request.OooO00o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o0000O0;
import p097o000o0oO.o0000O0O;
import p105o000oo0o.o00O0O0O;
import p105o000oo0o.oo0oOO0;
import p109o000ooo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Oooo0.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Object f35547OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o00O0O0O> f35549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f35550OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o0000O0> f35551OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f35552OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o0Oo0oo> f35553OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f35554OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Oooo0 oooo0, Ref.ObjectRef<o00O0O0O> objectRef, Ref.ObjectRef<o0000O0> objectRef2, OooO00o oooO00o, Object obj, Ref.ObjectRef<o0Oo0oo> objectRef3, o0000O0O o0000o0o2, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f35550OooO0o0 = oooo0;
        this.f35549OooO0o = objectRef;
        this.f35551OooO0oO = objectRef2;
        this.f35552OooO0oo = oooO00o;
        this.f35547OooO = obj;
        this.f35553OooOO0 = objectRef3;
        this.f35554OooOO0O = o0000o0o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O(this.f35550OooO0o0, this.f35549OooO0o, this.f35551OooO0oO, this.f35552OooO0oo, this.f35547OooO, this.f35553OooOO0, this.f35554OooOO0O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Oooo0.OooO00o> continuation) {
        return ((o00O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35548OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Oooo0 oooo0 = this.f35550OooO0o0;
            oo0oOO0 oo0ooo0 = (oo0oOO0) this.f35549OooO0o.element;
            o0000O0 o0000o1 = this.f35551OooO0oO.element;
            OooO00o oooO00o = this.f35552OooO0oo;
            Object obj2 = this.f35547OooO;
            o0Oo0oo o0oo0oo2 = this.f35553OooOO0.element;
            o0000O0O o0000o0o2 = this.f35554OooOO0O;
            this.f35548OooO0Oo = 1;
            obj = Oooo0.OooO0O0(oooo0, oo0ooo0, o0000o1, oooO00o, obj2, o0oo0oo2, o0000o0o2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
