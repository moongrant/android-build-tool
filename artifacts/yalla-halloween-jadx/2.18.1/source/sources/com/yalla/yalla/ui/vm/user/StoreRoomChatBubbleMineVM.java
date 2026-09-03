package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yallatech.support.platform.share.bean.ShareRequest;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;
import p513o0o0O.OooO0OO;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleMineVM;", "Lo00OO/OooO00o;", "", "shopId", "Lo0o000OO/OooOOOO;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "useBubble", "Lo000oOoO/o0O00OO;", "", "showPremiumBuyFrozenDialog", "Lo000oOoO/o0O00OO;", "getShowPremiumBuyFrozenDialog", "()Lo000oOoO/o0O00OO;", "showVipBuyFrozenDialog", "getShowVipBuyFrozenDialog", "showVipGiveFrozenDialog", "getShowVipGiveFrozenDialog", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "bubblePagingSource", "Lo0ooO00/o000O0;", "getBubblePagingSource", "()Lo0ooO00/o000O0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class StoreRoomChatBubbleMineVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final o000O0<StoreRoomChatBubbleModel> bubblePagingSource;

    @NotNull
    private final o0O00OO<Boolean> showPremiumBuyFrozenDialog;

    @NotNull
    private final o0O00OO<Boolean> showVipBuyFrozenDialog;

    @NotNull
    private final o0O00OO<Boolean> showVipGiveFrozenDialog;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM$bubblePagingSource$1", f = "StoreRoomChatBubbleMineVM.kt", i = {}, l = {21, 22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<StoreRoomChatBubbleModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26194Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f26195Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f26195Oooo0oO = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<StoreRoomChatBubbleModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26194Oooo0o;
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
            if (this.f26195Oooo0oO != 1) {
                return new o000OO0O(new ArrayList());
            }
            this.f26194Oooo0o = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO0OO oooO0OO = OooO0OO.f42047OooO00o;
            this.f26194Oooo0o = 2;
            obj = oooO0OO.OooO00o(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult2 = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult2, (List) apiResult2.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM$useBubble$1", f = "StoreRoomChatBubbleMineVM.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<OooOOOO<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleMineVM f26196Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26197Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26198Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f26199Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26199Oooo0oo = i;
            this.f26196Oooo = storeRoomChatBubbleMineVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f26199Oooo0oo, this.f26196Oooo, continuation);
            oooO0O0.f26198Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<String>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOooO0Oo;
            OooOOOO oooOOOO;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f26197Oooo0o;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f26198Oooo0oO;
                OooO0OO oooO0OO = OooO0OO.f42047OooO00o;
                int i3 = this.f26199Oooo0oo;
                this.f26198Oooo0oO = oooOOOO2;
                this.f26197Oooo0o = 1;
                objOooO0Oo = oooO0OO.OooO0Oo(i3, this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f26198Oooo0oO;
                ResultKt.throwOnFailure(obj);
                objOooO0Oo = obj;
            }
            ApiResult apiResult = (ApiResult) objOooO0Oo;
            if (apiResult.isSuccess()) {
                Iterator it = this.f26196Oooo.getBubblePagingSource().f48682OooO0Oo.iterator();
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (((StoreRoomChatBubbleModel) it.next()).getSelected()) {
                        break;
                    }
                    i4++;
                }
                if (i4 >= 0) {
                    List<T> list = this.f26196Oooo.getBubblePagingSource().f48682OooO0Oo;
                    StoreRoomChatBubbleModel storeRoomChatBubbleModel = (StoreRoomChatBubbleModel) this.f26196Oooo.getBubblePagingSource().f48682OooO0Oo.get(i4);
                    list.set(i4, (T) storeRoomChatBubbleModel.copy((8126463 & 1) != 0 ? storeRoomChatBubbleModel.attachedPicUrl : null, (8126463 & 2) != 0 ? storeRoomChatBubbleModel.backgroundUrl : null, (8126463 & 4) != 0 ? storeRoomChatBubbleModel.bubbleColour : null, (8126463 & 8) != 0 ? storeRoomChatBubbleModel.canBuy : false, (8126463 & 16) != 0 ? storeRoomChatBubbleModel.canBuyUserType : 0, (8126463 & 32) != 0 ? storeRoomChatBubbleModel.dayNum : 0, (8126463 & 64) != 0 ? storeRoomChatBubbleModel.exclusiveLv : 0, (8126463 & 128) != 0 ? storeRoomChatBubbleModel.flagType : 0, (8126463 & 256) != 0 ? storeRoomChatBubbleModel.frozenDay : 0, (8126463 & 512) != 0 ? storeRoomChatBubbleModel.h5Url : null, (8126463 & 1024) != 0 ? storeRoomChatBubbleModel.isHave : false, (8126463 & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? storeRoomChatBubbleModel.limitNum : 0, (8126463 & 4096) != 0 ? storeRoomChatBubbleModel.obtainType : 0, (8126463 & 8192) != 0 ? storeRoomChatBubbleModel.obtainLevel : 0, (8126463 & 16384) != 0 ? storeRoomChatBubbleModel.picUrl : null, (8126463 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? storeRoomChatBubbleModel.price : 0, (8126463 & 65536) != 0 ? storeRoomChatBubbleModel.promotionPrice : 0, (8126463 & 131072) != 0 ? storeRoomChatBubbleModel.replyColour : null, (8126463 & 262144) != 0 ? storeRoomChatBubbleModel.selected : false, (8126463 & 524288) != 0 ? storeRoomChatBubbleModel.shopId : 0, (8126463 & 1048576) != 0 ? storeRoomChatBubbleModel.timeLong : 0, (8126463 & 2097152) != 0 ? storeRoomChatBubbleModel.waresName : null, (8126463 & 4194304) != 0 ? storeRoomChatBubbleModel.bubbleText : null));
                }
                List<T> list2 = this.f26196Oooo.getBubblePagingSource().f48682OooO0Oo;
                int i5 = this.f26199Oooo0oo;
                Iterator it2 = list2.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    if (((StoreRoomChatBubbleModel) it2.next()).getShopId() == i5) {
                        i = i6;
                        break;
                    }
                    i6++;
                }
                if (i >= 0) {
                    List<T> list3 = this.f26196Oooo.getBubblePagingSource().f48682OooO0Oo;
                    StoreRoomChatBubbleModel storeRoomChatBubbleModel2 = (StoreRoomChatBubbleModel) this.f26196Oooo.getBubblePagingSource().f48682OooO0Oo.get(i);
                    list3.set(i, (T) storeRoomChatBubbleModel2.copy((8126463 & 1) != 0 ? storeRoomChatBubbleModel2.attachedPicUrl : null, (8126463 & 2) != 0 ? storeRoomChatBubbleModel2.backgroundUrl : null, (8126463 & 4) != 0 ? storeRoomChatBubbleModel2.bubbleColour : null, (8126463 & 8) != 0 ? storeRoomChatBubbleModel2.canBuy : false, (8126463 & 16) != 0 ? storeRoomChatBubbleModel2.canBuyUserType : 0, (8126463 & 32) != 0 ? storeRoomChatBubbleModel2.dayNum : 0, (8126463 & 64) != 0 ? storeRoomChatBubbleModel2.exclusiveLv : 0, (8126463 & 128) != 0 ? storeRoomChatBubbleModel2.flagType : 0, (8126463 & 256) != 0 ? storeRoomChatBubbleModel2.frozenDay : 0, (8126463 & 512) != 0 ? storeRoomChatBubbleModel2.h5Url : null, (8126463 & 1024) != 0 ? storeRoomChatBubbleModel2.isHave : false, (8126463 & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? storeRoomChatBubbleModel2.limitNum : 0, (8126463 & 4096) != 0 ? storeRoomChatBubbleModel2.obtainType : 0, (8126463 & 8192) != 0 ? storeRoomChatBubbleModel2.obtainLevel : 0, (8126463 & 16384) != 0 ? storeRoomChatBubbleModel2.picUrl : null, (8126463 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? storeRoomChatBubbleModel2.price : 0, (8126463 & 65536) != 0 ? storeRoomChatBubbleModel2.promotionPrice : 0, (8126463 & 131072) != 0 ? storeRoomChatBubbleModel2.replyColour : null, (8126463 & 262144) != 0 ? storeRoomChatBubbleModel2.selected : true, (8126463 & 524288) != 0 ? storeRoomChatBubbleModel2.shopId : 0, (8126463 & 1048576) != 0 ? storeRoomChatBubbleModel2.timeLong : 0, (8126463 & 2097152) != 0 ? storeRoomChatBubbleModel2.waresName : null, (8126463 & 4194304) != 0 ? storeRoomChatBubbleModel2.bubbleText : null));
                }
                this.f26196Oooo.getBubblePagingSource().OooO0O0();
            }
            oooOOOO.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public StoreRoomChatBubbleMineVM() {
        Boolean bool = Boolean.FALSE;
        this.showPremiumBuyFrozenDialog = o0OOO00.OooO0Oo(bool);
        this.showVipBuyFrozenDialog = o0OOO00.OooO0Oo(bool);
        this.showVipGiveFrozenDialog = o0OOO00.OooO0Oo(bool);
        this.bubblePagingSource = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
    }

    @NotNull
    public final o000O0<StoreRoomChatBubbleModel> getBubblePagingSource() {
        return this.bubblePagingSource;
    }

    @NotNull
    public final o0O00OO<Boolean> getShowPremiumBuyFrozenDialog() {
        return this.showPremiumBuyFrozenDialog;
    }

    @NotNull
    public final o0O00OO<Boolean> getShowVipBuyFrozenDialog() {
        return this.showVipBuyFrozenDialog;
    }

    @NotNull
    public final o0O00OO<Boolean> getShowVipGiveFrozenDialog() {
        return this.showVipGiveFrozenDialog;
    }

    @NotNull
    public final OooOOOO<ApiResult<String>> useBubble(int shopId) {
        return OooOOO0.OooO00o(this, new OooO0O0(shopId, this, null));
    }
}
