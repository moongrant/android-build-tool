package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import kotlin.jvm.internal.Intrinsics;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49121OooO0o0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f49120OooO0Oo = i;
        this.f49121OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object it) {
        int i = this.f49120OooO0Oo;
        Object obj = this.f49121OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO().f44926OooO.OooOoOO(true, true, true);
                break;
            case 1:
                MixedRoomActivity activity = (MixedRoomActivity) obj;
                Intrinsics.checkNotNullParameter(activity, "$activity");
                Intrinsics.checkNotNullParameter(it, "it");
                o0OO00O o0oo00o2 = o00000OO.f56401OooO0Oo;
                if (o0oo00o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
                    o0oo00o2 = null;
                }
                o0oo00o2.OooO0o0(activity);
                break;
            default:
                MainRoomFragment.initObserver$lambda$3((MainRoomFragment) obj, it);
                break;
        }
    }
}
