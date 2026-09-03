package com.yalla.yalla.data.repository;

import OooO0o.OooO0o;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShopVehicleListModel;
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
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.o00O00;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/Response;", "com/yalla/yalla/common/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.data.repository.VehicleStoreRepository$shopVehicleList$$inlined$call$1", f = "VehicleStoreRepository.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class VehicleStoreRepository$shopVehicleList$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<ShopVehicleListModel>>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f21583Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00O f21584Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f21585Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00O f21586Oooo0oo;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f21587OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f21588OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.data.repository.VehicleStoreRepository$shopVehicleList$$inlined$call$1$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0250OooO00o extends o00000O0<Response<List<ShopVehicleListModel>>> {
        }

        public OooO00o(CancellableContinuation cancellableContinuation, o00O00O o00o00o2) {
            this.f21587OooO00o = cancellableContinuation;
            this.f21588OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation cancellableContinuation = this.f21587OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00.OooO00o(this.f21588OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation cancellableContinuation = this.f21587OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00.OooO00o(this.f21588OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f21587OooO00o;
            o00O00O o00o00o2 = this.f21588OooO0O0;
            Type type = new C0250OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response responseOooO0Oo = o00o00o2.OooO0Oo((Response) OooO0o.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleStoreRepository$shopVehicleList$$inlined$call$1(o00O00O o00o00o2, Continuation continuation, String str) {
        super(2, continuation);
        this.f21586Oooo0oo = o00o00o2;
        this.f21583Oooo = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VehicleStoreRepository$shopVehicleList$$inlined$call$1(this.f21586Oooo0oo, continuation, this.f21583Oooo);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<List<ShopVehicleListModel>>> continuation) {
        return ((VehicleStoreRepository$shopVehicleList$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f21585Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00O o00o00o2 = this.f21586Oooo0oo;
            this.f21584Oooo0o = o00o00o2;
            this.f21585Oooo0oO = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO00o oooO00o = new OooO00o(cancellableContinuationImpl, o00o00o2);
            String vehicleType = this.f21583Oooo;
            Intrinsics.checkNotNullParameter(vehicleType, "vehicleType");
            Map<String, String> params = o00OO0O0.OooO0O0();
            Intrinsics.checkNotNullExpressionValue(params, "params");
            params.put("vehicleType", vehicleType);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, "/Webservers/Shop/ShopVehicleList", params, oooO00o);
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
