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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p101o000oOoo.oO0000Oo;
import p101o000oOoo.oO000OOo;
import p101o000oOoo.oO00O0o;

/* JADX INFO: loaded from: classes.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final DecelerateInterpolator f9492o00Oo0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final AccelerateInterpolator f9493o00Ooo = new AccelerateInterpolator();

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int[] f9494o00O0O;

    public Explode() {
        this.f9494o00O0O = new int[2];
        this.f9575OooooOO = new oO0000Oo();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void Oooo0o0(oO00O0o oo00o0o) {
        View view = oo00o0o.f29743OooO0O0;
        view.getLocationOnScreen(this.f9494o00O0O);
        int[] iArr = this.f9494o00O0O;
        int i = iArr[0];
        int i2 = iArr[1];
        oo00o0o.f29742OooO00o.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
        Oooo0o0(oo00o0o);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, oO00O0o oo00o0o, oO00O0o oo00o0o2) {
        if (oo00o0o2 == null) {
            return null;
        }
        Rect rect = (Rect) oo00o0o2.f29742OooO00o.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        OoooO00(viewGroup, rect, this.f9494o00O0O);
        int[] iArr = this.f9494o00O0O;
        return OooOOO0.OooO00o(view, oo00o0o2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f9492o00Oo0, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oo(ViewGroup viewGroup, View view, oO00O0o oo00o0o) {
        float f;
        float f2;
        if (oo00o0o == null) {
            return null;
        }
        Rect rect = (Rect) oo00o0o.f29742OooO00o.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) oo00o0o.f29743OooO0O0.getTag(oO000OOo.transition_position);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        OoooO00(viewGroup, rect, this.f9494o00O0O);
        int[] iArr2 = this.f9494o00O0O;
        return OooOOO0.OooO00o(view, oo00o0o, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f9493o00Ooo, this);
    }

    public final void OoooO00(View view, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        view.getLocationOnScreen(this.f9494o00O0O);
        int[] iArr2 = this.f9494o00O0O;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect rectOooOOo0 = OooOOo0();
        if (rectOooOOo0 == null) {
            iCenterX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i;
            iCenterY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i2;
        } else {
            iCenterX = rectOooOOo0.centerX();
            iCenterY = rectOooOOo0.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fCenterY == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
        this.f9494o00O0O = new int[2];
        this.f9575OooooOO = new oO0000Oo();
    }
}
