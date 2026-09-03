package o00OO0;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.RoomIndexModel;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import java.util.List;
import p034OoooO0O.o0Oo0oo;
import p497o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends RoomBaseAdapter<RoomIndexModel> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f31175OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f31176OooO0o0;

    public OooO00o(Context context) {
        super(context);
        this.f31176OooO0o0 = -1;
        this.f31175OooO0o = false;
    }

    @Override // com.app.base.adapter.room.RoomBaseAdapter
    public final void OooO0O0() {
        if (this.f31175OooO0o) {
            o0Oo0oo.OooO0o0(575, null);
        }
    }

    @Override // com.app.base.adapter.room.RoomBaseAdapter
    public final void OooO0Oo(p188o00o00o0.OooO0o oooO0o) {
        if (!this.f31175OooO0o || oooO0o.getLayoutPosition() - getHeaderLayoutCount() != this.f31176OooO0o0) {
            View viewOooO0Oo = oooO0o.OooO0Oo(R.id.new_frag_item_tips_root);
            if (viewOooO0Oo == null || viewOooO0Oo.getVisibility() != 0) {
                return;
            }
            viewOooO0Oo.setVisibility(8);
            return;
        }
        View viewOooO0Oo2 = oooO0o.OooO0Oo(R.id.new_frag_item_tips_root);
        if (viewOooO0Oo2 == null || viewOooO0Oo2.getParent() == null) {
            ((ViewStub) oooO0o.OooO0Oo(R.id.vs_new_frag_item_tips)).inflate().setVisibility(0);
            return;
        }
        viewOooO0Oo2.setVisibility(0);
        SVGAView sVGAView = (SVGAView) viewOooO0Oo2.findViewById(R.id.svga_new_frag_item_border);
        SVGAView sVGAView2 = (SVGAView) viewOooO0Oo2.findViewById(R.id.svga_new_frag_item_hand);
        sVGAView.OooO0OO();
        sVGAView2.OooO0OO();
    }

    public final void OooO0o0() {
        int i;
        if (!this.f31175OooO0o || (i = this.f31176OooO0o0) == -1) {
            return;
        }
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        OooOOO0.OooO0o0().OooO0o("main", false);
        this.f31175OooO0o = false;
        this.f31176OooO0o0 = -1;
        notifyItemChanged(getHeaderLayoutCount() + i);
    }

    @Override // com.app.base.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    public final void setNewData(@Nullable List<RoomIndexModel> list) {
        super.setNewData(list);
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        if (OooOOO0.OooO0o0().OooO00o("main", true)) {
            List<T> data = getData();
            int i = 0;
            while (true) {
                if (i >= data.size()) {
                    i = -1;
                    break;
                }
                RoomIndexModel roomIndexModel = (RoomIndexModel) data.get(i);
                if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(roomIndexModel.isencrypt) && !roomIndexModel.isFull()) {
                    break;
                } else {
                    i++;
                }
            }
            this.f31176OooO0o0 = i;
            if (i < 0 || i >= getData().size()) {
                return;
            }
            this.f31175OooO0o = true;
        }
    }
}
