package p579o0oOoOOo;

import android.content.Context;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.model.GifConfigJson;
import com.yalla.yalla.model.GifListJson;
import java.util.List;
import kotlin.Pair;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOOoo00 extends OooO0OO<GifConfigJson> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GifListJson f46191OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(GifListJson gifListJson, Context context, List<GifConfigJson> list) {
        super(context, R.layout.room_item_mic_emoji_panel, list);
        this.f46191OooO00o = gifListJson;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        GifConfigJson gifConfigJson = (GifConfigJson) obj;
        if (oooO0o == null || gifConfigJson == null) {
            return;
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(this.f46191OooO00o.getFolderName()) + gifConfigJson.getPng();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivItemEmojiPanel));
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Pair<Boolean, Integer> value = oooOOO.OooOOO0().getValue();
        Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
        int iIntValue = value2 != null ? value2.getSecond().intValue() : 0;
        int lowestKAVIP = gifConfigJson.getLowestKAVIP();
        if (!(1 <= lowestKAVIP && lowestKAVIP <= iIntValue) || gifConfigJson.getLowestVip() > 0) {
            if ((value != null && value.getFirst().booleanValue()) && value.getSecond().intValue() >= gifConfigJson.getLowestVip() && gifConfigJson.getLowestKAVIP() <= 0) {
                oooO0o.OooO0oO(R.id.ivLock, false);
            } else if (gifConfigJson.getLowestVip() > 0 || gifConfigJson.getLowestKAVIP() > 0) {
                oooO0o.OooO0oO(R.id.ivLock, true);
            } else {
                oooO0o.OooO0oO(R.id.ivLock, false);
            }
        } else {
            oooO0o.OooO0oO(R.id.ivLock, false);
        }
        ((ConstraintLayout) oooO0o.OooO0Oo(R.id.llRoot)).setTag(R.id.mic_position, Integer.valueOf(oooO0o.getLayoutPosition()));
        oooO0o.OooOO0(R.id.tvItemEmojiPanel, gifConfigJson.getName());
        oooO0o.OooO0OO();
    }
}
