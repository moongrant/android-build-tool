package com.yalla.yalla.ui.fragment.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.security.CertificateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.api.old.ApiSearch$searchRoomMemberList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomMemberListModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import com.yalla.yalla.ui.adapter.o000O000;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pop.memberManagerInfo.MemberManageInfoModel;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.RoomMemberVM;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0O0oo00;
import p423o0OoO0OO.o0000OO0;
import p423o0OoO0OO.o00O00OO;
import p473o0OoooOo.o0OOOO0o;
import p483o0o000Oo.o0000Ooo;
import p491o0o00O0o.o00OOOO0;
import p527o0o0OO0o.o000O;
import p530o0o0OOOO.o0O000o0;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO0OOO;
import p601o0oo00oO.o0000O;
import p601o0oo00oO.o000OO;
import p650o0ooo.oOO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0003J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001b\u00104\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010E¨\u0006M"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomInfoMemberListFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/o0O0oo00;", "", "onLazyInit", "onResume", "updateMemberNumber", "onDestroyView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "initView", "initObserve", "hideSearch", "showSearch", "initData", "", "isRefresh", "loadMemberList", "", "search", "searchRoomMemberList", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "delMember", "setToManger", "setToMember", "", "userid", "", "roomMember", "updateUserIdentity", "Lcom/yalla/yalla/ui/fragment/room/RoomMemberHeadView;", "roomMemberHeadView$delegate", "Lkotlin/Lazy;", "getRoomMemberHeadView", "()Lcom/yalla/yalla/ui/fragment/room/RoomMemberHeadView;", "roomMemberHeadView", "Lcom/yalla/yalla/ui/vm/RoomMemberVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/RoomMemberVM;", "vm", "", "listData", "Ljava/util/List;", "mListSearch", "memberTitle$delegate", "getMemberTitle", "()Ljava/lang/String;", "memberTitle", "Lcom/yalla/yalla/ui/view/pop/memberManagerInfo/MemberManageInfoModel;", "mMemberManageInfoModel$delegate", "getMMemberManageInfoModel", "()Lcom/yalla/yalla/ui/view/pop/memberManagerInfo/MemberManageInfoModel;", "mMemberManageInfoModel", "Lcom/yalla/yalla/ui/adapter/o000O000;", "adapter$delegate", "getAdapter", "()Lcom/yalla/yalla/ui/adapter/o000O000;", "adapter", "Lo0ooo/oOO0O0;", "mMemberInfoDialog$delegate", "getMMemberInfoDialog", "()Lo0ooo/oOO0O0;", "mMemberInfoDialog", "index", "I", "isShowRedPoint", "Z", "searchPageIndex", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomInfoMemberListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomInfoMemberListFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMemberListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,460:1\n172#2,9:461\n1855#3:470\n350#3,7:471\n1856#3:478\n350#3,7:479\n107#4:486\n79#4,22:487\n107#4:509\n79#4,22:510\n*S KotlinDebug\n*F\n+ 1 RoomInfoMemberListFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMemberListFragment\n*L\n57#1:461,9\n201#1:470\n202#1:471,7\n201#1:478\n222#1:479,7\n290#1:486\n290#1:487,22\n297#1:509\n297#1:510,22\n*E\n"})
public final class RoomInfoMemberListFragment extends o000O<o0O0oo00> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private boolean isShowRedPoint;

    /* JADX INFO: renamed from: roomMemberHeadView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy roomMemberHeadView = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(RoomMemberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f28468OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28468OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    @NotNull
    private final List<RoomUserInfoModel> listData = new ArrayList();

    @NotNull
    private final List<RoomUserInfoModel> mListSearch = new ArrayList();

    /* JADX INFO: renamed from: memberTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy memberTitle = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: mMemberManageInfoModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMemberManageInfoModel = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: mMemberInfoDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMemberInfoDialog = LazyKt.lazy(new OooOO0());
    private int index = 1;
    private int searchPageIndex = 1;

    public static final class OooO extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28449OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMemberListFragment f28450OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RoomInfoMemberListFragment roomInfoMemberListFragment, boolean z) {
            super(1);
            this.f28449OooO0Oo = z;
            this.f28450OooO0o0 = roomInfoMemberListFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> apiResult2 = apiResult;
            boolean zIsSuccess = apiResult2.isSuccess();
            boolean z = this.f28449OooO0Oo;
            RoomInfoMemberListFragment roomInfoMemberListFragment = this.f28450OooO0o0;
            if (zIsSuccess) {
                if (z) {
                    roomInfoMemberListFragment.listData.clear();
                }
                RoomMemberListModel<List<RoomUserInfoDTO>> data = apiResult2.getData();
                if (data != null) {
                    List<RoomUserInfoDTO> list = data.data;
                    if (list == null || list.isEmpty()) {
                        roomInfoMemberListFragment.getAdapter().OooOoO0(roomInfoMemberListFragment.listData);
                        roomInfoMemberListFragment.getAdapter().Oooo00o();
                        roomInfoMemberListFragment.getBinding().f44542OooO0Oo.OooOooo(z, true, true);
                    } else {
                        roomInfoMemberListFragment.getVm().getMemberCount().postValue(Integer.valueOf(data.getMaxcount()));
                        roomInfoMemberListFragment.index = apiResult2.getPage().getPageIndex() + 1;
                        List list2 = roomInfoMemberListFragment.listData;
                        List<RoomUserInfoDTO> data2 = data.data;
                        Intrinsics.checkNotNullExpressionValue(data2, "data");
                        list2.addAll(NewRoomUserInfoTransformutilsKt.transformToModel(data2));
                        o0000OO0.OooO0OO(roomInfoMemberListFragment.listData, com.yalla.yalla.ui.fragment.room.OooO0O0.f28429OooO0Oo);
                        roomInfoMemberListFragment.getAdapter().OooOoO0(roomInfoMemberListFragment.listData);
                        roomInfoMemberListFragment.getAdapter().Oooo00o();
                    }
                }
                return Unit.INSTANCE;
            }
            roomInfoMemberListFragment.getAdapter().OooOoo();
            XRefreshLayout xRefreshLayout = roomInfoMemberListFragment.getBinding().f44542OooO0Oo;
            boolean zIsSuccess2 = apiResult2.isSuccess();
            RoomMemberListModel<List<RoomUserInfoDTO>> data3 = apiResult2.getData();
            List<RoomUserInfoDTO> data4 = data3 != null ? data3.getData() : null;
            xRefreshLayout.OooOooo(z, zIsSuccess2, data4 == null || data4.isEmpty());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o000O000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O000 invoke() {
            RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.this;
            FragmentActivity fragmentActivityRequireActivity = roomInfoMemberListFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            o000O000 o000o001 = new o000O000(fragmentActivityRequireActivity);
            o000o001.f27057OooOoo = new OooO00o(o000o001, roomInfoMemberListFragment);
            return o000o001;
        }
    }

    public static final class OooO0OO extends o0OOOO0o {
        public OooO0OO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.this;
            roomInfoMemberListFragment.getAdapter().Oooo00O(true);
            roomInfoMemberListFragment.loadMemberList(true);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            RoomInfoMemberListFragment.this.updateMemberNumber();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<oOO0O0> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOO0O0 invoke() {
            return new oOO0O0(RoomInfoMemberListFragment.this.requireActivity());
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<MemberManageInfoModel> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MemberManageInfoModel invoke() {
            int i = o000000.title_RoomMember_Tips;
            RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.this;
            return new MemberManageInfoModel(roomInfoMemberListFragment.getString(i), roomInfoMemberListFragment.getString(o000000.title_RoomPerson_roomer), roomInfoMemberListFragment.getString(o000000.admin), roomInfoMemberListFragment.getString(o000000.Member), roomInfoMemberListFragment.getString(o000000.Remove_Member), roomInfoMemberListFragment.getString(o000000.title_RoomMember_tipsDesc));
        }
    }

    public static final class OooOOO extends Lambda implements Function0<RoomMemberHeadView> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomMemberHeadView invoke() {
            FragmentActivity fragmentActivityRequireActivity = RoomInfoMemberListFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            return new RoomMemberHeadView(fragmentActivityRequireActivity, null, 6, 0);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<String> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return androidx.camera.core.impl.OooOOOO.OooO00o(RoomInfoMemberListFragment.this.getString(o000000.Member), CertificateUtil.DELIMITER);
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28458OooO0Oo;

        public OooOOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28458OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28458OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28458OooO0Oo;
        }

        public final int hashCode() {
            return this.f28458OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28458OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo extends Lambda implements Function1<List<RoomUserInfoDTO>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28459OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMemberListFragment f28460OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RoomInfoMemberListFragment roomInfoMemberListFragment, boolean z) {
            super(1);
            this.f28459OooO0Oo = z;
            this.f28460OooO0o0 = roomInfoMemberListFragment;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0029  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomUserInfoDTO> list) {
            boolean z;
            List<RoomUserInfoDTO> list2 = list;
            try {
                Result.Companion companion = Result.INSTANCE;
                boolean z2 = this.f28459OooO0Oo;
                RoomInfoMemberListFragment roomInfoMemberListFragment = this.f28460OooO0o0;
                if (z2) {
                    roomInfoMemberListFragment.mListSearch.clear();
                }
                if (list2 != null) {
                    roomInfoMemberListFragment.mListSearch.addAll(NewRoomUserInfoTransformutilsKt.transformToModel(list2));
                    if (list2.size() < 15) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                o0000OO0.OooO0OO(roomInfoMemberListFragment.mListSearch, com.yalla.yalla.ui.fragment.room.OooO0OO.f28430OooO0Oo);
                roomInfoMemberListFragment.getAdapter().OooOoO0(roomInfoMemberListFragment.mListSearch);
                roomInfoMemberListFragment.getAdapter().Oooo00o();
                roomInfoMemberListFragment.getBinding().f44542OooO0Oo.OooOooo(z2, true, z);
                int i = roomInfoMemberListFragment.searchPageIndex;
                roomInfoMemberListFragment.searchPageIndex = i + 1;
                Result.m4215constructorimpl(Integer.valueOf(i));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4215constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment$searchRoomMemberList$1", f = "RoomInfoMemberListFragment.kt", i = {}, l = {369, 368}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<RoomUserInfoDTO>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f28461OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28462OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f28463OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMemberListFragment f28464OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(String str, RoomInfoMemberListFragment roomInfoMemberListFragment, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f28462OooO0o = str;
            this.f28464OooO0oO = roomInfoMemberListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo00 oooOo00 = new OooOo00(this.f28462OooO0o, this.f28464OooO0oO, continuation);
            oooOo00.f28463OooO0o0 = obj;
            return oooOo00;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<RoomUserInfoDTO>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28461OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f28463OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f28463OooO0o0;
            Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
            Intrinsics.checkNotNull(value);
            long jLongValue = value.longValue();
            int i2 = this.f28464OooO0oO.searchPageIndex;
            this.f28463OooO0o0 = liveDataScope;
            this.f28461OooO0Oo = 1;
            String strOooO0oO = p380o0OOoOo.oo000o.OooO0oO(p384o0OOoo0O.Oooo0.f43447ooOO);
            p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
            o0oooooOooO00o.OooO0O0(String.valueOf(jLongValue), "barid");
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(this.f28462OooO0o), "search");
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            o0oooooOooO00o.OooO0O0(sb.toString(), "pageindex");
            o0oooooOooO00o.OooO0O0("20", "pagesize");
            obj = com.code.android.util.OooOOO.OooO0Oo(new ApiSearch$searchRoomMemberList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f28463OooO0o0 = null;
            this.f28461OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28466OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(boolean z) {
            super(1);
            this.f28466OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.this;
            roomInfoMemberListFragment.getAdapter().OooOoo();
            roomInfoMemberListFragment.getBinding().f44542OooO0Oo.OooOoo(this.f28466OooO0o0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delMember(RoomUserInfoModel model) {
        o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
        o0000ooo.f48538OooOo0.setValue(Boolean.TRUE);
        o0000ooo.f48540OooOo0O.setValue(Long.valueOf(model.getUserId().getValue().longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o000O000 getAdapter() {
        return (o000O000) this.adapter.getValue();
    }

    @JvmStatic
    @NotNull
    public static final RoomInfoMemberListFragment getInstance() {
        INSTANCE.getClass();
        return new RoomInfoMemberListFragment();
    }

    private final oOO0O0 getMMemberInfoDialog() {
        return (oOO0O0) this.mMemberInfoDialog.getValue();
    }

    private final MemberManageInfoModel getMMemberManageInfoModel() {
        return (MemberManageInfoModel) this.mMemberManageInfoModel.getValue();
    }

    private final String getMemberTitle() {
        return (String) this.memberTitle.getValue();
    }

    private final RoomMemberHeadView getRoomMemberHeadView() {
        return (RoomMemberHeadView) this.roomMemberHeadView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomMemberVM getVm() {
        return (RoomMemberVM) this.vm.getValue();
    }

    private final void hideSearch() {
        getBinding().f44540OooO0O0.f44607OooO0OO.setText("");
        if (getBinding().f44540OooO0O0.f44605OooO00o.getVisibility() == 8) {
            return;
        }
        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        observable.post(Boolean.FALSE);
        LinearLayout linearLayout = getBinding().f44540OooO0O0.f44605OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        com.code.android.util.o000O.OooO0O0(linearLayout);
        getAdapter().OooOo(getRoomMemberHeadView().getRootView());
        this.mListSearch.clear();
        getRoomMemberHeadView().getEditSearch().setText("");
        try {
            getAdapter().OooOoO0(this.listData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        getBinding().f44542OooO0Oo.f20857OooOooO = true;
        getBinding().f44542OooO0Oo.OooOooo(false, true, false);
        EditText view = getBinding().f44540OooO0O0.f44607OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "searchEdit");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
        kotlin.collections.OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
    }

    private final void initData() {
        getAdapter().OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_delete);
        getAdapter().Oooo000(o000000.No_search_results);
        getAdapter().Oooo00O(true);
        getAdapter().Oooo0OO(new OooO0OO());
        getBinding().f44542OooO0Oo.setOnRefreshListener(new o00OOOO0(this));
        getBinding().f44542OooO0Oo.setOnLoadMoreListener(new o000O0.OooO0OO(this, 4));
        getAdapter().OooOo(getRoomMemberHeadView().getRootView());
        getBinding().f44541OooO0OO.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        getBinding().f44541OooO0OO.setAdapter(getAdapter());
        androidx.recyclerview.widget.OooOO0O oooOO0O = (androidx.recyclerview.widget.OooOO0O) getBinding().f44541OooO0OO.getItemAnimator();
        Intrinsics.checkNotNull(oooOO0O);
        oooOO0O.f10831OooO0oO = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$20(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.getBinding().f44540OooO0O0.f44607OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (!(text.length() > 0)) {
            this$0.loadMemberList(true);
            return;
        }
        String string = this$0.getBinding().f44540OooO0O0.f44607OooO0OO.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        this$0.searchRoomMemberList(string.subSequence(i, length + 1).toString(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$22(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.getBinding().f44540OooO0O0.f44607OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (!(text.length() > 0)) {
            this$0.loadMemberList(false);
            return;
        }
        String string = this$0.getBinding().f44540OooO0O0.f44607OooO0OO.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        this$0.searchRoomMemberList(string.subSequence(i, length + 1).toString(), false);
    }

    private final void initObserve() {
        LiveEventBus.get("RoomInfoMemberFragment_HideSearch").observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.o0000Ooo(this, 4));
        int i = 2;
        LiveEventBus.get("ROOM_JOIN_MEMBER").observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0O0(this, i));
        LiveEventBus.get("ROOM_MEMBER_DELETE").observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0OO(this, i));
        Class cls = Long.TYPE;
        LiveEventBus.get("MEMBER_UPGRADE_ADMIN", cls).observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0o(this, i));
        int i2 = 3;
        LiveEventBus.get("MEMBER_DOWNGRADE_MEMBER", cls).observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO(this, i2));
        com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48545OooOoo.observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooOO0(this, i2));
        getVm().getMemberCount().observe(getViewLifecycleOwner(), new OooOOOO(new OooO0o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$11(final RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final int i = 1;
        this$0.getBinding().f44539OooO00o.postDelayed(new Runnable() { // from class: androidx.media3.session.oOO00O
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                Object obj2 = this$0;
                switch (i2) {
                    case 0:
                        ((o00O00OO) obj2).OooO00o();
                        break;
                    default:
                        RoomInfoMemberListFragment.initObserve$lambda$11$lambda$10((RoomInfoMemberListFragment) obj2);
                        break;
                }
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$11$lambda$10(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadMemberList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$14(RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list = TypeIntrinsics.isMutableList(obj) ? (List) obj : null;
        if (list == null) {
            return;
        }
        for (Object obj2 : list) {
            List<T> list2 = this$0.getAdapter().f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list2, "getData(...)");
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if ((obj2 instanceof Long) && ((RoomUserInfoModel) it.next()).getUserId().getValue().longValue() == ((Number) obj2).longValue()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                this$0.getAdapter().OooOOo(i);
            }
        }
        this$0.updateMemberNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$15(RoomInfoMemberListFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(l);
        this$0.updateUserIdentity(l.longValue(), 2);
        this$0.updateMemberNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$16(RoomInfoMemberListFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(l);
        this$0.updateUserIdentity(l.longValue(), 3);
        this$0.updateMemberNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$18(RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<T> list = this$0.getAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else {
                if ((obj instanceof Long) && ((RoomUserInfoModel) it.next()).getUserId().getValue().longValue() == ((Number) obj).longValue()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i >= 0) {
            this$0.getAdapter().OooOOo(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$9(RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        TextView searchText = getBinding().f44540OooO0O0.f44608OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(searchText, "searchText");
        com.code.android.util.o000O.OooO0O0(searchText);
        EditText searchEdit = getBinding().f44540OooO0O0.f44607OooO0OO;
        Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
        com.code.android.util.o000O.OooOOOO(searchEdit);
        getBinding().f44540OooO0O0.f44607OooO0OO.setOnEditorActionListener(new o0O000o0());
        TextView tvCancel = getBinding().f44540OooO0O0.f44609OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        com.code.android.util.o000O.OooOOOO(tvCancel);
        getBinding().f44540OooO0O0.f44609OooO0o0.setOnClickListener(new com.facebook.internal.o00Oo0(this, 3));
        o000OO.OooO0O0().OooO0OO(getBinding().f44540OooO0O0.f44607OooO0OO, new o0000O() { // from class: o0o0OOOO.o0O00
            @Override // p601o0oo00oO.o0000O
            public final void OooO00o(String str) {
                RoomInfoMemberListFragment.initView$lambda$2(this.f53389OooO0Oo, str);
            }
        });
        int i = 1;
        getBinding().f44542OooO0Oo.setNestedScrollingEnabled(true);
        getBinding().f44541OooO0OO.setNestedScrollingEnabled(false);
        getBinding().f44542OooO0Oo.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0OOOO.o0OoO00O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return RoomInfoMemberListFragment.initView$lambda$3(this.f53443OooO0Oo, view, motionEvent);
            }
        });
        getActivity();
        getRoomMemberHeadView().getEditSearch().setVisibility(8);
        getRoomMemberHeadView().getTextSearch().setVisibility(0);
        getRoomMemberHeadView().getLlSearch().setOnClickListener(new View.OnClickListener() { // from class: o0o0OOOO.o0O00O0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomInfoMemberListFragment.initView$lambda$5(this.f53395OooO0Oo, view);
            }
        });
        if (!com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().OooOOO()) {
            getRoomMemberHeadView().getIvDoubt().setVisibility(8);
            getRoomMemberHeadView().getIvDelete().setVisibility(8);
        } else {
            getRoomMemberHeadView().getIvDoubt().setVisibility(0);
            getRoomMemberHeadView().getIvDoubt().setOnClickListener(new View.OnClickListener() { // from class: o0o0OOOO.o0O00O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomInfoMemberListFragment.initView$lambda$6(this.f53394OooO0Oo, view);
                }
            });
            getRoomMemberHeadView().getIvDelete().setVisibility(0);
            getRoomMemberHeadView().getIvDelete().setOnClickListener(new com.google.android.material.search.OooOOO(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0(TextView textView, int i, KeyEvent keyEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(RoomInfoMemberListFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.code.android.util.OooOo00.OooO00o(str)) {
            this$0.searchRoomMemberList(str, true);
        } else {
            this$0.getAdapter().OooOoO0(this$0.listData);
            this$0.getBinding().f44542OooO0Oo.OooOooo(true, true, this$0.listData.size() < 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3(RoomInfoMemberListFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 0) {
            EditText view2 = this$0.getBinding().f44540OooO0O0.f44607OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view2, "searchEdit");
            Intrinsics.checkNotNullParameter(view2, "view");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
            kotlin.collections.OooO00o.OooO0O0(view2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view2.getWindowToken(), 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [Model, com.yalla.yalla.ui.view.pop.memberManagerInfo.MemberManageInfoModel] */
    public static final void initView$lambda$6(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oOO0O0 mMemberInfoDialog = this$0.getMMemberInfoDialog();
        mMemberInfoDialog.f43650OooO0o0 = this$0.getMMemberManageInfoModel();
        mMemberInfoDialog.OooO0O0();
        mMemberInfoDialog.OooOO0o();
        mMemberInfoDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity context = this$0.getActivity();
        if (context != null) {
            o0oo0000.OooO00o.OooO0O0("102182");
            int i = MemberListRemoveActivity.f26110OooOoO0;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) MemberListRemoveActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMemberList(boolean isRefresh) {
        if (isDetached() || getView() == null) {
            return;
        }
        if (isRefresh || this.index < 1) {
            this.index = 1;
        }
        long jOooOO0 = com.code.android.util.o0OoOo0.OooOO0(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue());
        if (!com.code.android.util.OooOo00.OooO00o(Long.valueOf(jOooOO0))) {
            getVm().roomMemberList(jOooOO0, this.index).observe(getViewLifecycleOwner(), new OooOOOO(new OooO(this, isRefresh)));
        } else {
            getAdapter().Oooo00o();
            getBinding().f44542OooO0Oo.OooOooo(isRefresh, true, true);
        }
    }

    private final void searchRoomMemberList(String search, boolean isRefresh) {
        if (com.code.android.util.OooOo00.OooO00o(search)) {
            return;
        }
        if (isRefresh || this.searchPageIndex < 1) {
            this.searchPageIndex = 1;
        }
        com.code.android.util.o00oO0o.OooO00o(new OooOo00(search, this, null)).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooOo(this, isRefresh), new Oooo000(isRefresh), null, false, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToManger(RoomUserInfoModel model) {
        if (model == null || com.code.android.util.OooOo00.OooO00o(model.getUserId().getValue())) {
            return;
        }
        String str = "{\"userid\":" + model.getUserId().getValue().longValue() + "}";
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10023, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToMember(RoomUserInfoModel model) {
        if (model == null || com.code.android.util.OooOo00.OooO00o(model.getUserId().getValue())) {
            return;
        }
        long jLongValue = model.getUserId().getValue().longValue();
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10024, "{\"userid\":" + jLongValue + "}");
        }
    }

    private final void showSearch() {
        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        observable.post(Boolean.TRUE);
        getAdapter().OooOOoo();
        getBinding().f44540OooO0O0.f44605OooO00o.setVisibility(0);
        getBinding().f44542OooO0Oo.f20857OooOooO = false;
        getAdapter().OooOoO0(this.mListSearch);
        getBinding().f44540OooO0O0.f44607OooO0OO.setText("");
        getBinding().f44540OooO0O0.f44607OooO0OO.requestFocusFromTouch();
        EditText view = getBinding().f44540OooO0O0.f44607OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "searchEdit");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    private final void updateUserIdentity(long userid, int roomMember) {
        if (com.code.android.util.OooOo00.OooO00o(Long.valueOf(userid))) {
            return;
        }
        int size = getAdapter().f13189OooOOoo.size();
        for (int i = 0; i < size; i++) {
            if (userid == ((RoomUserInfoModel) getAdapter().f13189OooOOoo.get(i)).getUserId().getValue().longValue()) {
                ((RoomUserInfoModel) getAdapter().f13189OooOOoo.get(i)).getRoomMemberType().setValue(Integer.valueOf(roomMember));
                break;
            }
        }
        int size2 = this.listData.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (userid == this.listData.get(i2).getUserId().getValue().longValue()) {
                this.listData.get(i2).getRoomMemberType().setValue(Integer.valueOf(roomMember));
                getAdapter().notifyItemChanged(getAdapter().OooOOO0() + i2);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        o000OO.OooO0O0().OooO00o();
        super.onDestroyView();
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
        loadMemberList(true);
        initObserve();
    }

    @Override // p527o0o0OO0o.o000O, p586o0oOooO0.oO0Oo0o0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0oo0000.OooO00o.OooO0O0("302006");
    }

    public final void updateMemberNumber() {
        getRoomMemberHeadView().getMemberCountTv().setText("");
        getRoomMemberHeadView().getMemberCountTv().append(getMemberTitle());
        TextView memberCountTv = getRoomMemberHeadView().getMemberCountTv();
        String strValueOf = String.valueOf(com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.OooO0o0());
        Intrinsics.checkNotNullParameter(strValueOf, "<this>");
        Intrinsics.checkNotNullParameter("#FE6C6C", "color");
        StringBuffer stringBuffer = new StringBuffer();
        if (o00O00OO.OooO0o("#FE6C6C")) {
            stringBuffer.append(" color=\"#FE6C6C\"");
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" size=\"100\"");
        Spanned spannedFromHtml = Html.fromHtml("<font " + ((Object) stringBuffer) + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) stringBuffer2) + " >" + strValueOf + "</font>");
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        memberCountTv.append(spannedFromHtml);
        getRoomMemberHeadView().getMemberCountTv().append("/");
        getRoomMemberHeadView().getMemberCountTv().append(String.valueOf(getVm().getMemberCount().getValue()));
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public o0O0oo00 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0O0oo00 o0o0oo00Inflate = o0O0oo00.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0o0oo00Inflate, "inflate(...)");
        return o0o0oo00Inflate;
    }
}
