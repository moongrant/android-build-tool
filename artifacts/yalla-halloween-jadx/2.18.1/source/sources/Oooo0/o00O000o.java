package Oooo0;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {365}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
public final class o00O000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f617Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f618Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f619Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f620Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow<Unit> f621OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooO f622OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ View f623OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ float f624OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<o0000O0O.OooOo00, Unit>> f625OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<o00O0O.OooO> f626OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<o0000O0O.OooO, o00O0O.OooO>> f627OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o00O0O.OooO> f628OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Float> f629OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Boolean> f630o000oOoO;

    @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO00O f631Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OO00O o00oo00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f631Oooo0o = o00oo00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f631Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f631Oooo0o.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<o00O0O.OooO> f632Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO00O f633Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000O0O.OooO f634Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Boolean> f635Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f636OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0O.OooO> f637OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function1<o0000O0O.OooO, o00O0O.OooO>> f638OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Float> f639OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function1<o0000O0O.OooOo00, Unit>> f640OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o00OO00O o00oo00o, o0000O0O.OooO oooO, oO0Oo<Boolean> oo0oo, oO0Oo<o00O0O.OooO> oo0oo2, oO0Oo<? extends Function1<? super o0000O0O.OooO, o00O0O.OooO>> oo0oo3, o0O00OO<o00O0O.OooO> o0o00oo2, oO0Oo<Float> oo0oo4, Ref.LongRef longRef, oO0Oo<? extends Function1<? super o0000O0O.OooOo00, Unit>> oo0oo5) {
            super(0);
            this.f633Oooo0o = o00oo00o;
            this.f634Oooo0oO = oooO;
            this.f635Oooo0oo = oo0oo;
            this.f632Oooo = oo0oo2;
            this.f638OoooO00 = oo0oo3;
            this.f637OoooO0 = o0o00oo2;
            this.f639OoooO0O = oo0oo4;
            this.f636OoooO = longRef;
            this.f640OoooOO0 = oo0oo5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            long jOooO0oO;
            if (this.f635Oooo0oo.getValue().booleanValue()) {
                o00OO00O o00oo00o = this.f633Oooo0o;
                long jOooO0O0 = o00O0.OooO0O0(this.f632Oooo);
                o00O0O.OooO oooOInvoke = this.f638OoooO00.getValue().invoke(this.f634Oooo0oO);
                o0O00OO<o00O0O.OooO> o0o00oo2 = this.f637OoooO0;
                long j = oooOInvoke.f30395OooO00o;
                if (o00O0O.OooOO0.OooO0OO(j)) {
                    jOooO0oO = o00O0O.OooO.OooO0oO(o00O0.OooO00o(o0o00oo2), j);
                } else {
                    o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
                    jOooO0oO = o00O0O.OooO.f30394OooO0o0;
                }
                o00oo00o.OooO0O0(jOooO0O0, jOooO0oO, this.f639OoooO0O.getValue().floatValue());
                long jOooO00o = this.f633Oooo0o.OooO00o();
                Ref.LongRef longRef = this.f636OoooO;
                o0000O0O.OooO oooO = this.f634Oooo0oO;
                oO0Oo<Function1<o0000O0O.OooOo00, Unit>> oo0oo = this.f640OoooOO0;
                if (!o0000O0O.o000oOoO.OooO00o(jOooO00o, longRef.element)) {
                    longRef.element = jOooO00o;
                    Function1<o0000O0O.OooOo00, Unit> value = oo0oo.getValue();
                    if (value != null) {
                        value.invoke(new o0000O0O.OooOo00(oooO.OooOoo0(o0000O0O.o0OoOo0.OooO0O0(jOooO00o))));
                    }
                }
            } else {
                this.f633Oooo0o.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O000o(o00OO0O0 o00oo0o1, o00O0O0 o00o0o0, View view, o0000O0O.OooO oooO, float f, MutableSharedFlow<Unit> mutableSharedFlow, oO0Oo<? extends Function1<? super o0000O0O.OooOo00, Unit>> oo0oo, oO0Oo<Boolean> oo0oo2, oO0Oo<o00O0O.OooO> oo0oo3, oO0Oo<? extends Function1<? super o0000O0O.OooO, o00O0O.OooO>> oo0oo4, o0O00OO<o00O0O.OooO> o0o00oo2, oO0Oo<Float> oo0oo5, Continuation<? super o00O000o> continuation) {
        super(2, continuation);
        this.f620Oooo0oo = o00oo0o1;
        this.f617Oooo = o00o0o0;
        this.f623OoooO00 = view;
        this.f622OoooO0 = oooO;
        this.f624OoooO0O = f;
        this.f621OoooO = mutableSharedFlow;
        this.f625OoooOO0 = oo0oo;
        this.f630o000oOoO = oo0oo2;
        this.f626OoooOOO = oo0oo3;
        this.f627OoooOOo = oo0oo4;
        this.f628OoooOo0 = o0o00oo2;
        this.f629OoooOoO = oo0oo5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O000o o00o000o2 = new o00O000o(this.f620Oooo0oo, this.f617Oooo, this.f623OoooO00, this.f622OoooO0, this.f624OoooO0O, this.f621OoooO, this.f625OoooOO0, this.f630o000oOoO, this.f626OoooOOO, this.f627OoooOOo, this.f628OoooOo0, this.f629OoooOoO, continuation);
        o00o000o2.f619Oooo0oO = obj;
        return o00o000o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        o00OO00O o00oo00o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f618Oooo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00oo00o = (o00OO00O) this.f619Oooo0oO;
            try {
                ResultKt.throwOnFailure(obj);
                o00oo00o.dismiss();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                o00oo00o.dismiss();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f619Oooo0oO;
        o00OO00O o00oo00oOooO0O0 = this.f620Oooo0oo.OooO0O0(this.f617Oooo, this.f623OoooO00, this.f622OoooO0, this.f624OoooO0O);
        Ref.LongRef longRef = new Ref.LongRef();
        long jOooO00o = o00oo00oOooO0O0.OooO00o();
        o0000O0O.OooO oooO = this.f622OoooO0;
        Function1<o0000O0O.OooOo00, Unit> value = this.f625OoooOO0.getValue();
        if (value != null) {
            value.invoke(new o0000O0O.OooOo00(oooO.OooOoo0(o0000O0O.o0OoOo0.OooO0O0(jOooO00o))));
        }
        longRef.element = jOooO00o;
        FlowKt.launchIn(FlowKt.onEach(this.f621OoooO, new OooO00o(o00oo00oOooO0O0, null)), coroutineScope);
        try {
            Flow flowOooO0oO = o0OOO00.OooO0oO(new OooO0O0(o00oo00oOooO0O0, this.f622OoooO0, this.f630o000oOoO, this.f626OoooOOO, this.f627OoooOOo, this.f628OoooOo0, this.f629OoooOoO, longRef, this.f625OoooOO0));
            this.f619Oooo0oO = o00oo00oOooO0O0;
            this.f618Oooo0o = 1;
            if (FlowKt.collect(flowOooO0oO, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00oo00o = o00oo00oOooO0O0;
            o00oo00o.dismiss();
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            o00oo00o = o00oo00oOooO0O0;
            o00oo00o.dismiss();
            throw th;
        }
    }
}
