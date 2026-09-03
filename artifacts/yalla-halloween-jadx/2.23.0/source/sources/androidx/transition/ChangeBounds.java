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
import androidx.core.view.o000O0Oo;
import java.util.HashMap;
import java.util.WeakHashMap;
import p058o0000Ooo.oo000o;
import p078o000Oo0O.o0000;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0000O00;
import p078o000Oo0O.o0O0O00;
import p078o000Oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String[] f8086OooOoo = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO0O0 f8087OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO0OO f8088OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final o0Oo0oo f8089Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO0o f8090Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO f8091Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooOO0 f8092Oooo00o;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f8093OooOoo0;

    public class OooO extends Property<View, PointF> {
        public OooO() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            o0000O00.OooO00o(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class OooO00o extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f8094OooO00o;

        public OooO00o() {
            super(PointF.class, "boundsOrigin");
            this.f8094OooO00o = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f8094OooO00o;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f8094OooO00o;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    public class OooO0O0 extends Property<OooOOOO, PointF> {
        public OooO0O0() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(OooOOOO oooOOOO) {
            return null;
        }

        @Override // android.util.Property
        public final void set(OooOOOO oooOOOO, PointF pointF) {
            OooOOOO oooOOOO2 = oooOOOO;
            PointF pointF2 = pointF;
            oooOOOO2.getClass();
            oooOOOO2.f8104OooO00o = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            oooOOOO2.f8105OooO0O0 = iRound;
            int i = oooOOOO2.f8108OooO0o + 1;
            oooOOOO2.f8108OooO0o = i;
            if (i == oooOOOO2.f8110OooO0oO) {
                o0000O00.OooO00o(oooOOOO2.f8109OooO0o0, oooOOOO2.f8104OooO00o, iRound, oooOOOO2.f8106OooO0OO, oooOOOO2.f8107OooO0Oo);
                oooOOOO2.f8108OooO0o = 0;
                oooOOOO2.f8110OooO0oO = 0;
            }
        }
    }

    public class OooO0OO extends Property<OooOOOO, PointF> {
        public OooO0OO() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(OooOOOO oooOOOO) {
            return null;
        }

        @Override // android.util.Property
        public final void set(OooOOOO oooOOOO, PointF pointF) {
            OooOOOO oooOOOO2 = oooOOOO;
            PointF pointF2 = pointF;
            oooOOOO2.getClass();
            oooOOOO2.f8106OooO0OO = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            oooOOOO2.f8107OooO0Oo = iRound;
            int i = oooOOOO2.f8110OooO0oO + 1;
            oooOOOO2.f8110OooO0oO = i;
            if (oooOOOO2.f8108OooO0o == i) {
                o0000O00.OooO00o(oooOOOO2.f8109OooO0o0, oooOOOO2.f8104OooO00o, oooOOOO2.f8105OooO0O0, oooOOOO2.f8106OooO0OO, iRound);
                oooOOOO2.f8108OooO0o = 0;
                oooOOOO2.f8110OooO0oO = 0;
            }
        }
    }

    public class OooO0o extends Property<View, PointF> {
        public OooO0o() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            o0000O00.OooO00o(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class OooOO0 extends Property<View, PointF> {
        public OooOO0() {
            super(PointF.class, "position");
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
            o0000O00.OooO00o(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public class OooOO0O extends AnimatorListenerAdapter {
        private OooOOOO mViewBounds;

        public OooOO0O(OooOOOO oooOOOO) {
            this.mViewBounds = oooOOOO;
        }
    }

    public class OooOOO extends androidx.transition.OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f8095OooO0Oo = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8096OooO0o0;

        public OooOOO(ViewGroup viewGroup) {
            this.f8096OooO0o0 = viewGroup;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            o0000.OooO00o(this.f8096OooO0o0, false);
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0O0() {
            o0000.OooO00o(this.f8096OooO0o0, false);
            this.f8095OooO0Oo = true;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
            o0000.OooO00o(this.f8096OooO0o0, true);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            if (!this.f8095OooO0Oo) {
                o0000.OooO00o(this.f8096OooO0o0, false);
            }
            transition.OooOoO0(this);
        }
    }

    public class OooOOO0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f8097OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f8098OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Rect f8099OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ View f8100OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f8101OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f8102OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f8103OooOO0;

        public OooOOO0(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f8100OooO0o0 = view;
            this.f8099OooO0o = rect;
            this.f8101OooO0oO = i;
            this.f8102OooO0oo = i2;
            this.f8097OooO = i3;
            this.f8103OooOO0 = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f8098OooO0Oo = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f8098OooO0Oo) {
                return;
            }
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            View view = this.f8100OooO0o0;
            ViewCompat.OooOO0.OooO0OO(view, this.f8099OooO0o);
            o0000O00.OooO00o(view, this.f8101OooO0oO, this.f8102OooO0oo, this.f8097OooO, this.f8103OooOO0);
        }
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8104OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8105OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f8106OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8107OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f8108OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f8109OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f8110OooO0oO;

        public OooOOOO(View view) {
            this.f8109OooO0o0 = view;
        }
    }

    static {
        new OooO00o();
        f8087OooOooO = new OooO0O0();
        f8088OooOooo = new OooO0OO();
        f8090Oooo000 = new OooO0o();
        f8091Oooo00O = new OooO();
        f8092Oooo00o = new OooOO0();
        f8089Oooo0 = new o0Oo0oo();
    }

    public ChangeBounds() {
        this.f8093OooOoo0 = false;
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00000O0 o00000o1, @Nullable o00000O0 o00000o2) {
        int i;
        View view;
        ObjectAnimator objectAnimatorOfObject;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimatorOfObject2;
        boolean z;
        Animator animator;
        Animator animator2;
        ObjectAnimator objectAnimatorOfObject3;
        if (o00000o1 == null || o00000o2 == null) {
            return null;
        }
        HashMap map = o00000o1.f34936OooO00o;
        HashMap map2 = o00000o2.f34936OooO00o;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = o00000o2.f34937OooO0O0;
        Rect rect3 = (Rect) map.get("android:changeBounds:bounds");
        Rect rect4 = (Rect) map2.get("android:changeBounds:bounds");
        int i3 = rect3.left;
        int i4 = rect4.left;
        int i5 = rect3.top;
        int i6 = rect4.top;
        int i7 = rect3.right;
        int i8 = rect4.right;
        int i9 = rect3.bottom;
        int i10 = rect4.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect5 = (Rect) map.get("android:changeBounds:clip");
        Rect rect6 = (Rect) map2.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
        }
        if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
            i++;
        }
        int i15 = i;
        if (i15 <= 0) {
            return null;
        }
        boolean z2 = this.f8093OooOoo0;
        OooOO0 oooOO1 = f8092Oooo00o;
        if (z2) {
            o0000O00.OooO00o(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
            if (i3 == i4 && i5 == i6) {
                objectAnimatorOfObject = null;
            } else {
                view = view2;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, oooOO1, (TypeConverter) null, this.f8222OooOo.OooO00o(i3, i5, i4, i6));
            }
            if (rect5 == null) {
                i2 = 0;
                rect = new Rect(0, 0, i11, i12);
            } else {
                i2 = 0;
            }
            if (rect6 == null) {
                rect = rect5;
                rect2 = new Rect(i2, i2, i13, i14);
            } else {
                rect = rect5;
                rect2 = rect6;
            }
            if (rect.equals(rect2)) {
                objectAnimatorOfObject2 = null;
            } else {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooOO0.OooO0OO(view, rect);
                Object[] objArr = new Object[2];
                objArr[i2] = rect;
                objArr[1] = rect2;
                objectAnimatorOfObject2 = ObjectAnimator.ofObject(view, "clipBounds", f8089Oooo0, objArr);
                objectAnimatorOfObject2.addListener(new OooOOO0(view, rect6, i4, i6, i8, i10));
            }
            boolean z3 = androidx.transition.OooOOO.f8166OooO00o;
            if (objectAnimatorOfObject != null) {
                if (objectAnimatorOfObject2 == null) {
                    animator2 = objectAnimatorOfObject;
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    z = true;
                    animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                    animator = animatorSet;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    o0000.OooO00o(viewGroup4, z);
                    OooO0O0(new OooOOO(viewGroup4));
                }
                return animator;
            }
            animator2 = objectAnimatorOfObject2;
        } else {
            o0000O00.OooO00o(view, i3, i5, i7, i9);
            if (i15 == 2) {
                if (i11 == i13 && i12 == i14) {
                    objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, oooOO1, (TypeConverter) null, this.f8222OooOo.OooO00o(i3, i5, i4, i6));
                } else {
                    OooOOOO oooOOOO = new OooOOOO(view);
                    ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(oooOOOO, f8087OooOooO, (TypeConverter) null, this.f8222OooOo.OooO00o(i3, i5, i4, i6));
                    ObjectAnimator objectAnimatorOfObject5 = ObjectAnimator.ofObject(oooOOOO, f8088OooOooo, (TypeConverter) null, this.f8222OooOo.OooO00o(i7, i9, i8, i10));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfObject4, objectAnimatorOfObject5);
                    animatorSet2.addListener(new OooOO0O(oooOOOO));
                    animator2 = animatorSet2;
                }
            } else if (i3 == i4 && i5 == i6) {
                objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, f8090Oooo000, (TypeConverter) null, this.f8222OooOo.OooO00o(i7, i9, i8, i10));
            } else {
                view = view2;
                objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, f8091Oooo00O, (TypeConverter) null, this.f8222OooOo.OooO00o(i3, i5, i4, i6));
            }
            animator2 = objectAnimatorOfObject3;
        }
        z = true;
        animator = animator2;
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup5 = (ViewGroup) view.getParent();
            o0000.OooO00o(viewGroup5, z);
            OooO0O0(new OooOOO(viewGroup5));
        }
        return animator;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOOoo() {
        return f8086OooOoo;
    }

    public final void Oooo0o0(o00000O0 o00000o1) {
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        View view = o00000o1.f34937OooO0O0;
        if (!ViewCompat.OooOO0O.OooO0OO(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = o00000o1.f34936OooO00o;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.f8093OooOoo0) {
            map.put("android:changeBounds:clip", ViewCompat.OooOO0.OooO00o(view));
        }
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8093OooOoo0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0O00.f34976OooO0O0);
        boolean zOooO00o = oo000o.OooO00o(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f8093OooOoo0 = zOooO00o;
    }
}
