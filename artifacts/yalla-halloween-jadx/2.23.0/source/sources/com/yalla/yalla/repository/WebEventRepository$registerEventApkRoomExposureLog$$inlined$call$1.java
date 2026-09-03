package com.yalla.yalla.repository;

import androidx.compose.runtime.o000oOoO;
import com.code.android.json.OooO00o;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.RoomExposureLogJsonValue;
import com.yalla.yalla.model.http.Response;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00;
import p377o0OOoOo.o0000O;
import p406o0Oo0Ooo.oOO00O0;
import p464o0Oooo.o0O00oO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/model/http/Response;", "com/yalla/yalla/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1", f = "WebEventRepository.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 WebEventRepository.kt\ncom/yalla/yalla/repository/WebEventRepository\n*L\n1#1,72:1\n314#2,9:73\n323#2,2:84\n55#3,2:82\n*S KotlinDebug\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n*L\n27#1:73,9\n27#1:84,2\n*E\n"})
public final class WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<String>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24926OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24927OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f24928OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24929OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f24930OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1(o0O00oO0 o0o00oo1, Continuation continuation, ArrayList arrayList, ArrayList arrayList2, EnterRoomParentPage enterRoomParentPage) {
        super(2, continuation);
        this.f24928OooO0o0 = o0o00oo1;
        this.f24927OooO0o = arrayList;
        this.f24929OooO0oO = arrayList2;
        this.f24930OooO0oo = enterRoomParentPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1(this.f24928OooO0o0, continuation, this.f24927OooO0o, this.f24929OooO0oO, this.f24930OooO0oo);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<String>> continuation) {
        return ((WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24926OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final o0O00oO0 o0o00oo1 = this.f24928OooO0o0;
            this.f24926OooO0Oo = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO0OO.OooO0O0 callback = new OooO0OO.OooO0O0() { // from class: com.yalla.yalla.repository.WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1.1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@Nullable String str, @Nullable String str2) {
                    if (!Intrinsics.areEqual(str, "1011")) {
                        super.OooO0O0(str, str2);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(oOO00O0.OooO00o(o0o00oo1, str, str2));
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@Nullable String str) {
                    boolean z = str == null || StringsKt.isBlank(str);
                    o0O00oO0 o0o00oo2 = o0o00oo1;
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    if (z) {
                        Result.Companion companion = Result.INSTANCE;
                        o00.OooO0Oo(o0o00oo2, "-1", "", cancellableContinuation);
                    } else {
                        Type type = new TypeToken<Response<String>>() { // from class: com.yalla.yalla.repository.WebEventRepository$registerEventApkRoomExposureLog$.inlined.call.1.1.1
                        }.getType();
                        Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f10146OooO00o;
                        androidx.compose.ui.focus.OooO00o.OooO0OO(o0o00oo2, (Response) o000oOoO.OooO00o(type, "type", str, type), cancellableContinuation);
                    }
                }
            };
            EnterRoomParentPage expoSource = this.f24930OooO0oo;
            Intrinsics.checkNotNullParameter(expoSource, "expoSource");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ArrayList arrayList = this.f24927OooO0o;
            if (arrayList != null && !arrayList.isEmpty()) {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append("_" + str);
                    } else {
                        stringBuffer.append(str);
                    }
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList<String> arrayList2 = this.f24929OooO0oO;
                if (arrayList2 != null) {
                    for (String str2 : arrayList2) {
                        linkedHashMap.put(str2, str2);
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    for (String str3 : linkedHashMap.values()) {
                        if (stringBuffer2.length() > 0) {
                            stringBuffer2.append("," + str3);
                        } else {
                            stringBuffer2.append(str3);
                        }
                    }
                }
                LinkedHashMap params = oO00o000.OooO00o();
                RoomExposureLogJsonValue roomExposureLogJsonValue = new RoomExposureLogJsonValue();
                roomExposureLogJsonValue.setUserId(String.valueOf(params.get("userid")));
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
                OooO0OO.OooO0OO(o0000O.f44162o0000oO, "/Webservers/Apk/RoomExposureLog", params, callback);
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
