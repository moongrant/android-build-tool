package p493o0o00O0o;

import android.content.Intent;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49100OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49101OooO0o0;

    public /* synthetic */ g(Object obj, int i) {
        this.f49100OooO0Oo = i;
        this.f49101OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49100OooO0Oo;
        Object obj2 = this.f49101OooO0o0;
        switch (i) {
            case 0:
                TopicCreateActivity context = (TopicCreateActivity) obj2;
                int i2 = TopicCreateActivity.f25838OooOo0O;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    context.startActivity(new Intent(context, (Class<?>) TopicReviewActivity.class));
                    context.finish();
                }
                break;
            default:
                GiftLayoutHideSelectViewManager this$0 = (GiftLayoutHideSelectViewManager) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this$0.f27546OooO00o.f58870OooO0oO), new OooOOO0(this$0, null));
                break;
        }
    }
}
