package androidx.paging;

import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00000O;
import p101o000oo.o0000O0;
import p101o000oo.o0000O0O;
import p101o000oo.o000O;
import p101o000oo.o000O0O0;
import p101o000oo.o000OOo0;
import p101o000oo.o00O0;
import p101o000oo.o00O000;
import p101o000oo.o00O0O0;
import p101o000oo.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 FlowExt.kt\nandroidx/paging/FlowExtKt\n+ 5 Logger.kt\nandroidx/paging/LoggerKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,638:1\n391#2:639\n392#2:648\n391#2:652\n392#2:661\n391#2:674\n392#2:683\n391#2:696\n392#2:705\n391#2:718\n392#2:727\n391#2:740\n392#2:749\n391#2:763\n392#2:772\n391#2:775\n392#2:784\n391#2:797\n392#2:806\n391#2:839\n392#2:848\n391#2:861\n392#2:870\n391#2:873\n392#2:882\n107#3,8:640\n116#3:649\n115#3:650\n107#3,8:653\n116#3:662\n115#3:663\n107#3,8:675\n116#3:684\n115#3:685\n107#3,8:697\n116#3:706\n115#3:707\n107#3,8:719\n116#3:728\n115#3:729\n107#3,8:741\n116#3:750\n115#3:751\n107#3,8:764\n116#3:773\n115#3:774\n107#3,8:776\n116#3:785\n115#3:786\n107#3,8:798\n116#3:807\n115#3:808\n107#3,8:840\n116#3:849\n115#3:850\n107#3,8:862\n116#3:871\n115#3:872\n107#3,8:874\n116#3:883\n115#3:884\n99#4:651\n41#5,10:664\n41#5,10:686\n41#5,10:708\n41#5,10:730\n41#5,10:752\n41#5,10:787\n41#5,10:809\n41#5,10:819\n41#5,10:829\n41#5,10:851\n1#6:762\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n210#1:639\n210#1:648\n284#1:652\n284#1:661\n294#1:674\n294#1:683\n324#1:696\n324#1:705\n336#1:718\n336#1:727\n352#1:740\n352#1:749\n374#1:763\n374#1:772\n410#1:775\n410#1:784\n446#1:797\n446#1:806\n470#1:839\n470#1:848\n492#1:861\n492#1:870\n527#1:873\n527#1:882\n210#1:640,8\n210#1:649\n210#1:650\n284#1:653,8\n284#1:662\n284#1:663\n294#1:675,8\n294#1:684\n294#1:685\n324#1:697,8\n324#1:706\n324#1:707\n336#1:719,8\n336#1:728\n336#1:729\n352#1:741,8\n352#1:750\n352#1:751\n374#1:764,8\n374#1:773\n374#1:774\n410#1:776,8\n410#1:785\n410#1:786\n446#1:798,8\n446#1:807\n446#1:808\n470#1:840,8\n470#1:849\n470#1:850\n492#1:862,8\n492#1:871\n492#1:872\n527#1:874,8\n527#1:883\n527#1:884\n251#1:651\n288#1:664,10\n322#1:686,10\n330#1:708,10\n351#1:730,10\n358#1:752,10\n423#1:787,10\n452#1:809,10\n456#1:819,10\n469#1:829,10\n481#1:851,10\n*E\n"})
public final class o000oOoO<Key, Value> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f10392OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Key f10393OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00<Key, Value> f10394OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O000 f10395OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f10396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o000000<Key, Value> f10397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00O0O00<Key, Value> f10398OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f10399OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO0o f10400OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Channel<Oooo000<Value>> f10401OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00oO0o.OooO00o<Key, Value> f10402OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final CompletableJob f10403OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Flow<Oooo000<Value>> f10404OooOOO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {645}, m = "currentPagingState", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f10405OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000oOoO f10406OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Mutex f10407OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o00oO0o.OooO00o f10408OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f10409OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<Key, Value> f10410OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000oOoO<Key, Value> o000oooo2, Continuation<? super OooO0O0> continuation) {
            super(continuation);
            this.f10410OooO0oo = o000oooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10409OooO0oO = obj;
            this.f10405OooO |= Integer.MIN_VALUE;
            return this.f10410OooO0oo.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8}, l = {645, 284, 290, 667, 689, 326, 711, 733, 354}, m = "doInitialLoad", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "$this$withLock_u24default$iv$iv", "this", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "this", ReportItem.QualityKeyResult, "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<Key, Value> f10411OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f10412OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f10413OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f10414OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Mutex f10415OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f10416OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f10417OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000oOoO<Key, Value> o000oooo2, Continuation<? super OooO0OO> continuation) {
            super(continuation);
            this.f10411OooO = o000oooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10416OooO0oo = obj;
            this.f10417OooOO0 |= Integer.MIN_VALUE;
            return this.f10411OooO.OooO0o(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(@Nullable Object obj, @NotNull o0O0O00 pagingSource, @NotNull o00O000 config, @NotNull ConflatedEventBus$special$$inlined$mapNotNull$1 retryFlow, @Nullable o00O0 o00o1, @Nullable o000000 o000000Var, @NotNull PageFetcher$flow$1.OooO0O0.OooO00o jumpCallback) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(jumpCallback, "jumpCallback");
        this.f10393OooO00o = obj;
        this.f10394OooO0O0 = pagingSource;
        this.f10395OooO0OO = config;
        this.f10396OooO0Oo = retryFlow;
        this.f10398OooO0o0 = o00o1;
        this.f10397OooO0o = o000000Var;
        this.f10399OooO0oO = jumpCallback;
        if (!(config.f35509OooO0o == Integer.MIN_VALUE || pagingSource.OooO00o())) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.f10400OooO0oo = new OooO0o();
        this.f10392OooO = new AtomicBoolean(false);
        this.f10401OooOO0 = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.f10402OooOO0O = new o00oO0o.OooO00o<>(config);
        CompletableJob controller = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f10403OooOO0o = controller;
        o0OoOo0 block = new o0OoOo0(this, null);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f10404OooOOO0 = FlowKt.onStart(o00O0O0.OooO00o(new p101o000oo.o0Oo0oo(controller, block, null)), new o00Oo0(this, null));
    }

    public static final Object OooO00o(o000oOoO o000oooo2, Flow flow, LoadType loadType, Continuation continuation) {
        o000oooo2.getClass();
        Flow flowOooO00o = o00000O.OooO00o(flow, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, o000oooo2, loadType));
        o000O0O0 operation = new o000O0O0(loadType, null);
        Intrinsics.checkNotNullParameter(flowOooO00o, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object objCollect = FlowKt.conflate(FlowKt.flow(new p101o000oo.o00000(flowOooO00o, operation, null))).collect(new o000O(o000oooo2, loadType), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x037b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0388  */
    /* JADX WARN: Code duplicated, block: B:108:0x0393  */
    /* JADX WARN: Code duplicated, block: B:110:0x0396  */
    /* JADX WARN: Code duplicated, block: B:111:0x039c  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:119:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x040d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0420  */
    /* JADX WARN: Code duplicated, block: B:131:0x0425  */
    /* JADX WARN: Code duplicated, block: B:134:0x042c  */
    /* JADX WARN: Code duplicated, block: B:136:0x042f  */
    /* JADX WARN: Code duplicated, block: B:137:0x043e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0443  */
    /* JADX WARN: Code duplicated, block: B:142:0x044b  */
    /* JADX WARN: Code duplicated, block: B:144:0x044e  */
    /* JADX WARN: Code duplicated, block: B:147:0x046c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0470  */
    /* JADX WARN: Code duplicated, block: B:158:0x0484  */
    /* JADX WARN: Code duplicated, block: B:160:0x0489  */
    /* JADX WARN: Code duplicated, block: B:162:0x048e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0495  */
    /* JADX WARN: Code duplicated, block: B:167:0x0498  */
    /* JADX WARN: Code duplicated, block: B:171:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:175:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:182:0x0508  */
    /* JADX WARN: Code duplicated, block: B:184:0x050c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0511  */
    /* JADX WARN: Code duplicated, block: B:189:0x0519  */
    /* JADX WARN: Code duplicated, block: B:191:0x051c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0542  */
    /* JADX WARN: Code duplicated, block: B:196:0x0545  */
    /* JADX WARN: Code duplicated, block: B:200:0x056e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0586 A[Catch: all -> 0x069e, TRY_LEAVE, TryCatch #7 {all -> 0x069e, blocks: (B:201:0x057c, B:203:0x0586), top: B:285:0x057c }] */
    /* JADX WARN: Code duplicated, block: B:206:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:213:0x05d8 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:207:0x05b7, B:209:0x05c3, B:211:0x05d4, B:213:0x05d8, B:215:0x05e0, B:217:0x05e4, B:219:0x05e9, B:218:0x05e7, B:220:0x05ec, B:224:0x0620, B:14:0x0085, B:17:0x00be), top: B:274:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:217:0x05e4 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:207:0x05b7, B:209:0x05c3, B:211:0x05d4, B:213:0x05d8, B:215:0x05e0, B:217:0x05e4, B:219:0x05e9, B:218:0x05e7, B:220:0x05ec, B:224:0x0620, B:14:0x0085, B:17:0x00be), top: B:274:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:218:0x05e7 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:207:0x05b7, B:209:0x05c3, B:211:0x05d4, B:213:0x05d8, B:215:0x05e0, B:217:0x05e4, B:219:0x05e9, B:218:0x05e7, B:220:0x05ec, B:224:0x0620, B:14:0x0085, B:17:0x00be), top: B:274:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0616  */
    /* JADX WARN: Code duplicated, block: B:223:0x0618  */
    /* JADX WARN: Code duplicated, block: B:227:0x062a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0633  */
    /* JADX WARN: Code duplicated, block: B:233:0x0638  */
    /* JADX WARN: Code duplicated, block: B:236:0x0640  */
    /* JADX WARN: Code duplicated, block: B:239:0x0645 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0683  */
    /* JADX WARN: Code duplicated, block: B:249:0x068a  */
    /* JADX WARN: Code duplicated, block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0323  */
    /* JADX WARN: Code duplicated, block: B:93:0x032b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0334  */
    /* JADX WARN: Code duplicated, block: B:99:0x0339  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v18, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v32, types: [androidx.paging.o000oOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34, types: [androidx.paging.o000oOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v39, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r12v12, types: [androidx.paging.o000oOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v34, types: [androidx.paging.o000oOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [androidx.paging.o000oOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v40, types: [androidx.paging.o000oOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v24, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v34, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r13v35, types: [androidx.paging.LoadType, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v9, types: [androidx.paging.o00000] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v6, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v39, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v31, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [androidx.paging.o000oOoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26, types: [androidx.paging.o00000] */
    /* JADX WARN: Type inference failed for: r7v29, types: [androidx.paging.OooOo] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v46, types: [androidx.paging.o000oOoO] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.paging.o000oOoO] */
    /* JADX WARN: Type inference failed for: r8v30 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x0643 -> B:250:0x068f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:240:0x0647 -> B:250:0x068f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:242:0x066c -> B:277:0x066f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object OooO0O0(androidx.paging.o000oOoO r18, androidx.paging.LoadType r19, p101o000oo.o00000OO r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.o000oOoO.OooO0O0(androidx.paging.o000oOoO, androidx.paging.LoadType, o000oo.o00000OO, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object OooO0OO(o000oOoO o000oooo2, LoadType loadType, o00000 viewportHint, o00O0O o00o0o2) throws Throwable {
        o000oooo2.getClass();
        boolean z = true;
        if (OooO00o.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object objOooO0o = o000oooo2.OooO0o(o00o0o2);
            return objOooO0o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0o : Unit.INSTANCE;
        }
        if (!(viewportHint != null)) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        OooO0o oooO0o = o000oooo2.f10400OooO0oo;
        oooO0o.getClass();
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        if (loadType != LoadType.PREPEND && loadType != LoadType.APPEND) {
            z = false;
        }
        if (z) {
            oooO0o.f10251OooO00o.OooO00o(null, new OooO(loadType, viewportHint));
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public static final void OooO0Oo(o000oOoO o000oooo2, CoroutineScope coroutineScope) {
        if (o000oooo2.f10395OooO0OO.f35509OooO0o != Integer.MIN_VALUE) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o000OOo0(o000oooo2, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o00Ooo(o000oooo2, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new oo000o(o000oooo2, null), 3, null);
    }

    public static String OooO0oo(LoadType loadType, Object obj, o0O0O00.OooO0O0 oooO0O0) {
        if (oooO0O0 == null) {
            return "End " + loadType + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + obj + ". Returned " + oooO0O0;
    }

    public final Key OooO(o00oO0o<Key, Value> o00oo0o2, LoadType loadType, int i, int i2) {
        int i3;
        o00oo0o2.getClass();
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i4 = o00oO0o.OooO0O0.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i4 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i4 == 2) {
            i3 = o00oo0o2.f10446OooO0oO;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = o00oo0o2.f10447OooO0oo;
        }
        if (i != i3 || (o00oo0o2.f10450OooOO0o.OooO00o(loadType) instanceof OooOOO0.OooO00o) || i2 >= this.f10395OooO0OO.f35506OooO0O0) {
            return null;
        }
        LoadType loadType2 = LoadType.PREPEND;
        ArrayList arrayList = o00oo0o2.f10442OooO0OO;
        return loadType == loadType2 ? ((o0O0O00.OooO0O0.OooO0OO) CollectionsKt.first((List) arrayList)).f10461OooO0o0 : ((o0O0O00.OooO0O0.OooO0OO) CollectionsKt.last((List) arrayList)).f10460OooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:102:0x0201  */
    /* JADX WARN: Code duplicated, block: B:106:0x021a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x021b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0234  */
    /* JADX WARN: Code duplicated, block: B:114:0x023d  */
    /* JADX WARN: Code duplicated, block: B:121:0x024e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0252  */
    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x025d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0260  */
    /* JADX WARN: Code duplicated, block: B:133:0x0281 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x0282  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x016b A[Catch: all -> 0x0249, TRY_ENTER, TryCatch #3 {all -> 0x0249, blocks: (B:57:0x0150, B:59:0x015d, B:62:0x016b, B:63:0x0170, B:65:0x0177), top: B:167:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0177 A[Catch: all -> 0x0249, TRY_LEAVE, TryCatch #3 {all -> 0x0249, blocks: (B:57:0x0150, B:59:0x015d, B:62:0x016b, B:63:0x0170, B:65:0x0177), top: B:167:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01eb  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0108, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v34, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.Mutex] */
    public final Object OooO0o(Continuation<? super Unit> continuation) throws Throwable {
        OooO0OO oooO0OO;
        o00oO0o.OooO00o<Key, Value> oooO00o;
        o000oOoO<Key, Value> o000oooo2;
        Mutex mutex;
        o00oO0o<Key, Value> o00oo0o2;
        LoadType loadType;
        o000oOoO<Key, Value> o000oooo3;
        o0000O0 o0000o1;
        boolean z;
        o0O0O00<Key, Value> o0o0o00;
        o000oOoO<Key, Value> o000oooo4;
        o0O0O00.OooO0O0 oooO0O0;
        o0000O0 o0000o2;
        o0000O0 o0000o3;
        o00oO0o.OooO00o<Key, Value> oooO00o2;
        Mutex mutex2;
        o000oOoO<Key, Value> o000oooo5;
        Mutex mutex3;
        o0O0O00.OooO0O0 oooO0O1;
        o00oO0o.OooO00o<Key, Value> oooO00o3;
        Mutex mutex4;
        o000oOoO<Key, Value> o000oooo6;
        Mutex mutex5;
        o0O0O00.OooO0O0 oooO0O2;
        LoadType loadType2;
        boolean zOooO0o0;
        OooOo oooOo;
        Key key;
        OooOOO0.OooO0OO oooO0OO2;
        o0000O0 o0000o4;
        o0O0O00.OooO0O0 oooO0O3;
        o000oOoO<Key, Value> o000oooo7;
        o0000O0 o0000o5;
        o00oO0o.OooO00o<Key, Value> oooO00o4;
        Mutex mutex6;
        Mutex mutex7;
        o0O0O00.OooO0O0 oooO0O4;
        o000oOoO<Key, Value> o000oooo8;
        Channel<Oooo000<Value>> channel;
        Oooo000.OooO0O0 oooO0O0OooO0o;
        o0O0O00.OooO0O0.OooO0OO oooO0OO3;
        o00oO0o.OooO00o<Key, Value> oooO00o5;
        Mutex mutex8;
        Mutex mutex9;
        o000oOoO<Key, Value> o000oooo9;
        o000000<Key, Value> o000000VarOooO00o;
        o0O0O00.OooO0O0.OooO0OO oooO0OO4;
        Key key2;
        o00O0O00<Key, Value> o00o0o01;
        o00oO0o<Key, Value> o00oo0o3;
        OooOOO0.OooO00o oooO00o6;
        LoadType loadType3;
        Mutex mutex10;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f10417OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f10417OooOO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, continuation);
            }
        } else {
            oooO0OO = new OooO0OO(this, continuation);
        }
        Object objOooO0Oo = oooO0OO.f10416OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = oooO0OO.f10417OooOO0;
        boolean z2 = false;
        try {
            try {
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(objOooO0Oo);
                        oooO00o = this.f10402OooOO0O;
                        Mutex mutex11 = oooO00o.f10451OooO00o;
                        oooO0OO.f10412OooO0Oo = this;
                        oooO0OO.f10414OooO0o0 = oooO00o;
                        oooO0OO.f10413OooO0o = mutex11;
                        oooO0OO.f10417OooOO0 = 1;
                        if (mutex11.lock(null, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oooo2 = this;
                        mutex = mutex11;
                        o00oo0o2 = oooO00o.f10452OooO0O0;
                        loadType = LoadType.REFRESH;
                        oooO0OO.f10412OooO0Oo = o000oooo2;
                        oooO0OO.f10414OooO0o0 = mutex;
                        oooO0OO.f10413OooO0o = null;
                        oooO0OO.f10417OooOO0 = 2;
                        if (o000oooo2.OooOO0O(o00oo0o2, loadType, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oooo3 = o000oooo2;
                        r2 = mutex;
                        Unit unit = Unit.INSTANCE;
                        r2.unlock(null);
                        o0O0O00.OooO00o<Key> oooO00oOooO0oO = o000oooo3.OooO0oO(LoadType.REFRESH, o000oooo3.f10393OooO00o);
                        o0000o1 = o0000O0O.f35425OooO00o;
                        if (o0000o1 == null && o0000o1.OooO0O0(3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        o0o0o00 = o000oooo3.f10394OooO0O0;
                        if (z) {
                            o0000o1.OooO00o(3, "Start REFRESH with loadKey " + o000oooo3.f10393OooO00o + " on " + o0o0o00);
                        }
                        oooO0OO.f10412OooO0Oo = o000oooo3;
                        oooO0OO.f10414OooO0o0 = null;
                        oooO0OO.f10417OooOO0 = 3;
                        objOooO0Oo = o0o0o00.OooO0Oo(oooO00oOooO0oO, oooO0OO);
                        if (objOooO0Oo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oooo4 = o000oooo3;
                        oooO0O0 = (o0O0O00.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO0OO) {
                            oooO00o3 = o000oooo4.f10402OooOO0O;
                            mutex4 = oooO00o3.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo4;
                            oooO0OO.f10414OooO0o0 = oooO0O0;
                            oooO0OO.f10413OooO0o = oooO00o3;
                            oooO0OO.f10415OooO0oO = mutex4;
                            oooO0OO.f10417OooOO0 = 4;
                            if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000oooo6 = o000oooo4;
                            mutex5 = mutex4;
                            oooO0O2 = oooO0O0;
                            try {
                                o00oO0o<Key, Value> o00oo0o4 = oooO00o3.f10452OooO0O0;
                                loadType2 = LoadType.REFRESH;
                                zOooO0o0 = o00oo0o4.OooO0o0(0, loadType2, (o0O0O00.OooO0O0.OooO0OO) oooO0O2);
                                oooOo = o00oo0o4.f10450OooOO0o;
                                oooOo.OooO0OO(loadType2, OooOOO0.OooO0OO.f10272OooO0OO);
                                key = ((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10461OooO0o0;
                                oooO0OO2 = OooOOO0.OooO0OO.f10271OooO0O0;
                                if (key == null) {
                                    oooOo.OooO0OO(LoadType.PREPEND, oooO0OO2);
                                }
                                if (((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10460OooO0o == null) {
                                    oooOo.OooO0OO(LoadType.APPEND, oooO0OO2);
                                }
                                mutex5.unlock(null);
                                if (zOooO0o0) {
                                    o0000o5 = o0000O0O.f35425OooO00o;
                                    if (o0000o5 == null && o0000o5.OooO0O0(3)) {
                                        o0000o5.OooO00o(3, OooO0oo(loadType2, o000oooo6.f10393OooO00o, oooO0O2));
                                    }
                                    oooO00o4 = o000oooo6.f10402OooOO0O;
                                    mutex6 = oooO00o4.f10451OooO00o;
                                    oooO0OO.f10412OooO0Oo = o000oooo6;
                                    oooO0OO.f10414OooO0o0 = oooO0O2;
                                    oooO0OO.f10413OooO0o = oooO00o4;
                                    oooO0OO.f10415OooO0oO = mutex6;
                                    oooO0OO.f10417OooOO0 = 5;
                                    if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex7 = mutex6;
                                    oooO0O4 = oooO0O2;
                                    o000oooo8 = o000oooo6;
                                    o00oO0o<Key, Value> o00oo0o5 = oooO00o4.f10452OooO0O0;
                                    channel = o000oooo8.f10401OooOO0;
                                    oooO0O0OooO0o = o00oo0o5.OooO0o((o0O0O00.OooO0O0.OooO0OO) oooO0O4, LoadType.REFRESH);
                                    oooO0OO.f10412OooO0Oo = o000oooo8;
                                    oooO0OO.f10414OooO0o0 = oooO0O4;
                                    oooO0OO.f10413OooO0o = mutex7;
                                    oooO0OO.f10415OooO0oO = null;
                                    oooO0OO.f10417OooOO0 = 6;
                                    if (channel.send(oooO0O0OooO0o, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    oooO0O3 = oooO0O4;
                                    o000oooo7 = o000oooo8;
                                    r2 = mutex7;
                                    Unit unit2 = Unit.INSTANCE;
                                    r2.unlock(null);
                                } else {
                                    o0000o4 = o0000O0O.f35425OooO00o;
                                    if (o0000o4 == null && o0000o4.OooO0O0(2)) {
                                        o0000o4.OooO00o(2, OooO0oo(loadType2, o000oooo6.f10393OooO00o, null));
                                    }
                                    oooO0O3 = oooO0O2;
                                    o000oooo7 = o000oooo6;
                                }
                                if (o000oooo7.f10398OooO0o0 != null) {
                                    oooO0OO3 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                    if (oooO0OO3.f10461OooO0o0 != null || oooO0OO3.f10460OooO0o == null) {
                                        oooO00o5 = o000oooo7.f10402OooOO0O;
                                        mutex8 = oooO00o5.f10451OooO00o;
                                        oooO0OO.f10412OooO0Oo = o000oooo7;
                                        oooO0OO.f10414OooO0o0 = oooO0O3;
                                        oooO0OO.f10413OooO0o = oooO00o5;
                                        oooO0OO.f10415OooO0oO = mutex8;
                                        oooO0OO.f10417OooOO0 = 7;
                                        if (mutex8.lock(null, oooO0OO) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        o000oooo9 = o000oooo7;
                                        try {
                                            o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                                            mutex9.unlock(null);
                                            oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                            key2 = oooO0OO4.f10461OooO0o0;
                                            o00o0o01 = o000oooo9.f10398OooO0o0;
                                            if (key2 == null) {
                                                o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                                            }
                                            if (oooO0OO4.f10460OooO0o == null) {
                                                o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                                            }
                                        } catch (Throwable th) {
                                            mutex9.unlock(null);
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                mutex5.unlock(null);
                                throw th2;
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO00o) {
                                o0000o3 = o0000O0O.f35425OooO00o;
                                if (o0000o3 == null && o0000o3.OooO0O0(2)) {
                                    o0000o3.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                oooO00o2 = o000oooo4.f10402OooOO0O;
                                mutex2 = oooO00o2.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo4;
                                oooO0OO.f10414OooO0o0 = oooO0O0;
                                oooO0OO.f10413OooO0o = oooO00o2;
                                oooO0OO.f10415OooO0oO = mutex2;
                                oooO0OO.f10417OooOO0 = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000oooo5 = o000oooo4;
                                mutex3 = mutex2;
                                oooO0O1 = oooO0O0;
                                try {
                                    o00oo0o3 = oooO00o2.f10452OooO0O0;
                                    oooO00o6 = new OooOOO0.OooO00o(((o0O0O00.OooO0O0.OooO00o) oooO0O1).f10458OooO0Oo);
                                    loadType3 = LoadType.REFRESH;
                                    oooO0OO.f10412OooO0Oo = mutex3;
                                    oooO0OO.f10414OooO0o0 = null;
                                    oooO0OO.f10413OooO0o = null;
                                    oooO0OO.f10415OooO0oO = null;
                                    oooO0OO.f10417OooOO0 = 9;
                                    if (o000oooo5.OooOO0(o00oo0o3, loadType3, oooO00o6, oooO0OO) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex10 = mutex3;
                                    Unit unit3 = Unit.INSTANCE;
                                    mutex10.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mutex3.unlock(null);
                                    throw th;
                                }
                            }
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.C0175OooO0O0) {
                                o0000o2 = o0000O0O.f35425OooO00o;
                                if (o0000o2 != null && o0000o2.OooO0O0(2)) {
                                    z2 = true;
                                }
                                if (z2) {
                                    o0000o2.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                Job.DefaultImpls.cancel$default((Job) o000oooo4.f10403OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000oooo4.f10394OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Mutex mutex12 = (Mutex) oooO0OO.f10413OooO0o;
                        oooO00o = (o00oO0o.OooO00o) oooO0OO.f10414OooO0o0;
                        o000oooo2 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        mutex = mutex12;
                        o00oo0o2 = oooO00o.f10452OooO0O0;
                        loadType = LoadType.REFRESH;
                        oooO0OO.f10412OooO0Oo = o000oooo2;
                        oooO0OO.f10414OooO0o0 = mutex;
                        oooO0OO.f10413OooO0o = null;
                        oooO0OO.f10417OooOO0 = 2;
                        if (o000oooo2.OooOO0O(o00oo0o2, loadType, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oooo3 = o000oooo2;
                        r2 = mutex;
                        Unit unit4 = Unit.INSTANCE;
                        r2.unlock(null);
                        o0O0O00.OooO00o<Key> oooO00oOooO0oO2 = o000oooo3.OooO0oO(LoadType.REFRESH, o000oooo3.f10393OooO00o);
                        o0000o1 = o0000O0O.f35425OooO00o;
                        if (o0000o1 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        o0o0o00 = o000oooo3.f10394OooO0O0;
                        if (z) {
                            o0000o1.OooO00o(3, "Start REFRESH with loadKey " + o000oooo3.f10393OooO00o + " on " + o0o0o00);
                        }
                        oooO0OO.f10412OooO0Oo = o000oooo3;
                        oooO0OO.f10414OooO0o0 = null;
                        oooO0OO.f10417OooOO0 = 3;
                        objOooO0Oo = o0o0o00.OooO0Oo(oooO00oOooO0oO2, oooO0OO);
                        if (objOooO0Oo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oooo4 = o000oooo3;
                        oooO0O0 = (o0O0O00.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO0OO) {
                            oooO00o3 = o000oooo4.f10402OooOO0O;
                            mutex4 = oooO00o3.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo4;
                            oooO0OO.f10414OooO0o0 = oooO0O0;
                            oooO0OO.f10413OooO0o = oooO00o3;
                            oooO0OO.f10415OooO0oO = mutex4;
                            oooO0OO.f10417OooOO0 = 4;
                            if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000oooo6 = o000oooo4;
                            mutex5 = mutex4;
                            oooO0O2 = oooO0O0;
                            o00oO0o<Key, Value> o00oo0o6 = oooO00o3.f10452OooO0O0;
                            loadType2 = LoadType.REFRESH;
                            zOooO0o0 = o00oo0o6.OooO0o0(0, loadType2, (o0O0O00.OooO0O0.OooO0OO) oooO0O2);
                            oooOo = o00oo0o6.f10450OooOO0o;
                            oooOo.OooO0OO(loadType2, OooOOO0.OooO0OO.f10272OooO0OO);
                            key = ((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10461OooO0o0;
                            oooO0OO2 = OooOOO0.OooO0OO.f10271OooO0O0;
                            if (key == null) {
                                oooOo.OooO0OO(LoadType.PREPEND, oooO0OO2);
                            }
                            if (((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10460OooO0o == null) {
                                oooOo.OooO0OO(LoadType.APPEND, oooO0OO2);
                            }
                            mutex5.unlock(null);
                            if (zOooO0o0) {
                                o0000o5 = o0000O0O.f35425OooO00o;
                                if (o0000o5 == null && o0000o5.OooO0O0(3)) {
                                    o0000o5.OooO00o(3, OooO0oo(loadType2, o000oooo6.f10393OooO00o, oooO0O2));
                                }
                                oooO00o4 = o000oooo6.f10402OooOO0O;
                                mutex6 = oooO00o4.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo6;
                                oooO0OO.f10414OooO0o0 = oooO0O2;
                                oooO0OO.f10413OooO0o = oooO00o4;
                                oooO0OO.f10415OooO0oO = mutex6;
                                oooO0OO.f10417OooOO0 = 5;
                                if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex7 = mutex6;
                                oooO0O4 = oooO0O2;
                                o000oooo8 = o000oooo6;
                                o00oO0o<Key, Value> o00oo0o7 = oooO00o4.f10452OooO0O0;
                                channel = o000oooo8.f10401OooOO0;
                                oooO0O0OooO0o = o00oo0o7.OooO0o((o0O0O00.OooO0O0.OooO0OO) oooO0O4, LoadType.REFRESH);
                                oooO0OO.f10412OooO0Oo = o000oooo8;
                                oooO0OO.f10414OooO0o0 = oooO0O4;
                                oooO0OO.f10413OooO0o = mutex7;
                                oooO0OO.f10415OooO0oO = null;
                                oooO0OO.f10417OooOO0 = 6;
                                if (channel.send(oooO0O0OooO0o, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooO0O3 = oooO0O4;
                                o000oooo7 = o000oooo8;
                                r2 = mutex7;
                                Unit unit5 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                o0000o4 = o0000O0O.f35425OooO00o;
                                if (o0000o4 == null && o0000o4.OooO0O0(2)) {
                                    o0000o4.OooO00o(2, OooO0oo(loadType2, o000oooo6.f10393OooO00o, null));
                                }
                                oooO0O3 = oooO0O2;
                                o000oooo7 = o000oooo6;
                            }
                            if (o000oooo7.f10398OooO0o0 != null) {
                                oooO0OO3 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                if (oooO0OO3.f10461OooO0o0 != null) {
                                }
                                oooO00o5 = o000oooo7.f10402OooOO0O;
                                mutex8 = oooO00o5.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo7;
                                oooO0OO.f10414OooO0o0 = oooO0O3;
                                oooO0OO.f10413OooO0o = oooO00o5;
                                oooO0OO.f10415OooO0oO = mutex8;
                                oooO0OO.f10417OooOO0 = 7;
                                if (mutex8.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex9 = mutex8;
                                o000oooo9 = o000oooo7;
                                o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                                mutex9.unlock(null);
                                oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                key2 = oooO0OO4.f10461OooO0o0;
                                o00o0o01 = o000oooo9.f10398OooO0o0;
                                if (key2 == null) {
                                    o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                                }
                                if (oooO0OO4.f10460OooO0o == null) {
                                    o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                                }
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO00o) {
                                o0000o3 = o0000O0O.f35425OooO00o;
                                if (o0000o3 == null && o0000o3.OooO0O0(2)) {
                                    o0000o3.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                oooO00o2 = o000oooo4.f10402OooOO0O;
                                mutex2 = oooO00o2.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo4;
                                oooO0OO.f10414OooO0o0 = oooO0O0;
                                oooO0OO.f10413OooO0o = oooO00o2;
                                oooO0OO.f10415OooO0oO = mutex2;
                                oooO0OO.f10417OooOO0 = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000oooo5 = o000oooo4;
                                mutex3 = mutex2;
                                oooO0O1 = oooO0O0;
                                o00oo0o3 = oooO00o2.f10452OooO0O0;
                                oooO00o6 = new OooOOO0.OooO00o(((o0O0O00.OooO0O0.OooO00o) oooO0O1).f10458OooO0Oo);
                                loadType3 = LoadType.REFRESH;
                                oooO0OO.f10412OooO0Oo = mutex3;
                                oooO0OO.f10414OooO0o0 = null;
                                oooO0OO.f10413OooO0o = null;
                                oooO0OO.f10415OooO0oO = null;
                                oooO0OO.f10417OooOO0 = 9;
                                if (o000oooo5.OooOO0(o00oo0o3, loadType3, oooO00o6, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex10 = mutex3;
                                Unit unit6 = Unit.INSTANCE;
                                mutex10.unlock(null);
                                return Unit.INSTANCE;
                            }
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.C0175OooO0O0) {
                                o0000o2 = o0000O0O.f35425OooO00o;
                                if (o0000o2 != null) {
                                    z2 = true;
                                }
                                if (z2) {
                                    o0000o2.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                Job.DefaultImpls.cancel$default((Job) o000oooo4.f10403OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000oooo4.f10394OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Mutex mutex13 = (Mutex) oooO0OO.f10414OooO0o0;
                        o000oooo3 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        r2 = mutex13;
                        Unit unit7 = Unit.INSTANCE;
                        r2.unlock(null);
                        o0O0O00.OooO00o<Key> oooO00oOooO0oO3 = o000oooo3.OooO0oO(LoadType.REFRESH, o000oooo3.f10393OooO00o);
                        o0000o1 = o0000O0O.f35425OooO00o;
                        if (o0000o1 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        o0o0o00 = o000oooo3.f10394OooO0O0;
                        if (z) {
                            o0000o1.OooO00o(3, "Start REFRESH with loadKey " + o000oooo3.f10393OooO00o + " on " + o0o0o00);
                        }
                        oooO0OO.f10412OooO0Oo = o000oooo3;
                        oooO0OO.f10414OooO0o0 = null;
                        oooO0OO.f10417OooOO0 = 3;
                        objOooO0Oo = o0o0o00.OooO0Oo(oooO00oOooO0oO3, oooO0OO);
                        if (objOooO0Oo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000oooo4 = o000oooo3;
                        oooO0O0 = (o0O0O00.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO0OO) {
                            oooO00o3 = o000oooo4.f10402OooOO0O;
                            mutex4 = oooO00o3.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo4;
                            oooO0OO.f10414OooO0o0 = oooO0O0;
                            oooO0OO.f10413OooO0o = oooO00o3;
                            oooO0OO.f10415OooO0oO = mutex4;
                            oooO0OO.f10417OooOO0 = 4;
                            if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000oooo6 = o000oooo4;
                            mutex5 = mutex4;
                            oooO0O2 = oooO0O0;
                            o00oO0o<Key, Value> o00oo0o8 = oooO00o3.f10452OooO0O0;
                            loadType2 = LoadType.REFRESH;
                            zOooO0o0 = o00oo0o8.OooO0o0(0, loadType2, (o0O0O00.OooO0O0.OooO0OO) oooO0O2);
                            oooOo = o00oo0o8.f10450OooOO0o;
                            oooOo.OooO0OO(loadType2, OooOOO0.OooO0OO.f10272OooO0OO);
                            key = ((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10461OooO0o0;
                            oooO0OO2 = OooOOO0.OooO0OO.f10271OooO0O0;
                            if (key == null) {
                                oooOo.OooO0OO(LoadType.PREPEND, oooO0OO2);
                            }
                            if (((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10460OooO0o == null) {
                                oooOo.OooO0OO(LoadType.APPEND, oooO0OO2);
                            }
                            mutex5.unlock(null);
                            if (zOooO0o0) {
                                o0000o5 = o0000O0O.f35425OooO00o;
                                if (o0000o5 == null && o0000o5.OooO0O0(3)) {
                                    o0000o5.OooO00o(3, OooO0oo(loadType2, o000oooo6.f10393OooO00o, oooO0O2));
                                }
                                oooO00o4 = o000oooo6.f10402OooOO0O;
                                mutex6 = oooO00o4.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo6;
                                oooO0OO.f10414OooO0o0 = oooO0O2;
                                oooO0OO.f10413OooO0o = oooO00o4;
                                oooO0OO.f10415OooO0oO = mutex6;
                                oooO0OO.f10417OooOO0 = 5;
                                if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex7 = mutex6;
                                oooO0O4 = oooO0O2;
                                o000oooo8 = o000oooo6;
                                o00oO0o<Key, Value> o00oo0o9 = oooO00o4.f10452OooO0O0;
                                channel = o000oooo8.f10401OooOO0;
                                oooO0O0OooO0o = o00oo0o9.OooO0o((o0O0O00.OooO0O0.OooO0OO) oooO0O4, LoadType.REFRESH);
                                oooO0OO.f10412OooO0Oo = o000oooo8;
                                oooO0OO.f10414OooO0o0 = oooO0O4;
                                oooO0OO.f10413OooO0o = mutex7;
                                oooO0OO.f10415OooO0oO = null;
                                oooO0OO.f10417OooOO0 = 6;
                                if (channel.send(oooO0O0OooO0o, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooO0O3 = oooO0O4;
                                o000oooo7 = o000oooo8;
                                r2 = mutex7;
                                Unit unit8 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                o0000o4 = o0000O0O.f35425OooO00o;
                                if (o0000o4 == null && o0000o4.OooO0O0(2)) {
                                    o0000o4.OooO00o(2, OooO0oo(loadType2, o000oooo6.f10393OooO00o, null));
                                }
                                oooO0O3 = oooO0O2;
                                o000oooo7 = o000oooo6;
                            }
                            if (o000oooo7.f10398OooO0o0 != null) {
                                oooO0OO3 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                if (oooO0OO3.f10461OooO0o0 != null) {
                                }
                                oooO00o5 = o000oooo7.f10402OooOO0O;
                                mutex8 = oooO00o5.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo7;
                                oooO0OO.f10414OooO0o0 = oooO0O3;
                                oooO0OO.f10413OooO0o = oooO00o5;
                                oooO0OO.f10415OooO0oO = mutex8;
                                oooO0OO.f10417OooOO0 = 7;
                                if (mutex8.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex9 = mutex8;
                                o000oooo9 = o000oooo7;
                                o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                                mutex9.unlock(null);
                                oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                key2 = oooO0OO4.f10461OooO0o0;
                                o00o0o01 = o000oooo9.f10398OooO0o0;
                                if (key2 == null) {
                                    o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                                }
                                if (oooO0OO4.f10460OooO0o == null) {
                                    o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                                }
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO00o) {
                                o0000o3 = o0000O0O.f35425OooO00o;
                                if (o0000o3 == null && o0000o3.OooO0O0(2)) {
                                    o0000o3.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                oooO00o2 = o000oooo4.f10402OooOO0O;
                                mutex2 = oooO00o2.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo4;
                                oooO0OO.f10414OooO0o0 = oooO0O0;
                                oooO0OO.f10413OooO0o = oooO00o2;
                                oooO0OO.f10415OooO0oO = mutex2;
                                oooO0OO.f10417OooOO0 = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000oooo5 = o000oooo4;
                                mutex3 = mutex2;
                                oooO0O1 = oooO0O0;
                                o00oo0o3 = oooO00o2.f10452OooO0O0;
                                oooO00o6 = new OooOOO0.OooO00o(((o0O0O00.OooO0O0.OooO00o) oooO0O1).f10458OooO0Oo);
                                loadType3 = LoadType.REFRESH;
                                oooO0OO.f10412OooO0Oo = mutex3;
                                oooO0OO.f10414OooO0o0 = null;
                                oooO0OO.f10413OooO0o = null;
                                oooO0OO.f10415OooO0oO = null;
                                oooO0OO.f10417OooOO0 = 9;
                                if (o000oooo5.OooOO0(o00oo0o3, loadType3, oooO00o6, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex10 = mutex3;
                                Unit unit9 = Unit.INSTANCE;
                                mutex10.unlock(null);
                                return Unit.INSTANCE;
                            }
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.C0175OooO0O0) {
                                o0000o2 = o0000O0O.f35425OooO00o;
                                if (o0000o2 != null) {
                                    z2 = true;
                                }
                                if (z2) {
                                    o0000o2.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                Job.DefaultImpls.cancel$default((Job) o000oooo4.f10403OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000oooo4.f10394OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 3:
                        o000oooo4 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        oooO0O0 = (o0O0O00.OooO0O0) objOooO0Oo;
                        if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO0OO) {
                            oooO00o3 = o000oooo4.f10402OooOO0O;
                            mutex4 = oooO00o3.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo4;
                            oooO0OO.f10414OooO0o0 = oooO0O0;
                            oooO0OO.f10413OooO0o = oooO00o3;
                            oooO0OO.f10415OooO0oO = mutex4;
                            oooO0OO.f10417OooOO0 = 4;
                            if (mutex4.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000oooo6 = o000oooo4;
                            mutex5 = mutex4;
                            oooO0O2 = oooO0O0;
                            o00oO0o<Key, Value> o00oo0o10 = oooO00o3.f10452OooO0O0;
                            loadType2 = LoadType.REFRESH;
                            zOooO0o0 = o00oo0o10.OooO0o0(0, loadType2, (o0O0O00.OooO0O0.OooO0OO) oooO0O2);
                            oooOo = o00oo0o10.f10450OooOO0o;
                            oooOo.OooO0OO(loadType2, OooOOO0.OooO0OO.f10272OooO0OO);
                            key = ((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10461OooO0o0;
                            oooO0OO2 = OooOOO0.OooO0OO.f10271OooO0O0;
                            if (key == null) {
                                oooOo.OooO0OO(LoadType.PREPEND, oooO0OO2);
                            }
                            if (((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10460OooO0o == null) {
                                oooOo.OooO0OO(LoadType.APPEND, oooO0OO2);
                            }
                            mutex5.unlock(null);
                            if (zOooO0o0) {
                                o0000o5 = o0000O0O.f35425OooO00o;
                                if (o0000o5 == null && o0000o5.OooO0O0(3)) {
                                    o0000o5.OooO00o(3, OooO0oo(loadType2, o000oooo6.f10393OooO00o, oooO0O2));
                                }
                                oooO00o4 = o000oooo6.f10402OooOO0O;
                                mutex6 = oooO00o4.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo6;
                                oooO0OO.f10414OooO0o0 = oooO0O2;
                                oooO0OO.f10413OooO0o = oooO00o4;
                                oooO0OO.f10415OooO0oO = mutex6;
                                oooO0OO.f10417OooOO0 = 5;
                                if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex7 = mutex6;
                                oooO0O4 = oooO0O2;
                                o000oooo8 = o000oooo6;
                                o00oO0o<Key, Value> o00oo0o11 = oooO00o4.f10452OooO0O0;
                                channel = o000oooo8.f10401OooOO0;
                                oooO0O0OooO0o = o00oo0o11.OooO0o((o0O0O00.OooO0O0.OooO0OO) oooO0O4, LoadType.REFRESH);
                                oooO0OO.f10412OooO0Oo = o000oooo8;
                                oooO0OO.f10414OooO0o0 = oooO0O4;
                                oooO0OO.f10413OooO0o = mutex7;
                                oooO0OO.f10415OooO0oO = null;
                                oooO0OO.f10417OooOO0 = 6;
                                if (channel.send(oooO0O0OooO0o, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooO0O3 = oooO0O4;
                                o000oooo7 = o000oooo8;
                                r2 = mutex7;
                                Unit unit10 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                o0000o4 = o0000O0O.f35425OooO00o;
                                if (o0000o4 == null && o0000o4.OooO0O0(2)) {
                                    o0000o4.OooO00o(2, OooO0oo(loadType2, o000oooo6.f10393OooO00o, null));
                                }
                                oooO0O3 = oooO0O2;
                                o000oooo7 = o000oooo6;
                            }
                            if (o000oooo7.f10398OooO0o0 != null) {
                                oooO0OO3 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                if (oooO0OO3.f10461OooO0o0 != null) {
                                }
                                oooO00o5 = o000oooo7.f10402OooOO0O;
                                mutex8 = oooO00o5.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo7;
                                oooO0OO.f10414OooO0o0 = oooO0O3;
                                oooO0OO.f10413OooO0o = oooO00o5;
                                oooO0OO.f10415OooO0oO = mutex8;
                                oooO0OO.f10417OooOO0 = 7;
                                if (mutex8.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex9 = mutex8;
                                o000oooo9 = o000oooo7;
                                o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                                mutex9.unlock(null);
                                oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                                key2 = oooO0OO4.f10461OooO0o0;
                                o00o0o01 = o000oooo9.f10398OooO0o0;
                                if (key2 == null) {
                                    o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                                }
                                if (oooO0OO4.f10460OooO0o == null) {
                                    o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                                }
                            }
                            break;
                        } else {
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.OooO00o) {
                                o0000o3 = o0000O0O.f35425OooO00o;
                                if (o0000o3 == null && o0000o3.OooO0O0(2)) {
                                    o0000o3.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                oooO00o2 = o000oooo4.f10402OooOO0O;
                                mutex2 = oooO00o2.f10451OooO00o;
                                oooO0OO.f10412OooO0Oo = o000oooo4;
                                oooO0OO.f10414OooO0o0 = oooO0O0;
                                oooO0OO.f10413OooO0o = oooO00o2;
                                oooO0OO.f10415OooO0oO = mutex2;
                                oooO0OO.f10417OooOO0 = 8;
                                if (mutex2.lock(null, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                o000oooo5 = o000oooo4;
                                mutex3 = mutex2;
                                oooO0O1 = oooO0O0;
                                o00oo0o3 = oooO00o2.f10452OooO0O0;
                                oooO00o6 = new OooOOO0.OooO00o(((o0O0O00.OooO0O0.OooO00o) oooO0O1).f10458OooO0Oo);
                                loadType3 = LoadType.REFRESH;
                                oooO0OO.f10412OooO0Oo = mutex3;
                                oooO0OO.f10414OooO0o0 = null;
                                oooO0OO.f10413OooO0o = null;
                                oooO0OO.f10415OooO0oO = null;
                                oooO0OO.f10417OooOO0 = 9;
                                if (o000oooo5.OooOO0(o00oo0o3, loadType3, oooO00o6, oooO0OO) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex10 = mutex3;
                                Unit unit11 = Unit.INSTANCE;
                                mutex10.unlock(null);
                                return Unit.INSTANCE;
                            }
                            if (oooO0O0 instanceof o0O0O00.OooO0O0.C0175OooO0O0) {
                                o0000o2 = o0000O0O.f35425OooO00o;
                                if (o0000o2 != null) {
                                    z2 = true;
                                }
                                if (z2) {
                                    o0000o2.OooO00o(2, OooO0oo(LoadType.REFRESH, o000oooo4.f10393OooO00o, oooO0O0));
                                }
                                Job.DefaultImpls.cancel$default((Job) o000oooo4.f10403OooOO0o, (CancellationException) null, 1, (Object) null);
                                o000oooo4.f10394OooO0O0.OooO0OO();
                            }
                        }
                        return Unit.INSTANCE;
                    case 4:
                        mutex5 = oooO0OO.f10415OooO0oO;
                        oooO00o3 = (o00oO0o.OooO00o) oooO0OO.f10413OooO0o;
                        oooO0O2 = (o0O0O00.OooO0O0) oooO0OO.f10414OooO0o0;
                        o000oooo6 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        o00oO0o<Key, Value> o00oo0o12 = oooO00o3.f10452OooO0O0;
                        loadType2 = LoadType.REFRESH;
                        zOooO0o0 = o00oo0o12.OooO0o0(0, loadType2, (o0O0O00.OooO0O0.OooO0OO) oooO0O2);
                        oooOo = o00oo0o12.f10450OooOO0o;
                        oooOo.OooO0OO(loadType2, OooOOO0.OooO0OO.f10272OooO0OO);
                        key = ((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10461OooO0o0;
                        oooO0OO2 = OooOOO0.OooO0OO.f10271OooO0O0;
                        if (key == null) {
                            oooOo.OooO0OO(LoadType.PREPEND, oooO0OO2);
                        }
                        if (((o0O0O00.OooO0O0.OooO0OO) oooO0O2).f10460OooO0o == null) {
                            oooOo.OooO0OO(LoadType.APPEND, oooO0OO2);
                            break;
                        }
                        mutex5.unlock(null);
                        if (zOooO0o0) {
                            o0000o5 = o0000O0O.f35425OooO00o;
                            if (o0000o5 == null && o0000o5.OooO0O0(3)) {
                                o0000o5.OooO00o(3, OooO0oo(loadType2, o000oooo6.f10393OooO00o, oooO0O2));
                            }
                            oooO00o4 = o000oooo6.f10402OooOO0O;
                            mutex6 = oooO00o4.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo6;
                            oooO0OO.f10414OooO0o0 = oooO0O2;
                            oooO0OO.f10413OooO0o = oooO00o4;
                            oooO0OO.f10415OooO0oO = mutex6;
                            oooO0OO.f10417OooOO0 = 5;
                            if (mutex6.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex7 = mutex6;
                            oooO0O4 = oooO0O2;
                            o000oooo8 = o000oooo6;
                            o00oO0o<Key, Value> o00oo0o13 = oooO00o4.f10452OooO0O0;
                            channel = o000oooo8.f10401OooOO0;
                            oooO0O0OooO0o = o00oo0o13.OooO0o((o0O0O00.OooO0O0.OooO0OO) oooO0O4, LoadType.REFRESH);
                            oooO0OO.f10412OooO0Oo = o000oooo8;
                            oooO0OO.f10414OooO0o0 = oooO0O4;
                            oooO0OO.f10413OooO0o = mutex7;
                            oooO0OO.f10415OooO0oO = null;
                            oooO0OO.f10417OooOO0 = 6;
                            if (channel.send(oooO0O0OooO0o, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            oooO0O3 = oooO0O4;
                            o000oooo7 = o000oooo8;
                            r2 = mutex7;
                            Unit unit12 = Unit.INSTANCE;
                            r2.unlock(null);
                        } else {
                            o0000o4 = o0000O0O.f35425OooO00o;
                            if (o0000o4 == null && o0000o4.OooO0O0(2)) {
                                o0000o4.OooO00o(2, OooO0oo(loadType2, o000oooo6.f10393OooO00o, null));
                            }
                            oooO0O3 = oooO0O2;
                            o000oooo7 = o000oooo6;
                        }
                        if (o000oooo7.f10398OooO0o0 != null) {
                            oooO0OO3 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                            if (oooO0OO3.f10461OooO0o0 != null) {
                            }
                            oooO00o5 = o000oooo7.f10402OooOO0O;
                            mutex8 = oooO00o5.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo7;
                            oooO0OO.f10414OooO0o0 = oooO0O3;
                            oooO0OO.f10413OooO0o = oooO00o5;
                            oooO0OO.f10415OooO0oO = mutex8;
                            oooO0OO.f10417OooOO0 = 7;
                            if (mutex8.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex9 = mutex8;
                            o000oooo9 = o000oooo7;
                            o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                            mutex9.unlock(null);
                            oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                            key2 = oooO0OO4.f10461OooO0o0;
                            o00o0o01 = o000oooo9.f10398OooO0o0;
                            if (key2 == null) {
                                o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                            }
                            if (oooO0OO4.f10460OooO0o == null) {
                                o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        Mutex mutex14 = oooO0OO.f10415OooO0oO;
                        oooO00o4 = (o00oO0o.OooO00o) oooO0OO.f10413OooO0o;
                        oooO0O4 = (o0O0O00.OooO0O0) oooO0OO.f10414OooO0o0;
                        o000oooo8 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        mutex7 = mutex14;
                        o00oO0o<Key, Value> o00oo0o14 = oooO00o4.f10452OooO0O0;
                        channel = o000oooo8.f10401OooOO0;
                        oooO0O0OooO0o = o00oo0o14.OooO0o((o0O0O00.OooO0O0.OooO0OO) oooO0O4, LoadType.REFRESH);
                        oooO0OO.f10412OooO0Oo = o000oooo8;
                        oooO0OO.f10414OooO0o0 = oooO0O4;
                        oooO0OO.f10413OooO0o = mutex7;
                        oooO0OO.f10415OooO0oO = null;
                        oooO0OO.f10417OooOO0 = 6;
                        if (channel.send(oooO0O0OooO0o, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oooO0O3 = oooO0O4;
                        o000oooo7 = o000oooo8;
                        r2 = mutex7;
                        Unit unit13 = Unit.INSTANCE;
                        r2.unlock(null);
                        if (o000oooo7.f10398OooO0o0 != null) {
                            oooO0OO3 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                            if (oooO0OO3.f10461OooO0o0 != null) {
                            }
                            oooO00o5 = o000oooo7.f10402OooOO0O;
                            mutex8 = oooO00o5.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo7;
                            oooO0OO.f10414OooO0o0 = oooO0O3;
                            oooO0OO.f10413OooO0o = oooO00o5;
                            oooO0OO.f10415OooO0oO = mutex8;
                            oooO0OO.f10417OooOO0 = 7;
                            if (mutex8.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex9 = mutex8;
                            o000oooo9 = o000oooo7;
                            o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                            mutex9.unlock(null);
                            oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                            key2 = oooO0OO4.f10461OooO0o0;
                            o00o0o01 = o000oooo9.f10398OooO0o0;
                            if (key2 == null) {
                                o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                            }
                            if (oooO0OO4.f10460OooO0o == null) {
                                o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        Mutex mutex15 = (Mutex) oooO0OO.f10413OooO0o;
                        oooO0O3 = (o0O0O00.OooO0O0) oooO0OO.f10414OooO0o0;
                        o000oooo7 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        r2 = mutex15;
                        Unit unit14 = Unit.INSTANCE;
                        r2.unlock(null);
                        if (o000oooo7.f10398OooO0o0 != null) {
                            oooO0OO3 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                            if (oooO0OO3.f10461OooO0o0 != null) {
                            }
                            oooO00o5 = o000oooo7.f10402OooOO0O;
                            mutex8 = oooO00o5.f10451OooO00o;
                            oooO0OO.f10412OooO0Oo = o000oooo7;
                            oooO0OO.f10414OooO0o0 = oooO0O3;
                            oooO0OO.f10413OooO0o = oooO00o5;
                            oooO0OO.f10415OooO0oO = mutex8;
                            oooO0OO.f10417OooOO0 = 7;
                            if (mutex8.lock(null, oooO0OO) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex9 = mutex8;
                            o000oooo9 = o000oooo7;
                            o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                            mutex9.unlock(null);
                            oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                            key2 = oooO0OO4.f10461OooO0o0;
                            o00o0o01 = o000oooo9.f10398OooO0o0;
                            if (key2 == null) {
                                o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                            }
                            if (oooO0OO4.f10460OooO0o == null) {
                                o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 7:
                        mutex9 = oooO0OO.f10415OooO0oO;
                        oooO00o5 = (o00oO0o.OooO00o) oooO0OO.f10413OooO0o;
                        oooO0O3 = (o0O0O00.OooO0O0) oooO0OO.f10414OooO0o0;
                        o000oooo9 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        o000000VarOooO00o = oooO00o5.f10452OooO0O0.OooO00o(o000oooo9.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
                        mutex9.unlock(null);
                        oooO0OO4 = (o0O0O00.OooO0O0.OooO0OO) oooO0O3;
                        key2 = oooO0OO4.f10461OooO0o0;
                        o00o0o01 = o000oooo9.f10398OooO0o0;
                        if (key2 == null) {
                            o00o0o01.OooO0o0(LoadType.PREPEND, o000000VarOooO00o);
                        }
                        if (oooO0OO4.f10460OooO0o == null) {
                            o00o0o01.OooO0o0(LoadType.APPEND, o000000VarOooO00o);
                        }
                        return Unit.INSTANCE;
                    case 8:
                        mutex3 = oooO0OO.f10415OooO0oO;
                        oooO00o2 = (o00oO0o.OooO00o) oooO0OO.f10413OooO0o;
                        oooO0O1 = (o0O0O00.OooO0O0) oooO0OO.f10414OooO0o0;
                        o000oooo5 = (o000oOoO) oooO0OO.f10412OooO0Oo;
                        ResultKt.throwOnFailure(objOooO0Oo);
                        o00oo0o3 = oooO00o2.f10452OooO0O0;
                        oooO00o6 = new OooOOO0.OooO00o(((o0O0O00.OooO0O0.OooO00o) oooO0O1).f10458OooO0Oo);
                        loadType3 = LoadType.REFRESH;
                        oooO0OO.f10412OooO0Oo = mutex3;
                        oooO0OO.f10414OooO0o0 = null;
                        oooO0OO.f10413OooO0o = null;
                        oooO0OO.f10415OooO0oO = null;
                        oooO0OO.f10417OooOO0 = 9;
                        if (o000oooo5.OooOO0(o00oo0o3, loadType3, oooO00o6, oooO0OO) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex10 = mutex3;
                        Unit unit15 = Unit.INSTANCE;
                        mutex10.unlock(null);
                        return Unit.INSTANCE;
                    case 9:
                        mutex10 = (Mutex) oooO0OO.f10412OooO0Oo;
                        try {
                            ResultKt.throwOnFailure(objOooO0Oo);
                            Unit unit16 = Unit.INSTANCE;
                            mutex10.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                            mutex3 = mutex10;
                            mutex3.unlock(null);
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th5) {
                r2.unlock(null);
                throw th5;
            }
        } catch (Throwable th6) {
            r2.unlock(null);
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super o000000<Key, Value>> continuation) {
        OooO0O0 oooO0O0;
        o00oO0o.OooO00o<Key, Value> oooO00o;
        o000oOoO<Key, Value> o000oooo2;
        Mutex mutex;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f10405OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f10405OooO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(this, continuation);
        }
        Object obj = oooO0O0.f10409OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f10405OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO00o = this.f10402OooOO0O;
            Mutex mutex2 = oooO00o.f10451OooO00o;
            oooO0O0.f10406OooO0Oo = this;
            oooO0O0.f10408OooO0o0 = oooO00o;
            oooO0O0.f10407OooO0o = mutex2;
            oooO0O0.f10405OooO = 1;
            if (mutex2.lock(null, oooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000oooo2 = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = oooO0O0.f10407OooO0o;
            oooO00o = oooO0O0.f10408OooO0o0;
            o000oooo2 = oooO0O0.f10406OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return oooO00o.f10452OooO0O0.OooO00o(o000oooo2.f10400OooO0oo.f10251OooO00o.f10256OooO0OO);
        } finally {
            mutex.unlock(null);
        }
    }

    public final o0O0O00.OooO00o<Key> OooO0oO(LoadType loadType, Key key) {
        LoadType loadType2 = LoadType.REFRESH;
        o00O000 o00o001 = this.f10395OooO0OO;
        int i = loadType == loadType2 ? o00o001.f35508OooO0Oo : o00o001.f35505OooO00o;
        boolean z = o00o001.f35507OooO0OO;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i2 = o000OOo.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i2 == 1) {
            return new o0O0O00.OooO00o.OooO0OO(key, i, z);
        }
        if (i2 == 2) {
            if (key != null) {
                return new o0O0O00.OooO00o.OooO0O0(key, i, z);
            }
            throw new IllegalArgumentException("key cannot be null for prepend".toString());
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (key != null) {
            return new o0O0O00.OooO00o.C0174OooO00o(key, i, z);
        }
        throw new IllegalArgumentException("key cannot be null for append".toString());
    }

    public final Object OooOO0(o00oO0o o00oo0o2, LoadType loadType, OooOOO0.OooO00o oooO00o, ContinuationImpl continuationImpl) {
        if (Intrinsics.areEqual(o00oo0o2.f10450OooOO0o.OooO00o(loadType), oooO00o)) {
            return Unit.INSTANCE;
        }
        OooOo oooOo = o00oo0o2.f10450OooOO0o;
        oooOo.OooO0OO(loadType, oooO00o);
        Object objSend = this.f10401OooOO0.send(new Oooo000.OooO0OO(oooOo.OooO0Oo(), null), continuationImpl);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    public final Object OooOO0O(o00oO0o o00oo0o2, LoadType loadType, ContinuationImpl continuationImpl) {
        OooOOO0 oooOOO0OooO00o = o00oo0o2.f10450OooOO0o.OooO00o(loadType);
        OooOOO0.OooO0O0 oooO0O0 = OooOOO0.OooO0O0.f10270OooO0O0;
        if (Intrinsics.areEqual(oooOOO0OooO00o, oooO0O0)) {
            return Unit.INSTANCE;
        }
        OooOo oooOo = o00oo0o2.f10450OooOO0o;
        oooOo.OooO0OO(loadType, oooO0O0);
        Object objSend = this.f10401OooOO0.send(new Oooo000.OooO0OO(oooOo.OooO0Oo(), null), continuationImpl);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
