package p510o0o00ooo;

import android.app.Activity;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.adapter.roomExplore.RoomExploreCountryItemView;
import java.util.List;
import p631o0ooO0O0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class v4 extends o0000Ooo<CountryModel, RoomExploreCountryItemView, AbsListenerTag> {
    public v4(Activity activity) {
        super(activity, Integer.parseInt("15"));
    }

    @Override // p631o0ooO0O0.o0000Ooo
    public final AbsView OooO0OO() {
        return new RoomExploreCountryItemView(this.f57683OooO0o);
    }

    @Override // p631o0ooO0O0.o0000Ooo
    public final void OooO0o(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomExploreCountryItemView) absView).f22260OooO0o0 = new u4(this);
    }

    @Override // p631o0ooO0O0.o0000Ooo
    public final void OooO0o0(List<CountryModel> list) {
        super.OooO0o0(list);
    }

    @Override // p631o0ooO0O0.o0000Ooo
    public final void OooO0oO(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomExploreCountryItemView) absView).OooO0oo((CountryModel) absJavaBean, i);
    }
}
