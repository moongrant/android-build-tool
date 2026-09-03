package p496o0o00o;

import android.os.Build;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.Collection;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends o000O<BadgeBannerModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f48981OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(BadgeActivity badgeActivity, int i) {
        super(badgeActivity, i);
        this.f48981OooOoo0 = badgeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        BadgeBannerModel badgeBannerModel = (BadgeBannerModel) obj;
        if (viewHolder == null || badgeBannerModel == null) {
            return;
        }
        viewHolder.setText(oO00O0oO.rankUserName, badgeBannerModel.getNickName() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        NetImageView netImageView = (NetImageView) viewHolder.getView(oO00O0oO.rankUserHead);
        if (Build.VERSION.SDK_INT > 27) {
            netImageView.setLayerType(1, null);
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f48981OooOoo0);
        oooO00o.OooO00o(OooO.OooO00o());
        oooO00o.f43911OooO0OO = badgeBannerModel.getImageUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43923OooOOOo = oOo00OO0.icon_head_default;
        oooO00o.OooO0Oo(netImageView);
        if (badgeBannerModel.getType() == 4) {
            viewHolder.setText(oO00O0oO.medalName, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.xxx_user_badge_get_diamond_medal), badgeBannerModel.getNickName()));
        } else {
            viewHolder.setText(oO00O0oO.medalName, o0000.OooO0OO(oO00OOo0.user_badge_get_gold_medal));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final Object OooOOO(int i) {
        return (BadgeBannerModel) this.f10111OooOOoo.get(i % this.f10111OooOOoo.size());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Collection collection = this.f10111OooOOoo;
        return collection == null || collection.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int size = this.f10111OooOOoo.size() + OooOOO0();
        if (size <= 0) {
            size = 1;
        }
        return super.getItemViewType(i % size);
    }
}
