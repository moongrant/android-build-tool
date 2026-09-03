package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConstraintLayout f5025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f5026OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f5027OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray<C0117OooO00o> f5028OooO0Oo = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.OooO0O0> f5029OooO0o0 = new SparseArray<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0117OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5030OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0O0> f5031OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f5032OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final androidx.constraintlayout.widget.OooO0O0 f5033OooO0Oo;

        public C0117OooO00o(Context context, XmlResourceParser xmlResourceParser) {
            this.f5032OooO0OO = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.State_android_id) {
                    this.f5030OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f5030OooO00o);
                } else if (index == OooO.State_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5032OooO0OO);
                    this.f5032OooO0OO = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = new androidx.constraintlayout.widget.OooO0O0();
                        this.f5033OooO0Oo = oooO0O0;
                        oooO0O0.OooO0o0((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f5034OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f5035OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f5036OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f5037OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final androidx.constraintlayout.widget.OooO0O0 f5038OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f5039OooO0o0;

        public OooO0O0(Context context, XmlResourceParser xmlResourceParser) {
            this.f5034OooO00o = Float.NaN;
            this.f5035OooO0O0 = Float.NaN;
            this.f5036OooO0OO = Float.NaN;
            this.f5037OooO0Oo = Float.NaN;
            this.f5039OooO0o0 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.Variant_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5039OooO0o0);
                    this.f5039OooO0o0 = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = new androidx.constraintlayout.widget.OooO0O0();
                        this.f5038OooO0o = oooO0O0;
                        oooO0O0.OooO0o0((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == OooO.Variant_region_heightLessThan) {
                    this.f5037OooO0Oo = typedArrayObtainStyledAttributes.getDimension(index, this.f5037OooO0Oo);
                } else if (index == OooO.Variant_region_heightMoreThan) {
                    this.f5035OooO0O0 = typedArrayObtainStyledAttributes.getDimension(index, this.f5035OooO0O0);
                } else if (index == OooO.Variant_region_widthLessThan) {
                    this.f5036OooO0OO = typedArrayObtainStyledAttributes.getDimension(index, this.f5036OooO0OO);
                } else if (index == OooO.Variant_region_widthMoreThan) {
                    this.f5034OooO00o = typedArrayObtainStyledAttributes.getDimension(index, this.f5034OooO00o);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean OooO00o(float f, float f2) {
            float f3 = this.f5034OooO00o;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f5035OooO0O0;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f5036OooO0OO;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.f5037OooO0Oo;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public OooO00o(Context context, ConstraintLayout constraintLayout, int i) {
        this.f5025OooO00o = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C0117OooO00o c0117OooO00o = null;
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
                        C0117OooO00o c0117OooO00o2 = new C0117OooO00o(context, xml);
                        this.f5028OooO0Oo.put(c0117OooO00o2.f5030OooO00o, c0117OooO00o2);
                        c0117OooO00o = c0117OooO00o2;
                    } else if (b == 3) {
                        OooO0O0 oooO0O0 = new OooO0O0(context, xml);
                        if (c0117OooO00o != null) {
                            c0117OooO00o.f5031OooO0O0.add(oooO0O0);
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

    public final void OooO00o(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = new androidx.constraintlayout.widget.OooO0O0();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                oooO0O0.OooOO0O(context, xmlResourceParser);
                this.f5029OooO0o0.put(identifier, oooO0O0);
                return;
            }
        }
    }

    public final void OooO0O0(float f, float f2, int i) {
        int i2 = this.f5026OooO0O0;
        SparseArray<C0117OooO00o> sparseArray = this.f5028OooO0Oo;
        int i3 = 0;
        ConstraintLayout constraintLayout = this.f5025OooO00o;
        if (i2 == i) {
            C0117OooO00o c0117OooO00oValueAt = i == -1 ? sparseArray.valueAt(0) : sparseArray.get(i2);
            int i4 = this.f5027OooO0OO;
            if (i4 == -1 || !c0117OooO00oValueAt.f5031OooO0O0.get(i4).OooO00o(f, f2)) {
                while (true) {
                    ArrayList<OooO0O0> arrayList = c0117OooO00oValueAt.f5031OooO0O0;
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (arrayList.get(i3).OooO00o(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (this.f5027OooO0OO == i3) {
                    return;
                }
                ArrayList<OooO0O0> arrayList2 = c0117OooO00oValueAt.f5031OooO0O0;
                androidx.constraintlayout.widget.OooO0O0 oooO0O0 = i3 == -1 ? null : arrayList2.get(i3).f5038OooO0o;
                if (i3 != -1) {
                    int i5 = arrayList2.get(i3).f5039OooO0o0;
                }
                if (oooO0O0 == null) {
                    return;
                }
                this.f5027OooO0OO = i3;
                oooO0O0.OooO0O0(constraintLayout);
                return;
            }
            return;
        }
        this.f5026OooO0O0 = i;
        C0117OooO00o c0117OooO00o = sparseArray.get(i);
        while (true) {
            ArrayList<OooO0O0> arrayList3 = c0117OooO00o.f5031OooO0O0;
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (arrayList3.get(i3).OooO00o(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList<OooO0O0> arrayList4 = c0117OooO00o.f5031OooO0O0;
        androidx.constraintlayout.widget.OooO0O0 oooO0O1 = i3 == -1 ? c0117OooO00o.f5033OooO0Oo : arrayList4.get(i3).f5038OooO0o;
        if (i3 != -1) {
            int i6 = arrayList4.get(i3).f5039OooO0o0;
        }
        if (oooO0O1 != null) {
            this.f5027OooO0OO = i3;
            oooO0O1.OooO0O0(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
    }
}
