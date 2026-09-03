package com.yalla.yalla.ui.fragment;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.CheckUserInRoomModel;
import com.yalla.yalla.model.FriendInRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.ui.vm.message.FriendListVM;
import com.youth.banner.config.BannerConfig;
import java.util.concurrent.CancellationException;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p389o0OOoooO.o00O0OO;
import p519o0o0O0oO.o00O00OO;
import p579o0oOoo.oOO0OOO;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.g5;
import p641o0ooOOOO.l5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0014R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/yalla/yalla/ui/fragment/FriendListFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/g5;", "", "initData", "", ViewHierarchyConstants.TEXT_KEY, "searchFriend", "", "friendCount", "Lkotlin/Pair;", "", "vip", "updateFriendCountTip", "initView", "", "friendId", "enterFriendRoom", "refreshFriendList", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "Lcom/yalla/yalla/ui/vm/message/FriendListVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/message/FriendListVM;", "vm", "Lo0ooOOOO/l5;", "searchHeader", "Lo0ooOOOO/l5;", "Landroidx/recyclerview/widget/ConcatAdapter;", "concatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "Lcom/yalla/yalla/ui/adapter/o000oOoO;", "friendListAdapter", "Lcom/yalla/yalla/ui/adapter/o000oOoO;", "tempFriendCount", "I", "Lkotlinx/coroutines/Job;", "friendListJob", "Lkotlinx/coroutines/Job;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFriendListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendListFragment.kt\ncom/yalla/yalla/ui/fragment/FriendListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,226:1\n106#2,15:227\n*S KotlinDebug\n*F\n+ 1 FriendListFragment.kt\ncom/yalla/yalla/ui/fragment/FriendListFragment\n*L\n47#1:227,15\n*E\n"})
public final class FriendListFragment extends p508o0o0O.OooOO0O<g5> {
    public static final int $stable = 8;

    @NotNull
    private final ConcatAdapter concatAdapter;
    private com.yalla.yalla.ui.adapter.o000oOoO friendListAdapter;

