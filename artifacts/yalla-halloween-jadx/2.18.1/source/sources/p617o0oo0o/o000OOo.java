package p617o0oo0o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o0O0O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.util.HorizontalPagerExt$HorizontalPagerAutoLooping$3$1", f = "HorizontalPagerExt.kt", i = {}, l = {81, 88, 90}, m = "invokeSuspend", n = {}, s = {})
public final class o000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o0O00OO f48532Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f48533Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f48534Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooOO0 f48535Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ boolean f48536OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f48537OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f48538OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f48539OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ long f48540OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ int f48541OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final /* synthetic */ int f48542OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f48543OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f48544o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(boolean z, long j, OooOO0 oooOO1, int i, int i2, o0O00OO<Boolean> o0o00oo2, Continuation<? super o000OOo> continuation) {
        super(2, continuation);
        this.f48536OoooO = z;
        this.f48540OoooOO0 = j;
        this.f48544o000oOoO = oooOO1;
        this.f48541OoooOOO = i;
        this.f48542OoooOOo = i2;
        this.f48543OoooOo0 = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OOo(this.f48536OoooO, this.f48540OoooOO0, this.f48544o000oOoO, this.f48541OoooOOO, this.f48542OoooOOo, this.f48543OoooOo0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[DONT_INVERT, PHI: r2 r6 r8 r9 r10 r11 r12
      0x0071: PHI (r2v4 boolean) = (r2v2 boolean), (r2v3 boolean), (r2v5 boolean) binds: [B:18:0x006e, B:24:0x009c, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r6v2 long) = (r6v0 long), (r6v1 long), (r6v3 long) binds: [B:18:0x006e, B:24:0x009c, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r8v2 o0O0O0O.OooOO0) = (r8v0 o0O0O0O.OooOO0), (r8v1 o0O0O0O.OooOO0), (r8v3 o0O0O0O.OooOO0) binds: [B:18:0x006e, B:24:0x009c, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r9v2 int) = (r9v0 int), (r9v1 int), (r9v3 int) binds: [B:18:0x006e, B:24:0x009c, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r10v2 int) = (r10v0 int), (r10v1 int), (r10v3 int) binds: [B:18:0x006e, B:24:0x009c, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r11v2 o000oOoO.o0O00OO<java.lang.Boolean>) = 
      (r11v0 o000oOoO.o0O00OO<java.lang.Boolean>)
      (r11v1 o000oOoO.o0O00OO<java.lang.Boolean>)
      (r11v3 o000oOoO.o0O00OO<java.lang.Boolean>)
     binds: [B:18:0x006e, B:24:0x009c, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r12v3 o0oo0o.o000OOo) = (r12v1 o0oo0o.o000OOo), (r12v2 o0oo0o.o000OOo), (r12v4 o0oo0o.o000OOo) binds: [B:18:0x006e, B:24:0x009c, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0073 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:8:0x001f, B:20:0x0073, B:23:0x0088, B:25:0x009e, B:33:0x00b5, B:37:0x00c0, B:41:0x00d7, B:34:0x00ba, B:45:0x00ef, B:15:0x0051, B:18:0x006e), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x009e A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:8:0x001f, B:20:0x0073, B:23:0x0088, B:25:0x009e, B:33:0x00b5, B:37:0x00c0, B:41:0x00d7, B:34:0x00ba, B:45:0x00ef, B:15:0x0051, B:18:0x006e), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:8:0x001f, B:20:0x0073, B:23:0x0088, B:25:0x009e, B:33:0x00b5, B:37:0x00c0, B:41:0x00d7, B:34:0x00ba, B:45:0x00ef, B:15:0x0051, B:18:0x006e), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:8:0x001f, B:20:0x0073, B:23:0x0088, B:25:0x009e, B:33:0x00b5, B:37:0x00c0, B:41:0x00d7, B:34:0x00ba, B:45:0x00ef, B:15:0x0051, B:18:0x006e), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:8:0x001f, B:20:0x0073, B:23:0x0088, B:25:0x009e, B:33:0x00b5, B:37:0x00c0, B:41:0x00d7, B:34:0x00ba, B:45:0x00ef, B:15:0x0051, B:18:0x006e), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:8:0x001f, B:20:0x0073, B:23:0x0088, B:25:0x009e, B:33:0x00b5, B:37:0x00c0, B:41:0x00d7, B:34:0x00ba, B:45:0x00ef, B:15:0x0051, B:18:0x006e), top: B:51:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009c -> B:19:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d5 -> B:44:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ea -> B:44:0x00ed). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p617o0oo0o.o000OOo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
