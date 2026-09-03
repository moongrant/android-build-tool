package p408o0Oo0Oo;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p411o0Oo0Ooo.oOo00OO0;
import p417o0Oo0oOo.oO00O0oO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements oO00O0oO, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f39135Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f39136Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f39137Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f39138Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f39141OoooO00;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f39140OoooO0 = 0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f39142OoooO0O = true;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f39139OoooO = true;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooO f39143OoooOO0 = new OooO();

    public OooO0o(@NonNull View view) {
        this.f39138Oooo0oo = view;
        this.f39137Oooo0oO = view;
        this.f39136Oooo0o = view;
    }

    public final boolean OooO00o() {
        return this.f39139OoooO && this.f39143OoooOO0.OooO00o(this.f39136Oooo0o);
    }

    public final boolean OooO0O0() {
        return this.f39142OoooO0O && this.f39143OoooOO0.OooO0O0(this.f39136Oooo0o);
    }

    public final View OooO0OO(View view, PointF pointF, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (oOo00OO0.OooO0o(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && oOo00OO0.OooO0Oo(childAt)) {
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

    public final void OooO0Oo(int i, int i2, int i3) {
        boolean z;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z2 = true;
        if (i2 == -1 || (viewFindViewById2 = this.f39137Oooo0oO.findViewById(i2)) == null) {
            z = false;
        } else if (i > 0) {
            viewFindViewById2.setTranslationY(i);
            z = true;
        } else {
            if (viewFindViewById2.getTranslationY() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                viewFindViewById2.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            z = false;
        }
        if (i3 == -1 || (viewFindViewById = this.f39137Oooo0oO.findViewById(i3)) == null) {
            z2 = z;
        } else if (i < 0) {
            viewFindViewById.setTranslationY(i);
        } else {
            if (viewFindViewById.getTranslationY() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                viewFindViewById.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            z2 = z;
        }
        if (z2) {
            this.f39137Oooo0oO.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            this.f39137Oooo0oO.setTranslationY(i);
        }
        View view = this.f39135Oooo;
        if (view != null) {
            view.setTranslationY(Math.max(0, i));
        }
        View view2 = this.f39141OoooO00;
        if (view2 != null) {
            view2.setTranslationY(Math.min(0, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final ValueAnimator.AnimatorUpdateListener OooO0o0(int i) {
        View view;
        View view2 = this.f39138Oooo0oo;
        if (view2 == null || i == 0) {
            return null;
        }
        if (i < 0) {
            float f = oOo00OO0.f39170OooO0O0;
            if (!view2.canScrollVertically(1)) {
                if (i > 0) {
                    return null;
                }
                view = this.f39138Oooo0oo;
                float f2 = oOo00OO0.f39170OooO0O0;
                if (!view.canScrollVertically(-1)) {
                    return null;
                }
            }
        } else {
            if (i > 0) {
                return null;
            }
            view = this.f39138Oooo0oo;
            float f3 = oOo00OO0.f39170OooO0O0;
            if (!view.canScrollVertically(-1)) {
                return null;
            }
        }
        this.f39140OoooO0 = i;
        return this;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f39140OoooO0) * this.f39138Oooo0oo.getScaleY();
            View view = this.f39138Oooo0oo;
            if (view instanceof AbsListView) {
                float f = oOo00OO0.f39170OooO0O0;
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f39140OoooO0 = iIntValue;
    }
}
