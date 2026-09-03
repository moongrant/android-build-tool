package p411o0Oo0Ooo;

import Oooo000.OooO00o;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o000O0O0.Oooo0;
import o000O0O0.o00Oo0;
import o000O0O0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo00OO0 implements Interpolator {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static float f39170OooO0O0 = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final float f39171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float f39172OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f39173OooO00o;

    static {
        float fOooO0oo = 1.0f / OooO0oo(1.0f);
        f39171OooO0OO = fOooO0oo;
        f39172OooO0Oo = 1.0f - (OooO0oo(1.0f) * fOooO0oo);
    }

    public oOo00OO0(int i) {
        this.f39173OooO00o = i;
    }

    public static boolean OooO00o(@NonNull View view, PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !OooO0o0(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (OooO0o(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
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
            if (OooO0o(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
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
        return (int) ((f * f39170OooO0O0) + 0.5f);
    }

    public static boolean OooO0Oo(View view) {
        return OooO0o0(view) || (view instanceof ViewPager) || (view instanceof o00Oo0);
    }

    public static boolean OooO0o(@NonNull View view, @NonNull View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = fArr[0] + (view.getScrollX() - view2.getLeft());
        fArr[1] = fArr[1] + (view.getScrollY() - view2.getTop());
        boolean z = fArr[0] >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fArr[1] >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fArr[0] < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z;
    }

    public static boolean OooO0o0(View view) {
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof o0OO00O) || (view instanceof WebView) || (view instanceof Oooo0);
    }

    public static int OooO0oO(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static float OooO0oo(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : OooO00o.OooO00o(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.f39173OooO00o == 1) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float fOooO0oo = OooO0oo(f) * f39171OooO0OO;
        return fOooO0oo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? fOooO0oo + f39172OooO0Oo : fOooO0oo;
    }
}
