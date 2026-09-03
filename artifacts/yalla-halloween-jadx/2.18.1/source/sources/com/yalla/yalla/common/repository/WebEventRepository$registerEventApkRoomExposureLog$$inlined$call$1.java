package com.yalla.yalla.common.repository;

import OooO0o.OooO0o;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.RoomExposureLogJsonValue;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
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
@DebugMetadata(c = "com.yalla.yalla.common.repository.WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1", f = "WebEventRepository.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<String>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20858Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00O f20859Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20860Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f20861Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f20862OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20863OoooO00;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f20864OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f20865OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0216OooO00o extends o00000O0<Response<String>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, o00O00O o00o00o2) {
            this.f20864OooO00o = cancellableContinuation;
            this.f20865OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation cancellableContinuation = this.f20864OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00.OooO00o(this.f20865OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f20864OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00.OooO00o(this.f20865OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f20864OooO00o;
            o00O00O o00o00o2 = this.f20865OooO0O0;
            Type type = new C0216OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response responseOooO0Oo = o00o00o2.OooO0Oo((Response) OooO0o.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1(o00O00O o00o00o2, Continuation continuation, ArrayList arrayList, ArrayList arrayList2, EnterRoomParentPage enterRoomParentPage) {
        super(2, continuation);
        this.f20861Oooo0oo = o00o00o2;
        this.f20858Oooo = arrayList;
        this.f20863OoooO00 = arrayList2;
        this.f20862OoooO0 = enterRoomParentPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1(this.f20861Oooo0oo, continuation, this.f20858Oooo, this.f20863OoooO00, this.f20862OoooO0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<String>> continuation) {
        return ((WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20860Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00O o00o00o2 = this.f20861Oooo0oo;
            this.f20859Oooo0o = o00o00o2;
            this.f20860Oooo0oO = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o callback = new OooO00o(cancellableContinuationImpl, o00o00o2);
            ArrayList arrayList = this.f20858Oooo;
            ArrayList arrayList2 = this.f20863OoooO00;
            EnterRoomParentPage expoSource = this.f20862OoooO0;
            Intrinsics.checkNotNullParameter(expoSource, "expoSource");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (arrayList != null && !arrayList.isEmpty()) {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append('_' + str);
                    } else {
                        stringBuffer.append(str);
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
                RoomExposureLogJsonValue roomExposureLogJsonValue = new RoomExposureLogJsonValue();
                roomExposureLogJsonValue.setUserId(String.valueOf(((LinkedHashMap) params).get("userid")));
                roomExposureLogJsonValue.setExpoSource(expoSource.getNum());
                String string = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(string, "expoListStr.toString()");
                roomExposureLogJsonValue.setExpoList(string);
                roomExposureLogJsonValue.setExpoTime(String.valueOf(System.currentTimeMillis()));
                String string2 = stringBuffer2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "sessionIdStr.toString()");
                roomExposureLogJsonValue.setSessionId(string2);
                Intrinsics.checkNotNullExpressionValue(params, "params");
                params.put("jsonvalue", roomExposureLogJsonValue.toJson());
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                o00OO0O0.OooO0Oo(null, o0ooOOo.f32291o0000O, "/Webservers/Apk/RoomExposureLog", params, callback);
            }
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
