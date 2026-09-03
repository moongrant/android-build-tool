package p566o0oOo00O;

import android.os.Build;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.List;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends OooO0OO<BadgeBannerModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f45191OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(BadgeActivity badgeActivity) {
        super(badgeActivity, R.layout.user_item_badge_banner);
        this.f45191OooO00o = badgeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        BadgeBannerModel badgeBannerModel = (BadgeBannerModel) obj;
        if (oooO0o == null || badgeBannerModel == null) {
            return;
        }
        oooO0o.OooOO0(R.id.rankUserName, badgeBannerModel.getNickName() + ' ');
        NetImageView netImageView = (NetImageView) oooO0o.OooO0Oo(R.id.rankUserHead);
        if (Build.VERSION.SDK_INT > 27) {
            netImageView.setLayerType(1, null);
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f45191OooO00o);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48429OooO0OO = badgeBannerModel.getImageUrl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.f48441OooOOOo = R.drawable.icon_head_default;
        oooO00o2.OooO0o(netImageView);
        if (badgeBannerModel.getType() == 4) {
            oooO0o.OooOO0(R.id.medalName, OooOo.OooO00o(OooOOO.OooO0OO(R.string.xxx_user_badge_get_diamond_medal), badgeBannerModel.getNickName()));
        } else {
            oooO0o.OooOO0(R.id.medalName, OooOOO.OooO0OO(R.string.user_badge_get_gold_medal));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final Object getItem(int i) {
        return getData().get(i % getData().size());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<BadgeBannerModel> data = getData();
        return data == null || data.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int size = getData().size() + getHeaderLayoutCount();
        if (size <= 0) {
            size = 1;
        }
        return super.getItemViewType(i % size);
    }
}
