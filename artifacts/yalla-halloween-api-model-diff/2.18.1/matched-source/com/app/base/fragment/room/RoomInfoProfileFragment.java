package com.app.base.fragment.room;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o0000O;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.app.appConfig.apiDataModela.ApiCountryUtils;
import com.app.base.base.activity.BaseFragmentActivity;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.CategoryModel;
import com.app.base.model.ChatModel;
import com.app.base.model.CountryModel;
import com.app.base.view.FixTextView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.security.CertificateUtil;
import com.umeng.analytics.pro.ak;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ReportFromData;
import com.yalla.yalla.common.ui.view.UserPrettyIdView;
import com.yalla.yalla.common.vm.LiveRoomVM;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p100o000oOoO.o0O00OO;
import p139o00OOOo0.o000oOoO;
import p142o00OOooO.o00O0O;
import p142o00OOooO.o0OOO0o;
import p143o00OOooo.o00OO;
import p143o00OOooo.o00OOO0;
import p143o00OOooo.o00OOO0O;
import p143o00OOooo.o00OOOO0;
import p143o00OOooo.o00OOOOo;
import p143o00OOooo.o0o0Oo;
import p159o00OoOO.o000O00O;
import p168o00Ooo0.o0O0O00;
import p176o00OoooO.oO0OOo0o;
import p254o00ooO0O.o0000Ooo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p497o0o00Oo.OooOOO0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.n1;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;
import p604o0oo00oO.oO0Oo0oo;
import p606o0oo0O.OooOo;
import p616o0oo0Ooo.oO0O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001kB\u0007¢\u0006\u0004\bh\u0010iJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0003J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J&\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\bH\u0016J\u0016\u0010'\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%H\u0016R\u0018\u0010(\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00107\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0018\u00108\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0018\u0010=\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010>\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010;R\u0018\u0010?\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0018\u0010@\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010;R\u0018\u0010E\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010;R\u0018\u0010F\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010;R\u0018\u0010G\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010;R\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010O\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010;R\u0018\u0010P\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010;R\u0018\u0010Q\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010;R\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010)R\u0018\u0010V\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010;R\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010)R\u0018\u0010[\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010)R\u0018\u0010\\\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010)R\u001b\u0010b\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010_\u001a\u0004\be\u0010f¨\u0006l"}, d2 = {"Lcom/app/base/fragment/room/RoomInfoProfileFragment;", "Lo00OOO0/OooO00o;", "Landroid/view/View$OnClickListener;", "", "Lcom/yalla/yalla/common/model/ReportFromData;", "getLash50RoomChatList", "", "showLevelDialog", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Lo0o0OOO/o00OO00O;", "liveDataSource", "initDataObserver", "changeDialogState", "", "header", "setRoomHeader", "", "isFollow", "setFollowState", "unJoinRoom", "type", "setCenterTextDialog", "showRoomInfo", "isMyRoom", "setBottomLayout", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onResume", ak.aE, "onClick", "Lo00OOOoO/OooO0OO;", "msg", "onEventMainThread", "mView", "Landroid/view/View;", "Lcom/app/base/mixedroom/model/RoomLoginInformation;", "mRoomLoginInformation", "Lcom/app/base/mixedroom/model/RoomLoginInformation;", "Lcom/app/base/mixedroom/model/RoomConfiguration;", "mRoomConfiguration", "Lcom/app/base/mixedroom/model/RoomConfiguration;", "Lcom/yalla/yalla/util/netimage/NetImageView;", "ivRoomHead", "Lcom/yalla/yalla/util/netimage/NetImageView;", "Landroid/widget/ImageView;", "ivOfficial", "Landroid/widget/ImageView;", "ivRoomWarning", "ivRoomSetting", "ivLevelMore", "Landroid/widget/TextView;", "tvRoomName", "Landroid/widget/TextView;", "tvRoomId", "tvRoomSetting", "tvLevelCurrent", "tvLevelNext", "tvProgress", "Landroid/widget/ProgressBar;", "pbRoomLevel", "Landroid/widget/ProgressBar;", "tvRoomMember", "tvRoomLanguage", "tvRoomLocation", "tvRoomTag", "Lcom/app/base/view/FixTextView;", "tvRoomBroadcast", "Lcom/app/base/view/FixTextView;", "Landroid/widget/LinearLayout;", "llOther", "Landroid/widget/LinearLayout;", "llJoin", "tvFollow", "tvJoined", "tvJoinCount", "", "userIdentityInfo", "I", "vLevelClick", "tvRedPoint", "Lcom/yalla/yalla/common/ui/view/UserPrettyIdView;", "ivPrettyId", "Lcom/yalla/yalla/common/ui/view/UserPrettyIdView;", "tvJoinCostBrackets1", "tvJoinCostBrackets2", "ivCoin", "Lcom/yalla/yalla/common/vm/LiveRoomVM;", "liveRoomVM$delegate", "Lkotlin/Lazy;", "getLiveRoomVM", "()Lcom/yalla/yalla/common/vm/LiveRoomVM;", "liveRoomVM", "Lo0oo00oO/oO0Oo0oo;", "loadingVM$delegate", "getLoadingVM", "()Lo0oo00oO/oO0Oo0oo;", "loadingVM", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomInfoProfileFragment extends o00OOO0.OooO00o {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private o0O00OO<Boolean> centerTextDialog;

    @Nullable
    private View ivCoin;

    @Nullable
    private ImageView ivLevelMore;

    @Nullable
    private ImageView ivOfficial;

    @Nullable
    private UserPrettyIdView ivPrettyId;

    @Nullable
    private NetImageView ivRoomHead;

    @Nullable
    private ImageView ivRoomSetting;

    @Nullable
    private ImageView ivRoomWarning;

    @Nullable
    private LinearLayout llJoin;

    @Nullable
    private LinearLayout llOther;

    @Nullable
    private RoomConfiguration mRoomConfiguration;

    @Nullable
    private RoomLoginInformation mRoomLoginInformation;

    @Nullable
    private View mView;

    @Nullable
    private ProgressBar pbRoomLevel;

    @Nullable
    private n1 triangleDialog;

    @Nullable
    private TextView tvFollow;

    @Nullable
    private View tvJoinCostBrackets1;

    @Nullable
    private View tvJoinCostBrackets2;

    @Nullable
    private TextView tvJoinCount;

    @Nullable
    private TextView tvJoined;

    @Nullable
    private TextView tvLevelCurrent;

    @Nullable
    private TextView tvLevelNext;

    @Nullable
    private TextView tvProgress;

    @Nullable
    private TextView tvRedPoint;

    @Nullable
    private FixTextView tvRoomBroadcast;

    @Nullable
    private TextView tvRoomId;

    @Nullable
    private TextView tvRoomLanguage;

    @Nullable
    private TextView tvRoomLocation;

    @Nullable
    private TextView tvRoomMember;

    @Nullable
    private TextView tvRoomName;

    @Nullable
    private TextView tvRoomSetting;

    @Nullable
    private TextView tvRoomTag;
    private int userIdentityInfo;

    @Nullable
    private View vLevelClick;

    /* JADX INFO: renamed from: liveRoomVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy liveRoomVM = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(LiveRoomVM.class), new Function0<ViewModelStore>() { // from class: com.app.base.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.app.base.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f11684Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f11684Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: loadingVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingVM = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(oO0Oo0oo.class), new Function0<ViewModelStore>() { // from class: com.app.base.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.app.base.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$5

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f11688Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f11688Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$6
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

    public static final class OooO implements n1.OooO00o {
        public OooO() {
        }

        @Override // o0oOoOOo.n1.OooO00o
        public final void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            if (v.getId() == R.id.un_join) {
                o0O00000.OooO0OO("InRoom_roomProfile_unjoin");
                o00O o00o2 = o00O.f43140OooO00o;
                o00O.f43160OooOo00.setValue(Boolean.TRUE);
            } else {
                o0O00000.OooO0OO("InRoom_roomProfile_UnjoinAndUnfollow");
                RoomInfoProfileFragment.this.setCenterTextDialog("unJoin&unFollow");
            }
            n1 n1Var = RoomInfoProfileFragment.this.triangleDialog;
            Intrinsics.checkNotNull(n1Var);
            n1Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.app.base.fragment.room.RoomInfoProfileFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Boolean value = o00OO00O.f43313OooooOo.OooO00o().f43327OooOOO.getValue();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(value, bool)) {
                o00O o00o2 = o00O.f43140OooO00o;
                o00O.f43166OooOoo.setValue(bool);
            } else {
                FragmentActivity activity = RoomInfoProfileFragment.this.getActivity();
                if (activity != null) {
                    RoomInfoProfileFragment roomInfoProfileFragment = RoomInfoProfileFragment.this;
                    roomInfoProfileFragment.getLoadingVM().OooO0O0(o000O0O0.OooO0OO(R.string.loading));
                    roomInfoProfileFragment.getLiveRoomVM().followRoom(true).observe(activity, new o0OOO0o(roomInfoProfileFragment, 1));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0O00000.OooO0OO("InRoom_roomProfile_id");
            Context context = RoomInfoProfileFragment.this.getContext();
            Intrinsics.checkNotNull(context);
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            TextView textView = RoomInfoProfileFragment.this.tvRoomId;
            Object[] array = StringsKt__StringsKt.split$default(String.valueOf(textView != null ? textView.getText() : null), new String[]{"ID:"}, false, 0, 6, (Object) null).toArray(new String[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Yalla", ((String[]) array)[1]));
            String strOooO0OO = o000O0O0.OooO0OO(R.string.UserInfo_Clip_cpoied);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f11681Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomInfoProfileFragment f11682Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, RoomInfoProfileFragment roomInfoProfileFragment) {
            super(0);
            this.f11681Oooo0o = str;
            this.f11682Oooo0oO = roomInfoProfileFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String str = this.f11681Oooo0o;
            int iHashCode = str.hashCode();
            if (iHashCode != -1298587734) {
                if (iHashCode != -841454749) {
                    if (iHashCode == 613961165 && str.equals("unJoin&unFollow")) {
                        p159o00OoOO.o00O000.OooO().OooOoo0(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()), "1");
                        RoomConfiguration roomConfiguration = this.f11682Oooo0oO.mRoomConfiguration;
                        Intrinsics.checkNotNull(roomConfiguration);
                        roomConfiguration.setIsfollow(0);
                    }
                } else if (str.equals("unJoin")) {
                    p159o00OoOO.o00O000.OooO().OooOoo0(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()), AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    RoomConfiguration roomConfiguration2 = this.f11682Oooo0oO.mRoomConfiguration;
                    Intrinsics.checkNotNull(roomConfiguration2);
                    roomConfiguration2.setIsfollow(1);
                }
            } else if (str.equals("unFollow")) {
                o0O00000.OooO0OO("InRoom_roomProfile_unfollow_comfirm");
                o000O00O.OooO().Oooo0oO();
            }
            return Unit.INSTANCE;
        }
    }

    private final void changeDialogState() {
        o0O00OO<Boolean> o0o00oo2;
        int i = this.userIdentityInfo;
        if (i != 0) {
            if (i != 3 || (o0o00oo2 = this.centerTextDialog) == null || o0o00oo2 == null) {
                return;
            }
            o0o00oo2.setValue(Boolean.FALSE);
            return;
        }
        n1 n1Var = this.triangleDialog;
        if (n1Var != null) {
            n1Var.dismiss();
        }
        o0O00OO<Boolean> o0o00oo3 = this.centerTextDialog;
        if (o0o00oo3 == null) {
            return;
        }
        o0o00oo3.setValue(Boolean.FALSE);
    }

    private final List<ReportFromData> getLash50RoomChatList() {
        int i;
        ArrayList<ChatModel> arrayList;
        FragmentActivity activity = getActivity();
        MixedRoomActivity mixedRoomActivity = activity instanceof MixedRoomActivity ? (MixedRoomActivity) activity : null;
        Object objClone = (mixedRoomActivity == null || (arrayList = mixedRoomActivity.f11801oo000o.f31588Oooo0oO) == null) ? null : arrayList.clone();
        List<ChatModel> list = objClone instanceof List ? (List) objClone : null;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            int i2 = 0;
            for (ChatModel chatModel : list) {
                if (i2 != 50 && ((i = chatModel.type) == 0 || i == 7)) {
                    ReportFromData reportFromData = new ReportFromData(0L, 0L, null, 0L, 0, 0, 0L, 127, null);
                    RoomUserInfoModel roomUserInfoModel = chatModel.from;
                    if (roomUserInfoModel != null) {
                        long userId = roomUserInfoModel.getUserId();
                        long jLongValue = 0;
                        reportFromData.setPrettyId(o000Oo0.OooO0o0(chatModel.from.getUserIdx()));
                        reportFromData.setUserId(userId);
                        reportFromData.setContent("" + chatModel.message);
                        reportFromData.setSendTime(chatModel.playTime);
                        reportFromData.setType(chatModel.type == 7 ? 1 : 0);
                        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                        if (value != null) {
                            Intrinsics.checkNotNullExpressionValue(value, "RoomDataSource.instance().roomId.value ?: 0");
                            jLongValue = value.longValue();
                        }
                        reportFromData.setRoomId(jLongValue);
                        arrayList2.add(reportFromData);
                        i2++;
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LiveRoomVM getLiveRoomVM() {
        return (LiveRoomVM) this.liveRoomVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oO0Oo0oo getLoadingVM() {
        return (oO0Oo0oo) this.loadingVM.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    private final void initDataObserver(final o00OO00O liveDataSource) {
        int i = 0;
        liveDataSource.f43327OooOOO.observe(getViewLifecycleOwner(), new o00OOO0O(this, i));
        liveDataSource.f43316OooO00o.observe(getViewLifecycleOwner(), new o00OOO0(this, i));
        liveDataSource.f43317OooO0O0.observe(getViewLifecycleOwner(), new o00OOOO0(this, i));
        liveDataSource.f43329OooOOOO.observe(getViewLifecycleOwner(), new Observer() { // from class: o00OOooo.o00Oo00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                RoomInfoProfileFragment.m80initDataObserver$lambda8(this.f32028OooO00o, liveDataSource, (Integer) obj);
            }
        });
        liveDataSource.f43337OooOo0O.observe(getViewLifecycleOwner(), new o00O0O(this, 1));
        liveDataSource.f43338OooOo0o.observe(getViewLifecycleOwner(), new o0o0Oo(this, i));
        liveDataSource.f43334OooOo.observe(getViewLifecycleOwner(), new o00OOOOo(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initDataObserver$lambda-10, reason: not valid java name */
    public static final void m75initDataObserver$lambda10(RoomInfoProfileFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 0) {
            View view = this$0.tvJoinCostBrackets1;
            if (view != null) {
                oOO00O.OooO00o(view);
            }
            View view2 = this$0.tvJoinCostBrackets2;
            if (view2 != null) {
                oOO00O.OooO00o(view2);
            }
            TextView textView = this$0.tvJoinCount;
            if (textView != null) {
                oOO00O.OooO00o(textView);
            }
            View view3 = this$0.ivCoin;
            if (view3 != null) {
                oOO00O.OooO00o(view3);
                return;
            }
            return;
        }
        TextView textView2 = this$0.tvJoinCount;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(String.valueOf(num));
        View view4 = this$0.tvJoinCostBrackets1;
        if (view4 != null) {
            oOO00O.OooO(view4);
        }
        View view5 = this$0.tvJoinCostBrackets2;
        if (view5 != null) {
            oOO00O.OooO(view5);
        }
        TextView textView3 = this$0.tvJoinCount;
        if (textView3 != null) {
            oOO00O.OooO(textView3);
        }
        View view6 = this$0.ivCoin;
        if (view6 != null) {
            oOO00O.OooO(view6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initDataObserver$lambda-11, reason: not valid java name */
    public static final void m76initDataObserver$lambda11(RoomInfoProfileFragment this$0, CategoryModel categoryModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((categoryModel != null ? categoryModel.labelname : null) != null) {
            TextView textView = this$0.tvRoomTag;
            if (textView == null) {
                return;
            }
            textView.setText(categoryModel.labelname);
            return;
        }
        TextView textView2 = this$0.tvRoomTag;
        if (textView2 == null) {
            return;
        }
        textView2.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initDataObserver$lambda-5, reason: not valid java name */
    public static final void m77initDataObserver$lambda5(RoomInfoProfileFragment this$0, Boolean isFollow) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(isFollow, "isFollow");
        this$0.setFollowState(isFollow.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initDataObserver$lambda-6, reason: not valid java name */
    public static final void m78initDataObserver$lambda6(RoomInfoProfileFragment this$0, String s) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(s, "s");
        this$0.setRoomHeader(s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initDataObserver$lambda-7, reason: not valid java name */
    public static final void m79initDataObserver$lambda7(RoomInfoProfileFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.tvRoomName;
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initDataObserver$lambda-8, reason: not valid java name */
    public static final void m80initDataObserver$lambda8(RoomInfoProfileFragment this$0, o00OO00O liveDataSource, Integer userIdentity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(liveDataSource, "$liveDataSource");
        Intrinsics.checkNotNullExpressionValue(userIdentity, "userIdentity");
        int iIntValue = userIdentity.intValue();
        this$0.userIdentityInfo = iIntValue;
        if (iIntValue == 1) {
            LinearLayout linearLayout = this$0.llOther;
            if (linearLayout != null) {
                oOO00O.OooO00o(linearLayout);
            }
        } else {
            LinearLayout linearLayout2 = this$0.llOther;
            if (linearLayout2 != null) {
                oOO00O.OooO(linearLayout2);
            }
            if (liveDataSource.OooOOO()) {
                TextView textView = this$0.tvFollow;
                if (textView != null) {
                    oOO00O.OooO00o(textView);
                }
                LinearLayout linearLayout3 = this$0.llJoin;
                if (linearLayout3 != null) {
                    oOO00O.OooO00o(linearLayout3);
                }
                TextView textView2 = this$0.tvJoined;
                if (textView2 != null) {
                    oOO00O.OooO(textView2);
                }
            } else {
                TextView textView3 = this$0.tvFollow;
                if (textView3 != null) {
                    oOO00O.OooO(textView3);
                }
                LinearLayout linearLayout4 = this$0.llJoin;
                if (linearLayout4 != null) {
                    oOO00O.OooO(linearLayout4);
                }
                TextView textView4 = this$0.tvJoined;
                if (textView4 != null) {
                    oOO00O.OooO00o(textView4);
                }
            }
        }
        ImageView imageView = this$0.ivLevelMore;
        if (imageView != null) {
            imageView.setVisibility(o00OO00O.f43313OooooOo.OooO00o().OooOOo0() ? 0 : 8);
        }
        View view = this$0.vLevelClick;
        if (view != null) {
            if (!o00OO00O.f43313OooooOo.OooO00o().OooOOo0()) {
                this$0 = null;
            }
            view.setOnClickListener(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initDataObserver$lambda-9, reason: not valid java name */
    public static final void m81initDataObserver$lambda9(RoomInfoProfileFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FixTextView fixTextView = this$0.tvRoomBroadcast;
        if (fixTextView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = this$0.getString(R.string.title_RoomInfoMenu_normalNotice);
        }
        fixTextView.setText(str);
    }

    private final void initView(View view) {
        XRefreshLayout xRefreshLayout = (XRefreshLayout) view.findViewById(R.id.xrl_dialog_room_profile);
        int i = 0;
        xRefreshLayout.f19541o00O0O = false;
        xRefreshLayout.setNestedScrollingEnabled(false);
        this.vLevelClick = view.findViewById(R.id.layout_room_info_pop_progress_layout);
        this.ivRoomHead = (NetImageView) view.findViewById(R.id.layout_room_info_pop_head_iv);
        this.ivOfficial = (ImageView) view.findViewById(R.id.layout_room_info_pop_official_iv);
        this.ivRoomWarning = (ImageView) view.findViewById(R.id.layout_room_info_pop_warning_iv);
        this.tvRoomSetting = (TextView) view.findViewById(R.id.layout_room_info_pop_setting_iv);
        this.ivRoomSetting = (ImageView) view.findViewById(R.id.iv_room_setting);
        this.tvRedPoint = (TextView) view.findViewById(R.id.tv_red_point);
        this.tvRoomName = (TextView) view.findViewById(R.id.layout_room_info_pop_room_name_tv);
        this.tvRoomId = (TextView) view.findViewById(R.id.layout_room_info_pop_id_tv);
        this.ivLevelMore = (ImageView) view.findViewById(R.id.iv_room_info_pop_level_more);
        this.tvLevelCurrent = (TextView) view.findViewById(R.id.layout_room_info_pop_current_level_tv);
        this.tvLevelNext = (TextView) view.findViewById(R.id.layout_room_info_pop_next_level_tv);
        this.tvProgress = (TextView) view.findViewById(R.id.layout_room_info_pop_progress_tv);
        this.pbRoomLevel = (ProgressBar) view.findViewById(R.id.layout_room_info_pop_progress);
        TextView textView = (TextView) view.findViewById(R.id.tv_profile_room_level_tag);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_profile_room_member_tag);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_profile_room_language_tag);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_profile_room_location_tag);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_profile_room_tags_tag);
        TextView textView6 = (TextView) view.findViewById(R.id.tv_profile_room_broadcast_tag);
        textView.setText(o0O0O00.OooO0oo(getString(R.string.Level), CertificateUtil.DELIMITER));
        textView2.setText(o0O0O00.OooO0oo(getString(R.string.Member), CertificateUtil.DELIMITER));
        textView3.setText(o0O0O00.OooO0oo(getString(R.string.languge), CertificateUtil.DELIMITER));
        textView4.setText(o0O0O00.OooO0oo(getString(R.string.country), CertificateUtil.DELIMITER));
        textView5.setText(o0O0O00.OooO0oo(getString(R.string.tag), CertificateUtil.DELIMITER));
        textView6.setText(o0O0O00.OooO0oo(getString(R.string.Announcement), CertificateUtil.DELIMITER));
        this.tvRoomMember = (TextView) view.findViewById(R.id.layout_room_info_pop_member_tv);
        this.tvRoomLanguage = (TextView) view.findViewById(R.id.layout_room_info_pop_region_tv);
        this.tvRoomLocation = (TextView) view.findViewById(R.id.layout_room_info_pop_location_tv);
        this.tvRoomTag = (TextView) view.findViewById(R.id.layout_room_info_pop_tag_tv);
        this.tvRoomBroadcast = (FixTextView) view.findViewById(R.id.layout_room_info_pop_broadcast_tv);
        this.llOther = (LinearLayout) view.findViewById(R.id.layout_room_info_pop_other_layout);
        this.tvJoinCostBrackets1 = view.findViewById(R.id.tvJoinCostBrackets1);
        this.tvJoinCostBrackets2 = view.findViewById(R.id.tvJoinCostBrackets2);
        this.ivCoin = view.findViewById(R.id.ivCoin);
        TextView textView7 = (TextView) view.findViewById(R.id.tvFollow);
        this.tvFollow = textView7;
        if (textView7 != null) {
            oOO00O.OooO0oO(textView7, new OooO0O0());
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.llJoin);
        this.llJoin = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o00OOooo.o00OOO00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RoomInfoProfileFragment.m82initView$lambda3(view2);
                }
            });
        }
        TextView textView8 = (TextView) view.findViewById(R.id.tvJoined);
        this.tvJoined = textView8;
        if (textView8 != null) {
            textView8.setOnClickListener(new o00OO(this, i));
        }
        this.tvJoinCount = (TextView) view.findViewById(R.id.tvJoinCost);
        this.ivPrettyId = (UserPrettyIdView) view.findViewById(R.id.iv_prettyid);
        TextView textView9 = this.tvRoomId;
        if (textView9 != null) {
            textView9.setOnClickListener(new OooO0OO());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m82initView$lambda3(View view) {
        OooOo.OooO0O0("102047");
        o0O00000.OooO0OO("InRoom_roomProfile_join_page");
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43168OooOooO.setValue(Boolean.TRUE);
        o00o2.OooOoO(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-4, reason: not valid java name */
    public static final void m83initView$lambda4(RoomInfoProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.unJoinRoom();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x007a  */
    private final void setBottomLayout(boolean isMyRoom) {
        TextView textView;
        RoomConfiguration roomConfiguration = this.mRoomConfiguration;
        if (roomConfiguration == null) {
            return;
        }
        if (!isMyRoom) {
            ProgressBar progressBar = this.pbRoomLevel;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView2 = this.tvProgress;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.tvLevelNext;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.tvRoomSetting;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            ImageView imageView = this.ivRoomSetting;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView5 = this.tvRedPoint;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            ImageView imageView2 = this.ivRoomWarning;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.ivRoomWarning;
            if (imageView3 != null) {
                imageView3.setOnClickListener(this);
            }
            LinearLayout linearLayout = this.llOther;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        ProgressBar progressBar2 = this.pbRoomLevel;
        if (progressBar2 != null) {
            Intrinsics.checkNotNull(roomConfiguration);
            progressBar2.setProgress(roomConfiguration.getExperiencePercent());
        }
        ProgressBar progressBar3 = this.pbRoomLevel;
        if (progressBar3 != null) {
            progressBar3.setVisibility(0);
        }
        TextView textView6 = this.tvProgress;
        if (textView6 != null) {
            RoomConfiguration roomConfiguration2 = this.mRoomConfiguration;
            textView6.setText(String.valueOf(roomConfiguration2 != null ? roomConfiguration2.getExperience() : null));
        }
        TextView textView7 = this.tvProgress;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        TextView textView8 = this.tvLevelNext;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        TextView textView9 = this.tvRoomSetting;
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
        ImageView imageView4 = this.ivRoomSetting;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        if (o00O.OooO0O0.f43203OooO00o.OooO0O0() <= 0) {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            if (OooOOO0.OooO0o0().OooOO0O()) {
                TextView textView10 = this.tvRedPoint;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
            } else {
                textView = this.tvRedPoint;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        } else {
            textView = this.tvRedPoint;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
        ImageView imageView5 = this.ivRoomWarning;
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        TextView textView11 = this.tvRoomSetting;
        if (textView11 != null) {
            textView11.setOnClickListener(this);
        }
        ImageView imageView6 = this.ivRoomSetting;
        if (imageView6 != null) {
            imageView6.setOnClickListener(this);
        }
        TextView textView12 = this.tvRedPoint;
        if (textView12 != null) {
            textView12.setOnClickListener(this);
        }
        LinearLayout linearLayout2 = this.llOther;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCenterTextDialog(String type) {
        if (this.mRoomConfiguration == null) {
            return;
        }
        View view = this.mView;
        if (view != null) {
            view.invalidate();
        }
        o000oOoO o000oooo2 = o000oOoO.f31805OooO00o;
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
        this.centerTextDialog = o000oooo2.OooO00o((BaseFragmentActivity) activity, type, null, new OooO0o(type, this));
    }

    private final void setFollowState(boolean isFollow) {
        if (isFollow) {
            TextView textView = this.tvFollow;
            if (textView != null) {
                textView.setText(R.string.Following);
            }
            TextView textView2 = this.tvFollow;
            if (textView2 != null) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_333333));
            }
            TextView textView3 = this.tvFollow;
            if (textView3 != null) {
                textView3.setBackgroundResource(R.drawable.shape_corner_stroke_e8e8e8);
                return;
            }
            return;
        }
        TextView textView4 = this.tvFollow;
        if (textView4 != null) {
            textView4.setText(R.string.Follow);
        }
        TextView textView5 = this.tvFollow;
        if (textView5 != null) {
            textView5.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        }
        TextView textView6 = this.tvFollow;
        if (textView6 != null) {
            textView6.setBackgroundResource(R.drawable.shape_corner_stroke_00d8c9);
        }
    }

    private final void setRoomHeader(String header) {
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0oO());
        oooO00o.f48429OooO0OO = header;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0oO(6);
        oooO00o.OooO0o(this.ivRoomHead);
    }

    private final void showLevelDialog() {
        RoomLoginInformation.RoomBean room;
        RoomLoginInformation.RoomBean room2;
        if (o0000Ooo.OooO00o(getActivity())) {
            o0O00000.OooO0OO("InRoom_roomProfile_level");
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            RoomLoginInformation roomLoginInformation = this.mRoomLoginInformation;
            long id = (roomLoginInformation == null || (room2 = roomLoginInformation.getRoom()) == null) ? 0L : room2.getId();
            RoomLoginInformation roomLoginInformation2 = this.mRoomLoginInformation;
            String name = (roomLoginInformation2 == null || (room = roomLoginInformation2.getRoom()) == null) ? null : room.getName();
            if (name == null) {
                name = "";
            }
            new oO0OOo0o(fragmentActivityRequireActivity, id, name).show();
        }
    }

    private final void showRoomInfo() {
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        this.mRoomConfiguration = oooO00o.OooO00o().f43326OooOO0o.getValue();
        RoomLoginInformation value = oooO00o.OooO00o().f43324OooOO0.getValue();
        this.mRoomLoginInformation = value;
        RoomConfiguration roomConfiguration = this.mRoomConfiguration;
        if (roomConfiguration == null || value == null) {
            return;
        }
        UserPrettyIdView userPrettyIdView = this.ivPrettyId;
        if (userPrettyIdView != null) {
            Intrinsics.checkNotNull(roomConfiguration);
            userPrettyIdView.setRoomPrettyId(roomConfiguration.getIsPrettyBarId());
        }
        ImageView imageView = this.ivOfficial;
        if (imageView != null) {
            RoomConfiguration roomConfiguration2 = this.mRoomConfiguration;
            Intrinsics.checkNotNull(roomConfiguration2);
            imageView.setVisibility(roomConfiguration2.getIsofficial() == 1 ? 0 : 8);
        }
        TextView textView = this.tvRoomId;
        if (textView != null) {
            RoomConfiguration roomConfiguration3 = this.mRoomConfiguration;
            Intrinsics.checkNotNull(roomConfiguration3);
            textView.setText(o0O0O00.OooO0oo("ID:", roomConfiguration3.getBaridx()));
        }
        TextView textView2 = this.tvLevelCurrent;
        if (textView2 != null) {
            RoomConfiguration roomConfiguration4 = this.mRoomConfiguration;
            Intrinsics.checkNotNull(roomConfiguration4);
            textView2.setText(o0O0O00.OooO0oo("LV.", String.valueOf(roomConfiguration4.getBarlevel()), ZegoConstants.ZegoVideoDataAuxPublishingStream));
        }
        TextView textView3 = this.tvLevelNext;
        if (textView3 != null) {
            RoomConfiguration roomConfiguration5 = this.mRoomConfiguration;
            Intrinsics.checkNotNull(roomConfiguration5);
            textView3.setText(o0O0O00.OooO0oo("LV.", String.valueOf(roomConfiguration5.getBarlevel() + 1), ZegoConstants.ZegoVideoDataAuxPublishingStream));
        }
        TextView textView4 = this.tvRoomMember;
        if (textView4 != null) {
            textView4.setText(String.valueOf(o00O.f43140OooO00o.OooO0oo()));
        }
        RoomConfiguration roomConfiguration6 = this.mRoomConfiguration;
        Intrinsics.checkNotNull(roomConfiguration6);
        switch (roomConfiguration6.getRegion()) {
            case 0:
                TextView textView5 = this.tvRoomLanguage;
                if (textView5 != null) {
                    textView5.setText(R.string.English);
                }
                break;
            case 1:
                TextView textView6 = this.tvRoomLanguage;
                if (textView6 != null) {
                    textView6.setText(R.string.Arabic);
                }
                break;
            case 2:
                TextView textView7 = this.tvRoomLanguage;
                if (textView7 != null) {
                    textView7.setText(R.string.Turkish);
                }
                break;
            case 3:
                TextView textView8 = this.tvRoomLanguage;
                if (textView8 != null) {
                    textView8.setText(R.string.Indonesia);
                }
                break;
            case 4:
            default:
                TextView textView9 = this.tvRoomLanguage;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
                break;
            case 5:
                TextView textView10 = this.tvRoomLanguage;
                if (textView10 != null) {
                    textView10.setText(R.string.Portuguese);
                }
                break;
            case 6:
                TextView textView11 = this.tvRoomLanguage;
                if (textView11 != null) {
                    textView11.setText(R.string.Spanish);
                }
                break;
            case 7:
                TextView textView12 = this.tvRoomLanguage;
                if (textView12 != null) {
                    textView12.setText(R.string.Hindi);
                }
                break;
            case 8:
                TextView textView13 = this.tvRoomLanguage;
                if (textView13 != null) {
                    textView13.setText(R.string.Urdu);
                }
                break;
        }
        ApiCountryUtils apiCountryUtils = ApiCountryUtils.INSTANCE;
        RoomConfiguration roomConfiguration7 = this.mRoomConfiguration;
        Intrinsics.checkNotNull(roomConfiguration7);
        CountryModel modelForId = apiCountryUtils.getModelForId(String.valueOf(roomConfiguration7.getCountryid()));
        if (modelForId != null) {
            TextView textView14 = this.tvRoomLocation;
            if (textView14 == null) {
                return;
            }
            textView14.setText(modelForId.getName());
            return;
        }
        TextView textView15 = this.tvRoomLocation;
        if (textView15 != null) {
            textView15.setText(R.string.Space);
        }
    }

    private final void unJoinRoom() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        n1 n1Var = new n1(fragmentActivityRequireActivity);
        this.triangleDialog = n1Var;
        n1Var.show();
        n1 n1Var2 = this.triangleDialog;
        if (n1Var2 != null) {
            OooO onClickListener = new OooO();
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            n1Var2.f46024OoooO0 = onClickListener;
        }
    }

    @Override // o00OOO0.OooO00o, android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        if (this.mRoomConfiguration == null || this.mRoomLoginInformation == null) {
            return;
        }
        switch (id) {
            case R.id.ivFollow /* 2131297654 */:
                if (this.userIdentityInfo != 1) {
                    if (!Intrinsics.areEqual(o00OO00O.f43313OooooOo.OooO00o().f43327OooOOO.getValue(), Boolean.TRUE)) {
                        o0O00000.OooO0OO("InRoom_roomProfile_follow");
                        o0O00000.OooO0OO("InRoom_roomProfile_follow_page");
                        o000O00O.OooO().Oooo0oO();
                    } else {
                        setCenterTextDialog("unFollow");
                    }
                }
                break;
            case R.id.iv_room_setting /* 2131297974 */:
            case R.id.layout_room_info_pop_setting_iv /* 2131298175 */:
            case R.id.tv_red_point /* 2131299934 */:
                if (this.userIdentityInfo == 1) {
                    o0O00000.OooO0OO("InRoom_roomProfile_setting");
                    RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22969o00Ooo;
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    RoomConfiguration roomConfiguration = this.mRoomConfiguration;
                    Intrinsics.checkNotNull(roomConfiguration);
                    oooO00o.OooO00o(fragmentActivityRequireActivity, roomConfiguration.getBarid());
                }
                break;
            case R.id.layout_room_info_pop_progress_layout /* 2131298171 */:
                showLevelDialog();
                break;
            case R.id.layout_room_info_pop_warning_iv /* 2131298178 */:
                List<ReportFromData> lash50RoomChatList = getLash50RoomChatList();
                RoomConfiguration roomConfiguration2 = this.mRoomConfiguration;
                Intrinsics.checkNotNull(roomConfiguration2);
                String barid = roomConfiguration2.getBarid();
                Intrinsics.checkNotNullExpressionValue(barid, "mRoomConfiguration!!.barid");
                o000O.OooO00o(u5.f47570OooO00o, u5.OooO0o(1, com.yalla.support.common.util.OooO.OooO0o(barid), (52 & 4) != 0 ? null : lash50RoomChatList, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = this.mView;
        if (view != null) {
            Intrinsics.checkNotNull(view);
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.mView);
            return this.mView;
        }
        View viewInflate = inflater.inflate(R.layout.fragment_dialog_room_profile, container, false);
        this.mView = viewInflate;
        Intrinsics.checkNotNull(viewInflate);
        initView(viewInflate);
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        initDataObserver(oooO00o.OooO00o());
        showRoomInfo();
        setBottomLayout(oooO00o.OooO00o().OooOOo0());
        return this.mView;
    }

    @Override // o00OOO0.OooO00o, p140o00OOOoO.OooO0o
    public void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> msg) {
        super.onEventMainThread(msg);
        if (msg != null && msg.f31885OooO00o == 57) {
            o000O00O.OooO().f32427Oooo.setWage(0);
            TextView textView = this.tvRedPoint;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Override // o00OOO0.OooO0OO, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO("InRoom_roomProfile");
    }
}
