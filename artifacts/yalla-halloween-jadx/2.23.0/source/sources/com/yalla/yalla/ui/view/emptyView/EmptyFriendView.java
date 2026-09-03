package com.yalla.yalla.ui.view.emptyView;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout;
import p505o0o00oo0.OooOOOO;
import p539o0o0OoOO.z0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
public class EmptyFriendView extends AbsViewRelativeLayout<EmptyFriendModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinearLayout f30981OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ImageView f30982OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f30983OooOO0O;

    public EmptyFriendView(Context context) {
        super(context);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout
    public final void OooO0O0() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout
    public final void OooO0OO() {
        this.f30981OooO = (LinearLayout) z0.OooO00o(getConvertView(), oO00O0oO.layout_empty_friend_view_layout_content, getNoDoubleClickListener());
        this.f30982OooOO0 = (ImageView) z0.OooO00o(getConvertView(), oO00O0oO.layout_empty_friend_view_iv, getNoDoubleClickListener());
        this.f30983OooOO0O = (TextView) z0.OooO00o(getConvertView(), oO00O0oO.layout_empty_friend_view_tv, getNoDoubleClickListener());
        this.f30981OooO.setVisibility(0);
        this.f30982OooOO0.setVisibility(8);
        this.f30982OooOO0.setImageResource(oOo00OO0.default_blankpage);
        this.f30983OooOO0O.setVisibility(8);
        this.f30983OooOO0O.setText("");
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewRelativeLayout
    public int getConvertViewId() {
        return oO00OO0O.layout_empty_friend_view;
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == oO00O0oO.layout_empty_friend_view_layout_content || id == oO00O0oO.layout_empty_friend_view_iv || id == oO00O0oO.layout_empty_friend_view_tv) {
            AbsListenerTag absListenerTag = AbsListenerTag.Default;
            Object obj = this.f22744OooO0Oo;
            if (obj != null) {
                OooOOOO oooOOOO = (OooOOOO) obj;
                oooOOOO.f49721OooO0OO.OooO0Oo(oooOOOO.f49719OooO00o, oooOOOO.f49720OooO0O0, absListenerTag);
            }
        }
    }
}
