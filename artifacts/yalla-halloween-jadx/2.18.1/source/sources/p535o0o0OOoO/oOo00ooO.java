package p535o0o0OOoO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.model.BlackUserModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo00ooO implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f43727OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f43728OooO0O0;

    public oOo00ooO(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean) {
        this.f43728OooO0O0 = blackListActivity;
        this.f43727OooO00o = dataBean;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean bool2 = bool;
        if (this.f43728OooO0O0.f21928OooooOO && bool2.booleanValue()) {
            List<BlackUserModel.DataBean> data = this.f43728OooO0O0.f21927OooooO0.getData();
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).userid.equals(String.valueOf(this.f43727OooO00o.userid))) {
                    this.f43728OooO0O0.f21927OooooO0.remove(i);
                    break;
                }
            }
            this.f43728OooO0O0.f21927OooooO0.setLoadComplete();
            this.f43728OooO0O0.f21926Ooooo0o.Oooo0o0(true, true, false);
            String string = this.f43728OooO0O0.getString(R.string.Success);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(string == null || StringsKt.isBlank(string))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        }
        BlackListActivity.OooOoO(this.f43728OooO0O0);
    }
}
