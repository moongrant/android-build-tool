package p133o00OO00o;

import android.content.Context;
import android.widget.ImageView;
import com.app.base.model.RankModel2;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import o00OOO.OooO00o;
import p168o00Ooo0.oo000o;
import p282o0O00o0.OooOOO0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends p282o0O00o0.OooO<List<RankModel2>> {
    public OooO(Context context) {
        super(context, R.layout.explore_top_banner);
    }

    @Override // p282o0O00o0.OooO
    public final void OooO00o(OooOOO0 oooOOO0, List<RankModel2> list) {
        List<RankModel2> list2 = list;
        NetImageView netImageView = (NetImageView) oooOOO0.OooO00o(R.id.niv_top_1);
        if (list2.size() > 0) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f35202OooO00o);
            oooO00o.OooO00o(OooO00o.OooO0o0());
            oooO00o.f48429OooO0OO = list2.get(0).imageurl;
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0OO(1, OooOOO.OooO00o(R.color.color_FFD12D));
            oooO00o.OooO0o(netImageView);
        } else {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f35202OooO00o);
            oooO00o2.OooO00o(OooO00o.OooO0o0());
            oooO00o2.f48429OooO0OO = "";
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0OO(1, OooOOO.OooO00o(R.color.color_FFD12D));
            oooO00o2.OooO0o(netImageView);
        }
        ImageView imageView = (ImageView) oooOOO0.OooO00o(R.id.iv_top_crown);
        if (oo000o.OooO0o0()) {
            imageView.setRotationY(180.0f);
        } else {
            imageView.setRotationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }
}
