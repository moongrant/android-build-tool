package com.yalla.yalla.ui.activity.room;

import com.app.base.interfaceType.FeedbackType;
import com.yalla.yalla.common.model.ApiResult;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o0000O0;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CountryTagActivity$initData$1", f = "CountryTagActivity.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
public final class CountryTagActivity$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f22770Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CountryTagActivity f22771Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTagActivity$initData$1(CountryTagActivity countryTagActivity, Continuation<? super CountryTagActivity$initData$1> continuation) {
        super(2, continuation);
        this.f22771Oooo0oO = countryTagActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CountryTagActivity$initData$1(this.f22771Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CountryTagActivity$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22770Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32334o0OOO0o;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
            o00o000oOooO0O0.OooO0O0("sort", this.f22771Oooo0oO.f22767OoooOoo ? "1" : FeedbackType.Suggestions);
            CountryTagActivity$initData$1$invokeSuspend$$inlined$call$1 countryTagActivity$initData$1$invokeSuspend$$inlined$call$1 = new CountryTagActivity$initData$1$invokeSuspend$$inlined$call$1(o00o000oOooO0O0, null);
            this.f22770Oooo0o = 1;
            obj = o0000O0.OooO0OO(countryTagActivity$initData$1$invokeSuspend$$inlined$call$1, this);
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
            Collection collection = (Collection) apiResult.getData();
            if (!(collection == null || collection.isEmpty())) {
                this.f22771Oooo0oO.f22766OoooOoO.f31217OooO00o = (List) apiResult.getData();
                this.f22771Oooo0oO.f22766OoooOoO.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }
}
