package oOO00O;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Rect f60142OooO00o;

    public Oooo000(Rect rect) {
        this.f60142OooO00o = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left;
        int i2 = i + ((int) ((rect4.left - i) * f));
        int i3 = rect3.top;
        int i4 = i3 + ((int) ((rect4.top - i3) * f));
        int i5 = rect3.right;
        int i6 = i5 + ((int) ((rect4.right - i5) * f));
        int i7 = rect3.bottom;
        int i8 = i7 + ((int) ((rect4.bottom - i7) * f));
        Rect rect5 = this.f60142OooO00o;
        if (rect5 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect5.set(i2, i4, i6, i8);
        return rect5;
    }
}
