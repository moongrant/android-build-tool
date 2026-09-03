package p587o0oOooOO;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class u {
    public static View OooO00o(View view, @IdRes int i, o0OOOO0o o0oooo0o2) {
        View viewFindViewById = view != null ? view.findViewById(i) : null;
        OooO0O0(viewFindViewById, o0oooo0o2);
        return viewFindViewById;
    }

    public static void OooO0O0(View view, o0OOOO0o o0oooo0o2) {
        if (o0oooo0o2 == null || view == null) {
            return;
        }
        try {
            if ((view instanceof LinearLayout) || ((view instanceof RelativeLayout) || (view instanceof TextView)) || (view instanceof ImageView) || (view instanceof ImageButton) || (view instanceof Button)) {
                view.setOnClickListener(o0oooo0o2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
