package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import oOO00O.OooOo;
import oOO00O.o0000;
import oOO00O.o00oO0o;
import oOO00O.o0OO00O;
import oOO00O.o0OoOo0;
import oOO00O.oo0o0Oo;
import org.jctools.util.Pow2;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility extends Transition {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String[] f11333OooOoo = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f11334OooOoo0;

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Mode {
    }

    public static class OooO00o extends AnimatorListenerAdapter implements Transition.OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f11336OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ViewGroup f11337OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f11338OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f11340OooO0oo;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f11335OooO = false;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f11339OooO0oO = true;

        public OooO00o(View view, int i) {
            this.f11336OooO0Oo = view;
            this.f11338OooO0o0 = i;
            this.f11337OooO0o = (ViewGroup) view.getParent();
            OooO0o(true);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO00o() {
            OooO0o(false);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0O0() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
            OooO0o(true);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
        }

        public final void OooO0o(boolean z) {
            ViewGroup viewGroup;
            if (!this.f11339OooO0oO || this.f11340OooO0oo == z || (viewGroup = this.f11337OooO0o) == null) {
                return;
            }
            this.f11340OooO0oo = z;
            o0OO00O.OooO00o(viewGroup, z);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            if (!this.f11335OooO) {
                oo0o0Oo.OooO0OO(this.f11338OooO0o0, this.f11336OooO0Oo);
                ViewGroup viewGroup = this.f11337OooO0o;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            OooO0o(false);
            transition.OooOo(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f11335OooO = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f11335OooO) {
                oo0o0Oo.OooO0OO(this.f11338OooO0o0, this.f11336OooO0Oo);
                ViewGroup viewGroup = this.f11337OooO0o;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            OooO0o(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f11335OooO) {
                return;
            }
            oo0o0Oo.OooO0OO(this.f11338OooO0o0, this.f11336OooO0Oo);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f11335OooO) {
                return;
            }
            oo0o0Oo.OooO0OO(0, this.f11336OooO0Oo);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f11341OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f11342OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f11343OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f11344OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ViewGroup f11345OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ViewGroup f11346OooO0o0;
    }

    public Visibility() {
        this.f11334OooOoo0 = 3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static OooO0O0 Oooo0o0(o00oO0o o00oo0o2, o00oO0o o00oo0o3) {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f11341OooO00o = false;
        oooO0O0.f11342OooO0O0 = false;
        if (o00oo0o2 != null) {
            HashMap map = o00oo0o2.f60157OooO00o;
            if (map.containsKey("android:visibility:visibility")) {
                oooO0O0.f11343OooO0OO = ((Integer) map.get("android:visibility:visibility")).intValue();
                oooO0O0.f11346OooO0o0 = (ViewGroup) map.get("android:visibility:parent");
            } else {
                oooO0O0.f11343OooO0OO = -1;
                oooO0O0.f11346OooO0o0 = null;
            }
        } else {
            oooO0O0.f11343OooO0OO = -1;
            oooO0O0.f11346OooO0o0 = null;
        }
        if (o00oo0o3 != null) {
            HashMap map2 = o00oo0o3.f60157OooO00o;
            if (map2.containsKey("android:visibility:visibility")) {
                oooO0O0.f11344OooO0Oo = ((Integer) map2.get("android:visibility:visibility")).intValue();
                oooO0O0.f11345OooO0o = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                oooO0O0.f11344OooO0Oo = -1;
                oooO0O0.f11345OooO0o = null;
            }
        } else {
            oooO0O0.f11344OooO0Oo = -1;
            oooO0O0.f11345OooO0o = null;
        }
        if (o00oo0o2 != null && o00oo0o3 != null) {
            int i = oooO0O0.f11343OooO0OO;
            int i2 = oooO0O0.f11344OooO0Oo;
            if (i == i2 && oooO0O0.f11346OooO0o0 == oooO0O0.f11345OooO0o) {
                return oooO0O0;
            }
            if (i != i2) {
                if (i == 0) {
                    oooO0O0.f11342OooO0O0 = false;
                    oooO0O0.f11341OooO00o = true;
                } else if (i2 == 0) {
                    oooO0O0.f11342OooO0O0 = true;
                    oooO0O0.f11341OooO00o = true;
                }
            } else if (oooO0O0.f11345OooO0o == null) {
                oooO0O0.f11342OooO0O0 = false;
                oooO0O0.f11341OooO00o = true;
            } else if (oooO0O0.f11346OooO0o0 == null) {
                oooO0O0.f11342OooO0O0 = true;
                oooO0O0.f11341OooO00o = true;
            }
        } else if (o00oo0o2 == null && oooO0O0.f11344OooO0Oo == 0) {
            oooO0O0.f11342OooO0O0 = true;
            oooO0O0.f11341OooO00o = true;
        } else if (o00oo0o3 == null && oooO0O0.f11343OooO0OO == 0) {
            oooO0O0.f11342OooO0O0 = false;
            oooO0O0.f11341OooO00o = true;
        }
        return oooO0O0;
    }

    @Override // androidx.transition.Transition
    public void OooO(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
    }

    @Override // androidx.transition.Transition
    public void OooO0o(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (Oooo0o0(OooOOOo(r5, false), OooOOoo(r5, false)).f11341OooO00o != false) goto L20;
     */
    @Override // androidx.transition.Transition
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00oO0o o00oo0o2, @Nullable o00oO0o o00oo0o3) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean zIsAttachedToWindow;
        int i3;
        ViewGroup viewGroup2;
        Bitmap bitmapCreateBitmap;
        OooO0O0 Oooo0o1 = Oooo0o0(o00oo0o2, o00oo0o3);
        if (!Oooo0o1.f11341OooO00o || (Oooo0o1.f11346OooO0o0 == null && Oooo0o1.f11345OooO0o == null)) {
            return null;
        }
        boolean z3 = true;
        if (Oooo0o1.f11342OooO0O0) {
            if ((this.f11334OooOoo0 & 1) == 1 && o00oo0o3 != null) {
                View view = o00oo0o3.f60158OooO0O0;
                if (o00oo0o2 == null) {
                    View view2 = (View) view.getParent();
                }
                return Oooo0o(viewGroup, view, o00oo0o2, o00oo0o3);
            }
            return null;
        }
        int i4 = Oooo0o1.f11344OooO0Oo;
        if ((this.f11334OooOoo0 & 2) == 2 && o00oo0o2 != null) {
            View view3 = o00oo0o3 != null ? o00oo0o3.f60158OooO0O0 : null;
            int i5 = OooOo.save_overlay_view;
            View view4 = o00oo0o2.f60158OooO0O0;
            View view5 = (View) view4.getTag(i5);
            if (view5 != null) {
                i = i4;
                i2 = i5;
                view3 = null;
            } else {
                if (view3 == null || view3.getParent() == null) {
                    if (view3 != null) {
                        view5 = view3;
                        view3 = null;
                        z = false;
                    } else {
                        z = true;
                        view3 = null;
                        view5 = null;
                    }
                } else if (i4 == 4 || view4 == view3) {
                    view5 = null;
                    z = false;
                } else {
                    z = true;
                    view3 = null;
                    view5 = null;
                }
                if (!z) {
                    view3 = view3;
                    i = i4;
                    i2 = i5;
                    view3 = view3;
                    z3 = false;
                } else if (view4.getParent() == null) {
                    i = i4;
                    i2 = i5;
                    z3 = false;
                    view5 = view4;
                } else {
                    if (view4.getParent() instanceof View) {
                        View view6 = (View) view4.getParent();
                        if (Oooo0o0(OooOOoo(view6, true), OooOOOo(view6, true)).f11341OooO00o) {
                            view3 = view3;
                            i = i4;
                            i2 = i5;
                            int id = view6.getId();
                            if (view6.getParent() == null && id != -1) {
                                viewGroup.findViewById(id);
                            }
                        } else {
                            boolean z4 = OooOOO.f11260OooO00o;
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view6.getScrollX(), -view6.getScrollY());
                            o0000 o0000Var = oo0o0Oo.f60176OooO00o;
                            o0000Var.OooO0o0(view4, matrix);
                            o0000Var.OooO0o(viewGroup, matrix);
                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            int iRound4 = Math.round(rectF.bottom);
                            ImageView imageView = new ImageView(view4.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            if (OooOOO.f11260OooO00o) {
                                z2 = !view4.isAttachedToWindow();
                                zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                            } else {
                                z2 = false;
                                zIsAttachedToWindow = false;
                            }
                            boolean z5 = OooOOO.f11261OooO0O0;
                            if (z5 && z2) {
                                if (zIsAttachedToWindow) {
                                    viewGroup2 = (ViewGroup) view4.getParent();
                                    int iIndexOfChild = viewGroup2.indexOfChild(view4);
                                    viewGroup.getOverlay().add(view4);
                                    i3 = iIndexOfChild;
                                } else {
                                    view3 = view3;
                                    i = i4;
                                    i2 = i5;
                                    bitmapCreateBitmap = null;
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, Pow2.MAX_POW2));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view5 = imageView;
                            } else {
                                i3 = 0;
                                viewGroup2 = null;
                            }
                            i = i4;
                            int iRound5 = Math.round(rectF.width());
                            i2 = i5;
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (OooOOO.f11262OooO0OO) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view4.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view4.draw(canvas);
                                }
                            }
                            if (z5 && z2) {
                                viewGroup.getOverlay().remove(view4);
                                viewGroup2.addView(view4, i3);
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, Pow2.MAX_POW2));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view5 = imageView;
                        }
                    } else {
                        view3 = view3;
                        i = i4;
                        i2 = i5;
                    }
                    view3 = view3;
                    z3 = false;
                }
            }
            if (view5 != null) {
                if (!z3) {
                    int[] iArr = (int[]) o00oo0o2.f60157OooO00o.get("android:visibility:screenLocation");
                    int i6 = iArr[0];
                    int i7 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view5.offsetLeftAndRight((i6 - iArr2[0]) - view5.getLeft());
                    view5.offsetTopAndBottom((i7 - iArr2[1]) - view5.getTop());
                    viewGroup.getOverlay().add(view5);
                }
                Animator animatorOooo0oO = Oooo0oO(viewGroup, view5, o00oo0o2);
                if (z3) {
                    return animatorOooo0oO;
                }
                if (animatorOooo0oO == null) {
                    viewGroup.getOverlay().remove(view5);
                    return animatorOooo0oO;
                }
                view4.setTag(i2, view5);
                OooO0O0(new OooOo00(this, viewGroup, view5, view4));
                return animatorOooo0oO;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                oo0o0Oo.OooO0OO(0, view3);
                Animator animatorOooo0oO2 = Oooo0oO(viewGroup, view3, o00oo0o2);
                if (animatorOooo0oO2 == null) {
                    oo0o0Oo.OooO0OO(visibility, view3);
                    return animatorOooo0oO2;
                }
                OooO00o oooO00o = new OooO00o(view3, i);
                animatorOooo0oO2.addListener(oooO00o);
                animatorOooo0oO2.addPauseListener(oooO00o);
                OooO0O0(oooO00o);
                return animatorOooo0oO2;
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public final String[] OooOOo() {
        return f11333OooOoo;
    }

    @Override // androidx.transition.Transition
    public final boolean OooOo00(@Nullable o00oO0o o00oo0o2, @Nullable o00oO0o o00oo0o3) {
        if (o00oo0o2 == null && o00oo0o3 == null) {
            return false;
        }
        if (o00oo0o2 != null && o00oo0o3 != null && o00oo0o3.f60157OooO00o.containsKey("android:visibility:visibility") != o00oo0o2.f60157OooO00o.containsKey("android:visibility:visibility")) {
            return false;
        }
        OooO0O0 Oooo0o1 = Oooo0o0(o00oo0o2, o00oo0o3);
        if (Oooo0o1.f11341OooO00o) {
            return Oooo0o1.f11343OooO0OO == 0 || Oooo0o1.f11344OooO0Oo == 0;
        }
        return false;
    }

    public final void Oooo0OO(o00oO0o o00oo0o2) {
        View view = o00oo0o2.f60158OooO0O0;
        int visibility = view.getVisibility();
        HashMap map = o00oo0o2.f60157OooO00o;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    @Nullable
    public Animator Oooo0o(ViewGroup viewGroup, View view, o00oO0o o00oo0o2, o00oO0o o00oo0o3) {
        return null;
    }

    @Nullable
    public Animator Oooo0oO(ViewGroup viewGroup, View view, o00oO0o o00oo0o2) {
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11334OooOoo0 = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60166OooO0OO);
        int iOooO0o0 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iOooO0o0 != 0) {
            if ((iOooO0o0 & (-4)) == 0) {
                this.f11334OooOoo0 = iOooO0o0;
                return;
            }
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }
}
