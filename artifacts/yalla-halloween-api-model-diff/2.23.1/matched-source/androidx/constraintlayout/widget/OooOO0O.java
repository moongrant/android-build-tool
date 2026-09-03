package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f5173OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<OooO00o> f5174OooO0O0 = new SparseArray<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5175OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0O0> f5176OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f5177OooO0OO;

        public OooO00o(Context context, XmlResourceParser xmlResourceParser) {
            this.f5177OooO0OO = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.State_android_id) {
                    this.f5175OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f5175OooO00o);
                } else if (index == OooO.State_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5177OooO0OO);
                    this.f5177OooO0OO = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f5178OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f5179OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f5180OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f5181OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f5182OooO0o0;

        public OooO0O0(Context context, XmlResourceParser xmlResourceParser) {
            this.f5178OooO00o = Float.NaN;
            this.f5179OooO0O0 = Float.NaN;
            this.f5180OooO0OO = Float.NaN;
            this.f5181OooO0Oo = Float.NaN;
            this.f5182OooO0o0 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.Variant_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5182OooO0o0);
                    this.f5182OooO0o0 = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == OooO.Variant_region_heightLessThan) {
                    this.f5181OooO0Oo = typedArrayObtainStyledAttributes.getDimension(index, this.f5181OooO0Oo);
                } else if (index == OooO.Variant_region_heightMoreThan) {
                    this.f5179OooO0O0 = typedArrayObtainStyledAttributes.getDimension(index, this.f5179OooO0O0);
                } else if (index == OooO.Variant_region_widthLessThan) {
                    this.f5180OooO0OO = typedArrayObtainStyledAttributes.getDimension(index, this.f5180OooO0OO);
                } else if (index == OooO.Variant_region_widthMoreThan) {
                    this.f5178OooO00o = typedArrayObtainStyledAttributes.getDimension(index, this.f5178OooO00o);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean OooO00o(float f, float f2) {
            float f3 = this.f5178OooO00o;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f5179OooO0O0;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f5180OooO0OO;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.f5181OooO0Oo;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public OooOO0O(Context context, XmlResourceParser xmlResourceParser) {
        this.f5173OooO00o = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == OooO.StateSet_defaultState) {
                this.f5173OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f5173OooO00o);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            OooO00o oooO00o = null;
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
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
                        OooO00o oooO00o2 = new OooO00o(context, xmlResourceParser);
                        this.f5174OooO0O0.put(oooO00o2.f5175OooO00o, oooO00o2);
                        oooO00o = oooO00o2;
                    } else if (b == 3) {
                        OooO0O0 oooO0O0 = new OooO0O0(context, xmlResourceParser);
                        if (oooO00o != null) {
                            oooO00o.f5176OooO0O0.add(oooO0O0);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
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

    public final int OooO00o(int i) {
        ArrayList<OooO0O0> arrayList;
        int i2;
        ArrayList<OooO0O0> arrayList2;
        float f = -1;
        SparseArray<OooO00o> sparseArray = this.f5174OooO0O0;
        int i3 = 0;
        if (-1 == i) {
            OooO00o oooO00oValueAt = i == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (oooO00oValueAt == null) {
                return -1;
            }
            while (true) {
                arrayList2 = oooO00oValueAt.f5176OooO0O0;
                if (i3 >= arrayList2.size()) {
                    i3 = -1;
                    break;
                }
                if (arrayList2.get(i3).OooO00o(f, f)) {
                    break;
                }
                i3++;
            }
            if (-1 == i3) {
                return -1;
            }
            i2 = i3 == -1 ? oooO00oValueAt.f5177OooO0OO : arrayList2.get(i3).f5182OooO0o0;
        } else {
            OooO00o oooO00o = sparseArray.get(i);
            if (oooO00o == null) {
                return -1;
            }
            while (true) {
                arrayList = oooO00o.f5176OooO0O0;
                if (i3 >= arrayList.size()) {
                    i3 = -1;
                    break;
                }
                if (arrayList.get(i3).OooO00o(f, f)) {
                    break;
                }
                i3++;
            }
            i2 = i3 == -1 ? oooO00o.f5177OooO0OO : arrayList.get(i3).f5182OooO0o0;
        }
        return i2;
    }
}
