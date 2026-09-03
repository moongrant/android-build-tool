package p459o0Ooo0O;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import p104o000oo0O.o00O0O;
import p553o0oOOO0o.o0O;
import p553o0oOOO0o.o0OO000;
import p553o0oOOO0o.o0OO000o;
import p553o0oOOO0o.oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class o00000O0<Binding extends o00O0O> extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f40436OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public Binding f40437OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40436OooO00o = context;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "from(context)");
        Intrinsics.checkNotNullParameter(this, "root");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Binding binding = null;
        try {
            for (Object obj : SequencesKt.flatMap(SequencesKt.filter(SequencesKt.sequence(new o0O(this, null)), o0OO000.f44624Oooo0o), o0OO000o.f44625Oooo0o)) {
                if ((obj instanceof Class) && o00O0O.class.isAssignableFrom((Class) obj)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Class<*>");
                    Method declaredMethod = ((Class) obj).getDeclaredMethod("inflate", LayoutInflater.class);
                    Intrinsics.checkNotNullExpressionValue(declaredMethod, "it as Class<*>).getDecla…youtInflater::class.java)");
                    Object objInvoke = declaredMethod.invoke(null, layoutInflater);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Binding of com.yalla.android.ylpopupwindow.utils.ViewBindingCreateUtils.createActivityBinding$lambda-1");
                    binding = (Binding) ((o00O0O) objInvoke);
                    Intrinsics.checkNotNull(binding);
                    this.f40437OooO0O0 = binding;
                    binding.OooO0O0().setFocusableInTouchMode(true);
                    setContentView(this.f40437OooO0O0.OooO0O0());
                    getContentView().measure(0, 0);
                    setBackgroundDrawable(new ColorDrawable());
                    setTouchable(true);
                    setOutsideTouchable(true);
                    setFocusable(true);
                    setSoftInputMode(1);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }

    public final void OooO00o(@NotNull View view, boolean z, int i) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        int width = (view.getWidth() - getContentView().getMeasuredWidth()) / 2;
        if (z) {
            Context mCtx = this.f40436OooO00o;
            View popupContentView = getContentView();
            Intrinsics.checkNotNullExpressionValue(popupContentView, "contentView");
            Intrinsics.checkNotNullParameter(view, "<this>");
            Intrinsics.checkNotNullParameter(mCtx, "mCtx");
            Intrinsics.checkNotNullParameter(popupContentView, "popupContentView");
            int[] iArrOooO00o = oo0oO0.OooO00o(view);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) mCtx).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            int identifier = mCtx.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? mCtx.getResources().getDimensionPixelSize(identifier) : 0;
            if (dimensionPixelSize == 0) {
                dimensionPixelSize = (int) ((mCtx.getApplicationContext().getResources().getDisplayMetrics().density * 25.0f) + 0.5f);
            }
            if (!(((i2 - dimensionPixelSize) - iArrOooO00o[1]) - view.getHeight() > popupContentView.getMeasuredHeight())) {
                Intrinsics.checkNotNullParameter(view, "view");
                super.showAsDropDown(view, (view.getWidth() - getContentView().getMeasuredWidth()) / 2, -(view.getHeight() + getContentView().getMeasuredHeight()), 8388611);
                if (!(this.f40436OooO00o instanceof Activity)) {
                    throw new Exception("context is not activity!");
                }
                return;
            }
        }
        super.showAsDropDown(view, width, i, 8388611);
        if (!(this.f40436OooO00o instanceof Activity)) {
            throw new Exception("context is not activity!");
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() throws Exception {
        super.dismiss();
        if (!(this.f40436OooO00o instanceof Activity)) {
            throw new Exception("context is not activity!");
        }
    }
}
