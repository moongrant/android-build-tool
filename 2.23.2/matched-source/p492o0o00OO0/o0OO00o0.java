package p492o0o00OO0;

import android.content.DialogInterface;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.user.BadgeWearActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO00o0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f49317OooO0o0;

    public /* synthetic */ o0OO00o0(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f49316OooO0Oo = i;
        this.f49317OooO0o0 = baseFragmentActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f49316OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f49317OooO0o0;
        switch (i) {
            case 0:
                ShowImageActivity this$0 = (ShowImageActivity) baseFragmentActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f25818Oooo000 = false;
                this$0.OooOo0o().f44718OooO0o0.setCanScroll(true);
                break;
            default:
                BadgeWearActivity this$1 = (BadgeWearActivity) baseFragmentActivity;
                int i2 = BadgeWearActivity.f26633OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO0();
                break;
        }
    }
}
