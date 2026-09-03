package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.SexView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.GuessData;
import com.yalla.yalla.model.GuessUserData;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.room.GuessListVM;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0O0O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.zf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\bH\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/yalla/yalla/ui/fragment/GuessListFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/zf;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onResume", "updateSelfData", "onLazyInit", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "", "giftId", "I", "moraRankType", "Lcom/yalla/yalla/model/GuessUserData;", "selfData", "Lcom/yalla/yalla/model/GuessUserData;", "Lcom/yalla/yalla/ui/vm/room/GuessListVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/room/GuessListVM;", "vm", "<init>", "(Landroid/content/Context;II)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GuessListFragment extends p503o0o00o00.OooO<zf> {
    public static final int $stable = 8;
    private p188o00o00o0.OooO0OO<GuessUserData> adapter;
    private final int giftId;

    @NotNull
    private final Context mContext;
    private final int moraRankType;

    @Nullable
    private GuessUserData selfData;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<GuessUserData> {
        public OooO00o(Context context) {
            super(context, R.layout.room_item_dialog_guess_list);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            GuessUserData guessUserData = (GuessUserData) obj;
            if (oooO0o == null || guessUserData == null) {
                return;
            }
            int num = guessUserData.getNum();
            oooO0o.OooO0oO(R.id.ivRanking, 1 <= num && num < 4);
            int num2 = guessUserData.getNum();
            oooO0o.OooO0oO(R.id.ivRankingFrame, 1 <= num2 && num2 < 4);
            oooO0o.OooO0oO(R.id.tvRanking, guessUserData.getNum() > 3);
            int num3 = guessUserData.getNum();
            if (num3 == 1) {
                ((ImageView) oooO0o.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.user_support_one);
                ((ImageView) oooO0o.OooO0Oo(R.id.ivRankingFrame)).setImageResource(R.drawable.room_dialog_rank_gold);
            } else if (num3 == 2) {
                ((ImageView) oooO0o.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.user_support_two);
                ((ImageView) oooO0o.OooO0Oo(R.id.ivRankingFrame)).setImageResource(R.drawable.user_badge_item_rank_second);
            } else if (num3 != 3) {
                ((TextView) oooO0o.OooO0Oo(R.id.tvRanking)).setText(String.valueOf(guessUserData.getNum()));
            } else {
                ((ImageView) oooO0o.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.user_support_three);
                ((ImageView) oooO0o.OooO0Oo(R.id.ivRankingFrame)).setImageResource(R.drawable.user_badge_item_rank_third);
            }
            ((UserPremiumView) oooO0o.OooO0Oo(R.id.vipView)).OooO0Oo(guessUserData.isPremium(), guessUserData.getPremiumLevel());
            ((SexView) oooO0o.OooO0Oo(R.id.sexView)).setSex(guessUserData.getSex());
            oooO0o.OooOO0(R.id.tvName, guessUserData.getUserName());
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o2.f48429OooO0OO = guessUserData.getUserHeader();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivHeader));
            oooO0o.OooOO0(R.id.tvGiftNumber, String.valueOf(guessUserData.getNumber()));
            ((ImageView) oooO0o.OooO0Oo(R.id.ivType)).setImageResource(GuessListFragment.this.moraRankType == 1 ? R.drawable.room_dialog_guessing_gift : R.drawable.icon_room_bottom_game_box_mora);
        }
    }

    public /* synthetic */ GuessListFragment(Context context, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2);
    }

    private final GuessListVM getVm() {
        return (GuessListVM) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-0, reason: not valid java name */
    public static final void m333onLazyInit$lambda0(GuessListFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        Activity activity = (Activity) this$0.mContext;
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.GuessUserData");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, activity, String.valueOf(((GuessUserData) obj).getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-2, reason: not valid java name */
    public static final void m334onLazyInit$lambda2(GuessListFragment this$0, ApiResult apiResult) {
        List<GuessUserData> rankData;
        GuessUserData guessUserData;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!apiResult.isSuccess()) {
            return;
        }
        GuessData guessData = (GuessData) apiResult.getData();
        GuessUserData selfData = guessData != null ? guessData.getSelfData() : null;
        this$0.selfData = selfData;
        if (selfData != null) {
            selfData.setMoraRankType(this$0.moraRankType);
        }
        GuessData guessData2 = (GuessData) apiResult.getData();
        if (guessData2 == null || (rankData = guessData2.getRankData()) == null) {
            return;
        }
        p188o00o00o0.OooO0OO<GuessUserData> oooO0OO = this$0.adapter;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(rankData);
        p188o00o00o0.OooO0OO<GuessUserData> oooO0OO2 = this$0.adapter;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setLoadComplete();
        int size = rankData.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                if (rankData.size() > 0) {
                    GuessUserData guessUserData2 = this$0.selfData;
                    if (guessUserData2 != null) {
                        int number = rankData.get(rankData.size() - 1).getNumber();
                        GuessUserData guessUserData3 = this$0.selfData;
                        guessUserData2.setDifferenceNumber(number - (guessUserData3 != null ? guessUserData3.getNumber() : 0));
                    }
                } else {
                    this$0.selfData = null;
                }
                LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").post(this$0.selfData);
                return;
            }
            GuessUserData guessUserData4 = this$0.selfData;
            if (guessUserData4 != null && rankData.get(i).getUserId() == guessUserData4.getUserId()) {
                GuessUserData guessUserData5 = this$0.selfData;
                if (guessUserData5 != null) {
                    guessUserData5.setNum(rankData.get(i).getNum());
                }
                if (i > 0 && (guessUserData = this$0.selfData) != null) {
                    guessUserData.setDifferenceNumber(rankData.get(i - 1).getNumber() - rankData.get(i).getNumber());
                }
                LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").post(this$0.selfData);
                return;
            }
            i++;
        }
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        OooO00o oooO00o = new OooO00o(this.mContext);
        this.adapter = oooO00o;
        oooO00o.setEmptyImageRes(R.drawable.room_dialog_guess_list_empty);
        getBinding().f51098OooO0O0.setLayoutManager(new FixLinearLayoutManager(this.mContext));
        RecyclerView recyclerView = getBinding().f51098OooO0O0;
        p188o00o00o0.OooO0OO<GuessUserData> oooO0OO = this.adapter;
        p188o00o00o0.OooO0OO<GuessUserData> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        if (this.mContext instanceof FragmentActivity) {
            p188o00o00o0.OooO0OO<GuessUserData> oooO0OO3 = this.adapter;
            if (oooO0OO3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO2 = oooO0OO3;
            }
            oooO0OO2.setOnItemClickListener(new com.facebook.appevents.ml.OooO(this, 6));
            getVm().getGuessList(this.giftId, this.moraRankType).observe((LifecycleOwner) this.mContext, new o00O0O0O(this, 8));
        }
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        updateSelfData();
    }

    public final void updateSelfData() {
        LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").post(this.selfData);
    }

    public GuessListFragment(@NotNull Context mContext, int i, int i2) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.giftId = i;
        this.moraRankType = i2;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(GuessListVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f23895Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f23895Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$5
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
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public zf getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        zf zfVarInflate = zf.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(zfVarInflate, "inflate(inflater, container, false)");
        return zfVarInflate;
    }
}
