package com.yalla.yalla.ui.view.emptyView;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout;
import p514o0o0O000.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p587o0oOooOO.u;

/* JADX INFO: loaded from: classes4.dex */
public class EmptyFriendView extends AbsViewRelativeLayout<EmptyFriendModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinearLayout f30436OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ImageView f30437OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f30438OooOO0O;

    public EmptyFriendView(Context context) {
        super(context);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout
    public final void OooO0O0() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout
    public final void OooO0OO() {
        this.f30436OooO = (LinearLayout) u.OooO00o(getConvertView(), o0OO00O.layout_empty_friend_view_layout_content, getNoDoubleClickListener());
        this.f30437OooOO0 = (ImageView) u.OooO00o(getConvertView(), o0OO00O.layout_empty_friend_view_iv, getNoDoubleClickListener());
        this.f30438OooOO0O = (TextView) u.OooO00o(getConvertView(), o0OO00O.layout_empty_friend_view_tv, getNoDoubleClickListener());
        this.f30436OooO.setVisibility(0);
        this.f30437OooOO0.setVisibility(8);
        this.f30437OooOO0.setImageResource(o0Oo0oo.default_blankpage);
        this.f30438OooOO0O.setVisibility(8);
        this.f30438OooOO0O.setText("");
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout
    public int getConvertViewId() {
        return oo0o0Oo.layout_empty_friend_view;
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == o0OO00O.layout_empty_friend_view_layout_content || id == o0OO00O.layout_empty_friend_view_iv || id == o0OO00O.layout_empty_friend_view_tv) {
            AbsListenerTag absListenerTag = AbsListenerTag.Default;
            Object obj = this.f22271OooO0Oo;
            if (obj != null) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                oooO0O0.f51084OooO0OO.OooO0Oo(oooO0O0.f51082OooO00o, oooO0O0.f51083OooO0O0, absListenerTag);
            }
        }
    }
}
