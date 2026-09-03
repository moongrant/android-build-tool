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
import oOO00O.OooOo;
import oOO00O.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final DecelerateInterpolator f11234OooOooo = new DecelerateInterpolator();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final AccelerateInterpolator f11235Oooo000 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int[] f11236OooOooO;

    public Explode() {
        this.f11236OooOooO = new int[2];
        this.f11319OooOo0O = new oOO00O.OooO0O0();
    }

    private void Oooo0OO(o00oO0o o00oo0o2) {
        View view = o00oo0o2.f60158OooO0O0;
        int[] iArr = this.f11236OooOooO;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        o00oo0o2.f60157OooO00o.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
        Oooo0OO(o00oo0o2);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO0o(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
        Oooo0OO(o00oo0o2);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0o(ViewGroup viewGroup, View view, o00oO0o o00oo0o2, o00oO0o o00oo0o3) {
        if (o00oo0o3 == null) {
            return null;
        }
        Rect rect = (Rect) o00oo0o3.f60157OooO00o.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = this.f11236OooOooO;
        Oooo0oo(viewGroup, rect, iArr);
        return OooOOOO.OooO00o(view, o00oo0o3, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f11234OooOooo, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, o00oO0o o00oo0o2) {
        float f;
        float f2;
        if (o00oo0o2 == null) {
            return null;
        }
        Rect rect = (Rect) o00oo0o2.f60157OooO00o.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) o00oo0o2.f60158OooO0O0.getTag(OooOo.transition_position);
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
        int[] iArr2 = this.f11236OooOooO;
        Oooo0oo(viewGroup, rect, iArr2);
        return OooOOOO.OooO00o(view, o00oo0o2, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f11235Oooo000, this);
    }

    public final void Oooo0oo(View view, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.f11236OooOooO;
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        Transition.OooO0OO oooO0OO = this.f11320OooOo0o;
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

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11236OooOooO = new int[2];
        this.f11319OooOo0O = new oOO00O.OooO0O0();
    }
}