    @Nullable
    private Job friendListJob;
    private l5 searchHeader;
    private int tempFriendCount;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    @SourceDebugExtension({"SMAP\nFriendListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendListFragment.kt\ncom/yalla/yalla/ui/fragment/FriendListFragment$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
    public static final class OooO extends RecyclerView.o00O0O {
        public OooO() {
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
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<CheckUserInRoomModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f28118OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j) {
            super(1);
            this.f28118OooO0o0 = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CheckUserInRoomModel checkUserInRoomModel) {
            CheckUserInRoomModel checkUserInRoomModel2 = checkUserInRoomModel;
            boolean z = true;
            if (checkUserInRoomModel2 != null && checkUserInRoomModel2.getIsinbar()) {
                CheckUserInRoomModel.InRoomInfo data = checkUserInRoomModel2.getData();
                if (data != null) {
                    RoomModel roomModel = new RoomModel();
                    roomModel.setRoomIp(data.getRoomserverip());
                    roomModel.websocketaddr = data.getWebsocketaddr();
                    roomModel.setId(data.getBarid());
                    roomModel.setName(data.getBarname());
                    roomModel.setLevel(String.valueOf(data.getBarlevel()));
                    MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                    p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Message_Friends_InRoom);
                }
            } else {
                FriendListFragment.this.getVm().updateInRoomState(this.f28118OooO0o0);
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.notinroom);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Object> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            com.yalla.yalla.ui.adapter.o000oOoO o000oooo2 = FriendListFragment.this.friendListAdapter;
            if (o000oooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
                o000oooo2 = null;
            }
            o000oooo2.notifyDataSetChanged();
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Unit> {
        public OooO0OO() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            int iIntValue = it.intValue();
            FriendListFragment friendListFragment = FriendListFragment.this;
            friendListFragment.tempFriendCount = iIntValue;
            int iIntValue2 = it.intValue();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            friendListFragment.updateFriendCountTip(iIntValue2, (Pair) p464o0Oooo.o000000O.OooOO0o().getValue());
            l5 l5Var = null;
            if (it.intValue() > 0) {
                friendListFragment.getBinding().f57969OooO0o0.OooO0Oo();
                l5 l5Var2 = friendListFragment.searchHeader;
                if (l5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    l5Var = l5Var2;
                }
                FrameLayout frameLayout = l5Var.f58333OooO00o;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "searchHeader.root");
                com.code.android.util.o000OO00.OooOOOO(frameLayout);
            } else {
                l5 l5Var3 = friendListFragment.searchHeader;
                if (l5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    l5Var = l5Var3;
                }
                FrameLayout frameLayout2 = l5Var.f58333OooO00o;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "searchHeader.root");
                com.code.android.util.o000OO00.OooO0O0(frameLayout2);
                friendListFragment.getBinding().f57969OooO0o0.OooO0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {
        public OooO0o() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
            FriendListFragment friendListFragment = FriendListFragment.this;
            int i = friendListFragment.tempFriendCount;
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            friendListFragment.updateFriendCountTip(i, (Pair) p464o0Oooo.o000000O.OooOO0o().getValue());
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFriendListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendListFragment.kt\ncom/yalla/yalla/ui/fragment/FriendListFragment$initView$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendInfo>, View, Integer, Unit> {
        public OooOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(p400o0Oo0OO.OooOO0O<FriendInfo> oooOO0O, View view, Integer num) {
            p400o0Oo0OO.OooOO0O<FriendInfo> adapter = oooOO0O;
            View itemView = view;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            o0OO000.OooO00o("204015");
            FriendListFragment friendListFragment = FriendListFragment.this;
            FragmentActivity activity = friendListFragment.getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
            }
            com.yalla.yalla.ui.adapter.o000oOoO o000oooo2 = friendListFragment.friendListAdapter;
            if (o000oooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
                o000oooo2 = null;
            }
            friendListFragment.enterFriendRoom(o000oooo2.getData(iIntValue).getFriend().getFriendId());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f28123OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                o0OO000.OooO00o("104014");
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFriendListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendListFragment.kt\ncom/yalla/yalla/ui/fragment/FriendListFragment$initView$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
    public static final class OooOOO extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendInfo>, View, Integer, Unit> {
        public OooOOO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(p400o0Oo0OO.OooOO0O<FriendInfo> oooOO0O, View view, Integer num) {
            p400o0Oo0OO.OooOO0O<FriendInfo> adapter = oooOO0O;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            FriendListFragment friendListFragment = FriendListFragment.this;
            l5 l5Var = friendListFragment.searchHeader;
            if (l5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                l5Var = null;
            }
            Editable text = l5Var.f58334OooO0O0.getEditSearch().getText();
            if (text == null || StringsKt.isBlank(text)) {
                o0OO000.OooO00o("204014");
            } else {
                o0OO000.OooO00o("104031");
            }
            FragmentActivity activity = friendListFragment.getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
            }
            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, friendListFragment.requireActivity(), String.valueOf(adapter.getData(iIntValue).getFriend().getFriendId()), false, 12);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<String, Unit> {
        public OooOOO0() {
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

    public static final class OooOOOO extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendInfo>, View, Integer, Boolean> {
        public OooOOOO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Boolean invoke(p400o0Oo0OO.OooOO0O<FriendInfo> oooOO0O, View view, Integer num) {
            final p400o0Oo0OO.OooOO0O<FriendInfo> adapter = oooOO0O;
            View itemView = view;
            final int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            o0OO000.OooO00o("104032");
            FriendListFragment friendListFragment = FriendListFragment.this;
            final FragmentActivity activity = friendListFragment.getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
                final o00O00OO o00o00oo2 = new o00O00OO(activity, 0);
                View.inflate(friendListFragment.getContext(), oO00OO0O.item_dialog_friend_remark, o00o00oo2.f52533OooO0o).findViewById(oO00O0oO.tvItem).setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o000oOoO
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String userName;
                        p400o0Oo0OO.OooOO0O adapter2 = adapter;
                        Intrinsics.checkNotNullParameter(adapter2, "$adapter");
                        FragmentActivity context = activity;
                        Intrinsics.checkNotNullParameter(context, "$it");
                        o00O00OO dialog = o00o00oo2;
                        Intrinsics.checkNotNullParameter(dialog, "$dialog");
                        o0OO000.OooO00o("104033");
                        UserInfoModel userInfo = new UserInfoModel();
                        FriendInfo friendInfo = (FriendInfo) adapter2.getData(iIntValue);
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        userInfo.setUserId(userInfo2 != null ? userInfo2.getUserId() : 0L);
                        String memoName = friendInfo.getFriend().getMemoName();
                        String str = "";
                        if (memoName == null) {
                            memoName = "";
                        }
                        userInfo.setMemoName(memoName);
                        UserInfo userInfo3 = friendInfo.getUserInfo();
                        if (userInfo3 != null && (userName = userInfo3.getUserName()) != null) {
                            str = userName;
                        }
                        userInfo.setUserName(str);
                        int i = UserInfoEditRemarkActivity.f27323OooOo0o;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                        Intent intent = new Intent(context, (Class<?>) UserInfoEditRemarkActivity.class);
                        intent.putExtra("user", userInfo);
                        context.startActivity(intent);
                        dialog.OooO0O0();
                    }
                });
                o00o00oo2.OooO();
            }
            return Boolean.TRUE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiResult<FriendInRoomModel>, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<FriendInRoomModel> apiResult) {
            ApiResult<FriendInRoomModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            FriendListFragment.this.getBinding().f57968OooO0Oo.setLoadComplete(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<Integer, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            ImageView imageView = FriendListFragment.this.getBinding().f57966OooO0O0;
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            imageView.setImageResource(oOOOOo0O.OooO0OO(it.intValue()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.FriendListFragment$searchFriend$1", f = "FriendListFragment.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f28129OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FriendListFragment f28130OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f28131OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.FriendListFragment$searchFriend$1$1", f = "FriendListFragment.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f28132OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ String f28133OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f28134OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ FriendListFragment f28135OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str, FriendListFragment friendListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f28133OooO0o = str;
                this.f28135OooO0oO = friendListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f28133OooO0o, this.f28135OooO0oO, continuation);
                oooO00o.f28134OooO0o0 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(androidx.paging.o0OOO0o<FriendInfo> o0ooo0o2, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f28132OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f28134OooO0o0;
                    boolean zIsBlank = StringsKt.isBlank(this.f28133OooO0o);
                    com.yalla.yalla.ui.adapter.o000oOoO o000oooo2 = null;
                    FriendListFragment friendListFragment = this.f28135OooO0oO;
                    if (zIsBlank) {
                        l5 l5Var = friendListFragment.searchHeader;
                        if (l5Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                            l5Var = null;
                        }
                        TextView textView = l5Var.f58335OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(textView, "searchHeader.tvFriendNum");
                        com.code.android.util.o000OO00.OooOOOO(textView);
                    } else {
                        l5 l5Var2 = friendListFragment.searchHeader;
                        if (l5Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                            l5Var2 = null;
                        }
                        TextView textView2 = l5Var2.f58335OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(textView2, "searchHeader.tvFriendNum");
                        com.code.android.util.o000OO00.OooO0O0(textView2);
                    }
                    com.yalla.yalla.ui.adapter.o000oOoO o000oooo3 = friendListFragment.friendListAdapter;
                    if (o000oooo3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
                    } else {
                        o000oooo2 = o000oooo3;
                    }
                    this.f28132OooO0Oo = 1;
                    if (o000oooo2.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
        public Oooo0(String str, FriendListFragment friendListFragment, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f28131OooO0o0 = str;
            this.f28130OooO0o = friendListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f28131OooO0o0, this.f28130OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28129OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO000.OooO00o("204019");
                String str = this.f28131OooO0o0;
                boolean zIsBlank = StringsKt.isBlank(str);
                FriendListFragment friendListFragment = this.f28130OooO0o;
                Flow<androidx.paging.o0OOO0o<FriendInfo>> flowLoadFriendInfoList = zIsBlank ? friendListFragment.getVm().loadFriendInfoList() : friendListFragment.getVm().searchFriendAsFlow(str);
                OooO00o oooO00o = new OooO00o(str, friendListFragment, null);
                this.f28129OooO0Oo = 1;
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

    public static final class Oooo000 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28136OooO0Oo;

        public Oooo000(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28136OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28136OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28136OooO0Oo;
        }

        public final int hashCode() {
            return this.f28136OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28136OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$1] */
    public FriendListFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(FriendListVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28140OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28140OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.FriendListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.concatAdapter = new ConcatAdapter(new RecyclerView.Adapter[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enterFriendRoom(long friendId) {
        getVm().loadUserInRoomInfo(friendId).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO00o(friendId), null, null, false, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FriendListVM getVm() {
        return (FriendListVM) this.vm.getValue();
    }

    private final void initData() {
        refreshFriendList();
        LiveEventBus.get("Friend_Remark").observe(getViewLifecycleOwner(), new OooO0O0());
        getVm().loadFriendCount().observe(getViewLifecycleOwner(), new Oooo000(new OooO0OO()));
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        p464o0Oooo.o000000O.OooOO0o().observe(getViewLifecycleOwner(), new Oooo000(new OooO0o()));
        searchFriend("");
    }

    private final void initView() {
        getBinding().f57969OooO0o0.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.nulldata_friend));
        getBinding().f57969OooO0o0.setEmptyImage(oOo00OO0.ic_empty_friends);
        getBinding().f57967OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f57967OooO0OO.addOnScrollListener(new OooO());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        this.friendListAdapter = new com.yalla.yalla.ui.adapter.o000oOoO(contextRequireContext, viewLifecycleOwner);
        l5 l5VarInflate = l5.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(l5VarInflate, "inflate(layoutInflater)");
        this.searchHeader = l5VarInflate;
        com.yalla.yalla.ui.adapter.o000oOoO o000oooo2 = null;
        if (l5VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            l5VarInflate = null;
        }
        FrameLayout frameLayout = l5VarInflate.f58333OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "searchHeader.root");
        this.concatAdapter.OooO0O0(new p400o0Oo0OO.OooOOOO(frameLayout));
        ConcatAdapter concatAdapter = this.concatAdapter;
        com.yalla.yalla.ui.adapter.o000oOoO o000oooo3 = this.friendListAdapter;
        if (o000oooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            o000oooo3 = null;
        }
        concatAdapter.OooO0O0(o000oooo3);
        getBinding().f57967OooO0OO.setAdapter(this.concatAdapter);
        RecyclerView recyclerView = getBinding().f57967OooO0OO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
        oOO0OOO.OooO0O0(recyclerView, (15 & 1) != 0 ? 100L : 0L, 0L, (15 & 4) != 0 ? 100L : 0L, (15 & 8) != 0 ? 100L : 0L);
        RefreshLayout refreshLayout = getBinding().f57968OooO0Oo;
        refreshLayout.f21350OoooOo0 = new o00O0OO() { // from class: com.yalla.yalla.ui.fragment.Oooo0
            @Override // p389o0OOoooO.o00O0OO
            public final void OooO00o(SmartRefreshLayout smartRefreshLayout) {
                FriendListFragment.initView$lambda$0(this.f28238OooO0Oo, smartRefreshLayout);
            }
        };
        refreshLayout.f21330OooOooO = true;
        com.yalla.yalla.ui.adapter.o000oOoO o000oooo4 = this.friendListAdapter;
        if (o000oooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            o000oooo4 = null;
        }
        OooOO0 listener = new OooOO0();
        o000oooo4.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oooo4.f44447OooOO0o = listener;
        com.yalla.yalla.ui.adapter.o000oOoO o000oooo5 = this.friendListAdapter;
        if (o000oooo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            o000oooo5 = null;
        }
        o000oooo5.OooO0Oo(oO00O0oO.iv_room);
        l5 l5Var = this.searchHeader;
        if (l5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            l5Var = null;
        }
        l5Var.f58334OooO0O0.setEditFocusListener(OooOO0O.f28123OooO0Oo);
        l5 l5Var2 = this.searchHeader;
        if (l5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            l5Var2 = null;
        }
        l5Var2.f58334OooO0O0.setSearchTextChangedListener(new OooOOO0());
        com.yalla.yalla.ui.adapter.o000oOoO o000oooo6 = this.friendListAdapter;
        if (o000oooo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            o000oooo6 = null;
        }
        OooOOO listener2 = new OooOOO();
        o000oooo6.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o000oooo6.f44446OooOO0O = listener2;
        com.yalla.yalla.ui.adapter.o000oOoO o000oooo7 = this.friendListAdapter;
        if (o000oooo7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
        } else {
            o000oooo2 = o000oooo7;
        }
        OooOOOO listener3 = new OooOOOO();
        o000oooo2.getClass();
        Intrinsics.checkNotNullParameter(listener3, "listener");
        o000oooo2.f44449OooOOO0 = listener3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(FriendListFragment this$0, o0OO0o.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.refreshFriendList();
    }

    private final void refreshFriendList() {
        getVm().loadFriendInRoomList().observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(null, null, new OooOo(), false, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchFriend(String text) {
        Job job = this.friendListJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        com.yalla.yalla.ui.adapter.o000oOoO o000oooo2 = this.friendListAdapter;
        if (o000oooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
            o000oooo2 = null;
        }
        o000oooo2.getClass();
        Intrinsics.checkNotNullParameter(text, "value");
        com.yalla.yalla.ui.adapter.o0OoOo0.OooO00o oooO00o = com.yalla.yalla.ui.adapter.o0OoOo0.f27671OooO00o;
        oooO00o.f27672OooO00o = true ^ StringsKt.isBlank(text);
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        oooO00o.f27673OooO0O0 = text;
        o000oooo2.f27567OooOOoo = text;
        this.friendListJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new Oooo0(text, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    public final void updateFriendCountTip(int friendCount, Pair<Boolean, Integer> vip) {
        int i;
        boolean z = false;
        if (vip != null && vip.getFirst().booleanValue()) {
            z = true;
        }
        if (z) {
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
        l5 l5Var = this.searchHeader;
        l5 l5Var2 = null;
        if (l5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            l5Var = null;
        }
        l5Var.f58335OooO0OO.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.friends_total_label) + friendCount + "/" + i);
        if (friendCount > i) {
            l5 l5Var3 = this.searchHeader;
            if (l5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                l5Var2 = l5Var3;
            }
            TextView textView = l5Var2.f58335OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "searchHeader.tvFriendNum");
            com.code.android.util.o000.OooO0O0(textView, com.code.android.util.o0000.OooO00o(oO00O0o.theme_ff5b48), String.valueOf(friendCount));
        }
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MutableLiveData<Integer> mutableLiveData = p427o0OoOO00.OooOo.f45669OooO00o;
        p427o0OoOO00.OooOo.f45669OooO00o.observe(getViewLifecycleOwner(), new Oooo000(new OooOo00()));
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public g5 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        g5 g5VarInflate = g5.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(g5VarInflate, "inflate(inflater, container, false)");
        return g5VarInflate;
    }
}
