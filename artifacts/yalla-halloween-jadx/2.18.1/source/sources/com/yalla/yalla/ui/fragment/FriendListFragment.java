package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.RoomModel;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.CheckUserInRoomModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.FriendInRoomModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.FriendListVM;
import com.youth.banner.config.BannerConfig;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0O0ooO;
import p143o00OOooo.o00O0;
import p143o00OOooo.o00O0O00;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p407o0Oo0OOo.oO000Oo;
import p464o0Ooo0oO.o0000O0O;
import p502o0o00o0.o00000O;
import p566o0oOo00O.oO00000o;
import p649o0ooOOoo.ec;
import p649o0ooOOoo.zb;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0014R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/fragment/FriendListFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/zb;", "", "initData", "", ViewHierarchyConstants.TEXT_KEY, "searchFriend", "", "friendCount", "Lkotlin/Pair;", "", "vip", "updateFriendCountTip", "initView", "", "friendId", "enterFriendRoom", "refreshFriendList", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/message/FriendListVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/message/FriendListVM;", "vm", "Landroidx/recyclerview/widget/ConcatAdapter;", "concatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "tempFriendCount", "I", "Lkotlinx/coroutines/Job;", "friendListJob", "Lkotlinx/coroutines/Job;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class FriendListFragment extends p503o0o00o00.OooO<zb> {
    public static final int $stable = 8;

    @NotNull
    private final ConcatAdapter concatAdapter;
    private p563o0oOo0.oo0o0Oo friendListAdapter;

    @Nullable
    private Job friendListJob;
    private ec searchHeader;
    private int tempFriendCount;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<String, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            FriendListFragment.this.searchFriend(StringsKt.trim((CharSequence) it).toString());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<CheckUserInRoomModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f23868Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j) {
            super(1);
            this.f23868Oooo0oO = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CheckUserInRoomModel checkUserInRoomModel) {
            CheckUserInRoomModel checkUserInRoomModel2 = checkUserInRoomModel;
            if (checkUserInRoomModel2 != null && checkUserInRoomModel2.getIsinbar()) {
                CheckUserInRoomModel.InRoomInfo data = checkUserInRoomModel2.getData();
                if (data != null) {
                    RoomModel roomModel = new RoomModel();
                    roomModel.setRoomIp(data.getRoomserverip());
                    roomModel.setId(data.getBarid());
                    roomModel.setName(data.getBarname());
                    roomModel.setLevel(String.valueOf(data.getBarlevel()));
                    RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Message_Friends_InRoom);
                }
            } else {
                FriendListFragment.this.getVm().updateInRoomState(this.f23868Oooo0oO);
                ToastUtil.f12567OooO00o.OooO00o(R.string.notinroom);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends RecyclerView.o00O0O {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            FragmentActivity activity;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 1 || (activity = FriendListFragment.this.getActivity()) == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(activity, "activity");
            Object systemService = activity.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            View viewFindViewById = activity.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<p464o0Ooo0oO.o0000O0O<FriendInfo>, View, Integer, Unit> {
        public OooO0OO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(p464o0Ooo0oO.o0000O0O<FriendInfo> o0000o0o2, View view, Integer num) {
            p464o0Ooo0oO.o0000O0O<FriendInfo> adapter = o0000o0o2;
            View itemView = view;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            o0O00000.OooO0OO("Message_fiends_room");
            FragmentActivity activity = FriendListFragment.this.getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                View viewFindViewById = activity.findViewById(android.R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
            }
            p563o0oOo0.oo0o0Oo oo0o0oo = FriendListFragment.this.friendListAdapter;
            if (oo0o0oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
                oo0o0oo = null;
            }
            FriendListFragment.this.enterFriendRoom(oo0o0oo.getData(iIntValue).getFriend().getFriendId());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f23871Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                o0O00000.OooO0OO("Message_search");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<p464o0Ooo0oO.o0000O0O<FriendInfo>, View, Integer, Unit> {
        public OooOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(p464o0Ooo0oO.o0000O0O<FriendInfo> o0000o0o2, View view, Integer num) {
            p464o0Ooo0oO.o0000O0O<FriendInfo> adapter = o0000o0o2;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            o0O00000.OooO0OO("Message_friends_details");
            FragmentActivity activity = FriendListFragment.this.getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                View viewFindViewById = activity.findViewById(android.R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
            }
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            FragmentActivity fragmentActivityRequireActivity = FriendListFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            UserInfoActivity.OooO00o.OooO0Oo(oooO00o, fragmentActivityRequireActivity, String.valueOf(adapter.getData(iIntValue).getFriend().getFriendId()), false, 12);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function3<p464o0Ooo0oO.o0000O0O<FriendInfo>, View, Integer, Boolean> {
        public OooOO0O() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Boolean invoke(p464o0Ooo0oO.o0000O0O<FriendInfo> o0000o0o2, View view, Integer num) {
            final p464o0Ooo0oO.o0000O0O<FriendInfo> adapter = o0000o0o2;
            View itemView = view;
            final int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            final FragmentActivity activity = FriendListFragment.this.getActivity();
            if (activity != null) {
                FriendListFragment friendListFragment = FriendListFragment.this;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                View viewFindViewById = activity.findViewById(android.R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
                final p502o0o00o0.o00000O o00000o = new p502o0o00o0.o00000O(activity, 0);
                View.inflate(friendListFragment.getContext(), R.layout.item_dialog_friend_remark, o00000o.f41545Oooo0oo).findViewById(R.id.tvItem).setOnClickListener(new View.OnClickListener() { // from class: o0oOoOoO.z1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String userName;
                        o0000O0O adapter2 = adapter;
                        int i = iIntValue;
                        FragmentActivity it = activity;
                        o00000O dialog = o00000o;
                        Intrinsics.checkNotNullParameter(adapter2, "$adapter");
                        Intrinsics.checkNotNullParameter(it, "$it");
                        Intrinsics.checkNotNullParameter(dialog, "$dialog");
                        UserInfoModel userInfoModel = new UserInfoModel();
                        FriendInfo friendInfo = (FriendInfo) adapter2.getData(i);
                        UserInfo userInfo = friendInfo.getUserInfo();
                        userInfoModel.setUserId(userInfo != null ? userInfo.getUserId() : 0L);
                        String memoName = friendInfo.getFriend().getMemoName();
                        String str = "";
                        if (memoName == null) {
                            memoName = "";
                        }
                        userInfoModel.setMemoName(memoName);
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        if (userInfo2 != null && (userName = userInfo2.getUserName()) != null) {
                            str = userName;
                        }
                        userInfoModel.setUserName(str);
                        UserInfoEditRemarkActivity.f23529OooooOO.OooO00o(it, userInfoModel);
                        dialog.OooO0O0();
                    }
                });
                o00000o.OooOO0();
            }
            return Boolean.TRUE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.FriendListFragment$searchFriend$1", f = "FriendListFragment.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f23874Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f23875Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ FriendListFragment f23876Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.FriendListFragment$searchFriend$1$1", f = "FriendListFragment.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ FriendListFragment f23877Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f23878Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f23879Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ String f23880Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str, FriendListFragment friendListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f23880Oooo0oo = str;
                this.f23877Oooo = friendListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f23880Oooo0oo, this.f23877Oooo, continuation);
                oooO00o.f23879Oooo0oO = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0O0ooO<FriendInfo> o0o0ooo, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f23878Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO o0o0ooo = (o0O0ooO) this.f23879Oooo0oO;
                    p563o0oOo0.oo0o0Oo oo0o0oo = null;
                    if (StringsKt.isBlank(this.f23880Oooo0oo)) {
                        ec ecVar = this.f23877Oooo.searchHeader;
                        if (ecVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                            ecVar = null;
                        }
                        TextView textView = ecVar.f49242OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(textView, "searchHeader.tvFriendNum");
                        oOO00O.OooO(textView);
                    } else {
                        ec ecVar2 = this.f23877Oooo.searchHeader;
                        if (ecVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                            ecVar2 = null;
                        }
                        TextView textView2 = ecVar2.f49242OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(textView2, "searchHeader.tvFriendNum");
                        oOO00O.OooO00o(textView2);
                    }
                    p563o0oOo0.oo0o0Oo oo0o0oo2 = this.f23877Oooo.friendListAdapter;
                    if (oo0o0oo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
                    } else {
                        oo0o0oo = oo0o0oo2;
                    }
                    this.f23878Oooo0o = 1;
                    if (oo0o0oo.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(String str, FriendListFragment friendListFragment, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f23875Oooo0oO = str;
            this.f23876Oooo0oo = friendListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f23875Oooo0oO, this.f23876Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23874Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<o0O0ooO<FriendInfo>> flowLoadFriendInfoList = StringsKt.isBlank(this.f23875Oooo0oO) ? this.f23876Oooo0oo.getVm().loadFriendInfoList() : this.f23876Oooo0oo.getVm().searchFriendAsFlow(this.f23875Oooo0oO);
                OooO00o oooO00o = new OooO00o(this.f23875Oooo0oO, this.f23876Oooo0oo, null);
                this.f23874Oooo0o = 1;
                if (FlowKt.collectLatest(flowLoadFriendInfoList, oooO00o, this) == coroutine_suspended) {
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

    public static final class OooOOO0 extends Lambda implements Function1<ApiResult<FriendInRoomModel>, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<FriendInRoomModel> apiResult) {
            ApiResult<FriendInRoomModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            FriendListFragment.this.getBinding().f51072OooO0OO.setLoadComplete(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    public FriendListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(FriendListVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23885Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f23885Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.concatAdapter = new ConcatAdapter(new RecyclerView.Adapter[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enterFriendRoom(long friendId) {
        getVm().loadUserInRoomInfo(friendId).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO00o(friendId), null, null, false, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FriendListVM getVm() {
        return (FriendListVM) this.vm.getValue();
    }

    private final void initData() {
        refreshFriendList();
        LiveEventBus.get("Friend_Remark").observe(getViewLifecycleOwner(), new p501o0o00o.o0000OO0(this, 6));
        getVm().loadFriendCount().observe(getViewLifecycleOwner(), new o00O0(this, 4));
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().observe(getViewLifecycleOwner(), new o00O0O00(this, 5));
        searchFriend("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-0, reason: not valid java name */
    public static final void m329initData$lambda0(FriendListFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p563o0oOo0.oo0o0Oo oo0o0oo = this$0.friendListAdapter;
        if (oo0o0oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            oo0o0oo = null;
        }
        oo0o0oo.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-1, reason: not valid java name */
    public static final void m330initData$lambda1(FriendListFragment this$0, Integer it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.tempFriendCount = it.intValue();
        this$0.updateFriendCountTip(it.intValue(), p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue());
        ec ecVar = null;
        if (it.intValue() > 0) {
            this$0.getBinding().f51073OooO0Oo.OooO0Oo();
            ec ecVar2 = this$0.searchHeader;
            if (ecVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                ecVar = ecVar2;
            }
            FrameLayout frameLayout = ecVar.f49240OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "searchHeader.root");
            oOO00O.OooO(frameLayout);
            return;
        }
        ec ecVar3 = this$0.searchHeader;
        if (ecVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
        } else {
            ecVar = ecVar3;
        }
        FrameLayout frameLayout2 = ecVar.f49240OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "searchHeader.root");
        oOO00O.OooO00o(frameLayout2);
        this$0.getBinding().f51073OooO0Oo.OooO0o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-2, reason: not valid java name */
    public static final void m331initData$lambda2(FriendListFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateFriendCountTip(this$0.tempFriendCount, p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue());
    }

    private final void initView() {
        getBinding().f51073OooO0Oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.nulldata_friend));
        getBinding().f51073OooO0Oo.setEmptyImage(R.drawable.ic_empty_friends);
        getBinding().f51071OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f51071OooO0O0.addOnScrollListener(new OooO0O0());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        this.friendListAdapter = new p563o0oOo0.oo0o0Oo(contextRequireContext, viewLifecycleOwner);
        ec ecVarInflate = ec.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ecVarInflate, "inflate(layoutInflater)");
        this.searchHeader = ecVarInflate;
        p563o0oOo0.oo0o0Oo oo0o0oo = null;
        if (ecVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ecVarInflate = null;
        }
        FrameLayout frameLayout = ecVarInflate.f49240OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "searchHeader.root");
        this.concatAdapter.OooO0O0(new p464o0Ooo0oO.o0000OO0(frameLayout));
        ConcatAdapter concatAdapter = this.concatAdapter;
        p563o0oOo0.oo0o0Oo oo0o0oo2 = this.friendListAdapter;
        if (oo0o0oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            oo0o0oo2 = null;
        }
        concatAdapter.OooO0O0(oo0o0oo2);
        getBinding().f51071OooO0O0.setAdapter(this.concatAdapter);
        RecyclerView recyclerView = getBinding().f51071OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
        p516o0o0O000.o00000.OooO0O0(recyclerView, (11 & 1) != 0 ? 100L : 0L, 0L, (11 & 4) != 0 ? 100L : 0L, (11 & 8) != 0 ? 100L : 0L);
        getBinding().f51072OooO0OO.Oooo0O0(new oO00000o(this));
        p563o0oOo0.oo0o0Oo oo0o0oo3 = this.friendListAdapter;
        if (oo0o0oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            oo0o0oo3 = null;
        }
        OooO0OO listener = new OooO0OO();
        Objects.requireNonNull(oo0o0oo3);
        Intrinsics.checkNotNullParameter(listener, "listener");
        oo0o0oo3.f40457OooOO0o = listener;
        p563o0oOo0.oo0o0Oo oo0o0oo4 = this.friendListAdapter;
        if (oo0o0oo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            oo0o0oo4 = null;
        }
        oo0o0oo4.OooO0OO(R.id.iv_room);
        ec ecVar = this.searchHeader;
        if (ecVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ecVar = null;
        }
        ecVar.f49241OooO0O0.setEditFocusListener(OooO0o.f23871Oooo0o);
        ec ecVar2 = this.searchHeader;
        if (ecVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ecVar2 = null;
        }
        ecVar2.f49241OooO0O0.setSearchTextChangedListener(new OooO());
        p563o0oOo0.oo0o0Oo oo0o0oo5 = this.friendListAdapter;
        if (oo0o0oo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            oo0o0oo5 = null;
        }
        OooOO0 listener2 = new OooOO0();
        Objects.requireNonNull(oo0o0oo5);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        oo0o0oo5.f40456OooOO0O = listener2;
        p563o0oOo0.oo0o0Oo oo0o0oo6 = this.friendListAdapter;
        if (oo0o0oo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
        } else {
            oo0o0oo = oo0o0oo6;
        }
        OooOO0O listener3 = new OooOO0O();
        Objects.requireNonNull(oo0o0oo);
        Intrinsics.checkNotNullParameter(listener3, "listener");
        oo0o0oo.f40459OooOOO0 = listener3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m332initView$lambda3(FriendListFragment this$0, oO000Oo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.refreshFriendList();
    }

    private final void refreshFriendList() {
        getVm().loadFriendInRoomList().observe(getViewLifecycleOwner(), new o0o0000.OooOo(null, null, new OooOOO0(), false, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchFriend(String text) {
        Job job = this.friendListJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        p563o0oOo0.oo0o0Oo oo0o0oo = this.friendListAdapter;
        if (oo0o0oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            oo0o0oo = null;
        }
        Objects.requireNonNull(oo0o0oo);
        Intrinsics.checkNotNullParameter(text, "value");
        o0oOo0.o0O0O00.OooO00o oooO00o = p563o0oOo0.o0O0O00.f45094OooO00o;
        oooO00o.f45095OooO00o = true ^ StringsKt.isBlank(text);
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        oooO00o.f45096OooO0O0 = text;
        oo0o0oo.f45117OooOOoo = text;
        this.friendListJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOOO(text, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    private final void updateFriendCountTip(int friendCount, Pair<Boolean, Integer> vip) {
        int i;
        if (vip != null && vip.getFirst().booleanValue()) {
            int iIntValue = vip.getSecond().intValue();
            if (iIntValue > 500) {
                iIntValue = 500;
            }
            if (iIntValue == 200) {
                i = BannerConfig.LOOP_TIME;
            } else if (iIntValue == 300) {
                i = 3500;
            } else if (iIntValue == 400) {
                i = 4000;
            } else if (iIntValue != 500) {
                i = 2500;
            } else {
                i = 4500;
            }
        } else {
            i = 2500;
        }
        ec ecVar = this.searchHeader;
        ec ecVar2 = null;
        if (ecVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ecVar = null;
        }
        ecVar.f49242OooO0OO.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.friends_total_label) + friendCount + '/' + i);
        if (friendCount > i) {
            ec ecVar3 = this.searchHeader;
            if (ecVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                ecVar2 = ecVar3;
            }
            TextView textView = ecVar2.f49242OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "searchHeader.tvFriendNum");
            com.yalla.support.common.util.Oooo0.OooO0O0(textView, p254o00ooO0O.o000O0O0.OooO00o(R.color.theme_ff5b48), String.valueOf(friendCount));
        }
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public zb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        zb zbVarInflate = zb.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(zbVarInflate, "inflate(inflater, container, false)");
        return zbVarInflate;
    }
}
