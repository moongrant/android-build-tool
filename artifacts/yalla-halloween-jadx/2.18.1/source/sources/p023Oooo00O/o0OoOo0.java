package p023Oooo00O;

import androidx.compose.runtime.Composable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import o0000O0O.OooOOO0;
import o00O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOO0O;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O000o<Float> f1210OooO00o = o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o00O000o<OooOOO0> f1211OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Channel<T> f1212Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ T f1213Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Channel<T> channel, T t) {
            super(0);
            this.f1212Oooo0o = channel;
            this.f1213Oooo0oO = t;
        }

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
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f1212Oooo0o.mo2017trySendJP2dKIU(this.f1213Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", i = {0}, l = {368}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Channel<T> f1214Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ChannelIterator f1215Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f1216Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f1217Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<oo000o<T>> f1218OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Oooo0<T, V> f1219OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function1<T, Unit>> f1220OoooO0O;

        @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ oO0Oo<oo000o<T>> f1221Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f1222Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ T f1223Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Oooo0<T, V> f1224Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ oO0Oo<Function1<T, Unit>> f1225OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(T t, Oooo0<T, V> oooo0, oO0Oo<? extends oo000o<T>> oo0oo, oO0Oo<? extends Function1<? super T, Unit>> oo0oo2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f1223Oooo0oO = t;
                this.f1224Oooo0oo = oooo0;
                this.f1221Oooo = oo0oo;
                this.f1225OoooO00 = oo0oo2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f1223Oooo0oO, this.f1224Oooo0oo, this.f1221Oooo, this.f1225OoooO00, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f1222Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(this.f1223Oooo0oO, this.f1224Oooo0oo.OooO0o0())) {
                        Oooo0<T, V> oooo0 = this.f1224Oooo0oo;
                        T t = this.f1223Oooo0oO;
                        oO0Oo<oo000o<T>> oo0oo = this.f1221Oooo;
                        o00O000o<Float> o00o000o2 = o0OoOo0.f1210OooO00o;
                        oo000o oo000oVar = (oo000o) oo0oo.getValue();
                        this.f1222Oooo0o = 1;
                        if (Oooo0.OooO0OO(oooo0, t, oo000oVar, null, this, 12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                oO0Oo<Function1<T, Unit>> oo0oo2 = this.f1225OoooO00;
                o00O000o<Float> o00o000o3 = o0OoOo0.f1210OooO00o;
                Function1 function1 = (Function1) oo0oo2.getValue();
                if (function1 != null) {
                    function1.invoke(this.f1224Oooo0oo.OooO0o());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Channel<T> channel, Oooo0<T, V> oooo0, oO0Oo<? extends oo000o<T>> oo0oo, oO0Oo<? extends Function1<? super T, Unit>> oo0oo2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f1214Oooo = channel;
            this.f1219OoooO00 = oooo0;
            this.f1218OoooO0 = oo0oo;
            this.f1220OoooO0O = oo0oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f1214Oooo, this.f1219OoooO00, this.f1218OoooO0, this.f1220OoooO0O, continuation);
            oooO0O0.f1217Oooo0oo = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0041 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x004a  */
        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        /* JADX WARN: Code duplicated, block: B:17:0x005c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:12:0x0042). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0041
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1216Oooo0oO
                r3 = 1
                if (r2 == 0) goto L22
                if (r2 != r3) goto L1a
                kotlinx.coroutines.channels.ChannelIterator r2 = r0.f1215Oooo0o
                java.lang.Object r4 = r0.f1217Oooo0oo
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r18)
                r6 = r18
                r5 = r0
                goto L42
            L1a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L22:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r2 = r0.f1217Oooo0oo
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.channels.Channel<T> r4 = r0.f1214Oooo
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L35:
                r5.f1217Oooo0oo = r4
                r5.f1215Oooo0o = r2
                r5.f1216Oooo0oO = r3
                java.lang.Object r6 = r2.hasNext(r5)
                if (r6 != r1) goto L42
                return r1
            L42:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L76
                java.lang.Object r6 = r2.next()
                kotlinx.coroutines.channels.Channel<T> r7 = r5.f1214Oooo
                java.lang.Object r7 = r7.mo2016tryReceivePtdJZtk()
                java.lang.Object r7 = kotlinx.coroutines.channels.ChannelResult.m2027getOrNullimpl(r7)
                if (r7 != 0) goto L5c
                r9 = r6
                goto L5d
            L5c:
                r9 = r7
            L5d:
                r6 = 0
                r14 = 0
                Oooo00O.o0OoOo0$OooO0O0$OooO00o r15 = new Oooo00O.o0OoOo0$OooO0O0$OooO00o
                Oooo00O.Oooo0<T, V> r10 = r5.f1219OoooO00
                o000oOoO.oO0Oo<Oooo00O.oo000o<T>> r11 = r5.f1218OoooO0
                o000oOoO.oO0Oo<kotlin.jvm.functions.Function1<T, kotlin.Unit>> r12 = r5.f1220OoooO0O
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                goto L35
            L76:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Oooo00O.o0OoOo0.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        OooOOO0.OooO00o oooO00o = OooOOO0.f27305Oooo0oO;
        OooOO0O oooOO0O = o0O00000.f1194OooO00o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        f1211OooO0O0 = o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, new OooOOO0(0.1f), 3);
        Intrinsics.checkNotNullParameter(OooOo00.f30416OooO0O0, "<this>");
        OooOo.OooO00o(0.5f, 0.5f);
        Intrinsics.checkNotNullParameter(OooO.f30391OooO0O0, "<this>");
        OooOO0.OooO00o(0.5f, 0.5f);
        Intrinsics.checkNotNullParameter(OooOO0O.f30403OooO0o0, "<this>");
        OooOO0O oooOO0O2 = o0O00000.f1194OooO00o;
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
        o0O00000.OooO00o();
        o0O00000.OooO0O0();
    }

    @Composable
    @NotNull
    public static final oO0Oo OooO00o(float f, @Nullable oo000o oo000oVar, @Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(704104481);
        OooOOO0 oooOOO0 = new OooOOO0(f);
        OooOOO0.OooO00o oooO00o = OooOOO0.f27305Oooo0oO;
        o00OO0O0<Float, o0Oo0oo> o00oo0o1 = oo0O.f1293OooO00o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        oO0Oo oo0ooOooO0OO = OooO0OO(oooOOO0, oo0O.f1295OooO0OO, oo000oVar, null, null, ooo00o, 0, 8);
        ooo00o.Oooo0o0();
        return oo0ooOooO0OO;
    }

    @Composable
    @NotNull
    public static final oO0Oo OooO0O0(float f, @Nullable oo000o oo000oVar, @Nullable oOO00O ooo00o, int i) {
        ooo00o.OooO0o0(1091643291);
        ooo00o.OooO0o0(841393485);
        if (oo000oVar == f1210OooO00o) {
            Float fValueOf = Float.valueOf(0.01f);
            ooo00o.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o.Oooo0oo(fValueOf);
            Object objOooO0o = ooo00o.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.valueOf(0.01f), 3);
                ooo00o.Oooo00o(objOooO0o);
            }
            ooo00o.Oooo0o0();
            oo000oVar = (oo000o) objOooO0o;
        }
        ooo00o.Oooo0o0();
        int i2 = i & 14;
        int i3 = i << 3;
        oO0Oo oo0ooOooO0OO = OooO0OO(Float.valueOf(f), oo0O.OooO0O0(FloatCompanionObject.INSTANCE), oo000oVar, Float.valueOf(0.01f), null, ooo00o, i2 | (i3 & 7168) | (i3 & 57344), 0);
        ooo00o.Oooo0o0();
        return oo0ooOooO0OO;
    }

    @Composable
    @NotNull
    public static final <T, V extends o0O0O00> oO0Oo<T> OooO0OO(T t, @NotNull o00OO0O0<T, V> typeConverter, @Nullable oo000o<T> oo000oVar, @Nullable T t2, @Nullable Function1<? super T, Unit> function1, @Nullable oOO00O ooo00o, int i, int i2) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        ooo00o.OooO0o0(-846382129);
        if ((i2 & 4) != 0) {
            ooo00o.OooO0o0(-492369756);
            Object objOooO0o = ooo00o.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, t2, 3);
                ooo00o.Oooo00o(objOooO0o);
            }
            ooo00o.Oooo0o0();
            oo000oVar = (oo000o) objOooO0o;
        }
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o2 = ooo00o.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = new Oooo0(t, typeConverter, null);
            ooo00o.Oooo00o(objOooO0o2);
        }
        ooo00o.Oooo0o0();
        Oooo0 oooo0 = (Oooo0) objOooO0o2;
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(function1, ooo00o);
        oO0Oo oo0ooOooO0o2 = o0OOO00.OooO0o(oo000oVar, ooo00o);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o3 = ooo00o.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = ChannelKt.Channel$default(-1, null, null, 6, null);
            ooo00o.Oooo00o(objOooO0o3);
        }
        ooo00o.Oooo0o0();
        Channel channel = (Channel) objOooO0o3;
        o00Oo00.OooO0oO(new OooO00o(channel, t), ooo00o);
        o00Oo00.OooO0o0(channel, new OooO0O0(channel, oooo0, oo0ooOooO0o2, oo0ooOooO0o, null), ooo00o);
        o0ooOOo<T, V> o0ooooo2 = oooo0.f1004OooO0OO;
        ooo00o.Oooo0o0();
        return o0ooooo2;
    }
}
