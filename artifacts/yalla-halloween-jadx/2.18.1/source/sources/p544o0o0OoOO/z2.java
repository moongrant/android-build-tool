package p544o0o0OoOO;

import android.widget.EditText;
import com.app.base.view.SearchView;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p516o0o0O000.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class z2 extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44352Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(BanEnterRoomListActivity banEnterRoomListActivity) {
        super(2);
        this.f44352Oooo0o = banEnterRoomListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        if (iIntValue == 3) {
            BanEnterRoomListActivity.OooOoO(this.f44352Oooo0o, content);
            SearchView searchView = this.f44352Oooo0o.f22752OooooOO;
            if (searchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
                searchView = null;
            }
            EditText editSearch = searchView.getEditSearch();
            BanEnterRoomListActivity banEnterRoomListActivity = this.f44352Oooo0o;
            Objects.requireNonNull(banEnterRoomListActivity);
            o00000O.OooO00o(editSearch, banEnterRoomListActivity);
        }
        return Unit.INSTANCE;
    }
}
