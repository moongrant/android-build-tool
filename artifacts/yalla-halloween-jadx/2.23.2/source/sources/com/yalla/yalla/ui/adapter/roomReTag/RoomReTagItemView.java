package com.yalla.yalla.ui.adapter.roomReTag;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CategoryModel;
import p514o0o0O000.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReTagItemView extends AbsView<CategoryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f27305OooOO0o;

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oo0o0Oo.item_room_re_tag;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f27305OooOO0o = (TextView) OooO0O0(o0OO00O.item_room_re_tag_title_tv);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f27305OooOO0o.setText("");
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == o0OO00O.item_room_re_tag_bg_layout || id == o0OO00O.item_room_re_tag_content_layout || id == o0OO00O.item_room_re_tag_title_tv) {
            AbsListenerTag absListenerTag = AbsListenerTag.Default;
            Object obj = this.f22258OooO0Oo;
            if (obj != null) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                oooO0O0.f51084OooO0OO.OooO0Oo(oooO0O0.f51082OooO00o, oooO0O0.f51083OooO0O0, absListenerTag);
            }
        }
    }
}
