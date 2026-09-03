package p582o0oOoOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.module.media.camera.CameraActivity;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import com.yalla.yalla.ui.fragment.message.MessageListFragment;
import kotlin.jvm.internal.Intrinsics;
import p461o0Ooo0Oo.o0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f56498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f56499OooO0o0;

    public /* synthetic */ y(Object obj, int i) {
        this.f56498OooO0Oo = i;
        this.f56499OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f56498OooO0Oo;
        Object obj2 = this.f56499OooO0o0;
        switch (i) {
            case 0:
                CameraViewModel cameraViewModel = (CameraViewModel) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(cameraViewModel, "$cameraViewModel");
                int i2 = CameraActivity.f23680OooOOo;
                o0O0o.OooO00o("_Camera", "select music back: " + zBooleanValue);
                if (zBooleanValue) {
                    cameraViewModel.OooO0o().f23809OooO00o.setValue(null);
                }
                break;
            default:
                MessageListFragment.initObserver$lambda$3((MessageListFragment) obj2, (Integer) obj);
                break;
        }
    }
}
