package com.yalla.yalla.common.repository;

import OooO0o.OooO0o;
import com.app.base.Function.OooO0OO;
import com.app.base.application.App;
import com.app.base.model.ChangeUrlModel;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.Response;
import java.lang.reflect.Type;
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
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0OO00O;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.o00O00;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/Response;", "com/yalla/yalla/common/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.repository.CloudFileRepo$loadVoiceUrl$$inlined$call$1", f = "CloudFileRepo.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class CloudFileRepo$loadVoiceUrl$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<ChangeUrlModel>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f20707Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00O f20708Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20709Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f20710Oooo0oo;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f20711OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f20712OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.CloudFileRepo$loadVoiceUrl$$inlined$call$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0208OooO00o extends o00000O0<Response<ChangeUrlModel>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, o00O00O o00o00o2) {
            this.f20711OooO00o = cancellableContinuation;
            this.f20712OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation cancellableContinuation = this.f20711OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00.OooO00o(this.f20712OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f20711OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00.OooO00o(this.f20712OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f20711OooO00o;
            o00O00O o00o00o2 = this.f20712OooO0O0;
            Type type = new C0208OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response responseOooO0Oo = o00o00o2.OooO0Oo((Response) OooO0o.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudFileRepo$loadVoiceUrl$$inlined$call$1(o00O00O o00o00o2, Continuation continuation, String str) {
        super(2, continuation);
        this.f20710Oooo0oo = o00o00o2;
        this.f20707Oooo = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CloudFileRepo$loadVoiceUrl$$inlined$call$1(this.f20710Oooo0oo, continuation, this.f20707Oooo);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ChangeUrlModel>> continuation) {
        return ((CloudFileRepo$loadVoiceUrl$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20709Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00O o00o00o2 = this.f20710Oooo0oo;
            this.f20708Oooo0o = o00o00o2;
            this.f20709Oooo0oO = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o oooO00o = new OooO00o(cancellableContinuationImpl, o00o00o2);
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o0OO00O o0oo00o2 = o00000OO.f32212OooO0o0;
            CloudFileType cloudFileType = CloudFileType.USER_CHAT_VOICE;
            String strOooO0O0 = kotlin.collections.unsigned.OooO00o.OooO0O0(OooOOO.f41216OooO00o);
            String str = this.f20707Oooo;
            App app = App.f11458Oooo0oO;
            Map mapOooO00o = OooO0OO.OooO00o();
            mapOooO00o.put("type", cloudFileType.getCode() + "");
            mapOooO00o.put("id", strOooO0O0);
            mapOooO00o.put("voiceurl", str);
            mapOooO00o.put("timelong", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32266OoooOo0, mapOooO00o, oooO00o);
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
