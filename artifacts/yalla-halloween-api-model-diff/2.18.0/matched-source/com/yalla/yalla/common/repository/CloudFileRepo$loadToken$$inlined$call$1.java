package com.yalla.yalla.common.repository;

import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.UploadTokenModel;
import java.lang.reflect.Type;
import java.util.List;
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
import p154o00Oo0oO.o0ooOOo;
import p155o00Oo0oo.o0000Ooo;
import p161o00OoOO0.o00OO0OO;
import p390o0OOooO.o00000O0;
import p500o0o00Oo0.o00O00;
import p500o0o00Oo0.o00O00O;
import p500o0o00Oo0.o00O00OO;
import p500o0o00Oo0.oOO00O;
import p518o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/Response;", "com/yalla/yalla/common/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.repository.CloudFileRepo$loadToken$$inlined$call$1", f = "CloudFileRepo.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class CloudFileRepo$loadToken$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<UploadTokenModel>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public oOO00O f20720Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Long f20721OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ oOO00O f20722OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f20723OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ CloudFileType f20724OoooO0O;

    public static final class OooO00o extends o00OO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f20725OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ oOO00O f20726OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.CloudFileRepo$loadToken$$inlined$call$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0207OooO00o extends o00000O0<Response<UploadTokenModel>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, oOO00O ooo00o) {
            this.f20725OooO00o = cancellableContinuation;
            this.f20726OooO0O0 = ooo00o;
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation cancellableContinuation = this.f20725OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00O.OooO00o(this.f20726OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f20725OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00O.OooO00o(this.f20726OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f20725OooO00o;
            oOO00O ooo00o = this.f20726OooO0O0;
            Type type = new C0207OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
            Response responseOooO0Oo = ooo00o.OooO0Oo((Response) o00O00.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudFileRepo$loadToken$$inlined$call$1(oOO00O ooo00o, Continuation continuation, CloudFileType cloudFileType, Long l) {
        super(2, continuation);
        this.f20722OoooO0 = ooo00o;
        this.f20724OoooO0O = cloudFileType;
        this.f20721OoooO = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CloudFileRepo$loadToken$$inlined$call$1(this.f20722OoooO0, continuation, this.f20724OoooO0O, this.f20721OoooO);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<UploadTokenModel>> continuation) {
        return ((CloudFileRepo$loadToken$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<String> list;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20723OoooO00;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oOO00O ooo00o = this.f20722OoooO0;
            this.f20720Oooo = ooo00o;
            this.f20723OoooO00 = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o callback = new OooO00o(cancellableContinuationImpl, ooo00o);
            CloudFileType type = this.f20724OoooO0O;
            Long l = this.f20721OoooO;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Map mapOooO00o = o0000Ooo.OooO00o();
            mapOooO00o.put("type", String.valueOf(type.getCode()));
            if (l != null) {
                mapOooO00o.put("sourceId", String.valueOf(l.longValue()));
            }
            switch (o00O00OO.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
                    list = o0ooOOo.f32265OooOoo;
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
                    o0ooOOo o0ooooo3 = o0ooOOo.f32239OooO00o;
                    list = o0ooOOo.f32265OooOoo;
                    str = "/WebserversME/PictureME/GetUploadToken";
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    o0ooOOo o0ooooo4 = o0ooOOo.f32239OooO00o;
                    list = o0ooOOo.f32319o0000OOo;
                    str = "/Webservers/Resource/GetUploadToken";
                    break;
                default:
                    list = null;
                    str = null;
                    break;
            }
            o00OO0OO.OooO0OO(null, list, str, mapOooO00o, callback);
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
