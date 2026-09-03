package com.yalla.yalla.app.golbalData;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.CategoryModel;
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
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.ApiTagUtils$init$1", f = "ApiTagUtils.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiTagUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiTagUtils.kt\ncom/yalla/yalla/app/golbalData/ApiTagUtils$init$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,76:1\n62#2:77\n*S KotlinDebug\n*F\n+ 1 ApiTagUtils.kt\ncom/yalla/yalla/app/golbalData/ApiTagUtils$init$1\n*L\n44#1:77\n*E\n"})
public final class ApiTagUtils$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22724OooO0Oo;

    public ApiTagUtils$init$1(Continuation<? super ApiTagUtils$init$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ApiTagUtils$init$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new ApiTagUtils$init$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22724OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = o0000O.f44184o0ooOOo;
            ApiTagUtils$init$1$invokeSuspend$$inlined$call$1 apiTagUtils$init$1$invokeSuspend$$inlined$call$1 = new ApiTagUtils$init$1$invokeSuspend$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null);
            this.f22724OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(apiTagUtils$init$1$invokeSuspend$$inlined$call$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList<CategoryModel> arrayList = ApiTagUtils.f22722OooO0O0;
        arrayList.clear();
        List list = (List) ((ApiResult) obj).getData();
        if (list != null) {
            Boxing.boxBoolean(arrayList.addAll(list));
        }
        ApiTagUtils.f22721OooO00o.clear();
        for (CategoryModel categoryModel : arrayList) {
            HashMap<String, CategoryModel> map = ApiTagUtils.f22721OooO00o;
            String id = categoryModel.getId();
            Intrinsics.checkNotNullExpressionValue(id, "dataBean.getId()");
            map.put(id, categoryModel);
        }
        return Unit.INSTANCE;
    }
}
