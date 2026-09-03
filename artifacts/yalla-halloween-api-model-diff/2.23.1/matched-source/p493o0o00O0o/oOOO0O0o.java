package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOO0O0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49350OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49351OooO0o0;

    public /* synthetic */ oOOO0O0o(Object obj, int i) {
        this.f49350OooO0Oo = i;
        this.f49351OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49350OooO0Oo;
        Object obj2 = this.f49351OooO0o0;
        switch (i) {
            case 0:
                ShowImageActivity this$0 = (ShowImageActivity) obj2;
                int i2 = ShowImageActivity.f25804Oooo00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Bitmap?>{ kotlin.collections.TypeAliasesKt.ArrayList<android.graphics.Bitmap?> }");
                this$0.f25814OooOoO0 = (ArrayList) obj;
                this$0.OooOoO0().f51678OooO0oo = this$0.f25814OooOoO0;
                break;
            case 1:
                WalletActivity this$1 = (WalletActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i3 = WalletActivity.f26589OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    this$1.finish();
                }
                break;
            default:
                MainMomentFollowingFragment.InitObservers$lambda$5((MomentFollowingVM) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
