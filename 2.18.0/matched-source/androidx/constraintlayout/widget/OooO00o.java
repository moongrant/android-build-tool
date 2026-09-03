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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p057o0000Oo0.o000000O;
import p065o0000oO0.o000O00;
import p065o0000oO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f7609OooO00o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f7607OooO0oO = {0, 4, 8};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static SparseIntArray f7608OooO0oo = new SparseIntArray();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static SparseIntArray f7606OooO = new SparseIntArray();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f7610OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f7611OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f7612OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f7614OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HashMap<Integer, C0043OooO00o> f7613OooO0o = new HashMap<>();

    public static class OooO {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static SparseIntArray f7615OooOOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7617OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f7618OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f7619OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f7620OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f7622OooO0o0 = 1.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f7621OooO0o = 1.0f;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f7623OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f7624OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7616OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f7625OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f7626OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f7627OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f7629OooOOO0 = false;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f7628OooOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7615OooOOOO = sparseIntArray;
            sparseIntArray.append(o000O00.Transform_android_rotation, 1);
            f7615OooOOOO.append(o000O00.Transform_android_rotationX, 2);
            f7615OooOOOO.append(o000O00.Transform_android_rotationY, 3);
            f7615OooOOOO.append(o000O00.Transform_android_scaleX, 4);
            f7615OooOOOO.append(o000O00.Transform_android_scaleY, 5);
            f7615OooOOOO.append(o000O00.Transform_android_transformPivotX, 6);
            f7615OooOOOO.append(o000O00.Transform_android_transformPivotY, 7);
            f7615OooOOOO.append(o000O00.Transform_android_translationX, 8);
            f7615OooOOOO.append(o000O00.Transform_android_translationY, 9);
            f7615OooOOOO.append(o000O00.Transform_android_translationZ, 10);
            f7615OooOOOO.append(o000O00.Transform_android_elevation, 11);
            f7615OooOOOO.append(o000O00.Transform_transformPivotTarget, 12);
        }

        public final void OooO00o(OooO oooO) {
            this.f7617OooO00o = oooO.f7617OooO00o;
            this.f7618OooO0O0 = oooO.f7618OooO0O0;
            this.f7619OooO0OO = oooO.f7619OooO0OO;
            this.f7620OooO0Oo = oooO.f7620OooO0Oo;
            this.f7622OooO0o0 = oooO.f7622OooO0o0;
            this.f7621OooO0o = oooO.f7621OooO0o;
            this.f7623OooO0oO = oooO.f7623OooO0oO;
            this.f7624OooO0oo = oooO.f7624OooO0oo;
            this.f7616OooO = oooO.f7616OooO;
            this.f7625OooOO0 = oooO.f7625OooOO0;
            this.f7626OooOO0O = oooO.f7626OooOO0O;
            this.f7627OooOO0o = oooO.f7627OooOO0o;
            this.f7629OooOOO0 = oooO.f7629OooOOO0;
            this.f7628OooOOO = oooO.f7628OooOOO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.Transform);
            this.f7617OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f7615OooOOOO.get(index)) {
                    case 1:
                        this.f7618OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7618OooO0O0);
                        break;
                    case 2:
                        this.f7619OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f7619OooO0OO);
                        break;
                    case 3:
                        this.f7620OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7620OooO0Oo);
                        break;
                    case 4:
                        this.f7622OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7622OooO0o0);
                        break;
                    case 5:
                        this.f7621OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f7621OooO0o);
                        break;
                    case 6:
                        this.f7623OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f7623OooO0oO);
                        break;
                    case 7:
                        this.f7624OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, this.f7624OooO0oo);
                        break;
                    case 8:
                        this.f7625OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f7625OooOO0);
                        break;
                    case 9:
                        this.f7626OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f7626OooOO0O);
                        break;
                    case 10:
                        this.f7627OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f7627OooOO0o);
                        break;
                    case 11:
                        this.f7629OooOOO0 = true;
                        this.f7628OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f7628OooOOO);
                        break;
                    case 12:
                        this.f7616OooO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7616OooO);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0043OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7630OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f7631OooO0O0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public C0044OooO00o f7637OooO0oo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o f7632OooO0OO = new OooO0o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f7633OooO0Oo = new OooO0OO();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0O0 f7635OooO0o0 = new OooO0O0();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO f7634OooO0o = new OooO();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f7636OooO0oO = new HashMap<>();

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0044OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int[] f7639OooO00o = new int[10];

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int[] f7640OooO0O0 = new int[10];

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f7641OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int[] f7642OooO0Oo = new int[10];

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float[] f7644OooO0o0 = new float[10];

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f7643OooO0o = 0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int[] f7645OooO0oO = new int[5];

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public String[] f7646OooO0oo = new String[5];

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f7638OooO = 0;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public int[] f7647OooOO0 = new int[4];

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public boolean[] f7648OooOO0O = new boolean[4];

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public int f7649OooOO0o = 0;

            public final void OooO00o(int i, float f) {
                int i2 = this.f7643OooO0o;
                int[] iArr = this.f7642OooO0Oo;
                if (i2 >= iArr.length) {
                    this.f7642OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f7644OooO0o0;
                    this.f7644OooO0o0 = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f7642OooO0Oo;
                int i3 = this.f7643OooO0o;
                iArr2[i3] = i;
                float[] fArr2 = this.f7644OooO0o0;
                this.f7643OooO0o = i3 + 1;
                fArr2[i3] = f;
            }

            public final void OooO0O0(int i, int i2) {
                int i3 = this.f7641OooO0OO;
                int[] iArr = this.f7639OooO00o;
                if (i3 >= iArr.length) {
                    this.f7639OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f7640OooO0O0;
                    this.f7640OooO0O0 = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f7639OooO00o;
                int i4 = this.f7641OooO0OO;
                iArr3[i4] = i;
                int[] iArr4 = this.f7640OooO0O0;
                this.f7641OooO0OO = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void OooO0OO(int i, String str) {
                int i2 = this.f7638OooO;
                int[] iArr = this.f7645OooO0oO;
                if (i2 >= iArr.length) {
                    this.f7645OooO0oO = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f7646OooO0oo;
                    this.f7646OooO0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f7645OooO0oO;
                int i3 = this.f7638OooO;
                iArr2[i3] = i;
                String[] strArr2 = this.f7646OooO0oo;
                this.f7638OooO = i3 + 1;
                strArr2[i3] = str;
            }

            public final void OooO0Oo(int i, boolean z) {
                int i2 = this.f7649OooOO0o;
                int[] iArr = this.f7647OooOO0;
                if (i2 >= iArr.length) {
                    this.f7647OooOO0 = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f7648OooOO0O;
                    this.f7648OooOO0O = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f7647OooOO0;
                int i3 = this.f7649OooOO0o;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f7648OooOO0O;
                this.f7649OooOO0o = i3 + 1;
                zArr2[i3] = z;
            }

            public final void OooO0o0(C0043OooO00o c0043OooO00o) {
                for (int i = 0; i < this.f7641OooO0OO; i++) {
                    int i2 = this.f7639OooO00o[i];
                    int i3 = this.f7640OooO0O0[i];
                    int[] iArr = OooO00o.f7607OooO0oO;
                    if (i2 == 6) {
                        c0043OooO00o.f7635OooO0o0.f7680OooOooO = i3;
                    } else if (i2 == 7) {
                        c0043OooO00o.f7635OooO0o0.f7681OooOooo = i3;
                    } else if (i2 == 8) {
                        c0043OooO00o.f7635OooO0o0.f7688Oooo0OO = i3;
                    } else if (i2 == 27) {
                        c0043OooO00o.f7635OooO0o0.f7684Oooo000 = i3;
                    } else if (i2 == 28) {
                        c0043OooO00o.f7635OooO0o0.f7686Oooo00o = i3;
                    } else if (i2 == 41) {
                        c0043OooO00o.f7635OooO0o0.f7698OoooOOO = i3;
                    } else if (i2 == 42) {
                        c0043OooO00o.f7635OooO0o0.f7699OoooOOo = i3;
                    } else if (i2 == 61) {
                        c0043OooO00o.f7635OooO0o0.f7677OooOoOO = i3;
                    } else if (i2 == 62) {
                        c0043OooO00o.f7635OooO0o0.f7679OooOoo0 = i3;
                    } else if (i2 == 72) {
                        c0043OooO00o.f7635OooO0o0.f7709Oooooo0 = i3;
                    } else if (i2 == 73) {
                        c0043OooO00o.f7635OooO0o0.f7708Oooooo = i3;
                    } else if (i2 == 2) {
                        c0043OooO00o.f7635OooO0o0.f7687Oooo0O0 = i3;
                    } else if (i2 == 31) {
                        c0043OooO00o.f7635OooO0o0.f7690Oooo0o0 = i3;
                    } else if (i2 == 34) {
                        c0043OooO00o.f7635OooO0o0.f7683Oooo0 = i3;
                    } else if (i2 == 38) {
                        c0043OooO00o.f7630OooO00o = i3;
                    } else if (i2 == 64) {
                        c0043OooO00o.f7633OooO0Oo.f7722OooO0O0 = i3;
                    } else if (i2 == 66) {
                        c0043OooO00o.f7633OooO0Oo.f7725OooO0o = i3;
                    } else if (i2 == 76) {
                        c0043OooO00o.f7633OooO0Oo.f7726OooO0o0 = i3;
                    } else if (i2 == 78) {
                        c0043OooO00o.f7632OooO0OO.f7735OooO0OO = i3;
                    } else if (i2 == 97) {
                        c0043OooO00o.f7635OooO0o0.f7716o00o0O = i3;
                    } else if (i2 == 93) {
                        c0043OooO00o.f7635OooO0o0.f7689Oooo0o = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                c0043OooO00o.f7635OooO0o0.f7695OoooO00 = i3;
                                break;
                            case 12:
                                c0043OooO00o.f7635OooO0o0.f7694OoooO0 = i3;
                                break;
                            case 13:
                                c0043OooO00o.f7635OooO0o0.f7691Oooo0oO = i3;
                                break;
                            case 14:
                                c0043OooO00o.f7635OooO0o0.f7682Oooo = i3;
                                break;
                            case 15:
                                c0043OooO00o.f7635OooO0o0.f7696OoooO0O = i3;
                                break;
                            case 16:
                                c0043OooO00o.f7635OooO0o0.f7692Oooo0oo = i3;
                                break;
                            case 17:
                                c0043OooO00o.f7635OooO0o0.f7657OooO0o0 = i3;
                                break;
                            case 18:
                                c0043OooO00o.f7635OooO0o0.f7656OooO0o = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        c0043OooO00o.f7635OooO0o0.f7655OooO0Oo = i3;
                                        break;
                                    case 22:
                                        c0043OooO00o.f7632OooO0OO.f7734OooO0O0 = i3;
                                        break;
                                    case 23:
                                        c0043OooO00o.f7635OooO0o0.f7654OooO0OO = i3;
                                        break;
                                    case 24:
                                        c0043OooO00o.f7635OooO0o0.f7685Oooo00O = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                c0043OooO00o.f7635OooO0o0.f7700OoooOo0 = i3;
                                                break;
                                            case 55:
                                                c0043OooO00o.f7635OooO0o0.f7701OoooOoO = i3;
                                                break;
                                            case 56:
                                                c0043OooO00o.f7635OooO0o0.f7702OoooOoo = i3;
                                                break;
                                            case 57:
                                                c0043OooO00o.f7635OooO0o0.f7703Ooooo00 = i3;
                                                break;
                                            case 58:
                                                c0043OooO00o.f7635OooO0o0.f7704Ooooo0o = i3;
                                                break;
                                            case 59:
                                                c0043OooO00o.f7635OooO0o0.f7705OooooO0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        c0043OooO00o.f7633OooO0Oo.f7723OooO0OO = i3;
                                                        break;
                                                    case 83:
                                                        c0043OooO00o.f7634OooO0o.f7616OooO = i3;
                                                        break;
                                                    case 84:
                                                        c0043OooO00o.f7633OooO0Oo.f7729OooOO0 = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                c0043OooO00o.f7633OooO0Oo.f7731OooOO0o = i3;
                                                                break;
                                                            case 89:
                                                                c0043OooO00o.f7633OooO0Oo.f7732OooOOO0 = i3;
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
                        c0043OooO00o.f7635OooO0o0.f7693OoooO = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f7643OooO0o; i4++) {
                    int i5 = this.f7642OooO0Oo[i4];
                    float f = this.f7644OooO0o0[i4];
                    int[] iArr2 = OooO00o.f7607OooO0oO;
                    if (i5 == 19) {
                        c0043OooO00o.f7635OooO0o0.f7658OooO0oO = f;
                    } else if (i5 == 20) {
                        c0043OooO00o.f7635OooO0o0.f7670OooOo = f;
                    } else if (i5 == 37) {
                        c0043OooO00o.f7635OooO0o0.f7676OooOoO0 = f;
                    } else if (i5 == 60) {
                        c0043OooO00o.f7634OooO0o.f7618OooO0O0 = f;
                    } else if (i5 == 63) {
                        c0043OooO00o.f7635OooO0o0.f7678OooOoo = f;
                    } else if (i5 == 79) {
                        c0043OooO00o.f7633OooO0Oo.f7727OooO0oO = f;
                    } else if (i5 == 85) {
                        c0043OooO00o.f7633OooO0Oo.f7720OooO = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            c0043OooO00o.f7635OooO0o0.f7712o000oOoO = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    c0043OooO00o.f7632OooO0OO.f7736OooO0Oo = f;
                                    break;
                                case 44:
                                    OooO oooO = c0043OooO00o.f7634OooO0o;
                                    oooO.f7628OooOOO = f;
                                    oooO.f7629OooOOO0 = true;
                                    break;
                                case 45:
                                    c0043OooO00o.f7634OooO0o.f7619OooO0OO = f;
                                    break;
                                case 46:
                                    c0043OooO00o.f7634OooO0o.f7620OooO0Oo = f;
                                    break;
                                case 47:
                                    c0043OooO00o.f7634OooO0o.f7622OooO0o0 = f;
                                    break;
                                case 48:
                                    c0043OooO00o.f7634OooO0o.f7621OooO0o = f;
                                    break;
                                case 49:
                                    c0043OooO00o.f7634OooO0o.f7623OooO0oO = f;
                                    break;
                                case 50:
                                    c0043OooO00o.f7634OooO0o.f7624OooO0oo = f;
                                    break;
                                case 51:
                                    c0043OooO00o.f7634OooO0o.f7625OooOO0 = f;
                                    break;
                                case 52:
                                    c0043OooO00o.f7634OooO0o.f7626OooOO0O = f;
                                    break;
                                case 53:
                                    c0043OooO00o.f7634OooO0o.f7627OooOO0o = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            c0043OooO00o.f7633OooO0Oo.f7728OooO0oo = f;
                                            break;
                                        case 68:
                                            c0043OooO00o.f7632OooO0OO.f7737OooO0o0 = f;
                                            break;
                                        case 69:
                                            c0043OooO00o.f7635OooO0o0.f7706OooooOO = f;
                                            break;
                                        case 70:
                                            c0043OooO00o.f7635OooO0o0.f7707OooooOo = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            c0043OooO00o.f7635OooO0o0.f7697OoooOO0 = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.f7638OooO; i6++) {
                    int i7 = this.f7645OooO0oO[i6];
                    String str = this.f7646OooO0oo[i6];
                    int[] iArr3 = OooO00o.f7607OooO0oO;
                    if (i7 == 5) {
                        c0043OooO00o.f7635OooO0o0.f7675OooOoO = str;
                    } else if (i7 == 65) {
                        c0043OooO00o.f7633OooO0Oo.f7724OooO0Oo = str;
                    } else if (i7 == 74) {
                        OooO0O0 oooO0O0 = c0043OooO00o.f7635OooO0o0;
                        oooO0O0.f7717o0OoOo0 = str;
                        oooO0O0.f7711Ooooooo = null;
                    } else if (i7 == 77) {
                        c0043OooO00o.f7635OooO0o0.f7718ooOO = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            c0043OooO00o.f7633OooO0Oo.f7730OooOO0O = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.f7649OooOO0o; i8++) {
                    int i9 = this.f7647OooOO0[i8];
                    boolean z = this.f7648OooOO0O[i8];
                    int[] iArr4 = OooO00o.f7607OooO0oO;
                    if (i9 == 44) {
                        c0043OooO00o.f7634OooO0o.f7629OooOOO0 = z;
                    } else if (i9 == 75) {
                        c0043OooO00o.f7635OooO0o0.f7715o00Ooo = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            c0043OooO00o.f7635OooO0o0.f7713o00O0O = z;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            c0043OooO00o.f7635OooO0o0.f7714o00Oo0 = z;
                        }
                    }
                }
            }
        }

        public final void OooO00o(ConstraintLayout.LayoutParams layoutParams) {
            OooO0O0 oooO0O0 = this.f7635OooO0o0;
            layoutParams.f7518OooO0o0 = oooO0O0.f7651OooO;
            layoutParams.f7517OooO0o = oooO0O0.f7660OooOO0;
            layoutParams.f7519OooO0oO = oooO0O0.f7661OooOO0O;
            layoutParams.f7520OooO0oo = oooO0O0.f7662OooOO0o;
            layoutParams.f7512OooO = oooO0O0.f7664OooOOO0;
            layoutParams.f7521OooOO0 = oooO0O0.f7663OooOOO;
            layoutParams.f7522OooOO0O = oooO0O0.f7665OooOOOO;
            layoutParams.f7523OooOO0o = oooO0O0.f7666OooOOOo;
            layoutParams.f7525OooOOO0 = oooO0O0.f7668OooOOo0;
            layoutParams.f7524OooOOO = oooO0O0.f7667OooOOo;
            layoutParams.f7526OooOOOO = oooO0O0.f7669OooOOoo;
            layoutParams.f7530OooOOoo = oooO0O0.f7672OooOo00;
            layoutParams.f7533OooOo00 = oooO0O0.f7671OooOo0;
            layoutParams.f7532OooOo0 = oooO0O0.f7673OooOo0O;
            layoutParams.f7534OooOo0O = oooO0O0.f7674OooOo0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = oooO0O0.f7685Oooo00O;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = oooO0O0.f7686Oooo00o;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = oooO0O0.f7683Oooo0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = oooO0O0.f7687Oooo0O0;
            layoutParams.f7538OooOoOO = oooO0O0.f7696OoooO0O;
            layoutParams.f7540OooOoo0 = oooO0O0.f7694OoooO0;
            layoutParams.f7531OooOo = oooO0O0.f7692Oooo0oo;
            layoutParams.f7536OooOoO = oooO0O0.f7695OoooO00;
            layoutParams.f7542OooOooo = oooO0O0.f7670OooOo;
            layoutParams.f7545Oooo000 = oooO0O0.f7676OooOoO0;
            layoutParams.f7527OooOOOo = oooO0O0.f7677OooOoOO;
            layoutParams.f7529OooOOo0 = oooO0O0.f7679OooOoo0;
            layoutParams.f7528OooOOo = oooO0O0.f7678OooOoo;
            layoutParams.f7546Oooo00O = oooO0O0.f7675OooOoO;
            layoutParams.f7554OoooO = oooO0O0.f7680OooOooO;
            layoutParams.f7558OoooOO0 = oooO0O0.f7681OooOooo;
            layoutParams.f7544Oooo0 = oooO0O0.f7697OoooOO0;
            layoutParams.f7547Oooo00o = oooO0O0.f7712o000oOoO;
            layoutParams.f7549Oooo0OO = oooO0O0.f7699OoooOOo;
            layoutParams.f7548Oooo0O0 = oooO0O0.f7698OoooOOO;
            layoutParams.f7559OoooOOO = oooO0O0.f7713o00O0O;
            layoutParams.f7560OoooOOo = oooO0O0.f7714o00Oo0;
            layoutParams.f7551Oooo0o0 = oooO0O0.f7700OoooOo0;
            layoutParams.f7550Oooo0o = oooO0O0.f7701OoooOoO;
            layoutParams.f7543Oooo = oooO0O0.f7702OoooOoo;
            layoutParams.f7556OoooO00 = oooO0O0.f7703Ooooo00;
            layoutParams.f7552Oooo0oO = oooO0O0.f7704Ooooo0o;
            layoutParams.f7553Oooo0oo = oooO0O0.f7705OooooO0;
            layoutParams.f7555OoooO0 = oooO0O0.f7706OooooOO;
            layoutParams.f7557OoooO0O = oooO0O0.f7707OooooOo;
            layoutParams.f7573o000oOoO = oooO0O0.f7684Oooo000;
            layoutParams.f7515OooO0OO = oooO0O0.f7658OooO0oO;
            layoutParams.f7513OooO00o = oooO0O0.f7657OooO0o0;
            layoutParams.f7514OooO0O0 = oooO0O0.f7656OooO0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = oooO0O0.f7654OooO0OO;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = oooO0O0.f7655OooO0Oo;
            String str = oooO0O0.f7718ooOO;
            if (str != null) {
                layoutParams.f7561OoooOo0 = str;
            }
            layoutParams.f7562OoooOoO = oooO0O0.f7716o00o0O;
            layoutParams.setMarginStart(oooO0O0.f7690Oooo0o0);
            layoutParams.setMarginEnd(this.f7635OooO0o0.f7688Oooo0OO);
            layoutParams.OooO00o();
        }

        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final C0043OooO00o clone() {
            C0043OooO00o c0043OooO00o = new C0043OooO00o();
            c0043OooO00o.f7635OooO0o0.OooO00o(this.f7635OooO0o0);
            c0043OooO00o.f7633OooO0Oo.OooO00o(this.f7633OooO0Oo);
            c0043OooO00o.f7632OooO0OO.OooO00o(this.f7632OooO0OO);
            c0043OooO00o.f7634OooO0o.OooO00o(this.f7634OooO0o);
            c0043OooO00o.f7630OooO00o = this.f7630OooO00o;
            c0043OooO00o.f7637OooO0oo = this.f7637OooO0oo;
            return c0043OooO00o;
        }

        public final void OooO0OO(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f7630OooO00o = i;
            OooO0O0 oooO0O0 = this.f7635OooO0o0;
            oooO0O0.f7651OooO = layoutParams.f7518OooO0o0;
            oooO0O0.f7660OooOO0 = layoutParams.f7517OooO0o;
            oooO0O0.f7661OooOO0O = layoutParams.f7519OooO0oO;
            oooO0O0.f7662OooOO0o = layoutParams.f7520OooO0oo;
            oooO0O0.f7664OooOOO0 = layoutParams.f7512OooO;
            oooO0O0.f7663OooOOO = layoutParams.f7521OooOO0;
            oooO0O0.f7665OooOOOO = layoutParams.f7522OooOO0O;
            oooO0O0.f7666OooOOOo = layoutParams.f7523OooOO0o;
            oooO0O0.f7668OooOOo0 = layoutParams.f7525OooOOO0;
            oooO0O0.f7667OooOOo = layoutParams.f7524OooOOO;
            oooO0O0.f7669OooOOoo = layoutParams.f7526OooOOOO;
            oooO0O0.f7672OooOo00 = layoutParams.f7530OooOOoo;
            oooO0O0.f7671OooOo0 = layoutParams.f7533OooOo00;
            oooO0O0.f7673OooOo0O = layoutParams.f7532OooOo0;
            oooO0O0.f7674OooOo0o = layoutParams.f7534OooOo0O;
            oooO0O0.f7670OooOo = layoutParams.f7542OooOooo;
            oooO0O0.f7676OooOoO0 = layoutParams.f7545Oooo000;
            oooO0O0.f7675OooOoO = layoutParams.f7546Oooo00O;
            oooO0O0.f7677OooOoOO = layoutParams.f7527OooOOOo;
            oooO0O0.f7679OooOoo0 = layoutParams.f7529OooOOo0;
            oooO0O0.f7678OooOoo = layoutParams.f7528OooOOo;
            oooO0O0.f7680OooOooO = layoutParams.f7554OoooO;
            oooO0O0.f7681OooOooo = layoutParams.f7558OoooOO0;
            oooO0O0.f7684Oooo000 = layoutParams.f7573o000oOoO;
            oooO0O0.f7658OooO0oO = layoutParams.f7515OooO0OO;
            oooO0O0.f7657OooO0o0 = layoutParams.f7513OooO00o;
            oooO0O0.f7656OooO0o = layoutParams.f7514OooO0O0;
            oooO0O0.f7654OooO0OO = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            oooO0O0.f7655OooO0Oo = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            oooO0O0.f7685Oooo00O = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            oooO0O0.f7686Oooo00o = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            oooO0O0.f7683Oooo0 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            oooO0O0.f7687Oooo0O0 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            oooO0O0.f7689Oooo0o = layoutParams.f7541OooOooO;
            oooO0O0.f7697OoooOO0 = layoutParams.f7544Oooo0;
            oooO0O0.f7712o000oOoO = layoutParams.f7547Oooo00o;
            oooO0O0.f7699OoooOOo = layoutParams.f7549Oooo0OO;
            oooO0O0.f7698OoooOOO = layoutParams.f7548Oooo0O0;
            oooO0O0.f7713o00O0O = layoutParams.f7559OoooOOO;
            oooO0O0.f7714o00Oo0 = layoutParams.f7560OoooOOo;
            oooO0O0.f7700OoooOo0 = layoutParams.f7551Oooo0o0;
            oooO0O0.f7701OoooOoO = layoutParams.f7550Oooo0o;
            oooO0O0.f7702OoooOoo = layoutParams.f7543Oooo;
            oooO0O0.f7703Ooooo00 = layoutParams.f7556OoooO00;
            oooO0O0.f7704Ooooo0o = layoutParams.f7552Oooo0oO;
            oooO0O0.f7705OooooO0 = layoutParams.f7553Oooo0oo;
            oooO0O0.f7706OooooOO = layoutParams.f7555OoooO0;
            oooO0O0.f7707OooooOo = layoutParams.f7557OoooO0O;
            oooO0O0.f7718ooOO = layoutParams.f7561OoooOo0;
            oooO0O0.f7692Oooo0oo = layoutParams.f7531OooOo;
            oooO0O0.f7695OoooO00 = layoutParams.f7536OooOoO;
            oooO0O0.f7691Oooo0oO = layoutParams.f7535OooOo0o;
            oooO0O0.f7682Oooo = layoutParams.f7537OooOoO0;
            oooO0O0.f7696OoooO0O = layoutParams.f7538OooOoOO;
            oooO0O0.f7694OoooO0 = layoutParams.f7540OooOoo0;
            oooO0O0.f7693OoooO = layoutParams.f7539OooOoo;
            oooO0O0.f7716o00o0O = layoutParams.f7562OoooOoO;
            oooO0O0.f7688Oooo0OO = layoutParams.getMarginEnd();
            this.f7635OooO0o0.f7690Oooo0o0 = layoutParams.getMarginStart();
        }

        public final void OooO0Oo(int i, Constraints.LayoutParams layoutParams) {
            OooO0OO(i, layoutParams);
            this.f7632OooO0OO.f7736OooO0Oo = layoutParams.f7603oo000o;
            OooO oooO = this.f7634OooO0o;
            oooO.f7618OooO0O0 = layoutParams.f7600o0ooOO0;
            oooO.f7619OooO0OO = layoutParams.f7601o0ooOOo;
            oooO.f7620OooO0Oo = layoutParams.f7602o0ooOoO;
            oooO.f7622OooO0o0 = layoutParams.f7598o0OOO0o;
            oooO.f7621OooO0o = layoutParams.f7599o0Oo0oo;
            oooO.f7623OooO0oO = layoutParams.f7597o0OO00O;
            oooO.f7624OooO0oo = layoutParams.f7604oo0o0Oo;
            oooO.f7625OooOO0 = layoutParams.f7596o0O0O00;
            oooO.f7626OooOO0O = layoutParams.f7593o000OOo;
            oooO.f7627OooOO0o = layoutParams.f7592o000000;
            oooO.f7628OooOOO = layoutParams.f7594o00oO0O;
            oooO.f7629OooOOO0 = layoutParams.f7595o00oO0o;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public static SparseIntArray f7650o00ooo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7654OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7655OooO0Oo;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int[] f7711Ooooooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public String f7717o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public String f7718ooOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7652OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f7653OooO0O0 = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7657OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7656OooO0o = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f7658OooO0oO = -1.0f;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f7659OooO0oo = true;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7651OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7660OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f7661OooOO0O = -1;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f7662OooOO0o = -1;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f7664OooOOO0 = -1;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f7663OooOOO = -1;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f7665OooOOOO = -1;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f7666OooOOOo = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f7668OooOOo0 = -1;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f7667OooOOo = -1;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f7669OooOOoo = -1;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f7672OooOo00 = -1;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f7671OooOo0 = -1;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f7673OooOo0O = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f7674OooOo0o = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f7670OooOo = 0.5f;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public float f7676OooOoO0 = 0.5f;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public String f7675OooOoO = null;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f7677OooOoOO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f7679OooOoo0 = 0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public float f7678OooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f7680OooOooO = -1;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f7681OooOooo = -1;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f7684Oooo000 = -1;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public int f7685Oooo00O = 0;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f7686Oooo00o = 0;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public int f7683Oooo0 = 0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f7687Oooo0O0 = 0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f7688Oooo0OO = 0;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f7690Oooo0o0 = 0;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f7689Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f7691Oooo0oO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f7692Oooo0oo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f7682Oooo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f7695OoooO00 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f7694OoooO0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f7696OoooO0O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f7693OoooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public float f7697OoooOO0 = -1.0f;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public float f7712o000oOoO = -1.0f;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public int f7698OoooOOO = 0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public int f7699OoooOOo = 0;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f7700OoooOo0 = 0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f7701OoooOoO = 0;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public int f7702OoooOoo = 0;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public int f7703Ooooo00 = 0;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public int f7704Ooooo0o = 0;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public int f7705OooooO0 = 0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public float f7706OooooOO = 1.0f;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public float f7707OooooOo = 1.0f;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f7709Oooooo0 = -1;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f7708Oooooo = 0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f7710OoooooO = -1;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public boolean f7713o00O0O = false;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public boolean f7714o00Oo0 = false;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public boolean f7715o00Ooo = true;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public int f7716o00o0O = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7650o00ooo = sparseIntArray;
            sparseIntArray.append(o000O00.Layout_layout_constraintLeft_toLeftOf, 24);
            f7650o00ooo.append(o000O00.Layout_layout_constraintLeft_toRightOf, 25);
            f7650o00ooo.append(o000O00.Layout_layout_constraintRight_toLeftOf, 28);
            f7650o00ooo.append(o000O00.Layout_layout_constraintRight_toRightOf, 29);
            f7650o00ooo.append(o000O00.Layout_layout_constraintTop_toTopOf, 35);
            f7650o00ooo.append(o000O00.Layout_layout_constraintTop_toBottomOf, 34);
            f7650o00ooo.append(o000O00.Layout_layout_constraintBottom_toTopOf, 4);
            f7650o00ooo.append(o000O00.Layout_layout_constraintBottom_toBottomOf, 3);
            f7650o00ooo.append(o000O00.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f7650o00ooo.append(o000O00.Layout_layout_editor_absoluteX, 6);
            f7650o00ooo.append(o000O00.Layout_layout_editor_absoluteY, 7);
            f7650o00ooo.append(o000O00.Layout_layout_constraintGuide_begin, 17);
            f7650o00ooo.append(o000O00.Layout_layout_constraintGuide_end, 18);
            f7650o00ooo.append(o000O00.Layout_layout_constraintGuide_percent, 19);
            f7650o00ooo.append(o000O00.Layout_guidelineUseRtl, 90);
            f7650o00ooo.append(o000O00.Layout_android_orientation, 26);
            f7650o00ooo.append(o000O00.Layout_layout_constraintStart_toEndOf, 31);
            f7650o00ooo.append(o000O00.Layout_layout_constraintStart_toStartOf, 32);
            f7650o00ooo.append(o000O00.Layout_layout_constraintEnd_toStartOf, 10);
            f7650o00ooo.append(o000O00.Layout_layout_constraintEnd_toEndOf, 9);
            f7650o00ooo.append(o000O00.Layout_layout_goneMarginLeft, 13);
            f7650o00ooo.append(o000O00.Layout_layout_goneMarginTop, 16);
            f7650o00ooo.append(o000O00.Layout_layout_goneMarginRight, 14);
            f7650o00ooo.append(o000O00.Layout_layout_goneMarginBottom, 11);
            f7650o00ooo.append(o000O00.Layout_layout_goneMarginStart, 15);
            f7650o00ooo.append(o000O00.Layout_layout_goneMarginEnd, 12);
            f7650o00ooo.append(o000O00.Layout_layout_constraintVertical_weight, 38);
            f7650o00ooo.append(o000O00.Layout_layout_constraintHorizontal_weight, 37);
            f7650o00ooo.append(o000O00.Layout_layout_constraintHorizontal_chainStyle, 39);
            f7650o00ooo.append(o000O00.Layout_layout_constraintVertical_chainStyle, 40);
            f7650o00ooo.append(o000O00.Layout_layout_constraintHorizontal_bias, 20);
            f7650o00ooo.append(o000O00.Layout_layout_constraintVertical_bias, 36);
            f7650o00ooo.append(o000O00.Layout_layout_constraintDimensionRatio, 5);
            f7650o00ooo.append(o000O00.Layout_layout_constraintLeft_creator, 91);
            f7650o00ooo.append(o000O00.Layout_layout_constraintTop_creator, 91);
            f7650o00ooo.append(o000O00.Layout_layout_constraintRight_creator, 91);
            f7650o00ooo.append(o000O00.Layout_layout_constraintBottom_creator, 91);
            f7650o00ooo.append(o000O00.Layout_layout_constraintBaseline_creator, 91);
            f7650o00ooo.append(o000O00.Layout_android_layout_marginLeft, 23);
            f7650o00ooo.append(o000O00.Layout_android_layout_marginRight, 27);
            f7650o00ooo.append(o000O00.Layout_android_layout_marginStart, 30);
            f7650o00ooo.append(o000O00.Layout_android_layout_marginEnd, 8);
            f7650o00ooo.append(o000O00.Layout_android_layout_marginTop, 33);
            f7650o00ooo.append(o000O00.Layout_android_layout_marginBottom, 2);
            f7650o00ooo.append(o000O00.Layout_android_layout_width, 22);
            f7650o00ooo.append(o000O00.Layout_android_layout_height, 21);
            f7650o00ooo.append(o000O00.Layout_layout_constraintWidth, 41);
            f7650o00ooo.append(o000O00.Layout_layout_constraintHeight, 42);
            f7650o00ooo.append(o000O00.Layout_layout_constrainedWidth, 41);
            f7650o00ooo.append(o000O00.Layout_layout_constrainedHeight, 42);
            f7650o00ooo.append(o000O00.Layout_layout_wrapBehaviorInParent, 76);
            f7650o00ooo.append(o000O00.Layout_layout_constraintCircle, 61);
            f7650o00ooo.append(o000O00.Layout_layout_constraintCircleRadius, 62);
            f7650o00ooo.append(o000O00.Layout_layout_constraintCircleAngle, 63);
            f7650o00ooo.append(o000O00.Layout_layout_constraintWidth_percent, 69);
            f7650o00ooo.append(o000O00.Layout_layout_constraintHeight_percent, 70);
            f7650o00ooo.append(o000O00.Layout_chainUseRtl, 71);
            f7650o00ooo.append(o000O00.Layout_barrierDirection, 72);
            f7650o00ooo.append(o000O00.Layout_barrierMargin, 73);
            f7650o00ooo.append(o000O00.Layout_constraint_referenced_ids, 74);
            f7650o00ooo.append(o000O00.Layout_barrierAllowsGoneWidgets, 75);
        }

        public final void OooO00o(OooO0O0 oooO0O0) {
            this.f7652OooO00o = oooO0O0.f7652OooO00o;
            this.f7654OooO0OO = oooO0O0.f7654OooO0OO;
            this.f7653OooO0O0 = oooO0O0.f7653OooO0O0;
            this.f7655OooO0Oo = oooO0O0.f7655OooO0Oo;
            this.f7657OooO0o0 = oooO0O0.f7657OooO0o0;
            this.f7656OooO0o = oooO0O0.f7656OooO0o;
            this.f7658OooO0oO = oooO0O0.f7658OooO0oO;
            this.f7659OooO0oo = oooO0O0.f7659OooO0oo;
            this.f7651OooO = oooO0O0.f7651OooO;
            this.f7660OooOO0 = oooO0O0.f7660OooOO0;
            this.f7661OooOO0O = oooO0O0.f7661OooOO0O;
            this.f7662OooOO0o = oooO0O0.f7662OooOO0o;
            this.f7664OooOOO0 = oooO0O0.f7664OooOOO0;
            this.f7663OooOOO = oooO0O0.f7663OooOOO;
            this.f7665OooOOOO = oooO0O0.f7665OooOOOO;
            this.f7666OooOOOo = oooO0O0.f7666OooOOOo;
            this.f7668OooOOo0 = oooO0O0.f7668OooOOo0;
            this.f7667OooOOo = oooO0O0.f7667OooOOo;
            this.f7669OooOOoo = oooO0O0.f7669OooOOoo;
            this.f7672OooOo00 = oooO0O0.f7672OooOo00;
            this.f7671OooOo0 = oooO0O0.f7671OooOo0;
            this.f7673OooOo0O = oooO0O0.f7673OooOo0O;
            this.f7674OooOo0o = oooO0O0.f7674OooOo0o;
            this.f7670OooOo = oooO0O0.f7670OooOo;
            this.f7676OooOoO0 = oooO0O0.f7676OooOoO0;
            this.f7675OooOoO = oooO0O0.f7675OooOoO;
            this.f7677OooOoOO = oooO0O0.f7677OooOoOO;
            this.f7679OooOoo0 = oooO0O0.f7679OooOoo0;
            this.f7678OooOoo = oooO0O0.f7678OooOoo;
            this.f7680OooOooO = oooO0O0.f7680OooOooO;
            this.f7681OooOooo = oooO0O0.f7681OooOooo;
            this.f7684Oooo000 = oooO0O0.f7684Oooo000;
            this.f7685Oooo00O = oooO0O0.f7685Oooo00O;
            this.f7686Oooo00o = oooO0O0.f7686Oooo00o;
            this.f7683Oooo0 = oooO0O0.f7683Oooo0;
            this.f7687Oooo0O0 = oooO0O0.f7687Oooo0O0;
            this.f7688Oooo0OO = oooO0O0.f7688Oooo0OO;
            this.f7690Oooo0o0 = oooO0O0.f7690Oooo0o0;
            this.f7689Oooo0o = oooO0O0.f7689Oooo0o;
            this.f7691Oooo0oO = oooO0O0.f7691Oooo0oO;
            this.f7692Oooo0oo = oooO0O0.f7692Oooo0oo;
            this.f7682Oooo = oooO0O0.f7682Oooo;
            this.f7695OoooO00 = oooO0O0.f7695OoooO00;
            this.f7694OoooO0 = oooO0O0.f7694OoooO0;
            this.f7696OoooO0O = oooO0O0.f7696OoooO0O;
            this.f7693OoooO = oooO0O0.f7693OoooO;
            this.f7697OoooOO0 = oooO0O0.f7697OoooOO0;
            this.f7712o000oOoO = oooO0O0.f7712o000oOoO;
            this.f7698OoooOOO = oooO0O0.f7698OoooOOO;
            this.f7699OoooOOo = oooO0O0.f7699OoooOOo;
            this.f7700OoooOo0 = oooO0O0.f7700OoooOo0;
            this.f7701OoooOoO = oooO0O0.f7701OoooOoO;
            this.f7702OoooOoo = oooO0O0.f7702OoooOoo;
            this.f7703Ooooo00 = oooO0O0.f7703Ooooo00;
            this.f7704Ooooo0o = oooO0O0.f7704Ooooo0o;
            this.f7705OooooO0 = oooO0O0.f7705OooooO0;
            this.f7706OooooOO = oooO0O0.f7706OooooOO;
            this.f7707OooooOo = oooO0O0.f7707OooooOo;
            this.f7709Oooooo0 = oooO0O0.f7709Oooooo0;
            this.f7708Oooooo = oooO0O0.f7708Oooooo;
            this.f7710OoooooO = oooO0O0.f7710OoooooO;
            this.f7718ooOO = oooO0O0.f7718ooOO;
            int[] iArr = oooO0O0.f7711Ooooooo;
            if (iArr == null || oooO0O0.f7717o0OoOo0 != null) {
                this.f7711Ooooooo = null;
            } else {
                this.f7711Ooooooo = Arrays.copyOf(iArr, iArr.length);
            }
            this.f7717o0OoOo0 = oooO0O0.f7717o0OoOo0;
            this.f7713o00O0O = oooO0O0.f7713o00O0O;
            this.f7714o00Oo0 = oooO0O0.f7714o00Oo0;
            this.f7715o00Ooo = oooO0O0.f7715o00Ooo;
            this.f7716o00o0O = oooO0O0.f7716o00o0O;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.Layout);
            this.f7653OooO0O0 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f7650o00ooo.get(index);
                switch (i2) {
                    case 1:
                        this.f7668OooOOo0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7668OooOOo0);
                        break;
                    case 2:
                        this.f7687Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7687Oooo0O0);
                        break;
                    case 3:
                        this.f7666OooOOOo = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7666OooOOOo);
                        break;
                    case 4:
                        this.f7665OooOOOO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7665OooOOOO);
                        break;
                    case 5:
                        this.f7675OooOoO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f7680OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7680OooOooO);
                        break;
                    case 7:
                        this.f7681OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7681OooOooo);
                        break;
                    case 8:
                        this.f7688Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7688Oooo0OO);
                        break;
                    case 9:
                        this.f7674OooOo0o = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7674OooOo0o);
                        break;
                    case 10:
                        this.f7673OooOo0O = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7673OooOo0O);
                        break;
                    case 11:
                        this.f7695OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7695OoooO00);
                        break;
                    case 12:
                        this.f7694OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7694OoooO0);
                        break;
                    case 13:
                        this.f7691Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7691Oooo0oO);
                        break;
                    case 14:
                        this.f7682Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7682Oooo);
                        break;
                    case 15:
                        this.f7696OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7696OoooO0O);
                        break;
                    case 16:
                        this.f7692Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7692Oooo0oo);
                        break;
                    case 17:
                        this.f7657OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7657OooO0o0);
                        break;
                    case 18:
                        this.f7656OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7656OooO0o);
                        break;
                    case 19:
                        this.f7658OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f7658OooO0oO);
                        break;
                    case 20:
                        this.f7670OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f7670OooOo);
                        break;
                    case 21:
                        this.f7655OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7655OooO0Oo);
                        break;
                    case 22:
                        this.f7654OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7654OooO0OO);
                        break;
                    case 23:
                        this.f7685Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7685Oooo00O);
                        break;
                    case 24:
                        this.f7651OooO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7651OooO);
                        break;
                    case 25:
                        this.f7660OooOO0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7660OooOO0);
                        break;
                    case 26:
                        this.f7684Oooo000 = typedArrayObtainStyledAttributes.getInt(index, this.f7684Oooo000);
                        break;
                    case 27:
                        this.f7686Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7686Oooo00o);
                        break;
                    case 28:
                        this.f7661OooOO0O = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7661OooOO0O);
                        break;
                    case 29:
                        this.f7662OooOO0o = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7662OooOO0o);
                        break;
                    case 30:
                        this.f7690Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7690Oooo0o0);
                        break;
                    case 31:
                        this.f7672OooOo00 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7672OooOo00);
                        break;
                    case 32:
                        this.f7671OooOo0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7671OooOo0);
                        break;
                    case 33:
                        this.f7683Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7683Oooo0);
                        break;
                    case 34:
                        this.f7663OooOOO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7663OooOOO);
                        break;
                    case 35:
                        this.f7664OooOOO0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7664OooOOO0);
                        break;
                    case 36:
                        this.f7676OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7676OooOoO0);
                        break;
                    case 37:
                        this.f7712o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f7712o000oOoO);
                        break;
                    case 38:
                        this.f7697OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7697OoooOO0);
                        break;
                    case 39:
                        this.f7698OoooOOO = typedArrayObtainStyledAttributes.getInt(index, this.f7698OoooOOO);
                        break;
                    case 40:
                        this.f7699OoooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f7699OoooOOo);
                        break;
                    case 41:
                        OooO00o.OooOOO0(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        OooO00o.OooOOO0(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f7677OooOoOO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7677OooOoOO);
                                break;
                            case 62:
                                this.f7679OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7679OooOoo0);
                                break;
                            case 63:
                                this.f7678OooOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f7678OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f7706OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f7707OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f7709Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, this.f7709Oooooo0);
                                        break;
                                    case 73:
                                        this.f7708Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7708Oooooo);
                                        break;
                                    case 74:
                                        this.f7717o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f7715o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7715o00Ooo);
                                        break;
                                    case 76:
                                        this.f7716o00o0O = typedArrayObtainStyledAttributes.getInt(index, this.f7716o00o0O);
                                        break;
                                    case 77:
                                        this.f7667OooOOo = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7667OooOOo);
                                        break;
                                    case 78:
                                        this.f7669OooOOoo = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7669OooOOoo);
                                        break;
                                    case 79:
                                        this.f7693OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7693OoooO);
                                        break;
                                    case 80:
                                        this.f7689Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7689Oooo0o);
                                        break;
                                    case 81:
                                        this.f7700OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, this.f7700OoooOo0);
                                        break;
                                    case 82:
                                        this.f7701OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f7701OoooOoO);
                                        break;
                                    case 83:
                                        this.f7703Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7703Ooooo00);
                                        break;
                                    case 84:
                                        this.f7702OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7702OoooOoo);
                                        break;
                                    case 85:
                                        this.f7705OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7705OooooO0);
                                        break;
                                    case 86:
                                        this.f7704Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7704Ooooo0o);
                                        break;
                                    case 87:
                                        this.f7713o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, this.f7713o00O0O);
                                        break;
                                    case 88:
                                        this.f7714o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7714o00Oo0);
                                        break;
                                    case 89:
                                        this.f7718ooOO = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f7659OooO0oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7659OooO0oo);
                                        break;
                                    case 91:
                                        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("unused attribute 0x");
                                        sbOooO0O0.append(Integer.toHexString(index));
                                        sbOooO0O0.append("   ");
                                        sbOooO0O0.append(f7650o00ooo.get(index));
                                        Log.w("ConstraintSet", sbOooO0O0.toString());
                                        break;
                                    default:
                                        StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Unknown attribute 0x");
                                        sbOooO0O1.append(Integer.toHexString(index));
                                        sbOooO0O1.append("   ");
                                        sbOooO0O1.append(f7650o00ooo.get(index));
                                        Log.w("ConstraintSet", sbOooO0O1.toString());
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
        public static SparseIntArray f7719OooOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7721OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7722OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7723OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f7724OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7726OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7725OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f7727OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f7728OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f7720OooO = Float.NaN;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7729OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f7730OooOO0O = null;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f7731OooOO0o = -3;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f7732OooOOO0 = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7719OooOOO = sparseIntArray;
            sparseIntArray.append(o000O00.Motion_motionPathRotate, 1);
            f7719OooOOO.append(o000O00.Motion_pathMotionArc, 2);
            f7719OooOOO.append(o000O00.Motion_transitionEasing, 3);
            f7719OooOOO.append(o000O00.Motion_drawPath, 4);
            f7719OooOOO.append(o000O00.Motion_animateRelativeTo, 5);
            f7719OooOOO.append(o000O00.Motion_animateCircleAngleTo, 6);
            f7719OooOOO.append(o000O00.Motion_motionStagger, 7);
            f7719OooOOO.append(o000O00.Motion_quantizeMotionSteps, 8);
            f7719OooOOO.append(o000O00.Motion_quantizeMotionPhase, 9);
            f7719OooOOO.append(o000O00.Motion_quantizeMotionInterpolator, 10);
        }

        public final void OooO00o(OooO0OO oooO0OO) {
            this.f7721OooO00o = oooO0OO.f7721OooO00o;
            this.f7722OooO0O0 = oooO0OO.f7722OooO0O0;
            this.f7724OooO0Oo = oooO0OO.f7724OooO0Oo;
            this.f7726OooO0o0 = oooO0OO.f7726OooO0o0;
            this.f7725OooO0o = oooO0OO.f7725OooO0o;
            this.f7728OooO0oo = oooO0OO.f7728OooO0oo;
            this.f7727OooO0oO = oooO0OO.f7727OooO0oO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.Motion);
            this.f7721OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f7719OooOOO.get(index)) {
                    case 1:
                        this.f7728OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7728OooO0oo);
                        break;
                    case 2:
                        this.f7726OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f7726OooO0o0);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f7724OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f7724OooO0Oo = o000000O.f27580OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f7725OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f7722OooO0O0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7722OooO0O0);
                        break;
                    case 6:
                        this.f7723OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, this.f7723OooO0OO);
                        break;
                    case 7:
                        this.f7727OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f7727OooO0oO);
                        break;
                    case 8:
                        this.f7729OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, this.f7729OooOO0);
                        break;
                    case 9:
                        this.f7720OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f7720OooO);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f7732OooOOO0 = resourceId;
                            if (resourceId != -1) {
                                this.f7731OooOO0o = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f7730OooOO0O = string;
                            if (string.indexOf("/") > 0) {
                                this.f7732OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f7731OooOO0o = -2;
                            } else {
                                this.f7731OooOO0o = -1;
                            }
                        } else {
                            this.f7731OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, this.f7732OooOOO0);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7733OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7734OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7735OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f7736OooO0Oo = 1.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f7737OooO0o0 = Float.NaN;

        public final void OooO00o(OooO0o oooO0o) {
            this.f7733OooO00o = oooO0o.f7733OooO00o;
            this.f7734OooO0O0 = oooO0o.f7734OooO0O0;
            this.f7736OooO0Oo = oooO0o.f7736OooO0Oo;
            this.f7737OooO0o0 = oooO0o.f7737OooO0o0;
            this.f7735OooO0OO = oooO0o.f7735OooO0OO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.PropertySet);
            this.f7733OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.PropertySet_android_alpha) {
                    this.f7736OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7736OooO0Oo);
                } else if (index == o000O00.PropertySet_android_visibility) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f7734OooO0O0);
                    this.f7734OooO0O0 = i2;
                    int[] iArr = OooO00o.f7607OooO0oO;
                    this.f7734OooO0O0 = OooO00o.f7607OooO0oO[i2];
                } else if (index == o000O00.PropertySet_visibilityMode) {
                    this.f7735OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f7735OooO0OO);
                } else if (index == o000O00.PropertySet_motionProgress) {
                    this.f7737OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7737OooO0o0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintLeft_toLeftOf, 25);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintLeft_toRightOf, 26);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintRight_toLeftOf, 29);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintRight_toRightOf, 30);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintTop_toTopOf, 36);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintTop_toBottomOf, 35);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintBottom_toTopOf, 4);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintBottom_toBottomOf, 3);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_toTopOf, 91);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f7608OooO0oo.append(o000O00.Constraint_layout_editor_absoluteX, 6);
        f7608OooO0oo.append(o000O00.Constraint_layout_editor_absoluteY, 7);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintGuide_begin, 17);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintGuide_end, 18);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintGuide_percent, 19);
        f7608OooO0oo.append(o000O00.Constraint_guidelineUseRtl, 99);
        f7608OooO0oo.append(o000O00.Constraint_android_orientation, 27);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintStart_toEndOf, 32);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintStart_toStartOf, 33);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintEnd_toStartOf, 10);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintEnd_toEndOf, 9);
        f7608OooO0oo.append(o000O00.Constraint_layout_goneMarginLeft, 13);
        f7608OooO0oo.append(o000O00.Constraint_layout_goneMarginTop, 16);
        f7608OooO0oo.append(o000O00.Constraint_layout_goneMarginRight, 14);
        f7608OooO0oo.append(o000O00.Constraint_layout_goneMarginBottom, 11);
        f7608OooO0oo.append(o000O00.Constraint_layout_goneMarginStart, 15);
        f7608OooO0oo.append(o000O00.Constraint_layout_goneMarginEnd, 12);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintVertical_weight, 40);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHorizontal_weight, 39);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintVertical_chainStyle, 42);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHorizontal_bias, 20);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintVertical_bias, 37);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintDimensionRatio, 5);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintLeft_creator, 87);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintTop_creator, 87);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintRight_creator, 87);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintBottom_creator, 87);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_creator, 87);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_marginLeft, 24);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_marginRight, 28);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_marginStart, 31);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_marginEnd, 8);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_marginTop, 34);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_marginBottom, 2);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_width, 23);
        f7608OooO0oo.append(o000O00.Constraint_android_layout_height, 21);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintWidth, 95);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHeight, 96);
        f7608OooO0oo.append(o000O00.Constraint_android_visibility, 22);
        f7608OooO0oo.append(o000O00.Constraint_android_alpha, 43);
        f7608OooO0oo.append(o000O00.Constraint_android_elevation, 44);
        f7608OooO0oo.append(o000O00.Constraint_android_rotationX, 45);
        f7608OooO0oo.append(o000O00.Constraint_android_rotationY, 46);
        f7608OooO0oo.append(o000O00.Constraint_android_rotation, 60);
        f7608OooO0oo.append(o000O00.Constraint_android_scaleX, 47);
        f7608OooO0oo.append(o000O00.Constraint_android_scaleY, 48);
        f7608OooO0oo.append(o000O00.Constraint_android_transformPivotX, 49);
        f7608OooO0oo.append(o000O00.Constraint_android_transformPivotY, 50);
        f7608OooO0oo.append(o000O00.Constraint_android_translationX, 51);
        f7608OooO0oo.append(o000O00.Constraint_android_translationY, 52);
        f7608OooO0oo.append(o000O00.Constraint_android_translationZ, 53);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintWidth_default, 54);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHeight_default, 55);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintWidth_max, 56);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHeight_max, 57);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintWidth_min, 58);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHeight_min, 59);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintCircle, 61);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintCircleRadius, 62);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintCircleAngle, 63);
        f7608OooO0oo.append(o000O00.Constraint_animateRelativeTo, 64);
        f7608OooO0oo.append(o000O00.Constraint_transitionEasing, 65);
        f7608OooO0oo.append(o000O00.Constraint_drawPath, 66);
        f7608OooO0oo.append(o000O00.Constraint_transitionPathRotate, 67);
        f7608OooO0oo.append(o000O00.Constraint_motionStagger, 79);
        f7608OooO0oo.append(o000O00.Constraint_android_id, 38);
        f7608OooO0oo.append(o000O00.Constraint_motionProgress, 68);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintWidth_percent, 69);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintHeight_percent, 70);
        f7608OooO0oo.append(o000O00.Constraint_layout_wrapBehaviorInParent, 97);
        f7608OooO0oo.append(o000O00.Constraint_chainUseRtl, 71);
        f7608OooO0oo.append(o000O00.Constraint_barrierDirection, 72);
        f7608OooO0oo.append(o000O00.Constraint_barrierMargin, 73);
        f7608OooO0oo.append(o000O00.Constraint_constraint_referenced_ids, 74);
        f7608OooO0oo.append(o000O00.Constraint_barrierAllowsGoneWidgets, 75);
        f7608OooO0oo.append(o000O00.Constraint_pathMotionArc, 76);
        f7608OooO0oo.append(o000O00.Constraint_layout_constraintTag, 77);
        f7608OooO0oo.append(o000O00.Constraint_visibilityMode, 78);
        f7608OooO0oo.append(o000O00.Constraint_layout_constrainedWidth, 80);
        f7608OooO0oo.append(o000O00.Constraint_layout_constrainedHeight, 81);
        f7608OooO0oo.append(o000O00.Constraint_polarRelativeTo, 82);
        f7608OooO0oo.append(o000O00.Constraint_transformPivotTarget, 83);
        f7608OooO0oo.append(o000O00.Constraint_quantizeMotionSteps, 84);
        f7608OooO0oo.append(o000O00.Constraint_quantizeMotionPhase, 85);
        f7608OooO0oo.append(o000O00.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f7606OooO;
        int i = o000O00.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f7606OooO.append(i, 7);
        f7606OooO.append(o000O00.ConstraintOverride_android_orientation, 27);
        f7606OooO.append(o000O00.ConstraintOverride_layout_goneMarginLeft, 13);
        f7606OooO.append(o000O00.ConstraintOverride_layout_goneMarginTop, 16);
        f7606OooO.append(o000O00.ConstraintOverride_layout_goneMarginRight, 14);
        f7606OooO.append(o000O00.ConstraintOverride_layout_goneMarginBottom, 11);
        f7606OooO.append(o000O00.ConstraintOverride_layout_goneMarginStart, 15);
        f7606OooO.append(o000O00.ConstraintOverride_layout_goneMarginEnd, 12);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintVertical_weight, 40);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintVertical_bias, 37);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintLeft_creator, 87);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintTop_creator, 87);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintRight_creator, 87);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintBottom_creator, 87);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_marginLeft, 24);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_marginRight, 28);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_marginStart, 31);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_marginEnd, 8);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_marginTop, 34);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_marginBottom, 2);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_width, 23);
        f7606OooO.append(o000O00.ConstraintOverride_android_layout_height, 21);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintWidth, 95);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHeight, 96);
        f7606OooO.append(o000O00.ConstraintOverride_android_visibility, 22);
        f7606OooO.append(o000O00.ConstraintOverride_android_alpha, 43);
        f7606OooO.append(o000O00.ConstraintOverride_android_elevation, 44);
        f7606OooO.append(o000O00.ConstraintOverride_android_rotationX, 45);
        f7606OooO.append(o000O00.ConstraintOverride_android_rotationY, 46);
        f7606OooO.append(o000O00.ConstraintOverride_android_rotation, 60);
        f7606OooO.append(o000O00.ConstraintOverride_android_scaleX, 47);
        f7606OooO.append(o000O00.ConstraintOverride_android_scaleY, 48);
        f7606OooO.append(o000O00.ConstraintOverride_android_transformPivotX, 49);
        f7606OooO.append(o000O00.ConstraintOverride_android_transformPivotY, 50);
        f7606OooO.append(o000O00.ConstraintOverride_android_translationX, 51);
        f7606OooO.append(o000O00.ConstraintOverride_android_translationY, 52);
        f7606OooO.append(o000O00.ConstraintOverride_android_translationZ, 53);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_default, 54);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_default, 55);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_max, 56);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_max, 57);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_min, 58);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_min, 59);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintCircleRadius, 62);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintCircleAngle, 63);
        f7606OooO.append(o000O00.ConstraintOverride_animateRelativeTo, 64);
        f7606OooO.append(o000O00.ConstraintOverride_transitionEasing, 65);
        f7606OooO.append(o000O00.ConstraintOverride_drawPath, 66);
        f7606OooO.append(o000O00.ConstraintOverride_transitionPathRotate, 67);
        f7606OooO.append(o000O00.ConstraintOverride_motionStagger, 79);
        f7606OooO.append(o000O00.ConstraintOverride_android_id, 38);
        f7606OooO.append(o000O00.ConstraintOverride_motionTarget, 98);
        f7606OooO.append(o000O00.ConstraintOverride_motionProgress, 68);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_percent, 69);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_percent, 70);
        f7606OooO.append(o000O00.ConstraintOverride_chainUseRtl, 71);
        f7606OooO.append(o000O00.ConstraintOverride_barrierDirection, 72);
        f7606OooO.append(o000O00.ConstraintOverride_barrierMargin, 73);
        f7606OooO.append(o000O00.ConstraintOverride_constraint_referenced_ids, 74);
        f7606OooO.append(o000O00.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f7606OooO.append(o000O00.ConstraintOverride_pathMotionArc, 76);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constraintTag, 77);
        f7606OooO.append(o000O00.ConstraintOverride_visibilityMode, 78);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constrainedWidth, 80);
        f7606OooO.append(o000O00.ConstraintOverride_layout_constrainedHeight, 81);
        f7606OooO.append(o000O00.ConstraintOverride_polarRelativeTo, 82);
        f7606OooO.append(o000O00.ConstraintOverride_transformPivotTarget, 83);
        f7606OooO.append(o000O00.ConstraintOverride_quantizeMotionSteps, 84);
        f7606OooO.append(o000O00.ConstraintOverride_quantizeMotionPhase, 85);
        f7606OooO.append(o000O00.ConstraintOverride_quantizeMotionInterpolator, 86);
        f7606OooO.append(o000O00.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static C0043OooO00o OooO0Oo(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C0043OooO00o c0043OooO00o = new C0043OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, o000O00.ConstraintOverride);
        OooOOOO(c0043OooO00o, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return c0043OooO00o;
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
                        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
        layoutParams.f7546Oooo00O = str;
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    public static void OooOOO0(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        C0043OooO00o.C0044OooO00o c0044OooO00o;
        OooO0O0 oooO0O0;
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
                if (dimensionPixelSize != -4) {
                    if (dimensionPixelSize != -3 && (dimensionPixelSize == -2 || dimensionPixelSize == -1)) {
                    }
                    z = false;
                } else {
                    i4 = -2;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                        layoutParams.f7559OoooOOO = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                        layoutParams.f7560OoooOOo = z;
                        return;
                    }
                }
                if (obj instanceof OooO0O0) {
                    oooO0O0 = (OooO0O0) obj;
                    if (i2 == 0) {
                        oooO0O0.f7654OooO0OO = i4;
                        oooO0O0.f7713o00O0O = z;
                        return;
                    } else {
                        oooO0O0.f7655OooO0Oo = i4;
                        oooO0O0.f7714o00Oo0 = z;
                        return;
                    }
                }
                if (obj instanceof C0043OooO00o.C0044OooO00o) {
                    c0044OooO00o = (C0043OooO00o.C0044OooO00o) obj;
                    if (i2 == 0) {
                        c0044OooO00o.OooO0O0(23, i4);
                        c0044OooO00o.OooO0Oo(80, z);
                        return;
                    } else {
                        c0044OooO00o.OooO0O0(21, i4);
                        c0044OooO00o.OooO0Oo(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            i4 = dimensionPixelSize;
            z = false;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                    layoutParams.f7559OoooOOO = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.f7560OoooOOo = z;
                    return;
                }
            }
            if (obj instanceof OooO0O0) {
                oooO0O0 = (OooO0O0) obj;
                if (i2 == 0) {
                    oooO0O0.f7654OooO0OO = i4;
                    oooO0O0.f7713o00O0O = z;
                    return;
                } else {
                    oooO0O0.f7655OooO0Oo = i4;
                    oooO0O0.f7714o00Oo0 = z;
                    return;
                }
            }
            if (obj instanceof C0043OooO00o.C0044OooO00o) {
                c0044OooO00o = (C0043OooO00o.C0044OooO00o) obj;
                if (i2 == 0) {
                    c0044OooO00o.OooO0O0(23, i4);
                    c0044OooO00o.OooO0Oo(80, z);
                    return;
                } else {
                    c0044OooO00o.OooO0O0(21, i4);
                    c0044OooO00o.OooO0Oo(81, z);
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
                if (obj instanceof OooO0O0) {
                    ((OooO0O0) obj).f7675OooOoO = strTrim2;
                    return;
                } else {
                    if (obj instanceof C0043OooO00o.C0044OooO00o) {
                        ((C0043OooO00o.C0044OooO00o) obj).OooO0OO(5, strTrim2);
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
                            layoutParams3.f7547Oooo00o = f;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f7544Oooo0 = f;
                        }
                    } else if (obj instanceof OooO0O0) {
                        OooO0O0 oooO0O1 = (OooO0O0) obj;
                        if (i2 == 0) {
                            oooO0O1.f7654OooO0OO = 0;
                            oooO0O1.f7712o000oOoO = f;
                        } else {
                            oooO0O1.f7655OooO0Oo = 0;
                            oooO0O1.f7697OoooOO0 = f;
                        }
                    } else if (obj instanceof C0043OooO00o.C0044OooO00o) {
                        C0043OooO00o.C0044OooO00o c0044OooO00o2 = (C0043OooO00o.C0044OooO00o) obj;
                        if (i2 == 0) {
                            c0044OooO00o2.OooO0O0(23, 0);
                            c0044OooO00o2.OooO00o(39, f);
                        } else {
                            c0044OooO00o2.OooO0O0(21, 0);
                            c0044OooO00o2.OooO00o(40, f);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.f7555OoooO0 = fMax;
                            layoutParams4.f7551Oooo0o0 = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.f7557OoooO0O = fMax;
                            layoutParams4.f7550Oooo0o = 2;
                        }
                    } else if (obj instanceof OooO0O0) {
                        OooO0O0 oooO0O2 = (OooO0O0) obj;
                        if (i2 == 0) {
                            oooO0O2.f7654OooO0OO = 0;
                            oooO0O2.f7706OooooOO = fMax;
                            oooO0O2.f7700OoooOo0 = 2;
                        } else {
                            oooO0O2.f7655OooO0Oo = 0;
                            oooO0O2.f7707OooooOo = fMax;
                            oooO0O2.f7701OoooOoO = 2;
                        }
                    } else if (obj instanceof C0043OooO00o.C0044OooO00o) {
                        C0043OooO00o.C0044OooO00o c0044OooO00o3 = (C0043OooO00o.C0044OooO00o) obj;
                        if (i2 == 0) {
                            c0044OooO00o3.OooO0O0(23, 0);
                            c0044OooO00o3.OooO0O0(54, 2);
                        } else {
                            c0044OooO00o3.OooO0O0(21, 0);
                            c0044OooO00o3.OooO0O0(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void OooOOOO(C0043OooO00o c0043OooO00o, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0043OooO00o.C0044OooO00o c0044OooO00o = new C0043OooO00o.C0044OooO00o();
        c0043OooO00o.f7637OooO0oo = c0044OooO00o;
        c0043OooO00o.f7633OooO0Oo.f7721OooO00o = false;
        c0043OooO00o.f7635OooO0o0.f7653OooO0O0 = false;
        c0043OooO00o.f7632OooO0OO.f7733OooO00o = false;
        c0043OooO00o.f7634OooO0o.f7617OooO00o = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f7606OooO.get(index)) {
                case 2:
                    c0044OooO00o.OooO0O0(2, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7687Oooo0O0));
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
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Unknown attribute 0x");
                    sbOooO0O0.append(Integer.toHexString(index));
                    sbOooO0O0.append("   ");
                    sbOooO0O0.append(f7608OooO0oo.get(index));
                    Log.w("ConstraintSet", sbOooO0O0.toString());
                    break;
                case 5:
                    c0044OooO00o.OooO0OO(5, typedArray.getString(index));
                    break;
                case 6:
                    c0044OooO00o.OooO0O0(6, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7635OooO0o0.f7680OooOooO));
                    break;
                case 7:
                    c0044OooO00o.OooO0O0(7, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7635OooO0o0.f7681OooOooo));
                    break;
                case 8:
                    c0044OooO00o.OooO0O0(8, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7688Oooo0OO));
                    break;
                case 11:
                    c0044OooO00o.OooO0O0(11, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7695OoooO00));
                    break;
                case 12:
                    c0044OooO00o.OooO0O0(12, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7694OoooO0));
                    break;
                case 13:
                    c0044OooO00o.OooO0O0(13, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7691Oooo0oO));
                    break;
                case 14:
                    c0044OooO00o.OooO0O0(14, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7682Oooo));
                    break;
                case 15:
                    c0044OooO00o.OooO0O0(15, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7696OoooO0O));
                    break;
                case 16:
                    c0044OooO00o.OooO0O0(16, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7692Oooo0oo));
                    break;
                case 17:
                    c0044OooO00o.OooO0O0(17, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7635OooO0o0.f7657OooO0o0));
                    break;
                case 18:
                    c0044OooO00o.OooO0O0(18, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7635OooO0o0.f7656OooO0o));
                    break;
                case 19:
                    c0044OooO00o.OooO00o(19, typedArray.getFloat(index, c0043OooO00o.f7635OooO0o0.f7658OooO0oO));
                    break;
                case 20:
                    c0044OooO00o.OooO00o(20, typedArray.getFloat(index, c0043OooO00o.f7635OooO0o0.f7670OooOo));
                    break;
                case 21:
                    c0044OooO00o.OooO0O0(21, typedArray.getLayoutDimension(index, c0043OooO00o.f7635OooO0o0.f7655OooO0Oo));
                    break;
                case 22:
                    c0044OooO00o.OooO0O0(22, f7607OooO0oO[typedArray.getInt(index, c0043OooO00o.f7632OooO0OO.f7734OooO0O0)]);
                    break;
                case 23:
                    c0044OooO00o.OooO0O0(23, typedArray.getLayoutDimension(index, c0043OooO00o.f7635OooO0o0.f7654OooO0OO));
                    break;
                case 24:
                    c0044OooO00o.OooO0O0(24, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7685Oooo00O));
                    break;
                case 27:
                    c0044OooO00o.OooO0O0(27, typedArray.getInt(index, c0043OooO00o.f7635OooO0o0.f7684Oooo000));
                    break;
                case 28:
                    c0044OooO00o.OooO0O0(28, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7686Oooo00o));
                    break;
                case 31:
                    c0044OooO00o.OooO0O0(31, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7690Oooo0o0));
                    break;
                case 34:
                    c0044OooO00o.OooO0O0(34, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7683Oooo0));
                    break;
                case 37:
                    c0044OooO00o.OooO00o(37, typedArray.getFloat(index, c0043OooO00o.f7635OooO0o0.f7676OooOoO0));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, c0043OooO00o.f7630OooO00o);
                    c0043OooO00o.f7630OooO00o = resourceId;
                    c0044OooO00o.OooO0O0(38, resourceId);
                    break;
                case 39:
                    c0044OooO00o.OooO00o(39, typedArray.getFloat(index, c0043OooO00o.f7635OooO0o0.f7712o000oOoO));
                    break;
                case 40:
                    c0044OooO00o.OooO00o(40, typedArray.getFloat(index, c0043OooO00o.f7635OooO0o0.f7697OoooOO0));
                    break;
                case 41:
                    c0044OooO00o.OooO0O0(41, typedArray.getInt(index, c0043OooO00o.f7635OooO0o0.f7698OoooOOO));
                    break;
                case 42:
                    c0044OooO00o.OooO0O0(42, typedArray.getInt(index, c0043OooO00o.f7635OooO0o0.f7699OoooOOo));
                    break;
                case 43:
                    c0044OooO00o.OooO00o(43, typedArray.getFloat(index, c0043OooO00o.f7632OooO0OO.f7736OooO0Oo));
                    break;
                case 44:
                    c0044OooO00o.OooO0Oo(44, true);
                    c0044OooO00o.OooO00o(44, typedArray.getDimension(index, c0043OooO00o.f7634OooO0o.f7628OooOOO));
                    break;
                case 45:
                    c0044OooO00o.OooO00o(45, typedArray.getFloat(index, c0043OooO00o.f7634OooO0o.f7619OooO0OO));
                    break;
                case 46:
                    c0044OooO00o.OooO00o(46, typedArray.getFloat(index, c0043OooO00o.f7634OooO0o.f7620OooO0Oo));
                    break;
                case 47:
                    c0044OooO00o.OooO00o(47, typedArray.getFloat(index, c0043OooO00o.f7634OooO0o.f7622OooO0o0));
                    break;
                case 48:
                    c0044OooO00o.OooO00o(48, typedArray.getFloat(index, c0043OooO00o.f7634OooO0o.f7621OooO0o));
                    break;
                case 49:
                    c0044OooO00o.OooO00o(49, typedArray.getDimension(index, c0043OooO00o.f7634OooO0o.f7623OooO0oO));
                    break;
                case 50:
                    c0044OooO00o.OooO00o(50, typedArray.getDimension(index, c0043OooO00o.f7634OooO0o.f7624OooO0oo));
                    break;
                case 51:
                    c0044OooO00o.OooO00o(51, typedArray.getDimension(index, c0043OooO00o.f7634OooO0o.f7625OooOO0));
                    break;
                case 52:
                    c0044OooO00o.OooO00o(52, typedArray.getDimension(index, c0043OooO00o.f7634OooO0o.f7626OooOO0O));
                    break;
                case 53:
                    c0044OooO00o.OooO00o(53, typedArray.getDimension(index, c0043OooO00o.f7634OooO0o.f7627OooOO0o));
                    break;
                case 54:
                    c0044OooO00o.OooO0O0(54, typedArray.getInt(index, c0043OooO00o.f7635OooO0o0.f7700OoooOo0));
                    break;
                case 55:
                    c0044OooO00o.OooO0O0(55, typedArray.getInt(index, c0043OooO00o.f7635OooO0o0.f7701OoooOoO));
                    break;
                case 56:
                    c0044OooO00o.OooO0O0(56, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7702OoooOoo));
                    break;
                case 57:
                    c0044OooO00o.OooO0O0(57, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7703Ooooo00));
                    break;
                case 58:
                    c0044OooO00o.OooO0O0(58, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7704Ooooo0o));
                    break;
                case 59:
                    c0044OooO00o.OooO0O0(59, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7705OooooO0));
                    break;
                case 60:
                    c0044OooO00o.OooO00o(60, typedArray.getFloat(index, c0043OooO00o.f7634OooO0o.f7618OooO0O0));
                    break;
                case 62:
                    c0044OooO00o.OooO0O0(62, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7679OooOoo0));
                    break;
                case 63:
                    c0044OooO00o.OooO00o(63, typedArray.getFloat(index, c0043OooO00o.f7635OooO0o0.f7678OooOoo));
                    break;
                case 64:
                    c0044OooO00o.OooO0O0(64, OooOO0o(typedArray, index, c0043OooO00o.f7633OooO0Oo.f7722OooO0O0));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0044OooO00o.OooO0OO(65, typedArray.getString(index));
                    } else {
                        c0044OooO00o.OooO0OO(65, o000000O.f27580OooO0OO[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0044OooO00o.OooO0O0(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0044OooO00o.OooO00o(67, typedArray.getFloat(index, c0043OooO00o.f7633OooO0Oo.f7728OooO0oo));
                    break;
                case 68:
                    c0044OooO00o.OooO00o(68, typedArray.getFloat(index, c0043OooO00o.f7632OooO0OO.f7737OooO0o0));
                    break;
                case 69:
                    c0044OooO00o.OooO00o(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0044OooO00o.OooO00o(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0044OooO00o.OooO0O0(72, typedArray.getInt(index, c0043OooO00o.f7635OooO0o0.f7709Oooooo0));
                    break;
                case 73:
                    c0044OooO00o.OooO0O0(73, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7708Oooooo));
                    break;
                case 74:
                    c0044OooO00o.OooO0OO(74, typedArray.getString(index));
                    break;
                case 75:
                    c0044OooO00o.OooO0Oo(75, typedArray.getBoolean(index, c0043OooO00o.f7635OooO0o0.f7715o00Ooo));
                    break;
                case 76:
                    c0044OooO00o.OooO0O0(76, typedArray.getInt(index, c0043OooO00o.f7633OooO0Oo.f7726OooO0o0));
                    break;
                case 77:
                    c0044OooO00o.OooO0OO(77, typedArray.getString(index));
                    break;
                case 78:
                    c0044OooO00o.OooO0O0(78, typedArray.getInt(index, c0043OooO00o.f7632OooO0OO.f7735OooO0OO));
                    break;
                case 79:
                    c0044OooO00o.OooO00o(79, typedArray.getFloat(index, c0043OooO00o.f7633OooO0Oo.f7727OooO0oO));
                    break;
                case 80:
                    c0044OooO00o.OooO0Oo(80, typedArray.getBoolean(index, c0043OooO00o.f7635OooO0o0.f7713o00O0O));
                    break;
                case 81:
                    c0044OooO00o.OooO0Oo(81, typedArray.getBoolean(index, c0043OooO00o.f7635OooO0o0.f7714o00Oo0));
                    break;
                case 82:
                    c0044OooO00o.OooO0O0(82, typedArray.getInteger(index, c0043OooO00o.f7633OooO0Oo.f7723OooO0OO));
                    break;
                case 83:
                    c0044OooO00o.OooO0O0(83, OooOO0o(typedArray, index, c0043OooO00o.f7634OooO0o.f7616OooO));
                    break;
                case 84:
                    c0044OooO00o.OooO0O0(84, typedArray.getInteger(index, c0043OooO00o.f7633OooO0Oo.f7729OooOO0));
                    break;
                case 85:
                    c0044OooO00o.OooO00o(85, typedArray.getFloat(index, c0043OooO00o.f7633OooO0Oo.f7720OooO));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        c0043OooO00o.f7633OooO0Oo.f7732OooOOO0 = typedArray.getResourceId(index, -1);
                        c0044OooO00o.OooO0O0(89, c0043OooO00o.f7633OooO0Oo.f7732OooOOO0);
                        OooO0OO oooO0OO = c0043OooO00o.f7633OooO0Oo;
                        if (oooO0OO.f7732OooOOO0 != -1) {
                            oooO0OO.f7731OooOO0o = -2;
                            c0044OooO00o.OooO0O0(88, -2);
                        }
                    } else if (i2 == 3) {
                        c0043OooO00o.f7633OooO0Oo.f7730OooOO0O = typedArray.getString(index);
                        c0044OooO00o.OooO0OO(90, c0043OooO00o.f7633OooO0Oo.f7730OooOO0O);
                        if (c0043OooO00o.f7633OooO0Oo.f7730OooOO0O.indexOf("/") > 0) {
                            c0043OooO00o.f7633OooO0Oo.f7732OooOOO0 = typedArray.getResourceId(index, -1);
                            c0044OooO00o.OooO0O0(89, c0043OooO00o.f7633OooO0Oo.f7732OooOOO0);
                            c0043OooO00o.f7633OooO0Oo.f7731OooOO0o = -2;
                            c0044OooO00o.OooO0O0(88, -2);
                        } else {
                            c0043OooO00o.f7633OooO0Oo.f7731OooOO0o = -1;
                            c0044OooO00o.OooO0O0(88, -1);
                        }
                    } else {
                        OooO0OO oooO0OO2 = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO2.f7731OooOO0o = typedArray.getInteger(index, oooO0OO2.f7732OooOOO0);
                        c0044OooO00o.OooO0O0(88, c0043OooO00o.f7633OooO0Oo.f7731OooOO0o);
                    }
                    break;
                case 87:
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("unused attribute 0x");
                    sbOooO0O1.append(Integer.toHexString(index));
                    sbOooO0O1.append("   ");
                    sbOooO0O1.append(f7608OooO0oo.get(index));
                    Log.w("ConstraintSet", sbOooO0O1.toString());
                    break;
                case 93:
                    c0044OooO00o.OooO0O0(93, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7689Oooo0o));
                    break;
                case 94:
                    c0044OooO00o.OooO0O0(94, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7635OooO0o0.f7693OoooO));
                    break;
                case 95:
                    OooOOO0(c0044OooO00o, typedArray, index, 0);
                    break;
                case 96:
                    OooOOO0(c0044OooO00o, typedArray, index, 1);
                    break;
                case 97:
                    c0044OooO00o.OooO0O0(97, typedArray.getInt(index, c0043OooO00o.f7635OooO0o0.f7716o00o0O));
                    break;
                case 98:
                    if (MotionLayout.f7161o0000Oo) {
                        int resourceId2 = typedArray.getResourceId(index, c0043OooO00o.f7630OooO00o);
                        c0043OooO00o.f7630OooO00o = resourceId2;
                        if (resourceId2 == -1) {
                            c0043OooO00o.f7631OooO0O0 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c0043OooO00o.f7631OooO0O0 = typedArray.getString(index);
                    } else {
                        c0043OooO00o.f7630OooO00o = typedArray.getResourceId(index, c0043OooO00o.f7630OooO00o);
                    }
                    break;
                case 99:
                    c0044OooO00o.OooO0Oo(99, typedArray.getBoolean(index, c0043OooO00o.f7635OooO0o0.f7659OooO0oo));
                    break;
            }
        }
    }

    public final C0043OooO00o OooO(int i) {
        if (this.f7613OooO0o.containsKey(Integer.valueOf(i))) {
            return this.f7613OooO0o.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void OooO00o(ConstraintLayout constraintLayout) {
        C0043OooO00o c0043OooO00o;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f7613OooO0o.containsKey(Integer.valueOf(id))) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("id unknown ");
                sbOooO0O0.append(p060o0000o.OooO.OooO0Oo(childAt));
                Log.w("ConstraintSet", sbOooO0O0.toString());
            } else {
                if (this.f7614OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f7613OooO0o.containsKey(Integer.valueOf(id)) && (c0043OooO00o = this.f7613OooO0o.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.OooO0o(childAt, c0043OooO00o.f7636OooO0oO);
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
        HashSet<Integer> hashSet = new HashSet(this.f7613OooO0o.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f7613OooO0o.containsKey(Integer.valueOf(id))) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("id unknown ");
                sbOooO0O0.append(p060o0000o.OooO.OooO0Oo(childAt));
                Log.w("ConstraintSet", sbOooO0O0.toString());
            } else {
                if (this.f7614OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f7613OooO0o.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0043OooO00o c0043OooO00o = this.f7613OooO0o.get(Integer.valueOf(id));
                        if (c0043OooO00o != null) {
                            if (childAt instanceof Barrier) {
                                c0043OooO00o.f7635OooO0o0.f7710OoooooO = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0043OooO00o.f7635OooO0o0.f7709Oooooo0);
                                barrier.setMargin(c0043OooO00o.f7635OooO0o0.f7708Oooooo);
                                barrier.setAllowsGoneWidget(c0043OooO00o.f7635OooO0o0.f7715o00Ooo);
                                OooO0O0 oooO0O0 = c0043OooO00o.f7635OooO0o0;
                                int[] iArr = oooO0O0.f7711Ooooooo;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = oooO0O0.f7717o0OoOo0;
                                    if (str != null) {
                                        oooO0O0.f7711Ooooooo = OooO0o(barrier, str);
                                        barrier.setReferencedIds(c0043OooO00o.f7635OooO0o0.f7711Ooooooo);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.OooO00o();
                            c0043OooO00o.OooO00o(layoutParams);
                            ConstraintAttribute.OooO0o(childAt, c0043OooO00o.f7636OooO0oO);
                            childAt.setLayoutParams(layoutParams);
                            OooO0o oooO0o = c0043OooO00o.f7632OooO0OO;
                            if (oooO0o.f7735OooO0OO == 0) {
                                childAt.setVisibility(oooO0o.f7734OooO0O0);
                            }
                            childAt.setAlpha(c0043OooO00o.f7632OooO0OO.f7736OooO0Oo);
                            childAt.setRotation(c0043OooO00o.f7634OooO0o.f7618OooO0O0);
                            childAt.setRotationX(c0043OooO00o.f7634OooO0o.f7619OooO0OO);
                            childAt.setRotationY(c0043OooO00o.f7634OooO0o.f7620OooO0Oo);
                            childAt.setScaleX(c0043OooO00o.f7634OooO0o.f7622OooO0o0);
                            childAt.setScaleY(c0043OooO00o.f7634OooO0o.f7621OooO0o);
                            OooO oooO = c0043OooO00o.f7634OooO0o;
                            if (oooO.f7616OooO != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(c0043OooO00o.f7634OooO0o.f7616OooO);
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
                                if (!Float.isNaN(oooO.f7623OooO0oO)) {
                                    childAt.setPivotX(c0043OooO00o.f7634OooO0o.f7623OooO0oO);
                                }
                                if (!Float.isNaN(c0043OooO00o.f7634OooO0o.f7624OooO0oo)) {
                                    childAt.setPivotY(c0043OooO00o.f7634OooO0o.f7624OooO0oo);
                                }
                            }
                            childAt.setTranslationX(c0043OooO00o.f7634OooO0o.f7625OooOO0);
                            childAt.setTranslationY(c0043OooO00o.f7634OooO0o.f7626OooOO0O);
                            childAt.setTranslationZ(c0043OooO00o.f7634OooO0o.f7627OooOO0o);
                            OooO oooO2 = c0043OooO00o.f7634OooO0o;
                            if (oooO2.f7629OooOOO0) {
                                childAt.setElevation(oooO2.f7628OooOOO);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C0043OooO00o c0043OooO00o2 = this.f7613OooO0o.get(num);
            if (c0043OooO00o2 != null) {
                if (c0043OooO00o2.f7635OooO0o0.f7710OoooooO == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    OooO0O0 oooO0O1 = c0043OooO00o2.f7635OooO0o0;
                    int[] iArr2 = oooO0O1.f7711Ooooooo;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = oooO0O1.f7717o0OoOo0;
                        if (str2 != null) {
                            oooO0O1.f7711Ooooooo = OooO0o(barrier2, str2);
                            barrier2.setReferencedIds(c0043OooO00o2.f7635OooO0o0.f7711Ooooooo);
                        }
                    }
                    barrier2.setType(c0043OooO00o2.f7635OooO0o0.f7709Oooooo0);
                    barrier2.setMargin(c0043OooO00o2.f7635OooO0o0.f7708Oooooo);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.OooOo00();
                    c0043OooO00o2.OooO00o(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (c0043OooO00o2.f7635OooO0o0.f7652OooO00o) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    c0043OooO00o2.OooO00o(layoutParamsGenerateDefaultLayoutParams2);
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

    public final int[] OooO0o(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = o000Oo0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public final void OooO0o0(ConstraintLayout constraintLayout) {
        OooO00o oooO00o = this;
        int childCount = constraintLayout.getChildCount();
        oooO00o.f7613OooO0o.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oooO00o.f7614OooO0o0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!oooO00o.f7613OooO0o.containsKey(Integer.valueOf(id))) {
                oooO00o.f7613OooO0o.put(Integer.valueOf(id), new C0043OooO00o());
            }
            C0043OooO00o c0043OooO00o = oooO00o.f7613OooO0o.get(Integer.valueOf(id));
            if (c0043OooO00o != null) {
                HashMap<String, ConstraintAttribute> map = oooO00o.f7612OooO0Oo;
                HashMap<String, ConstraintAttribute> map2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map.keySet()) {
                    ConstraintAttribute constraintAttribute = map.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            try {
                                map2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
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
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                    }
                }
                c0043OooO00o.f7636OooO0oO = map2;
                c0043OooO00o.OooO0OO(id, layoutParams);
                c0043OooO00o.f7632OooO0OO.f7734OooO0O0 = childAt.getVisibility();
                c0043OooO00o.f7632OooO0OO.f7736OooO0Oo = childAt.getAlpha();
                c0043OooO00o.f7634OooO0o.f7618OooO0O0 = childAt.getRotation();
                c0043OooO00o.f7634OooO0o.f7619OooO0OO = childAt.getRotationX();
                c0043OooO00o.f7634OooO0o.f7620OooO0Oo = childAt.getRotationY();
                c0043OooO00o.f7634OooO0o.f7622OooO0o0 = childAt.getScaleX();
                c0043OooO00o.f7634OooO0o.f7621OooO0o = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    OooO oooO = c0043OooO00o.f7634OooO0o;
                    oooO.f7623OooO0oO = pivotX;
                    oooO.f7624OooO0oo = pivotY;
                }
                c0043OooO00o.f7634OooO0o.f7625OooOO0 = childAt.getTranslationX();
                c0043OooO00o.f7634OooO0o.f7626OooOO0O = childAt.getTranslationY();
                c0043OooO00o.f7634OooO0o.f7627OooOO0o = childAt.getTranslationZ();
                OooO oooO2 = c0043OooO00o.f7634OooO0o;
                if (oooO2.f7629OooOOO0) {
                    oooO2.f7628OooOOO = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0043OooO00o.f7635OooO0o0.f7715o00Ooo = barrier.getAllowsGoneWidget();
                    c0043OooO00o.f7635OooO0o0.f7711Ooooooo = barrier.getReferencedIds();
                    c0043OooO00o.f7635OooO0o0.f7709Oooooo0 = barrier.getType();
                    c0043OooO00o.f7635OooO0o0.f7708Oooooo = barrier.getMargin();
                }
            }
            i++;
            oooO00o = this;
        }
    }

    public final C0043OooO00o OooO0oO(Context context, AttributeSet attributeSet, boolean z) {
        C0043OooO00o c0043OooO00o = new C0043OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? o000O00.ConstraintOverride : o000O00.Constraint);
        if (z) {
            OooOOOO(c0043OooO00o, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index != o000O00.Constraint_android_id && o000O00.Constraint_android_layout_marginStart != index && o000O00.Constraint_android_layout_marginEnd != index) {
                    c0043OooO00o.f7633OooO0Oo.f7721OooO00o = true;
                    c0043OooO00o.f7635OooO0o0.f7653OooO0O0 = true;
                    c0043OooO00o.f7632OooO0OO.f7733OooO00o = true;
                    c0043OooO00o.f7634OooO0o.f7617OooO00o = true;
                }
                switch (f7608OooO0oo.get(index)) {
                    case 1:
                        OooO0O0 oooO0O0 = c0043OooO00o.f7635OooO0o0;
                        oooO0O0.f7668OooOOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O0.f7668OooOOo0);
                        break;
                    case 2:
                        OooO0O0 oooO0O1 = c0043OooO00o.f7635OooO0o0;
                        oooO0O1.f7687Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O1.f7687Oooo0O0);
                        break;
                    case 3:
                        OooO0O0 oooO0O2 = c0043OooO00o.f7635OooO0o0;
                        oooO0O2.f7666OooOOOo = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O2.f7666OooOOOo);
                        break;
                    case 4:
                        OooO0O0 oooO0O3 = c0043OooO00o.f7635OooO0o0;
                        oooO0O3.f7665OooOOOO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O3.f7665OooOOOO);
                        break;
                    case 5:
                        c0043OooO00o.f7635OooO0o0.f7675OooOoO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        OooO0O0 oooO0O4 = c0043OooO00o.f7635OooO0o0;
                        oooO0O4.f7680OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O4.f7680OooOooO);
                        break;
                    case 7:
                        OooO0O0 oooO0O5 = c0043OooO00o.f7635OooO0o0;
                        oooO0O5.f7681OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O5.f7681OooOooo);
                        break;
                    case 8:
                        OooO0O0 oooO0O6 = c0043OooO00o.f7635OooO0o0;
                        oooO0O6.f7688Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O6.f7688Oooo0OO);
                        break;
                    case 9:
                        OooO0O0 oooO0O7 = c0043OooO00o.f7635OooO0o0;
                        oooO0O7.f7674OooOo0o = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O7.f7674OooOo0o);
                        break;
                    case 10:
                        OooO0O0 oooO0O8 = c0043OooO00o.f7635OooO0o0;
                        oooO0O8.f7673OooOo0O = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O8.f7673OooOo0O);
                        break;
                    case 11:
                        OooO0O0 oooO0O9 = c0043OooO00o.f7635OooO0o0;
                        oooO0O9.f7695OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O9.f7695OoooO00);
                        break;
                    case 12:
                        OooO0O0 oooO0O10 = c0043OooO00o.f7635OooO0o0;
                        oooO0O10.f7694OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O10.f7694OoooO0);
                        break;
                    case 13:
                        OooO0O0 oooO0O11 = c0043OooO00o.f7635OooO0o0;
                        oooO0O11.f7691Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O11.f7691Oooo0oO);
                        break;
                    case 14:
                        OooO0O0 oooO0O12 = c0043OooO00o.f7635OooO0o0;
                        oooO0O12.f7682Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O12.f7682Oooo);
                        break;
                    case 15:
                        OooO0O0 oooO0O13 = c0043OooO00o.f7635OooO0o0;
                        oooO0O13.f7696OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O13.f7696OoooO0O);
                        break;
                    case 16:
                        OooO0O0 oooO0O14 = c0043OooO00o.f7635OooO0o0;
                        oooO0O14.f7692Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O14.f7692Oooo0oo);
                        break;
                    case 17:
                        OooO0O0 oooO0O15 = c0043OooO00o.f7635OooO0o0;
                        oooO0O15.f7657OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O15.f7657OooO0o0);
                        break;
                    case 18:
                        OooO0O0 oooO0O16 = c0043OooO00o.f7635OooO0o0;
                        oooO0O16.f7656OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O16.f7656OooO0o);
                        break;
                    case 19:
                        OooO0O0 oooO0O17 = c0043OooO00o.f7635OooO0o0;
                        oooO0O17.f7658OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, oooO0O17.f7658OooO0oO);
                        break;
                    case 20:
                        OooO0O0 oooO0O18 = c0043OooO00o.f7635OooO0o0;
                        oooO0O18.f7670OooOo = typedArrayObtainStyledAttributes.getFloat(index, oooO0O18.f7670OooOo);
                        break;
                    case 21:
                        OooO0O0 oooO0O19 = c0043OooO00o.f7635OooO0o0;
                        oooO0O19.f7655OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, oooO0O19.f7655OooO0Oo);
                        break;
                    case 22:
                        OooO0o oooO0o = c0043OooO00o.f7632OooO0OO;
                        oooO0o.f7734OooO0O0 = typedArrayObtainStyledAttributes.getInt(index, oooO0o.f7734OooO0O0);
                        OooO0o oooO0o2 = c0043OooO00o.f7632OooO0OO;
                        oooO0o2.f7734OooO0O0 = f7607OooO0oO[oooO0o2.f7734OooO0O0];
                        break;
                    case 23:
                        OooO0O0 oooO0O20 = c0043OooO00o.f7635OooO0o0;
                        oooO0O20.f7654OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, oooO0O20.f7654OooO0OO);
                        break;
                    case 24:
                        OooO0O0 oooO0O21 = c0043OooO00o.f7635OooO0o0;
                        oooO0O21.f7685Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O21.f7685Oooo00O);
                        break;
                    case 25:
                        OooO0O0 oooO0O22 = c0043OooO00o.f7635OooO0o0;
                        oooO0O22.f7651OooO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O22.f7651OooO);
                        break;
                    case 26:
                        OooO0O0 oooO0O23 = c0043OooO00o.f7635OooO0o0;
                        oooO0O23.f7660OooOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O23.f7660OooOO0);
                        break;
                    case 27:
                        OooO0O0 oooO0O24 = c0043OooO00o.f7635OooO0o0;
                        oooO0O24.f7684Oooo000 = typedArrayObtainStyledAttributes.getInt(index, oooO0O24.f7684Oooo000);
                        break;
                    case 28:
                        OooO0O0 oooO0O25 = c0043OooO00o.f7635OooO0o0;
                        oooO0O25.f7686Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O25.f7686Oooo00o);
                        break;
                    case 29:
                        OooO0O0 oooO0O26 = c0043OooO00o.f7635OooO0o0;
                        oooO0O26.f7661OooOO0O = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O26.f7661OooOO0O);
                        break;
                    case 30:
                        OooO0O0 oooO0O27 = c0043OooO00o.f7635OooO0o0;
                        oooO0O27.f7662OooOO0o = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O27.f7662OooOO0o);
                        break;
                    case 31:
                        OooO0O0 oooO0O28 = c0043OooO00o.f7635OooO0o0;
                        oooO0O28.f7690Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O28.f7690Oooo0o0);
                        break;
                    case 32:
                        OooO0O0 oooO0O29 = c0043OooO00o.f7635OooO0o0;
                        oooO0O29.f7672OooOo00 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O29.f7672OooOo00);
                        break;
                    case 33:
                        OooO0O0 oooO0O30 = c0043OooO00o.f7635OooO0o0;
                        oooO0O30.f7671OooOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O30.f7671OooOo0);
                        break;
                    case 34:
                        OooO0O0 oooO0O31 = c0043OooO00o.f7635OooO0o0;
                        oooO0O31.f7683Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O31.f7683Oooo0);
                        break;
                    case 35:
                        OooO0O0 oooO0O32 = c0043OooO00o.f7635OooO0o0;
                        oooO0O32.f7663OooOOO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O32.f7663OooOOO);
                        break;
                    case 36:
                        OooO0O0 oooO0O33 = c0043OooO00o.f7635OooO0o0;
                        oooO0O33.f7664OooOOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O33.f7664OooOOO0);
                        break;
                    case 37:
                        OooO0O0 oooO0O34 = c0043OooO00o.f7635OooO0o0;
                        oooO0O34.f7676OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0O34.f7676OooOoO0);
                        break;
                    case 38:
                        c0043OooO00o.f7630OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, c0043OooO00o.f7630OooO00o);
                        break;
                    case 39:
                        OooO0O0 oooO0O35 = c0043OooO00o.f7635OooO0o0;
                        oooO0O35.f7712o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, oooO0O35.f7712o000oOoO);
                        break;
                    case 40:
                        OooO0O0 oooO0O36 = c0043OooO00o.f7635OooO0o0;
                        oooO0O36.f7697OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0O36.f7697OoooOO0);
                        break;
                    case 41:
                        OooO0O0 oooO0O37 = c0043OooO00o.f7635OooO0o0;
                        oooO0O37.f7698OoooOOO = typedArrayObtainStyledAttributes.getInt(index, oooO0O37.f7698OoooOOO);
                        break;
                    case 42:
                        OooO0O0 oooO0O38 = c0043OooO00o.f7635OooO0o0;
                        oooO0O38.f7699OoooOOo = typedArrayObtainStyledAttributes.getInt(index, oooO0O38.f7699OoooOOo);
                        break;
                    case 43:
                        OooO0o oooO0o3 = c0043OooO00o.f7632OooO0OO;
                        oooO0o3.f7736OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0o3.f7736OooO0Oo);
                        break;
                    case 44:
                        OooO oooO = c0043OooO00o.f7634OooO0o;
                        oooO.f7629OooOOO0 = true;
                        oooO.f7628OooOOO = typedArrayObtainStyledAttributes.getDimension(index, oooO.f7628OooOOO);
                        break;
                    case 45:
                        OooO oooO2 = c0043OooO00o.f7634OooO0o;
                        oooO2.f7619OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, oooO2.f7619OooO0OO);
                        break;
                    case 46:
                        OooO oooO3 = c0043OooO00o.f7634OooO0o;
                        oooO3.f7620OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO3.f7620OooO0Oo);
                        break;
                    case 47:
                        OooO oooO4 = c0043OooO00o.f7634OooO0o;
                        oooO4.f7622OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO4.f7622OooO0o0);
                        break;
                    case 48:
                        OooO oooO5 = c0043OooO00o.f7634OooO0o;
                        oooO5.f7621OooO0o = typedArrayObtainStyledAttributes.getFloat(index, oooO5.f7621OooO0o);
                        break;
                    case 49:
                        OooO oooO6 = c0043OooO00o.f7634OooO0o;
                        oooO6.f7623OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, oooO6.f7623OooO0oO);
                        break;
                    case 50:
                        OooO oooO7 = c0043OooO00o.f7634OooO0o;
                        oooO7.f7624OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, oooO7.f7624OooO0oo);
                        break;
                    case 51:
                        OooO oooO8 = c0043OooO00o.f7634OooO0o;
                        oooO8.f7625OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, oooO8.f7625OooOO0);
                        break;
                    case 52:
                        OooO oooO9 = c0043OooO00o.f7634OooO0o;
                        oooO9.f7626OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, oooO9.f7626OooOO0O);
                        break;
                    case 53:
                        OooO oooO10 = c0043OooO00o.f7634OooO0o;
                        oooO10.f7627OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, oooO10.f7627OooOO0o);
                        break;
                    case 54:
                        OooO0O0 oooO0O39 = c0043OooO00o.f7635OooO0o0;
                        oooO0O39.f7700OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, oooO0O39.f7700OoooOo0);
                        break;
                    case 55:
                        OooO0O0 oooO0O40 = c0043OooO00o.f7635OooO0o0;
                        oooO0O40.f7701OoooOoO = typedArrayObtainStyledAttributes.getInt(index, oooO0O40.f7701OoooOoO);
                        break;
                    case 56:
                        OooO0O0 oooO0O41 = c0043OooO00o.f7635OooO0o0;
                        oooO0O41.f7702OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O41.f7702OoooOoo);
                        break;
                    case 57:
                        OooO0O0 oooO0O42 = c0043OooO00o.f7635OooO0o0;
                        oooO0O42.f7703Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O42.f7703Ooooo00);
                        break;
                    case 58:
                        OooO0O0 oooO0O43 = c0043OooO00o.f7635OooO0o0;
                        oooO0O43.f7704Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O43.f7704Ooooo0o);
                        break;
                    case 59:
                        OooO0O0 oooO0O44 = c0043OooO00o.f7635OooO0o0;
                        oooO0O44.f7705OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O44.f7705OooooO0);
                        break;
                    case 60:
                        OooO oooO11 = c0043OooO00o.f7634OooO0o;
                        oooO11.f7618OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, oooO11.f7618OooO0O0);
                        break;
                    case 61:
                        OooO0O0 oooO0O45 = c0043OooO00o.f7635OooO0o0;
                        oooO0O45.f7677OooOoOO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O45.f7677OooOoOO);
                        break;
                    case 62:
                        OooO0O0 oooO0O46 = c0043OooO00o.f7635OooO0o0;
                        oooO0O46.f7679OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O46.f7679OooOoo0);
                        break;
                    case 63:
                        OooO0O0 oooO0O47 = c0043OooO00o.f7635OooO0o0;
                        oooO0O47.f7678OooOoo = typedArrayObtainStyledAttributes.getFloat(index, oooO0O47.f7678OooOoo);
                        break;
                    case 64:
                        OooO0OO oooO0OO = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO.f7722OooO0O0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0OO.f7722OooO0O0);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0043OooO00o.f7633OooO0Oo.f7724OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c0043OooO00o.f7633OooO0Oo.f7724OooO0Oo = o000000O.f27580OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 66:
                        c0043OooO00o.f7633OooO0Oo.f7725OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        OooO0OO oooO0OO2 = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO2.f7728OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO2.f7728OooO0oo);
                        break;
                    case 68:
                        OooO0o oooO0o4 = c0043OooO00o.f7632OooO0OO;
                        oooO0o4.f7737OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0o4.f7737OooO0o0);
                        break;
                    case 69:
                        c0043OooO00o.f7635OooO0o0.f7706OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        c0043OooO00o.f7635OooO0o0.f7707OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        OooO0O0 oooO0O48 = c0043OooO00o.f7635OooO0o0;
                        oooO0O48.f7709Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, oooO0O48.f7709Oooooo0);
                        break;
                    case 73:
                        OooO0O0 oooO0O49 = c0043OooO00o.f7635OooO0o0;
                        oooO0O49.f7708Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O49.f7708Oooooo);
                        break;
                    case 74:
                        c0043OooO00o.f7635OooO0o0.f7717o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        OooO0O0 oooO0O50 = c0043OooO00o.f7635OooO0o0;
                        oooO0O50.f7715o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O50.f7715o00Ooo);
                        break;
                    case 76:
                        OooO0OO oooO0OO3 = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO3.f7726OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, oooO0OO3.f7726OooO0o0);
                        break;
                    case 77:
                        c0043OooO00o.f7635OooO0o0.f7718ooOO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        OooO0o oooO0o5 = c0043OooO00o.f7632OooO0OO;
                        oooO0o5.f7735OooO0OO = typedArrayObtainStyledAttributes.getInt(index, oooO0o5.f7735OooO0OO);
                        break;
                    case 79:
                        OooO0OO oooO0OO4 = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO4.f7727OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO4.f7727OooO0oO);
                        break;
                    case 80:
                        OooO0O0 oooO0O51 = c0043OooO00o.f7635OooO0o0;
                        oooO0O51.f7713o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O51.f7713o00O0O);
                        break;
                    case 81:
                        OooO0O0 oooO0O52 = c0043OooO00o.f7635OooO0o0;
                        oooO0O52.f7714o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O52.f7714o00Oo0);
                        break;
                    case 82:
                        OooO0OO oooO0OO5 = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO5.f7723OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO5.f7723OooO0OO);
                        break;
                    case 83:
                        OooO oooO12 = c0043OooO00o.f7634OooO0o;
                        oooO12.f7616OooO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO12.f7616OooO);
                        break;
                    case 84:
                        OooO0OO oooO0OO6 = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO6.f7729OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO6.f7729OooOO0);
                        break;
                    case 85:
                        OooO0OO oooO0OO7 = c0043OooO00o.f7633OooO0Oo;
                        oooO0OO7.f7720OooO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO7.f7720OooO);
                        break;
                    case 86:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            c0043OooO00o.f7633OooO0Oo.f7732OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            OooO0OO oooO0OO8 = c0043OooO00o.f7633OooO0Oo;
                            if (oooO0OO8.f7732OooOOO0 != -1) {
                                oooO0OO8.f7731OooOO0o = -2;
                            }
                        } else if (i2 == 3) {
                            c0043OooO00o.f7633OooO0Oo.f7730OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                            if (c0043OooO00o.f7633OooO0Oo.f7730OooOO0O.indexOf("/") > 0) {
                                c0043OooO00o.f7633OooO0Oo.f7732OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0043OooO00o.f7633OooO0Oo.f7731OooOO0o = -2;
                            } else {
                                c0043OooO00o.f7633OooO0Oo.f7731OooOO0o = -1;
                            }
                        } else {
                            OooO0OO oooO0OO9 = c0043OooO00o.f7633OooO0Oo;
                            oooO0OO9.f7731OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO9.f7732OooOOO0);
                        }
                        break;
                    case 87:
                        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("unused attribute 0x");
                        sbOooO0O0.append(Integer.toHexString(index));
                        sbOooO0O0.append("   ");
                        sbOooO0O0.append(f7608OooO0oo.get(index));
                        Log.w("ConstraintSet", sbOooO0O0.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Unknown attribute 0x");
                        sbOooO0O1.append(Integer.toHexString(index));
                        sbOooO0O1.append("   ");
                        sbOooO0O1.append(f7608OooO0oo.get(index));
                        Log.w("ConstraintSet", sbOooO0O1.toString());
                        break;
                    case 91:
                        OooO0O0 oooO0O53 = c0043OooO00o.f7635OooO0o0;
                        oooO0O53.f7667OooOOo = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O53.f7667OooOOo);
                        break;
                    case 92:
                        OooO0O0 oooO0O54 = c0043OooO00o.f7635OooO0o0;
                        oooO0O54.f7669OooOOoo = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O54.f7669OooOOoo);
                        break;
                    case 93:
                        OooO0O0 oooO0O55 = c0043OooO00o.f7635OooO0o0;
                        oooO0O55.f7689Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O55.f7689Oooo0o);
                        break;
                    case 94:
                        OooO0O0 oooO0O56 = c0043OooO00o.f7635OooO0o0;
                        oooO0O56.f7693OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O56.f7693OoooO);
                        break;
                    case 95:
                        OooOOO0(c0043OooO00o.f7635OooO0o0, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        OooOOO0(c0043OooO00o.f7635OooO0o0, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        OooO0O0 oooO0O57 = c0043OooO00o.f7635OooO0o0;
                        oooO0O57.f7716o00o0O = typedArrayObtainStyledAttributes.getInt(index, oooO0O57.f7716o00o0O);
                        break;
                }
            }
            OooO0O0 oooO0O58 = c0043OooO00o.f7635OooO0o0;
            if (oooO0O58.f7717o0OoOo0 != null) {
                oooO0O58.f7711Ooooooo = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0043OooO00o;
    }

    public final C0043OooO00o OooO0oo(int i) {
        if (!this.f7613OooO0o.containsKey(Integer.valueOf(i))) {
            this.f7613OooO0o.put(Integer.valueOf(i), new C0043OooO00o());
        }
        return this.f7613OooO0o.get(Integer.valueOf(i));
    }

    public final void OooOO0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0043OooO00o c0043OooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0043OooO00oOooO0oO.f7635OooO0o0.f7652OooO00o = true;
                    }
                    this.f7613OooO0o.put(Integer.valueOf(c0043OooO00oOooO0oO.f7630OooO00o), c0043OooO00oOooO0oO);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OooOO0O(Context context, XmlPullParser xmlPullParser) {
        C0043OooO00o c0043OooO00oOooO0oO;
        try {
            int eventType = xmlPullParser.getEventType();
            C0043OooO00o c0043OooO00o = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            c0043OooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            c0043OooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            c0043OooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlPullParser), false);
                            OooO0O0 oooO0O0 = c0043OooO00oOooO0oO.f7635OooO0o0;
                            oooO0O0.f7652OooO00o = true;
                            oooO0O0.f7653OooO0O0 = true;
                            break;
                        case "Barrier":
                            c0043OooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlPullParser), false);
                            c0043OooO00oOooO0oO.f7635OooO0o0.f7710OoooooO = 1;
                            break;
                        case "PropertySet":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7632OooO0OO.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7634OooO0o.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7635OooO0o0.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7633OooO0Oo.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            ConstraintAttribute.OooO0o0(context, xmlPullParser, c0043OooO00o.f7636OooO0oO);
                            continue;
                            break;
                            break;
                        default:
                            continue;
                            break;
                    }
                    c0043OooO00o = c0043OooO00oOooO0oO;
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
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
                        this.f7613OooO0o.put(Integer.valueOf(c0043OooO00o.f7630OooO00o), c0043OooO00o);
                        c0043OooO00o = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void OooOOOo(int i, float f) {
        OooO0oo(i).f7635OooO0o0.f7670OooOo = f;
    }
}
