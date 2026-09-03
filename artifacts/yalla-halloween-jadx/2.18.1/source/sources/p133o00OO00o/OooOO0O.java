package p133o00OO00o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.MedalRankModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.MedalRankActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f31189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public MedalRankModel f31190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f31191OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f31192OooO0Oo = null;

    public class OooO00o extends o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f31193Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ MedalRankModel.DataBean f31195OoooO00;

        public OooO00o(OooO0OO oooO0OO, int i, MedalRankModel.DataBean dataBean) {
            this.f31193Oooo = oooO0OO;
            this.f31195OoooO00 = dataBean;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            OooO0O0 oooO0O0 = OooOO0O.this.f31192OooO0Oo;
            if (oooO0O0 != null) {
                View view2 = this.f31193Oooo.itemView;
                MedalRankModel.DataBean dataBean = this.f31195OoooO00;
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
                MedalRankActivity medalRankActivity = MedalRankActivity.this;
                Objects.requireNonNull(medalRankActivity);
                oooO00o.OooO00o(medalRankActivity, dataBean.userid);
            }
        }
    }

    public interface OooO0O0 {
    }

    public class OooO0OO extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public NetImageView f31196OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f31197OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TextView f31198OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public TextView f31199OooO0Oo;

        public OooO0OO(View view) {
            super(view);
            this.f31196OooO00o = (NetImageView) view.findViewById(R.id.sdv_me);
            this.f31197OooO0O0 = (TextView) view.findViewById(R.id.tv_position);
            this.f31198OooO0OO = (TextView) view.findViewById(R.id.tv_name);
            this.f31199OooO0Oo = (TextView) view.findViewById(R.id.tv_starnum);
        }
    }

    public class OooO0o extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public NetImageView f31200OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public NetImageView f31201OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public NetImageView f31202OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public NetImageView f31203OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f31204OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f31205OooO0o0;

        public OooO0o(View view) {
            super(view);
            this.f31200OooO00o = (NetImageView) view.findViewById(R.id.sdv_top1);
            this.f31201OooO0O0 = (NetImageView) view.findViewById(R.id.sdv_top2);
            this.f31202OooO0OO = (NetImageView) view.findViewById(R.id.sdv_top3);
            this.f31203OooO0Oo = (NetImageView) view.findViewById(R.id.sdv_me);
            this.f31205OooO0o0 = (TextView) view.findViewById(R.id.tv_name);
            this.f31204OooO0o = (TextView) view.findViewById(R.id.tv_starnum);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        MedalRankModel medalRankModel = this.f31190OooO0O0;
        if (medalRankModel == null) {
            return 0;
        }
        return medalRankModel.data.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        if (!(oo0o0oo instanceof OooO0o)) {
            if (oo0o0oo instanceof OooO0OO) {
                MedalRankModel.DataBean dataBean = this.f31190OooO0O0.data.get(i - 1);
                OooO0OO oooO0OO = (OooO0OO) oo0o0oo;
                oooO0OO.itemView.setOnClickListener(new OooO00o(oooO0OO, i, dataBean));
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31189OooO00o);
                oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
                oooO00o.f48429OooO0OO = dataBean.imageurl;
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(oooO0OO.f31196OooO00o);
                oooO0OO.f31197OooO0O0.setText(i + "");
                oooO0OO.f31198OooO0OO.setText(dataBean.nickname);
                oooO0OO.f31199OooO0Oo.setText(dataBean.sumstars);
                return;
            }
            return;
        }
        OooO0o oooO0o = (OooO0o) oo0o0oo;
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f31189OooO00o);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        oooO00o2.f48429OooO0OO = oooOOO.OooO0oo().getValue();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(oooO0o.f31203OooO0Oo);
        oooO0o.f31205OooO0o0.setText(oooOOO.OooOoO().getValue());
        oooO0o.f31204OooO0o.setText(this.f31191OooO0OO + "");
        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this.f31189OooO00o);
        oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o3.OooO0OO(4, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_f2c653));
        oooO00o3.f48429OooO0OO = this.f31190OooO0O0.data.get(0).imageurl;
        oooO00o3.f48427OooO00o = 0;
        oooO00o3.OooO0o(oooO0o.f31200OooO00o);
        oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(this.f31189OooO00o);
        oooO00o4.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o4.OooO0OO(4, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_949595));
        oooO00o4.f48429OooO0OO = this.f31190OooO0O0.data.get(1).imageurl;
        oooO00o4.f48427OooO00o = 0;
        oooO00o4.OooO0o(oooO0o.f31201OooO0O0);
        oO0O00.OooO00o oooO00o5 = new oO0O00.OooO00o(this.f31189OooO00o);
        oooO00o5.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o5.OooO0OO(4, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_a65c43));
        oooO00o5.f48429OooO0OO = this.f31190OooO0O0.data.get(2).imageurl;
        oooO00o5.f48427OooO00o = 0;
        oooO00o5.OooO0o(oooO0o.f31202OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f31189OooO00o = context;
        return i == 0 ? new OooO0o(LayoutInflater.from(context).inflate(R.layout.item_rec_medal_rank_top, viewGroup, false)) : new OooO0OO(LayoutInflater.from(context).inflate(R.layout.item_rec_medal_rank_item, viewGroup, false));
    }
}
