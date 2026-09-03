package p554o0oOOOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.module.media.preview.YLMediaPreViewScreen;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOOoo00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f56051OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f56052OooO0o0;

    public /* synthetic */ oOOOoo00(Object obj, int i) {
        this.f56051OooO0Oo = i;
        this.f56052OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f56051OooO0Oo;
        Object obj2 = this.f56052OooO0o0;
        switch (i) {
            case 0:
                YLMediaPreViewScreen.Content$lambda$1((oOOO00o0) obj2, ((Boolean) obj).booleanValue());
                break;
            default:
                PremiumActivity this$0 = (PremiumActivity) obj2;
                int i2 = PremiumActivity.f26674Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0o0(false);
                break;
        }
    }
}
