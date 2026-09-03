package p335o0OO0oOo;

import OooOo.OooO0o;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.core.view.o0000Ooo;
import androidx.core.view.o000OOo;
import androidx.core.view.o0Oo0oo;
import androidx.viewpager.widget.ViewPager;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 implements Interpolator {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float f43255OooO0O0 = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final float f43256OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float f43257OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f43258OooO00o;

    static {
        float fOooO0oO = 1.0f / OooO0oO(1.0f);
        f43256OooO0OO = fOooO0oO;
        f43257OooO0Oo = 1.0f - (OooO0oO(1.0f) * fOooO0oO);
    }

    public OooOo00(int i) {
        this.f43258OooO00o = i;
    }

    public static boolean OooO00o(@NonNull View view, PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            if (!((view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof o0000Ooo) || (view instanceof WebView) || (view instanceof o0Oo0oo))) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                PointF pointF2 = new PointF();
                while (childCount > 0) {
                    childCount--;
                    View childAt = viewGroup.getChildAt(childCount);
                    if (OooO0o0(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                        if ("fixed".equals(childAt.getTag()) || "fixed-top".equals(childAt.getTag())) {
                            return false;
                        }
                        pointF.offset(pointF2.x, pointF2.y);
                        boolean zOooO00o = OooO00o(childAt, pointF, z);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return zOooO00o;
                    }
                }
            }
        }
        return z || view.canScrollVertically(-1);
    }

    public static boolean OooO0O0(@NonNull View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        PointF pointF2 = new PointF();
        while (childCount > 0) {
            childCount--;
            View childAt = viewGroup.getChildAt(childCount);
            if (OooO0o0(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                if ("fixed".equals(childAt.getTag()) || "fixed-bottom".equals(childAt.getTag())) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean zOooO0O0 = OooO0O0(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zOooO0O0;
            }
        }
        return true;
    }

    public static int OooO0OO(float f) {
        return (int) ((f * f43255OooO0O0) + 0.5f);
    }

    public static boolean OooO0Oo(View view) {
        return ((view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof o0000Ooo) || (view instanceof WebView) || (view instanceof o0Oo0oo)) || (view instanceof ViewPager) || (view instanceof o000OOo);
    }

    public static int OooO0o(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, Pow2.MAX_POW2) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static boolean OooO0o0(@NonNull View view, @NonNull View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        boolean z = f3 >= 0.0f && scrollY >= 0.0f && f3 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }

    public static float OooO0oO(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : OooO0o.OooO00o(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.f43258OooO00o == 1) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float fOooO0oO = OooO0oO(f) * f43256OooO0OO;
        return fOooO0oO > 0.0f ? fOooO0oO + f43257OooO0Oo : fOooO0oO;
    }
}
