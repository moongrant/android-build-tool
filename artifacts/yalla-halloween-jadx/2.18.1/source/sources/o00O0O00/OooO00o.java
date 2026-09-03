package o00O0O00;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.VisibleForTesting;
import coil.decode.DataSource;
import coil.memory.MemoryCache$Key;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o00O0.OooOO0O;
import o00O0O0O.OooOo;
import o00O0O0O.o00Oo0;
import o00O0O0O.o00Ooo;
import o00O0OO0.OooOOO0;
import o00O0OO0.OooOOOO;
import o00O0OO0.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p113o00O00Oo.OooO0o;
import p115o00O00oO.Oooo0;
import p115o00O00oO.Oooo000;
import p115o00O00oO.o000oOoO;
import p119o00O0Oo0.o0OO00O;
import p119o00O0Oo0.o0ooOOo;
import p119o00O0Oo0.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements o00O0O00.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30422OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oOO00O.OooO0O0 f30423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0O0 f30424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO0o f30425OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00Ooo f30426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f30427OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOo f30428OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f30429OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o000oOoO f30430OooO0oo;

    /* JADX INFO: renamed from: o00O0O00.OooO00o$OooO00o, reason: collision with other inner class name */
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {103}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
    public static final class C0335OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO00o f30432Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o00O0O00.OooO0O0.OooO00o f30433Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f30434Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f30435OoooO00;

        public C0335OooO00o(Continuation<? super C0335OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30434Oooo0oo = obj;
            this.f30435OoooO00 |= Integer.MIN_VALUE;
            return OooO00o.this.OooO00o(null, this);
        }
    }

    @DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {415, 438, 497}, m = "invokeSuspend", n = {"this_$iv", "fetcher$iv", "request$iv", "size$iv", "eventListener$iv", "options$iv", "type$iv", "this_$iv", "request$iv", "size$iv", "eventListener$iv", "options$iv", "fetchResult$iv", "decoder$iv", "request$iv", "size$iv", "eventListener$iv", "this_$iv$iv", "baseResult$iv", "$this$foldIndices$iv$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OooOo00>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Object f30436Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f30437Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f30438Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Object f30439Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f30440OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Object f30441OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f30442OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public Oooo0 f30443OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f30444OoooOO0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o f30446OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ o00O0O0O.Oooo0.OooO00o f30447OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ Object f30448OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O<Object> f30449OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public final /* synthetic */ o00O0O00.OooO0O0.OooO00o f30450Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public final /* synthetic */ Size f30451Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public final /* synthetic */ oOO00O.OooO0OO f30452OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public final /* synthetic */ MemoryCache$Key f30453OooooOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public int f30454o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(coil.request.OooO00o oooO00o, o00O0O0O.Oooo0.OooO00o oooO00o2, Object obj, OooOO0O<Object> oooOO0O, o00O0O00.OooO0O0.OooO00o oooO00o3, Size size, oOO00O.OooO0OO oooO0OO, MemoryCache$Key memoryCache$Key, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f30446OoooOOo = oooO00o;
            this.f30447OoooOo0 = oooO00o2;
            this.f30448OoooOoO = obj;
            this.f30449OoooOoo = oooOO0O;
            this.f30450Ooooo00 = oooO00o3;
            this.f30451Ooooo0o = size;
            this.f30452OooooO0 = oooO0OO;
            this.f30453OooooOO = memoryCache$Key;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooO00o.this.new OooO0O0(this.f30446OoooOOo, this.f30447OoooOo0, this.f30448OoooOoO, this.f30449OoooOoo, this.f30450Ooooo00, this.f30451Ooooo0o, this.f30452OooooO0, this.f30453OooooOO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OooOo00> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:125:0x030a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:126:0x030b  */
        /* JADX WARN: Code duplicated, block: B:129:0x0317  */
        /* JADX WARN: Code duplicated, block: B:142:0x0371  */
        /* JADX WARN: Code duplicated, block: B:143:0x0374  */
        /* JADX WARN: Code duplicated, block: B:146:0x0378  */
        /* JADX WARN: Code duplicated, block: B:152:0x0393  */
        /* JADX WARN: Code duplicated, block: B:153:0x0397  */
        /* JADX WARN: Code duplicated, block: B:155:0x039a  */
        /* JADX WARN: Code duplicated, block: B:156:0x039c  */
        /* JADX WARN: Code duplicated, block: B:158:0x03a2  */
        /* JADX WARN: Code duplicated, block: B:159:0x03ae  */
        /* JADX WARN: Code duplicated, block: B:163:0x03c1 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:165:0x03c5  */
        /* JADX WARN: Code duplicated, block: B:166:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:168:0x03cc  */
        /* JADX WARN: Code duplicated, block: B:169:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:171:0x03d4  */
        /* JADX WARN: Code duplicated, block: B:172:0x03db  */
        /* JADX WARN: Code duplicated, block: B:176:0x03e3  */
        /* JADX WARN: Code duplicated, block: B:179:0x03ec  */
        /* JADX WARN: Code duplicated, block: B:180:0x03ee  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v14, types: [android.graphics.drawable.BitmapDrawable] */
        /* JADX WARN: Type inference failed for: r4v28 */
        /* JADX WARN: Type inference failed for: r5v16, types: [coil.memory.MemoryCache$Key] */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v29 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x030b -> B:127:0x030c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 1024
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o00O0O00.OooO00o.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public OooO00o(@NotNull oOO00O.OooO0O0 registry, @NotNull p113o00O00Oo.OooO0O0 bitmapPool, @NotNull OooO0o referenceCounter, @NotNull o00Ooo strongMemoryCache, @NotNull OooOo memoryCacheService, @NotNull o00Oo0 requestService, @NotNull oo0o0Oo systemCallbacks, @NotNull o000oOoO drawableDecoder) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(memoryCacheService, "memoryCacheService");
        Intrinsics.checkNotNullParameter(requestService, "requestService");
        Intrinsics.checkNotNullParameter(systemCallbacks, "systemCallbacks");
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.f30423OooO00o = registry;
        this.f30424OooO0O0 = bitmapPool;
        this.f30425OooO0OO = referenceCounter;
        this.f30426OooO0Oo = strongMemoryCache;
        this.f30428OooO0o0 = memoryCacheService;
        this.f30427OooO0o = requestService;
        this.f30429OooO0oO = systemCallbacks;
        this.f30430OooO0oo = drawableDecoder;
        this.f30422OooO = null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o00O0O00.OooO0O0
    @Nullable
    public final Object OooO00o(@NotNull o00O0O00.OooO0O0.OooO00o oooO00o, @NotNull Continuation<? super OooOOO0> continuation) throws Throwable {
        C0335OooO00o c0335OooO00o;
        OooO00o oooO00o2;
        o00O0O00.OooO0O0.OooO00o oooO00o3 = oooO00o;
        if (continuation instanceof C0335OooO00o) {
            c0335OooO00o = (C0335OooO00o) continuation;
            int i = c0335OooO00o.f30435OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0335OooO00o.f30435OoooO00 = i - Integer.MIN_VALUE;
            } else {
                c0335OooO00o = new C0335OooO00o(continuation);
            }
        } else {
            c0335OooO00o = new C0335OooO00o(continuation);
        }
        C0335OooO00o c0335OooO00o2 = c0335OooO00o;
        Object objWithContext = c0335OooO00o2.f30434Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c0335OooO00o2.f30435OoooO00;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00O0O00.OooO0O0.OooO00o oooO00o4 = c0335OooO00o2.f30433Oooo0oO;
            oooO00o2 = c0335OooO00o2.f30432Oooo0o;
            try {
                ResultKt.throwOnFailure(objWithContext);
            } catch (Throwable th) {
                th = th;
                oooO00o3 = oooO00o4;
                if (th instanceof CancellationException) {
                    throw th;
                }
                return oooO00o2.f30427OooO0o.OooO00o(oooO00o3.getRequest(), th);
            }
        }
        ResultKt.throwOnFailure(objWithContext);
        try {
            if (!(oooO00o3 instanceof OooO0OO)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            coil.request.OooO00o oooO00o5 = ((OooO0OO) oooO00o3).f30460OooO0o0;
            Context context = oooO00o5.f9876OooO00o;
            Object obj = oooO00o5.f9877OooO0O0;
            Size size = ((OooO0OO) oooO00o3).f30459OooO0o;
            oOO00O.OooO0OO oooO0OO = ((OooO0OO) oooO00o3).f30462OooO0oo;
            oooO0OO.OooOO0O(oooO00o5, obj);
            Object objOooO00o = p119o00O0Oo0.Oooo0.OooO00o(this.f30423OooO00o, obj);
            oooO0OO.OooO0oo(oooO00o5, objOooO00o);
            OooOO0O<Object> oooOO0OOooO00o = o0ooOOo.OooO00o(oooO00o5, objOooO00o);
            if (oooOO0OOooO00o == null) {
                oooOO0OOooO00o = p119o00O0Oo0.Oooo0.OooO0OO(this.f30423OooO00o, objOooO00o);
            }
            OooOO0O<Object> oooOO0O = oooOO0OOooO00o;
            MemoryCache$Key memoryCache$KeyOooO0O0 = oooO00o5.f9881OooO0o0;
            if (memoryCache$KeyOooO0O0 == null) {
                memoryCache$KeyOooO0O0 = OooO0O0(oooO00o5, objOooO00o, oooOO0O, size);
            }
            MemoryCache$Key memoryCache$Key = memoryCache$KeyOooO0O0;
            o00O0O0O.Oooo0.OooO00o OooO00o2 = oooO00o5.f9894OooOo.getReadEnabled() ? this.f30428OooO0o0.OooO00o(memoryCache$Key) : null;
            if (OooO00o2 == null || !OooO0OO(memoryCache$Key, OooO00o2, oooO00o5, size)) {
                CoroutineDispatcher coroutineDispatcher = oooO00o5.f9890OooOOOo;
                OooO0O0 oooO0O0 = new OooO0O0(oooO00o5, OooO00o2, objOooO00o, oooOO0O, oooO00o, size, oooO0OO, memoryCache$Key, null);
                c0335OooO00o2.f30432Oooo0o = this;
                c0335OooO00o2.f30433Oooo0oO = oooO00o3;
                c0335OooO00o2.f30435OoooO00 = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, oooO0O0, c0335OooO00o2);
                return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
            }
            Bitmap bitmapOooO0O0 = OooO00o2.OooO0O0();
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapOooO0O0);
            boolean zOooO00o = OooO00o2.OooO00o();
            DataSource dataSource = DataSource.MEMORY_CACHE;
            if (((OooO0OO) oooO00o3).f30461OooO0oO == null) {
                z = false;
            }
            return new OooOo00(bitmapDrawable, oooO00o5, new OooOOO0.OooO00o(memoryCache$Key, zOooO00o, dataSource, z));
        } catch (Throwable th2) {
            th = th2;
            oooO00o2 = this;
            if (th instanceof CancellationException) {
                return oooO00o2.f30427OooO0o.OooO00o(oooO00o3.getRequest(), th);
            }
            throw th;
        }
    }

    @VisibleForTesting
    @Nullable
    public final MemoryCache$Key OooO0O0(@NotNull coil.request.OooO00o request, @NotNull Object data, @NotNull OooOO0O<Object> fetcher, @NotNull Size size) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        Intrinsics.checkNotNullParameter(size, "size");
        String strOooO0O0 = fetcher.OooO0O0(data);
        if (strOooO0O0 == null) {
            return null;
        }
        if (request.f9884OooOO0.isEmpty()) {
            return new MemoryCache$Key.Complex(strOooO0O0, CollectionsKt.emptyList(), null, request.f9886OooOO0o.OooO00o());
        }
        List<o00O0OOO.OooO0O0> list = request.f9884OooOO0;
        OooOOOO oooOOOO = request.f9886OooOO0o;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        int size2 = list.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = i + 1;
                arrayList.add(list.get(i).key());
                if (i2 > size2) {
                    break;
                }
                i = i2;
            }
        }
        return new MemoryCache$Key.Complex(strOooO0O0, arrayList, size, oooOOOO.OooO00o());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[PHI: r16
      0x00c8: PHI (r16v1 double) = (r16v0 double), (r16v0 double), (r16v2 double) binds: [B:40:0x00bc, B:42:0x00c5, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    @VisibleForTesting
    public final boolean OooO0OO(@Nullable MemoryCache$Key memoryCache$Key, @NotNull o00O0O0O.Oooo0.OooO00o cacheValue, @NotNull coil.request.OooO00o request, @NotNull Size size) {
        int height;
        int i;
        double d;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(cacheValue, "cacheValue");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(size, "size");
        if (!(size instanceof OriginalSize)) {
            if (size instanceof PixelSize) {
                MemoryCache$Key.Complex complex = memoryCache$Key instanceof MemoryCache$Key.Complex ? (MemoryCache$Key.Complex) memoryCache$Key : null;
                Size size2 = complex != null ? complex.f9869Oooo0oo : null;
                if (size2 instanceof PixelSize) {
                    PixelSize pixelSize = (PixelSize) size2;
                    i = pixelSize.f9946Oooo0o;
                    height = pixelSize.f9947Oooo0oO;
                } else {
                    if (!(Intrinsics.areEqual(size2, OriginalSize.f9945Oooo0o) || size2 == null)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Bitmap bitmapOooO0O0 = cacheValue.OooO0O0();
                    int width = bitmapOooO0O0.getWidth();
                    height = bitmapOooO0O0.getHeight();
                    i = width;
                }
                PixelSize pixelSize2 = (PixelSize) size;
                double dOooO0O0 = Oooo000.OooO0O0(i, height, pixelSize2.f9946Oooo0o, pixelSize2.f9947Oooo0oO, request.f9889OooOOOO);
                boolean zOooO0O0 = o0ooOOo.OooO0O0(request);
                if (zOooO0O0) {
                    double dCoerceAtMost = RangesKt___RangesKt.coerceAtMost(dOooO0O0, 1.0d);
                    d = dOooO0O0;
                    if (Math.abs(((double) pixelSize2.f9946Oooo0o) - (((double) i) * dCoerceAtMost)) > 1.0d && Math.abs(((double) pixelSize2.f9947Oooo0oO) - (dCoerceAtMost * ((double) height))) > 1.0d) {
                        if (d == 1.0d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && !zOooO0O0) {
                            o0OO00O o0oo00o2 = this.f30422OooO;
                            if (o0oo00o2 != null && o0oo00o2.getLevel() <= 3) {
                                Objects.toString(request.f9877OooO0O0);
                                Objects.toString(request.f9889OooOOOO);
                                o0oo00o2.OooO00o();
                            }
                        } else if (d <= 1.0d && cacheValue.OooO00o()) {
                            o0OO00O o0oo00o3 = this.f30422OooO;
                            if (o0oo00o3 != null && o0oo00o3.getLevel() <= 3) {
                                Objects.toString(request.f9877OooO0O0);
                                Objects.toString(request.f9889OooOOOO);
                                o0oo00o3.OooO00o();
                            }
                        }
                        z2 = false;
                    }
                } else {
                    d = dOooO0O0;
                    if (Math.abs(pixelSize2.f9946Oooo0o - i) > 1 || Math.abs(pixelSize2.f9947Oooo0oO - height) > 1) {
                        if (d == 1.0d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (d <= 1.0d) {
                            }
                        } else if (d <= 1.0d) {
                        }
                    }
                }
            }
            z2 = true;
        } else if (cacheValue.OooO00o()) {
            o0OO00O o0oo00o4 = this.f30422OooO;
            if (o0oo00o4 != null && o0oo00o4.getLevel() <= 3) {
                Objects.toString(request.f9877OooO0O0);
                o0oo00o4.OooO00o();
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        if (this.f30427OooO0o.OooO0O0(request, p119o00O0Oo0.Oooo000.OooO0OO(cacheValue.OooO0O0()))) {
            return true;
        }
        o0OO00O o0oo00o5 = this.f30422OooO;
        if (o0oo00o5 == null || o0oo00o5.getLevel() > 3) {
            return false;
        }
        Objects.toString(request.f9877OooO0O0);
        o0oo00o5.OooO00o();
        return false;
    }
}
