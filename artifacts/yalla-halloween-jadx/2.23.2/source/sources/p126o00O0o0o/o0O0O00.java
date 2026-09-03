package p126o00O0o0o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.size.Scale;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o00O.OooO0OO;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o00000O;
import p118o00O0Oo.o000OOo;
import p124o00O0o00.OooOOOO;
import p124o00O0o00.o000OO;
import p125o00O0o0O.o00oO0o;
import p125o00O0o0O.o0ooOOo;
import p125o00O0o0O.oo000o;
import p125o00O0o0O.oo0o0Oo;
import p127o00O0oO.o0000O;
import p128o00O0oOO.o000O00O;
import p130o00O0oo.o000O0Oo;
import p131o00O0oo0.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000O f36703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000000 f36704OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000O00O f36705OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Drawable f36706OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f36707OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final DataSource f36708OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final String f36709OooO0Oo;

        public OooO00o(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource, @Nullable String str) {
            this.f36706OooO00o = drawable;
            this.f36707OooO0O0 = z;
            this.f36708OooO0OO = dataSource;
            this.f36709OooO0Oo = str;
        }
    }

    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {165}, m = "fetch", n = {"this", "components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public p118o00O0Oo.o000000 f36710OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0O0O00 f36711OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public coil.request.OooO00o f36712OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o000OOo f36713OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f36714OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public p131o00O0oo0.o0O0O00 f36715OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public o0ooOOo f36716OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f36717OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public /* synthetic */ Object f36718OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f36719OooOOO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36718OooOO0o = obj;
            this.f36719OooOOO |= Integer.MIN_VALUE;
            return o0O0O00.this.OooO0Oo(null, null, null, null, null, this);
        }
    }

    public o0O0O00(@NotNull o00000O o00000o, @NotNull o000000 o000000Var) {
        this.f36703OooO00o = o00000o;
        this.f36704OooO0O0 = o000000Var;
        this.f36705OooO0OO = new o000O00O(o00000o, o000000Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f A[LOOP:0: B:16:0x0078->B:20:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c4 -> B:27:0x00c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object OooO0O0(p126o00O0o0o.o0O0O00 r17, p125o00O0o0O.oo0o0Oo r18, p118o00O0Oo.o000OOo r19, coil.request.OooO00o r20, java.lang.Object r21, p131o00O0oo0.o0O0O00 r22, p118o00O0Oo.o000000 r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p126o00O0o0o.o0O0O00.OooO0O0(o00O0o0o.o0O0O00, o00O0o0O.oo0o0Oo, o00O0Oo.o000OOo, coil.request.OooO00o, java.lang.Object, o00O0oo0.o0O0O00, o00O0Oo.o000000, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x025a  */
    /* JADX WARN: Code duplicated, block: B:116:0x025e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    /* JADX WARN: Code duplicated, block: B:92:0x0226 A[PHI: r1 r3
      0x0226: PHI (r1v37 java.lang.Object) = (r1v33 java.lang.Object), (r1v1 java.lang.Object) binds: [B:90:0x0223, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r3v17 android.graphics.drawable.BitmapDrawable) = (r3v15 android.graphics.drawable.BitmapDrawable), (r3v21 android.graphics.drawable.BitmapDrawable) binds: [B:90:0x0223, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x022f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0233  */
    /* JADX WARN: Code duplicated, block: B:97:0x0236  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [o00O0o0o.o0O0O00$OooO00o] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, o00O0oo0.o0O0O00] */
    /* JADX WARN: Type inference failed for: r1v25, types: [T] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, o00O0Oo.o000OOo] */
    /* JADX WARN: Type inference failed for: r20v2, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, o00O0Oo.o000OOo] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r30v0, types: [T, o00O0oo0.o0O0O00] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final Object OooO0OO(o0O0O00 o0o0o00, coil.request.OooO00o oooO00o, Object obj, p131o00O0oo0.o0O0O00 o0o0o01, p118o00O0Oo.o000000 o000000Var, Continuation continuation) {
        o000000 o000000Var2;
        oo0o0Oo oo0o0oo;
        ?? r7;
        Object obj2;
        oo0o0Oo oo0o0oo2;
        o000OO o000oo2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        p118o00O0Oo.o000000 o000000Var3;
        coil.request.OooO00o oooO00o2;
        Object obj3;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        ?? r1;
        o0O0O00 o0o0o02;
        OooO00o oooO00o3;
        p118o00O0Oo.o000000 o000000Var4;
        o0O0O00 o0o0o03;
        coil.request.OooO00o oooO00o4;
        p118o00O0Oo.o000000 o000000Var5;
        Ref.ObjectRef objectRef5;
        ?? r2;
        Object obj4;
        oo0o0Oo oo0o0oo3;
        p131o00O0oo0.o0O0O00 o0o0o04;
        BitmapDrawable bitmapDrawable;
        List<OooO0OO> list;
        o000OO o000oo3;
        ?? r3;
        Object obj5;
        Drawable drawable;
        BitmapDrawable bitmapDrawable2;
        Bitmap bitmap;
        o0O0O00 o0o0o05 = o0o0o00;
        o0o0o00.getClass();
        if (continuation instanceof o000000) {
            o000000Var2 = (o000000) continuation;
            int i = o000000Var2.f36649OooOOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000Var2.f36649OooOOO = i - Integer.MIN_VALUE;
            } else {
                o000000Var2 = new o000000(o0o0o05, continuation);
            }
        } else {
            o000000Var2 = new o000000(o0o0o05, continuation);
        }
        o000000 o000000Var6 = o000000Var2;
        Object objWithContext = o000000Var6.f36648OooOO0o;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r4 = o000000Var6.f36649OooOOO;
        try {
            if (r4 != 0) {
                if (r4 == 1) {
                    Ref.ObjectRef objectRef6 = o000000Var6.f36647OooOO0O;
                    Ref.ObjectRef objectRef7 = o000000Var6.f36646OooOO0;
                    Ref.ObjectRef objectRef8 = o000000Var6.f36640OooO;
                    Ref.ObjectRef objectRef9 = o000000Var6.f36645OooO0oo;
                    p118o00O0Oo.o000000 o000000Var7 = (p118o00O0Oo.o000000) o000000Var6.f36644OooO0oO;
                    Object obj6 = o000000Var6.f36642OooO0o;
                    oooO00o2 = o000000Var6.f36643OooO0o0;
                    o0O0O00 o0o0o06 = o000000Var6.f36641OooO0Oo;
                    ResultKt.throwOnFailure(objWithContext);
                    objectRef4 = objectRef6;
                    objectRef3 = objectRef8;
                    objectRef = objectRef9;
                    o000000Var3 = o000000Var7;
                    obj3 = obj6;
                    o0o0o05 = o0o0o06;
                    r1 = objWithContext;
                    r4 = objectRef7;
                } else {
                    if (r4 == 2) {
                        Ref.ObjectRef objectRef10 = o000000Var6.f36645OooO0oo;
                        objectRef5 = (Ref.ObjectRef) o000000Var6.f36644OooO0oO;
                        o000000Var5 = (p118o00O0Oo.o000000) o000000Var6.f36642OooO0o;
                        oooO00o4 = o000000Var6.f36643OooO0o0;
                        o0o0o03 = o000000Var6.f36641OooO0Oo;
                        ResultKt.throwOnFailure(objWithContext);
                        obj5 = objWithContext;
                        r3 = objectRef10;
                        objectRef = objectRef5;
                        o000000Var4 = o000000Var5;
                        oooO00o2 = oooO00o4;
                        o0o0o02 = o0o0o03;
                        oooO00o3 = (OooO00o) obj5;
                        r2 = r3;
                        obj4 = r2.element;
                        if (obj4 instanceof oo0o0Oo) {
                            oo0o0oo3 = (oo0o0Oo) obj4;
                        } else {
                            oo0o0oo3 = null;
                        }
                        if (oo0o0oo3 != null && (o000oo3 = oo0o0oo3.f36632OooO00o) != null) {
                            OooOo00.OooO00o(o000oo3);
                        }
                        o0o0o04 = (p131o00O0oo0.o0O0O00) objectRef.element;
                        bitmapDrawable = null;
                        o000000Var6.f36641OooO0Oo = null;
                        o000000Var6.f36643OooO0o0 = null;
                        o000000Var6.f36642OooO0o = null;
                        o000000Var6.f36644OooO0oO = null;
                        o000000Var6.f36645OooO0oo = null;
                        o000000Var6.f36640OooO = null;
                        o000000Var6.f36646OooOO0 = null;
                        o000000Var6.f36647OooOO0O = null;
                        o000000Var6.f36649OooOOO = 3;
                        o0o0o02.getClass();
                        list = oooO00o2.f11649OooOO0o;
                        objWithContext = oooO00o3;
                        if (!list.isEmpty() && ((oooO00o3.f36706OooO00o instanceof BitmapDrawable) || oooO00o2.f11653OooOOOo)) {
                            objWithContext = oooO00o3;
                            objWithContext = BuildersKt.withContext(oooO00o2.f11662OooOoO, new o00000O(o0o0o02, oooO00o3, o0o0o04, list, o000000Var4, oooO00o2, null), o000000Var6);
                        }
                        if (objWithContext != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (r4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objWithContext);
                    bitmapDrawable = null;
                }
                coroutine_suspended = (OooO00o) objWithContext;
                drawable = coroutine_suspended.f36706OooO00o;
                if (drawable instanceof BitmapDrawable) {
                    bitmapDrawable2 = (BitmapDrawable) drawable;
                } else {
                    bitmapDrawable2 = bitmapDrawable;
                }
                if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
                    bitmap.prepareToDraw();
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(objWithContext);
            objectRef = new Ref.ObjectRef();
            objectRef.element = o0o0o01;
            Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
            objectRef11.element = o0o0o05.f36703OooO00o.getComponents();
            Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
            try {
                o000000 o000000Var8 = o0o0o05.f36704OooO0O0;
                p131o00O0oo0.o0O0O00 o0o0o07 = (p131o00O0oo0.o0O0O00) objectRef.element;
                o000000Var8.getClass();
                if (!(!(Build.VERSION.SDK_INT >= 26 && o0o0o07.f36839OooO0O0 == Bitmap.Config.HARDWARE) || o000000Var8.f36783OooO0OO.OooO0O0())) {
                    try {
                        objectRef.element = p131o00O0oo0.o0O0O00.OooO00o((p131o00O0oo0.o0O0O00) objectRef.element, Bitmap.Config.ARGB_8888);
                    } catch (Throwable th) {
                        th = th;
                        oo0o0oo = null;
                        r7 = objectRef12;
                    }
                }
                Pair<o0ooOOo.OooO00o<?>, Class<?>> pair = oooO00o.f11647OooOO0;
                OooOOOO.OooO00o oooO00o5 = oooO00o.f11648OooOO0O;
                if (pair != null || oooO00o5 != null) {
                    o000OOo o000ooo2 = (o000OOo) objectRef11.element;
                    o000ooo2.getClass();
                    List mutableList = CollectionsKt.toMutableList((Collection) o000ooo2.f36402OooO00o);
                    List mutableList2 = CollectionsKt.toMutableList((Collection) o000ooo2.f36403OooO0O0);
                    List mutableList3 = CollectionsKt.toMutableList((Collection) o000ooo2.f36404OooO0OO);
                    List mutableList4 = CollectionsKt.toMutableList((Collection) o000ooo2.f36405OooO0Oo);
                    List mutableList5 = CollectionsKt.toMutableList((Collection) o000ooo2.f36406OooO0o0);
                    Pair<o0ooOOo.OooO00o<?>, Class<?>> pair2 = oooO00o.f11647OooOO0;
                    if (pair2 != null) {
                        mutableList4.add(0, pair2);
                    }
                    if (oooO00o5 != null) {
                        mutableList5.add(0, oooO00o5);
                    }
                    objectRef11.element = new o000OOo(o00OO00O.OooO0O0.OooO00o(mutableList), o00OO00O.OooO0O0.OooO00o(mutableList2), o00OO00O.OooO0O0.OooO00o(mutableList3), o00OO00O.OooO0O0.OooO00o(mutableList4), o00OO00O.OooO0O0.OooO00o(mutableList5));
                }
                o000OOo o000ooo3 = (o000OOo) objectRef11.element;
                p131o00O0oo0.o0O0O00 o0o0o08 = (p131o00O0oo0.o0O0O00) objectRef.element;
                o000000Var6.f36641OooO0Oo = o0o0o05;
                o000000Var6.f36643OooO0o0 = oooO00o;
                o000000Var6.f36642OooO0o = obj;
                o000000Var3 = o000000Var;
                o000000Var6.f36644OooO0oO = o000000Var3;
                o000000Var6.f36645OooO0oo = objectRef;
                o000000Var6.f36640OooO = objectRef11;
                o000000Var6.f36646OooOO0 = objectRef12;
                o000000Var6.f36647OooOO0O = objectRef12;
                o000000Var6.f36649OooOOO = 1;
                objectRef2 = objectRef12;
                try {
                    Object objOooO0Oo = o0o0o00.OooO0Oo(o000ooo3, oooO00o, obj, o0o0o08, o000000Var, o000000Var6);
                    if (objOooO0Oo != coroutine_suspended) {
                        oooO00o2 = oooO00o;
                        obj3 = obj;
                        r4 = objectRef2;
                        objectRef3 = objectRef11;
                        r1 = objOooO0Oo;
                        objectRef4 = objectRef2;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    oo0o0oo = null;
                    r7 = objectRef2;
                    obj2 = r7.element;
                    if (obj2 instanceof oo0o0Oo) {
                        oo0o0oo2 = (oo0o0Oo) obj2;
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    if (oo0o0oo2 != null) {
                        OooOo00.OooO00o(o000oo2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectRef2 = objectRef12;
            }
            objectRef4.element = r1;
            Object obj7 = r4.element;
            o00oO0o o00oo0o2 = (o00oO0o) obj7;
            if (!(o00oo0o2 instanceof oo0o0Oo)) {
                if (o00oo0o2 instanceof oo000o) {
                    try {
                        o0o0o02 = o0o0o05;
                        oooO00o3 = new OooO00o(((oo000o) obj7).f36629OooO00o, ((oo000o) obj7).f36630OooO0O0, ((oo000o) obj7).f36631OooO0OO, null);
                        o000000Var4 = o000000Var3;
                        r2 = r4;
                        obj4 = r2.element;
                        if (obj4 instanceof oo0o0Oo) {
                            oo0o0oo3 = (oo0o0Oo) obj4;
                        } else {
                            oo0o0oo3 = null;
                        }
                        if (oo0o0oo3 != null) {
                            OooOo00.OooO00o(o000oo3);
                        }
                        o0o0o04 = (p131o00O0oo0.o0O0O00) objectRef.element;
                        bitmapDrawable = null;
                        o000000Var6.f36641OooO0Oo = null;
                        o000000Var6.f36643OooO0o0 = null;
                        o000000Var6.f36642OooO0o = null;
                        o000000Var6.f36644OooO0oO = null;
                        o000000Var6.f36645OooO0oo = null;
                        o000000Var6.f36640OooO = null;
                        o000000Var6.f36646OooOO0 = null;
                        o000000Var6.f36647OooOO0O = null;
                        o000000Var6.f36649OooOOO = 3;
                        o0o0o02.getClass();
                        list = oooO00o2.f11649OooOO0o;
                        objWithContext = oooO00o3;
                        if (!list.isEmpty()) {
                            objWithContext = oooO00o3;
                            objWithContext = BuildersKt.withContext(oooO00o2.f11662OooOoO, new o00000O(o0o0o02, oooO00o3, o0o0o04, list, o000000Var4, oooO00o2, null), o000000Var6);
                        }
                        if (objWithContext != coroutine_suspended) {
                            coroutine_suspended = (OooO00o) objWithContext;
                            drawable = coroutine_suspended.f36706OooO00o;
                            if (drawable instanceof BitmapDrawable) {
                                bitmapDrawable2 = (BitmapDrawable) drawable;
                            } else {
                                bitmapDrawable2 = bitmapDrawable;
                            }
                            if (bitmapDrawable2 != null) {
                                bitmap.prepareToDraw();
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        oo0o0oo = null;
                    }
                } else {
                    oo0o0oo = null;
                    try {
                        throw new NoWhenBranchMatchedException();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                r7 = r4;
                obj2 = r7.element;
                if (obj2 instanceof oo0o0Oo) {
                    oo0o0oo2 = (oo0o0Oo) obj2;
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                if (oo0o0oo2 != null && (o000oo2 = oo0o0oo2.f36632OooO00o) != null) {
                    OooOo00.OooO00o(o000oo2);
                }
                throw th;
            }
            CoroutineDispatcher coroutineDispatcher = oooO00o2.f11663OooOoO0;
            o000000O o000000o2 = new o000000O(o0o0o05, r4, objectRef3, oooO00o2, obj3, objectRef, o000000Var3, null);
            o000000Var6.f36641OooO0Oo = o0o0o05;
            o000000Var6.f36643OooO0o0 = oooO00o2;
            o000000Var6.f36642OooO0o = o000000Var3;
            o000000Var6.f36644OooO0oO = objectRef;
            o000000Var6.f36645OooO0oo = r4;
            o000000Var6.f36640OooO = null;
            o000000Var6.f36646OooOO0 = null;
            o000000Var6.f36647OooOO0O = null;
            o000000Var6.f36649OooOOO = 2;
            Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher, o000000o2, o000000Var6);
            if (objWithContext2 != coroutine_suspended) {
                o0o0o03 = o0o0o05;
                oooO00o4 = oooO00o2;
                o000000Var5 = o000000Var3;
                objectRef5 = objectRef;
                obj5 = objWithContext2;
                r3 = r4;
                objectRef = objectRef5;
                o000000Var4 = o000000Var5;
                oooO00o2 = oooO00o4;
                o0o0o02 = o0o0o03;
                oooO00o3 = (OooO00o) obj5;
                r2 = r3;
                obj4 = r2.element;
                if (obj4 instanceof oo0o0Oo) {
                    oo0o0oo3 = (oo0o0Oo) obj4;
                } else {
                    oo0o0oo3 = null;
                }
                if (oo0o0oo3 != null) {
                    OooOo00.OooO00o(o000oo3);
                }
                o0o0o04 = (p131o00O0oo0.o0O0O00) objectRef.element;
                bitmapDrawable = null;
                o000000Var6.f36641OooO0Oo = null;
                o000000Var6.f36643OooO0o0 = null;
                o000000Var6.f36642OooO0o = null;
                o000000Var6.f36644OooO0oO = null;
                o000000Var6.f36645OooO0oo = null;
                o000000Var6.f36640OooO = null;
                o000000Var6.f36646OooOO0 = null;
                o000000Var6.f36647OooOO0O = null;
                o000000Var6.f36649OooOOO = 3;
                o0o0o02.getClass();
                list = oooO00o2.f11649OooOO0o;
                objWithContext = oooO00o3;
                if (!list.isEmpty()) {
                    objWithContext = oooO00o3;
                    objWithContext = BuildersKt.withContext(oooO00o2.f11662OooOoO, new o00000O(o0o0o02, oooO00o3, o0o0o04, list, o000000Var4, oooO00o2, null), o000000Var6);
                }
                if (objWithContext != coroutine_suspended) {
                    coroutine_suspended = (OooO00o) objWithContext;
                    drawable = coroutine_suspended.f36706OooO00o;
                    if (drawable instanceof BitmapDrawable) {
                        bitmapDrawable2 = (BitmapDrawable) drawable;
                    } else {
                        bitmapDrawable2 = bitmapDrawable;
                    }
                    if (bitmapDrawable2 != null) {
                        bitmap.prepareToDraw();
                    }
                }
            }
            return coroutine_suspended;
        } catch (Throwable th6) {
            th = th6;
            oo0o0oo = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p126o00O0o0o.o00000OO
    @Nullable
    public final Object OooO00o(@NotNull o0000Ooo o0000ooo, @NotNull Continuation continuation) throws Throwable {
        o00000 o00000Var;
        o0O0O00 o0o0o00;
        o00000OO.OooO00o oooO00o;
        o000O00O o000o00o2 = this.f36705OooO0OO;
        if (continuation instanceof o00000) {
            o00000Var = (o00000) continuation;
            int i = o00000Var.f36639OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00000Var.f36639OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o00000Var = new o00000(this, continuation);
            }
        } else {
            o00000Var = new o00000(this, continuation);
        }
        o00000 o00000Var2 = o00000Var;
        Object objWithContext = o00000Var2.f36636OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00000Var2.f36639OooO0oo;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = o00000Var2.f36637OooO0o0;
            o0o0o00 = o00000Var2.f36635OooO0Oo;
            try {
                ResultKt.throwOnFailure(objWithContext);
            } catch (Throwable th) {
                th = th;
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                o000000 o000000Var = o0o0o00.f36704OooO0O0;
                coil.request.OooO00o OooO00o2 = oooO00o.OooO00o();
                o000000Var.getClass();
                return o000000.OooO00o(OooO00o2, th);
            }
        }
        ResultKt.throwOnFailure(objWithContext);
        try {
            coil.request.OooO00o oooO00o2 = o0000ooo.f36682OooO0Oo;
            Object obj = oooO00o2.f11640OooO0O0;
            o000O0Oo o000o0oo2 = o0000ooo.f36684OooO0o0;
            Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
            p118o00O0Oo.o000000 o000000Var2 = o0000ooo.f36683OooO0o;
            p131o00O0oo0.o0O0O00 o0o0o00OooO0OO = this.f36704OooO0O0.OooO0OO(oooO00o2, o000o0oo2);
            Scale scale = o0o0o00OooO0OO.f36843OooO0o0;
            o000000Var2.OooO0o0();
            List<Pair<o0000O<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f36703OooO00o.getComponents().f36403OooO0O0;
            int size = list.size();
            Object obj2 = obj;
            int i3 = 0;
            while (i3 < size) {
                Pair<o0000O<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i3);
                o0000O<? extends Object, ? extends Object> o0000oComponent1 = pair.component1();
                List<Pair<o0000O<? extends Object, ? extends Object>, Class<? extends Object>>> list2 = list;
                if (pair.component2().isAssignableFrom(obj2.getClass())) {
                    Intrinsics.checkNotNull(o0000oComponent1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                    Object objOooO00o = o0000oComponent1.OooO00o(obj2, o0o0o00OooO0OO);
                    if (objOooO00o != null) {
                        obj2 = objOooO00o;
                    }
                }
                i3++;
                list = list2;
            }
            o000000Var2.OooO0o();
            MemoryCache.Key keyOooO0O0 = o000o00o2.OooO0O0(oooO00o2, obj2, o0o0o00OooO0OO, o000000Var2);
            MemoryCache.OooO00o OooO00o3 = keyOooO0O0 != null ? o000o00o2.OooO00o(oooO00o2, keyOooO0O0, o000o0oo2, scale) : null;
            if (OooO00o3 != null) {
                return o000O00O.OooO0OO(o0000ooo, oooO00o2, keyOooO0O0, OooO00o3);
            }
            CoroutineDispatcher coroutineDispatcher = oooO00o2.f11657OooOo;
            o00000O0 o00000o1 = new o00000O0(this, oooO00o2, obj2, o0o0o00OooO0OO, o000000Var2, keyOooO0O0, o0000ooo, null);
            o00000Var2.f36635OooO0Oo = this;
            o00000Var2.f36637OooO0o0 = o0000ooo;
            o00000Var2.f36639OooO0oo = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, o00000o1, o00000Var2);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        } catch (Throwable th2) {
            th = th2;
            o0o0o00 = this;
            oooO00o = o0000ooo;
            if (!(th instanceof CancellationException)) {
                throw th;
            }
            o000000 o000000Var3 = o0o0o00.f36704OooO0O0;
            coil.request.OooO00o OooO00o4 = oooO00o.OooO00o();
            o000000Var3.getClass();
            return o000000.OooO00o(OooO00o4, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d4 -> B:29:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object OooO0Oo(p118o00O0Oo.o000OOo r19, coil.request.OooO00o r20, java.lang.Object r21, p131o00O0oo0.o0O0O00 r22, p118o00O0Oo.o000000 r23, kotlin.coroutines.Continuation<? super p125o00O0o0O.o00oO0o> r24) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p126o00O0o0o.o0O0O00.OooO0Oo(o00O0Oo.o000OOo, coil.request.OooO00o, java.lang.Object, o00O0oo0.o0O0O00, o00O0Oo.o000000, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
