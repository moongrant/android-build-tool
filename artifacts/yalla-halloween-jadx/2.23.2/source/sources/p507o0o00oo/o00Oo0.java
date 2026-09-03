package p507o0o00oo;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p415o0Oo0oO0.o00Ooo;
import p545o0oO0O00.OooOo00;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class o00Oo0 extends RoomBaseAdapter<RoomIndexModel> {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f50614Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f50615Oooo00O;

    public o00Oo0(@Nullable Context context) {
        super(context);
        this.f50614Oooo000 = -1;
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooOoO0(@Nullable List<RoomIndexModel> list) {
        super.OooOoO0(list);
        if (o00Ooo.OooO0o0().OooO0O0("main", true)) {
            List<T> list2 = this.f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list2, "getData(...)");
            int size = list2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                RoomIndexModel roomIndexModel = (RoomIndexModel) list2.get(i);
                Intrinsics.checkNotNull(roomIndexModel);
                if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, roomIndexModel.isencrypt) && !roomIndexModel.isFull()) {
                    break;
                } else {
                    i++;
                }
            }
            this.f50614Oooo000 = i;
            if (i < 0 || i >= this.f13189OooOOoo.size()) {
                return;
            }
            this.f50615Oooo00O = true;
        }
    }

    public final void Oooo() {
        int i;
        if (!this.f50615Oooo00O || (i = this.f50614Oooo000) == -1) {
            return;
        }
        o00Ooo.OooO0o0().OooO0o("main", false);
        this.f50615Oooo00O = false;
        this.f50614Oooo000 = -1;
        notifyItemChanged(OooOOO0() + i);
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter
    public final void Oooo0o() {
        if (this.f50615Oooo00O) {
            OooOo00.OooO0O0(575, null);
        }
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter
    public final void Oooo0oo(@NotNull ViewHolder helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (!this.f50615Oooo00O || helper.getLayoutPosition() - OooOOO0() != this.f50614Oooo000) {
            View view = helper.getView(o0OO00O.new_frag_item_tips_root);
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        View view2 = helper.getView(o0OO00O.new_frag_item_tips_root);
        if (view2 == null || view2.getParent() == null) {
            ((ViewStub) helper.getView(o0OO00O.vs_new_frag_item_tips)).inflate().setVisibility(0);
            return;
        }
        view2.setVisibility(0);
        SVGAView sVGAView = (SVGAView) view2.findViewById(o0OO00O.svga_new_frag_item_border);
        SVGAView sVGAView2 = (SVGAView) view2.findViewById(o0OO00O.svga_new_frag_item_hand);
        sVGAView.OooO0Oo();
        sVGAView2.OooO0Oo();
    }
}
