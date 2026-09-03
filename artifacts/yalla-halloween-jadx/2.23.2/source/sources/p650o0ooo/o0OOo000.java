package p650o0ooo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.data.constant.FeedbackType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.j;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOo000 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f58724OooOO0O;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0OOo000.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<j> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f58726OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOo000 f58727OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FragmentActivity fragmentActivity, o0OOo000 o0ooo001) {
            super(0);
            this.f58726OooO0Oo = fragmentActivity;
            this.f58727OooO0o0 = o0ooo001;
        }

        @Override // kotlin.jvm.functions.Function0
        public final j invoke() {
            j jVarInflate = j.inflate(LayoutInflater.from(this.f58726OooO0Oo), this.f58727OooO0o0.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(jVarInflate, "inflate(...)");
            return jVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58724OooOO0O = LazyKt.lazy(new OooO0O0(context, this));
        ConstraintLayout constraintLayout = OooOO0().f43968OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f58510OooO0oO;
        if (window2 != null) {
            window2.setGravity(80);
        }
        ImageView close = OooOO0().f43969OooO0O0;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        o000O.OooO0oo(close, new OooO00o());
        OooOO0().f43970OooO0OO.setText(o0000.OooO0OO(o000000.Lucky_Bag_rules_row0));
        OooOO0().f43971OooO0Oo.setText(StringsKt__StringsJVMKt.replace$default(o0000.OooO0OO(o000000.Lucky_Bag_rules_row1), "1", FeedbackType.Suggestions, false, 4, (Object) null));
        OooOO0().f43973OooO0o0.setText(StringsKt__StringsJVMKt.replace$default(o0000.OooO0OO(o000000.Lucky_Bag_rules_row2), FeedbackType.Suggestions, FeedbackType.Recharge, false, 4, (Object) null));
        OooOO0().f43972OooO0o.setText(StringsKt__StringsJVMKt.replace$default(o0000.OooO0OO(o000000.Lucky_Bag_rules_row3), FeedbackType.Recharge, "4", false, 4, (Object) null));
    }

    public final j OooOO0() {
        return (j) this.f58724OooOO0O.getValue();
    }
}
