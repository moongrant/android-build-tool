package p486o0o00O00;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.ApiServiceUpdateModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.main.MainActivity;
import p426o0OoOO.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O implements Observer<Response<ApiServiceUpdateModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48257OooO0Oo;

    public o0000O(MainActivity mainActivity) {
        this.f48257OooO0Oo = mainActivity;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<ApiServiceUpdateModel> response) {
        boolean z;
        Response<ApiServiceUpdateModel> response2 = response;
        if (response2.getIsSuccess()) {
            ApiServiceUpdateModel data = response2.getData();
            if (data != null) {
                z = data.isServiceUp();
            }
            if (z) {
                int i = MainActivity.f25394OooOoo;
                o0ooOOo o0ooooo = (o0ooOOo) this.f48257OooO0Oo.f25396OooOo.getValue();
                o0ooooo.getClass();
                Looper.myQueue().addIdleHandler(o0ooooo.f46044OooO0OO);
            }
        }
    }
}
