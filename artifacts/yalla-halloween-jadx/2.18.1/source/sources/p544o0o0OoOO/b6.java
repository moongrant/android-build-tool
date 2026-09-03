package p544o0o0OoOO;

import com.app.base.model.CategoryModel;
import com.yalla.yalla.ui.activity.room.RoomReTagActivity;
import p034OoooO0O.o0Oo0oo;
import p160o00OoOO0.o00OO0O0;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class b6 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CategoryModel f44208OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RoomReTagActivity f44209OooO0O0;

    public b6(RoomReTagActivity roomReTagActivity, CategoryModel categoryModel) {
        this.f44209OooO0O0 = roomReTagActivity;
        this.f44208OooO00o = categoryModel;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        try {
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.id = this.f44208OooO00o.getId();
            categoryModel.labelname = this.f44208OooO00o.getLabelname();
            o00OO00O.f43313OooooOo.OooO00o().f43334OooOo.postValue(categoryModel);
            o0Oo0oo.OooO0o0(54, this.f44209OooO0O0.f22967OoooOoo);
            this.f44209OooO0O0.setResult(-1);
            this.f44209OooO0O0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
