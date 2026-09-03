package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.StoreRoomChatBubbleBuyModel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import java.util.ArrayList;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;
import p498o0o00Oo0.OooOOO;
import p513o0o0O.OooO0OO;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R/\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleVM;", "Lo00OO/OooO00o;", "", "shopId", "Lo0o000OO/OooOOOO;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleBuyModel;", "buyBubble", "Lo000oOoO/o0O00OO;", "", "showOpenPremiumDialog", "Lo000oOoO/o0O00OO;", "getShowOpenPremiumDialog", "()Lo000oOoO/o0O00OO;", "showOpenVipDialog", "getShowOpenVipDialog", "showBuyDialog", "getShowBuyDialog", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "bubblePagingSource", "Lo0ooO00/o000O0;", "getBubblePagingSource", "()Lo0ooO00/o000O0;", "<set-?>", "buyModel$delegate", "getBuyModel", "()Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "setBuyModel", "(Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;)V", "buyModel", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class StoreRoomChatBubbleVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final o000O0<StoreRoomChatBubbleModel> bubblePagingSource;

    /* JADX INFO: renamed from: buyModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO buyModel;

    @NotNull
    private final o0O00OO<Boolean> showBuyDialog;

    @NotNull
    private final o0O00OO<Boolean> showOpenPremiumDialog;

    @NotNull
    private final o0O00OO<Boolean> showOpenVipDialog;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM$bubblePagingSource$1", f = "StoreRoomChatBubbleVM.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<StoreRoomChatBubbleModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26200Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f26201Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f26201Oooo0oO = ((Number) obj).intValue();
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
            int i = this.f26200Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f26201Oooo0oO != 1) {
                    return new o000OO0O(new ArrayList());
                }
                OooO0OO oooO0OO = OooO0OO.f42047OooO00o;
                this.f26200Oooo0o = 1;
                obj = oooO0OO.OooO0O0(this);
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM$buyBubble$1", f = "StoreRoomChatBubbleVM.kt", i = {0}, l = {23}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<OooOOOO<ApiResult<StoreRoomChatBubbleBuyModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26202Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26203Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f26204Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26204Oooo0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f26204Oooo0oo, continuation);
            oooO0O0.f26203Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<StoreRoomChatBubbleBuyModel>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            StoreRoomChatBubbleBuyModel storeRoomChatBubbleBuyModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26202Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f26203Oooo0oO;
                OooO0OO oooO0OO = OooO0OO.f42047OooO00o;
                int i2 = this.f26204Oooo0oo;
                this.f26203Oooo0oO = oooOOOO2;
                this.f26202Oooo0o = 1;
                Object objOooO0OO = oooO0OO.OooO0OO(i2, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f26203Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && (storeRoomChatBubbleBuyModel = (StoreRoomChatBubbleBuyModel) apiResult.getData()) != null) {
                OooOOO.f41216OooO00o.OooO0OO().postValue(Boxing.boxLong(storeRoomChatBubbleBuyModel.getBalance()));
            }
            oooOOOO.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public StoreRoomChatBubbleVM() {
        Boolean bool = Boolean.FALSE;
        this.showOpenPremiumDialog = o0OOO00.OooO0Oo(bool);
        this.showOpenVipDialog = o0OOO00.OooO0Oo(bool);
        this.showBuyDialog = o0OOO00.OooO0Oo(bool);
        this.bubblePagingSource = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
        this.buyModel = o0OOO00.OooO0Oo(null);
    }

    @NotNull
    public final OooOOOO<ApiResult<StoreRoomChatBubbleBuyModel>> buyBubble(int shopId) {
        return OooOOO0.OooO00o(this, new OooO0O0(shopId, null));
    }

    @NotNull
    public final o000O0<StoreRoomChatBubbleModel> getBubblePagingSource() {
        return this.bubblePagingSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final StoreRoomChatBubbleModel getBuyModel() {
        return (StoreRoomChatBubbleModel) this.buyModel.getValue();
    }

    @NotNull
    public final o0O00OO<Boolean> getShowBuyDialog() {
        return this.showBuyDialog;
    }

    @NotNull
    public final o0O00OO<Boolean> getShowOpenPremiumDialog() {
        return this.showOpenPremiumDialog;
    }

    @NotNull
    public final o0O00OO<Boolean> getShowOpenVipDialog() {
        return this.showOpenVipDialog;
    }

    public final void setBuyModel(@Nullable StoreRoomChatBubbleModel storeRoomChatBubbleModel) {
        this.buyModel.setValue(storeRoomChatBubbleModel);
    }
}
