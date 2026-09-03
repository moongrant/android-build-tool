package com.app.base.adapter.roomReTag;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsView;
import com.app.base.model.CategoryModel;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes.dex */
public class RoomReTagItemView extends AbsView<CategoryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f11441o000oOoO;

    public RoomReTagItemView(Activity activity) {
        super(activity);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final int OooO0OO() {
        return R.layout.item_room_re_tag;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f11441o000oOoO = (TextView) OooO0O0(R.id.item_room_re_tag_title_tv);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f11441o000oOoO.setText("");
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.item_room_re_tag_bg_layout || id == R.id.item_room_re_tag_content_layout || id == R.id.item_room_re_tag_title_tv) {
            OooO0oO(AbsListenerTag.Default);
        }
    }
}
