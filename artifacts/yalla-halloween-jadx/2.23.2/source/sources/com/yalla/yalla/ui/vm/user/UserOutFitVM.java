package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.VehicleStoreRepository$shopVehicleListV2$$inlined$call$1;
import com.yalla.yalla.data.repository.VehicleStoreRepository$userVehicleEditV2$$inlined$call$1;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o0O00OO;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR+\u0010#\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010)\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/UserOutFitVM;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/model/ShopVehicleListModel;", "item", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "useVehicleEdit", "Landroidx/compose/runtime/MutableState;", "", "currentItem", "Landroidx/compose/runtime/MutableState;", "getCurrentItem", "()Landroidx/compose/runtime/MutableState;", "setCurrentItem", "(Landroidx/compose/runtime/MutableState;)V", "", "showPremiumBuyFrozenDialog", "getShowPremiumBuyFrozenDialog", "setShowPremiumBuyFrozenDialog", "showVipBuyFrozenDialog", "getShowVipBuyFrozenDialog", "showVipGiveFrozenDialog", "getShowVipGiveFrozenDialog", "showVehicleDialog", "getShowVehicleDialog", "setShowVehicleDialog", "showProfilePreViewDialog", "getShowProfilePreViewDialog", "<set-?>", "currentPosition$delegate", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "currentPosition", "picUrl$delegate", "getPicUrl", "()Ljava/lang/String;", "setPicUrl", "(Ljava/lang/String;)V", "picUrl", "Lo00o00oO/o000;", "myVehiclesPager", "Lo00o00oO/o000;", "getMyVehiclesPager", "()Lo00o00oO/o000;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserOutFitVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserOutFitVM.kt\ncom/yalla/yalla/ui/vm/user/UserOutFitVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,57:1\n81#2:58\n107#2,2:59\n81#2:61\n107#2,2:62\n*S KotlinDebug\n*F\n+ 1 UserOutFitVM.kt\ncom/yalla/yalla/ui/vm/user/UserOutFitVM\n*L\n28#1:58\n28#1:59,2\n30#1:61\n30#1:62,2\n*E\n"})
public final class UserOutFitVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private MutableState<Integer> currentItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: currentPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentPosition;

    @NotNull
    private final o000<ShopVehicleListModel> myVehiclesPager;

    /* JADX INFO: renamed from: picUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState picUrl;

    @NotNull
    private MutableState<Boolean> showPremiumBuyFrozenDialog;

    @NotNull
    private final MutableState<Boolean> showProfilePreViewDialog;

    @NotNull
    private MutableState<Boolean> showVehicleDialog;

    @NotNull
    private final MutableState<Boolean> showVipBuyFrozenDialog;

    @NotNull
    private final MutableState<Boolean> showVipGiveFrozenDialog;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserOutFitVM$myVehiclesPager$1", f = "UserOutFitVM.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<ShopVehicleListModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32243OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32244OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f32244OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<ShopVehicleListModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32243OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f32244OooO0o0 != 1) {
                    return new o000Oo0(new ArrayList());
                }
                o0O00OO o0o00oo2 = o0O00OO.f46287OooO00o;
                this.f32243OooO0Oo = 1;
                o0o00oo2.getClass();
                String url = oo000o.OooO0OO("Webservers/Shop/ShopVehicleList");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 0);
                o0ooooo.OooO0O0("1", "vehicleType");
                obj = OooOOO.OooO0Oo(new VehicleStoreRepository$shopVehicleListV2$$inlined$call$1(o0ooooo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserOutFitVM$useVehicleEdit$1", f = "UserOutFitVM.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nUserOutFitVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserOutFitVM.kt\ncom/yalla/yalla/ui/vm/user/UserOutFitVM$useVehicleEdit$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n350#2,7:58\n*S KotlinDebug\n*F\n+ 1 UserOutFitVM.kt\ncom/yalla/yalla/ui/vm/user/UserOutFitVM$useVehicleEdit$1\n*L\n49#1:58,7\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32245OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ShopVehicleListModel f32246OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32247OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ UserOutFitVM f32248OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ShopVehicleListModel shopVehicleListModel, UserOutFitVM userOutFitVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32246OooO0o = shopVehicleListModel;
            this.f32248OooO0oO = userOutFitVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f32246OooO0o, this.f32248OooO0oO, continuation);
            oooO0O0.f32247OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<String>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32245OooO0Oo;
            ShopVehicleListModel shopVehicleListModel = this.f32246OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32247OooO0o0;
                o0O00OO o0o00oo2 = o0O00OO.f46287OooO00o;
                long shopId = shopVehicleListModel.getShopId();
                boolean zIsSelected = shopVehicleListModel.isSelected();
                this.f32247OooO0o0 = o00oo0o2;
                this.f32245OooO0Oo = 1;
                o0o00oo2.getClass();
                String url = oo000o.OooO0OO("/Webservers/User/UserVehicleEdit");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 0);
                o0ooooo.OooO0O0(Boxing.boxLong(shopId), "vehicleid");
                o0ooooo.OooO0O0(Boxing.boxInt(zIsSelected ? 1 : 0), "type");
                Object objOooO0Oo = OooOOO.OooO0Oo(new VehicleStoreRepository$userVehicleEditV2$$inlined$call$1(o0ooooo, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32247OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                UserOutFitVM userOutFitVM = this.f32248OooO0oO;
                Iterator<ShopVehicleListModel> it = userOutFitVM.getMyVehiclesPager().f38497OooO0Oo.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (it.next().isSelected()) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0 && !Intrinsics.areEqual(userOutFitVM.getMyVehiclesPager().f38497OooO0Oo.get(i2), shopVehicleListModel)) {
                    userOutFitVM.getMyVehiclesPager().f38497OooO0Oo.get(i2).setSelected(false);
                }
                shopVehicleListModel.setSelected(!shopVehicleListModel.isSelected());
            }
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public UserOutFitVM() {
        Boolean bool = Boolean.FALSE;
        this.showPremiumBuyFrozenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showVipBuyFrozenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showVipGiveFrozenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showVehicleDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showProfilePreViewDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.currentPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.picUrl = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.myVehiclesPager = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
    }

    @NotNull
    public final MutableState<Integer> getCurrentItem() {
        return this.currentItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentPosition() {
        return ((Number) this.currentPosition.getValue()).intValue();
    }

    @NotNull
    public final o000<ShopVehicleListModel> getMyVehiclesPager() {
        return this.myVehiclesPager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getPicUrl() {
        return (String) this.picUrl.getValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowPremiumBuyFrozenDialog() {
        return this.showPremiumBuyFrozenDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowProfilePreViewDialog() {
        return this.showProfilePreViewDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowVehicleDialog() {
        return this.showVehicleDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowVipBuyFrozenDialog() {
        return this.showVipBuyFrozenDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowVipGiveFrozenDialog() {
        return this.showVipGiveFrozenDialog;
    }

    public final void setCurrentItem(@NotNull MutableState<Integer> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.currentItem = mutableState;
    }

    public final void setCurrentPosition(int i) {
        this.currentPosition.setValue(Integer.valueOf(i));
    }

    public final void setPicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picUrl.setValue(str);
    }

    public final void setShowPremiumBuyFrozenDialog(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.showPremiumBuyFrozenDialog = mutableState;
    }

    public final void setShowVehicleDialog(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.showVehicleDialog = mutableState;
    }

    @NotNull
    public final o00OO0O0<ApiResult<String>> useVehicleEdit(@NotNull ShopVehicleListModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return o00O.OooO00o(this, new OooO0O0(item, this, null));
    }
}
