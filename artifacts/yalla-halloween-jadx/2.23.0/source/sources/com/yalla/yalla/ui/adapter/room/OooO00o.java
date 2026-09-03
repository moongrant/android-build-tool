package com.yalla.yalla.ui.adapter.room;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.AppEventsConstants;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class OooO00o extends RoomBaseAdapter<RoomIndexModel> {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f27697Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f27698Oooo00O;

    public OooO00o(@Nullable Context context) {
        super(context);
        this.f27697Oooo000 = -1;
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooOoO0(@Nullable List<RoomIndexModel> list) {
        super.OooOoO0(list);
        if (o00Oo0.OooO0o0().OooO0O0("main", true)) {
            List<T> data = this.f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            int size = data.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                RoomIndexModel roomIndexModel = (RoomIndexModel) data.get(i);
                Intrinsics.checkNotNull(roomIndexModel);
                if (Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, roomIndexModel.isencrypt) && !roomIndexModel.isFull()) {
                    break;
                } else {
                    i++;
                }
            }
            this.f27697Oooo000 = i;
            if (i < 0 || i >= this.f10111OooOOoo.size()) {
                return;
            }
            this.f27698Oooo00O = true;
        }
    }

    public final void Oooo() {
        int i;
        if (!this.f27698Oooo00O || (i = this.f27697Oooo000) == -1) {
            return;
        }
        o00Oo0.OooO0o0().OooO0o("main", false);
        this.f27698Oooo00O = false;
        this.f27697Oooo000 = -1;
        notifyItemChanged(OooOOO0() + i);
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter
    public final void Oooo0o() {
        if (this.f27698Oooo00O) {
            OooOo.OooO0OO(575, null);
        }
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter
    public final void Oooo0oo(@NotNull ViewHolder helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (!this.f27698Oooo00O || helper.getLayoutPosition() - OooOOO0() != this.f27697Oooo000) {
            View view = helper.getView(oO00O0oO.new_frag_item_tips_root);
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        View view2 = helper.getView(oO00O0oO.new_frag_item_tips_root);
        if (view2 == null || view2.getParent() == null) {
            ((ViewStub) helper.getView(oO00O0oO.vs_new_frag_item_tips)).inflate().setVisibility(0);
            return;
        }
        view2.setVisibility(0);
        SVGAView sVGAView = (SVGAView) view2.findViewById(oO00O0oO.svga_new_frag_item_border);
        SVGAView sVGAView2 = (SVGAView) view2.findViewById(oO00O0oO.svga_new_frag_item_hand);
        sVGAView.OooO0Oo();
        sVGAView2.OooO0Oo();
    }
}
