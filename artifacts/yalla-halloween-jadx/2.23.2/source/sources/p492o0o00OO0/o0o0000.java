package p492o0o00OO0;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0o0000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49340OooO0o0;

    public /* synthetic */ o0o0000(Object obj, int i) {
        this.f49339OooO0Oo = i;
        this.f49340OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        int i = this.f49339OooO0Oo;
        Object obj2 = this.f49340OooO0o0;
        switch (i) {
            case 0:
                TopicCreateActivity context = (TopicCreateActivity) obj2;
                int i2 = TopicCreateActivity.f25836OooOo0O;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    context.startActivity(new Intent(context, (Class<?>) TopicReviewActivity.class));
                    context.finish();
                }
                break;
            default:
                GiftCustomMadeWebManager this$0 = (GiftCustomMadeWebManager) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GiftPropModel giftPropModel = obj instanceof GiftPropModel ? (GiftPropModel) obj : null;
                if (giftPropModel != null) {
                    z = giftPropModel.isCustomMade();
                }
                if (z) {
                    this$0.OooO00o();
                }
                break;
        }
    }
}
