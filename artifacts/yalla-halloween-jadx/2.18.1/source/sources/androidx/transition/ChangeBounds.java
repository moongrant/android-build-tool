package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000Oo;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00O0oO;
import p101o000oOoo.oO00OO0O;
import p101o000oOoo.ooOOOOoo;

/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int[] f9444o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f9445ooOO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final String[] f9436o00O0O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final Property<Drawable, PointF> f9437o00Oo0 = new OooO00o(PointF.class);

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final Property<OooOOOO, PointF> f9438o00Ooo = new OooO0O0(PointF.class);

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static final Property<OooOOOO, PointF> f9439o00o0O = new OooO0OO(PointF.class);

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final Property<View, PointF> f9442o00ooo = new OooO0o(PointF.class);

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final Property<View, PointF> f9443oo000o = new OooO(PointF.class);

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final Property<View, PointF> f9441o00oO0o = new OooOO0(PointF.class);

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static ooOOOOoo f9440o00oO0O = new ooOOOOoo();

    public class OooO extends Property<View, PointF> {
        public OooO(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            oO00OO0O.OooO0O0(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class OooO00o extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Rect f9446OooO00o;

        public OooO00o(Class cls) {
            super(cls, "boundsOrigin");
            this.f9446OooO00o = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.f9446OooO00o);
            Rect rect = this.f9446OooO00o;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f9446OooO00o);
            this.f9446OooO00o.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f9446OooO00o);
        }
    }

    public class OooO0O0 extends Property<OooOOOO, PointF> {
        public OooO0O0(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(OooOOOO oooOOOO) {
            return null;
        }

        @Override // android.util.Property
        public final void set(OooOOOO oooOOOO, PointF pointF) {
            OooOOOO oooOOOO2 = oooOOOO;
            PointF pointF2 = pointF;
            Objects.requireNonNull(oooOOOO2);
            oooOOOO2.f9456OooO00o = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            oooOOOO2.f9457OooO0O0 = iRound;
            int i = oooOOOO2.f9460OooO0o + 1;
            oooOOOO2.f9460OooO0o = i;
            if (i == oooOOOO2.f9462OooO0oO) {
                oO00OO0O.OooO0O0(oooOOOO2.f9461OooO0o0, oooOOOO2.f9456OooO00o, iRound, oooOOOO2.f9458OooO0OO, oooOOOO2.f9459OooO0Oo);
                oooOOOO2.f9460OooO0o = 0;
                oooOOOO2.f9462OooO0oO = 0;
            }
        }
    }

    public class OooO0OO extends Property<OooOOOO, PointF> {
        public OooO0OO(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(OooOOOO oooOOOO) {
            return null;
        }

        @Override // android.util.Property
        public final void set(OooOOOO oooOOOO, PointF pointF) {
            OooOOOO oooOOOO2 = oooOOOO;
            PointF pointF2 = pointF;
            Objects.requireNonNull(oooOOOO2);
            oooOOOO2.f9458OooO0OO = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            oooOOOO2.f9459OooO0Oo = iRound;
            int i = oooOOOO2.f9462OooO0oO + 1;
            oooOOOO2.f9462OooO0oO = i;
            if (oooOOOO2.f9460OooO0o == i) {
                oO00OO0O.OooO0O0(oooOOOO2.f9461OooO0o0, oooOOOO2.f9456OooO00o, oooOOOO2.f9457OooO0O0, oooOOOO2.f9458OooO0OO, iRound);
                oooOOOO2.f9460OooO0o = 0;
                oooOOOO2.f9462OooO0oO = 0;
            }
        }
    }

    public class OooO0o extends Property<View, PointF> {
        public OooO0o(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            oO00OO0O.OooO0O0(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class OooOO0 extends Property<View, PointF> {
        public OooOO0(Class cls) {
            super(cls, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            oO00OO0O.OooO0O0(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public class OooOO0O extends AnimatorListenerAdapter {
        private OooOOOO mViewBounds;

        public OooOO0O(OooOOOO oooOOOO) {
            this.mViewBounds = oooOOOO;
        }
    }

    public class OooOOO extends androidx.transition.OooO {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f9447Oooo0o = false;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9448Oooo0oO;

        public OooOOO(ViewGroup viewGroup) {
            this.f9448Oooo0oO = viewGroup;
        }

        @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            oO00O0oO.OooO0O0(this.f9448Oooo0oO, false);
        }

        @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
            oO00O0oO.OooO0O0(this.f9448Oooo0oO, false);
            this.f9447Oooo0o = true;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            if (!this.f9447Oooo0o) {
                oO00O0oO.OooO0O0(this.f9448Oooo0oO, false);
            }
            transition.OooOoO(this);
        }

        @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
        public final void OooO0o0() {
            oO00O0oO.OooO0O0(this.f9448Oooo0oO, true);
        }
    }

    public class OooOOO0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f9449Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f9450Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ View f9451Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Rect f9452Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f9453OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f9454OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f9455OoooO0O;

        public OooOOO0(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f9451Oooo0oO = view;
            this.f9452Oooo0oo = rect;
            this.f9449Oooo = i;
            this.f9454OoooO00 = i2;
            this.f9453OoooO0 = i3;
            this.f9455OoooO0O = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f9450Oooo0o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f9450Oooo0o) {
                return;
            }
            View view = this.f9451Oooo0oO;
            Rect rect = this.f9452Oooo0oo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOO0.OooO0OO(view, rect);
            oO00OO0O.OooO0O0(this.f9451Oooo0oO, this.f9449Oooo, this.f9454OoooO00, this.f9453OoooO0, this.f9455OoooO0O);
        }
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f9456OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9457OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f9458OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9459OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f9460OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public View f9461OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f9462OooO0oO;

        public OooOOOO(View view) {
            this.f9461OooO0o0 = view;
        }
    }

    public ChangeBounds() {
        this.f9444o0OoOo0 = new int[2];
        this.f9445ooOO = false;
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        int i;
        View view;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorOooO0O0;
        if (oo00o0o == null || oo00o0o2 == null) {
            return null;
        }
        ?? r4 = oo00o0o.f29742OooO00o;
        ?? r5 = oo00o0o2.f29742OooO00o;
        ViewGroup viewGroup2 = (ViewGroup) r4.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) r5.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = oo00o0o2.f29743OooO0O0;
        Rect rect2 = (Rect) oo00o0o.f29742OooO00o.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) oo00o0o2.f29742OooO00o.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        int i4 = rect3.left;
        int i5 = rect2.top;
        int i6 = rect3.top;
        int i7 = rect2.right;
        int i8 = rect3.right;
        int i9 = rect2.bottom;
        int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect4 = (Rect) oo00o0o.f29742OooO00o.get("android:changeBounds:clip");
        Rect rect5 = (Rect) oo00o0o2.f29742OooO00o.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i15 = i;
        if (i15 <= 0) {
            return null;
        }
        if (this.f9445ooOO) {
            view = view2;
            oO00OO0O.OooO0O0(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
            ObjectAnimator objectAnimatorOfObject2 = (i3 == i4 && i5 == i6) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) f9441o00oO0o, (TypeConverter) null, this.f9577Oooooo0.OooO00o(i3, i5, i4, i6));
            if (rect4 == null) {
                i2 = 0;
                rect = new Rect(0, 0, i11, i12);
            } else {
                i2 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooOO0.OooO0OO(view, rect);
                ooOOOOoo oooooooo = f9440o00oO0O;
                Object[] objArr = new Object[2];
                objArr[i2] = rect;
                objArr[1] = rect6;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", oooooooo, objArr);
                objectAnimatorOfObject.addListener(new OooOOO0(view, rect5, i4, i6, i8, i10));
            }
            animatorOooO0O0 = androidx.transition.OooOO0O.OooO0O0(objectAnimatorOfObject2, objectAnimatorOfObject);
        } else {
            view = view2;
            oO00OO0O.OooO0O0(view, i3, i5, i7, i9);
            if (i15 != 2) {
                animatorOooO0O0 = (i3 == i4 && i5 == i6) ? ObjectAnimator.ofObject(view, (Property<View, V>) f9442o00ooo, (TypeConverter) null, this.f9577Oooooo0.OooO00o(i7, i9, i8, i10)) : ObjectAnimator.ofObject(view, (Property<View, V>) f9443oo000o, (TypeConverter) null, this.f9577Oooooo0.OooO00o(i3, i5, i4, i6));
            } else if (i11 == i13 && i12 == i14) {
                animatorOooO0O0 = ObjectAnimator.ofObject(view, (Property<View, V>) f9441o00oO0o, (TypeConverter) null, this.f9577Oooooo0.OooO00o(i3, i5, i4, i6));
            } else {
                OooOOOO oooOOOO = new OooOOOO(view);
                ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(oooOOOO, (Property<OooOOOO, V>) f9438o00Ooo, (TypeConverter) null, this.f9577Oooooo0.OooO00o(i3, i5, i4, i6));
                ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(oooOOOO, (Property<OooOOOO, V>) f9439o00o0O, (TypeConverter) null, this.f9577Oooooo0.OooO00o(i7, i9, i8, i10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfObject3, objectAnimatorOfObject4);
                animatorSet.addListener(new OooOO0O(oooOOOO));
                animatorOooO0O0 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            oO00O0oO.OooO0O0(viewGroup4, true);
            OooO0OO(new OooOOO(viewGroup4));
        }
        return animatorOooO0O0;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOo00() {
        return f9436o00O0O;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void Oooo0o0(oO00O0o oo00o0o) {
        View view = oo00o0o.f29743OooO0O0;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        oo00o0o.f29742OooO00o.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        oo00o0o.f29742OooO00o.put("android:changeBounds:parent", oo00o0o.f29743OooO0O0.getParent());
        if (this.f9445ooOO) {
            oo00o0o.f29742OooO00o.put("android:changeBounds:clip", ViewCompat.OooOO0.OooO00o(view));
        }
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9444o0OoOo0 = new int[2];
        this.f9445ooOO = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29732OooO0O0);
        boolean zOooO00o = o00oO0o.OooO00o(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f9445ooOO = zOooO00o;
    }
}
