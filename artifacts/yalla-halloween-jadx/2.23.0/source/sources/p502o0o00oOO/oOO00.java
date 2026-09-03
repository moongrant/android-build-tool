package p502o0o00oOO;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.app.base.protobuf.room.RoomTreasureBox;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p031OoooO0.o0OoOo0;
import p362o0OOo0O.OooOO0;
import p426o0OoOO.o0OOO0o;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00 extends o000O<RoomTreasureBox.TreasureBoxDrawAwardUserModel> {
    public oOO00(ArrayList<RoomTreasureBox.TreasureBoxDrawAwardUserModel> arrayList, FragmentActivity fragmentActivity, int i) {
        super(i, fragmentActivity, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomTreasureBox.TreasureBoxDrawAwardUserModel item = (RoomTreasureBox.TreasureBoxDrawAwardUserModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = item.getHeadUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.nivHeader));
        View view = helper.getView(oO00O0oO.tvName);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view).setText(item.getNickName());
        SVGAView sVGAView = (SVGAView) helper.getView(oO00O0oO.nivAward);
        String awardImage = item.getAwardImage();
        Intrinsics.checkNotNullExpressionValue(awardImage, "item.awardImage");
        Object obj2 = this.f10108OooOOOo;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        sVGAView.OooOO0O(awardImage, (LifecycleOwner) obj2);
        sVGAView.OooOO0o();
        String strOooO00o = o0OOO0o.OooO00o(item.getNums());
        if (item.getAwardType() == 1) {
            strOooO00o = o0OoOo0.OooO00o(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream, o0000.OooO0OO(oO00OOo0.days));
        }
        View view2 = helper.getView(oO00O0oO.tvAwardName);
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view2).setText(strOooO00o);
    }
}
