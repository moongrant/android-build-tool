package p366o0OOo0O0;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import o00O00o0.OooO00o;
import org.jetbrains.annotations.NotNull;
import p367o0OOo0OO.OooOOO;
import p367o0OOo0OO.OooOOOO;
import p367o0OOo0OO.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOO0<Binding extends OooO00o> extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f43076OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Binding f43077OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(BaseFragmentActivity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43076OooO00o = context;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "from(...)");
        Intrinsics.checkNotNullParameter(this, "root");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Binding binding = null;
        try {
            for (Object obj : SequencesKt.flatMap(SequencesKt.filter(SequencesKt.sequence(new OooOOO(this, null)), OooOOOO.f43082OooO0Oo), OooOo00.f43083OooO0Oo)) {
                if ((obj instanceof Class) && OooO00o.class.isAssignableFrom((Class) obj)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Class<*>");
                    Method declaredMethod = ((Class) obj).getDeclaredMethod("inflate", LayoutInflater.class);
                    Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
                    Object objInvoke = declaredMethod.invoke(null, layoutInflater);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Binding of com.yalla.android.ylpopupwindow.utils.ViewBindingCreateUtils.createActivityBinding$lambda$1");
                    binding = (Binding) ((OooO00o) objInvoke);
                    Intrinsics.checkNotNull(binding);
                    this.f43077OooO0O0 = binding;
                    binding.getRoot().setFocusableInTouchMode(true);
                    setContentView(binding.getRoot());
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

    public final void OooO00o() throws Exception {
        super.dismiss();
        if (!(this.f43076OooO00o instanceof Activity)) {
            throw new Exception("context is not activity!");
        }
    }

    public final void OooO0O0(@NotNull ImageView view, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        int width = (view.getWidth() - getContentView().getMeasuredWidth()) / 2;
        Context mCtx = this.f43076OooO00o;
        if (z) {
            View popupContentView = getContentView();
            Intrinsics.checkNotNullExpressionValue(popupContentView, "getContentView(...)");
            Intrinsics.checkNotNullParameter(view, "<this>");
            Intrinsics.checkNotNullParameter(mCtx, "mCtx");
            Intrinsics.checkNotNullParameter(popupContentView, "popupContentView");
            Intrinsics.checkNotNullParameter(view, "<this>");
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) mCtx).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            int identifier = mCtx.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? mCtx.getResources().getDimensionPixelSize(identifier) : 0;
            if (dimensionPixelSize == 0) {
                dimensionPixelSize = (int) ((mCtx.getApplicationContext().getResources().getDisplayMetrics().density * 25.0f) + 0.5f);
            }
            if (!(((i2 - dimensionPixelSize) - iArr[1]) - view.getHeight() > popupContentView.getMeasuredHeight())) {
                Intrinsics.checkNotNullParameter(view, "view");
                super.showAsDropDown(view, (view.getWidth() - getContentView().getMeasuredWidth()) / 2, -(view.getHeight() + getContentView().getMeasuredHeight()), 8388611);
                if (!(mCtx instanceof Activity)) {
                    throw new Exception("context is not activity!");
                }
                return;
            }
        }
        super.showAsDropDown(view, width, i, 8388611);
        if (!(mCtx instanceof Activity)) {
            throw new Exception("context is not activity!");
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() throws Exception {
        OooO00o();
    }
}
