package p133o00OO00o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.SearchRecommendModel;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import p391o0OOooOo.o0O00000;
import p534o0o0OOo0.o0OO000;
import p616o0oo0Ooo.oO0O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f31206OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SearchRecommendModel f31207OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0 f31208OooO0OO = null;

    public class OooO00o extends o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f31209Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ UserInfo f31211OoooO00;

        public OooO00o(OooO0OO oooO0OO, int i, UserInfo userInfo) {
            this.f31209Oooo = oooO0OO;
            this.f31211OoooO00 = userInfo;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            OooO0O0 oooO0O0 = OooOOO.this.f31208OooO0OO;
            if (oooO0O0 != null) {
                View view2 = this.f31209Oooo.itemView;
                UserInfo userInfo = this.f31211OoooO00;
                SearchFriendActivity searchFriendActivity = (SearchFriendActivity) ((o0OO000) oooO0O0).f43570OooO0o0;
                int i = SearchFriendActivity.f22198Oooooo0;
                Objects.requireNonNull(searchFriendActivity);
                o0O00000.OooO0OO("Message_add_hot");
                UserInfoActivity.f23452o0ooOO0.OooO00o(searchFriendActivity, userInfo.getUserId() + "");
            }
        }
    }

    public interface OooO0O0 {
    }

    public static class OooO0OO extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public NetImageView f31212OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public UserPremiumView f31213OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ImageView f31214OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ImageView f31215OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f31216OooO0o0;

        public OooO0OO(View view) {
            super(view);
            this.f31212OooO00o = (NetImageView) view.findViewById(R.id.head);
            this.f31213OooO0O0 = (UserPremiumView) view.findViewById(R.id.vip);
            this.f31216OooO0o0 = (TextView) view.findViewById(R.id.name);
            this.f31214OooO0OO = (ImageView) view.findViewById(R.id.sex);
            this.f31215OooO0Oo = (ImageView) view.findViewById(R.id.kaVip);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        SearchRecommendModel searchRecommendModel = this.f31207OooO0O0;
        if (searchRecommendModel == null) {
            return 0;
        }
        return searchRecommendModel.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, @SuppressLint({RecyclerView.TAG}) int i) {
        OooO0OO oooO0OO = (OooO0OO) oo0o0oo;
        oo0o0oo.itemView.getLayoutParams().height = -2;
        UserInfo userInfo = this.f31207OooO0O0.data.get(i);
        oooO0OO.itemView.setOnClickListener(new OooO00o(oooO0OO, i, userInfo));
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31206OooO00o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o.f48429OooO0OO = userInfo.getUserHeader();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(oooO0OO.f31212OooO00o);
        oooO0OO.f31213OooO0O0.OooO0Oo(userInfo.isPremium(), userInfo.getPremiumLevel());
        ImageView imageView = oooO0OO.f31215OooO0Oo;
        int vipLevel = userInfo.getVipLevel();
        if (vipLevel > VipLevel.Vip0.getValue()) {
            imageView.setVisibility(0);
            imageView.setImageResource(VipLevel.INSTANCE.OooO00o(vipLevel));
        } else {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
        }
        oooO0OO.f31216OooO0o0.setText(userInfo.getUserName());
        oooO0OO.f31214OooO0OO.setVisibility(0);
        if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(userInfo.getSex() + "")) {
            oooO0OO.f31214OooO0OO.setImageResource(R.drawable.icon_female);
            return;
        }
        if ("1".equals(userInfo.getSex() + "")) {
            oooO0OO.f31214OooO0OO.setImageResource(R.drawable.icon_male);
        } else {
            oooO0OO.f31214OooO0OO.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f31206OooO00o = context;
        return new OooO0OO(LayoutInflater.from(context).inflate(R.layout.item_rec_searchfriend_recommend, viewGroup, false));
    }
}
