package o00OO0O;

import android.app.Activity;
import com.app.base.adapter.roomExplore.RoomExploreCountryItemView;
import com.app.base.bean.AbsJavaBean;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsView;
import com.app.base.model.CountryModel;
import java.util.List;
import p165o00OoOoO.o0O000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends o0O000o0<CountryModel, RoomExploreCountryItemView, AbsListenerTag> {
    public OooO0OO(Activity activity) {
        super(activity, Integer.parseInt("15"));
    }

    @Override // p165o00OoOoO.o0O000o0
    public final AbsView OooO0OO() {
        return new RoomExploreCountryItemView(this.f32548Oooo0oo);
    }

    @Override // p165o00OoOoO.o0O000o0
    public final void OooO0o(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomExploreCountryItemView) absView).f11710Oooo0oO = new OooO0O0(this);
    }

    @Override // p165o00OoOoO.o0O000o0
    public final void OooO0o0(List<CountryModel> list) {
        super.OooO0o0(list);
    }

    @Override // p165o00OoOoO.o0O000o0
    public final void OooO0oO(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomExploreCountryItemView) absView).OooO0oo((CountryModel) absJavaBean, i);
    }
}
