package com.yalla.yalla.ui.fragment.room;

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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.ReportFromData;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserPrettyIdView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p472o0OoooO.oo0OOoo;
import p474o0OoooOO.oo0oO0;
import p532o0o0OOOO.o0O0o000;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OO00O;
import p577o0oOoOOO.f;
import p593o0oOoooO.h0;
import p645o0ooOOO0.o0O0O0Oo;
import p675oO0Oo.d3;
import p675oO0Oo.h6;
import p675oO0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0001qB\u0007¢\u0006\u0004\bn\u0010oJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u000bH\u0002J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001fH\u0002R\u0018\u0010(\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00107\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0018\u00108\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0018\u0010=\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010>\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010;R\u0018\u0010?\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0018\u0010@\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010;R\u0018\u0010E\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010;R\u0018\u0010F\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010;R\u0018\u0010G\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010;R\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010O\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010;R\u0018\u0010P\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010;R\u0018\u0010Q\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010;R\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010)R\u0018\u0010\\\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010;R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010)R\u0018\u0010a\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010)R\u0018\u0010b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010)R\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010e\u001a\u0004\bk\u0010l¨\u0006r"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomInfoProfileFragment;", "Lcom/yalla/yalla/base/fragment/OooO00o;", "Landroid/view/View$OnClickListener;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onResume", "v", "onClick", "Lo0oO0O00/OooOOO;", "msg", "onEventMainThread", "", "Lcom/yalla/yalla/model/ReportFromData;", "getLash50RoomChatList", "showLevelDialog", ViewHierarchyConstants.VIEW_KEY, "initView", "Lcom/yalla/yalla/service/room/OooO0O0;", "liveDataSource", "initDataObserver", "changeDialogState", "", "header", "setRoomHeader", "", "isFollow", "setFollowState", "unJoinRoom", "type", "setCenterTextDialog", "showRoomInfo", "isMyRoom", "setBottomLayout", "mView", "Landroid/view/View;", "Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation;", "mRoomLoginInformation", "Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation;", "Lcom/yalla/yalla/mixedroom/model/RoomConfiguration;", "mRoomConfiguration", "Lcom/yalla/yalla/mixedroom/model/RoomConfiguration;", "Lcom/yalla/netimage/NetImageView;", "ivRoomHead", "Lcom/yalla/netimage/NetImageView;", "Landroid/widget/ImageView;", "ivOfficial", "Landroid/widget/ImageView;", "ivRoomWarning", "ivRoomSetting", "ivLevelMore", "Landroid/widget/TextView;", "tvRoomName", "Landroid/widget/TextView;", "tvRoomId", "tvRoomSetting", "tvLevelCurrent", "tvLevelNext", "tvProgress", "Landroid/widget/ProgressBar;", "pbRoomLevel", "Landroid/widget/ProgressBar;", "tvRoomMember", "tvRoomLanguage", "tvRoomLocation", "tvRoomTag", "Lcom/yalla/yalla/ui/view/FixTextView;", "tvRoomBroadcast", "Lcom/yalla/yalla/ui/view/FixTextView;", "Landroid/widget/LinearLayout;", "llOther", "Landroid/widget/LinearLayout;", "llJoin", "tvFollow", "tvJoined", "tvJoinCount", "LoO0Oo/h6;", "triangleDialog", "LoO0Oo/h6;", "Landroidx/compose/runtime/MutableState;", "centerTextDialog", "Landroidx/compose/runtime/MutableState;", "", "userIdentityInfo", "I", "vLevelClick", "tvRedPoint", "Lcom/yalla/yalla/ui/view/UserPrettyIdView;", "ivPrettyId", "Lcom/yalla/yalla/ui/view/UserPrettyIdView;", "tvJoinCostBrackets1", "tvJoinCostBrackets2", "ivCoin", "Lcom/yalla/yalla/ui/vm/LiveRoomVM;", "liveRoomVM$delegate", "Lkotlin/Lazy;", "getLiveRoomVM", "()Lcom/yalla/yalla/ui/vm/LiveRoomVM;", "liveRoomVM", "Lo0oOoOOO/f;", "loadingVM$delegate", "getLoadingVM", "()Lo0oOoOOO/f;", "loadingVM", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomInfoProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomInfoProfileFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoProfileFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,559:1\n172#2,9:560\n172#2,9:569\n1855#3,2:578\n*S KotlinDebug\n*F\n+ 1 RoomInfoProfileFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoProfileFragment\n*L\n104#1:560,9\n105#1:569,9\n164#1:578,2\n*E\n"})
public final class RoomInfoProfileFragment extends com.yalla.yalla.base.fragment.OooO00o {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private MutableState<Boolean> centerTextDialog;

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
    private h6 triangleDialog;

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
    private final Lazy liveRoomVM = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(LiveRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f28511OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28511OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$3
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
    private final Lazy loadingVM = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(f.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$5

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f28515OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28515OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$special$$inlined$activityViewModels$default$6
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

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.service.room.OooO0O0 f28495OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(com.yalla.yalla.service.room.OooO0O0 oooO0O0) {
            super(1);
            this.f28495OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            Intrinsics.checkNotNull(num2);
            int iIntValue = num2.intValue();
            RoomInfoProfileFragment roomInfoProfileFragment = RoomInfoProfileFragment.this;
            roomInfoProfileFragment.userIdentityInfo = iIntValue;
            if (roomInfoProfileFragment.userIdentityInfo == 1) {
                LinearLayout linearLayout = roomInfoProfileFragment.llOther;
                if (linearLayout != null) {
                    o000O.OooO0O0(linearLayout);
                }
            } else {
                LinearLayout linearLayout2 = roomInfoProfileFragment.llOther;
                if (linearLayout2 != null) {
                    o000O.OooOOOO(linearLayout2);
                }
                if (this.f28495OooO0o0.OooOO0O()) {
                    TextView textView = roomInfoProfileFragment.tvFollow;
                    if (textView != null) {
                        o000O.OooO0O0(textView);
                    }
                    LinearLayout linearLayout3 = roomInfoProfileFragment.llJoin;
                    if (linearLayout3 != null) {
                        o000O.OooO0O0(linearLayout3);
                    }
                    TextView textView2 = roomInfoProfileFragment.tvJoined;
                    if (textView2 != null) {
                        o000O.OooOOOO(textView2);
                    }
                } else {
                    TextView textView3 = roomInfoProfileFragment.tvFollow;
                    if (textView3 != null) {
                        o000O.OooOOOO(textView3);
                    }
                    LinearLayout linearLayout4 = roomInfoProfileFragment.llJoin;
                    if (linearLayout4 != null) {
                        o000O.OooOOOO(linearLayout4);
                    }
                    TextView textView4 = roomInfoProfileFragment.tvJoined;
                    if (textView4 != null) {
                        o000O.OooO0O0(textView4);
                    }
                }
            }
            ImageView imageView = roomInfoProfileFragment.ivLevelMore;
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
            if (imageView != null) {
                imageView.setVisibility(oooO00o.OooO00o().OooOOO() ? 0 : 8);
            }
            View view = roomInfoProfileFragment.vLevelClick;
            if (view != null) {
                if (!oooO00o.OooO00o().OooOOO()) {
                    roomInfoProfileFragment = null;
                }
                view.setOnClickListener(roomInfoProfileFragment);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            RoomInfoProfileFragment.this.setFollowState(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            RoomInfoProfileFragment.this.setRoomHeader(str);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            TextView textView = RoomInfoProfileFragment.this.tvRoomName;
            if (textView != null) {
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText(str2);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment$initDataObserver$5", f = "RoomInfoProfileFragment.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f28499OooO0Oo;

        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RoomInfoProfileFragment f28501OooO0Oo;

            public OooO00o(RoomInfoProfileFragment roomInfoProfileFragment) {
                this.f28501OooO0Oo = roomInfoProfileFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                String string = (String) obj;
                RoomInfoProfileFragment roomInfoProfileFragment = this.f28501OooO0Oo;
                FixTextView fixTextView = roomInfoProfileFragment.tvRoomBroadcast;
                if (fixTextView != null) {
                    if (TextUtils.isEmpty(string)) {
                        string = roomInfoProfileFragment.getString(o000OOo.title_RoomInfoMenu_normalNotice);
                    }
                    fixTextView.setText(string);
                }
                return Unit.INSTANCE;
            }
        }

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RoomInfoProfileFragment.this.new OooOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28499OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<String> mutableStateFlow = com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.f48426OooO0o;
                OooO00o oooO00o = new OooO00o(RoomInfoProfileFragment.this);
                this.f28499OooO0Oo = 1;
                if (mutableStateFlow.collect(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Integer, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            RoomInfoProfileFragment roomInfoProfileFragment = RoomInfoProfileFragment.this;
            if (num2 != null && num2.intValue() == 0) {
                View view = roomInfoProfileFragment.tvJoinCostBrackets1;
                if (view != null) {
                    o000O.OooO0O0(view);
                }
                View view2 = roomInfoProfileFragment.tvJoinCostBrackets2;
                if (view2 != null) {
                    o000O.OooO0O0(view2);
                }
                TextView textView = roomInfoProfileFragment.tvJoinCount;
                if (textView != null) {
                    o000O.OooO0O0(textView);
                }
                View view3 = roomInfoProfileFragment.ivCoin;
                if (view3 != null) {
                    o000O.OooO0O0(view3);
                }
            } else {
                TextView textView2 = roomInfoProfileFragment.tvJoinCount;
                Intrinsics.checkNotNull(textView2);
                textView2.setText(String.valueOf(num2));
                View view4 = roomInfoProfileFragment.tvJoinCostBrackets1;
                if (view4 != null) {
                    o000O.OooOOOO(view4);
                }
                View view5 = roomInfoProfileFragment.tvJoinCostBrackets2;
                if (view5 != null) {
                    o000O.OooOOOO(view5);
                }
                TextView textView3 = roomInfoProfileFragment.tvJoinCount;
                if (textView3 != null) {
                    o000O.OooOOOO(textView3);
                }
                View view6 = roomInfoProfileFragment.ivCoin;
                if (view6 != null) {
                    o000O.OooOOOO(view6);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Boolean value = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24553OooOO0O.getValue();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(value, bool)) {
                com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.f48490OooOoO.setValue(bool);
            } else {
                RoomInfoProfileFragment roomInfoProfileFragment = RoomInfoProfileFragment.this;
                FragmentActivity activity = roomInfoProfileFragment.getActivity();
                if (activity != null) {
                    f.OooO0O0(roomInfoProfileFragment.getLoadingVM());
                    roomInfoProfileFragment.getLiveRoomVM().followRoom(true).observe(activity, new OooOo00(new Oooo0(roomInfoProfileFragment)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<CategoryModel, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CategoryModel categoryModel) {
            CategoryModel categoryModel2 = categoryModel;
            String str = categoryModel2 != null ? categoryModel2.labelname : null;
            RoomInfoProfileFragment roomInfoProfileFragment = RoomInfoProfileFragment.this;
            if (str != null) {
                TextView textView = roomInfoProfileFragment.tvRoomTag;
                if (textView != null) {
                    textView.setText(categoryModel2.labelname);
                }
            } else {
                TextView textView2 = roomInfoProfileFragment.tvRoomTag;
                if (textView2 != null) {
                    textView2.setText("");
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomInfoProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomInfoProfileFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoProfileFragment$initView$4\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,559:1\n37#2,2:560\n*S KotlinDebug\n*F\n+ 1 RoomInfoProfileFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoProfileFragment$initView$4\n*L\n274#1:560,2\n*E\n"})
    public static final class OooOOOO extends oo0OOoo {
        public OooOOOO() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            h0.OooO0O0("102155");
            RoomInfoProfileFragment roomInfoProfileFragment = RoomInfoProfileFragment.this;
            Context context = roomInfoProfileFragment.getContext();
            Intrinsics.checkNotNull(context);
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            TextView textView = roomInfoProfileFragment.tvRoomId;
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Yalla", ((String[]) StringsKt__StringsKt.split$default(String.valueOf(textView != null ? textView.getText() : null), new String[]{"ID:"}, false, 0, 6, (Object) null).toArray(new String[0]))[1]));
            String strOooO0OO = o0000.OooO0OO(o000OOo.UserInfo_Clip_cpoied);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f28506OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomInfoProfileFragment f28507OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RoomInfoProfileFragment roomInfoProfileFragment, String str) {
            super(0);
            this.f28506OooO0Oo = str;
            this.f28507OooO0o0 = roomInfoProfileFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String str = this.f28506OooO0Oo;
            int iHashCode = str.hashCode();
            if (iHashCode != -1298587734) {
                RoomInfoProfileFragment roomInfoProfileFragment = this.f28507OooO0o0;
                if (iHashCode != -841454749) {
                    if (iHashCode == 613961165 && str.equals("unJoin&unFollow")) {
                        h0.OooO0O0("102313");
                        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                        String userid = String.valueOf(oo0oO0.OooOOo0().getValue());
                        Intrinsics.checkNotNullParameter(userid, "userid");
                        Intrinsics.checkNotNullParameter("1", "followtype");
                        RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                        if (roomLiveService != null) {
                            roomLiveService.OooO0oO(10022, "{\"userid\":" + userid + ",\"followtype\":1}");
                        }
                        RoomConfiguration roomConfiguration = roomInfoProfileFragment.mRoomConfiguration;
                        Intrinsics.checkNotNull(roomConfiguration);
                        roomConfiguration.setIsfollow(0);
                    }
                } else if (str.equals("unJoin")) {
                    oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                    String userid2 = String.valueOf(oo0oO0.OooOOo0().getValue());
                    Intrinsics.checkNotNullParameter(userid2, "userid");
                    Intrinsics.checkNotNullParameter(AppEventsConstants.EVENT_PARAM_VALUE_NO, "followtype");
                    RoomLiveService roomLiveService2 = RoomLiveService.f24604OooOo00;
                    if (roomLiveService2 != null) {
                        roomLiveService2.OooO0oO(10022, "{\"userid\":" + userid2 + ",\"followtype\":0}");
                    }
                    RoomConfiguration roomConfiguration2 = roomInfoProfileFragment.mRoomConfiguration;
                    Intrinsics.checkNotNull(roomConfiguration2);
                    roomConfiguration2.setIsfollow(1);
                }
            } else if (str.equals("unFollow")) {
                h0.OooO0O0("202014");
                MixedRoomDataSource.OooO0o0().OooOo0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28508OooO0Oo;

        public OooOo00(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28508OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28508OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28508OooO0Oo;
        }

        public final int hashCode() {
            return this.f28508OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28508OooO0Oo.invoke(obj);
        }
    }

    public static final class Oooo000 implements h6.OooO00o {
        public Oooo000() {
        }

        @Override // oO0Oo.h6.OooO00o
        public final void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            int id = v.getId();
            int i = p565o0oOo000.o0Oo0oo.un_join;
            RoomInfoProfileFragment roomInfoProfileFragment = RoomInfoProfileFragment.this;
            if (id == i) {
                h0.OooO0O0("102173");
                h0.OooO0O0("102310");
                com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.f48487OooOo00.setValue(Boolean.TRUE);
            } else {
                h0.OooO0O0("102312");
                roomInfoProfileFragment.setCenterTextDialog("unJoin&unFollow");
            }
            h6 h6Var = roomInfoProfileFragment.triangleDialog;
            Intrinsics.checkNotNull(h6Var);
            h6Var.dismiss();
        }
    }

    private final void changeDialogState() {
        MutableState<Boolean> mutableState;
        int i = this.userIdentityInfo;
        if (i != 0) {
            if (i != 3 || (mutableState = this.centerTextDialog) == null || mutableState == null) {
                return;
            }
            mutableState.setValue(Boolean.FALSE);
            return;
        }
        h6 h6Var = this.triangleDialog;
        if (h6Var != null) {
            h6Var.dismiss();
        }
        MutableState<Boolean> mutableState2 = this.centerTextDialog;
        if (mutableState2 == null) {
            return;
        }
        mutableState2.setValue(Boolean.FALSE);
    }

    private final List<ReportFromData> getLash50RoomChatList() {
        int type;
        MutableStateFlow<Long> userId;
        long jLongValue;
        ArrayList<ChatModel> arrayList;
        FragmentActivity activity = getActivity();
        MixedRoomActivity mixedRoomActivity = activity instanceof MixedRoomActivity ? (MixedRoomActivity) activity : null;
        Object objClone = (mixedRoomActivity == null || (arrayList = mixedRoomActivity.f22973OooOoo.f50664OooO0o0) == null) ? null : arrayList.clone();
        List<ChatModel> list = objClone instanceof List ? (List) objClone : null;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            int i = 0;
            for (ChatModel chatModel : list) {
                if (i != 50 && ((type = chatModel.getType()) == 0 || type == 7)) {
                    ReportFromData reportFromData = new ReportFromData(0L, 0L, null, 0L, 0, 0, 0L, 127, null);
                    RoomUserInfoModel newFrom = chatModel.getNewFrom();
                    if (newFrom != null && (userId = newFrom.getUserId()) != null) {
                        long jLongValue2 = userId.getValue().longValue();
                        RoomUserInfoModel newFrom2 = chatModel.getNewFrom();
                        Intrinsics.checkNotNull(newFrom2);
                        reportFromData.setPrettyId(o000000.OooO0o(newFrom2.getUserIdx().getValue()));
                        reportFromData.setUserId(jLongValue2);
                        reportFromData.setContent(chatModel.getMessage());
                        reportFromData.setSendTime(chatModel.getPlayTime());
                        reportFromData.setType(chatModel.getType() == 7 ? 1 : 0);
                        Long value = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24547OooO0Oo.getValue();
                        if (value == null) {
                            jLongValue = 0;
                        } else {
                            Intrinsics.checkNotNull(value);
                            jLongValue = value.longValue();
                        }
                        reportFromData.setRoomId(jLongValue);
                        arrayList2.add(reportFromData);
                        i++;
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
    public final f getLoadingVM() {
        return (f) this.loadingVM.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    private final void initDataObserver(com.yalla.yalla.service.room.OooO0O0 liveDataSource) {
        liveDataSource.f24553OooOO0O.observe(getViewLifecycleOwner(), new OooOo00(new OooO0O0()));
        liveDataSource.f24544OooO00o.observe(getViewLifecycleOwner(), new OooOo00(new OooO0OO()));
        liveDataSource.f24545OooO0O0.observe(getViewLifecycleOwner(), new OooOo00(new OooO0o()));
        liveDataSource.f24554OooOO0o.observe(getViewLifecycleOwner(), new OooOo00(new OooO(liveDataSource)));
        com.code.android.util.OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this), new OooOO0(null));
        liveDataSource.f24560OooOOo0.observe(getViewLifecycleOwner(), new OooOo00(new OooOO0O()));
        liveDataSource.f24559OooOOo.observe(getViewLifecycleOwner(), new OooOo00(new OooOOO0()));
    }

    private final void initView(View view) {
        XRefreshLayout xRefreshLayout = (XRefreshLayout) view.findViewById(p565o0oOo000.o0Oo0oo.xrl_dialog_room_profile);
        xRefreshLayout.f20862OooOooO = false;
        xRefreshLayout.setNestedScrollingEnabled(false);
        this.vLevelClick = view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_progress_layout);
        this.ivRoomHead = (NetImageView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_head_iv);
        this.ivOfficial = (ImageView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_official_iv);
        this.ivRoomWarning = (ImageView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_warning_iv);
        this.tvRoomSetting = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_setting_iv);
        this.ivRoomSetting = (ImageView) view.findViewById(p565o0oOo000.o0Oo0oo.iv_room_setting);
        this.tvRedPoint = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tv_red_point);
        this.tvRoomName = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_room_name_tv);
        this.tvRoomId = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_id_tv);
        this.ivLevelMore = (ImageView) view.findViewById(p565o0oOo000.o0Oo0oo.iv_room_info_pop_level_more);
        this.tvLevelCurrent = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_current_level_tv);
        this.tvLevelNext = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_next_level_tv);
        this.tvProgress = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_progress_tv);
        this.pbRoomLevel = (ProgressBar) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_progress);
        TextView textView = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tv_profile_room_level_tag);
        TextView textView2 = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tv_profile_room_member_tag);
        TextView textView3 = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tv_profile_room_language_tag);
        TextView textView4 = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tv_profile_room_location_tag);
        TextView textView5 = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tv_profile_room_tags_tag);
        TextView textView6 = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tv_profile_room_broadcast_tag);
        textView.setText(p595o0oo0.OooOo00.OooO0oO(getString(o000OOo.Level), CertificateUtil.DELIMITER));
        textView2.setText(p595o0oo0.OooOo00.OooO0oO(getString(o000OOo.Member), CertificateUtil.DELIMITER));
        textView3.setText(p595o0oo0.OooOo00.OooO0oO(getString(o000OOo.languge), CertificateUtil.DELIMITER));
        textView4.setText(p595o0oo0.OooOo00.OooO0oO(getString(o000OOo.country), CertificateUtil.DELIMITER));
        textView5.setText(p595o0oo0.OooOo00.OooO0oO(getString(o000OOo.tag), CertificateUtil.DELIMITER));
        textView6.setText(p595o0oo0.OooOo00.OooO0oO(getString(o000OOo.Announcement), CertificateUtil.DELIMITER));
        this.tvRoomMember = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_member_tv);
        this.tvRoomLanguage = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_region_tv);
        this.tvRoomLocation = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_location_tv);
        this.tvRoomTag = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_tag_tv);
        this.tvRoomBroadcast = (FixTextView) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_broadcast_tv);
        this.llOther = (LinearLayout) view.findViewById(p565o0oOo000.o0Oo0oo.layout_room_info_pop_other_layout);
        this.tvJoinCostBrackets1 = view.findViewById(p565o0oOo000.o0Oo0oo.tvJoinCostBrackets1);
        this.tvJoinCostBrackets2 = view.findViewById(p565o0oOo000.o0Oo0oo.tvJoinCostBrackets2);
        this.ivCoin = view.findViewById(p565o0oOo000.o0Oo0oo.ivCoin);
        TextView textView7 = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tvFollow);
        this.tvFollow = textView7;
        if (textView7 != null) {
            o000O.OooO(textView7, new OooOOO());
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(p565o0oOo000.o0Oo0oo.llJoin);
        this.llJoin = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new p531o0o0OOO0.o0000());
        }
        TextView textView8 = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tvJoined);
        this.tvJoined = textView8;
        if (textView8 != null) {
            textView8.setOnClickListener(new View.OnClickListener() { // from class: o0o0OOO0.o0000O00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RoomInfoProfileFragment.initView$lambda$4(this.f53317OooO0Oo, view2);
                }
            });
        }
        this.tvJoinCount = (TextView) view.findViewById(p565o0oOo000.o0Oo0oo.tvJoinCost);
        this.ivPrettyId = (UserPrettyIdView) view.findViewById(p565o0oOo000.o0Oo0oo.iv_prettyid);
        TextView textView9 = this.tvRoomId;
        if (textView9 != null) {
            textView9.setOnClickListener(new OooOOOO());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(View view) {
        h0.OooO0O0("102047");
        p482o0o000O.o00Oo0 o00oo1 = com.yalla.yalla.service.room.OooO00o.f24532OooOOOO;
        o00oo1.f48492OooOoOO.setValue(Boolean.TRUE);
        o00oo1.OooO0oO(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(RoomInfoProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.unJoinRoom();
    }

    private final void setBottomLayout(boolean isMyRoom) {
        RoomConfiguration roomConfiguration = this.mRoomConfiguration;
        if (roomConfiguration == null) {
            return;
        }
        if (!isMyRoom) {
            ProgressBar progressBar = this.pbRoomLevel;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.tvProgress;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.tvLevelNext;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.tvRoomSetting;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            ImageView imageView = this.ivRoomSetting;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView4 = this.tvRedPoint;
            if (textView4 != null) {
                textView4.setVisibility(8);
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
        TextView textView5 = this.tvProgress;
        if (textView5 != null) {
            RoomConfiguration roomConfiguration2 = this.mRoomConfiguration;
            textView5.setText(String.valueOf(roomConfiguration2 != null ? roomConfiguration2.getExperience() : null));
        }
        TextView textView6 = this.tvProgress;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        TextView textView7 = this.tvLevelNext;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        TextView textView8 = this.tvRoomSetting;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        ImageView imageView4 = this.ivRoomSetting;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        if (com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.OooO0o() > 0 || !p417o0Oo0oO0.o00Oo0.OooO0o0().OooOO0O() || p417o0Oo0oO0.o00Oo0.OooO0o0().OooOO0o()) {
            TextView textView9 = this.tvRedPoint;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
        } else {
            TextView textView10 = this.tvRedPoint;
            if (textView10 != null) {
                textView10.setVisibility(8);
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
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
        this.centerTextDialog = o0O0OO0.OooO00o((BaseFragmentActivity) activity, type, null, new OooOo(this, type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFollowState(boolean isFollow) {
        if (isFollow) {
            TextView textView = this.tvFollow;
            if (textView != null) {
                textView.setText(o000OOo.Following);
            }
            TextView textView2 = this.tvFollow;
            if (textView2 != null) {
                textView2.setTextColor(o0000.OooO00o(p565o0oOo000.o0ooOOo.color_333333));
            }
            TextView textView3 = this.tvFollow;
            if (textView3 != null) {
                textView3.setBackgroundResource(p565o0oOo000.o0OOO0o.shape_corner_stroke_e8e8e8);
                return;
            }
            return;
        }
        TextView textView4 = this.tvFollow;
        if (textView4 != null) {
            textView4.setText(o000OOo.Follow);
        }
        TextView textView5 = this.tvFollow;
        if (textView5 != null) {
            textView5.setTextColor(o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
        }
        TextView textView6 = this.tvFollow;
        if (textView6 != null) {
            textView6.setBackgroundResource(p565o0oOo000.o0OOO0o.shape_corner_stroke_00d8c9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRoomHeader(String header) {
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(getContext());
        oooO00o.OooO00o(o0O0O0Oo.OooO0o0());
        oooO00o.f43127OooO0OO = p405o0Oo0OO.OooO0OO.OooO00o(header);
        oooO00o.f43125OooO00o = 0;
        oooO00o.OooO0o0(6);
        oooO00o.OooO0Oo(this.ivRoomHead);
    }

    private final void showLevelDialog() {
        String name;
        RoomLoginInformation.RoomBean room;
        RoomLoginInformation.RoomBean room2;
        if (com.code.android.util.OooO0OO.OooO00o(getActivity())) {
            h0.OooO0O0("102154");
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            RoomLoginInformation roomLoginInformation = this.mRoomLoginInformation;
            long id = (roomLoginInformation == null || (room2 = roomLoginInformation.getRoom()) == null) ? 0L : room2.getId();
            RoomLoginInformation roomLoginInformation2 = this.mRoomLoginInformation;
            if (roomLoginInformation2 == null || (room = roomLoginInformation2.getRoom()) == null || (name = room.getName()) == null) {
                name = "";
            }
            new d3(fragmentActivityRequireActivity, id, name).show();
        }
    }

    private final void showRoomInfo() {
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
        this.mRoomConfiguration = oooO00o.OooO00o().f24543OooO.getValue();
        RoomLoginInformation value = oooO00o.OooO00o().f24551OooO0oo.getValue();
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
            textView.setText(p595o0oo0.OooOo00.OooO0oO("ID:", roomConfiguration3.getBaridx()));
        }
        TextView textView2 = this.tvLevelCurrent;
        if (textView2 != null) {
            RoomConfiguration roomConfiguration4 = this.mRoomConfiguration;
            Intrinsics.checkNotNull(roomConfiguration4);
            textView2.setText(p595o0oo0.OooOo00.OooO0oO("LV.", String.valueOf(roomConfiguration4.getBarlevel()), ZegoConstants.ZegoVideoDataAuxPublishingStream));
        }
        TextView textView3 = this.tvLevelNext;
        if (textView3 != null) {
            RoomConfiguration roomConfiguration5 = this.mRoomConfiguration;
            Intrinsics.checkNotNull(roomConfiguration5);
            textView3.setText(p595o0oo0.OooOo00.OooO0oO("LV.", String.valueOf(roomConfiguration5.getBarlevel() + 1), ZegoConstants.ZegoVideoDataAuxPublishingStream));
        }
        TextView textView4 = this.tvRoomMember;
        if (textView4 != null) {
            textView4.setText(String.valueOf(com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.OooO0o0()));
        }
        RoomConfiguration roomConfiguration6 = this.mRoomConfiguration;
        Intrinsics.checkNotNull(roomConfiguration6);
        switch (roomConfiguration6.getRegion()) {
            case 0:
                TextView textView5 = this.tvRoomLanguage;
                if (textView5 != null) {
                    textView5.setText(o000OOo.English);
                }
                break;
            case 1:
                TextView textView6 = this.tvRoomLanguage;
                if (textView6 != null) {
                    textView6.setText(o000OOo.Arabic);
                }
                break;
            case 2:
                TextView textView7 = this.tvRoomLanguage;
                if (textView7 != null) {
                    textView7.setText(o000OOo.Turkish);
                }
                break;
            case 3:
                TextView textView8 = this.tvRoomLanguage;
                if (textView8 != null) {
                    textView8.setText(o000OOo.Indonesia);
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
                    textView10.setText(o000OOo.Portuguese);
                }
                break;
            case 6:
                TextView textView11 = this.tvRoomLanguage;
                if (textView11 != null) {
                    textView11.setText(o000OOo.Spanish);
                }
                break;
            case 7:
                TextView textView12 = this.tvRoomLanguage;
                if (textView12 != null) {
                    textView12.setText(o000OOo.Hindi);
                }
                break;
            case 8:
                TextView textView13 = this.tvRoomLanguage;
                if (textView13 != null) {
                    textView13.setText(o000OOo.Urdu);
                }
                break;
        }
        HashMap<String, CountryModel> map = com.yalla.yalla.app.golbalData.OooO00o.f22261OooO00o;
        RoomConfiguration roomConfiguration7 = this.mRoomConfiguration;
        Intrinsics.checkNotNull(roomConfiguration7);
        CountryModel countryModelOooO00o = com.yalla.yalla.app.golbalData.OooO00o.OooO00o(String.valueOf(roomConfiguration7.getCountryid()));
        if (countryModelOooO00o != null) {
            TextView textView14 = this.tvRoomLocation;
            if (textView14 == null) {
                return;
            }
            textView14.setText(countryModelOooO00o.getName());
            return;
        }
        TextView textView15 = this.tvRoomLocation;
        if (textView15 != null) {
            textView15.setText(o000OOo.Space);
        }
    }

    private final void unJoinRoom() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        h6 h6Var = new h6(fragmentActivityRequireActivity);
        this.triangleDialog = h6Var;
        h6Var.show();
        h6 h6Var2 = this.triangleDialog;
        if (h6Var2 != null) {
            Oooo000 onClickListener = new Oooo000();
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            h6Var2.f59223OooO = onClickListener;
        }
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        if (this.mRoomConfiguration == null || this.mRoomLoginInformation == null) {
            return;
        }
        if (id == p565o0oOo000.o0Oo0oo.layout_room_info_pop_warning_iv) {
            List<ReportFromData> lash50RoomChatList = getLash50RoomChatList();
            RoomConfiguration roomConfiguration = this.mRoomConfiguration;
            Intrinsics.checkNotNull(roomConfiguration);
            o0O0o000.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(1, com.code.android.util.o0OoOo0.OooO(0L, roomConfiguration.getBarid()), (244 & 4) != 0 ? null : lash50RoomChatList, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            return;
        }
        if (id == p565o0oOo000.o0Oo0oo.layout_room_info_pop_setting_iv || id == p565o0oOo000.o0Oo0oo.iv_room_setting || id == p565o0oOo000.o0Oo0oo.tv_red_point) {
            if (this.userIdentityInfo == 1) {
                h0.OooO0O0("102156");
                int i = RoomSettingActivity.f26193Oooo00O;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                RoomConfiguration roomConfiguration2 = this.mRoomConfiguration;
                Intrinsics.checkNotNull(roomConfiguration2);
                RoomSettingActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, roomConfiguration2.getBarid());
                return;
            }
            return;
        }
        if (id != p565o0oOo000.o0Oo0oo.ivFollow) {
            if (id == p565o0oOo000.o0Oo0oo.layout_room_info_pop_progress_layout) {
                showLevelDialog();
            }
        } else if (this.userIdentityInfo != 1) {
            if (Intrinsics.areEqual(com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24553OooOO0O.getValue(), Boolean.TRUE)) {
                setCenterTextDialog("unFollow");
            } else {
                h0.OooO0O0("102164");
                MixedRoomDataSource.OooO0o0().OooOo0();
            }
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
        View viewInflate = inflater.inflate(o0OO00O.fragment_dialog_room_profile, container, false);
        this.mView = viewInflate;
        Intrinsics.checkNotNull(viewInflate);
        initView(viewInflate);
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
        initDataObserver(oooO00o.OooO00o());
        showRoomInfo();
        setBottomLayout(oooO00o.OooO00o().OooOOO());
        return this.mView;
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, p548o0oO0O00.OooOOOO
    public void onEventMainThread(@Nullable p548o0oO0O00.OooOOO<?> msg) {
        super.onEventMainThread(msg);
        if (msg != null && msg.f55803OooO00o == 57) {
            MixedRoomDataSource.OooO0o0().f22996OooO0o.setWage(0);
            TextView textView = this.tvRedPoint;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Override // com.yalla.yalla.base.fragment.OooO0OO, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
