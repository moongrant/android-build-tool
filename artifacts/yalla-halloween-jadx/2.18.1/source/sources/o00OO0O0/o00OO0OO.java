package o00OO0O0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.app.base.protobuf.room.Room;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0OO extends p188o00o00o0.OooO0OO<Room.TreasureBoxDrawAwardUserModel> {
    public o00OO0OO(ArrayList<Room.TreasureBoxDrawAwardUserModel> arrayList, FragmentActivity fragmentActivity) {
        super(fragmentActivity, R.layout.item_room_treasure_box_open, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        Room.TreasureBoxDrawAwardUserModel item = (Room.TreasureBoxDrawAwardUserModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.f48429OooO0OO = item.getHeadUrl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.nivHeader));
        View viewOooO0Oo = helper.OooO0Oo(R.id.tvName);
        Intrinsics.checkNotNull(viewOooO0Oo, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewOooO0Oo).setText(item.getNickName());
        SVGAView sVGAView = (SVGAView) helper.OooO0Oo(R.id.nivAward);
        String awardImage = item.getAwardImage();
        Intrinsics.checkNotNullExpressionValue(awardImage, "item.awardImage");
        Object obj2 = this.mContext;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        sVGAView.OooO0oo(awardImage, (LifecycleOwner) obj2);
        sVGAView.OooO();
        String str = item.getNums() + "";
        if (item.getAwardType() == 1) {
            str = str + ' ' + p254o00ooO0O.o000O0O0.OooO0OO(R.string.days);
        }
        View viewOooO0Oo2 = helper.OooO0Oo(R.id.tvAwardName);
        Intrinsics.checkNotNull(viewOooO0Oo2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewOooO0Oo2).setText(str);
    }
}
