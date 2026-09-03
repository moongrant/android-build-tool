package p101o000oo;

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
import o00.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o0000O0;
import p097o000o0oO.o0000O0O;
import p097o000o0oO.o000O000;
import p103o000oo00.o0000OO0;
import p103o000oo00.o000oOoO;
import p105o000oo0o.o00O0O0;
import p105o000oo0o.o00O0O0O;
import p105o000oo0o.o00O0OO0;
import p105o000oo0o.oo0oOO0;
import p106o000ooO.OooOo00;
import p108o000ooOO.o000OO0O;
import p109o000ooo.o0Oo0oo;
import p109o000ooo.oo0o0Oo;
import p111o000oooO.o00O00;
import p321o0O0ooO.o000;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O000 f35517OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f35518OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000OO0O f35519OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Drawable f35520OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f35521OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final DataSource f35522OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final String f35523OooO0Oo;

        public OooO00o(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource, @Nullable String str) {
            this.f35520OooO00o = drawable;
            this.f35521OooO0O0 = z;
            this.f35522OooO0OO = dataSource;
            this.f35523OooO0Oo = str;
        }
    }

    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {165}, m = "fetch", n = {"this", "components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public o0000O0O f35524OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Oooo0 f35525OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public coil.request.OooO00o f35526OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0000O0 f35527OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f35528OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public o0Oo0oo f35529OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public o00O0OO0 f35530OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f35531OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public /* synthetic */ Object f35532OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f35533OooOOO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35532OooOO0o = obj;
            this.f35533OooOOO |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0Oo(null, null, null, null, null, this);
        }
    }

    public Oooo0(@NotNull o000O000 o000o001, @NotNull oo0o0Oo oo0o0oo) {
        this.f35517OooO00o = o000o001;
        this.f35518OooO0O0 = oo0o0oo;
        this.f35519OooO0OO = new o000OO0O(o000o001, oo0o0oo);
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
    public static final java.lang.Object OooO0O0(p101o000oo.Oooo0 r17, p105o000oo0o.oo0oOO0 r18, p097o000o0oO.o0000O0 r19, coil.request.OooO00o r20, java.lang.Object r21, p109o000ooo.o0Oo0oo r22, p097o000o0oO.o0000O0O r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p101o000oo.Oooo0.OooO0O0(o000oo.Oooo0, o000oo0o.oo0oOO0, o000o0oO.o0000O0, coil.request.OooO00o, java.lang.Object, o000ooo.o0Oo0oo, o000o0oO.o0000O0O, kotlin.coroutines.Continuation):java.lang.Object");
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
    /* JADX WARN: Type inference failed for: r10v3, types: [o000oo.Oooo0$OooO00o] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, o000ooo.o0Oo0oo] */
    /* JADX WARN: Type inference failed for: r1v25, types: [T] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, o000o0oO.o0000O0] */
    /* JADX WARN: Type inference failed for: r20v2, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, o000o0oO.o0000O0] */
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
    /* JADX WARN: Type inference failed for: r30v0, types: [T, o000ooo.o0Oo0oo] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final Object OooO0OO(Oooo0 oooo0, coil.request.OooO00o oooO00o, Object obj, o0Oo0oo o0oo0oo2, o0000O0O o0000o0o2, Continuation continuation) {
        o0OoOo0 o0oooo0;
        oo0oOO0 oo0ooo0;
        ?? r7;
        Object obj2;
        oo0oOO0 oo0ooo1;
        o0000OO0 o0000oo1;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        o0000O0O o0000o0o3;
        coil.request.OooO00o oooO00o2;
        Object obj3;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        ?? r1;
        Oooo0 oooo1;
        OooO00o oooO00o3;
        o0000O0O o0000o0o4;
        Oooo0 oooo2;
        coil.request.OooO00o oooO00o4;
        o0000O0O o0000o0o5;
        Ref.ObjectRef objectRef5;
        ?? r2;
        Object obj4;
        oo0oOO0 oo0ooo2;
        o0Oo0oo o0oo0oo3;
        BitmapDrawable bitmapDrawable;
        List<OooO0OO> list;
        o0000OO0 o0000oo2;
        ?? r3;
        Object obj5;
        Drawable drawable;
        BitmapDrawable bitmapDrawable2;
        Bitmap bitmap;
        Oooo0 oooo3 = oooo0;
        oooo0.getClass();
        if (continuation instanceof o0OoOo0) {
            o0oooo0 = (o0OoOo0) continuation;
            int i = o0oooo0.f35577OooOOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oooo0.f35577OooOOO = i - Integer.MIN_VALUE;
            } else {
                o0oooo0 = new o0OoOo0(oooo3, continuation);
            }
        } else {
            o0oooo0 = new o0OoOo0(oooo3, continuation);
        }
        o0OoOo0 o0oooo1 = o0oooo0;
        Object objWithContext = o0oooo1.f35576OooOO0o;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r4 = o0oooo1.f35577OooOOO;
        try {
            if (r4 != 0) {
                if (r4 == 1) {
                    Ref.ObjectRef objectRef6 = o0oooo1.f35575OooOO0O;
                    Ref.ObjectRef objectRef7 = o0oooo1.f35574OooOO0;
                    Ref.ObjectRef objectRef8 = o0oooo1.f35568OooO;
                    Ref.ObjectRef objectRef9 = o0oooo1.f35573OooO0oo;
                    o0000O0O o0000o0o6 = (o0000O0O) o0oooo1.f35572OooO0oO;
                    Object obj6 = o0oooo1.f35570OooO0o;
                    oooO00o2 = o0oooo1.f35571OooO0o0;
                    Oooo0 oooo4 = o0oooo1.f35569OooO0Oo;
                    ResultKt.throwOnFailure(objWithContext);
                    objectRef4 = objectRef6;
                    objectRef3 = objectRef8;
                    objectRef = objectRef9;
                    o0000o0o3 = o0000o0o6;
                    obj3 = obj6;
                    oooo3 = oooo4;
                    r1 = objWithContext;
                    r4 = objectRef7;
                } else {
                    if (r4 == 2) {
                        Ref.ObjectRef objectRef10 = o0oooo1.f35573OooO0oo;
                        objectRef5 = (Ref.ObjectRef) o0oooo1.f35572OooO0oO;
                        o0000o0o5 = (o0000O0O) o0oooo1.f35570OooO0o;
                        oooO00o4 = o0oooo1.f35571OooO0o0;
                        oooo2 = o0oooo1.f35569OooO0Oo;
                        ResultKt.throwOnFailure(objWithContext);
                        obj5 = objWithContext;
                        r3 = objectRef10;
                        objectRef = objectRef5;
                        o0000o0o4 = o0000o0o5;
                        oooO00o2 = oooO00o4;
                        oooo1 = oooo2;
                        oooO00o3 = (OooO00o) obj5;
                        r2 = r3;
                        obj4 = r2.element;
                        if (obj4 instanceof oo0oOO0) {
                            oo0ooo2 = (oo0oOO0) obj4;
                        } else {
                            oo0ooo2 = null;
                        }
                        if (oo0ooo2 != null && (o0000oo2 = oo0ooo2.f35800OooO00o) != null) {
                            o000O0O0.OooO00o(o0000oo2);
                        }
                        o0oo0oo3 = (o0Oo0oo) objectRef.element;
                        bitmapDrawable = null;
                        o0oooo1.f35569OooO0Oo = null;
                        o0oooo1.f35571OooO0o0 = null;
                        o0oooo1.f35570OooO0o = null;
                        o0oooo1.f35572OooO0oO = null;
                        o0oooo1.f35573OooO0oo = null;
                        o0oooo1.f35568OooO = null;
                        o0oooo1.f35574OooOO0 = null;
                        o0oooo1.f35575OooOO0O = null;
                        o0oooo1.f35577OooOOO = 3;
                        oooo1.getClass();
                        list = oooO00o2.f8559OooOO0o;
                        objWithContext = oooO00o3;
                        if (!list.isEmpty() && ((oooO00o3.f35520OooO00o instanceof BitmapDrawable) || oooO00o2.f8563OooOOOo)) {
                            objWithContext = oooO00o3;
                            objWithContext = BuildersKt.withContext(oooO00o2.f8572OooOoO, new oo000o(oooo1, oooO00o3, o0oo0oo3, list, o0000o0o4, oooO00o2, null), o0oooo1);
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
                drawable = coroutine_suspended.f35520OooO00o;
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
            objectRef.element = o0oo0oo2;
            Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
            objectRef11.element = oooo3.f35517OooO00o.getComponents();
            Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
            try {
                oo0o0Oo oo0o0oo = oooo3.f35518OooO0O0;
                o0Oo0oo o0oo0oo4 = (o0Oo0oo) objectRef.element;
                oo0o0oo.getClass();
                if (!(!(Build.VERSION.SDK_INT >= 26 && o0oo0oo4.f35864OooO0O0 == Bitmap.Config.HARDWARE) || oo0o0oo.f35897OooO0OO.OooO0O0())) {
                    try {
                        objectRef.element = o0Oo0oo.OooO00o((o0Oo0oo) objectRef.element, Bitmap.Config.ARGB_8888);
                    } catch (Throwable th) {
                        th = th;
                        oo0ooo0 = null;
                        r7 = objectRef12;
                    }
                }
                Pair<o00O0OO0.OooO00o<?>, Class<?>> pair = oooO00o.f8557OooOO0;
                o000oOoO.OooO00o oooO00o5 = oooO00o.f8558OooOO0O;
                if (pair != null || oooO00o5 != null) {
                    o0000O0 o0000o1 = (o0000O0) objectRef11.element;
                    o0000o1.getClass();
                    List mutableList = CollectionsKt.toMutableList((Collection) o0000o1.f35395OooO00o);
                    List mutableList2 = CollectionsKt.toMutableList((Collection) o0000o1.f35396OooO0O0);
                    List mutableList3 = CollectionsKt.toMutableList((Collection) o0000o1.f35397OooO0OO);
                    List mutableList4 = CollectionsKt.toMutableList((Collection) o0000o1.f35398OooO0Oo);
                    List mutableList5 = CollectionsKt.toMutableList((Collection) o0000o1.f35399OooO0o0);
                    Pair<o00O0OO0.OooO00o<?>, Class<?>> pair2 = oooO00o.f8557OooOO0;
                    if (pair2 != null) {
                        mutableList4.add(0, pair2);
                    }
                    if (oooO00o5 != null) {
                        mutableList5.add(0, oooO00o5);
                    }
                    objectRef11.element = new o0000O0(o000.OooO00o(mutableList), o000.OooO00o(mutableList2), o000.OooO00o(mutableList3), o000.OooO00o(mutableList4), o000.OooO00o(mutableList5));
                }
                o0000O0 o0000o2 = (o0000O0) objectRef11.element;
                o0Oo0oo o0oo0oo5 = (o0Oo0oo) objectRef.element;
                o0oooo1.f35569OooO0Oo = oooo3;
                o0oooo1.f35571OooO0o0 = oooO00o;
                o0oooo1.f35570OooO0o = obj;
                o0000o0o3 = o0000o0o2;
                o0oooo1.f35572OooO0oO = o0000o0o3;
                o0oooo1.f35573OooO0oo = objectRef;
                o0oooo1.f35568OooO = objectRef11;
                o0oooo1.f35574OooOO0 = objectRef12;
                o0oooo1.f35575OooOO0O = objectRef12;
                o0oooo1.f35577OooOOO = 1;
                objectRef2 = objectRef12;
                try {
                    Object objOooO0Oo = oooo0.OooO0Oo(o0000o2, oooO00o, obj, o0oo0oo5, o0000o0o2, o0oooo1);
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
                    oo0ooo0 = null;
                    r7 = objectRef2;
                    obj2 = r7.element;
                    if (obj2 instanceof oo0oOO0) {
                        oo0ooo1 = (oo0oOO0) obj2;
                    } else {
                        oo0ooo1 = oo0ooo0;
                    }
                    if (oo0ooo1 != null) {
                        o000O0O0.OooO00o(o0000oo1);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectRef2 = objectRef12;
            }
            objectRef4.element = r1;
            Object obj7 = r4.element;
            o00O0O0O o00o0o0o2 = (o00O0O0O) obj7;
            if (!(o00o0o0o2 instanceof oo0oOO0)) {
                if (o00o0o0o2 instanceof o00O0O0) {
                    try {
                        oooo1 = oooo3;
                        oooO00o3 = new OooO00o(((o00O0O0) obj7).f35771OooO00o, ((o00O0O0) obj7).f35772OooO0O0, ((o00O0O0) obj7).f35773OooO0OO, null);
                        o0000o0o4 = o0000o0o3;
                        r2 = r4;
                        obj4 = r2.element;
                        if (obj4 instanceof oo0oOO0) {
                            oo0ooo2 = (oo0oOO0) obj4;
                        } else {
                            oo0ooo2 = null;
                        }
                        if (oo0ooo2 != null) {
                            o000O0O0.OooO00o(o0000oo2);
                        }
                        o0oo0oo3 = (o0Oo0oo) objectRef.element;
                        bitmapDrawable = null;
                        o0oooo1.f35569OooO0Oo = null;
                        o0oooo1.f35571OooO0o0 = null;
                        o0oooo1.f35570OooO0o = null;
                        o0oooo1.f35572OooO0oO = null;
                        o0oooo1.f35573OooO0oo = null;
                        o0oooo1.f35568OooO = null;
                        o0oooo1.f35574OooOO0 = null;
                        o0oooo1.f35575OooOO0O = null;
                        o0oooo1.f35577OooOOO = 3;
                        oooo1.getClass();
                        list = oooO00o2.f8559OooOO0o;
                        objWithContext = oooO00o3;
                        if (!list.isEmpty()) {
                            objWithContext = oooO00o3;
                            objWithContext = BuildersKt.withContext(oooO00o2.f8572OooOoO, new oo000o(oooo1, oooO00o3, o0oo0oo3, list, o0000o0o4, oooO00o2, null), o0oooo1);
                        }
                        if (objWithContext != coroutine_suspended) {
                            coroutine_suspended = (OooO00o) objWithContext;
                            drawable = coroutine_suspended.f35520OooO00o;
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
                        oo0ooo0 = null;
                    }
                } else {
                    oo0ooo0 = null;
                    try {
                        throw new NoWhenBranchMatchedException();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                r7 = r4;
                obj2 = r7.element;
                if (obj2 instanceof oo0oOO0) {
                    oo0ooo1 = (oo0oOO0) obj2;
                } else {
                    oo0ooo1 = oo0ooo0;
                }
                if (oo0ooo1 != null && (o0000oo1 = oo0ooo1.f35800OooO00o) != null) {
                    o000O0O0.OooO00o(o0000oo1);
                }
                throw th;
            }
            CoroutineDispatcher coroutineDispatcher = oooO00o2.f8573OooOoO0;
            o00O0O o00o0o2 = new o00O0O(oooo3, r4, objectRef3, oooO00o2, obj3, objectRef, o0000o0o3, null);
            o0oooo1.f35569OooO0Oo = oooo3;
            o0oooo1.f35571OooO0o0 = oooO00o2;
            o0oooo1.f35570OooO0o = o0000o0o3;
            o0oooo1.f35572OooO0oO = objectRef;
            o0oooo1.f35573OooO0oo = r4;
            o0oooo1.f35568OooO = null;
            o0oooo1.f35574OooOO0 = null;
            o0oooo1.f35575OooOO0O = null;
            o0oooo1.f35577OooOOO = 2;
            Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher, o00o0o2, o0oooo1);
            if (objWithContext2 != coroutine_suspended) {
                oooo2 = oooo3;
                oooO00o4 = oooO00o2;
                o0000o0o5 = o0000o0o3;
                objectRef5 = objectRef;
                obj5 = objWithContext2;
                r3 = r4;
                objectRef = objectRef5;
                o0000o0o4 = o0000o0o5;
                oooO00o2 = oooO00o4;
                oooo1 = oooo2;
                oooO00o3 = (OooO00o) obj5;
                r2 = r3;
                obj4 = r2.element;
                if (obj4 instanceof oo0oOO0) {
                    oo0ooo2 = (oo0oOO0) obj4;
                } else {
                    oo0ooo2 = null;
                }
                if (oo0ooo2 != null) {
                    o000O0O0.OooO00o(o0000oo2);
                }
                o0oo0oo3 = (o0Oo0oo) objectRef.element;
                bitmapDrawable = null;
                o0oooo1.f35569OooO0Oo = null;
                o0oooo1.f35571OooO0o0 = null;
                o0oooo1.f35570OooO0o = null;
                o0oooo1.f35572OooO0oO = null;
                o0oooo1.f35573OooO0oo = null;
                o0oooo1.f35568OooO = null;
                o0oooo1.f35574OooOO0 = null;
                o0oooo1.f35575OooOO0O = null;
                o0oooo1.f35577OooOOO = 3;
                oooo1.getClass();
                list = oooO00o2.f8559OooOO0o;
                objWithContext = oooO00o3;
                if (!list.isEmpty()) {
                    objWithContext = oooO00o3;
                    objWithContext = BuildersKt.withContext(oooO00o2.f8572OooOoO, new oo000o(oooo1, oooO00o3, o0oo0oo3, list, o0000o0o4, oooO00o2, null), o0oooo1);
                }
                if (objWithContext != coroutine_suspended) {
                    coroutine_suspended = (OooO00o) objWithContext;
                    drawable = coroutine_suspended.f35520OooO00o;
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
            oo0ooo0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p101o000oo.o00oO0o
    @Nullable
    public final Object OooO00o(@NotNull o0ooOOo o0ooooo, @NotNull Continuation continuation) throws Throwable {
        o00Oo0 o00oo1;
        Oooo0 oooo0;
        o00oO0o.OooO00o oooO00o;
        o000OO0O o000oo0o2 = this.f35519OooO0OO;
        if (continuation instanceof o00Oo0) {
            o00oo1 = (o00Oo0) continuation;
            int i = o00oo1.f35559OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo1.f35559OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o00oo1 = new o00Oo0(this, continuation);
            }
        } else {
            o00oo1 = new o00Oo0(this, continuation);
        }
        o00Oo0 o00oo2 = o00oo1;
        Object objWithContext = o00oo2.f35556OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00oo2.f35559OooO0oo;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = o00oo2.f35557OooO0o0;
            oooo0 = o00oo2.f35555OooO0Oo;
            try {
                ResultKt.throwOnFailure(objWithContext);
            } catch (Throwable th) {
                th = th;
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                oo0o0Oo oo0o0oo = oooo0.f35518OooO0O0;
                coil.request.OooO00o OooO00o2 = oooO00o.OooO00o();
                oo0o0oo.getClass();
                return oo0o0Oo.OooO00o(OooO00o2, th);
            }
        }
        ResultKt.throwOnFailure(objWithContext);
        try {
            coil.request.OooO00o oooO00o2 = o0ooooo.f35582OooO0Oo;
            Object obj = oooO00o2.f8550OooO0O0;
            o00O00 o00o01 = o0ooooo.f35584OooO0o0;
            Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
            o0000O0O o0000o0o2 = o0ooooo.f35583OooO0o;
            o0Oo0oo o0oo0ooOooO0OO = this.f35518OooO0O0.OooO0OO(oooO00o2, o00o01);
            Scale scale = o0oo0ooOooO0OO.f35868OooO0o0;
            o0000o0o2.OooO0o0();
            List<Pair<OooOo00<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f35517OooO00o.getComponents().f35396OooO0O0;
            int size = list.size();
            Object obj2 = obj;
            int i3 = 0;
            while (i3 < size) {
                Pair<OooOo00<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i3);
                OooOo00<? extends Object, ? extends Object> oooOo00Component1 = pair.component1();
                List<Pair<OooOo00<? extends Object, ? extends Object>, Class<? extends Object>>> list2 = list;
                if (pair.component2().isAssignableFrom(obj2.getClass())) {
                    Intrinsics.checkNotNull(oooOo00Component1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                    Object objOooO00o = oooOo00Component1.OooO00o(obj2, o0oo0ooOooO0OO);
                    if (objOooO00o != null) {
                        obj2 = objOooO00o;
                    }
                }
                i3++;
                list = list2;
            }
            o0000o0o2.OooO0o();
            MemoryCache.Key keyOooO0O0 = o000oo0o2.OooO0O0(oooO00o2, obj2, o0oo0ooOooO0OO, o0000o0o2);
            MemoryCache.OooO00o OooO00o3 = keyOooO0O0 != null ? o000oo0o2.OooO00o(oooO00o2, keyOooO0O0, o00o01, scale) : null;
            if (OooO00o3 != null) {
                return o000OO0O.OooO0OO(o0ooooo, oooO00o2, keyOooO0O0, OooO00o3);
            }
            CoroutineDispatcher coroutineDispatcher = oooO00o2.f8567OooOo;
            o00Ooo o00ooo2 = new o00Ooo(this, oooO00o2, obj2, o0oo0ooOooO0OO, o0000o0o2, keyOooO0O0, o0ooooo, null);
            o00oo2.f35555OooO0Oo = this;
            o00oo2.f35557OooO0o0 = o0ooooo;
            o00oo2.f35559OooO0oo = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, o00ooo2, o00oo2);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        } catch (Throwable th2) {
            th = th2;
            oooo0 = this;
            oooO00o = o0ooooo;
            if (!(th instanceof CancellationException)) {
                throw th;
            }
            oo0o0Oo oo0o0oo2 = oooo0.f35518OooO0O0;
            coil.request.OooO00o OooO00o4 = oooO00o.OooO00o();
            oo0o0oo2.getClass();
            return oo0o0Oo.OooO00o(OooO00o4, th);
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
    public final java.lang.Object OooO0Oo(p097o000o0oO.o0000O0 r19, coil.request.OooO00o r20, java.lang.Object r21, p109o000ooo.o0Oo0oo r22, p097o000o0oO.o0000O0O r23, kotlin.coroutines.Continuation<? super p105o000oo0o.o00O0O0O> r24) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p101o000oo.Oooo0.OooO0Oo(o000o0oO.o0000O0, coil.request.OooO00o, java.lang.Object, o000ooo.o0Oo0oo, o000o0oO.o0000O0O, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
