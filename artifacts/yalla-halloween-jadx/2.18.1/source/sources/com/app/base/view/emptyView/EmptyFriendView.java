package com.app.base.view.emptyView;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsViewRelativeLayout;
import com.weieyu.yalla.R;
import o00Oo00.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public class EmptyFriendView extends AbsViewRelativeLayout<EmptyFriendModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f12177OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LinearLayout f12178OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f12179OoooO0O;

    public EmptyFriendView(Context context) {
        super(context);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsViewRelativeLayout
    public final void OooO0OO() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsViewRelativeLayout
    public final void OooO0Oo() {
        this.f12178OoooO0 = (LinearLayout) OooO00o(R.id.layout_empty_friend_view_layout_content);
        this.f12179OoooO0O = (ImageView) OooO00o(R.id.layout_empty_friend_view_iv);
        this.f12177OoooO = (TextView) OooO00o(R.id.layout_empty_friend_view_tv);
        this.f12178OoooO0.setVisibility(0);
        this.f12179OoooO0O.setVisibility(8);
        this.f12179OoooO0O.setImageResource(R.drawable.default_blankpage);
        this.f12177OoooO.setVisibility(8);
        this.f12177OoooO.setText("");
    }

    @Override // com.app.base.framework.abs.AbsView.AbsViewRelativeLayout
    public int getConvertViewId() {
        return R.layout.layout_empty_friend_view;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.layout_empty_friend_view_layout_content || id == R.id.layout_empty_friend_view_iv || id == R.id.layout_empty_friend_view_tv) {
            AbsListenerTag absListenerTag = AbsListenerTag.Default;
            OooO0OO<ListenerTag> oooO0OO = this.f11724Oooo0o;
            if (oooO0OO != 0) {
                oooO0OO.OooO00o((ListenerTag) absListenerTag);
            }
        }
    }
}
