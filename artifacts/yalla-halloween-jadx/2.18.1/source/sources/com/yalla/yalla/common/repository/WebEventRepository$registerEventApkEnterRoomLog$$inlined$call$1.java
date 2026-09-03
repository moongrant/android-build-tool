package com.yalla.yalla.common.repository;

import OooO0o.OooO0o;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.EnterRoomLogJsonValue;
import com.yalla.yalla.common.model.Response;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o000000;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.o00O00;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/Response;", "com/yalla/yalla/common/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.repository.WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1", f = "WebEventRepository.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<String>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20849Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00O f20850Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20851Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f20852Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f20853OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20854OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f20855OoooO0O;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f20856OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f20857OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0215OooO00o extends o00000O0<Response<String>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, o00O00O o00o00o2) {
            this.f20856OooO00o = cancellableContinuation;
            this.f20857OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation cancellableContinuation = this.f20856OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00.OooO00o(this.f20857OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f20856OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00.OooO00o(this.f20857OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f20856OooO00o;
            o00O00O o00o00o2 = this.f20857OooO0O0;
            Type type = new C0215OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response responseOooO0Oo = o00o00o2.OooO0Oo((Response) OooO0o.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1(o00O00O o00o00o2, Continuation continuation, ArrayList arrayList, ArrayList arrayList2, String str, EnterRoomParentPage enterRoomParentPage) {
        super(2, continuation);
        this.f20852Oooo0oo = o00o00o2;
        this.f20849Oooo = arrayList;
        this.f20854OoooO00 = arrayList2;
        this.f20853OoooO0 = str;
        this.f20855OoooO0O = enterRoomParentPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1(this.f20852Oooo0oo, continuation, this.f20849Oooo, this.f20854OoooO00, this.f20853OoooO0, this.f20855OoooO0O);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<String>> continuation) {
        return ((WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20851Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00O o00o00o2 = this.f20852Oooo0oo;
            this.f20850Oooo0o = o00o00o2;
            this.f20851Oooo0oO = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o callback = new OooO00o(cancellableContinuationImpl, o00o00o2);
            ArrayList<String> arrayList = this.f20849Oooo;
            ArrayList arrayList2 = this.f20854OoooO00;
            String roomId = this.f20853OoooO0;
            EnterRoomParentPage sourcePage = this.f20855OoooO0O;
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            Intrinsics.checkNotNullParameter(callback, "callback");
            StringBuffer stringBuffer = new StringBuffer();
            if (arrayList != null && (!arrayList.isEmpty())) {
                for (String str : arrayList) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append('_' + str);
                    } else {
                        stringBuffer.append(str);
                    }
                }
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            Map<String, String> mapOooO00o = o000000.OooO00o(arrayList2);
            if (!mapOooO00o.isEmpty()) {
                for (String str2 : ((LinkedHashMap) mapOooO00o).values()) {
                    if (stringBuffer2.length() > 0) {
                        stringBuffer2.append(',' + str2);
                    } else {
                        stringBuffer2.append(str2);
                    }
                }
            }
            Map<String, String> params = o00OO0O0.OooO0O0();
            EnterRoomLogJsonValue enterRoomLogJsonValue = new EnterRoomLogJsonValue();
            enterRoomLogJsonValue.setUserId(String.valueOf(((LinkedHashMap) params).get("userid")));
            enterRoomLogJsonValue.setRoomId(roomId);
            enterRoomLogJsonValue.setSourcePage(sourcePage.getNum());
            enterRoomLogJsonValue.setExpoList("");
            if (stringBuffer.length() > 0) {
                String string = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(string, "expoListStr.toString()");
                enterRoomLogJsonValue.setExpoList(string);
            }
            enterRoomLogJsonValue.setExpoTime(String.valueOf(System.currentTimeMillis()));
            String string2 = stringBuffer2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "sessionIdStr.toString()");
            enterRoomLogJsonValue.setSessionId(string2);
            Intrinsics.checkNotNullExpressionValue(params, "params");
            params.put("jsonvalue", enterRoomLogJsonValue.toJson());
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0Oo(null, o0ooOOo.f32291o0000O, "/Webservers/Apk/EnterRoomLog", params, callback);
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
