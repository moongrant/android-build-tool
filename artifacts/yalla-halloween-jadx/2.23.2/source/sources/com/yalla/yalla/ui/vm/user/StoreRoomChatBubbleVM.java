package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.model.StoreRoomChatBubbleBuyModel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.model.http.ApiResult;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p394o0Oo0.OooOO0;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;
import p474o0Ooooo.o0O0OOO0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R/\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleVM;", "Lo0Oo0/OooOO0;", "", "shopId", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleBuyModel;", "buyBubble", "Landroidx/compose/runtime/MutableState;", "", "showOpenPremiumDialog", "Landroidx/compose/runtime/MutableState;", "getShowOpenPremiumDialog", "()Landroidx/compose/runtime/MutableState;", "showOpenVipDialog", "getShowOpenVipDialog", "showBuyDialog", "getShowBuyDialog", "Lo00o00oO/o000;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "bubblePagingSource", "Lo00o00oO/o000;", "getBubblePagingSource", "()Lo00o00oO/o000;", "<set-?>", "buyModel$delegate", "getBuyModel", "()Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "setBuyModel", "(Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;)V", "buyModel", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStoreRoomChatBubbleVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreRoomChatBubbleVM.kt\ncom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,39:1\n81#2:40\n107#2,2:41\n*S KotlinDebug\n*F\n+ 1 StoreRoomChatBubbleVM.kt\ncom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleVM\n*L\n38#1:40\n38#1:41,2\n*E\n"})
public final class StoreRoomChatBubbleVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final o000<StoreRoomChatBubbleModel> bubblePagingSource;

    /* JADX INFO: renamed from: buyModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState buyModel;

    @NotNull
    private final MutableState<Boolean> showBuyDialog;

    @NotNull
    private final MutableState<Boolean> showOpenPremiumDialog;

    @NotNull
    private final MutableState<Boolean> showOpenVipDialog;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM$bubblePagingSource$1", f = "StoreRoomChatBubbleVM.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<StoreRoomChatBubbleModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32177OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32178OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f32178OooO0o0 = ((Number) obj).intValue();
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
            int i = this.f32177OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f32178OooO0o0 != 1) {
                    return new o000Oo0(new ArrayList());
                }
                o0O0OOO0 o0o0ooo0 = o0O0OOO0.f47920OooO00o;
                this.f32177OooO0Oo = 1;
                obj = o0o0ooo0.OooO0O0(this);
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM$buyBubble$1", f = "StoreRoomChatBubbleVM.kt", i = {0}, l = {22}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<StoreRoomChatBubbleBuyModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f32180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32181OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32180OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f32180OooO0o, continuation);
            oooO0O0.f32181OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<StoreRoomChatBubbleBuyModel>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            StoreRoomChatBubbleBuyModel storeRoomChatBubbleBuyModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32179OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32181OooO0o0;
                o0O0OOO0 o0o0ooo0 = o0O0OOO0.f47920OooO00o;
                this.f32181OooO0o0 = o00oo0o2;
                this.f32179OooO0Oo = 1;
                Object objOooO0OO = o0o0ooo0.OooO0OO(this.f32180OooO0o, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32181OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && (storeRoomChatBubbleBuyModel = (StoreRoomChatBubbleBuyModel) apiResult.getData()) != null) {
                long balance = storeRoomChatBubbleBuyModel.getBalance();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().postValue(Boxing.boxLong(balance));
            }
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public StoreRoomChatBubbleVM() {
        Boolean bool = Boolean.FALSE;
        this.showOpenPremiumDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showOpenVipDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showBuyDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.bubblePagingSource = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
        this.buyModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @NotNull
    public final o00OO0O0<ApiResult<StoreRoomChatBubbleBuyModel>> buyBubble(int shopId) {
        return o00O.OooO00o(this, new OooO0O0(shopId, null));
    }

    @NotNull
    public final o000<StoreRoomChatBubbleModel> getBubblePagingSource() {
        return this.bubblePagingSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final StoreRoomChatBubbleModel getBuyModel() {
        return (StoreRoomChatBubbleModel) this.buyModel.getValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowBuyDialog() {
        return this.showBuyDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowOpenPremiumDialog() {
        return this.showOpenPremiumDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowOpenVipDialog() {
        return this.showOpenVipDialog;
    }

    public final void setBuyModel(@Nullable StoreRoomChatBubbleModel storeRoomChatBubbleModel) {
        this.buyModel.setValue(storeRoomChatBubbleModel);
    }
}
