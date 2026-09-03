package com.yalla.yalla.common.repository;

import OooO0o.OooO0o;
import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendPollModel;
import com.yalla.yalla.model.MomentSendResultModel;
import com.yalla.yalla.model.MomentType;
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
import kotlin.jvm.functions.Function1;
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
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.o00O00;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o000oOoO;
import p516o0o0O000.o0OOO0o;
import p522o0o0O0o.o000O0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/Response;", "com/yalla/yalla/common/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.repository.PostRepo$sendPost$$inlined$call$1", f = "PostRepo.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class PostRepo$sendPost$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<MomentSendResultModel>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f20733Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00O f20734Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20735Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f20736Oooo0oo;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f20737OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f20738OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.PostRepo$sendPost$$inlined$call$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0211OooO00o extends o00000O0<Response<MomentSendResultModel>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, o00O00O o00o00o2) {
            this.f20737OooO00o = cancellableContinuation;
            this.f20738OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation cancellableContinuation = this.f20737OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00.OooO00o(this.f20738OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f20737OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00.OooO00o(this.f20738OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f20737OooO00o;
            o00O00O o00o00o2 = this.f20738OooO0O0;
            Type type = new C0211OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response responseOooO0Oo = o00o00o2.OooO0Oo((Response) OooO0o.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostRepo$sendPost$$inlined$call$1(o00O00O o00o00o2, Continuation continuation, MomentSendModel momentSendModel) {
        super(2, continuation);
        this.f20736Oooo0oo = o00o00o2;
        this.f20733Oooo = momentSendModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PostRepo$sendPost$$inlined$call$1(this.f20736Oooo0oo, continuation, this.f20733Oooo);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<MomentSendResultModel>> continuation) {
        return ((PostRepo$sendPost$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20735Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00O o00o00o2 = this.f20736Oooo0oo;
            this.f20734Oooo0o = o00o00o2;
            this.f20735Oooo0oO = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o oooO00o = new OooO00o(cancellableContinuationImpl, o00o00o2);
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o0Oo0oo o0oo0oo2 = o00000OO.f32213OooO0oO;
            MomentSendModel momentSendModel = this.f20733Oooo;
            if (momentSendModel != null) {
                Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
                mapOooO0O0.put("power", momentSendModel.getPower() + "");
                if (!TextUtils.isEmpty(momentSendModel.getAddress()) && momentSendModel.getIsToLocationInfo()) {
                    mapOooO0O0.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, o000oOoO.OooO0O0(momentSendModel.getAddress()) + "");
                }
                if (!TextUtils.isEmpty(momentSendModel.getLongitude()) && !TextUtils.isEmpty(momentSendModel.getLatitude())) {
                    mapOooO0O0.put("longitude", momentSendModel.getLongitude() + "");
                    mapOooO0O0.put("latitude", momentSendModel.getLatitude() + "");
                }
                mapOooO0O0.put("type", momentSendModel.getType() + "");
                if (!TextUtils.isEmpty(momentSendModel.getNotifyUserid())) {
                    mapOooO0O0.put("notifyUserid", momentSendModel.getNotifyUserid() + "");
                }
                if (!TextUtils.isEmpty(momentSendModel.getSourcesid())) {
                    mapOooO0O0.put("sourcesid", momentSendModel.getSourcesid());
                }
                if ((momentSendModel.getType() == MomentType.Share.getValue() || momentSendModel.getType() == MomentType.Event.getValue() || momentSendModel.getType() == MomentType.Poll.getValue()) && momentSendModel.getShareType() != 0) {
                    mapOooO0O0.put("shareType", momentSendModel.getShareType() + "");
                }
                if (momentSendModel.getPoll() != null) {
                    o000O0.OooO0OO(momentSendModel.getPoll().getOption(), new Function1() { // from class: o00Oo0oO.o0OOO0o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(((MomentSendPollModel.Option) obj2).getText().isEmpty());
                        }
                    });
                    mapOooO0O0.put("voteContent", o000oOoO.OooO0O0(momentSendModel.getPoll().toJSONString() + ""));
                }
                if (!p487o0o000oO.o0OOO0o.OooO0Oo()) {
                    mapOooO0O0.put("content", momentSendModel.getContent().toJSONString());
                    p515o0o0O00.o00O00.OooO0O0("sendPost params  = " + mapOooO0O0);
                }
                mapOooO0O0.put("content", o000oOoO.OooO0O0(momentSendModel.getContent().toJSONString()) + "");
                if (momentSendModel.getContent().getCircleId() > 0) {
                    TopicRecentTable topicRecentTable = new TopicRecentTable();
                    topicRecentTable.topicId = momentSendModel.getContent().getCircleId();
                    topicRecentTable.topicName = momentSendModel.getContent().getCircleName();
                    topicRecentTable.createTime = System.currentTimeMillis();
                    OooO0OO.OooO00o().Oooo0().OooO0OO(topicRecentTable);
                    List<TopicRecentTable> listOooO0O0 = OooO0OO.OooO00o().Oooo0().OooO0O0(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
                    if (listOooO0O0.size() > 10) {
                        OooO0OO.OooO00o().Oooo0().OooO00o(listOooO0O0.get(listOooO0O0.size() - 1));
                    }
                    mapOooO0O0.put("circleId", momentSendModel.getContent().getCircleId() + "");
                    mapOooO0O0.put("circleName", o000oOoO.OooO0O0(momentSendModel.getContent().getCircleName()));
                }
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                o00OO0O0.OooO0Oo(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32306o0000o0o, mapOooO0O0, oooO00o);
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
