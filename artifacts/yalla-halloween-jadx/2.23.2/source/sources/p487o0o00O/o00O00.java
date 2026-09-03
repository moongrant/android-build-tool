package p487o0o00O;

import android.widget.Switch;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.screen.user.FollowingScreen;
import com.yalla.yalla.ui.vm.user.FollowingVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48797OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48798OooO0o0;

    public /* synthetic */ o00O00(Object obj, int i) {
        this.f48797OooO0Oo = i;
        this.f48798OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48797OooO0Oo;
        Object obj2 = this.f48798OooO0o0;
        switch (i) {
            case 0:
                NoticeSettingActivity this$0 = (NoticeSettingActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = NoticeSettingActivity.f24974OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Switch r0 = this$0.OooOo().f45555OooO0Oo.getViews().f43920OooO0o0;
                Intrinsics.checkNotNull(bool);
                r0.setChecked(bool.booleanValue());
                break;
            default:
                FollowingScreen.InitObservers$lambda$6((FollowingVM) obj2, ((Long) obj).longValue());
                break;
        }
    }
}
