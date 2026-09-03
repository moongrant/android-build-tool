package com.app.base.fragment.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import androidx.fragment.app.o0000O;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.application.App;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.RoomMemberListModel;
import com.app.base.view.pop.memberManagerInfo.MemberManageInfoModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.vm.RoomMemberVM;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p139o00OOOo0.o000O00;
import p143o00OOooo.o00O0;
import p143o00OOooo.o00O00;
import p143o00OOooo.o00O000o;
import p143o00OOooo.o00O00O;
import p143o00OOooo.o00O00OO;
import p143o00OOooo.o00O0O0;
import p143o00OOooo.o00O0O00;
import p143o00OOooo.o00O0O0O;
import p143o00OOooo.o00O0OO0;
import p143o00OOooo.o00oOoo;
import p143o00OOooo.o0O0ooO;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.oOO00O;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p470o0Oooo0.o00O000;
import p516o0o0O000.o000oOoO;
import p522o0o0O0o.o000O0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p563o0oOo0.o000OO00;
import p649o0ooOOoo.a9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\bR\u0010SJ\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0014\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001b\u0010=\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010-\u001a\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010N¨\u0006V"}, d2 = {"Lcom/app/base/fragment/room/RoomInfoMemberListFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/a9;", "", "initView", "initObserve", "hideSearch", "showSearch", "initData", "", "isRefresh", "loadMemberList", "", "search", "searchRoomMemberList", "Lcom/yalla/yalla/model/RoomUserInfoModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "delMember", "setToManger", "setToMember", "", "userid", "", "roomMember", "updateUserIdentity", "onLazyInit", "onResume", "updateMemberNumber", "onDestroyView", "Lo00OOOoO/OooO0OO;", "msg", "onEventMainThread", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lcom/app/base/mixedroom/model/RoomLoginInformation;", "mRoomLoginInformation", "Lcom/app/base/mixedroom/model/RoomLoginInformation;", "Lcom/app/base/mixedroom/model/RoomConfiguration;", "mRoomConfiguration", "Lcom/app/base/mixedroom/model/RoomConfiguration;", "Lcom/app/base/fragment/room/RoomMemberHeadView;", "roomMemberHeadView$delegate", "Lkotlin/Lazy;", "getRoomMemberHeadView", "()Lcom/app/base/fragment/room/RoomMemberHeadView;", "roomMemberHeadView", "Lcom/yalla/yalla/common/vm/RoomMemberVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/common/vm/RoomMemberVM;", "vm", "", "listData", "Ljava/util/List;", "mListSearch", "memberTitle$delegate", "getMemberTitle", "()Ljava/lang/String;", "memberTitle", "Lcom/app/base/view/pop/memberManagerInfo/MemberManageInfoModel;", "mMemberManageInfoModel$delegate", "getMMemberManageInfoModel", "()Lcom/app/base/view/pop/memberManagerInfo/MemberManageInfoModel;", "mMemberManageInfoModel", "Lo0oOo0/o000OO00;", "adapter$delegate", "getAdapter", "()Lo0oOo0/o000OO00;", "adapter", "Lo00OOOo0/o000O00;", "mMemberInfoDialog$delegate", "getMMemberInfoDialog", "()Lo00OOOo0/o000O00;", "mMemberInfoDialog", "index", "I", "isShowRedPoint", "Z", "searchPageIndex", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomInfoMemberListFragment extends p503o0o00o00.OooO<a9> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String RoomConfiguration = "RoomConfiguration";

    @NotNull
    private static final String RoomLoginInformation = "RoomLoginInformation";
    private boolean isShowRedPoint;

    @Nullable
    private RoomConfiguration mRoomConfiguration;

    @Nullable
    private RoomLoginInformation mRoomLoginInformation;

    /* JADX INFO: renamed from: roomMemberHeadView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy roomMemberHeadView = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(RoomMemberVM.class), new Function0<ViewModelStore>() { // from class: com.app.base.fragment.room.RoomInfoMemberListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.app.base.fragment.room.RoomInfoMemberListFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f11669Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f11669Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.fragment.room.RoomInfoMemberListFragment$special$$inlined$activityViewModels$default$3
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
    private final Lazy memberTitle = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: mMemberManageInfoModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMemberManageInfoModel = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: mMemberInfoDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMemberInfoDialog = LazyKt.lazy(new OooO());
    private int index = 1;
    private int searchPageIndex = 1;

    public static final class OooO extends Lambda implements Function0<o000O00> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O00 invoke() {
            return new o000O00(RoomInfoMemberListFragment.this.requireActivity());
        }
    }

    /* JADX INFO: renamed from: com.app.base.fragment.room.RoomInfoMemberListFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o000OO00> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO00 invoke() {
            FragmentActivity fragmentActivityRequireActivity = RoomInfoMemberListFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            o000OO00 o000oo01 = new o000OO00(fragmentActivityRequireActivity);
            o000oo01.f45052OooO00o = new OooO00o(o000oo01, RoomInfoMemberListFragment.this);
            return o000oo01;
        }
    }

    public static final class OooO0OO extends o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            RoomInfoMemberListFragment.this.getAdapter().setFirstLoading(true);
            RoomInfoMemberListFragment.this.loadMemberList(true);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<RoomUserInfoModel, Long> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f11661Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(RoomUserInfoModel roomUserInfoModel) {
            RoomUserInfoModel item = roomUserInfoModel;
            Intrinsics.checkNotNullParameter(item, "item");
            return Long.valueOf(item.getUserId());
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MemberManageInfoModel> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MemberManageInfoModel invoke() {
            return new MemberManageInfoModel(RoomInfoMemberListFragment.this.getString(R.string.title_RoomMember_Tips), RoomInfoMemberListFragment.this.getString(R.string.title_RoomPerson_roomer), RoomInfoMemberListFragment.this.getString(R.string.admin), RoomInfoMemberListFragment.this.getString(R.string.Member), RoomInfoMemberListFragment.this.getString(R.string.Remove_Member), RoomInfoMemberListFragment.this.getString(R.string.title_RoomMember_tipsDesc));
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<String> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return RoomInfoMemberListFragment.this.getString(R.string.Member) + ':';
        }
    }

    public static final class OooOOO extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f11664OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMemberListFragment f11665OooO0O0;

        public static final class OooO00o extends Lambda implements Function1<RoomUserInfoModel, Long> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO00o f11666Oooo0o = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(RoomUserInfoModel roomUserInfoModel) {
                RoomUserInfoModel item = roomUserInfoModel;
                Intrinsics.checkNotNullParameter(item, "item");
                return Long.valueOf(item.getUserId());
            }
        }

        public static final class OooO0O0 extends o00000O0<RoomMemberListModel<List<? extends RoomUserInfoModel>>> {
        }

        public OooOOO(boolean z, RoomInfoMemberListFragment roomInfoMemberListFragment) {
            this.f11664OooO00o = z;
            this.f11665OooO0O0 = roomInfoMemberListFragment;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            this.f11665OooO0O0.getAdapter().loadError();
            this.f11665OooO0O0.getBinding().f48927OooO0Oo.Oooo0O0(this.f11664OooO00o);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            try {
                RoomMemberListModel roomMemberListModel = (RoomMemberListModel) o0Oo0oo.OooO0OO(response, new OooO0O0().getType());
                if (this.f11664OooO00o) {
                    this.f11665OooO0O0.mListSearch.clear();
                }
                boolean z = false;
                if (roomMemberListModel != null && roomMemberListModel.data != 0) {
                    List list = this.f11665OooO0O0.mListSearch;
                    Model model = roomMemberListModel.data;
                    Intrinsics.checkNotNull(model);
                    list.addAll((Collection) model);
                    Model data = roomMemberListModel.getData();
                    Intrinsics.checkNotNull(data);
                    if (((List) data).size() < 15) {
                        z = true;
                    }
                }
                o000O0.OooO0Oo(this.f11665OooO0O0.mListSearch, OooO00o.f11666Oooo0o);
                this.f11665OooO0O0.getAdapter().setNewData(this.f11665OooO0O0.mListSearch);
                this.f11665OooO0O0.getAdapter().setLoadComplete();
                this.f11665OooO0O0.getBinding().f48927OooO0Oo.Oooo0o0(this.f11664OooO00o, true, z);
                this.f11665OooO0O0.searchPageIndex++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<RoomMemberHeadView> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomMemberHeadView invoke() {
            FragmentActivity fragmentActivityRequireActivity = RoomInfoMemberListFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new RoomMemberHeadView(fragmentActivityRequireActivity, null, 0, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delMember(RoomUserInfoModel model) {
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43159OooOo0.setValue(Boolean.TRUE);
        o00O.f43161OooOo0O.setValue(Long.valueOf(model.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o000OO00 getAdapter() {
        return (o000OO00) this.adapter.getValue();
    }

    @JvmStatic
    @NotNull
    public static final RoomInfoMemberListFragment getInstance(@Nullable RoomLoginInformation roomLoginInformation, @Nullable RoomConfiguration roomConfiguration) {
        Objects.requireNonNull(INSTANCE);
        RoomInfoMemberListFragment roomInfoMemberListFragment = new RoomInfoMemberListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(RoomLoginInformation, roomLoginInformation);
        bundle.putSerializable(RoomConfiguration, roomConfiguration);
        roomInfoMemberListFragment.setArguments(bundle);
        return roomInfoMemberListFragment;
    }

    private final o000O00 getMMemberInfoDialog() {
        return (o000O00) this.mMemberInfoDialog.getValue();
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

    private final RoomMemberVM getVm() {
        return (RoomMemberVM) this.vm.getValue();
    }

    private final void hideSearch() {
        getBinding().f48925OooO0O0.f50638OooO0OO.setText("");
        if (getBinding().f48925OooO0O0.f50636OooO00o.getVisibility() == 8) {
            return;
        }
        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
        observable.post(Boolean.FALSE);
        LinearLayout linearLayout = getBinding().f48925OooO0O0.f50636OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llSearch.root");
        oOO00O.OooO00o(linearLayout);
        getAdapter().setHeaderView(getRoomMemberHeadView().getRootView());
        this.mListSearch.clear();
        getRoomMemberHeadView().getEditSearch().setText("");
        try {
            getAdapter().setNewData(this.listData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        getBinding().f48927OooO0Oo.f19541o00O0O = true;
        getBinding().f48927OooO0Oo.Oooo0o0(false, true, false);
        EditText view = getBinding().f48925OooO0O0.f50638OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.llSearch.searchEdit");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }

    private final void initData() {
        getAdapter().setEmptyImageRes(R.drawable.ic_empty_delete);
        getAdapter().setEmptyText(R.string.No_search_results);
        getAdapter().setFirstLoading(true);
        getAdapter().setLoadErrorClickListener(new OooO0OO());
        getBinding().f48927OooO0Oo.setOnRefreshListener(new o00O00O(this));
        getBinding().f48927OooO0Oo.setOnLoadMoreListener(new o00O00(this, 0));
        getAdapter().setHeaderView(getRoomMemberHeadView().getRootView());
        getBinding().f48926OooO0OO.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        getBinding().f48926OooO0OO.setAdapter(getAdapter());
        androidx.recyclerview.widget.OooOO0 oooOO1 = (androidx.recyclerview.widget.OooOO0) getBinding().f48926OooO0OO.getItemAnimator();
        Intrinsics.checkNotNull(oooOO1);
        oooOO1.f9140OooO0oO = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-21, reason: not valid java name */
    public static final void m46initData$lambda21(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.getBinding().f48925OooO0O0.f50638OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.llSearch.searchEdit.text");
        if (!(text.length() > 0)) {
            this$0.loadMemberList(true);
            return;
        }
        String string = this$0.getBinding().f48925OooO0O0.f50638OooO0OO.getText().toString();
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
    /* JADX INFO: renamed from: initData$lambda-23, reason: not valid java name */
    public static final void m47initData$lambda23(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.getBinding().f48925OooO0O0.f50638OooO0OO.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.llSearch.searchEdit.text");
        if (!(text.length() > 0)) {
            this$0.loadMemberList(false);
            return;
        }
        String string = this$0.getBinding().f48925OooO0O0.f50638OooO0OO.getText().toString();
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
        int i = 0;
        LiveEventBus.get("RoomInfoMemberFragment_HideSearch").observe(getViewLifecycleOwner(), new o00O0(this, i));
        LiveEventBus.get("ROOM_JOIN_MEMBER").observe(this, new o00O0O00(this, i));
        LiveEventBus.get("ROOM_MEMBER_DELETE").observe(this, new o00O0OO0(this, i));
        Class cls = Long.TYPE;
        LiveEventBus.get("MEMBER_UPGRADE_ADMIN", cls).observe(getViewLifecycleOwner(), new o00oOoo(this, i));
        LiveEventBus.get("MEMBER_DOWNGRADE_MEMBER", cls).observe(getViewLifecycleOwner(), new o00O0O0O(this, i));
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43181OoooO.observe(getViewLifecycleOwner(), new o00OOO00.OooO00o(this, 1));
        getVm().getMemberCount().observe(getViewLifecycleOwner(), new o00O0O0(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-10, reason: not valid java name */
    public static final void m48initObserve$lambda10(RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-12, reason: not valid java name */
    public static final void m49initObserve$lambda12(RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f48924OooO00o.postDelayed(new androidx.core.widget.OooO(this$0, 2), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-12$lambda-11, reason: not valid java name */
    public static final void m50initObserve$lambda12$lambda11(RoomInfoMemberListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadMemberList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-15, reason: not valid java name */
    public static final void m51initObserve$lambda15(RoomInfoMemberListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list = TypeIntrinsics.isMutableList(obj) ? (List) obj : null;
        if (list == null) {
            return;
        }
        for (Object obj2 : list) {
            List<RoomUserInfoModel> data = this$0.getAdapter().getData();
            Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
            Iterator<RoomUserInfoModel> it = data.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if ((obj2 instanceof Long) && it.next().getUserId() == ((Number) obj2).longValue()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                this$0.getAdapter().remove(i);
            }
        }
        this$0.updateMemberNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-16, reason: not valid java name */
    public static final void m52initObserve$lambda16(RoomInfoMemberListFragment this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.updateUserIdentity(it.longValue(), 2);
        this$0.updateMemberNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-17, reason: not valid java name */
    public static final void m53initObserve$lambda17(RoomInfoMemberListFragment this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.updateUserIdentity(it.longValue(), 3);
        this$0.updateMemberNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-18, reason: not valid java name */
    public static final void m54initObserve$lambda18(RoomInfoMemberListFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            long userId = this$0.getAdapter().getData().get(i).getUserId();
            if (l != null && userId == l.longValue()) {
                this$0.getAdapter().remove(i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserve$lambda-19, reason: not valid java name */
    public static final void m55initObserve$lambda19(RoomInfoMemberListFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateMemberNumber();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        TextView textView = getBinding().f48925OooO0O0.f50639OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.llSearch.searchText");
        oOO00O.OooO00o(textView);
        EditText editText = getBinding().f48925OooO0O0.f50638OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.llSearch.searchEdit");
        oOO00O.OooO(editText);
        getBinding().f48925OooO0O0.f50638OooO0OO.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o00OOooo.oo00o
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                return RoomInfoMemberListFragment.m56initView$lambda1(textView2, i, keyEvent);
            }
        });
        TextView textView2 = getBinding().f48925OooO0O0.f50640OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.llSearch.tvCancel");
        oOO00O.OooO(textView2);
        int i = 0;
        getBinding().f48925OooO0O0.f50640OooO0o0.setOnClickListener(new o00O00OO(this, i));
        p172o00OooO.o00O0O0.OooO0O0().OooO0OO(getBinding().f48925OooO0O0.f50638OooO0OO, new o00O000o(this));
        getBinding().f48927OooO0Oo.setNestedScrollingEnabled(true);
        getBinding().f48926OooO0OO.setNestedScrollingEnabled(false);
        getBinding().f48927OooO0Oo.setOnTouchListener(new View.OnTouchListener() { // from class: o00OOooo.o00O00o0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return RoomInfoMemberListFragment.m59initView$lambda4(this.f31996Oooo0o, view, motionEvent);
            }
        });
        getActivity();
        getRoomMemberHeadView().getEditSearch().setVisibility(8);
        getRoomMemberHeadView().getTextSearch().setVisibility(0);
        getRoomMemberHeadView().getLlSearch().setOnClickListener(new o00OO0O.OooO0o(this, 1));
        if (!o00OO00O.f43313OooooOo.OooO00o().OooOOo0()) {
            getRoomMemberHeadView().getIvDoubt().setVisibility(8);
            getRoomMemberHeadView().getIvDelete().setVisibility(8);
        } else {
            getRoomMemberHeadView().getIvDoubt().setVisibility(0);
            getRoomMemberHeadView().getIvDoubt().setOnClickListener(new p143o00OOooo.oOO00O(this, i));
            getRoomMemberHeadView().getIvDelete().setVisibility(0);
            getRoomMemberHeadView().getIvDelete().setOnClickListener(new o0O0ooO(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final boolean m56initView$lambda1(TextView textView, int i, KeyEvent keyEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m57initView$lambda2(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m58initView$lambda3(RoomInfoMemberListFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.yalla.support.common.util.OooO0OO.OooO00o(str)) {
            this$0.searchRoomMemberList(str, true);
        } else {
            this$0.getAdapter().setNewData(this$0.listData);
            this$0.getBinding().f48927OooO0Oo.Oooo0o0(true, true, this$0.listData.size() < 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-4, reason: not valid java name */
    public static final boolean m59initView$lambda4(RoomInfoMemberListFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 0) {
            EditText view2 = this$0.getBinding().f48925OooO0O0.f50638OooO0OO;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.llSearch.searchEdit");
            Intrinsics.checkNotNullParameter(view2, "view");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            o00O000.OooO00o(context).hideSoftInputFromWindow(view2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view2, "view.context"), new Handler()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-6, reason: not valid java name */
    public static final void m60initView$lambda6(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [Model, com.app.base.view.pop.memberManagerInfo.MemberManageInfoModel] */
    /* JADX INFO: renamed from: initView$lambda-7, reason: not valid java name */
    public static final void m61initView$lambda7(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o000O00 mMemberInfoDialog = this$0.getMMemberInfoDialog();
        mMemberInfoDialog.f32153Oooo0oO = this$0.getMMemberManageInfoModel();
        mMemberInfoDialog.OooO0O0();
        mMemberInfoDialog.OooOOO();
        mMemberInfoDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-9, reason: not valid java name */
    public static final void m62initView$lambda9(RoomInfoMemberListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity context = this$0.getActivity();
        if (context != null) {
            o0O00000.OooO0OO("InRoom_roomMember_admin_remove");
            MemberListRemoveActivity.OooO00o oooO00o = MemberListRemoveActivity.f22886Oooooo0;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) MemberListRemoveActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMemberList(final boolean isRefresh) {
        if (isRefresh || this.index < 1) {
            this.index = 1;
        }
        long jOooO0o = p522o0o0O0o.oOO00O.OooO0o(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue());
        if (!com.yalla.support.common.util.OooO0OO.OooO00o(Long.valueOf(jOooO0o))) {
            getVm().roomMemberList(jOooO0o, this.index).observe(getViewLifecycleOwner(), new Observer() { // from class: o00OOooo.o00O000
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    RoomInfoMemberListFragment.m63loadMemberList$lambda25(isRefresh, this, (ApiResult) obj);
                }
            });
        } else {
            getAdapter().setLoadComplete();
            getBinding().f48927OooO0Oo.Oooo0o0(isRefresh, true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadMemberList$lambda-25, reason: not valid java name */
    public static final void m63loadMemberList$lambda25(boolean z, RoomInfoMemberListFragment this$0, ApiResult apiResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (apiResult.isSuccess()) {
            if (z) {
                this$0.listData.clear();
            }
            RoomMemberListModel roomMemberListModel = (RoomMemberListModel) apiResult.getData();
            if (roomMemberListModel != null) {
                Collection collection = (Collection) roomMemberListModel.data;
                if (collection == null || collection.isEmpty()) {
                    this$0.getAdapter().setNewData(this$0.listData);
                    this$0.getAdapter().setLoadComplete();
                    this$0.getBinding().f48927OooO0Oo.Oooo0o0(z, true, true);
                    return;
                }
                this$0.getVm().getMemberCount().postValue(Integer.valueOf(roomMemberListModel.getMaxcount()));
                this$0.index = apiResult.getPage().getPageIndex() + 1;
                List<RoomUserInfoModel> list = this$0.listData;
                Model model = roomMemberListModel.data;
                Intrinsics.checkNotNullExpressionValue(model, "roomMember.data");
                list.addAll((Collection) model);
                o000O0.OooO0Oo(this$0.listData, OooO0o.f11661Oooo0o);
                this$0.getAdapter().setNewData(this$0.listData);
                this$0.getAdapter().setLoadComplete();
            }
        } else {
            this$0.getAdapter().loadError();
        }
        XRefreshLayout xRefreshLayout = this$0.getBinding().f48927OooO0Oo;
        boolean zIsSuccess = apiResult.isSuccess();
        RoomMemberListModel roomMemberListModel2 = (RoomMemberListModel) apiResult.getData();
        List list2 = roomMemberListModel2 != null ? (List) roomMemberListModel2.getData() : null;
        xRefreshLayout.Oooo0o0(z, zIsSuccess, list2 == null || list2.isEmpty());
    }

    private final void searchRoomMemberList(String search, boolean isRefresh) {
        if (com.yalla.support.common.util.OooO0OO.OooO00o(search)) {
            return;
        }
        if (isRefresh || this.searchPageIndex < 1) {
            this.searchPageIndex = 1;
        }
        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        Intrinsics.checkNotNull(value);
        long jLongValue = value.longValue();
        int i = this.searchPageIndex;
        OooOOO callback = new OooOOO(isRefresh, this);
        Intrinsics.checkNotNullParameter(callback, "callback");
        App app = App.f11458Oooo0oO;
        Map params = com.app.base.Function.OooO0OO.OooO00o();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("barid", String.valueOf(jLongValue));
        params.put("search", o000oOoO.OooO0O0(search));
        params.put("pageindex", i + "");
        params.put("pagesize", "20");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.o000Oo0, o0ooOOo.f32327o00Ooo, params, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToManger(RoomUserInfoModel model) {
        if (model == null || com.yalla.support.common.util.OooO0OO.OooO00o(Long.valueOf(model.getUserId()))) {
            return;
        }
        p159o00OoOO.o00O000.OooO().OooOO0o(model.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToMember(RoomUserInfoModel model) {
        if (model == null || com.yalla.support.common.util.OooO0OO.OooO00o(Long.valueOf(model.getUserId()))) {
            return;
        }
        p159o00OoOO.o00O000.OooO().OooO0o(model.getUserId());
    }

    private final void showSearch() {
        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
        observable.post(Boolean.TRUE);
        getAdapter().removeAllHeaderView();
        getBinding().f48925OooO0O0.f50636OooO00o.setVisibility(0);
        getBinding().f48927OooO0Oo.f19541o00O0O = false;
        getAdapter().setNewData(this.mListSearch);
        getBinding().f48925OooO0O0.f50638OooO0OO.setText("");
        getBinding().f48925OooO0O0.f50638OooO0OO.requestFocusFromTouch();
        EditText view = getBinding().f48925OooO0O0.f50638OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.llSearch.searchEdit");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }

    private final void updateUserIdentity(long userid, int roomMember) {
        if (com.yalla.support.common.util.OooO0OO.OooO00o(Long.valueOf(userid))) {
            return;
        }
        int size = getAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            if (userid == getAdapter().getData().get(i).getUserId()) {
                getAdapter().getData().get(i).setRoomMemberType(roomMember);
                break;
            }
        }
        int size2 = this.listData.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (userid == this.listData.get(i2).getUserId()) {
                this.listData.get(i2).setRoomMemberType(roomMember);
                getAdapter().notifyItemChanged(getAdapter().getHeaderLayoutCount() + i2);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        p172o00OooO.o00O0O0.OooO0O0().OooO00o();
        super.onDestroyView();
    }

    @Override // p503o0o00o00.OooO, p140o00OOOoO.OooO0o
    public void onEventMainThread(@NotNull p140o00OOOoO.OooO0OO<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        int i = msg.f31885OooO00o;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mRoomLoginInformation = (RoomLoginInformation) arguments.getSerializable(RoomLoginInformation);
            this.mRoomConfiguration = (RoomConfiguration) arguments.getSerializable(RoomConfiguration);
        }
        initView();
        initData();
        loadMemberList(true);
        initObserve();
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO("InRoom_roomMember");
    }

    public final void updateMemberNumber() {
        getRoomMemberHeadView().getMemberCountTv().setText("");
        getRoomMemberHeadView().getMemberCountTv().append(getMemberTitle());
        TextView memberCountTv = getRoomMemberHeadView().getMemberCountTv();
        String strValueOf = String.valueOf(o00O.f43140OooO00o.OooO0oo());
        Intrinsics.checkNotNullParameter(strValueOf, "<this>");
        Intrinsics.checkNotNullParameter("#FE6C6C", "color");
        StringBuffer stringBuffer = new StringBuffer();
        if (p522o0o0O0o.o00O0.OooO0o0("#FE6C6C")) {
            stringBuffer.append(" color=\"#FE6C6C\"");
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" size=\"100\"");
        Spanned spannedFromHtml = Html.fromHtml("<font " + ((Object) stringBuffer) + ' ' + ((Object) stringBuffer2) + " >" + strValueOf + "</font>");
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(\"<font $colorTag $sizeTag >$this</font>\")");
        memberCountTv.append(spannedFromHtml);
        getRoomMemberHeadView().getMemberCountTv().append("/");
        getRoomMemberHeadView().getMemberCountTv().append(String.valueOf(getVm().getMemberCount().getValue()));
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public a9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        a9 a9VarInflate = a9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(a9VarInflate, "inflate(inflater)");
        return a9VarInflate;
    }
}
