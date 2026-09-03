package p650o0ooo;

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
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OOO extends o0000oo<GifConfigJson> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f58975OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OOO(GifListJson gifListJson, Context context, int i, List<GifConfigJson> list) {
        super(i, context, list);
        this.f58975OooOoo0 = gifListJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        GifConfigJson gifConfigJson = (GifConfigJson) obj;
        if (viewHolder == null || gifConfigJson == null) {
            return;
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = OooOOOO.OooO00o(OooO0OO.OooO0Oo(this.f58975OooOoo0.getFolderName()), gifConfigJson.getPng());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.ivItemEmojiPanel));
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
        Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
        int iIntValue = pair2 != null ? ((Number) pair2.getSecond()).intValue() : 0;
        int lowestKAVIP = gifConfigJson.getLowestKAVIP();
        if (!(1 <= lowestKAVIP && lowestKAVIP <= iIntValue) || gifConfigJson.getLowestVip() > 0) {
            if ((pair != null && ((Boolean) pair.getFirst()).booleanValue()) && ((Number) pair.getSecond()).intValue() >= gifConfigJson.getLowestVip() && gifConfigJson.getLowestKAVIP() <= 0) {
                viewHolder.setGone(o0OO00O.ivLock, false);
            } else if (gifConfigJson.getLowestVip() > 0 || gifConfigJson.getLowestKAVIP() > 0) {
                viewHolder.setGone(o0OO00O.ivLock, true);
            } else {
                viewHolder.setGone(o0OO00O.ivLock, false);
            }
        } else {
            viewHolder.setGone(o0OO00O.ivLock, false);
        }
        int i = o0OO00O.llRoot;
        ((ConstraintLayout) viewHolder.getView(i)).setTag(o0OO00O.mic_position, Integer.valueOf(viewHolder.getLayoutPosition()));
        viewHolder.setText(o0OO00O.tvItemEmojiPanel, gifConfigJson.getName());
        viewHolder.addOnLongClickListener(i);
    }
}
