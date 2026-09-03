package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p057o0000Oo0.o00000;
import p057o0000Oo0.o000000O;
import p060o0000o.OooO;
import p060o0000o.OooOOO0;
import p060o0000o.OooOo00;
import p060o0000o.o00Oo0;
import p060o0000o.o00oO0o;
import p060o0000o.o0OO00O;
import p060o0000o.o0Oo0oo;
import p065o0000oO0.o000O00;
import p065o0000oO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f7322OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOo00 f7326OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f7327OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public androidx.constraintlayout.widget.OooO00o.C0043OooO00o f7328OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f7330OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f7331OooOO0O;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Context f7335OooOOOO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f7323OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f7324OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7325OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f7329OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f7321OooO = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f7332OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f7334OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f7333OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f7336OooOOOo = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f7338OooOOo0 = -1;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f7337OooOOo = -1;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f7339OooOOoo = -1;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f7341OooOo00 = -1;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f7340OooOo0 = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f7342OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7343OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7344OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00Oo0 f7345OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7346OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0o f7347OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Interpolator f7349OooO0oO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f7351OooOO0;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f7354OooOOO0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o00000 f7348OooO0o0 = new o00000();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f7350OooO0oo = false;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Rect f7353OooOO0o = new Rect();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f7352OooOO0O = System.nanoTime();

        public OooO00o(OooO0o oooO0o, o00Oo0 o00oo1, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.f7354OooOOO0 = false;
            this.f7347OooO0o = oooO0o;
            this.f7345OooO0OO = o00oo1;
            this.f7346OooO0Oo = i2;
            OooO0o oooO0o2 = this.f7347OooO0o;
            if (oooO0o2.f7360OooO0o0 == null) {
                oooO0o2.f7360OooO0o0 = new ArrayList<>();
            }
            oooO0o2.f7360OooO0o0.add(this);
            this.f7349OooO0oO = interpolator;
            this.f7343OooO00o = i4;
            this.f7344OooO0O0 = i5;
            if (i3 == 3) {
                this.f7354OooOOO0 = true;
            }
            this.f7351OooOO0 = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            OooO00o();
        }

        public final void OooO00o() {
            if (this.f7350OooO0oo) {
                long jNanoTime = System.nanoTime();
                long j = jNanoTime - this.f7352OooOO0O;
                this.f7352OooOO0O = jNanoTime;
                float f = this.f7342OooO - (((float) (j * 1.0E-6d)) * this.f7351OooOO0);
                this.f7342OooO = f;
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    this.f7342OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                Interpolator interpolator = this.f7349OooO0oO;
                float interpolation = interpolator == null ? this.f7342OooO : interpolator.getInterpolation(this.f7342OooO);
                o00Oo0 o00oo1 = this.f7345OooO0OO;
                boolean zOooO0o0 = o00oo1.OooO0o0(o00oo1.f27763OooO0O0, interpolation, jNanoTime, this.f7348OooO0o0);
                if (this.f7342OooO <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    int i = this.f7343OooO00o;
                    if (i != -1) {
                        this.f7345OooO0OO.f27763OooO0O0.setTag(i, Long.valueOf(System.nanoTime()));
                    }
                    int i2 = this.f7344OooO0O0;
                    if (i2 != -1) {
                        this.f7345OooO0OO.f27763OooO0O0.setTag(i2, null);
                    }
                    this.f7347OooO0o.f7359OooO0o.add(this);
                }
                if (this.f7342OooO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || zOooO0o0) {
                    this.f7347OooO0o.OooO00o();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = jNanoTime2 - this.f7352OooOO0O;
            this.f7352OooOO0O = jNanoTime2;
            float f2 = (((float) (j2 * 1.0E-6d)) * this.f7351OooOO0) + this.f7342OooO;
            this.f7342OooO = f2;
            if (f2 >= 1.0f) {
                this.f7342OooO = 1.0f;
            }
            Interpolator interpolator2 = this.f7349OooO0oO;
            float interpolation2 = interpolator2 == null ? this.f7342OooO : interpolator2.getInterpolation(this.f7342OooO);
            o00Oo0 o00oo2 = this.f7345OooO0OO;
            boolean zOooO0o1 = o00oo2.OooO0o0(o00oo2.f27763OooO0O0, interpolation2, jNanoTime2, this.f7348OooO0o0);
            if (this.f7342OooO >= 1.0f) {
                int i3 = this.f7343OooO00o;
                if (i3 != -1) {
                    this.f7345OooO0OO.f27763OooO0O0.setTag(i3, Long.valueOf(System.nanoTime()));
                }
                int i4 = this.f7344OooO0O0;
                if (i4 != -1) {
                    this.f7345OooO0OO.f27763OooO0O0.setTag(i4, null);
                }
                if (!this.f7354OooOOO0) {
                    this.f7347OooO0o.f7359OooO0o.add(this);
                }
            }
            if (this.f7342OooO < 1.0f || zOooO0o1) {
                this.f7347OooO0o.OooO00o();
            }
        }

        public final void OooO0O0() {
            this.f7350OooO0oo = true;
            int i = this.f7346OooO0Oo;
            if (i != -1) {
                this.f7351OooOO0 = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f7347OooO0o.OooO00o();
            this.f7352OooOO0O = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public OooO0OO(Context context, XmlPullParser xmlPullParser) {
        byte b;
        this.f7335OooOOOO = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
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
                        OooO0Oo(context, xmlPullParser);
                    } else if (b == 1) {
                        this.f7326OooO0o = new OooOo00(context, xmlPullParser);
                    } else if (b == 2) {
                        this.f7328OooO0oO = androidx.constraintlayout.widget.OooO00o.OooO0Oo(context, xmlPullParser);
                    } else if (b == 3 || b == 4) {
                        ConstraintAttribute.OooO0o0(context, xmlPullParser, this.f7328OooO0oO.f7621OooO0oO);
                    } else {
                        Log.e("ViewTransition", OooO.OooO00o() + " unknown tag " + name);
                        StringBuilder sb = new StringBuilder();
                        sb.append(".xml:");
                        sb.append(xmlPullParser.getLineNumber());
                        Log.e("ViewTransition", sb.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void OooO00o(OooO0o oooO0o, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.OooO00o oooO00o, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator o0oo00o2;
        if (this.f7324OooO0OO) {
            return;
        }
        int i2 = this.f7327OooO0o0;
        if (i2 == 2) {
            View view = viewArr[0];
            o00Oo0 o00oo1 = new o00Oo0(view);
            o00oO0o o00oo0o2 = o00oo1.f27766OooO0o;
            o00oo0o2.f27799Oooo0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            o00oo0o2.f27796Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            o00oo1.f27794Oooo00o = true;
            o00oo0o2.OooO0o0(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            o00oo1.f27768OooO0oO.OooO0o0(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            o00oo1.f27769OooO0oo.OooO0o(view);
            o00oo1.f27761OooO.OooO0o(view);
            this.f7326OooO0o.OooO00o(o00oo1);
            o00oo1.OooO0oo(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i3 = this.f7329OooO0oo;
            int i4 = this.f7321OooO;
            int i5 = this.f7323OooO0O0;
            Context context = motionLayout.getContext();
            int i6 = this.f7332OooOO0o;
            if (i6 != -2) {
                if (i6 == -1) {
                    o0oo00o2 = new o0OO00O(o000000O.OooO0OO(this.f7334OooOOO0));
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
                new OooO00o(oooO0o, o00oo1, i3, i4, i5, o0oo00o2, this.f7336OooOOOo, this.f7338OooOOo0);
                return;
            }
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f7333OooOOO);
            o0oo00o2 = interpolatorLoadInterpolator;
            new OooO00o(oooO0o, o00oo1, i3, i4, i5, o0oo00o2, this.f7336OooOOOo, this.f7338OooOOo0);
            return;
        }
        if (i2 == 1) {
            for (int i7 : motionLayout.getConstraintSetIds()) {
                if (i7 != i) {
                    androidx.constraintlayout.widget.OooO00o oooO00oOooO = motionLayout.OooO(i7);
                    for (View view2 : viewArr) {
                        androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00oOooO = oooO00oOooO.OooO(view2.getId());
                        androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o = this.f7328OooO0oO;
                        if (c0043OooO00o != null) {
                            androidx.constraintlayout.widget.OooO00o.C0043OooO00o.C0044OooO00o c0044OooO00o = c0043OooO00o.f7622OooO0oo;
                            if (c0044OooO00o != null) {
                                c0044OooO00o.OooO0o0(c0043OooO00oOooO);
                            }
                            c0043OooO00oOooO.f7621OooO0oO.putAll(this.f7328OooO0oO.f7621OooO0oO);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.OooO00o oooO00o2 = new androidx.constraintlayout.widget.OooO00o();
        oooO00o2.f7598OooO0o.clear();
        for (Integer num : oooO00o.f7598OooO0o.keySet()) {
            androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o2 = oooO00o.f7598OooO0o.get(num);
            if (c0043OooO00o2 != null) {
                oooO00o2.f7598OooO0o.put(num, c0043OooO00o2.clone());
            }
        }
        for (View view3 : viewArr) {
            androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00oOooO2 = oooO00o2.OooO(view3.getId());
            androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o3 = this.f7328OooO0oO;
            if (c0043OooO00o3 != null) {
                androidx.constraintlayout.widget.OooO00o.C0043OooO00o.C0044OooO00o c0044OooO00o2 = c0043OooO00o3.f7622OooO0oo;
                if (c0044OooO00o2 != null) {
                    c0044OooO00o2.OooO0o0(c0043OooO00oOooO2);
                }
                c0043OooO00oOooO2.f7621OooO0oO.putAll(this.f7328OooO0oO.f7621OooO0oO);
            }
        }
        motionLayout.OooOoo0(i, oooO00o2);
        int i8 = o000Oo0.view_transition;
        motionLayout.OooOoo0(i8, oooO00o);
        motionLayout.setState(i8, -1, -1);
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 = new androidx.constraintlayout.motion.widget.OooO00o.OooO0O0(motionLayout.f7148Oooo0o, i8, i);
        for (View view4 : viewArr) {
            int i9 = this.f7329OooO0oo;
            if (i9 != -1) {
                oooO0O0.f7276OooO0oo = Math.max(i9, 8);
            }
            oooO0O0.f7283OooOOOo = this.f7325OooO0Oo;
            int i10 = this.f7332OooOO0o;
            String str = this.f7334OooOOO0;
            int i11 = this.f7333OooOOO;
            oooO0O0.f7274OooO0o0 = i10;
            oooO0O0.f7273OooO0o = str;
            oooO0O0.f7275OooO0oO = i11;
            int id = view4.getId();
            OooOo00 oooOo00 = this.f7326OooO0o;
            if (oooOo00 != null) {
                ArrayList<OooOOO0> arrayList = oooOo00.f27720OooO00o.get(-1);
                OooOo00 oooOo01 = new OooOo00();
                Iterator<OooOOO0> it = arrayList.iterator();
                while (it.hasNext()) {
                    OooOOO0 oooOOO0Clone = it.next().clone();
                    oooOOO0Clone.f27685OooO0O0 = id;
                    oooOo01.OooO0OO(oooOOO0Clone);
                }
                oooO0O0.f7278OooOO0O.add(oooOo01);
            }
        }
        motionLayout.setTransition(oooO0O0);
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(this, viewArr, 0);
        motionLayout.OooO0OO(1.0f);
        motionLayout.f7181o00000oo = o0oo0oo2;
    }

    public final boolean OooO0O0(View view) {
        int i = this.f7337OooOOo;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f7339OooOOoo;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean OooO0OO(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f7330OooOO0 == -1 && this.f7331OooOO0O == null) || !OooO0O0(view)) {
            return false;
        }
        if (view.getId() == this.f7330OooOO0) {
            return true;
        }
        return this.f7331OooOO0O != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f7546OoooOo0) != null && str.matches(this.f7331OooOO0O);
    }

    public final void OooO0Oo(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == o000O00.ViewTransition_android_id) {
                this.f7322OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f7322OooO00o);
            } else if (index == o000O00.ViewTransition_motionTarget) {
                if (MotionLayout.f7146o0000OOO) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f7330OooOO0);
                    this.f7330OooOO0 = resourceId;
                    if (resourceId == -1) {
                        this.f7331OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f7331OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f7330OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7330OooOO0);
                }
            } else if (index == o000O00.ViewTransition_onStateTransition) {
                this.f7323OooO0O0 = typedArrayObtainStyledAttributes.getInt(index, this.f7323OooO0O0);
            } else if (index == o000O00.ViewTransition_transitionDisable) {
                this.f7324OooO0OO = typedArrayObtainStyledAttributes.getBoolean(index, this.f7324OooO0OO);
            } else if (index == o000O00.ViewTransition_pathMotionArc) {
                this.f7325OooO0Oo = typedArrayObtainStyledAttributes.getInt(index, this.f7325OooO0Oo);
            } else if (index == o000O00.ViewTransition_duration) {
                this.f7329OooO0oo = typedArrayObtainStyledAttributes.getInt(index, this.f7329OooO0oo);
            } else if (index == o000O00.ViewTransition_upDuration) {
                this.f7321OooO = typedArrayObtainStyledAttributes.getInt(index, this.f7321OooO);
            } else if (index == o000O00.ViewTransition_viewTransitionMode) {
                this.f7327OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f7327OooO0o0);
            } else if (index == o000O00.ViewTransition_motionInterpolator) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f7333OooOOO = resourceId2;
                    if (resourceId2 != -1) {
                        this.f7332OooOO0o = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f7334OooOOO0 = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f7332OooOO0o = -1;
                    } else {
                        this.f7333OooOOO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f7332OooOO0o = -2;
                    }
                } else {
                    this.f7332OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, this.f7332OooOO0o);
                }
            } else if (index == o000O00.ViewTransition_setsTag) {
                this.f7336OooOOOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7336OooOOOo);
            } else if (index == o000O00.ViewTransition_clearsTag) {
                this.f7338OooOOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7338OooOOo0);
            } else if (index == o000O00.ViewTransition_ifTagSet) {
                this.f7337OooOOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7337OooOOo);
            } else if (index == o000O00.ViewTransition_ifTagNotSet) {
                this.f7339OooOOoo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7339OooOOoo);
            } else if (index == o000O00.ViewTransition_SharedValueId) {
                this.f7340OooOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7340OooOo0);
            } else if (index == o000O00.ViewTransition_SharedValue) {
                this.f7341OooOo00 = typedArrayObtainStyledAttributes.getInteger(index, this.f7341OooOo00);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ViewTransition(");
        sbOooO0o0.append(OooO.OooO0OO(this.f7335OooOOOO, this.f7322OooO00o));
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }
}
