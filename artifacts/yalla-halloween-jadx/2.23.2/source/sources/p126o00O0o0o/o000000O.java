package p126o00O0o0o;

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
import p118o00O0Oo.o000000;
import p118o00O0Oo.o000OOo;
import p125o00O0o0O.o00oO0o;
import p125o00O0o0O.oo0o0Oo;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
public final class o000000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0O0O00.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Object f36651OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o00oO0o> f36653OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f36654OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o000OOo> f36655OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f36656OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o0O0O00> f36657OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o000000 f36658OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(o0O0O00 o0o0o00, Ref.ObjectRef<o00oO0o> objectRef, Ref.ObjectRef<o000OOo> objectRef2, OooO00o oooO00o, Object obj, Ref.ObjectRef<o0O0O00> objectRef3, o000000 o000000Var, Continuation<? super o000000O> continuation) {
        super(2, continuation);
        this.f36654OooO0o0 = o0o0o00;
        this.f36653OooO0o = objectRef;
        this.f36655OooO0oO = objectRef2;
        this.f36656OooO0oo = oooO00o;
        this.f36651OooO = obj;
        this.f36657OooOO0 = objectRef3;
        this.f36658OooOO0O = o000000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000000O(this.f36654OooO0o0, this.f36653OooO0o, this.f36655OooO0oO, this.f36656OooO0oo, this.f36651OooO, this.f36657OooOO0, this.f36658OooOO0O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0O0O00.OooO00o> continuation) {
        return ((o000000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f36652OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O0O00 o0o0o00 = this.f36654OooO0o0;
            oo0o0Oo oo0o0oo = (oo0o0Oo) this.f36653OooO0o.element;
            o000OOo o000ooo2 = this.f36655OooO0oO.element;
            OooO00o oooO00o = this.f36656OooO0oo;
            Object obj2 = this.f36651OooO;
            o0O0O00 o0o0o01 = this.f36657OooOO0.element;
            o000000 o000000Var = this.f36658OooOO0O;
            this.f36652OooO0Oo = 1;
            obj = o0O0O00.OooO0O0(o0o0o00, oo0o0oo, o000ooo2, oooO00o, obj2, o0o0o01, o000000Var, this);
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
