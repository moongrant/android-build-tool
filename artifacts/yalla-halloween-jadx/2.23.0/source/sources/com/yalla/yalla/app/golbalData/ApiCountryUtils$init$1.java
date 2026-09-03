package com.yalla.yalla.app.golbalData;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.ApiCountryUtils$init$1", f = "ApiCountryUtils.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiCountryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCountryUtils.kt\ncom/yalla/yalla/app/golbalData/ApiCountryUtils$init$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,101:1\n62#2:102\n*S KotlinDebug\n*F\n+ 1 ApiCountryUtils.kt\ncom/yalla/yalla/app/golbalData/ApiCountryUtils$init$1\n*L\n47#1:102\n*E\n"})
public final class ApiCountryUtils$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22709OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o.InterfaceC0285OooO00o f22710OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f22711OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiCountryUtils$init$1(String str, OooO00o.InterfaceC0285OooO00o interfaceC0285OooO00o, Continuation<? super ApiCountryUtils$init$1> continuation) {
        super(2, continuation);
        this.f22711OooO0o0 = str;
        this.f22710OooO0o = interfaceC0285OooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ApiCountryUtils$init$1(this.f22711OooO0o0, this.f22710OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApiCountryUtils$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22709OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = o0000O.f44175o00oO0O;
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(str, "url", str, 0);
            o0o0oooOooO00o.OooO0O0(this.f22711OooO0o0, "sort");
            ApiCountryUtils$init$1$invokeSuspend$$inlined$call$1 apiCountryUtils$init$1$invokeSuspend$$inlined$call$1 = new ApiCountryUtils$init$1$invokeSuspend$$inlined$call$1(o0o0oooOooO00o, null);
            this.f22709OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(apiCountryUtils$init$1$invokeSuspend$$inlined$call$1, this);
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
        if (apiResult.getData() != null && apiResult.isSuccess()) {
            ArrayList<CountryModel> arrayList = OooO00o.f22728OooO0O0;
            arrayList.clear();
            OooO00o.f22727OooO00o.clear();
            List list = (List) apiResult.getData();
            if (list != null) {
                Boxing.boxBoolean(arrayList.addAll(list));
            }
            for (CountryModel dataBean : arrayList) {
                HashMap<String, CountryModel> map = OooO00o.f22727OooO00o;
                String cid = dataBean.getCid();
                Intrinsics.checkNotNullExpressionValue(cid, "dataBean.cid");
                Intrinsics.checkNotNullExpressionValue(dataBean, "dataBean");
                map.put(cid, dataBean);
            }
            OooO00o.InterfaceC0285OooO00o interfaceC0285OooO00o = this.f22710OooO0o;
            if (interfaceC0285OooO00o != null) {
                interfaceC0285OooO00o.OooO00o(OooO00o.f22728OooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
