package p540o0o0Oo0;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ooo0Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44128Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44129OoooO00;

    public /* synthetic */ ooo0Oo0(Object obj, int i) {
        this.f44128Oooo = i;
        this.f44129OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44128Oooo) {
            case 0:
                TopicSearchActivity this$0 = (TopicSearchActivity) this.f44129OoooO00;
                TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22673OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (view instanceof RelativeLayout) {
                    View childAt = ((RelativeLayout) view).getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    CharSequence text = ((TextView) childAt).getText();
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) text;
                    this$0.OooOooO().f50381OooO0O0.setText(str);
                    this$0.OooOooO().f50381OooO0O0.setSelection(str.length());
                    this$0.Oooo00O(str);
                }
                break;
            case 1:
                BadgeFragment.m313showPopupWindow$lambda8((BadgeFragment) this.f44129OoooO00, view);
                break;
            default:
                WalletCoinFragment.m434iniView$lambda12((WalletCoinFragment) this.f44129OoooO00, view);
                break;
        }
    }
}
