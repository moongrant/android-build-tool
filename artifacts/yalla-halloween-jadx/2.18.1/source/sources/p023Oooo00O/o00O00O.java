package p023Oooo00O;

import com.qiniu.android.collect.ReportItem;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00Oo00;
import p100o000oOoO.o0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O {

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class OooO<R> extends Lambda implements Function1<Long, R> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f1130Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.f1130Oooo0o = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Long l) {
            return this.f1130Oooo0o.invoke(Long.valueOf(l.longValue() / 1));
        }
    }

    @DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {233, 272}, m = "animate", n = {"$this$animate", "animation", ReportItem.LogTypeBlock, "lateInitScope", "$this$animate", "animation", ReportItem.LogTypeBlock, "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class OooO00o<T, V extends o0O0O00> extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Ref.ObjectRef f1131Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o0ooOOo f1132Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o00O0O f1133Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Function1 f1134Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f1135OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f1136OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1136OoooO00 = obj;
            this.f1135OoooO0 |= Integer.MIN_VALUE;
            return o00O00O.OooO00o(null, null, 0L, null, this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: Incorrect field signature: TV; */
        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f1137Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<o00Ooo<T, V>> f1138Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ T f1139Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O<T, V> f1140Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ float f1141OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo<T, V> f1142OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<o00Ooo<T, V>, Unit> f1143OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<LOooo00O/o00Ooo<TT;TV;>;>;TT;LOooo00O/o00O0O<TT;TV;>;TV;LOooo00O/o0ooOOo<TT;TV;>;FLkotlin/jvm/functions/Function1<-LOooo00O/o00Ooo<TT;TV;>;Lkotlin/Unit;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Ref.ObjectRef objectRef, Object obj, o00O0O o00o0o2, o0O0O00 o0o0o00, o0ooOOo o0ooooo2, float f, Function1 function1) {
            super(1);
            this.f1138Oooo0o = objectRef;
            this.f1139Oooo0oO = obj;
            this.f1140Oooo0oo = o00o0o2;
            this.f1137Oooo = o0o0o00;
            this.f1142OoooO00 = o0ooooo2;
            this.f1141OoooO0 = f;
            this.f1143OoooO0O = function1;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [Oooo00O.o00Ooo, T] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            Ref.ObjectRef<o00Ooo<T, V>> objectRef = this.f1138Oooo0o;
            ?? o00ooo2 = new o00Ooo(this.f1139Oooo0oO, this.f1140Oooo0oo.OooO0OO(), this.f1137Oooo, jLongValue, this.f1140Oooo0oo.OooO0oO(), jLongValue, new oOO00O(this.f1142OoooO00));
            o00O00O.OooO0o0(o00ooo2, jLongValue, this.f1141OoooO0, this.f1140Oooo0oo, this.f1142OoooO00, this.f1143OoooO0O);
            objectRef.element = o00ooo2;
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo<T, V> f1144Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0ooOOo<T, V> o0ooooo2) {
            super(0);
            this.f1144Oooo0o = o0ooooo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f1144Oooo0o.f1240OoooO0 = false;
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo<T, V> f1145Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<o00Ooo<T, V>> f1146Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ float f1147Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O<T, V> f1148Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<o00Ooo<T, V>, Unit> f1149OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Ref.ObjectRef<o00Ooo<T, V>> objectRef, float f, o00O0O<T, V> o00o0o2, o0ooOOo<T, V> o0ooooo2, Function1<? super o00Ooo<T, V>, Unit> function1) {
            super(1);
            this.f1146Oooo0o = objectRef;
            this.f1147Oooo0oO = f;
            this.f1148Oooo0oo = o00o0o2;
            this.f1145Oooo = o0ooooo2;
            this.f1149OoooO00 = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            T t = this.f1146Oooo0o.element;
            Intrinsics.checkNotNull(t);
            o00O00O.OooO0o0((o00Ooo) t, jLongValue, this.f1147Oooo0oO, this.f1148Oooo0oo, this.f1145Oooo, this.f1149OoooO00);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r7v0, types: [Oooo00O.o00Ooo, T] */
    @Nullable
    public static final <T, V extends o0O0O00> Object OooO00o(@NotNull o0ooOOo<T, V> o0ooooo2, @NotNull o00O0O<T, V> o00o0o2, long j, @NotNull Function1<? super o00Ooo<T, V>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        Ref.ObjectRef objectRef;
        o0ooOOo<T, V> o0ooooo3;
        Function1<? super o00Ooo<T, V>, Unit> function2;
        Function1<? super o00Ooo<T, V>, Unit> function3;
        Ref.ObjectRef objectRef2;
        o00Ooo o00ooo2;
        o00Ooo o00ooo3;
        OooO0o oooO0o;
        o00O0O<T, V> o00o0o3 = o00o0o2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f1135OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f1135OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        OooO00o oooO00o2 = oooO00o;
        Object obj = oooO00o2.f1136OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o2.f1135OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            T tOooO0o = o00o0o3.OooO0o(0L);
            o0O0O00 o0o0o00OooO0Oo = o00o0o3.OooO0Oo(0L);
            objectRef = new Ref.ObjectRef();
            try {
                if (j == Long.MIN_VALUE) {
                    OooO0O0 oooO0O0 = new OooO0O0(objectRef, tOooO0o, o00o0o2, o0o0o00OooO0Oo, o0ooooo2, OooO0o(oooO00o2.get$context()), function1);
                    oooO00o2.f1132Oooo0o = o0ooooo2;
                    oooO00o2.f1133Oooo0oO = o00o0o3;
                    function2 = function1;
                    oooO00o2.f1134Oooo0oo = function2;
                    oooO00o2.f1131Oooo = objectRef;
                    oooO00o2.f1135OoooO0 = 1;
                    if (OooO0Oo(o00o0o3, oooO0O0, oooO00o2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    function2 = function1;
                    try {
                        ?? r7 = (T) new o00Ooo(tOooO0o, o00o0o2.OooO0OO(), o0o0o00OooO0Oo, j, o00o0o2.OooO0oO(), j, new OooO0OO(o0ooooo2));
                        objectRef = objectRef;
                        OooO0o0(r7, j, OooO0o(oooO00o2.get$context()), o00o0o2, o0ooooo2, function1);
                        objectRef.element = r7;
                    } catch (CancellationException e) {
                        e = e;
                        objectRef = objectRef;
                        o0ooooo3 = o0ooooo2;
                        o00ooo2 = (o00Ooo) objectRef.element;
                        if (o00ooo2 != null) {
                            o00ooo2.OooO0o0();
                        }
                        o00ooo3 = (o00Ooo) objectRef.element;
                        if (o00ooo3 == null && o00ooo3.f1188OooO0oO == o0ooooo3.f1236Oooo) {
                            o0ooooo3.f1240OoooO0 = false;
                        }
                        throw e;
                    }
                }
                function3 = function2;
                o0ooooo3 = o0ooooo2;
                objectRef2 = objectRef;
            } catch (CancellationException e2) {
                e = e2;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef objectRef3 = oooO00o2.f1131Oooo;
            function3 = oooO00o2.f1134Oooo0oo;
            o00O0O<T, V> o00o0o4 = oooO00o2.f1133Oooo0oO;
            o0ooooo3 = oooO00o2.f1132Oooo0o;
            objectRef2 = objectRef3;
            try {
                ResultKt.throwOnFailure(obj);
                o00o0o3 = o00o0o4;
            } catch (CancellationException e3) {
                e = e3;
                objectRef = objectRef2;
                o00ooo2 = (o00Ooo) objectRef.element;
                if (o00ooo2 != null) {
                    o00ooo2.OooO0o0();
                }
                o00ooo3 = (o00Ooo) objectRef.element;
                if (o00ooo3 == null && o00ooo3.f1188OooO0oO == o0ooooo3.f1236Oooo) {
                    o0ooooo3.f1240OoooO0 = false;
                }
                throw e;
            }
        }
        do {
            T t = objectRef2.element;
            Intrinsics.checkNotNull(t);
            if (!((o00Ooo) t).OooO0Oo()) {
                return Unit.INSTANCE;
            }
            oooO0o = new OooO0o(objectRef2, OooO0o(oooO00o2.get$context()), o00o0o3, o0ooooo3, function3);
            oooO00o2.f1132Oooo0o = o0ooooo3;
            oooO00o2.f1133Oooo0oO = o00o0o3;
            oooO00o2.f1134Oooo0oo = function3;
            oooO00o2.f1131Oooo = objectRef2;
            oooO00o2.f1135OoooO0 = 2;
        } while (OooO0Oo(o00o0o3, oooO0o, oooO00o2) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static Object OooO0O0(o0ooOOo o0ooooo2, o00000OO o00000oo2, Function1 function1, Continuation continuation) {
        Object objOooO00o = OooO00o(o0ooooo2, new o00000O(o00000oo2, o0ooooo2.f1237Oooo0o, o0ooooo2.getValue(), o0ooooo2.f1239Oooo0oo), Long.MIN_VALUE, function1, continuation);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    public static Object OooO0OO(o0ooOOo o0ooooo2, Object obj, oo000o oo000oVar, boolean z, Function1 function1, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            oo000oVar = o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7);
        }
        oo000o oo000oVar2 = oo000oVar;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = o00O00OO.f1150Oooo0o;
        }
        Object objOooO00o = OooO00o(o0ooooo2, new o00O00o0(oo000oVar2, o0ooooo2.f1237Oooo0o, o0ooooo2.getValue(), obj, o0ooooo2.f1239Oooo0oo), z ? o0ooooo2.f1236Oooo : Long.MIN_VALUE, function1, continuation);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    public static final <R, T, V extends o0O0O00> Object OooO0Oo(o00O0O<T, V> o00o0o2, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return o00o0o2.OooO00o() ? o000O000.OooO00o(function1, continuation) : o0O00.OooO0O0(new OooO(function1), continuation);
    }

    public static final float OooO0o(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        int i = o00Oo00.f4199OooO0O0;
        o00Oo00 o00oo00 = (o00Oo00) coroutineContext.get(o00Oo00.OooO00o.f4200Oooo0o);
        float fOooO0O0 = o00oo00 != null ? o00oo00.OooO0O0() : 1.0f;
        if (fOooO0O0 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return fOooO0O0;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends o0O0O00> void OooO0o0(o00Ooo<T, V> o00ooo2, long j, float f, o00O0O<T, V> o00o0o2, o0ooOOo<T, V> o0ooooo2, Function1<? super o00Ooo<T, V>, Unit> function1) {
        long jOooO0O0 = (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)) == 0 ? o00o0o2.OooO0O0() : (long) ((j - o00ooo2.f1184OooO0OO) / f);
        o00ooo2.f1188OooO0oO = j;
        o00ooo2.f1187OooO0o0.setValue(o00o0o2.OooO0o(jOooO0O0));
        V v = (V) o00o0o2.OooO0Oo(jOooO0O0);
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        o00ooo2.f1186OooO0o = v;
        if (o00o0o2.OooO0o0(jOooO0O0)) {
            o00ooo2.f1189OooO0oo = o00ooo2.f1188OooO0oO;
            o00ooo2.OooO0o0();
        }
        OooO0oO(o00ooo2, o0ooooo2);
        function1.invoke(o00ooo2);
    }

    public static final <T, V extends o0O0O00> void OooO0oO(@NotNull o00Ooo<T, V> o00ooo2, @NotNull o0ooOOo<T, V> state) {
        Intrinsics.checkNotNullParameter(o00ooo2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        state.OooO0oo(o00ooo2.OooO0O0());
        V v = state.f1239Oooo0oo;
        V source = o00ooo2.f1186OooO0o;
        Intrinsics.checkNotNullParameter(v, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            v.OooO0o0(i, source.OooO00o(i));
        }
        state.f1241OoooO00 = o00ooo2.f1189OooO0oo;
        state.f1236Oooo = o00ooo2.f1188OooO0oO;
        state.f1240OoooO0 = o00ooo2.OooO0Oo();
    }
}
