package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.data.repository.VipRepo$getGetShopTop$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$getPersonalVip$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$getShopPage$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$getShopRecord$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$getVipPrivilege$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$shopExchange$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$updateVipDialogState$$inlined$call$1;
import com.yalla.yalla.model.ItemVipModel;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.vip.VipShopExchangeModel;
import com.yalla.yalla.model.vip.VipShopRecordModel;
import com.yalla.yalla.model.vip.VipWelfareModel;
import io.agora.rtc.Constants;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p383o0OOoOo0.Oooo000;
import p416o0Oo0oO.oO00OOO;
import p416o0Oo0oO.oOo00OO0;
import p417o0Oo0oO0.o00Oo0;
import p426o0OoO0Oo.o00OO00O;
import p426o0OoO0Oo.oo0oOO0;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bk\u0010lJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0004J\u001e\u0010\u0010\u001a\u00020\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rJ\u0006\u0010\u0011\u001a\u00020\u0002J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R+\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010*\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010.\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R(\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u00108\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001f\u001a\u0004\b@\u00102\"\u0004\bA\u00104R(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001f\u001a\u0004\bC\u00102\"\u0004\bD\u00104R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0006¢\u0006\f\n\u0004\bE\u0010\u001f\u001a\u0004\bF\u00102R+\u0010M\u001a\u00020G2\u0006\u0010\u001d\u001a\u00020G8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u001f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0006¢\u0006\f\n\u0004\bN\u0010\u001f\u001a\u0004\bO\u00102R\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0006¢\u0006\f\n\u0004\bP\u0010\u001f\u001a\u0004\bQ\u00102R+\u0010W\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010\u001f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR0\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R#\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0^0X8\u0006¢\u0006\f\n\u0004\b_\u0010[\u001a\u0004\b`\u0010]R0\u0010b\u001a\b\u0012\u0004\u0012\u00020a0^2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020a0^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020G0\n8\u0006¢\u0006\f\n\u0004\bh\u0010g\u001a\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/VipVm;", "Lo0Oo0/OooOO0;", "", "loadKaVipModel", "", "level", "", "isVipNormal", "loadPersonData", "type", "Lo00o00oO/o000;", "Lcom/yalla/yalla/model/vip/VipShopRecordModel;", "getShopRecordPagingSource", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/ItemVipModel;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "forEachItemKaVipModel", "updateVipDialogState", "shopId", "Lo0OoO0Oo/o00OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/vip/VipShopExchangeModel;", "shopExchange", "hideRedPoint", "refreshShopList", "Lcom/yalla/yalla/model/VipLevel;", "vipLevel", "supportVip", "Lcom/code/android/uikit/contentstate/ContentState;", "<set-?>", "contentState$delegate", "Landroidx/compose/runtime/MutableState;", "getContentState", "()Lcom/code/android/uikit/contentstate/ContentState;", "setContentState", "(Lcom/code/android/uikit/contentstate/ContentState;)V", "contentState", "openSettingSwitch$delegate", "getOpenSettingSwitch", "()Z", "setOpenSettingSwitch", "(Z)V", "openSettingSwitch", "openDialog$delegate", "getOpenDialog", "setOpenDialog", "openDialog", "Landroidx/compose/runtime/MutableState;", "openWhatAppDialog", "getOpenWhatAppDialog", "()Landroidx/compose/runtime/MutableState;", "setOpenWhatAppDialog", "(Landroidx/compose/runtime/MutableState;)V", "showPremiumFirst$delegate", "getShowPremiumFirst", "setShowPremiumFirst", "showPremiumFirst", "kaVipChangeListener", "Lkotlin/jvm/functions/Function1;", "getKaVipChangeListener", "()Lkotlin/jvm/functions/Function1;", "setKaVipChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "addVip6Dialog", "getAddVip6Dialog", "setAddVip6Dialog", "supportVip6", "getSupportVip6", "setSupportVip6", "showProfilePreViewDialog", "getShowProfilePreViewDialog", "Lcom/yalla/yalla/model/vip/VipWelfareModel;", "currentUserWelfareModel$delegate", "getCurrentUserWelfareModel", "()Lcom/yalla/yalla/model/vip/VipWelfareModel;", "setCurrentUserWelfareModel", "(Lcom/yalla/yalla/model/vip/VipWelfareModel;)V", "currentUserWelfareModel", "showBuyDialog", "getShowBuyDialog", "showBuyResultDialog", "getShowBuyResultDialog", "currentErrorCode$delegate", "getCurrentErrorCode", "()I", "setCurrentErrorCode", "(I)V", "currentErrorCode", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yalla/yalla/model/PersonalVipModel;", "personalKaVipModel", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getPersonalKaVipModel", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "", "topShopItemList", "getTopShopItemList", "Lcom/yalla/yalla/model/VipModel;", "kaVipModels", "Ljava/util/List;", "getKaVipModels", "()Ljava/util/List;", "shopRecordPagingSource", "Lo00o00oO/o000;", "myWelfareData", "getMyWelfareData", "()Lo00o00oO/o000;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVipVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n81#2:229\n107#2,2:230\n81#2:232\n107#2,2:233\n81#2:235\n107#2,2:236\n81#2:238\n107#2,2:239\n81#2:241\n107#2,2:242\n81#2:244\n107#2,2:245\n1855#3,2:247\n1855#3:249\n1855#3,2:250\n1856#3:252\n*S KotlinDebug\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm\n*L\n29#1:229\n29#1:230,2\n30#1:232\n30#1:233,2\n31#1:235\n31#1:236,2\n34#1:238\n34#1:239,2\n45#1:241\n45#1:242,2\n53#1:244\n53#1:245,2\n164#1:247,2\n174#1:249\n175#1:250,2\n174#1:252\n*E\n"})
public final class VipVm extends p396o0Oo0.OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private MutableState<Boolean> addVip6Dialog;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    /* JADX INFO: renamed from: currentErrorCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentErrorCode;

    /* JADX INFO: renamed from: currentUserWelfareModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentUserWelfareModel;

    @Nullable
    private Function1<? super Integer, Unit> kaVipChangeListener;

    @NotNull
    private List<VipModel> kaVipModels;

    @NotNull
    private final o000<VipWelfareModel> myWelfareData;

    /* JADX INFO: renamed from: openDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState openDialog;

    /* JADX INFO: renamed from: openSettingSwitch$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState openSettingSwitch;

    @NotNull
    private MutableState<Boolean> openWhatAppDialog;

    @NotNull
    private MutableStateFlow<PersonalVipModel> personalKaVipModel;

    @Nullable
    private o000<VipShopRecordModel> shopRecordPagingSource;

    @NotNull
    private final MutableState<Boolean> showBuyDialog;

    @NotNull
    private final MutableState<Boolean> showBuyResultDialog;

    /* JADX INFO: renamed from: showPremiumFirst$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showPremiumFirst;

    @NotNull
    private final MutableState<Boolean> showProfilePreViewDialog;

    @NotNull
    private MutableState<Boolean> supportVip6;

    @NotNull
    private final MutableStateFlow<List<VipWelfareModel>> topShopItemList;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$refreshShopList$1", f = "VipVm.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nVipVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm$refreshShopList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1855#2,2:229\n*S KotlinDebug\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm$refreshShopList$1\n*L\n219#1:229,2\n*E\n"})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32038OooO0Oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VipVm.this.new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<VipWelfareModel> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32038OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f32038OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/KaPoint/GetShopTop");
                obj = OooOOO.OooO0Oo(new VipRepo$getGetShopTop$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
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
            if (apiResult.isSuccess() && (list = (List) apiResult.getData()) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((VipWelfareModel) it.next()).parsePreConfig();
                }
                VipVm.this.getTopShopItemList().setValue(list);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$getShopRecordPagingSource$1", f = "VipVm.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<VipShopRecordModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32040OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f32041OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32042OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32041OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f32041OooO0o, continuation);
            oooO00o.f32042OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<VipShopRecordModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32040OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f32042OooO0o0;
                this.f32040OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/KaPoint/GetRecord");
                o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                o0oooooOooO00o.OooO0O0("20", "pagesize");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f32041OooO0o), "type");
                obj = OooOOO.OooO0Oo(new VipRepo$getShopRecord$$inlined$call$1(o0oooooOooO00o, null), this);
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$loadKaVipModel$1", f = "VipVm.kt", i = {0, 0, 1, 1, 2, 2}, l = {72, 73, 74, 75}, m = "invokeSuspend", n = {"getKaVipPrivilege", "getGetShopTop", "getGetShopTop", "result1", "result1", "result2"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f32043OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f32044OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32045OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$loadKaVipModel$1$1", f = "VipVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nVipVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm$loadKaVipModel$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1855#2,2:229\n*S KotlinDebug\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm$loadKaVipModel$1$1\n*L\n93#1:229,2\n*E\n"})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ApiResult<PersonalVipModel> f32047OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ ApiResult<List<VipWelfareModel>> f32048OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ApiResult<List<VipModel>> f32049OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ VipVm f32050OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ApiResult<PersonalVipModel> apiResult, ApiResult<List<VipModel>> apiResult2, ApiResult<List<VipWelfareModel>> apiResult3, VipVm vipVm, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32047OooO0Oo = apiResult;
                this.f32049OooO0o0 = apiResult2;
                this.f32048OooO0o = apiResult3;
                this.f32050OooO0oO = vipVm;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f32047OooO0Oo, this.f32049OooO0o0, this.f32048OooO0o, this.f32050OooO0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:45:0x017f  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                List<VipWelfareModel> data;
                Function1<Integer, Unit> kaVipChangeListener;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult<PersonalVipModel> apiResult = this.f32047OooO0Oo;
                boolean zIsSuccess = apiResult.isSuccess();
                VipVm vipVm = this.f32050OooO0oO;
                if (zIsSuccess) {
                    ApiResult<List<VipModel>> apiResult2 = this.f32049OooO0o0;
                    if (apiResult2.isSuccess()) {
                        PersonalVipModel data2 = apiResult.getData();
                        if (data2 != null) {
                            vipVm.getPersonalKaVipModel().setValue(data2);
                            if (!StringsKt.isBlank(data2.getKaServeAddr())) {
                                oO00OOO oo00oooOooOO0o = o00Oo0.OooOO0o();
                                String value = data2.getKaServeAddr();
                                oo00oooOooOO0o.getClass();
                                Intrinsics.checkNotNullParameter(value, "value");
                                oo00oooOooOO0o.OooO("kaServeAddress", value);
                            }
                            int iLevel = VipLevel.Vip1.level();
                            int iLevel2 = VipLevel.Vip6.level();
                            VipLevel.Companion companion = VipLevel.INSTANCE;
                            int iLevel3 = companion.of(data2.getKaVIPLv()).level();
                            if ((iLevel <= iLevel3 && iLevel3 <= iLevel2) && (kaVipChangeListener = vipVm.getKaVipChangeListener()) != null) {
                                kaVipChangeListener.invoke(Boxing.boxInt(companion.of(data2.getKaVIPLv()).level() - 1));
                            }
                        }
                        ApiResult<List<VipWelfareModel>> apiResult3 = this.f32048OooO0o;
                        if (apiResult3.isSuccess() && (data = apiResult3.getData()) != null) {
                            Iterator<T> it = data.iterator();
                            while (it.hasNext()) {
                                ((VipWelfareModel) it.next()).parsePreConfig();
                            }
                            vipVm.getTopShopItemList().setValue(data);
                        }
                        List<VipModel> data3 = apiResult2.getData();
                        if (data3 != null) {
                            vipVm.getKaVipModels().clear();
                            vipVm.getKaVipModels().addAll(data3);
                            if (vipVm.getKaVipModels().isEmpty()) {
                                vipVm.setContentState(ContentState.Error);
                            } else {
                                vipVm.setContentState(ContentState.Content);
                                vipVm.setOpenDialog(vipVm.getPersonalKaVipModel().getValue().getDoPopUp());
                                MutableState<Boolean> supportVip6 = vipVm.getSupportVip6();
                                VipLevel vipLevel = VipLevel.Vip6;
                                supportVip6.setValue(Boxing.boxBoolean(vipVm.supportVip(vipLevel)));
                                if (!vipVm.getOpenDialog() && vipVm.getPersonalKaVipModel().getValue().getKaVIPLv() != vipLevel.getValue() && vipVm.getSupportVip6().getValue().booleanValue()) {
                                    MutableState<Boolean> addVip6Dialog = vipVm.getAddVip6Dialog();
                                    oOo00OO0 ooo00oo0OooOO0O = o00Oo0.OooOO0O();
                                    int iLevel4 = vipLevel.level();
                                    ooo00oo0OooOO0O.getClass();
                                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                                    addVip6Dialog.setValue(Boxing.boxBoolean(ooo00oo0OooOO0O.OooO0O0("addVipLevelDialog-" + iLevel4 + "-" + oo0oO0.OooOOo0().getValue(), true)));
                                }
                                vipVm.setOpenSettingSwitch(vipVm.getPersonalKaVipModel().getValue().getKaVIPState() == VipState.Vip.getValue());
                            }
                        }
                    } else {
                        ApiError error = apiResult.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
                        vipVm.setContentState(ContentState.Error);
                    }
                } else {
                    ApiError error2 = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error2, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error2, null), 3, null);
                    vipVm.setContentState(ContentState.Error);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.room.VipVm$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$loadKaVipModel$1$getGetShopTop$1", f = "VipVm.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0372OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<List<VipWelfareModel>>>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f32051OooO0Oo;

            public C0372OooO0O0(Continuation<? super C0372OooO0O0> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0372OooO0O0(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<List<VipWelfareModel>>> continuation) {
                return new C0372OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f32051OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f32051OooO0Oo = 1;
                    String strOooO0OO = oo000o.OooO0OO("/Webservers/KaPoint/GetShopTop");
                    obj = OooOOO.OooO0Oo(new VipRepo$getGetShopTop$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
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

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$loadKaVipModel$1$getKaVipPrivilege$1", f = "VipVm.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<List<VipModel>>>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f32052OooO0Oo;

            public OooO0OO(Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0OO(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<List<VipModel>>> continuation) {
                return new OooO0OO(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f32052OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f32052OooO0Oo = 1;
                    String strOooO0OO = oo000o.OooO0OO("/Webservers/User/KAVIPPrivilege");
                    obj = OooOOO.OooO0Oo(new VipRepo$getVipPrivilege$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
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

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$loadKaVipModel$1$getPersonalKaVip$1", f = "VipVm.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<PersonalVipModel>>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f32053OooO0Oo;

            public OooO0o(Continuation<? super OooO0o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<PersonalVipModel>> continuation) {
                return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f32053OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f32053OooO0Oo = 1;
                    String strOooO0OO = oo000o.OooO0OO("/Webservers/User/UserKAVIPInfo");
                    obj = OooOOO.OooO0Oo(new VipRepo$getPersonalVip$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = VipVm.this.new OooO0O0(continuation);
            oooO0O0.f32044OooO0o = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Deferred deferredAsync$default;
            Deferred deferredAsync$default2;
            Object objAwait;
            Object objAwait2;
            Deferred deferred;
            ApiResult apiResult;
            ApiResult apiResult2;
            Object objAwait3;
            ApiResult apiResult3;
            ApiResult apiResult4;
            OooO00o oooO00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32045OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    deferredAsync$default2 = (Deferred) this.f32043OooO0Oo;
                    Deferred deferred2 = (Deferred) this.f32044OooO0o;
                    ResultKt.throwOnFailure(obj);
                    deferredAsync$default = deferred2;
                    objAwait = obj;
                } else if (i == 2) {
                    apiResult = (ApiResult) this.f32043OooO0Oo;
                    Deferred deferred3 = (Deferred) this.f32044OooO0o;
                    ResultKt.throwOnFailure(obj);
                    deferred = deferred3;
                    objAwait2 = obj;
                    apiResult2 = (ApiResult) objAwait2;
                    this.f32044OooO0o = apiResult;
                    this.f32043OooO0Oo = apiResult2;
                    this.f32045OooO0o0 = 3;
                    objAwait3 = deferred.await(this);
                    if (objAwait3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult3 = apiResult;
                    apiResult4 = apiResult2;
                    oooO00o = new OooO00o(apiResult3, apiResult4, (ApiResult) objAwait3, VipVm.this, null);
                    this.f32044OooO0o = null;
                    this.f32043OooO0Oo = null;
                    this.f32045OooO0o0 = 4;
                    if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ApiResult apiResult5 = (ApiResult) this.f32043OooO0Oo;
                    ApiResult apiResult6 = (ApiResult) this.f32044OooO0o;
                    ResultKt.throwOnFailure(obj);
                    apiResult4 = apiResult5;
                    apiResult3 = apiResult6;
                    objAwait3 = obj;
                    oooO00o = new OooO00o(apiResult3, apiResult4, (ApiResult) objAwait3, VipVm.this, null);
                    this.f32044OooO0o = null;
                    this.f32043OooO0Oo = null;
                    this.f32045OooO0o0 = 4;
                    if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f32044OooO0o;
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0o(null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0OO(null), 3, null);
            deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C0372OooO0O0(null), 3, null);
            this.f32044OooO0o = deferredAsync$default;
            this.f32043OooO0Oo = deferredAsync$default2;
            this.f32045OooO0o0 = 1;
            objAwait = deferredAsync$default3.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult7 = (ApiResult) objAwait;
            this.f32044OooO0o = deferredAsync$default2;
            this.f32043OooO0Oo = apiResult7;
            this.f32045OooO0o0 = 2;
            objAwait2 = deferredAsync$default.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredAsync$default2;
            apiResult = apiResult7;
            apiResult2 = (ApiResult) objAwait2;
            this.f32044OooO0o = apiResult;
            this.f32043OooO0Oo = apiResult2;
            this.f32045OooO0o0 = 3;
            objAwait3 = deferred.await(this);
            if (objAwait3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult3 = apiResult;
            apiResult4 = apiResult2;
            oooO00o = new OooO00o(apiResult3, apiResult4, (ApiResult) objAwait3, VipVm.this, null);
            this.f32044OooO0o = null;
            this.f32043OooO0Oo = null;
            this.f32045OooO0o0 = 4;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$loadPersonData$1", f = "VipVm.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32054OooO0Oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VipVm.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PersonalVipModel personalVipModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32054OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f32054OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/User/UserKAVIPInfo");
                obj = OooOOO.OooO0Oo(new VipRepo$getPersonalVip$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
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
            if (apiResult.isSuccess() && (personalVipModel = (PersonalVipModel) apiResult.getData()) != null) {
                VipVm.this.getPersonalKaVipModel().setValue(personalVipModel);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$myWelfareData$1", f = "VipVm.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nVipVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm$myWelfareData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1855#2,2:229\n*S KotlinDebug\n*F\n+ 1 VipVm.kt\ncom/yalla/yalla/ui/vm/room/VipVm$myWelfareData$1\n*L\n188#1:229,2\n*E\n"})
    public static final class OooO0o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<VipWelfareModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32056OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32057OooO0o0;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(continuation);
            oooO0o.f32057OooO0o0 = ((Number) obj).intValue();
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<VipWelfareModel>> continuation) {
            return ((OooO0o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32056OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f32057OooO0o0;
                this.f32056OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/KaPoint/GetShopPage");
                o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                o0oooooOooO00o.OooO0O0("20", "pagesize");
                obj = OooOOO.OooO0Oo(new VipRepo$getShopPage$$inlined$call$1(o0oooooOooO00o, null), this);
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
            List list = (List) apiResult.getData();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((VipWelfareModel) it.next()).parsePreConfig();
                }
            }
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$shopExchange$1", f = "VipVm.kt", i = {0}, l = {197}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooOO0 extends SuspendLambda implements Function2<o00OO00O<ApiResult<VipShopExchangeModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32058OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f32059OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32060OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VipVm f32061OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, VipVm vipVm, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f32059OooO0o = i;
            this.f32061OooO0oO = vipVm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f32059OooO0o, this.f32061OooO0oO, continuation);
            oooOO1.f32060OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO00O<ApiResult<VipShopExchangeModel>> o00oo00o, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(o00oo00o, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO00O o00oo00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32058OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO00O o00oo00o2 = (o00OO00O) this.f32060OooO0o0;
                this.f32060OooO0o0 = o00oo00o2;
                this.f32058OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("Webservers/KaPoint/ShopExchange");
                o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 1);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f32059OooO0o), "shopId");
                Object objOooO0Oo = OooOOO.OooO0Oo(new VipRepo$shopExchange$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo00o = o00oo00o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo00o = (o00OO00O) this.f32060OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f32061OooO0oO.getMyWelfareData().OooO0O0();
            }
            o00oo00o.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVm$updateVipDialogState$1", f = "VipVm.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32062OooO0Oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOO0O(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32062OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f32062OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/User/SetUserKAVIPLvPopUpFlag");
                if (OooOOO.OooO0Oo(new VipRepo$updateVipDialogState$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0OO, "url", strOooO0OO, 1), null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public VipVm() {
        Boolean bool = Boolean.FALSE;
        this.openSettingSwitch = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.openDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.openWhatAppDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showPremiumFirst = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.addVip6Dialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.supportVip6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showProfilePreViewDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.currentUserWelfareModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new VipWelfareModel(), null, 2, null);
        this.showBuyDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showBuyResultDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.currentErrorCode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.personalKaVipModel = StateFlowKt.MutableStateFlow(new PersonalVipModel());
        this.topShopItemList = StateFlowKt.MutableStateFlow(new ArrayList());
        this.kaVipModels = new ArrayList();
        this.myWelfareData = new o000<>(ViewModelKt.getViewModelScope(this), new OooO0o(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void forEachItemKaVipModel$default(VipVm vipVm, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        vipVm.forEachItemKaVipModel(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean supportVip(VipLevel vipLevel) {
        Iterator<T> it = this.kaVipModels.iterator();
        while (it.hasNext()) {
            if (((VipModel) it.next()).getKaVipLv() == vipLevel.getValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEachItemKaVipModel(@Nullable Function1<? super ItemVipModel, Unit> listener) {
        Iterator<T> it = this.kaVipModels.iterator();
        while (it.hasNext()) {
            List<ItemVipModel> privilegeData = ((VipModel) it.next()).getPrivilegeData();
            if (privilegeData != null) {
                for (ItemVipModel itemVipModel : privilegeData) {
                    if (listener != null) {
                        listener.invoke(itemVipModel);
                    }
                }
            }
        }
    }

    @NotNull
    public final MutableState<Boolean> getAddVip6Dialog() {
        return this.addVip6Dialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getContentState() {
        return (ContentState) this.contentState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentErrorCode() {
        return ((Number) this.currentErrorCode.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final VipWelfareModel getCurrentUserWelfareModel() {
        return (VipWelfareModel) this.currentUserWelfareModel.getValue();
    }

    @Nullable
    public final Function1<Integer, Unit> getKaVipChangeListener() {
        return this.kaVipChangeListener;
    }

    @NotNull
    public final List<VipModel> getKaVipModels() {
        return this.kaVipModels;
    }

    @NotNull
    public final o000<VipWelfareModel> getMyWelfareData() {
        return this.myWelfareData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getOpenDialog() {
        return ((Boolean) this.openDialog.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getOpenSettingSwitch() {
        return ((Boolean) this.openSettingSwitch.getValue()).booleanValue();
    }

    @NotNull
    public final MutableState<Boolean> getOpenWhatAppDialog() {
        return this.openWhatAppDialog;
    }

    @NotNull
    public final MutableStateFlow<PersonalVipModel> getPersonalKaVipModel() {
        return this.personalKaVipModel;
    }

    @NotNull
    public final o000<VipShopRecordModel> getShopRecordPagingSource(int type) {
        o000<VipShopRecordModel> o000Var = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(type, null));
        this.shopRecordPagingSource = o000Var;
        Intrinsics.checkNotNull(o000Var);
        return o000Var;
    }

    @NotNull
    public final MutableState<Boolean> getShowBuyDialog() {
        return this.showBuyDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowBuyResultDialog() {
        return this.showBuyResultDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowPremiumFirst() {
        return ((Boolean) this.showPremiumFirst.getValue()).booleanValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowProfilePreViewDialog() {
        return this.showProfilePreViewDialog;
    }

    @NotNull
    public final MutableState<Boolean> getSupportVip6() {
        return this.supportVip6;
    }

    @NotNull
    public final MutableStateFlow<List<VipWelfareModel>> getTopShopItemList() {
        return this.topShopItemList;
    }

    public final void hideRedPoint() {
        oOo00OO0 ooo00oo0OooOO0O = o00Oo0.OooOO0O();
        ooo00oo0OooOO0O.getClass();
        ooo00oo0OooOO0O.OooO0o("vipRedDot_CustomRoomTheme_Hide4Fragment" + oo0oO0.OooOOo0().getValue(), true);
        oOo00OO0 ooo00oo0OooOO0O2 = o00Oo0.OooOO0O();
        ooo00oo0OooOO0O2.getClass();
        ooo00oo0OooOO0O2.OooO0o("vipRedDot_ExclusiveBubble_Hide4Fragment" + oo0oO0.OooOOo0().getValue(), true);
        oOo00OO0 ooo00oo0OooOO0O3 = o00Oo0.OooOO0O();
        ooo00oo0OooOO0O3.getClass();
        ooo00oo0OooOO0O3.OooO0o("vipRedDot_IncognitoAccess_Hide4Fragment" + oo0oO0.OooOOo0().getValue(), true);
        oOo00OO0 ooo00oo0OooOO0O4 = o00Oo0.OooOO0O();
        ooo00oo0OooOO0O4.getClass();
        ooo00oo0OooOO0O4.OooO0o("vipRedDot_ExclusiveBackpackGift_Hide4Fragment" + oo0oO0.OooOOo0().getValue(), true);
        oOo00OO0 ooo00oo0OooOO0O5 = o00Oo0.OooOO0O();
        ooo00oo0OooOO0O5.getClass();
        ooo00oo0OooOO0O5.OooO0o("vipRedDot_ExclusiveGiftRunway_Hide4Fragment" + oo0oO0.OooOOo0().getValue(), true);
        oOo00OO0 ooo00oo0OooOO0O6 = o00Oo0.OooOO0O();
        ooo00oo0OooOO0O6.getClass();
        ooo00oo0OooOO0O6.OooO0o("vipRedDot_LuckyPacketSend_Hide4Fragment" + oo0oO0.OooOOo0().getValue(), true);
        oOo00OO0 ooo00oo0OooOO0O7 = o00Oo0.OooOO0O();
        ooo00oo0OooOO0O7.getClass();
        o0000O0O.OooO0o.OooO0OO("vipRedDot_CustomUserPrettyId_Hide4Fragment", oo0oO0.OooOOo0().getValue(), ooo00oo0OooOO0O7, true);
    }

    public final boolean isVipNormal(int level) {
        return (this.personalKaVipModel.getValue().getKaVIPState() == VipState.VipFrozen.getValue() && this.personalKaVipModel.getValue().getKaVIPLv() == level) ? false : true;
    }

    public final void loadKaVipModel() {
        if (!this.kaVipModels.isEmpty()) {
            return;
        }
        setContentState(ContentState.Loading);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(null), 2, null);
    }

    public final void loadPersonData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0OO(null), 2, null);
    }

    public final void refreshShopList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO(null), 3, null);
    }

    public final void setAddVip6Dialog(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.addVip6Dialog = mutableState;
    }

    public final void setContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.contentState.setValue(contentState);
    }

    public final void setCurrentErrorCode(int i) {
        this.currentErrorCode.setValue(Integer.valueOf(i));
    }

    public final void setCurrentUserWelfareModel(@NotNull VipWelfareModel vipWelfareModel) {
        Intrinsics.checkNotNullParameter(vipWelfareModel, "<set-?>");
        this.currentUserWelfareModel.setValue(vipWelfareModel);
    }

    public final void setKaVipChangeListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.kaVipChangeListener = function1;
    }

    public final void setOpenDialog(boolean z) {
        this.openDialog.setValue(Boolean.valueOf(z));
    }

    public final void setOpenSettingSwitch(boolean z) {
        this.openSettingSwitch.setValue(Boolean.valueOf(z));
    }

    public final void setOpenWhatAppDialog(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.openWhatAppDialog = mutableState;
    }

    public final void setShowPremiumFirst(boolean z) {
        this.showPremiumFirst.setValue(Boolean.valueOf(z));
    }

    public final void setSupportVip6(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.supportVip6 = mutableState;
    }

    @NotNull
    public final o00OO00O<ApiResult<VipShopExchangeModel>> shopExchange(int shopId) {
        return oo0oOO0.OooO00o(this, new OooOO0(shopId, this, null));
    }

    public final void updateVipDialogState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0O(null), 3, null);
    }
}
