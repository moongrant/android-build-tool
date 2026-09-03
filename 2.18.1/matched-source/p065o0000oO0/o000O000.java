package p065o0000oO0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConstraintLayout f27915OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27916OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27917OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public SparseArray<OooO00o> f27918OooO0Oo = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.OooO00o> f27919OooO0o0 = new SparseArray<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f27920OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList<OooO0O0> f27921OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f27922OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public androidx.constraintlayout.widget.OooO00o f27923OooO0Oo;

        public OooO00o(Context context, XmlPullParser xmlPullParser) {
            this.f27922OooO0OO = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.State_android_id) {
                    this.f27920OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f27920OooO00o);
                } else if (index == o000O00.State_constraints) {
                    this.f27922OooO0OO = typedArrayObtainStyledAttributes.getResourceId(index, this.f27922OooO0OO);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f27922OooO0OO);
                    context.getResources().getResourceName(this.f27922OooO0OO);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
                        this.f27923OooO0Oo = oooO00o;
                        oooO00o.OooO0o0((ConstraintLayout) LayoutInflater.from(context).inflate(this.f27922OooO0OO, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final int OooO00o(float f, float f2) {
            for (int i = 0; i < this.f27921OooO0O0.size(); i++) {
                if (this.f27921OooO0O0.get(i).OooO00o(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f27924OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f27925OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f27926OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f27927OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public androidx.constraintlayout.widget.OooO00o f27928OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f27929OooO0o0;

        public OooO0O0(Context context, XmlPullParser xmlPullParser) {
            this.f27924OooO00o = Float.NaN;
            this.f27925OooO0O0 = Float.NaN;
            this.f27926OooO0OO = Float.NaN;
            this.f27927OooO0Oo = Float.NaN;
            this.f27929OooO0o0 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.Variant_constraints) {
                    this.f27929OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27929OooO0o0);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f27929OooO0o0);
                    context.getResources().getResourceName(this.f27929OooO0o0);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
                        this.f27928OooO0o = oooO00o;
                        oooO00o.OooO0o0((ConstraintLayout) LayoutInflater.from(context).inflate(this.f27929OooO0o0, (ViewGroup) null));
                    }
                } else if (index == o000O00.Variant_region_heightLessThan) {
                    this.f27927OooO0Oo = typedArrayObtainStyledAttributes.getDimension(index, this.f27927OooO0Oo);
                } else if (index == o000O00.Variant_region_heightMoreThan) {
                    this.f27925OooO0O0 = typedArrayObtainStyledAttributes.getDimension(index, this.f27925OooO0O0);
                } else if (index == o000O00.Variant_region_widthLessThan) {
                    this.f27926OooO0OO = typedArrayObtainStyledAttributes.getDimension(index, this.f27926OooO0OO);
                } else if (index == o000O00.Variant_region_widthMoreThan) {
                    this.f27924OooO00o = typedArrayObtainStyledAttributes.getDimension(index, this.f27924OooO00o);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean OooO00o(float f, float f2) {
            if (!Float.isNaN(this.f27924OooO00o) && f < this.f27924OooO00o) {
                return false;
            }
            if (!Float.isNaN(this.f27925OooO0O0) && f2 < this.f27925OooO0O0) {
                return false;
            }
            if (Float.isNaN(this.f27926OooO0OO) || f <= this.f27926OooO0OO) {
                return Float.isNaN(this.f27927OooO0Oo) || f2 <= this.f27927OooO0Oo;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public o000O000(Context context, ConstraintLayout constraintLayout, int i) {
        this.f27915OooO00o = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        OooO00o oooO00o = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 2) {
                        oooO00o = new OooO00o(context, xml);
                        this.f27918OooO0Oo.put(oooO00o.f27920OooO00o, oooO00o);
                    } else if (b == 3) {
                        OooO0O0 oooO0O0 = new OooO0O0(context, xml);
                        if (oooO00o != null) {
                            oooO00o.f27921OooO0O0.add(oooO0O0);
                        }
                    } else if (b == 4) {
                        OooO00o(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void OooO00o(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                oooO00o.OooOO0O(context, xmlPullParser);
                this.f27919OooO0o0.put(identifier, oooO00o);
                return;
            }
        }
    }

    public final void OooO0O0(int i, float f, float f2) {
        int iOooO00o;
        int i2 = this.f27916OooO0O0;
        if (i2 == i) {
            OooO00o oooO00oValueAt = i == -1 ? this.f27918OooO0Oo.valueAt(0) : this.f27918OooO0Oo.get(i2);
            int i3 = this.f27917OooO0OO;
            if ((i3 == -1 || !oooO00oValueAt.f27921OooO0O0.get(i3).OooO00o(f, f2)) && this.f27917OooO0OO != (iOooO00o = oooO00oValueAt.OooO00o(f, f2))) {
                androidx.constraintlayout.widget.OooO00o oooO00o = iOooO00o == -1 ? null : oooO00oValueAt.f27921OooO0O0.get(iOooO00o).f27928OooO0o;
                if (iOooO00o != -1) {
                    int i4 = oooO00oValueAt.f27921OooO0O0.get(iOooO00o).f27929OooO0o0;
                }
                if (oooO00o == null) {
                    return;
                }
                this.f27917OooO0OO = iOooO00o;
                oooO00o.OooO0O0(this.f27915OooO00o);
                return;
            }
            return;
        }
        this.f27916OooO0O0 = i;
        OooO00o oooO00o2 = this.f27918OooO0Oo.get(i);
        int iOooO00o2 = oooO00o2.OooO00o(f, f2);
        androidx.constraintlayout.widget.OooO00o oooO00o3 = iOooO00o2 == -1 ? oooO00o2.f27923OooO0Oo : oooO00o2.f27921OooO0O0.get(iOooO00o2).f27928OooO0o;
        if (iOooO00o2 != -1) {
            int i5 = oooO00o2.f27921OooO0O0.get(iOooO00o2).f27929OooO0o0;
        }
        if (oooO00o3 != null) {
            this.f27917OooO0OO = iOooO00o2;
            oooO00o3.OooO0O0(this.f27915OooO00o);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
    }
}
