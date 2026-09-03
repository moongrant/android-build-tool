package p509o0o00ooO;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.oo000o;
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
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o4 extends o0000oo<RoomTreasureBox.TreasureBoxDrawAwardUserModel> {
    public o4(ArrayList<RoomTreasureBox.TreasureBoxDrawAwardUserModel> arrayList, FragmentActivity fragmentActivity, int i) {
        super(i, fragmentActivity, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomTreasureBox.TreasureBoxDrawAwardUserModel item = (RoomTreasureBox.TreasureBoxDrawAwardUserModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = item.getHeadUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.nivHeader));
        View view = helper.getView(o0OO00O.tvName);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view).setText(item.getNickName());
        SVGAView sVGAView = (SVGAView) helper.getView(o0OO00O.nivAward);
        String awardImage = item.getAwardImage();
        Intrinsics.checkNotNullExpressionValue(awardImage, "getAwardImage(...)");
        Object obj2 = this.f13186OooOOOo;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        sVGAView.OooOO0O(awardImage, (LifecycleOwner) obj2);
        sVGAView.OooOO0o();
        String strOooO00o = oo000o.OooO00o(item.getNums());
        if (item.getAwardType() == 1) {
            strOooO00o = o0OoOo0.OooO0O0(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream, o0000.OooO0OO(o000000.days));
        }
        View view2 = helper.getView(o0OO00O.tvAwardName);
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view2).setText(strOooO00o);
    }
}
