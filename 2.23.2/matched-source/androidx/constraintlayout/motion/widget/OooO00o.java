package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout.OooOOO;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO;
import androidx.constraintlayout.widget.OooOO0O;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o000000O.Oooo0;
import o000000O.o00oO0o;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParserException;
import p028Oooo0oO.o0oOO;
import p416o0Oo0oo.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SparseIntArray f4679OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MotionLayout f4680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOO0O f4681OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0 f4682OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<OooO0O0> f4683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList<OooO0O0> f4684OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f4685OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.OooO0O0> f4686OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<String, Integer> f4687OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f4688OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f4689OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public MotionEvent f4690OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f4691OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f4692OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public MotionLayout.OooOOO0 f4693OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f4694OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f4695OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooO0o f4696OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f4697OooOOoo;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public class InterpolatorC0115OooO00o implements Interpolator {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO00Oo00 f4698OooO00o;

        public InterpolatorC0115OooO00o(oO00Oo00 oo00oo00) {
            this.f4698OooO00o = oo00oo00;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.f4698OooO00o.OooO00o(f);
        }
    }

    public OooO00o(Context context, MotionLayout motionLayout, int i) {
        this.f4681OooO0O0 = null;
        this.f4682OooO0OO = null;
        ArrayList<OooO0O0> arrayList = new ArrayList<>();
        this.f4683OooO0Oo = arrayList;
        this.f4685OooO0o0 = null;
        this.f4684OooO0o = new ArrayList<>();
        this.f4686OooO0oO = new SparseArray<>();
        this.f4687OooO0oo = new HashMap<>();
        this.f4679OooO = new SparseIntArray();
        this.f4688OooOO0 = 400;
        this.f4689OooOO0O = 0;
        this.f4692OooOOO0 = false;
        this.f4691OooOOO = false;
        this.f4680OooO00o = motionLayout;
        this.f4696OooOOo0 = new OooO0o(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            OooO0O0 oooO0O0 = null;
            while (true) {
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        switch (xml.getName()) {
                            case "MotionScene":
                                OooOO0o(context, xml);
                                break;
                            case "Transition":
                                oooO0O0 = new OooO0O0(this, context, xml);
                                arrayList.add(oooO0O0);
                                if (this.f4682OooO0OO == null && !oooO0O0.f4701OooO0O0) {
                                    this.f4682OooO0OO = oooO0O0;
                                    androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1 = oooO0O0.f4710OooOO0o;
                                    if (oooO0O1 != null) {
                                        oooO0O1.OooO0OO(this.f4694OooOOOo);
                                    }
                                }
                                if (oooO0O0.f4701OooO0O0) {
                                    if (oooO0O0.f4702OooO0OO == -1) {
                                        this.f4685OooO0o0 = oooO0O0;
                                    } else {
                                        this.f4684OooO0o.add(oooO0O0);
                                    }
                                    arrayList.remove(oooO0O0);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnSwipe":
                                if (oooO0O0 == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (oooO0O0 != null) {
                                    oooO0O0.f4710OooOO0o = new androidx.constraintlayout.motion.widget.OooO0O0(context, this.f4680OooO00o, xml);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnClick":
                                if (oooO0O0 != null) {
                                    oooO0O0.f4712OooOOO0.add(new OooO0O0.ViewOnClickListenerC0116OooO00o(context, oooO0O0, xml));
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "StateSet":
                                this.f4681OooO0O0 = new OooOO0O(context, xml);
                                break;
                            case "ConstraintSet":
                                OooO(context, xml);
                                break;
                            case "include":
                            case "Include":
                                OooOO0O(context, xml);
                                break;
                            case "KeyFrameSet":
                                o000000O.OooOO0O oooOO0O = new o000000O.OooOO0O(context, xml);
                                if (oooO0O0 != null) {
                                    oooO0O0.f4709OooOO0O.add(oooOO0O);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "ViewTransition":
                                OooO0OO oooO0OO = new OooO0OO(context, xml);
                                OooO0o oooO0o = this.f4696OooOOo0;
                                oooO0o.f4787OooO0O0.add(oooO0OO);
                                oooO0o.f4788OooO0OO = null;
                                int i2 = oooO0OO.f4754OooO0O0;
                                if (i2 == 4) {
                                    ConstraintLayout.getSharedValues().OooO00o(oooO0OO.f4771OooOo0, new o00oO0o());
                                    break;
                                } else {
                                    if (i2 == 5) {
                                        ConstraintLayout.getSharedValues().OooO00o(oooO0OO.f4771OooOo0, new o00oO0o());
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                    eventType = xml.next();
                }
                SparseArray<androidx.constraintlayout.widget.OooO0O0> sparseArray = this.f4686OooO0oO;
                int i3 = androidx.constraintlayout.widget.OooO0o.motion_base;
                sparseArray.put(i3, new androidx.constraintlayout.widget.OooO0O0());
                this.f4687OooO0oo.put("motion_base", Integer.valueOf(i3));
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final int OooO(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = new androidx.constraintlayout.widget.OooO0O0();
        oooO0O0.f5045OooO0o0 = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iOooO0Oo = -1;
        int iOooO0Oo2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iOooO0Oo2 = OooO0Oo(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        oooO0O0.f5042OooO0OO = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                oooO0O0.f5042OooO0OO = 4;
                                break;
                            case "left":
                                oooO0O0.f5042OooO0OO = 2;
                                break;
                            case "none":
                                oooO0O0.f5042OooO0OO = 0;
                                break;
                            case "right":
                                oooO0O0.f5042OooO0OO = 1;
                                break;
                            case "x_right":
                                oooO0O0.f5042OooO0OO = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iOooO0Oo = OooO0Oo(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f4687OooO0oo.put(attributeValue, Integer.valueOf(iOooO0Oo));
                    oooO0O0.f5040OooO00o = o000000O.OooO00o.OooO0OO(iOooO0Oo, context);
                    break;
            }
        }
        if (iOooO0Oo != -1) {
            int i2 = this.f4680OooO00o.f4595OooOo;
            oooO0O0.OooOO0O(context, xmlResourceParser);
            if (iOooO0Oo2 != -1) {
                this.f4679OooO.put(iOooO0Oo, iOooO0Oo2);
            }
            this.f4686OooO0oO.put(iOooO0Oo, oooO0O0);
        }
        return iOooO0Oo;
    }

    public final boolean OooO00o(int i, MotionLayout motionLayout) {
        if (this.f4693OooOOOO != null) {
            return false;
        }
        for (OooO0O0 oooO0O0 : this.f4683OooO0Oo) {
            int i2 = oooO0O0.f4711OooOOO;
            if (i2 != 0) {
                OooO0O0 oooO0O1 = this.f4682OooO0OO;
                if (oooO0O1 == oooO0O0) {
                    if ((oooO0O1.f4715OooOOo & 2) != 0) {
                        continue;
                    }
                }
                if (i == oooO0O0.f4703OooO0Oo && (i2 == 4 || i2 == 2)) {
                    MotionLayout.OooOo00 oooOo00 = MotionLayout.OooOo00.FINISHED;
                    motionLayout.setState(oooOo00);
                    motionLayout.setTransition(oooO0O0);
                    if (oooO0O0.f4711OooOOO == 4) {
                        motionLayout.OooOo0();
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.OooO(true);
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                        motionLayout.setState(oooOo00);
                        motionLayout.OooOOOo();
                    }
                    return true;
                }
                if (i == oooO0O0.f4702OooO0OO && (i2 == 3 || i2 == 1)) {
                    MotionLayout.OooOo00 oooOo01 = MotionLayout.OooOo00.FINISHED;
                    motionLayout.setState(oooOo01);
                    motionLayout.setTransition(oooO0O0);
                    if (oooO0O0.f4711OooOOO == 3) {
                        motionLayout.OooO0oO(0.0f);
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.OooO(true);
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                        motionLayout.setState(oooOo01);
                        motionLayout.OooOOOo();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.OooO0O0 OooO0O0(int i) {
        int iOooO00o;
        SparseArray<androidx.constraintlayout.widget.OooO0O0> sparseArray = this.f4686OooO0oO;
        OooOO0O oooOO0O = this.f4681OooO0O0;
        if (oooOO0O != null && (iOooO00o = oooOO0O.OooO00o(i)) != -1) {
            i = iOooO00o;
        }
        if (sparseArray.get(i) != null) {
            return sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + o000000O.OooO00o.OooO0OO(i, this.f4680OooO00o.getContext()) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int OooO0OO() {
        OooO0O0 oooO0O0 = this.f4682OooO0OO;
        return oooO0O0 != null ? oooO0O0.f4707OooO0oo : this.f4688OooOO0;
    }

    public final int OooO0Oo(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    public final void OooO0o(Oooo0 oooo0) {
        OooO0O0 oooO0O0 = this.f4682OooO0OO;
        if (oooO0O0 != null) {
            Iterator<o000000O.OooOO0O> it = oooO0O0.f4709OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().OooO00o(oooo0);
            }
        } else {
            OooO0O0 oooO0O1 = this.f4685OooO0o0;
            if (oooO0O1 != null) {
                Iterator<o000000O.OooOO0O> it2 = oooO0O1.f4709OooOO0O.iterator();
                while (it2.hasNext()) {
                    it2.next().OooO00o(oooo0);
                }
            }
        }
    }

    public final Interpolator OooO0o0() {
        OooO0O0 oooO0O0 = this.f4682OooO0OO;
        int i = oooO0O0.f4705OooO0o0;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f4680OooO00o.getContext(), this.f4682OooO0OO.f4706OooO0oO);
        }
        if (i == -1) {
            return new InterpolatorC0115OooO00o(oO00Oo00.OooO0OO(oooO0O0.f4704OooO0o));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final float OooO0oO() {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        OooO0O0 oooO0O1 = this.f4682OooO0OO;
        if (oooO0O1 == null || (oooO0O0 = oooO0O1.f4710OooOO0o) == null) {
            return 0.0f;
        }
        return oooO0O0.f4743OooOo00;
    }

    public final int OooO0oo() {
        OooO0O0 oooO0O0 = this.f4682OooO0OO;
        if (oooO0O0 == null) {
            return -1;
        }
        return oooO0O0.f4703OooO0Oo;
    }

    public final int OooOO0(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return OooO(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final void OooOO0O(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == OooO.include_constraintSet) {
                OooOO0(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOO0o(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == OooO.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f4688OooOO0);
                this.f4688OooOO0 = i2;
                if (i2 < 8) {
                    this.f4688OooOO0 = 8;
                }
            } else if (index == OooO.MotionScene_layoutDuringTransition) {
                this.f4689OooOO0O = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOOO(MotionLayout motionLayout) {
        boolean z;
        int i = 0;
        while (true) {
            SparseArray<androidx.constraintlayout.widget.OooO0O0> sparseArray = this.f4686OooO0oO;
            if (i >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i);
            SparseIntArray sparseIntArray = this.f4679OooO;
            int i2 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (true) {
                if (i2 <= 0) {
                    z = false;
                    break;
                }
                if (i2 != iKeyAt) {
                    int i3 = size - 1;
                    if (size >= 0) {
                        i2 = sparseIntArray.get(i2);
                        size = i3;
                    }
                }
                z = true;
                break;
            }
            if (z) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                OooOOO0(iKeyAt, motionLayout);
                i++;
            }
        }
    }

    public final void OooOOO0(int i, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.OooO0O0> sparseArray = this.f4686OooO0oO;
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = sparseArray.get(i);
        oooO0O0.f5041OooO0O0 = oooO0O0.f5040OooO00o;
        int i2 = this.f4679OooO.get(i);
        HashMap<Integer, androidx.constraintlayout.widget.OooO0O0.OooO00o> map = oooO0O0.f5044OooO0o;
        if (i2 > 0) {
            OooOOO0(i2, motionLayout);
            androidx.constraintlayout.widget.OooO0O0 oooO0O1 = sparseArray.get(i2);
            if (oooO0O1 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + o000000O.OooO00o.OooO0OO(i2, this.f4680OooO00o.getContext()));
                return;
            }
            oooO0O0.f5041OooO0O0 += "/" + oooO0O1.f5041OooO0O0;
            HashMap<Integer, androidx.constraintlayout.widget.OooO0O0.OooO00o> map2 = oooO0O1.f5044OooO0o;
            for (Integer num : map2.keySet()) {
                int iIntValue = num.intValue();
                androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o = map2.get(num);
                if (!map.containsKey(Integer.valueOf(iIntValue))) {
                    map.put(Integer.valueOf(iIntValue), new androidx.constraintlayout.widget.OooO0O0.OooO00o());
                }
                androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o2 = map.get(Integer.valueOf(iIntValue));
                if (oooO00o2 != null) {
                    androidx.constraintlayout.widget.OooO0O0.C0119OooO0O0 c0119OooO0O0 = oooO00o2.f5066OooO0o0;
                    if (!c0119OooO0O0.f5084OooO0O0) {
                        c0119OooO0O0.OooO00o(oooO00o.f5066OooO0o0);
                    }
                    androidx.constraintlayout.widget.OooO0O0.OooO0o oooO0o = oooO00o2.f5063OooO0OO;
                    if (!oooO0o.f5164OooO00o) {
                        androidx.constraintlayout.widget.OooO0O0.OooO0o oooO0o2 = oooO00o.f5063OooO0OO;
                        oooO0o.f5164OooO00o = oooO0o2.f5164OooO00o;
                        oooO0o.f5165OooO0O0 = oooO0o2.f5165OooO0O0;
                        oooO0o.f5167OooO0Oo = oooO0o2.f5167OooO0Oo;
                        oooO0o.f5168OooO0o0 = oooO0o2.f5168OooO0o0;
                        oooO0o.f5166OooO0OO = oooO0o2.f5166OooO0OO;
                    }
                    androidx.constraintlayout.widget.OooO0O0.OooO oooO = oooO00o2.f5065OooO0o;
                    if (!oooO.f5048OooO00o) {
                        oooO.OooO00o(oooO00o.f5065OooO0o);
                    }
                    androidx.constraintlayout.widget.OooO0O0.OooO0OO oooO0OO = oooO00o2.f5064OooO0Oo;
                    if (!oooO0OO.f5152OooO00o) {
                        oooO0OO.OooO00o(oooO00o.f5064OooO0Oo);
                    }
                    for (String str : oooO00o.f5067OooO0oO.keySet()) {
                        if (!oooO00o2.f5067OooO0oO.containsKey(str)) {
                            oooO00o2.f5067OooO0oO.put(str, oooO00o.f5067OooO0oO.get(str));
                        }
                    }
                }
            }
        } else {
            oooO0O0.f5041OooO0O0 = o0oOO.OooO0O0(new StringBuilder(), oooO0O0.f5041OooO0O0, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (oooO0O0.f5045OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new androidx.constraintlayout.widget.OooO0O0.OooO00o());
                }
                androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o3 = map.get(Integer.valueOf(id));
                if (oooO00o3 != null) {
                    androidx.constraintlayout.widget.OooO0O0.C0119OooO0O0 c0119OooO0O1 = oooO00o3.f5066OooO0o0;
                    if (!c0119OooO0O1.f5084OooO0O0) {
                        oooO00o3.OooO0OO(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            c0119OooO0O1.f5142Ooooooo = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                c0119OooO0O1.f5146o00Ooo = barrier.getAllowsGoneWidget();
                                c0119OooO0O1.f5140Oooooo0 = barrier.getType();
                                c0119OooO0O1.f5139Oooooo = barrier.getMargin();
                            }
                        }
                        c0119OooO0O1.f5084OooO0O0 = true;
                    }
                    androidx.constraintlayout.widget.OooO0O0.OooO0o oooO0o3 = oooO00o3.f5063OooO0OO;
                    if (!oooO0o3.f5164OooO00o) {
                        oooO0o3.f5165OooO0O0 = childAt.getVisibility();
                        oooO0o3.f5167OooO0Oo = childAt.getAlpha();
                        oooO0o3.f5164OooO00o = true;
                    }
                    androidx.constraintlayout.widget.OooO0O0.OooO oooO2 = oooO00o3.f5065OooO0o;
                    if (!oooO2.f5048OooO00o) {
                        oooO2.f5048OooO00o = true;
                        oooO2.f5049OooO0O0 = childAt.getRotation();
                        oooO2.f5050OooO0OO = childAt.getRotationX();
                        oooO2.f5051OooO0Oo = childAt.getRotationY();
                        oooO2.f5053OooO0o0 = childAt.getScaleX();
                        oooO2.f5052OooO0o = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            oooO2.f5054OooO0oO = pivotX;
                            oooO2.f5055OooO0oo = pivotY;
                        }
                        oooO2.f5056OooOO0 = childAt.getTranslationX();
                        oooO2.f5057OooOO0O = childAt.getTranslationY();
                        oooO2.f5058OooOO0o = childAt.getTranslationZ();
                        if (oooO2.f5060OooOOO0) {
                            oooO2.f5059OooOOO = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o4 : map.values()) {
            if (oooO00o4.f5068OooO0oo != null) {
                if (oooO00o4.f5062OooO0O0 != null) {
                    Iterator<Integer> it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00oOooO = oooO0O0.OooO(it.next().intValue());
                        String str2 = oooO00oOooO.f5066OooO0o0.f5149ooOO;
                        if (str2 != null && oooO00o4.f5062OooO0O0.matches(str2)) {
                            oooO00o4.f5068OooO0oo.OooO0o0(oooO00oOooO);
                            oooO00oOooO.f5067OooO0oO.putAll((HashMap) oooO00o4.f5067OooO0oO.clone());
                        }
                    }
                } else {
                    oooO00o4.f5068OooO0oo.OooO0o0(oooO0O0.OooO(oooO00o4.f5061OooO00o));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void OooOOOO(int i, int i2) {
        int iOooO00o;
        int iOooO00o2;
        OooO0O0 oooO0O0;
        ArrayList<OooO0O0> arrayList;
        Iterator<OooO0O0> it;
        OooO0O0 oooO0O1;
        OooO0O0 oooO0O2;
        OooO0O0 next;
        int i3;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O3;
        OooOO0O oooOO0O = this.f4681OooO0O0;
        if (oooOO0O != null) {
            iOooO00o = oooOO0O.OooO00o(i);
            if (iOooO00o == -1) {
                iOooO00o = i;
            }
            iOooO00o2 = this.f4681OooO0O0.OooO00o(i2);
            if (iOooO00o2 == -1) {
            }
            oooO0O0 = this.f4682OooO0OO;
            if (oooO0O0 == null && oooO0O0.f4702OooO0OO == i2 && oooO0O0.f4703OooO0Oo == i) {
                return;
            }
            arrayList = this.f4683OooO0Oo;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    oooO0O1 = this.f4685OooO0o0;
                    for (OooO0O0 oooO0O4 : this.f4684OooO0o) {
                        if (oooO0O4.f4702OooO0OO == i2) {
                            oooO0O1 = oooO0O4;
                        }
                    }
                    oooO0O2 = new OooO0O0(this, oooO0O1);
                    oooO0O2.f4703OooO0Oo = iOooO00o;
                    oooO0O2.f4702OooO0OO = iOooO00o2;
                    if (iOooO00o != -1) {
                        arrayList.add(oooO0O2);
                    }
                    this.f4682OooO0OO = oooO0O2;
                    return;
                }
                next = it.next();
                i3 = next.f4702OooO0OO;
                if ((i3 != iOooO00o2 && next.f4703OooO0Oo == iOooO00o) || (i3 == i2 && next.f4703OooO0Oo == i)) {
                    break;
                }
            }
            this.f4682OooO0OO = next;
            oooO0O3 = next.f4710OooOO0o;
            if (oooO0O3 != null) {
                oooO0O3.OooO0OO(this.f4694OooOOOo);
            }
        }
        iOooO00o = i;
        iOooO00o2 = i2;
        oooO0O0 = this.f4682OooO0OO;
        if (oooO0O0 == null) {
        }
        arrayList = this.f4683OooO0Oo;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                oooO0O1 = this.f4685OooO0o0;
                while (r4.hasNext()) {
                    if (oooO0O4.f4702OooO0OO == i2) {
                        oooO0O1 = oooO0O4;
                    }
                }
                oooO0O2 = new OooO0O0(this, oooO0O1);
                oooO0O2.f4703OooO0Oo = iOooO00o;
                oooO0O2.f4702OooO0OO = iOooO00o2;
                if (iOooO00o != -1) {
                    arrayList.add(oooO0O2);
                }
                this.f4682OooO0OO = oooO0O2;
                return;
            }
            next = it.next();
            i3 = next.f4702OooO0OO;
            if (i3 != iOooO00o2) {
            }
        }
        this.f4682OooO0OO = next;
        oooO0O3 = next.f4710OooOO0o;
        if (oooO0O3 != null) {
            oooO0O3.OooO0OO(this.f4694OooOOOo);
        }
    }

    public final boolean OooOOOo() {
        Iterator<OooO0O0> it = this.f4683OooO0Oo.iterator();
        while (it.hasNext()) {
            if (it.next().f4710OooOO0o != null) {
                return true;
            }
        }
        OooO0O0 oooO0O0 = this.f4682OooO0OO;
        return (oooO0O0 == null || oooO0O0.f4710OooOO0o == null) ? false : true;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f4699OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f4700OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f4701OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f4702OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f4703OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f4704OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f4705OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f4706OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f4707OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final OooO00o f4708OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ArrayList<o000000O.OooOO0O> f4709OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.OooO0O0 f4710OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f4711OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final ArrayList<ViewOnClickListenerC0116OooO00o> f4712OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f4713OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f4714OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f4715OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f4716OooOOo0;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0116OooO00o implements View.OnClickListener {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final OooO0O0 f4717OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final int f4718OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final int f4719OooO0o0;

            public ViewOnClickListenerC0116OooO00o(Context context, OooO0O0 oooO0O0, XmlResourceParser xmlResourceParser) {
                this.f4719OooO0o0 = -1;
                this.f4718OooO0o = 17;
                this.f4717OooO0Oo = oooO0O0;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == OooO.OnClick_targetId) {
                        this.f4719OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4719OooO0o0);
                    } else if (index == OooO.OnClick_clickAction) {
                        this.f4718OooO0o = typedArrayObtainStyledAttributes.getInt(index, this.f4718OooO0o);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void OooO00o(MotionLayout motionLayout, int i, OooO0O0 oooO0O0) {
                boolean z;
                View viewFindViewById;
                int i2 = this.f4719OooO0o0;
                View view = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", "OnClick could not find id " + i2);
                    return;
                }
                int i3 = oooO0O0.f4703OooO0Oo;
                int i4 = oooO0O0.f4702OooO0OO;
                if (i3 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.f4718OooO0o;
                int i6 = i5 & 1;
                if (i6 == 0 || i != i3) {
                    view = viewFindViewById;
                    z = false;
                } else {
                    z = true;
                }
                if (((i6 != 0 && i == i3) | z | ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4)) || ((i5 & 4096) != 0 && i == i4)) {
                    view.setOnClickListener(this);
                }
            }

            public final void OooO0O0(MotionLayout motionLayout) {
                int i = this.f4719OooO0o0;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                OooO0O0 oooO0O0 = this.f4717OooO0Oo;
                OooO00o oooO00o = oooO0O0.f4708OooOO0;
                MotionLayout motionLayout = oooO00o.f4680OooO00o;
                if (motionLayout.f4589OooOOO0) {
                    if (oooO0O0.f4703OooO0Oo == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState != -1) {
                            OooO0O0 oooO0O1 = new OooO0O0(oooO0O0.f4708OooOO0, oooO0O0);
                            oooO0O1.f4703OooO0Oo = currentState;
                            oooO0O1.f4702OooO0OO = oooO0O0.f4702OooO0OO;
                            motionLayout.setTransition(oooO0O1);
                            motionLayout.OooOo0();
                            return;
                        }
                        int i2 = oooO0O0.f4702OooO0OO;
                        if (motionLayout.isAttachedToWindow()) {
                            motionLayout.OooOo0O(i2, -1);
                            return;
                        }
                        if (motionLayout.f4631OooooOO == null) {
                            motionLayout.f4631OooooOO = motionLayout.new OooOOO();
                        }
                        motionLayout.f4631OooooOO.f4675OooO0Oo = i2;
                        return;
                    }
                    OooO0O0 oooO0O2 = oooO00o.f4682OooO0OO;
                    int i3 = this.f4718OooO0o;
                    int i4 = i3 & 1;
                    boolean z = true;
                    boolean z2 = (i4 == 0 && (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) ? false : true;
                    int i5 = i3 & 16;
                    boolean z3 = (i5 == 0 && (i3 & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        if (oooO0O2 != oooO0O0) {
                            motionLayout.setTransition(oooO0O0);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z2 = false;
                        } else {
                            z3 = false;
                        }
                    }
                    if (oooO0O0 != oooO0O2) {
                        int i6 = oooO0O0.f4702OooO0OO;
                        int i7 = oooO0O0.f4703OooO0Oo;
                        if (i7 != -1 ? !((i = motionLayout.f4579OooO) == i7 || i == i6) : motionLayout.f4579OooO == i6) {
                            z = false;
                        }
                    }
                    if (z) {
                        if (z2 && i4 != 0) {
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.OooOo0();
                            return;
                        }
                        if (z3 && i5 != 0) {
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.OooO0oO(0.0f);
                        } else if (z2 && (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (i3 & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
        }

        public OooO0O0(OooO00o oooO00o, OooO0O0 oooO0O0) {
            this.f4700OooO00o = -1;
            this.f4701OooO0O0 = false;
            this.f4702OooO0OO = -1;
            this.f4703OooO0Oo = -1;
            this.f4705OooO0o0 = 0;
            this.f4704OooO0o = null;
            this.f4706OooO0oO = -1;
            this.f4707OooO0oo = 400;
            this.f4699OooO = 0.0f;
            this.f4709OooOO0O = new ArrayList<>();
            this.f4710OooOO0o = null;
            this.f4712OooOOO0 = new ArrayList<>();
            this.f4711OooOOO = 0;
            this.f4713OooOOOO = false;
            this.f4714OooOOOo = -1;
            this.f4716OooOOo0 = 0;
            this.f4715OooOOo = 0;
            this.f4708OooOO0 = oooO00o;
            this.f4707OooO0oo = oooO00o.f4688OooOO0;
            if (oooO0O0 != null) {
                this.f4714OooOOOo = oooO0O0.f4714OooOOOo;
                this.f4705OooO0o0 = oooO0O0.f4705OooO0o0;
                this.f4704OooO0o = oooO0O0.f4704OooO0o;
                this.f4706OooO0oO = oooO0O0.f4706OooO0oO;
                this.f4707OooO0oo = oooO0O0.f4707OooO0oo;
                this.f4709OooOO0O = oooO0O0.f4709OooOO0O;
                this.f4699OooO = oooO0O0.f4699OooO;
                this.f4716OooOOo0 = oooO0O0.f4716OooOOo0;
            }
        }

        public OooO0O0(OooO00o oooO00o, int i, int i2) {
            this.f4700OooO00o = -1;
            this.f4701OooO0O0 = false;
            this.f4702OooO0OO = -1;
            this.f4703OooO0Oo = -1;
            this.f4705OooO0o0 = 0;
            this.f4704OooO0o = null;
            this.f4706OooO0oO = -1;
            this.f4707OooO0oo = 400;
            this.f4699OooO = 0.0f;
            this.f4709OooOO0O = new ArrayList<>();
            this.f4710OooOO0o = null;
            this.f4712OooOOO0 = new ArrayList<>();
            this.f4711OooOOO = 0;
            this.f4713OooOOOO = false;
            this.f4714OooOOOo = -1;
            this.f4716OooOOo0 = 0;
            this.f4715OooOOo = 0;
            this.f4700OooO00o = -1;
            this.f4708OooOO0 = oooO00o;
            this.f4703OooO0Oo = i;
            this.f4702OooO0OO = i2;
            this.f4707OooO0oo = oooO00o.f4688OooOO0;
            this.f4716OooOOo0 = oooO00o.f4689OooOO0O;
        }

        public OooO0O0(OooO00o oooO00o, Context context, XmlResourceParser xmlResourceParser) {
            this.f4700OooO00o = -1;
            this.f4701OooO0O0 = false;
            this.f4702OooO0OO = -1;
            this.f4703OooO0Oo = -1;
            this.f4705OooO0o0 = 0;
            this.f4704OooO0o = null;
            this.f4706OooO0oO = -1;
            this.f4707OooO0oo = 400;
            this.f4699OooO = 0.0f;
            this.f4709OooOO0O = new ArrayList<>();
            this.f4710OooOO0o = null;
            this.f4712OooOOO0 = new ArrayList<>();
            this.f4711OooOOO = 0;
            this.f4713OooOOOO = false;
            this.f4714OooOOOo = -1;
            this.f4716OooOOo0 = 0;
            this.f4715OooOOo = 0;
            this.f4707OooO0oo = oooO00o.f4688OooOO0;
            this.f4716OooOOo0 = oooO00o.f4689OooOO0O;
            this.f4708OooOO0 = oooO00o;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.Transition);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = OooO.Transition_constraintSetEnd;
                SparseArray<androidx.constraintlayout.widget.OooO0O0> sparseArray = oooO00o.f4686OooO0oO;
                if (index == i2) {
                    this.f4702OooO0OO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4702OooO0OO);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = new androidx.constraintlayout.widget.OooO0O0();
                        oooO0O0.OooOO0(this.f4702OooO0OO, context);
                        sparseArray.append(this.f4702OooO0OO, oooO0O0);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f4702OooO0OO = oooO00o.OooOO0(this.f4702OooO0OO, context);
                    }
                } else if (index == OooO.Transition_constraintSetStart) {
                    this.f4703OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4703OooO0Oo);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f4703OooO0Oo);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.OooO0O0 oooO0O1 = new androidx.constraintlayout.widget.OooO0O0();
                        oooO0O1.OooOO0(this.f4703OooO0Oo, context);
                        sparseArray.append(this.f4703OooO0Oo, oooO0O1);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f4703OooO0Oo = oooO00o.OooOO0(this.f4703OooO0Oo, context);
                    }
                } else if (index == OooO.Transition_motionInterpolator) {
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f4706OooO0oO = resourceId;
                        if (resourceId != -1) {
                            this.f4705OooO0o0 = -2;
                        }
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f4704OooO0o = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f4706OooO0oO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f4705OooO0o0 = -2;
                            } else {
                                this.f4705OooO0o0 = -1;
                            }
                        }
                    } else {
                        this.f4705OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f4705OooO0o0);
                    }
                } else if (index == OooO.Transition_duration) {
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, this.f4707OooO0oo);
                    this.f4707OooO0oo = i4;
                    if (i4 < 8) {
                        this.f4707OooO0oo = 8;
                    }
                } else if (index == OooO.Transition_staggered) {
                    this.f4699OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f4699OooO);
                } else if (index == OooO.Transition_autoTransition) {
                    this.f4711OooOOO = typedArrayObtainStyledAttributes.getInteger(index, this.f4711OooOOO);
                } else if (index == OooO.Transition_android_id) {
                    this.f4700OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f4700OooO00o);
                } else if (index == OooO.Transition_transitionDisable) {
                    this.f4713OooOOOO = typedArrayObtainStyledAttributes.getBoolean(index, this.f4713OooOOOO);
                } else if (index == OooO.Transition_pathMotionArc) {
                    this.f4714OooOOOo = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == OooO.Transition_layoutDuringTransition) {
                    this.f4716OooOOo0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == OooO.Transition_transitionFlags) {
                    this.f4715OooOOo = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f4703OooO0Oo == -1) {
                this.f4701OooO0O0 = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
