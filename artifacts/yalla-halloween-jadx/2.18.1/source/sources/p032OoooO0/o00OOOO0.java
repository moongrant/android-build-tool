package p032OoooO0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o0000O00;
import p025Oooo0O0.o000OOo0;
import p026Oooo0OO.o000;
import p026Oooo0OO.o0000O;
import p026Oooo0OO.o000O00;
import p026Oooo0OO.o000O0o;
import p026Oooo0OO.o000Oo0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oO0Oo;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class o00OOOO0 extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o000Oo0> f3201Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f3202Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f3203Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f3204Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<OooO, Unit>> f3205OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000 f3206OoooO00;

    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function3<o0000O00, OooO, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f3207Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3208Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ o0000O00 f3209Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ long f3210Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000 f3211OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o000Oo0> f3212OoooO00;

        /* JADX INFO: renamed from: OoooO0.o00OOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {61, 65}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
        public static final class C0024OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ long f3213Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public Object f3214Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public int f3215Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<o000Oo0> f3216Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ o000 f3217OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0024OooO00o(o0O00OO<o000Oo0> o0o00oo2, long j, o000 o000Var, Continuation<? super C0024OooO00o> continuation) {
                super(2, continuation);
                this.f3216Oooo0oo = o0o00oo2;
                this.f3213Oooo = j;
                this.f3217OoooO00 = o000Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0024OooO00o(this.f3216Oooo0oo, this.f3213Oooo, this.f3217OoooO00, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0024OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x005a  */
            /* JADX WARN: Code duplicated, block: B:24:0x0064 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x0065  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0O00OO<o000Oo0> o0o00oo2;
                o0O00OO<o000Oo0> o0o00oo3;
                o000Oo0 o000oo1;
                o000 o000Var;
                o000Oo0 o000oo2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f3215Oooo0oO;
                if (i != 0) {
                    if (i == 1) {
                        o0o00oo3 = (o0O00OO) this.f3214Oooo0o;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o000oo2 = (o000Oo0) this.f3214Oooo0o;
                        ResultKt.throwOnFailure(obj);
                    }
                    o000oo1 = o000oo2;
                    this.f3216Oooo0oo.setValue(o000oo1);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                o000Oo0 value = this.f3216Oooo0oo.getValue();
                if (value != null) {
                    o000 o000Var2 = this.f3217OoooO00;
                    o0o00oo2 = this.f3216Oooo0oo;
                    o000O0o o000o0o2 = new o000O0o(value);
                    if (o000Var2 != null) {
                        this.f3214Oooo0o = o0o00oo2;
                        this.f3215Oooo0oO = 1;
                        if (o000Var2.OooO0OO(o000o0o2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o0o00oo3 = o0o00oo2;
                    }
                    o0o00oo2.setValue(null);
                    o000oo1 = new o000Oo0(this.f3213Oooo);
                    o000Var = this.f3217OoooO00;
                    if (o000Var != null) {
                        this.f3214Oooo0o = o000oo1;
                        this.f3215Oooo0oO = 2;
                        if (o000Var.OooO0OO(o000oo1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oo2 = o000oo1;
                        o000oo1 = o000oo2;
                    }
                } else {
                    o000oo1 = new o000Oo0(this.f3213Oooo);
                    o000Var = this.f3217OoooO00;
                    if (o000Var != null) {
                        this.f3214Oooo0o = o000oo1;
                        this.f3215Oooo0oO = 2;
                        if (o000Var.OooO0OO(o000oo1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oo2 = o000oo1;
                        o000oo1 = o000oo2;
                    }
                }
                this.f3216Oooo0oo.setValue(o000oo1);
                return Unit.INSTANCE;
                o0o00oo2 = o0o00oo3;
                o0o00oo2.setValue(null);
                o000oo1 = new o000Oo0(this.f3213Oooo);
                o000Var = this.f3217OoooO00;
                if (o000Var != null) {
                    this.f3214Oooo0o = o000oo1;
                    this.f3215Oooo0oO = 2;
                    if (o000Var.OooO0OO(o000oo1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o000oo2 = o000oo1;
                    o000oo1 = o000oo2;
                }
                this.f3216Oooo0oo.setValue(o000oo1);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ boolean f3218Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public o0O00OO f3219Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public int f3220Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<o000Oo0> f3221Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ o000 f3222OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0O00OO<o000Oo0> o0o00oo2, boolean z, o000 o000Var, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f3221Oooo0oo = o0o00oo2;
                this.f3218Oooo = z;
                this.f3222OoooO00 = o000Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f3221Oooo0oo, this.f3218Oooo, this.f3222OoooO00, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0O00OO<o000Oo0> o0o00oo2;
                o0O00OO<o000Oo0> o0o00oo3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f3220Oooo0oO;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o000Oo0 value = this.f3221Oooo0oo.getValue();
                    if (value != null) {
                        boolean z = this.f3218Oooo;
                        o000 o000Var = this.f3222OoooO00;
                        o0o00oo2 = this.f3221Oooo0oo;
                        o0000O o000o01 = z ? new o000O00(value) : new o000O0o(value);
                        if (o000Var != null) {
                            this.f3219Oooo0o = o0o00oo2;
                            this.f3220Oooo0oO = 1;
                            if (o000Var.OooO0OO(o000o01, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o0o00oo3 = o0o00oo2;
                        }
                        o0o00oo2.setValue(null);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0o00oo3 = this.f3219Oooo0o;
                ResultKt.throwOnFailure(obj);
                o0o00oo2 = o0o00oo3;
                o0o00oo2.setValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CoroutineScope coroutineScope, o0O00OO<o000Oo0> o0o00oo2, o000 o000Var, Continuation<? super OooO00o> continuation) {
            super(3, continuation);
            this.f3207Oooo = coroutineScope;
            this.f3212OoooO00 = o0o00oo2;
            this.f3211OoooO0 = o000Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(o0000O00 o0000o00, OooO oooO, Continuation<? super Unit> continuation) {
            long j = oooO.f30395OooO00o;
            OooO00o oooO00o = new OooO00o(this.f3207Oooo, this.f3212OoooO00, this.f3211OoooO0, continuation);
            oooO00o.f3209Oooo0oO = o0000o00;
            oooO00o.f3210Oooo0oo = j;
            return oooO00o.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3208Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000O00 o0000o00 = this.f3209Oooo0oO;
                BuildersKt__Builders_commonKt.launch$default(this.f3207Oooo, null, null, new C0024OooO00o(this.f3212OoooO00, this.f3210Oooo0oo, this.f3211OoooO0, null), 3, null);
                this.f3208Oooo0o = 1;
                obj = o0000o00.o00Ooo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(this.f3207Oooo, null, null, new OooO0O0(this.f3212OoooO00, ((Boolean) obj).booleanValue(), this.f3211OoooO0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<OooO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function1<OooO, Unit>> f3223Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(oO0Oo<? extends Function1<? super OooO, Unit>> oo0oo) {
            super(1);
            this.f3223Oooo0o = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooO oooO) {
            this.f3223Oooo0o.getValue().invoke(new OooO(oooO.f30395OooO00o));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OOOO0(CoroutineScope coroutineScope, o0O00OO<o000Oo0> o0o00oo2, o000 o000Var, oO0Oo<? extends Function1<? super OooO, Unit>> oo0oo, Continuation<? super o00OOOO0> continuation) {
        super(2, continuation);
        this.f3204Oooo0oo = coroutineScope;
        this.f3201Oooo = o0o00oo2;
        this.f3206OoooO00 = o000Var;
        this.f3205OoooO0 = oo0oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00OOOO0 o00oooo1 = new o00OOOO0(this.f3204Oooo0oo, this.f3201Oooo, this.f3206OoooO00, this.f3205OoooO0, continuation);
        o00oooo1.f3203Oooo0oO = obj;
        return o00oooo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((o00OOOO0) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3202Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f3203Oooo0oO;
            OooO00o oooO00o = new OooO00o(this.f3204Oooo0oo, this.f3201Oooo, this.f3206OoooO00, null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f3205OoooO0);
            this.f3202Oooo0o = 1;
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
