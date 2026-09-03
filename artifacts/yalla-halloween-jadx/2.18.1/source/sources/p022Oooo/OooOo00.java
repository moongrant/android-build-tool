package p022Oooo;

import androidx.compose.foundation.ClickableKt;
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
import o00O0O.OooO;
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
@DebugMetadata(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1", f = "Toggleable.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo00 extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000 f455Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f456Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f457Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f458Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function0<Boolean>> f459OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o000Oo0> f460OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function0<Unit>> f461OoooO0O;

    @DebugMetadata(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1", f = "Toggleable.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function3<o0000O00, OooO, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f462Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f463Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ o0000O00 f464Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ long f465Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o000Oo0> f466OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000 f467OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function0<Boolean>> f468OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(boolean z, o000 o000Var, o0O00OO<o000Oo0> o0o00oo2, oO0Oo<? extends Function0<Boolean>> oo0oo, Continuation<? super OooO00o> continuation) {
            super(3, continuation);
            this.f462Oooo = z;
            this.f467OoooO00 = o000Var;
            this.f466OoooO0 = o0o00oo2;
            this.f468OoooO0O = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(o0000O00 o0000o00, OooO oooO, Continuation<? super Unit> continuation) {
            long j = oooO.f30395OooO00o;
            OooO00o oooO00o = new OooO00o(this.f462Oooo, this.f467OoooO00, this.f466OoooO0, this.f468OoooO0O, continuation);
            oooO00o.f464Oooo0oO = o0000o00;
            oooO00o.f465Oooo0oo = j;
            return oooO00o.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f463Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000O00 o0000o00 = this.f464Oooo0oO;
                long j = this.f465Oooo0oo;
                if (this.f462Oooo) {
                    o000 o000Var = this.f467OoooO00;
                    o0O00OO<o000Oo0> o0o00oo2 = this.f466OoooO0;
                    oO0Oo<Function0<Boolean>> oo0oo = this.f468OoooO0O;
                    this.f463Oooo0o = 1;
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

    public static final class OooO0O0 extends Lambda implements Function1<OooO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f469Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function0<Unit>> f470Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(boolean z, oO0Oo<? extends Function0<Unit>> oo0oo) {
            super(1);
            this.f469Oooo0o = z;
            this.f470Oooo0oO = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooO oooO) {
            long j = oooO.f30395OooO00o;
            if (this.f469Oooo0o) {
                this.f470Oooo0oO.getValue().invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOo00(boolean z, o000 o000Var, o0O00OO<o000Oo0> o0o00oo2, oO0Oo<? extends Function0<Boolean>> oo0oo, oO0Oo<? extends Function0<Unit>> oo0oo2, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f458Oooo0oo = z;
        this.f455Oooo = o000Var;
        this.f460OoooO00 = o0o00oo2;
        this.f459OoooO0 = oo0oo;
        this.f461OoooO0O = oo0oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooOo00 oooOo00 = new OooOo00(this.f458Oooo0oo, this.f455Oooo, this.f460OoooO00, this.f459OoooO0, this.f461OoooO0O, continuation);
        oooOo00.f457Oooo0oO = obj;
        return oooOo00;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((OooOo00) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f456Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f457Oooo0oO;
            OooO00o oooO00o = new OooO00o(this.f458Oooo0oo, this.f455Oooo, this.f460OoooO00, this.f459OoooO0, null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f458Oooo0oo, this.f461OoooO0O);
            this.f456Oooo0o = 1;
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
