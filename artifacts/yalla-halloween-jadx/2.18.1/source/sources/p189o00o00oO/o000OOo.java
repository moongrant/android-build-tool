package p189o00o00oO;

import android.view.View;
import android.view.ViewGroup;
import com.app.base.view.tips.TipsBubbleView;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo {
    public static TipsBubbleView OooO00o(View view, ViewGroup viewGroup, int i, boolean z, String str, CharSequence charSequence) {
        TipsBubbleView tipsBubbleView = new TipsBubbleView(viewGroup.getContext());
        tipsBubbleView.setTag(str);
        viewGroup.addView(tipsBubbleView, -2, -2);
        tipsBubbleView.setTriangleGravity(i);
        tipsBubbleView.setContent(charSequence);
        tipsBubbleView.setAnchorView(view);
        tipsBubbleView.setRootView(viewGroup);
        tipsBubbleView.OooO00o(z);
        return tipsBubbleView;
    }
}
