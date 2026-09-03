package p579o0oOoOOo;

import com.umeng.analytics.pro.ak;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$showWinningInfo$1", f = "TreasureBoxOpenDialog.kt", i = {0}, l = {97}, m = "invokeSuspend", n = {ak.aC}, s = {"I$0"})
public final class k1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f46000Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f46001Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxOpenDialog f46002Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$showWinningInfo$1$1", f = "TreasureBoxOpenDialog.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f46003Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46003Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f46003Oooo0o = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(TreasureBoxOpenDialog treasureBoxOpenDialog, Continuation<? super k1> continuation) {
        super(2, continuation);
        this.f46002Oooo0oo = treasureBoxOpenDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k1(this.f46002Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((k1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0054 -> B:13:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f46001Oooo0oO
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            int r1 = r7.f46000Oooo0o
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L57
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 3
            r8 = r7
            r1 = 3
        L21:
            if (r2 >= r1) goto L59
            com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog r4 = r8.f46002Oooo0oo
            o0ooOOoo.pf r4 = r4.f23794OoooOO0
            android.widget.TextView r4 = r4.f50321OooOO0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r6 = 2131822996(0x7f110994, float:1.927878E38)
            java.lang.String r6 = p254o00ooO0O.o000O0O0.OooO0OO(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.setText(r5)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getDefault()
            o0oOoOOo.k1$OooO00o r5 = new o0oOoOOo.k1$OooO00o
            r6 = 0
            r5.<init>(r6)
            r8.f46000Oooo0o = r1
            r8.f46001Oooo0oO = r3
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r8)
            if (r4 != r0) goto L57
            return r0
        L57:
            int r1 = r1 + r2
            goto L21
        L59:
            com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog r8 = r8.f46002Oooo0oo
            r8.OooO0O0()
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p579o0oOoOOo.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
