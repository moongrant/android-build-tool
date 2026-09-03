package p538o0o0Oo0;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ooo0Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f44113Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f44114Oooo0oO;

    public /* synthetic */ ooo0Oo0(Object obj, int i) {
        this.f44113Oooo0o = i;
        this.f44114Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44113Oooo0o) {
            case 0:
                TopicSearchActivity this$0 = (TopicSearchActivity) this.f44114Oooo0oO;
                TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (view instanceof RelativeLayout) {
                    View childAt = ((RelativeLayout) view).getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    CharSequence text = ((TextView) childAt).getText();
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) text;
                    this$0.OooOooO().f50444OooO0O0.setText(str);
                    this$0.OooOooO().f50444OooO0O0.setSelection(str.length());
                    this$0.Oooo00O(str);
                }
                break;
            case 1:
                BadgeFragment.m313showPopupWindow$lambda8((BadgeFragment) this.f44114Oooo0oO, view);
                break;
            default:
                WalletCoinFragment.m434iniView$lambda12((WalletCoinFragment) this.f44114Oooo0oO, view);
                break;
        }
    }
}
