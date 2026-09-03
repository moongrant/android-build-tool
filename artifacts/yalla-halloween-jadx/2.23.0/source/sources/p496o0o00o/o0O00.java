package p496o0o00o;

import androidx.recyclerview.widget.GridLayoutManager;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends GridLayoutManager.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f49056OooO0OO;

    public o0O00(UserHeaderFrameActivity userHeaderFrameActivity) {
        this.f49056OooO0OO = userHeaderFrameActivity;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0O0
    public final int OooO0OO(int i) {
        int localTypeModel;
        UserHeaderFrameActivity userHeaderFrameActivity = this.f49056OooO0OO;
        ArrayList arrayList = userHeaderFrameActivity.f27233OooOo00;
        return (!(arrayList == null || arrayList.isEmpty()) && ((localTypeModel = ((UserHeaderFrameModel) userHeaderFrameActivity.f27233OooOo00.get(i)).getLocalTypeModel()) == 0 || localTypeModel == 1)) ? 1 : 4;
    }
}
