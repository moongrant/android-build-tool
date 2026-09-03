package p065o0000oO0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f27930OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SparseArray<OooO00o> f27931OooO0O0 = new SparseArray<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f27932OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList<OooO0O0> f27933OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f27934OooO0OO;

        public OooO00o(Context context, XmlPullParser xmlPullParser) {
            this.f27934OooO0OO = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.State_android_id) {
                    this.f27932OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f27932OooO00o);
                } else if (index == o000O00.State_constraints) {
                    this.f27934OooO0OO = typedArrayObtainStyledAttributes.getResourceId(index, this.f27934OooO0OO);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f27934OooO0OO);
                    context.getResources().getResourceName(this.f27934OooO0OO);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final int OooO00o(float f, float f2) {
            for (int i = 0; i < this.f27933OooO0O0.size(); i++) {
                if (this.f27933OooO0O0.get(i).OooO00o(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f27935OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f27936OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f27937OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f27938OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f27939OooO0o0;

        public OooO0O0(Context context, XmlPullParser xmlPullParser) {
            this.f27935OooO00o = Float.NaN;
            this.f27936OooO0O0 = Float.NaN;
            this.f27937OooO0OO = Float.NaN;
            this.f27938OooO0Oo = Float.NaN;
            this.f27939OooO0o0 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.Variant_constraints) {
                    this.f27939OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27939OooO0o0);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f27939OooO0o0);
                    context.getResources().getResourceName(this.f27939OooO0o0);
                    "layout".equals(resourceTypeName);
                } else if (index == o000O00.Variant_region_heightLessThan) {
                    this.f27938OooO0Oo = typedArrayObtainStyledAttributes.getDimension(index, this.f27938OooO0Oo);
                } else if (index == o000O00.Variant_region_heightMoreThan) {
                    this.f27936OooO0O0 = typedArrayObtainStyledAttributes.getDimension(index, this.f27936OooO0O0);
                } else if (index == o000O00.Variant_region_widthLessThan) {
                    this.f27937OooO0OO = typedArrayObtainStyledAttributes.getDimension(index, this.f27937OooO0OO);
                } else if (index == o000O00.Variant_region_widthMoreThan) {
                    this.f27935OooO00o = typedArrayObtainStyledAttributes.getDimension(index, this.f27935OooO00o);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean OooO00o(float f, float f2) {
            if (!Float.isNaN(this.f27935OooO00o) && f < this.f27935OooO00o) {
                return false;
            }
            if (!Float.isNaN(this.f27936OooO0O0) && f2 < this.f27936OooO0O0) {
                return false;
            }
            if (Float.isNaN(this.f27937OooO0OO) || f <= this.f27937OooO0OO) {
                return Float.isNaN(this.f27938OooO0Oo) || f2 <= this.f27938OooO0Oo;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public o000O00O(Context context, XmlPullParser xmlPullParser) {
        this.f27930OooO00o = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), o000O00.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == o000O00.StateSet_defaultState) {
                this.f27930OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f27930OooO00o);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        OooO00o oooO00o = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 2) {
                        oooO00o = new OooO00o(context, xmlPullParser);
                        this.f27931OooO0O0.put(oooO00o.f27932OooO00o, oooO00o);
                    } else if (b == 3) {
                        OooO0O0 oooO0O0 = new OooO0O0(context, xmlPullParser);
                        if (oooO00o != null) {
                            oooO00o.f27933OooO0O0.add(oooO0O0);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
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

    public final int OooO00o(int i) {
        int i2;
        int iOooO00o;
        float f = -1;
        if (-1 == i) {
            OooO00o oooO00oValueAt = i == -1 ? this.f27931OooO0O0.valueAt(0) : this.f27931OooO0O0.get(-1);
            if (oooO00oValueAt == null || -1 == (iOooO00o = oooO00oValueAt.OooO00o(f, f))) {
                return -1;
            }
            i2 = iOooO00o == -1 ? oooO00oValueAt.f27934OooO0OO : oooO00oValueAt.f27933OooO0O0.get(iOooO00o).f27939OooO0o0;
        } else {
            OooO00o oooO00o = this.f27931OooO0O0.get(i);
            if (oooO00o == null) {
                return -1;
            }
            int iOooO00o2 = oooO00o.OooO00o(f, f);
            i2 = iOooO00o2 == -1 ? oooO00o.f27934OooO0OO : oooO00o.f27933OooO0O0.get(iOooO00o2).f27939OooO0o0;
        }
        return i2;
    }
}
