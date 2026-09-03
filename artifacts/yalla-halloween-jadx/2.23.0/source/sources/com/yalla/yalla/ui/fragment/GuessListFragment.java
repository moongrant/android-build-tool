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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.GuessData;
import com.yalla.yalla.model.GuessUserData;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.SexView;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.room.GuessListVM;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0o.o00O0000;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.p8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\bH\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/fragment/GuessListFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/p8;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onResume", "updateSelfData", "onLazyInit", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "", "giftId", "I", "moraRankType", "Lcom/yalla/yalla/model/GuessUserData;", "selfData", "Lcom/yalla/yalla/model/GuessUserData;", "Lcom/yalla/yalla/ui/vm/room/GuessListVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/room/GuessListVM;", "vm", "Lo0oOo0OO/o000O;", "adapter", "Lo0oOo0OO/o000O;", "<init>", "(Landroid/content/Context;II)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGuessListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuessListFragment.kt\ncom/yalla/yalla/ui/fragment/GuessListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,120:1\n106#2,15:121\n*S KotlinDebug\n*F\n+ 1 GuessListFragment.kt\ncom/yalla/yalla/ui/fragment/GuessListFragment\n*L\n34#1:121,15\n*E\n"})
public final class GuessListFragment extends p508o0o0O.OooOO0O<p8> {
    public static final int $stable = 8;
    private p564o0oOo0OO.o000O<GuessUserData> adapter;
    private final int giftId;

    @NotNull
    private final Context mContext;
    private final int moraRankType;

