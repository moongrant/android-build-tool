package p519o0o0O0oO;

import android.content.Context;
import android.widget.ImageView;
import androidx.camera.core.impl.OooOOOO;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.gift.GifConfigJson;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.Pair;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O000 extends o000O<GifConfigJson> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f52968OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O000(GifListJson gifListJson, Context context, int i, List<GifConfigJson> list) {
        super(i, context, list);
        this.f52968OooOoo0 = gifListJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        GifConfigJson gifConfigJson = (GifConfigJson) obj;
        if (viewHolder == null || gifConfigJson == null) {
            return;
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = OooOOOO.OooO00o(OooO0o.OooO0Oo(this.f52968OooOoo0.getFolderName()), gifConfigJson.getPng());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivItemEmojiPanel));
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Pair pair = (Pair) o000000O.OooOO0o().getValue();
        Pair pair2 = (Pair) o000000O.OooOO0().getValue();
        int iIntValue = pair2 != null ? ((Number) pair2.getSecond()).intValue() : 0;
        int lowestKAVIP = gifConfigJson.getLowestKAVIP();
        if (!(1 <= lowestKAVIP && lowestKAVIP <= iIntValue) || gifConfigJson.getLowestVip() > 0) {
            if ((pair != null && ((Boolean) pair.getFirst()).booleanValue()) && ((Number) pair.getSecond()).intValue() >= gifConfigJson.getLowestVip() && gifConfigJson.getLowestKAVIP() <= 0) {
                viewHolder.setGone(oO00O0oO.ivLock, false);
            } else if (gifConfigJson.getLowestVip() > 0 || gifConfigJson.getLowestKAVIP() > 0) {
                viewHolder.setGone(oO00O0oO.ivLock, true);
            } else {
                viewHolder.setGone(oO00O0oO.ivLock, false);
            }
        } else {
            viewHolder.setGone(oO00O0oO.ivLock, false);
        }
        int i = oO00O0oO.llRoot;
        ((ConstraintLayout) viewHolder.getView(i)).setTag(oO00O0oO.mic_position, Integer.valueOf(viewHolder.getLayoutPosition()));
        viewHolder.setText(oO00O0oO.tvItemEmojiPanel, gifConfigJson.getName());
        viewHolder.addOnLongClickListener(i);
    }
}
