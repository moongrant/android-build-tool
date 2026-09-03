package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o000000O.OooOO0O;
import o000000O.OooOo;
import o000000O.Oooo0;
import o000000O.o0OoOo0;
import o000000O.oo000o;
import org.xmlpull.v1.XmlPullParserException;
import p418o0Oo0oo.oO00Oo0;
import p418o0Oo0oo.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f4756OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O f4760OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4761OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final androidx.constraintlayout.widget.OooO0O0.OooO00o f4762OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f4764OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f4765OooOO0O;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Context f4769OooOOOO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f4757OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f4758OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f4759OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f4763OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4755OooO = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f4766OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f4768OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f4767OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f4770OooOOOo = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f4772OooOOo0 = -1;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f4771OooOOo = -1;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f4773OooOOoo = -1;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f4775OooOo00 = -1;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f4774OooOo0 = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f4776OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f4777OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f4778OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Oooo0 f4779OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f4780OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO0o f4781OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Interpolator f4783OooO0oO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f4785OooOO0;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final boolean f4788OooOOO0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final oO00Oo0 f4782OooO0o0 = new oO00Oo0(0);

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f4784OooO0oo = false;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final Rect f4787OooOO0o = new Rect();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f4786OooOO0O = System.nanoTime();

        public OooO00o(OooO0o oooO0o, Oooo0 oooo0, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.f4788OooOOO0 = false;
            this.f4781OooO0o = oooO0o;
            this.f4779OooO0OO = oooo0;
            this.f4780OooO0Oo = i2;
            if (oooO0o.f4794OooO0o0 == null) {
                oooO0o.f4794OooO0o0 = new ArrayList<>();
            }
            oooO0o.f4794OooO0o0.add(this);
            this.f4783OooO0oO = interpolator;
            this.f4777OooO00o = i4;
            this.f4778OooO0O0 = i5;
            if (i3 == 3) {
                this.f4788OooOOO0 = true;
            }
            this.f4785OooOO0 = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            OooO00o();
        }

        public final void OooO00o() {
            boolean z = this.f4784OooO0oo;
            int i = this.f4778OooO0O0;
            int i2 = this.f4777OooO00o;
            OooO0o oooO0o = this.f4781OooO0o;
            Interpolator interpolator = this.f4783OooO0oO;
            Oooo0 oooo0 = this.f4779OooO0OO;
            if (!z) {
                long jNanoTime = System.nanoTime();
                long j = jNanoTime - this.f4786OooOO0O;
                this.f4786OooOO0O = jNanoTime;
                float f = (((float) (j * 1.0E-6d)) * this.f4785OooOO0) + this.f4776OooO;
                this.f4776OooO = f;
                if (f >= 1.0f) {
                    this.f4776OooO = 1.0f;
                }
                boolean zOooO0o0 = oooo0.OooO0o0(interpolator == null ? this.f4776OooO : interpolator.getInterpolation(this.f4776OooO), jNanoTime, oooo0.f33344OooO0O0, this.f4782OooO0o0);
                if (this.f4776OooO >= 1.0f) {
                    if (i2 != -1) {
                        oooo0.f33344OooO0O0.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        oooo0.f33344OooO0O0.setTag(i, null);
                    }
                    if (!this.f4788OooOOO0) {
                        oooO0o.f4793OooO0o.add(this);
                    }
                }
                if (this.f4776OooO < 1.0f || zOooO0o0) {
                    oooO0o.f4789OooO00o.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = jNanoTime2 - this.f4786OooOO0O;
            this.f4786OooOO0O = jNanoTime2;
            float f2 = this.f4776OooO - (((float) (j2 * 1.0E-6d)) * this.f4785OooOO0);
            this.f4776OooO = f2;
            if (f2 < 0.0f) {
                this.f4776OooO = 0.0f;
            }
            float interpolation = this.f4776OooO;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zOooO0o1 = oooo0.OooO0o0(interpolation, jNanoTime2, oooo0.f33344OooO0O0, this.f4782OooO0o0);
            if (this.f4776OooO <= 0.0f) {
                if (i2 != -1) {
                    oooo0.f33344OooO0O0.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    oooo0.f33344OooO0O0.setTag(i, null);
                }
                oooO0o.f4793OooO0o.add(this);
            }
            if (this.f4776OooO > 0.0f || zOooO0o1) {
                oooO0o.f4789OooO00o.invalidate();
            }
        }

        public final void OooO0O0() {
            this.f4784OooO0oo = true;
            int i = this.f4780OooO0Oo;
            if (i != -1) {
                this.f4785OooOO0 = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f4781OooO0o.f4789OooO00o.invalidate();
            this.f4786OooOO0O = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public OooO0OO(Context context, XmlResourceParser xmlResourceParser) {
        byte b;
        this.f4769OooOOOO = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        OooO0Oo(context, xmlResourceParser);
                    } else if (b == 1) {
                        this.f4760OooO0o = new OooOO0O(context, xmlResourceParser);
                    } else if (b == 2) {
                        this.f4762OooO0oO = androidx.constraintlayout.widget.OooO0O0.OooO0Oo(context, xmlResourceParser);
                    } else if (b == 3 || b == 4) {
                        ConstraintAttribute.OooO0Oo(context, xmlResourceParser, this.f4762OooO0oO.f5070OooO0oO);
                    } else {
                        Log.e("ViewTransition", o000000O.OooO00o.OooO00o() + " unknown tag " + name);
                        StringBuilder sb = new StringBuilder();
                        sb.append(".xml:");
                        sb.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void OooO00o(OooO0o oooO0o, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.OooO0O0 oooO0O0, final View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator oo000oVar;
        if (this.f4758OooO0OO) {
            return;
        }
        int i2 = this.f4761OooO0o0;
        OooOO0O oooOO0O = this.f4760OooO0o;
        if (i2 == 2) {
            View view = viewArr[0];
            Oooo0 oooo0 = new Oooo0(view);
            o0OoOo0 o0oooo1 = oooo0.f33347OooO0o;
            o0oooo1.f33382OooO0o = 0.0f;
            o0oooo1.f33384OooO0oO = 0.0f;
            oooo0.f33375Oooo00o = true;
            o0oooo1.OooO0Oo(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            oooo0.f33349OooO0oO.OooO0Oo(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            OooOo oooOo = oooo0.f33350OooO0oo;
            oooOo.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            oooOo.OooO0O0(view);
            OooOo oooOo2 = oooo0.f33342OooO;
            oooOo2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            oooOo2.OooO0O0(view);
            ArrayList<o000000O.OooO0o> arrayList = oooOO0O.f33274OooO00o.get(-1);
            if (arrayList != null) {
                oooo0.f33365OooOo0o.addAll(arrayList);
            }
            oooo0.OooO0oo(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i3 = this.f4763OooO0oo;
            int i4 = this.f4755OooO;
            int i5 = this.f4757OooO0O0;
            Context context = motionLayout.getContext();
            int i6 = this.f4766OooOO0o;
            if (i6 != -2) {
                if (i6 == -1) {
                    oo000oVar = new oo000o(oO00Oo00.OooO0OO(this.f4768OooOOO0));
                } else if (i6 == 0) {
                    interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                } else if (i6 == 1) {
                    interpolatorLoadInterpolator = new AccelerateInterpolator();
                } else if (i6 == 2) {
                    interpolatorLoadInterpolator = new DecelerateInterpolator();
                } else if (i6 == 4) {
                    interpolatorLoadInterpolator = new BounceInterpolator();
                } else if (i6 != 5) {
                    interpolatorLoadInterpolator = i6 != 6 ? null : new AnticipateInterpolator();
                } else {
                    interpolatorLoadInterpolator = new OvershootInterpolator();
                }
                new OooO00o(oooO0o, oooo0, i3, i4, i5, oo000oVar, this.f4770OooOOOo, this.f4772OooOOo0);
                return;
            }
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f4767OooOOO);
            oo000oVar = interpolatorLoadInterpolator;
            new OooO00o(oooO0o, oooo0, i3, i4, i5, oo000oVar, this.f4770OooOOOo, this.f4772OooOOo0);
            return;
        }
        androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o = this.f4762OooO0oO;
        if (i2 == 1) {
            for (int i7 : motionLayout.getConstraintSetIds()) {
                if (i7 != i) {
                    androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = motionLayout.f4583OooO0Oo;
                    androidx.constraintlayout.widget.OooO0O0 OooO0O1 = oooO00o2 == null ? null : oooO00o2.OooO0O0(i7);
                    for (View view2 : viewArr) {
                        androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00oOooO = OooO0O1.OooO(view2.getId());
                        if (oooO00o != null) {
                            androidx.constraintlayout.widget.OooO0O0.OooO00o.C0118OooO00o c0118OooO00o = oooO00o.f5071OooO0oo;
                            if (c0118OooO00o != null) {
                                c0118OooO00o.OooO0o0(oooO00oOooO);
                            }
                            oooO00oOooO.f5070OooO0oO.putAll(oooO00o.f5070OooO0oO);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.OooO0O0 oooO0O1 = new androidx.constraintlayout.widget.OooO0O0();
        HashMap<Integer, androidx.constraintlayout.widget.OooO0O0.OooO00o> map = oooO0O1.f5047OooO0o;
        map.clear();
        for (Integer num : oooO0O0.f5047OooO0o.keySet()) {
            androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o3 = oooO0O0.f5047OooO0o.get(num);
            if (oooO00o3 != null) {
                map.put(num, oooO00o3.clone());
            }
        }
        for (View view3 : viewArr) {
            androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00oOooO2 = oooO0O1.OooO(view3.getId());
            if (oooO00o != null) {
                androidx.constraintlayout.widget.OooO0O0.OooO00o.C0118OooO00o c0118OooO00o2 = oooO00o.f5071OooO0oo;
                if (c0118OooO00o2 != null) {
                    c0118OooO00o2.OooO0o0(oooO00oOooO2);
                }
                oooO00oOooO2.f5070OooO0oO.putAll(oooO00o.f5070OooO0oO);
            }
        }
        motionLayout.OooOo0o(i, oooO0O1);
        int i8 = androidx.constraintlayout.widget.OooO0o.view_transition;
        motionLayout.OooOo0o(i8, oooO0O0);
        motionLayout.setState(i8, -1, -1);
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O2 = new androidx.constraintlayout.motion.widget.OooO00o.OooO0O0(motionLayout.f4583OooO0Oo, i8, i);
        for (View view4 : viewArr) {
            int i9 = this.f4763OooO0oo;
            if (i9 != -1) {
                oooO0O2.f4710OooO0oo = Math.max(i9, 8);
            }
            oooO0O2.f4717OooOOOo = this.f4759OooO0Oo;
            int i10 = this.f4766OooOO0o;
            String str = this.f4768OooOOO0;
            int i11 = this.f4767OooOOO;
            oooO0O2.f4708OooO0o0 = i10;
            oooO0O2.f4707OooO0o = str;
            oooO0O2.f4709OooO0oO = i11;
            int id = view4.getId();
            if (oooOO0O != null) {
                ArrayList<o000000O.OooO0o> arrayList2 = oooOO0O.f33274OooO00o.get(-1);
                OooOO0O oooOO0O2 = new OooOO0O();
                Iterator<o000000O.OooO0o> it = arrayList2.iterator();
                while (it.hasNext()) {
                    o000000O.OooO0o oooO0oClone = it.next().clone();
                    oooO0oClone.f33250OooO0O0 = id;
                    oooOO0O2.OooO0O0(oooO0oClone);
                }
                oooO0O2.f4712OooOO0O.add(oooOO0O2);
            }
        }
        motionLayout.setTransition(oooO0O2);
        Runnable runnable = new Runnable() { // from class: o000000O.o00Ooo
            @Override // java.lang.Runnable
            public final void run() {
                androidx.constraintlayout.motion.widget.OooO0OO oooO0OO = this.f33377OooO0Oo;
                int i12 = oooO0OO.f4770OooOOOo;
                View[] viewArr2 = viewArr;
                if (i12 != -1) {
                    for (View view5 : viewArr2) {
                        view5.setTag(oooO0OO.f4770OooOOOo, Long.valueOf(System.nanoTime()));
                    }
                }
                if (oooO0OO.f4772OooOOo0 != -1) {
                    for (View view6 : viewArr2) {
                        view6.setTag(oooO0OO.f4772OooOOo0, null);
                    }
                }
            }
        };
        motionLayout.OooO0oO(1.0f);
        motionLayout.f4635OooooOo = runnable;
    }

    public final boolean OooO0O0(View view) {
        int i = this.f4771OooOOo;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f4773OooOOoo;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean OooO0OO(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f4764OooOO0 == -1 && this.f4765OooOO0O == null) || !OooO0O0(view)) {
            return false;
        }
        if (view.getId() == this.f4764OooOO0) {
            return true;
        }
        return this.f4765OooOO0O != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f4980OoooOo0) != null && str.matches(this.f4765OooOO0O);
    }

    public final void OooO0Oo(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == OooO.ViewTransition_android_id) {
                this.f4756OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f4756OooO00o);
            } else if (index == OooO.ViewTransition_motionTarget) {
                if (MotionLayout.f4581o00o0O) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4764OooOO0);
                    this.f4764OooOO0 = resourceId;
                    if (resourceId == -1) {
                        this.f4765OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f4765OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f4764OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4764OooOO0);
                }
            } else if (index == OooO.ViewTransition_onStateTransition) {
                this.f4757OooO0O0 = typedArrayObtainStyledAttributes.getInt(index, this.f4757OooO0O0);
            } else if (index == OooO.ViewTransition_transitionDisable) {
                this.f4758OooO0OO = typedArrayObtainStyledAttributes.getBoolean(index, this.f4758OooO0OO);
            } else if (index == OooO.ViewTransition_pathMotionArc) {
                this.f4759OooO0Oo = typedArrayObtainStyledAttributes.getInt(index, this.f4759OooO0Oo);
            } else if (index == OooO.ViewTransition_duration) {
                this.f4763OooO0oo = typedArrayObtainStyledAttributes.getInt(index, this.f4763OooO0oo);
            } else if (index == OooO.ViewTransition_upDuration) {
                this.f4755OooO = typedArrayObtainStyledAttributes.getInt(index, this.f4755OooO);
            } else if (index == OooO.ViewTransition_viewTransitionMode) {
                this.f4761OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f4761OooO0o0);
            } else if (index == OooO.ViewTransition_motionInterpolator) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f4767OooOOO = resourceId2;
                    if (resourceId2 != -1) {
                        this.f4766OooOO0o = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4768OooOOO0 = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f4766OooOO0o = -1;
                    } else {
                        this.f4767OooOOO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f4766OooOO0o = -2;
                    }
                } else {
                    this.f4766OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, this.f4766OooOO0o);
                }
            } else if (index == OooO.ViewTransition_setsTag) {
                this.f4770OooOOOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4770OooOOOo);
            } else if (index == OooO.ViewTransition_clearsTag) {
                this.f4772OooOOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4772OooOOo0);
            } else if (index == OooO.ViewTransition_ifTagSet) {
                this.f4771OooOOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4771OooOOo);
            } else if (index == OooO.ViewTransition_ifTagNotSet) {
                this.f4773OooOOoo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4773OooOOoo);
            } else if (index == OooO.ViewTransition_SharedValueId) {
                this.f4774OooOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4774OooOo0);
            } else if (index == OooO.ViewTransition_SharedValue) {
                this.f4775OooOo00 = typedArrayObtainStyledAttributes.getInteger(index, this.f4775OooOo00);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + o000000O.OooO00o.OooO0OO(this.f4756OooO00o, this.f4769OooOOOO) + ")";
    }
}
