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
public final class OooOOO0 extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26598OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(BanEnterRoomListActivity banEnterRoomListActivity) {
        super(2);
        this.f26598OooO0Oo = banEnterRoomListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        if (iIntValue == 3) {
            BanEnterRoomListActivity banEnterRoomListActivity = this.f26598OooO0Oo;
            BanEnterRoomListActivity.OooOo0(banEnterRoomListActivity, content);
            SearchView searchView = banEnterRoomListActivity.f26473OooOo0o;
            if (searchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
                searchView = null;
            }
            EditText editSearch = searchView.getEditSearch();
            InputMethodManager inputMethodManagerOooO00o = android.support.v4.media.session.OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context");
            p367o0OOo0o0.OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        }
        return Unit.INSTANCE;
    }
}
