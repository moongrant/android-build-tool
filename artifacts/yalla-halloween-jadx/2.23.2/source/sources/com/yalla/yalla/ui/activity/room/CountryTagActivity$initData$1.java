package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.http.ApiResult;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CountryTagActivity$initData$1", f = "CountryTagActivity.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCountryTagActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryTagActivity.kt\ncom/yalla/yalla/ui/activity/room/CountryTagActivity$initData$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,91:1\n62#2:92\n*S KotlinDebug\n*F\n+ 1 CountryTagActivity.kt\ncom/yalla/yalla/ui/activity/room/CountryTagActivity$initData$1\n*L\n50#1:92\n*E\n"})
public final class CountryTagActivity$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f26046OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CountryTagActivity f26047OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTagActivity$initData$1(CountryTagActivity countryTagActivity, Continuation<? super CountryTagActivity$initData$1> continuation) {
        super(2, continuation);
        this.f26047OooO0o0 = countryTagActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CountryTagActivity$initData$1(this.f26047OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CountryTagActivity$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26046OooO0Oo;
        CountryTagActivity countryTagActivity = this.f26047OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = p384o0OOoo0O.Oooo0.f43434o00oO0O;
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(countryTagActivity.f26043OooOOoo ? "1" : FeedbackType.Suggestions, "sort");
            CountryTagActivity$initData$1$invokeSuspend$$inlined$call$1 countryTagActivity$initData$1$invokeSuspend$$inlined$call$1 = new CountryTagActivity$initData$1$invokeSuspend$$inlined$call$1(o0oooooOooO00o, null);
            this.f26046OooO0Oo = 1;
            obj = com.code.android.util.OooOOO.OooO0Oo(countryTagActivity$initData$1$invokeSuspend$$inlined$call$1, this);
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
                countryTagActivity.f26041OooOOo.f26980OooO00o = (List) apiResult.getData();
                countryTagActivity.f26041OooOOo.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }
}
