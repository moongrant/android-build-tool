package com.yalla.yalla.repository;

import androidx.appcompat.widget.o0000O0;
import com.code.android.json.OooO00o;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogJsonValue;
import com.yalla.yalla.model.MomentLogSourcePage;
import com.yalla.yalla.model.http.Response;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooO;
import o0000O0O.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.oO0O000o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/model/http/Response;", "com/yalla/yalla/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$momentBehaviorLog$$inlined$call$1", f = "WebEventRepository.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 WebEventRepository.kt\ncom/yalla/yalla/repository/WebEventRepository\n*L\n1#1,72:1\n314#2,9:73\n323#2,2:84\n107#3,2:82\n*S KotlinDebug\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n*L\n27#1:73,9\n27#1:84,2\n*E\n"})
public final class WebEventRepository$momentBehaviorLog$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<String>>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f24449OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24450OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentLogSourcePage f24451OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO0O000o f24452OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentLogActionType f24453OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f24454OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebEventRepository$momentBehaviorLog$$inlined$call$1(oO0O000o oo0o000o, Continuation continuation, MomentLogSourcePage momentLogSourcePage, MomentLogActionType momentLogActionType, String str, String str2) {
        super(2, continuation);
        this.f24452OooO0o0 = oo0o000o;
        this.f24451OooO0o = momentLogSourcePage;
        this.f24453OooO0oO = momentLogActionType;
        this.f24454OooO0oo = str;
        this.f24449OooO = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebEventRepository$momentBehaviorLog$$inlined$call$1(this.f24452OooO0o0, continuation, this.f24451OooO0o, this.f24453OooO0oO, this.f24454OooO0oo, this.f24449OooO);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<String>> continuation) {
        return ((WebEventRepository$momentBehaviorLog$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24450OooO0Oo;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final oO0O000o oo0o000o = this.f24452OooO0o0;
            this.f24450OooO0Oo = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0() { // from class: com.yalla.yalla.repository.WebEventRepository$momentBehaviorLog$$inlined$call$1.1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@Nullable String str, @Nullable String str2) {
                    if (!Intrinsics.areEqual(str, "1011")) {
                        super.OooO0O0(str, str2);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(o0000O0.OooO00o(oo0o000o, str, str2));
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@Nullable String str) {
                    boolean z2 = str == null || StringsKt.isBlank(str);
                    oO0O000o oo0o000o2 = oo0o000o;
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    if (z2) {
                        Result.Companion companion = Result.INSTANCE;
                        OooO.OooO0OO(oo0o000o2, "-1", "", cancellableContinuation);
                    } else {
                        Type type = new TypeToken<Response<String>>() { // from class: com.yalla.yalla.repository.WebEventRepository$momentBehaviorLog$.inlined.call.1.1.1
                        }.getType();
                        Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f13206OooO00o;
                        OooO0o.OooO0O0(oo0o000o2, (Response) o0000O0O.OooO0OO.OooO00o(type, str, type), cancellableContinuation);
                    }
                }
            };
            String sourcePage = String.valueOf(this.f24451OooO0o.getId());
            String actionType = this.f24453OooO0oO.name();
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            String actionInfo = this.f24454OooO0oo;
            Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            MomentLogJsonValue momentLogJsonValue = new MomentLogJsonValue();
            momentLogJsonValue.setAgent_userid(String.valueOf(linkedHashMapOooO00o.get("userid")));
            momentLogJsonValue.setSource_page(sourcePage);
            momentLogJsonValue.setAction_type(actionType);
            momentLogJsonValue.setAction_time(String.valueOf(System.currentTimeMillis()));
            momentLogJsonValue.setSession_id("");
            String str = this.f24449OooO;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (!z) {
                momentLogJsonValue.setSession_id(str);
            }
            momentLogJsonValue.setAction_info(actionInfo);
            Intrinsics.checkNotNull(linkedHashMapOooO00o);
            linkedHashMapOooO00o.put("jsonvalue", momentLogJsonValue.toJson());
            OooO0OO.OooO0OO(Oooo0.f43421o0000oO, "/Webservers/Apk/MomentBehaviorLog", linkedHashMapOooO00o, oooO0O0);
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
