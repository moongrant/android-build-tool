package com.yalla.yalla.ui.vm.store;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.data.repository.VehicleStoreRepository$shopVehicle$$inlined$call$1;
import com.yalla.yalla.data.repository.VehicleStoreRepository$shopVehicleList$$inlined$call$1;
import com.yalla.yalla.data.repository.VehicleStoreRepository$userVehicleEdit$$inlined$call$1;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.ShopVehicleModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o0O00OO;
import p424o0OoO0Oo.o00OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/vm/store/VehicleStoreVM;", "Lo0Oo0/OooOO0;", "Lo0OoO0Oo/o00OO000;", "", "Lcom/yalla/yalla/model/ShopVehicleListModel;", "shopVehicleListAll", "shopVehicleListMine", "", "userId", "Lcom/yalla/yalla/model/ShopVehicleModel;", "personalVehicleList", "", "vehicleId", "", "type", "useVehicleEdit", "vehicleType_All", "Ljava/lang/String;", "getVehicleType_All", "()Ljava/lang/String;", "vehicleType_Mine", "getVehicleType_Mine", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class VehicleStoreVM extends OooOO0 {
    public static final int $stable = 0;

    @NotNull
    private final String vehicleType_All = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private final String vehicleType_Mine = "1";

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$personalVehicleList$1$1", f = "VehicleStoreVM.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f32107OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<ShopVehicleModel> f32108OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32109OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f32110OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OO000<ShopVehicleModel> o00oo001, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32108OooO0o = o00oo001;
            this.f32110OooO0oO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f32108OooO0o, this.f32110OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000 o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32109OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00OO o0o00oo2 = o0O00OO.f46287OooO00o;
                o00OO000<ShopVehicleModel> o00oo002 = this.f32108OooO0o;
                this.f32107OooO0Oo = o00oo002;
                this.f32109OooO0o0 = 1;
                o0o00oo2.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$shopVehicle$$inlined$call$1(o0o00oo2, null, this.f32110OooO0oO), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f32107OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$shopVehicleListAll$1$1", f = "VehicleStoreVM.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f32111OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<List<ShopVehicleListModel>> f32112OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32113OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VehicleStoreVM f32114OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OO000<List<ShopVehicleListModel>> o00oo001, VehicleStoreVM vehicleStoreVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32112OooO0o = o00oo001;
            this.f32114OooO0oO = vehicleStoreVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f32112OooO0o, this.f32114OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000 o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32113OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00OO o0o00oo2 = o0O00OO.f46287OooO00o;
                String vehicleType_All = this.f32114OooO0oO.getVehicleType_All();
                o00OO000<List<ShopVehicleListModel>> o00oo002 = this.f32112OooO0o;
                this.f32111OooO0Oo = o00oo002;
                this.f32113OooO0o0 = 1;
                o0o00oo2.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$shopVehicleList$$inlined$call$1(o0o00oo2, null, vehicleType_All), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f32111OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$shopVehicleListMine$1$1", f = "VehicleStoreVM.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f32115OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<List<ShopVehicleListModel>> f32116OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32117OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VehicleStoreVM f32118OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OO000<List<ShopVehicleListModel>> o00oo001, VehicleStoreVM vehicleStoreVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32116OooO0o = o00oo001;
            this.f32118OooO0oO = vehicleStoreVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f32116OooO0o, this.f32118OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000 o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32117OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00OO o0o00oo2 = o0O00OO.f46287OooO00o;
                String vehicleType_Mine = this.f32118OooO0oO.getVehicleType_Mine();
                o00OO000<List<ShopVehicleListModel>> o00oo002 = this.f32116OooO0o;
                this.f32115OooO0Oo = o00oo002;
                this.f32117OooO0o0 = 1;
                o0o00oo2.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$shopVehicleList$$inlined$call$1(o0o00oo2, null, vehicleType_Mine), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f32115OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$useVehicleEdit$1$1", f = "VehicleStoreVM.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f32119OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<String> f32120OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32121OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f32122OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f32123OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00OO000<String> o00oo001, long j, int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32120OooO0o = o00oo001;
            this.f32122OooO0oO = j;
            this.f32123OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f32120OooO0o, this.f32122OooO0oO, this.f32123OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000 o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32121OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00OO o0o00oo2 = o0O00OO.f46287OooO00o;
                long j = this.f32122OooO0oO;
                int i2 = this.f32123OooO0oo;
                o00OO000<String> o00oo002 = this.f32120OooO0o;
                this.f32119OooO0Oo = o00oo002;
                this.f32121OooO0o0 = 1;
                o0o00oo2.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$userVehicleEdit$$inlined$call$1(o0o00oo2, null, j, i2), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f32119OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final String getVehicleType_All() {
        return this.vehicleType_All;
    }

    @NotNull
    public final String getVehicleType_Mine() {
        return this.vehicleType_Mine;
    }

    @NotNull
    public final o00OO000<ShopVehicleModel> personalVehicleList(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        o00OO000<ShopVehicleModel> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(o00oo001, userId, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final o00OO000<List<ShopVehicleListModel>> shopVehicleListAll() {
        o00OO000<List<ShopVehicleListModel>> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(o00oo001, this, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final o00OO000<List<ShopVehicleListModel>> shopVehicleListMine() {
        o00OO000<List<ShopVehicleListModel>> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(o00oo001, this, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final o00OO000<String> useVehicleEdit(long vehicleId, int type) {
        o00OO000<String> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(o00oo001, vehicleId, type, null), 3, null);
        return o00oo001;
    }
}
