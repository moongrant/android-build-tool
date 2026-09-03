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
import androidx.core.view.o000OOo0;
import java.util.HashMap;
import java.util.WeakHashMap;
import oOO00O.Oooo000;
import oOO00O.o00oO0o;
import oOO00O.o0OO00O;
import oOO00O.o0OoOo0;
import oOO00O.oo0o0Oo;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String[] f11180OooOoo = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO0O0 f11181OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO0OO f11182OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final Oooo000 f11183Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO0o f11184Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO f11185Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooOO0 f11186Oooo00o;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f11187OooOoo0;

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
            oo0o0Oo.OooO00o(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class OooO00o extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f11188OooO00o;

        public OooO00o() {
            super(PointF.class, "boundsOrigin");
            this.f11188OooO00o = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f11188OooO00o;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f11188OooO00o;
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
            oooOOOO2.f11198OooO00o = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            oooOOOO2.f11199OooO0O0 = iRound;
            int i = oooOOOO2.f11202OooO0o + 1;
            oooOOOO2.f11202OooO0o = i;
            if (i == oooOOOO2.f11204OooO0oO) {
                oo0o0Oo.OooO00o(oooOOOO2.f11203OooO0o0, oooOOOO2.f11198OooO00o, iRound, oooOOOO2.f11200OooO0OO, oooOOOO2.f11201OooO0Oo);
                oooOOOO2.f11202OooO0o = 0;
                oooOOOO2.f11204OooO0oO = 0;
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
            oooOOOO2.f11200OooO0OO = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            oooOOOO2.f11201OooO0Oo = iRound;
            int i = oooOOOO2.f11204OooO0oO + 1;
            oooOOOO2.f11204OooO0oO = i;
            if (oooOOOO2.f11202OooO0o == i) {
                oo0o0Oo.OooO00o(oooOOOO2.f11203OooO0o0, oooOOOO2.f11198OooO00o, oooOOOO2.f11199OooO0O0, oooOOOO2.f11200OooO0OO, iRound);
                oooOOOO2.f11202OooO0o = 0;
                oooOOOO2.f11204OooO0oO = 0;
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
            oo0o0Oo.OooO00o(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
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
            oo0o0Oo.OooO00o(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
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
        public boolean f11189OooO0Oo = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11190OooO0o0;

        public OooOOO(ViewGroup viewGroup) {
            this.f11190OooO0o0 = viewGroup;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            o0OO00O.OooO00o(this.f11190OooO0o0, false);
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0O0() {
            o0OO00O.OooO00o(this.f11190OooO0o0, false);
            this.f11189OooO0Oo = true;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
            o0OO00O.OooO00o(this.f11190OooO0o0, true);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            if (!this.f11189OooO0Oo) {
                o0OO00O.OooO00o(this.f11190OooO0o0, false);
            }
            transition.OooOo(this);
        }
    }

    public class OooOOO0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f11191OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f11192OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Rect f11193OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ View f11194OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f11195OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f11196OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f11197OooOO0;

        public OooOOO0(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f11194OooO0o0 = view;
            this.f11193OooO0o = rect;
            this.f11195OooO0oO = i;
            this.f11196OooO0oo = i2;
            this.f11191OooO = i3;
            this.f11197OooOO0 = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f11192OooO0Oo = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f11192OooO0Oo) {
                return;
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            View view = this.f11194OooO0o0;
            ViewCompat.OooOO0.OooO0OO(view, this.f11193OooO0o);
            oo0o0Oo.OooO00o(view, this.f11195OooO0oO, this.f11196OooO0oo, this.f11191OooO, this.f11197OooOO0);
        }
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f11198OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f11199OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f11200OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f11201OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f11202OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f11203OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f11204OooO0oO;

        public OooOOOO(View view) {
            this.f11203OooO0o0 = view;
        }
    }

    static {
        new OooO00o();
        f11181OooOooO = new OooO0O0();
        f11182OooOooo = new OooO0OO();
        f11184Oooo000 = new OooO0o();
        f11185Oooo00O = new OooO();
        f11186Oooo00o = new OooOO0();
        f11183Oooo0 = new Oooo000();
    }

    public ChangeBounds() {
        this.f11187OooOoo0 = false;
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00oO0o o00oo0o2, @Nullable o00oO0o o00oo0o3) {
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
        if (o00oo0o2 == null || o00oo0o3 == null) {
            return null;
        }
        HashMap map = o00oo0o2.f60157OooO00o;
        HashMap map2 = o00oo0o3.f60157OooO00o;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = o00oo0o3.f60158OooO0O0;
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
        boolean z2 = this.f11187OooOoo0;
        OooOO0 oooOO1 = f11186Oooo00o;
        if (z2) {
            oo0o0Oo.OooO00o(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
            if (i3 == i4 && i5 == i6) {
                objectAnimatorOfObject = null;
            } else {
                view = view2;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, oooOO1, (TypeConverter) null, this.f11316OooOo.OooO00o(i3, i5, i4, i6));
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
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooOO0.OooO0OO(view, rect);
                Object[] objArr = new Object[2];
                objArr[i2] = rect;
                objArr[1] = rect2;
                objectAnimatorOfObject2 = ObjectAnimator.ofObject(view, "clipBounds", f11183Oooo0, objArr);
                objectAnimatorOfObject2.addListener(new OooOOO0(view, rect6, i4, i6, i8, i10));
            }
            boolean z3 = androidx.transition.OooOOO.f11260OooO00o;
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
                    o0OO00O.OooO00o(viewGroup4, z);
                    OooO0O0(new OooOOO(viewGroup4));
                }
                return animator;
            }
            animator2 = objectAnimatorOfObject2;
        } else {
            oo0o0Oo.OooO00o(view, i3, i5, i7, i9);
            if (i15 == 2) {
                if (i11 == i13 && i12 == i14) {
                    objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, oooOO1, (TypeConverter) null, this.f11316OooOo.OooO00o(i3, i5, i4, i6));
                } else {
                    OooOOOO oooOOOO = new OooOOOO(view);
                    ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(oooOOOO, f11181OooOooO, (TypeConverter) null, this.f11316OooOo.OooO00o(i3, i5, i4, i6));
                    ObjectAnimator objectAnimatorOfObject5 = ObjectAnimator.ofObject(oooOOOO, f11182OooOooo, (TypeConverter) null, this.f11316OooOo.OooO00o(i7, i9, i8, i10));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfObject4, objectAnimatorOfObject5);
                    animatorSet2.addListener(new OooOO0O(oooOOOO));
                    animator2 = animatorSet2;
                }
            } else if (i3 == i4 && i5 == i6) {
                objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, f11184Oooo000, (TypeConverter) null, this.f11316OooOo.OooO00o(i7, i9, i8, i10));
            } else {
                view = view2;
                objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, f11185Oooo00O, (TypeConverter) null, this.f11316OooOo.OooO00o(i3, i5, i4, i6));
            }
            animator2 = objectAnimatorOfObject3;
        }
        z = true;
        animator = animator2;
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup5 = (ViewGroup) view.getParent();
            o0OO00O.OooO00o(viewGroup5, z);
            OooO0O0(new OooOOO(viewGroup5));
        }
        return animator;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOOo() {
        return f11180OooOoo;
    }

    public final void Oooo0OO(o00oO0o o00oo0o2) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        View view = o00oo0o2.f60158OooO0O0;
        if (!ViewCompat.OooOO0O.OooO0OO(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = o00oo0o2.f60157OooO00o;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.f11187OooOoo0) {
            map.put("android:changeBounds:clip", ViewCompat.OooOO0.OooO00o(view));
        }
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11187OooOoo0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60165OooO0O0);
        boolean zOooO00o = oo000o.OooO00o(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f11187OooOoo0 = zOooO00o;
    }
}
