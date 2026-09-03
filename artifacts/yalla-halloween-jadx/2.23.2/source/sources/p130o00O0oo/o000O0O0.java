package p130o00O0oo;

import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface o000O0O0<T extends View> extends o000OO0O {

    public static final class OooO00o {
        public static <T extends View> o000O0Oo OooO00o(o000O0O0<T> o000o0o1) {
            int paddingRight;
            o000Oo0 oooO00o;
            o000Oo0 oooO00o2;
            ViewGroup.LayoutParams layoutParams = o000o0o1.getView().getLayoutParams();
            int i = layoutParams != null ? layoutParams.width : -1;
            int width = o000o0o1.getView().getWidth();
            if (o000o0o1.OooO00o()) {
                paddingRight = o000o0o1.getView().getPaddingRight() + o000o0o1.getView().getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            if (i == -2) {
                oooO00o = o000Oo0.OooO0O0.f36778OooO00o;
            } else {
                int i2 = i - paddingRight;
                if (i2 > 0) {
                    oooO00o = new o000Oo0.OooO00o(i2);
                } else {
                    int i3 = width - paddingRight;
                    oooO00o = i3 > 0 ? new o000Oo0.OooO00o(i3) : null;
                }
            }
            if (oooO00o == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams2 = o000o0o1.getView().getLayoutParams();
            int i4 = layoutParams2 != null ? layoutParams2.height : -1;
            int height = o000o0o1.getView().getHeight();
            int paddingTop = o000o0o1.OooO00o() ? o000o0o1.getView().getPaddingTop() + o000o0o1.getView().getPaddingBottom() : 0;
            if (i4 == -2) {
                oooO00o2 = o000Oo0.OooO0O0.f36778OooO00o;
            } else {
                int i5 = i4 - paddingTop;
                if (i5 > 0) {
                    oooO00o2 = new o000Oo0.OooO00o(i5);
                } else {
                    int i6 = height - paddingTop;
                    oooO00o2 = i6 > 0 ? new o000Oo0.OooO00o(i6) : null;
                }
            }
            if (oooO00o2 == null) {
                return null;
            }
            return new o000O0Oo(oooO00o, oooO00o2);
        }
    }

    boolean OooO00o();

    @NotNull
    T getView();
}
