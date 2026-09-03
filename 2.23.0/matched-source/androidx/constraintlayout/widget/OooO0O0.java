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
import p413o0Oo0oo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final SparseIntArray f5031OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f5032OooO0oO = {0, 4, 8};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final SparseIntArray f5033OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f5034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f5035OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f5036OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f5037OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f5039OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap<Integer, OooO00o> f5038OooO0o = new HashMap<>();

    public static class OooO {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final SparseIntArray f5040OooOOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5042OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f5043OooO0O0 = 0.0f;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f5044OooO0OO = 0.0f;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f5045OooO0Oo = 0.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f5047OooO0o0 = 1.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f5046OooO0o = 1.0f;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f5048OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f5049OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f5041OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f5050OooOO0 = 0.0f;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f5051OooOO0O = 0.0f;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f5052OooOO0o = 0.0f;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f5054OooOOO0 = false;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f5053OooOOO = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5040OooOOOO = sparseIntArray;
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
            this.f5042OooO00o = oooO.f5042OooO00o;
            this.f5043OooO0O0 = oooO.f5043OooO0O0;
            this.f5044OooO0OO = oooO.f5044OooO0OO;
            this.f5045OooO0Oo = oooO.f5045OooO0Oo;
            this.f5047OooO0o0 = oooO.f5047OooO0o0;
            this.f5046OooO0o = oooO.f5046OooO0o;
            this.f5048OooO0oO = oooO.f5048OooO0oO;
            this.f5049OooO0oo = oooO.f5049OooO0oo;
            this.f5041OooO = oooO.f5041OooO;
            this.f5050OooOO0 = oooO.f5050OooOO0;
            this.f5051OooOO0O = oooO.f5051OooOO0O;
            this.f5052OooOO0o = oooO.f5052OooOO0o;
            this.f5054OooOOO0 = oooO.f5054OooOOO0;
            this.f5053OooOOO = oooO.f5053OooOOO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.Transform);
            this.f5042OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f5040OooOOOO.get(index)) {
                    case 1:
                        this.f5043OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5043OooO0O0);
                        break;
                    case 2:
                        this.f5044OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f5044OooO0OO);
                        break;
                    case 3:
                        this.f5045OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5045OooO0Oo);
                        break;
                    case 4:
                        this.f5047OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5047OooO0o0);
                        break;
                    case 5:
                        this.f5046OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f5046OooO0o);
                        break;
                    case 6:
                        this.f5048OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f5048OooO0oO);
                        break;
                    case 7:
                        this.f5049OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, this.f5049OooO0oo);
                        break;
                    case 8:
                        this.f5050OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f5050OooOO0);
                        break;
                    case 9:
                        this.f5051OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f5051OooOO0O);
                        break;
                    case 10:
                        this.f5052OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f5052OooOO0o);
                        break;
                    case 11:
                        this.f5054OooOOO0 = true;
                        this.f5053OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f5053OooOOO);
                        break;
                    case 12:
                        this.f5041OooO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5041OooO);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f5055OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f5056OooO0O0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public C0116OooO00o f5062OooO0oo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o f5057OooO0OO = new OooO0o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f5058OooO0Oo = new OooO0OO();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C0117OooO0O0 f5060OooO0o0 = new C0117OooO0O0();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO f5059OooO0o = new OooO();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f5061OooO0oO = new HashMap<>();

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0116OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int[] f5064OooO00o = new int[10];

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int[] f5065OooO0O0 = new int[10];

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f5066OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int[] f5067OooO0Oo = new int[10];

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float[] f5069OooO0o0 = new float[10];

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f5068OooO0o = 0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int[] f5070OooO0oO = new int[5];

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public String[] f5071OooO0oo = new String[5];

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f5063OooO = 0;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public int[] f5072OooOO0 = new int[4];

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public boolean[] f5073OooOO0O = new boolean[4];

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public int f5074OooOO0o = 0;

            public final void OooO00o(float f, int i) {
                int i2 = this.f5068OooO0o;
                int[] iArr = this.f5067OooO0Oo;
                if (i2 >= iArr.length) {
                    this.f5067OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f5069OooO0o0;
                    this.f5069OooO0o0 = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f5067OooO0Oo;
                int i3 = this.f5068OooO0o;
                iArr2[i3] = i;
                float[] fArr2 = this.f5069OooO0o0;
                this.f5068OooO0o = i3 + 1;
                fArr2[i3] = f;
            }

            public final void OooO0O0(int i, int i2) {
                int i3 = this.f5066OooO0OO;
                int[] iArr = this.f5064OooO00o;
                if (i3 >= iArr.length) {
                    this.f5064OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f5065OooO0O0;
                    this.f5065OooO0O0 = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f5064OooO00o;
                int i4 = this.f5066OooO0OO;
                iArr3[i4] = i;
                int[] iArr4 = this.f5065OooO0O0;
                this.f5066OooO0OO = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void OooO0OO(int i, String str) {
                int i2 = this.f5063OooO;
                int[] iArr = this.f5070OooO0oO;
                if (i2 >= iArr.length) {
                    this.f5070OooO0oO = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f5071OooO0oo;
                    this.f5071OooO0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f5070OooO0oO;
                int i3 = this.f5063OooO;
                iArr2[i3] = i;
                String[] strArr2 = this.f5071OooO0oo;
                this.f5063OooO = i3 + 1;
                strArr2[i3] = str;
            }

            public final void OooO0Oo(int i, boolean z) {
                int i2 = this.f5074OooOO0o;
                int[] iArr = this.f5072OooOO0;
                if (i2 >= iArr.length) {
                    this.f5072OooOO0 = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f5073OooOO0O;
                    this.f5073OooOO0O = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f5072OooOO0;
                int i3 = this.f5074OooOO0o;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f5073OooOO0O;
                this.f5074OooOO0o = i3 + 1;
                zArr2[i3] = z;
            }

            public final void OooO0o0(OooO00o oooO00o) {
                for (int i = 0; i < this.f5066OooO0OO; i++) {
                    int i2 = this.f5064OooO00o[i];
                    int i3 = this.f5065OooO0O0[i];
                    int[] iArr = OooO0O0.f5032OooO0oO;
                    if (i2 == 6) {
                        oooO00o.f5060OooO0o0.f5105OooOooO = i3;
                    } else if (i2 == 7) {
                        oooO00o.f5060OooO0o0.f5106OooOooo = i3;
                    } else if (i2 == 8) {
                        oooO00o.f5060OooO0o0.f5113Oooo0OO = i3;
                    } else if (i2 == 27) {
                        oooO00o.f5060OooO0o0.f5109Oooo000 = i3;
                    } else if (i2 == 28) {
                        oooO00o.f5060OooO0o0.f5111Oooo00o = i3;
                    } else if (i2 == 41) {
                        oooO00o.f5060OooO0o0.f5123OoooOOO = i3;
                    } else if (i2 == 42) {
                        oooO00o.f5060OooO0o0.f5124OoooOOo = i3;
                    } else if (i2 == 61) {
                        oooO00o.f5060OooO0o0.f5102OooOoOO = i3;
                    } else if (i2 == 62) {
                        oooO00o.f5060OooO0o0.f5104OooOoo0 = i3;
                    } else if (i2 == 72) {
                        oooO00o.f5060OooO0o0.f5134Oooooo0 = i3;
                    } else if (i2 == 73) {
                        oooO00o.f5060OooO0o0.f5133Oooooo = i3;
                    } else if (i2 == 2) {
                        oooO00o.f5060OooO0o0.f5112Oooo0O0 = i3;
                    } else if (i2 == 31) {
                        oooO00o.f5060OooO0o0.f5115Oooo0o0 = i3;
                    } else if (i2 == 34) {
                        oooO00o.f5060OooO0o0.f5108Oooo0 = i3;
                    } else if (i2 == 38) {
                        oooO00o.f5055OooO00o = i3;
                    } else if (i2 == 64) {
                        oooO00o.f5058OooO0Oo.f5147OooO0O0 = i3;
                    } else if (i2 == 66) {
                        oooO00o.f5058OooO0Oo.f5150OooO0o = i3;
                    } else if (i2 == 76) {
                        oooO00o.f5058OooO0Oo.f5151OooO0o0 = i3;
                    } else if (i2 == 78) {
                        oooO00o.f5057OooO0OO.f5160OooO0OO = i3;
                    } else if (i2 == 97) {
                        oooO00o.f5060OooO0o0.f5141o00o0O = i3;
                    } else if (i2 == 93) {
                        oooO00o.f5060OooO0o0.f5114Oooo0o = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                oooO00o.f5060OooO0o0.f5120OoooO00 = i3;
                                break;
                            case 12:
                                oooO00o.f5060OooO0o0.f5119OoooO0 = i3;
                                break;
                            case 13:
                                oooO00o.f5060OooO0o0.f5116Oooo0oO = i3;
                                break;
                            case 14:
                                oooO00o.f5060OooO0o0.f5107Oooo = i3;
                                break;
                            case 15:
                                oooO00o.f5060OooO0o0.f5121OoooO0O = i3;
                                break;
                            case 16:
                                oooO00o.f5060OooO0o0.f5117Oooo0oo = i3;
                                break;
                            case 17:
                                oooO00o.f5060OooO0o0.f5082OooO0o0 = i3;
                                break;
                            case 18:
                                oooO00o.f5060OooO0o0.f5081OooO0o = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        oooO00o.f5060OooO0o0.f5080OooO0Oo = i3;
                                        break;
                                    case 22:
                                        oooO00o.f5057OooO0OO.f5159OooO0O0 = i3;
                                        break;
                                    case 23:
                                        oooO00o.f5060OooO0o0.f5079OooO0OO = i3;
                                        break;
                                    case 24:
                                        oooO00o.f5060OooO0o0.f5110Oooo00O = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                oooO00o.f5060OooO0o0.f5125OoooOo0 = i3;
                                                break;
                                            case 55:
                                                oooO00o.f5060OooO0o0.f5126OoooOoO = i3;
                                                break;
                                            case 56:
                                                oooO00o.f5060OooO0o0.f5127OoooOoo = i3;
                                                break;
                                            case 57:
                                                oooO00o.f5060OooO0o0.f5128Ooooo00 = i3;
                                                break;
                                            case 58:
                                                oooO00o.f5060OooO0o0.f5129Ooooo0o = i3;
                                                break;
                                            case 59:
                                                oooO00o.f5060OooO0o0.f5130OooooO0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        oooO00o.f5058OooO0Oo.f5148OooO0OO = i3;
                                                        break;
                                                    case 83:
                                                        oooO00o.f5059OooO0o.f5041OooO = i3;
                                                        break;
                                                    case 84:
                                                        oooO00o.f5058OooO0Oo.f5154OooOO0 = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                oooO00o.f5058OooO0Oo.f5156OooOO0o = i3;
                                                                break;
                                                            case 89:
                                                                oooO00o.f5058OooO0Oo.f5157OooOOO0 = i3;
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
                        oooO00o.f5060OooO0o0.f5118OoooO = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f5068OooO0o; i4++) {
                    int i5 = this.f5067OooO0Oo[i4];
                    float f = this.f5069OooO0o0[i4];
                    int[] iArr2 = OooO0O0.f5032OooO0oO;
                    if (i5 == 19) {
                        oooO00o.f5060OooO0o0.f5083OooO0oO = f;
                    } else if (i5 == 20) {
                        oooO00o.f5060OooO0o0.f5095OooOo = f;
                    } else if (i5 == 37) {
                        oooO00o.f5060OooO0o0.f5101OooOoO0 = f;
                    } else if (i5 == 60) {
                        oooO00o.f5059OooO0o.f5043OooO0O0 = f;
                    } else if (i5 == 63) {
                        oooO00o.f5060OooO0o0.f5103OooOoo = f;
                    } else if (i5 == 79) {
                        oooO00o.f5058OooO0Oo.f5152OooO0oO = f;
                    } else if (i5 == 85) {
                        oooO00o.f5058OooO0Oo.f5145OooO = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            oooO00o.f5060OooO0o0.f5137o000oOoO = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    oooO00o.f5057OooO0OO.f5161OooO0Oo = f;
                                    break;
                                case 44:
                                    OooO oooO = oooO00o.f5059OooO0o;
                                    oooO.f5053OooOOO = f;
                                    oooO.f5054OooOOO0 = true;
                                    break;
                                case 45:
                                    oooO00o.f5059OooO0o.f5044OooO0OO = f;
                                    break;
                                case 46:
                                    oooO00o.f5059OooO0o.f5045OooO0Oo = f;
                                    break;
                                case 47:
                                    oooO00o.f5059OooO0o.f5047OooO0o0 = f;
                                    break;
                                case 48:
                                    oooO00o.f5059OooO0o.f5046OooO0o = f;
                                    break;
                                case 49:
                                    oooO00o.f5059OooO0o.f5048OooO0oO = f;
                                    break;
                                case 50:
                                    oooO00o.f5059OooO0o.f5049OooO0oo = f;
                                    break;
                                case 51:
                                    oooO00o.f5059OooO0o.f5050OooOO0 = f;
                                    break;
                                case 52:
                                    oooO00o.f5059OooO0o.f5051OooOO0O = f;
                                    break;
                                case 53:
                                    oooO00o.f5059OooO0o.f5052OooOO0o = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            oooO00o.f5058OooO0Oo.f5153OooO0oo = f;
                                            break;
                                        case 68:
                                            oooO00o.f5057OooO0OO.f5162OooO0o0 = f;
                                            break;
                                        case 69:
                                            oooO00o.f5060OooO0o0.f5131OooooOO = f;
                                            break;
                                        case 70:
                                            oooO00o.f5060OooO0o0.f5132OooooOo = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            oooO00o.f5060OooO0o0.f5122OoooOO0 = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.f5063OooO; i6++) {
                    int i7 = this.f5070OooO0oO[i6];
                    String str = this.f5071OooO0oo[i6];
                    int[] iArr3 = OooO0O0.f5032OooO0oO;
                    if (i7 == 5) {
                        oooO00o.f5060OooO0o0.f5100OooOoO = str;
                    } else if (i7 == 65) {
                        oooO00o.f5058OooO0Oo.f5149OooO0Oo = str;
                    } else if (i7 == 74) {
                        C0117OooO0O0 c0117OooO0O0 = oooO00o.f5060OooO0o0;
                        c0117OooO0O0.f5142o0OoOo0 = str;
                        c0117OooO0O0.f5136Ooooooo = null;
                    } else if (i7 == 77) {
                        oooO00o.f5060OooO0o0.f5143ooOO = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            oooO00o.f5058OooO0Oo.f5155OooOO0O = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.f5074OooOO0o; i8++) {
                    int i9 = this.f5072OooOO0[i8];
                    boolean z = this.f5073OooOO0O[i8];
                    int[] iArr4 = OooO0O0.f5032OooO0oO;
                    if (i9 == 44) {
                        oooO00o.f5059OooO0o.f5054OooOOO0 = z;
                    } else if (i9 == 75) {
                        oooO00o.f5060OooO0o0.f5140o00Ooo = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            oooO00o.f5060OooO0o0.f5138o00O0O = z;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            oooO00o.f5060OooO0o0.f5139o00Oo0 = z;
                        }
                    }
                }
            }
        }

        public final void OooO00o(ConstraintLayout.LayoutParams layoutParams) {
            C0117OooO0O0 c0117OooO0O0 = this.f5060OooO0o0;
            layoutParams.f4928OooO0o0 = c0117OooO0O0.f5076OooO;
            layoutParams.f4927OooO0o = c0117OooO0O0.f5085OooOO0;
            layoutParams.f4929OooO0oO = c0117OooO0O0.f5086OooOO0O;
            layoutParams.f4930OooO0oo = c0117OooO0O0.f5087OooOO0o;
            layoutParams.f4922OooO = c0117OooO0O0.f5089OooOOO0;
            layoutParams.f4931OooOO0 = c0117OooO0O0.f5088OooOOO;
            layoutParams.f4932OooOO0O = c0117OooO0O0.f5090OooOOOO;
            layoutParams.f4933OooOO0o = c0117OooO0O0.f5091OooOOOo;
            layoutParams.f4935OooOOO0 = c0117OooO0O0.f5093OooOOo0;
            layoutParams.f4934OooOOO = c0117OooO0O0.f5092OooOOo;
            layoutParams.f4936OooOOOO = c0117OooO0O0.f5094OooOOoo;
            layoutParams.f4940OooOOoo = c0117OooO0O0.f5097OooOo00;
            layoutParams.f4943OooOo00 = c0117OooO0O0.f5096OooOo0;
            layoutParams.f4942OooOo0 = c0117OooO0O0.f5098OooOo0O;
            layoutParams.f4944OooOo0O = c0117OooO0O0.f5099OooOo0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = c0117OooO0O0.f5110Oooo00O;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = c0117OooO0O0.f5111Oooo00o;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c0117OooO0O0.f5108Oooo0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c0117OooO0O0.f5112Oooo0O0;
            layoutParams.f4948OooOoOO = c0117OooO0O0.f5121OoooO0O;
            layoutParams.f4950OooOoo0 = c0117OooO0O0.f5119OoooO0;
            layoutParams.f4941OooOo = c0117OooO0O0.f5117Oooo0oo;
            layoutParams.f4946OooOoO = c0117OooO0O0.f5120OoooO00;
            layoutParams.f4952OooOooo = c0117OooO0O0.f5095OooOo;
            layoutParams.f4955Oooo000 = c0117OooO0O0.f5101OooOoO0;
            layoutParams.f4937OooOOOo = c0117OooO0O0.f5102OooOoOO;
            layoutParams.f4939OooOOo0 = c0117OooO0O0.f5104OooOoo0;
            layoutParams.f4938OooOOo = c0117OooO0O0.f5103OooOoo;
            layoutParams.f4956Oooo00O = c0117OooO0O0.f5100OooOoO;
            layoutParams.f4964OoooO = c0117OooO0O0.f5105OooOooO;
            layoutParams.f4968OoooOO0 = c0117OooO0O0.f5106OooOooo;
            layoutParams.f4954Oooo0 = c0117OooO0O0.f5122OoooOO0;
            layoutParams.f4957Oooo00o = c0117OooO0O0.f5137o000oOoO;
            layoutParams.f4959Oooo0OO = c0117OooO0O0.f5124OoooOOo;
            layoutParams.f4958Oooo0O0 = c0117OooO0O0.f5123OoooOOO;
            layoutParams.f4969OoooOOO = c0117OooO0O0.f5138o00O0O;
            layoutParams.f4970OoooOOo = c0117OooO0O0.f5139o00Oo0;
            layoutParams.f4961Oooo0o0 = c0117OooO0O0.f5125OoooOo0;
            layoutParams.f4960Oooo0o = c0117OooO0O0.f5126OoooOoO;
            layoutParams.f4953Oooo = c0117OooO0O0.f5127OoooOoo;
            layoutParams.f4966OoooO00 = c0117OooO0O0.f5128Ooooo00;
            layoutParams.f4962Oooo0oO = c0117OooO0O0.f5129Ooooo0o;
            layoutParams.f4963Oooo0oo = c0117OooO0O0.f5130OooooO0;
            layoutParams.f4965OoooO0 = c0117OooO0O0.f5131OooooOO;
            layoutParams.f4967OoooO0O = c0117OooO0O0.f5132OooooOo;
            layoutParams.f4983o000oOoO = c0117OooO0O0.f5109Oooo000;
            layoutParams.f4925OooO0OO = c0117OooO0O0.f5083OooO0oO;
            layoutParams.f4923OooO00o = c0117OooO0O0.f5082OooO0o0;
            layoutParams.f4924OooO0O0 = c0117OooO0O0.f5081OooO0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = c0117OooO0O0.f5079OooO0OO;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = c0117OooO0O0.f5080OooO0Oo;
            String str = c0117OooO0O0.f5143ooOO;
            if (str != null) {
                layoutParams.f4971OoooOo0 = str;
            }
            layoutParams.f4972OoooOoO = c0117OooO0O0.f5141o00o0O;
            layoutParams.setMarginStart(c0117OooO0O0.f5115Oooo0o0);
            layoutParams.setMarginEnd(c0117OooO0O0.f5113Oooo0OO);
            layoutParams.OooO00o();
        }

        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO00o clone() {
            OooO00o oooO00o = new OooO00o();
            oooO00o.f5060OooO0o0.OooO00o(this.f5060OooO0o0);
            oooO00o.f5058OooO0Oo.OooO00o(this.f5058OooO0Oo);
            OooO0o oooO0o = oooO00o.f5057OooO0OO;
            oooO0o.getClass();
            OooO0o oooO0o2 = this.f5057OooO0OO;
            oooO0o.f5158OooO00o = oooO0o2.f5158OooO00o;
            oooO0o.f5159OooO0O0 = oooO0o2.f5159OooO0O0;
            oooO0o.f5161OooO0Oo = oooO0o2.f5161OooO0Oo;
            oooO0o.f5162OooO0o0 = oooO0o2.f5162OooO0o0;
            oooO0o.f5160OooO0OO = oooO0o2.f5160OooO0OO;
            oooO00o.f5059OooO0o.OooO00o(this.f5059OooO0o);
            oooO00o.f5055OooO00o = this.f5055OooO00o;
            oooO00o.f5062OooO0oo = this.f5062OooO0oo;
            return oooO00o;
        }

        public final void OooO0OO(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f5055OooO00o = i;
            int i2 = layoutParams.f4928OooO0o0;
            C0117OooO0O0 c0117OooO0O0 = this.f5060OooO0o0;
            c0117OooO0O0.f5076OooO = i2;
            c0117OooO0O0.f5085OooOO0 = layoutParams.f4927OooO0o;
            c0117OooO0O0.f5086OooOO0O = layoutParams.f4929OooO0oO;
            c0117OooO0O0.f5087OooOO0o = layoutParams.f4930OooO0oo;
            c0117OooO0O0.f5089OooOOO0 = layoutParams.f4922OooO;
            c0117OooO0O0.f5088OooOOO = layoutParams.f4931OooOO0;
            c0117OooO0O0.f5090OooOOOO = layoutParams.f4932OooOO0O;
            c0117OooO0O0.f5091OooOOOo = layoutParams.f4933OooOO0o;
            c0117OooO0O0.f5093OooOOo0 = layoutParams.f4935OooOOO0;
            c0117OooO0O0.f5092OooOOo = layoutParams.f4934OooOOO;
            c0117OooO0O0.f5094OooOOoo = layoutParams.f4936OooOOOO;
            c0117OooO0O0.f5097OooOo00 = layoutParams.f4940OooOOoo;
            c0117OooO0O0.f5096OooOo0 = layoutParams.f4943OooOo00;
            c0117OooO0O0.f5098OooOo0O = layoutParams.f4942OooOo0;
            c0117OooO0O0.f5099OooOo0o = layoutParams.f4944OooOo0O;
            c0117OooO0O0.f5095OooOo = layoutParams.f4952OooOooo;
            c0117OooO0O0.f5101OooOoO0 = layoutParams.f4955Oooo000;
            c0117OooO0O0.f5100OooOoO = layoutParams.f4956Oooo00O;
            c0117OooO0O0.f5102OooOoOO = layoutParams.f4937OooOOOo;
            c0117OooO0O0.f5104OooOoo0 = layoutParams.f4939OooOOo0;
            c0117OooO0O0.f5103OooOoo = layoutParams.f4938OooOOo;
            c0117OooO0O0.f5105OooOooO = layoutParams.f4964OoooO;
            c0117OooO0O0.f5106OooOooo = layoutParams.f4968OoooOO0;
            c0117OooO0O0.f5109Oooo000 = layoutParams.f4983o000oOoO;
            c0117OooO0O0.f5083OooO0oO = layoutParams.f4925OooO0OO;
            c0117OooO0O0.f5082OooO0o0 = layoutParams.f4923OooO00o;
            c0117OooO0O0.f5081OooO0o = layoutParams.f4924OooO0O0;
            c0117OooO0O0.f5079OooO0OO = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            c0117OooO0O0.f5080OooO0Oo = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            c0117OooO0O0.f5110Oooo00O = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            c0117OooO0O0.f5111Oooo00o = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            c0117OooO0O0.f5108Oooo0 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            c0117OooO0O0.f5112Oooo0O0 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            c0117OooO0O0.f5114Oooo0o = layoutParams.f4951OooOooO;
            c0117OooO0O0.f5122OoooOO0 = layoutParams.f4954Oooo0;
            c0117OooO0O0.f5137o000oOoO = layoutParams.f4957Oooo00o;
            c0117OooO0O0.f5124OoooOOo = layoutParams.f4959Oooo0OO;
            c0117OooO0O0.f5123OoooOOO = layoutParams.f4958Oooo0O0;
            c0117OooO0O0.f5138o00O0O = layoutParams.f4969OoooOOO;
            c0117OooO0O0.f5139o00Oo0 = layoutParams.f4970OoooOOo;
            c0117OooO0O0.f5125OoooOo0 = layoutParams.f4961Oooo0o0;
            c0117OooO0O0.f5126OoooOoO = layoutParams.f4960Oooo0o;
            c0117OooO0O0.f5127OoooOoo = layoutParams.f4953Oooo;
            c0117OooO0O0.f5128Ooooo00 = layoutParams.f4966OoooO00;
            c0117OooO0O0.f5129Ooooo0o = layoutParams.f4962Oooo0oO;
            c0117OooO0O0.f5130OooooO0 = layoutParams.f4963Oooo0oo;
            c0117OooO0O0.f5131OooooOO = layoutParams.f4965OoooO0;
            c0117OooO0O0.f5132OooooOo = layoutParams.f4967OoooO0O;
            c0117OooO0O0.f5143ooOO = layoutParams.f4971OoooOo0;
            c0117OooO0O0.f5117Oooo0oo = layoutParams.f4941OooOo;
            c0117OooO0O0.f5120OoooO00 = layoutParams.f4946OooOoO;
            c0117OooO0O0.f5116Oooo0oO = layoutParams.f4945OooOo0o;
            c0117OooO0O0.f5107Oooo = layoutParams.f4947OooOoO0;
            c0117OooO0O0.f5121OoooO0O = layoutParams.f4948OooOoOO;
            c0117OooO0O0.f5119OoooO0 = layoutParams.f4950OooOoo0;
            c0117OooO0O0.f5118OoooO = layoutParams.f4949OooOoo;
            c0117OooO0O0.f5141o00o0O = layoutParams.f4972OoooOoO;
            c0117OooO0O0.f5113Oooo0OO = layoutParams.getMarginEnd();
            c0117OooO0O0.f5115Oooo0o0 = layoutParams.getMarginStart();
        }

        public final void OooO0Oo(int i, Constraints.LayoutParams layoutParams) {
            OooO0OO(i, layoutParams);
            this.f5057OooO0OO.f5161OooO0Oo = layoutParams.f5013oo000o;
            float f = layoutParams.f5010o0ooOO0;
            OooO oooO = this.f5059OooO0o;
            oooO.f5043OooO0O0 = f;
            oooO.f5044OooO0OO = layoutParams.f5011o0ooOOo;
            oooO.f5045OooO0Oo = layoutParams.f5012o0ooOoO;
            oooO.f5047OooO0o0 = layoutParams.f5008o0OOO0o;
            oooO.f5046OooO0o = layoutParams.f5009o0Oo0oo;
            oooO.f5048OooO0oO = layoutParams.f5007o0OO00O;
            oooO.f5049OooO0oo = layoutParams.f5014oo0o0Oo;
            oooO.f5050OooOO0 = layoutParams.f5006o0O0O00;
            oooO.f5051OooOO0O = layoutParams.f5003o000OOo;
            oooO.f5052OooOO0o = layoutParams.f5002o000000;
            oooO.f5053OooOOO = layoutParams.f5004o00oO0O;
            oooO.f5054OooOOO0 = layoutParams.f5005o00oO0o;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0117OooO0O0 {

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public static final SparseIntArray f5075o00ooo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5079OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f5080OooO0Oo;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int[] f5136Ooooooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public String f5142o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public String f5143ooOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5077OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f5078OooO0O0 = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f5082OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5081OooO0o = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f5083OooO0oO = -1.0f;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f5084OooO0oo = true;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f5076OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f5085OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f5086OooOO0O = -1;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f5087OooOO0o = -1;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f5089OooOOO0 = -1;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f5088OooOOO = -1;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f5090OooOOOO = -1;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f5091OooOOOo = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f5093OooOOo0 = -1;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f5092OooOOo = -1;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f5094OooOOoo = -1;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f5097OooOo00 = -1;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f5096OooOo0 = -1;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f5098OooOo0O = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f5099OooOo0o = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f5095OooOo = 0.5f;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public float f5101OooOoO0 = 0.5f;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public String f5100OooOoO = null;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f5102OooOoOO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f5104OooOoo0 = 0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public float f5103OooOoo = 0.0f;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f5105OooOooO = -1;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f5106OooOooo = -1;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f5109Oooo000 = -1;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public int f5110Oooo00O = 0;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f5111Oooo00o = 0;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public int f5108Oooo0 = 0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f5112Oooo0O0 = 0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f5113Oooo0OO = 0;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f5115Oooo0o0 = 0;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f5114Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f5116Oooo0oO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f5117Oooo0oo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f5107Oooo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f5120OoooO00 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f5119OoooO0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f5121OoooO0O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f5118OoooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public float f5122OoooOO0 = -1.0f;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public float f5137o000oOoO = -1.0f;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public int f5123OoooOOO = 0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public int f5124OoooOOo = 0;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f5125OoooOo0 = 0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f5126OoooOoO = 0;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public int f5127OoooOoo = 0;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public int f5128Ooooo00 = 0;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public int f5129Ooooo0o = 0;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public int f5130OooooO0 = 0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public float f5131OooooOO = 1.0f;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public float f5132OooooOo = 1.0f;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f5134Oooooo0 = -1;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f5133Oooooo = 0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f5135OoooooO = -1;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public boolean f5138o00O0O = false;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public boolean f5139o00Oo0 = false;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public boolean f5140o00Ooo = true;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public int f5141o00o0O = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5075o00ooo = sparseIntArray;
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

        public final void OooO00o(C0117OooO0O0 c0117OooO0O0) {
            this.f5077OooO00o = c0117OooO0O0.f5077OooO00o;
            this.f5079OooO0OO = c0117OooO0O0.f5079OooO0OO;
            this.f5078OooO0O0 = c0117OooO0O0.f5078OooO0O0;
            this.f5080OooO0Oo = c0117OooO0O0.f5080OooO0Oo;
            this.f5082OooO0o0 = c0117OooO0O0.f5082OooO0o0;
            this.f5081OooO0o = c0117OooO0O0.f5081OooO0o;
            this.f5083OooO0oO = c0117OooO0O0.f5083OooO0oO;
            this.f5084OooO0oo = c0117OooO0O0.f5084OooO0oo;
            this.f5076OooO = c0117OooO0O0.f5076OooO;
            this.f5085OooOO0 = c0117OooO0O0.f5085OooOO0;
            this.f5086OooOO0O = c0117OooO0O0.f5086OooOO0O;
            this.f5087OooOO0o = c0117OooO0O0.f5087OooOO0o;
            this.f5089OooOOO0 = c0117OooO0O0.f5089OooOOO0;
            this.f5088OooOOO = c0117OooO0O0.f5088OooOOO;
            this.f5090OooOOOO = c0117OooO0O0.f5090OooOOOO;
            this.f5091OooOOOo = c0117OooO0O0.f5091OooOOOo;
            this.f5093OooOOo0 = c0117OooO0O0.f5093OooOOo0;
            this.f5092OooOOo = c0117OooO0O0.f5092OooOOo;
            this.f5094OooOOoo = c0117OooO0O0.f5094OooOOoo;
            this.f5097OooOo00 = c0117OooO0O0.f5097OooOo00;
            this.f5096OooOo0 = c0117OooO0O0.f5096OooOo0;
            this.f5098OooOo0O = c0117OooO0O0.f5098OooOo0O;
            this.f5099OooOo0o = c0117OooO0O0.f5099OooOo0o;
            this.f5095OooOo = c0117OooO0O0.f5095OooOo;
            this.f5101OooOoO0 = c0117OooO0O0.f5101OooOoO0;
            this.f5100OooOoO = c0117OooO0O0.f5100OooOoO;
            this.f5102OooOoOO = c0117OooO0O0.f5102OooOoOO;
            this.f5104OooOoo0 = c0117OooO0O0.f5104OooOoo0;
            this.f5103OooOoo = c0117OooO0O0.f5103OooOoo;
            this.f5105OooOooO = c0117OooO0O0.f5105OooOooO;
            this.f5106OooOooo = c0117OooO0O0.f5106OooOooo;
            this.f5109Oooo000 = c0117OooO0O0.f5109Oooo000;
            this.f5110Oooo00O = c0117OooO0O0.f5110Oooo00O;
            this.f5111Oooo00o = c0117OooO0O0.f5111Oooo00o;
            this.f5108Oooo0 = c0117OooO0O0.f5108Oooo0;
            this.f5112Oooo0O0 = c0117OooO0O0.f5112Oooo0O0;
            this.f5113Oooo0OO = c0117OooO0O0.f5113Oooo0OO;
            this.f5115Oooo0o0 = c0117OooO0O0.f5115Oooo0o0;
            this.f5114Oooo0o = c0117OooO0O0.f5114Oooo0o;
            this.f5116Oooo0oO = c0117OooO0O0.f5116Oooo0oO;
            this.f5117Oooo0oo = c0117OooO0O0.f5117Oooo0oo;
            this.f5107Oooo = c0117OooO0O0.f5107Oooo;
            this.f5120OoooO00 = c0117OooO0O0.f5120OoooO00;
            this.f5119OoooO0 = c0117OooO0O0.f5119OoooO0;
            this.f5121OoooO0O = c0117OooO0O0.f5121OoooO0O;
            this.f5118OoooO = c0117OooO0O0.f5118OoooO;
            this.f5122OoooOO0 = c0117OooO0O0.f5122OoooOO0;
            this.f5137o000oOoO = c0117OooO0O0.f5137o000oOoO;
            this.f5123OoooOOO = c0117OooO0O0.f5123OoooOOO;
            this.f5124OoooOOo = c0117OooO0O0.f5124OoooOOo;
            this.f5125OoooOo0 = c0117OooO0O0.f5125OoooOo0;
            this.f5126OoooOoO = c0117OooO0O0.f5126OoooOoO;
            this.f5127OoooOoo = c0117OooO0O0.f5127OoooOoo;
            this.f5128Ooooo00 = c0117OooO0O0.f5128Ooooo00;
            this.f5129Ooooo0o = c0117OooO0O0.f5129Ooooo0o;
            this.f5130OooooO0 = c0117OooO0O0.f5130OooooO0;
            this.f5131OooooOO = c0117OooO0O0.f5131OooooOO;
            this.f5132OooooOo = c0117OooO0O0.f5132OooooOo;
            this.f5134Oooooo0 = c0117OooO0O0.f5134Oooooo0;
            this.f5133Oooooo = c0117OooO0O0.f5133Oooooo;
            this.f5135OoooooO = c0117OooO0O0.f5135OoooooO;
            this.f5143ooOO = c0117OooO0O0.f5143ooOO;
            int[] iArr = c0117OooO0O0.f5136Ooooooo;
            if (iArr == null || c0117OooO0O0.f5142o0OoOo0 != null) {
                this.f5136Ooooooo = null;
            } else {
                this.f5136Ooooooo = Arrays.copyOf(iArr, iArr.length);
            }
            this.f5142o0OoOo0 = c0117OooO0O0.f5142o0OoOo0;
            this.f5138o00O0O = c0117OooO0O0.f5138o00O0O;
            this.f5139o00Oo0 = c0117OooO0O0.f5139o00Oo0;
            this.f5140o00Ooo = c0117OooO0O0.f5140o00Ooo;
            this.f5141o00o0O = c0117OooO0O0.f5141o00o0O;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.Layout);
            this.f5078OooO0O0 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f5075o00ooo;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.f5093OooOOo0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5093OooOOo0);
                        break;
                    case 2:
                        this.f5112Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5112Oooo0O0);
                        break;
                    case 3:
                        this.f5091OooOOOo = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5091OooOOOo);
                        break;
                    case 4:
                        this.f5090OooOOOO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5090OooOOOO);
                        break;
                    case 5:
                        this.f5100OooOoO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f5105OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5105OooOooO);
                        break;
                    case 7:
                        this.f5106OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5106OooOooo);
                        break;
                    case 8:
                        this.f5113Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5113Oooo0OO);
                        break;
                    case 9:
                        this.f5099OooOo0o = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5099OooOo0o);
                        break;
                    case 10:
                        this.f5098OooOo0O = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5098OooOo0O);
                        break;
                    case 11:
                        this.f5120OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5120OoooO00);
                        break;
                    case 12:
                        this.f5119OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5119OoooO0);
                        break;
                    case 13:
                        this.f5116Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5116Oooo0oO);
                        break;
                    case 14:
                        this.f5107Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5107Oooo);
                        break;
                    case 15:
                        this.f5121OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5121OoooO0O);
                        break;
                    case 16:
                        this.f5117Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5117Oooo0oo);
                        break;
                    case 17:
                        this.f5082OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5082OooO0o0);
                        break;
                    case 18:
                        this.f5081OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5081OooO0o);
                        break;
                    case 19:
                        this.f5083OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f5083OooO0oO);
                        break;
                    case 20:
                        this.f5095OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f5095OooOo);
                        break;
                    case 21:
                        this.f5080OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5080OooO0Oo);
                        break;
                    case 22:
                        this.f5079OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5079OooO0OO);
                        break;
                    case 23:
                        this.f5110Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5110Oooo00O);
                        break;
                    case 24:
                        this.f5076OooO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5076OooO);
                        break;
                    case 25:
                        this.f5085OooOO0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5085OooOO0);
                        break;
                    case 26:
                        this.f5109Oooo000 = typedArrayObtainStyledAttributes.getInt(index, this.f5109Oooo000);
                        break;
                    case 27:
                        this.f5111Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5111Oooo00o);
                        break;
                    case 28:
                        this.f5086OooOO0O = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5086OooOO0O);
                        break;
                    case 29:
                        this.f5087OooOO0o = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5087OooOO0o);
                        break;
                    case 30:
                        this.f5115Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5115Oooo0o0);
                        break;
                    case 31:
                        this.f5097OooOo00 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5097OooOo00);
                        break;
                    case 32:
                        this.f5096OooOo0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5096OooOo0);
                        break;
                    case 33:
                        this.f5108Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5108Oooo0);
                        break;
                    case 34:
                        this.f5088OooOOO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5088OooOOO);
                        break;
                    case 35:
                        this.f5089OooOOO0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5089OooOOO0);
                        break;
                    case 36:
                        this.f5101OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5101OooOoO0);
                        break;
                    case 37:
                        this.f5137o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f5137o000oOoO);
                        break;
                    case 38:
                        this.f5122OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5122OoooOO0);
                        break;
                    case 39:
                        this.f5123OoooOOO = typedArrayObtainStyledAttributes.getInt(index, this.f5123OoooOOO);
                        break;
                    case 40:
                        this.f5124OoooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f5124OoooOOo);
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
                                this.f5102OooOoOO = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5102OooOoOO);
                                break;
                            case 62:
                                this.f5104OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5104OooOoo0);
                                break;
                            case 63:
                                this.f5103OooOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f5103OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f5131OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f5132OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f5134Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, this.f5134Oooooo0);
                                        break;
                                    case 73:
                                        this.f5133Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5133Oooooo);
                                        break;
                                    case 74:
                                        this.f5142o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f5140o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, this.f5140o00Ooo);
                                        break;
                                    case 76:
                                        this.f5141o00o0O = typedArrayObtainStyledAttributes.getInt(index, this.f5141o00o0O);
                                        break;
                                    case 77:
                                        this.f5092OooOOo = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5092OooOOo);
                                        break;
                                    case 78:
                                        this.f5094OooOOoo = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5094OooOOoo);
                                        break;
                                    case 79:
                                        this.f5118OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5118OoooO);
                                        break;
                                    case 80:
                                        this.f5114Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5114Oooo0o);
                                        break;
                                    case 81:
                                        this.f5125OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, this.f5125OoooOo0);
                                        break;
                                    case 82:
                                        this.f5126OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f5126OoooOoO);
                                        break;
                                    case 83:
                                        this.f5128Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5128Ooooo00);
                                        break;
                                    case 84:
                                        this.f5127OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5127OoooOoo);
                                        break;
                                    case 85:
                                        this.f5130OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5130OooooO0);
                                        break;
                                    case 86:
                                        this.f5129Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5129Ooooo0o);
                                        break;
                                    case 87:
                                        this.f5138o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, this.f5138o00O0O);
                                        break;
                                    case 88:
                                        this.f5139o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5139o00Oo0);
                                        break;
                                    case 89:
                                        this.f5143ooOO = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f5084OooO0oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f5084OooO0oo);
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
        public static final SparseIntArray f5144OooOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5146OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5147OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5148OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f5149OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f5151OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5150OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f5152OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f5153OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f5145OooO = Float.NaN;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f5154OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f5155OooOO0O = null;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f5156OooOO0o = -3;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f5157OooOOO0 = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5144OooOOO = sparseIntArray;
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
            this.f5146OooO00o = oooO0OO.f5146OooO00o;
            this.f5147OooO0O0 = oooO0OO.f5147OooO0O0;
            this.f5149OooO0Oo = oooO0OO.f5149OooO0Oo;
            this.f5151OooO0o0 = oooO0OO.f5151OooO0o0;
            this.f5150OooO0o = oooO0OO.f5150OooO0o;
            this.f5153OooO0oo = oooO0OO.f5153OooO0oo;
            this.f5152OooO0oO = oooO0OO.f5152OooO0oO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.Motion);
            this.f5146OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f5144OooOOO.get(index)) {
                    case 1:
                        this.f5153OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5153OooO0oo);
                        break;
                    case 2:
                        this.f5151OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f5151OooO0o0);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f5149OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f5149OooO0Oo = Oooo0.f45280OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f5150OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f5147OooO0O0 = OooO0O0.OooOO0o(typedArrayObtainStyledAttributes, index, this.f5147OooO0O0);
                        break;
                    case 6:
                        this.f5148OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, this.f5148OooO0OO);
                        break;
                    case 7:
                        this.f5152OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f5152OooO0oO);
                        break;
                    case 8:
                        this.f5154OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, this.f5154OooOO0);
                        break;
                    case 9:
                        this.f5145OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f5145OooO);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f5157OooOOO0 = resourceId;
                            if (resourceId != -1) {
                                this.f5156OooOO0o = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f5155OooOO0O = string;
                            if (string.indexOf("/") > 0) {
                                this.f5157OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f5156OooOO0o = -2;
                            } else {
                                this.f5156OooOO0o = -1;
                            }
                        } else {
                            this.f5156OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, this.f5157OooOOO0);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5158OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5159OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5160OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f5161OooO0Oo = 1.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f5162OooO0o0 = Float.NaN;

        public final void OooO00o(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.PropertySet);
            this.f5158OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.OooO.PropertySet_android_alpha) {
                    this.f5161OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5161OooO0Oo);
                } else if (index == androidx.constraintlayout.widget.OooO.PropertySet_android_visibility) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f5159OooO0O0);
                    this.f5159OooO0O0 = i2;
                    this.f5159OooO0O0 = OooO0O0.f5032OooO0oO[i2];
                } else if (index == androidx.constraintlayout.widget.OooO.PropertySet_visibilityMode) {
                    this.f5160OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f5160OooO0OO);
                } else if (index == androidx.constraintlayout.widget.OooO.PropertySet_motionProgress) {
                    this.f5162OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5162OooO0o0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5033OooO0oo = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5031OooO = sparseIntArray2;
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
                C0117OooO0O0 c0117OooO0O0 = oooO00o.f5060OooO0o0;
                if (i < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    int i2 = androidx.constraintlayout.widget.OooO.Constraint_android_id;
                    OooO0o oooO0o = oooO00o.f5057OooO0OO;
                    OooO oooO = oooO00o.f5059OooO0o;
                    OooO0OO oooO0OO = oooO00o.f5058OooO0Oo;
                    if (index != i2 && androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginStart != index && androidx.constraintlayout.widget.OooO.Constraint_android_layout_marginEnd != index) {
                        oooO0OO.f5146OooO00o = true;
                        c0117OooO0O0.f5078OooO0O0 = true;
                        oooO0o.f5158OooO00o = true;
                        oooO.f5042OooO00o = true;
                    }
                    SparseIntArray sparseIntArray = f5033OooO0oo;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            c0117OooO0O0.f5093OooOOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5093OooOOo0);
                            break;
                        case 2:
                            c0117OooO0O0.f5112Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5112Oooo0O0);
                            break;
                        case 3:
                            c0117OooO0O0.f5091OooOOOo = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5091OooOOOo);
                            break;
                        case 4:
                            c0117OooO0O0.f5090OooOOOO = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5090OooOOOO);
                            break;
                        case 5:
                            c0117OooO0O0.f5100OooOoO = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            c0117OooO0O0.f5105OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0117OooO0O0.f5105OooOooO);
                            break;
                        case 7:
                            c0117OooO0O0.f5106OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0117OooO0O0.f5106OooOooo);
                            break;
                        case 8:
                            c0117OooO0O0.f5113Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5113Oooo0OO);
                            break;
                        case 9:
                            c0117OooO0O0.f5099OooOo0o = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5099OooOo0o);
                            break;
                        case 10:
                            c0117OooO0O0.f5098OooOo0O = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5098OooOo0O);
                            break;
                        case 11:
                            c0117OooO0O0.f5120OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5120OoooO00);
                            break;
                        case 12:
                            c0117OooO0O0.f5119OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5119OoooO0);
                            break;
                        case 13:
                            c0117OooO0O0.f5116Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5116Oooo0oO);
                            break;
                        case 14:
                            c0117OooO0O0.f5107Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5107Oooo);
                            break;
                        case 15:
                            c0117OooO0O0.f5121OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5121OoooO0O);
                            break;
                        case 16:
                            c0117OooO0O0.f5117Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5117Oooo0oo);
                            break;
                        case 17:
                            c0117OooO0O0.f5082OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0117OooO0O0.f5082OooO0o0);
                            break;
                        case 18:
                            c0117OooO0O0.f5081OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0117OooO0O0.f5081OooO0o);
                            break;
                        case 19:
                            c0117OooO0O0.f5083OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, c0117OooO0O0.f5083OooO0oO);
                            break;
                        case 20:
                            c0117OooO0O0.f5095OooOo = typedArrayObtainStyledAttributes.getFloat(index, c0117OooO0O0.f5095OooOo);
                            break;
                        case 21:
                            c0117OooO0O0.f5080OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0117OooO0O0.f5080OooO0Oo);
                            break;
                        case 22:
                            oooO0o.f5159OooO0O0 = f5032OooO0oO[typedArrayObtainStyledAttributes.getInt(index, oooO0o.f5159OooO0O0)];
                            break;
                        case 23:
                            c0117OooO0O0.f5079OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0117OooO0O0.f5079OooO0OO);
                            break;
                        case 24:
                            c0117OooO0O0.f5110Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5110Oooo00O);
                            break;
                        case 25:
                            c0117OooO0O0.f5076OooO = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5076OooO);
                            break;
                        case 26:
                            c0117OooO0O0.f5085OooOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5085OooOO0);
                            break;
                        case 27:
                            c0117OooO0O0.f5109Oooo000 = typedArrayObtainStyledAttributes.getInt(index, c0117OooO0O0.f5109Oooo000);
                            break;
                        case 28:
                            c0117OooO0O0.f5111Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5111Oooo00o);
                            break;
                        case 29:
                            c0117OooO0O0.f5086OooOO0O = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5086OooOO0O);
                            break;
                        case 30:
                            c0117OooO0O0.f5087OooOO0o = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5087OooOO0o);
                            break;
                        case 31:
                            c0117OooO0O0.f5115Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5115Oooo0o0);
                            break;
                        case 32:
                            c0117OooO0O0.f5097OooOo00 = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5097OooOo00);
                            break;
                        case 33:
                            c0117OooO0O0.f5096OooOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5096OooOo0);
                            break;
                        case 34:
                            c0117OooO0O0.f5108Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5108Oooo0);
                            break;
                        case 35:
                            c0117OooO0O0.f5088OooOOO = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5088OooOOO);
                            break;
                        case 36:
                            c0117OooO0O0.f5089OooOOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5089OooOOO0);
                            break;
                        case 37:
                            c0117OooO0O0.f5101OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, c0117OooO0O0.f5101OooOoO0);
                            break;
                        case 38:
                            oooO00o.f5055OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, oooO00o.f5055OooO00o);
                            break;
                        case 39:
                            c0117OooO0O0.f5137o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, c0117OooO0O0.f5137o000oOoO);
                            break;
                        case 40:
                            c0117OooO0O0.f5122OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, c0117OooO0O0.f5122OoooOO0);
                            break;
                        case 41:
                            c0117OooO0O0.f5123OoooOOO = typedArrayObtainStyledAttributes.getInt(index, c0117OooO0O0.f5123OoooOOO);
                            break;
                        case 42:
                            c0117OooO0O0.f5124OoooOOo = typedArrayObtainStyledAttributes.getInt(index, c0117OooO0O0.f5124OoooOOo);
                            break;
                        case 43:
                            oooO0o.f5161OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0o.f5161OooO0Oo);
                            break;
                        case 44:
                            oooO.f5054OooOOO0 = true;
                            oooO.f5053OooOOO = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5053OooOOO);
                            break;
                        case 45:
                            oooO.f5044OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5044OooO0OO);
                            break;
                        case 46:
                            oooO.f5045OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5045OooO0Oo);
                            break;
                        case 47:
                            oooO.f5047OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5047OooO0o0);
                            break;
                        case 48:
                            oooO.f5046OooO0o = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5046OooO0o);
                            break;
                        case 49:
                            oooO.f5048OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5048OooO0oO);
                            break;
                        case 50:
                            oooO.f5049OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5049OooO0oo);
                            break;
                        case 51:
                            oooO.f5050OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5050OooOO0);
                            break;
                        case 52:
                            oooO.f5051OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5051OooOO0O);
                            break;
                        case 53:
                            oooO.f5052OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, oooO.f5052OooOO0o);
                            break;
                        case 54:
                            c0117OooO0O0.f5125OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, c0117OooO0O0.f5125OoooOo0);
                            break;
                        case 55:
                            c0117OooO0O0.f5126OoooOoO = typedArrayObtainStyledAttributes.getInt(index, c0117OooO0O0.f5126OoooOoO);
                            break;
                        case 56:
                            c0117OooO0O0.f5127OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5127OoooOoo);
                            break;
                        case 57:
                            c0117OooO0O0.f5128Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5128Ooooo00);
                            break;
                        case 58:
                            c0117OooO0O0.f5129Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5129Ooooo0o);
                            break;
                        case 59:
                            c0117OooO0O0.f5130OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5130OooooO0);
                            break;
                        case 60:
                            oooO.f5043OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, oooO.f5043OooO0O0);
                            break;
                        case 61:
                            c0117OooO0O0.f5102OooOoOO = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5102OooOoOO);
                            break;
                        case 62:
                            c0117OooO0O0.f5104OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5104OooOoo0);
                            break;
                        case 63:
                            c0117OooO0O0.f5103OooOoo = typedArrayObtainStyledAttributes.getFloat(index, c0117OooO0O0.f5103OooOoo);
                            break;
                        case 64:
                            oooO0OO.f5147OooO0O0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0OO.f5147OooO0O0);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                oooO0OO.f5149OooO0Oo = Oooo0.f45280OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                oooO0OO.f5149OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            oooO0OO.f5150OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            oooO0OO.f5153OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO.f5153OooO0oo);
                            break;
                        case 68:
                            oooO0o.f5162OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0o.f5162OooO0o0);
                            break;
                        case 69:
                            c0117OooO0O0.f5131OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            c0117OooO0O0.f5132OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            c0117OooO0O0.f5134Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, c0117OooO0O0.f5134Oooooo0);
                            break;
                        case 73:
                            c0117OooO0O0.f5133Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5133Oooooo);
                            break;
                        case 74:
                            c0117OooO0O0.f5142o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            c0117OooO0O0.f5140o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, c0117OooO0O0.f5140o00Ooo);
                            break;
                        case 76:
                            oooO0OO.f5151OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, oooO0OO.f5151OooO0o0);
                            break;
                        case 77:
                            c0117OooO0O0.f5143ooOO = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            oooO0o.f5160OooO0OO = typedArrayObtainStyledAttributes.getInt(index, oooO0o.f5160OooO0OO);
                            break;
                        case 79:
                            oooO0OO.f5152OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO.f5152OooO0oO);
                            break;
                        case 80:
                            c0117OooO0O0.f5138o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, c0117OooO0O0.f5138o00O0O);
                            break;
                        case 81:
                            c0117OooO0O0.f5139o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, c0117OooO0O0.f5139o00Oo0);
                            break;
                        case 82:
                            oooO0OO.f5148OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO.f5148OooO0OO);
                            break;
                        case 83:
                            oooO.f5041OooO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO.f5041OooO);
                            break;
                        case 84:
                            oooO0OO.f5154OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO.f5154OooOO0);
                            break;
                        case 85:
                            oooO0OO.f5145OooO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO.f5145OooO);
                            break;
                        case 86:
                            int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i3 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                oooO0OO.f5157OooOOO0 = resourceId;
                                if (resourceId != -1) {
                                    oooO0OO.f5156OooOO0o = -2;
                                }
                            } else if (i3 != 3) {
                                oooO0OO.f5156OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO.f5157OooOOO0);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                oooO0OO.f5155OooOO0O = string;
                                if (string.indexOf("/") <= 0) {
                                    oooO0OO.f5156OooOO0o = -1;
                                } else {
                                    oooO0OO.f5157OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    oooO0OO.f5156OooOO0o = -2;
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
                            c0117OooO0O0.f5092OooOOo = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5092OooOOo);
                            break;
                        case 92:
                            c0117OooO0O0.f5094OooOOoo = OooOO0o(typedArrayObtainStyledAttributes, index, c0117OooO0O0.f5094OooOOoo);
                            break;
                        case 93:
                            c0117OooO0O0.f5114Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5114Oooo0o);
                            break;
                        case 94:
                            c0117OooO0O0.f5118OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0117OooO0O0.f5118OoooO);
                            break;
                        case 95:
                            OooOOO0(c0117OooO0O0, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            OooOOO0(c0117OooO0O0, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            c0117OooO0O0.f5141o00o0O = typedArrayObtainStyledAttributes.getInt(index, c0117OooO0O0.f5141o00o0O);
                            break;
                    }
                    i++;
                } else if (c0117OooO0O0.f5142o0OoOo0 != null) {
                    c0117OooO0O0.f5136Ooooooo = null;
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
        layoutParams.f4956Oooo00O = str;
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
        OooO00o.C0116OooO00o c0116OooO00o;
        C0117OooO0O0 c0117OooO0O0;
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
                        layoutParams.f4969OoooOOO = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                        layoutParams.f4970OoooOOo = z;
                        return;
                    }
                }
                if (obj instanceof C0117OooO0O0) {
                    c0117OooO0O0 = (C0117OooO0O0) obj;
                    if (i2 == 0) {
                        c0117OooO0O0.f5079OooO0OO = i4;
                        c0117OooO0O0.f5138o00O0O = z;
                        return;
                    } else {
                        c0117OooO0O0.f5080OooO0Oo = i4;
                        c0117OooO0O0.f5139o00Oo0 = z;
                        return;
                    }
                }
                if (obj instanceof OooO00o.C0116OooO00o) {
                    c0116OooO00o = (OooO00o.C0116OooO00o) obj;
                    if (i2 == 0) {
                        c0116OooO00o.OooO0O0(23, i4);
                        c0116OooO00o.OooO0Oo(80, z);
                        return;
                    } else {
                        c0116OooO00o.OooO0O0(21, i4);
                        c0116OooO00o.OooO0Oo(81, z);
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
                    layoutParams.f4969OoooOOO = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.f4970OoooOOo = z;
                    return;
                }
            }
            if (obj instanceof C0117OooO0O0) {
                c0117OooO0O0 = (C0117OooO0O0) obj;
                if (i2 == 0) {
                    c0117OooO0O0.f5079OooO0OO = i4;
                    c0117OooO0O0.f5138o00O0O = z;
                    return;
                } else {
                    c0117OooO0O0.f5080OooO0Oo = i4;
                    c0117OooO0O0.f5139o00Oo0 = z;
                    return;
                }
            }
            if (obj instanceof OooO00o.C0116OooO00o) {
                c0116OooO00o = (OooO00o.C0116OooO00o) obj;
                if (i2 == 0) {
                    c0116OooO00o.OooO0O0(23, i4);
                    c0116OooO00o.OooO0Oo(80, z);
                    return;
                } else {
                    c0116OooO00o.OooO0O0(21, i4);
                    c0116OooO00o.OooO0Oo(81, z);
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
                if (obj instanceof C0117OooO0O0) {
                    ((C0117OooO0O0) obj).f5100OooOoO = strTrim2;
                    return;
                } else {
                    if (obj instanceof OooO00o.C0116OooO00o) {
                        ((OooO00o.C0116OooO00o) obj).OooO0OO(5, strTrim2);
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
                            layoutParams3.f4957Oooo00o = f;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f4954Oooo0 = f;
                        }
                    } else if (obj instanceof C0117OooO0O0) {
                        C0117OooO0O0 c0117OooO0O1 = (C0117OooO0O0) obj;
                        if (i2 == 0) {
                            c0117OooO0O1.f5079OooO0OO = 0;
                            c0117OooO0O1.f5137o000oOoO = f;
                        } else {
                            c0117OooO0O1.f5080OooO0Oo = 0;
                            c0117OooO0O1.f5122OoooOO0 = f;
                        }
                    } else if (obj instanceof OooO00o.C0116OooO00o) {
                        OooO00o.C0116OooO00o c0116OooO00o2 = (OooO00o.C0116OooO00o) obj;
                        if (i2 == 0) {
                            c0116OooO00o2.OooO0O0(23, 0);
                            c0116OooO00o2.OooO00o(f, 39);
                        } else {
                            c0116OooO00o2.OooO0O0(21, 0);
                            c0116OooO00o2.OooO00o(f, 40);
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
                            layoutParams4.f4965OoooO0 = fMax;
                            layoutParams4.f4961Oooo0o0 = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.f4967OoooO0O = fMax;
                            layoutParams4.f4960Oooo0o = 2;
                        }
                    } else if (obj instanceof C0117OooO0O0) {
                        C0117OooO0O0 c0117OooO0O2 = (C0117OooO0O0) obj;
                        if (i2 == 0) {
                            c0117OooO0O2.f5079OooO0OO = 0;
                            c0117OooO0O2.f5131OooooOO = fMax;
                            c0117OooO0O2.f5125OoooOo0 = 2;
                        } else {
                            c0117OooO0O2.f5080OooO0Oo = 0;
                            c0117OooO0O2.f5132OooooOo = fMax;
                            c0117OooO0O2.f5126OoooOoO = 2;
                        }
                    } else if (obj instanceof OooO00o.C0116OooO00o) {
                        OooO00o.C0116OooO00o c0116OooO00o3 = (OooO00o.C0116OooO00o) obj;
                        if (i2 == 0) {
                            c0116OooO00o3.OooO0O0(23, 0);
                            c0116OooO00o3.OooO0O0(54, 2);
                        } else {
                            c0116OooO00o3.OooO0O0(21, 0);
                            c0116OooO00o3.OooO0O0(55, 2);
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
        OooO00o.C0116OooO00o c0116OooO00o = new OooO00o.C0116OooO00o();
        oooO00o.f5062OooO0oo = c0116OooO00o;
        OooO0OO oooO0OO = oooO00o.f5058OooO0Oo;
        oooO0OO.f5146OooO00o = false;
        C0117OooO0O0 c0117OooO0O0 = oooO00o.f5060OooO0o0;
        c0117OooO0O0.f5078OooO0O0 = false;
        OooO0o oooO0o = oooO00o.f5057OooO0OO;
        oooO0o.f5158OooO00o = false;
        OooO oooO = oooO00o.f5059OooO0o;
        oooO.f5042OooO00o = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f5031OooO.get(index);
            SparseIntArray sparseIntArray = f5033OooO0oo;
            switch (i2) {
                case 2:
                    z = false;
                    c0116OooO00o.OooO0O0(2, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5112Oooo0O0));
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
                    c0116OooO00o.OooO0OO(5, typedArray.getString(index));
                    continue;
                    break;
                case 6:
                    z = false;
                    c0116OooO00o.OooO0O0(6, typedArray.getDimensionPixelOffset(index, c0117OooO0O0.f5105OooOooO));
                    continue;
                    break;
                case 7:
                    z = false;
                    c0116OooO00o.OooO0O0(7, typedArray.getDimensionPixelOffset(index, c0117OooO0O0.f5106OooOooo));
                    continue;
                    break;
                case 8:
                    z = false;
                    c0116OooO00o.OooO0O0(8, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5113Oooo0OO));
                    continue;
                    break;
                case 11:
                    z = false;
                    c0116OooO00o.OooO0O0(11, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5120OoooO00));
                    continue;
                    break;
                case 12:
                    z = false;
                    c0116OooO00o.OooO0O0(12, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5119OoooO0));
                    continue;
                    break;
                case 13:
                    z = false;
                    c0116OooO00o.OooO0O0(13, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5116Oooo0oO));
                    continue;
                    break;
                case 14:
                    z = false;
                    c0116OooO00o.OooO0O0(14, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5107Oooo));
                    continue;
                    break;
                case 15:
                    z = false;
                    c0116OooO00o.OooO0O0(15, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5121OoooO0O));
                    continue;
                    break;
                case 16:
                    z = false;
                    c0116OooO00o.OooO0O0(16, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5117Oooo0oo));
                    continue;
                    break;
                case 17:
                    z = false;
                    c0116OooO00o.OooO0O0(17, typedArray.getDimensionPixelOffset(index, c0117OooO0O0.f5082OooO0o0));
                    continue;
                    break;
                case 18:
                    z = false;
                    c0116OooO00o.OooO0O0(18, typedArray.getDimensionPixelOffset(index, c0117OooO0O0.f5081OooO0o));
                    continue;
                    break;
                case 19:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, c0117OooO0O0.f5083OooO0oO), 19);
                    continue;
                    break;
                case 20:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, c0117OooO0O0.f5095OooOo), 20);
                    continue;
                    break;
                case 21:
                    z = false;
                    c0116OooO00o.OooO0O0(21, typedArray.getLayoutDimension(index, c0117OooO0O0.f5080OooO0Oo));
                    continue;
                    break;
                case 22:
                    z = false;
                    c0116OooO00o.OooO0O0(22, f5032OooO0oO[typedArray.getInt(index, oooO0o.f5159OooO0O0)]);
                    continue;
                    break;
                case 23:
                    z = false;
                    c0116OooO00o.OooO0O0(23, typedArray.getLayoutDimension(index, c0117OooO0O0.f5079OooO0OO));
                    continue;
                    break;
                case 24:
                    z = false;
                    c0116OooO00o.OooO0O0(24, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5110Oooo00O));
                    continue;
                    break;
                case 27:
                    z = false;
                    c0116OooO00o.OooO0O0(27, typedArray.getInt(index, c0117OooO0O0.f5109Oooo000));
                    continue;
                    break;
                case 28:
                    z = false;
                    c0116OooO00o.OooO0O0(28, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5111Oooo00o));
                    continue;
                    break;
                case 31:
                    z = false;
                    c0116OooO00o.OooO0O0(31, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5115Oooo0o0));
                    continue;
                    break;
                case 34:
                    z = false;
                    c0116OooO00o.OooO0O0(34, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5108Oooo0));
                    continue;
                    break;
                case 37:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, c0117OooO0O0.f5101OooOoO0), 37);
                    continue;
                    break;
                case 38:
                    z = false;
                    int resourceId = typedArray.getResourceId(index, oooO00o.f5055OooO00o);
                    oooO00o.f5055OooO00o = resourceId;
                    c0116OooO00o.OooO0O0(38, resourceId);
                    continue;
                    break;
                case 39:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, c0117OooO0O0.f5137o000oOoO), 39);
                    continue;
                    break;
                case 40:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, c0117OooO0O0.f5122OoooOO0), 40);
                    continue;
                    break;
                case 41:
                    z = false;
                    c0116OooO00o.OooO0O0(41, typedArray.getInt(index, c0117OooO0O0.f5123OoooOOO));
                    continue;
                    break;
                case 42:
                    z = false;
                    c0116OooO00o.OooO0O0(42, typedArray.getInt(index, c0117OooO0O0.f5124OoooOOo));
                    continue;
                    break;
                case 43:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO0o.f5161OooO0Oo), 43);
                    continue;
                    break;
                case 44:
                    z = false;
                    c0116OooO00o.OooO0Oo(44, true);
                    c0116OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5053OooOOO), 44);
                    continue;
                    break;
                case 45:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5044OooO0OO), 45);
                    continue;
                    break;
                case 46:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5045OooO0Oo), 46);
                    continue;
                    break;
                case 47:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5047OooO0o0), 47);
                    continue;
                    break;
                case 48:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5046OooO0o), 48);
                    continue;
                    break;
                case 49:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5048OooO0oO), 49);
                    continue;
                    break;
                case 50:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5049OooO0oo), 50);
                    continue;
                    break;
                case 51:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5050OooOO0), 51);
                    continue;
                    break;
                case 52:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5051OooOO0O), 52);
                    continue;
                    break;
                case 53:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getDimension(index, oooO.f5052OooOO0o), 53);
                    continue;
                    break;
                case 54:
                    z = false;
                    c0116OooO00o.OooO0O0(54, typedArray.getInt(index, c0117OooO0O0.f5125OoooOo0));
                    continue;
                    break;
                case 55:
                    z = false;
                    c0116OooO00o.OooO0O0(55, typedArray.getInt(index, c0117OooO0O0.f5126OoooOoO));
                    continue;
                    break;
                case 56:
                    z = false;
                    c0116OooO00o.OooO0O0(56, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5127OoooOoo));
                    continue;
                    break;
                case 57:
                    z = false;
                    c0116OooO00o.OooO0O0(57, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5128Ooooo00));
                    continue;
                    break;
                case 58:
                    z = false;
                    c0116OooO00o.OooO0O0(58, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5129Ooooo0o));
                    continue;
                    break;
                case 59:
                    z = false;
                    c0116OooO00o.OooO0O0(59, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5130OooooO0));
                    continue;
                    break;
                case 60:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO.f5043OooO0O0), 60);
                    continue;
                    break;
                case 62:
                    z = false;
                    c0116OooO00o.OooO0O0(62, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5104OooOoo0));
                    continue;
                    break;
                case 63:
                    z = false;
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, c0117OooO0O0.f5103OooOoo), 63);
                    continue;
                    break;
                case 64:
                    z = false;
                    c0116OooO00o.OooO0O0(64, OooOO0o(typedArray, index, oooO0OO.f5147OooO0O0));
                    continue;
                    break;
                case 65:
                    z = false;
                    if (typedArray.peekValue(index).type == 3) {
                        c0116OooO00o.OooO0OO(65, typedArray.getString(index));
                        continue;
                    } else {
                        c0116OooO00o.OooO0OO(65, Oooo0.f45280OooO0OO[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    z = false;
                    c0116OooO00o.OooO0O0(66, typedArray.getInt(index, 0));
                    continue;
                    break;
                case 67:
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO0OO.f5153OooO0oo), 67);
                    break;
                case 68:
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO0o.f5162OooO0o0), 68);
                    break;
                case 69:
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, 1.0f), 69);
                    break;
                case 70:
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, 1.0f), 70);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0116OooO00o.OooO0O0(72, typedArray.getInt(index, c0117OooO0O0.f5134Oooooo0));
                    break;
                case 73:
                    c0116OooO00o.OooO0O0(73, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5133Oooooo));
                    break;
                case 74:
                    c0116OooO00o.OooO0OO(74, typedArray.getString(index));
                    break;
                case 75:
                    c0116OooO00o.OooO0Oo(75, typedArray.getBoolean(index, c0117OooO0O0.f5140o00Ooo));
                    break;
                case 76:
                    c0116OooO00o.OooO0O0(76, typedArray.getInt(index, oooO0OO.f5151OooO0o0));
                    break;
                case 77:
                    c0116OooO00o.OooO0OO(77, typedArray.getString(index));
                    break;
                case 78:
                    c0116OooO00o.OooO0O0(78, typedArray.getInt(index, oooO0o.f5160OooO0OO));
                    break;
                case 79:
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO0OO.f5152OooO0oO), 79);
                    break;
                case 80:
                    c0116OooO00o.OooO0Oo(80, typedArray.getBoolean(index, c0117OooO0O0.f5138o00O0O));
                    break;
                case 81:
                    c0116OooO00o.OooO0Oo(81, typedArray.getBoolean(index, c0117OooO0O0.f5139o00Oo0));
                    break;
                case 82:
                    c0116OooO00o.OooO0O0(82, typedArray.getInteger(index, oooO0OO.f5148OooO0OO));
                    break;
                case 83:
                    c0116OooO00o.OooO0O0(83, OooOO0o(typedArray, index, oooO.f5041OooO));
                    break;
                case 84:
                    c0116OooO00o.OooO0O0(84, typedArray.getInteger(index, oooO0OO.f5154OooOO0));
                    break;
                case 85:
                    c0116OooO00o.OooO00o(typedArray.getFloat(index, oooO0OO.f5145OooO), 85);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        oooO0OO.f5157OooOOO0 = resourceId2;
                        c0116OooO00o.OooO0O0(89, resourceId2);
                        if (oooO0OO.f5157OooOOO0 != -1) {
                            oooO0OO.f5156OooOO0o = -2;
                            c0116OooO00o.OooO0O0(88, -2);
                        }
                    } else if (i3 == 3) {
                        String string = typedArray.getString(index);
                        oooO0OO.f5155OooOO0O = string;
                        c0116OooO00o.OooO0OO(90, string);
                        if (oooO0OO.f5155OooOO0O.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            oooO0OO.f5157OooOOO0 = resourceId3;
                            c0116OooO00o.OooO0O0(89, resourceId3);
                            oooO0OO.f5156OooOO0o = -2;
                            c0116OooO00o.OooO0O0(88, -2);
                        } else {
                            oooO0OO.f5156OooOO0o = -1;
                            c0116OooO00o.OooO0O0(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, oooO0OO.f5157OooOOO0);
                        oooO0OO.f5156OooOO0o = integer;
                        c0116OooO00o.OooO0O0(88, integer);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    c0116OooO00o.OooO0O0(93, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5114Oooo0o));
                    break;
                case 94:
                    c0116OooO00o.OooO0O0(94, typedArray.getDimensionPixelSize(index, c0117OooO0O0.f5118OoooO));
                    break;
                case 95:
                    OooOOO0(c0116OooO00o, typedArray, index, 0);
                    z = false;
                    continue;
                    break;
                case 96:
                    OooOOO0(c0116OooO00o, typedArray, index, 1);
                    break;
                case 97:
                    c0116OooO00o.OooO0O0(97, typedArray.getInt(index, c0117OooO0O0.f5141o00o0O));
                    break;
                case 98:
                    if (MotionLayout.f4572o00o0O) {
                        int resourceId4 = typedArray.getResourceId(index, oooO00o.f5055OooO00o);
                        oooO00o.f5055OooO00o = resourceId4;
                        if (resourceId4 == -1) {
                            oooO00o.f5056OooO0O0 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        oooO00o.f5056OooO0O0 = typedArray.getString(index);
                    } else {
                        oooO00o.f5055OooO00o = typedArray.getResourceId(index, oooO00o.f5055OooO00o);
                    }
                    break;
                case 99:
                    c0116OooO00o.OooO0Oo(99, typedArray.getBoolean(index, c0117OooO0O0.f5084OooO0oo));
                    break;
            }
            z = false;
        }
    }

    public final OooO00o OooO(int i) {
        HashMap<Integer, OooO00o> map = this.f5038OooO0o;
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
            HashMap<Integer, OooO00o> map = this.f5038OooO0o;
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + o000000O.OooO00o.OooO0Oo(childAt));
            } else {
                if (this.f5039OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (oooO00o = map.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.OooO0o0(childAt, oooO00o.f5061OooO0oO);
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
        HashMap<Integer, OooO00o> map = this.f5038OooO0o;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + o000000O.OooO00o.OooO0Oo(childAt));
            } else {
                if (this.f5039OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        OooO00o oooO00o = map.get(Integer.valueOf(id));
                        if (oooO00o != null) {
                            if (childAt instanceof Barrier) {
                                C0117OooO0O0 c0117OooO0O0 = oooO00o.f5060OooO0o0;
                                c0117OooO0O0.f5135OoooooO = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0117OooO0O0.f5134Oooooo0);
                                barrier.setMargin(c0117OooO0O0.f5133Oooooo);
                                barrier.setAllowsGoneWidget(c0117OooO0O0.f5140o00Ooo);
                                int[] iArr = c0117OooO0O0.f5136Ooooooo;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0117OooO0O0.f5142o0OoOo0;
                                    if (str != null) {
                                        int[] iArrOooO0o = OooO0o(barrier, str);
                                        c0117OooO0O0.f5136Ooooooo = iArrOooO0o;
                                        barrier.setReferencedIds(iArrOooO0o);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.OooO00o();
                            oooO00o.OooO00o(layoutParams);
                            ConstraintAttribute.OooO0o0(childAt, oooO00o.f5061OooO0oO);
                            childAt.setLayoutParams(layoutParams);
                            OooO0o oooO0o = oooO00o.f5057OooO0OO;
                            if (oooO0o.f5160OooO0OO == 0) {
                                childAt.setVisibility(oooO0o.f5159OooO0O0);
                            }
                            childAt.setAlpha(oooO0o.f5161OooO0Oo);
                            OooO oooO = oooO00o.f5059OooO0o;
                            childAt.setRotation(oooO.f5043OooO0O0);
                            childAt.setRotationX(oooO.f5044OooO0OO);
                            childAt.setRotationY(oooO.f5045OooO0Oo);
                            childAt.setScaleX(oooO.f5047OooO0o0);
                            childAt.setScaleY(oooO.f5046OooO0o);
                            if (oooO.f5041OooO != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(oooO.f5041OooO);
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
                                if (!Float.isNaN(oooO.f5048OooO0oO)) {
                                    childAt.setPivotX(oooO.f5048OooO0oO);
                                }
                                if (!Float.isNaN(oooO.f5049OooO0oo)) {
                                    childAt.setPivotY(oooO.f5049OooO0oo);
                                }
                            }
                            childAt.setTranslationX(oooO.f5050OooOO0);
                            childAt.setTranslationY(oooO.f5051OooOO0O);
                            childAt.setTranslationZ(oooO.f5052OooOO0o);
                            if (oooO.f5054OooOOO0) {
                                childAt.setElevation(oooO.f5053OooOOO);
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
                C0117OooO0O0 c0117OooO0O1 = oooO00o2.f5060OooO0o0;
                if (c0117OooO0O1.f5135OoooooO == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0117OooO0O1.f5136Ooooooo;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0117OooO0O1.f5142o0OoOo0;
                        if (str2 != null) {
                            int[] iArrOooO0o2 = OooO0o(barrier2, str2);
                            c0117OooO0O1.f5136Ooooooo = iArrOooO0o2;
                            barrier2.setReferencedIds(iArrOooO0o2);
                        }
                    }
                    barrier2.setType(c0117OooO0O1.f5134Oooooo0);
                    barrier2.setMargin(c0117OooO0O1.f5133Oooooo);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.OooOo00();
                    oooO00o2.OooO00o(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (c0117OooO0O1.f5077OooO00o) {
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
        HashMap<Integer, OooO00o> map = oooO0O0.f5038OooO0o;
        map.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oooO0O0.f5039OooO0o0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new OooO00o());
            }
            OooO00o oooO00o = map.get(Integer.valueOf(id));
            if (oooO00o == null) {
                i = childCount;
            } else {
                HashMap<String, ConstraintAttribute> map2 = oooO0O0.f5037OooO0Oo;
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
                oooO00o.f5061OooO0oO = map3;
                oooO00o.OooO0OO(id, layoutParams);
                int visibility = childAt.getVisibility();
                OooO0o oooO0o = oooO00o.f5057OooO0OO;
                oooO0o.f5159OooO0O0 = visibility;
                oooO0o.f5161OooO0Oo = childAt.getAlpha();
                float rotation = childAt.getRotation();
                OooO oooO = oooO00o.f5059OooO0o;
                oooO.f5043OooO0O0 = rotation;
                oooO.f5044OooO0OO = childAt.getRotationX();
                oooO.f5045OooO0Oo = childAt.getRotationY();
                oooO.f5047OooO0o0 = childAt.getScaleX();
                oooO.f5046OooO0o = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    oooO.f5048OooO0oO = pivotX;
                    oooO.f5049OooO0oo = pivotY;
                }
                oooO.f5050OooOO0 = childAt.getTranslationX();
                oooO.f5051OooOO0O = childAt.getTranslationY();
                oooO.f5052OooOO0o = childAt.getTranslationZ();
                if (oooO.f5054OooOOO0) {
                    oooO.f5053OooOOO = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0117OooO0O0 c0117OooO0O0 = oooO00o.f5060OooO0o0;
                    c0117OooO0O0.f5140o00Ooo = allowsGoneWidget;
                    c0117OooO0O0.f5136Ooooooo = barrier.getReferencedIds();
                    c0117OooO0O0.f5134Oooooo0 = barrier.getType();
                    c0117OooO0O0.f5133Oooooo = barrier.getMargin();
                }
            }
            i3++;
            oooO0O0 = this;
            childCount = i;
        }
    }

    public final OooO00o OooO0oo(int i) {
        HashMap<Integer, OooO00o> map = this.f5038OooO0o;
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
                        oooO00oOooO0oO.f5060OooO0o0.f5077OooO00o = true;
                    }
                    this.f5038OooO0o.put(Integer.valueOf(oooO00oOooO0oO.f5055OooO00o), oooO00oOooO0oO);
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
                            C0117OooO0O0 c0117OooO0O0 = oooO00oOooO0oO.f5060OooO0o0;
                            c0117OooO0O0.f5077OooO00o = true;
                            c0117OooO0O0.f5078OooO0O0 = true;
                            break;
                        case "Barrier":
                            oooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlResourceParser), false);
                            oooO00oOooO0oO.f5060OooO0o0.f5135OoooooO = 1;
                            break;
                        case "PropertySet":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5057OooO0OO.OooO00o(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5059OooO0o.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5060OooO0o0.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00o.f5058OooO0Oo.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (oooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            ConstraintAttribute.OooO0Oo(context, xmlResourceParser, oooO00o.f5061OooO0oO);
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
                        this.f5038OooO0o.put(Integer.valueOf(oooO00o.f5055OooO00o), oooO00o);
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
