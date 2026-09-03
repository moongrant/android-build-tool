package com.yalla.yalla.common.repository;

import OooO0o.OooO0o;
import com.app.base.Function.OooO0OO;
import com.app.base.application.App;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.Response;
import java.lang.reflect.Type;
import java.util.Iterator;
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
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0Oo0oo;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.o00O00;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/Response;", "com/yalla/yalla/common/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.repository.ReportRepo$updateReportImg$$inlined$call$1", f = "ReportRepo.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class ReportRepo$updateReportImg$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Object>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ List f20739Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00O f20740Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20741Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f20742Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f20743OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ CloudFileType f20744OoooO00;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f20745OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f20746OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.ReportRepo$updateReportImg$$inlined$call$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0212OooO00o extends o00000O0<Response<Object>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, o00O00O o00o00o2) {
            this.f20745OooO00o = cancellableContinuation;
            this.f20746OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation cancellableContinuation = this.f20745OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00.OooO00o(this.f20746OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f20745OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00.OooO00o(this.f20746OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f20745OooO00o;
            o00O00O o00o00o2 = this.f20746OooO0O0;
            Type type = new C0212OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response responseOooO0Oo = o00o00o2.OooO0Oo((Response) OooO0o.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportRepo$updateReportImg$$inlined$call$1(o00O00O o00o00o2, Continuation continuation, List list, CloudFileType cloudFileType, String str) {
        super(2, continuation);
        this.f20742Oooo0oo = o00o00o2;
        this.f20739Oooo = list;
        this.f20744OoooO00 = cloudFileType;
        this.f20743OoooO0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ReportRepo$updateReportImg$$inlined$call$1(this.f20742Oooo0oo, continuation, this.f20739Oooo, this.f20744OoooO00, this.f20743OoooO0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<Object>> continuation) {
        return ((ReportRepo$updateReportImg$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20741Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00O o00o00o2 = this.f20742Oooo0oo;
            this.f20740Oooo0o = o00o00o2;
            this.f20741Oooo0oO = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o oooO00o = new OooO00o(cancellableContinuationImpl, o00o00o2);
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = this.f20739Oooo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CloudFileInfo cloudFileInfo = (CloudFileInfo) it.next();
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("|");
                }
                stringBuffer.append(CloudImageUtilKt.imgRemoveHost(cloudFileInfo.getUrl()));
            }
            int uploadType = ((CloudFileInfo) this.f20739Oooo.get(0)).getUploadInfo().getUploadType();
            CloudFileType cloudFileType = this.f20744OoooO00;
            if (cloudFileType == CloudFileType.REPORT_USER_ROOM || cloudFileType == CloudFileType.REPORT_ROOM_EVENT) {
                o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                o00000OO.f32212OooO0o0.OooO00o(cloudFileType, this.f20743OoooO0, uploadType, stringBuffer.toString(), oooO00o);
            } else {
                o00oO0o o00oo0o3 = o00000OO.f32207OooO00o;
                o0Oo0oo o0oo0oo2 = o00000OO.f32213OooO0oO;
                String str = this.f20743OoooO0;
                String string = stringBuffer.toString();
                App app = App.f11458Oooo0oO;
                Map mapOooO00o = OooO0OO.OooO00o();
                mapOooO00o.put("type", cloudFileType.getCode() + "");
                mapOooO00o.put("id", str);
                mapOooO00o.put("imgUpType ", uploadType + "");
                mapOooO00o.put("imageurl", string);
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, "/Webservers/Resource/PicQiniu", mapOooO00o, oooO00o);
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
