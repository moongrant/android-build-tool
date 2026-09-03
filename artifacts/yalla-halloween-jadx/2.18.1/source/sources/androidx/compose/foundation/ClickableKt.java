package androidx.compose.foundation;

import Oooo0.o00000;
import Oooo0.o000000;
import Oooo0.o000O0Oo;
import Oooo0.o000OOo;
import Oooo0.o00O0000;
import Oooo0.o00O0O;
import Oooo0.o00Ooo;
import Oooo000.o0000O00;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0ooO;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.facebook.GraphResponse;
import com.facebook.internal.FacebookRequestErrorClassification;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o000;
import p026Oooo0OO.o0000O;
import p026Oooo0OO.o000O00;
import p026Oooo0OO.o000O0o;
import p026Oooo0OO.o000Oo0;
import p048OoooooO.o00OOO0O;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class ClickableKt {

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o000Oo0> f5540Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000 f5541Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<o000Oo0> o0o00oo2, o000 o000Var) {
            super(1);
            this.f5540Oooo0o = o0o00oo2;
            this.f5541Oooo0oO = o000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o00O0O(this.f5540Oooo0o, this.f5541Oooo0oO);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000 f5542Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o000Oo0> f5543Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f5544Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000 o000Var, o0O00OO<o000Oo0> o0o00oo2, int i) {
            super(2);
            this.f5542Oooo0o = o000Var;
            this.f5543Oooo0oO = o0o00oo2;
            this.f5544Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            ClickableKt.OooO00o(this.f5542Oooo0o, this.f5543Oooo0oO, ooo00o, this.f5544Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<p048OoooooO.o00OOOO0, oOO00O, Integer, p048OoooooO.o00OOOO0> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00O0000 f5545Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f5546Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f5547Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000 f5548Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o00000O0.OooOO0O f5549OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f5550OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0, boolean z, o000 o000Var, o00O0000 o00o0001, String str, o00000O0.OooOO0O oooOO0O) {
            super(3);
            this.f5546Oooo0o = function0;
            this.f5547Oooo0oO = z;
            this.f5548Oooo0oo = o000Var;
            this.f5545Oooo = o00o0001;
            this.f5550OoooO00 = str;
            this.f5549OoooO0 = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function3
        public final p048OoooooO.o00OOOO0 invoke(p048OoooooO.o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, 92076020);
            oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(this.f5546Oooo0o, ooo00o2);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            ooo00o2.OooO0o0(1841981204);
            if (this.f5547Oooo0oO) {
                ClickableKt.OooO00o(this.f5548Oooo0oo, o0o00oo2, ooo00o2, 48);
            }
            ooo00o2.Oooo0o0();
            Function0 function0OooO00o = o00000.OooO00o(ooo00o2);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o2 = ooo00o2.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = o0OOO00.OooO0Oo(Boolean.TRUE);
                ooo00o2.Oooo00o(objOooO0o2);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
            p048OoooooO.o00OOOO0 o00oooo0OooO00o = SuspendingPointerInputFilterKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, this.f5548Oooo0oo, Boolean.valueOf(this.f5547Oooo0oO), new androidx.compose.foundation.OooO0o(this.f5547Oooo0oO, this.f5548Oooo0oo, o0o00oo2, o0OOO00.OooO0o(new androidx.compose.foundation.OooO0OO(o0o00oo3, function0OooO00o), ooo00o2), oo0ooOooO0o, null));
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o3 = ooo00o2.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = new androidx.compose.foundation.OooO0O0(o0o00oo3);
                ooo00o2.Oooo00o(objOooO0o3);
            }
            ooo00o2.Oooo0o0();
            p048OoooooO.o00OOOO0 other = (p048OoooooO.o00OOOO0) objOooO0o3;
            Intrinsics.checkNotNullParameter(other, "other");
            p048OoooooO.o00OOOO0 o00oooo0OooO0o0 = ClickableKt.OooO0o0(other, o00oooo0OooO00o, this.f5548Oooo0oo, this.f5545Oooo, this.f5547Oooo0oO, this.f5550OoooO00, this.f5549OoooO0, null, null, this.f5546Oooo0o);
            ooo00o2.Oooo0o0();
            return o00oooo0OooO0o0;
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 414, 421, 422, 431}, m = "invokeSuspend", n = {"delayJob", GraphResponse.SUCCESS_KEY, "releaseInteraction"}, s = {"L$0", "Z$0", "L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ p025Oooo0O0.o0000O00 f5551Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f5552Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f5553Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f5554Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function0<Boolean>> f5555OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000 f5556OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f5557OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o000Oo0> f5558OoooO0O;

        @DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {406, 409}, m = "invokeSuspend", n = {"pressInteraction"}, s = {"L$0"})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ long f5559Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public o000Oo0 f5560Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public int f5561Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ oO0Oo<Function0<Boolean>> f5562Oooo0oo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<o000Oo0> f5563OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ o000 f5564OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(oO0Oo<? extends Function0<Boolean>> oo0oo, long j, o000 o000Var, o0O00OO<o000Oo0> o0o00oo2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f5562Oooo0oo = oo0oo;
                this.f5559Oooo = j;
                this.f5564OoooO00 = o000Var;
                this.f5563OoooO0 = o0o00oo2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f5562Oooo0oo, this.f5559Oooo, this.f5564OoooO00, this.f5563OoooO0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o000Oo0 o000oo1;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f5561Oooo0oO;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o000oo1 = this.f5560Oooo0o;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f5563OoooO0.setValue(o000oo1);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                if (this.f5562Oooo0oo.getValue().invoke().booleanValue()) {
                    long j = o00000.f538OooO00o;
                    this.f5561Oooo0oO = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o000Oo0 o000oo2 = new o000Oo0(this.f5559Oooo);
                o000 o000Var = this.f5564OoooO00;
                this.f5560Oooo0o = o000oo2;
                this.f5561Oooo0oO = 2;
                if (o000Var.OooO0OO(o000oo2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o000oo1 = o000oo2;
                this.f5563OoooO0.setValue(o000oo1);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(p025Oooo0O0.o0000O00 o0000o00, long j, o000 o000Var, o0O00OO<o000Oo0> o0o00oo2, oO0Oo<? extends Function0<Boolean>> oo0oo, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f5551Oooo = o0000o00;
            this.f5557OoooO00 = j;
            this.f5556OoooO0 = o000Var;
            this.f5558OoooO0O = o0o00oo2;
            this.f5555OoooO = oo0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f5551Oooo, this.f5557OoooO00, this.f5556OoooO0, this.f5558OoooO0O, this.f5555OoooO, continuation);
            oooO0o.f5554Oooo0oo = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008e  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Job jobLaunch$default;
            Object objO00Ooo;
            boolean z;
            o000Oo0 o000oo1;
            o000O00 o000o01;
            o000 o000Var;
            o000O00 o000o02;
            o000 o000Var2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5553Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    jobLaunch$default = (Job) this.f5554Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    objO00Ooo = obj;
                } else if (i == 2) {
                    z = this.f5552Oooo0o;
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        o000oo1 = new o000Oo0(this.f5557OoooO00);
                        o000o01 = new o000O00(o000oo1);
                        o000Var = this.f5556OoooO0;
                        this.f5554Oooo0oo = o000o01;
                        this.f5553Oooo0oO = 3;
                        if (o000Var.OooO0OO(o000oo1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o02 = o000o01;
                        o000Var2 = this.f5556OoooO0;
                        this.f5554Oooo0oo = null;
                        this.f5553Oooo0oO = 4;
                        if (o000Var2.OooO0OO(o000o02, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 3) {
                    o000o02 = (o000O00) this.f5554Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    o000Var2 = this.f5556OoooO0;
                    this.f5554Oooo0oo = null;
                    this.f5553Oooo0oO = 4;
                    if (o000Var2.OooO0OO(o000o02, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f5558OoooO0O.setValue(null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f5554Oooo0oo, null, null, new OooO00o(this.f5555OoooO, this.f5557OoooO00, this.f5556OoooO0, this.f5558OoooO0O, null), 3, null);
            p025Oooo0O0.o0000O00 o0000o00 = this.f5551Oooo;
            this.f5554Oooo0oo = jobLaunch$default;
            this.f5553Oooo0oO = 1;
            objO00Ooo = o0000o00.o00Ooo(this);
            if (objO00Ooo == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) objO00Ooo).booleanValue();
            if (jobLaunch$default.isActive()) {
                this.f5554Oooo0oo = null;
                this.f5552Oooo0o = zBooleanValue;
                this.f5553Oooo0oO = 2;
                if (JobKt.cancelAndJoin(jobLaunch$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zBooleanValue;
                if (z) {
                    o000oo1 = new o000Oo0(this.f5557OoooO00);
                    o000o01 = new o000O00(o000oo1);
                    o000Var = this.f5556OoooO0;
                    this.f5554Oooo0oo = o000o01;
                    this.f5553Oooo0oO = 3;
                    if (o000Var.OooO0OO(o000oo1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o000o02 = o000o01;
                    o000Var2 = this.f5556OoooO0;
                    this.f5554Oooo0oo = null;
                    this.f5553Oooo0oO = 4;
                    if (o000Var2.OooO0OO(o000o02, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                o000Oo0 value = this.f5558OoooO0O.getValue();
                if (value != null) {
                    o000 o000Var3 = this.f5556OoooO0;
                    o0000O o000o03 = zBooleanValue ? new o000O00(value) : new o000O0o(value);
                    this.f5554Oooo0oo = null;
                    this.f5553Oooo0oO = 5;
                    if (o000Var3.OooO0OO(o000o03, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            this.f5558OoooO0O.setValue(null);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@NotNull o000 interactionSource, @NotNull o0O00OO<o000Oo0> pressedInteraction, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(pressedInteraction, "pressedInteraction");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1761107222);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(interactionSource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(pressedInteraction) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            ooo00oOooOOo.OooO0o0(511388516);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(pressedInteraction) | ooo00oOooOOo.Oooo0oo(interactionSource);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooO00o(pressedInteraction, interactionSource);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0O0(interactionSource, (Function1) objOooO0o, ooo00oOooOOo);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(interactionSource, pressedInteraction, i));
    }

    @NotNull
    public static final p048OoooooO.o00OOOO0 OooO0O0(@NotNull p048OoooooO.o00OOOO0 clickable, @NotNull o000 interactionSource, @Nullable o00O0000 o00o0001, boolean z, @Nullable String str, @Nullable o00000O0.OooOO0O oooOO0O, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(clickable, o00oOoo.f6560OooO00o, new OooO0OO(onClick, z, interactionSource, o00o0001, str, oooOO0O));
    }

    public static p048OoooooO.o00OOOO0 OooO0Oo(p048OoooooO.o00OOOO0 clickable, boolean z, Function0 onClick, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(clickable, o00oOoo.f6560OooO00o, new o00Ooo(z, null, null, onClick));
    }

    @Nullable
    public static final Object OooO0o(@NotNull p025Oooo0O0.o0000O00 o0000o00, long j, @NotNull o000 o000Var, @NotNull o0O00OO<o000Oo0> o0o00oo2, @NotNull oO0Oo<? extends Function0<Boolean>> oo0oo, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OooO0o(o0000o00, j, o000Var, o0o00oo2, oo0oo, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @NotNull
    public static final p048OoooooO.o00OOOO0 OooO0o0(@NotNull p048OoooooO.o00OOOO0 genericClickableWithoutGesture, @NotNull p048OoooooO.o00OOOO0 gestureModifiers, @NotNull o000 interactionSource, @Nullable o00O0000 o00o0001, boolean z, @Nullable String str, @Nullable o00000O0.OooOO0O oooOO0O, @Nullable String str2, @Nullable Function0<Unit> function0, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        p048OoooooO.o00OOOO0 o00oooo0OooO00o = HoverableKt.OooO00o(IndicationKt.OooO00o(KeyInputModifierKt.OooO00o(SemanticsModifierKt.OooO00o(genericClickableWithoutGesture, true, new o000OOo(oooOO0O, str, function0, str2, z, onClick)), new o000000(z, onClick)), interactionSource, o00o0001), interactionSource, z);
        o0O0ooO o0o0ooo = FocusableKt.f5584OooO00o;
        Intrinsics.checkNotNullParameter(o00oooo0OooO00o, "<this>");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo0OooO00o, o00oOoo.f6560OooO00o, new o000O0Oo(z, interactionSource)).OooOOoo(gestureModifiers);
    }
}
