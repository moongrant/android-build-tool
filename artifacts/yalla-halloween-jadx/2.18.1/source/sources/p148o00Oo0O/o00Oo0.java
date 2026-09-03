package p148o00Oo0O;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {
    public static View OooO00o(View view, @IdRes int i, View.OnClickListener onClickListener) {
        View viewFindViewById = view != null ? view.findViewById(i) : null;
        OooO0O0(viewFindViewById, onClickListener);
        return viewFindViewById;
    }

    public static View OooO0O0(View view, View.OnClickListener onClickListener) {
        if (onClickListener != null && view != null) {
            try {
                if ((view instanceof LinearLayout) || ((view instanceof RelativeLayout) | (view instanceof TextView)) || (view instanceof ImageView) || (view instanceof ImageButton) || (view instanceof Button)) {
                    view.setOnClickListener(onClickListener);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return view;
    }
}
