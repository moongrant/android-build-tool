package o0O0O0O;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.google.accompanist.pager.ExperimentalPagerApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.ResultKt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o0000O;
import p025Oooo0O0.o000OO0O;
import p027Oooo0o.o0000Ooo;
import p027Oooo0o.o000O00O;
import p027Oooo0o.oo000o;
import p045OooooOo.o00O;
import p045OooooOo.o00OO000;
import p045OooooOo.o00OO00O;
import p045OooooOo.oOO00O;
import p100o000oOoO.o00OOO00;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
@Stable
@ExperimentalPagerApi
public final class OooOO0 implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O00O f35353OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35354OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f35355OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f35356OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35357OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f35358OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35359OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f35352OooO0oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final o00O<OooOO0, ?> f35351OooO = (o00OO000.OooO0OO) oOO00O.OooO00o(OooO00o.f35360Oooo0o, OooO0O0.f35361Oooo0o);

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {
        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<o00OO00O, OooOO0, List<? extends Object>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f35360Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(o00OO00O o00oo00o, OooOO0 oooOO1) {
            o00OO00O listSaver = o00oo00o;
            OooOO0 it = oooOO1;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf(Integer.valueOf(it.OooO0o0()));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<? extends Object>, OooOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f35361Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OooOO0 invoke(List<? extends Object> list) {
            List<? extends Object> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return new OooOO0(((Integer) obj).intValue());
        }
    }

    public static final class OooO0OO {
    }

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5}, l = {217, 222, 225, 233, 240, 252}, m = "animateScrollToPage", n = {"this", "page", "pageOffset", "this", "this", "page", "pageOffset", "this", "this", "page", "pageOffset", "currentSize", "this"}, s = {"L$0", "I$0", "F$0", "L$0", "L$0", "I$0", "F$0", "L$0", "L$0", "I$0", "F$0", "I$1", "L$0"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public float f35362Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOO0 f35363Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f35364Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f35365Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f35367OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f35368OoooO0O;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35367OoooO00 = obj;
            this.f35368OoooO0O |= Integer.MIN_VALUE;
            return OooOO0.this.OooO0Oo(0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this);
        }
    }

    /* JADX INFO: renamed from: o0O0O0O.OooOO0$OooOO0, reason: collision with other inner class name */
    public static final class C0365OooOO0 extends Lambda implements Function0<Float> {
        public C0365OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            oo000o oo000oVarOooO0o = OooOO0.this.OooO0o();
            return Float.valueOf(oo000oVarOooO0o != null ? RangesKt.coerceIn((-oo000oVarOooO0o.OooO00o()) / oo000oVarOooO0o.getSize(), -1.0f, 1.0f) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Integer> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(OooOO0.this.f35353OooO00o.OooO0oO().OooO00o());
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState$scrollToPage$2$1", f = "PagerState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f35371Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oo000o f35372Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f35373Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(oo000o oo000oVar, float f, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f35372Oooo0oO = oo000oVar;
            this.f35373Oooo0oo = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO oooOOO = new OooOOO(this.f35372Oooo0oO, this.f35373Oooo0oo, continuation);
            oooOOO.f35371Oooo0o = obj;
            return oooOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(o0000o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((o0000O) this.f35371Oooo0o).OooO00o(this.f35372Oooo0oO.getSize() * this.f35373Oooo0oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", i = {0, 0, 1}, l = {287, 293}, m = "scrollToPage", n = {"this", "pageOffset", "this"}, s = {"L$0", "F$0", "L$0"})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOO0 f35375Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public float f35376Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f35377Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f35378OoooO00;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35377Oooo0oo = obj;
            this.f35378OoooO00 |= Integer.MIN_VALUE;
            return OooOO0.this.OooOO0o(0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this);
        }
    }

    public OooOO0(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f35353OooO00o = new o000O00O(i, 0);
        this.f35354OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Integer.valueOf(i));
        this.f35356OooO0Oo = (o00OOO00) o0OOO00.OooO0O0(new OooOO0O());
        this.f35358OooO0o0 = (o00OOO00) o0OOO00.OooO0O0(new C0365OooOO0());
        this.f35357OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f35359OooO0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
    }

    @IntRange(from = ULong.MIN_VALUE)
    public final int OooO() {
        return ((Number) this.f35356OooO0Oo.getValue()).intValue();
    }

    @Override // p025Oooo0O0.o000OO0O
    public final boolean OooO00o() {
        return this.f35353OooO00o.OooO00o();
    }

    @Override // p025Oooo0O0.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super o0000O, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO0O0 = this.f35353OooO00o.OooO0O0(mutatePriority, function2, continuation);
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }

    @Override // p025Oooo0O0.o000OO0O
    public final float OooO0OO(float f) {
        return this.f35353OooO00o.OooO0OO(f);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00af A[Catch: all -> 0x01ab, TryCatch #2 {all -> 0x01ab, blocks: (B:43:0x00a4, B:45:0x00af, B:49:0x00c2), top: B:102:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2 A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #2 {all -> 0x01ab, blocks: (B:43:0x00a4, B:45:0x00af, B:49:0x00c2), top: B:102:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x0159, B:74:0x0167, B:76:0x016d, B:83:0x0181, B:85:0x0185, B:87:0x018b, B:53:0x00e0, B:54:0x00ee, B:56:0x00f4, B:63:0x0108, B:65:0x010c, B:68:0x0125, B:70:0x0130), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x0159, B:74:0x0167, B:76:0x016d, B:83:0x0181, B:85:0x0185, B:87:0x018b, B:53:0x00e0, B:54:0x00ee, B:56:0x00f4, B:63:0x0108, B:65:0x010c, B:68:0x0125, B:70:0x0130), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0125 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x0159, B:74:0x0167, B:76:0x016d, B:83:0x0181, B:85:0x0185, B:87:0x018b, B:53:0x00e0, B:54:0x00ee, B:56:0x00f4, B:63:0x0108, B:65:0x010c, B:68:0x0125, B:70:0x0130), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0130 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x0159, B:74:0x0167, B:76:0x016d, B:83:0x0181, B:85:0x0185, B:87:0x018b, B:53:0x00e0, B:54:0x00ee, B:56:0x00f4, B:63:0x0108, B:65:0x010c, B:68:0x0125, B:70:0x0130), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x016d A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x0159, B:74:0x0167, B:76:0x016d, B:83:0x0181, B:85:0x0185, B:87:0x018b, B:53:0x00e0, B:54:0x00ee, B:56:0x00f4, B:63:0x0108, B:65:0x010c, B:68:0x0125, B:70:0x0130), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x0185 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:73:0x0159, B:74:0x0167, B:76:0x016d, B:83:0x0181, B:85:0x0185, B:87:0x018b, B:53:0x00e0, B:54:0x00ee, B:56:0x00f4, B:63:0x0108, B:65:0x010c, B:68:0x0125, B:70:0x0130), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Nullable
    public final Object OooO0Oo(@IntRange(from = ULong.MIN_VALUE) int i, @FloatRange(from = -1.0d, to = 1.0d) float f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO0o oooO0o;
        OooOO0 oooOO1;
        OooOO0 oooOO2;
        o000O00O o000o00o2;
        OooO oooO;
        int i2;
        OooOO0 oooOO3;
        o000O00O o000o00o3;
        OooOO0 oooOO4;
        o0000Ooo o0000oooOooO0oO;
        Iterator<T> it;
        Object next;
        oo000o oo000oVar;
        int size;
        o000O00O o000o00o4;
        int iRoundToInt;
        o000O00O o000o00o5;
        int iRoundToInt2;
        boolean z;
        Iterator<T> it2;
        Object next2;
        oo000o oo000oVar2;
        o000O00O o000o00o6;
        int iRoundToInt3;
        boolean z2;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i3 = oooO0o.f35368OoooO0O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO0o.f35368OoooO0O = i3 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object obj = oooO0o.f35367OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = oooO0o.f35368OoooO0O;
        OooOO0 oooOO5 = 3;
        try {
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        OooOO0(i);
                        OooOO0O(f);
                        try {
                            OooOOO0(Boxing.boxInt(i));
                            int iOooO0o0 = this.f35353OooO00o.OooO0o0();
                            if (Math.abs(i - iOooO0o0) > 3) {
                                o000O00O o000o00o7 = this.f35353OooO00o;
                                int i4 = i > iOooO0o0 ? i - 3 : i + 3;
                                oooO0o.f35363Oooo0o = this;
                                oooO0o.f35364Oooo0oO = i;
                                oooO0o.f35362Oooo = f;
                                oooO0o.f35368OoooO0O = 1;
                                if (o000O00O.OooO(o000o00o7, i4, oooO0o) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooOO2 = this;
                                oooOO1 = oooOO2;
                            } else {
                                oooOO1 = this;
                            }
                            try {
                                if (Math.abs(f) <= 0.005f) {
                                    o000o00o3 = oooOO1.f35353OooO00o;
                                    oooO0o.f35363Oooo0o = oooOO1;
                                    oooO0o.f35368OoooO0O = 2;
                                    o000O00O.OooO0OO oooO0OO = o000O00O.f1864OooOOoo;
                                    if (o000o00o3.OooO0Oo(i, 0, oooO0o) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    oooOO4 = oooOO1;
                                } else {
                                    o000o00o2 = oooOO1.f35353OooO00o;
                                    oooO = new OooO(null);
                                    oooO0o.f35363Oooo0o = oooOO1;
                                    oooO0o.f35364Oooo0oO = i;
                                    oooO0o.f35362Oooo = f;
                                    oooO0o.f35368OoooO0O = 3;
                                    if (o000o00o2.OooO0O0(MutatePriority.Default, oooO, oooO0o) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i2 = i;
                                    oooOO3 = oooOO1;
                                    o0000oooOooO0oO = oooOO3.f35353OooO00o.OooO0oO();
                                    it = o0000oooOooO0oO.OooO0O0().iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            if (((oo000o) next).getIndex() == i2) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            next = null;
                                        }
                                        oo000oVar = (oo000o) next;
                                        if (oo000oVar != null) {
                                            o000o00o5 = oooOO3.f35353OooO00o;
                                            iRoundToInt2 = MathKt.roundToInt(oo000oVar.getSize() * f);
                                            oooO0o.f35363Oooo0o = oooOO3;
                                            oooO0o.f35368OoooO0O = 4;
                                            if (o000o00o5.OooO0Oo(i2, iRoundToInt2, oooO0o) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else if (!o0000oooOooO0oO.OooO0O0().isEmpty()) {
                                            size = ((oo000o) CollectionsKt.first((List) o0000oooOooO0oO.OooO0O0())).getSize();
                                            o000o00o4 = oooOO3.f35353OooO00o;
                                            iRoundToInt = MathKt.roundToInt(size * f);
                                            oooO0o.f35363Oooo0o = oooOO3;
                                            oooO0o.f35364Oooo0oO = i2;
                                            oooO0o.f35362Oooo = f;
                                            oooO0o.f35365Oooo0oo = size;
                                            oooO0o.f35368OoooO0O = 5;
                                            if (o000o00o4.OooO0Oo(i2, iRoundToInt, oooO0o) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            it2 = oooOO3.f35353OooO00o.OooO0oO().OooO0O0().iterator();
                                            do {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    if (((oo000o) next2).getIndex() == i2) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                                oo000oVar2 = (oo000o) next2;
                                                if (oo000oVar2 != null && oo000oVar2.getSize() != size) {
                                                    o000o00o6 = oooOO3.f35353OooO00o;
                                                    iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                                    oooO0o.f35363Oooo0o = oooOO3;
                                                    oooO0o.f35368OoooO0O = 6;
                                                    if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                }
                                            } while (!z2);
                                            oo000oVar2 = (oo000o) next2;
                                            if (oo000oVar2 != null) {
                                                o000o00o6 = oooOO3.f35353OooO00o;
                                                iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                                oooO0o.f35363Oooo0o = oooOO3;
                                                oooO0o.f35368OoooO0O = 6;
                                                if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        }
                                        oooOO4 = oooOO3;
                                    } while (!z);
                                    oo000oVar = (oo000o) next;
                                    if (oo000oVar != null) {
                                        o000o00o5 = oooOO3.f35353OooO00o;
                                        iRoundToInt2 = MathKt.roundToInt(oo000oVar.getSize() * f);
                                        oooO0o.f35363Oooo0o = oooOO3;
                                        oooO0o.f35368OoooO0O = 4;
                                        if (o000o00o5.OooO0Oo(i2, iRoundToInt2, oooO0o) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (!o0000oooOooO0oO.OooO0O0().isEmpty()) {
                                        size = ((oo000o) CollectionsKt.first((List) o0000oooOooO0oO.OooO0O0())).getSize();
                                        o000o00o4 = oooOO3.f35353OooO00o;
                                        iRoundToInt = MathKt.roundToInt(size * f);
                                        oooO0o.f35363Oooo0o = oooOO3;
                                        oooO0o.f35364Oooo0oO = i2;
                                        oooO0o.f35362Oooo = f;
                                        oooO0o.f35365Oooo0oo = size;
                                        oooO0o.f35368OoooO0O = 5;
                                        if (o000o00o4.OooO0Oo(i2, iRoundToInt, oooO0o) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        it2 = oooOO3.f35353OooO00o.OooO0oO().OooO0O0().iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                next2 = it2.next();
                                                if (((oo000o) next2).getIndex() == i2) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                            } else {
                                                next2 = null;
                                            }
                                            oo000oVar2 = (oo000o) next2;
                                            if (oo000oVar2 != null) {
                                                o000o00o6 = oooOO3.f35353OooO00o;
                                                iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                                oooO0o.f35363Oooo0o = oooOO3;
                                                oooO0o.f35368OoooO0O = 6;
                                                if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } while (!z2);
                                        oo000oVar2 = (oo000o) next2;
                                        if (oo000oVar2 != null) {
                                            o000o00o6 = oooOO3.f35353OooO00o;
                                            iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                            oooO0o.f35363Oooo0o = oooOO3;
                                            oooO0o.f35368OoooO0O = 6;
                                            if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                    oooOO4 = oooOO3;
                                }
                                oooOO4.OooOOO0(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                oooOO5 = oooOO1;
                                oooOO5.OooOOO0(null);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            oooOO5 = this;
                            oooOO5.OooOOO0(null);
                            throw th;
                        }
                    case 1:
                        float f2 = oooO0o.f35362Oooo;
                        int i5 = oooO0o.f35364Oooo0oO;
                        oooOO2 = oooO0o.f35363Oooo0o;
                        ResultKt.throwOnFailure(obj);
                        f = f2;
                        i = i5;
                        oooOO1 = oooOO2;
                        if (Math.abs(f) <= 0.005f) {
                            o000o00o3 = oooOO1.f35353OooO00o;
                            oooO0o.f35363Oooo0o = oooOO1;
                            oooO0o.f35368OoooO0O = 2;
                            o000O00O.OooO0OO oooO0OO2 = o000O00O.f1864OooOOoo;
                            if (o000o00o3.OooO0Oo(i, 0, oooO0o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            oooOO4 = oooOO1;
                        } else {
                            o000o00o2 = oooOO1.f35353OooO00o;
                            oooO = new OooO(null);
                            oooO0o.f35363Oooo0o = oooOO1;
                            oooO0o.f35364Oooo0oO = i;
                            oooO0o.f35362Oooo = f;
                            oooO0o.f35368OoooO0O = 3;
                            if (o000o00o2.OooO0O0(MutatePriority.Default, oooO, oooO0o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i;
                            oooOO3 = oooOO1;
                            o0000oooOooO0oO = oooOO3.f35353OooO00o.OooO0oO();
                            it = o0000oooOooO0oO.OooO0O0().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((oo000o) next).getIndex() == i2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    next = null;
                                }
                                oo000oVar = (oo000o) next;
                                if (oo000oVar != null) {
                                    o000o00o5 = oooOO3.f35353OooO00o;
                                    iRoundToInt2 = MathKt.roundToInt(oo000oVar.getSize() * f);
                                    oooO0o.f35363Oooo0o = oooOO3;
                                    oooO0o.f35368OoooO0O = 4;
                                    if (o000o00o5.OooO0Oo(i2, iRoundToInt2, oooO0o) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (!o0000oooOooO0oO.OooO0O0().isEmpty()) {
                                    size = ((oo000o) CollectionsKt.first((List) o0000oooOooO0oO.OooO0O0())).getSize();
                                    o000o00o4 = oooOO3.f35353OooO00o;
                                    iRoundToInt = MathKt.roundToInt(size * f);
                                    oooO0o.f35363Oooo0o = oooOO3;
                                    oooO0o.f35364Oooo0oO = i2;
                                    oooO0o.f35362Oooo = f;
                                    oooO0o.f35365Oooo0oo = size;
                                    oooO0o.f35368OoooO0O = 5;
                                    if (o000o00o4.OooO0Oo(i2, iRoundToInt, oooO0o) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    it2 = oooOO3.f35353OooO00o.OooO0oO().OooO0O0().iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                            if (((oo000o) next2).getIndex() == i2) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                        oo000oVar2 = (oo000o) next2;
                                        if (oo000oVar2 != null) {
                                            o000o00o6 = oooOO3.f35353OooO00o;
                                            iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                            oooO0o.f35363Oooo0o = oooOO3;
                                            oooO0o.f35368OoooO0O = 6;
                                            if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } while (!z2);
                                    oo000oVar2 = (oo000o) next2;
                                    if (oo000oVar2 != null) {
                                        o000o00o6 = oooOO3.f35353OooO00o;
                                        iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                        oooO0o.f35363Oooo0o = oooOO3;
                                        oooO0o.f35368OoooO0O = 6;
                                        if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                                oooOO4 = oooOO3;
                            } while (!z);
                            oo000oVar = (oo000o) next;
                            if (oo000oVar != null) {
                                o000o00o5 = oooOO3.f35353OooO00o;
                                iRoundToInt2 = MathKt.roundToInt(oo000oVar.getSize() * f);
                                oooO0o.f35363Oooo0o = oooOO3;
                                oooO0o.f35368OoooO0O = 4;
                                if (o000o00o5.OooO0Oo(i2, iRoundToInt2, oooO0o) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (!o0000oooOooO0oO.OooO0O0().isEmpty()) {
                                size = ((oo000o) CollectionsKt.first((List) o0000oooOooO0oO.OooO0O0())).getSize();
                                o000o00o4 = oooOO3.f35353OooO00o;
                                iRoundToInt = MathKt.roundToInt(size * f);
                                oooO0o.f35363Oooo0o = oooOO3;
                                oooO0o.f35364Oooo0oO = i2;
                                oooO0o.f35362Oooo = f;
                                oooO0o.f35365Oooo0oo = size;
                                oooO0o.f35368OoooO0O = 5;
                                if (o000o00o4.OooO0Oo(i2, iRoundToInt, oooO0o) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it2 = oooOO3.f35353OooO00o.OooO0oO().OooO0O0().iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (((oo000o) next2).getIndex() == i2) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    oo000oVar2 = (oo000o) next2;
                                    if (oo000oVar2 != null) {
                                        o000o00o6 = oooOO3.f35353OooO00o;
                                        iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                        oooO0o.f35363Oooo0o = oooOO3;
                                        oooO0o.f35368OoooO0O = 6;
                                        if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } while (!z2);
                                oo000oVar2 = (oo000o) next2;
                                if (oo000oVar2 != null) {
                                    o000o00o6 = oooOO3.f35353OooO00o;
                                    iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                    oooO0o.f35363Oooo0o = oooOO3;
                                    oooO0o.f35368OoooO0O = 6;
                                    if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            oooOO4 = oooOO3;
                        }
                        oooOO4.OooOOO0(null);
                        return Unit.INSTANCE;
                    case 2:
                    case 4:
                    case 6:
                        oooOO4 = oooO0o.f35363Oooo0o;
                        try {
                            ResultKt.throwOnFailure(obj);
                            oooOO4.OooOOO0(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            oooOO5 = oooOO4;
                            th = th3;
                            oooOO5.OooOOO0(null);
                            throw th;
                        }
                    case 3:
                        float f3 = oooO0o.f35362Oooo;
                        int i6 = oooO0o.f35364Oooo0oO;
                        OooOO0 oooOO6 = oooO0o.f35363Oooo0o;
                        ResultKt.throwOnFailure(obj);
                        oooOO3 = oooOO6;
                        i2 = i6;
                        f = f3;
                        o0000oooOooO0oO = oooOO3.f35353OooO00o.OooO0oO();
                        it = o0000oooOooO0oO.OooO0O0().iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((oo000o) next).getIndex() == i2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                next = null;
                            }
                            oo000oVar = (oo000o) next;
                            if (oo000oVar != null) {
                                o000o00o5 = oooOO3.f35353OooO00o;
                                iRoundToInt2 = MathKt.roundToInt(oo000oVar.getSize() * f);
                                oooO0o.f35363Oooo0o = oooOO3;
                                oooO0o.f35368OoooO0O = 4;
                                if (o000o00o5.OooO0Oo(i2, iRoundToInt2, oooO0o) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (!o0000oooOooO0oO.OooO0O0().isEmpty()) {
                                size = ((oo000o) CollectionsKt.first((List) o0000oooOooO0oO.OooO0O0())).getSize();
                                o000o00o4 = oooOO3.f35353OooO00o;
                                iRoundToInt = MathKt.roundToInt(size * f);
                                oooO0o.f35363Oooo0o = oooOO3;
                                oooO0o.f35364Oooo0oO = i2;
                                oooO0o.f35362Oooo = f;
                                oooO0o.f35365Oooo0oo = size;
                                oooO0o.f35368OoooO0O = 5;
                                if (o000o00o4.OooO0Oo(i2, iRoundToInt, oooO0o) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it2 = oooOO3.f35353OooO00o.OooO0oO().OooO0O0().iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (((oo000o) next2).getIndex() == i2) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    oo000oVar2 = (oo000o) next2;
                                    if (oo000oVar2 != null) {
                                        o000o00o6 = oooOO3.f35353OooO00o;
                                        iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                        oooO0o.f35363Oooo0o = oooOO3;
                                        oooO0o.f35368OoooO0O = 6;
                                        if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } while (!z2);
                                oo000oVar2 = (oo000o) next2;
                                if (oo000oVar2 != null) {
                                    o000o00o6 = oooOO3.f35353OooO00o;
                                    iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                    oooO0o.f35363Oooo0o = oooOO3;
                                    oooO0o.f35368OoooO0O = 6;
                                    if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            oooOO4 = oooOO3;
                            oooOO4.OooOOO0(null);
                            return Unit.INSTANCE;
                        } while (!z);
                        oo000oVar = (oo000o) next;
                        if (oo000oVar != null) {
                            o000o00o5 = oooOO3.f35353OooO00o;
                            iRoundToInt2 = MathKt.roundToInt(oo000oVar.getSize() * f);
                            oooO0o.f35363Oooo0o = oooOO3;
                            oooO0o.f35368OoooO0O = 4;
                            if (o000o00o5.OooO0Oo(i2, iRoundToInt2, oooO0o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (!o0000oooOooO0oO.OooO0O0().isEmpty()) {
                            size = ((oo000o) CollectionsKt.first((List) o0000oooOooO0oO.OooO0O0())).getSize();
                            o000o00o4 = oooOO3.f35353OooO00o;
                            iRoundToInt = MathKt.roundToInt(size * f);
                            oooO0o.f35363Oooo0o = oooOO3;
                            oooO0o.f35364Oooo0oO = i2;
                            oooO0o.f35362Oooo = f;
                            oooO0o.f35365Oooo0oo = size;
                            oooO0o.f35368OoooO0O = 5;
                            if (o000o00o4.OooO0Oo(i2, iRoundToInt, oooO0o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it2 = oooOO3.f35353OooO00o.OooO0oO().OooO0O0().iterator();
                            do {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    if (((oo000o) next2).getIndex() == i2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    next2 = null;
                                }
                                oo000oVar2 = (oo000o) next2;
                                if (oo000oVar2 != null) {
                                    o000o00o6 = oooOO3.f35353OooO00o;
                                    iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                    oooO0o.f35363Oooo0o = oooOO3;
                                    oooO0o.f35368OoooO0O = 6;
                                    if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } while (!z2);
                            oo000oVar2 = (oo000o) next2;
                            if (oo000oVar2 != null) {
                                o000o00o6 = oooOO3.f35353OooO00o;
                                iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                oooO0o.f35363Oooo0o = oooOO3;
                                oooO0o.f35368OoooO0O = 6;
                                if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        oooOO4 = oooOO3;
                        oooOO4.OooOOO0(null);
                        return Unit.INSTANCE;
                    case 5:
                        size = oooO0o.f35365Oooo0oo;
                        f = oooO0o.f35362Oooo;
                        i2 = oooO0o.f35364Oooo0oO;
                        oooOO3 = oooO0o.f35363Oooo0o;
                        ResultKt.throwOnFailure(obj);
                        it2 = oooOO3.f35353OooO00o.OooO0oO().OooO0O0().iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((oo000o) next2).getIndex() == i2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                next2 = null;
                            }
                            oo000oVar2 = (oo000o) next2;
                            if (oo000oVar2 != null) {
                                o000o00o6 = oooOO3.f35353OooO00o;
                                iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                                oooO0o.f35363Oooo0o = oooOO3;
                                oooO0o.f35368OoooO0O = 6;
                                if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            oooOO4 = oooOO3;
                            oooOO4.OooOOO0(null);
                            return Unit.INSTANCE;
                        } while (!z2);
                        oo000oVar2 = (oo000o) next2;
                        if (oo000oVar2 != null) {
                            o000o00o6 = oooOO3.f35353OooO00o;
                            iRoundToInt3 = MathKt.roundToInt(oo000oVar2.getSize() * f);
                            oooO0o.f35363Oooo0o = oooOO3;
                            oooO0o.f35368OoooO0O = 6;
                            if (o000o00o6.OooO0Oo(i2, iRoundToInt3, oooO0o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        oooOO4 = oooOO3;
                        oooOO4.OooOOO0(null);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th4) {
                th = th4;
                oooOO5 = r1;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final oo000o OooO0o() {
        oo000o oo000oVarPrevious;
        List<oo000o> listOooO0O0 = this.f35353OooO00o.OooO0oO().OooO0O0();
        ListIterator<oo000o> listIterator = listOooO0O0.listIterator(listOooO0O0.size());
        while (listIterator.hasPrevious()) {
            oo000oVarPrevious = listIterator.previous();
            if (oo000oVarPrevious.getIndex() == OooO0o0()) {
                return oo000oVarPrevious;
            }
        }
        oo000oVarPrevious = null;
        return oo000oVarPrevious;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @IntRange(from = ULong.MIN_VALUE)
    public final int OooO0o0() {
        return ((Number) this.f35354OooO0O0.getValue()).intValue();
    }

    public final float OooO0oO() {
        return ((Number) this.f35358OooO0o0.getValue()).floatValue();
    }

    @Nullable
    public final oo000o OooO0oo() {
        Object obj;
        o0000Ooo o0000oooOooO0oO = this.f35353OooO00o.OooO0oO();
        Iterator<T> it = o0000oooOooO0oO.OooO0O0().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                oo000o oo000oVar = (oo000o) next;
                int iMin = Math.min(oo000oVar.getSize() + oo000oVar.OooO00o(), o0000oooOooO0oO.OooO0Oo() - this.f35355OooO0OO) - Math.max(oo000oVar.OooO00o(), 0);
                do {
                    Object next2 = it.next();
                    oo000o oo000oVar2 = (oo000o) next2;
                    int iMin2 = Math.min(oo000oVar2.getSize() + oo000oVar2.OooO00o(), o0000oooOooO0oO.OooO0Oo() - this.f35355OooO0OO) - Math.max(oo000oVar2.OooO00o(), 0);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (oo000o) obj;
    }

    public final void OooOO0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("page[" + i + "] must be >= 0").toString());
    }

    public final void OooOO0O(float f) {
        if (!(-1.0f <= f && f <= 1.0f)) {
            throw new IllegalArgumentException("pageOffset must be >= 0 and <= 1".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Nullable
    public final Object OooOO0o(@IntRange(from = ULong.MIN_VALUE) int i, @FloatRange(from = -1.0d, to = 1.0d) float f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooOOO0 oooOOO0;
        OooOO0 oooOO1;
        oo000o oo000oVarOooO0o;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i2 = oooOOO0.f35378OoooO00;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOO0.f35378OoooO00 = i2 - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object obj = oooOOO0.f35377Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOOO0.f35378OoooO00;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    f = oooOOO0.f35376Oooo0oO;
                    oooOO1 = oooOOO0.f35375Oooo0o;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oooOO1 = oooOOO0.f35375Oooo0o;
                    ResultKt.throwOnFailure(obj);
                }
                oooOO1.OooOOO0(null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            OooOO0(i);
            OooOO0O(f);
            try {
                OooOOO0(Boxing.boxInt(i));
                o000O00O o000o00o2 = this.f35353OooO00o;
                oooOOO0.f35375Oooo0o = this;
                oooOOO0.f35376Oooo0oO = f;
                oooOOO0.f35378OoooO00 = 1;
                if (o000O00O.OooO(o000o00o2, i, oooOOO0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOO1 = this;
            } catch (Throwable th) {
                th = th;
                i = this;
                i.OooOOO0(null);
                throw th;
            }
            oo000o oo000oVarOooO0oo = oooOO1.OooO0oo();
            if (oo000oVarOooO0oo != null) {
                oooOO1.OooOOO(oo000oVarOooO0oo.getIndex());
            }
            if (Math.abs(f) > 1.0E-4f && (oo000oVarOooO0o = oooOO1.OooO0o()) != null) {
                OooOOO oooOOO = new OooOOO(oo000oVarOooO0o, f, null);
                oooOOO0.f35375Oooo0o = oooOO1;
                oooOOO0.f35378OoooO00 = 2;
                if (oooOO1.OooO0O0(MutatePriority.Default, oooOOO, oooOOO0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oooOO1.OooOOO0(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(int i) {
        if (i != ((Number) this.f35354OooO0O0.getValue()).intValue()) {
            this.f35354OooO0O0.setValue(Integer.valueOf(i));
        }
    }

    public final void OooOOO0(Integer num) {
        this.f35357OooO0o.setValue(num);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PagerState(pageCount=");
        sbOooO0o0.append(OooO());
        sbOooO0o0.append(", currentPage=");
        sbOooO0o0.append(OooO0o0());
        sbOooO0o0.append(", currentPageOffset=");
        sbOooO0o0.append(OooO0oO());
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public OooOO0() {
        this(0);
    }
}
