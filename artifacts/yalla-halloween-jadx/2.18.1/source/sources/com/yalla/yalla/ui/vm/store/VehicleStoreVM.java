package com.yalla.yalla.ui.vm.store;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.model.ShopVehicleModel;
import com.yalla.yalla.data.repository.VehicleStoreRepository$shopVehicle$$inlined$call$1;
import com.yalla.yalla.data.repository.VehicleStoreRepository$shopVehicleList$$inlined$call$1;
import com.yalla.yalla.data.repository.VehicleStoreRepository$userVehicleEdit$$inlined$call$1;
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
import p495o0o00OOO.Oooo0;
import p520o0o0O0O0.o00OOO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/vm/store/VehicleStoreVM;", "Lo00OO/OooO00o;", "Lo0o00OOO/Oooo0;", "", "Lcom/yalla/yalla/common/model/ShopVehicleListModel;", "shopVehicleListAll", "shopVehicleListMine", "", "userId", "Lcom/yalla/yalla/common/model/ShopVehicleModel;", "personalVehicleList", "", "vehicleId", "", "type", "useVehicleEdit", "vehicleType_All", "Ljava/lang/String;", "getVehicleType_All", "()Ljava/lang/String;", "vehicleType_Mine", "getVehicleType_Mine", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VehicleStoreVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final String vehicleType_All = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private final String vehicleType_Mine = "1";

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$personalVehicleList$1$1", f = "VehicleStoreVM.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f26171Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f26172Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f26173Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ShopVehicleModel> f26174Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<ShopVehicleModel> oooo0, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26174Oooo0oo = oooo0;
            this.f26171Oooo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f26174Oooo0oo, this.f26171Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26173Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<ShopVehicleModel> oooo1 = this.f26174Oooo0oo;
                o00OOO0O o00ooo0o2 = o00OOO0O.f42731OooO00o;
                String str = this.f26171Oooo;
                this.f26172Oooo0o = oooo1;
                this.f26173Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$shopVehicle$$inlined$call$1(o00ooo0o2, null, str), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f26172Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$shopVehicleListAll$1$1", f = "VehicleStoreVM.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ VehicleStoreVM f26175Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f26176Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f26177Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<List<ShopVehicleListModel>> f26178Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<List<ShopVehicleListModel>> oooo0, VehicleStoreVM vehicleStoreVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26178Oooo0oo = oooo0;
            this.f26175Oooo = vehicleStoreVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f26178Oooo0oo, this.f26175Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26177Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<List<ShopVehicleListModel>> oooo1 = this.f26178Oooo0oo;
                o00OOO0O o00ooo0o2 = o00OOO0O.f42731OooO00o;
                String vehicleType_All = this.f26175Oooo.getVehicleType_All();
                this.f26176Oooo0o = oooo1;
                this.f26177Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$shopVehicleList$$inlined$call$1(o00ooo0o2, null, vehicleType_All), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f26176Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$shopVehicleListMine$1$1", f = "VehicleStoreVM.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ VehicleStoreVM f26179Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f26180Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f26181Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<List<ShopVehicleListModel>> f26182Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo0<List<ShopVehicleListModel>> oooo0, VehicleStoreVM vehicleStoreVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f26182Oooo0oo = oooo0;
            this.f26179Oooo = vehicleStoreVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f26182Oooo0oo, this.f26179Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26181Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<List<ShopVehicleListModel>> oooo1 = this.f26182Oooo0oo;
                o00OOO0O o00ooo0o2 = o00OOO0O.f42731OooO00o;
                String vehicleType_Mine = this.f26179Oooo.getVehicleType_Mine();
                this.f26180Oooo0o = oooo1;
                this.f26181Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$shopVehicleList$$inlined$call$1(o00ooo0o2, null, vehicleType_Mine), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f26180Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.VehicleStoreVM$useVehicleEdit$1$1", f = "VehicleStoreVM.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f26183Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f26184Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f26185Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<String> f26186Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f26187OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Oooo0<String> oooo0, long j, int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f26186Oooo0oo = oooo0;
            this.f26183Oooo = j;
            this.f26187OoooO00 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f26186Oooo0oo, this.f26183Oooo, this.f26187OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26185Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<String> oooo1 = this.f26186Oooo0oo;
                o00OOO0O o00ooo0o2 = o00OOO0O.f42731OooO00o;
                long j = this.f26183Oooo;
                int i2 = this.f26187OoooO00;
                this.f26184Oooo0o = oooo1;
                this.f26185Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new VehicleStoreRepository$userVehicleEdit$$inlined$call$1(o00ooo0o2, null, j, i2), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f26184Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
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
    public final Oooo0<ShopVehicleModel> personalVehicleList(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Oooo0<ShopVehicleModel> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(oooo0, userId, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<List<ShopVehicleListModel>> shopVehicleListAll() {
        Oooo0<List<ShopVehicleListModel>> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(oooo0, this, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<List<ShopVehicleListModel>> shopVehicleListMine() {
        Oooo0<List<ShopVehicleListModel>> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(oooo0, this, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<String> useVehicleEdit(long vehicleId, int type) {
        Oooo0<String> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(oooo0, vehicleId, type, null), 3, null);
        return oooo0;
    }
}
