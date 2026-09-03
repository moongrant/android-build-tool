package com.google.android.material.search;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements o0000O.OooO0o, XRefreshLayout.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f17019OooO0Oo;

    @Override // com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout.OooO0OO
    public final void OooO00o() {
        TopicSearchActivity this$0 = (TopicSearchActivity) this.f17019OooO0Oo;
        int i = TopicSearchActivity.f25947OooOoo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SoftwareKeyboardController softwareKeyboardController = this$0.f25955OooOoO0;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
    }

    @Override // o0000O.OooO0o
    public final void onTouchExplorationStateChanged(boolean z) {
        SearchBar searchBar = (SearchBar) this.f17019OooO0Oo;
        int i = SearchBar.f17034o00O0O;
        searchBar.setFocusableInTouchMode(z);
    }
}
