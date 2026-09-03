package com.yalla.yalla.repository;

import androidx.compose.runtime.o000oOoO;
import com.code.android.json.OooO00o;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.UploadTokenModel;
import com.yalla.yalla.model.http.Response;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
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
import p464o0Oooo.o0O0O0O;
import p464o0Oooo.o0oO0O0o;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/model/http/Response;", "com/yalla/yalla/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.yalla.yalla.repository.CloudFileRepo$loadToken$$inlined$call$1", f = "CloudFileRepo.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 CloudFileRepo.kt\ncom/yalla/yalla/repository/CloudFileRepo\n*L\n1#1,72:1\n314#2,9:73\n323#2,2:84\n18#3,2:82\n*S KotlinDebug\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n*L\n27#1:73,9\n27#1:84,2\n*E\n"})
public final class CloudFileRepo$loadToken$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<UploadTokenModel>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24773OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CloudFileType f24774OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f24775OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Long f24776OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Boolean f24777OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudFileRepo$loadToken$$inlined$call$1(o0O00oO0 o0o00oo1, Continuation continuation, CloudFileType cloudFileType, Long l, Boolean bool) {
        super(2, continuation);
        this.f24775OooO0o0 = o0o00oo1;
        this.f24774OooO0o = cloudFileType;
        this.f24776OooO0oO = l;
        this.f24777OooO0oo = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CloudFileRepo$loadToken$$inlined$call$1(this.f24775OooO0o0, continuation, this.f24774OooO0o, this.f24776OooO0oO, this.f24777OooO0oo);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<UploadTokenModel>> continuation) {
        return ((CloudFileRepo$loadToken$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        List<String> list;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24773OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final o0O00oO0 o0o00oo1 = this.f24775OooO0o0;
            this.f24773OooO0Oo = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO0OO.OooO0O0 callback = new OooO0OO.OooO0O0() { // from class: com.yalla.yalla.repository.CloudFileRepo$loadToken$$inlined$call$1.1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@Nullable String str2, @Nullable String str3) {
                    if (!Intrinsics.areEqual(str2, "1011")) {
                        super.OooO0O0(str2, str3);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(oOO00O0.OooO00o(o0o00oo1, str2, str3));
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@Nullable String str2) {
                    boolean z = str2 == null || StringsKt.isBlank(str2);
                    o0O00oO0 o0o00oo2 = o0o00oo1;
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    if (z) {
                        Result.Companion companion = Result.INSTANCE;
                        o00.OooO0Oo(o0o00oo2, "-1", "", cancellableContinuation);
                    } else {
                        Type type = new TypeToken<Response<UploadTokenModel>>() { // from class: com.yalla.yalla.repository.CloudFileRepo$loadToken$.inlined.call.1.1.1
                        }.getType();
                        Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f10146OooO00o;
                        androidx.compose.ui.focus.OooO00o.OooO0OO(o0o00oo2, (Response) o000oOoO.OooO00o(type, "type", str2, type), cancellableContinuation);
                    }
                }
            };
            CloudFileType type = this.f24774OooO0o;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(callback, "callback");
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("type", String.valueOf(type.getCode()));
            Long l = this.f24776OooO0oO;
            if (l != null) {
                linkedHashMapOooO00o.put("sourceId", String.valueOf(l.longValue()));
            }
            switch (o0O0O0O.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    list = o0000O.f44100OooOoo;
                    str = "/WebserversME/VoiceME/GetUploadVoiceToken";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    list = o0000O.f44100OooOoo;
                    str = "/WebserversME/PictureME/GetUploadToken";
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    list = o0000O.f44149o0000O0O;
                    o0oO0O0o listener = new o0oO0O0o(linkedHashMapOooO00o);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    if (Intrinsics.areEqual(this.f24777OooO0oo, Boolean.TRUE)) {
                        listener.invoke();
                    }
                    str = "/Webservers/Resource/GetUploadToken";
                    break;
                default:
                    list = null;
                    str = null;
                    break;
            }
            OooO0OO.OooO0O0(null, list, str, linkedHashMapOooO00o, callback);
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
