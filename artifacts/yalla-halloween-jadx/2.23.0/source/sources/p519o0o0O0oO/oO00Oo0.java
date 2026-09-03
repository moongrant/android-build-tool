package p519o0o0O0oO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.data.constant.FeedbackType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p641o0ooOOOO.w7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00Oo0 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f52828OooOO0O;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oO00Oo0.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<w7> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52830OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO00Oo0 f52831OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FragmentActivity fragmentActivity, oO00Oo0 oo00oo0) {
            super(0);
            this.f52830OooO0Oo = fragmentActivity;
            this.f52831OooO0o0 = oo00oo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w7 invoke() {
            w7 w7VarInflate = w7.inflate(LayoutInflater.from(this.f52830OooO0Oo), this.f52831OooO0o0.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(w7VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return w7VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo0(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52828OooOO0O = LazyKt.lazy(new OooO0O0(context, this));
        ConstraintLayout constraintLayout = OooOO0().f59171OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f52535OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        ImageView imageView = OooOO0().f59172OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o000OO00.OooO0oo(imageView, new OooO00o());
        OooOO0().f59173OooO0OO.setText(o0000.OooO0OO(oO00OOo0.Lucky_Bag_rules_row0));
        OooOO0().f59174OooO0Oo.setText(StringsKt.OooOoO(o0000.OooO0OO(oO00OOo0.Lucky_Bag_rules_row1), "1", FeedbackType.Suggestions));
        OooOO0().f59176OooO0o0.setText(StringsKt.OooOoO(o0000.OooO0OO(oO00OOo0.Lucky_Bag_rules_row2), FeedbackType.Suggestions, FeedbackType.Recharge));
        OooOO0().f59175OooO0o.setText(StringsKt.OooOoO(o0000.OooO0OO(oO00OOo0.Lucky_Bag_rules_row3), FeedbackType.Recharge, "4"));
    }

    public final w7 OooOO0() {
        return (w7) this.f52828OooOO0O.getValue();
    }
}
