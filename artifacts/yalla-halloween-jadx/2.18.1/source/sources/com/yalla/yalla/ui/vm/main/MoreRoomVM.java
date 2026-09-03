package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.app.base.model.RoomIndexModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.CountryListModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0O;
import p520o0o0O0O0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00050\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J(\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00050\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/MoreRoomVM;", "Lo00OO/OooO00o;", "", "sort", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/CountryListModel;", "getCountryList", "pageIndex", "countryId", "", "Lcom/app/base/model/RoomIndexModel;", "getRoomListByCountry", "labelId", "getRoomListByTag", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MoreRoomVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MoreRoomVM$getCountryList$1", f = "MoreRoomVM.kt", i = {}, l = {9, 9}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<CountryListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25502Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25503Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f25504Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25504Oooo0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25504Oooo0oo, continuation);
            oooO00o.f25503Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<CountryListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25502Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25503Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25503Oooo0oO;
            Oooo000 oooo000 = Oooo000.f42297OooO00o;
            int i2 = this.f25504Oooo0oo;
            this.f25503Oooo0oO = liveDataScope;
            this.f25502Oooo0o = 1;
            obj = oooo000.OooO0o0(i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25503Oooo0oO = null;
            this.f25502Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MoreRoomVM$getRoomListByCountry$1", f = "MoreRoomVM.kt", i = {}, l = {12, 12}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<RoomIndexModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25505Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25506Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25507Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f25508Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, int i2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25508Oooo0oo = i;
            this.f25505Oooo = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f25508Oooo0oo, this.f25505Oooo, continuation);
            oooO0O0.f25507Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<RoomIndexModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25506Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25507Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25507Oooo0oO;
            Oooo000 oooo000 = Oooo000.f42297OooO00o;
            int i2 = this.f25508Oooo0oo;
            int i3 = this.f25505Oooo;
            this.f25507Oooo0oO = liveDataScope;
            this.f25506Oooo0o = 1;
            obj = oooo000.OooO0o(i2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25507Oooo0oO = null;
            this.f25506Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MoreRoomVM$getRoomListByTag$1", f = "MoreRoomVM.kt", i = {}, l = {15, 15}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<RoomIndexModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25509Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25510Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25511Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f25512Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, int i2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25512Oooo0oo = i;
            this.f25509Oooo = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25512Oooo0oo, this.f25509Oooo, continuation);
            oooO0OO.f25511Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<RoomIndexModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25510Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25511Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25511Oooo0oO;
            Oooo000 oooo000 = Oooo000.f42297OooO00o;
            int i2 = this.f25512Oooo0oo;
            int i3 = this.f25509Oooo;
            this.f25511Oooo0oO = liveDataScope;
            this.f25510Oooo0o = 1;
            obj = oooo000.OooO0oO(i2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25511Oooo0oO = null;
            this.f25510Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<CountryListModel>> getCountryList(int sort) {
        return o0000O0O.OooO00o(new OooO00o(sort, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<RoomIndexModel>>> getRoomListByCountry(int pageIndex, int countryId) {
        return o0000O0O.OooO00o(new OooO0O0(pageIndex, countryId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<RoomIndexModel>>> getRoomListByTag(int pageIndex, int labelId) {
        return o0000O0O.OooO00o(new OooO0OO(pageIndex, labelId, null));
    }
}
