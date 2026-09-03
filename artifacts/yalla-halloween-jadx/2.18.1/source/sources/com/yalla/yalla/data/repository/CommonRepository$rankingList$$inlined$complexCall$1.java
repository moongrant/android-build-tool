package com.yalla.yalla.data.repository;

import OooO0o.OooO0o;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.TopRankResponse;
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
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000Oo0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0010\b\u0001\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00020\u0003H\u008a@¨\u0006\u0004"}, d2 = {"T", "Lcom/yalla/yalla/common/model/Response;", "R", "Lkotlinx/coroutines/CoroutineScope;", "com/yalla/yalla/common/repository/ApiBaseRepository$complexCall$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.data.repository.CommonRepository$rankingList$$inlined$complexCall$1", f = "CommonRepository.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class CommonRepository$rankingList$$inlined$complexCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TopRankResponse<List<TopRankData>>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f21485Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00O f21486Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f21487Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f21488Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f21489OoooO00;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f21490OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f21491OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.data.repository.CommonRepository$rankingList$$inlined$complexCall$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0235OooO00o extends o00000O0<TopRankResponse<List<TopRankData>>> {
        }

        public static final class OooO0O0 extends o00000O0<TopRankResponse<List<TopRankData>>> {
        }

        public static final class OooO0OO extends o00000O0<TopRankResponse<List<TopRankData>>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, o00O00O o00o00o2) {
            this.f21490OooO00o = cancellableContinuation;
            this.f21491OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            super.onError(str, str2);
            CancellableContinuation cancellableContinuation = this.f21490OooO00o;
            o00O00O o00o00o2 = this.f21491OooO0O0;
            Type type = new OooO0OO().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response response = (Response) OooO0o.OooO00o(type, "type", "{}", type);
            o00o00o2.OooO00o(response, str != null ? Integer.valueOf(o000Oo0.OooO0OO(str, 0)) : null, str2);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(response));
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f21490OooO00o;
                o00O00O o00o00o2 = this.f21491OooO0O0;
                Type type = new C0235OooO00o().getType();
                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                Response response = (Response) OooO0o.OooO00o(type, "type", "{}", type);
                o00o00o2.OooO00o(response, -1, "");
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m502constructorimpl(response));
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f21490OooO00o;
            o00O00O o00o00o3 = this.f21491OooO0O0;
            Type type2 = new OooO0O0().getType();
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            Response response2 = (Response) OooO0o.OooO00o(type2, "type", str, type2);
            o00o00o3.OooO0O0(response2);
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(response2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRepository$rankingList$$inlined$complexCall$1(o00O00O o00o00o2, Continuation continuation, String str, String str2) {
        super(2, continuation);
        this.f21488Oooo0oo = o00o00o2;
        this.f21485Oooo = str;
        this.f21489OoooO00 = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CommonRepository$rankingList$$inlined$complexCall$1(this.f21488Oooo0oo, continuation, this.f21485Oooo, this.f21489OoooO00);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TopRankResponse<List<TopRankData>>> continuation) {
        return ((CommonRepository$rankingList$$inlined$complexCall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f21487Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00O o00o00o2 = this.f21488Oooo0oo;
            this.f21486Oooo0o = o00o00o2;
            this.f21487Oooo0oO = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o oooO00o = new OooO00o(cancellableContinuationImpl, o00o00o2);
            String rankType = this.f21485Oooo;
            String dataType = this.f21489OoooO00;
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intrinsics.checkNotNullParameter(dataType, "dataType");
            Map<String, String> params = o00OO0O0.OooO0O0();
            Intrinsics.checkNotNullExpressionValue(params, "params");
            params.put("str", rankType);
            params.put("type", dataType);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, "/Webservers/rankinglist/RankingList", params, oooO00o);
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
