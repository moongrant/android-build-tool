package p566o0oOo0OO;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0O00OO;
import p414o0Oo0oO.oO00O0o0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O000O extends PopupWindow {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f56394OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f56395OooO00o;

    public static final class OooO00o {
        public static void OooO00o(@Nullable Context context, @NotNull TextView viewParent) {
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            if (o00Ooo.OooO().OooOO0O() || context == null) {
                return;
            }
            new o0O000O(context, viewParent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(@NotNull Context context, @NotNull TextView viewParent) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        Lazy lazy = LazyKt.lazy(new o0OoOoOo(context));
        this.f56395OooO00o = lazy;
        setContentView(((o0O00OO) lazy.getValue()).f44453OooO00o);
        ((o0O00OO) lazy.getValue()).f44455OooO0OO.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = ((o0O00OO) lazy.getValue()).f44455OooO0OO.getMeasuredHeight();
        ConstraintLayout bg = ((o0O00OO) lazy.getValue()).f44454OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bg, "bg");
        o000O.OooO0oo(bg, new o0O0000O(this));
        AppCompatTextView content = ((o0O00OO) lazy.getValue()).f44455OooO0OO;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        o000O.OooO0oo(content, new o0O000(this));
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
        oO00O0o0 oo00o0o0OooO = o00Ooo.OooO();
        oo00o0o0OooO.getClass();
        oo00o0o0OooO.OooO0o("momentCommentRewardHintView" + o0O00oO0.OooOOo0().getValue(), true);
        super.dismiss();
    }
}
