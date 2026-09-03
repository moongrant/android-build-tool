package com.google.android.material.search;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.o0ooOOo;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import p029Oooo0oo.o0O00O0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17033OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17034OooO0o0;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f17033OooO0Oo = i;
        this.f17034OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17033OooO0Oo;
        Object obj = this.f17034OooO0o0;
        switch (i) {
            case 0:
                SearchView searchView = (SearchView) obj;
                if (!searchView.f17086OooOoo0.equals(SearchView.TransitionState.SHOWN)) {
                    SearchView.TransitionState transitionState = searchView.f17086OooOoo0;
                    SearchView.TransitionState transitionState2 = SearchView.TransitionState.SHOWING;
                    if (!transitionState.equals(transitionState2)) {
                        o00Ooo o00ooo2 = searchView.f17074OooOOo;
                        SearchBar searchBar = o00ooo2.f17104OooOOO0;
                        int i2 = 1;
                        ClippableRoundedCornerLayout clippableRoundedCornerLayout = o00ooo2.f17095OooO0OO;
                        SearchView searchView2 = o00ooo2.f17093OooO00o;
                        if (searchBar != null) {
                            if (searchView2.OooO0OO()) {
                                searchView2.OooO0Oo();
                            }
                            searchView2.setTransitionState(transitionState2);
                            Toolbar toolbar = o00ooo2.f17099OooO0oO;
                            Menu menu = toolbar.getMenu();
                            if (menu != null) {
                                menu.clear();
                            }
                            if (o00ooo2.f17104OooOOO0.getMenuResId() == -1 || !searchView2.f17077OooOo) {
                                toolbar.setVisibility(8);
                            } else {
                                toolbar.OooOO0O(o00ooo2.f17104OooOOO0.getMenuResId());
                                ActionMenuView actionMenuViewOooO00o = o0ooOOo.OooO00o(toolbar);
                                if (actionMenuViewOooO00o != null) {
                                    for (int i3 = 0; i3 < actionMenuViewOooO00o.getChildCount(); i3++) {
                                        View childAt = actionMenuViewOooO00o.getChildAt(i3);
                                        childAt.setClickable(false);
                                        childAt.setFocusable(false);
                                        childAt.setFocusableInTouchMode(false);
                                    }
                                }
                                toolbar.setVisibility(0);
                            }
                            CharSequence text = o00ooo2.f17104OooOOO0.getText();
                            EditText editText = o00ooo2.f17092OooO;
                            editText.setText(text);
                            editText.setSelection(editText.getText().length());
                            clippableRoundedCornerLayout.setVisibility(4);
                            clippableRoundedCornerLayout.post(new o0O00O0o(o00ooo2, 2));
                        } else {
                            if (searchView2.OooO0OO()) {
                                searchView2.postDelayed(new androidx.media3.ui.OooOO0O(searchView2, i2), 150L);
                            }
                            clippableRoundedCornerLayout.setVisibility(4);
                            clippableRoundedCornerLayout.post(new androidx.compose.material.ripple.OooO00o(o00ooo2, 1));
                        }
                        searchView.setModalForAccessibility(true);
                        break;
                    }
                }
                break;
            default:
                RoomInfoMemberListFragment.initView$lambda$8((RoomInfoMemberListFragment) obj, view);
                break;
        }
    }
}
