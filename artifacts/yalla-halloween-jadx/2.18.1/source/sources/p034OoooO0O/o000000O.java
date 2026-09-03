package p034OoooO0O;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o00O0O.OooO;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0OO00O;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class o000000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Oooo0<OooO, o0OO00O> f3473Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f3474Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f3475Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<OooO> f3476Oooo0oo;

    public static final class OooO00o extends Lambda implements Function0<OooO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<OooO> f3477Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oO0Oo<OooO> oo0oo) {
            super(0);
            this.f3477Oooo0o = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO invoke() {
            oO0Oo<OooO> oo0oo = this.f3477Oooo0o;
            o0OO00O o0oo00o2 = o0O0O00.f3552OooO00o;
            return new OooO(oo0oo.getValue().f30395OooO00o);
        }
    }

    public static final class OooO0O0 implements FlowCollector<OooO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<OooO, o0OO00O> f3478Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f3479Oooo0oO;

        public OooO0O0(Oooo0<OooO, o0OO00O> oooo0, CoroutineScope coroutineScope) {
            this.f3478Oooo0o = oooo0;
            this.f3479Oooo0oO = coroutineScope;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(OooO oooO, Continuation continuation) {
            long j = oooO.f30395OooO00o;
            if (OooOO0.OooO0OO(this.f3478Oooo0o.OooO0o().f30395OooO00o) && OooOO0.OooO0OO(j)) {
                if (!(OooO.OooO0Oo(this.f3478Oooo0o.OooO0o().f30395OooO00o) == OooO.OooO0Oo(j))) {
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f3479Oooo0oO, null, null, new o00000(this.f3478Oooo0o, j, null), 3, null);
                    return jobLaunch$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? jobLaunch$default : Unit.INSTANCE;
                }
            }
            Object objOooO0oO = this.f3478Oooo0o.OooO0oO(new OooO(j), continuation);
            return objOooO0oO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0oO : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(oO0Oo<OooO> oo0oo, Oooo0<OooO, o0OO00O> oooo0, Continuation<? super o000000O> continuation) {
        super(2, continuation);
        this.f3476Oooo0oo = oo0oo;
        this.f3473Oooo = oooo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000000O o000000o2 = new o000000O(this.f3476Oooo0oo, this.f3473Oooo, continuation);
        o000000o2.f3475Oooo0oO = obj;
        return o000000o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3474Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f3475Oooo0oO;
            Flow flowOooO0oO = o0OOO00.OooO0oO(new OooO00o(this.f3476Oooo0oo));
            OooO0O0 oooO0O0 = new OooO0O0(this.f3473Oooo, coroutineScope);
            this.f3474Oooo0o = 1;
            if (flowOooO0oO.collect(oooO0O0, this) == coroutine_suspended) {
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
