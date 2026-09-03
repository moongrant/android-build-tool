package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p394o0Oo0.OooOO0;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;
import p474o0Ooooo.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleMineVM;", "Lo0Oo0/OooOO0;", "", "shopId", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "useBubble", "Landroidx/compose/runtime/MutableState;", "", "showPremiumBuyFrozenDialog", "Landroidx/compose/runtime/MutableState;", "getShowPremiumBuyFrozenDialog", "()Landroidx/compose/runtime/MutableState;", "showVipBuyFrozenDialog", "getShowVipBuyFrozenDialog", "showVipGiveFrozenDialog", "getShowVipGiveFrozenDialog", "showVipHiddenDialog", "getShowVipHiddenDialog", "showWealthHiddenDialog", "getShowWealthHiddenDialog", "Lo00o00oO/o000;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "bubblePagingSource", "Lo00o00oO/o000;", "getBubblePagingSource", "()Lo00o00oO/o000;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class StoreRoomChatBubbleMineVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final o000<StoreRoomChatBubbleModel> bubblePagingSource;

    @NotNull
    private final MutableState<Boolean> showPremiumBuyFrozenDialog;

    @NotNull
    private final MutableState<Boolean> showVipBuyFrozenDialog;

    @NotNull
    private final MutableState<Boolean> showVipGiveFrozenDialog;

    @NotNull
    private final MutableState<Boolean> showVipHiddenDialog;

    @NotNull
    private final MutableState<Boolean> showWealthHiddenDialog;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM$bubblePagingSource$1", f = "StoreRoomChatBubbleMineVM.kt", i = {}, l = {25, 26}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<StoreRoomChatBubbleModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32171OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32172OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f32172OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<StoreRoomChatBubbleModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32171OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
            }
            ResultKt.throwOnFailure(obj);
            if (this.f32172OooO0o0 != 1) {
                return new o000Oo0(new ArrayList());
            }
            this.f32171OooO0Oo = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0O0OOO0 o0o0ooo0 = o0O0OOO0.f47920OooO00o;
            this.f32171OooO0Oo = 2;
            obj = o0o0ooo0.OooO00o(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult2 = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult2, (List) apiResult2.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM$useBubble$1", f = "StoreRoomChatBubbleMineVM.kt", i = {0}, l = {31}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nStoreRoomChatBubbleMineVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreRoomChatBubbleMineVM.kt\ncom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleMineVM$useBubble$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n350#2,7:46\n350#2,7:53\n*S KotlinDebug\n*F\n+ 1 StoreRoomChatBubbleMineVM.kt\ncom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleMineVM$useBubble$1\n*L\n33#1:46,7\n37#1:53,7\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32173OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f32174OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32175OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleMineVM f32176OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32174OooO0o = i;
            this.f32176OooO0oO = storeRoomChatBubbleMineVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f32174OooO0o, this.f32176OooO0oO, continuation);
            oooO0O0.f32175OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<String>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOooO0Oo;
            o00OO0O0 o00oo0o1;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f32173OooO0Oo;
            int i3 = this.f32174OooO0o;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32175OooO0o0;
                o0O0OOO0 o0o0ooo0 = o0O0OOO0.f47920OooO00o;
                this.f32175OooO0o0 = o00oo0o2;
                this.f32173OooO0Oo = 1;
                objOooO0Oo = o0o0ooo0.OooO0Oo(i3, this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32175OooO0o0;
                ResultKt.throwOnFailure(obj);
                objOooO0Oo = obj;
            }
            ApiResult apiResult = (ApiResult) objOooO0Oo;
            if (apiResult.isSuccess()) {
                StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM = this.f32176OooO0oO;
                Iterator<StoreRoomChatBubbleModel> it = storeRoomChatBubbleMineVM.getBubblePagingSource().f38497OooO0Oo.iterator();
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (it.next().getSelected()) {
                        break;
                    }
                    i4++;
                }
                if (i4 >= 0) {
                    List<StoreRoomChatBubbleModel> list = storeRoomChatBubbleMineVM.getBubblePagingSource().f38497OooO0Oo;
                    StoreRoomChatBubbleModel storeRoomChatBubbleModel = storeRoomChatBubbleMineVM.getBubblePagingSource().f38497OooO0Oo.get(i4);
                    list.set(i4, storeRoomChatBubbleModel.copy((8387583 & 1) != 0 ? storeRoomChatBubbleModel.attachedPicUrl : null, (8387583 & 2) != 0 ? storeRoomChatBubbleModel.backgroundUrl : null, (8387583 & 4) != 0 ? storeRoomChatBubbleModel.bubbleColour : null, (8387583 & 8) != 0 ? storeRoomChatBubbleModel.canBuy : false, (8387583 & 16) != 0 ? storeRoomChatBubbleModel.canBuyUserType : 0, (8387583 & 32) != 0 ? storeRoomChatBubbleModel.dayNum : 0, (8387583 & 64) != 0 ? storeRoomChatBubbleModel.exclusiveLv : 0, (8387583 & 128) != 0 ? storeRoomChatBubbleModel.flagType : 0, (8387583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? storeRoomChatBubbleModel.frozenDay : 0, (8387583 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? storeRoomChatBubbleModel.h5Url : null, (8387583 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? storeRoomChatBubbleModel.isHave : false, (8387583 & 2048) != 0 ? storeRoomChatBubbleModel.limitNum : 0, (8387583 & 4096) != 0 ? storeRoomChatBubbleModel.obtainType : 0, (8387583 & 8192) != 0 ? storeRoomChatBubbleModel.obtainLevel : 0, (8387583 & 16384) != 0 ? storeRoomChatBubbleModel.picUrl : null, (8387583 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? storeRoomChatBubbleModel.price : 0, (8387583 & 65536) != 0 ? storeRoomChatBubbleModel.promotionPrice : 0, (8387583 & 131072) != 0 ? storeRoomChatBubbleModel.replyColour : null, (8387583 & 262144) != 0 ? storeRoomChatBubbleModel.selected : false, (8387583 & 524288) != 0 ? storeRoomChatBubbleModel.shopId : 0, (8387583 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? storeRoomChatBubbleModel.timeLong : 0, (8387583 & 2097152) != 0 ? storeRoomChatBubbleModel.waresName : null, (8387583 & Configuration.BLOCK_SIZE) != 0 ? storeRoomChatBubbleModel.bubbleText : null));
                }
                Iterator<StoreRoomChatBubbleModel> it2 = storeRoomChatBubbleMineVM.getBubblePagingSource().f38497OooO0Oo.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    if (it2.next().getShopId() == i3) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                if (i >= 0) {
                    List<StoreRoomChatBubbleModel> list2 = storeRoomChatBubbleMineVM.getBubblePagingSource().f38497OooO0Oo;
                    StoreRoomChatBubbleModel storeRoomChatBubbleModel2 = storeRoomChatBubbleMineVM.getBubblePagingSource().f38497OooO0Oo.get(i);
                    list2.set(i, storeRoomChatBubbleModel2.copy((8387583 & 1) != 0 ? storeRoomChatBubbleModel2.attachedPicUrl : null, (8387583 & 2) != 0 ? storeRoomChatBubbleModel2.backgroundUrl : null, (8387583 & 4) != 0 ? storeRoomChatBubbleModel2.bubbleColour : null, (8387583 & 8) != 0 ? storeRoomChatBubbleModel2.canBuy : false, (8387583 & 16) != 0 ? storeRoomChatBubbleModel2.canBuyUserType : 0, (8387583 & 32) != 0 ? storeRoomChatBubbleModel2.dayNum : 0, (8387583 & 64) != 0 ? storeRoomChatBubbleModel2.exclusiveLv : 0, (8387583 & 128) != 0 ? storeRoomChatBubbleModel2.flagType : 0, (8387583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? storeRoomChatBubbleModel2.frozenDay : 0, (8387583 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? storeRoomChatBubbleModel2.h5Url : null, (8387583 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? storeRoomChatBubbleModel2.isHave : false, (8387583 & 2048) != 0 ? storeRoomChatBubbleModel2.limitNum : 0, (8387583 & 4096) != 0 ? storeRoomChatBubbleModel2.obtainType : 0, (8387583 & 8192) != 0 ? storeRoomChatBubbleModel2.obtainLevel : 0, (8387583 & 16384) != 0 ? storeRoomChatBubbleModel2.picUrl : null, (8387583 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? storeRoomChatBubbleModel2.price : 0, (8387583 & 65536) != 0 ? storeRoomChatBubbleModel2.promotionPrice : 0, (8387583 & 131072) != 0 ? storeRoomChatBubbleModel2.replyColour : null, (8387583 & 262144) != 0 ? storeRoomChatBubbleModel2.selected : true, (8387583 & 524288) != 0 ? storeRoomChatBubbleModel2.shopId : 0, (8387583 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? storeRoomChatBubbleModel2.timeLong : 0, (8387583 & 2097152) != 0 ? storeRoomChatBubbleModel2.waresName : null, (8387583 & Configuration.BLOCK_SIZE) != 0 ? storeRoomChatBubbleModel2.bubbleText : null));
                }
                storeRoomChatBubbleMineVM.getBubblePagingSource().OooO0O0();
            }
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public StoreRoomChatBubbleMineVM() {
        Boolean bool = Boolean.FALSE;
        this.showPremiumBuyFrozenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showVipBuyFrozenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showVipGiveFrozenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showVipHiddenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showWealthHiddenDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.bubblePagingSource = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
    }

    @NotNull
    public final o000<StoreRoomChatBubbleModel> getBubblePagingSource() {
        return this.bubblePagingSource;
    }

    @NotNull
    public final MutableState<Boolean> getShowPremiumBuyFrozenDialog() {
        return this.showPremiumBuyFrozenDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowVipBuyFrozenDialog() {
        return this.showVipBuyFrozenDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowVipGiveFrozenDialog() {
        return this.showVipGiveFrozenDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowVipHiddenDialog() {
        return this.showVipHiddenDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowWealthHiddenDialog() {
        return this.showWealthHiddenDialog;
    }

    @NotNull
    public final o00OO0O0<ApiResult<String>> useBubble(int shopId) {
        return o00O.OooO00o(this, new OooO0O0(shopId, this, null));
    }
}
