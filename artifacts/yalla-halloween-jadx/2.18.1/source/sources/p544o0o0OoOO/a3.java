package p544o0o0OoOO;

import android.view.View;
import android.widget.EditText;
import com.app.base.view.SearchView;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p516o0o0O000.o00000O;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class a3 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44199Oooo;

    public a3(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f44199Oooo = banEnterRoomListActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SearchView searchView = this.f44199Oooo.f22752OooooOO;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        EditText editSearch = searchView.getEditSearch();
        BanEnterRoomListActivity banEnterRoomListActivity = this.f44199Oooo;
        Objects.requireNonNull(banEnterRoomListActivity);
        o00000O.OooO00o(editSearch, banEnterRoomListActivity);
        this.f44199Oooo.finish();
    }
}
