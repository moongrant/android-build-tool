package p360o0OOo00O;

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
import org.jetbrains.annotations.NotNull;
import p081o000OoOO.OooO;
import p462o0OooOo.o0O000Oo;
import p462o0OooOo.o0O000o0;
import p462o0OooOo.o0OoOoOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class OooO0OO<Binding extends OooO> extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f43869OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Binding f43870OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(BaseFragmentActivity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43869OooO00o = context;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "from(context)");
        Intrinsics.checkNotNullParameter(this, "root");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Binding binding = null;
        try {
            for (Object obj : SequencesKt.flatMap(SequencesKt.filter(SequencesKt.sequence(new o0OoOoOo(this, null)), o0O000Oo.f46660OooO0Oo), o0O000o0.f46661OooO0Oo)) {
                if ((obj instanceof Class) && OooO.class.isAssignableFrom((Class) obj)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Class<*>");
                    Method declaredMethod = ((Class) obj).getDeclaredMethod("inflate", LayoutInflater.class);
                    Intrinsics.checkNotNullExpressionValue(declaredMethod, "it as Class<*>).getDecla…youtInflater::class.java)");
                    Object objInvoke = declaredMethod.invoke(null, layoutInflater);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Binding of com.yalla.android.ylpopupwindow.utils.ViewBindingCreateUtils.createActivityBinding$lambda$1");
                    binding = (Binding) ((OooO) objInvoke);
                    Intrinsics.checkNotNull(binding);
                    this.f43870OooO0O0 = binding;
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
        if (!(this.f43869OooO00o instanceof Activity)) {
            throw new Exception("context is not activity!");
        }
    }

    public final void OooO0O0(@NotNull ImageView view, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        int width = (view.getWidth() - getContentView().getMeasuredWidth()) / 2;
        Context mCtx = this.f43869OooO00o;
        if (z) {
            View popupContentView = getContentView();
            Intrinsics.checkNotNullExpressionValue(popupContentView, "contentView");
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
