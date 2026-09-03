package p111o000oooO;

import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface oOO00O<T extends View> extends o00O00O {

    public static final class OooO00o {
        public static <T extends View> o00O00 OooO00o(oOO00O<T> ooo00o) {
            int paddingRight;
            o0O0ooO oooO00o;
            o0O0ooO oooO00o2;
            ViewGroup.LayoutParams layoutParams = ooo00o.getView().getLayoutParams();
            int i = layoutParams != null ? layoutParams.width : -1;
            int width = ooo00o.getView().getWidth();
            if (ooo00o.OooO0O0()) {
                paddingRight = ooo00o.getView().getPaddingRight() + ooo00o.getView().getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            if (i == -2) {
                oooO00o = o0O0ooO.OooO0O0.f35938OooO00o;
            } else {
                int i2 = i - paddingRight;
                if (i2 > 0) {
                    oooO00o = new o0O0ooO.OooO00o(i2);
                } else {
                    int i3 = width - paddingRight;
                    oooO00o = i3 > 0 ? new o0O0ooO.OooO00o(i3) : null;
                }
            }
            if (oooO00o == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams2 = ooo00o.getView().getLayoutParams();
            int i4 = layoutParams2 != null ? layoutParams2.height : -1;
            int height = ooo00o.getView().getHeight();
            int paddingTop = ooo00o.OooO0O0() ? ooo00o.getView().getPaddingTop() + ooo00o.getView().getPaddingBottom() : 0;
            if (i4 == -2) {
                oooO00o2 = o0O0ooO.OooO0O0.f35938OooO00o;
            } else {
                int i5 = i4 - paddingTop;
                if (i5 > 0) {
                    oooO00o2 = new o0O0ooO.OooO00o(i5);
                } else {
                    int i6 = height - paddingTop;
                    oooO00o2 = i6 > 0 ? new o0O0ooO.OooO00o(i6) : null;
                }
            }
            if (oooO00o2 == null) {
                return null;
            }
            return new o00O00(oooO00o, oooO00o2);
        }
    }

    boolean OooO0O0();

    @NotNull
    T getView();
}
