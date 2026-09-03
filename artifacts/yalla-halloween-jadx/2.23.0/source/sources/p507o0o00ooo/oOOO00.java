package p507o0o00ooo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.common.BannerCompKt$BannerComp$4$1", f = "BannerComp.kt", i = {}, l = {109, 119, 121}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBannerComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerComp.kt\ncom/yalla/yalla/ui/composable/common/BannerCompKt$BannerComp$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class oOOO00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public MutableState f50088OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f50089OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Oooo000 f50090OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f50091OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Function1 f50092OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Function1 f50093OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f50094OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f50095OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f50096OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ long f50097OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f50098OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f50099OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f50100OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f50101OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ int f50102OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final /* synthetic */ int f50103OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f50104OooOo00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOOO00(boolean z, long j, Oooo000 oooo000, Function1<? super Integer, Unit> function1, int i, Function1<? super Integer, Unit> function2, int i2, MutableState<Boolean> mutableState, Continuation<? super oOOO00> continuation) {
        super(2, continuation);
        this.f50098OooOOO0 = z;
        this.f50097OooOOO = j;
        this.f50099OooOOOO = oooo000;
        this.f50100OooOOOo = function1;
        this.f50102OooOOo0 = i;
        this.f50101OooOOo = function2;
        this.f50103OooOOoo = i2;
        this.f50104OooOo00 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOO00(this.f50098OooOOO0, this.f50097OooOOO, this.f50099OooOOOO, this.f50100OooOOOo, this.f50102OooOOo0, this.f50101OooOOo, this.f50103OooOOoo, this.f50104OooOo00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOOO00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084 A[Catch: all -> 0x0161, TRY_ENTER, TryCatch #0 {all -> 0x0161, blocks: (B:8:0x0023, B:22:0x0084, B:25:0x009d, B:27:0x00ab, B:28:0x00b2, B:30:0x00be, B:38:0x00d4, B:43:0x00e3, B:44:0x00ef, B:50:0x0125, B:39:0x00db, B:56:0x015b, B:13:0x0043, B:16:0x005a, B:19:0x006f), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:8:0x0023, B:22:0x0084, B:25:0x009d, B:27:0x00ab, B:28:0x00b2, B:30:0x00be, B:38:0x00d4, B:43:0x00e3, B:44:0x00ef, B:50:0x0125, B:39:0x00db, B:56:0x015b, B:13:0x0043, B:16:0x005a, B:19:0x006f), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00be A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:8:0x0023, B:22:0x0084, B:25:0x009d, B:27:0x00ab, B:28:0x00b2, B:30:0x00be, B:38:0x00d4, B:43:0x00e3, B:44:0x00ef, B:50:0x0125, B:39:0x00db, B:56:0x015b, B:13:0x0043, B:16:0x005a, B:19:0x006f), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:8:0x0023, B:22:0x0084, B:25:0x009d, B:27:0x00ab, B:28:0x00b2, B:30:0x00be, B:38:0x00d4, B:43:0x00e3, B:44:0x00ef, B:50:0x0125, B:39:0x00db, B:56:0x015b, B:13:0x0043, B:16:0x005a, B:19:0x006f), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:8:0x0023, B:22:0x0084, B:25:0x009d, B:27:0x00ab, B:28:0x00b2, B:30:0x00be, B:38:0x00d4, B:43:0x00e3, B:44:0x00ef, B:50:0x0125, B:39:0x00db, B:56:0x015b, B:13:0x0043, B:16:0x005a, B:19:0x006f), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:8:0x0023, B:22:0x0084, B:25:0x009d, B:27:0x00ab, B:28:0x00b2, B:30:0x00be, B:38:0x00d4, B:43:0x00e3, B:44:0x00ef, B:50:0x0125, B:39:0x00db, B:56:0x015b, B:13:0x0043, B:16:0x005a, B:19:0x006f), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:8:0x0023, B:22:0x0084, B:25:0x009d, B:27:0x00ab, B:28:0x00b2, B:30:0x00be, B:38:0x00d4, B:43:0x00e3, B:44:0x00ef, B:50:0x0125, B:39:0x00db, B:56:0x015b, B:13:0x0043, B:16:0x005a, B:19:0x006f), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0140 -> B:49:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0154 -> B:21:0x0082). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p507o0o00ooo.oOOO00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
