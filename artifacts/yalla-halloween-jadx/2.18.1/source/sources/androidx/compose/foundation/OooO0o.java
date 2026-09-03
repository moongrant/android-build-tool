package androidx.compose.foundation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o0000O00;
import p025Oooo0O0.o000OOo0;
import p026Oooo0OO.o000;
import p026Oooo0OO.o000Oo0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oO0Oo;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0o extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000 f5614Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f5615Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f5616Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f5617Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function0<Boolean>> f5618OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o000Oo0> f5619OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function0<Unit>> f5620OoooO0O;

    @DebugMetadata(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f5621Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f5622Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ o0000O00 f5623Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ long f5624Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o000Oo0> f5625OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000 f5626OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function0<Boolean>> f5627OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(boolean z, o000 o000Var, o0O00OO<o000Oo0> o0o00oo2, oO0Oo<? extends Function0<Boolean>> oo0oo, Continuation<? super OooO00o> continuation) {
            super(3, continuation);
            this.f5621Oooo = z;
            this.f5626OoooO00 = o000Var;
            this.f5625OoooO0 = o0o00oo2;
            this.f5627OoooO0O = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(o0000O00 o0000o00, o00O0O.OooO oooO, Continuation<? super Unit> continuation) {
            long j = oooO.f30395OooO00o;
            OooO00o oooO00o = new OooO00o(this.f5621Oooo, this.f5626OoooO00, this.f5625OoooO0, this.f5627OoooO0O, continuation);
            oooO00o.f5623Oooo0oO = o0000o00;
            oooO00o.f5624Oooo0oo = j;
            return oooO00o.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5622Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000O00 o0000o00 = this.f5623Oooo0oO;
                long j = this.f5624Oooo0oo;
                if (this.f5621Oooo) {
                    o000 o000Var = this.f5626OoooO00;
                    o0O00OO<o000Oo0> o0o00oo2 = this.f5625OoooO0;
                    oO0Oo<Function0<Boolean>> oo0oo = this.f5627OoooO0O;
                    this.f5622Oooo0o = 1;
                    if (ClickableKt.OooO0o(o0000o00, j, o000Var, o0o00oo2, oo0oo, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class OooO0O0 extends Lambda implements Function1<o00O0O.OooO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f5628Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function0<Unit>> f5629Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(boolean z, oO0Oo<? extends Function0<Unit>> oo0oo) {
            super(1);
            this.f5628Oooo0o = z;
            this.f5629Oooo0oO = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O0O.OooO oooO) {
            long j = oooO.f30395OooO00o;
            if (this.f5628Oooo0o) {
                this.f5629Oooo0oO.getValue().invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0o(boolean z, o000 o000Var, o0O00OO<o000Oo0> o0o00oo2, oO0Oo<? extends Function0<Boolean>> oo0oo, oO0Oo<? extends Function0<Unit>> oo0oo2, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f5617Oooo0oo = z;
        this.f5614Oooo = o000Var;
        this.f5619OoooO00 = o0o00oo2;
        this.f5618OoooO0 = oo0oo;
        this.f5620OoooO0O = oo0oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooO0o oooO0o = new OooO0o(this.f5617Oooo0oo, this.f5614Oooo, this.f5619OoooO00, this.f5618OoooO0, this.f5620OoooO0O, continuation);
        oooO0o.f5616Oooo0oO = obj;
        return oooO0o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((OooO0o) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5615Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f5616Oooo0oO;
            OooO00o oooO00o = new OooO00o(this.f5617Oooo0oo, this.f5614Oooo, this.f5619OoooO00, this.f5618OoooO0, null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f5617Oooo0oo, this.f5620OoooO0O);
            this.f5615Oooo0o = 1;
            if (o000OOo0.OooO0Oo(o00000Var, oooO00o, oooO0O0, this) == coroutine_suspended) {
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
