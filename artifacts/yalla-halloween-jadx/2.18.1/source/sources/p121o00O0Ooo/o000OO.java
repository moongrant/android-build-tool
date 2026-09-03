package p121o00O0Ooo;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {90, 92}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
public final class o000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function3<Integer, Throwable, Continuation<? super Boolean>, Object> f30898Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Throwable f30899Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f30900Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f30901Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ String f30902OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00000O f30903OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Context f30904OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ String f30905OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ String f30906OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o00000O0> f30907OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ String f30908o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OO(Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Context context, o00000O o00000o, String str, String str2, String str3, String str4, o0O00OO<o00000O0> o0o00oo2, Continuation<? super o000OO> continuation) {
        super(2, continuation);
        this.f30898Oooo = function3;
        this.f30904OoooO00 = context;
        this.f30903OoooO0 = o00000o;
        this.f30905OoooO0O = str;
        this.f30902OoooO = str2;
        this.f30906OoooOO0 = str3;
        this.f30908o000oOoO = str4;
        this.f30907OoooOOO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OO(this.f30898Oooo, this.f30904OoooO00, this.f30903OoooO0, this.f30905OoooO0O, this.f30902OoooO, this.f30906OoooOO0, this.f30908o000oOoO, this.f30907OoooOOO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[Catch: all -> 0x00e9, TryCatch #3 {all -> 0x00e9, blocks: (B:26:0x007f, B:33:0x00a7, B:29:0x0098, B:32:0x00a2), top: B:78:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1 A[Catch: all -> 0x00e7, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00e7, blocks: (B:37:0x00bd, B:38:0x00c5, B:41:0x00d1, B:44:0x00dd, B:47:0x00e5, B:48:0x00e6, B:39:0x00c6, B:43:0x00d3), top: B:76:0x00bd, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3 A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:39:0x00c6, B:43:0x00d3), top: B:72:0x00c6, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b7 -> B:76:0x00bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121o00O0Ooo.o000OO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
