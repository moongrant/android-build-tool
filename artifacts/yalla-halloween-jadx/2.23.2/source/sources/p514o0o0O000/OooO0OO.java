package p514o0o0O000;

import android.app.Activity;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.adapter.roomReTag.RoomReTagItemView;
import p631o0ooO0O0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends o0000Ooo<CategoryModel, RoomReTagItemView, AbsListenerTag> {
    public OooO0OO(Activity activity) {
        super(activity, Integer.parseInt("15"));
    }

    @Override // p631o0ooO0O0.o0000Ooo
    public final AbsView OooO0OO() {
        return new RoomReTagItemView(this.f57683OooO0o);
    }

    @Override // p631o0ooO0O0.o0000Ooo
    public final void OooO0o(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomReTagItemView) absView).f22258OooO0Oo = new OooO0O0(this, (CategoryModel) absJavaBean, i);
    }

    @Override // p631o0ooO0O0.o0000Ooo
    public final void OooO0oO(AbsView absView, AbsJavaBean absJavaBean, int i) {
        RoomReTagItemView roomReTagItemView = (RoomReTagItemView) absView;
        CategoryModel categoryModel = (CategoryModel) absJavaBean;
        roomReTagItemView.OooO0oO(categoryModel);
        roomReTagItemView.OooO0o0();
        if (categoryModel == null) {
            return;
        }
        roomReTagItemView.f27305OooOO0o.setText(categoryModel.getLabelname());
    }
}
