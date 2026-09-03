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
import p023Oooo00O.oo00o;
import p023Oooo00O.oo0O;
import p023Oooo00O.oo0oOO0;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    public static final class OooO extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000O000 f938Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f939Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f940Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000OO0 f941Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f942OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f943OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f944OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f945OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(boolean z, o00OOOO0 o00oooo1, o0000OO0 o0000oo1, o000O000 o000o001, String str, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f939Oooo0o = z;
            this.f940Oooo0oO = o00oooo1;
            this.f941Oooo0oo = o0000oo1;
            this.f938Oooo = o000o001;
            this.f944OoooO00 = str;
            this.f943OoooO0 = function3;
            this.f945OoooO0O = i;
            this.f942OoooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO0Oo(this.f939Oooo0o, this.f940Oooo0oO, this.f941Oooo0oo, this.f938Oooo, this.f944OoooO00, this.f943OoooO0, ooo00o, this.f945OoooO0O | 1, this.f942OoooO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", i = {}, l = {748}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f946Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oo00o<EnterExitState> f947Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f948Oooo0oo;

        /* JADX INFO: renamed from: Oooo000.o00Oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0008OooO00o extends Lambda implements Function0<Boolean> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ oo00o<EnterExitState> f949Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0008OooO00o(oo00o<EnterExitState> oo00oVar) {
                super(0);
                this.f949Oooo0o = oo00oVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                EnterExitState enterExitStateOooO0O0 = this.f949Oooo0o.OooO0O0();
                EnterExitState enterExitState = EnterExitState.Visible;
                return Boolean.valueOf(enterExitStateOooO0O0 == enterExitState || this.f949Oooo0o.OooO0o() == enterExitState);
            }
        }

        public static final class OooO0O0 implements FlowCollector<Boolean> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<Boolean> f950Oooo0o;

            public OooO0O0(o0O00OO<Boolean> o0o00oo2) {
                this.f950Oooo0o = o0o00oo2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Boolean bool, Continuation continuation) {
                this.f950Oooo0o.setValue(Boxing.boxBoolean(bool.booleanValue()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo00o<EnterExitState> oo00oVar, o0O00OO<Boolean> o0o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f947Oooo0oO = oo00oVar;
            this.f948Oooo0oo = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f947Oooo0oO, this.f948Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f946Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOooO0oO = o0OOO00.OooO0oO(new C0008OooO00o(this.f947Oooo0oO));
                OooO0O0 oooO0O0 = new OooO0O0(this.f948Oooo0oo);
                this.f946Oooo0o = 1;
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
        public final /* synthetic */ o0000OO0 f951Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo00o<T> f952Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f953Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f954Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f955OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O000 f956OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f957OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(oo00o<T> oo00oVar, Function1<? super T, Boolean> function1, o00OOOO0 o00oooo1, o0000OO0 o0000oo1, o000O000 o000o001, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f952Oooo0o = oo00oVar;
            this.f953Oooo0oO = function1;
            this.f954Oooo0oo = o00oooo1;
            this.f951Oooo = o0000oo1;
            this.f956OoooO00 = o000o001;
            this.f955OoooO0 = function3;
            this.f957OoooO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO00o(this.f952Oooo0o, this.f953Oooo0oO, this.f954Oooo0oo, this.f951Oooo, this.f956OoooO00, this.f955OoooO0, ooo00o, this.f957OoooO0O | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO0 f958Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo00o<T> f959Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f960Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f961Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f962OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f963OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O000 f964OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f965OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(oo00o<T> oo00oVar, Function1<? super T, Boolean> function1, o00OOOO0 o00oooo1, o0000OO0 o0000oo1, o000O000 o000o001, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f959Oooo0o = oo00oVar;
            this.f960Oooo0oO = function1;
            this.f961Oooo0oo = o00oooo1;
            this.f958Oooo = o0000oo1;
            this.f964OoooO00 = o000o001;
            this.f963OoooO0 = function3;
            this.f965OoooO0O = i;
            this.f962OoooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO0OO(this.f959Oooo0o, this.f960Oooo0oO, this.f961Oooo0oo, this.f958Oooo, this.f964OoooO00, this.f963OoooO0, ooo00o, this.f965OoooO0O | 1, this.f962OoooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f966Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f967Oooo0o = new OooOO0();

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
        public final /* synthetic */ o000O000 f968Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p023Oooo00O.o000O<Boolean> f969Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f970Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000OO0 f971Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f972OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> f973OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f974OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f975OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(p023Oooo00O.o000O<Boolean> o000o, o00OOOO0 o00oooo1, o0000OO0 o0000oo1, o000O000 o000o001, String str, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f969Oooo0o = o000o;
            this.f970Oooo0oO = o00oooo1;
            this.f971Oooo0oo = o0000oo1;
            this.f968Oooo = o000o001;
            this.f974OoooO00 = str;
            this.f973OoooO0 = function3;
            this.f975OoooO0O = i;
            this.f972OoooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO0O0(this.f969Oooo0o, this.f970Oooo0oO, this.f971Oooo0oo, this.f968Oooo, this.f974OoooO00, this.f973OoooO0, ooo00o, this.f975OoooO0O | 1, this.f972OoooO);
            return Unit.INSTANCE;
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
    public static final <T> void OooO00o(oo00o<T> oo00oVar, Function1<? super T, Boolean> function1, o00OOOO0 o00oooo1, o0000OO0 enter, o000O000 exit, Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function3, p100o000oOoO.oOO00O ooo00o, int i) {
        int i2;
        o0O00OO o0o00oo2;
        oO0Oo oo0ooOooO0O0;
        float f;
        p145o00Oo0.o00O00 o00o01;
        p145o00Oo0.o00O00 o00o02;
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
            if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(function1.invoke(oo00oVar.OooO0O0()));
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o;
            if (function1.invoke(oo00oVar.OooO0o()).booleanValue() || ((Boolean) o0o00oo3.getValue()).booleanValue() || oo00oVar.OooO0oO()) {
                int i4 = i3 | 48;
                composer.OooO0o0(1215497572);
                int i5 = i4 & 14;
                composer.OooO0o0(1157296644);
                boolean zOooo0oo2 = composer.Oooo0oo(oo00oVar);
                Object objOooO0o2 = composer.OooO0o();
                if (zOooo0oo2 || objOooO0o2 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o2 = oo00oVar.OooO0O0();
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                if (oo00oVar.OooO0oO()) {
                    objOooO0o2 = oo00oVar.OooO0O0();
                }
                composer.OooO0o0(-1220581778);
                EnterExitState enterExitStateOooO0o0 = OooO0o0(oo00oVar, function1, objOooO0o2, composer);
                composer.Oooo0o0();
                T tOooO0o = oo00oVar.OooO0o();
                composer.OooO0o0(-1220581778);
                EnterExitState enterExitStateOooO0o1 = OooO0o0(oo00oVar, function1, tOooO0o, composer);
                composer.Oooo0o0();
                int i6 = ((i4 << 6) & 7168) | i5;
                Intrinsics.checkNotNullParameter(oo00oVar, "<this>");
                Intrinsics.checkNotNullParameter("EnterExitTransition", "childLabel");
                composer.OooO0o0(-198307638);
                composer.OooO0o0(1157296644);
                boolean zOooo0oo3 = composer.Oooo0oo(oo00oVar);
                Object objOooO0o3 = composer.OooO0o();
                if (zOooo0oo3 || objOooO0o3 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o3 = new oo00o(new p023Oooo00O.o000O(enterExitStateOooO0o0), o00O0O.OooO0O0(new StringBuilder(), oo00oVar.f1245OooO0O0, " > ", "EnterExitTransition"));
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                oo00o oo00oVar2 = (oo00o) objOooO0o3;
                o00Oo00.OooO0O0(oo00oVar2, new o00O0O0(oo00oVar, oo00oVar2), composer);
                if (oo00oVar.OooO0oO()) {
                    oo00oVar2.OooOO0(enterExitStateOooO0o0, enterExitStateOooO0o1, oo00oVar.f1253OooOO0O);
                } else {
                    oo00oVar2.OooOOO(enterExitStateOooO0o1, composer, ((i6 >> 3) & 8) | ((i6 >> 6) & 14));
                    oo00oVar2.f1252OooOO0.setValue(Boolean.FALSE);
                }
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.OooO0o0(511388516);
                boolean zOooo0oo4 = composer.Oooo0oo(oo00oVar2) | composer.Oooo0oo(o0o00oo3);
                Object objOooO0o4 = composer.OooO0o();
                if (zOooo0oo4 || objOooO0o4 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o4 = new OooO00o(oo00oVar2, o0o00oo3, null);
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
                    if (zOooo0oo5 || objOooO0o5 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                        objOooO0o5 = new oo000o(oo00oVar2);
                        composer.Oooo00o(objOooO0o5);
                    }
                    composer.Oooo0o0();
                    oo000o oo000oVar = (oo000o) objOooO0o5;
                    int i10 = i8 >> 3;
                    int i11 = i9 | 3072 | (i10 & 112) | (i10 & 896);
                    o00OO0O0<p145o00Oo0.o00O00, p023Oooo00O.o0OO00O> o00oo0o1 = o000000.f833OooO00o;
                    Intrinsics.checkNotNullParameter(oo00oVar2, "<this>");
                    Intrinsics.checkNotNullParameter(enter, "enter");
                    Intrinsics.checkNotNullParameter(exit, "exit");
                    Intrinsics.checkNotNullParameter("Built-in", "label");
                    composer.OooO0o0(914000546);
                    o00OOOO0 o00oooo0OooO0O0 = o00OOO0O.OooO0O0(o00OOO0O.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, new o0000O(oo00oVar2, o0OOO00.OooO0o(enter.OooO00o().f935OooO0O0, composer), o0OOO00.OooO0o(exit.OooO00o().f935OooO0O0, composer))), new o0000oo(oo00oVar2, o0OOO00.OooO0o(enter.OooO00o().f936OooO0OO, composer), o0OOO00.OooO0o(exit.OooO00o().f936OooO0OO, composer)));
                    int i12 = i11 & 14;
                    composer.OooO0o0(1157296644);
                    boolean zOooo0oo6 = composer.Oooo0oo(oo00oVar2);
                    Object objOooO0o6 = composer.OooO0o();
                    if (zOooo0oo6 || objOooO0o6 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                        objOooO0o6 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        composer.Oooo00o(objOooO0o6);
                    }
                    composer.Oooo0o0();
                    o0O00OO o0o00oo4 = (o0O00OO) objOooO0o6;
                    composer.OooO0o0(1157296644);
                    boolean zOooo0oo7 = composer.Oooo0oo(oo00oVar2);
                    Object objOooO0o7 = composer.OooO0o();
                    if (zOooo0oo7 || objOooO0o7 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                        objOooO0o7 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        composer.Oooo00o(objOooO0o7);
                    }
                    composer.Oooo0o0();
                    o0O00OO o0o00oo5 = (o0O00OO) objOooO0o7;
                    if (oo00oVar2.OooO0O0() != oo00oVar2.OooO0o() || oo00oVar2.OooO0oO()) {
                        if (enter.OooO00o().f934OooO00o != null || exit.OooO00o().f934OooO00o != null) {
                            o0o00oo4.setValue(Boolean.TRUE);
                        }
                        if (enter.OooO00o().f937OooO0Oo != null || exit.OooO00o().f937OooO0Oo != null) {
                            o0o00oo5.setValue(Boolean.TRUE);
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        o0o00oo4.setValue(bool);
                        o0o00oo5.setValue(bool);
                    }
                    composer.OooO0o0(1657240548);
                    float f5 = 1.0f;
                    if (((Boolean) o0o00oo4.getValue()).booleanValue()) {
                        o00000O0 o00000o1 = new o00000O0(enter, exit);
                        composer.OooO0o0(-492369756);
                        Object objOooO0o8 = composer.OooO0o();
                        if (objOooO0o8 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
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
                        int[] iArr = o000000.OooO0OO.$EnumSwitchMapping$0;
                        int i17 = iArr[enterExitState2.ordinal()];
                        if (i17 == 1) {
                            f3 = 1.0f;
                        } else if (i17 == 2) {
                            o000O00 o000o01 = enter.OooO00o().f934OooO00o;
                            if (o000o01 != null) {
                                f3 = o000o01.f867OooO00o;
                            } else {
                                f3 = 1.0f;
                            }
                        } else {
                            if (i17 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o000O00 o000o02 = exit.OooO00o().f934OooO00o;
                            if (o000o02 != null) {
                                f3 = o000o02.f867OooO00o;
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
                            o000O00 o000o03 = enter.OooO00o().f934OooO00o;
                            if (o000o03 != null) {
                                f4 = o000o03.f867OooO00o;
                            } else {
                                f4 = 1.0f;
                            }
                        } else {
                            if (i18 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o000O00 o000o04 = exit.OooO00o().f934OooO00o;
                            if (o000o04 != null) {
                                f4 = o000o04.f867OooO00o;
                            } else {
                                f4 = 1.0f;
                            }
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = o0o00oo5;
                        oo0ooOooO0O0 = oo0oOO0.OooO0O0(oo00oVar2, fValueOf, Float.valueOf(f4), o00000o1.invoke(oo00oVar2.OooO0Oo(), composer, Integer.valueOf((i16 >> 3) & 112)), o00oo0o0OooO0O0, str, composer);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    } else {
                        o0o00oo2 = o0o00oo5;
                        oo0ooOooO0O0 = o000000.f834OooO0O0;
                    }
                    oO0Oo oo0oo = oo0ooOooO0O0;
                    composer.Oooo0o0();
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        o00000O o00000o = new o00000O(enter, exit);
                        composer.OooO0o0(-492369756);
                        Object objOooO0o9 = composer.OooO0o();
                        if (objOooO0o9 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
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
                        int[] iArr2 = o000000.OooO0OO.$EnumSwitchMapping$0;
                        int i23 = iArr2[enterExitState4.ordinal()];
                        if (i23 == 1) {
                            f = 1.0f;
                        } else if (i23 == 2) {
                            o000O o000o = enter.OooO00o().f937OooO0Oo;
                            if (o000o != null) {
                                f = o000o.f863OooO00o;
                            } else {
                                f = 1.0f;
                            }
                        } else {
                            if (i23 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o000O o000o2 = exit.OooO00o().f937OooO0Oo;
                            if (o000o2 != null) {
                                f = o000o2.f863OooO00o;
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
                                o000O o000o3 = enter.OooO00o().f937OooO0Oo;
                                if (o000o3 != null) {
                                    f2 = o000o3.f863OooO00o;
                                    f5 = f2;
                                }
                            } else {
                                if (i24 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                o000O o000o4 = exit.OooO00o().f937OooO0Oo;
                                if (o000o4 != null) {
                                    f2 = o000o4.f863OooO00o;
                                    f5 = f2;
                                }
                            }
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO0O1 = oo0oOO0.OooO0O0(oo00oVar2, fValueOf2, Float.valueOf(f5), o00000o.invoke(oo00oVar2.OooO0Oo(), composer, Integer.valueOf((i22 >> 3) & 112)), o00oo0o0OooO0O1, str2, composer);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        if (oo00oVar2.OooO0O0() == EnterExitState.PreEnter) {
                            o000O o000o5 = enter.OooO00o().f937OooO0Oo;
                            if (o000o5 != null) {
                                o00o01 = new p145o00Oo0.o00O00(o000o5.f864OooO0O0);
                            } else {
                                o000O o000o6 = exit.OooO00o().f937OooO0Oo;
                                if (o000o6 != null) {
                                    o00o01 = new p145o00Oo0.o00O00(o000o6.f864OooO0O0);
                                } else {
                                    o00o01 = null;
                                }
                            }
                        } else {
                            o000O o000o7 = exit.OooO00o().f937OooO0Oo;
                            if (o000o7 != null) {
                                o00o01 = new p145o00Oo0.o00O00(o000o7.f864OooO0O0);
                            } else {
                                o000O o000o8 = enter.OooO00o().f937OooO0Oo;
                                if (o000o8 != null) {
                                    o00o01 = new p145o00Oo0.o00O00(o000o8.f864OooO0O0);
                                } else {
                                    o00o01 = null;
                                }
                            }
                        }
                        o00OO0O0<p145o00Oo0.o00O00, p023Oooo00O.o0OO00O> o00oo0o2 = o000000.f833OooO00o;
                        int i25 = i12 | 3136;
                        composer.OooO0o0(-142660079);
                        EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = EnterExitTransitionKt$createModifier$$inlined$animateValue$1.f5509Oooo0o;
                        EnterExitState enterExitState6 = (EnterExitState) oo00oVar2.OooO0O0();
                        composer.OooO0o0(-288165413);
                        int i26 = iArr2[enterExitState6.ordinal()];
                        if (i26 == 1) {
                            o00o02 = o00o01;
                        } else if (i26 == 2) {
                            o000O o000o9 = enter.OooO00o().f937OooO0Oo;
                            if (o000o9 != null) {
                                o00o02 = new p145o00Oo0.o00O00(o000o9.f864OooO0O0);
                            } else {
                                o000O o000o10 = exit.OooO00o().f937OooO0Oo;
                                if (o000o10 != null) {
                                    o00o02 = new p145o00Oo0.o00O00(o000o10.f864OooO0O0);
                                } else {
                                    o00o02 = null;
                                }
                            }
                        } else {
                            if (i26 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o000O o000o11 = exit.OooO00o().f937OooO0Oo;
                            if (o000o11 != null) {
                                o00o02 = new p145o00Oo0.o00O00(o000o11.f864OooO0O0);
                            } else {
                                o000O o000o12 = enter.OooO00o().f937OooO0Oo;
                                if (o000o12 != null) {
                                    o00o02 = new p145o00Oo0.o00O00(o000o12.f864OooO0O0);
                                } else {
                                    o00o02 = null;
                                }
                            }
                        }
                        if (o00o02 != null) {
                            j = o00o02.f32114OooO00o;
                        } else {
                            o00Oo0.o00O00.OooO00o oooO00o = p145o00Oo0.o00O00.f32112OooO0O0;
                            j = p145o00Oo0.o00O00.f32113OooO0OO;
                        }
                        composer.Oooo0o0();
                        p145o00Oo0.o00O00 o00o03 = new p145o00Oo0.o00O00(j);
                        EnterExitState enterExitState7 = (EnterExitState) oo00oVar2.OooO0o();
                        composer.OooO0o0(-288165413);
                        int i27 = iArr2[enterExitState7.ordinal()];
                        if (i27 != 1) {
                            if (i27 == 2) {
                                o000O o000o13 = enter.OooO00o().f937OooO0Oo;
                                if (o000o13 != null) {
                                    o00o01 = new p145o00Oo0.o00O00(o000o13.f864OooO0O0);
                                } else {
                                    o000O o000o14 = exit.OooO00o().f937OooO0Oo;
                                    if (o000o14 != null) {
                                        o00o01 = new p145o00Oo0.o00O00(o000o14.f864OooO0O0);
                                    } else {
                                        o00o01 = null;
                                    }
                                }
                            } else {
                                if (i27 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                o000O o000o15 = exit.OooO00o().f937OooO0Oo;
                                if (o000o15 != null) {
                                    o00o01 = new p145o00Oo0.o00O00(o000o15.f864OooO0O0);
                                } else {
                                    o000O o000o16 = enter.OooO00o().f937OooO0Oo;
                                    if (o000o16 != null) {
                                        o00o01 = new p145o00Oo0.o00O00(o000o16.f864OooO0O0);
                                    } else {
                                        o00o01 = null;
                                    }
                                }
                            }
                        }
                        if (o00o01 != null) {
                            j2 = o00o01.f32114OooO00o;
                        } else {
                            o00Oo0.o00O00.OooO00o oooO00o2 = p145o00Oo0.o00O00.f32112OooO0O0;
                            j2 = p145o00Oo0.o00O00.f32113OooO0OO;
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO0O2 = oo0oOO0.OooO0O0(oo00oVar2, o00o03, new p145o00Oo0.o00O00(j2), enterExitTransitionKt$createModifier$$inlined$animateValue$1.invoke(oo00oVar2.OooO0Oo(), composer, Integer.valueOf((i25 >> 3) & 112)), o00oo0o2, "TransformOriginInterruptionHandling", composer);
                        composer.Oooo0o0();
                        o00oooo0OooO0O0 = GraphicsLayerModifierKt.OooO00o(o00oooo0OooO0O0, new o000000O(oo0oo, oo0ooOooO0O1, oo0ooOooO0O2));
                    } else if (((Boolean) o0o00oo4.getValue()).booleanValue()) {
                        o00oooo0OooO0O0 = GraphicsLayerModifierKt.OooO00o(o00oooo0OooO0O0, new o00000(oo0oo));
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooOOoo = o00oooo1.OooOOoo(o00oooo0OooO0O0);
                    composer.OooO0o0(-492369756);
                    Object objOooO0o10 = composer.OooO0o();
                    if (objOooO0o10 == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                        objOooO0o10 = new o0OoOo0(oo000oVar);
                        composer.Oooo00o(objOooO0o10);
                    }
                    composer.Oooo0o0();
                    o0O0O00.o000000 o000000Var = (o0O0O00.o000000) objOooO0o10;
                    composer.OooO0o0(-1323940314);
                    o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
                    LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
                    o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    Function3<o0OO00o0<o000000.OooO00o>, p100o000oOoO.oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooOOoo);
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
                    oO00000o.OooO0O0(composer, o000000Var, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                    oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                    oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                    ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
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
    public static final void OooO0O0(@NotNull p023Oooo00O.o000O<Boolean> transitionState, @Nullable o00OOOO0 o00oooo1, @Nullable o0000OO0 o0000oo1, @Nullable o000O000 o000o001, @Nullable String str, @NotNull Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        o0000OO0 o0000oo2;
        int i5;
        int i6;
        o000O000 o000o002;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        o00OOOO0 o00oooo3;
        o0000OO0 o0000oo0OooO0O0;
        o000O000 o000o000OooO0O0;
        boolean zOooo0oo;
        Object objOooO0o;
        String str3;
        o00OOOO0 o00oooo4;
        o0000OO0 o0000oo3;
        o000O000 o000o003;
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
                    o0000oo2 = o0000oo1;
                    if (ooo00oOooOOo.Oooo0oo(o0000oo2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        o000o002 = o000o001;
                        if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                                } else {
                                    o00oooo3 = o00oooo2;
                                }
                                if (i4 != 0) {
                                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                                } else {
                                    o0000oo0OooO0O0 = o0000oo2;
                                }
                                if (i6 != 0) {
                                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                                } else {
                                    o000o000OooO0O0 = o000o002;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                                ooo00oOooOOo.OooO0o0(882913843);
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionState);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                                    objOooO0o = new oo00o(transitionState, str2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                oo00o oo00oVar = (oo00o) objOooO0o;
                                oo00oVar.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                                o00Oo00.OooO0O0(oo00oVar, new o00OO000(oo00oVar), ooo00oOooOOo);
                                ooo00oOooOOo.Oooo0o0();
                                int i12 = i3 << 3;
                                OooO00o(oo00oVar, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i3 & 458752));
                                str3 = str2;
                                o00oooo4 = o00oooo3;
                                o0000oo3 = o0000oo0OooO0O0;
                                o000o003 = o000o000OooO0O0;
                            } else {
                                ooo00oOooOOo.OooOoo0();
                                o00oooo4 = o00oooo2;
                                o0000oo3 = o0000oo2;
                                o000o003 = o000o002;
                                str3 = str2;
                            }
                            oo0oooOooOo = ooo00oOooOOo.OooOo();
                            if (oo0oooOooOo == null) {
                                return;
                            }
                            oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                        }
                        i10 = 196608;
                        i3 |= i10;
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar2 = (oo00o) objOooO0o;
                            oo00oVar2.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar2, new o00OO000(oo00oVar2), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i13 = i3 << 3;
                            OooO00o(oo00oVar2, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar3 = (oo00o) objOooO0o;
                            oo00oVar3.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar3, new o00OO000(oo00oVar3), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i14 = i3 << 3;
                            OooO00o(oo00oVar3, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar4 = (oo00o) objOooO0o;
                            oo00oVar4.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar4, new o00OO000(oo00oVar4), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i15 = i3 << 3;
                            OooO00o(oo00oVar4, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar5 = (oo00o) objOooO0o;
                            oo00oVar5.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar5, new o00OO000(oo00oVar5), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i16 = i3 << 3;
                            OooO00o(oo00oVar5, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar6 = (oo00o) objOooO0o;
                        oo00oVar6.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar6, new o00OO000(oo00oVar6), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i17 = i3 << 3;
                        OooO00o(oo00oVar6, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar7 = (oo00o) objOooO0o;
                        oo00oVar7.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar7, new o00OO000(oo00oVar7), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i18 = i3 << 3;
                        OooO00o(oo00oVar7, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                }
                i3 |= 3072;
                o000o002 = o000o001;
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar8 = (oo00o) objOooO0o;
                            oo00oVar8.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar8, new o00OO000(oo00oVar8), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i19 = i3 << 3;
                            OooO00o(oo00oVar8, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar9 = (oo00o) objOooO0o;
                            oo00oVar9.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar9, new o00OO000(oo00oVar9), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i110 = i3 << 3;
                            OooO00o(oo00oVar9, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar10 = (oo00o) objOooO0o;
                        oo00oVar10.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar10, new o00OO000(oo00oVar10), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111 = i3 << 3;
                        OooO00o(oo00oVar10, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar11 = (oo00o) objOooO0o;
                        oo00oVar11.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11, new o00OO000(oo00oVar11), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i112 = i3 << 3;
                        OooO00o(oo00oVar11, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar12 = (oo00o) objOooO0o;
                        oo00oVar12.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar12, new o00OO000(oo00oVar12), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i113 = i3 << 3;
                        OooO00o(oo00oVar12, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar13 = (oo00o) objOooO0o;
                        oo00oVar13.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar13, new o00OO000(oo00oVar13), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i114 = i3 << 3;
                        OooO00o(oo00oVar13, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar14 = (oo00o) objOooO0o;
                    oo00oVar14.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar14, new o00OO000(oo00oVar14), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i115 = i3 << 3;
                    OooO00o(oo00oVar14, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar15 = (oo00o) objOooO0o;
                    oo00oVar15.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar15, new o00OO000(oo00oVar15), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i116 = i3 << 3;
                    OooO00o(oo00oVar15, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
            }
            i3 |= 384;
            o0000oo2 = o0000oo1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o002 = o000o001;
                    if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar16 = (oo00o) objOooO0o;
                            oo00oVar16.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar16, new o00OO000(oo00oVar16), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i117 = i3 << 3;
                            OooO00o(oo00oVar16, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar17 = (oo00o) objOooO0o;
                            oo00oVar17.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar17, new o00OO000(oo00oVar17), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i118 = i3 << 3;
                            OooO00o(oo00oVar17, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i118 & 57344) | (i118 & 896) | 48 | (i118 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar18 = (oo00o) objOooO0o;
                        oo00oVar18.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar18, new o00OO000(oo00oVar18), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i119 = i3 << 3;
                        OooO00o(oo00oVar18, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i119 & 57344) | (i119 & 896) | 48 | (i119 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar19 = (oo00o) objOooO0o;
                        oo00oVar19.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar19, new o00OO000(oo00oVar19), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1110 = i3 << 3;
                        OooO00o(oo00oVar19, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1110 & 57344) | (i1110 & 896) | 48 | (i1110 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar110 = (oo00o) objOooO0o;
                        oo00oVar110.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar110, new o00OO000(oo00oVar110), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1111 = i3 << 3;
                        OooO00o(oo00oVar110, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111 & 57344) | (i1111 & 896) | 48 | (i1111 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar111 = (oo00o) objOooO0o;
                        oo00oVar111.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar111, new o00OO000(oo00oVar111), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1112 = i3 << 3;
                        OooO00o(oo00oVar111, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1112 & 57344) | (i1112 & 896) | 48 | (i1112 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar112 = (oo00o) objOooO0o;
                    oo00oVar112.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar112, new o00OO000(oo00oVar112), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1113 = i3 << 3;
                    OooO00o(oo00oVar112, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1113 & 57344) | (i1113 & 896) | 48 | (i1113 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar113 = (oo00o) objOooO0o;
                    oo00oVar113.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar113, new o00OO000(oo00oVar113), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1114 = i3 << 3;
                    OooO00o(oo00oVar113, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1114 & 57344) | (i1114 & 896) | 48 | (i1114 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o002 = o000o001;
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar114 = (oo00o) objOooO0o;
                        oo00oVar114.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar114, new o00OO000(oo00oVar114), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1115 = i3 << 3;
                        OooO00o(oo00oVar114, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1115 & 57344) | (i1115 & 896) | 48 | (i1115 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar115 = (oo00o) objOooO0o;
                        oo00oVar115.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar115, new o00OO000(oo00oVar115), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1116 = i3 << 3;
                        OooO00o(oo00oVar115, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1116 & 57344) | (i1116 & 896) | 48 | (i1116 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar116 = (oo00o) objOooO0o;
                    oo00oVar116.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar116, new o00OO000(oo00oVar116), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1117 = i3 << 3;
                    OooO00o(oo00oVar116, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1117 & 57344) | (i1117 & 896) | 48 | (i1117 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar117 = (oo00o) objOooO0o;
                    oo00oVar117.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar117, new o00OO000(oo00oVar117), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1118 = i3 << 3;
                    OooO00o(oo00oVar117, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1118 & 57344) | (i1118 & 896) | 48 | (i1118 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar118 = (oo00o) objOooO0o;
                    oo00oVar118.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar118, new o00OO000(oo00oVar118), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1119 = i3 << 3;
                    OooO00o(oo00oVar118, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1119 & 57344) | (i1119 & 896) | 48 | (i1119 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar119 = (oo00o) objOooO0o;
                    oo00oVar119.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar119, new o00OO000(oo00oVar119), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i11110 = i3 << 3;
                    OooO00o(oo00oVar119, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11110 & 57344) | (i11110 & 896) | 48 | (i11110 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar1110 = (oo00o) objOooO0o;
                oo00oVar1110.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1110, new o00OO000(oo00oVar1110), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111 = i3 << 3;
                OooO00o(oo00oVar1110, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11111 & 57344) | (i11111 & 896) | 48 | (i11111 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar1111 = (oo00o) objOooO0o;
                oo00oVar1111.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1111, new o00OO000(oo00oVar1111), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11112 = i3 << 3;
                OooO00o(oo00oVar1111, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11112 & 57344) | (i11112 & 896) | 48 | (i11112 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
        }
        i3 |= 48;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                o0000oo2 = o0000oo1;
                if (ooo00oOooOOo.Oooo0oo(o0000oo2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o002 = o000o001;
                    if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar1112 = (oo00o) objOooO0o;
                            oo00oVar1112.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar1112, new o00OO000(oo00oVar1112), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i11113 = i3 << 3;
                            OooO00o(oo00oVar1112, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11113 & 57344) | (i11113 & 896) | 48 | (i11113 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                            } else {
                                o000o000OooO0O0 = o000o002;
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
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oo00o(transitionState, str2);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            oo00o oo00oVar1113 = (oo00o) objOooO0o;
                            oo00oVar1113.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                            o00Oo00.OooO0O0(oo00oVar1113, new o00OO000(oo00oVar1113), ooo00oOooOOo);
                            ooo00oOooOOo.Oooo0o0();
                            int i11114 = i3 << 3;
                            OooO00o(oo00oVar1113, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11114 & 57344) | (i11114 & 896) | 48 | (i11114 & 7168) | (i3 & 458752));
                            str3 = str2;
                            o00oooo4 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar1114 = (oo00o) objOooO0o;
                        oo00oVar1114.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1114, new o00OO000(oo00oVar1114), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11115 = i3 << 3;
                        OooO00o(oo00oVar1114, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11115 & 57344) | (i11115 & 896) | 48 | (i11115 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar1115 = (oo00o) objOooO0o;
                        oo00oVar1115.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1115, new o00OO000(oo00oVar1115), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11116 = i3 << 3;
                        OooO00o(oo00oVar1115, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11116 & 57344) | (i11116 & 896) | 48 | (i11116 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar1116 = (oo00o) objOooO0o;
                        oo00oVar1116.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1116, new o00OO000(oo00oVar1116), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11117 = i3 << 3;
                        OooO00o(oo00oVar1116, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11117 & 57344) | (i11117 & 896) | 48 | (i11117 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar1117 = (oo00o) objOooO0o;
                        oo00oVar1117.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar1117, new o00OO000(oo00oVar1117), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i11118 = i3 << 3;
                        OooO00o(oo00oVar1117, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11118 & 57344) | (i11118 & 896) | 48 | (i11118 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar1118 = (oo00o) objOooO0o;
                    oo00oVar1118.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar1118, new o00OO000(oo00oVar1118), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i11119 = i3 << 3;
                    OooO00o(oo00oVar1118, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11119 & 57344) | (i11119 & 896) | 48 | (i11119 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar1119 = (oo00o) objOooO0o;
                    oo00oVar1119.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar1119, new o00OO000(oo00oVar1119), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111110 = i3 << 3;
                    OooO00o(oo00oVar1119, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111110 & 57344) | (i111110 & 896) | 48 | (i111110 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o002 = o000o001;
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar11110 = (oo00o) objOooO0o;
                        oo00oVar11110.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11110, new o00OO000(oo00oVar11110), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111111 = i3 << 3;
                        OooO00o(oo00oVar11110, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111111 & 57344) | (i111111 & 896) | 48 | (i111111 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar11111 = (oo00o) objOooO0o;
                        oo00oVar11111.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11111, new o00OO000(oo00oVar11111), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111112 = i3 << 3;
                        OooO00o(oo00oVar11111, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111112 & 57344) | (i111112 & 896) | 48 | (i111112 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar11112 = (oo00o) objOooO0o;
                    oo00oVar11112.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11112, new o00OO000(oo00oVar11112), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111113 = i3 << 3;
                    OooO00o(oo00oVar11112, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111113 & 57344) | (i111113 & 896) | 48 | (i111113 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar11113 = (oo00o) objOooO0o;
                    oo00oVar11113.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11113, new o00OO000(oo00oVar11113), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111114 = i3 << 3;
                    OooO00o(oo00oVar11113, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111114 & 57344) | (i111114 & 896) | 48 | (i111114 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar11114 = (oo00o) objOooO0o;
                    oo00oVar11114.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11114, new o00OO000(oo00oVar11114), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111115 = i3 << 3;
                    OooO00o(oo00oVar11114, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111115 & 57344) | (i111115 & 896) | 48 | (i111115 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar11115 = (oo00o) objOooO0o;
                    oo00oVar11115.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar11115, new o00OO000(oo00oVar11115), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i111116 = i3 << 3;
                    OooO00o(oo00oVar11115, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111116 & 57344) | (i111116 & 896) | 48 | (i111116 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar11116 = (oo00o) objOooO0o;
                oo00oVar11116.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar11116, new o00OO000(oo00oVar11116), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i111117 = i3 << 3;
                OooO00o(oo00oVar11116, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111117 & 57344) | (i111117 & 896) | 48 | (i111117 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar11117 = (oo00o) objOooO0o;
                oo00oVar11117.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar11117, new o00OO000(oo00oVar11117), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i111118 = i3 << 3;
                OooO00o(oo00oVar11117, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111118 & 57344) | (i111118 & 896) | 48 | (i111118 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
        }
        i3 |= 384;
        o0000oo2 = o0000oo1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                o000o002 = o000o001;
                if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar11118 = (oo00o) objOooO0o;
                        oo00oVar11118.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11118, new o00OO000(oo00oVar11118), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i111119 = i3 << 3;
                        OooO00o(oo00oVar11118, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i111119 & 57344) | (i111119 & 896) | 48 | (i111119 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                        } else {
                            o000o000OooO0O0 = o000o002;
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
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oo00o(transitionState, str2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        oo00o oo00oVar11119 = (oo00o) objOooO0o;
                        oo00oVar11119.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                        o00Oo00.OooO0O0(oo00oVar11119, new o00OO000(oo00oVar11119), ooo00oOooOOo);
                        ooo00oOooOOo.Oooo0o0();
                        int i1111110 = i3 << 3;
                        OooO00o(oo00oVar11119, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111110 & 57344) | (i1111110 & 896) | 48 | (i1111110 & 7168) | (i3 & 458752));
                        str3 = str2;
                        o00oooo4 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar111110 = (oo00o) objOooO0o;
                    oo00oVar111110.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111110, new o00OO000(oo00oVar111110), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111111 = i3 << 3;
                    OooO00o(oo00oVar111110, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111111 & 57344) | (i1111111 & 896) | 48 | (i1111111 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar111111 = (oo00o) objOooO0o;
                    oo00oVar111111.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111111, new o00OO000(oo00oVar111111), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111112 = i3 << 3;
                    OooO00o(oo00oVar111111, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111112 & 57344) | (i1111112 & 896) | 48 | (i1111112 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar111112 = (oo00o) objOooO0o;
                    oo00oVar111112.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111112, new o00OO000(oo00oVar111112), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111113 = i3 << 3;
                    OooO00o(oo00oVar111112, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111113 & 57344) | (i1111113 & 896) | 48 | (i1111113 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar111113 = (oo00o) objOooO0o;
                    oo00oVar111113.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111113, new o00OO000(oo00oVar111113), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111114 = i3 << 3;
                    OooO00o(oo00oVar111113, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111114 & 57344) | (i1111114 & 896) | 48 | (i1111114 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar111114 = (oo00o) objOooO0o;
                oo00oVar111114.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111114, new o00OO000(oo00oVar111114), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i1111115 = i3 << 3;
                OooO00o(oo00oVar111114, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111115 & 57344) | (i1111115 & 896) | 48 | (i1111115 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar111115 = (oo00o) objOooO0o;
                oo00oVar111115.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111115, new o00OO000(oo00oVar111115), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i1111116 = i3 << 3;
                OooO00o(oo00oVar111115, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111116 & 57344) | (i1111116 & 896) | 48 | (i1111116 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
        }
        i3 |= 3072;
        o000o002 = o000o001;
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar111116 = (oo00o) objOooO0o;
                    oo00oVar111116.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111116, new o00OO000(oo00oVar111116), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111117 = i3 << 3;
                    OooO00o(oo00oVar111116, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111117 & 57344) | (i1111117 & 896) | 48 | (i1111117 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                    } else {
                        o000o000OooO0O0 = o000o002;
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
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oo00o(transitionState, str2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oo00o oo00oVar111117 = (oo00o) objOooO0o;
                    oo00oVar111117.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                    o00Oo00.OooO0O0(oo00oVar111117, new o00OO000(oo00oVar111117), ooo00oOooOOo);
                    ooo00oOooOOo.Oooo0o0();
                    int i1111118 = i3 << 3;
                    OooO00o(oo00oVar111117, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111118 & 57344) | (i1111118 & 896) | 48 | (i1111118 & 7168) | (i3 & 458752));
                    str3 = str2;
                    o00oooo4 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar111118 = (oo00o) objOooO0o;
                oo00oVar111118.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111118, new o00OO000(oo00oVar111118), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i1111119 = i3 << 3;
                OooO00o(oo00oVar111118, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i1111119 & 57344) | (i1111119 & 896) | 48 | (i1111119 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar111119 = (oo00o) objOooO0o;
                oo00oVar111119.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar111119, new o00OO000(oo00oVar111119), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111110 = i3 << 3;
                OooO00o(oo00oVar111119, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11111110 & 57344) | (i11111110 & 896) | 48 | (i11111110 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar1111110 = (oo00o) objOooO0o;
                oo00oVar1111110.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1111110, new o00OO000(oo00oVar1111110), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111111 = i3 << 3;
                OooO00o(oo00oVar1111110, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11111111 & 57344) | (i11111111 & 896) | 48 | (i11111111 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
                } else {
                    o000o000OooO0O0 = o000o002;
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
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new oo00o(transitionState, str2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oo00o oo00oVar1111111 = (oo00o) objOooO0o;
                oo00oVar1111111.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
                o00Oo00.OooO0O0(oo00oVar1111111, new o00OO000(oo00oVar1111111), ooo00oOooOOo);
                ooo00oOooOOo.Oooo0o0();
                int i11111112 = i3 << 3;
                OooO00o(oo00oVar1111111, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11111112 & 57344) | (i11111112 & 896) | 48 | (i11111112 & 7168) | (i3 & 458752));
                str3 = str2;
                o00oooo4 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
        }
        i10 = 196608;
        i3 |= i10;
        if ((374491 & i3) == 74898) {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
            } else {
                o0000oo0OooO0O0 = o0000oo2;
            }
            if (i6 != 0) {
                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
            } else {
                o000o000OooO0O0 = o000o002;
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
                objOooO0o = new oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            oo00o oo00oVar1111112 = (oo00o) objOooO0o;
            oo00oVar1111112.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
            o00Oo00.OooO0O0(oo00oVar1111112, new o00OO000(oo00oVar1111112), ooo00oOooOOo);
            ooo00oOooOOo.Oooo0o0();
            int i11111113 = i3 << 3;
            OooO00o(oo00oVar1111112, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11111113 & 57344) | (i11111113 & 896) | 48 | (i11111113 & 7168) | (i3 & 458752));
            str3 = str2;
            o00oooo4 = o00oooo3;
            o0000oo3 = o0000oo0OooO0O0;
            o000o003 = o000o000OooO0O0;
        } else {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
            } else {
                o0000oo0OooO0O0 = o0000oo2;
            }
            if (i6 != 0) {
                o000o000OooO0O0 = o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o));
            } else {
                o000o000OooO0O0 = o000o002;
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
                objOooO0o = new oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new oo00o(transitionState, str2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            oo00o oo00oVar1111113 = (oo00o) objOooO0o;
            oo00oVar1111113.OooO00o(transitionState.f1057OooO0O0.getValue(), ooo00oOooOOo, 0);
            o00Oo00.OooO0O0(oo00oVar1111113, new o00OO000(oo00oVar1111113), ooo00oOooOOo);
            ooo00oOooOOo.Oooo0o0();
            int i11111114 = i3 << 3;
            OooO00o(oo00oVar1111113, OooOO0.f967Oooo0o, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i11111114 & 57344) | (i11111114 & 896) | 48 | (i11111114 & 7168) | (i3 & 458752));
            str3 = str2;
            o00oooo4 = o00oooo3;
            o0000oo3 = o0000oo0OooO0O0;
            o000o003 = o000o000OooO0O0;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0O(transitionState, o00oooo4, o0000oo3, o000o003, str3, content, i, i2));
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
    public static final <T> void OooO0OO(@NotNull oo00o<T> oo00oVar, @NotNull Function1<? super T, Boolean> visible, @Nullable o00OOOO0 o00oooo1, @Nullable o0000OO0 o0000oo1, @Nullable o000O000 o000o001, @NotNull Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        o0000OO0 o0000oo2;
        int i5;
        int i6;
        o000O000 o000o002;
        int i7;
        int i8;
        o00OOOO0 o00oooo3;
        o0000OO0 o0000oo0OooO0O0;
        o000O000 o000o000OooO0O0;
        o00OOOO0 o00oooo4;
        o000O000 o000o003;
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
                    o0000oo2 = o0000oo1;
                    if (ooo00oOooOOo.Oooo0oo(o0000oo2)) {
                        i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        o000o002 = o000o001;
                        if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                            o00oooo4 = o00oooo3;
                            o0000oo2 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                        } else {
                            ooo00oOooOOo.OooOoo0();
                            o00oooo4 = o00oooo2;
                            o000o003 = o000o002;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
                    }
                    i8 = 196608;
                    i3 |= i8;
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
                }
                i3 |= 24576;
                o000o002 = o000o001;
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
            }
            i3 |= 3072;
            o0000oo2 = o0000oo1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    o000o002 = o000o001;
                    if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
            }
            i3 |= 24576;
            o000o002 = o000o001;
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
        }
        i3 |= 384;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                o0000oo2 = o0000oo1;
                if (ooo00oOooOOo.Oooo0oo(o0000oo2)) {
                    i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    o000o002 = o000o001;
                    if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    } else {
                        if (i9 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                        o00oooo4 = o00oooo3;
                        o0000oo2 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
            }
            i3 |= 24576;
            o000o002 = o000o001;
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
        }
        i3 |= 3072;
        o0000oo2 = o0000oo1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                o000o002 = o000o001;
                if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                } else {
                    if (i9 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    o00oooo4 = o00oooo3;
                    o0000oo2 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
        }
        i3 |= 24576;
        o000o002 = o000o001;
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
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            } else {
                if (i9 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                o00oooo4 = o00oooo3;
                o0000oo2 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
        }
        i8 = 196608;
        i3 |= i8;
        if ((374491 & i3) == 74898) {
            if (i9 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
            } else {
                o0000oo0OooO0O0 = o0000oo2;
            }
            if (i6 != 0) {
                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
            } else {
                o000o000OooO0O0 = o000o002;
            }
            OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
            o00oooo4 = o00oooo3;
            o0000oo2 = o0000oo0OooO0O0;
            o000o003 = o000o000OooO0O0;
        } else {
            if (i9 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
            } else {
                o0000oo0OooO0O0 = o0000oo2;
            }
            if (i6 != 0) {
                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
            } else {
                o000o000OooO0O0 = o000o002;
            }
            OooO00o(oo00oVar, visible, o00oooo3, o0000oo0OooO0O0, o000o000OooO0O0, content, ooo00oOooOOo, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
            o00oooo4 = o00oooo3;
            o0000oo2 = o0000oo0OooO0O0;
            o000o003 = o000o000OooO0O0;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(oo00oVar, visible, o00oooo4, o0000oo2, o000o003, content, i, i2));
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
    public static final void OooO0Oo(boolean z, @Nullable o00OOOO0 o00oooo1, @Nullable o0000OO0 o0000oo1, @Nullable o000O000 o000o001, @Nullable String str, @NotNull Function3<? super o00Ooo, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        o0000OO0 o0000oo2;
        int i5;
        int i6;
        o000O000 o000o002;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        o00OOOO0 o00oooo3;
        o0000OO0 o0000oo0OooO0O0;
        o000O000 o000o000OooO0O0;
        o0000OO0 o0000oo3;
        o000O000 o000o003;
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
                    o0000oo2 = o0000oo1;
                    if (ooo00oOooOOo.Oooo0oo(o0000oo2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        o000o002 = o000o001;
                        if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                                } else {
                                    o00oooo3 = o00oooo2;
                                }
                                if (i4 != 0) {
                                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                                } else {
                                    o0000oo0OooO0O0 = o0000oo2;
                                }
                                if (i6 != 0) {
                                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                                } else {
                                    o000o000OooO0O0 = o000o002;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i12 = i3 << 3;
                                int i13 = (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i3 & 458752);
                                o00oooo2 = o00oooo3;
                                o0000oo3 = o0000oo0OooO0O0;
                                o000o003 = o000o000OooO0O0;
                                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i13);
                            } else {
                                ooo00oOooOOo.OooOoo0();
                                o0000oo3 = o0000oo2;
                                o000o003 = o000o002;
                            }
                            str3 = str2;
                            oo0oooOooOo = ooo00oOooOOo.OooOo();
                            if (oo0oooOooOo == null) {
                                return;
                            }
                            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                        }
                        i10 = 196608;
                        i3 |= i10;
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i14 = i3 << 3;
                            int i15 = (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i15);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i16 = i3 << 3;
                            int i17 = (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i17);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i18 = i3 << 3;
                            int i19 = (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i19);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i110 = i3 << 3;
                            int i111 = (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i112 = i3 << 3;
                        int i113 = (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i113);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i114 = i3 << 3;
                        int i115 = (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i115);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                }
                i3 |= 3072;
                o000o002 = o000o001;
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i116 = i3 << 3;
                            int i117 = (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i117);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i118 = i3 << 3;
                            int i119 = (i118 & 57344) | (i118 & 896) | 48 | (i118 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i119);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1110 = i3 << 3;
                        int i1111 = (i1110 & 57344) | (i1110 & 896) | 48 | (i1110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1112 = i3 << 3;
                        int i1113 = (i1112 & 57344) | (i1112 & 896) | 48 | (i1112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1113);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1114 = i3 << 3;
                        int i1115 = (i1114 & 57344) | (i1114 & 896) | 48 | (i1114 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1115);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1116 = i3 << 3;
                        int i1117 = (i1116 & 57344) | (i1116 & 896) | 48 | (i1116 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1117);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1118 = i3 << 3;
                    int i1119 = (i1118 & 57344) | (i1118 & 896) | 48 | (i1118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1119);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11110 = i3 << 3;
                    int i11111 = (i11110 & 57344) | (i11110 & 896) | 48 | (i11110 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
            }
            i3 |= 384;
            o0000oo2 = o0000oo1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o002 = o000o001;
                    if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11112 = i3 << 3;
                            int i11113 = (i11112 & 57344) | (i11112 & 896) | 48 | (i11112 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11113);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11114 = i3 << 3;
                            int i11115 = (i11114 & 57344) | (i11114 & 896) | 48 | (i11114 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11115);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11116 = i3 << 3;
                        int i11117 = (i11116 & 57344) | (i11116 & 896) | 48 | (i11116 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11117);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11118 = i3 << 3;
                        int i11119 = (i11118 & 57344) | (i11118 & 896) | 48 | (i11118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11119);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111110 = i3 << 3;
                        int i111111 = (i111110 & 57344) | (i111110 & 896) | 48 | (i111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111112 = i3 << 3;
                        int i111113 = (i111112 & 57344) | (i111112 & 896) | 48 | (i111112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111113);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111114 = i3 << 3;
                    int i111115 = (i111114 & 57344) | (i111114 & 896) | 48 | (i111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111115);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111116 = i3 << 3;
                    int i111117 = (i111116 & 57344) | (i111116 & 896) | 48 | (i111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111117);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o002 = o000o001;
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111118 = i3 << 3;
                        int i111119 = (i111118 & 57344) | (i111118 & 896) | 48 | (i111118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111119);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111110 = i3 << 3;
                        int i1111111 = (i1111110 & 57344) | (i1111110 & 896) | 48 | (i1111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111112 = i3 << 3;
                    int i1111113 = (i1111112 & 57344) | (i1111112 & 896) | 48 | (i1111112 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111113);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111114 = i3 << 3;
                    int i1111115 = (i1111114 & 57344) | (i1111114 & 896) | 48 | (i1111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111115);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111116 = i3 << 3;
                    int i1111117 = (i1111116 & 57344) | (i1111116 & 896) | 48 | (i1111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111117);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111118 = i3 << 3;
                    int i1111119 = (i1111118 & 57344) | (i1111118 & 896) | 48 | (i1111118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111119);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111110 = i3 << 3;
                int i11111111 = (i11111110 & 57344) | (i11111110 & 896) | 48 | (i11111110 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111112 = i3 << 3;
                int i11111113 = (i11111112 & 57344) | (i11111112 & 896) | 48 | (i11111112 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111113);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
        }
        i3 |= 48;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                o0000oo2 = o0000oo1;
                if (ooo00oOooOOo.Oooo0oo(o0000oo2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    o000o002 = o000o001;
                    if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11111114 = i3 << 3;
                            int i11111115 = (i11111114 & 57344) | (i11111114 & 896) | 48 | (i11111114 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111115);
                        } else {
                            if (i11 != 0) {
                                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo3 = o00oooo2;
                            }
                            if (i4 != 0) {
                                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                            } else {
                                o0000oo0OooO0O0 = o0000oo2;
                            }
                            if (i6 != 0) {
                                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                            } else {
                                o000o000OooO0O0 = o000o002;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i11111116 = i3 << 3;
                            int i11111117 = (i11111116 & 57344) | (i11111116 & 896) | 48 | (i11111116 & 7168) | (i3 & 458752);
                            o00oooo2 = o00oooo3;
                            o0000oo3 = o0000oo0OooO0O0;
                            o000o003 = o000o000OooO0O0;
                            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111117);
                        }
                        str3 = str2;
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11111118 = i3 << 3;
                        int i11111119 = (i11111118 & 57344) | (i11111118 & 896) | 48 | (i11111118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111119);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111111110 = i3 << 3;
                        int i111111111 = (i111111110 & 57344) | (i111111110 & 896) | 48 | (i111111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111111);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111111112 = i3 << 3;
                        int i111111113 = (i111111112 & 57344) | (i111111112 & 896) | 48 | (i111111112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111113);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111111114 = i3 << 3;
                        int i111111115 = (i111111114 & 57344) | (i111111114 & 896) | 48 | (i111111114 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111115);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111116 = i3 << 3;
                    int i111111117 = (i111111116 & 57344) | (i111111116 & 896) | 48 | (i111111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111117);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111118 = i3 << 3;
                    int i111111119 = (i111111118 & 57344) | (i111111118 & 896) | 48 | (i111111118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111119);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
            }
            i3 |= 3072;
            o000o002 = o000o001;
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111111110 = i3 << 3;
                        int i1111111111 = (i1111111110 & 57344) | (i1111111110 & 896) | 48 | (i1111111110 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111111);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1111111112 = i3 << 3;
                        int i1111111113 = (i1111111112 & 57344) | (i1111111112 & 896) | 48 | (i1111111112 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111113);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111114 = i3 << 3;
                    int i1111111115 = (i1111111114 & 57344) | (i1111111114 & 896) | 48 | (i1111111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111115);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111116 = i3 << 3;
                    int i1111111117 = (i1111111116 & 57344) | (i1111111116 & 896) | 48 | (i1111111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111117);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111118 = i3 << 3;
                    int i1111111119 = (i1111111118 & 57344) | (i1111111118 & 896) | 48 | (i1111111118 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111119);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11111111110 = i3 << 3;
                    int i11111111111 = (i11111111110 & 57344) | (i11111111110 & 896) | 48 | (i11111111110 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111111);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111112 = i3 << 3;
                int i11111111113 = (i11111111112 & 57344) | (i11111111112 & 896) | 48 | (i11111111112 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111113);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111114 = i3 << 3;
                int i11111111115 = (i11111111114 & 57344) | (i11111111114 & 896) | 48 | (i11111111114 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111115);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
        }
        i3 |= 384;
        o0000oo2 = o0000oo1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                o000o002 = o000o001;
                if (ooo00oOooOOo.Oooo0oo(o000o002)) {
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
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11111111116 = i3 << 3;
                        int i11111111117 = (i11111111116 & 57344) | (i11111111116 & 896) | 48 | (i11111111116 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111117);
                    } else {
                        if (i11 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        if (i4 != 0) {
                            o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                        } else {
                            o0000oo0OooO0O0 = o0000oo2;
                        }
                        if (i6 != 0) {
                            o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                        } else {
                            o000o000OooO0O0 = o000o002;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i11111111118 = i3 << 3;
                        int i11111111119 = (i11111111118 & 57344) | (i11111111118 & 896) | 48 | (i11111111118 & 7168) | (i3 & 458752);
                        o00oooo2 = o00oooo3;
                        o0000oo3 = o0000oo0OooO0O0;
                        o000o003 = o000o000OooO0O0;
                        OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111119);
                    }
                    str3 = str2;
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111110 = i3 << 3;
                    int i111111111111 = (i111111111110 & 57344) | (i111111111110 & 896) | 48 | (i111111111110 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111111111);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111112 = i3 << 3;
                    int i111111111113 = (i111111111112 & 57344) | (i111111111112 & 896) | 48 | (i111111111112 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111111113);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111114 = i3 << 3;
                    int i111111111115 = (i111111111114 & 57344) | (i111111111114 & 896) | 48 | (i111111111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111111115);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i111111111116 = i3 << 3;
                    int i111111111117 = (i111111111116 & 57344) | (i111111111116 & 896) | 48 | (i111111111116 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111111117);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i111111111118 = i3 << 3;
                int i111111111119 = (i111111111118 & 57344) | (i111111111118 & 896) | 48 | (i111111111118 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i111111111119);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111111111110 = i3 << 3;
                int i1111111111111 = (i1111111111110 & 57344) | (i1111111111110 & 896) | 48 | (i1111111111110 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111111111);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
        }
        i3 |= 3072;
        o000o002 = o000o001;
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
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111111112 = i3 << 3;
                    int i1111111111113 = (i1111111111112 & 57344) | (i1111111111112 & 896) | 48 | (i1111111111112 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111111113);
                } else {
                    if (i11 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                    } else {
                        o0000oo0OooO0O0 = o0000oo2;
                    }
                    if (i6 != 0) {
                        o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                    } else {
                        o000o000OooO0O0 = o000o002;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111111111114 = i3 << 3;
                    int i1111111111115 = (i1111111111114 & 57344) | (i1111111111114 & 896) | 48 | (i1111111111114 & 7168) | (i3 & 458752);
                    o00oooo2 = o00oooo3;
                    o0000oo3 = o0000oo0OooO0O0;
                    o000o003 = o000o000OooO0O0;
                    OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111111115);
                }
                str3 = str2;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111111111116 = i3 << 3;
                int i1111111111117 = (i1111111111116 & 57344) | (i1111111111116 & 896) | 48 | (i1111111111116 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111111117);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1111111111118 = i3 << 3;
                int i1111111111119 = (i1111111111118 & 57344) | (i1111111111118 & 896) | 48 | (i1111111111118 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i1111111111119);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
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
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111111110 = i3 << 3;
                int i11111111111111 = (i11111111111110 & 57344) | (i11111111111110 & 896) | 48 | (i11111111111110 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111111111);
            } else {
                if (i11 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
                } else {
                    o0000oo0OooO0O0 = o0000oo2;
                }
                if (i6 != 0) {
                    o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
                } else {
                    o000o000OooO0O0 = o000o002;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111111111112 = i3 << 3;
                int i11111111111113 = (i11111111111112 & 57344) | (i11111111111112 & 896) | 48 | (i11111111111112 & 7168) | (i3 & 458752);
                o00oooo2 = o00oooo3;
                o0000oo3 = o0000oo0OooO0O0;
                o000o003 = o000o000OooO0O0;
                OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111111113);
            }
            str3 = str2;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
        }
        i10 = 196608;
        i3 |= i10;
        if ((374491 & i3) == 74898) {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
            } else {
                o0000oo0OooO0O0 = o0000oo2;
            }
            if (i6 != 0) {
                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
            } else {
                o000o000OooO0O0 = o000o002;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11111111111114 = i3 << 3;
            int i11111111111115 = (i11111111111114 & 57344) | (i11111111111114 & 896) | 48 | (i11111111111114 & 7168) | (i3 & 458752);
            o00oooo2 = o00oooo3;
            o0000oo3 = o0000oo0OooO0O0;
            o000o003 = o000o000OooO0O0;
            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111111115);
        } else {
            if (i11 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                o0000oo0OooO0O0 = o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO00o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o00000OO.f849Oooo0o));
            } else {
                o0000oo0OooO0O0 = o0000oo2;
            }
            if (i6 != 0) {
                o000o000OooO0O0 = o000000.OooO0o(p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1), OoooooO.o00OO0O0.OooO00o.f4179OooOO0, true, o0000O0.f854Oooo0o).OooO0O0(o000000.OooO0o0(null, 3));
            } else {
                o000o000OooO0O0 = o000o002;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11111111111116 = i3 << 3;
            int i11111111111117 = (i11111111111116 & 57344) | (i11111111111116 & 896) | 48 | (i11111111111116 & 7168) | (i3 & 458752);
            o00oooo2 = o00oooo3;
            o0000oo3 = o0000oo0OooO0O0;
            o000o003 = o000o000OooO0O0;
            OooO00o(oo0oOO0.OooO0OO(Boolean.valueOf(z), str2, ooo00oOooOOo, (i3 & 14) | ((i3 >> 9) & 112), 0), OooO0o.f966Oooo0o, o00oooo2, o0000oo3, o000o003, content, ooo00oOooOOo, i11111111111117);
        }
        str3 = str2;
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(z, o00oooo2, o0000oo3, o000o003, str3, content, i, i2));
    }

    @Composable
    public static final EnterExitState OooO0o0(oo00o oo00oVar, Function1 function1, Object obj, p100o000oOoO.oOO00O ooo00o) {
        EnterExitState enterExitState;
        ooo00o.OooO0o0(361571134);
        ooo00o.OooOOoo(-721837481, oo00oVar);
        if (!oo00oVar.OooO0oO()) {
            ooo00o.OooO0o0(-492369756);
            Object objOooO0o = ooo00o.OooO0o();
            if (objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00o.Oooo00o(objOooO0o);
            }
            ooo00o.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            if (((Boolean) function1.invoke(oo00oVar.OooO0O0())).booleanValue()) {
                o0o00oo2.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) o0o00oo2.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
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
}
