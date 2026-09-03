package p544o0o0OoOO;

import com.app.base.view.SearchView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p188o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44345Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(BanEnterRoomListActivity banEnterRoomListActivity) {
        super(1);
        this.f44345Oooo0o = banEnterRoomListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        XRefreshLayout xRefreshLayout = null;
        OooO0OO<RoomBanEnterUser> oooO0OO = null;
        if (content.length() == 0) {
            SearchView searchView = this.f44345Oooo0o.f22752OooooOO;
            if (searchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
                searchView = null;
            }
            searchView.setClearVisibility(8);
            XRefreshLayout xRefreshLayout2 = this.f44345Oooo0o.f22749Ooooo00;
            if (xRefreshLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout2 = null;
            }
            xRefreshLayout2.f19541o00O0O = true;
            OooO0OO<RoomBanEnterUser> oooO0OO2 = this.f44345Oooo0o.f22751OooooO0;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO2 = null;
            }
            oooO0OO2.notifyDataSetChanged();
            OooO0OO<RoomBanEnterUser> oooO0OO3 = this.f44345Oooo0o.f22751OooooO0;
            if (oooO0OO3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO3;
            }
            oooO0OO.hindEmptyView(false);
            BanEnterRoomListActivity.OooOoO(this.f44345Oooo0o, "");
        } else {
            SearchView searchView2 = this.f44345Oooo0o.f22752OooooOO;
            if (searchView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
                searchView2 = null;
            }
            searchView2.setClearVisibility(0);
            XRefreshLayout xRefreshLayout3 = this.f44345Oooo0o.f22749Ooooo00;
            if (xRefreshLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            } else {
                xRefreshLayout = xRefreshLayout3;
            }
            xRefreshLayout.f19541o00O0O = false;
            BanEnterRoomListActivity.OooOoO(this.f44345Oooo0o, content);
        }
        return Unit.INSTANCE;
    }
}
