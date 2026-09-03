package p505o0o00oo0;

import android.app.Activity;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.adapter.roomReTag.RoomReTagItemView;
import p395o0Oo00oo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends o000000O<CategoryModel, RoomReTagItemView, AbsListenerTag> {
    public OooOo00(Activity activity) {
        super(activity, Integer.parseInt("15"));
    }

    @Override // p395o0Oo00oo.o000000O
    public final AbsView OooO0OO() {
        return new RoomReTagItemView(this.f44410OooO0o);
    }

    @Override // p395o0Oo00oo.o000000O
    public final void OooO0o(AbsView absView, AbsJavaBean absJavaBean, int i) {
        ((RoomReTagItemView) absView).f22731OooO0Oo = new OooOOOO(this, (CategoryModel) absJavaBean, i);
    }

    @Override // p395o0Oo00oo.o000000O
    public final void OooO0oO(AbsView absView, AbsJavaBean absJavaBean, int i) {
        RoomReTagItemView roomReTagItemView = (RoomReTagItemView) absView;
        CategoryModel categoryModel = (CategoryModel) absJavaBean;
        roomReTagItemView.OooO0oO(categoryModel);
        roomReTagItemView.OooO0o0();
        if (categoryModel == null) {
            return;
        }
        roomReTagItemView.f27767OooOO0o.setText(categoryModel.getLabelname());
    }
}
