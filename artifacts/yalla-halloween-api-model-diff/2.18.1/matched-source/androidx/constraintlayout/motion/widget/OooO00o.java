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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p057o0000Oo0.o000000O;
import p060o0000o.OooO;
import p060o0000o.OooOo00;
import p060o0000o.o00Oo0;
import p065o0000oO0.o000O00;
import p065o0000oO0.o000O00O;
import p065o0000oO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MotionLayout f7249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000O00O f7250OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0 f7251OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f7254OooO0o0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public MotionEvent f7259OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public MotionLayout.OooOOO0 f7262OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f7263OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f7264OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooO0o f7265OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f7266OooOOoo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<OooO0O0> f7252OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList<OooO0O0> f7253OooO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.OooO00o> f7255OooO0oO = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public HashMap<String, Integer> f7256OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public SparseIntArray f7248OooO = new SparseIntArray();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f7257OooOO0 = ShopVehicleListModel.VehicleTagType_Vip400;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f7258OooOO0O = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f7261OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f7260OooOOO = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public class InterpolatorC0041OooO00o implements Interpolator {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000000O f7267OooO00o;

        public InterpolatorC0041OooO00o(o000000O o000000o2) {
            this.f7267OooO00o = o000000o2;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.f7267OooO00o.OooO00o(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    public OooO00o(Context context, MotionLayout motionLayout, int i) {
        this.f7250OooO0O0 = null;
        this.f7251OooO0OO = null;
        this.f7254OooO0o0 = null;
        this.f7249OooO00o = motionLayout;
        this.f7265OooOOo0 = new OooO0o(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            OooO0O0 oooO0O0 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    switch (xml.getName()) {
                        case "MotionScene":
                            OooOOO0(context, xml);
                            break;
                        case "Transition":
                            ArrayList<OooO0O0> arrayList = this.f7252OooO0Oo;
                            oooO0O0 = new OooO0O0(this, context, xml);
                            arrayList.add(oooO0O0);
                            if (this.f7251OooO0OO == null && !oooO0O0.f7270OooO0O0) {
                                this.f7251OooO0OO = oooO0O0;
                                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1 = oooO0O0.f7279OooOO0o;
                                if (oooO0O1 != null) {
                                    oooO0O1.OooO0OO(this.f7263OooOOOo);
                                }
                            }
                            if (!oooO0O0.f7270OooO0O0) {
                                break;
                            } else {
                                if (oooO0O0.f7271OooO0OO == -1) {
                                    this.f7254OooO0o0 = oooO0O0;
                                } else {
                                    this.f7253OooO0o.add(oooO0O0);
                                }
                                this.f7252OooO0Oo.remove(oooO0O0);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (oooO0O0 == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (oooO0O0 == null) {
                                break;
                            } else {
                                oooO0O0.f7279OooOO0o = new androidx.constraintlayout.motion.widget.OooO0O0(context, this.f7249OooO00o, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (oooO0O0 == null) {
                                break;
                            } else {
                                oooO0O0.f7281OooOOO0.add(new OooO0O0.ViewOnClickListenerC0042OooO00o(context, oooO0O0, xml));
                                break;
                            }
                            break;
                        case "StateSet":
                            this.f7250OooO0O0 = new o000O00O(context, xml);
                            break;
                        case "ConstraintSet":
                            OooOO0(context, xml);
                            break;
                        case "include":
                        case "Include":
                            OooOO0o(context, xml);
                            break;
                        case "KeyFrameSet":
                            OooOo00 oooOo00 = new OooOo00(context, xml);
                            if (oooO0O0 == null) {
                                break;
                            } else {
                                oooO0O0.f7278OooOO0O.add(oooOo00);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            OooO0OO oooO0OO = new OooO0OO(context, xml);
                            OooO0o oooO0o = this.f7265OooOOo0;
                            oooO0o.f7356OooO0O0.add(oooO0OO);
                            oooO0o.f7357OooO0OO = null;
                            int i2 = oooO0OO.f7323OooO0O0;
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    oooO0o.OooO0O0(oooO0OO, false);
                                }
                                break;
                            } else {
                                oooO0o.OooO0O0(oooO0OO, true);
                                break;
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        SparseArray<androidx.constraintlayout.widget.OooO00o> sparseArray = this.f7255OooO0oO;
        int i3 = o000Oo0.motion_base;
        sparseArray.put(i3, new androidx.constraintlayout.widget.OooO00o());
        this.f7256OooO0oo.put("motion_base", Integer.valueOf(i3));
    }

    public final int OooO() {
        OooO0O0 oooO0O0 = this.f7251OooO0OO;
        if (oooO0O0 == null) {
            return -1;
        }
        return oooO0O0.f7272OooO0Oo;
    }

    public final boolean OooO00o(MotionLayout motionLayout, int i) {
        OooO0O0 oooO0O0;
        int i2;
        int i3;
        if (this.f7262OooOOOO != null) {
            return false;
        }
        for (OooO0O0 oooO0O1 : this.f7252OooO0Oo) {
            if (oooO0O1.f7280OooOOO != 0 && ((oooO0O0 = this.f7251OooO0OO) != oooO0O1 || !oooO0O0.OooO00o(2))) {
                if (i == oooO0O1.f7272OooO0Oo && ((i3 = oooO0O1.f7280OooOOO) == 4 || i3 == 2)) {
                    MotionLayout.OooOo00 oooOo00 = MotionLayout.OooOo00.FINISHED;
                    motionLayout.setState(oooOo00);
                    motionLayout.setTransition(oooO0O1);
                    if (oooO0O1.f7280OooOOO == 4) {
                        motionLayout.OooOo();
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.OooO0o0(true);
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                        motionLayout.setState(oooOo00);
                        motionLayout.OooOOoo();
                    }
                    return true;
                }
                if (i == oooO0O1.f7271OooO0OO && ((i2 = oooO0O1.f7280OooOOO) == 3 || i2 == 1)) {
                    MotionLayout.OooOo00 oooOo01 = MotionLayout.OooOo00.FINISHED;
                    motionLayout.setState(oooOo01);
                    motionLayout.setTransition(oooO0O1);
                    if (oooO0O1.f7280OooOOO == 3) {
                        motionLayout.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                    } else {
                        motionLayout.setProgress(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        motionLayout.OooO0o0(true);
                        motionLayout.setState(MotionLayout.OooOo00.SETUP);
                        motionLayout.setState(MotionLayout.OooOo00.MOVING);
                        motionLayout.setState(oooOo01);
                        motionLayout.OooOOoo();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.OooO00o OooO0O0(int i) {
        int iOooO00o;
        o000O00O o000o00o2 = this.f7250OooO0O0;
        if (o000o00o2 != null && (iOooO00o = o000o00o2.OooO00o(i)) != -1) {
            i = iOooO00o;
        }
        if (this.f7255OooO0oO.get(i) != null) {
            return this.f7255OooO0oO.get(i);
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Warning could not find ConstraintSet id/");
        sbOooO0o0.append(OooO.OooO0OO(this.f7249OooO00o.getContext(), i));
        sbOooO0o0.append(" In MotionScene");
        Log.e("MotionScene", sbOooO0o0.toString());
        SparseArray<androidx.constraintlayout.widget.OooO00o> sparseArray = this.f7255OooO0oO;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int OooO0OO() {
        OooO0O0 oooO0O0 = this.f7251OooO0OO;
        return oooO0O0 != null ? oooO0O0.f7276OooO0oo : this.f7257OooOO0;
    }

    public final int OooO0Oo() {
        OooO0O0 oooO0O0 = this.f7251OooO0OO;
        if (oooO0O0 == null) {
            return -1;
        }
        return oooO0O0.f7271OooO0OO;
    }

    public final Interpolator OooO0o() {
        OooO0O0 oooO0O0 = this.f7251OooO0OO;
        int i = oooO0O0.f7274OooO0o0;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f7249OooO00o.getContext(), this.f7251OooO0OO.f7275OooO0oO);
        }
        if (i == -1) {
            return new InterpolatorC0041OooO00o(o000000O.OooO0OO(oooO0O0.f7273OooO0o));
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

    public final int OooO0o0(Context context, String str) {
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

    public final void OooO0oO(o00Oo0 o00oo1) {
        OooO0O0 oooO0O0 = this.f7251OooO0OO;
        if (oooO0O0 != null) {
            Iterator<OooOo00> it = oooO0O0.f7278OooOO0O.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0(o00oo1);
            }
        } else {
            OooO0O0 oooO0O1 = this.f7254OooO0o0;
            if (oooO0O1 != null) {
                Iterator<OooOo00> it2 = oooO0O1.f7278OooOO0O.iterator();
                while (it2.hasNext()) {
                    it2.next().OooO0O0(o00oo1);
                }
            }
        }
    }

    public final float OooO0oo() {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        OooO0O0 oooO0O1 = this.f7251OooO0OO;
        return (oooO0O1 == null || (oooO0O0 = oooO0O1.f7279OooOO0o) == null) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooO0O0.f7312OooOo00;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    public final int OooOO0(Context context, XmlPullParser xmlPullParser) {
        byte b;
        byte b2;
        androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
        oooO00o.f7599OooO0o0 = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int iOooO0o0 = -1;
        int iOooO0o1 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            Objects.requireNonNull(attributeName);
            int iHashCode = attributeName.hashCode();
            if (iHashCode != -1496482599) {
                if (iHashCode != -1153153640) {
                    if (iHashCode == 3355 && attributeName.equals("id")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (attributeName.equals("constraintRotate")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (attributeName.equals("deriveConstraintsFrom")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                iOooO0o1 = OooO0o0(context, attributeValue);
            } else if (b == 1) {
                try {
                    oooO00o.f7596OooO0OO = Integer.parseInt(attributeValue);
                } catch (NumberFormatException unused) {
                    Objects.requireNonNull(attributeValue);
                    switch (attributeValue) {
                        case "x_left":
                            b2 = 0;
                            break;
                        case "left":
                            b2 = 1;
                            break;
                        case "none":
                            b2 = 2;
                            break;
                        case "right":
                            b2 = 3;
                            break;
                        case "x_right":
                            b2 = 4;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        oooO00o.f7596OooO0OO = 4;
                    } else if (b2 == 1) {
                        oooO00o.f7596OooO0OO = 2;
                    } else if (b2 == 2) {
                        oooO00o.f7596OooO0OO = 0;
                    } else if (b2 == 3) {
                        oooO00o.f7596OooO0OO = 1;
                    } else if (b2 == 4) {
                        oooO00o.f7596OooO0OO = 3;
                    }
                }
            } else if (b == 2) {
                iOooO0o0 = OooO0o0(context, attributeValue);
                HashMap<String, Integer> map = this.f7256OooO0oo;
                int iIndexOf = attributeValue.indexOf(47);
                if (iIndexOf >= 0) {
                    attributeValue = attributeValue.substring(iIndexOf + 1);
                }
                map.put(attributeValue, Integer.valueOf(iOooO0o0));
                oooO00o.f7594OooO00o = OooO.OooO0OO(context, iOooO0o0);
            }
        }
        if (iOooO0o0 != -1) {
            int i2 = this.f7249OooO00o.f7167Oooooo0;
            oooO00o.OooOO0O(context, xmlPullParser);
            if (iOooO0o1 != -1) {
                this.f7248OooO.put(iOooO0o0, iOooO0o1);
            }
            this.f7255OooO0oO.put(iOooO0o0, oooO00o);
        }
        return iOooO0o0;
    }

    public final int OooOO0O(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return OooOO0(context, xml);
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

    public final void OooOO0o(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == o000O00.include_constraintSet) {
                OooOO0O(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOOO(int i, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.OooO00o oooO00o = this.f7255OooO0oO.get(i);
        oooO00o.f7595OooO0O0 = oooO00o.f7594OooO00o;
        int i2 = this.f7248OooO.get(i);
        if (i2 > 0) {
            OooOOO(i2, motionLayout);
            androidx.constraintlayout.widget.OooO00o oooO00o2 = this.f7255OooO0oO.get(i2);
            if (oooO00o2 == null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ERROR! invalid deriveConstraintsFrom: @id/");
                sbOooO0o0.append(OooO.OooO0OO(this.f7249OooO00o.getContext(), i2));
                Log.e("MotionScene", sbOooO0o0.toString());
                return;
            }
            oooO00o.f7595OooO0O0 += "/" + oooO00o2.f7595OooO0O0;
            for (Integer num : oooO00o2.f7598OooO0o.keySet()) {
                int iIntValue = num.intValue();
                androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o = oooO00o2.f7598OooO0o.get(num);
                if (!oooO00o.f7598OooO0o.containsKey(Integer.valueOf(iIntValue))) {
                    oooO00o.f7598OooO0o.put(Integer.valueOf(iIntValue), new androidx.constraintlayout.widget.OooO00o.C0043OooO00o());
                }
                androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o2 = oooO00o.f7598OooO0o.get(Integer.valueOf(iIntValue));
                if (c0043OooO00o2 != null) {
                    androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O0 = c0043OooO00o2.f7620OooO0o0;
                    if (!oooO0O0.f7638OooO0O0) {
                        oooO0O0.OooO00o(c0043OooO00o.f7620OooO0o0);
                    }
                    androidx.constraintlayout.widget.OooO00o.OooO0o oooO0o = c0043OooO00o2.f7617OooO0OO;
                    if (!oooO0o.f7718OooO00o) {
                        oooO0o.OooO00o(c0043OooO00o.f7617OooO0OO);
                    }
                    androidx.constraintlayout.widget.OooO00o.OooO oooO = c0043OooO00o2.f7619OooO0o;
                    if (!oooO.f7602OooO00o) {
                        oooO.OooO00o(c0043OooO00o.f7619OooO0o);
                    }
                    androidx.constraintlayout.widget.OooO00o.OooO0OO oooO0OO = c0043OooO00o2.f7618OooO0Oo;
                    if (!oooO0OO.f7706OooO00o) {
                        oooO0OO.OooO00o(c0043OooO00o.f7618OooO0Oo);
                    }
                    for (String str : c0043OooO00o.f7621OooO0oO.keySet()) {
                        if (!c0043OooO00o2.f7621OooO0oO.containsKey(str)) {
                            c0043OooO00o2.f7621OooO0oO.put(str, c0043OooO00o.f7621OooO0oO.get(str));
                        }
                    }
                }
            }
        } else {
            oooO00o.f7595OooO0O0 = p058o0000OoO.OooO.OooO00o(new StringBuilder(), oooO00o.f7595OooO0O0, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (oooO00o.f7599OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!oooO00o.f7598OooO0o.containsKey(Integer.valueOf(id))) {
                    oooO00o.f7598OooO0o.put(Integer.valueOf(id), new androidx.constraintlayout.widget.OooO00o.C0043OooO00o());
                }
                androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o3 = oooO00o.f7598OooO0o.get(Integer.valueOf(id));
                if (c0043OooO00o3 != null) {
                    if (!c0043OooO00o3.f7620OooO0o0.f7638OooO0O0) {
                        c0043OooO00o3.OooO0OO(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            c0043OooO00o3.f7620OooO0o0.f7696Ooooooo = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                c0043OooO00o3.f7620OooO0o0.f7700o00Ooo = barrier.getAllowsGoneWidget();
                                c0043OooO00o3.f7620OooO0o0.f7694Oooooo0 = barrier.getType();
                                c0043OooO00o3.f7620OooO0o0.f7693Oooooo = barrier.getMargin();
                            }
                        }
                        c0043OooO00o3.f7620OooO0o0.f7638OooO0O0 = true;
                    }
                    androidx.constraintlayout.widget.OooO00o.OooO0o oooO0o2 = c0043OooO00o3.f7617OooO0OO;
                    if (!oooO0o2.f7718OooO00o) {
                        oooO0o2.f7719OooO0O0 = childAt.getVisibility();
                        c0043OooO00o3.f7617OooO0OO.f7721OooO0Oo = childAt.getAlpha();
                        c0043OooO00o3.f7617OooO0OO.f7718OooO00o = true;
                    }
                    androidx.constraintlayout.widget.OooO00o.OooO oooO2 = c0043OooO00o3.f7619OooO0o;
                    if (!oooO2.f7602OooO00o) {
                        oooO2.f7602OooO00o = true;
                        oooO2.f7603OooO0O0 = childAt.getRotation();
                        c0043OooO00o3.f7619OooO0o.f7604OooO0OO = childAt.getRotationX();
                        c0043OooO00o3.f7619OooO0o.f7605OooO0Oo = childAt.getRotationY();
                        c0043OooO00o3.f7619OooO0o.f7607OooO0o0 = childAt.getScaleX();
                        c0043OooO00o3.f7619OooO0o.f7606OooO0o = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            androidx.constraintlayout.widget.OooO00o.OooO oooO3 = c0043OooO00o3.f7619OooO0o;
                            oooO3.f7608OooO0oO = pivotX;
                            oooO3.f7609OooO0oo = pivotY;
                        }
                        c0043OooO00o3.f7619OooO0o.f7610OooOO0 = childAt.getTranslationX();
                        c0043OooO00o3.f7619OooO0o.f7611OooOO0O = childAt.getTranslationY();
                        c0043OooO00o3.f7619OooO0o.f7612OooOO0o = childAt.getTranslationZ();
                        androidx.constraintlayout.widget.OooO00o.OooO oooO4 = c0043OooO00o3.f7619OooO0o;
                        if (oooO4.f7614OooOOO0) {
                            oooO4.f7613OooOOO = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o4 : oooO00o.f7598OooO0o.values()) {
            if (c0043OooO00o4.f7622OooO0oo != null) {
                if (c0043OooO00o4.f7616OooO0O0 != null) {
                    Iterator<Integer> it = oooO00o.f7598OooO0o.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00oOooO = oooO00o.OooO(it.next().intValue());
                        String str2 = c0043OooO00oOooO.f7620OooO0o0.f7703ooOO;
                        if (str2 != null && c0043OooO00o4.f7616OooO0O0.matches(str2)) {
                            c0043OooO00o4.f7622OooO0oo.OooO0o0(c0043OooO00oOooO);
                            c0043OooO00oOooO.f7621OooO0oO.putAll((HashMap) c0043OooO00o4.f7621OooO0oO.clone());
                        }
                    }
                } else {
                    c0043OooO00o4.f7622OooO0oo.OooO0o0(oooO00o.OooO(c0043OooO00o4.f7615OooO00o));
                }
            }
        }
    }

    public final void OooOOO0(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == o000O00.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f7257OooOO0);
                this.f7257OooOO0 = i2;
                if (i2 < 8) {
                    this.f7257OooOO0 = 8;
                }
            } else if (index == o000O00.MotionScene_layoutDuringTransition) {
                this.f7258OooOO0O = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOOOO(MotionLayout motionLayout) {
        boolean z;
        for (int i = 0; i < this.f7255OooO0oO.size(); i++) {
            int iKeyAt = this.f7255OooO0oO.keyAt(i);
            int i2 = this.f7248OooO.get(iKeyAt);
            int size = this.f7248OooO.size();
            while (true) {
                if (i2 <= 0) {
                    z = false;
                    break;
                }
                if (i2 != iKeyAt) {
                    int i3 = size - 1;
                    if (size >= 0) {
                        i2 = this.f7248OooO.get(i2);
                        size = i3;
                    }
                }
                z = true;
                break;
            }
            if (z) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            OooOOO(iKeyAt, motionLayout);
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
    public final void OooOOOo(int i, int i2) {
        int iOooO00o;
        int iOooO00o2;
        OooO0O0 oooO0O0;
        Iterator<OooO0O0> it;
        OooO0O0 oooO0O1;
        OooO0O0 oooO0O2;
        OooO0O0 next;
        int i3;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O3;
        o000O00O o000o00o2 = this.f7250OooO0O0;
        if (o000o00o2 != null) {
            iOooO00o = o000o00o2.OooO00o(i);
            if (iOooO00o == -1) {
                iOooO00o = i;
            }
            iOooO00o2 = this.f7250OooO0O0.OooO00o(i2);
            if (iOooO00o2 == -1) {
            }
            oooO0O0 = this.f7251OooO0OO;
            if (oooO0O0 == null && oooO0O0.f7271OooO0OO == i2 && oooO0O0.f7272OooO0Oo == i) {
                return;
            }
            it = this.f7252OooO0Oo.iterator();
            while (true) {
                if (it.hasNext()) {
                    oooO0O1 = this.f7254OooO0o0;
                    for (OooO0O0 oooO0O4 : this.f7253OooO0o) {
                        if (oooO0O4.f7271OooO0OO == i2) {
                            oooO0O1 = oooO0O4;
                        }
                    }
                    oooO0O2 = new OooO0O0(this, oooO0O1);
                    oooO0O2.f7272OooO0Oo = iOooO00o;
                    oooO0O2.f7271OooO0OO = iOooO00o2;
                    if (iOooO00o != -1) {
                        this.f7252OooO0Oo.add(oooO0O2);
                    }
                    this.f7251OooO0OO = oooO0O2;
                    return;
                }
                next = it.next();
                i3 = next.f7271OooO0OO;
                if ((i3 != iOooO00o2 && next.f7272OooO0Oo == iOooO00o) || (i3 == i2 && next.f7272OooO0Oo == i)) {
                    break;
                }
            }
            this.f7251OooO0OO = next;
            oooO0O3 = next.f7279OooOO0o;
            if (oooO0O3 != null) {
                oooO0O3.OooO0OO(this.f7263OooOOOo);
            }
        }
        iOooO00o = i;
        iOooO00o2 = i2;
        oooO0O0 = this.f7251OooO0OO;
        if (oooO0O0 == null) {
        }
        it = this.f7252OooO0Oo.iterator();
        while (true) {
            if (it.hasNext()) {
                oooO0O1 = this.f7254OooO0o0;
                while (r3.hasNext()) {
                    if (oooO0O4.f7271OooO0OO == i2) {
                        oooO0O1 = oooO0O4;
                    }
                }
                oooO0O2 = new OooO0O0(this, oooO0O1);
                oooO0O2.f7272OooO0Oo = iOooO00o;
                oooO0O2.f7271OooO0OO = iOooO00o2;
                if (iOooO00o != -1) {
                    this.f7252OooO0Oo.add(oooO0O2);
                }
                this.f7251OooO0OO = oooO0O2;
                return;
            }
            next = it.next();
            i3 = next.f7271OooO0OO;
            if (i3 != iOooO00o2) {
            }
        }
        this.f7251OooO0OO = next;
        oooO0O3 = next.f7279OooOO0o;
        if (oooO0O3 != null) {
            oooO0O3.OooO0OO(this.f7263OooOOOo);
        }
    }

    public final boolean OooOOo0() {
        Iterator<OooO0O0> it = this.f7252OooO0Oo.iterator();
        while (it.hasNext()) {
            if (it.next().f7279OooOO0o != null) {
                return true;
            }
        }
        OooO0O0 oooO0O0 = this.f7251OooO0OO;
        return (oooO0O0 == null || oooO0O0.f7279OooOO0o == null) ? false : true;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f7268OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7269OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f7270OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7271OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7272OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f7273OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7274OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f7275OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f7276OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final OooO00o f7277OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public ArrayList<OooOo00> f7278OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.OooO0O0 f7279OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f7280OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public ArrayList<ViewOnClickListenerC0042OooO00o> f7281OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f7282OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f7283OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f7284OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f7285OooOOo0;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0042OooO00o implements View.OnClickListener {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final OooO0O0 f7286Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public int f7287Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int f7288Oooo0oo;

            public ViewOnClickListenerC0042OooO00o(Context context, OooO0O0 oooO0O0, XmlPullParser xmlPullParser) {
                this.f7287Oooo0oO = -1;
                this.f7288Oooo0oo = 17;
                this.f7286Oooo0o = oooO0O0;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == o000O00.OnClick_targetId) {
                        this.f7287Oooo0oO = typedArrayObtainStyledAttributes.getResourceId(index, this.f7287Oooo0oO);
                    } else if (index == o000O00.OnClick_clickAction) {
                        this.f7288Oooo0oo = typedArrayObtainStyledAttributes.getInt(index, this.f7288Oooo0oo);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void OooO00o(MotionLayout motionLayout, int i, OooO0O0 oooO0O0) {
                boolean z;
                View viewFindViewById;
                int i2 = this.f7287Oooo0oO;
                View view = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    view = viewFindViewById;
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("OnClick could not find id ");
                    sbOooO0o0.append(this.f7287Oooo0oO);
                    Log.e("MotionScene", sbOooO0o0.toString());
                    return;
                }
                int i3 = oooO0O0.f7272OooO0Oo;
                int i4 = oooO0O0.f7271OooO0OO;
                if (i3 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.f7288Oooo0oo;
                int i6 = i5 & 1;
                boolean z2 = false;
                if (i6 == 0 || i != i3) {
                    view = viewFindViewById;
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z2 = true;
                }
                if (z3 || z2) {
                    view.setOnClickListener(this);
                }
            }

            public final void OooO0O0(MotionLayout motionLayout) {
                int i = this.f7287Oooo0oO;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" (*)  could not find id ");
                sbOooO0o0.append(this.f7287Oooo0oO);
                Log.e("MotionScene", sbOooO0o0.toString());
            }

            /* JADX WARN: Code duplicated, block: B:52:0x0090  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                OooO0O0 oooO0O0 = this.f7286Oooo0o;
                OooO00o oooO00o = oooO0O0.f7277OooOO0;
                MotionLayout motionLayout = oooO00o.f7249OooO00o;
                if (motionLayout.f7193o000oOoO) {
                    if (oooO0O0.f7272OooO0Oo == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.OooOoO0(this.f7286Oooo0o.f7271OooO0OO);
                            return;
                        }
                        OooO0O0 oooO0O1 = this.f7286Oooo0o;
                        OooO0O0 oooO0O2 = new OooO0O0(oooO0O1.f7277OooOO0, oooO0O1);
                        oooO0O2.f7272OooO0Oo = currentState;
                        oooO0O2.f7271OooO0OO = this.f7286Oooo0o.f7271OooO0OO;
                        motionLayout.setTransition(oooO0O2);
                        motionLayout.OooOo();
                        return;
                    }
                    OooO0O0 oooO0O3 = oooO00o.f7251OooO0OO;
                    int i2 = this.f7288Oooo0oo;
                    boolean z = false;
                    boolean z2 = ((i2 & 1) == 0 && (i2 & 256) == 0) ? false : true;
                    boolean z3 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        if (oooO0O3 != oooO0O0) {
                            motionLayout.setTransition(oooO0O0);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z2 = false;
                        } else {
                            z3 = false;
                        }
                    }
                    OooO0O0 oooO0O4 = this.f7286Oooo0o;
                    if (oooO0O4 == oooO0O3) {
                        z = true;
                    } else {
                        int i3 = oooO0O4.f7271OooO0OO;
                        int i4 = oooO0O4.f7272OooO0Oo;
                        if (i4 != -1 ? (i = motionLayout.f7152OoooO0) == i4 || i == i3 : motionLayout.f7152OoooO0 != i3) {
                            z = true;
                        }
                    }
                    if (z) {
                        if (z2 && (this.f7288Oooo0oo & 1) != 0) {
                            motionLayout.setTransition(oooO0O4);
                            motionLayout.OooOo();
                            return;
                        }
                        if (z3 && (this.f7288Oooo0oo & 16) != 0) {
                            motionLayout.setTransition(oooO0O4);
                            motionLayout.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        } else if (z2 && (this.f7288Oooo0oo & 256) != 0) {
                            motionLayout.setTransition(oooO0O4);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.f7288Oooo0oo & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(oooO0O4);
                            motionLayout.setProgress(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        }
                    }
                }
            }
        }

        public OooO0O0(OooO00o oooO00o, OooO0O0 oooO0O0) {
            this.f7269OooO00o = -1;
            this.f7270OooO0O0 = false;
            this.f7271OooO0OO = -1;
            this.f7272OooO0Oo = -1;
            this.f7274OooO0o0 = 0;
            this.f7273OooO0o = null;
            this.f7275OooO0oO = -1;
            this.f7276OooO0oo = ShopVehicleListModel.VehicleTagType_Vip400;
            this.f7268OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7278OooOO0O = new ArrayList<>();
            this.f7279OooOO0o = null;
            this.f7281OooOOO0 = new ArrayList<>();
            this.f7280OooOOO = 0;
            this.f7282OooOOOO = false;
            this.f7283OooOOOo = -1;
            this.f7285OooOOo0 = 0;
            this.f7284OooOOo = 0;
            this.f7277OooOO0 = oooO00o;
            this.f7276OooO0oo = oooO00o.f7257OooOO0;
            if (oooO0O0 != null) {
                this.f7283OooOOOo = oooO0O0.f7283OooOOOo;
                this.f7274OooO0o0 = oooO0O0.f7274OooO0o0;
                this.f7273OooO0o = oooO0O0.f7273OooO0o;
                this.f7275OooO0oO = oooO0O0.f7275OooO0oO;
                this.f7276OooO0oo = oooO0O0.f7276OooO0oo;
                this.f7278OooOO0O = oooO0O0.f7278OooOO0O;
                this.f7268OooO = oooO0O0.f7268OooO;
                this.f7285OooOOo0 = oooO0O0.f7285OooOOo0;
            }
        }

        public final boolean OooO00o(int i) {
            return (i & this.f7284OooOOo) != 0;
        }

        public OooO0O0(OooO00o oooO00o, int i, int i2) {
            this.f7269OooO00o = -1;
            this.f7270OooO0O0 = false;
            this.f7271OooO0OO = -1;
            this.f7272OooO0Oo = -1;
            this.f7274OooO0o0 = 0;
            this.f7273OooO0o = null;
            this.f7275OooO0oO = -1;
            this.f7276OooO0oo = ShopVehicleListModel.VehicleTagType_Vip400;
            this.f7268OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7278OooOO0O = new ArrayList<>();
            this.f7279OooOO0o = null;
            this.f7281OooOOO0 = new ArrayList<>();
            this.f7280OooOOO = 0;
            this.f7282OooOOOO = false;
            this.f7283OooOOOo = -1;
            this.f7285OooOOo0 = 0;
            this.f7284OooOOo = 0;
            this.f7269OooO00o = -1;
            this.f7277OooOO0 = oooO00o;
            this.f7272OooO0Oo = i;
            this.f7271OooO0OO = i2;
            this.f7276OooO0oo = oooO00o.f7257OooOO0;
            this.f7285OooOOo0 = oooO00o.f7258OooOO0O;
        }

        public OooO0O0(OooO00o oooO00o, Context context, XmlPullParser xmlPullParser) {
            this.f7269OooO00o = -1;
            this.f7270OooO0O0 = false;
            this.f7271OooO0OO = -1;
            this.f7272OooO0Oo = -1;
            this.f7274OooO0o0 = 0;
            this.f7273OooO0o = null;
            this.f7275OooO0oO = -1;
            this.f7276OooO0oo = ShopVehicleListModel.VehicleTagType_Vip400;
            this.f7268OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7278OooOO0O = new ArrayList<>();
            this.f7279OooOO0o = null;
            this.f7281OooOOO0 = new ArrayList<>();
            this.f7280OooOOO = 0;
            this.f7282OooOOOO = false;
            this.f7283OooOOOo = -1;
            this.f7285OooOOo0 = 0;
            this.f7284OooOOo = 0;
            this.f7276OooO0oo = oooO00o.f7257OooOO0;
            this.f7285OooOOo0 = oooO00o.f7258OooOO0O;
            this.f7277OooOO0 = oooO00o;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.Transition);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.Transition_constraintSetEnd) {
                    this.f7271OooO0OO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7271OooO0OO);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.OooO00o oooO00o2 = new androidx.constraintlayout.widget.OooO00o();
                        oooO00o2.OooOO0(context, this.f7271OooO0OO);
                        oooO00o.f7255OooO0oO.append(this.f7271OooO0OO, oooO00o2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f7271OooO0OO = oooO00o.OooOO0O(context, this.f7271OooO0OO);
                    }
                } else if (index == o000O00.Transition_constraintSetStart) {
                    this.f7272OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7272OooO0Oo);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f7272OooO0Oo);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.OooO00o oooO00o3 = new androidx.constraintlayout.widget.OooO00o();
                        oooO00o3.OooOO0(context, this.f7272OooO0Oo);
                        oooO00o.f7255OooO0oO.append(this.f7272OooO0Oo, oooO00o3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f7272OooO0Oo = oooO00o.OooOO0O(context, this.f7272OooO0Oo);
                    }
                } else if (index == o000O00.Transition_motionInterpolator) {
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f7275OooO0oO = resourceId;
                        if (resourceId != -1) {
                            this.f7274OooO0o0 = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f7273OooO0o = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f7275OooO0oO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f7274OooO0o0 = -2;
                            } else {
                                this.f7274OooO0o0 = -1;
                            }
                        }
                    } else {
                        this.f7274OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f7274OooO0o0);
                    }
                } else if (index == o000O00.Transition_duration) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f7276OooO0oo);
                    this.f7276OooO0oo = i3;
                    if (i3 < 8) {
                        this.f7276OooO0oo = 8;
                    }
                } else if (index == o000O00.Transition_staggered) {
                    this.f7268OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f7268OooO);
                } else if (index == o000O00.Transition_autoTransition) {
                    this.f7280OooOOO = typedArrayObtainStyledAttributes.getInteger(index, this.f7280OooOOO);
                } else if (index == o000O00.Transition_android_id) {
                    this.f7269OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f7269OooO00o);
                } else if (index == o000O00.Transition_transitionDisable) {
                    this.f7282OooOOOO = typedArrayObtainStyledAttributes.getBoolean(index, this.f7282OooOOOO);
                } else if (index == o000O00.Transition_pathMotionArc) {
                    this.f7283OooOOOo = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == o000O00.Transition_layoutDuringTransition) {
                    this.f7285OooOOo0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == o000O00.Transition_transitionFlags) {
                    this.f7284OooOOo = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f7272OooO0Oo == -1) {
                this.f7270OooO0O0 = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
