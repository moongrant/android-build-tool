package p584o0oOoOoO;

import android.content.Context;
import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.internal.Intrinsics;
import p256o00ooO0o.oo0oOO0;
import p603o0oo00Oo.oO0OoOO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f46880Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f46881OoooO00;

    public /* synthetic */ i3(Object obj, int i) {
        this.f46880Oooo = i;
        this.f46881OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46880Oooo) {
            case 0:
                WalletCoinFragment.m439iniView$lambda19((WalletCoinFragment) this.f46881OoooO00, view);
                break;
            default:
                TopicInfoHeadView this$0 = (TopicInfoHeadView) this.f46881OoooO00;
                int i = TopicInfoHeadView.f25245OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oo0oOO0 oo0ooo0 = new oo0oOO0(context);
                oo0ooo0.OooOooO(OooOOO.OooO0OO(R.string.topic_info_dialog_title));
                oo0ooo0.OooOo0O(OooOOO.OooO0OO(R.string.topic_info_dialog_content));
                oo0ooo0.OooOo0o(new oO0OoOO0(oo0ooo0));
                oo0ooo0.OooOOO0();
                break;
        }
    }
}
