package p539o0o0OoOO;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 {
    public static View OooO00o(View view, @IdRes int i, oo00o oo00oVar) {
        View viewFindViewById = view != null ? view.findViewById(i) : null;
        OooO0O0(viewFindViewById, oo00oVar);
        return viewFindViewById;
    }

    public static void OooO0O0(View view, oo00o oo00oVar) {
        if (oo00oVar == null || view == null) {
            return;
        }
        try {
            if ((view instanceof LinearLayout) || ((view instanceof RelativeLayout) || (view instanceof TextView)) || (view instanceof ImageView) || (view instanceof ImageButton) || (view instanceof Button)) {
                view.setOnClickListener(oo00oVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
