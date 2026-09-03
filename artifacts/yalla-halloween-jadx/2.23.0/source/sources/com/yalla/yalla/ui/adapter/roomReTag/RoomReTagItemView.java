package com.yalla.yalla.ui.adapter.roomReTag;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CategoryModel;
import p505o0o00oo0.OooOOOO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReTagItemView extends AbsView<CategoryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f27767OooOO0o;

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oO00OO0O.item_room_re_tag;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f27767OooOO0o = (TextView) OooO0O0(oO00O0oO.item_room_re_tag_title_tv);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f27767OooOO0o.setText("");
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == oO00O0oO.item_room_re_tag_bg_layout || id == oO00O0oO.item_room_re_tag_content_layout || id == oO00O0oO.item_room_re_tag_title_tv) {
            AbsListenerTag absListenerTag = AbsListenerTag.Default;
            Object obj = this.f22731OooO0Oo;
            if (obj != null) {
                OooOOOO oooOOOO = (OooOOOO) obj;
                oooOOOO.f49721OooO0OO.OooO0Oo(oooOOOO.f49719OooO00o, oooOOOO.f49720OooO0O0, absListenerTag);
            }
        }
    }
}
