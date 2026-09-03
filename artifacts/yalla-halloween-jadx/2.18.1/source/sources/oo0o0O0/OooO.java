package oo0o0O0;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.PixelSize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface OooO<T extends View> extends OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f53343OooO0O0 = 0;

    public static final class OooO00o {
        public static final void OooO00o(OooO oooO, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                oooO.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        public static <T extends View> int OooO0O0(OooO<T> oooO, int i, int i2, int i3, boolean z) {
            int i4 = i - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return i5;
            }
            if (i != -2) {
                return -1;
            }
            DisplayMetrics displayMetrics = oooO.getView().getContext().getResources().getDisplayMetrics();
            return z ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }

        public static <T extends View> PixelSize OooO0OO(OooO<T> oooO) {
            int paddingRight;
            ViewGroup.LayoutParams layoutParams = oooO.getView().getLayoutParams();
            int i = layoutParams == null ? -1 : layoutParams.width;
            int width = oooO.getView().getWidth();
            if (oooO.OooO00o()) {
                paddingRight = oooO.getView().getPaddingRight() + oooO.getView().getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            int iOooO0O0 = OooO0O0(oooO, i, width, paddingRight, true);
            if (iOooO0O0 <= 0) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams2 = oooO.getView().getLayoutParams();
            int iOooO0O1 = OooO0O0(oooO, layoutParams2 != null ? layoutParams2.height : -1, oooO.getView().getHeight(), oooO.OooO00o() ? oooO.getView().getPaddingBottom() + oooO.getView().getPaddingTop() : 0, false);
            if (iOooO0O1 <= 0) {
                return null;
            }
            return new PixelSize(iOooO0O0, iOooO0O1);
        }
    }

    boolean OooO00o();

    @NotNull
    T getView();
}
