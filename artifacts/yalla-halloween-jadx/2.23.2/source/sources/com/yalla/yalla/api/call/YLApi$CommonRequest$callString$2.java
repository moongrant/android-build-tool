package com.yalla.yalla.api.call;

import com.code.android.json.OooO00o;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import com.yalla.yalla.model.http.ApiError;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o00Ooo;
import p380o0OOoOo.o00oO0o;
import p380o0OOoOo.o0ooOOo;
import p383o0OOoo0.OooOo;
import p383o0OOoo0.OooOo00;
import p383o0OOoo0.Oooo000;
import p598o0oo00Oo.o0000O00;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.yalla.yalla.api.call.YLApi$CommonRequest$callString$2", f = "YLApi.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nYLApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest$callString$2\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,86:1\n18#2,7:87\n25#2,10:95\n109#3:94\n*S KotlinDebug\n*F\n+ 1 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest$callString$2\n*L\n78#1:87,7\n78#1:95,10\n78#1:94\n*E\n"})
public final class YLApi$CommonRequest$callString$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00Ooo f22201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f22202OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f22203OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLApi$CommonRequest$callString$2(o0ooOOo o0ooooo, Continuation<? super YLApi$CommonRequest$callString$2> continuation) {
        super(2, continuation);
        this.f22202OooO0o = o0ooooo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new YLApi$CommonRequest$callString$2(this.f22202OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((YLApi$CommonRequest$callString$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00Ooo o00ooo2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22203OooO0o0;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0ooOOo o0ooooo = this.f22202OooO0o;
                o0ooooo.f43258OooO0Oo.put("AbortDataCheck", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                ParamsWrapper paramsWrapper = new ParamsWrapper(o0ooooo.f43257OooO0OO, null, o0ooooo.f43258OooO0Oo);
                String url = o0ooooo.f43255OooO00o;
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
                int i2 = o0ooooo.f43256OooO0O0;
                OooOo00 oooOo = (i2 == 0 || i2 != 1) ? new OooOo(url, paramsWrapper) : new Oooo000(url, paramsWrapper);
                o00Ooo o00ooo3 = o00Ooo.f43254OooO00o;
                this.f22201OooO0Oo = o00ooo3;
                this.f22203OooO0o0 = 1;
                obj = oooOo.OooO00o(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00ooo2 = o00ooo3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00ooo2 = this.f22201OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00ooo2.getClass();
            return o00Ooo.OooO00o((o0O00oO0) obj);
        } catch (IOException e) {
            String strOooO0oo = OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = OooO00o.OooO0OO(String.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = OooO00o.OooO0OO(String.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = OooO00o.OooO0OO(String.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
