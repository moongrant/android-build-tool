package p023Oooo00O;

import androidx.compose.animation.core.InternalAnimationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p047Oooooo0.o0o0Oo;
import p100o000oOoO.o00OOO00;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class oo00o<S> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o00OO0OO<oo00o<?>> f1243OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O<S> f1244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f1245OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1246OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1247OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1248OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1249OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1250OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00OO0OO<oo00o<S>.OooO0o<?, ?>> f1251OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1252OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f1253OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f1254OooOO0o;

    @DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", i = {0}, l = {434}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1255Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1256Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oo00o<S> f1257Oooo0oo;

        public static final class OooO00o extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ oo00o<S> f1258Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ float f1259Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(oo00o<S> oo00oVar, float f) {
                super(1);
                this.f1258Oooo0o = oo00oVar;
                this.f1259Oooo0oO = f;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l) {
                long jLongValue = l.longValue();
                if (!this.f1258Oooo0o.OooO0oO()) {
                    this.f1258Oooo0o.OooO0oo(jLongValue / 1, this.f1259Oooo0oO);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(oo00o<S> oo00oVar, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f1257Oooo0oo = oo00oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f1257Oooo0oo, continuation);
            oooO.f1256Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            OooO00o oooO00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1255Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f1256Oooo0oO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f1256Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            do {
                oooO00o = new OooO00o(this.f1257Oooo0oo, o00O00O.OooO0o(coroutineScope.getCoroutineContext()));
                this.f1256Oooo0oO = coroutineScope;
                this.f1255Oooo0o = 1;
            } while (o0O00.OooO0O0(oooO00o, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    @InternalAnimationApi
    public final class OooO00o<T, V extends o0O0O00> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00OO0O0<T, V> f1260OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final String f1261OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public oo00o<S>.C0010OooO00o<T, V>.OooO00o<T, V> f1262OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo00o<S> f1263OooO0Oo;

        /* JADX INFO: renamed from: Oooo00O.oo00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C0010OooO00o<T, V extends o0O0O00> implements oO0Oo<T> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ oo00o<S>.OooO00o<T, V> f1264Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            @NotNull
            public final oo00o<S>.OooO0o<T, V> f1265Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            @NotNull
            public Function1<? super OooO0O0<S>, ? extends o0000O0O<T>> f1266Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            @NotNull
            public Function1<? super S, ? extends T> f1267Oooo0oo;

            public C0010OooO00o(@NotNull OooO00o oooO00o, @NotNull oo00o<S>.OooO0o<T, V> animation, @NotNull Function1<? super OooO0O0<S>, ? extends o0000O0O<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
                Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
                this.f1264Oooo = oooO00o;
                this.f1265Oooo0o = animation;
                this.f1266Oooo0oO = transitionSpec;
                this.f1267Oooo0oo = targetValueByState;
            }

            public final void OooO00o(@NotNull OooO0O0<S> segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                T tInvoke = this.f1267Oooo0oo.invoke(segment.OooO0OO());
                if (!this.f1264Oooo.f1263OooO0Oo.OooO0oO()) {
                    this.f1265Oooo0o.OooOOoo(tInvoke, this.f1266Oooo0oO.invoke(segment));
                } else {
                    this.f1265Oooo0o.OooOOo(this.f1267Oooo0oo.invoke(segment.OooO00o()), tInvoke, this.f1266Oooo0oO.invoke(segment));
                }
            }

            @Override // p100o000oOoO.oO0Oo
            public final T getValue() {
                OooO00o(this.f1264Oooo.f1263OooO0Oo.OooO0Oo());
                return this.f1265Oooo0o.getValue();
            }
        }

        public OooO00o(@NotNull oo00o oo00oVar, @NotNull o00OO0O0<T, V> typeConverter, String label) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f1263OooO0Oo = oo00oVar;
            this.f1260OooO00o = typeConverter;
            this.f1261OooO0O0 = label;
        }

        @NotNull
        public final oO0Oo<T> OooO00o(@NotNull Function1<? super OooO0O0<S>, ? extends o0000O0O<T>> transitionSpec, @NotNull Function1<? super S, ? extends T> targetValueByState) {
            Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
            Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
            C0010OooO00o c0010OooO00o = this.f1262OooO0OO;
            if (c0010OooO00o == null) {
                oo00o<S> oo00oVar = this.f1263OooO0Oo;
                c0010OooO00o = new C0010OooO00o(this, new OooO0o(oo00oVar, targetValueByState.invoke(oo00oVar.OooO0O0()), o0OOO0o.OooO0OO(this.f1260OooO00o, targetValueByState.invoke(this.f1263OooO0Oo.OooO0O0())), this.f1260OooO00o, this.f1261OooO0O0), transitionSpec, targetValueByState);
                oo00o<S> oo00oVar2 = this.f1263OooO0Oo;
                this.f1262OooO0OO = c0010OooO00o;
                oo00o<S>.OooO0o<T, V> animation = c0010OooO00o.f1265Oooo0o;
                Objects.requireNonNull(oo00oVar2);
                Intrinsics.checkNotNullParameter(animation, "animation");
                oo00oVar2.f1251OooO0oo.add(animation);
            }
            oo00o<S> oo00oVar3 = this.f1263OooO0Oo;
            Intrinsics.checkNotNullParameter(targetValueByState, "<set-?>");
            c0010OooO00o.f1267Oooo0oo = targetValueByState;
            Intrinsics.checkNotNullParameter(transitionSpec, "<set-?>");
            c0010OooO00o.f1266Oooo0oO = transitionSpec;
            c0010OooO00o.OooO00o(oo00oVar3.OooO0Oo());
            return c0010OooO00o;
        }
    }

    public interface OooO0O0<S> {
        S OooO00o();

        boolean OooO0O0(S s, S s2);

        S OooO0OO();
    }

    public static final class OooO0OO<S> implements OooO0O0<S> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final S f1268OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final S f1269OooO0O0;

        public OooO0OO(S s, S s2) {
            this.f1268OooO00o = s;
            this.f1269OooO0O0 = s2;
        }

        @Override // Oooo00O.oo00o.OooO0O0
        public final S OooO00o() {
            return this.f1268OooO00o;
        }

        @Override // Oooo00O.oo00o.OooO0O0
        public final /* synthetic */ boolean OooO0O0(Object obj, Object obj2) {
            return o00O0.OooO00o(this, obj, obj2);
        }

        @Override // Oooo00O.oo00o.OooO0O0
        public final S OooO0OO() {
            return this.f1269OooO0O0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO0O0) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (Intrinsics.areEqual(this.f1268OooO00o, oooO0O0.OooO00o()) && Intrinsics.areEqual(this.f1269OooO0O0, oooO0O0.OooO0OO())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            S s = this.f1268OooO00o;
            int iHashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.f1269OooO0O0;
            return iHashCode + (s2 != null ? s2.hashCode() : 0);
        }
    }

    @Stable
    public final class OooO0o<T, V extends o0O0O00> implements oO0Oo<T> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1270Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final o00OO0O0<T, V> f1271Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1272Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1273Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1274OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1275OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1276OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f1277OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @NotNull
        public V f1278OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ oo00o<S> f1279OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        @NotNull
        public final o0000O0O<T> f1280o000oOoO;

        public OooO0o(oo00o oo00oVar, @NotNull T t, @NotNull V initialVelocityVector, @NotNull o00OO0O0<T, V> typeConverter, String label) {
            Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f1279OoooOOO = oo00oVar;
            this.f1271Oooo0o = typeConverter;
            this.f1272Oooo0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(t);
            T tInvoke = null;
            this.f1273Oooo0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7));
            this.f1270Oooo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o00O00o0(OooO0oo(), typeConverter, t, OooOOO(), initialVelocityVector));
            this.f1276OoooO00 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
            this.f1275OoooO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0L);
            this.f1277OoooO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
            this.f1274OoooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(t);
            this.f1278OoooOO0 = initialVelocityVector;
            Float f = o0O00000.f1195OooO0O0.get(typeConverter);
            if (f != null) {
                float fFloatValue = f.floatValue();
                V vInvoke = typeConverter.OooO00o().invoke(t);
                int iOooO0O0 = vInvoke.OooO0O0();
                for (int i = 0; i < iOooO0O0; i++) {
                    vInvoke.OooO0o0(i, fFloatValue);
                }
                tInvoke = this.f1271Oooo0o.OooO0O0().invoke(vInvoke);
            }
            this.f1280o000oOoO = o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, tInvoke, 3);
        }

        public static void OooOOo0(OooO0o oooO0o, Object obj, boolean z, int i) {
            if ((i & 1) != 0) {
                obj = oooO0o.getValue();
            }
            Object obj2 = obj;
            if ((i & 2) != 0) {
                z = false;
            }
            o0000O0O<T> o0000o0oOooO0oo = (!z || (oooO0o.OooO0oo() instanceof o00O000o)) ? oooO0o.OooO0oo() : oooO0o.f1280o000oOoO;
            oooO0o.f1270Oooo.setValue(new o00O00o0(o0000o0oOooO0oo, oooO0o.f1271Oooo0o, obj2, oooO0o.OooOOO(), oooO0o.f1278OoooOO0));
            oo00o<S> oo00oVar = oooO0o.f1279OoooOOO;
            oo00oVar.OooOOO0(true);
            if (!oo00oVar.OooO0oO()) {
                return;
            }
            long jMax = 0;
            ListIterator<oo00o<S>.OooO0o<?, ?>> listIterator = oo00oVar.f1251OooO0oo.listIterator();
            while (true) {
                o0o0Oo o0o0oo = (o0o0Oo) listIterator;
                if (!o0o0oo.hasNext()) {
                    oo00oVar.OooOOO0(false);
                    return;
                } else {
                    OooO0o oooO0o2 = (OooO0o) o0o0oo.next();
                    jMax = Math.max(jMax, oooO0o2.OooO00o().f1159OooO0oo);
                    oooO0o2.OooOOOo(oo00oVar.f1253OooOO0O);
                }
            }
        }

        @NotNull
        public final o00O00o0<T, V> OooO00o() {
            return (o00O00o0) this.f1270Oooo.getValue();
        }

        @NotNull
        public final o0000O0O<T> OooO0oo() {
            return (o0000O0O) this.f1273Oooo0oo.getValue();
        }

        public final T OooOOO() {
            return this.f1272Oooo0oO.getValue();
        }

        public final boolean OooOOOO() {
            return ((Boolean) this.f1276OoooO00.getValue()).booleanValue();
        }

        public final void OooOOOo(long j) {
            this.f1274OoooO.setValue(OooO00o().OooO0o(j));
            this.f1278OoooOO0 = (V) OooO00o().OooO0Oo(j);
        }

        public final void OooOOo(T t, T t2, @NotNull o0000O0O<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.f1272Oooo0oO.setValue(t2);
            this.f1273Oooo0oo.setValue(animationSpec);
            if (Intrinsics.areEqual(OooO00o().f1154OooO0OO, t) && Intrinsics.areEqual(OooO00o().f1155OooO0Oo, t2)) {
                return;
            }
            OooOOo0(this, t, false, 2);
        }

        public final void OooOOoo(T t, @NotNull o0000O0O<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            if (!Intrinsics.areEqual(OooOOO(), t) || ((Boolean) this.f1277OoooO0O.getValue()).booleanValue()) {
                this.f1272Oooo0oO.setValue(t);
                this.f1273Oooo0oo.setValue(animationSpec);
                OooOOo0(this, null, !OooOOOO(), 1);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f1276OoooO00;
                Boolean bool = Boolean.FALSE;
                parcelableSnapshotMutableState.setValue(bool);
                this.f1275OoooO0.setValue(Long.valueOf(this.f1279OoooOOO.OooO0OO()));
                this.f1277OoooO0O.setValue(bool);
            }
        }

        @Override // p100o000oOoO.oO0Oo
        public final T getValue() {
            return this.f1274OoooO.getValue();
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo00o<S> f1281Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ S f1282Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f1283Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(oo00o<S> oo00oVar, S s, int i) {
            super(2);
            this.f1281Oooo0o = oo00oVar;
            this.f1282Oooo0oO = s;
            this.f1283Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            this.f1281Oooo0o.OooO00o(this.f1282Oooo0oO, ooo00o, this.f1283Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Long> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo00o<S> f1284Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(oo00o<S> oo00oVar) {
            super(0);
            this.f1284Oooo0o = oo00oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            ListIterator<oo00o<S>.OooO0o<?, ?>> listIterator = this.f1284Oooo0o.f1251OooO0oo.listIterator();
            long jMax = 0;
            while (true) {
                o0o0Oo o0o0oo = (o0o0Oo) listIterator;
                if (!o0o0oo.hasNext()) {
                    break;
                }
                jMax = Math.max(jMax, ((OooO0o) o0o0oo.next()).OooO00o().f1159OooO0oo);
            }
            ListIterator<oo00o<?>> listIterator2 = this.f1284Oooo0o.f1243OooO.listIterator();
            while (true) {
                o0o0Oo o0o0oo2 = (o0o0Oo) listIterator2;
                if (!o0o0oo2.hasNext()) {
                    return Long.valueOf(jMax);
                }
                jMax = Math.max(jMax, ((Number) ((oo00o) o0o0oo2.next()).f1254OooOO0o.getValue()).longValue());
            }
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo00o<S> f1285Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ S f1286Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f1287Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(oo00o<S> oo00oVar, S s, int i) {
            super(2);
            this.f1285Oooo0o = oo00oVar;
            this.f1286Oooo0oO = s;
            this.f1287Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            this.f1285Oooo0o.OooOOO(this.f1286Oooo0oO, ooo00o, this.f1287Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @PublishedApi
    public oo00o(@NotNull o000O<S> transitionState, @Nullable String str) {
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        this.f1244OooO00o = transitionState;
        this.f1245OooO0O0 = str;
        this.f1246OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(OooO0O0());
        this.f1247OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new OooO0OO(OooO0O0(), OooO0O0()));
        this.f1249OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0L);
        this.f1248OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Long.MIN_VALUE);
        this.f1250OooO0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
        this.f1251OooO0oo = new o00OO0OO<>();
        this.f1243OooO = new o00OO0OO<>();
        this.f1252OooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
        this.f1254OooOO0o = (o00OOO00) o0OOO00.OooO0O0(new OooOO0O(this));
    }

    public final void OooO() {
        OooOO0o(Long.MIN_VALUE);
        OooOO0O(OooO0o());
        this.f1249OooO0o0.setValue(0L);
        this.f1244OooO00o.OooO00o(false);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public final void OooO00o(S s, @Nullable oOO00O ooo00o, int i) {
        int i2;
        boolean zOooo0oo;
        Object objOooO0o;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1493585151);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else if (!OooO0oO()) {
            OooOOO(s, ooo00oOooOOo, (i2 & 112) | (i2 & 14));
            if (Intrinsics.areEqual(s, OooO0O0())) {
                if ((OooO0o0() != Long.MIN_VALUE) || ((Boolean) this.f1250OooO0oO.getValue()).booleanValue()) {
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(this);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO(this, null);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO(this, null);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00Oo00.OooO0o0(this, (Function2) objOooO0o, ooo00oOooOOo);
                }
            } else {
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(this);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new OooO(this, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o00Oo00.OooO0o0(this, (Function2) objOooO0o, ooo00oOooOOo);
            }
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0(this, s, i));
    }

    public final S OooO0O0() {
        return (S) this.f1244OooO00o.f1056OooO00o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long OooO0OO() {
        return ((Number) this.f1249OooO0o0.getValue()).longValue();
    }

    @NotNull
    public final OooO0O0<S> OooO0Oo() {
        return (OooO0O0) this.f1247OooO0Oo.getValue();
    }

    public final S OooO0o() {
        return (S) this.f1246OooO0OO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long OooO0o0() {
        return ((Number) this.f1248OooO0o.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0oO() {
        return ((Boolean) this.f1252OooOO0.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [Oooo00O.o0O0O00, V extends Oooo00O.o0O0O00] */
    public final void OooO0oo(long j, float f) {
        if (OooO0o0() == Long.MIN_VALUE) {
            OooOO0o(j);
            this.f1244OooO00o.OooO00o(true);
        }
        OooOOO0(false);
        this.f1249OooO0o0.setValue(Long.valueOf(j - OooO0o0()));
        ListIterator<oo00o<S>.OooO0o<?, ?>> listIterator = this.f1251OooO0oo.listIterator();
        boolean z = true;
        while (true) {
            o0o0Oo o0o0oo = (o0o0Oo) listIterator;
            if (!o0o0oo.hasNext()) {
                break;
            }
            OooO0o oooO0o = (OooO0o) o0o0oo.next();
            if (!oooO0o.OooOOOO()) {
                long jOooO0OO = (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)) == 0 ? oooO0o.OooO00o().f1159OooO0oo : (long) ((OooO0OO() - ((Number) oooO0o.f1275OoooO0.getValue()).longValue()) / f);
                oooO0o.f1274OoooO.setValue(oooO0o.OooO00o().OooO0o(jOooO0OO));
                oooO0o.f1278OoooOO0 = oooO0o.OooO00o().OooO0Oo(jOooO0OO);
                if (oooO0o.OooO00o().OooO0o0(jOooO0OO)) {
                    oooO0o.f1276OoooO00.setValue(Boolean.TRUE);
                    oooO0o.f1275OoooO0.setValue(0L);
                }
            }
            if (!oooO0o.OooOOOO()) {
                z = false;
            }
        }
        ListIterator<oo00o<?>> listIterator2 = this.f1243OooO.listIterator();
        while (true) {
            o0o0Oo o0o0oo2 = (o0o0Oo) listIterator2;
            if (!o0o0oo2.hasNext()) {
                break;
            }
            oo00o oo00oVar = (oo00o) o0o0oo2.next();
            if (!Intrinsics.areEqual(oo00oVar.OooO0o(), oo00oVar.OooO0O0())) {
                oo00oVar.OooO0oo(OooO0OO(), f);
            }
            if (!Intrinsics.areEqual(oo00oVar.OooO0o(), oo00oVar.OooO0O0())) {
                z = false;
            }
        }
        if (z) {
            OooO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName(name = "seek")
    public final void OooOO0(S s, S s2, long j) {
        OooOO0o(Long.MIN_VALUE);
        this.f1244OooO00o.OooO00o(false);
        if (!OooO0oO() || !Intrinsics.areEqual(OooO0O0(), s) || !Intrinsics.areEqual(OooO0o(), s2)) {
            OooOO0O(s);
            this.f1246OooO0OO.setValue(s2);
            this.f1252OooOO0.setValue(Boolean.TRUE);
            this.f1247OooO0Oo.setValue(new OooO0OO(s, s2));
        }
        ListIterator<oo00o<?>> listIterator = this.f1243OooO.listIterator();
        while (true) {
            o0o0Oo o0o0oo = (o0o0Oo) listIterator;
            if (!o0o0oo.hasNext()) {
                break;
            }
            oo00o oo00oVar = (oo00o) o0o0oo.next();
            if (oo00oVar.OooO0oO()) {
                oo00oVar.OooOO0(oo00oVar.OooO0O0(), oo00oVar.OooO0o(), j);
            }
        }
        ListIterator<oo00o<S>.OooO0o<?, ?>> listIterator2 = this.f1251OooO0oo.listIterator();
        while (true) {
            o0o0Oo o0o0oo2 = (o0o0Oo) listIterator2;
            if (!o0o0oo2.hasNext()) {
                this.f1253OooOO0O = j;
                return;
            }
            ((OooO0o) o0o0oo2.next()).OooOOOo(j);
        }
    }

    public final void OooOO0O(S s) {
        this.f1244OooO00o.f1056OooO00o.setValue(s);
    }

    public final void OooOO0o(long j) {
        this.f1248OooO0o.setValue(Long.valueOf(j));
    }

    @Composable
    public final void OooOOO(S s, @Nullable oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-583974681);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(this) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !ooo00oOooOOo.OooOo0()) {
            if (!OooO0oO() && !Intrinsics.areEqual(OooO0o(), s)) {
                this.f1247OooO0Oo.setValue(new OooO0OO(OooO0o(), s));
                OooOO0O(OooO0o());
                this.f1246OooO0OO.setValue(s);
                if (!(OooO0o0() != Long.MIN_VALUE)) {
                    OooOOO0(true);
                }
                ListIterator<oo00o<S>.OooO0o<?, ?>> listIterator = this.f1251OooO0oo.listIterator();
                while (true) {
                    o0o0Oo o0o0oo = (o0o0Oo) listIterator;
                    if (!o0o0oo.hasNext()) {
                        break;
                    } else {
                        ((OooO0o) o0o0oo.next()).f1277OoooO0O.setValue(Boolean.TRUE);
                    }
                }
            }
        } else {
            ooo00oOooOOo.OooOoo0();
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO0(this, s, i));
    }

    public final void OooOOO0(boolean z) {
        this.f1250OooO0oO.setValue(Boolean.valueOf(z));
    }
}
