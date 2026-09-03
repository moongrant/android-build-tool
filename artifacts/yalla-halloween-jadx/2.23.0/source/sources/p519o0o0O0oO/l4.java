package p519o0o0O0oO;

import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.room.o0OoOo0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p641o0ooOOOO.g8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class l4 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final g8 f52420OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        g8 g8VarInflate = g8.inflate(activity.getLayoutInflater(), this.f52533OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(g8VarInflate, "inflate(activity.layoutI…er, getRootView(), false)");
        this.f52420OooOO0O = g8VarInflate;
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        OooO0oo(80);
        LinearLayout linearLayout = g8VarInflate.f57979OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        g8VarInflate.f57981OooO0OO.setText(o0000.OooO0OO(oO00OOo0.treasure_box_rule_7));
        g8VarInflate.f57980OooO0O0.setOnClickListener(new o0OoOo0(this, 1));
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO() {
        super.OooO();
        this.f52420OooOO0O.f57979OooO00o.requestLayout();
    }
}
