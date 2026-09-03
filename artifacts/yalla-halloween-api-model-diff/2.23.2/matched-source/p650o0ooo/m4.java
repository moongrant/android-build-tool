package p650o0ooo;

import android.view.View;
import com.yalla.yalla.ui.fragment.moment.MainMomentTopicFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58392OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f58393OooO0o0;

    public /* synthetic */ m4(Object obj, int i) {
        this.f58392OooO0Oo = i;
        this.f58393OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f58392OooO0Oo;
        Object obj = this.f58393OooO0o0;
        switch (i) {
            case 0:
                p4 this$0 = (p4) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f59106OooO0oo) {
                    this$0.OooO0OO();
                }
                break;
            default:
                MainMomentTopicFragment.initView$lambda$2((MainMomentTopicFragment) obj, view);
                break;
        }
    }
}
