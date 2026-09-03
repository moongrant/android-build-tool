package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p078o000Oo0O.Oooo000;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final DecelerateInterpolator f8140OooOooo = new DecelerateInterpolator();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final AccelerateInterpolator f8141Oooo000 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int[] f8142OooOooO;

    public Explode() {
        this.f8142OooOooO = new int[2];
        this.f8225OooOo0O = new Oooo000();
    }

    private void Oooo0o0(o00000O0 o00000o1) {
        View view = o00000o1.f34937OooO0O0;
        int[] iArr = this.f8142OooOooO;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        o00000o1.f34936OooO00o.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
        Oooo0o0(o00000o1);
    }

    public final void Oooo(View view, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.f8142OooOooO;
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        Transition.OooO0OO oooO0OO = this.f8226OooOo0o;
        Rect rectOooO00o = oooO0OO == null ? null : oooO0OO.OooO00o();
        if (rectOooO00o == null) {
            iCenterX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i;
            iCenterY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i2;
        } else {
            iCenterX = rectOooO00o.centerX();
            iCenterY = rectOooO00o.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i3 = iCenterX - i;
        int i4 = iCenterY - i2;
        float fMax = Math.max(i3, view.getWidth() - i3);
        float fMax2 = Math.max(i4, view.getHeight() - i4);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, o00000O0 o00000o1, o00000O0 o00000o2) {
        if (o00000o2 == null) {
            return null;
        }
        Rect rect = (Rect) o00000o2.f34936OooO00o.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = this.f8142OooOooO;
        Oooo(viewGroup, rect, iArr);
        return OooOOOO.OooO00o(view, o00000o2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f8140OooOooo, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oo(ViewGroup viewGroup, View view, o00000O0 o00000o1) {
        float f;
        float f2;
        if (o00000o1 == null) {
            return null;
        }
        Rect rect = (Rect) o00000o1.f34936OooO00o.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) o00000o1.f34937OooO0O0.getTag(o0OOO0o.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr[1];
            f2 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f2 = translationY;
        }
        int[] iArr2 = this.f8142OooOooO;
        Oooo(viewGroup, rect, iArr2);
        return OooOOOO.OooO00o(view, o00000o1, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f8141Oooo000, this);
    }

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8142OooOooO = new int[2];
        this.f8225OooOo0O = new Oooo000();
    }
}
