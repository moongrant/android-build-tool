package p503o0o00oOo;

import android.app.Activity;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.adapter.roomExplore.RoomExploreCountryItemView;
import java.util.List;
import p395o0Oo00oo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0 extends o000000O<CountryModel, RoomExploreCountryItemView, AbsListenerTag> {
    public oOO0O0(Activity activity) {
        super(activity, Integer.parseInt("15"));
    }

    @Override // p395o0Oo00oo.o000000O
    public final AbsView OooO0OO() {
        return new RoomExploreCountryItemView(this.f44410OooO0o);
    }

    @Override // p395o0Oo00oo.o000000O
    public final void OooO0o(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomExploreCountryItemView) absView).f22733OooO0o0 = new oOO0O00O(this);
    }

    @Override // p395o0Oo00oo.o000000O
    public final void OooO0o0(List<CountryModel> list) {
        super.OooO0o0(list);
    }

    @Override // p395o0Oo00oo.o000000O
    public final void OooO0oO(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomExploreCountryItemView) absView).OooO0oo((CountryModel) absJavaBean, i);
    }
}
