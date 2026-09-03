package p534o0o0OOo0;

import com.umeng.analytics.pro.ak;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity$initView$1", f = "DeleteAccountSubmitActivity.kt", i = {0}, l = {57}, m = "invokeSuspend", n = {ak.aC}, s = {"I$0"})
public final class o0O00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43539Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f43540Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f43541Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(DeleteAccountSubmitActivity deleteAccountSubmitActivity, Continuation<? super o0O00000> continuation) {
        super(2, continuation);
        this.f43541Oooo0oo = deleteAccountSubmitActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O00000(this.f43541Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O00000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x0073 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0071 -> B:18:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0073
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f43540Oooo0oO
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            int r1 = r6.f43539Oooo0o
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            goto L74
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            r7 = r6
            r1 = 0
        L20:
            r3 = 16
            if (r1 >= r3) goto L76
            com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity r3 = r7.f43541Oooo0oo
            com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity$OooO00o r4 = com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity.f21745Ooooo0o
            o0ooOOoo.k6 r3 = r3.OooOoo()
            com.yalla.support.statebutton.StateButton r3 = r3.f49820OooOO0O
            r4 = 2131821782(0x7f1104d6, float:1.9276317E38)
            r5 = 15
            if (r1 >= r5) goto L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = p254o00ooO0O.o000O0O0.OooO0OO(r4)
            r5.append(r4)
            r4 = 40
            r5.append(r4)
            int r4 = 15 - r1
            r5.append(r4)
            java.lang.String r4 = "s)"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L64
        L55:
            com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity r5 = r7.f43541Oooo0oo
            o0ooOOoo.k6 r5 = r5.OooOoo()
            com.yalla.support.statebutton.StateButton r5 = r5.f49820OooOO0O
            r5.setEnabled(r2)
            java.lang.String r4 = p254o00ooO0O.o000O0O0.OooO0OO(r4)
        L64:
            r3.setText(r4)
            r3 = 1000(0x3e8, double:4.94E-321)
            r7.f43539Oooo0o = r1
            r7.f43540Oooo0oO = r2
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r7)
            if (r3 != r0) goto L74
            return r0
        L74:
            int r1 = r1 + r2
            goto L20
        L76:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p534o0o0OOo0.o0O00000.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
