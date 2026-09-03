package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.MedalRankModel;
import com.yalla.yalla.ui.activity.user.MedalRankActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class MedalRankAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f27402OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public MedalRankModel f27403OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27404OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f27405OooO0Oo = null;

    public class OooO00o extends p466o0Oooo0o.oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ViewHolderItem f27407OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MedalRankModel.DataBean f27408OooO0oo;

        public OooO00o(ViewHolderItem viewHolderItem, int i, MedalRankModel.DataBean dataBean) {
            this.f27407OooO0oO = viewHolderItem;
            this.f27408OooO0oo = dataBean;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            OooO0O0 oooO0O0 = MedalRankAdapter.this.f27405OooO0Oo;
            if (oooO0O0 != null) {
                View view2 = this.f27407OooO0oO.itemView;
                MedalRankActivity.OooO0O0 oooO0O1 = (MedalRankActivity.OooO0O0) oooO0O0;
                oooO0O1.getClass();
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
                MedalRankActivity medalRankActivity = MedalRankActivity.this;
                medalRankActivity.getClass();
                oooO00o.OooO00o(medalRankActivity, this.f27408OooO0oo.userid);
            }
        }
    }

    public interface OooO0O0 {
    }

    public class ViewHolderItem extends RecyclerView.o0O0O00 {
        NetImageView sdv_me;
        TextView tv_name;
        TextView tv_position;
        TextView tv_starnum;

        public ViewHolderItem(View view) {
            super(view);
            this.sdv_me = (NetImageView) view.findViewById(oO00O0oO.sdv_me);
            this.tv_position = (TextView) view.findViewById(oO00O0oO.tv_position);
            this.tv_name = (TextView) view.findViewById(oO00O0oO.tv_name);
            this.tv_starnum = (TextView) view.findViewById(oO00O0oO.tv_starnum);
        }
    }

    public class ViewHolderTop extends RecyclerView.o0O0O00 {
        NetImageView sdv_me;
        NetImageView sdv_top1;
        NetImageView sdv_top2;
        NetImageView sdv_top3;
        TextView tv_name;
        TextView tv_starnum;

        public ViewHolderTop(View view) {
            super(view);
            this.sdv_top1 = (NetImageView) view.findViewById(oO00O0oO.sdv_top1);
            this.sdv_top2 = (NetImageView) view.findViewById(oO00O0oO.sdv_top2);
            this.sdv_top3 = (NetImageView) view.findViewById(oO00O0oO.sdv_top3);
            this.sdv_me = (NetImageView) view.findViewById(oO00O0oO.sdv_me);
            this.tv_name = (TextView) view.findViewById(oO00O0oO.tv_name);
            this.tv_starnum = (TextView) view.findViewById(oO00O0oO.tv_starnum);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        MedalRankModel medalRankModel = this.f27403OooO0O0;
        if (medalRankModel == null) {
            return 0;
        }
        return medalRankModel.data.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        if (!(o0o0o00 instanceof ViewHolderTop)) {
            if (o0o0o00 instanceof ViewHolderItem) {
                MedalRankModel.DataBean dataBean = this.f27403OooO0O0.data.get(i - 1);
                ViewHolderItem viewHolderItem = (ViewHolderItem) o0o0o00;
                viewHolderItem.itemView.setOnClickListener(new OooO00o(viewHolderItem, i, dataBean));
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f27402OooO00o);
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
                oooO00o.f43911OooO0OO = dataBean.imageurl;
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo(viewHolderItem.sdv_me);
                viewHolderItem.tv_position.setText(i + "");
                viewHolderItem.tv_name.setText(dataBean.nickname);
                viewHolderItem.tv_starnum.setText(dataBean.sumstars);
                return;
            }
            return;
        }
        ViewHolderTop viewHolderTop = (ViewHolderTop) o0o0o00;
        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(this.f27402OooO00o);
        oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO00o());
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        oooO00o2.f43911OooO0OO = (String) p464o0Oooo.o000000O.OooO().getValue();
        oooO00o2.f43909OooO00o = 0;
        oooO00o2.OooO0Oo(viewHolderTop.sdv_me);
        viewHolderTop.tv_name.setText((CharSequence) p464o0Oooo.o000000O.OooOOoo().getValue());
        viewHolderTop.tv_starnum.setText(this.f27404OooO0OO + "");
        o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(this.f27402OooO00o);
        oooO00o3.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o3.OooO0O0(4, com.code.android.util.o0000.OooO00o(oO00O0o.color_f2c653));
        oooO00o3.f43911OooO0OO = this.f27403OooO0O0.data.get(0).imageurl;
        oooO00o3.f43909OooO00o = 0;
        oooO00o3.OooO0Oo(viewHolderTop.sdv_top1);
        o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(this.f27402OooO00o);
        oooO00o4.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o4.OooO0O0(4, com.code.android.util.o0000.OooO00o(oO00O0o.color_949595));
        oooO00o4.f43911OooO0OO = this.f27403OooO0O0.data.get(1).imageurl;
        oooO00o4.f43909OooO00o = 0;
        oooO00o4.OooO0Oo(viewHolderTop.sdv_top2);
        o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(this.f27402OooO00o);
        oooO00o5.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o5.OooO0O0(4, com.code.android.util.o0000.OooO00o(oO00O0o.color_a65c43));
        oooO00o5.f43911OooO0OO = this.f27403OooO0O0.data.get(2).imageurl;
        oooO00o5.f43909OooO00o = 0;
        oooO00o5.OooO0Oo(viewHolderTop.sdv_top3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f27402OooO00o = context;
        return i == 0 ? new ViewHolderTop(LayoutInflater.from(context).inflate(oO00OO0O.item_rec_medal_rank_top, viewGroup, false)) : new ViewHolderItem(LayoutInflater.from(context).inflate(oO00OO0O.item_rec_medal_rank_item, viewGroup, false));
    }
}
