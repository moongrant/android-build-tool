package p506o0o00oOo;

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
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O extends o0000oo<BadgeBannerModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f50435OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(BadgeActivity badgeActivity, int i) {
        super(badgeActivity, i);
        this.f50435OooOoo0 = badgeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        BadgeBannerModel badgeBannerModel = (BadgeBannerModel) obj;
        if (viewHolder == null || badgeBannerModel == null) {
            return;
        }
        viewHolder.setText(o0OO00O.rankUserName, badgeBannerModel.getNickName() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        NetImageView netImageView = (NetImageView) viewHolder.getView(o0OO00O.rankUserHead);
        if (Build.VERSION.SDK_INT > 27) {
            netImageView.setLayerType(1, null);
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f50435OooOoo0);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = badgeBannerModel.getImageUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43138OooOOOo = o0Oo0oo.icon_head_default;
        oooO00o.OooO0Oo(netImageView);
        if (badgeBannerModel.getType() == 4) {
            viewHolder.setText(o0OO00O.medalName, o0000O.OooO00o(o0000.OooO0OO(o000000.xxx_user_badge_get_diamond_medal), badgeBannerModel.getNickName()));
        } else {
            viewHolder.setText(o0OO00O.medalName, o0000.OooO0OO(o000000.user_badge_get_gold_medal));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final Object OooOOO(int i) {
        return (BadgeBannerModel) this.f13189OooOOoo.get(i % this.f13189OooOOoo.size());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Collection collection = this.f13189OooOOoo;
        return collection == null || collection.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int size = this.f13189OooOOoo.size() + OooOOO0();
        if (size <= 0) {
            size = 1;
        }
        return super.getItemViewType(i % size);
    }
}
