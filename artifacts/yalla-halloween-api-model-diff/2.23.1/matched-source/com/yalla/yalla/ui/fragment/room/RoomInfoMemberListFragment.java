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
import com.code.android.util.o000O;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.security.CertificateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.api.old.ApiSearch$searchRoomMemberList$$inlined$call$1;
import com.yalla.yalla.mixedroom.o0000;
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
import p407o0Oo0OOO.o0O;
import p425o0OoO0OO.o0000O;
import p425o0OoO0OO.oOO00O;
import p472o0OoooO.oo0OOoo;
import p490o0o00O0.o00OO000;
import p527o0o0OO0.o00OO0O0;
import p531o0o0OOO0.o00000O0;
import p565o0oOo000.o000OOo;
import p569o0oOo0Oo.o0O0OO0;
import p587o0oOooO.oO00O0oO;
import p593o0oOoooO.h0;
import p602o0oo00o0.o0000O00;
import p602o0oo00o0.o0000oo;
import p675oO0Oo.x;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0003J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001b\u00104\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010E¨\u0006M"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomInfoMemberListFragment;", "Lo0o0OO0/o00OO0O0;", "Lo0Oo0OOO/o0O;", "", "onLazyInit", "onResume", "updateMemberNumber", "onDestroyView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "initView", "initObserve", "hideSearch", "showSearch", "initData", "", "isRefresh", "loadMemberList", "", "search", "searchRoomMemberList", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "delMember", "setToManger", "setToMember", "", "userid", "", "roomMember", "updateUserIdentity", "Lcom/yalla/yalla/ui/fragment/room/RoomMemberHeadView;", "roomMemberHeadView$delegate", "Lkotlin/Lazy;", "getRoomMemberHeadView", "()Lcom/yalla/yalla/ui/fragment/room/RoomMemberHeadView;", "roomMemberHeadView", "Lcom/yalla/yalla/ui/vm/RoomMemberVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/RoomMemberVM;", "vm", "", "listData", "Ljava/util/List;", "mListSearch", "memberTitle$delegate", "getMemberTitle", "()Ljava/lang/String;", "memberTitle", "Lcom/yalla/yalla/ui/view/pop/memberManagerInfo/MemberManageInfoModel;", "mMemberManageInfoModel$delegate", "getMMemberManageInfoModel", "()Lcom/yalla/yalla/ui/view/pop/memberManagerInfo/MemberManageInfoModel;", "mMemberManageInfoModel", "Lcom/yalla/yalla/ui/adapter/o000O000;", "adapter$delegate", "getAdapter", "()Lcom/yalla/yalla/ui/adapter/o000O000;", "adapter", "LoO0Oo/x;", "mMemberInfoDialog$delegate", "getMMemberInfoDialog", "()LoO0Oo/x;", "mMemberInfoDialog", "index", "I", "isShowRedPoint", "Z", "searchPageIndex", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomInfoMemberListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomInfoMemberListFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMemberListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,460:1\n172#2,9:461\n1855#3:470\n350#3,7:471\n1856#3:478\n107#4:479\n79#4,22:480\n107#4:502\n79#4,22:503\n*S KotlinDebug\n*F\n+ 1 RoomInfoMemberListFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMemberListFragment\n*L\n57#1:461,9\n201#1:470\n202#1:471,7\n201#1:478\n290#1:479\n290#1:480,22\n297#1:502\n297#1:503,22\n*E\n"})
public final class RoomInfoMemberListFragment extends o00OO0O0<o0O> {
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
        public final /* synthetic */ Function0 f28475OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28475OooO0Oo;
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
        public final /* synthetic */ boolean f28456OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMemberListFragment f28457OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RoomInfoMemberListFragment roomInfoMemberListFragment, boolean z) {
            super(1);
            this.f28456OooO0Oo = z;
            this.f28457OooO0o0 = roomInfoMemberListFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> apiResult2 = apiResult;
            boolean zIsSuccess = apiResult2.isSuccess();
            boolean z = this.f28456OooO0Oo;
            RoomInfoMemberListFragment roomInfoMemberListFragment = this.f28457OooO0o0;
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
                        roomInfoMemberListFragment.getBinding().f44384OooO0Oo.OooOooo(z, true, true);
                    } else {
                        roomInfoMemberListFragment.getVm().getMemberCount().postValue(Integer.valueOf(data.getMaxcount()));
                        roomInfoMemberListFragment.index = apiResult2.getPage().getPageIndex() + 1;
                        List list2 = roomInfoMemberListFragment.listData;
                        List<RoomUserInfoDTO> data2 = data.data;
                        Intrinsics.checkNotNullExpressionValue(data2, "data");
                        list2.addAll(NewRoomUserInfoTransformutilsKt.transformToModel(data2));
                        o0000O.OooO0OO(roomInfoMemberListFragment.listData, com.yalla.yalla.ui.fragment.room.OooO0O0.f28436OooO0Oo);
                        roomInfoMemberListFragment.getAdapter().OooOoO0(roomInfoMemberListFragment.listData);
                        roomInfoMemberListFragment.getAdapter().Oooo00o();
                    }
                }
                return Unit.INSTANCE;
            }
            roomInfoMemberListFragment.getAdapter().OooOoo();
            XRefreshLayout xRefreshLayout = roomInfoMemberListFragment.getBinding().f44384OooO0Oo;
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
            o000o001.f27058OooOoo = new OooO00o(o000o001, roomInfoMemberListFragment);
            return o000o001;
        }
    }

    public static final class OooO0OO extends oo0OOoo {
        public OooO0OO() {
        }

        @Override // p472o0OoooO.oo0OOoo
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

    public static final class OooOO0 extends Lambda implements Function0<x> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x invoke() {
            return new x(RoomInfoMemberListFragment.this.requireActivity());
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<MemberManageInfoModel> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MemberManageInfoModel invoke() {
            int i = o000OOo.title_RoomMember_Tips;
            RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.this;
            return new MemberManageInfoModel(roomInfoMemberListFragment.getString(i), roomInfoMemberListFragment.getString(o000OOo.title_RoomPerson_roomer), roomInfoMemberListFragment.getString(o000OOo.admin), roomInfoMemberListFragment.getString(o000OOo.Member), roomInfoMemberListFragment.getString(o000OOo.Remove_Member), roomInfoMemberListFragment.getString(o000OOo.title_RoomMember_tipsDesc));
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
            return androidx.camera.core.impl.OooOOOO.OooO00o(RoomInfoMemberListFragment.this.getString(o000OOo.Member), CertificateUtil.DELIMITER);
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28465OooO0Oo;

        public OooOOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28465OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28465OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28465OooO0Oo;
        }

        public final int hashCode() {
            return this.f28465OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28465OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo extends Lambda implements Function1<List<RoomUserInfoDTO>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28466OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMemberListFragment f28467OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RoomInfoMemberListFragment roomInfoMemberListFragment, boolean z) {
            super(1);
            this.f28466OooO0Oo = z;
            this.f28467OooO0o0 = roomInfoMemberListFragment;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0029  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomUserInfoDTO> list) {
            boolean z;
            List<RoomUserInfoDTO> list2 = list;
            try {
                Result.Companion companion = Result.INSTANCE;
                boolean z2 = this.f28466OooO0Oo;
                RoomInfoMemberListFragment roomInfoMemberListFragment = this.f28467OooO0o0;
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
                o0000O.OooO0OO(roomInfoMemberListFragment.mListSearch, com.yalla.yalla.ui.fragment.room.OooO0OO.f28437OooO0Oo);
                roomInfoMemberListFragment.getAdapter().OooOoO0(roomInfoMemberListFragment.mListSearch);
                roomInfoMemberListFragment.getAdapter().Oooo00o();
                roomInfoMemberListFragment.getBinding().f44384OooO0Oo.OooOooo(z2, true, z);
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
        public int f28468OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28469OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f28470OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMemberListFragment f28471OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(String str, RoomInfoMemberListFragment roomInfoMemberListFragment, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f28469OooO0o = str;
            this.f28471OooO0oO = roomInfoMemberListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo00 oooOo00 = new OooOo00(this.f28469OooO0o, this.f28471OooO0oO, continuation);
            oooOo00.f28470OooO0o0 = obj;
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
            int i = this.f28468OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f28470OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f28470OooO0o0;
            Long value = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24547OooO0Oo.getValue();
            Intrinsics.checkNotNull(value);
            long jLongValue = value.longValue();
            int i2 = this.f28471OooO0oO.searchPageIndex;
            this.f28470OooO0o0 = liveDataScope;
            this.f28468OooO0Oo = 1;
            String strOooO0oO = p382o0OOoOo.oo000o.OooO0oO(p386o0OOoo0O.o000oOoO.f43447ooOO);
            p382o0OOoOo.o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
            o0oooooOooO00o.OooO0O0(String.valueOf(jLongValue), "barid");
            o0oooooOooO00o.OooO0O0(oO00O0oO.OooO0O0(this.f28469OooO0o), "search");
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            o0oooooOooO00o.OooO0O0(sb.toString(), "pageindex");
            o0oooooOooO00o.OooO0O0("20", "pagesize");
            obj = com.code.android.util.OooOOO.OooO0Oo(new ApiSearch$searchRoomMemberList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f28470OooO0o0 = null;
            this.f28468OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28473OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(boolean z) {
            super(1);
            this.f28473OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.this;
            roomInfoMemberListFragment.getAdapter().OooOoo();
            roomInfoMemberListFragment.getBinding().f44384OooO0Oo.OooOoo(this.f28473OooO0o0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delMember(RoomUserInfoModel model) {
        p482o0o000O.o00Oo0 o00oo1 = com.yalla.yalla.service.room.OooO00o.f24532OooOOOO;
        o00oo1.f48486OooOo0.setValue(Boolean.TRUE);
        o00oo1.f48488OooOo0O.setValue(Long.valueOf(model.getUserId().getValue().longValue()));
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

    private final x getMMemberInfoDialog() {
        return (x) this.mMemberInfoDialog.getValue();
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
        getBinding().f44382OooO0O0.f44542OooO0OO.setText("");
        if (getBinding().f44382OooO0O0.f44540OooO00o.getVisibility() == 8) {
            return;
        }
        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        observable.post(Boolean.FALSE);
        LinearLayout linearLayout = getBinding().f44382OooO0O0.f44540OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        o000O.OooO0O0(linearLayout);
        getAdapter().OooOo(getRoomMemberHeadView().getRootView());
        this.mListSearch.clear();
        getRoomMemberHeadView().getEditSearch().setText("");
        try {
            getAdapter().OooOoO0(this.listData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        getBinding().f44384OooO0Oo.f20862OooOooO = true;
        getBinding().f44384OooO0Oo.OooOooo(false, true, false);
        EditText view = getBinding().f44382OooO0O0.f44542OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "searchEdit");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
        p373o0OOo0oO.o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
    }

    private final void initData() {
        getAdapter().OooOooo(p565o0oOo000.o0OOO0o.ic_empty_delete);
        getAdapter().Oooo000(o000OOo.No_search_results);
        getAdapter().Oooo00O(true);
        getAdapter().Oooo0OO(new OooO0OO());
        getBinding().f44384OooO0Oo.setOnRefreshListener(new o0O0OO0() { // from class: o0o0OOO0.o00000
            @Override // p569o0oOo0Oo.o0O0OO0
            public final void OooO0Oo() {
                RoomInfoMemberListFragment.initData$lambda$19(this.f53307OooO0Oo);
            }
        });
        getBinding().f44384OooO0Oo.setOnLoadMoreListener(new o000O0.OooO0OO(this, 5));
        getAdapter().OooOo(getRoomMemberHeadView().getRootView());
        getBinding().f44383OooO0OO.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        getBinding().f44383OooO0OO.setAdapter(getAdapter());
        androidx.recyclerview.widget.OooOO0O oooOO0O = (androidx.recyclerview.widget.OooOO0O) getBinding().f44383OooO0OO.getItemAnimator();
        Intrinsics.checkNotNull(oooOO0O);
        oooOO0O.f10842OooO0oO = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$19(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.getBinding().f44382OooO0O0.f44542OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (!(text.length() > 0)) {
            this$0.loadMemberList(true);
            return;
        }
        String string = this$0.getBinding().f44382OooO0O0.f44542OooO0OO.getText().toString();
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
    public static final void initData$lambda$21(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.getBinding().f44382OooO0O0.f44542OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (!(text.length() > 0)) {
            this$0.loadMemberList(false);
            return;
        }
        String string = this$0.getBinding().f44382OooO0O0.f44542OooO0OO.getText().toString();
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
        int i = 3;
        LiveEventBus.get("RoomInfoMemberFragment_HideSearch").observe(getViewLifecycleOwner(), new o0000(this, i));
        LiveEventBus.get("ROOM_JOIN_MEMBER").observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0O0(this, 4));
        LiveEventBus.get("ROOM_MEMBER_DELETE").observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0OO(this, 1));
        Class cls = Long.TYPE;
        LiveEventBus.get("MEMBER_UPGRADE_ADMIN", cls).observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0o(this, i));
        int i2 = 2;
        LiveEventBus.get("MEMBER_DOWNGRADE_MEMBER", cls).observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO(this, i2));
        com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.f48493OooOoo.observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooOO0(this, i2));
        getVm().getMemberCount().observe(getViewLifecycleOwner(), new OooOOOO(new OooO0o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$11(final RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final int i = 1;
        this$0.getBinding().f44381OooO00o.postDelayed(new Runnable() { // from class: androidx.media3.session.oOO00O
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
            List<T> list2 = this$0.getAdapter().f13200OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list2, "getData(...)");
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(((RoomUserInfoModel) it.next()).getUserId(), obj2)) {
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
    public static final void initObserve$lambda$17(RoomInfoMemberListFragment this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getAdapter().f13200OooOOoo.size();
        for (int i = 0; i < size; i++) {
            if (((RoomUserInfoModel) this$0.getAdapter().f13200OooOOoo.get(i)).getUserId().getValue().longValue() == j) {
                this$0.getAdapter().OooOOo(i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserve$lambda$9(RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        TextView searchText = getBinding().f44382OooO0O0.f44543OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(searchText, "searchText");
        o000O.OooO0O0(searchText);
        EditText searchEdit = getBinding().f44382OooO0O0.f44542OooO0OO;
        Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
        o000O.OooOOOO(searchEdit);
        getBinding().f44382OooO0O0.f44542OooO0OO.setOnEditorActionListener(new o00000O0());
        TextView tvCancel = getBinding().f44382OooO0O0.f44544OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        o000O.OooOOOO(tvCancel);
        int i = 1;
        getBinding().f44382OooO0O0.f44544OooO0o0.setOnClickListener(new com.facebook.internal.o00Oo0(this, i));
        o0000O00.OooO0O0().OooO0OO(getBinding().f44382OooO0O0.f44542OooO0OO, new o0000oo() { // from class: o0o0OOO0.o00000O
            @Override // p602o0oo00o0.o0000oo
            public final void OooO00o(String str) {
                RoomInfoMemberListFragment.initView$lambda$2(this.f53311OooO0Oo, str);
            }
        });
        getBinding().f44384OooO0Oo.setNestedScrollingEnabled(true);
        getBinding().f44383OooO0OO.setNestedScrollingEnabled(false);
        getBinding().f44384OooO0Oo.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0OOO0.o00000OO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return RoomInfoMemberListFragment.initView$lambda$3(this.f53312OooO0Oo, view, motionEvent);
            }
        });
        getActivity();
        getRoomMemberHeadView().getEditSearch().setVisibility(8);
        getRoomMemberHeadView().getTextSearch().setVisibility(0);
        getRoomMemberHeadView().getLlSearch().setOnClickListener(new o00OO000(this, 2));
        if (!com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().OooOOO()) {
            getRoomMemberHeadView().getIvDoubt().setVisibility(8);
            getRoomMemberHeadView().getIvDelete().setVisibility(8);
        } else {
            getRoomMemberHeadView().getIvDoubt().setVisibility(0);
            getRoomMemberHeadView().getIvDoubt().setOnClickListener(new View.OnClickListener() { // from class: o0o0OOO0.o0000Ooo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomInfoMemberListFragment.initView$lambda$6(this.f53320OooO0Oo, view);
                }
            });
            getRoomMemberHeadView().getIvDelete().setVisibility(0);
            getRoomMemberHeadView().getIvDelete().setOnClickListener(new com.google.android.material.search.OooOOO0(this, i));
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
            this$0.getBinding().f44384OooO0Oo.OooOooo(true, true, this$0.listData.size() < 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3(RoomInfoMemberListFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 0) {
            EditText view2 = this$0.getBinding().f44382OooO0O0.f44542OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view2, "searchEdit");
            Intrinsics.checkNotNullParameter(view2, "view");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
            p373o0OOo0oO.o00Oo0.OooO00o(view2.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view2.getWindowToken(), 0);
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
        x mMemberInfoDialog = this$0.getMMemberInfoDialog();
        mMemberInfoDialog.f43646OooO0o0 = this$0.getMMemberManageInfoModel();
        mMemberInfoDialog.OooO0O0();
        mMemberInfoDialog.OooOO0o();
        mMemberInfoDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity context = this$0.getActivity();
        if (context != null) {
            h0.OooO0O0("102182");
            int i = MemberListRemoveActivity.f26112OooOoO0;
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
        long jOooOO0 = com.code.android.util.o0OoOo0.OooOO0(com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24547OooO0Oo.getValue());
        if (!com.code.android.util.OooOo00.OooO00o(Long.valueOf(jOooOO0))) {
            getVm().roomMemberList(jOooOO0, this.index).observe(getViewLifecycleOwner(), new OooOOOO(new OooO(this, isRefresh)));
        } else {
            getAdapter().Oooo00o();
            getBinding().f44384OooO0Oo.OooOooo(isRefresh, true, true);
        }
    }

    private final void searchRoomMemberList(String search, boolean isRefresh) {
        if (com.code.android.util.OooOo00.OooO00o(search)) {
            return;
        }
        if (isRefresh || this.searchPageIndex < 1) {
            this.searchPageIndex = 1;
        }
        com.code.android.util.o00oO0o.OooO00o(new OooOo00(search, this, null)).observe(getViewLifecycleOwner(), new p386o0OOoo0O.o0OoOo0(new OooOo(this, isRefresh), new Oooo000(isRefresh), null, false, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToManger(RoomUserInfoModel model) {
        if (model == null || com.code.android.util.OooOo00.OooO00o(model.getUserId())) {
            return;
        }
        String str = "{\"userid\":" + model.getUserId().getValue().longValue() + "}";
        RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
        RoomLiveService roomLiveService2 = RoomLiveService.f24604OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10023, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToMember(RoomUserInfoModel model) {
        if (model == null || com.code.android.util.OooOo00.OooO00o(model.getUserId())) {
            return;
        }
        long jLongValue = model.getUserId().getValue().longValue();
        RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
        RoomLiveService roomLiveService2 = RoomLiveService.f24604OooOo00;
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
        getBinding().f44382OooO0O0.f44540OooO00o.setVisibility(0);
        getBinding().f44384OooO0Oo.f20862OooOooO = false;
        getAdapter().OooOoO0(this.mListSearch);
        getBinding().f44382OooO0O0.f44542OooO0OO.setText("");
        getBinding().f44382OooO0O0.f44542OooO0OO.requestFocusFromTouch();
        EditText view = getBinding().f44382OooO0O0.f44542OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "searchEdit");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = p373o0OOo0oO.o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    private final void updateUserIdentity(long userid, int roomMember) {
        if (com.code.android.util.OooOo00.OooO00o(Long.valueOf(userid))) {
            return;
        }
        int size = getAdapter().f13200OooOOoo.size();
        for (int i = 0; i < size; i++) {
            if (userid == ((RoomUserInfoModel) getAdapter().f13200OooOOoo.get(i)).getUserId().getValue().longValue()) {
                ((RoomUserInfoModel) getAdapter().f13200OooOOoo.get(i)).getRoomMemberType().setValue(Integer.valueOf(roomMember));
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
        o0000O00.OooO0O0().OooO00o();
        super.onDestroyView();
    }

    @Override // p588o0oOooO0.o0O0O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
        loadMemberList(true);
        initObserve();
    }

    @Override // p527o0o0OO0.o00OO0O0, p588o0oOooO0.o0O0O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        h0.OooO0O0("302006");
    }

    public final void updateMemberNumber() {
        getRoomMemberHeadView().getMemberCountTv().setText("");
        getRoomMemberHeadView().getMemberCountTv().append(getMemberTitle());
        TextView memberCountTv = getRoomMemberHeadView().getMemberCountTv();
        String strValueOf = String.valueOf(com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.OooO0o0());
        Intrinsics.checkNotNullParameter(strValueOf, "<this>");
        Intrinsics.checkNotNullParameter("#FE6C6C", "color");
        StringBuffer stringBuffer = new StringBuffer();
        if (oOO00O.OooO0o("#FE6C6C")) {
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

    @Override // p527o0o0OO0.o00OO0O0
    @NotNull
    public o0O getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0O o0oInflate = o0O.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0oInflate, "inflate(...)");
        return o0oInflate;
    }
}
