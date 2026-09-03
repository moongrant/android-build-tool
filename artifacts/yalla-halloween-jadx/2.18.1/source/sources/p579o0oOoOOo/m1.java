package p579o0oOoOOo;

import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p502o0o00o0.o00000O;
import p649o0ooOOoo.qf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class m1 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final qf f46020OoooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        qf qfVarInflate = qf.inflate(activity.getLayoutInflater(), this.f41545Oooo0oo, false);
        Intrinsics.checkNotNullExpressionValue(qfVarInflate, "inflate(activity.layoutI…er, getRootView(), false)");
        this.f46020OoooO = qfVarInflate;
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        OooO0oo(80);
        LinearLayout linearLayout = qfVarInflate.f50385OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        qfVarInflate.f50387OooO0OO.setText(OooOOO.OooO0OO(R.string.treasure_box_rule_7));
        qfVarInflate.f50386OooO0O0.setOnClickListener(new l1(this, 0));
    }

    @Override // p502o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        this.f46020OoooO.f50385OooO00o.requestLayout();
    }
}
