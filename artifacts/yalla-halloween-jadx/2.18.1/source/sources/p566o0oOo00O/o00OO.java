package p566o0oOo00O;

import androidx.recyclerview.widget.GridLayoutManager;
import com.app.base.model.UserHeaderFrameModel;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO extends GridLayoutManager.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f45271OooO0OO;

    public o00OO(UserHeaderFrameActivity userHeaderFrameActivity) {
        this.f45271OooO0OO = userHeaderFrameActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.UserHeaderFrameModel>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.UserHeaderFrameModel>] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0O0
    public final int OooO0OO(int i) {
        int localTypeModel;
        ?? r0 = this.f45271OooO0OO.f23443Ooooo00;
        return (!(r0 == 0 || r0.isEmpty()) && ((localTypeModel = ((UserHeaderFrameModel) this.f45271OooO0OO.f23443Ooooo00.get(i)).getLocalTypeModel()) == 0 || localTypeModel == 1)) ? 1 : 4;
    }
}
