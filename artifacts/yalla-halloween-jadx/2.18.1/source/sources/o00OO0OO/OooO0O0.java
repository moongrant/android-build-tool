package o00OO0OO;

import android.app.Activity;
import com.app.base.adapter.roomReTag.RoomReTagItemView;
import com.app.base.bean.AbsJavaBean;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsView;
import com.app.base.model.CategoryModel;
import p165o00OoOoO.o0O000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o0O000o0<CategoryModel, RoomReTagItemView, AbsListenerTag> {
    public OooO0O0(Activity activity) {
        super(activity, Integer.parseInt("15"));
    }

    @Override // p165o00OoOoO.o0O000o0
    public final AbsView OooO0OO() {
        return new RoomReTagItemView(this.f32548Oooo0oo);
    }

    @Override // p165o00OoOoO.o0O000o0
    public final void OooO0o(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomReTagItemView) absView).f11709Oooo0o = new OooO00o(this, (CategoryModel) absJavaBean, i);
    }

    @Override // p165o00OoOoO.o0O000o0
    public final void OooO0oO(AbsView absView, AbsJavaBean absJavaBean, int i) {
        RoomReTagItemView roomReTagItemView = (RoomReTagItemView) absView;
        CategoryModel categoryModel = (CategoryModel) absJavaBean;
        roomReTagItemView.OooO0oo(categoryModel, -1);
        roomReTagItemView.f11441o000oOoO.setText("");
        if (categoryModel == null) {
            return;
        }
        roomReTagItemView.f11441o000oOoO.setText(categoryModel.getLabelname());
    }
}
