package p230o00oOo0o;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Stable
@Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Insets is Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "PagerState(currentPage = currentPage)", imports = {"androidx.compose.foundation.pager.PagerState"}))
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n76#2:391\n102#2,2:392\n76#2:408\n102#2,2:409\n76#2:417\n76#2:418\n76#2:419\n102#2,2:420\n76#2:422\n102#2,2:423\n1963#3,14:394\n533#3,6:411\n288#3,2:425\n288#3,2:427\n1#4:429\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerState\n*L\n100#1:391\n100#1:392,2\n116#1:408\n116#1:409,2\n136#1:417\n163#1:418\n172#1:419\n172#1:420,2\n174#1:422\n174#1:423,2\n106#1:394,14\n119#1:411,6\n250#1:425,2\n268#1:427,2\n*E\n"})
public final class o000000 implements ScrollableState {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Saver<o000000, ?> f39747OooO0oo = ListSaverKt.listSaver(OooO00o.f39756OooO0Oo, OooO0O0.f39757OooO0Oo);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LazyListState f39748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f39749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f39750OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final State f39751OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f39752OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final State f39753OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f39754OooO0oO;

    public static final class OooO extends Lambda implements Function0<Float> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            float fCoerceIn;
            o000000 o000000Var = o000000.this;
            LazyListItemInfo lazyListItemInfoOooO0O0 = o000000Var.OooO0O0();
            if (lazyListItemInfoOooO0O0 != null) {
                fCoerceIn = RangesKt.coerceIn((-lazyListItemInfoOooO0O0.getOffset()) / (o000000Var.OooO0Oo() + lazyListItemInfoOooO0O0.getSize()), -0.5f, 0.5f);
            } else {
                fCoerceIn = 0.0f;
            }
            return Float.valueOf(fCoerceIn);
        }
    }

    public static final class OooO00o extends Lambda implements Function2<SaverScope, o000000, List<? extends Object>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f39756OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(SaverScope saverScope, o000000 o000000Var) {
            SaverScope listSaver = saverScope;
            o000000 it = o000000Var;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf(Integer.valueOf(it.OooO0oO()));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<? extends Object>, o000000> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f39757OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o000000 invoke(List<? extends Object> list) {
            List<? extends Object> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return new o000000(((Integer) obj).intValue());
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5}, l = {239, 244, 247, 255, 262, 274}, m = "animateScrollToPage", n = {"this", "page", "pageOffset", "this", "this", "page", "pageOffset", "this", "this", "page", "pageOffset", "currentSize", "this"}, s = {"L$0", "I$0", "F$0", "L$0", "L$0", "I$0", "F$0", "L$0", "L$0", "I$0", "F$0", "I$1", "L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000000 f39759OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f39760OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f39761OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f39762OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f39763OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f39764OooOO0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39763OooO0oo = obj;
            this.f39764OooOO0 |= Integer.MIN_VALUE;
            return o000000.this.OooO00o(0, 0.0f, this);
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Integer> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o000000.this.f39748OooO00o.getLayoutInfo().getTotalItemsCount());
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState", f = "PagerState.kt", i = {0, 0, 1}, l = {309, 315}, m = "scrollToPage", n = {"this", "pageOffset", "this"}, s = {"L$0", "F$0", "L$0"})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000000 f39766OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f39767OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f39768OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f39770OooO0oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39767OooO0o = obj;
            this.f39770OooO0oo |= Integer.MIN_VALUE;
            return o000000.this.OooOO0(0, 0.0f, this);
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.PagerState$scrollToPage$2$1", f = "PagerState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f39771OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000000 f39772OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LazyListItemInfo f39773OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f39774OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(LazyListItemInfo lazyListItemInfo, o000000 o000000Var, float f, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f39773OooO0o0 = lazyListItemInfo;
            this.f39772OooO0o = o000000Var;
            this.f39774OooO0oO = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f39773OooO0o0, this.f39772OooO0o, this.f39774OooO0oO, continuation);
            oooOOO0.f39771OooO0Oo = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((ScrollScope) this.f39771OooO0Oo).scrollBy((this.f39772OooO0o.OooO0Oo() + this.f39773OooO0o0.getSize()) * this.f39774OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public o000000(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f39748OooO00o = new LazyListState(i, 0, 2, null);
        this.f39749OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        this.f39750OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.f39751OooO0Oo = SnapshotStateKt.derivedStateOf(new OooOO0());
        this.f39753OooO0o0 = SnapshotStateKt.derivedStateOf(new OooO());
        this.f39752OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f39754OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static void OooO(float f) {
        if (!(-1.0f <= f && f <= 1.0f)) {
            throw new IllegalArgumentException("pageOffset must be >= -1 and <= 1".toString());
        }
    }

    public static void OooO0oo(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("page[", i, "] must be >= 0").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:43:0x00b2, B:45:0x00bd, B:49:0x00d3), top: B:101:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3 A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #1 {all -> 0x01ca, blocks: (B:43:0x00b2, B:45:0x00bd, B:49:0x00d3), top: B:101:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003d, B:74:0x016f, B:75:0x017d, B:77:0x0183, B:84:0x0197, B:86:0x019b, B:88:0x01a6, B:53:0x00f0, B:54:0x00fe, B:56:0x0104, B:63:0x0118, B:66:0x011e, B:69:0x0139, B:71:0x0144), top: B:100:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003d, B:74:0x016f, B:75:0x017d, B:77:0x0183, B:84:0x0197, B:86:0x019b, B:88:0x01a6, B:53:0x00f0, B:54:0x00fe, B:56:0x0104, B:63:0x0118, B:66:0x011e, B:69:0x0139, B:71:0x0144), top: B:100:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0139 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003d, B:74:0x016f, B:75:0x017d, B:77:0x0183, B:84:0x0197, B:86:0x019b, B:88:0x01a6, B:53:0x00f0, B:54:0x00fe, B:56:0x0104, B:63:0x0118, B:66:0x011e, B:69:0x0139, B:71:0x0144), top: B:100:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0144 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003d, B:74:0x016f, B:75:0x017d, B:77:0x0183, B:84:0x0197, B:86:0x019b, B:88:0x01a6, B:53:0x00f0, B:54:0x00fe, B:56:0x0104, B:63:0x0118, B:66:0x011e, B:69:0x0139, B:71:0x0144), top: B:100:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0183 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003d, B:74:0x016f, B:75:0x017d, B:77:0x0183, B:84:0x0197, B:86:0x019b, B:88:0x01a6, B:53:0x00f0, B:54:0x00fe, B:56:0x0104, B:63:0x0118, B:66:0x011e, B:69:0x0139, B:71:0x0144), top: B:100:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003d, B:74:0x016f, B:75:0x017d, B:77:0x0183, B:84:0x0197, B:86:0x019b, B:88:0x01a6, B:53:0x00f0, B:54:0x00fe, B:56:0x0104, B:63:0x0118, B:66:0x011e, B:69:0x0139, B:71:0x0144), top: B:100:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Nullable
    public final Object OooO00o(@IntRange(from = ULong.MIN_VALUE) int i, @FloatRange(from = -1.0d, to = 1.0d) float f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO0OO oooO0OO;
        o000000 o000000Var;
        float f2;
        o000000 o000000Var2;
        o000000 o000000Var3;
        LazyListState lazyListState;
        OooO0o oooO0o;
        int i2;
        float f3;
        o000000 o000000Var4;
        LazyListState lazyListState2;
        o000000 o000000Var5;
        LazyListLayoutInfo layoutInfo;
        Iterator<T> it;
        Object next;
        LazyListItemInfo lazyListItemInfo;
        LazyListState lazyListState3;
        int size;
        int iRoundToInt;
        int iRoundToInt2;
        boolean z;
        Iterator<T> it2;
        Object next2;
        LazyListItemInfo lazyListItemInfo2;
        LazyListState lazyListState4;
        int iRoundToInt3;
        boolean z2;
        int i3;
        int i4 = i;
        if (!(continuation instanceof OooO0OO) || (o000000Var = (i3 = (oooO0OO = (OooO0OO) continuation).f39764OooOO0) & Integer.MIN_VALUE) == 0) {
            oooO0OO = new OooO0OO(continuation);
        } else {
            oooO0OO.f39764OooOO0 = i3 - Integer.MIN_VALUE;
        }
        Object obj = oooO0OO.f39763OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (oooO0OO.f39764OooOO0) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        OooO0oo(i);
                        OooO(f);
                        try {
                            OooOO0O(Boxing.boxInt(i));
                            int firstVisibleItemIndex = this.f39748OooO00o.getFirstVisibleItemIndex();
                            if (Math.abs(i4 - firstVisibleItemIndex) > 3) {
                                LazyListState lazyListState5 = this.f39748OooO00o;
                                int i5 = i4 > firstVisibleItemIndex ? i4 - 3 : i4 + 3;
                                oooO0OO.f39759OooO0Oo = this;
                                oooO0OO.f39761OooO0o0 = i4;
                                f2 = f;
                                oooO0OO.f39762OooO0oO = f2;
                                oooO0OO.f39764OooOO0 = 1;
                                if (LazyListState.scrollToItem$default(lazyListState5, i5, 0, oooO0OO, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000000Var3 = this;
                                o000000Var2 = o000000Var3;
                            } else {
                                f2 = f;
                                o000000Var2 = this;
                            }
                            try {
                                if (Math.abs(f2) <= 0.005f) {
                                    lazyListState2 = o000000Var2.f39748OooO00o;
                                    oooO0OO.f39759OooO0Oo = o000000Var2;
                                    oooO0OO.f39764OooOO0 = 2;
                                    if (LazyListState.animateScrollToItem$default(lazyListState2, i4, 0, oooO0OO, 2, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    o000000Var5 = o000000Var2;
                                } else {
                                    lazyListState = o000000Var2.f39748OooO00o;
                                    oooO0o = new OooO0o(null);
                                    oooO0OO.f39759OooO0Oo = o000000Var2;
                                    oooO0OO.f39761OooO0o0 = i4;
                                    oooO0OO.f39762OooO0oO = f2;
                                    oooO0OO.f39764OooOO0 = 3;
                                    if (androidx.compose.foundation.gestures.OooO0o.OooO0o0(lazyListState, null, oooO0o, oooO0OO, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i2 = i4;
                                    f3 = f2;
                                    o000000Var4 = o000000Var2;
                                    layoutInfo = o000000Var4.f39748OooO00o.getLayoutInfo();
                                    it = layoutInfo.getVisibleItemsInfo().iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            if (((LazyListItemInfo) next).getIndex() == i2) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            next = null;
                                        }
                                        lazyListItemInfo = (LazyListItemInfo) next;
                                        lazyListState3 = o000000Var4.f39748OooO00o;
                                        if (lazyListItemInfo != null) {
                                            iRoundToInt2 = MathKt.roundToInt((lazyListItemInfo.getSize() + o000000Var4.OooO0Oo()) * f3);
                                            oooO0OO.f39759OooO0Oo = o000000Var4;
                                            oooO0OO.f39764OooOO0 = 4;
                                            if (lazyListState3.animateScrollToItem(i2, iRoundToInt2, oooO0OO) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                                            size = ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getSize() + o000000Var4.OooO0Oo();
                                            iRoundToInt = MathKt.roundToInt(size * f3);
                                            oooO0OO.f39759OooO0Oo = o000000Var4;
                                            oooO0OO.f39761OooO0o0 = i2;
                                            oooO0OO.f39762OooO0oO = f3;
                                            oooO0OO.f39760OooO0o = size;
                                            oooO0OO.f39764OooOO0 = 5;
                                            if (lazyListState3.animateScrollToItem(i2, iRoundToInt, oooO0OO) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            it2 = o000000Var4.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo().iterator();
                                            do {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    if (((LazyListItemInfo) next2).getIndex() == i2) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                                lazyListItemInfo2 = (LazyListItemInfo) next2;
                                                if (lazyListItemInfo2 != null && lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo() != size) {
                                                    lazyListState4 = o000000Var4.f39748OooO00o;
                                                    iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                                    oooO0OO.f39759OooO0Oo = o000000Var4;
                                                    oooO0OO.f39764OooOO0 = 6;
                                                    if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                }
                                            } while (!z2);
                                            lazyListItemInfo2 = (LazyListItemInfo) next2;
                                            if (lazyListItemInfo2 != null) {
                                                lazyListState4 = o000000Var4.f39748OooO00o;
                                                iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                                oooO0OO.f39764OooOO0 = 6;
                                                if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        }
                                        o000000Var5 = o000000Var4;
                                    } while (!z);
                                    lazyListItemInfo = (LazyListItemInfo) next;
                                    lazyListState3 = o000000Var4.f39748OooO00o;
                                    if (lazyListItemInfo != null) {
                                        iRoundToInt2 = MathKt.roundToInt((lazyListItemInfo.getSize() + o000000Var4.OooO0Oo()) * f3);
                                        oooO0OO.f39759OooO0Oo = o000000Var4;
                                        oooO0OO.f39764OooOO0 = 4;
                                        if (lazyListState3.animateScrollToItem(i2, iRoundToInt2, oooO0OO) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                                        size = ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getSize() + o000000Var4.OooO0Oo();
                                        iRoundToInt = MathKt.roundToInt(size * f3);
                                        oooO0OO.f39759OooO0Oo = o000000Var4;
                                        oooO0OO.f39761OooO0o0 = i2;
                                        oooO0OO.f39762OooO0oO = f3;
                                        oooO0OO.f39760OooO0o = size;
                                        oooO0OO.f39764OooOO0 = 5;
                                        if (lazyListState3.animateScrollToItem(i2, iRoundToInt, oooO0OO) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        it2 = o000000Var4.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo().iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                next2 = it2.next();
                                                if (((LazyListItemInfo) next2).getIndex() == i2) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                            } else {
                                                next2 = null;
                                            }
                                            lazyListItemInfo2 = (LazyListItemInfo) next2;
                                            if (lazyListItemInfo2 != null) {
                                                lazyListState4 = o000000Var4.f39748OooO00o;
                                                iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                                oooO0OO.f39764OooOO0 = 6;
                                                if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } while (!z2);
                                        lazyListItemInfo2 = (LazyListItemInfo) next2;
                                        if (lazyListItemInfo2 != null) {
                                            lazyListState4 = o000000Var4.f39748OooO00o;
                                            iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                            oooO0OO.f39759OooO0Oo = o000000Var4;
                                            oooO0OO.f39764OooOO0 = 6;
                                            if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                    o000000Var5 = o000000Var4;
                                }
                                o000000Var5.OooOO0O(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                o000000Var = o000000Var2;
                                o000000Var.OooOO0O(null);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            o000000Var = this;
                            o000000Var.OooOO0O(null);
                            throw th;
                        }
                    case 1:
                        float f4 = oooO0OO.f39762OooO0oO;
                        int i6 = oooO0OO.f39761OooO0o0;
                        o000000Var3 = oooO0OO.f39759OooO0Oo;
                        ResultKt.throwOnFailure(obj);
                        f2 = f4;
                        i4 = i6;
                        o000000Var2 = o000000Var3;
                        if (Math.abs(f2) <= 0.005f) {
                            lazyListState2 = o000000Var2.f39748OooO00o;
                            oooO0OO.f39759OooO0Oo = o000000Var2;
                            oooO0OO.f39764OooOO0 = 2;
                            if (LazyListState.animateScrollToItem$default(lazyListState2, i4, 0, oooO0OO, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000000Var5 = o000000Var2;
                        } else {
                            lazyListState = o000000Var2.f39748OooO00o;
                            oooO0o = new OooO0o(null);
                            oooO0OO.f39759OooO0Oo = o000000Var2;
                            oooO0OO.f39761OooO0o0 = i4;
                            oooO0OO.f39762OooO0oO = f2;
                            oooO0OO.f39764OooOO0 = 3;
                            if (androidx.compose.foundation.gestures.OooO0o.OooO0o0(lazyListState, null, oooO0o, oooO0OO, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i4;
                            f3 = f2;
                            o000000Var4 = o000000Var2;
                            layoutInfo = o000000Var4.f39748OooO00o.getLayoutInfo();
                            it = layoutInfo.getVisibleItemsInfo().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((LazyListItemInfo) next).getIndex() == i2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    next = null;
                                }
                                lazyListItemInfo = (LazyListItemInfo) next;
                                lazyListState3 = o000000Var4.f39748OooO00o;
                                if (lazyListItemInfo != null) {
                                    iRoundToInt2 = MathKt.roundToInt((lazyListItemInfo.getSize() + o000000Var4.OooO0Oo()) * f3);
                                    oooO0OO.f39759OooO0Oo = o000000Var4;
                                    oooO0OO.f39764OooOO0 = 4;
                                    if (lazyListState3.animateScrollToItem(i2, iRoundToInt2, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                                    size = ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getSize() + o000000Var4.OooO0Oo();
                                    iRoundToInt = MathKt.roundToInt(size * f3);
                                    oooO0OO.f39759OooO0Oo = o000000Var4;
                                    oooO0OO.f39761OooO0o0 = i2;
                                    oooO0OO.f39762OooO0oO = f3;
                                    oooO0OO.f39760OooO0o = size;
                                    oooO0OO.f39764OooOO0 = 5;
                                    if (lazyListState3.animateScrollToItem(i2, iRoundToInt, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    it2 = o000000Var4.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo().iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                            if (((LazyListItemInfo) next2).getIndex() == i2) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                        lazyListItemInfo2 = (LazyListItemInfo) next2;
                                        if (lazyListItemInfo2 != null) {
                                            lazyListState4 = o000000Var4.f39748OooO00o;
                                            iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                            oooO0OO.f39759OooO0Oo = o000000Var4;
                                            oooO0OO.f39764OooOO0 = 6;
                                            if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } while (!z2);
                                    lazyListItemInfo2 = (LazyListItemInfo) next2;
                                    if (lazyListItemInfo2 != null) {
                                        lazyListState4 = o000000Var4.f39748OooO00o;
                                        iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                        oooO0OO.f39759OooO0Oo = o000000Var4;
                                        oooO0OO.f39764OooOO0 = 6;
                                        if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                                o000000Var5 = o000000Var4;
                            } while (!z);
                            lazyListItemInfo = (LazyListItemInfo) next;
                            lazyListState3 = o000000Var4.f39748OooO00o;
                            if (lazyListItemInfo != null) {
                                iRoundToInt2 = MathKt.roundToInt((lazyListItemInfo.getSize() + o000000Var4.OooO0Oo()) * f3);
                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                oooO0OO.f39764OooOO0 = 4;
                                if (lazyListState3.animateScrollToItem(i2, iRoundToInt2, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                                size = ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getSize() + o000000Var4.OooO0Oo();
                                iRoundToInt = MathKt.roundToInt(size * f3);
                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                oooO0OO.f39761OooO0o0 = i2;
                                oooO0OO.f39762OooO0oO = f3;
                                oooO0OO.f39760OooO0o = size;
                                oooO0OO.f39764OooOO0 = 5;
                                if (lazyListState3.animateScrollToItem(i2, iRoundToInt, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it2 = o000000Var4.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo().iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (((LazyListItemInfo) next2).getIndex() == i2) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    lazyListItemInfo2 = (LazyListItemInfo) next2;
                                    if (lazyListItemInfo2 != null) {
                                        lazyListState4 = o000000Var4.f39748OooO00o;
                                        iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                        oooO0OO.f39759OooO0Oo = o000000Var4;
                                        oooO0OO.f39764OooOO0 = 6;
                                        if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } while (!z2);
                                lazyListItemInfo2 = (LazyListItemInfo) next2;
                                if (lazyListItemInfo2 != null) {
                                    lazyListState4 = o000000Var4.f39748OooO00o;
                                    iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                    oooO0OO.f39759OooO0Oo = o000000Var4;
                                    oooO0OO.f39764OooOO0 = 6;
                                    if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            o000000Var5 = o000000Var4;
                        }
                        o000000Var5.OooOO0O(null);
                        return Unit.INSTANCE;
                    case 2:
                    case 4:
                    case 6:
                        o000000Var5 = oooO0OO.f39759OooO0Oo;
                        try {
                            ResultKt.throwOnFailure(obj);
                            o000000Var5.OooOO0O(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            o000000Var = o000000Var5;
                            o000000Var.OooOO0O(null);
                            throw th;
                        }
                    case 3:
                        float f5 = oooO0OO.f39762OooO0oO;
                        int i7 = oooO0OO.f39761OooO0o0;
                        o000000 o000000Var6 = oooO0OO.f39759OooO0Oo;
                        ResultKt.throwOnFailure(obj);
                        o000000Var4 = o000000Var6;
                        i2 = i7;
                        f3 = f5;
                        layoutInfo = o000000Var4.f39748OooO00o.getLayoutInfo();
                        it = layoutInfo.getVisibleItemsInfo().iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((LazyListItemInfo) next).getIndex() == i2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                next = null;
                            }
                            lazyListItemInfo = (LazyListItemInfo) next;
                            lazyListState3 = o000000Var4.f39748OooO00o;
                            if (lazyListItemInfo != null) {
                                iRoundToInt2 = MathKt.roundToInt((lazyListItemInfo.getSize() + o000000Var4.OooO0Oo()) * f3);
                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                oooO0OO.f39764OooOO0 = 4;
                                if (lazyListState3.animateScrollToItem(i2, iRoundToInt2, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                                size = ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getSize() + o000000Var4.OooO0Oo();
                                iRoundToInt = MathKt.roundToInt(size * f3);
                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                oooO0OO.f39761OooO0o0 = i2;
                                oooO0OO.f39762OooO0oO = f3;
                                oooO0OO.f39760OooO0o = size;
                                oooO0OO.f39764OooOO0 = 5;
                                if (lazyListState3.animateScrollToItem(i2, iRoundToInt, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it2 = o000000Var4.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo().iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (((LazyListItemInfo) next2).getIndex() == i2) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    lazyListItemInfo2 = (LazyListItemInfo) next2;
                                    if (lazyListItemInfo2 != null) {
                                        lazyListState4 = o000000Var4.f39748OooO00o;
                                        iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                        oooO0OO.f39759OooO0Oo = o000000Var4;
                                        oooO0OO.f39764OooOO0 = 6;
                                        if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } while (!z2);
                                lazyListItemInfo2 = (LazyListItemInfo) next2;
                                if (lazyListItemInfo2 != null) {
                                    lazyListState4 = o000000Var4.f39748OooO00o;
                                    iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                    oooO0OO.f39759OooO0Oo = o000000Var4;
                                    oooO0OO.f39764OooOO0 = 6;
                                    if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            o000000Var5 = o000000Var4;
                            o000000Var5.OooOO0O(null);
                            return Unit.INSTANCE;
                        } while (!z);
                        lazyListItemInfo = (LazyListItemInfo) next;
                        lazyListState3 = o000000Var4.f39748OooO00o;
                        if (lazyListItemInfo != null) {
                            iRoundToInt2 = MathKt.roundToInt((lazyListItemInfo.getSize() + o000000Var4.OooO0Oo()) * f3);
                            oooO0OO.f39759OooO0Oo = o000000Var4;
                            oooO0OO.f39764OooOO0 = 4;
                            if (lazyListState3.animateScrollToItem(i2, iRoundToInt2, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                            size = ((LazyListItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getSize() + o000000Var4.OooO0Oo();
                            iRoundToInt = MathKt.roundToInt(size * f3);
                            oooO0OO.f39759OooO0Oo = o000000Var4;
                            oooO0OO.f39761OooO0o0 = i2;
                            oooO0OO.f39762OooO0oO = f3;
                            oooO0OO.f39760OooO0o = size;
                            oooO0OO.f39764OooOO0 = 5;
                            if (lazyListState3.animateScrollToItem(i2, iRoundToInt, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it2 = o000000Var4.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo().iterator();
                            do {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    if (((LazyListItemInfo) next2).getIndex() == i2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    next2 = null;
                                }
                                lazyListItemInfo2 = (LazyListItemInfo) next2;
                                if (lazyListItemInfo2 != null) {
                                    lazyListState4 = o000000Var4.f39748OooO00o;
                                    iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                    oooO0OO.f39759OooO0Oo = o000000Var4;
                                    oooO0OO.f39764OooOO0 = 6;
                                    if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } while (!z2);
                            lazyListItemInfo2 = (LazyListItemInfo) next2;
                            if (lazyListItemInfo2 != null) {
                                lazyListState4 = o000000Var4.f39748OooO00o;
                                iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                oooO0OO.f39764OooOO0 = 6;
                                if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        o000000Var5 = o000000Var4;
                        o000000Var5.OooOO0O(null);
                        return Unit.INSTANCE;
                    case 5:
                        size = oooO0OO.f39760OooO0o;
                        f3 = oooO0OO.f39762OooO0oO;
                        i2 = oooO0OO.f39761OooO0o0;
                        o000000Var4 = oooO0OO.f39759OooO0Oo;
                        ResultKt.throwOnFailure(obj);
                        it2 = o000000Var4.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo().iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((LazyListItemInfo) next2).getIndex() == i2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                next2 = null;
                            }
                            lazyListItemInfo2 = (LazyListItemInfo) next2;
                            if (lazyListItemInfo2 != null) {
                                lazyListState4 = o000000Var4.f39748OooO00o;
                                iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                                oooO0OO.f39759OooO0Oo = o000000Var4;
                                oooO0OO.f39764OooOO0 = 6;
                                if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            o000000Var5 = o000000Var4;
                            o000000Var5.OooOO0O(null);
                            return Unit.INSTANCE;
                        } while (!z2);
                        lazyListItemInfo2 = (LazyListItemInfo) next2;
                        if (lazyListItemInfo2 != null) {
                            lazyListState4 = o000000Var4.f39748OooO00o;
                            iRoundToInt3 = MathKt.roundToInt((lazyListItemInfo2.getSize() + o000000Var4.OooO0Oo()) * f3);
                            oooO0OO.f39759OooO0Oo = o000000Var4;
                            oooO0OO.f39764OooOO0 = 6;
                            if (lazyListState4.animateScrollToItem(i2, iRoundToInt3, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        o000000Var5 = o000000Var4;
                        o000000Var5.OooOO0O(null);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            o000000Var = -2147483648;
        }
    }

    public final LazyListItemInfo OooO0O0() {
        LazyListItemInfo lazyListItemInfoPrevious;
        List<LazyListItemInfo> visibleItemsInfo = this.f39748OooO00o.getLayoutInfo().getVisibleItemsInfo();
        ListIterator<LazyListItemInfo> listIterator = visibleItemsInfo.listIterator(visibleItemsInfo.size());
        while (listIterator.hasPrevious()) {
            lazyListItemInfoPrevious = listIterator.previous();
            if (lazyListItemInfoPrevious.getIndex() == OooO0oO()) {
                return lazyListItemInfoPrevious;
            }
        }
        lazyListItemInfoPrevious = null;
        return lazyListItemInfoPrevious;
    }

    public final float OooO0OO() {
        return ((Number) this.f39753OooO0o0.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0Oo() {
        return ((Number) this.f39750OooO0OO.getValue()).intValue();
    }

    @IntRange(from = ULong.MIN_VALUE)
    public final int OooO0o() {
        return ((Number) this.f39751OooO0Oo.getValue()).intValue();
    }

    @Nullable
    public final LazyListItemInfo OooO0o0() {
        Object obj;
        LazyListLayoutInfo layoutInfo = this.f39748OooO00o.getLayoutInfo();
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                int iMin = Math.min(lazyListItemInfo.getSize() + lazyListItemInfo.getOffset(), layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding()) - Math.max(lazyListItemInfo.getOffset(), 0);
                do {
                    Object next2 = it.next();
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                    int iMin2 = Math.min(lazyListItemInfo2.getSize() + lazyListItemInfo2.getOffset(), layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding()) - Math.max(lazyListItemInfo2.getOffset(), 0);
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
        return (LazyListItemInfo) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0oO() {
        return ((Number) this.f39749OooO0O0.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object OooOO0(@IntRange(from = ULong.MIN_VALUE) int i, @FloatRange(from = -1.0d, to = 1.0d) float f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooOO0O oooOO0O;
        o000000 o000000Var;
        o000000 o000000Var2;
        LazyListItemInfo lazyListItemInfoOooO0O0;
        int index;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i2 = oooOO0O.f39770OooO0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOO0O.f39770OooO0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object obj = oooOO0O.f39767OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOO0O.f39770OooO0oo;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    f = oooOO0O.f39768OooO0o0;
                    o000000Var2 = oooOO0O.f39766OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000000Var2 = oooOO0O.f39766OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                o000000Var2.OooOO0O(null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            OooO0oo(i);
            OooO(f);
            try {
                OooOO0O(Boxing.boxInt(i));
                LazyListState lazyListState = this.f39748OooO00o;
                oooOO0O.f39766OooO0Oo = this;
                oooOO0O.f39768OooO0o0 = f;
                oooOO0O.f39770OooO0oo = 1;
                if (LazyListState.scrollToItem$default(lazyListState, i, 0, oooOO0O, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o000000Var2 = this;
            } catch (Throwable th) {
                th = th;
                o000000Var = this;
                o000000Var.OooOO0O(null);
                throw th;
            }
            LazyListItemInfo lazyListItemInfoOooO0o0 = o000000Var2.OooO0o0();
            if (lazyListItemInfoOooO0o0 != null && (index = lazyListItemInfoOooO0o0.getIndex()) != o000000Var2.OooO0oO()) {
                o000000Var2.f39749OooO0O0.setValue(Integer.valueOf(index));
            }
            if (Math.abs(f) > 1.0E-4f && (lazyListItemInfoOooO0O0 = o000000Var2.OooO0O0()) != null) {
                OooOOO0 oooOOO0 = new OooOOO0(lazyListItemInfoOooO0O0, o000000Var2, f, null);
                oooOO0O.f39766OooO0Oo = o000000Var2;
                oooOO0O.f39770OooO0oo = 2;
                if (androidx.compose.foundation.gestures.OooO0o.OooO0o0(o000000Var2, null, oooOOO0, oooOO0O, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            o000000Var2.OooOO0O(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            o000000Var = i;
        }
    }

    public final void OooOO0O(Integer num) {
        this.f39752OooO0o.setValue(num);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f) {
        return this.f39748OooO00o.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final /* synthetic */ boolean getCanScrollBackward() {
        return androidx.compose.foundation.gestures.OooO0o.OooO00o(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final /* synthetic */ boolean getCanScrollForward() {
        return androidx.compose.foundation.gestures.OooO0o.OooO0O0(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.f39748OooO00o.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public final Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = this.f39748OooO00o.scroll(mutatePriority, function2, continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    @NotNull
    public final String toString() {
        return "PagerState(pageCount=" + OooO0o() + ", currentPage=" + OooO0oO() + ", currentPageOffset=" + OooO0OO() + ')';
    }

    public o000000() {
        this(0);
    }
}
