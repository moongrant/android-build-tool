package o0OO0oO;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import p335o0OO0oOo.OooOo00;
import p389o0OOoooO.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements o00O0OO0, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f43218OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f43219OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final View f43220OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View f43221OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public View f43222OooO0oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f43217OooO = 0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f43223OooOO0 = true;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f43224OooOO0O = true;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO0O0 f43225OooOO0o = new OooO0O0();

    public OooO00o(@NonNull View view) {
        this.f43219OooO0o = view;
        this.f43220OooO0o0 = view;
        this.f43218OooO0Oo = view;
    }

    public static View OooO0OO(View view, PointF pointF, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (OooOo00.OooO0o0(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && OooOo00.OooO0Oo(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewOooO0OO = OooO0OO(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewOooO0OO;
                }
            }
        }
        return view2;
    }

    public final boolean OooO00o() {
        return this.f43224OooOO0O && this.f43225OooOO0o.OooO00o(this.f43218OooO0Oo);
    }

    public final boolean OooO0O0() {
        return this.f43223OooOO0 && this.f43225OooOO0o.OooO0O0(this.f43218OooO0Oo);
    }

    public final void OooO0Oo(int i, int i2, int i3) {
        boolean z;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z2 = true;
        View view = this.f43220OooO0o0;
        if (i2 == -1 || (viewFindViewById2 = view.findViewById(i2)) == null) {
            z = false;
        } else if (i > 0) {
            viewFindViewById2.setTranslationY(i);
            z = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z = false;
        }
        if (i3 == -1 || (viewFindViewById = view.findViewById(i3)) == null) {
            z2 = z;
        } else if (i < 0) {
            viewFindViewById.setTranslationY(i);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z2 = z;
        }
        if (z2) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(i);
        }
        View view2 = this.f43221OooO0oO;
        if (view2 != null) {
            view2.setTranslationY(Math.max(0, i));
        }
        View view3 = this.f43222OooO0oo;
        if (view3 != null) {
            view3.setTranslationY(Math.min(0, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final OooO00o OooO0o0(int i) {
        View view;
        View view2 = this.f43219OooO0o;
        if (view2 == null || i == 0) {
            return null;
        }
        if (i < 0) {
            float f = OooOo00.f43255OooO0O0;
            if (!view2.canScrollVertically(1)) {
                if (i > 0) {
                    return null;
                }
                view = this.f43219OooO0o;
                float f2 = OooOo00.f43255OooO0O0;
                if (!view.canScrollVertically(-1)) {
                    return null;
                }
            }
        } else {
            if (i > 0) {
                return null;
            }
            view = this.f43219OooO0o;
            float f3 = OooOo00.f43255OooO0O0;
            if (!view.canScrollVertically(-1)) {
                return null;
            }
        }
        this.f43217OooO = i;
        return this;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f43217OooO) * this.f43219OooO0o.getScaleY();
            View view = this.f43219OooO0o;
            if (view instanceof AbsListView) {
                float f = OooOo00.f43255OooO0O0;
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f43217OooO = iIntValue;
    }
}
