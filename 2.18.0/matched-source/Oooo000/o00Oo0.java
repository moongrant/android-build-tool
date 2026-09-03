package Oooo000;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00O0O0;
import p023Oooo00O.o00OO000;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.o0O00000;
import p023Oooo00O.oo0O;
import p023Oooo00O.oo0oOO0;
import p028Oooo0o0.o0O00oO0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    public static final class OooO extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f929Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f930OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000O0o f931OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f932OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o000O00 f933OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f934OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f935OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f936o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(boolean z, o00OOOO0 o00oooo1, o000O0o o000o0o2, o000O00 o000o01, String str, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f929Oooo = z;
            this.f932OoooO00 = o00oooo1;
            this.f931OoooO0 = o000o0o2;
            this.f933OoooO0O = o000o01;
            this.f930OoooO = str;
            this.f934OoooOO0 = function3;
            this.f936o000oOoO = i;
            this.f935OoooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO0o0(this.f929Oooo, this.f932OoooO00, this.f931OoooO0, this.f933OoooO0O, this.f930OoooO, this.f934OoooOO0, ooo00o, this.f936o000oOoO | 1, this.f935OoooOOO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", i = {}, l = {748}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f937Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f938OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ p023Oooo00O.oo00o<EnterExitState> f939OoooO00;

        /* JADX INFO: renamed from: Oooo000.o00Oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0008OooO00o extends Lambda implements Function0<Boolean> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ p023Oooo00O.oo00o<EnterExitState> f940Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0008OooO00o(p023Oooo00O.oo00o<EnterExitState> oo00oVar) {
                super(0);
                this.f940Oooo = oo00oVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                EnterExitState enterExitStateOooO0O0 = this.f940Oooo.OooO0O0();
                EnterExitState enterExitState = EnterExitState.Visible;
                return Boolean.valueOf(enterExitStateOooO0O0 == enterExitState || this.f940Oooo.OooO0o() == enterExitState);
            }
        }

        public static final class OooO0O0 implements FlowCollector<Boolean> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o0O00O<Boolean> f941Oooo;

            public OooO0O0(o0O00O<Boolean> o0o00o2) {
                this.f941Oooo = o0o00o2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Boolean bool, Continuation continuation) {
                this.f941Oooo.setValue(Boxing.boxBoolean(bool.booleanValue()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(p023Oooo00O.oo00o<EnterExitState> oo00oVar, o0O00O<Boolean> o0o00o2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f939OoooO00 = oo00oVar;
            this.f938OoooO0 = o0o00o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f939OoooO00, this.f938OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f937Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOooO0oO = o0OOO00.OooO0oO(new C0008OooO00o(this.f939OoooO00));
                OooO0O0 oooO0O0 = new OooO0O0(this.f938OoooO0);
                this.f937Oooo = 1;
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

    public static final class OooO0O0 extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ p023Oooo00O.oo00o<T> f942Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o000O00 f943OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f944OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f945OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o000O0o f946OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f947OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f948o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(p023Oooo00O.oo00o<T> oo00oVar, Function1<? super T, Boolean> function1, o00OOOO0 o00oooo1, o000O0o o000o0o2, o000O00 o000o01, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f942Oooo = oo00oVar;
            this.f945OoooO00 = function1;
            this.f944OoooO0 = o00oooo1;
            this.f946OoooO0O = o000o0o2;
            this.f943OoooO = o000o01;
            this.f947OoooOO0 = function3;
            this.f948o000oOoO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO00o(this.f942Oooo, this.f945OoooO00, this.f944OoooO0, this.f946OoooO0O, this.f943OoooO, this.f947OoooOO0, ooo00o, this.f948o000oOoO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ p023Oooo00O.oo00o<T> f949Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o000O00 f950OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f951OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f952OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o000O0o f953OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f954OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f955OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f956o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(p023Oooo00O.oo00o<T> oo00oVar, Function1<? super T, Boolean> function1, o00OOOO0 o00oooo1, o000O0o o000o0o2, o000O00 o000o01, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f949Oooo = oo00oVar;
            this.f952OoooO00 = function1;
            this.f951OoooO0 = o00oooo1;
            this.f953OoooO0O = o000o0o2;
            this.f950OoooO = o000o01;
            this.f954OoooOO0 = function3;
            this.f956o000oOoO = i;
            this.f955OoooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO0OO(this.f949Oooo, this.f952OoooO00, this.f951OoooO0, this.f953OoooO0O, this.f950OoooO, this.f954OoooOO0, ooo00o, this.f956o000oOoO | 1, this.f955OoooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0o f957Oooo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooOO0 f958Oooo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f959Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o000O00 f960OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f961OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f962OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o000O0o f963OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ String f964OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f965OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ int f966OoooOOo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f967o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(o0O00oO0 o0o00oo1, boolean z, o00OOOO0 o00oooo1, o000O0o o000o0o2, o000O00 o000o01, String str, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f959Oooo = o0o00oo1;
            this.f962OoooO00 = z;
            this.f961OoooO0 = o00oooo1;
            this.f963OoooO0O = o000o0o2;
            this.f960OoooO = o000o01;
            this.f964OoooOO0 = str;
            this.f967o000oOoO = function3;
            this.f965OoooOOO = i;
            this.f966OoooOOo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO0Oo(this.f959Oooo, this.f962OoooO00, this.f961OoooO0, this.f963OoooO0O, this.f960OoooO, this.f964OoooOO0, this.f967o000oOoO, ooo00o, this.f965OoooOOO | 1, this.f966OoooOOo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ p023Oooo00O.o000O<Boolean> f968Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f969OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000O0o f970OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f971OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o000O00 f972OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f973OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f974OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f975o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(p023Oooo00O.o000O<Boolean> o000o, o00OOOO0 o00oooo1, o000O0o o000o0o2, o000O00 o000o01, String str, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f968Oooo = o000o;
            this.f971OoooO00 = o00oooo1;
            this.f970OoooO0 = o000o0o2;
            this.f972OoooO0O = o000o01;
            this.f969OoooO = str;
            this.f973OoooOO0 = function3;
            this.f975o000oOoO = i;
            this.f974OoooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO0O0(this.f968Oooo, this.f971OoooO00, this.f970OoooO0, this.f972OoooO0O, this.f969OoooO, this.f973OoooOO0, ooo00o, this.f975o000oOoO | 1, this.f974OoooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooOOO0 f976Oooo = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0394  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:178:0x049d  */
    /* JADX WARN: Code duplicated, block: B:208:0x054d  */
    /* JADX WARN: Code duplicated, block: B:229:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:254:0x0630  */
    /* JADX WARN: Code duplicated, block: B:276:0x0741  */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v16, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void OooO00o(p023Oooo00O.oo00o<T> oo00oVar, Function1<? super T, Boolean> function1, o00OOOO0 o00oooo1, o000O0o enter, o000O00 exit, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, p100o000oOoO.oOO00O ooo00o, int i) {
        int i2;
        o0O00O o0o00o2;
        oO0Oo oo0ooOooO0O0;
        float f;
        p146o00Oo0.o00O00 o00o01;
        p146o00Oo0.o00O00 o00o02;
        long j;
        long j2;
        float f2;
        float f3;
        float f4;
        oo0ooO oo0oooOooOo;
        p100o000oOoO.oOO00O composer = ooo00o.OooOOo(808253933);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(oo00oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.Oooo0oo(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composer.Oooo0oo(o00oooo1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composer.Oooo0oo(enter) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= composer.Oooo0oo(exit) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composer.Oooo0oo(function3) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !composer.OooOo0()) {
            int i3 = i2 & 14;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(oo00oVar);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(function1.invoke(oo00oVar.OooO0O0()));
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0O00O o0o00o3 = (o0O00O) objOooO0o;
            if (function1.invoke(oo00oVar.OooO0o()).booleanValue() || ((Boolean) o0o00o3.getValue()).booleanValue() || oo00oVar.OooO0oO()) {
                int i4 = i3 | 48;
                composer.OooO0o0(1215497572);
                int i5 = i4 & 14;
                composer.OooO0o0(1157296644);
                boolean zOooo0oo2 = composer.Oooo0oo(oo00oVar);
                Object objOooO0o2 = composer.OooO0o();
                if (zOooo0oo2 || objOooO0o2 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                    objOooO0o2 = oo00oVar.OooO0O0();
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                if (oo00oVar.OooO0oO()) {
                    objOooO0o2 = oo00oVar.OooO0O0();
                }
                composer.OooO0o0(-1220581778);
                EnterExitState enterExitStateOooO0o = OooO0o(oo00oVar, function1, objOooO0o2, composer);
                composer.Oooo0o0();
                T tOooO0o = oo00oVar.OooO0o();
                composer.OooO0o0(-1220581778);
                EnterExitState enterExitStateOooO0o2 = OooO0o(oo00oVar, function1, tOooO0o, composer);
                composer.Oooo0o0();
                int i6 = ((i4 << 6) & 7168) | i5;
                Intrinsics.checkNotNullParameter(oo00oVar, "<this>");
                Intrinsics.checkNotNullParameter("EnterExitTransition", "childLabel");
                composer.OooO0o0(-198307638);
                composer.OooO0o0(1157296644);
                boolean zOooo0oo3 = composer.Oooo0oo(oo00oVar);
                Object objOooO0o3 = composer.OooO0o();
                if (zOooo0oo3 || objOooO0o3 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                    objOooO0o3 = new p023Oooo00O.oo00o(new p023Oooo00O.o000O(enterExitStateOooO0o), o00O0O.OooO00o(new StringBuilder(), oo00oVar.f1258OooO0O0, " > ", "EnterExitTransition"));
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar2 = (p023Oooo00O.oo00o) objOooO0o3;
                o00Oo00.OooO0O0(oo00oVar2, new o00O0O0(oo00oVar, oo00oVar2), composer);
                if (oo00oVar.OooO0oO()) {
                    oo00oVar2.OooOO0(enterExitStateOooO0o, enterExitStateOooO0o2, oo00oVar.f1266OooOO0O);
                } else {
                    oo00oVar2.OooOOO(enterExitStateOooO0o2, composer, ((i6 >> 3) & 8) | ((i6 >> 6) & 14));
                    oo00oVar2.f1265OooOO0.setValue(Boolean.FALSE);
                }
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.OooO0o0(511388516);
                boolean zOooo0oo4 = composer.Oooo0oo(oo00oVar2) | composer.Oooo0oo(o0o00o3);
                Object objOooO0o4 = composer.OooO0o();
                if (zOooo0oo4 || objOooO0o4 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                    objOooO0o4 = new OooO00o(oo00oVar2, o0o00o3, null);
                    composer.Oooo00o(objOooO0o4);
                }
                composer.Oooo0o0();
                o00Oo00.OooO0o0(oo00oVar2, (Function2) objOooO0o4, composer);
                int i7 = i2 >> 3;
                int i8 = (i7 & 57344) | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                composer.OooO0o0(-1967270694);
                Object objOooO0O0 = oo00oVar2.OooO0O0();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (objOooO0O0 == enterExitState || oo00oVar2.OooO0o() == enterExitState) {
                    int i9 = i8 & 14;
                    composer.OooO0o0(1157296644);
                    boolean zOooo0oo5 = composer.Oooo0oo(oo00oVar2);
                    Object objOooO0o5 = composer.OooO0o();
                    if (zOooo0oo5 || objOooO0o5 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                        objOooO0o5 = new oo000o(oo00oVar2);
                        composer.Oooo00o(objOooO0o5);
                    }
                    composer.Oooo0o0();
                    oo000o oo000oVar = (oo000o) objOooO0o5;
                    int i10 = i8 >> 3;
                    int i11 = i9 | 3072 | (i10 & 112) | (i10 & 896);
                    o00OO0O0<p146o00Oo0.o00O00, p023Oooo00O.o0OO00O> o00oo0o1 = o000OOo.f887OooO00o;
                    Intrinsics.checkNotNullParameter(oo00oVar2, "<this>");
                    Intrinsics.checkNotNullParameter(enter, "enter");
                    Intrinsics.checkNotNullParameter(exit, "exit");
                    Intrinsics.checkNotNullParameter("Built-in", "label");
                    composer.OooO0o0(914000546);
                    o00OOOO0 o00oooo0OooO0O0 = o00OOO0O.OooO0O0(o00OOO0O.OooO0O0(o00OOOO0.OooO00o.f4215Oooo, new o000O000(oo00oVar2, o0OOO00.OooO0o(enter.OooO00o().f912OooO0O0, composer), o0OOO00.OooO0o(exit.OooO00o().f912OooO0O0, composer))), new o0000O0(oo00oVar2, o0OOO00.OooO0o(enter.OooO00o().f913OooO0OO, composer), o0OOO00.OooO0o(exit.OooO00o().f913OooO0OO, composer)));
                    int i12 = i11 & 14;
                    composer.OooO0o0(1157296644);
                    boolean zOooo0oo6 = composer.Oooo0oo(oo00oVar2);
                    Object objOooO0o6 = composer.OooO0o();
                    if (zOooo0oo6 || objOooO0o6 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                        objOooO0o6 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        composer.Oooo00o(objOooO0o6);
                    }
                    composer.Oooo0o0();
                    o0O00O o0o00o4 = (o0O00O) objOooO0o6;
                    composer.OooO0o0(1157296644);
                    boolean zOooo0oo7 = composer.Oooo0oo(oo00oVar2);
                    Object objOooO0o7 = composer.OooO0o();
                    if (zOooo0oo7 || objOooO0o7 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                        objOooO0o7 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        composer.Oooo00o(objOooO0o7);
                    }
                    composer.Oooo0o0();
                    o0O00O o0o00o5 = (o0O00O) objOooO0o7;
                    if (oo00oVar2.OooO0O0() != oo00oVar2.OooO0o() || oo00oVar2.OooO0oO()) {
                        if (enter.OooO00o().f911OooO00o != null || exit.OooO00o().f911OooO00o != null) {
                            o0o00o4.setValue(Boolean.TRUE);
                        }
                        if (enter.OooO00o().f914OooO0Oo != null || exit.OooO00o().f914OooO0Oo != null) {
                            o0o00o5.setValue(Boolean.TRUE);
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        o0o00o4.setValue(bool);
                        o0o00o5.setValue(bool);
                    }
                    composer.OooO0o0(1657240548);
                    float f5 = 1.0f;
                    if (((Boolean) o0o00o4.getValue()).booleanValue()) {
                        o00000 o00000Var = new o00000(enter, exit);
                        composer.OooO0o0(-492369756);
                        Object objOooO0o8 = composer.OooO0o();
                        if (objOooO0o8 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                            objOooO0o8 = "Built-in alpha";
                            composer.Oooo00o("Built-in alpha");
                        }
                        composer.Oooo0o0();
                        String str = (String) objOooO0o8;
                        int i13 = i12 | 384;
                        composer.OooO0o0(-1338768149);
                        o00OO0O0<Float, p023Oooo00O.o0Oo0oo> o00oo0o0OooO0O0 = oo0O.OooO0O0(FloatCompanionObject.INSTANCE);
                        int i14 = i13 & 14;
                        int i15 = i13 << 3;
                        int i16 = i14 | (i15 & 896) | (i15 & 7168) | (i15 & 57344);
                        composer.OooO0o0(-142660079);
                        EnterExitState enterExitState2 = (EnterExitState) oo00oVar2.OooO0O0();
                        composer.OooO0o0(755689166);
                        int[] iArr = o000OOo.OooO0OO.$EnumSwitchMapping$0;
                        int i17 = iArr[enterExitState2.ordinal()];
                        if (i17 == 1) {
                            f3 = 1.0f;
                        } else if (i17 == 2) {
                            o000O0Oo o000o0oo2 = enter.OooO00o().f911OooO00o;
                            if (o000o0oo2 != null) {
                                f3 = o000o0oo2.f880OooO00o;
                            } else {
                                f3 = 1.0f;
                            }
                        } else {
                            if (i17 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o000O0Oo o000o0oo3 = exit.OooO00o().f911OooO00o;
                            if (o000o0oo3 != null) {
                                f3 = o000o0oo3.f880OooO00o;
                            } else {
                                f3 = 1.0f;
                            }
                        }
                        composer.Oooo0o0();
                        Float fValueOf = Float.valueOf(f3);
                        EnterExitState enterExitState3 = (EnterExitState) oo00oVar2.OooO0o();
                        composer.OooO0o0(755689166);
                        int i18 = iArr[enterExitState3.ordinal()];
                        if (i18 == 1) {
                            f4 = 1.0f;
                        } else if (i18 == 2) {
                            o000O0Oo o000o0oo4 = enter.OooO00o().f911OooO00o;
                            if (o000o0oo4 != null) {
                                f4 = o000o0oo4.f880OooO00o;
                            } else {
                                f4 = 1.0f;
                            }
                        } else {
                            if (i18 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o000O0Oo o000o0oo5 = exit.OooO00o().f911OooO00o;
                            if (o000o0oo5 != null) {
                                f4 = o000o0oo5.f880OooO00o;
                            } else {
                                f4 = 1.0f;
                            }
                        }
                        composer.Oooo0o0();
                        o0o00o2 = o0o00o5;
                        oo0ooOooO0O0 = oo0oOO0.OooO0O0(oo00oVar2, fValueOf, Float.valueOf(f4), o00000Var.invoke(oo00oVar2.OooO0Oo(), composer, Integer.valueOf((i16 >> 3) & 112)), o00oo0o0OooO0O0, str, composer);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    } else {
                        o0o00o2 = o0o00o5;
                        oo0ooOooO0O0 = o000OOo.f888OooO0O0;
                    }
                    oO0Oo oo0oo = oo0ooOooO0O0;
                    composer.Oooo0o0();
                    if (((Boolean) o0o00o2.getValue()).booleanValue()) {
                        o00000O0 o00000o1 = new o00000O0(enter, exit);
                        composer.OooO0o0(-492369756);
                        Object objOooO0o9 = composer.OooO0o();
                        if (objOooO0o9 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                            objOooO0o9 = "Built-in scale";
                            composer.Oooo00o("Built-in scale");
                        }
                        composer.Oooo0o0();
                        String str2 = (String) objOooO0o9;
                        int i19 = i12 | 384;
                        composer.OooO0o0(-1338768149);
                        o00OO0O0<Float, p023Oooo00O.o0Oo0oo> o00oo0o0OooO0O1 = oo0O.OooO0O0(FloatCompanionObject.INSTANCE);
                        int i20 = i19 & 14;
                        int i21 = i19 << 3;
                        int i22 = i20 | (i21 & 896) | (i21 & 7168) | (i21 & 57344);
                        composer.OooO0o0(-142660079);
                        EnterExitState enterExitState4 = (EnterExitState) oo00oVar2.OooO0O0();
                        composer.OooO0o0(-596129937);
                        int[] iArr2 = o000OOo.OooO0OO.$EnumSwitchMapping$0;
                        int i23 = iArr2[enterExitState4.ordinal()];
                        if (i23 == 1) {
                            f = 1.0f;
                        } else if (i23 == 2) {
                            o00 o00Var = enter.OooO00o().f914OooO0Oo;
                            if (o00Var != null) {
                                f = o00Var.f827OooO00o;
                            } else {
                                f = 1.0f;
                            }
                        } else {
                            if (i23 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o00 o00Var2 = exit.OooO00o().f914OooO0Oo;
                            if (o00Var2 != null) {
                                f = o00Var2.f827OooO00o;
                            } else {
                                f = 1.0f;
                            }
                        }
                        composer.Oooo0o0();
                        Float fValueOf2 = Float.valueOf(f);
                        EnterExitState enterExitState5 = (EnterExitState) oo00oVar2.OooO0o();
                        composer.OooO0o0(-596129937);
                        int i24 = iArr2[enterExitState5.ordinal()];
                        if (i24 != 1) {
                            if (i24 == 2) {
                                o00 o00Var3 = enter.OooO00o().f914OooO0Oo;
                                if (o00Var3 != null) {
                                    f2 = o00Var3.f827OooO00o;
                                    f5 = f2;
                                }
                            } else {
                                if (i24 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                o00 o00Var4 = exit.OooO00o().f914OooO0Oo;
                                if (o00Var4 != null) {
                                    f2 = o00Var4.f827OooO00o;
                                    f5 = f2;
                                }
                            }
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO0O1 = oo0oOO0.OooO0O0(oo00oVar2, fValueOf2, Float.valueOf(f5), o00000o1.invoke(oo00oVar2.OooO0Oo(), composer, Integer.valueOf((i22 >> 3) & 112)), o00oo0o0OooO0O1, str2, composer);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        if (oo00oVar2.OooO0O0() == EnterExitState.PreEnter) {
                            o00 o00Var5 = enter.OooO00o().f914OooO0Oo;
                            if (o00Var5 != null) {
                                o00o01 = new p146o00Oo0.o00O00(o00Var5.f828OooO0O0);
                            } else {
                                o00 o00Var6 = exit.OooO00o().f914OooO0Oo;
                                if (o00Var6 != null) {
                                    o00o01 = new p146o00Oo0.o00O00(o00Var6.f828OooO0O0);
                                } else {
                                    o00o01 = null;
                                }
                            }
                        } else {
                            o00 o00Var7 = exit.OooO00o().f914OooO0Oo;
                            if (o00Var7 != null) {
                                o00o01 = new p146o00Oo0.o00O00(o00Var7.f828OooO0O0);
                            } else {
                                o00 o00Var8 = enter.OooO00o().f914OooO0Oo;
                                if (o00Var8 != null) {
                                    o00o01 = new p146o00Oo0.o00O00(o00Var8.f828OooO0O0);
                                } else {
                                    o00o01 = null;
                                }
                            }
                        }
                        o00OO0O0<p146o00Oo0.o00O00, p023Oooo00O.o0OO00O> o00oo0o2 = o000OOo.f887OooO00o;
                        int i25 = i12 | 3136;
                        composer.OooO0o0(-142660079);
                        EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = EnterExitTransitionKt$createModifier$$inlined$animateValue$1.f5524Oooo;
                        EnterExitState enterExitState6 = (EnterExitState) oo00oVar2.OooO0O0();
                        composer.OooO0o0(-288165413);
                        int i26 = iArr2[enterExitState6.ordinal()];
                        if (i26 == 1) {
                            o00o02 = o00o01;
                        } else if (i26 == 2) {
                            o00 o00Var9 = enter.OooO00o().f914OooO0Oo;
                            if (o00Var9 != null) {
                                o00o02 = new p146o00Oo0.o00O00(o00Var9.f828OooO0O0);
                            } else {
                                o00 o00Var10 = exit.OooO00o().f914OooO0Oo;
                                if (o00Var10 != null) {
                                    o00o02 = new p146o00Oo0.o00O00(o00Var10.f828OooO0O0);
                                } else {
                                    o00o02 = null;
                                }
                            }
                        } else {
                            if (i26 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o00 o00Var11 = exit.OooO00o().f914OooO0Oo;
                            if (o00Var11 != null) {
                                o00o02 = new p146o00Oo0.o00O00(o00Var11.f828OooO0O0);
                            } else {
                                o00 o00Var12 = enter.OooO00o().f914OooO0Oo;
                                if (o00Var12 != null) {
                                    o00o02 = new p146o00Oo0.o00O00(o00Var12.f828OooO0O0);
                                } else {
                                    o00o02 = null;
                                }
                            }
                        }
                        if (o00o02 != null) {
                            j = o00o02.f32135OooO00o;
                        } else {
                            o00Oo0.o00O00.OooO00o oooO00o = p146o00Oo0.o00O00.f32133OooO0O0;
                            j = p146o00Oo0.o00O00.f32134OooO0OO;
                        }
                        composer.Oooo0o0();
                        p146o00Oo0.o00O00 o00o03 = new p146o00Oo0.o00O00(j);
                        EnterExitState enterExitState7 = (EnterExitState) oo00oVar2.OooO0o();
                        composer.OooO0o0(-288165413);
                        int i27 = iArr2[enterExitState7.ordinal()];
                        if (i27 != 1) {
                            if (i27 == 2) {
                                o00 o00Var13 = enter.OooO00o().f914OooO0Oo;
                                if (o00Var13 != null) {
                                    o00o01 = new p146o00Oo0.o00O00(o00Var13.f828OooO0O0);
                                } else {
                                    o00 o00Var14 = exit.OooO00o().f914OooO0Oo;
                                    if (o00Var14 != null) {
                                        o00o01 = new p146o00Oo0.o00O00(o00Var14.f828OooO0O0);
                                    } else {
                                        o00o01 = null;
                                    }
                                }
                            } else {
                                if (i27 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                o00 o00Var15 = exit.OooO00o().f914OooO0Oo;
                                if (o00Var15 != null) {
                                    o00o01 = new p146o00Oo0.o00O00(o00Var15.f828OooO0O0);
                                } else {
                                    o00 o00Var16 = enter.OooO00o().f914OooO0Oo;
                                    if (o00Var16 != null) {
                                        o00o01 = new p146o00Oo0.o00O00(o00Var16.f828OooO0O0);
                                    } else {
                                        o00o01 = null;
                                    }
                                }
                            }
                        }
                        if (o00o01 != null) {
                            j2 = o00o01.f32135OooO00o;
                        } else {
                            o00Oo0.o00O00.OooO00o oooO00o2 = p146o00Oo0.o00O00.f32133OooO0O0;
                            j2 = p146o00Oo0.o00O00.f32134OooO0OO;
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO0O2 = oo0oOO0.OooO0O0(oo00oVar2, o00o03, new p146o00Oo0.o00O00(j2), enterExitTransitionKt$createModifier$$inlined$animateValue$1.invoke(oo00oVar2.OooO0Oo(), composer, Integer.valueOf((i25 >> 3) & 112)), o00oo0o2, "TransformOriginInterruptionHandling", composer);
                        composer.Oooo0o0();
                        o00oooo0OooO0O0 = GraphicsLayerModifierKt.OooO00o(o00oooo0OooO0O0, new o000000(oo0oo, oo0ooOooO0O1, oo0ooOooO0O2));
                    } else if (((Boolean) o0o00o4.getValue()).booleanValue()) {
                        o00oooo0OooO0O0 = GraphicsLayerModifierKt.OooO00o(o00oooo0OooO0O0, new o000000O(oo0oo));
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooOOoo = o00oooo1.OooOOoo(o00oooo0OooO0O0);
                    composer.OooO0o0(-492369756);
                    Object objOooO0o10 = composer.OooO0o();
                    if (objOooO0o10 == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                        objOooO0o10 = new o0OoOo0(oo000oVar);
                        composer.Oooo00o(objOooO0o10);
                    }
                    composer.Oooo0o0();
                    o0O0O00.o000000 o000000Var = (o0O0O00.o000000) objOooO0o10;
                    composer.OooO0o0(-1323940314);
                    o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6371OooO0o0);
                    LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6375OooOO0O);
                    o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6379OooOOOO);
                    Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
                    Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
                    Function3<o0OO00o0<o000000.OooO00o>, p100o000oOoO.oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooOOoo);
                    if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    oO00000o.OooO0O0(composer, o000000Var, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
                    oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
                    oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
                    ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(1797450476);
                    function3.invoke(oo000oVar, composer, Integer.valueOf(((i8 >> 9) & 112) | 8));
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                }
                composer.Oooo0o0();
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(oo00oVar, function1, o00oooo1, enter, exit, function3, i));
        }
        composer.OooOoo0();
        oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(oo00oVar, function1, o00oooo1, enter, exit, function3, i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO0O0(@NotNull p023Oooo00O.o000O<Boolean> transitionState, @Nullable o00OOOO0 o00oooo1, @Nullable o000O0o o000o0o2, @Nullable o000O00 o000o01, @Nullable String str, @NotNull Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        o000O0o o000o0o3;
        int i5;
        int i6;
        o000O00 o000o02;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        o00OOOO0 o00oooo3;
        o000O0o o000o0oOooO0O0;
        o000O00 o000o00OooO0O0;
        boolean zOooo0oo;
        Object objOooO0o;
        String str3;
        o00OOOO0 o00oooo4;
        o000O0o o000o0o4;
        o000O00 o000o03;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(transitionState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        p100o000oOoO.oOO00O ooo00oOooOOo = ooo00o.OooOOo(-222898426);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(transitionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                o00oooo2 = o00oooo1;
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    o000o0o3 = o000o0o2;
                    if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        o000o02 = o000o01;
                        if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                            i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 57344) == 0) {
                            str2 = str;
                            if (ooo00oOooOOo.Oooo0oo(str2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            if ((i & 458752) == 0) {
                                if (ooo00oOooOOo.Oooo0oo(content)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                            }
                            if ((374491 & i3) == 74898 || !ooo00oOooOOo.OooOo0()) {
                                if (i11 != 0) {
                                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                                } else {
                                    o00oooo3 = o00oooo2;
                                }
                                if (i4 != 0) {
                                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                                } else {
                                    o000o0oOooO0O0 = o000o0o3;
                                }
                                if (i6 != 0) {
                                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                                } else {
                                    o000o00OooO0O0 = o000o02;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                                ooo00oOooOOo.OooO0o0(882913843);
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                p023Oooo00O.oo00o oo00oVar = (p023Oooo00O.oo00o) objOooO0o;
                                oo00oVar.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                                o00Oo00.OooO0O0(oo00oVar, new o00OO000(oo00oVar), ooo00oOooOOo);
                                ooo00oOooOOo.Oooo0o0();
                                int i12 = i3 << 3;
                                OooO00o(oo00oVar, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i3 & 458752));
                                str3 = str2;
                                o00oooo4 = o00oooo3;
                                o000o0o4 = o000o0oOooO0O0;
                                o000o03 = o000o00OooO0O0;
                            } else {
                                ooo00oOooOOo.OooOoo0();
                                o00oooo4 = o00oooo2;
                                o000o0o4 = o000o0o3;
                                o000o03 = o000o02;
                                str3 = str2;
                            }
                            oo0oooOooOo = ooo00oOooOOo.OooOo();
                            if (oo0oooOooOo == null) {
                                return;
                            }
                            oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                        }
                        i10 = 196608;
                        i3 |= i10;
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar2 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar2.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar2, new o00OO000(oo00oVar2), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i13 = i3 << 3;
                            OooO00o(oo00oVar2, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar3 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar3.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar3, new o00OO000(oo00oVar3), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i14 = i3 << 3;
                            OooO00o(oo00oVar3, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i3 |= 24576;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar4 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar4.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar4, new o00OO000(oo00oVar4), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i15 = i3 << 3;
                            OooO00o(oo00oVar4, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar5 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar5.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar5, new o00OO000(oo00oVar5), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i16 = i3 << 3;
                            OooO00o(oo00oVar5, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar6 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar6.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar6, new o00OO000(oo00oVar6), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i17 = i3 << 3;
                        OooO00o(oo00oVar6, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar7 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar7.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar7, new o00OO000(oo00oVar7), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i18 = i3 << 3;
                        OooO00o(oo00oVar7, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 3072;
                o000o02 = o000o01;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar8 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar8.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar8, new o00OO000(oo00oVar8), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i19 = i3 << 3;
                            OooO00o(oo00oVar8, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar9 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar9.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar9, new o00OO000(oo00oVar9), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i110 = i3 << 3;
                            OooO00o(oo00oVar9, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar10 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar10.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar10, new o00OO000(oo00oVar10), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111 = i3 << 3;
                        OooO00o(oo00oVar10, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar11 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar11.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11, new o00OO000(oo00oVar11), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i112 = i3 << 3;
                        OooO00o(oo00oVar11, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar12 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar12.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar12, new o00OO000(oo00oVar12), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i113 = i3 << 3;
                        OooO00o(oo00oVar12, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar13 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar13.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar13, new o00OO000(oo00oVar13), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i114 = i3 << 3;
                        OooO00o(oo00oVar13, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar14 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar14.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar14, new o00OO000(oo00oVar14), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i115 = i3 << 3;
                    OooO00o(oo00oVar14, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar15 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar15.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar15, new o00OO000(oo00oVar15), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i116 = i3 << 3;
                    OooO00o(oo00oVar15, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 384;
            o000o0o3 = o000o0o2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar16 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar16.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar16, new o00OO000(oo00oVar16), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i117 = i3 << 3;
                            OooO00o(oo00oVar16, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar17 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar17.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar17, new o00OO000(oo00oVar17), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i118 = i3 << 3;
                            OooO00o(oo00oVar17, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i118 & 57344) | (i118 & 896) | 48 | (i118 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar18 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar18.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar18, new o00OO000(oo00oVar18), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i119 = i3 << 3;
                        OooO00o(oo00oVar18, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i119 & 57344) | (i119 & 896) | 48 | (i119 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar19 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar19.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar19, new o00OO000(oo00oVar19), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1110 = i3 << 3;
                        OooO00o(oo00oVar19, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1110 & 57344) | (i1110 & 896) | 48 | (i1110 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar110 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar110.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar110, new o00OO000(oo00oVar110), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1111 = i3 << 3;
                        OooO00o(oo00oVar110, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111 & 57344) | (i1111 & 896) | 48 | (i1111 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar111 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar111.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar111, new o00OO000(oo00oVar111), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1112 = i3 << 3;
                        OooO00o(oo00oVar111, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1112 & 57344) | (i1112 & 896) | 48 | (i1112 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar112 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar112.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar112, new o00OO000(oo00oVar112), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1113 = i3 << 3;
                    OooO00o(oo00oVar112, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1113 & 57344) | (i1113 & 896) | 48 | (i1113 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar113 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar113.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar113, new o00OO000(oo00oVar113), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1114 = i3 << 3;
                    OooO00o(oo00oVar113, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1114 & 57344) | (i1114 & 896) | 48 | (i1114 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o02 = o000o01;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar114 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar114.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar114, new o00OO000(oo00oVar114), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1115 = i3 << 3;
                        OooO00o(oo00oVar114, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1115 & 57344) | (i1115 & 896) | 48 | (i1115 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar115 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar115.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar115, new o00OO000(oo00oVar115), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1116 = i3 << 3;
                        OooO00o(oo00oVar115, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1116 & 57344) | (i1116 & 896) | 48 | (i1116 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar116 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar116.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar116, new o00OO000(oo00oVar116), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1117 = i3 << 3;
                    OooO00o(oo00oVar116, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1117 & 57344) | (i1117 & 896) | 48 | (i1117 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar117 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar117.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar117, new o00OO000(oo00oVar117), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1118 = i3 << 3;
                    OooO00o(oo00oVar117, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1118 & 57344) | (i1118 & 896) | 48 | (i1118 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar118 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar118.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar118, new o00OO000(oo00oVar118), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1119 = i3 << 3;
                    OooO00o(oo00oVar118, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1119 & 57344) | (i1119 & 896) | 48 | (i1119 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar119 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar119.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar119, new o00OO000(oo00oVar119), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i11110 = i3 << 3;
                    OooO00o(oo00oVar119, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11110 & 57344) | (i11110 & 896) | 48 | (i11110 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar1110 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar1110.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1110, new o00OO000(oo00oVar1110), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111 = i3 << 3;
                OooO00o(oo00oVar1110, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11111 & 57344) | (i11111 & 896) | 48 | (i11111 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar1111 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar1111.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1111, new o00OO000(oo00oVar1111), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11112 = i3 << 3;
                OooO00o(oo00oVar1111, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11112 & 57344) | (i11112 & 896) | 48 | (i11112 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 48;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                o000o0o3 = o000o0o2;
                if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar1112 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar1112.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar1112, new o00OO000(oo00oVar1112), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i11113 = i3 << 3;
                            OooO00o(oo00oVar1112, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11113 & 57344) | (i11113 & 896) | 48 | (i11113 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                            ooo00oOooOOo.OooO0o0(882913843);
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            p023Oooo00O.oo00o oo00oVar1113 = (p023Oooo00O.oo00o) objOooO0o;
                            oo00oVar1113.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar1113, new o00OO000(oo00oVar1113), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i11114 = i3 << 3;
                            OooO00o(oo00oVar1113, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11114 & 57344) | (i11114 & 896) | 48 | (i11114 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar1114 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar1114.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1114, new o00OO000(oo00oVar1114), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11115 = i3 << 3;
                        OooO00o(oo00oVar1114, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11115 & 57344) | (i11115 & 896) | 48 | (i11115 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar1115 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar1115.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1115, new o00OO000(oo00oVar1115), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11116 = i3 << 3;
                        OooO00o(oo00oVar1115, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11116 & 57344) | (i11116 & 896) | 48 | (i11116 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar1116 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar1116.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1116, new o00OO000(oo00oVar1116), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11117 = i3 << 3;
                        OooO00o(oo00oVar1116, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11117 & 57344) | (i11117 & 896) | 48 | (i11117 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar1117 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar1117.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1117, new o00OO000(oo00oVar1117), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11118 = i3 << 3;
                        OooO00o(oo00oVar1117, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11118 & 57344) | (i11118 & 896) | 48 | (i11118 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar1118 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar1118.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar1118, new o00OO000(oo00oVar1118), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i11119 = i3 << 3;
                    OooO00o(oo00oVar1118, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11119 & 57344) | (i11119 & 896) | 48 | (i11119 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar1119 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar1119.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar1119, new o00OO000(oo00oVar1119), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111110 = i3 << 3;
                    OooO00o(oo00oVar1119, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111110 & 57344) | (i111110 & 896) | 48 | (i111110 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o02 = o000o01;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar11110 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar11110.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11110, new o00OO000(oo00oVar11110), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111111 = i3 << 3;
                        OooO00o(oo00oVar11110, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111111 & 57344) | (i111111 & 896) | 48 | (i111111 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar11111 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar11111.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11111, new o00OO000(oo00oVar11111), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111112 = i3 << 3;
                        OooO00o(oo00oVar11111, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111112 & 57344) | (i111112 & 896) | 48 | (i111112 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar11112 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar11112.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11112, new o00OO000(oo00oVar11112), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111113 = i3 << 3;
                    OooO00o(oo00oVar11112, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111113 & 57344) | (i111113 & 896) | 48 | (i111113 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar11113 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar11113.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11113, new o00OO000(oo00oVar11113), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111114 = i3 << 3;
                    OooO00o(oo00oVar11113, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111114 & 57344) | (i111114 & 896) | 48 | (i111114 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar11114 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar11114.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11114, new o00OO000(oo00oVar11114), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111115 = i3 << 3;
                    OooO00o(oo00oVar11114, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111115 & 57344) | (i111115 & 896) | 48 | (i111115 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar11115 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar11115.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11115, new o00OO000(oo00oVar11115), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111116 = i3 << 3;
                    OooO00o(oo00oVar11115, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111116 & 57344) | (i111116 & 896) | 48 | (i111116 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar11116 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar11116.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar11116, new o00OO000(oo00oVar11116), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i111117 = i3 << 3;
                OooO00o(oo00oVar11116, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111117 & 57344) | (i111117 & 896) | 48 | (i111117 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar11117 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar11117.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar11117, new o00OO000(oo00oVar11117), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i111118 = i3 << 3;
                OooO00o(oo00oVar11117, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111118 & 57344) | (i111118 & 896) | 48 | (i111118 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 384;
        o000o0o3 = o000o0o2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                o000o02 = o000o01;
                if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                    i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar11118 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar11118.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11118, new o00OO000(oo00oVar11118), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111119 = i3 << 3;
                        OooO00o(oo00oVar11118, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i111119 & 57344) | (i111119 & 896) | 48 | (i111119 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                        ooo00oOooOOo.OooO0o0(882913843);
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        p023Oooo00O.oo00o oo00oVar11119 = (p023Oooo00O.oo00o) objOooO0o;
                        oo00oVar11119.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11119, new o00OO000(oo00oVar11119), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1111110 = i3 << 3;
                        OooO00o(oo00oVar11119, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111110 & 57344) | (i1111110 & 896) | 48 | (i1111110 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar111110 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar111110.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111110, new o00OO000(oo00oVar111110), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111111 = i3 << 3;
                    OooO00o(oo00oVar111110, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111111 & 57344) | (i1111111 & 896) | 48 | (i1111111 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar111111 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar111111.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111111, new o00OO000(oo00oVar111111), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111112 = i3 << 3;
                    OooO00o(oo00oVar111111, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111112 & 57344) | (i1111112 & 896) | 48 | (i1111112 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar111112 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar111112.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111112, new o00OO000(oo00oVar111112), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111113 = i3 << 3;
                    OooO00o(oo00oVar111112, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111113 & 57344) | (i1111113 & 896) | 48 | (i1111113 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar111113 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar111113.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111113, new o00OO000(oo00oVar111113), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111114 = i3 << 3;
                    OooO00o(oo00oVar111113, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111114 & 57344) | (i1111114 & 896) | 48 | (i1111114 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar111114 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar111114.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111114, new o00OO000(oo00oVar111114), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i1111115 = i3 << 3;
                OooO00o(oo00oVar111114, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111115 & 57344) | (i1111115 & 896) | 48 | (i1111115 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar111115 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar111115.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111115, new o00OO000(oo00oVar111115), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i1111116 = i3 << 3;
                OooO00o(oo00oVar111115, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111116 & 57344) | (i1111116 & 896) | 48 | (i1111116 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 3072;
        o000o02 = o000o01;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 57344) == 0) {
                str2 = str;
                if (ooo00oOooOOo.Oooo0oo(str2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar111116 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar111116.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111116, new o00OO000(oo00oVar111116), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111117 = i3 << 3;
                    OooO00o(oo00oVar111116, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111117 & 57344) | (i1111117 & 896) | 48 | (i1111117 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                    ooo00oOooOOo.OooO0o0(882913843);
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p023Oooo00O.oo00o oo00oVar111117 = (p023Oooo00O.oo00o) objOooO0o;
                    oo00oVar111117.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111117, new o00OO000(oo00oVar111117), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111118 = i3 << 3;
                    OooO00o(oo00oVar111117, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111118 & 57344) | (i1111118 & 896) | 48 | (i1111118 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar111118 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar111118.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111118, new o00OO000(oo00oVar111118), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i1111119 = i3 << 3;
                OooO00o(oo00oVar111118, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i1111119 & 57344) | (i1111119 & 896) | 48 | (i1111119 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar111119 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar111119.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111119, new o00OO000(oo00oVar111119), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111110 = i3 << 3;
                OooO00o(oo00oVar111119, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11111110 & 57344) | (i11111110 & 896) | 48 | (i11111110 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 24576;
        str2 = str;
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar1111110 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar1111110.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1111110, new o00OO000(oo00oVar1111110), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111111 = i3 << 3;
                OooO00o(oo00oVar1111110, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11111111 & 57344) | (i11111111 & 896) | 48 | (i11111111 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                ooo00oOooOOo.OooO0o0(882913843);
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                p023Oooo00O.oo00o oo00oVar1111111 = (p023Oooo00O.oo00o) objOooO0o;
                oo00oVar1111111.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1111111, new o00OO000(oo00oVar1111111), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111112 = i3 << 3;
                OooO00o(oo00oVar1111111, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11111112 & 57344) | (i11111112 & 896) | 48 | (i11111112 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
        }
        i10 = 196608;
        i3 |= i10;
        if ((374491 & i3) == 74898) {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
            } else {
                o000o0oOooO0O0 = o000o0o3;
            }
            if (i6 != 0) {
                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
            } else {
                o000o00OooO0O0 = o000o02;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
            ooo00oOooOOo.OooO0o0(882913843);
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            p023Oooo00O.oo00o oo00oVar1111112 = (p023Oooo00O.oo00o) objOooO0o;
            oo00oVar1111112.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
            o00Oo00.OooO0O0(oo00oVar1111112, new o00OO000(oo00oVar1111112), ooo00oOooOOo);
            ooo00oOooOOo.Oooo0o0();
            int i11111113 = i3 << 3;
            OooO00o(oo00oVar1111112, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11111113 & 57344) | (i11111113 & 896) | 48 | (i11111113 & 7168) | (i3 & 458752));
            str3 = str2;
            o00oooo4 = o00oooo3;
            o000o0o4 = o000o0oOooO0O0;
            o000o03 = o000o00OooO0O0;
        } else {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
            } else {
                o000o0oOooO0O0 = o000o0o3;
            }
            if (i6 != 0) {
                o000o00OooO0O0 = o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo));
            } else {
                o000o00OooO0O0 = o000o02;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            Intrinsics.checkNotNullParameter(transitionState, "transitionState");
            ooo00oOooOOo.OooO0o0(882913843);
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new p023Oooo00O.oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            p023Oooo00O.oo00o oo00oVar1111113 = (p023Oooo00O.oo00o) objOooO0o;
            oo00oVar1111113.OooO00o(transitionState.f1070OooO0O0.getValue(), ooo00oOooOOo, 0);
            o00Oo00.OooO0O0(oo00oVar1111113, new o00OO000(oo00oVar1111113), ooo00oOooOOo);
            ooo00oOooOOo.Oooo0o0();
            int i11111114 = i3 << 3;
            OooO00o(oo00oVar1111113, OooOOO0.f976Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i11111114 & 57344) | (i11111114 & 896) | 48 | (i11111114 & 7168) | (i3 & 458752));
            str3 = str2;
            o00oooo4 = o00oooo3;
            o000o0o4 = o000o0oOooO0O0;
            o000o03 = o000o00OooO0O0;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(transitionState, o00oooo4, o000o0o4, o000o03, str3, content, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalAnimationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void OooO0OO(@NotNull p023Oooo00O.oo00o<T> oo00oVar, @NotNull Function1<? super T, Boolean> visible, @Nullable o00OOOO0 o00oooo1, @Nullable o000O0o o000o0o2, @Nullable o000O00 o000o01, @NotNull Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        o000O0o o000o0o3;
        int i5;
        int i6;
        o000O00 o000o02;
        int i7;
        int i8;
        o00OOOO0 o00oooo3;
        o000O0o o000o0oOooO0O0;
        o000O00 o000o00OooO0O0;
        o00OOOO0 o00oooo4;
        o000O00 o000o03;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(oo00oVar, "<this>");
        Intrinsics.checkNotNullParameter(visible, "visible");
        Intrinsics.checkNotNullParameter(content, "content");
        p100o000oOoO.oOO00O ooo00oOooOOo = ooo00o.OooOOo(1031950689);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(oo00oVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(visible) ? 32 : 16;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                o00oooo2 = o00oooo1;
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    o000o0o3 = o000o0o2;
                    if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                        i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        o000o02 = o000o01;
                        if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898 || !ooo00oOooOOo.OooOo0()) {
                            if (i9 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                            o00oooo4 = o00oooo3;
                            o000o0o3 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                        } else {
                            ooo00oOooOOo.OooOoo0();
                            o00oooo4 = o00oooo2;
                            o000o03 = o000o02;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
                    }
                    i8 = 196608;
                    i3 |= i8;
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
                }
                i3 |= 24576;
                o000o02 = o000o01;
                if ((i2 & 16) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
            }
            i3 |= 3072;
            o000o0o3 = o000o0o2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
            }
            i3 |= 24576;
            o000o02 = o000o01;
            if ((i2 & 16) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
        }
        i3 |= 384;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                o000o0o3 = o000o0o2;
                if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                    i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o000o0o3 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
            }
            i3 |= 24576;
            o000o02 = o000o01;
            if ((i2 & 16) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
        }
        i3 |= 3072;
        o000o0o3 = o000o0o2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                o000o02 = o000o01;
                if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o000o0o3 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
        }
        i3 |= 24576;
        o000o02 = o000o01;
        if ((i2 & 16) != 0) {
            if ((i & 458752) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
            }
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o000o0o3 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
        }
        i8 = 196608;
        i3 |= i8;
        if ((374491 & i3) == 74898) {
            if (i9 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
            } else {
                o000o0oOooO0O0 = o000o0o3;
            }
            if (i6 != 0) {
                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
            } else {
                o000o00OooO0O0 = o000o02;
            }
            OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
            o00oooo4 = o00oooo3;
            o000o0o3 = o000o0oOooO0O0;
            o000o03 = o000o00OooO0O0;
        } else {
            if (i9 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
            } else {
                o000o0oOooO0O0 = o000o0o3;
            }
            if (i6 != 0) {
                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
            } else {
                o000o00OooO0O0 = o000o02;
            }
            OooO00o(oo00oVar, visible, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
            o00oooo4 = o00oooo3;
            o000o0o3 = o000o0oOooO0O0;
            o000o03 = o000o00OooO0O0;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o000o0o3, o000o03, content, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0168  */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO0Oo(@NotNull o0O00oO0 o0o00oo1, boolean z, @Nullable o00OOOO0 o00oooo1, @Nullable o000O0o o000o0o2, @Nullable o000O00 o000o01, @Nullable String str, @NotNull Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        o000O0o o000o0o3;
        int i5;
        int i6;
        o000O00 o000o02;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        o00OOOO0 o00oooo3;
        ?? r7;
        o000O0o o000o0oOooO0O0;
        o000O00 o000o00OooO0O0;
        o00OOOO0 o00oooo4;
        String str3;
        o000O00 o000o03;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(o0o00oo1, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        p100o000oOoO.oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1741346906);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (ooo00oOooOOo.OooO0OO(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 896) == 0) {
                o00oooo2 = o00oooo1;
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    o000o0o3 = o000o0o2;
                    if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                        i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        o000o02 = o000o01;
                        if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 458752) == 0) {
                            str2 = str;
                            if (ooo00oOooOOo.Oooo0oo(str2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            if ((i & 3670016) == 0) {
                                if (ooo00oOooOOo.Oooo0oo(content)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                            }
                            if ((i3 & 2995921) == 599184 || !ooo00oOooOOo.OooOo0()) {
                                if (i11 != 0) {
                                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                                } else {
                                    o00oooo3 = o00oooo2;
                                }
                                if (i4 != 0) {
                                    o000O0o o000o0oOooO0Oo = o000OOo.OooO0Oo(null, 3);
                                    p023Oooo00O.o00O000o animationSpec = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                    o00OO0OO.OooO00o expandFrom = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                    o00000O initialWidth = o00000O.f838Oooo;
                                    Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
                                    Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
                                    Intrinsics.checkNotNullParameter(initialWidth, "initialWidth");
                                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O = o000OOo.OooOO0O(expandFrom);
                                    o00000OO o00000oo2 = new o00000OO(initialWidth);
                                    r7 = 1;
                                    o000o0oOooO0O0 = o000o0oOooO0Oo.OooO0O0(o000OOo.OooO00o(animationSpec, o00oo0o0OooOO0O, true, o00000oo2));
                                } else {
                                    r7 = 1;
                                    o000o0oOooO0O0 = o000o0o2;
                                }
                                if (i6 != 0) {
                                    o000O00 o000o00OooO0o0 = o000OOo.OooO0o0(null, 3);
                                    p023Oooo00O.o00O000o animationSpec2 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                    o00OO0OO.OooO00o shrinkTowards = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                    o0000O0O targetWidth = o0000O0O.f848Oooo;
                                    Intrinsics.checkNotNullParameter(animationSpec2, "animationSpec");
                                    Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
                                    Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
                                    o000o00OooO0O0 = o000o00OooO0o0.OooO0O0(o000OOo.OooO0o(animationSpec2, o000OOo.OooOO0O(shrinkTowards), r7, new o000OO(targetWidth)));
                                } else {
                                    o000o00OooO0O0 = o000o01;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i12 = i3 >> 3;
                                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i12 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i12 & 458752));
                                o00oooo4 = o00oooo3;
                                str3 = str2;
                                o000o03 = o000o00OooO0O0;
                                o000o0o3 = o000o0oOooO0O0;
                            } else {
                                ooo00oOooOOo.OooOoo0();
                                o00oooo4 = o00oooo2;
                                o000o03 = o000o02;
                                str3 = str2;
                            }
                            oo0oooOooOo = ooo00oOooOOo.OooOo();
                            if (oo0oooOooOo == null) {
                                return;
                            }
                            oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                        }
                        i10 = 1572864;
                        i3 |= i10;
                        if ((i3 & 2995921) == 599184) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo2 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec3 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom2 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth2 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec3, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom2, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth2, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O2 = o000OOo.OooOO0O(expandFrom2);
                                o00000OO o00000oo3 = new o00000OO(initialWidth2);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo2.OooO0O0(o000OOo.OooO00o(animationSpec3, o00oo0o0OooOO0O2, true, o00000oo3));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o1 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec4 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards2 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth2 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec4, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards2, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth2, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o1.OooO0O0(o000OOo.OooO0o(animationSpec4, o000OOo.OooOO0O(shrinkTowards2), r7, new o000OO(targetWidth2)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i13 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i13 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i13 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo3 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec5 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom3 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth3 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec5, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom3, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth3, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O3 = o000OOo.OooOO0O(expandFrom3);
                                o00000OO o00000oo4 = new o00000OO(initialWidth3);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo3.OooO0O0(o000OOo.OooO00o(animationSpec5, o00oo0o0OooOO0O3, true, o00000oo4));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o2 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec6 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards3 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth3 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec6, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards3, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth3, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o2.OooO0O0(o000OOo.OooO0o(animationSpec6, o000OOo.OooOO0O(shrinkTowards3), r7, new o000OO(targetWidth3)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i14 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i14 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                    }
                    i3 |= 196608;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                        }
                        if ((i3 & 2995921) == 599184) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo4 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec7 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom4 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth4 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec7, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom4, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth4, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O4 = o000OOo.OooOO0O(expandFrom4);
                                o00000OO o00000oo5 = new o00000OO(initialWidth4);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo4.OooO0O0(o000OOo.OooO00o(animationSpec7, o00oo0o0OooOO0O4, true, o00000oo5));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o3 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec8 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards4 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth4 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec8, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards4, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth4, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o3.OooO0O0(o000OOo.OooO0o(animationSpec8, o000OOo.OooOO0O(shrinkTowards4), r7, new o000OO(targetWidth4)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i15 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i15 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i15 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo5 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec9 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom5 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth5 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec9, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom5, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth5, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O5 = o000OOo.OooOO0O(expandFrom5);
                                o00000OO o00000oo6 = new o00000OO(initialWidth5);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo5.OooO0O0(o000OOo.OooO00o(animationSpec9, o00oo0o0OooOO0O5, true, o00000oo6));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o4 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec10 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards5 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth5 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec10, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards5, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth5, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o4.OooO0O0(o000OOo.OooO0o(animationSpec10, o000OOo.OooOO0O(shrinkTowards5), r7, new o000OO(targetWidth5)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i16 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i16 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i16 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                    }
                    i10 = 1572864;
                    i3 |= i10;
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo6 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec11 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom6 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth6 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom6, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth6, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O6 = o000OOo.OooOO0O(expandFrom6);
                            o00000OO o00000oo7 = new o00000OO(initialWidth6);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo6.OooO0O0(o000OOo.OooO00o(animationSpec11, o00oo0o0OooOO0O6, true, o00000oo7));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o5 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec12 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards6 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth6 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec12, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards6, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth6, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o5.OooO0O0(o000OOo.OooO0o(animationSpec12, o000OOo.OooOO0O(shrinkTowards6), r7, new o000OO(targetWidth6)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i17 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i17 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i17 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo7 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec13 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom7 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth7 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec13, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom7, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth7, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O7 = o000OOo.OooOO0O(expandFrom7);
                            o00000OO o00000oo8 = new o00000OO(initialWidth7);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo7.OooO0O0(o000OOo.OooO00o(animationSpec13, o00oo0o0OooOO0O7, true, o00000oo8));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o6 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec14 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards7 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth7 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec14, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards7, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth7, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o6.OooO0O0(o000OOo.OooO0o(animationSpec14, o000OOo.OooOO0O(shrinkTowards7), r7, new o000OO(targetWidth7)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i18 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i18 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i18 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i3 |= 24576;
                o000o02 = o000o01;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                        }
                        if ((i3 & 2995921) == 599184) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo8 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec15 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom8 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth8 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec15, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom8, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth8, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O8 = o000OOo.OooOO0O(expandFrom8);
                                o00000OO o00000oo9 = new o00000OO(initialWidth8);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo8.OooO0O0(o000OOo.OooO00o(animationSpec15, o00oo0o0OooOO0O8, true, o00000oo9));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o7 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec16 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards8 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth8 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec16, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards8, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth8, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o7.OooO0O0(o000OOo.OooO0o(animationSpec16, o000OOo.OooOO0O(shrinkTowards8), r7, new o000OO(targetWidth8)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i19 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i19 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i19 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo9 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec17 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom9 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth9 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec17, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom9, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth9, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O9 = o000OOo.OooOO0O(expandFrom9);
                                o00000OO o00000oo10 = new o00000OO(initialWidth9);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo9.OooO0O0(o000OOo.OooO00o(animationSpec17, o00oo0o0OooOO0O9, true, o00000oo10));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o8 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec18 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards9 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth9 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec18, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards9, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth9, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o8.OooO0O0(o000OOo.OooO0o(animationSpec18, o000OOo.OooOO0O(shrinkTowards9), r7, new o000OO(targetWidth9)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i110 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i110 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i110 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                    }
                    i10 = 1572864;
                    i3 |= i10;
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo10 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec19 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom10 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth10 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec19, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom10, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth10, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O10 = o000OOo.OooOO0O(expandFrom10);
                            o00000OO o00000oo11 = new o00000OO(initialWidth10);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo10.OooO0O0(o000OOo.OooO00o(animationSpec19, o00oo0o0OooOO0O10, true, o00000oo11));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o9 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards10 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth10 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec110, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards10, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth10, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o9.OooO0O0(o000OOo.OooO0o(animationSpec110, o000OOo.OooOO0O(shrinkTowards10), r7, new o000OO(targetWidth10)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo11 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom11 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth11 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec111, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom11, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth11, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11 = o000OOo.OooOO0O(expandFrom11);
                            o00000OO o00000oo12 = new o00000OO(initialWidth11);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo11.OooO0O0(o000OOo.OooO00o(animationSpec111, o00oo0o0OooOO0O11, true, o00000oo12));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o10 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards11 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth11 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec112, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards11, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth11, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o10.OooO0O0(o000OOo.OooO0o(animationSpec112, o000OOo.OooOO0O(shrinkTowards11), r7, new o000OO(targetWidth11)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i112 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i112 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i112 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo12 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom12 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth12 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec113, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom12, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth12, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O12 = o000OOo.OooOO0O(expandFrom12);
                            o00000OO o00000oo13 = new o00000OO(initialWidth12);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo12.OooO0O0(o000OOo.OooO00o(animationSpec113, o00oo0o0OooOO0O12, true, o00000oo13));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o11 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards12 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth12 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec114, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards12, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth12, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o11.OooO0O0(o000OOo.OooO0o(animationSpec114, o000OOo.OooOO0O(shrinkTowards12), r7, new o000OO(targetWidth12)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i113 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i113 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i113 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo13 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom13 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth13 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec115, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom13, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth13, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O13 = o000OOo.OooOO0O(expandFrom13);
                            o00000OO o00000oo14 = new o00000OO(initialWidth13);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo13.OooO0O0(o000OOo.OooO00o(animationSpec115, o00oo0o0OooOO0O13, true, o00000oo14));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o12 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards13 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth13 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec116, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards13, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth13, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o12.OooO0O0(o000OOo.OooO0o(animationSpec116, o000OOo.OooOO0O(shrinkTowards13), r7, new o000OO(targetWidth13)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i114 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i114 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i114 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i10 = 1572864;
                i3 |= i10;
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo14 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom14 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth14 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec117, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom14, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth14, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O14 = o000OOo.OooOO0O(expandFrom14);
                        o00000OO o00000oo15 = new o00000OO(initialWidth14);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo14.OooO0O0(o000OOo.OooO00o(animationSpec117, o00oo0o0OooOO0O14, true, o00000oo15));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o13 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards14 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth14 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec118, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards14, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth14, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o13.OooO0O0(o000OOo.OooO0o(animationSpec118, o000OOo.OooOO0O(shrinkTowards14), r7, new o000OO(targetWidth14)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i115 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i115 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i115 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo15 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom15 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth15 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec119, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom15, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth15, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O15 = o000OOo.OooOO0O(expandFrom15);
                        o00000OO o00000oo16 = new o00000OO(initialWidth15);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo15.OooO0O0(o000OOo.OooO00o(animationSpec119, o00oo0o0OooOO0O15, true, o00000oo16));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o14 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec1110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards15 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth15 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec1110, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards15, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth15, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o14.OooO0O0(o000OOo.OooO0o(animationSpec1110, o000OOo.OooOO0O(shrinkTowards15), r7, new o000OO(targetWidth15)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i116 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i116 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i116 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o0o3 = o000o0o2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                        }
                        if ((i3 & 2995921) == 599184) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo16 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec1111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom16 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth16 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1111, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom16, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth16, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O16 = o000OOo.OooOO0O(expandFrom16);
                                o00000OO o00000oo17 = new o00000OO(initialWidth16);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo16.OooO0O0(o000OOo.OooO00o(animationSpec1111, o00oo0o0OooOO0O16, true, o00000oo17));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o15 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec1112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards16 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth16 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1112, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards16, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth16, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o15.OooO0O0(o000OOo.OooO0o(animationSpec1112, o000OOo.OooOO0O(shrinkTowards16), r7, new o000OO(targetWidth16)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i117 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i117 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i117 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo17 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec1113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom17 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth17 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1113, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom17, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth17, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O17 = o000OOo.OooOO0O(expandFrom17);
                                o00000OO o00000oo18 = new o00000OO(initialWidth17);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo17.OooO0O0(o000OOo.OooO00o(animationSpec1113, o00oo0o0OooOO0O17, true, o00000oo18));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o16 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec1114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards17 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth17 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1114, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards17, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth17, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o16.OooO0O0(o000OOo.OooO0o(animationSpec1114, o000OOo.OooOO0O(shrinkTowards17), r7, new o000OO(targetWidth17)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i118 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i118 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i118 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                    }
                    i10 = 1572864;
                    i3 |= i10;
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo18 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec1115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom18 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth18 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1115, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom18, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth18, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O18 = o000OOo.OooOO0O(expandFrom18);
                            o00000OO o00000oo19 = new o00000OO(initialWidth18);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo18.OooO0O0(o000OOo.OooO00o(animationSpec1115, o00oo0o0OooOO0O18, true, o00000oo19));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o17 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec1116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards18 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth18 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1116, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards18, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth18, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o17.OooO0O0(o000OOo.OooO0o(animationSpec1116, o000OOo.OooOO0O(shrinkTowards18), r7, new o000OO(targetWidth18)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i119 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i119 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i119 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo19 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec1117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom19 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth19 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1117, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom19, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth19, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O19 = o000OOo.OooOO0O(expandFrom19);
                            o00000OO o00000oo110 = new o00000OO(initialWidth19);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo19.OooO0O0(o000OOo.OooO00o(animationSpec1117, o00oo0o0OooOO0O19, true, o00000oo110));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o18 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec1118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards19 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth19 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1118, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards19, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth19, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o18.OooO0O0(o000OOo.OooO0o(animationSpec1118, o000OOo.OooOO0O(shrinkTowards19), r7, new o000OO(targetWidth19)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1110 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1110 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1110 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo110 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec1119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth110 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1119, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom110, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth110, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O110 = o000OOo.OooOO0O(expandFrom110);
                            o00000OO o00000oo111 = new o00000OO(initialWidth110);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo110.OooO0O0(o000OOo.OooO00o(animationSpec1119, o00oo0o0OooOO0O110, true, o00000oo111));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o19 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec11110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth110 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11110, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards110, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth110, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o19.OooO0O0(o000OOo.OooO0o(animationSpec11110, o000OOo.OooOO0O(shrinkTowards110), r7, new o000OO(targetWidth110)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo111 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec11111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth111 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11111, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom111, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth111, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111 = o000OOo.OooOO0O(expandFrom111);
                            o00000OO o00000oo112 = new o00000OO(initialWidth111);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo111.OooO0O0(o000OOo.OooO00o(animationSpec11111, o00oo0o0OooOO0O111, true, o00000oo112));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o110 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec11112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth111 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11112, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards111, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth111, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o110.OooO0O0(o000OOo.OooO0o(animationSpec11112, o000OOo.OooOO0O(shrinkTowards111), r7, new o000OO(targetWidth111)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1112 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1112 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1112 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i10 = 1572864;
                i3 |= i10;
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo112 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec11113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth112 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11113, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom112, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth112, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O112 = o000OOo.OooOO0O(expandFrom112);
                        o00000OO o00000oo113 = new o00000OO(initialWidth112);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo112.OooO0O0(o000OOo.OooO00o(animationSpec11113, o00oo0o0OooOO0O112, true, o00000oo113));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o111 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth112 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11114, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards112, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth112, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o111.OooO0O0(o000OOo.OooO0o(animationSpec11114, o000OOo.OooOO0O(shrinkTowards112), r7, new o000OO(targetWidth112)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1113 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1113 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1113 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo113 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec11115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth113 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11115, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom113, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth113, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O113 = o000OOo.OooOO0O(expandFrom113);
                        o00000OO o00000oo114 = new o00000OO(initialWidth113);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo113.OooO0O0(o000OOo.OooO00o(animationSpec11115, o00oo0o0OooOO0O113, true, o00000oo114));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o112 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth113 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11116, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards113, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth113, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o112.OooO0O0(o000OOo.OooO0o(animationSpec11116, o000OOo.OooOO0O(shrinkTowards113), r7, new o000OO(targetWidth113)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1114 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1114 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1114 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            o000o02 = o000o01;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo114 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec11117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth114 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11117, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom114, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth114, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O114 = o000OOo.OooOO0O(expandFrom114);
                            o00000OO o00000oo115 = new o00000OO(initialWidth114);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo114.OooO0O0(o000OOo.OooO00o(animationSpec11117, o00oo0o0OooOO0O114, true, o00000oo115));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o113 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec11118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth114 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11118, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards114, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth114, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o113.OooO0O0(o000OOo.OooO0o(animationSpec11118, o000OOo.OooOO0O(shrinkTowards114), r7, new o000OO(targetWidth114)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1115 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1115 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1115 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo115 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec11119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth115 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11119, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom115, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth115, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O115 = o000OOo.OooOO0O(expandFrom115);
                            o00000OO o00000oo116 = new o00000OO(initialWidth115);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo115.OooO0O0(o000OOo.OooO00o(animationSpec11119, o00oo0o0OooOO0O115, true, o00000oo116));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o114 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth115 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec111110, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards115, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth115, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o114.OooO0O0(o000OOo.OooO0o(animationSpec111110, o000OOo.OooOO0O(shrinkTowards115), r7, new o000OO(targetWidth115)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1116 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1116 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1116 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i10 = 1572864;
                i3 |= i10;
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo116 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth116 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom116, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth116, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O116 = o000OOo.OooOO0O(expandFrom116);
                        o00000OO o00000oo117 = new o00000OO(initialWidth116);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo116.OooO0O0(o000OOo.OooO00o(animationSpec111111, o00oo0o0OooOO0O116, true, o00000oo117));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o115 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth116 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111112, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards116, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth116, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o115.OooO0O0(o000OOo.OooO0o(animationSpec111112, o000OOo.OooOO0O(shrinkTowards116), r7, new o000OO(targetWidth116)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1117 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1117 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1117 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo117 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth117 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111113, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom117, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth117, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O117 = o000OOo.OooOO0O(expandFrom117);
                        o00000OO o00000oo118 = new o00000OO(initialWidth117);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo117.OooO0O0(o000OOo.OooO00o(animationSpec111113, o00oo0o0OooOO0O117, true, o00000oo118));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o116 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth117 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111114, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards117, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth117, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o116.OooO0O0(o000OOo.OooO0o(animationSpec111114, o000OOo.OooOO0O(shrinkTowards117), r7, new o000OO(targetWidth117)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1118 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1118 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1118 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                }
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo118 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth118 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111115, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom118, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth118, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O118 = o000OOo.OooOO0O(expandFrom118);
                        o00000OO o00000oo119 = new o00000OO(initialWidth118);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo118.OooO0O0(o000OOo.OooO00o(animationSpec111115, o00oo0o0OooOO0O118, true, o00000oo119));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o117 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth118 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111116, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards118, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth118, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o117.OooO0O0(o000OOo.OooO0o(animationSpec111116, o000OOo.OooOO0O(shrinkTowards118), r7, new o000OO(targetWidth118)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1119 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1119 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1119 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo119 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth119 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111117, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom119, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth119, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O119 = o000OOo.OooOO0O(expandFrom119);
                        o00000OO o00000oo1110 = new o00000OO(initialWidth119);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo119.OooO0O0(o000OOo.OooO00o(animationSpec111117, o00oo0o0OooOO0O119, true, o00000oo1110));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o118 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth119 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111118, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards119, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth119, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o118.OooO0O0(o000OOo.OooO0o(animationSpec111118, o000OOo.OooOO0O(shrinkTowards119), r7, new o000OO(targetWidth119)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11110 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11110 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11110 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i10 = 1572864;
            i3 |= i10;
            if ((i3 & 2995921) == 599184) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo1110 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec111119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom1110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth1110 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec111119, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom1110, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth1110, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1110 = o000OOo.OooOO0O(expandFrom1110);
                    o00000OO o00000oo1111 = new o00000OO(initialWidth1110);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo1110.OooO0O0(o000OOo.OooO00o(animationSpec111119, o00oo0o0OooOO0O1110, true, o00000oo1111));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o119 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards1110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth1110 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111110, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards1110, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth1110, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o119.OooO0O0(o000OOo.OooO0o(animationSpec1111110, o000OOo.OooOO0O(shrinkTowards1110), r7, new o000OO(targetWidth1110)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11111 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo1111 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom1111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth1111 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom1111, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth1111, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1111 = o000OOo.OooOO0O(expandFrom1111);
                    o00000OO o00000oo1112 = new o00000OO(initialWidth1111);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo1111.OooO0O0(o000OOo.OooO00o(animationSpec1111111, o00oo0o0OooOO0O1111, true, o00000oo1112));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o1110 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards1111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth1111 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111112, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards1111, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth1111, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o1110.OooO0O0(o000OOo.OooO0o(animationSpec1111112, o000OOo.OooOO0O(shrinkTowards1111), r7, new o000OO(targetWidth1111)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11112 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11112 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11112 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
        }
        i3 |= 384;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                o000o0o3 = o000o0o2;
                if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                    i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 3670016) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                        }
                        if ((i3 & 2995921) == 599184) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo1112 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec1111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom1112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth1112 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1111113, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom1112, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth1112, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1112 = o000OOo.OooOO0O(expandFrom1112);
                                o00000OO o00000oo1113 = new o00000OO(initialWidth1112);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo1112.OooO0O0(o000OOo.OooO00o(animationSpec1111113, o00oo0o0OooOO0O1112, true, o00000oo1113));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o1111 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec1111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards1112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth1112 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1111114, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards1112, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth1112, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o1111.OooO0O0(o000OOo.OooO0o(animationSpec1111114, o000OOo.OooOO0O(shrinkTowards1112), r7, new o000OO(targetWidth1112)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11113 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11113 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11113 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000O0o o000o0oOooO0Oo1113 = o000OOo.OooO0Oo(null, 3);
                                p023Oooo00O.o00O000o animationSpec1111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                                o00OO0OO.OooO00o expandFrom1113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o00000O initialWidth1113 = o00000O.f838Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1111115, "animationSpec");
                                Intrinsics.checkNotNullParameter(expandFrom1113, "expandFrom");
                                Intrinsics.checkNotNullParameter(initialWidth1113, "initialWidth");
                                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1113 = o000OOo.OooOO0O(expandFrom1113);
                                o00000OO o00000oo1114 = new o00000OO(initialWidth1113);
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0oOooO0Oo1113.OooO0O0(o000OOo.OooO00o(animationSpec1111115, o00oo0o0OooOO0O1113, true, o00000oo1114));
                            } else {
                                r7 = 1;
                                o000o0oOooO0O0 = o000o0o2;
                            }
                            if (i6 != 0) {
                                o000O00 o000o00OooO0o1112 = o000OOo.OooO0o0(null, 3);
                                p023Oooo00O.o00O000o animationSpec1111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                                o00OO0OO.OooO00o shrinkTowards1113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                                o0000O0O targetWidth1113 = o0000O0O.f848Oooo;
                                Intrinsics.checkNotNullParameter(animationSpec1111116, "animationSpec");
                                Intrinsics.checkNotNullParameter(shrinkTowards1113, "shrinkTowards");
                                Intrinsics.checkNotNullParameter(targetWidth1113, "targetWidth");
                                o000o00OooO0O0 = o000o00OooO0o1112.OooO0O0(o000OOo.OooO0o(animationSpec1111116, o000OOo.OooOO0O(shrinkTowards1113), r7, new o000OO(targetWidth1113)));
                            } else {
                                o000o00OooO0O0 = o000o01;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11114 = i3 >> 3;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11114 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11114 & 458752));
                            o00oooo4 = o00oooo3;
                            str3 = str2;
                            o000o03 = o000o00OooO0O0;
                            o000o0o3 = o000o0oOooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                    }
                    i10 = 1572864;
                    i3 |= i10;
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo1114 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec1111117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom1114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth1114 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1111117, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom1114, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth1114, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1114 = o000OOo.OooOO0O(expandFrom1114);
                            o00000OO o00000oo1115 = new o00000OO(initialWidth1114);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo1114.OooO0O0(o000OOo.OooO00o(animationSpec1111117, o00oo0o0OooOO0O1114, true, o00000oo1115));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o1113 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec1111118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards1114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth1114 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1111118, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards1114, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth1114, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o1113.OooO0O0(o000OOo.OooO0o(animationSpec1111118, o000OOo.OooOO0O(shrinkTowards1114), r7, new o000OO(targetWidth1114)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11115 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11115 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11115 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo1115 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec1111119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom1115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth1115 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1111119, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom1115, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth1115, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1115 = o000OOo.OooOO0O(expandFrom1115);
                            o00000OO o00000oo1116 = new o00000OO(initialWidth1115);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo1115.OooO0O0(o000OOo.OooO00o(animationSpec1111119, o00oo0o0OooOO0O1115, true, o00000oo1116));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o1114 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec11111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards1115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth1115 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11111110, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards1115, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth1115, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o1114.OooO0O0(o000OOo.OooO0o(animationSpec11111110, o000OOo.OooOO0O(shrinkTowards1115), r7, new o000OO(targetWidth1115)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11116 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11116 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11116 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo1116 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec11111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom1116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth1116 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11111111, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom1116, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth1116, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1116 = o000OOo.OooOO0O(expandFrom1116);
                            o00000OO o00000oo1117 = new o00000OO(initialWidth1116);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo1116.OooO0O0(o000OOo.OooO00o(animationSpec11111111, o00oo0o0OooOO0O1116, true, o00000oo1117));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o1115 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec11111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards1116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth1116 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11111112, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards1116, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth1116, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o1115.OooO0O0(o000OOo.OooO0o(animationSpec11111112, o000OOo.OooOO0O(shrinkTowards1116), r7, new o000OO(targetWidth1116)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11117 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11117 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11117 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo1117 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec11111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom1117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth1117 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11111113, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom1117, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth1117, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1117 = o000OOo.OooOO0O(expandFrom1117);
                            o00000OO o00000oo1118 = new o00000OO(initialWidth1117);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo1117.OooO0O0(o000OOo.OooO00o(animationSpec11111113, o00oo0o0OooOO0O1117, true, o00000oo1118));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o1116 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec11111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards1117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth1117 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11111114, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards1117, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth1117, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o1116.OooO0O0(o000OOo.OooO0o(animationSpec11111114, o000OOo.OooOO0O(shrinkTowards1117), r7, new o000OO(targetWidth1117)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11118 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11118 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11118 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i10 = 1572864;
                i3 |= i10;
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo1118 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom1118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth1118 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111115, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom1118, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth1118, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1118 = o000OOo.OooOO0O(expandFrom1118);
                        o00000OO o00000oo1119 = new o00000OO(initialWidth1118);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo1118.OooO0O0(o000OOo.OooO00o(animationSpec11111115, o00oo0o0OooOO0O1118, true, o00000oo1119));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o1117 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards1118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth1118 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111116, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards1118, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth1118, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o1117.OooO0O0(o000OOo.OooO0o(animationSpec11111116, o000OOo.OooOO0O(shrinkTowards1118), r7, new o000OO(targetWidth1118)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11119 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11119 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11119 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo1119 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom1119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth1119 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111117, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom1119, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth1119, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1119 = o000OOo.OooOO0O(expandFrom1119);
                        o00000OO o00000oo11110 = new o00000OO(initialWidth1119);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo1119.OooO0O0(o000OOo.OooO00o(animationSpec11111117, o00oo0o0OooOO0O1119, true, o00000oo11110));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o1118 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards1119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth1119 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111118, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards1119, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth1119, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o1118.OooO0O0(o000OOo.OooO0o(animationSpec11111118, o000OOo.OooOO0O(shrinkTowards1119), r7, new o000OO(targetWidth1119)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111110 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111110 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111110 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            o000o02 = o000o01;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo11110 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec11111119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom11110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth11110 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec11111119, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom11110, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth11110, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11110 = o000OOo.OooOO0O(expandFrom11110);
                            o00000OO o00000oo11111 = new o00000OO(initialWidth11110);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo11110.OooO0O0(o000OOo.OooO00o(animationSpec11111119, o00oo0o0OooOO0O11110, true, o00000oo11111));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o1119 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec111111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards11110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth11110 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec111111110, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards11110, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth11110, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o1119.OooO0O0(o000OOo.OooO0o(animationSpec111111110, o000OOo.OooOO0O(shrinkTowards11110), r7, new o000OO(targetWidth11110)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111111 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111111 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111111 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo11111 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec111111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom11111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth11111 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec111111111, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom11111, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth11111, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11111 = o000OOo.OooOO0O(expandFrom11111);
                            o00000OO o00000oo11112 = new o00000OO(initialWidth11111);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo11111.OooO0O0(o000OOo.OooO00o(animationSpec111111111, o00oo0o0OooOO0O11111, true, o00000oo11112));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o11110 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec111111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards11111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth11111 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec111111112, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards11111, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth11111, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o11110.OooO0O0(o000OOo.OooO0o(animationSpec111111112, o000OOo.OooOO0O(shrinkTowards11111), r7, new o000OO(targetWidth11111)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111112 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111112 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111112 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i10 = 1572864;
                i3 |= i10;
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo11112 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom11112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth11112 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111113, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom11112, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth11112, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11112 = o000OOo.OooOO0O(expandFrom11112);
                        o00000OO o00000oo11113 = new o00000OO(initialWidth11112);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo11112.OooO0O0(o000OOo.OooO00o(animationSpec111111113, o00oo0o0OooOO0O11112, true, o00000oo11113));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o11111 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards11112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth11112 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111114, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards11112, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth11112, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o11111.OooO0O0(o000OOo.OooO0o(animationSpec111111114, o000OOo.OooOO0O(shrinkTowards11112), r7, new o000OO(targetWidth11112)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111113 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111113 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111113 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo11113 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom11113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth11113 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111115, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom11113, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth11113, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11113 = o000OOo.OooOO0O(expandFrom11113);
                        o00000OO o00000oo11114 = new o00000OO(initialWidth11113);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo11113.OooO0O0(o000OOo.OooO00o(animationSpec111111115, o00oo0o0OooOO0O11113, true, o00000oo11114));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o11112 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards11113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth11113 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111116, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards11113, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth11113, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o11112.OooO0O0(o000OOo.OooO0o(animationSpec111111116, o000OOo.OooOO0O(shrinkTowards11113), r7, new o000OO(targetWidth11113)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111114 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111114 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111114 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                }
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo11114 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom11114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth11114 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111117, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom11114, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth11114, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11114 = o000OOo.OooOO0O(expandFrom11114);
                        o00000OO o00000oo11115 = new o00000OO(initialWidth11114);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo11114.OooO0O0(o000OOo.OooO00o(animationSpec111111117, o00oo0o0OooOO0O11114, true, o00000oo11115));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o11113 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards11114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth11114 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111118, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards11114, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth11114, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o11113.OooO0O0(o000OOo.OooO0o(animationSpec111111118, o000OOo.OooOO0O(shrinkTowards11114), r7, new o000OO(targetWidth11114)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111115 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111115 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111115 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo11115 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom11115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth11115 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111119, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom11115, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth11115, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11115 = o000OOo.OooOO0O(expandFrom11115);
                        o00000OO o00000oo11116 = new o00000OO(initialWidth11115);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo11115.OooO0O0(o000OOo.OooO00o(animationSpec111111119, o00oo0o0OooOO0O11115, true, o00000oo11116));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o11114 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec1111111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards11115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth11115 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec1111111110, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards11115, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth11115, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o11114.OooO0O0(o000OOo.OooO0o(animationSpec1111111110, o000OOo.OooOO0O(shrinkTowards11115), r7, new o000OO(targetWidth11115)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111116 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111116 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111116 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i10 = 1572864;
            i3 |= i10;
            if ((i3 & 2995921) == 599184) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo11116 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom11116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth11116 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111111, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom11116, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth11116, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11116 = o000OOo.OooOO0O(expandFrom11116);
                    o00000OO o00000oo11117 = new o00000OO(initialWidth11116);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo11116.OooO0O0(o000OOo.OooO00o(animationSpec1111111111, o00oo0o0OooOO0O11116, true, o00000oo11117));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o11115 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards11116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth11116 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111112, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards11116, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth11116, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o11115.OooO0O0(o000OOo.OooO0o(animationSpec1111111112, o000OOo.OooOO0O(shrinkTowards11116), r7, new o000OO(targetWidth11116)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i111117 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111117 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111117 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo11117 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom11117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth11117 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111113, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom11117, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth11117, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11117 = o000OOo.OooOO0O(expandFrom11117);
                    o00000OO o00000oo11118 = new o00000OO(initialWidth11117);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo11117.OooO0O0(o000OOo.OooO00o(animationSpec1111111113, o00oo0o0OooOO0O11117, true, o00000oo11118));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o11116 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards11117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth11117 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111114, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards11117, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth11117, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o11116.OooO0O0(o000OOo.OooO0o(animationSpec1111111114, o000OOo.OooOO0O(shrinkTowards11117), r7, new o000OO(targetWidth11117)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i111118 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111118 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111118 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
        }
        i3 |= 3072;
        o000o0o3 = o000o0o2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                o000o02 = o000o01;
                if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i3 & 2995921) == 599184) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo11118 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec1111111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom11118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth11118 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1111111115, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom11118, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth11118, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11118 = o000OOo.OooOO0O(expandFrom11118);
                            o00000OO o00000oo11119 = new o00000OO(initialWidth11118);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo11118.OooO0O0(o000OOo.OooO00o(animationSpec1111111115, o00oo0o0OooOO0O11118, true, o00000oo11119));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o11117 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec1111111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards11118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth11118 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1111111116, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards11118, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth11118, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o11117.OooO0O0(o000OOo.OooO0o(animationSpec1111111116, o000OOo.OooOO0O(shrinkTowards11118), r7, new o000OO(targetWidth11118)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111119 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i111119 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111119 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000O0o o000o0oOooO0Oo11119 = o000OOo.OooO0Oo(null, 3);
                            p023Oooo00O.o00O000o animationSpec1111111117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                            o00OO0OO.OooO00o expandFrom11119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o00000O initialWidth11119 = o00000O.f838Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1111111117, "animationSpec");
                            Intrinsics.checkNotNullParameter(expandFrom11119, "expandFrom");
                            Intrinsics.checkNotNullParameter(initialWidth11119, "initialWidth");
                            p048OoooooO.o00OO0O0 o00oo0o0OooOO0O11119 = o000OOo.OooOO0O(expandFrom11119);
                            o00000OO o00000oo111110 = new o00000OO(initialWidth11119);
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0oOooO0Oo11119.OooO0O0(o000OOo.OooO00o(animationSpec1111111117, o00oo0o0OooOO0O11119, true, o00000oo111110));
                        } else {
                            r7 = 1;
                            o000o0oOooO0O0 = o000o0o2;
                        }
                        if (i6 != 0) {
                            o000O00 o000o00OooO0o11118 = o000OOo.OooO0o0(null, 3);
                            p023Oooo00O.o00O000o animationSpec1111111118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                            o00OO0OO.OooO00o shrinkTowards11119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                            o0000O0O targetWidth11119 = o0000O0O.f848Oooo;
                            Intrinsics.checkNotNullParameter(animationSpec1111111118, "animationSpec");
                            Intrinsics.checkNotNullParameter(shrinkTowards11119, "shrinkTowards");
                            Intrinsics.checkNotNullParameter(targetWidth11119, "targetWidth");
                            o000o00OooO0O0 = o000o00OooO0o11118.OooO0O0(o000OOo.OooO0o(animationSpec1111111118, o000OOo.OooOO0O(shrinkTowards11119), r7, new o000OO(targetWidth11119)));
                        } else {
                            o000o00OooO0O0 = o000o01;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111110 = i3 >> 3;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111110 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111110 & 458752));
                        o00oooo4 = o00oooo3;
                        str3 = str2;
                        o000o03 = o000o00OooO0O0;
                        o000o0o3 = o000o0oOooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
                }
                i10 = 1572864;
                i3 |= i10;
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo111110 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec1111111119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom111110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth111110 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec1111111119, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom111110, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth111110, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111110 = o000OOo.OooOO0O(expandFrom111110);
                        o00000OO o00000oo111111 = new o00000OO(initialWidth111110);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo111110.OooO0O0(o000OOo.OooO00o(animationSpec1111111119, o00oo0o0OooOO0O111110, true, o00000oo111111));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o11119 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards111110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth111110 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111111110, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards111110, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth111110, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o11119.OooO0O0(o000OOo.OooO0o(animationSpec11111111110, o000OOo.OooOO0O(shrinkTowards111110), r7, new o000OO(targetWidth111110)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111111 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111111 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo111111 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom111111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth111111 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111111111, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom111111, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth111111, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111111 = o000OOo.OooOO0O(expandFrom111111);
                        o00000OO o00000oo111112 = new o00000OO(initialWidth111111);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo111111.OooO0O0(o000OOo.OooO00o(animationSpec11111111111, o00oo0o0OooOO0O111111, true, o00000oo111112));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o111110 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards111111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth111111 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111111112, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards111111, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth111111, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o111110.OooO0O0(o000OOo.OooO0o(animationSpec11111111112, o000OOo.OooOO0O(shrinkTowards111111), r7, new o000OO(targetWidth111111)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111112 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111112 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111112 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                }
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo111112 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom111112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth111112 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111111113, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom111112, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth111112, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111112 = o000OOo.OooOO0O(expandFrom111112);
                        o00000OO o00000oo111113 = new o00000OO(initialWidth111112);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo111112.OooO0O0(o000OOo.OooO00o(animationSpec11111111113, o00oo0o0OooOO0O111112, true, o00000oo111113));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o111111 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards111112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth111112 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111111114, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards111112, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth111112, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o111111.OooO0O0(o000OOo.OooO0o(animationSpec11111111114, o000OOo.OooOO0O(shrinkTowards111112), r7, new o000OO(targetWidth111112)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111113 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111113 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111113 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo111113 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom111113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth111113 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111111115, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom111113, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth111113, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111113 = o000OOo.OooOO0O(expandFrom111113);
                        o00000OO o00000oo111114 = new o00000OO(initialWidth111113);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo111113.OooO0O0(o000OOo.OooO00o(animationSpec11111111115, o00oo0o0OooOO0O111113, true, o00000oo111114));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o111112 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec11111111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards111113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth111113 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec11111111116, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards111113, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth111113, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o111112.OooO0O0(o000OOo.OooO0o(animationSpec11111111116, o000OOo.OooOO0O(shrinkTowards111113), r7, new o000OO(targetWidth111113)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111114 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111114 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111114 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i10 = 1572864;
            i3 |= i10;
            if ((i3 & 2995921) == 599184) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo111114 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec11111111117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom111114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth111114 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec11111111117, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom111114, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth111114, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111114 = o000OOo.OooOO0O(expandFrom111114);
                    o00000OO o00000oo111115 = new o00000OO(initialWidth111114);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo111114.OooO0O0(o000OOo.OooO00o(animationSpec11111111117, o00oo0o0OooOO0O111114, true, o00000oo111115));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o111113 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec11111111118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards111114 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth111114 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec11111111118, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards111114, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth111114, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o111113.OooO0O0(o000OOo.OooO0o(animationSpec11111111118, o000OOo.OooOO0O(shrinkTowards111114), r7, new o000OO(targetWidth111114)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111115 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111115 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111115 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo111115 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec11111111119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom111115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth111115 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec11111111119, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom111115, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth111115, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111115 = o000OOo.OooOO0O(expandFrom111115);
                    o00000OO o00000oo111116 = new o00000OO(initialWidth111115);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo111115.OooO0O0(o000OOo.OooO00o(animationSpec11111111119, o00oo0o0OooOO0O111115, true, o00000oo111116));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o111114 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec111111111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards111115 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth111115 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec111111111110, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards111115, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth111115, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o111114.OooO0O0(o000OOo.OooO0o(animationSpec111111111110, o000OOo.OooOO0O(shrinkTowards111115), r7, new o000OO(targetWidth111115)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111116 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111116 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111116 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
        }
        i3 |= 24576;
        o000o02 = o000o01;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 458752) == 0) {
                str2 = str;
                if (ooo00oOooOOo.Oooo0oo(str2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                if ((i & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                }
                if ((i3 & 2995921) == 599184) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo111116 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom111116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth111116 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111111111, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom111116, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth111116, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111116 = o000OOo.OooOO0O(expandFrom111116);
                        o00000OO o00000oo111117 = new o00000OO(initialWidth111116);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo111116.OooO0O0(o000OOo.OooO00o(animationSpec111111111111, o00oo0o0OooOO0O111116, true, o00000oo111117));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o111115 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards111116 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth111116 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111111112, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards111116, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth111116, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o111115.OooO0O0(o000OOo.OooO0o(animationSpec111111111112, o000OOo.OooOO0O(shrinkTowards111116), r7, new o000OO(targetWidth111116)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111117 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111117 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111117 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000O0o o000o0oOooO0Oo111117 = o000OOo.OooO0Oo(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                        o00OO0OO.OooO00o expandFrom111117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o00000O initialWidth111117 = o00000O.f838Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111111113, "animationSpec");
                        Intrinsics.checkNotNullParameter(expandFrom111117, "expandFrom");
                        Intrinsics.checkNotNullParameter(initialWidth111117, "initialWidth");
                        p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111117 = o000OOo.OooOO0O(expandFrom111117);
                        o00000OO o00000oo111118 = new o00000OO(initialWidth111117);
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0oOooO0Oo111117.OooO0O0(o000OOo.OooO00o(animationSpec111111111113, o00oo0o0OooOO0O111117, true, o00000oo111118));
                    } else {
                        r7 = 1;
                        o000o0oOooO0O0 = o000o0o2;
                    }
                    if (i6 != 0) {
                        o000O00 o000o00OooO0o111116 = o000OOo.OooO0o0(null, 3);
                        p023Oooo00O.o00O000o animationSpec111111111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                        o00OO0OO.OooO00o shrinkTowards111117 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                        o0000O0O targetWidth111117 = o0000O0O.f848Oooo;
                        Intrinsics.checkNotNullParameter(animationSpec111111111114, "animationSpec");
                        Intrinsics.checkNotNullParameter(shrinkTowards111117, "shrinkTowards");
                        Intrinsics.checkNotNullParameter(targetWidth111117, "targetWidth");
                        o000o00OooO0O0 = o000o00OooO0o111116.OooO0O0(o000OOo.OooO0o(animationSpec111111111114, o000OOo.OooOO0O(shrinkTowards111117), r7, new o000OO(targetWidth111117)));
                    } else {
                        o000o00OooO0O0 = o000o01;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111118 = i3 >> 3;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111118 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111118 & 458752));
                    o00oooo4 = o00oooo3;
                    str3 = str2;
                    o000o03 = o000o00OooO0O0;
                    o000o0o3 = o000o0oOooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
            }
            i10 = 1572864;
            i3 |= i10;
            if ((i3 & 2995921) == 599184) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo111118 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec111111111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom111118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth111118 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec111111111115, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom111118, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth111118, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111118 = o000OOo.OooOO0O(expandFrom111118);
                    o00000OO o00000oo111119 = new o00000OO(initialWidth111118);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo111118.OooO0O0(o000OOo.OooO00o(animationSpec111111111115, o00oo0o0OooOO0O111118, true, o00000oo111119));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o111117 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec111111111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards111118 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth111118 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec111111111116, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards111118, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth111118, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o111117.OooO0O0(o000OOo.OooO0o(animationSpec111111111116, o000OOo.OooOO0O(shrinkTowards111118), r7, new o000OO(targetWidth111118)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111119 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i1111119 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111119 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo111119 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec111111111117 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom111119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth111119 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec111111111117, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom111119, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth111119, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O111119 = o000OOo.OooOO0O(expandFrom111119);
                    o00000OO o00000oo1111110 = new o00000OO(initialWidth111119);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo111119.OooO0O0(o000OOo.OooO00o(animationSpec111111111117, o00oo0o0OooOO0O111119, true, o00000oo1111110));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o111118 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec111111111118 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards111119 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth111119 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec111111111118, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards111119, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth111119, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o111118.OooO0O0(o000OOo.OooO0o(animationSpec111111111118, o000OOo.OooOO0O(shrinkTowards111119), r7, new o000OO(targetWidth111119)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111110 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11111110 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111110 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
        }
        i3 |= 196608;
        str2 = str;
        if ((i2 & 32) != 0) {
            if ((i & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
            }
            if ((i3 & 2995921) == 599184) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo1111110 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec111111111119 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom1111110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth1111110 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec111111111119, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom1111110, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth1111110, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1111110 = o000OOo.OooOO0O(expandFrom1111110);
                    o00000OO o00000oo1111111 = new o00000OO(initialWidth1111110);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo1111110.OooO0O0(o000OOo.OooO00o(animationSpec111111111119, o00oo0o0OooOO0O1111110, true, o00000oo1111111));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o111119 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111111110 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards1111110 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth1111110 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111111110, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards1111110, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth1111110, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o111119.OooO0O0(o000OOo.OooO0o(animationSpec1111111111110, o000OOo.OooOO0O(shrinkTowards1111110), r7, new o000OO(targetWidth1111110)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11111111 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111111 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000O0o o000o0oOooO0Oo1111111 = o000OOo.OooO0Oo(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111111111 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                    o00OO0OO.OooO00o expandFrom1111111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o00000O initialWidth1111111 = o00000O.f838Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111111111, "animationSpec");
                    Intrinsics.checkNotNullParameter(expandFrom1111111, "expandFrom");
                    Intrinsics.checkNotNullParameter(initialWidth1111111, "initialWidth");
                    p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1111111 = o000OOo.OooOO0O(expandFrom1111111);
                    o00000OO o00000oo1111112 = new o00000OO(initialWidth1111111);
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0oOooO0Oo1111111.OooO0O0(o000OOo.OooO00o(animationSpec1111111111111, o00oo0o0OooOO0O1111111, true, o00000oo1111112));
                } else {
                    r7 = 1;
                    o000o0oOooO0O0 = o000o0o2;
                }
                if (i6 != 0) {
                    o000O00 o000o00OooO0o1111110 = o000OOo.OooO0o0(null, 3);
                    p023Oooo00O.o00O000o animationSpec1111111111112 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                    o00OO0OO.OooO00o shrinkTowards1111111 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                    o0000O0O targetWidth1111111 = o0000O0O.f848Oooo;
                    Intrinsics.checkNotNullParameter(animationSpec1111111111112, "animationSpec");
                    Intrinsics.checkNotNullParameter(shrinkTowards1111111, "shrinkTowards");
                    Intrinsics.checkNotNullParameter(targetWidth1111111, "targetWidth");
                    o000o00OooO0O0 = o000o00OooO0o1111110.OooO0O0(o000OOo.OooO0o(animationSpec1111111111112, o000OOo.OooOO0O(shrinkTowards1111111), r7, new o000OO(targetWidth1111111)));
                } else {
                    o000o00OooO0O0 = o000o01;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111112 = i3 >> 3;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11111112 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111112 & 458752));
                o00oooo4 = o00oooo3;
                str3 = str2;
                o000o03 = o000o00OooO0O0;
                o000o0o3 = o000o0oOooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
        }
        i10 = 1572864;
        i3 |= i10;
        if ((i3 & 2995921) == 599184) {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000O0o o000o0oOooO0Oo1111112 = o000OOo.OooO0Oo(null, 3);
                p023Oooo00O.o00O000o animationSpec1111111111113 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                o00OO0OO.OooO00o expandFrom1111112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                o00000O initialWidth1111112 = o00000O.f838Oooo;
                Intrinsics.checkNotNullParameter(animationSpec1111111111113, "animationSpec");
                Intrinsics.checkNotNullParameter(expandFrom1111112, "expandFrom");
                Intrinsics.checkNotNullParameter(initialWidth1111112, "initialWidth");
                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1111112 = o000OOo.OooOO0O(expandFrom1111112);
                o00000OO o00000oo1111113 = new o00000OO(initialWidth1111112);
                r7 = 1;
                o000o0oOooO0O0 = o000o0oOooO0Oo1111112.OooO0O0(o000OOo.OooO00o(animationSpec1111111111113, o00oo0o0OooOO0O1111112, true, o00000oo1111113));
            } else {
                r7 = 1;
                o000o0oOooO0O0 = o000o0o2;
            }
            if (i6 != 0) {
                o000O00 o000o00OooO0o1111111 = o000OOo.OooO0o0(null, 3);
                p023Oooo00O.o00O000o animationSpec1111111111114 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                o00OO0OO.OooO00o shrinkTowards1111112 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                o0000O0O targetWidth1111112 = o0000O0O.f848Oooo;
                Intrinsics.checkNotNullParameter(animationSpec1111111111114, "animationSpec");
                Intrinsics.checkNotNullParameter(shrinkTowards1111112, "shrinkTowards");
                Intrinsics.checkNotNullParameter(targetWidth1111112, "targetWidth");
                o000o00OooO0O0 = o000o00OooO0o1111111.OooO0O0(o000OOo.OooO0o(animationSpec1111111111114, o000OOo.OooOO0O(shrinkTowards1111112), r7, new o000OO(targetWidth1111112)));
            } else {
                o000o00OooO0O0 = o000o01;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11111113 = i3 >> 3;
            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11111113 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111113 & 458752));
            o00oooo4 = o00oooo3;
            str3 = str2;
            o000o03 = o000o00OooO0O0;
            o000o0o3 = o000o0oOooO0O0;
        } else {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000O0o o000o0oOooO0Oo1111113 = o000OOo.OooO0Oo(null, 3);
                p023Oooo00O.o00O000o animationSpec1111111111115 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
                o00OO0OO.OooO00o expandFrom1111113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                o00000O initialWidth1111113 = o00000O.f838Oooo;
                Intrinsics.checkNotNullParameter(animationSpec1111111111115, "animationSpec");
                Intrinsics.checkNotNullParameter(expandFrom1111113, "expandFrom");
                Intrinsics.checkNotNullParameter(initialWidth1111113, "initialWidth");
                p048OoooooO.o00OO0O0 o00oo0o0OooOO0O1111113 = o000OOo.OooOO0O(expandFrom1111113);
                o00000OO o00000oo1111114 = new o00000OO(initialWidth1111113);
                r7 = 1;
                o000o0oOooO0O0 = o000o0oOooO0Oo1111113.OooO0O0(o000OOo.OooO00o(animationSpec1111111111115, o00oo0o0OooOO0O1111113, true, o00000oo1111114));
            } else {
                r7 = 1;
                o000o0oOooO0O0 = o000o0o2;
            }
            if (i6 != 0) {
                o000O00 o000o00OooO0o1111112 = o000OOo.OooO0o0(null, 3);
                p023Oooo00O.o00O000o animationSpec1111111111116 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), r7);
                o00OO0OO.OooO00o shrinkTowards1111113 = OoooooO.o00OO0O0.OooO00o.f4202OooOOOo;
                o0000O0O targetWidth1111113 = o0000O0O.f848Oooo;
                Intrinsics.checkNotNullParameter(animationSpec1111111111116, "animationSpec");
                Intrinsics.checkNotNullParameter(shrinkTowards1111113, "shrinkTowards");
                Intrinsics.checkNotNullParameter(targetWidth1111113, "targetWidth");
                o000o00OooO0O0 = o000o00OooO0o1111112.OooO0O0(o000OOo.OooO0o(animationSpec1111111111116, o000OOo.OooOO0O(shrinkTowards1111113), r7, new o000OO(targetWidth1111113)));
            } else {
                o000o00OooO0O0 = o000o01;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11111114 = i3 >> 3;
            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i11111114 & 14) | ((i3 >> 12) & 112), 0), OooOO0.f958Oooo, o00oooo3, o000o0oOooO0O0, o000o00OooO0O0, content, ooo00oOooOOo, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111114 & 458752));
            o00oooo4 = o00oooo3;
            str3 = str2;
            o000o03 = o000o00OooO0O0;
            o000o0o3 = o000o0oOooO0O0;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0O(o0o00oo1, z, o00oooo4, o000o0o3, o000o03, str3, content, i, i2));
    }

    @Composable
    public static final EnterExitState OooO0o(p023Oooo00O.oo00o oo00oVar, Function1 function1, Object obj, p100o000oOoO.oOO00O ooo00o) {
        EnterExitState enterExitState;
        ooo00o.OooO0o0(361571134);
        ooo00o.OooOOoo(-721837481, oo00oVar);
        if (!oo00oVar.OooO0oO()) {
            ooo00o.OooO0o0(-492369756);
            Object objOooO0o = ooo00o.OooO0o();
            if (objOooO0o == o000oOoO.oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00o.Oooo00o(objOooO0o);
            }
            ooo00o.Oooo0o0();
            o0O00O o0o00o2 = (o0O00O) objOooO0o;
            if (((Boolean) function1.invoke(oo00oVar.OooO0O0())).booleanValue()) {
                o0o00o2.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) o0o00o2.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
        } else if (((Boolean) function1.invoke(obj)).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else {
            enterExitState = ((Boolean) function1.invoke(oo00oVar.OooO0O0())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        ooo00o.Oooo0OO();
        ooo00o.Oooo0o0();
        return enterExitState;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0139  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO0o0(boolean z, @Nullable o00OOOO0 o00oooo1, @Nullable o000O0o o000o0o2, @Nullable o000O00 o000o01, @Nullable String str, @NotNull Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        o000O0o o000o0o3;
        int i5;
        int i6;
        o000O00 o000o02;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        o00OOOO0 o00oooo3;
        o000O0o o000o0oOooO0O0;
        o000O00 o000o00OooO0O0;
        o000O0o o000o0o4;
        o000O00 o000o03;
        String str3;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(content, "content");
        p100o000oOoO.oOO00O ooo00oOooOOo = ooo00o.OooOOo(2088733774);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO0OO(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                o00oooo2 = o00oooo1;
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    o000o0o3 = o000o0o2;
                    if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        o000o02 = o000o01;
                        if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                            i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 57344) == 0) {
                            str2 = str;
                            if (ooo00oOooOOo.Oooo0oo(str2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            if ((i & 458752) == 0) {
                                if (ooo00oOooOOo.Oooo0oo(content)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                            }
                            if ((374491 & i3) == 74898 || !ooo00oOooOOo.OooOo0()) {
                                if (i11 != 0) {
                                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                                } else {
                                    o00oooo3 = o00oooo2;
                                }
                                if (i4 != 0) {
                                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                                } else {
                                    o000o0oOooO0O0 = o000o0o3;
                                }
                                if (i6 != 0) {
                                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                                } else {
                                    o000o00OooO0O0 = o000o02;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i12 = i3 << 3;
                                int i13 = (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i3 & 458752);
                                o00oooo2 = o00oooo3;
                                o000o0o4 = o000o0oOooO0O0;
                                o000o03 = o000o00OooO0O0;
                                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i13);
                            } else {
                                ooo00oOooOOo.OooOoo0();
                                o000o0o4 = o000o0o3;
                                o000o03 = o000o02;
                            }
                            str3 = str2;
                            oo0oooOooOo = ooo00oOooOOo.OooOo();
                            if (oo0oooOooOo == null) {
                                return;
                            }
                            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                        }
                        i10 = 196608;
                        i3 |= i10;
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i14 = i3 << 3;
                            int i15 = (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i15);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i16 = i3 << 3;
                            int i17 = (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i17);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i3 |= 24576;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i18 = i3 << 3;
                            int i19 = (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i19);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i110 = i3 << 3;
                            int i111 = (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i112 = i3 << 3;
                        int i113 = (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i113);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i114 = i3 << 3;
                        int i115 = (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i115);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 3072;
                o000o02 = o000o01;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i116 = i3 << 3;
                            int i117 = (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i117);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i118 = i3 << 3;
                            int i119 = (i118 & 57344) | (i118 & 896) | 48 | (i118 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i119);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1110 = i3 << 3;
                        int i1111 = (i1110 & 57344) | (i1110 & 896) | 48 | (i1110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1112 = i3 << 3;
                        int i1113 = (i1112 & 57344) | (i1112 & 896) | 48 | (i1112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1113);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1114 = i3 << 3;
                        int i1115 = (i1114 & 57344) | (i1114 & 896) | 48 | (i1114 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1115);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1116 = i3 << 3;
                        int i1117 = (i1116 & 57344) | (i1116 & 896) | 48 | (i1116 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1117);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1118 = i3 << 3;
                    int i1119 = (i1118 & 57344) | (i1118 & 896) | 48 | (i1118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1119);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11110 = i3 << 3;
                    int i11111 = (i11110 & 57344) | (i11110 & 896) | 48 | (i11110 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 384;
            o000o0o3 = o000o0o2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11112 = i3 << 3;
                            int i11113 = (i11112 & 57344) | (i11112 & 896) | 48 | (i11112 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11113);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11114 = i3 << 3;
                            int i11115 = (i11114 & 57344) | (i11114 & 896) | 48 | (i11114 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11115);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11116 = i3 << 3;
                        int i11117 = (i11116 & 57344) | (i11116 & 896) | 48 | (i11116 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11117);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11118 = i3 << 3;
                        int i11119 = (i11118 & 57344) | (i11118 & 896) | 48 | (i11118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11119);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111110 = i3 << 3;
                        int i111111 = (i111110 & 57344) | (i111110 & 896) | 48 | (i111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111112 = i3 << 3;
                        int i111113 = (i111112 & 57344) | (i111112 & 896) | 48 | (i111112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111113);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111114 = i3 << 3;
                    int i111115 = (i111114 & 57344) | (i111114 & 896) | 48 | (i111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111115);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111116 = i3 << 3;
                    int i111117 = (i111116 & 57344) | (i111116 & 896) | 48 | (i111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111117);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o02 = o000o01;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111118 = i3 << 3;
                        int i111119 = (i111118 & 57344) | (i111118 & 896) | 48 | (i111118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111119);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111110 = i3 << 3;
                        int i1111111 = (i1111110 & 57344) | (i1111110 & 896) | 48 | (i1111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111112 = i3 << 3;
                    int i1111113 = (i1111112 & 57344) | (i1111112 & 896) | 48 | (i1111112 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111113);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111114 = i3 << 3;
                    int i1111115 = (i1111114 & 57344) | (i1111114 & 896) | 48 | (i1111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111115);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111116 = i3 << 3;
                    int i1111117 = (i1111116 & 57344) | (i1111116 & 896) | 48 | (i1111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111117);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111118 = i3 << 3;
                    int i1111119 = (i1111118 & 57344) | (i1111118 & 896) | 48 | (i1111118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111119);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111110 = i3 << 3;
                int i11111111 = (i11111110 & 57344) | (i11111110 & 896) | 48 | (i11111110 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111112 = i3 << 3;
                int i11111113 = (i11111112 & 57344) | (i11111112 & 896) | 48 | (i11111112 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111113);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 48;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                o000o0o3 = o000o0o2;
                if (ooo00oOooOOo.Oooo0oo(o000o0o3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o02 = o000o01;
                    if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                        i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (ooo00oOooOOo.Oooo0oo(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11111114 = i3 << 3;
                            int i11111115 = (i11111114 & 57344) | (i11111114 & 896) | 48 | (i11111114 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111115);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                            } else {
                                o000o0oOooO0O0 = o000o0o3;
                            }
                            if (i6 != 0) {
                                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                            } else {
                                o000o00OooO0O0 = o000o02;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11111116 = i3 << 3;
                            int i11111117 = (i11111116 & 57344) | (i11111116 & 896) | 48 | (i11111116 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o000o0o4 = o000o0oOooO0O0;
                            o000o03 = o000o00OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111117);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11111118 = i3 << 3;
                        int i11111119 = (i11111118 & 57344) | (i11111118 & 896) | 48 | (i11111118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111119);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111111110 = i3 << 3;
                        int i111111111 = (i111111110 & 57344) | (i111111110 & 896) | 48 | (i111111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111111);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111111112 = i3 << 3;
                        int i111111113 = (i111111112 & 57344) | (i111111112 & 896) | 48 | (i111111112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111113);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111111114 = i3 << 3;
                        int i111111115 = (i111111114 & 57344) | (i111111114 & 896) | 48 | (i111111114 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111115);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111116 = i3 << 3;
                    int i111111117 = (i111111116 & 57344) | (i111111116 & 896) | 48 | (i111111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111117);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111118 = i3 << 3;
                    int i111111119 = (i111111118 & 57344) | (i111111118 & 896) | 48 | (i111111118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111119);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o02 = o000o01;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111111110 = i3 << 3;
                        int i1111111111 = (i1111111110 & 57344) | (i1111111110 & 896) | 48 | (i1111111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111111);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111111112 = i3 << 3;
                        int i1111111113 = (i1111111112 & 57344) | (i1111111112 & 896) | 48 | (i1111111112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111113);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111114 = i3 << 3;
                    int i1111111115 = (i1111111114 & 57344) | (i1111111114 & 896) | 48 | (i1111111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111115);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111116 = i3 << 3;
                    int i1111111117 = (i1111111116 & 57344) | (i1111111116 & 896) | 48 | (i1111111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111117);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111118 = i3 << 3;
                    int i1111111119 = (i1111111118 & 57344) | (i1111111118 & 896) | 48 | (i1111111118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111119);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11111111110 = i3 << 3;
                    int i11111111111 = (i11111111110 & 57344) | (i11111111110 & 896) | 48 | (i11111111110 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111111);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111112 = i3 << 3;
                int i11111111113 = (i11111111112 & 57344) | (i11111111112 & 896) | 48 | (i11111111112 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111113);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111114 = i3 << 3;
                int i11111111115 = (i11111111114 & 57344) | (i11111111114 & 896) | 48 | (i11111111114 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111115);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 384;
        o000o0o3 = o000o0o2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                o000o02 = o000o01;
                if (ooo00oOooOOo.Oooo0oo(o000o02)) {
                    i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (ooo00oOooOOo.Oooo0oo(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11111111116 = i3 << 3;
                        int i11111111117 = (i11111111116 & 57344) | (i11111111116 & 896) | 48 | (i11111111116 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111117);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                        } else {
                            o000o0oOooO0O0 = o000o0o3;
                        }
                        if (i6 != 0) {
                            o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                        } else {
                            o000o00OooO0O0 = o000o02;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11111111118 = i3 << 3;
                        int i11111111119 = (i11111111118 & 57344) | (i11111111118 & 896) | 48 | (i11111111118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o000o0o4 = o000o0oOooO0O0;
                        o000o03 = o000o00OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111119);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111110 = i3 << 3;
                    int i111111111111 = (i111111111110 & 57344) | (i111111111110 & 896) | 48 | (i111111111110 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111111111);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111112 = i3 << 3;
                    int i111111111113 = (i111111111112 & 57344) | (i111111111112 & 896) | 48 | (i111111111112 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111111113);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111114 = i3 << 3;
                    int i111111111115 = (i111111111114 & 57344) | (i111111111114 & 896) | 48 | (i111111111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111111115);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111116 = i3 << 3;
                    int i111111111117 = (i111111111116 & 57344) | (i111111111116 & 896) | 48 | (i111111111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111111117);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i111111111118 = i3 << 3;
                int i111111111119 = (i111111111118 & 57344) | (i111111111118 & 896) | 48 | (i111111111118 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i111111111119);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111111111110 = i3 << 3;
                int i1111111111111 = (i1111111111110 & 57344) | (i1111111111110 & 896) | 48 | (i1111111111110 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111111111);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 3072;
        o000o02 = o000o01;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 57344) == 0) {
                str2 = str;
                if (ooo00oOooOOo.Oooo0oo(str2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111111112 = i3 << 3;
                    int i1111111111113 = (i1111111111112 & 57344) | (i1111111111112 & 896) | 48 | (i1111111111112 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111111113);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                    } else {
                        o000o0oOooO0O0 = o000o0o3;
                    }
                    if (i6 != 0) {
                        o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                    } else {
                        o000o00OooO0O0 = o000o02;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111111114 = i3 << 3;
                    int i1111111111115 = (i1111111111114 & 57344) | (i1111111111114 & 896) | 48 | (i1111111111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o000o0o4 = o000o0oOooO0O0;
                    o000o03 = o000o00OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111111115);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111111111116 = i3 << 3;
                int i1111111111117 = (i1111111111116 & 57344) | (i1111111111116 & 896) | 48 | (i1111111111116 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111111117);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111111111118 = i3 << 3;
                int i1111111111119 = (i1111111111118 & 57344) | (i1111111111118 & 896) | 48 | (i1111111111118 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i1111111111119);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
        }
        i3 |= 24576;
        str2 = str;
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111111110 = i3 << 3;
                int i11111111111111 = (i11111111111110 & 57344) | (i11111111111110 & 896) | 48 | (i11111111111110 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111111111);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
                } else {
                    o000o0oOooO0O0 = o000o0o3;
                }
                if (i6 != 0) {
                    o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
                } else {
                    o000o00OooO0O0 = o000o02;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111111112 = i3 << 3;
                int i11111111111113 = (i11111111111112 & 57344) | (i11111111111112 & 896) | 48 | (i11111111111112 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o000o0o4 = o000o0oOooO0O0;
                o000o03 = o000o00OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111111113);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
        }
        i10 = 196608;
        i3 |= i10;
        if ((374491 & i3) == 74898) {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
            } else {
                o000o0oOooO0O0 = o000o0o3;
            }
            if (i6 != 0) {
                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
            } else {
                o000o00OooO0O0 = o000o02;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11111111111114 = i3 << 3;
            int i11111111111115 = (i11111111111114 & 57344) | (i11111111111114 & 896) | 48 | (i11111111111114 & 7168) | (i3 & 458752);
            o00oooo2 = o00oooo3;
            o000o0o4 = o000o0oOooO0O0;
            o000o03 = o000o00OooO0O0;
            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111111115);
        } else {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4215Oooo;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o000o0oOooO0O0 = o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000Ooo.f850Oooo));
            } else {
                o000o0oOooO0O0 = o000o0o3;
            }
            if (i6 != 0) {
                o000o00OooO0O0 = o000OOo.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4196OooOO0, true, o0000O.f842Oooo).OooO0O0(o000OOo.OooO0o0(null, 3));
            } else {
                o000o00OooO0O0 = o000o02;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11111111111116 = i3 << 3;
            int i11111111111117 = (i11111111111116 & 57344) | (i11111111111116 & 896) | 48 | (i11111111111116 & 7168) | (i3 & 458752);
            o00oooo2 = o00oooo3;
            o000o0o4 = o000o0oOooO0O0;
            o000o03 = o000o00OooO0O0;
            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f957Oooo, o00oooo2, o000o0o4, o000o03, content, ooo00oOooOOo, i11111111111117);
        }
        str3 = str2;
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o000o0o4, o000o03, str3, content, i, i2));
    }
}
