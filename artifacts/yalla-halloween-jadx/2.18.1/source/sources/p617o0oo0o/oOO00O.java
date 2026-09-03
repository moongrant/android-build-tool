package p617o0oo0o;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowInsetsCompat;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO00O f48582OooO00o = new oOO00O();

    public final void OooO00o(@NotNull View view, @NotNull WindowInsetsCompat insets, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Integer num = (Integer) view.getTag(R.id.window_inset_manager_inset_top);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue != insets.OooO()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iOooO = insets.OooO() - iIntValue;
            if (z) {
                int i = marginLayoutParams.height;
                if (i >= 0) {
                    marginLayoutParams.height = i + iOooO;
                }
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + iOooO, view.getPaddingRight(), view.getPaddingBottom());
            } else {
                marginLayoutParams.topMargin += iOooO;
            }
            view.setLayoutParams(marginLayoutParams);
            view.requestLayout();
            view.setTag(R.id.window_inset_manager_inset_top, Integer.valueOf(insets.OooO()));
        }
    }
}
