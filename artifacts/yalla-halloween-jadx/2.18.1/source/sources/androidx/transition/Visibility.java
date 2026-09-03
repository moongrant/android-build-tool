package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000OOo;
import p101o000oOoo.oO000Oo;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00O0oO;
import p101o000oOoo.oO00OO0O;

/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final String[] f9591ooOO = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f9592o0OoOo0;

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Mode {
    }

    public static class OooO00o extends AnimatorListenerAdapter implements Transition.OooO0o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final View f9594Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f9595Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final ViewGroup f9596Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f9598OoooO00;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f9597OoooO0 = false;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f9593Oooo = true;

        public OooO00o(View view, int i) {
            this.f9594Oooo0o = view;
            this.f9595Oooo0oO = i;
            this.f9596Oooo0oo = (ViewGroup) view.getParent();
            OooO0oO(true);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            OooO0oO(false);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0O0(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            OooO0o();
            transition.OooOoO(this);
        }

        public final void OooO0o() {
            if (!this.f9597OoooO0) {
                oO00OO0O.OooO0Oo(this.f9594Oooo0o, this.f9595Oooo0oO);
                ViewGroup viewGroup = this.f9596Oooo0oo;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            OooO0oO(false);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0() {
            OooO0oO(true);
        }

        public final void OooO0oO(boolean z) {
            ViewGroup viewGroup;
            if (!this.f9593Oooo || this.f9598OoooO00 == z || (viewGroup = this.f9596Oooo0oo) == null) {
                return;
            }
            this.f9598OoooO00 = z;
            oO00O0oO.OooO0O0(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f9597OoooO0 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            OooO0o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f9597OoooO0) {
                return;
            }
            oO00OO0O.OooO0Oo(this.f9594Oooo0o, this.f9595Oooo0oO);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f9597OoooO0) {
                return;
            }
            oO00OO0O.OooO0Oo(this.f9594Oooo0o, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f9599OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f9600OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f9601OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9602OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ViewGroup f9603OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ViewGroup f9604OooO0o0;
    }

    public Visibility() {
        this.f9592o0OoOo0 = 3;
    }

    @Override // androidx.transition.Transition
    public void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Transition
    public void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        boolean z;
        boolean z2;
        OooO0O0 oooO0O0Oooo0o = Oooo0o(oo00o0o, oo00o0o2);
        Animator animatorOooo0oo = null;
        if (oooO0O0Oooo0o.f9599OooO00o && (oooO0O0Oooo0o.f9604OooO0o0 != null || oooO0O0Oooo0o.f9603OooO0o != null)) {
            if (oooO0O0Oooo0o.f9600OooO0O0) {
                if ((this.f9592o0OoOo0 & 1) != 1 || oo00o0o2 == null) {
                    return null;
                }
                if (oo00o0o == null) {
                    View view = (View) oo00o0o2.f29743OooO0O0.getParent();
                    if (Oooo0o(OooOOo(view, false), OooOo0(view, false)).f9599OooO00o) {
                        return null;
                    }
                }
                return Oooo0oO(viewGroup, oo00o0o2.f29743OooO0O0, oo00o0o, oo00o0o2);
            }
            int i = oooO0O0Oooo0o.f9602OooO0Oo;
            if ((this.f9592o0OoOo0 & 2) == 2 && oo00o0o != null) {
                View view2 = oo00o0o.f29743OooO0O0;
                View view3 = oo00o0o2 != null ? oo00o0o2.f29743OooO0O0 : null;
                int i2 = oO000OOo.save_overlay_view;
                View viewOooO00o = (View) view2.getTag(i2);
                if (viewOooO00o != null) {
                    view3 = null;
                    z2 = true;
                } else {
                    if (view3 == null || view3.getParent() == null) {
                        if (view3 != null) {
                            viewOooO00o = view3;
                            view3 = null;
                            z = false;
                        } else {
                            view3 = null;
                            viewOooO00o = null;
                            z = true;
                        }
                    } else if (i == 4 || view2 == view3) {
                        viewOooO00o = null;
                        z = false;
                    } else {
                        view3 = null;
                        viewOooO00o = null;
                        z = true;
                    }
                    if (z) {
                        if (view2.getParent() == null) {
                            viewOooO00o = view2;
                        } else if (view2.getParent() instanceof View) {
                            View view4 = (View) view2.getParent();
                            if (Oooo0o(OooOo0(view4, true), OooOOo(view4, true)).f9599OooO00o) {
                                int id = view4.getId();
                                if (view4.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            } else {
                                viewOooO00o = OooOO0O.OooO00o(viewGroup, view2, view4);
                            }
                        }
                    }
                    z2 = false;
                }
                if (viewOooO00o != null) {
                    if (!z2) {
                        int[] iArr = (int[]) oo00o0o.f29742OooO00o.get("android:visibility:screenLocation");
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        viewOooO00o.offsetLeftAndRight((i3 - iArr2[0]) - viewOooO00o.getLeft());
                        viewOooO00o.offsetTopAndBottom((i4 - iArr2[1]) - viewOooO00o.getTop());
                        viewGroup.getOverlay().add(viewOooO00o);
                    }
                    animatorOooo0oo = Oooo0oo(viewGroup, viewOooO00o, oo00o0o);
                    if (!z2) {
                        if (animatorOooo0oo == null) {
                            viewGroup.getOverlay().remove(viewOooO00o);
                        } else {
                            view2.setTag(i2, viewOooO00o);
                            OooO0OO(new OooOOO(this, viewGroup, viewOooO00o, view2));
                        }
                    }
                } else if (view3 != null) {
                    int visibility = view3.getVisibility();
                    oO00OO0O.OooO0Oo(view3, 0);
                    animatorOooo0oo = Oooo0oo(viewGroup, view3, oo00o0o);
                    if (animatorOooo0oo != null) {
                        OooO00o oooO00o = new OooO00o(view3, i);
                        animatorOooo0oo.addListener(oooO00o);
                        animatorOooo0oo.addPauseListener(oooO00o);
                        OooO0OO(oooO00o);
                    } else {
                        oO00OO0O.OooO0Oo(view3, visibility);
                    }
                }
            }
        }
        return animatorOooo0oo;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public final String[] OooOo00() {
        return f9591ooOO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Transition
    public final boolean OooOo0O(@Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        if (oo00o0o == null && oo00o0o2 == null) {
            return false;
        }
        if (oo00o0o != null && oo00o0o2 != null && oo00o0o2.f29742OooO00o.containsKey("android:visibility:visibility") != oo00o0o.f29742OooO00o.containsKey("android:visibility:visibility")) {
            return false;
        }
        OooO0O0 oooO0O0Oooo0o = Oooo0o(oo00o0o, oo00o0o2);
        if (oooO0O0Oooo0o.f9599OooO00o) {
            return oooO0O0Oooo0o.f9601OooO0OO == 0 || oooO0O0Oooo0o.f9602OooO0Oo == 0;
        }
        return false;
    }

    public final void Oooo(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f9592o0OoOo0 = i;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public final OooO0O0 Oooo0o(oO00O0o oo00o0o, oO00O0o oo00o0o2) {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f9599OooO00o = false;
        oooO0O0.f9600OooO0O0 = false;
        if (oo00o0o == null || !oo00o0o.f29742OooO00o.containsKey("android:visibility:visibility")) {
            oooO0O0.f9601OooO0OO = -1;
            oooO0O0.f9604OooO0o0 = null;
        } else {
            oooO0O0.f9601OooO0OO = ((Integer) oo00o0o.f29742OooO00o.get("android:visibility:visibility")).intValue();
            oooO0O0.f9604OooO0o0 = (ViewGroup) oo00o0o.f29742OooO00o.get("android:visibility:parent");
        }
        if (oo00o0o2 == null || !oo00o0o2.f29742OooO00o.containsKey("android:visibility:visibility")) {
            oooO0O0.f9602OooO0Oo = -1;
            oooO0O0.f9603OooO0o = null;
        } else {
            oooO0O0.f9602OooO0Oo = ((Integer) oo00o0o2.f29742OooO00o.get("android:visibility:visibility")).intValue();
            oooO0O0.f9603OooO0o = (ViewGroup) oo00o0o2.f29742OooO00o.get("android:visibility:parent");
        }
        if (oo00o0o != null && oo00o0o2 != null) {
            int i = oooO0O0.f9601OooO0OO;
            int i2 = oooO0O0.f9602OooO0Oo;
            if (i == i2 && oooO0O0.f9604OooO0o0 == oooO0O0.f9603OooO0o) {
                return oooO0O0;
            }
            if (i != i2) {
                if (i == 0) {
                    oooO0O0.f9600OooO0O0 = false;
                    oooO0O0.f9599OooO00o = true;
                } else if (i2 == 0) {
                    oooO0O0.f9600OooO0O0 = true;
                    oooO0O0.f9599OooO00o = true;
                }
            } else if (oooO0O0.f9603OooO0o == null) {
                oooO0O0.f9600OooO0O0 = false;
                oooO0O0.f9599OooO00o = true;
            } else if (oooO0O0.f9604OooO0o0 == null) {
                oooO0O0.f9600OooO0O0 = true;
                oooO0O0.f9599OooO00o = true;
            }
        } else if (oo00o0o == null && oooO0O0.f9602OooO0Oo == 0) {
            oooO0O0.f9600OooO0O0 = true;
            oooO0O0.f9599OooO00o = true;
        } else if (oo00o0o2 == null && oooO0O0.f9601OooO0OO == 0) {
            oooO0O0.f9600OooO0O0 = false;
            oooO0O0.f9599OooO00o = true;
        }
        return oooO0O0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void Oooo0o0(oO00O0o oo00o0o) {
        oo00o0o.f29742OooO00o.put("android:visibility:visibility", Integer.valueOf(oo00o0o.f29743OooO0O0.getVisibility()));
        oo00o0o.f29742OooO00o.put("android:visibility:parent", oo00o0o.f29743OooO0O0.getParent());
        int[] iArr = new int[2];
        oo00o0o.f29743OooO0O0.getLocationOnScreen(iArr);
        oo00o0o.f29742OooO00o.put("android:visibility:screenLocation", iArr);
    }

    @Nullable
    public Animator Oooo0oO(ViewGroup viewGroup, View view, oO00O0o oo00o0o, oO00O0o oo00o0o2) {
        return null;
    }

    @Nullable
    public Animator Oooo0oo(ViewGroup viewGroup, View view, oO00O0o oo00o0o) {
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9592o0OoOo0 = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29733OooO0OO);
        int iOooO0o = o00oO0o.OooO0o(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iOooO0o != 0) {
            Oooo(iOooO0o);
        }
    }
}
