package com.yalla.yalla.ui.activity.main;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.api.result.ApiResult;
import com.yalla.yalla.util.o000O0o;
import com.yalla.yalla.util.o000Oo0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.StartActivity$handleAutoVisitorLoginAsync$1", f = "StartActivity.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
public final class StartActivity$handleAutoVisitorLoginAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ long f75878OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f75879OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ StartActivity f75880OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartActivity$handleAutoVisitorLoginAsync$1(StartActivity startActivity, long j, Continuation<? super StartActivity$handleAutoVisitorLoginAsync$1> continuation) {
        super(2, continuation);
        this.f75880OooO0oo = startActivity;
        this.f75878OooO = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StartActivity$handleAutoVisitorLoginAsync$1(this.f75880OooO0oo, this.f75878OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StartActivity$handleAutoVisitorLoginAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f75879OooO0oO;
        StartActivity startActivity = this.f75880OooO0oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f75879OooO0oO = 1;
            obj = StartActivity.OooOooO(startActivity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult.isSuccess()) {
            Intrinsics.checkNotNullParameter("StartActivity auto login success, handleAllMessages", ViewHierarchyConstants.TEXT_KEY);
            long jCurrentTimeMillis = System.currentTimeMillis() - o000Oo0.f81079OooO00o;
            long j = jCurrentTimeMillis - o000Oo0.f81081OooO0OO;
            o000Oo0.f81081OooO0OO = jCurrentTimeMillis;
            com.yalla.yalla.util.log.OooOO0.OooO0Oo("TaskDispatcher", 1, new o000O0o("StartActivity auto login success, handleAllMessages", j), 4);
            int i2 = StartActivity.f75869OooOo0o;
            startActivity.Oooo000();
            startActivity.finish();
        } else {
            if (apiResult.getCode() == 4075) {
                int i3 = StartActivity.f75869OooOo0o;
                startActivity.Oooo0();
            } else {
                int i4 = StartActivity.f75869OooOo0o;
                p485o0o00OO0.OooO0OO.OooO0OO(startActivity, ComposableLambdaKt.composableLambdaInstance(96620427, true, new OooOO0(startActivity)));
            }
            startActivity.Oooo000();
        }
        com.yalla.yalla.statistical.dev.OooO00o.OooOOOO(com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o, "StartActivity loginByVisitor timestamp:" + this.f75878OooO + " result:" + apiResult.isSuccess() + " " + apiResult.getCode() + " " + apiResult.getMessage());
        return Unit.INSTANCE;
    }
}
