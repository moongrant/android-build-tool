package com.yalla.yalla.ui.activity.room;

import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26146OooO0oO;

    public OooOOO0(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f26146OooO0oO = banEnterRoomListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26146OooO0oO;
        SearchView searchView = banEnterRoomListActivity.f26021OooOo0o;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        EditText editSearch = searchView.getEditSearch();
        InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
        kotlin.collections.OooO00o.OooO0O0(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        banEnterRoomListActivity.finish();
    }
}
