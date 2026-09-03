package p559o0oOo00;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000OO00;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000O0;
import p464o0Oooo.o000000O;
import p641o0ooOOOO.u1;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends PopupWindow {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f56177OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f56178OooO00o;

    public static final class OooO00o {
        public static void OooO00o(@Nullable Context context, @NotNull TextView viewParent) {
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            if (o00Oo0.OooO().OooOO0O() || context == null) {
                return;
            }
            new OooOOO(context, viewParent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(@NotNull Context context, @NotNull TextView viewParent) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        Lazy lazy = LazyKt.lazy(new OooOOOO(context));
        this.f56178OooO00o = lazy;
        setContentView(((u1) lazy.getValue()).f58927OooO00o);
        ((u1) lazy.getValue()).f58929OooO0OO.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = ((u1) lazy.getValue()).f58929OooO0OO.getMeasuredHeight();
        ConstraintLayout constraintLayout = ((u1) lazy.getValue()).f58928OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.bg");
        o000OO00.OooO0oo(constraintLayout, new OooOO0O(this));
        AppCompatTextView appCompatTextView = ((u1) lazy.getValue()).f58929OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.content");
        o000OO00.OooO0oo(appCompatTextView, new OooOOO0(this));
        int[] iArr = new int[2];
        viewParent.getLocationOnScreen(iArr);
        setBackgroundDrawable(null);
        setWidth(-1);
        setFocusable(true);
        setOutsideTouchable(true);
        showAtLocation(viewParent, 48, iArr[0], iArr[1] - measuredHeight);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        o00000O0 o00000o0OooO = o00Oo0.OooO();
        o00000o0OooO.getClass();
        o00000o0OooO.OooO0o("momentCommentRewardHintView" + o000000O.OooOOo0().getValue(), true);
        super.dismiss();
    }
}
