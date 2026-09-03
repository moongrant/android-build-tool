package p496o0o00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SupportInfo;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o0 implements Observer<Response<SupportInfo>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f49068OooO0Oo;

    public o0O00o0(SupportTopActivity supportTopActivity) {
        this.f49068OooO0Oo = supportTopActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<SupportInfo> response) {
        List<SupportInfo.UserData> data;
        Response<SupportInfo> response2 = response;
        if (!response2.getIsSuccess() || response2.getData() == null) {
            return;
        }
        SupportInfo data2 = response2.getData();
        o0oOO o0ooo2 = null;
        String updateAt = data2 != null ? data2.getUpdateAt() : null;
        SupportInfo data3 = response2.getData();
        if (data3 == null || (data = data3.getData()) == null) {
            return;
        }
        int i = SupportTopActivity.f27192OooOo0O;
        SupportTopActivity supportTopActivity = this.f49068OooO0Oo;
        supportTopActivity.OooOo().f57943OooO0Oo.setText(updateAt + " (GMT+2)");
        o0oOO o0ooo3 = supportTopActivity.f27194OooOo0;
        if (o0ooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0ooo3 = null;
        }
        o0ooo3.OooOoO0(data);
        o0oOO o0ooo4 = supportTopActivity.f27194OooOo0;
        if (o0ooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0ooo2 = o0ooo4;
        }
        o0ooo2.Oooo00o();
        supportTopActivity.OooOo().f57941OooO0O0.OooOooo(true, true, true);
    }
}
