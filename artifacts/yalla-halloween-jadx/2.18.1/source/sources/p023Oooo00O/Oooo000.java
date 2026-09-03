package p023Oooo00O;

import androidx.compose.animation.core.AnimationEndReason;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {291}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
public final class Oooo000 extends SuspendLambda implements Function1<Continuation<? super o00Oo0<Object, o0O0O00>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Object, o0O0O00> f1014Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0ooOOo f1015Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Ref.BooleanRef f1016Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f1017Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Oooo0<Object, o0O0O00>, Unit> f1018OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00O0O<Object, o0O0O00> f1019OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f1020OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ long f1021OoooO0O;

    public static final class OooO00o extends Lambda implements Function1<o00Ooo<Object, o0O0O00>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f1022Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Object, o0O0O00> f1023Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo<Object, o0O0O00> f1024Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Oooo0<Object, o0O0O00>, Unit> f1025Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Oooo0<Object, o0O0O00> oooo0, o0ooOOo<Object, o0O0O00> o0ooooo2, Function1<? super Oooo0<Object, o0O0O00>, Unit> function1, Ref.BooleanRef booleanRef) {
            super(1);
            this.f1023Oooo0o = oooo0;
            this.f1024Oooo0oO = o0ooooo2;
            this.f1025Oooo0oo = function1;
            this.f1022Oooo = booleanRef;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00Ooo<Object, o0O0O00> o00ooo2) {
            o00Ooo<Object, o0O0O00> animate = o00ooo2;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            o00O00O.OooO0oO(animate, this.f1023Oooo0o.f1004OooO0OO);
            Object objOooO00o = Oooo0.OooO00o(this.f1023Oooo0o, animate.OooO0O0());
            if (Intrinsics.areEqual(objOooO00o, animate.OooO0O0())) {
                Function1<Oooo0<Object, o0O0O00>, Unit> function1 = this.f1025Oooo0oo;
                if (function1 != null) {
                    function1.invoke(this.f1023Oooo0o);
                }
            } else {
                this.f1023Oooo0o.f1004OooO0OO.OooO0oo((T) objOooO00o);
                this.f1024Oooo0oO.OooO0oo(objOooO00o);
                Function1<Oooo0<Object, o0O0O00>, Unit> function2 = this.f1025Oooo0oo;
                if (function2 != null) {
                    function2.invoke(this.f1023Oooo0o);
                }
                animate.OooO00o();
                this.f1022Oooo.element = true;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo000(Oooo0<Object, o0O0O00> oooo0, Object obj, o00O0O<Object, o0O0O00> o00o0o2, long j, Function1<? super Oooo0<Object, o0O0O00>, Unit> function1, Continuation<? super Oooo000> continuation) {
        super(1, continuation);
        this.f1014Oooo = oooo0;
        this.f1020OoooO00 = obj;
        this.f1019OoooO0 = o00o0o2;
        this.f1021OoooO0O = j;
        this.f1018OoooO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new Oooo000(this.f1014Oooo, this.f1020OoooO00, this.f1019OoooO0, this.f1021OoooO0O, this.f1018OoooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super o00Oo0<Object, o0O0O00>> continuation) {
        return ((Oooo000) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.BooleanRef booleanRef;
        o0ooOOo o0ooooo2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1017Oooo0oo;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Object, o0O0O00> oooo0 = this.f1014Oooo;
                o0ooOOo<Object, V> o0ooooo3 = oooo0.f1004OooO0OO;
                V v = (V) oooo0.f1002OooO00o.OooO00o().invoke(this.f1020OoooO00);
                Objects.requireNonNull(o0ooooo3);
                Intrinsics.checkNotNullParameter(v, "<set-?>");
                o0ooooo3.f1239Oooo0oo = v;
                this.f1014Oooo.f1007OooO0o0.setValue(this.f1019OoooO0.OooO0oO());
                this.f1014Oooo.f1005OooO0Oo.setValue(Boolean.TRUE);
                o0ooOOo<Object, V> o0ooooo4 = this.f1014Oooo.f1004OooO0OO;
                Object value = o0ooooo4.getValue();
                o0O0O00 o0o0o00OooO00o = o000OOo.OooO00o(o0ooooo4.f1239Oooo0oo);
                long j = o0ooooo4.f1236Oooo;
                boolean z = o0ooooo4.f1240OoooO0;
                Intrinsics.checkNotNullParameter(o0ooooo4, "<this>");
                o0ooOOo o0ooooo5 = new o0ooOOo(o0ooooo4.f1237Oooo0o, value, o0o0o00OooO00o, j, Long.MIN_VALUE, z);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                o00O0O<Object, o0O0O00> o00o0o2 = this.f1019OoooO0;
                long j2 = this.f1021OoooO0O;
                OooO00o oooO00o = new OooO00o(this.f1014Oooo, o0ooooo5, this.f1018OoooO, booleanRef2);
                this.f1015Oooo0o = o0ooooo5;
                this.f1016Oooo0oO = booleanRef2;
                this.f1017Oooo0oo = 1;
                if (o00O00O.OooO00o(o0ooooo5, o00o0o2, j2, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
                o0ooooo2 = o0ooooo5;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = this.f1016Oooo0oO;
                o0ooooo2 = this.f1015Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            Oooo0.OooO0O0(this.f1014Oooo);
            return new o00Oo0(o0ooooo2, animationEndReason);
        } catch (CancellationException e) {
            Oooo0.OooO0O0(this.f1014Oooo);
            throw e;
        }
    }
}
