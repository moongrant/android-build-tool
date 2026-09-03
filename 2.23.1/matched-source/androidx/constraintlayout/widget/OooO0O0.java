package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p418o0Oo0oo.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final SparseIntArray f5040OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f5041OooO0oO = {0, 4, 8};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final SparseIntArray f5042OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f5043OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f5044OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f5045OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f5046OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f5048OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap<Integer, OooO00o> f5047OooO0o = new HashMap<>();

    public static class OooO {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final SparseIntArray f5049OooOOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5051OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f5052OooO0O0 = 0.0f;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f5053OooO0OO = 0.0f;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f5054OooO0Oo = 0.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f5056OooO0o0 = 1.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f5055OooO0o = 1.0f;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f5057OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f5058OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f5050OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f5059OooOO0 = 0.0f;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f5060OooOO0O = 0.0f;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f5061OooOO0o = 0.0f;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f5063OooOOO0 = false;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f5062OooOOO = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5049OooOOOO = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_rotation, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_rotationX, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_rotationY, 3);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_scaleX, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_scaleY, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_transformPivotX, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_transformPivotY, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_translationX, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_translationY, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_translationZ, 10);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_android_elevation, 11);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Transform_transformPivotTarget, 12);
        }

        public final void OooO00o(OooO oooO) {
            this.f5051OooO00o = oooO.f5051OooO00o;
            this.f5052OooO0O0 = oooO.f5052OooO0O0;
            this.f5053OooO0OO = oooO.f5053OooO0OO;
            this.f5054OooO0Oo = oooO.f5054OooO0Oo;
            this.f5056OooO0o0 = oooO.f5056OooO0o0;
            this.f5055OooO0o = oooO.f5055OooO0o;
            this.f5057OooO0oO = oooO.f5057OooO0oO;
            this.f5058OooO0oo = oooO.f5058OooO0oo;
            this.f5050OooO = oooO.f5050OooO;
            this.f5059OooOO0 = oooO.f5059OooOO0;
            this.f5060OooOO0O = oooO.f5060OooOO0O;
            this.f5061OooOO0o = oooO.f5061OooOO0o;
            this.f5063OooOOO0 = oooO.f5063OooOOO0;
            this.f5062OooOOO = oooO.f5062OooOOO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.Transform);
            this.f5051OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f5049OooOOOO.get(index)) {
                    case 1:
                        this.f5052OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5052OooO0O0);
                        break;
                    case 2:
                        this.f5053OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f5053OooO0OO);
                        break;
                    case 3:
                        this.f5054OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5054OooO0Oo);
                        break;
                    case 4:
                        this.f5056OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5056OooO0o0);
                        break;
                    case 5:
                        this.f5055OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f5055OooO0o);
                        break;
                    case 6:
                        this.f5057OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f5057OooO0oO);
                        break;
                    case 7:
                        this.f5058OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, this.f5058OooO0oo);
                        break;
                    case 8:
                        this.f5059OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f5059OooOO0);
                        break;
                    case 9:
                        this.f5060OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f5060OooOO0O);
                        break;
                    case 10:
                        this.f5061OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f5061OooOO0o);
                        break;
                    case 11:
                        this.f5063OooOOO0 = true;
                        this.f5062OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f5062OooOOO);
                        break;
                    case 12:
                        this.f5050OooO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5050OooO);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f5064OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f5065OooO0O0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public C0118OooO00o f5071OooO0oo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o f5066OooO0OO = new OooO0o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f5067OooO0Oo = new OooO0OO();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C0119OooO0O0 f5069OooO0o0 = new C0119OooO0O0();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO f5068OooO0o = new OooO();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f5070OooO0oO = new HashMap<>();

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0118OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int[] f5073OooO00o = new int[10];

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int[] f5074OooO0O0 = new int[10];

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f5075OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int[] f5076OooO0Oo = new int[10];

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float[] f5078OooO0o0 = new float[10];

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f5077OooO0o = 0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int[] f5079OooO0oO = new int[5];

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public String[] f5080OooO0oo = new String[5];

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f5072OooO = 0;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public int[] f5081OooOO0 = new int[4];

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public boolean[] f5082OooOO0O = new boolean[4];

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public int f5083OooOO0o = 0;

            public final void OooO00o(float f, int i) {
                int i2 = this.f5077OooO0o;
                int[] iArr = this.f5076OooO0Oo;
                if (i2 >= iArr.length) {
                    this.f5076OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f5078OooO0o0;
                    this.f5078OooO0o0 = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f5076OooO0Oo;
                int i3 = this.f5077OooO0o;
                iArr2[i3] = i;
                float[] fArr2 = this.f5078OooO0o0;
                this.f5077OooO0o = i3 + 1;
                fArr2[i3] = f;
            }

            public final void OooO0O0(int i, int i2) {
                int i3 = this.f5075OooO0OO;
                int[] iArr = this.f5073OooO00o;
                if (i3 >= iArr.length) {
                    this.f5073OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f5074OooO0O0;
                    this.f5074OooO0O0 = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f5073OooO00o;
                int i4 = this.f5075OooO0OO;
                iArr3[i4] = i;
                int[] iArr4 = this.f5074OooO0O0;
                this.f5075OooO0OO = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void OooO0OO(int i, String str) {
                int i2 = this.f5072OooO;
                int[] iArr = this.f5079OooO0oO;
                if (i2 >= iArr.length) {
                    this.f5079OooO0oO = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f5080OooO0oo;
                    this.f5080OooO0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f5079OooO0oO;
                int i3 = this.f5072OooO;
                iArr2[i3] = i;
                String[] strArr2 = this.f5080OooO0oo;
                this.f5072OooO = i3 + 1;
                strArr2[i3] = str;
            }

            public final void OooO0Oo(int i, boolean z) {
                int i2 = this.f5083OooOO0o;
                int[] iArr = this.f5081OooOO0;
                if (i2 >= iArr.length) {
                    this.f5081OooOO0 = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f5082OooOO0O;
                    this.f5082OooOO0O = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f5081OooOO0;
                int i3 = this.f5083OooOO0o;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f5082OooOO0O;
                this.f5083OooOO0o = i3 + 1;
                zArr2[i3] = z;
            }

            public final void OooO0o0(OooO00o oooO00o) {
                for (int i = 0; i < this.f5075OooO0OO; i++) {
                    int i2 = this.f5073OooO00o[i];
                    int i3 = this.f5074OooO0O0[i];
                    int[] iArr = OooO0O0.f5041OooO0oO;
                    if (i2 == 6) {
                        oooO00o.f5069OooO0o0.f5114OooOooO = i3;
                    } else if (i2 == 7) {
                        oooO00o.f5069OooO0o0.f5115OooOooo = i3;
                    } else if (i2 == 8) {
                        oooO00o.f5069OooO0o0.f5122Oooo0OO = i3;
                    } else if (i2 == 27) {
                        oooO00o.f5069OooO0o0.f5118Oooo000 = i3;
                    } else if (i2 == 28) {
                        oooO00o.f5069OooO0o0.f5120Oooo00o = i3;
                    } else if (i2 == 41) {
                        oooO00o.f5069OooO0o0.f5132OoooOOO = i3;
                    } else if (i2 == 42) {
                        oooO00o.f5069OooO0o0.f5133OoooOOo = i3;
                    } else if (i2 == 61) {
                        oooO00o.f5069OooO0o0.f5111OooOoOO = i3;
                    } else if (i2 == 62) {
                        oooO00o.f5069OooO0o0.f5113OooOoo0 = i3;
                    } else if (i2 == 72) {
                        oooO00o.f5069OooO0o0.f5143Oooooo0 = i3;
                    } else if (i2 == 73) {
                        oooO00o.f5069OooO0o0.f5142Oooooo = i3;
                    } else if (i2 == 2) {
                        oooO00o.f5069OooO0o0.f5121Oooo0O0 = i3;
                    } else if (i2 == 31) {
                        oooO00o.f5069OooO0o0.f5124Oooo0o0 = i3;
                    } else if (i2 == 34) {
                        oooO00o.f5069OooO0o0.f5117Oooo0 = i3;
                    } else if (i2 == 38) {
                        oooO00o.f5064OooO00o = i3;
                    } else if (i2 == 64) {
                        oooO00o.f5067OooO0Oo.f5156OooO0O0 = i3;
                    } else if (i2 == 66) {
                        oooO00o.f5067OooO0Oo.f5159OooO0o = i3;
                    } else if (i2 == 76) {
                        oooO00o.f5067OooO0Oo.f5160OooO0o0 = i3;
                    } else if (i2 == 78) {
                        oooO00o.f5066OooO0OO.f5169OooO0OO = i3;
                    } else if (i2 == 97) {
                        oooO00o.f5069OooO0o0.f5150o00o0O = i3;
                    } else if (i2 == 93) {
                        oooO00o.f5069OooO0o0.f5123Oooo0o = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                oooO00o.f5069OooO0o0.f5129OoooO00 = i3;
                                break;
                            case 12:
                                oooO00o.f5069OooO0o0.f5128OoooO0 = i3;
                                break;
                            case 13:
                                oooO00o.f5069OooO0o0.f5125Oooo0oO = i3;
                                break;
                            case 14:
                                oooO00o.f5069OooO0o0.f5116Oooo = i3;
                                break;
                            case 15:
                                oooO00o.f5069OooO0o0.f5130OoooO0O = i3;
                                break;
                            case 16:
                                oooO00o.f5069OooO0o0.f5126Oooo0oo = i3;
                                break;
                            case 17:
                                oooO00o.f5069OooO0o0.f5091OooO0o0 = i3;
                                break;
                            case 18:
                                oooO00o.f5069OooO0o0.f5090OooO0o = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        oooO00o.f5069OooO0o0.f5089OooO0Oo = i3;
                                        break;
                                    case 22:
                                        oooO00o.f5066OooO0OO.f5168OooO0O0 = i3;
                                        break;
                                    case 23:
                                        oooO00o.f5069OooO0o0.f5088OooO0OO = i3;
                                        break;
                                    case 24:
                                        oooO00o.f5069OooO0o0.f5119Oooo00O = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                oooO00o.f5069OooO0o0.f5134OoooOo0 = i3;
                                                break;
                                            case 55:
                                                oooO00o.f5069OooO0o0.f5135OoooOoO = i3;
                                                break;
                                            case 56:
                                                oooO00o.f5069OooO0o0.f5136OoooOoo = i3;
                                                break;
                                            case 57:
                                                oooO00o.f5069OooO0o0.f5137Ooooo00 = i3;
                                                break;
                                            case 58:
                                                oooO00o.f5069OooO0o0.f5138Ooooo0o = i3;
                                                break;
                                            case 59:
                                                oooO00o.f5069OooO0o0.f5139OooooO0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        oooO00o.f5067OooO0Oo.f5157OooO0OO = i3;
                                                        break;
                                                    case 83:
                                                        oooO00o.f5068OooO0o.f5050OooO = i3;
                                                        break;
                                                    case 84:
                                                        oooO00o.f5067OooO0Oo.f5163OooOO0 = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                oooO00o.f5067OooO0Oo.f5165OooOO0o = i3;
                                                                break;
                                                            case 89:
                                                                oooO00o.f5067OooO0Oo.f5166OooOOO0 = i3;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        oooO00o.f5069OooO0o0.f5127OoooO = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f5077OooO0o; i4++) {
                    int i5 = this.f5076OooO0Oo[i4];
                    float f = this.f5078OooO0o0[i4];
                    int[] iArr2 = OooO0O0.f5041OooO0oO;
                    if (i5 == 19) {
                        oooO00o.f5069OooO0o0.f5092OooO0oO = f;
                    } else if (i5 == 20) {
                        oooO00o.f5069OooO0o0.f5104OooOo = f;
                    } else if (i5 == 37) {
                        oooO00o.f5069OooO0o0.f5110OooOoO0 = f;
                    } else if (i5 == 60) {
                        oooO00o.f5068OooO0o.f5052OooO0O0 = f;
                    } else if (i5 == 63) {
                        oooO00o.f5069OooO0o0.f5112OooOoo = f;
                    } else if (i5 == 79) {
                        oooO00o.f5067OooO0Oo.f5161OooO0oO = f;
                    } else if (i5 == 85) {
                        oooO00o.f5067OooO0Oo.f5154OooO = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            oooO00o.f5069OooO0o0.f5146o000oOoO = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    oooO00o.f5066OooO0OO.f5170OooO0Oo = f;
                                    break;
                                case 44:
                                    OooO oooO = oooO00o.f5068OooO0o;
                                    oooO.f5062OooOOO = f;
                                    oooO.f5063OooOOO0 = true;
                                    break;
                                case 45:
                                    oooO00o.f5068OooO0o.f5053OooO0OO = f;
                                    break;
                                case 46:
                                    oooO00o.f5068OooO0o.f5054OooO0Oo = f;
                                    break;
                                case 47:
                                    oooO00o.f5068OooO0o.f5056OooO0o0 = f;
                                    break;
                                case 48:
                                    oooO00o.f5068OooO0o.f5055OooO0o = f;
                                    break;
                                case 49:
                                    oooO00o.f5068OooO0o.f5057OooO0oO = f;
                                    break;
                                case 50:
                                    oooO00o.f5068OooO0o.f5058OooO0oo = f;
                                    break;
                                case 51:
                                    oooO00o.f5068OooO0o.f5059OooOO0 = f;
                                    break;
                                case 52:
                                    oooO00o.f5068OooO0o.f5060OooOO0O = f;
                                    break;
                                case 53:
                                    oooO00o.f5068OooO0o.f5061OooOO0o = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            oooO00o.f5067OooO0Oo.f5162OooO0oo = f;
                                            break;
                                        case 68:
                                            oooO00o.f5066OooO0OO.f5171OooO0o0 = f;
                                            break;
                                        case 69:
                                            oooO00o.f5069OooO0o0.f5140OooooOO = f;
                                            break;
                                        case 70:
                                            oooO00o.f5069OooO0o0.f5141OooooOo = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            oooO00o.f5069OooO0o0.f5131OoooOO0 = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.f5072OooO; i6++) {
                    int i7 = this.f5079OooO0oO[i6];
                    String str = this.f5080OooO0oo[i6];
                    int[] iArr3 = OooO0O0.f5041OooO0oO;
                    if (i7 == 5) {
                        oooO00o.f5069OooO0o0.f5109OooOoO = str;
                    } else if (i7 == 65) {
                        oooO00o.f5067OooO0Oo.f5158OooO0Oo = str;
                    } else if (i7 == 74) {
                        C0119OooO0O0 c0119OooO0O0 = oooO00o.f5069OooO0o0;
                        c0119OooO0O0.f5151o0OoOo0 = str;
                        c0119OooO0O0.f5145Ooooooo = null;
                    } else if (i7 == 77) {
                        oooO00o.f5069OooO0o0.f5152ooOO = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            oooO00o.f5067OooO0Oo.f5164OooOO0O = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.f5083OooOO0o; i8++) {
                    int i9 = this.f5081OooOO0[i8];
                    boolean z = this.f5082OooOO0O[i8];
                    int[] iArr4 = OooO0O0.f5041OooO0oO;
                    if (i9 == 44) {
                        oooO00o.f5068OooO0o.f5063OooOOO0 = z;
                    } else if (i9 == 75) {
                        oooO00o.f5069OooO0o0.f5149o00Ooo = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            oooO00o.f5069OooO0o0.f5147o00O0O = z;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            oooO00o.f5069OooO0o0.f5148o00Oo0 = z;
                        }
                    }
                }
            }
        }

        public final void OooO00o(ConstraintLayout.LayoutParams layoutParams) {
            C0119OooO0O0 c0119OooO0O0 = this.f5069OooO0o0;
            layoutParams.f4937OooO0o0 = c0119OooO0O0.f5085OooO;
            layoutParams.f4936OooO0o = c0119OooO0O0.f5094OooOO0;
            layoutParams.f4938OooO0oO = c0119OooO0O0.f5095OooOO0O;
            layoutParams.f4939OooO0oo = c0119OooO0O0.f5096OooOO0o;
            layoutParams.f4931OooO = c0119OooO0O0.f5098OooOOO0;
            layoutParams.f4940OooOO0 = c0119OooO0O0.f5097OooOOO;
            layoutParams.f4941OooOO0O = c0119OooO0O0.f5099OooOOOO;
            layoutParams.f4942OooOO0o = c0119OooO0O0.f5100OooOOOo;
            layoutParams.f4944OooOOO0 = c0119OooO0O0.f5102OooOOo0;
            layoutParams.f4943OooOOO = c0119OooO0O0.f5101OooOOo;
            layoutParams.f4945OooOOOO = c0119OooO0O0.f5103OooOOoo;
            layoutParams.f4949OooOOoo = c0119OooO0O0.f5106OooOo00;
            layoutParams.f4952OooOo00 = c0119OooO0O0.f5105OooOo0;
            layoutParams.f4951OooOo0 = c0119OooO0O0.f5107OooOo0O;
            layoutParams.f4953OooOo0O = c0119OooO0O0.f5108OooOo0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = c0119OooO0O0.f5119Oooo00O;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = c0119OooO0O0.f5120Oooo00o;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c0119OooO0O0.f5117Oooo0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c0119OooO0O0.f5121Oooo0O0;
            layoutParams.f4957OooOoOO = c0119OooO0O0.f5130OoooO0O;
            layoutParams.f4959OooOoo0 = c0119OooO0O0.f5128OoooO0;
            layoutParams.f4950OooOo = c0119OooO0O0.f5126Oooo0oo;
            layoutParams.f4955OooOoO = c0119OooO0O0.f5129OoooO00;
            layoutParams.f4961OooOooo = c0119OooO0O0.f5104OooOo;
            layoutParams.f4964Oooo000 = c0119OooO0O0.f5110OooOoO0;
            layoutParams.f4946OooOOOo = c0119OooO0O0.f5111OooOoOO;
            layoutParams.f4948OooOOo0 = c0119OooO0O0.f5113OooOoo0;
            layoutParams.f4947OooOOo = c0119OooO0O0.f5112OooOoo;
            layoutParams.f4965Oooo00O = c0119OooO0O0.f5109OooOoO;
            layoutParams.f4973OoooO = c0119OooO0O0.f5114OooOooO;
            layoutParams.f4977OoooOO0 = c0119OooO0O0.f5115OooOooo;
            layoutParams.f4963Oooo0 = c0119OooO0O0.f5131OoooOO0;
            layoutParams.f4966Oooo00o = c0119OooO0O0.f5146o000oOoO;
            layoutParams.f4968Oooo0OO = c0119OooO0O0.f5133OoooOOo;
            layoutParams.f4967Oooo0O0 = c0119OooO0O0.f5132OoooOOO;
            layoutParams.f4978OoooOOO = c0119OooO0O0.f5147o00O0O;
            layoutParams.f4979OoooOOo = c0119OooO0O0.f5148o00Oo0;
            layoutParams.f4970Oooo0o0 = c0119OooO0O0.f5134OoooOo0;
            layoutParams.f4969Oooo0o = c0119OooO0O0.f5135OoooOoO;
            layoutParams.f4962Oooo = c0119OooO0O0.f5136OoooOoo;
            layoutParams.f4975OoooO00 = c0119OooO0O0.f5137Ooooo00;
            layoutParams.f4971Oooo0oO = c0119OooO0O0.f5138Ooooo0o;
            layoutParams.f4972Oooo0oo = c0119OooO0O0.f5139OooooO0;
            layoutParams.f4974OoooO0 = c0119OooO0O0.f5140OooooOO;
            layoutParams.f4976OoooO0O = c0119OooO0O0.f5141OooooOo;
            layoutParams.f4992o000oOoO = c0119OooO0O0.f5118Oooo000;
            layoutParams.f4934OooO0OO = c0119OooO0O0.f5092OooO0oO;
            layoutParams.f4932OooO00o = c0119OooO0O0.f5091OooO0o0;
            layoutParams.f4933OooO0O0 = c0119OooO0O0.f5090OooO0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = c0119OooO0O0.f5088OooO0OO;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = c0119OooO0O0.f5089OooO0Oo;
            String str = c0119OooO0O0.f5152ooOO;
            if (str != null) {
                layoutParams.f4980OoooOo0 = str;
            }
            layoutParams.f4981OoooOoO = c0119OooO0O0.f5150o00o0O;
            layoutParams.setMarginStart(c0119OooO0O0.f5124Oooo0o0);
            layoutParams.setMarginEnd(c0119OooO0O0.f5122Oooo0OO);
            layoutParams.OooO00o();
        }

        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO00o clone() {
            OooO00o oooO00o = new OooO00o();
            oooO00o.f5069OooO0o0.OooO00o(this.f5069OooO0o0);
            oooO00o.f5067OooO0Oo.OooO00o(this.f5067OooO0Oo);
            OooO0o oooO0o = oooO00o.f5066OooO0OO;
            oooO0o.getClass();
            OooO0o oooO0o2 = this.f5066OooO0OO;
            oooO0o.f5167OooO00o = oooO0o2.f5167OooO00o;
            oooO0o.f5168OooO0O0 = oooO0o2.f5168OooO0O0;
            oooO0o.f5170OooO0Oo = oooO0o2.f5170OooO0Oo;
            oooO0o.f5171OooO0o0 = oooO0o2.f5171OooO0o0;
            oooO0o.f5169OooO0OO = oooO0o2.f5169OooO0OO;
            oooO00o.f5068OooO0o.OooO00o(this.f5068OooO0o);
            oooO00o.f5064OooO00o = this.f5064OooO00o;
            oooO00o.f5071OooO0oo = this.f5071OooO0oo;
            return oooO00o;
        }

        public final void OooO0OO(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f5064OooO00o = i;
            int i2 = layoutParams.f4937OooO0o0;
            C0119OooO0O0 c0119OooO0O0 = this.f5069OooO0o0;
            c0119OooO0O0.f5085OooO = i2;
            c0119OooO0O0.f5094OooOO0 = layoutParams.f4936OooO0o;
            c0119OooO0O0.f5095OooOO0O = layoutParams.f4938OooO0oO;
            c0119OooO0O0.f5096OooOO0o = layoutParams.f4939OooO0oo;
            c0119OooO0O0.f5098OooOOO0 = layoutParams.f4931OooO;
            c0119OooO0O0.f5097OooOOO = layoutParams.f4940OooOO0;
            c0119OooO0O0.f5099OooOOOO = layoutParams.f4941OooOO0O;
            c0119OooO0O0.f5100OooOOOo = layoutParams.f4942OooOO0o;
            c0119OooO0O0.f5102OooOOo0 = layoutParams.f4944OooOOO0;
            c0119OooO0O0.f5101OooOOo = layoutParams.f4943OooOOO;
            c0119OooO0O0.f5103OooOOoo = layoutParams.f4945OooOOOO;
            c0119OooO0O0.f5106OooOo00 = layoutParams.f4949OooOOoo;
            c0119OooO0O0.f5105OooOo0 = layoutParams.f4952OooOo00;
            c0119OooO0O0.f5107OooOo0O = layoutParams.f4951OooOo0;
            c0119OooO0O0.f5108OooOo0o = layoutParams.f4953OooOo0O;
            c0119OooO0O0.f5104OooOo = layoutParams.f4961OooOooo;
            c0119OooO0O0.f5110OooOoO0 = layoutParams.f4964Oooo000;
            c0119OooO0O0.f5109OooOoO = layoutParams.f4965Oooo00O;
            c0119OooO0O0.f5111OooOoOO = layoutParams.f4946OooOOOo;
            c0119OooO0O0.f5113OooOoo0 = layoutParams.f4948OooOOo0;
            c0119OooO0O0.f5112OooOoo = layoutParams.f4947OooOOo;
            c0119OooO0O0.f5114OooOooO = layoutParams.f4973OoooO;
            c0119OooO0O0.f5115OooOooo = layoutParams.f4977OoooOO0;
            c0119OooO0O0.f5118Oooo000 = layoutParams.f4992o000oOoO;
            c0119OooO0O0.f5092OooO0oO = layoutParams.f4934OooO0OO;
            c0119OooO0O0.f5091OooO0o0 = layoutParams.f4932OooO00o;
            c0119OooO0O0.f5090OooO0o = layoutParams.f4933OooO0O0;
            c0119OooO0O0.f5088OooO0OO = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            c0119OooO0O0.f5089OooO0Oo = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            c0119OooO0O0.f5119Oooo00O = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            c0119OooO0O0.f5120Oooo00o = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            c0119OooO0O0.f5117Oooo0 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            c0119OooO0O0.f5121Oooo0O0 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            c0119OooO0O0.f5123Oooo0o = layoutParams.f4960OooOooO;
            c0119OooO0O0.f5131OoooOO0 = layoutParams.f4963Oooo0;
            c0119OooO0O0.f5146o000oOoO = layoutParams.f4966Oooo00o;
            c0119OooO0O0.f5133OoooOOo = layoutParams.f4968Oooo0OO;
            c0119OooO0O0.f5132OoooOOO = layoutParams.f4967Oooo0O0;
            c0119OooO0O0.f5147o00O0O = layoutParams.f4978OoooOOO;
            c0119OooO0O0.f5148o00Oo0 = layoutParams.f4979OoooOOo;
            c0119OooO0O0.f5134OoooOo0 = layoutParams.f4970Oooo0o0;
            c0119OooO0O0.f5135OoooOoO = layoutParams.f4969Oooo0o;
            c0119OooO0O0.f5136OoooOoo = layoutParams.f4962Oooo;
            c0119OooO0O0.f5137Ooooo00 = layoutParams.f4975OoooO00;
            c0119OooO0O0.f5138Ooooo0o = layoutParams.f4971Oooo0oO;
            c0119OooO0O0.f5139OooooO0 = layoutParams.f4972Oooo0oo;
            c0119OooO0O0.f5140OooooOO = layoutParams.f4974OoooO0;
            c0119OooO0O0.f5141OooooOo = layoutParams.f4976OoooO0O;
            c0119OooO0O0.f5152ooOO = layoutParams.f4980OoooOo0;
            c0119OooO0O0.f5126Oooo0oo = layoutParams.f4950OooOo;
            c0119OooO0O0.f5129OoooO00 = layoutParams.f4955OooOoO;
            c0119OooO0O0.f5125Oooo0oO = layoutParams.f4954OooOo0o;
            c0119OooO0O0.f5116Oooo = layoutParams.f4956OooOoO0;
            c0119OooO0O0.f5130OoooO0O = layoutParams.f4957OooOoOO;
            c0119OooO0O0.f5128OoooO0 = layoutParams.f4959OooOoo0;
            c0119OooO0O0.f5127OoooO = layoutParams.f4958OooOoo;
            c0119OooO0O0.f5150o00o0O = layoutParams.f4981OoooOoO;
            c0119OooO0O0.f5122Oooo0OO = layoutParams.getMarginEnd();
            c0119OooO0O0.f5124Oooo0o0 = layoutParams.getMarginStart();
        }

        public final void OooO0Oo(int i, Constraints.LayoutParams layoutParams) {
            OooO0OO(i, layoutParams);
            this.f5066OooO0OO.f5170OooO0Oo = layoutParams.f5022oo000o;
            float f = layoutParams.f5019o0ooOO0;
            OooO oooO = this.f5068OooO0o;
            oooO.f5052OooO0O0 = f;
            oooO.f5053OooO0OO = layoutParams.f5020o0ooOOo;
            oooO.f5054OooO0Oo = layoutParams.f5021o0ooOoO;
            oooO.f5056OooO0o0 = layoutParams.f5017o0OOO0o;
            oooO.f5055OooO0o = layoutParams.f5018o0Oo0oo;
            oooO.f5057OooO0oO = layoutParams.f5016o0OO00O;
            oooO.f5058OooO0oo = layoutParams.f5023oo0o0Oo;
            oooO.f5059OooOO0 = layoutParams.f5015o0O0O00;
            oooO.f5060OooOO0O = layoutParams.f5012o000OOo;
            oooO.f5061OooOO0o = layoutParams.f5011o000000;
            oooO.f5062OooOOO = layoutParams.f5013o00oO0O;
            oooO.f5063OooOOO0 = layoutParams.f5014o00oO0o;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0119OooO0O0 {

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public static final SparseIntArray f5084o00ooo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5088OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f5089OooO0Oo;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int[] f5145Ooooooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public String f5151o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public String f5152ooOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5086OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f5087OooO0O0 = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f5091OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5090OooO0o = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f5092OooO0oO = -1.0f;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f5093OooO0oo = true;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f5085OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f5094OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f5095OooOO0O = -1;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f5096OooOO0o = -1;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f5098OooOOO0 = -1;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f5097OooOOO = -1;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f5099OooOOOO = -1;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f5100OooOOOo = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f5102OooOOo0 = -1;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f5101OooOOo = -1;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f5103OooOOoo = -1;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f5106OooOo00 = -1;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f5105OooOo0 = -1;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f5107OooOo0O = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f5108OooOo0o = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f5104OooOo = 0.5f;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public float f5110OooOoO0 = 0.5f;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public String f5109OooOoO = null;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f5111OooOoOO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f5113OooOoo0 = 0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public float f5112OooOoo = 0.0f;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f5114OooOooO = -1;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f5115OooOooo = -1;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f5118Oooo000 = -1;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public int f5119Oooo00O = 0;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f5120Oooo00o = 0;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public int f5117Oooo0 = 0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f5121Oooo0O0 = 0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f5122Oooo0OO = 0;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f5124Oooo0o0 = 0;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f5123Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f5125Oooo0oO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f5126Oooo0oo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f5116Oooo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f5129OoooO00 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f5128OoooO0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f5130OoooO0O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f5127OoooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public float f5131OoooOO0 = -1.0f;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public float f5146o000oOoO = -1.0f;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public int f5132OoooOOO = 0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public int f5133OoooOOo = 0;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f5134OoooOo0 = 0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f5135OoooOoO = 0;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public int f5136OoooOoo = 0;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public int f5137Ooooo00 = 0;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public int f5138Ooooo0o = 0;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public int f5139OooooO0 = 0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public float f5140OooooOO = 1.0f;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public float f5141OooooOo = 1.0f;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f5143Oooooo0 = -1;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f5142Oooooo = 0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f5144OoooooO = -1;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public boolean f5147o00O0O = false;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public boolean f5148o00Oo0 = false;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public boolean f5149o00Ooo = true;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public int f5150o00o0O = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5084o00ooo = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintLeft_toLeftOf, 24);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintLeft_toRightOf, 25);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintRight_toLeftOf, 28);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintRight_toRightOf, 29);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintTop_toTopOf, 35);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintTop_toBottomOf, 34);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintBottom_toTopOf, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintBottom_toBottomOf, 3);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_editor_absoluteX, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_editor_absoluteY, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintGuide_begin, 17);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintGuide_end, 18);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintGuide_percent, 19);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_guidelineUseRtl, 90);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_orientation, 26);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintStart_toEndOf, 31);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintStart_toStartOf, 32);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintEnd_toStartOf, 10);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintEnd_toEndOf, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_goneMarginLeft, 13);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_goneMarginTop, 16);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_goneMarginRight, 14);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_goneMarginBottom, 11);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_goneMarginStart, 15);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_goneMarginEnd, 12);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintVertical_weight, 38);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintHorizontal_weight, 37);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintHorizontal_chainStyle, 39);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintVertical_chainStyle, 40);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintHorizontal_bias, 20);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintVertical_bias, 36);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintDimensionRatio, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintLeft_creator, 91);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintTop_creator, 91);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintRight_creator, 91);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintBottom_creator, 91);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintBaseline_creator, 91);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_marginLeft, 23);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_marginRight, 27);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_marginStart, 30);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_marginEnd, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_marginTop, 33);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_marginBottom, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_width, 22);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_android_layout_height, 21);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintWidth, 41);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintHeight, 42);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constrainedWidth, 41);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constrainedHeight, 42);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_wrapBehaviorInParent, 76);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintCircle, 61);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintCircleRadius, 62);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintCircleAngle, 63);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintWidth_percent, 69);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_layout_constraintHeight_percent, 70);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_chainUseRtl, 71);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_barrierDirection, 72);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_barrierMargin, 73);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_constraint_referenced_ids, 74);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Layout_barrierAllowsGoneWidgets, 75);
        }

        public final void OooO00o(C0119OooO0O0 c0119OooO0O0) {
            this.f5086OooO00o = c0119OooO0O0.f5086OooO00o;
            this.f5088OooO0OO = c0119OooO0O0.f5088OooO0OO;
            this.f5087OooO0O0 = c0119OooO0O0.f5087OooO0O0;
            this.f5089OooO0Oo = c0119OooO0O0.f5089OooO0Oo;
            this.f5091OooO0o0 = c0119OooO0O0.f5091OooO0o0;
            this.f5090OooO0o = c0119OooO0O0.f5090OooO0o;
            this.f5092OooO0oO = c0119OooO0O0.f5092OooO0oO;
            this.f5093OooO0oo = c0119OooO0O0.f5093OooO0oo;
            this.f5085OooO = c0119OooO0O0.f5085OooO;
            this.f5094OooOO0 = c0119OooO0O0.f5094OooOO0;
            this.f5095OooOO0O = c0119OooO0O0.f5095OooOO0O;
            this.f5096OooOO0o = c0119OooO0O0.f5096OooOO0o;
            this.f5098OooOOO0 = c0119OooO0O0.f5098OooOOO0;
            this.f5097OooOOO = c0119OooO0O0.f5097OooOOO;
            this.f5099OooOOOO = c0119OooO0O0.f5099OooOOOO;
            this.f5100OooOOOo = c0119OooO0O0.f5100OooOOOo;
            this.f5102OooOOo0 = c0119OooO0O0.f5102OooOOo0;
            this.f5101OooOOo = c0119OooO0O0.f5101OooOOo;
            this.f5103OooOOoo = c0119OooO0O0.f5103OooOOoo;
            this.f5106OooOo00 = c0119OooO0O0.f5106OooOo00;
            this.f5105OooOo0 = c0119OooO0O0.f5105OooOo0;
            this.f5107OooOo0O = c0119OooO0O0.f5107OooOo0O;
            this.f5108OooOo0o = c0119OooO0O0.f5108OooOo0o;
            this.f5104OooOo = c0119OooO0O0.f5104OooOo;
            this.f5110OooOoO0 = c0119OooO0O0.f5110OooOoO0;
            this.f5109OooOoO = c0119OooO0O0.f5109OooOoO;
            this.f5111OooOoOO = c0119OooO0O0.f5111OooOoOO;
            this.f5113OooOoo0 = c0119OooO0O0.f5113OooOoo0;
            this.f5112OooOoo = c0119OooO0O0.f5112OooOoo;
            this.f5114OooOooO = c0119OooO0O0.f5114OooOooO;
            this.f5115OooOooo = c0119OooO0O0.f5115OooOooo;
            this.f5118Oooo000 = c0119OooO0O0.f5118Oooo000;
            this.f5119Oooo00O = c0119OooO0O0.f5119Oooo00O;
            this.f5120Oooo00o = c0119OooO0O0.f5120Oooo00o;
            this.f5117Oooo0 = c0119OooO0O0.f5117Oooo0;
            this.f5121Oooo0O0 = c0119OooO0O0.f5121Oooo0O0;
            this.f5122Oooo0OO = c0119OooO0O0.f5122Oooo0OO;
            this.f5124Oooo0o0 = c0119OooO0O0.f5124Oooo0o0;
            this.f5123Oooo0o = c0119OooO0O0.f5123Oooo0o;
            this.f5125Oooo0oO = c0119OooO0O0.f5125Oooo0oO;
            this.f5126Oooo0oo = c0119OooO0O0.f5126Oooo0oo;
            this.f5116Oooo = c0119OooO0O0.f5116Oooo;
            this.f5129OoooO00 = c0119OooO0O0.f5129OoooO00;
            this.f5128OoooO0 = c0119OooO0O0.f5128OoooO0;
            this.f5130OoooO0O = c0119OooO0O0.f5130OoooO0O;
            this.f5127OoooO = c0119OooO0O0.f5127OoooO;
            this.f5131OoooOO0 = c0119OooO0O0.f5131OoooOO0;
            this.f5146o000oOoO = c0119OooO0O0.f5146o000oOoO;
            this.f5132OoooOOO = c0119OooO0O0.f5132OoooOOO;
            this.f5133OoooOOo = c0119OooO0O0.f5133OoooOOo;
            this.f5134OoooOo0 = c0119OooO0O0.f5134OoooOo0;
            this.f5135OoooOoO = c0119OooO0O0.f5135OoooOoO;
            this.f5136OoooOoo = c0119OooO0O0.f5136OoooOoo;
            this.f5137Ooooo00 = c0119OooO0O0.f5137Ooooo00;
            this.f5138Ooooo0o = c0119OooO0O0.f5138Ooooo0o;
            this.f5139OooooO0 = c0119OooO0O0.f5139OooooO0;
            this.f5140OooooOO = c0119OooO0O0.f5140OooooOO;
            this.f5141OooooOo = c0119OooO0O0.f5141OooooOo;
            this.f5143Oooooo0 = c0119OooO0O0.f5143Oooooo0;
            this.f5142Oooooo = c0119OooO0O0.f5142Oooooo;
            this.f5144OoooooO = c0119OooO0O0.f5144OoooooO;
            this.f5152ooOO = c0119OooO0O0.f5152ooOO;
            int[] iArr = c0119OooO0O0.f5145Ooooooo;
            if (iArr == null || c0119OooO0O0.f5151o0OoOo0 != null) {
                this.f5145Ooooooo = null;
            } else {
                this.f5145Ooooooo = Arrays.copyOf(iArr, iArr.length);
            }
            this.f5151o0OoOo0 = c0119OooO0O0.f5151o0OoOo0;
            this.f5147o00O0O = c0119OooO0O0.f5147o00O0O;
            this.f5148o00Oo0 = c0119OooO0O0.f5148o00Oo0;
            this.f5149o00Ooo = c0119OooO0O0.f5149o00Ooo;
            this.f5150o00o0O = c0119OooO0O0.f5150o00o0O;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.Layout);
            this.f5087OooO0O0 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f5084o00ooo;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.f5102OooOOo0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5102OooOOo0);
                        break;
                    case 2:
                        this.f5121Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5121Oooo0O0);
                        break;
                    case 3:
                        this.f5100OooOOOo = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5100OooOOOo);
                        break;
                    case 4:
                        this.f5099OooOOOO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5099OooOOOO);
                        break;
                    case 5:
                        this.f5109OooOoO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f5114OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5114OooOooO);
                        break;
                    case 7:
                        this.f5115OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5115OooOooo);
                        break;
                    case 8:
                        this.f5122Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5122Oooo0OO);
                        break;
                    case 9:
                        this.f5108OooOo0o = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5108OooOo0o);
                        break;
                    case 10:
                        this.f5107OooOo0O = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5107OooOo0O);
                        break;
                    case 11:
                        this.f5129OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5129OoooO00);
                        break;
                    case 12:
                        this.f5128OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5128OoooO0);
                        break;
                    case 13:
                        this.f5125Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5125Oooo0oO);
                        break;
                    case 14:
                        this.f5116Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5116Oooo);
                        break;
                    case 15:
                        this.f5130OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5130OoooO0O);
                        break;
                    case 16:
                        this.f5126Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5126Oooo0oo);
                        break;
                    case 17:
                        this.f5091OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5091OooO0o0);
                        break;
                    case 18:
                        this.f5090OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5090OooO0o);
                        break;
                    case 19:
                        this.f5092OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f5092OooO0oO);
                        break;
                    case 20:
                        this.f5104OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f5104OooOo);
                        break;
                    case 21:
                        this.f5089OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5089OooO0Oo);
                        break;
                    case 22:
                        this.f5088OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5088OooO0OO);
                        break;
                    case 23:
                        this.f5119Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5119Oooo00O);
                        break;
                    case 24:
                        this.f5085OooO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5085OooO);
                        break;
                    case 25:
                        this.f5094OooOO0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5094OooOO0);
                        break;
                    case 26:
                        this.f5118Oooo000 = typedArrayObtainStyledAttributes.getInt(index, this.f5118Oooo000);
                        break;
                    case 27:
                        this.f5120Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5120Oooo00o);
                        break;
                    case 28:
                        this.f5095OooOO0O = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5095OooOO0O);
                        break;
                    case 29:
                        this.f5096OooOO0o = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5096OooOO0o);
                        break;
                    case 30:
                        this.f5124Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5124Oooo0o0);
                        break;
                    case 31:
                        this.f5106OooOo00 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5106OooOo00);
                        break;
                    case 32:
                        this.f5105OooOo0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5105OooOo0);
                        break;
                    case 33:
                        this.f5117Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5117Oooo0);
                        break;
                    case 34:
                        this.f5097OooOOO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5097OooOOO);
                        break;
                    case 35:
                        this.f5098OooOOO0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5098OooOOO0);
                        break;
                    case 36:
                        this.f5110OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5110OooOoO0);
                        break;
                    case 37:
                        this.f5146o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f5146o000oOoO);
                        break;
                    case 38:
                        this.f5131OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5131OoooOO0);
                        break;
                    case 39:
                        this.f5132OoooOOO = typedArrayObtainStyledAttributes.getInt(index, this.f5132OoooOOO);
                        break;
                    case 40:
                        this.f5133OoooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f5133OoooOOo);
                        break;
                    case 41:
                        OooO0O0.OooOOO0(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        OooO0O0.OooOOO0(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f5111OooOoOO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5111OooOoOO);
                                break;
                            case 62:
                                this.f5113OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5113OooOoo0);
                                break;
                            case 63:
                                this.f5112OooOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f5112OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f5140OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f5141OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f5143Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, this.f5143Oooooo0);
                                        break;
                                    case 73:
                                        this.f5142Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5142Oooooo);
                                        break;
                                    case 74:
                                        this.f5151o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f5149o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, this.f5149o00Ooo);
                                        break;
                                    case 76:
                                        this.f5150o00o0O = typedArrayObtainStyledAttributes.getInt(index, this.f5150o00o0O);
                                        break;
                                    case 77:
                                        this.f5101OooOOo = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5101OooOOo);
                                        break;
                                    case 78:
                                        this.f5103OooOOoo = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5103OooOOoo);
                                        break;
                                    case 79:
                                        this.f5127OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5127OoooO);
                                        break;
                                    case 80:
                                        this.f5123Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5123Oooo0o);
                                        break;
                                    case 81:
                                        this.f5134OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, this.f5134OoooOo0);
                                        break;
                                    case 82:
                                        this.f5135OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f5135OoooOoO);
                                        break;
                                    case 83:
                                        this.f5137Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5137Ooooo00);
                                        break;
                                    case 84:
                                        this.f5136OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5136OoooOoo);
                                        break;
                                    case 85:
                                        this.f5139OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5139OooooO0);
                                        break;
                                    case 86:
                                        this.f5138Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5138Ooooo0o);
                                        break;
                                    case 87:
                                        this.f5147o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, this.f5147o00O0O);
                                        break;
                                    case 88:
                                        this.f5148o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5148o00Oo0);
                                        break;
                                    case 89:
                                        this.f5152ooOO = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f5093OooO0oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f5093OooO0oo);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final SparseIntArray f5153OooOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5155OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5156OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5157OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f5158OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f5160OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5159OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f5161OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f5162OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f5154OooO = Float.NaN;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f5163OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f5164OooOO0O = null;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f5165OooOO0o = -3;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f5166OooOOO0 = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5153OooOOO = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_motionPathRotate, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_pathMotionArc, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_transitionEasing, 3);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_drawPath, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_animateRelativeTo, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_animateCircleAngleTo, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_motionStagger, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_quantizeMotionSteps, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_quantizeMotionPhase, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.Motion_quantizeMotionInterpolator, 10);
        }

        public final void OooO00o(OooO0OO oooO0OO) {
            this.f5155OooO00o = oooO0OO.f5155OooO00o;
            this.f5156OooO0O0 = oooO0OO.f5156OooO0O0;
            this.f5158OooO0Oo = oooO0OO.f5158OooO0Oo;
            this.f5160OooO0o0 = oooO0OO.f5160OooO0o0;
            this.f5159OooO0o = oooO0OO.f5159OooO0o;
            this.f5162OooO0oo = oooO0OO.f5162OooO0oo;
            this.f5161OooO0oO = oooO0OO.f5161OooO0oO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.Motion);
            this.f5155OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f5153OooOOO.get(index)) {
                    case 1:
                        this.f5162OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5162OooO0oo);
                        break;
                    case 2:
                        this.f5160OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f5160OooO0o0);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f5158OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f5158OooO0Oo = oO00Oo00.f46472OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f5159OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f5156OooO0O0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5156OooO0O0);
                        break;
                    case 6:
                        this.f5157OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, this.f5157OooO0OO);
                        break;
                    case 7:
                        this.f5161OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f5161OooO0oO);
                        break;
                    case 8:
                        this.f5163OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, this.f5163OooOO0);
                        break;
                    case 9:
                        this.f5154OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f5154OooO);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f5166OooOOO0 = resourceId;
                            if (resourceId != -1) {
                                this.f5165OooOO0o = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f5164OooOO0O = string;
                            if (string.indexOf("/") > 0) {
                                this.f5166OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f5165OooOO0o = -2;
                            } else {
                                this.f5165OooOO0o = -1;
                            }
                        } else {
                            this.f5165OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, this.f5166OooOOO0);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5167OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5168OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5169OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f5170OooO0Oo = 1.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f5171OooO0o0 = Float.NaN;

        public final void OooO00o(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.PropertySet);
            this.f5167OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.OooO.PropertySet_android_alpha) {
                    this.f5170OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5170OooO0Oo);
                } else if (index == androidx.constraintlayout.widget.OooO.PropertySet_android_visibility) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f5168OooO0O0);
                    this.f5168OooO0O0 = i2;
                    this.f5168OooO0O0 = OooO0O0.f5041OooO0oO[i2];
                } else if (index == androidx.constraintlayout.widget.OooO.PropertySet_visibilityMode) {
                    this.f5169OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f5169OooO0OO);
                } else if (index == androidx.constraintlayout.widget.OooO.PropertySet_motionProgress) {
                    this.f5171OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5171OooO0o0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5042OooO0oo = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5040OooO = sparseIntArray2;
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_orientation, 27);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_width, 23);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_layout_height, 21);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_visibility, 22);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_alpha, 43);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_elevation, 44);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_rotationX, 45);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_rotationY, 46);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_rotation, 60);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_scaleX, 47);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_scaleY, 48);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_translationX, 51);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_translationY, 52);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_translationZ, 53);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_transitionEasing, 65);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_drawPath, 66);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_motionStagger, 79);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_android_id, 38);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_motionProgress, 68);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_chainUseRtl, 71);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_barrierDirection, 72);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_barrierMargin, 73);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_pathMotionArc, 76);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_visibilityMode, 78);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(androidx.constraintlayout.widget.OooO.Constraint_quantizeMotionInterpolator, 86);
        int i = androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray2.append(i, 6);
        sparseIntArray2.append(i, 7);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(androidx.constraintlayout.widget.OooO.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static OooO00o OooO0Oo(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        OooO00o oooO00o = new OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, androidx.constraintlayout.widget.OooO.ConstraintOverride);
        OooOOOO(oooO00o, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return oooO00o;
    }

    public static int[] OooO0o(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = androidx.constraintlayout.widget.OooO0o.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static OooO00o OooO0oO(Context context, AttributeSet attributeSet, boolean z) {
        OooO00o oooO00o = new OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? androidx.constraintlayout.widget.OooO.ConstraintOverride : androidx.constraintlayout.widget.OooO.Constraint);
        if (z) {
            OooOOOO(oooO00o, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i = 0;
            while (true) {
                C0119OooO0O0 c0119OooO0O0 = oooO00o.f5069OooO0o0;
                if (i < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    int i2 = androidx.constraintlayout.widget.OooO.Constraint_android_id;
                    OooO0o oooO0o = oooO00o.f5066OooO0OO;
                    OooO oooO = oooO00o.f5068OooO0o;
                    OooO0OO oooO0OO = oooO00o.f5067OooO0Oo;
                    if (index != i2 && androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginStart != index && androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginEnd != index) {
                        oooO0OO.f5155OooO00o = true;
                        c0119OooO0O0.f5087OooO0O0 = true;
                        oooO0o.f5167OooO00o = true;
                        oooO.f5051OooO00o = true;
                    }
                    SparseIntArray sparseIntArray = f5042OooO0oo;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            c0119OooO0O0.f5102OooOOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5102OooOOo0);
                            break;
                        case 2:
                            c0119OooO0O0.f5121Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5121Oooo0O0);
                            break;
                        case 3:
                            c0119OooO0O0.f5100OooOOOo = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5100OooOOOo);
                            break;
                        case 4:
                            c0119OooO0O0.f5099OooOOOO = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5099OooOOOO);
                            break;
                        case 5:
                            c0119OooO0O0.f5109OooOoO = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            c0119OooO0O0.f5114OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0119OooO0O0.f5114OooOooO);
                            break;
                        case 7:
                            c0119OooO0O0.f5115OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0119OooO0O0.f5115OooOooo);
                            break;
                        case 8:
                            c0119OooO0O0.f5122Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5122Oooo0OO);
                            break;
                        case 9:
                            c0119OooO0O0.f5108OooOo0o = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5108OooOo0o);
                            break;
                        case 10:
                            c0119OooO0O0.f5107OooOo0O = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5107OooOo0O);
                            break;
                        case 11:
                            c0119OooO0O0.f5129OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5129OoooO00);
                            break;
                        case 12:
                            c0119OooO0O0.f5128OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5128OoooO0);
                            break;
                        case 13:
                            c0119OooO0O0.f5125Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5125Oooo0oO);
                            break;
                        case 14:
                            c0119OooO0O0.f5116Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5116Oooo);
                            break;
                        case 15:
                            c0119OooO0O0.f5130OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5130OoooO0O);
                            break;
                        case 16:
                            c0119OooO0O0.f5126Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5126Oooo0oo);
                            break;
                        case 17:
                            c0119OooO0O0.f5091OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0119OooO0O0.f5091OooO0o0);
                            break;
                        case 18:
                            c0119OooO0O0.f5090OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0119OooO0O0.f5090OooO0o);
                            break;
                        case 19:
                            c0119OooO0O0.f5092OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, c0119OooO0O0.f5092OooO0oO);
                            break;
                        case 20:
                            c0119OooO0O0.f5104OooOo = typedArrayObtainStyledAttributes.getFloat(index, c0119OooO0O0.f5104OooOo);
                            break;
                        case 21:
                            c0119OooO0O0.f5089OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0119OooO0O0.f5089OooO0Oo);
                            break;
                        case 22:
                            oooO0o.f5168OooO0O0 = f5041OooO0oO[typedArrayObtainStyledAttributes.getInt(index, oooO0o.f5168OooO0O0)];
                            break;
                        case 23:
                            c0119OooO0O0.f5088OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0119OooO0O0.f5088OooO0OO);
                            break;
                        case 24:
                            c0119OooO0O0.f5119Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5119Oooo00O);
                            break;
                        case 25:
                            c0119OooO0O0.f5085OooO = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5085OooO);
                            break;
                        case 26:
                            c0119OooO0O0.f5094OooOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5094OooOO0);
                            break;
                        case 27:
                            c0119OooO0O0.f5118Oooo000 = typedArrayObtainStyledAttributes.getInt(index, c0119OooO0O0.f5118Oooo000);
                            break;
                        case 28:
                            c0119OooO0O0.f5120Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5120Oooo00o);
                            break;
                        case 29:
                            c0119OooO0O0.f5095OooOO0O = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5095OooOO0O);
                            break;
                        case 30:
                            c0119OooO0O0.f5096OooOO0o = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5096OooOO0o);
                            break;
                        case 31:
                            c0119OooO0O0.f5124Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5124Oooo0o0);
                            break;
                        case 32:
                            c0119OooO0O0.f5106OooOo00 = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5106OooOo00);
                            break;
                        case 33:
                            c0119OooO0O0.f5105OooOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5105OooOo0);
                            break;
                        case 34:
                            c0119OooO0O0.f5117Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5117Oooo0);
                            break;
                        case 35:
                            c0119OooO0O0.f5097OooOOO = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5097OooOOO);
                            break;
                        case 36:
                            c0119OooO0O0.f5098OooOOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5098OooOOO0);
                            break;
                        case 37:
                            c0119OooO0O0.f5110OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, c0119OooO0O0.f5110OooOoO0);
                            break;
                        case 38:
                            oooO00o.f5064OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, oooO00o.f5064OooO00o);
                            break;
                        case 39:
                            c0119OooO0O0.f5146o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, c0119OooO0O0.f5146o000oOoO);
                            break;
                        case 40:
                            c0119OooO0O0.f5131OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, c0119OooO0O0.f5131OoooOO0);
                            break;
                        case 41:
                            c0119OooO0O0.f5132OoooOOO = typedArrayObtainStyledAttributes.getInt(index, c0119OooO0O0.f5132OoooOOO);
                            break;
                        case 42:
                            c0119OooO0O0.f5133OoooOOo = typedArrayObtainStyledAttributes.getInt(index, c0119OooO0O0.f5133OoooOOo);
                            break;
                        case 43:
                            oooO0o.f5170OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0o.f5170OooO0Oo);
                            break;
                        case 44:
                            oooO.f5063OooOOO0 = true;
                            oooO.f5062OooOOO = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5062OooOOO);
                            break;
                        case 45:
                            oooO.f5053OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5053OooO0OO);
                            break;
                        case 46:
                            oooO.f5054OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5054OooO0Oo);
                            break;
                        case 47:
                            oooO.f5056OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5056OooO0o0);
                            break;
                        case 48:
                            oooO.f5055OooO0o = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5055OooO0o);
                            break;
                        case 49:
                            oooO.f5057OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5057OooO0oO);
                            break;
                        case 50:
                            oooO.f5058OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5058OooO0oo);
                            break;
                        case 51:
                            oooO.f5059OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5059OooOO0);
                            break;
                        case 52:
                            oooO.f5060OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5060OooOO0O);
                            break;
                        case 53:
                            oooO.f5061OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5061OooOO0o);
                            break;
                        case 54:
                            c0119OooO0O0.f5134OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, c0119OooO0O0.f5134OoooOo0);
                            break;
                        case 55:
                            c0119OooO0O0.f5135OoooOoO = typedArrayObtainStyledAttributes.getInt(index, c0119OooO0O0.f5135OoooOoO);
                            break;
                        case 56:
                            c0119OooO0O0.f5136OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5136OoooOoo);
                            break;
                        case 57:
                            c0119OooO0O0.f5137Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5137Ooooo00);
                            break;
                        case 58:
                            c0119OooO0O0.f5138Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5138Ooooo0o);
                            break;
                        case 59:
                            c0119OooO0O0.f5139OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5139OooooO0);
                            break;
                        case 60:
                            oooO.f5052OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5052OooO0O0);
                            break;
                        case 61:
                            c0119OooO0O0.f5111OooOoOO = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5111OooOoOO);
                            break;
                        case 62:
                            c0119OooO0O0.f5113OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5113OooOoo0);
                            break;
                        case 63:
                            c0119OooO0O0.f5112OooOoo = typedArrayObtainStyledAttributes.getFloat(index, c0119OooO0O0.f5112OooOoo);
                            break;
                        case 64:
                            oooO0OO.f5156OooO0O0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0OO.f5156OooO0O0);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                oooO0OO.f5158OooO0Oo = oO00Oo00.f46472OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                oooO0OO.f5158OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            oooO0OO.f5159OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            oooO0OO.f5162OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO.f5162OooO0oo);
                            break;
                        case 68:
                            oooO0o.f5171OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0o.f5171OooO0o0);
                            break;
                        case 69:
                            c0119OooO0O0.f5140OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            c0119OooO0O0.f5141OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            c0119OooO0O0.f5143Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, c0119OooO0O0.f5143Oooooo0);
                            break;
                        case 73:
                            c0119OooO0O0.f5142Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5142Oooooo);
                            break;
                        case 74:
                            c0119OooO0O0.f5151o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            c0119OooO0O0.f5149o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, c0119OooO0O0.f5149o00Ooo);
                            break;
                        case 76:
                            oooO0OO.f5160OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, oooO0OO.f5160OooO0o0);
                            break;
                        case 77:
                            c0119OooO0O0.f5152ooOO = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            oooO0o.f5169OooO0OO = typedArrayObtainStyledAttributes.getInt(index, oooO0o.f5169OooO0OO);
                            break;
                        case 79:
                            oooO0OO.f5161OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO.f5161OooO0oO);
                            break;
                        case 80:
                            c0119OooO0O0.f5147o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, c0119OooO0O0.f5147o00O0O);
                            break;
                        case 81:
                            c0119OooO0O0.f5148o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, c0119OooO0O0.f5148o00Oo0);
                            break;
                        case 82:
                            oooO0OO.f5157OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO.f5157OooO0OO);
                            break;
                        case 83:
                            oooO.f5050OooO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO.f5050OooO);
                            break;
                        case 84:
                            oooO0OO.f5163OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO.f5163OooOO0);
                            break;
                        case 85:
                            oooO0OO.f5154OooO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO.f5154OooO);
                            break;
                        case 86:
                            int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i3 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                oooO0OO.f5166OooOOO0 = resourceId;
                                if (resourceId != -1) {
                                    oooO0OO.f5165OooOO0o = -2;
                                }
                            } else if (i3 != 3) {
                                oooO0OO.f5165OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO.f5166OooOOO0);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                oooO0OO.f5164OooOO0O = string;
                                if (string.indexOf("/") <= 0) {
                                    oooO0OO.f5165OooOO0o = -1;
                                } else {
                                    oooO0OO.f5166OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    oooO0OO.f5165OooOO0o = -2;
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            c0119OooO0O0.f5101OooOOo = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5101OooOOo);
                            break;
                        case 92:
                            c0119OooO0O0.f5103OooOOoo = OooOO0o(typedArrayObtainStyledAttributes, index, c0119OooO0O0.f5103OooOOoo);
                            break;
                        case 93:
                            c0119OooO0O0.f5123Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5123Oooo0o);
                            break;
                        case 94:
                            c0119OooO0O0.f5127OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0119OooO0O0.f5127OoooO);
                            break;
                        case 95:
                            OooOOO0(c0119OooO0O0, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            OooOOO0(c0119OooO0O0, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            c0119OooO0O0.f5150o00o0O = typedArrayObtainStyledAttributes.getInt(index, c0119OooO0O0.f5150o00o0O);
                            break;
                    }
                    i++;
                } else if (c0119OooO0O0.f5151o0OoOo0 != null) {
                    c0119OooO0O0.f5145Ooooooo = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return oooO00o;
    }

    public static int OooOO0o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static void OooOOO(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f4965Oooo00O = str;
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    public static void OooOOO0(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        OooO00o.C0118OooO00o c0118OooO00o;
        C0119OooO0O0 c0119OooO0O0;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                        layoutParams.f4978OoooOOO = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                        layoutParams.f4979OoooOOo = z;
                        return;
                    }
                }
                if (obj instanceof C0119OooO0O0) {
                    c0119OooO0O0 = (C0119OooO0O0) obj;
                    if (i2 == 0) {
                        c0119OooO0O0.f5088OooO0OO = i4;
                        c0119OooO0O0.f5147o00O0O = z;
                        return;
                    } else {
                        c0119OooO0O0.f5089OooO0Oo = i4;
                        c0119OooO0O0.f5148o00Oo0 = z;
                        return;
                    }
                }
                if (obj instanceof OooO00o.C0118OooO00o) {
                    c0118OooO00o = (OooO00o.C0118OooO00o) obj;
                    if (i2 == 0) {
                        c0118OooO00o.OooO0O0(23, i4);
                        c0118OooO00o.OooO0Oo(80, z);
                        return;
                    } else {
                        c0118OooO00o.OooO0O0(21, i4);
                        c0118OooO00o.OooO0Oo(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                    layoutParams.f4978OoooOOO = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.f4979OoooOOo = z;
                    return;
                }
            }
            if (obj instanceof C0119OooO0O0) {
                c0119OooO0O0 = (C0119OooO0O0) obj;
                if (i2 == 0) {
                    c0119OooO0O0.f5088OooO0OO = i4;
                    c0119OooO0O0.f5147o00O0O = z;
                    return;
                } else {
                    c0119OooO0O0.f5089OooO0Oo = i4;
                    c0119OooO0O0.f5148o00Oo0 = z;
                    return;
                }
            }
            if (obj instanceof OooO00o.C0118OooO00o) {
                c0118OooO00o = (OooO00o.C0118OooO00o) obj;
                if (i2 == 0) {
                    c0118OooO00o.OooO0O0(23, i4);
                    c0118OooO00o.OooO0Oo(80, z);
                    return;
                } else {
                    c0118OooO00o.OooO0O0(21, i4);
                    c0118OooO00o.OooO0Oo(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    }
                    OooOOO(layoutParams2, strTrim2);
                    return;
                }
                if (obj instanceof C0119OooO0O0) {
                    ((C0119OooO0O0) obj).f5109OooOoO = strTrim2;
                    return;
                } else {
                    if (obj instanceof OooO00o.C0118OooO00o) {
                        ((OooO00o.C0118OooO00o) obj).OooO0OO(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.f4966Oooo00o = f;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f4963Oooo0 = f;
                        }
                    } else if (obj instanceof C0119OooO0O0) {
                        C0119OooO0O0 c0119OooO0O1 = (C0119OooO0O0) obj;
                        if (i2 == 0) {
                            c0119OooO0O1.f5088OooO0OO = 0;
                            c0119OooO0O1.f5146o000oOoO = f;
                        } else {
                            c0119OooO0O1.f5089OooO0Oo = 0;
                            c0119OooO0O1.f5131OoooOO0 = f;
                        }
                    } else if (obj instanceof OooO00o.C0118OooO00o) {
                        OooO00o.C0118OooO00o c0118OooO00o2 = (OooO00o.C0118OooO00o) obj;
                        if (i2 == 0) {
                            c0118OooO00o2.OooO0O0(23, 0);
                            c0118OooO00o2.OooO00o(f, 39);
                        } else {
                            c0118OooO00o2.OooO0O0(21, 0);
                            c0118OooO00o2.OooO00o(f, 40);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.f4974OoooO0 = fMax;
                            layoutParams4.f4970Oooo0o0 = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.f4976OoooO0O = fMax;
                            layoutParams4.f4969Oooo0o = 2;
                        }
                    } else if (obj instanceof C0119OooO0O0) {
                        C0119OooO0O0 c0119OooO0O2 = (C0119OooO0O0) obj;
                        if (i2 == 0) {
                            c0119OooO0O2.f5088OooO0OO = 0;
                            c0119OooO0O2.f5140OooooOO = fMax;
                            c0119OooO0O2.f5134OoooOo0 = 2;
                        } else {
                            c0119OooO0O2.f5089OooO0Oo = 0;
                            c0119OooO0O2.f5141OooooOo = fMax;
                            c0119OooO0O2.f5135OoooOoO = 2;
                        }
                    } else if (obj instanceof OooO00o.C0118OooO00o) {
                        OooO00o.C0118OooO00o c0118OooO00o3 = (OooO00o.C0118OooO00o) obj;
                        if (i2 == 0) {
                            c0118OooO00o3.OooO0O0(23, 0);
                            c0118OooO00o3.OooO0O0(54, 2);
                        } else {
                            c0118OooO00o3.OooO0O0(21, 0);
                            c0118OooO00o3.OooO0O0(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void OooOOOO(OooO00o oooO00o, TypedArray typedArray) {
        boolean z;
        int indexCount = typedArray.getIndexCount();
        OooO00o.C0118OooO00o c0118OooO00o = new OooO00o.C0118OooO00o();
        oooO00o.f5071OooO0oo = c0118OooO00o;
        OooO0OO oooO0OO = oooO00o.f5067OooO0Oo;
        oooO0OO.f5155OooO00o = false;
        C0119OooO0O0 c0119OooO0O0 = oooO00o.f5069OooO0o0;
        c0119OooO0O0.f5087OooO0O0 = false;
        OooO0o oooO0o = oooO00o.f5066OooO0OO;
        oooO0o.f5167OooO00o = false;
        OooO oooO = oooO00o.f5068OooO0o;
        oooO.f5051OooO00o = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f5040OooO.get(index);
            SparseIntArray sparseIntArray = f5042OooO0oo;
            switch (i2) {
                case 2:
                    z = false;
                    c0118OooO00o.OooO0O0(2, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5121Oooo0O0));
                    continue;
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    z = false;
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    continue;
                    break;
                case 5:
                    z = false;
                    c0118OooO00o.OooO0OO(5, typedArray.getString(index));
                    continue;
                    break;
                case 6:
                    z = false;
                    c0118OooO00o.OooO0O0(6, typedArray.getDimensionPixelOffset(index, c0119OooO0O0.f5114OooOooO));
                    continue;
                    break;
                case 7:
                    z = false;
                    c0118OooO00o.OooO0O0(7, typedArray.getDimensionPixelOffset(index, c0119OooO0O0.f5115OooOooo));
                    continue;
                    break;
                case 8:
                    z = false;
                    c0118OooO00o.OooO0O0(8, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5122Oooo0OO));
                    continue;
                    break;
                case 11:
                    z = false;
                    c0118OooO00o.OooO0O0(11, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5129OoooO00));
                    continue;
                    break;
                case 12:
                    z = false;
                    c0118OooO00o.OooO0O0(12, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5128OoooO0));
                    continue;
                    break;
                case 13:
                    z = false;
                    c0118OooO00o.OooO0O0(13, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5125Oooo0oO));
                    continue;
                    break;
                case 14:
                    z = false;
                    c0118OooO00o.OooO0O0(14, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5116Oooo));
                    continue;
                    break;
                case 15:
                    z = false;
                    c0118OooO00o.OooO0O0(15, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5130OoooO0O));
                    continue;
                    break;
                case 16:
                    z = false;
                    c0118OooO00o.OooO0O0(16, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5126Oooo0oo));
                    continue;
                    break;
                case 17:
                    z = false;
                    c0118OooO00o.OooO0O0(17, typedArray.getDimensionPixelOffset(index, c0119OooO0O0.f5091OooO0o0));
                    continue;
                    break;
                case 18:
                    z = false;
                    c0118OooO00o.OooO0O0(18, typedArray.getDimensionPixelOffset(index, c0119OooO0O0.f5090OooO0o));
                    continue;
                    break;
                case 19:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, c0119OooO0O0.f5092OooO0oO), 19);
                    continue;
                    break;
                case 20:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, c0119OooO0O0.f5104OooOo), 20);
                    continue;
                    break;
                case 21:
                    z = false;
                    c0118OooO00o.OooO0O0(21, typedArray.getLayoutDimension(index, c0119OooO0O0.f5089OooO0Oo));
                    continue;
                    break;
                case 22:
                    z = false;
                    c0118OooO00o.OooO0O0(22, f5041OooO0oO[typedArray.getInt(index, oooO0o.f5168OooO0O0)]);
                    continue;
                    break;
                case 23:
                    z = false;
                    c0118OooO00o.OooO0O0(23, typedArray.getLayoutDimension(index, c0119OooO0O0.f5088OooO0OO));
                    continue;
                    break;
                case 24:
                    z = false;
                    c0118OooO00o.OooO0O0(24, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5119Oooo00O));
                    continue;
                    break;
                case 27:
                    z = false;
                    c0118OooO00o.OooO0O0(27, typedArray.getInt(index, c0119OooO0O0.f5118Oooo000));
                    continue;
                    break;
                case 28:
                    z = false;
                    c0118OooO00o.OooO0O0(28, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5120Oooo00o));
                    continue;
                    break;
                case 31:
                    z = false;
                    c0118OooO00o.OooO0O0(31, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5124Oooo0o0));
                    continue;
                    break;
                case 34:
                    z = false;
                    c0118OooO00o.OooO0O0(34, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5117Oooo0));
                    continue;
                    break;
                case 37:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, c0119OooO0O0.f5110OooOoO0), 37);
                    continue;
                    break;
                case 38:
                    z = false;
                    int resourceId = typedArray.getResourceId(index, oooO00o.f5064OooO00o);
                    oooO00o.f5064OooO00o = resourceId;
                    c0118OooO00o.OooO0O0(38, resourceId);
                    continue;
                    break;
                case 39:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, c0119OooO0O0.f5146o000oOoO), 39);
                    continue;
                    break;
                case 40:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, c0119OooO0O0.f5131OoooOO0), 40);
                    continue;
                    break;
                case 41:
                    z = false;
                    c0118OooO00o.OooO0O0(41, typedArray.getInt(index, c0119OooO0O0.f5132OoooOOO));
                    continue;
                    break;
                case 42:
                    z = false;
                    c0118OooO00o.OooO0O0(42, typedArray.getInt(index, c0119OooO0O0.f5133OoooOOo));
                    continue;
                    break;
                case 43:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO0o.f5170OooO0Oo), 43);
                    continue;
                    break;
                case 44:
                    z = false;
                    c0118OooO00o.OooO0Oo(44, true);
                    c0118OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5062OooOOO), 44);
                    continue;
                    break;
                case 45:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5053OooO0OO), 45);
                    continue;
                    break;
                case 46:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5054OooO0Oo), 46);
                    continue;
                    break;
                case 47:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5056OooO0o0), 47);
                    continue;
                    break;
                case 48:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5055OooO0o), 48);
                    continue;
                    break;
                case 49:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5057OooO0oO), 49);
                    continue;
                    break;
                case 50:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5058OooO0oo), 50);
                    continue;
                    break;
                case 51:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5059OooOO0), 51);
                    continue;
                    break;
                case 52:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5060OooOO0O), 52);
                    continue;
                    break;
                case 53:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5061OooOO0o), 53);
                    continue;
                    break;
                case 54:
                    z = false;
                    c0118OooO00o.OooO0O0(54, typedArray.getInt(index, c0119OooO0O0.f5134OoooOo0));
                    continue;
                    break;
                case 55:
                    z = false;
                    c0118OooO00o.OooO0O0(55, typedArray.getInt(index, c0119OooO0O0.f5135OoooOoO));
                    continue;
                    break;
                case 56:
                    z = false;
                    c0118OooO00o.OooO0O0(56, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5136OoooOoo));
                    continue;
                    break;
                case 57:
                    z = false;
                    c0118OooO00o.OooO0O0(57, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5137Ooooo00));
                    continue;
                    break;
                case 58:
                    z = false;
                    c0118OooO00o.OooO0O0(58, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5138Ooooo0o));
                    continue;
                    break;
                case 59:
                    z = false;
                    c0118OooO00o.OooO0O0(59, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5139OooooO0));
                    continue;
                    break;
                case 60:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5052OooO0O0), 60);
                    continue;
                    break;
                case 62:
                    z = false;
                    c0118OooO00o.OooO0O0(62, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5113OooOoo0));
                    continue;
                    break;
                case 63:
                    z = false;
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, c0119OooO0O0.f5112OooOoo), 63);
                    continue;
                    break;
                case 64:
                    z = false;
                    c0118OooO00o.OooO0O0(64, OooOO0o(typedArray, index, oooO0OO.f5156OooO0O0));
                    continue;
                    break;
                case 65:
                    z = false;
                    if (typedArray.peekValue(index).type == 3) {
                        c0118OooO00o.OooO0OO(65, typedArray.getString(index));
                        continue;
                    } else {
                        c0118OooO00o.OooO0OO(65, oO00Oo00.f46472OooO0OO[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    z = false;
                    c0118OooO00o.OooO0O0(66, typedArray.getInt(index, 0));
                    continue;
                    break;
                case 67:
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO0OO.f5162OooO0oo), 67);
                    break;
                case 68:
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO0o.f5171OooO0o0), 68);
                    break;
                case 69:
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, 1.0f), 69);
                    break;
                case 70:
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, 1.0f), 70);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0118OooO00o.OooO0O0(72, typedArray.getInt(index, c0119OooO0O0.f5143Oooooo0));
                    break;
                case 73:
                    c0118OooO00o.OooO0O0(73, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5142Oooooo));
                    break;
                case 74:
                    c0118OooO00o.OooO0OO(74, typedArray.getString(index));
                    break;
                case 75:
                    c0118OooO00o.OooO0Oo(75, typedArray.getBoolean(index, c0119OooO0O0.f5149o00Ooo));
                    break;
                case 76:
                    c0118OooO00o.OooO0O0(76, typedArray.getInt(index, oooO0OO.f5160OooO0o0));
                    break;
                case 77:
                    c0118OooO00o.OooO0OO(77, typedArray.getString(index));
                    break;
                case 78:
                    c0118OooO00o.OooO0O0(78, typedArray.getInt(index, oooO0o.f5169OooO0OO));
                    break;
                case 79:
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO0OO.f5161OooO0oO), 79);
                    break;
                case 80:
                    c0118OooO00o.OooO0Oo(80, typedArray.getBoolean(index, c0119OooO0O0.f5147o00O0O));
                    break;
                case 81:
                    c0118OooO00o.OooO0Oo(81, typedArray.getBoolean(index, c0119OooO0O0.f5148o00Oo0));
                    break;
                case 82:
                    c0118OooO00o.OooO0O0(82, typedArray.getInteger(index, oooO0OO.f5157OooO0OO));
                    break;
                case 83:
                    c0118OooO00o.OooO0O0(83, OooOO0o(typedArray, index, oooO.f5050OooO));
                    break;
                case 84:
                    c0118OooO00o.OooO0O0(84, typedArray.getInteger(index, oooO0OO.f5163OooOO0));
                    break;
                case 85:
                    c0118OooO00o.OooO00o(typedArray.getFloat(index, oooO0OO.f5154OooO), 85);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        oooO0OO.f5166OooOOO0 = resourceId2;
                        c0118OooO00o.OooO0O0(89, resourceId2);
                        if (oooO0OO.f5166OooOOO0 != -1) {
                            oooO0OO.f5165OooOO0o = -2;
                            c0118OooO00o.OooO0O0(88, -2);
                        }
                    } else if (i3 == 3) {
                        String string = typedArray.getString(index);
                        oooO0OO.f5164OooOO0O = string;
                        c0118OooO00o.OooO0OO(90, string);
                        if (oooO0OO.f5164OooOO0O.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            oooO0OO.f5166OooOOO0 = resourceId3;
                            c0118OooO00o.OooO0O0(89, resourceId3);
                            oooO0OO.f5165OooOO0o = -2;
                            c0118OooO00o.OooO0O0(88, -2);
                        } else {
                            oooO0OO.f5165OooOO0o = -1;
                            c0118OooO00o.OooO0O0(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, oooO0OO.f5166OooOOO0);
                        oooO0OO.f5165OooOO0o = integer;
                        c0118OooO00o.OooO0O0(88, integer);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    c0118OooO00o.OooO0O0(93, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5123Oooo0o));
                    break;
                case 94:
                    c0118OooO00o.OooO0O0(94, typedArray.getDimensionPixelSize(index, c0119OooO0O0.f5127OoooO));
                    break;
                case 95:
                    OooOOO0(c0118OooO00o, typedArray, index, 0);
                    z = false;
                    continue;
                    break;
                case 96:
                    OooOOO0(c0118OooO00o, typedArray, index, 1);
                    break;
                case 97:
                    c0118OooO00o.OooO0O0(97, typedArray.getInt(index, c0119OooO0O0.f5150o00o0O));
                    break;
                case 98:
                    if (MotionLayout.f4581o00o0O) {
                        int resourceId4 = typedArray.getResourceId(index, oooO00o.f5064OooO00o);
                        oooO00o.f5064OooO00o = resourceId4;
                        if (resourceId4 == -1) {
                            oooO00o.f5065OooO0O0 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        oooO00o.f5065OooO0O0 = typedArray.getString(index);
                    } else {
                        oooO00o.f5064OooO00o = typedArray.getResourceId(index, oooO00o.f5064OooO00o);
                    }
                    break;
                case 99:
                    c0118OooO00o.OooO0Oo(99, typedArray.getBoolean(index, c0119OooO0O0.f5093OooO0oo));
                    break;
            }
            z = false;
        }
    }

    public final OooO00o OooO(int i) {
        HashMap<Integer, OooO00o> map = this.f5047OooO0o;
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void OooO00o(ConstraintLayout constraintLayout) {
        OooO00o oooO00o;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap<Integer, OooO00o> map = this.f5047OooO0o;
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + o000000O.OooO00o.OooO0Oo(childAt));
            } else {
                if (this.f5048OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (oooO00o = map.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.OooO0o0(childAt, oooO00o.f5070OooO0oO);
                }
            }
        }
    }

    public final void OooO0O0(ConstraintLayout constraintLayout) {
        OooO0OO(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void OooO0OO(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, OooO00o> map = this.f5047OooO0o;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + o000000O.OooO00o.OooO0Oo(childAt));
            } else {
                if (this.f5048OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        OooO00o oooO00o = map.get(Integer.valueOf(id));
                        if (oooO00o != null) {
                            if (childAt instanceof Barrier) {
                                C0119OooO0O0 c0119OooO0O0 = oooO00o.f5069OooO0o0;
                                c0119OooO0O0.f5144OoooooO = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0119OooO0O0.f5143Oooooo0);
                                barrier.setMargin(c0119OooO0O0.f5142Oooooo);
                                barrier.setAllowsGoneWidget(c0119OooO0O0.f5149o00Ooo);
                                int[] iArr = c0119OooO0O0.f5145Ooooooo;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0119OooO0O0.f5151o0OoOo0;
                                    if (str != null) {
                                        int[] iArrOooO0o = OooO0o(barrier, str);
                                        c0119OooO0O0.f5145Ooooooo = iArrOooO0o;
                                        barrier.setReferencedIds(iArrOooO0o);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.OooO00o();
                            oooO00o.OooO00o(layoutParams);
                            ConstraintAttribute.OooO0o0(childAt, oooO00o.f5070OooO0oO);
                            childAt.setLayoutParams(layoutParams);
                            OooO0o oooO0o = oooO00o.f5066OooO0OO;
                            if (oooO0o.f5169OooO0OO == 0) {
                                childAt.setVisibility(oooO0o.f5168OooO0O0);
                            }
                            childAt.setAlpha(oooO0o.f5170OooO0Oo);
                            OooO oooO = oooO00o.f5068OooO0o;
                            childAt.setRotation(oooO.f5052OooO0O0);
                            childAt.setRotationX(oooO.f5053OooO0OO);
                            childAt.setRotationY(oooO.f5054OooO0Oo);
                            childAt.setScaleX(oooO.f5056OooO0o0);
                            childAt.setScaleY(oooO.f5055OooO0o);
                            if (oooO.f5050OooO != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(oooO.f5050OooO);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(oooO.f5057OooO0oO)) {
                                    childAt.setPivotX(oooO.f5057OooO0oO);
                                }
                                if (!Float.isNaN(oooO.f5058OooO0oo)) {
                                    childAt.setPivotY(oooO.f5058OooO0oo);
                                }
                            }
                            childAt.setTranslationX(oooO.f5059OooOO0);
                            childAt.setTranslationY(oooO.f5060OooOO0O);
                            childAt.setTranslationZ(oooO.f5061OooOO0o);
                            if (oooO.f5063OooOOO0) {
                                childAt.setElevation(oooO.f5062OooOOO);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            OooO00o oooO00o2 = map.get(num);
            if (oooO00o2 != null) {
                C0119OooO0O0 c0119OooO0O1 = oooO00o2.f5069OooO0o0;
                if (c0119OooO0O1.f5144OoooooO == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0119OooO0O1.f5145Ooooooo;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0119OooO0O1.f5151o0OoOo0;
                        if (str2 != null) {
                            int[] iArrOooO0o2 = OooO0o(barrier2, str2);
                            c0119OooO0O1.f5145Ooooooo = iArrOooO0o2;
                            barrier2.setReferencedIds(iArrOooO0o2);
                        }
                    }
                    barrier2.setType(c0119OooO0O1.f5143Oooooo0);
                    barrier2.setMargin(c0119OooO0O1.f5142Oooooo);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.OooOo00();
                    oooO00o2.OooO00o(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (c0119OooO0O1.f5086OooO00o) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    oooO00o2.OooO00o(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).OooOO0(constraintLayout);
            }
        }
    }

    public final void OooO0o0(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        OooO0O0 oooO0O0 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, OooO00o> map = oooO0O0.f5047OooO0o;
        map.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oooO0O0.f5048OooO0o0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new OooO00o());
            }
            OooO00o oooO00o = map.get(Integer.valueOf(id));
            if (oooO00o == null) {
                i = childCount;
            } else {
                HashMap<String, ConstraintAttribute> map2 = oooO0O0.f5046OooO0Oo;
                HashMap<String, ConstraintAttribute> map3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    ConstraintAttribute constraintAttribute = map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            i2 = childCount;
                            try {
                                map3.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                            }
                            childCount = i2;
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        i2 = childCount;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        i2 = childCount;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        i2 = childCount;
                    }
                }
                i = childCount;
                oooO00o.f5070OooO0oO = map3;
                oooO00o.OooO0OO(id, layoutParams);
                int visibility = childAt.getVisibility();
                OooO0o oooO0o = oooO00o.f5066OooO0OO;
                oooO0o.f5168OooO0O0 = visibility;
                oooO0o.f5170OooO0Oo = childAt.getAlpha();
                float rotation = childAt.getRotation();
                OooO oooO = oooO00o.f5068OooO0o;
                oooO.f5052OooO0O0 = rotation;
                oooO.f5053OooO0OO = childAt.getRotationX();
                oooO.f5054OooO0Oo = childAt.getRotationY();
                oooO.f5056OooO0o0 = childAt.getScaleX();
                oooO.f5055OooO0o = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    oooO.f5057OooO0oO = pivotX;
                    oooO.f5058OooO0oo = pivotY;
                }
                oooO.f5059OooOO0 = childAt.getTranslationX();
                oooO.f5060OooOO0O = childAt.getTranslationY();
                oooO.f5061OooOO0o = childAt.getTranslationZ();
                if (oooO.f5063OooOOO0) {
                    oooO.f5062OooOOO = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0119OooO0O0 c0119OooO0O0 = oooO00o.f5069OooO0o0;
                    c0119OooO0O0.f5149o00Ooo = allowsGoneWidget;
                    c0119OooO0O0.f5145Ooooooo = barrier.getReferencedIds();
                    c0119OooO0O0.f5143Oooooo0 = barrier.getType();
                    c0119OooO0O0.f5142Oooooo = barrier.getMargin();
                }
            }
            i3++;
            oooO0O0 = this;
            childCount = i;
        }
    }

    public final OooO00o OooO0oo(int i) {
        HashMap<Integer, OooO00o> map = this.f5047OooO0o;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new OooO00o());
        }
        return map.get(Integer.valueOf(i));
    }

    public final void OooOO0(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    OooO00o oooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        oooO00oOooO0oO.f5069OooO0o0.f5086OooO00o = true;
                    }
                    this.f5047OooO0o.put(Integer.valueOf(oooO00oOooO0oO.f5064OooO00o), oooO00oOooO0oO);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooOO0O(Context context, XmlResourceParser xmlResourceParser) {
        OooO00o oooO00oOooO0oO;
        try {
            int eventType = xmlResourceParser.getEventType();
            OooO00o oooO00o = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    switch (xmlResourceParser.getName()) {
                        case "Constraint":
                            oooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlResourceParser), false);
                            break;
                        case "ConstraintOverride":
                            oooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlResourceParser), true);
                            break;
                        case "Guideline":
                            oooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlResourceParser), false);
                            C0119OooO0O0 c0119OooO0O0 = oooO00oOooO0oO.f5069OooO0o0;
                            c0119OooO0O0.f5086OooO00o = true;
                            c0119OooO0O0.f5087OooO0O0 = true;
                            break;
                        case "Barrier":
                            oooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlResourceParser), false);
                            oooO00oOooO0oO.f5069OooO0o0.f5144OoooooO = 1;
                            break;
                        case "PropertySet":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5066OooO0OO.OooO00o(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5068OooO0o.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5069OooO0o0.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5067OooO0Oo.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            ConstraintAttribute.OooO0Oo(context, xmlResourceParser, oooO00o.f5070OooO0oO);
                            continue;
                            break;
                            break;
                        default:
                            continue;
                            break;
                    }
                    oooO00o = oooO00oOooO0oO;
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f5047OooO0o.put(Integer.valueOf(oooO00o.f5064OooO00o), oooO00o);
                        oooO00o = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
