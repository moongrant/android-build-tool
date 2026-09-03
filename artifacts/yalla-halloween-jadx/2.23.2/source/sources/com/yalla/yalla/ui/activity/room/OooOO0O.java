package com.yalla.yalla.ui.activity.room;

import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26144OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(BanEnterRoomListActivity banEnterRoomListActivity) {
        super(2);
        this.f26144OooO0Oo = banEnterRoomListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        if (iIntValue == 3) {
            BanEnterRoomListActivity banEnterRoomListActivity = this.f26144OooO0Oo;
            BanEnterRoomListActivity.OooOo0(banEnterRoomListActivity, content);
            SearchView searchView = banEnterRoomListActivity.f26021OooOo0o;
            if (searchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
                searchView = null;
            }
            EditText editSearch = searchView.getEditSearch();
            InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
            kotlin.collections.OooO00o.OooO0O0(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        }
        return Unit.INSTANCE;
    }
}
