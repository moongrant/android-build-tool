package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.ui.view.SearchView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26596OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(BanEnterRoomListActivity banEnterRoomListActivity) {
        super(1);
        this.f26596OooO0Oo = banEnterRoomListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        Object[] objArr = content.length() == 0;
        XRefreshLayout xRefreshLayout = null;
        OooO0o oooO0o = null;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26596OooO0Oo;
        if (objArr == true) {
            SearchView searchView = banEnterRoomListActivity.f26473OooOo0o;
            if (searchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
                searchView = null;
            }
            searchView.setClearVisibility(8);
            XRefreshLayout xRefreshLayout2 = banEnterRoomListActivity.f26471OooOo00;
            if (xRefreshLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout2 = null;
            }
            xRefreshLayout2.f21330OooOooO = true;
            OooO0o oooO0o2 = banEnterRoomListActivity.f26472OooOo0O;
            if (oooO0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0o2 = null;
            }
            oooO0o2.notifyDataSetChanged();
            OooO0o oooO0o3 = banEnterRoomListActivity.f26472OooOo0O;
            if (oooO0o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0o = oooO0o3;
            }
            oooO0o.OooOoOO(false);
            BanEnterRoomListActivity.OooOo0(banEnterRoomListActivity, "");
        } else {
            SearchView searchView2 = banEnterRoomListActivity.f26473OooOo0o;
            if (searchView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
                searchView2 = null;
            }
            searchView2.setClearVisibility(0);
            XRefreshLayout xRefreshLayout3 = banEnterRoomListActivity.f26471OooOo00;
            if (xRefreshLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            } else {
                xRefreshLayout = xRefreshLayout3;
            }
            xRefreshLayout.f21330OooOooO = false;
            BanEnterRoomListActivity.OooOo0(banEnterRoomListActivity, content);
        }
        return Unit.INSTANCE;
    }
}
