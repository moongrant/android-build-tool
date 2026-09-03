package p023Oooo00O;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o<?, ?>> f1089OooO00o = new o000OOo<>(new OooO00o[16]);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1090OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f1091OooO0OO = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1092OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);

    public final class OooO00o<T, V extends o0O0O00> implements oO0Oo<T> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NotNull
        public oo000o<T> f1093Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public T f1094Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public T f1095Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NotNull
        public final o00OO0O0<T, V> f1096Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public boolean f1097OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @NotNull
        public o00O00o0<T, V> f1098OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1099OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public boolean f1100OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public long f1101OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ o000Oo0 f1102o000oOoO;

        public OooO00o(o000Oo0 o000oo1, T t, @NotNull T t2, @NotNull o00OO0O0<T, V> typeConverter, oo000o<T> animationSpec) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.f1102o000oOoO = o000oo1;
            this.f1094Oooo0o = t;
            this.f1095Oooo0oO = t2;
            this.f1096Oooo0oo = typeConverter;
            this.f1093Oooo = animationSpec;
            this.f1099OoooO00 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(t);
            this.f1098OoooO0 = new o00O00o0<>(this.f1093Oooo, typeConverter, this.f1094Oooo0o, this.f1095Oooo0oO, null);
        }

        @Override // p100o000oOoO.oO0Oo
        public final T getValue() {
            return this.f1099OoooO00.getValue();
        }
    }

    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {147, 169}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Ref.FloatRef f1104Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f1105Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f1106Oooo0oo;

        public static final class OooO00o extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o000Oo0 f1107Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f1108Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f1109Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o000Oo0 o000oo1, Ref.FloatRef floatRef, CoroutineScope coroutineScope) {
                super(1);
                this.f1107Oooo0o = o000oo1;
                this.f1108Oooo0oO = floatRef;
                this.f1109Oooo0oo = coroutineScope;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0033  */
            /* JADX WARN: Code duplicated, block: B:9:0x0029  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l) {
                o000OOo<OooO00o<?, ?>> o000ooo2;
                int i;
                OooO00o<?, ?>[] oooO00oArr;
                int i2;
                boolean z;
                long jLongValue = l.longValue();
                int i3 = 0;
                if (this.f1107Oooo0o.f1091OooO0OO == Long.MIN_VALUE) {
                    o000Oo0 o000oo1 = this.f1107Oooo0o;
                    o000oo1.f1091OooO0OO = jLongValue;
                    o000ooo2 = o000oo1.f1089OooO00o;
                    i = o000ooo2.f3664Oooo0oo;
                    if (i > 0) {
                        oooO00oArr = o000ooo2.f3662Oooo0o;
                        i2 = 0;
                        do {
                            oooO00oArr[i2].f1097OoooO = true;
                            i2++;
                        } while (i2 < i);
                    }
                    this.f1108Oooo0oO.element = o00O00O.OooO0o(this.f1109Oooo0oo.getCoroutineContext());
                } else {
                    if (!(this.f1108Oooo0oO.element == o00O00O.OooO0o(this.f1109Oooo0oo.getCoroutineContext()))) {
                        o000Oo0 o000oo2 = this.f1107Oooo0o;
                        o000oo2.f1091OooO0OO = jLongValue;
                        o000ooo2 = o000oo2.f1089OooO00o;
                        i = o000ooo2.f3664Oooo0oo;
                        if (i > 0) {
                            oooO00oArr = o000ooo2.f3662Oooo0o;
                            i2 = 0;
                            do {
                                oooO00oArr[i2].f1097OoooO = true;
                                i2++;
                            } while (i2 < i);
                        }
                        this.f1108Oooo0oO.element = o00O00O.OooO0o(this.f1109Oooo0oo.getCoroutineContext());
                    }
                }
                float f = this.f1108Oooo0oO.element;
                if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    o000OOo<OooO00o<?, ?>> o000ooo3 = this.f1107Oooo0o.f1089OooO00o;
                    int i4 = o000ooo3.f3664Oooo0oo;
                    if (i4 > 0) {
                        OooO00o<?, ?>[] oooO00oArr2 = o000ooo3.f3662Oooo0o;
                        do {
                            OooO00o<?, ?> oooO00o = oooO00oArr2[i3];
                            oooO00o.f1099OoooO00.setValue(oooO00o.f1098OoooO0.f1155OooO0Oo);
                            oooO00o.f1097OoooO = true;
                            i3++;
                        } while (i3 < i4);
                    }
                } else {
                    o000Oo0 o000oo3 = this.f1107Oooo0o;
                    long j = (long) ((jLongValue - o000oo3.f1091OooO0OO) / f);
                    o000OOo<OooO00o<?, ?>> o000ooo4 = o000oo3.f1089OooO00o;
                    int i5 = o000ooo4.f3664Oooo0oo;
                    if (i5 > 0) {
                        OooO00o<?, ?>[] oooO00oArr3 = o000ooo4.f3662Oooo0o;
                        int i6 = 0;
                        z = true;
                        do {
                            OooO00o<?, ?> oooO00o2 = oooO00oArr3[i6];
                            if (!oooO00o2.f1100OoooO0O) {
                                oooO00o2.f1102o000oOoO.f1090OooO0O0.setValue(Boolean.FALSE);
                                if (oooO00o2.f1097OoooO) {
                                    oooO00o2.f1097OoooO = false;
                                    oooO00o2.f1101OoooOO0 = j;
                                }
                                long j2 = j - oooO00o2.f1101OoooOO0;
                                oooO00o2.f1099OoooO00.setValue(oooO00o2.f1098OoooO0.OooO0o(j2));
                                oooO00o2.f1100OoooO0O = oooO00o2.f1098OoooO0.OooO0o0(j2);
                            }
                            if (!oooO00o2.f1100OoooO0O) {
                                z = false;
                            }
                            i6++;
                        } while (i6 < i5);
                    } else {
                        z = true;
                    }
                    o000oo3.f1092OooO0Oo.setValue(Boolean.valueOf(!z));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: Oooo00O.o000Oo0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0009OooO0O0 extends Lambda implements Function0<Float> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f1110Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0009OooO0O0(CoroutineScope coroutineScope) {
                super(0);
                this.f1110Oooo0o = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(o00O00O.OooO0o(this.f1110Oooo0o.getCoroutineContext()));
            }
        }

        @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ float f1111Oooo0o;

            public OooO0OO(Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(continuation);
                oooO0OO.f1111Oooo0o = ((Number) obj).floatValue();
                return oooO0OO;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Float f, Continuation<? super Boolean> continuation) {
                return ((OooO0OO) create(Float.valueOf(f.floatValue()), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f1111Oooo0o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = o000Oo0.this.new OooO0O0(continuation);
            oooO0O0.f1106Oooo0oo = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0050 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0058  */
        /* JADX WARN: Code duplicated, block: B:18:0x005a  */
        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0078 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:12:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x0050
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f1105Oooo0oO
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.jvm.internal.Ref$FloatRef r1 = r8.f1104Oooo0o
                java.lang.Object r4 = r8.f1106Oooo0oo
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r9)
                goto L3c
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                kotlin.jvm.internal.Ref$FloatRef r1 = r8.f1104Oooo0o
                java.lang.Object r4 = r8.f1106Oooo0oo
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r8
                goto L51
            L2b:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f1106Oooo0oo
                r4 = r9
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r9 = 1065353216(0x3f800000, float:1.0)
                r1.element = r9
            L3c:
                r9 = r8
            L3d:
                Oooo00O.o000Oo0$OooO0O0$OooO00o r5 = new Oooo00O.o000Oo0$OooO0O0$OooO00o
                Oooo00O.o000Oo0 r6 = p023Oooo00O.o000Oo0.this
                r5.<init>(r6, r1, r4)
                r9.f1106Oooo0oo = r4
                r9.f1104Oooo0o = r1
                r9.f1105Oooo0oO = r3
                java.lang.Object r5 = p023Oooo00O.o000O000.OooO00o(r5, r9)
                if (r5 != r0) goto L51
                return r0
            L51:
                float r5 = r1.element
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L5a
                r5 = 1
                goto L5b
            L5a:
                r5 = 0
            L5b:
                if (r5 == 0) goto L3d
                Oooo00O.o000Oo0$OooO0O0$OooO0O0 r5 = new Oooo00O.o000Oo0$OooO0O0$OooO0O0
                r5.<init>(r4)
                kotlinx.coroutines.flow.Flow r5 = p100o000oOoO.o0OOO00.OooO0oO(r5)
                Oooo00O.o000Oo0$OooO0O0$OooO0OO r6 = new Oooo00O.o000Oo0$OooO0O0$OooO0OO
                r7 = 0
                r6.<init>(r7)
                r9.f1106Oooo0oo = r4
                r9.f1104Oooo0o = r1
                r9.f1105Oooo0oO = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.first(r5, r6, r9)
                if (r5 != r0) goto L3d
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Oooo00O.o000Oo0.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f1113Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f1113Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o000Oo0.this.OooO00o(ooo00o, this.f1113Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-318043801);
        if (((Boolean) this.f1092OooO0Oo.getValue()).booleanValue() || ((Boolean) this.f1090OooO0O0.getValue()).booleanValue()) {
            o00Oo00.OooO0o0(this, new OooO0O0(null), ooo00oOooOOo);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(i));
    }
}
