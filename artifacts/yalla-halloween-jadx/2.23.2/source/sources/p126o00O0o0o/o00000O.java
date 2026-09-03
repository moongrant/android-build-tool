package p126o00O0o0o;

import coil.request.OooO00o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o00O.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o000000;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", i = {0, 0, 0}, l = {242}, m = "invokeSuspend", n = {"$this$withContext", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "I$0"})
public final class o00000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0O0O00.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public /* synthetic */ Object f36659OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List f36660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f36661OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0O0O00 f36662OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f36663OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f36664OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f36665OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.OooO00o f36666OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f36667OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ o000000 f36668OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ List<OooO0OO> f36669OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ OooO00o f36670OooOOOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000O(o0O0O00 o0o0o00, o0O0O00.OooO00o oooO00o, o0O0O00 o0o0o01, List<? extends OooO0OO> list, o000000 o000000Var, OooO00o oooO00o2, Continuation<? super o00000O> continuation) {
        super(2, continuation);
        this.f36665OooOO0 = o0o0o00;
        this.f36666OooOO0O = oooO00o;
        this.f36667OooOO0o = o0o0o01;
        this.f36669OooOOO0 = list;
        this.f36668OooOOO = o000000Var;
        this.f36670OooOOOO = oooO00o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00000O o00000o = new o00000O(this.f36665OooOO0, this.f36666OooOO0O, this.f36667OooOO0o, this.f36669OooOOO0, this.f36668OooOOO, this.f36670OooOOOO, continuation);
        o00000o.f36659OooO = obj;
        return o00000o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0O0O00.OooO00o> continuation) {
        return ((o00000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:22:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f36664OooO0oo
            r2 = 1
            if (r1 == 0) goto L25
            if (r1 != r2) goto L1d
            int r1 = r12.f36663OooO0oO
            int r3 = r12.f36661OooO0o
            o00O0oo0.o0O0O00 r4 = r12.f36662OooO0o0
            java.util.List r5 = r12.f36660OooO0Oo
            java.lang.Object r6 = r12.f36659OooO
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.ResultKt.throwOnFailure(r13)
            r7 = r12
            goto L90
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f36659OooO
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            o00O0o0o.o0O0O00$OooO00o r1 = r12.f36666OooOO0O
            android.graphics.drawable.Drawable r1 = r1.f36706OooO00o
            o00O0o0o.o0O0O00 r3 = r12.f36665OooOO0
            r3.getClass()
            boolean r3 = r1 instanceof android.graphics.drawable.BitmapDrawable
            o00O0oo0.o0O0O00 r4 = r12.f36667OooOO0o
            if (r3 == 0) goto L53
            r3 = r1
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            android.graphics.Bitmap$Config r5 = r3.getConfig()
            if (r5 != 0) goto L4a
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L4a:
            android.graphics.Bitmap$Config[] r6 = o00OO00O.OooOo00.f37081OooO00o
            boolean r5 = kotlin.collections.ArraysKt.contains(r6, r5)
            if (r5 == 0) goto L53
            goto L5f
        L53:
            android.graphics.Bitmap$Config r3 = r4.f36839OooO0O0
            coil.size.Scale r5 = r4.f36843OooO0o0
            boolean r6 = r4.f36842OooO0o
            o00O0oo.o000O0Oo r7 = r4.f36841OooO0Oo
            android.graphics.Bitmap r3 = o00OO00O.Oooo000.OooO00o(r1, r3, r7, r5, r6)
        L5f:
            o00O0Oo.o000000 r1 = r12.f36668OooOOO
            r1.OooO0oo()
            java.util.List<o00O.OooO0OO> r1 = r12.f36669OooOOO0
            int r5 = r1.size()
            r6 = 0
            r7 = r12
            r10 = r6
            r6 = r13
            r13 = r3
            r3 = r10
            r11 = r5
            r5 = r1
            r1 = r11
        L73:
            if (r3 >= r1) goto L97
            java.lang.Object r8 = r5.get(r3)
            o00O.OooO0OO r8 = (o00O.OooO0OO) r8
            o00O0oo.o000O0Oo r9 = r4.f36841OooO0Oo
            r7.f36659OooO = r6
            r7.f36660OooO0Oo = r5
            r7.f36662OooO0o0 = r4
            r7.f36661OooO0o = r3
            r7.f36663OooO0oO = r1
            r7.f36664OooO0oo = r2
            android.graphics.Bitmap r13 = r8.OooO00o(r13)
            if (r13 != r0) goto L90
            return r0
        L90:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
            int r3 = r3 + r2
            goto L73
        L97:
            o00O0Oo.o000000 r0 = r7.f36668OooOOO
            r0.OooOO0O()
            coil.request.OooO00o r0 = r7.f36670OooOOOO
            android.content.Context r0 = r0.f11639OooO00o
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r0, r13)
            o00O0o0o.o0O0O00$OooO00o r13 = r7.f36666OooOO0O
            boolean r0 = r13.f36707OooO0O0
            o00O0o0o.o0O0O00$OooO00o r2 = new o00O0o0o.o0O0O00$OooO00o
            coil.decode.DataSource r3 = r13.f36708OooO0OO
            java.lang.String r13 = r13.f36709OooO0Oo
            r2.<init>(r1, r0, r3, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p126o00O0o0o.o00000O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
