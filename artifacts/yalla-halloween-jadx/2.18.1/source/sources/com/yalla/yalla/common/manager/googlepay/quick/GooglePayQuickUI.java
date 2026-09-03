package com.yalla.yalla.common.manager.googlepay.quick;

import OooO00o.OooO00o;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.SkuDetails;
import com.code.android.util.ToastUtil;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.FixRechargeOrderManager;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.common.manager.googlepay.GooglePayPrice;
import com.yalla.yalla.common.manager.googlepay.GooglePaySkuDetail;
import com.yalla.yalla.common.manager.googlepay.PayResult;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.RechargeMenuBanType;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuModel;
import com.yalla.yalla.common.model.RechargeMenuPayResultModel;
import com.yalla.yalla.common.model.RechargeMenuToPayModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.util.PaySupportChannels;
import com.yalla.yalla.common.vm.WalletCoinVM;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o0o0000.OooOOOO;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p466o0OooO0.o0000oo;
import p498o0o00Oo0.OooOOO;
import p502o0o00o0.o0000O;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\ba\u0010bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0010H\u0002J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0012H\u0002J\u0018\u0010\u001b\u001a\u00020\u00022\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003J\u001e\u0010 \u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u0002H\u0002J$\u0010(\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&J \u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\b\u0010\u001a\u001a\u0004\u0018\u00010,R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00109R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010:R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00105\u001a\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/quick/GooglePayQuickUI;", "", "", "loadShopList", "", "Lcom/yalla/yalla/common/model/RechargeMenuType;", "list", "toQuerySkuDetails", "deleteDataBan", "showPageInfo", "iniView", "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "createOrder", "goodsUnderMaintenanceDialog", "reLoadData", "Lcom/yalla/yalla/common/model/RechargeMenuToPayModel;", "toPay", "Lcom/yalla/yalla/common/db/table/PayOrder;", "payOrder", "", "toConsumeOrder", "(Lcom/yalla/yalla/common/db/table/PayOrder;)Ljava/lang/Boolean;", "confirmRechargeOrder", "checkOrderState", "showRechargeErrorDialog", "data", "calculatedMaxWidthForItemView", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "minTime", "showLoadingDialog", "dismissLoadingDialog", "Lcom/yalla/yalla/common/ui/view/StateLayout;", "stateLayout", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/TextView;", "tvHolder", "setView", "", "requestCode", "resultCode", "Landroid/content/Intent;", "onActivityResult", "Landroidx/fragment/app/FragmentActivity;", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lo0o00o0/o0000O;", "loadingDialog$delegate", "Lkotlin/Lazy;", "getLoadingDialog", "()Lo0o00o0/o0000O;", "loadingDialog", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yalla/yalla/common/ui/view/StateLayout;", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function0;", "getListener", "()Lkotlin/jvm/functions/Function0;", "setListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/yalla/yalla/common/manager/googlepay/quick/GooglePayQuickVM;", "vmGoogle$delegate", "getVmGoogle", "()Lcom/yalla/yalla/common/manager/googlepay/quick/GooglePayQuickVM;", "vmGoogle", "Lcom/yalla/yalla/common/vm/WalletCoinVM;", "vmLog$delegate", "getVmLog", "()Lcom/yalla/yalla/common/vm/WalletCoinVM;", "vmLog", "Lcom/yalla/yalla/common/manager/PayManager;", "payManager$delegate", "getPayManager", "()Lcom/yalla/yalla/common/manager/PayManager;", "payManager", "Lcom/yalla/yalla/common/manager/FixRechargeOrderManager;", "fixRechargeOrderManager", "Lcom/yalla/yalla/common/manager/FixRechargeOrderManager;", "Lcom/yalla/yalla/common/manager/googlepay/quick/GooglePayQuickAdapter;", "adapter$delegate", "getAdapter", "()Lcom/yalla/yalla/common/manager/googlepay/quick/GooglePayQuickAdapter;", "adapter", "recharging", "Z", "errorCount", "I", "Lcom/yalla/yalla/common/model/RechargeMenuBanType;", "rechargeBanList", "Ljava/util/List;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GooglePayQuickUI {
    public static final int $stable = 8;

    @NotNull
    private final FragmentActivity activity;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;
    private int errorCount;

    @Nullable
    private FixRechargeOrderManager fixRechargeOrderManager;

    @Nullable
    private Function0<Unit> listener;

    /* JADX INFO: renamed from: loadingDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog;

    /* JADX INFO: renamed from: payManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy payManager;

    @NotNull
    private final List<RechargeMenuBanType> rechargeBanList;
    private boolean recharging;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private StateLayout stateLayout;

    @Nullable
    private TextView tvHolder;

    /* JADX INFO: renamed from: vmGoogle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vmGoogle;

    /* JADX INFO: renamed from: vmLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vmLog;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1", f = "GooglePayQuickUI.kt", i = {}, l = {313, 314}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PayOrder $payOrder;
        public int label;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1$1", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Boolean $consumeOrder;
            public final /* synthetic */ PayOrder $payOrder;
            public int label;
            public final /* synthetic */ GooglePayQuickUI this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02021(Boolean bool, PayOrder payOrder, GooglePayQuickUI googlePayQuickUI, Continuation<? super C02021> continuation) {
                super(2, continuation);
                this.$consumeOrder = bool;
                this.$payOrder = payOrder;
                this.this$0 = googlePayQuickUI;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02021(this.$consumeOrder, this.$payOrder, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C02021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(this.$consumeOrder, Boxing.boxBoolean(true))) {
                    this.$payOrder.setConsume(true);
                    this.this$0.getVmGoogle().updateOrderToDB(this.$payOrder);
                    this.this$0.errorCount = 0;
                    this.this$0.confirmRechargeOrder(this.$payOrder);
                } else {
                    this.this$0.getVmLog().onConsumptionErrorUploadLog(this.$payOrder);
                    this.this$0.dismissLoadingDialog();
                    this.this$0.errorCount++;
                    this.this$0.showRechargeErrorDialog(this.$payOrder);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04891(PayOrder payOrder, Continuation<? super C04891> continuation) {
            super(2, continuation);
            this.$payOrder = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GooglePayQuickUI.this.new C04891(this.$payOrder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            PayManager payManager = GooglePayQuickUI.this.getPayManager();
            PayOrder payOrder = this.$payOrder;
            this.label = 1;
            obj = payManager.consumeOrder(payOrder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C02021 c02021 = new C02021((Boolean) obj, this.$payOrder, GooglePayQuickUI.this, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c02021, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toPay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toPay$1", f = "GooglePayQuickUI.kt", i = {}, l = {257, 261}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ RechargeMenuToPayModel $model;
        public int label;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toPay$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toPay$1$1", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ RechargeMenuPayResultModel $payResult;
            public int label;
            public final /* synthetic */ GooglePayQuickUI this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02031(RechargeMenuPayResultModel rechargeMenuPayResultModel, GooglePayQuickUI googlePayQuickUI, Continuation<? super C02031> continuation) {
                super(2, continuation);
                this.$payResult = rechargeMenuPayResultModel;
                this.this$0 = googlePayQuickUI;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02031(this.$payResult, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C02031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                int errorCode;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$payResult.getIsSuccess()) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("确认订单和消单 orderid:");
                    sbOooO0o0.append(this.$payResult.getOrderid());
                    sbOooO0o0.append(" purchaseToken: ");
                    sbOooO0o0.append(this.$payResult.getPurchasetoken());
                    o00O00.OooO0O0(sbOooO0o0.toString());
                    GooglePayQuickUI googlePayQuickUI = this.this$0;
                    GooglePayQuickUI.showLoadingDialog$default(googlePayQuickUI, googlePayQuickUI.getActivity().getString(R.string.Validating_your_purchase), 0L, 2, null);
                    PayOrder payOrder = new PayOrder();
                    payOrder.setUserId(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
                    payOrder.setConsume(false);
                    payOrder.setNewOrder(true);
                    payOrder.setType(this.$payResult.getType());
                    payOrder.setOrderId(this.$payResult.getOrderid());
                    payOrder.setSku(this.$payResult.getSku());
                    payOrder.setPurchaseToken(this.$payResult.getPurchasetoken());
                    payOrder.setHuaWeiAccountFlag(this.$payResult.getAccountFlag());
                    payOrder.setCreateTime(System.currentTimeMillis());
                    this.this$0.getVmGoogle().saveOrderToDB(payOrder);
                    this.this$0.toConsumeOrder(payOrder);
                } else {
                    this.this$0.recharging = false;
                    o00O00.OooOO0O("支付失败 " + this.$payResult.getErrorCode() + ' ' + this.$payResult.getErrorMessage());
                    PayOrder payOrder2 = new PayOrder();
                    RechargeMenuPayResultModel rechargeMenuPayResultModel = this.$payResult;
                    payOrder2.setOrderId(rechargeMenuPayResultModel.getOrderid());
                    payOrder2.setSku(rechargeMenuPayResultModel.getSku());
                    payOrder2.setType(rechargeMenuPayResultModel.getType());
                    this.this$0.getVmLog().onBuyErrorUploadLog(payOrder2);
                    if (this.$payResult.getType() == PaySupportChannels.pay_type_googlePay.getNum() && ((errorCode = this.$payResult.getErrorCode()) == -103 || errorCode == -101)) {
                        ToastUtil.f12567OooO00o.OooO0O0(this.this$0.getActivity().getString(R.string.google_play_useless));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04901(RechargeMenuToPayModel rechargeMenuToPayModel, Continuation<? super C04901> continuation) {
            super(2, continuation);
            this.$model = rechargeMenuToPayModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GooglePayQuickUI.this.new C04901(this.$model, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            PayManager payManager = GooglePayQuickUI.this.getPayManager();
            RechargeMenuToPayModel rechargeMenuToPayModel = this.$model;
            this.label = 1;
            obj = PayManager.pay$default(payManager, rechargeMenuToPayModel, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            RechargeMenuPayResultModel rechargeMenuPayResultModel = (RechargeMenuPayResultModel) obj;
            rechargeMenuPayResultModel.setType(this.$model.getType());
            rechargeMenuPayResultModel.setOrderid(this.$model.getOrderid());
            rechargeMenuPayResultModel.setSku(this.$model.getSku());
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C02031 c02031 = new C02031(rechargeMenuPayResultModel, GooglePayQuickUI.this, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c02031, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toQuerySkuDetails$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toQuerySkuDetails$2", f = "GooglePayQuickUI.kt", i = {}, l = {117, 126}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<RechargeMenuType> $list;
        public final /* synthetic */ List<String> $sukList;
        public int label;
        public final /* synthetic */ GooglePayQuickUI this$0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toQuerySkuDetails$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$toQuerySkuDetails$2$2", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02042 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ List<RechargeMenuType> $list;
            public int label;
            public final /* synthetic */ GooglePayQuickUI this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02042(GooglePayQuickUI googlePayQuickUI, List<RechargeMenuType> list, Continuation<? super C02042> continuation) {
                super(2, continuation);
                this.this$0 = googlePayQuickUI;
                this.$list = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02042(this.this$0, this.$list, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C02042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.deleteDataBan(this.$list);
                this.this$0.showPageInfo(this.$list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04912(List<String> list, GooglePayQuickUI googlePayQuickUI, List<RechargeMenuType> list2, Continuation<? super C04912> continuation) {
            super(2, continuation);
            this.$sukList = list;
            this.this$0 = googlePayQuickUI;
            this.$list = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04912(this.$sukList, this.this$0, this.$list, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00b0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MainCoroutineDispatcher main;
            C02042 c02042;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            if (!this.$sukList.isEmpty()) {
                PayManager payManager = this.this$0.getPayManager();
                List<String> list = this.$sukList;
                int num = PaySupportChannels.pay_type_googlePay.getNum();
                this.label = 1;
                obj = payManager.querySkuDetails(list, num, false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            main = Dispatchers.getMain();
            c02042 = new C02042(this.this$0, this.$list, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c02042, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            PayResult payResult = (PayResult) obj;
            for (RechargeMenuType rechargeMenuType : this.$list) {
                List list2 = (List) payResult.getData();
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(rechargeMenuType.getSku(), ((GooglePaySkuDetail) next).getSku()));
                    GooglePaySkuDetail googlePaySkuDetail = (GooglePaySkuDetail) next;
                    if (googlePaySkuDetail != null) {
                        rechargeMenuType.setSkuDetails(googlePaySkuDetail.getDetail());
                        rechargeMenuType.setAmount(googlePaySkuDetail.getAmount());
                        rechargeMenuType.setUnit(googlePaySkuDetail.getUnit());
                    }
                }
            }
            main = Dispatchers.getMain();
            c02042 = new C02042(this.this$0, this.$list, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c02042, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public GooglePayQuickUI(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.loadingDialog = LazyKt.lazy(new Function0<o0000O>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$loadingDialog$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final o0000O invoke() {
                return new o0000O(this.this$0.getActivity());
            }
        });
        this.vmGoogle = LazyKt.lazy(new Function0<GooglePayQuickVM>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$vmGoogle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GooglePayQuickVM invoke() {
                return (GooglePayQuickVM) new ViewModelProvider(this.this$0.getActivity()).get(GooglePayQuickVM.class);
            }
        });
        this.vmLog = LazyKt.lazy(new Function0<WalletCoinVM>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$vmLog$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WalletCoinVM invoke() {
                return (WalletCoinVM) new ViewModelProvider(this.this$0.getActivity()).get(WalletCoinVM.class);
            }
        });
        this.payManager = LazyKt.lazy(new Function0<PayManager>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$payManager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PayManager invoke() {
                return new PayManager(this.this$0.getActivity());
            }
        });
        this.adapter = LazyKt.lazy(new Function0<GooglePayQuickAdapter>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$adapter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GooglePayQuickAdapter invoke() {
                return new GooglePayQuickAdapter(this.this$0.getActivity(), 0, 2, null);
            }
        });
        this.rechargeBanList = new ArrayList();
    }

    @SuppressLint({"SetTextI18n", "NotifyDataSetChanged"})
    private final void calculatedMaxWidthForItemView(List<RechargeMenuType> data) {
        TextView textView;
        String string;
        int length;
        int length2;
        if (data != null) {
            int i = 1;
            if (!data.isEmpty()) {
                RechargeMenuType rechargeMenuType = null;
                for (RechargeMenuType rechargeMenuType2 : data) {
                    if (rechargeMenuType != null) {
                        if (rechargeMenuType.getSkuDetails() != null) {
                            GooglePayPrice googlePayPrice = GooglePayPrice.INSTANCE;
                            SkuDetails skuDetails = rechargeMenuType.getSkuDetails();
                            Intrinsics.checkNotNull(skuDetails);
                            length = googlePayPrice.getGooglePayPriceFormat(skuDetails).length();
                        } else {
                            length = (rechargeMenuType.getUnit() + "" + rechargeMenuType.getAmount()).length();
                        }
                        if (rechargeMenuType2.getSkuDetails() != null) {
                            GooglePayPrice googlePayPrice2 = GooglePayPrice.INSTANCE;
                            SkuDetails skuDetails2 = rechargeMenuType2.getSkuDetails();
                            Intrinsics.checkNotNull(skuDetails2);
                            length2 = googlePayPrice2.getGooglePayPriceFormat(skuDetails2).length();
                        } else {
                            length2 = (rechargeMenuType2.getUnit() + "" + rechargeMenuType2.getAmount()).length();
                        }
                        if (length < length2) {
                        }
                    }
                    rechargeMenuType = rechargeMenuType2;
                }
                if (rechargeMenuType == null || (textView = this.tvHolder) == null) {
                    return;
                }
                if (rechargeMenuType.getSkuDetails() != null) {
                    GooglePayPrice googlePayPrice3 = GooglePayPrice.INSTANCE;
                    SkuDetails skuDetails3 = rechargeMenuType.getSkuDetails();
                    Intrinsics.checkNotNull(skuDetails3);
                    string = googlePayPrice3.getGooglePayPriceFormat(skuDetails3);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(rechargeMenuType.getUnit());
                    sb.append(' ');
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(rechargeMenuType.getAmount())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    sb.append(str);
                    string = sb.toString();
                }
                textView.setText(string);
                textView.post(new o0000oo(textView, this, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculatedMaxWidthForItemView$lambda-10$lambda-9$lambda-8$lambda-7, reason: not valid java name */
    public static final void m288xf51d7d14(TextView this_apply, GooglePayQuickUI this$0) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAdapter().setMinwidth(this_apply.getWidth());
        this$0.getAdapter().notifyDataSetChanged();
    }

    private final void checkOrderState() {
        this.fixRechargeOrderManager = new FixRechargeOrderManager(this.activity, getPayManager());
        showLoadingDialog$default(this, null, 0L, 3, null);
        FixRechargeOrderManager fixRechargeOrderManager = this.fixRechargeOrderManager;
        if (fixRechargeOrderManager != null) {
            fixRechargeOrderManager.setListener(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.checkOrderState.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    GooglePayQuickUI.this.dismissLoadingDialog();
                }
            });
        }
        FixRechargeOrderManager fixRechargeOrderManager2 = this.fixRechargeOrderManager;
        if (fixRechargeOrderManager2 != null) {
            FixRechargeOrderManager.start$default(fixRechargeOrderManager2, PaySupportChannels.pay_type_googlePay.getNum(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmRechargeOrder(final PayOrder model) {
        this.recharging = true;
        getVmGoogle().confirmRechargeOrder(model).observe(this.activity, new OooOo(new Function1<RechargeMenuConfirmOrderResultModel, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.confirmRechargeOrder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
                invoke2(rechargeMenuConfirmOrderResultModel);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
                Long balance;
                if (rechargeMenuConfirmOrderResultModel != null && (balance = rechargeMenuConfirmOrderResultModel.getBalance()) != null) {
                    OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(balance.longValue()));
                }
                GooglePayQuickUI.this.getVmGoogle().deleteOrderToDB(model.getOrderId());
                ToastUtil.f12567OooO00o.OooO0O0(GooglePayQuickUI.this.getActivity().getString(R.string.purchase_succ));
                GooglePayQuickUI.this.getVmLog().onConfirmOrderSuccessUploadLog(model.getAmount(), model.getSku(), GooglePayQuickUI.this.getAdapter().getData());
                o0O00000.OooO0OO("InRoom_recharge");
                Function0<Unit> listener = GooglePayQuickUI.this.getListener();
                if (listener != null) {
                    listener.invoke();
                }
            }
        }, new Function1<ApiError, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.confirmRechargeOrder.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiError apiError) {
                invoke2(apiError);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ApiError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                model.setErrorCode(it.getCode());
                this.getVmLog().onConfirmOrderErrorUploadLog(model);
                this.errorCount++;
                this.showRechargeErrorDialog(model);
                int code2 = it.getCode();
                if (code2 == 2000 || code2 == 2005) {
                    this.getVmGoogle().deleteOrderToDB(model.getOrderId());
                }
            }
        }, new Function1<ApiResult<RechargeMenuConfirmOrderResultModel>, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.confirmRechargeOrder.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResult<RechargeMenuConfirmOrderResultModel> apiResult) {
                invoke2(apiResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ApiResult<RechargeMenuConfirmOrderResultModel> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                GooglePayQuickUI.this.recharging = false;
                GooglePayQuickUI.this.dismissLoadingDialog();
            }
        }, false, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createOrder(final RechargeMenuCreateOrderModel model) {
        if (!PackManager.INSTANCE.isHaveGooglePlay(this.activity)) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.google_play_useless));
        } else {
            if (this.recharging) {
                return;
            }
            this.recharging = true;
            showLoadingDialog$default(this, null, 0L, 3, null);
            getVmGoogle().createOrder(model).observe(this.activity, new OooOo(new Function1<RechargeMenuCreateOrderResultModel, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.createOrder.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel) {
                    invoke2(rechargeMenuCreateOrderResultModel);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel) {
                    if (rechargeMenuCreateOrderResultModel == null || StringsKt.isBlank(rechargeMenuCreateOrderResultModel.getOrderid())) {
                        GooglePayQuickUI.this.recharging = false;
                        return;
                    }
                    RechargeMenuToPayModel rechargeMenuToPayModel = new RechargeMenuToPayModel();
                    rechargeMenuToPayModel.setSku(model.getSku());
                    rechargeMenuToPayModel.setType(model.getType());
                    rechargeMenuToPayModel.setSkuDetails(model.getSkuDetails());
                    rechargeMenuToPayModel.setUnit(model.getUnit());
                    rechargeMenuToPayModel.setPmId(model.getPmId());
                    rechargeMenuToPayModel.setOrderid(rechargeMenuCreateOrderResultModel.getOrderid());
                    rechargeMenuToPayModel.setCoin(model.getCoin());
                    rechargeMenuToPayModel.setAmount(model.getAmount());
                    GooglePayQuickUI.this.toPay(rechargeMenuToPayModel);
                }
            }, new Function1<ApiError, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.createOrder.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ApiError apiError) {
                    invoke2(apiError);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ApiError error) {
                    Intrinsics.checkNotNullParameter(error, "it");
                    GooglePayQuickUI.this.recharging = false;
                    if (error.getCode() == 3003) {
                        GooglePayQuickUI.this.goodsUnderMaintenanceDialog(model);
                    } else {
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                    }
                }
            }, new Function1<ApiResult<RechargeMenuCreateOrderResultModel>, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.createOrder.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ApiResult<RechargeMenuCreateOrderResultModel> apiResult) {
                    invoke2(apiResult);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ApiResult<RechargeMenuCreateOrderResultModel> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    GooglePayQuickUI.this.dismissLoadingDialog();
                }
            }, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteDataBan(List<RechargeMenuType> list) {
        for (RechargeMenuBanType rechargeMenuBanType : this.rechargeBanList) {
            Iterator<RechargeMenuType> it = list.iterator();
            if (it != null) {
                while (it.hasNext()) {
                    SkuDetails skuDetails = it.next().getSkuDetails();
                    if (skuDetails != null && Intrinsics.areEqual(rechargeMenuBanType.getCurrency(), skuDetails.OooO00o()) && Intrinsics.areEqual(rechargeMenuBanType.getSku(), skuDetails.OooO0O0())) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissLoadingDialog() {
        getLoadingDialog().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayQuickAdapter getAdapter() {
        return (GooglePayQuickAdapter) this.adapter.getValue();
    }

    private final o0000O getLoadingDialog() {
        return (o0000O) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayManager getPayManager() {
        return (PayManager) this.payManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayQuickVM getVmGoogle() {
        return (GooglePayQuickVM) this.vmGoogle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletCoinVM getVmLog() {
        return (WalletCoinVM) this.vmLog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goodsUnderMaintenanceDialog(RechargeMenuCreateOrderModel model) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        if (activityOooO0O0 != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
            oo0ooo0.OooOo0(R.string.Recharge_Page_CopyUnder_maintenance_Dialog);
            oo0ooo0.OooOOOo(R.string.OK);
            oo0ooo0.OooOo0o(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$goodsUnderMaintenanceDialog$1$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.reLoadData();
                }
            });
            oo0ooo0.OooOOO0();
        }
    }

    private final void iniView() {
        getAdapter().setListener(new Function1<RechargeMenuCreateOrderModel, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.iniView.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
                invoke2(rechargeMenuCreateOrderModel);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull RechargeMenuCreateOrderModel it) {
                Intrinsics.checkNotNullParameter(it, "it");
                p606o0oo0O.OooOo.OooO0O0("102023");
                GooglePayQuickUI.this.createOrder(it);
            }
        });
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new FixLinearLayoutManager(this.activity));
        }
        StateLayout stateLayout = this.stateLayout;
        if (stateLayout != null) {
            StateLayout.OooOO0(stateLayout, 0, new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.iniView.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    GooglePayQuickUI.this.reLoadData();
                }
            }, 3);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(getAdapter());
        }
        StateLayout stateLayout2 = this.stateLayout;
        if (stateLayout2 != null) {
            stateLayout2.OooO0oo();
        }
    }

    private final void loadShopList() {
        getVmGoogle().loadRechargeMenu().observe(this.activity, new OooOo(new Function1<RechargeMenuModel, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.loadShopList.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RechargeMenuModel rechargeMenuModel) {
                invoke2(rechargeMenuModel);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable RechargeMenuModel rechargeMenuModel) {
                if (rechargeMenuModel != null && !rechargeMenuModel.getData().isEmpty()) {
                    GooglePayQuickUI.this.rechargeBanList.clear();
                    GooglePayQuickUI.this.rechargeBanList.addAll(rechargeMenuModel.getDataBan());
                    GooglePayQuickUI.this.toQuerySkuDetails(rechargeMenuModel.getData());
                } else {
                    StateLayout stateLayout = GooglePayQuickUI.this.stateLayout;
                    if (stateLayout != null) {
                        stateLayout.OooO0o0();
                    }
                }
            }
        }, new Function1<ApiError, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI.loadShopList.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiError apiError) {
                invoke2(apiError);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ApiError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                StateLayout stateLayout = GooglePayQuickUI.this.stateLayout;
                if (stateLayout != null) {
                    stateLayout.OooO0o();
                }
            }
        }, null, false, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reLoadData() {
        StateLayout stateLayout = this.stateLayout;
        if (stateLayout != null) {
            stateLayout.OooO0oo();
        }
        loadShopList();
    }

    private final void showLoadingDialog(String message, long minTime) {
        getLoadingDialog().OooO0o(message, minTime);
    }

    public static /* synthetic */ void showLoadingDialog$default(GooglePayQuickUI googlePayQuickUI, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePayQuickUI.activity.getString(R.string.loading);
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        googlePayQuickUI.showLoadingDialog(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPageInfo(List<RechargeMenuType> list) {
        if (list.isEmpty()) {
            StateLayout stateLayout = this.stateLayout;
            if (stateLayout != null) {
                stateLayout.setEmptyText(o000O0O0.OooO0OO(R.string.Recharge_Page_CopyUnder_maintenance));
            }
            StateLayout stateLayout2 = this.stateLayout;
            if (stateLayout2 != null) {
                stateLayout2.OooO0o0();
                return;
            }
            return;
        }
        StateLayout stateLayout3 = this.stateLayout;
        if (stateLayout3 != null) {
            stateLayout3.setEmptyText(o000O0O0.OooO0OO(R.string.no_data));
        }
        calculatedMaxWidthForItemView(list);
        getAdapter().setNewData(list);
        StateLayout stateLayout4 = this.stateLayout;
        if (stateLayout4 != null) {
            stateLayout4.OooO0Oo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRechargeErrorDialog(final PayOrder model) {
        this.recharging = false;
        final oo0oOO0 oo0ooo0 = new oo0oOO0(this.activity);
        if (this.errorCount >= 3) {
            String string = this.activity.getString(R.string.Validation_Failed);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.string.Validation_Failed)");
            oo0ooo0.OooOooO(string);
            String string2 = this.activity.getString(R.string.Validation_Failed_content);
            Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.str…alidation_Failed_content)");
            oo0ooo0.OooOo0O(string2);
            String string3 = this.activity.getString(R.string.Validation_Failed_Contact_Us);
            Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(R.str…dation_Failed_Contact_Us)");
            oo0ooo0.OooOoO0(string3);
            oo0ooo0.OooOo(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$showRechargeErrorDialog$1$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    YallaTeamMessageActivity.f22251OoooooO.OooO00o(oo0ooo0.f34199OooO00o);
                }
            });
            String string4 = this.activity.getString(R.string.Validate_Again);
            Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(R.string.Validate_Again)");
            oo0ooo0.OooOOo0(string4);
            oo0ooo0.OooOo0o(new Function0<Object>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$showRechargeErrorDialog$1$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final Object invoke() {
                    GooglePayQuickUI googlePayQuickUI = this.this$0;
                    GooglePayQuickUI.showLoadingDialog$default(googlePayQuickUI, googlePayQuickUI.getActivity().getString(R.string.Validating_your_purchase), 0L, 2, null);
                    if (model.getIsConsume()) {
                        this.this$0.confirmRechargeOrder(model);
                        return null;
                    }
                    this.this$0.toConsumeOrder(model);
                    return null;
                }
            });
        } else {
            String string5 = this.activity.getString(R.string.Purchase_Validation_Failed);
            Intrinsics.checkNotNullExpressionValue(string5, "activity.getString(R.str…rchase_Validation_Failed)");
            oo0ooo0.OooOooO(string5);
            String string6 = this.activity.getString(R.string.Purchase_Validation_Failed_content);
            Intrinsics.checkNotNullExpressionValue(string6, "activity.getString(R.str…alidation_Failed_content)");
            oo0ooo0.OooOo0O(string6);
            String string7 = this.activity.getString(R.string.Validate_Again);
            Intrinsics.checkNotNullExpressionValue(string7, "activity.getString(R.string.Validate_Again)");
            oo0ooo0.OooOOo0(string7);
            oo0ooo0.OooOo0o(new Function0<Object>() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI$showRechargeErrorDialog$1$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final Object invoke() {
                    GooglePayQuickUI googlePayQuickUI = this.this$0;
                    GooglePayQuickUI.showLoadingDialog$default(googlePayQuickUI, googlePayQuickUI.getActivity().getString(R.string.Validating_your_purchase), 0L, 2, null);
                    if (model.getIsConsume()) {
                        this.this$0.confirmRechargeOrder(model);
                        return null;
                    }
                    this.this$0.toConsumeOrder(model);
                    return null;
                }
            });
        }
        oo0ooo0.OooOOO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean toConsumeOrder(PayOrder payOrder) {
        if (StringsKt.isBlank(payOrder.getPurchaseToken())) {
            this.recharging = false;
            return null;
        }
        this.recharging = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new C04891(payOrder, null), 2, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toPay(RechargeMenuToPayModel model) {
        if (StringsKt.isBlank(model.getOrderid())) {
            this.recharging = false;
        } else {
            this.recharging = true;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new C04901(model, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toQuerySkuDetails(List<RechargeMenuType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RechargeMenuType) it.next()).getSku());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new C04912(arrayList, this, list, null), 2, null);
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Function0<Unit> getListener() {
        return this.listener;
    }

    public final void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == 0) {
            ToastUtil.f12567OooO00o.OooO0O0(this.activity.getString(R.string.purchase_cancel));
        }
    }

    public final void setListener(@Nullable Function0<Unit> function0) {
        this.listener = function0;
    }

    public final void setView(@Nullable StateLayout stateLayout, @Nullable RecyclerView recyclerView, @Nullable TextView tvHolder) {
        this.stateLayout = stateLayout;
        this.recyclerView = recyclerView;
        this.tvHolder = tvHolder;
        iniView();
        loadShopList();
        checkOrderState();
    }
}
