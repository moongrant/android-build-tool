package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.SearchRecommendModel;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserVipView;
import com.yalla.yalla.ui.view.UserWealthTagView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class SearchFriendHotAdapter extends RecyclerView.Adapter<SearchFriendHotViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27451OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Context f27452OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public SearchRecommendModel f27453OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function3<? super View, ? super Integer, ? super UserInfo, Unit> f27454OooO0Oo;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/adapter/SearchFriendHotAdapter$SearchFriendHotViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "Lcom/yalla/netimage/NetImageView;", "head", "Lcom/yalla/netimage/NetImageView;", "getHead", "()Lcom/yalla/netimage/NetImageView;", "Lcom/yalla/yalla/ui/view/UserPremiumView;", "vip", "Lcom/yalla/yalla/ui/view/UserPremiumView;", "getVip", "()Lcom/yalla/yalla/ui/view/UserPremiumView;", "Landroid/widget/ImageView;", "sex", "Landroid/widget/ImageView;", "getSex", "()Landroid/widget/ImageView;", "Lcom/yalla/yalla/ui/view/UserVipView;", "kaVip", "Lcom/yalla/yalla/ui/view/UserVipView;", "getKaVip", "()Lcom/yalla/yalla/ui/view/UserVipView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "Lcom/yalla/yalla/ui/view/UserWealthTagView;", "wealth", "Lcom/yalla/yalla/ui/view/UserWealthTagView;", "getWealth", "()Lcom/yalla/yalla/ui/view/UserWealthTagView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public static final class SearchFriendHotViewHolder extends RecyclerView.o0O0O00 {
        public static final int $stable = 8;

        @NotNull
        private final NetImageView head;

        @NotNull
        private final UserVipView kaVip;

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView sex;

        @NotNull
        private final UserPremiumView vip;

        @NotNull
        private final UserWealthTagView wealth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchFriendHotViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(oO00O0oO.head);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.head)");
            this.head = (NetImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(oO00O0oO.vip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.vip)");
            this.vip = (UserPremiumView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(oO00O0oO.name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.name)");
            this.name = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(oO00O0oO.sex);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.id.sex)");
            this.sex = (ImageView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(oO00O0oO.kaVip);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "itemView.findViewById(R.id.kaVip)");
            this.kaVip = (UserVipView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(oO00O0oO.wealth);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "itemView.findViewById(R.id.wealth)");
            this.wealth = (UserWealthTagView) viewFindViewById6;
        }

        @NotNull
        public final NetImageView getHead() {
            return this.head;
        }

        @NotNull
        public final UserVipView getKaVip() {
            return this.kaVip;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final ImageView getSex() {
            return this.sex;
        }

        @NotNull
        public final UserPremiumView getVip() {
            return this.vip;
        }

        @NotNull
        public final UserWealthTagView getWealth() {
            return this.wealth;
        }
    }

    public SearchFriendHotAdapter(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27451OooO00o = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        SearchRecommendModel searchRecommendModel = this.f27453OooO0OO;
        if (searchRecommendModel == null) {
            return 0;
        }
        Intrinsics.checkNotNull(searchRecommendModel);
        return searchRecommendModel.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        List<UserInfo> list;
        UserInfo userInfo;
        SearchFriendHotViewHolder holder = (SearchFriendHotViewHolder) o0o0o00;
        Intrinsics.checkNotNullParameter(holder, "holder");
        SearchRecommendModel searchRecommendModel = this.f27453OooO0OO;
        if (searchRecommendModel == null || (list = searchRecommendModel.data) == null || (userInfo = list.get(i)) == null) {
            return;
        }
        holder.itemView.getLayoutParams().height = -2;
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        com.code.android.util.o000OO00.OooO(view, new o000O0(this, holder, i, userInfo));
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f27452OooO0O0);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
        oooO00o.f43911OooO0OO = userInfo.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(holder.getHead());
        holder.getVip().OooO0Oo(userInfo.getPremiumLevel(), userInfo.isPremium());
        UserVipView kaVip = holder.getKaVip();
        int vipLevel = userInfo.getVipLevel();
        FragmentActivity fragmentActivity = this.f27451OooO00o;
        kaVip.OooOOOO(vipLevel, true, fragmentActivity);
        holder.getWealth().OooO0O0(fragmentActivity, Integer.valueOf(userInfo.getWealthLevel()), userInfo.getWealthBadgeWithBg(), 8.0f);
        holder.getName().setText(userInfo.getUserName());
        holder.getSex().setVisibility(0);
        int sex = userInfo.getSex();
        StringBuilder sb = new StringBuilder();
        sb.append(sex);
        if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, sb.toString())) {
            holder.getSex().setImageResource(oOo00OO0.icon_female);
            return;
        }
        int sex2 = userInfo.getSex();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sex2);
        if (Intrinsics.areEqual("1", sb2.toString())) {
            holder.getSex().setImageResource(oOo00OO0.icon_male);
        } else {
            holder.getSex().setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        this.f27452OooO0O0 = context;
        View view = LayoutInflater.from(context).inflate(oO00OO0O.item_search_friend_hot, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new SearchFriendHotViewHolder(view);
    }
}
