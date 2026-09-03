package p582o0oOoOoO;

import android.content.Context;
import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0o.oo0oOO0;
import p601o0oo00Oo.oO0o0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f46867Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f46868Oooo0oO;

    public /* synthetic */ j3(Object obj, int i) {
        this.f46867Oooo0o = i;
        this.f46868Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46867Oooo0o) {
            case 0:
                WalletCoinFragment.m439iniView$lambda19((WalletCoinFragment) this.f46868Oooo0oO, view);
                break;
            default:
                TopicInfoHeadView this$0 = (TopicInfoHeadView) this.f46868Oooo0oO;
                int i = TopicInfoHeadView.f25226Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oo0oOO0 oo0ooo0 = new oo0oOO0(context);
                oo0ooo0.OooOooO(OooOOO.OooO0OO(R.string.topic_info_dialog_title));
                oo0ooo0.OooOo0O(OooOOO.OooO0OO(R.string.topic_info_dialog_content));
                oo0ooo0.OooOo0o(new oO0o0o(oo0ooo0));
                oo0ooo0.OooOOO0();
                break;
        }
    }
}