    @Nullable
    private GuessUserData selfData;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO00o extends p564o0oOo0OO.o000O<GuessUserData> {
        public OooO00o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            GuessUserData guessUserData = (GuessUserData) obj;
            if (viewHolder == null || guessUserData == null) {
                return;
            }
            int i = oO00O0oO.ivRanking;
            int num = guessUserData.getNum();
            viewHolder.setGone(i, 1 <= num && num < 4);
            int i2 = oO00O0oO.ivRankingFrame;
            int num2 = guessUserData.getNum();
            viewHolder.setGone(i2, 1 <= num2 && num2 < 4);
            int i3 = oO00O0oO.tvRanking;
            viewHolder.setGone(i3, guessUserData.getNum() > 3);
            int num3 = guessUserData.getNum();
            if (num3 == 1) {
                ((ImageView) viewHolder.getView(i)).setImageResource(oOo00OO0.user_support_one);
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.room_dialog_rank_gold);
            } else if (num3 == 2) {
                ((ImageView) viewHolder.getView(i)).setImageResource(oOo00OO0.user_support_two);
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.user_badge_item_rank_second);
            } else if (num3 != 3) {
                ((TextView) viewHolder.getView(i3)).setText(String.valueOf(guessUserData.getNum()));
            } else {
                ((ImageView) viewHolder.getView(i)).setImageResource(oOo00OO0.user_support_three);
                ((ImageView) viewHolder.getView(i2)).setImageResource(oOo00OO0.user_badge_item_rank_third);
            }
            ((UserPremiumView) viewHolder.getView(oO00O0oO.vipView)).OooO0Oo(guessUserData.getPremiumLevel(), guessUserData.isPremium());
            ((SexView) viewHolder.getView(oO00O0oO.sexView)).setSex(guessUserData.getSex());
            viewHolder.setText(oO00O0oO.tvName, guessUserData.getUserName());
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = guessUserData.getUserHeader();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivHeader));
            viewHolder.setText(oO00O0oO.tvGiftNumber, String.valueOf(guessUserData.getNumber()));
            ((ImageView) viewHolder.getView(oO00O0oO.ivType)).setImageResource(GuessListFragment.this.moraRankType == 1 ? oOo00OO0.room_dialog_guessing_gift : oOo00OO0.icon_room_bottom_game_box_mora);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiResult<GuessData>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<GuessData> apiResult) {
            List<GuessUserData> rankData;
            GuessUserData guessUserData;
            ApiResult<GuessData> apiResult2 = apiResult;
            if (apiResult2.isSuccess()) {
                GuessData data = apiResult2.getData();
                GuessUserData selfData = data != null ? data.getSelfData() : null;
                GuessListFragment guessListFragment = GuessListFragment.this;
                guessListFragment.selfData = selfData;
                GuessUserData guessUserData2 = guessListFragment.selfData;
                if (guessUserData2 != null) {
                    guessUserData2.setMoraRankType(guessListFragment.moraRankType);
                }
                GuessData data2 = apiResult2.getData();
                if (data2 != null && (rankData = data2.getRankData()) != null) {
                    p564o0oOo0OO.o000O o000o = guessListFragment.adapter;
                    if (o000o == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o000o = null;
                    }
                    o000o.OooOoO0(rankData);
                    p564o0oOo0OO.o000O o000o2 = guessListFragment.adapter;
                    if (o000o2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o000o2 = null;
                    }
                    o000o2.Oooo00o();
                    int size = rankData.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            if (rankData.size() > 0) {
                                GuessUserData guessUserData3 = guessListFragment.selfData;
                                if (guessUserData3 != null) {
                                    int number = rankData.get(rankData.size() - 1).getNumber();
                                    GuessUserData guessUserData4 = guessListFragment.selfData;
                                    guessUserData3.setDifferenceNumber(number - (guessUserData4 != null ? guessUserData4.getNumber() : 0));
                                }
                            } else {
                                guessListFragment.selfData = null;
                            }
                            LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").post(guessListFragment.selfData);
                            break;
                        }
                        GuessUserData guessUserData5 = guessListFragment.selfData;
                        if (guessUserData5 != null && rankData.get(i).getUserId() == guessUserData5.getUserId()) {
                            GuessUserData guessUserData6 = guessListFragment.selfData;
                            if (guessUserData6 != null) {
                                guessUserData6.setNum(rankData.get(i).getNum());
                            }
                            if (i > 0 && (guessUserData = guessListFragment.selfData) != null) {
                                guessUserData.setDifferenceNumber(rankData.get(i - 1).getNumber() - rankData.get(i).getNumber());
                            }
                            LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").post(guessListFragment.selfData);
                            break;
                        }
                        i++;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28151OooO0Oo;

        public OooO0OO(OooO0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28151OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28151OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28151OooO0Oo;
        }

        public final int hashCode() {
            return this.f28151OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28151OooO0Oo.invoke(obj);
        }
    }

    public /* synthetic */ GuessListFragment(Context context, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2);
    }

    private final GuessListVM getVm() {
        return (GuessListVM) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLazyInit$lambda$0(GuessListFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        Activity activity = (Activity) this$0.mContext;
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.GuessUserData");
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, activity, String.valueOf(((GuessUserData) obj).getUserId()), false, 12);
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        OooO00o oooO00o = new OooO00o(this.mContext, oO00OO0O.room_item_dialog_guess_list);
        this.adapter = oooO00o;
        oooO00o.OooOooo(oOo00OO0.room_dialog_guess_list_empty);
        getBinding().f58607OooO0O0.setLayoutManager(new FixLinearLayoutManager(this.mContext));
        RecyclerView recyclerView = getBinding().f58607OooO0O0;
        p564o0oOo0OO.o000O<GuessUserData> o000o = this.adapter;
        p564o0oOo0OO.o000O<GuessUserData> o000o2 = null;
        if (o000o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o = null;
        }
        recyclerView.setAdapter(o000o);
        if (this.mContext instanceof FragmentActivity) {
            p564o0oOo0OO.o000O<GuessUserData> o000o3 = this.adapter;
            if (o000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o000o2 = o000o3;
            }
            o000o2.f10098OooO0o = new o00O0000(this);
            getVm().getGuessList(this.giftId, this.moraRankType).observe((LifecycleOwner) this.mContext, new OooO0OO(new OooO0O0()));
        }
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        updateSelfData();
    }

    public final void updateSelfData() {
        LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").post(this.selfData);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$1] */
    public GuessListFragment(@NotNull Context mContext, int i, int i2) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.giftId = i;
        this.moraRankType = i2;
        final ?? r3 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r3.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(GuessListVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28155OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28155OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.GuessListFragment$special$$inlined$viewModels$default$5
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
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public p8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        p8 p8VarInflate = p8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(p8VarInflate, "inflate(inflater, container, false)");
        return p8VarInflate;
    }
}
