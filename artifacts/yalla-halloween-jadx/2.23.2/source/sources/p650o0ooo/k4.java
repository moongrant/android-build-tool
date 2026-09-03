package p650o0ooo;

import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.u;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class k4 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final u f58364OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        u uVarInflate = u.inflate(activity.getLayoutInflater(), this.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(uVarInflate, "inflate(...)");
        this.f58364OooOO0O = uVarInflate;
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        OooO0oo(80);
        LinearLayout linearLayout = uVarInflate.f45567OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        uVarInflate.f45569OooO0OO.setText(o0000.OooO0OO(o000000.treasure_box_rule_7));
        uVarInflate.f45568OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k4 this$0 = this.f58315OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO() {
        super.OooO();
        this.f58364OooOO0O.f45567OooO00o.requestLayout();
    }
}
