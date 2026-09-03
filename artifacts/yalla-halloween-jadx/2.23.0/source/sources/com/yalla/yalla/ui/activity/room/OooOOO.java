package com.yalla.yalla.ui.activity.room;

import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26597OooO0oO;

    public OooOOO(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f26597OooO0oO = banEnterRoomListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26597OooO0oO;
        SearchView searchView = banEnterRoomListActivity.f26473OooOo0o;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        EditText editSearch = searchView.getEditSearch();
        InputMethodManager inputMethodManagerOooO00o = android.support.v4.media.session.OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context");
        p367o0OOo0o0.OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        banEnterRoomListActivity.finish();
    }
}
