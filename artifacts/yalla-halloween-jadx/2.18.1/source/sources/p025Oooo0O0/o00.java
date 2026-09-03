package p025Oooo0O0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {191}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
public final class o00 extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super o0Oo0oo>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f1476Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f1477Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f1478Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f1479Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o0Oo0oo o0oo0oo2, Continuation<? super o00> continuation) {
        super(2, continuation);
        this.f1476Oooo = o0oo0oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00 o00Var = new o00(this.f1476Oooo, continuation);
        o00Var.f1479Oooo0oo = obj;
        return o00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OooOOO oooOOO, Continuation<? super o0Oo0oo> continuation) {
        return ((o00) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:13:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f1478Oooo0oO
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            long r3 = r10.f1477Oooo0o
            java.lang.Object r1 = r10.f1479Oooo0oo
            o0Oo0oo.OooOOO r1 = (p418o0Oo0oo.OooOOO) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            goto L4c
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f1479Oooo0oo
            o0Oo0oo.OooOOO r11 = (p418o0Oo0oo.OooOOO) r11
            o0Oo0oo.o0Oo0oo r1 = r10.f1476Oooo
            long r3 = r1.f39743OooO0O0
            androidx.compose.ui.platform.o00OOOOo r1 = r11.getViewConfiguration()
            r1.OooO0O0()
            r5 = 40
            long r5 = r5 + r3
            r1 = r11
            r3 = r5
            r11 = r10
        L39:
            r11.f1479Oooo0oo = r1
            r11.f1477Oooo0o = r3
            r11.f1478Oooo0oO = r2
            java.lang.Object r5 = p025Oooo0O0.o000OOo0.OooO0O0(r1, r2, r11)
            if (r5 != r0) goto L46
            return r0
        L46:
            r9 = r0
            r0 = r11
            r11 = r5
            r4 = r3
            r3 = r1
            r1 = r9
        L4c:
            o0Oo0oo.o0Oo0oo r11 = (p418o0Oo0oo.o0Oo0oo) r11
            long r6 = r11.f39743OooO0O0
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 < 0) goto L55
            return r11
        L55:
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: p025Oooo0O0.o00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
