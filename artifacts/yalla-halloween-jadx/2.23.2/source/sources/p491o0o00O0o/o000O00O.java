package p491o0o00O0o;

import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity$initView$1", f = "DeleteAccountSubmitActivity.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48955OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f48956OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f48957OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(DeleteAccountSubmitActivity deleteAccountSubmitActivity, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f48956OooO0o = deleteAccountSubmitActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f48956OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0072 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:18:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0072
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
            int r1 = r7.f48957OooO0o0
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            int r1 = r7.f48955OooO0Oo
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L73
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 0
            r1 = r8
            r8 = r7
        L20:
            r3 = 16
            if (r1 >= r3) goto L75
            int r3 = com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity.f24720OooOo0
            com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity r3 = r8.f48956OooO0o
            o0Oo0OOO.o000OOo0 r4 = r3.OooOo()
            com.yalla.support.statebutton.StateButton r4 = r4.f44245OooOO0O
            r5 = 15
            if (r1 >= r5) goto L54
            int r3 = p562o0oOo000.o000000.delete_account
            java.lang.String r3 = com.code.android.util.o0000.OooO0OO(r3)
            int r5 = 15 - r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = "("
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = "s)"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            goto L63
        L54:
            o0Oo0OOO.o000OOo0 r3 = r3.OooOo()
            com.yalla.support.statebutton.StateButton r3 = r3.f44245OooOO0O
            r3.setEnabled(r2)
            int r3 = p562o0oOo000.o000000.delete_account
            java.lang.String r3 = com.code.android.util.o0000.OooO0OO(r3)
        L63:
            r4.setText(r3)
            r8.f48955OooO0Oo = r1
            r8.f48957OooO0o0 = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r8)
            if (r3 != r0) goto L73
            return r0
        L73:
            int r1 = r1 + r2
            goto L20
        L75:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p491o0o00O0o.o000O00O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
