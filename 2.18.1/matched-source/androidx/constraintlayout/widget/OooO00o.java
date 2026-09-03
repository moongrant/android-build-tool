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
    public String f7594OooO00o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f7592OooO0oO = {0, 4, 8};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static SparseIntArray f7593OooO0oo = new SparseIntArray();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static SparseIntArray f7591OooO = new SparseIntArray();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f7595OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f7596OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f7597OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f7599OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HashMap<Integer, C0043OooO00o> f7598OooO0o = new HashMap<>();

    public static class OooO {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static SparseIntArray f7600OooOOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7602OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f7603OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f7604OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f7605OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f7607OooO0o0 = 1.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f7606OooO0o = 1.0f;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f7608OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f7609OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7601OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f7610OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f7611OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f7612OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f7614OooOOO0 = false;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f7613OooOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7600OooOOOO = sparseIntArray;
            sparseIntArray.append(o000O00.Transform_android_rotation, 1);
            f7600OooOOOO.append(o000O00.Transform_android_rotationX, 2);
            f7600OooOOOO.append(o000O00.Transform_android_rotationY, 3);
            f7600OooOOOO.append(o000O00.Transform_android_scaleX, 4);
            f7600OooOOOO.append(o000O00.Transform_android_scaleY, 5);
            f7600OooOOOO.append(o000O00.Transform_android_transformPivotX, 6);
            f7600OooOOOO.append(o000O00.Transform_android_transformPivotY, 7);
            f7600OooOOOO.append(o000O00.Transform_android_translationX, 8);
            f7600OooOOOO.append(o000O00.Transform_android_translationY, 9);
            f7600OooOOOO.append(o000O00.Transform_android_translationZ, 10);
            f7600OooOOOO.append(o000O00.Transform_android_elevation, 11);
            f7600OooOOOO.append(o000O00.Transform_transformPivotTarget, 12);
        }

        public final void OooO00o(OooO oooO) {
            this.f7602OooO00o = oooO.f7602OooO00o;
            this.f7603OooO0O0 = oooO.f7603OooO0O0;
            this.f7604OooO0OO = oooO.f7604OooO0OO;
            this.f7605OooO0Oo = oooO.f7605OooO0Oo;
            this.f7607OooO0o0 = oooO.f7607OooO0o0;
            this.f7606OooO0o = oooO.f7606OooO0o;
            this.f7608OooO0oO = oooO.f7608OooO0oO;
            this.f7609OooO0oo = oooO.f7609OooO0oo;
            this.f7601OooO = oooO.f7601OooO;
            this.f7610OooOO0 = oooO.f7610OooOO0;
            this.f7611OooOO0O = oooO.f7611OooOO0O;
            this.f7612OooOO0o = oooO.f7612OooOO0o;
            this.f7614OooOOO0 = oooO.f7614OooOOO0;
            this.f7613OooOOO = oooO.f7613OooOOO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.Transform);
            this.f7602OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f7600OooOOOO.get(index)) {
                    case 1:
                        this.f7603OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7603OooO0O0);
                        break;
                    case 2:
                        this.f7604OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f7604OooO0OO);
                        break;
                    case 3:
                        this.f7605OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7605OooO0Oo);
                        break;
                    case 4:
                        this.f7607OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7607OooO0o0);
                        break;
                    case 5:
                        this.f7606OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f7606OooO0o);
                        break;
                    case 6:
                        this.f7608OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f7608OooO0oO);
                        break;
                    case 7:
                        this.f7609OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, this.f7609OooO0oo);
                        break;
                    case 8:
                        this.f7610OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f7610OooOO0);
                        break;
                    case 9:
                        this.f7611OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f7611OooOO0O);
                        break;
                    case 10:
                        this.f7612OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f7612OooOO0o);
                        break;
                    case 11:
                        this.f7614OooOOO0 = true;
                        this.f7613OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f7613OooOOO);
                        break;
                    case 12:
                        this.f7601OooO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7601OooO);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0043OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7615OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f7616OooO0O0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public C0044OooO00o f7622OooO0oo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o f7617OooO0OO = new OooO0o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f7618OooO0Oo = new OooO0OO();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0O0 f7620OooO0o0 = new OooO0O0();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO f7619OooO0o = new OooO();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f7621OooO0oO = new HashMap<>();

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0044OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int[] f7624OooO00o = new int[10];

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int[] f7625OooO0O0 = new int[10];

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f7626OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int[] f7627OooO0Oo = new int[10];

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float[] f7629OooO0o0 = new float[10];

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f7628OooO0o = 0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int[] f7630OooO0oO = new int[5];

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public String[] f7631OooO0oo = new String[5];

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f7623OooO = 0;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public int[] f7632OooOO0 = new int[4];

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public boolean[] f7633OooOO0O = new boolean[4];

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public int f7634OooOO0o = 0;

            public final void OooO00o(int i, float f) {
                int i2 = this.f7628OooO0o;
                int[] iArr = this.f7627OooO0Oo;
                if (i2 >= iArr.length) {
                    this.f7627OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f7629OooO0o0;
                    this.f7629OooO0o0 = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f7627OooO0Oo;
                int i3 = this.f7628OooO0o;
                iArr2[i3] = i;
                float[] fArr2 = this.f7629OooO0o0;
                this.f7628OooO0o = i3 + 1;
                fArr2[i3] = f;
            }

            public final void OooO0O0(int i, int i2) {
                int i3 = this.f7626OooO0OO;
                int[] iArr = this.f7624OooO00o;
                if (i3 >= iArr.length) {
                    this.f7624OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f7625OooO0O0;
                    this.f7625OooO0O0 = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f7624OooO00o;
                int i4 = this.f7626OooO0OO;
                iArr3[i4] = i;
                int[] iArr4 = this.f7625OooO0O0;
                this.f7626OooO0OO = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void OooO0OO(int i, String str) {
                int i2 = this.f7623OooO;
                int[] iArr = this.f7630OooO0oO;
                if (i2 >= iArr.length) {
                    this.f7630OooO0oO = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f7631OooO0oo;
                    this.f7631OooO0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f7630OooO0oO;
                int i3 = this.f7623OooO;
                iArr2[i3] = i;
                String[] strArr2 = this.f7631OooO0oo;
                this.f7623OooO = i3 + 1;
                strArr2[i3] = str;
            }

            public final void OooO0Oo(int i, boolean z) {
                int i2 = this.f7634OooOO0o;
                int[] iArr = this.f7632OooOO0;
                if (i2 >= iArr.length) {
                    this.f7632OooOO0 = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f7633OooOO0O;
                    this.f7633OooOO0O = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f7632OooOO0;
                int i3 = this.f7634OooOO0o;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f7633OooOO0O;
                this.f7634OooOO0o = i3 + 1;
                zArr2[i3] = z;
            }

            public final void OooO0o0(C0043OooO00o c0043OooO00o) {
                for (int i = 0; i < this.f7626OooO0OO; i++) {
                    int i2 = this.f7624OooO00o[i];
                    int i3 = this.f7625OooO0O0[i];
                    int[] iArr = OooO00o.f7592OooO0oO;
                    if (i2 == 6) {
                        c0043OooO00o.f7620OooO0o0.f7665OooOooO = i3;
                    } else if (i2 == 7) {
                        c0043OooO00o.f7620OooO0o0.f7666OooOooo = i3;
                    } else if (i2 == 8) {
                        c0043OooO00o.f7620OooO0o0.f7673Oooo0OO = i3;
                    } else if (i2 == 27) {
                        c0043OooO00o.f7620OooO0o0.f7669Oooo000 = i3;
                    } else if (i2 == 28) {
                        c0043OooO00o.f7620OooO0o0.f7671Oooo00o = i3;
                    } else if (i2 == 41) {
                        c0043OooO00o.f7620OooO0o0.f7683OoooOOO = i3;
                    } else if (i2 == 42) {
                        c0043OooO00o.f7620OooO0o0.f7684OoooOOo = i3;
                    } else if (i2 == 61) {
                        c0043OooO00o.f7620OooO0o0.f7662OooOoOO = i3;
                    } else if (i2 == 62) {
                        c0043OooO00o.f7620OooO0o0.f7664OooOoo0 = i3;
                    } else if (i2 == 72) {
                        c0043OooO00o.f7620OooO0o0.f7694Oooooo0 = i3;
                    } else if (i2 == 73) {
                        c0043OooO00o.f7620OooO0o0.f7693Oooooo = i3;
                    } else if (i2 == 2) {
                        c0043OooO00o.f7620OooO0o0.f7672Oooo0O0 = i3;
                    } else if (i2 == 31) {
                        c0043OooO00o.f7620OooO0o0.f7675Oooo0o0 = i3;
                    } else if (i2 == 34) {
                        c0043OooO00o.f7620OooO0o0.f7668Oooo0 = i3;
                    } else if (i2 == 38) {
                        c0043OooO00o.f7615OooO00o = i3;
                    } else if (i2 == 64) {
                        c0043OooO00o.f7618OooO0Oo.f7707OooO0O0 = i3;
                    } else if (i2 == 66) {
                        c0043OooO00o.f7618OooO0Oo.f7710OooO0o = i3;
                    } else if (i2 == 76) {
                        c0043OooO00o.f7618OooO0Oo.f7711OooO0o0 = i3;
                    } else if (i2 == 78) {
                        c0043OooO00o.f7617OooO0OO.f7720OooO0OO = i3;
                    } else if (i2 == 97) {
                        c0043OooO00o.f7620OooO0o0.f7701o00o0O = i3;
                    } else if (i2 == 93) {
                        c0043OooO00o.f7620OooO0o0.f7674Oooo0o = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                c0043OooO00o.f7620OooO0o0.f7680OoooO00 = i3;
                                break;
                            case 12:
                                c0043OooO00o.f7620OooO0o0.f7679OoooO0 = i3;
                                break;
                            case 13:
                                c0043OooO00o.f7620OooO0o0.f7676Oooo0oO = i3;
                                break;
                            case 14:
                                c0043OooO00o.f7620OooO0o0.f7667Oooo = i3;
                                break;
                            case 15:
                                c0043OooO00o.f7620OooO0o0.f7681OoooO0O = i3;
                                break;
                            case 16:
                                c0043OooO00o.f7620OooO0o0.f7677Oooo0oo = i3;
                                break;
                            case 17:
                                c0043OooO00o.f7620OooO0o0.f7642OooO0o0 = i3;
                                break;
                            case 18:
                                c0043OooO00o.f7620OooO0o0.f7641OooO0o = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        c0043OooO00o.f7620OooO0o0.f7640OooO0Oo = i3;
                                        break;
                                    case 22:
                                        c0043OooO00o.f7617OooO0OO.f7719OooO0O0 = i3;
                                        break;
                                    case 23:
                                        c0043OooO00o.f7620OooO0o0.f7639OooO0OO = i3;
                                        break;
                                    case 24:
                                        c0043OooO00o.f7620OooO0o0.f7670Oooo00O = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                c0043OooO00o.f7620OooO0o0.f7685OoooOo0 = i3;
                                                break;
                                            case 55:
                                                c0043OooO00o.f7620OooO0o0.f7686OoooOoO = i3;
                                                break;
                                            case 56:
                                                c0043OooO00o.f7620OooO0o0.f7687OoooOoo = i3;
                                                break;
                                            case 57:
                                                c0043OooO00o.f7620OooO0o0.f7688Ooooo00 = i3;
                                                break;
                                            case 58:
                                                c0043OooO00o.f7620OooO0o0.f7689Ooooo0o = i3;
                                                break;
                                            case 59:
                                                c0043OooO00o.f7620OooO0o0.f7690OooooO0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        c0043OooO00o.f7618OooO0Oo.f7708OooO0OO = i3;
                                                        break;
                                                    case 83:
                                                        c0043OooO00o.f7619OooO0o.f7601OooO = i3;
                                                        break;
                                                    case 84:
                                                        c0043OooO00o.f7618OooO0Oo.f7714OooOO0 = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                c0043OooO00o.f7618OooO0Oo.f7716OooOO0o = i3;
                                                                break;
                                                            case 89:
                                                                c0043OooO00o.f7618OooO0Oo.f7717OooOOO0 = i3;
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
                        c0043OooO00o.f7620OooO0o0.f7678OoooO = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f7628OooO0o; i4++) {
                    int i5 = this.f7627OooO0Oo[i4];
                    float f = this.f7629OooO0o0[i4];
                    int[] iArr2 = OooO00o.f7592OooO0oO;
                    if (i5 == 19) {
                        c0043OooO00o.f7620OooO0o0.f7643OooO0oO = f;
                    } else if (i5 == 20) {
                        c0043OooO00o.f7620OooO0o0.f7655OooOo = f;
                    } else if (i5 == 37) {
                        c0043OooO00o.f7620OooO0o0.f7661OooOoO0 = f;
                    } else if (i5 == 60) {
                        c0043OooO00o.f7619OooO0o.f7603OooO0O0 = f;
                    } else if (i5 == 63) {
                        c0043OooO00o.f7620OooO0o0.f7663OooOoo = f;
                    } else if (i5 == 79) {
                        c0043OooO00o.f7618OooO0Oo.f7712OooO0oO = f;
                    } else if (i5 == 85) {
                        c0043OooO00o.f7618OooO0Oo.f7705OooO = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            c0043OooO00o.f7620OooO0o0.f7697o000oOoO = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    c0043OooO00o.f7617OooO0OO.f7721OooO0Oo = f;
                                    break;
                                case 44:
                                    OooO oooO = c0043OooO00o.f7619OooO0o;
                                    oooO.f7613OooOOO = f;
                                    oooO.f7614OooOOO0 = true;
                                    break;
                                case 45:
                                    c0043OooO00o.f7619OooO0o.f7604OooO0OO = f;
                                    break;
                                case 46:
                                    c0043OooO00o.f7619OooO0o.f7605OooO0Oo = f;
                                    break;
                                case 47:
                                    c0043OooO00o.f7619OooO0o.f7607OooO0o0 = f;
                                    break;
                                case 48:
                                    c0043OooO00o.f7619OooO0o.f7606OooO0o = f;
                                    break;
                                case 49:
                                    c0043OooO00o.f7619OooO0o.f7608OooO0oO = f;
                                    break;
                                case 50:
                                    c0043OooO00o.f7619OooO0o.f7609OooO0oo = f;
                                    break;
                                case 51:
                                    c0043OooO00o.f7619OooO0o.f7610OooOO0 = f;
                                    break;
                                case 52:
                                    c0043OooO00o.f7619OooO0o.f7611OooOO0O = f;
                                    break;
                                case 53:
                                    c0043OooO00o.f7619OooO0o.f7612OooOO0o = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            c0043OooO00o.f7618OooO0Oo.f7713OooO0oo = f;
                                            break;
                                        case 68:
                                            c0043OooO00o.f7617OooO0OO.f7722OooO0o0 = f;
                                            break;
                                        case 69:
                                            c0043OooO00o.f7620OooO0o0.f7691OooooOO = f;
                                            break;
                                        case 70:
                                            c0043OooO00o.f7620OooO0o0.f7692OooooOo = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            c0043OooO00o.f7620OooO0o0.f7682OoooOO0 = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.f7623OooO; i6++) {
                    int i7 = this.f7630OooO0oO[i6];
                    String str = this.f7631OooO0oo[i6];
                    int[] iArr3 = OooO00o.f7592OooO0oO;
                    if (i7 == 5) {
                        c0043OooO00o.f7620OooO0o0.f7660OooOoO = str;
                    } else if (i7 == 65) {
                        c0043OooO00o.f7618OooO0Oo.f7709OooO0Oo = str;
                    } else if (i7 == 74) {
                        OooO0O0 oooO0O0 = c0043OooO00o.f7620OooO0o0;
                        oooO0O0.f7702o0OoOo0 = str;
                        oooO0O0.f7696Ooooooo = null;
                    } else if (i7 == 77) {
                        c0043OooO00o.f7620OooO0o0.f7703ooOO = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            c0043OooO00o.f7618OooO0Oo.f7715OooOO0O = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.f7634OooOO0o; i8++) {
                    int i9 = this.f7632OooOO0[i8];
                    boolean z = this.f7633OooOO0O[i8];
                    int[] iArr4 = OooO00o.f7592OooO0oO;
                    if (i9 == 44) {
                        c0043OooO00o.f7619OooO0o.f7614OooOOO0 = z;
                    } else if (i9 == 75) {
                        c0043OooO00o.f7620OooO0o0.f7700o00Ooo = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            c0043OooO00o.f7620OooO0o0.f7698o00O0O = z;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            c0043OooO00o.f7620OooO0o0.f7699o00Oo0 = z;
                        }
                    }
                }
            }
        }

        public final void OooO00o(ConstraintLayout.LayoutParams layoutParams) {
            OooO0O0 oooO0O0 = this.f7620OooO0o0;
            layoutParams.f7503OooO0o0 = oooO0O0.f7636OooO;
            layoutParams.f7502OooO0o = oooO0O0.f7645OooOO0;
            layoutParams.f7504OooO0oO = oooO0O0.f7646OooOO0O;
            layoutParams.f7505OooO0oo = oooO0O0.f7647OooOO0o;
            layoutParams.f7497OooO = oooO0O0.f7649OooOOO0;
            layoutParams.f7506OooOO0 = oooO0O0.f7648OooOOO;
            layoutParams.f7507OooOO0O = oooO0O0.f7650OooOOOO;
            layoutParams.f7508OooOO0o = oooO0O0.f7651OooOOOo;
            layoutParams.f7510OooOOO0 = oooO0O0.f7653OooOOo0;
            layoutParams.f7509OooOOO = oooO0O0.f7652OooOOo;
            layoutParams.f7511OooOOOO = oooO0O0.f7654OooOOoo;
            layoutParams.f7515OooOOoo = oooO0O0.f7657OooOo00;
            layoutParams.f7518OooOo00 = oooO0O0.f7656OooOo0;
            layoutParams.f7517OooOo0 = oooO0O0.f7658OooOo0O;
            layoutParams.f7519OooOo0O = oooO0O0.f7659OooOo0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = oooO0O0.f7670Oooo00O;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = oooO0O0.f7671Oooo00o;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = oooO0O0.f7668Oooo0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = oooO0O0.f7672Oooo0O0;
            layoutParams.f7523OooOoOO = oooO0O0.f7681OoooO0O;
            layoutParams.f7525OooOoo0 = oooO0O0.f7679OoooO0;
            layoutParams.f7516OooOo = oooO0O0.f7677Oooo0oo;
            layoutParams.f7521OooOoO = oooO0O0.f7680OoooO00;
            layoutParams.f7527OooOooo = oooO0O0.f7655OooOo;
            layoutParams.f7530Oooo000 = oooO0O0.f7661OooOoO0;
            layoutParams.f7512OooOOOo = oooO0O0.f7662OooOoOO;
            layoutParams.f7514OooOOo0 = oooO0O0.f7664OooOoo0;
            layoutParams.f7513OooOOo = oooO0O0.f7663OooOoo;
            layoutParams.f7531Oooo00O = oooO0O0.f7660OooOoO;
            layoutParams.f7539OoooO = oooO0O0.f7665OooOooO;
            layoutParams.f7543OoooOO0 = oooO0O0.f7666OooOooo;
            layoutParams.f7529Oooo0 = oooO0O0.f7682OoooOO0;
            layoutParams.f7532Oooo00o = oooO0O0.f7697o000oOoO;
            layoutParams.f7534Oooo0OO = oooO0O0.f7684OoooOOo;
            layoutParams.f7533Oooo0O0 = oooO0O0.f7683OoooOOO;
            layoutParams.f7544OoooOOO = oooO0O0.f7698o00O0O;
            layoutParams.f7545OoooOOo = oooO0O0.f7699o00Oo0;
            layoutParams.f7536Oooo0o0 = oooO0O0.f7685OoooOo0;
            layoutParams.f7535Oooo0o = oooO0O0.f7686OoooOoO;
            layoutParams.f7528Oooo = oooO0O0.f7687OoooOoo;
            layoutParams.f7541OoooO00 = oooO0O0.f7688Ooooo00;
            layoutParams.f7537Oooo0oO = oooO0O0.f7689Ooooo0o;
            layoutParams.f7538Oooo0oo = oooO0O0.f7690OooooO0;
            layoutParams.f7540OoooO0 = oooO0O0.f7691OooooOO;
            layoutParams.f7542OoooO0O = oooO0O0.f7692OooooOo;
            layoutParams.f7558o000oOoO = oooO0O0.f7669Oooo000;
            layoutParams.f7500OooO0OO = oooO0O0.f7643OooO0oO;
            layoutParams.f7498OooO00o = oooO0O0.f7642OooO0o0;
            layoutParams.f7499OooO0O0 = oooO0O0.f7641OooO0o;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = oooO0O0.f7639OooO0OO;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = oooO0O0.f7640OooO0Oo;
            String str = oooO0O0.f7703ooOO;
            if (str != null) {
                layoutParams.f7546OoooOo0 = str;
            }
            layoutParams.f7547OoooOoO = oooO0O0.f7701o00o0O;
            layoutParams.setMarginStart(oooO0O0.f7675Oooo0o0);
            layoutParams.setMarginEnd(this.f7620OooO0o0.f7673Oooo0OO);
            layoutParams.OooO00o();
        }

        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final C0043OooO00o clone() {
            C0043OooO00o c0043OooO00o = new C0043OooO00o();
            c0043OooO00o.f7620OooO0o0.OooO00o(this.f7620OooO0o0);
            c0043OooO00o.f7618OooO0Oo.OooO00o(this.f7618OooO0Oo);
            c0043OooO00o.f7617OooO0OO.OooO00o(this.f7617OooO0OO);
            c0043OooO00o.f7619OooO0o.OooO00o(this.f7619OooO0o);
            c0043OooO00o.f7615OooO00o = this.f7615OooO00o;
            c0043OooO00o.f7622OooO0oo = this.f7622OooO0oo;
            return c0043OooO00o;
        }

        public final void OooO0OO(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f7615OooO00o = i;
            OooO0O0 oooO0O0 = this.f7620OooO0o0;
            oooO0O0.f7636OooO = layoutParams.f7503OooO0o0;
            oooO0O0.f7645OooOO0 = layoutParams.f7502OooO0o;
            oooO0O0.f7646OooOO0O = layoutParams.f7504OooO0oO;
            oooO0O0.f7647OooOO0o = layoutParams.f7505OooO0oo;
            oooO0O0.f7649OooOOO0 = layoutParams.f7497OooO;
            oooO0O0.f7648OooOOO = layoutParams.f7506OooOO0;
            oooO0O0.f7650OooOOOO = layoutParams.f7507OooOO0O;
            oooO0O0.f7651OooOOOo = layoutParams.f7508OooOO0o;
            oooO0O0.f7653OooOOo0 = layoutParams.f7510OooOOO0;
            oooO0O0.f7652OooOOo = layoutParams.f7509OooOOO;
            oooO0O0.f7654OooOOoo = layoutParams.f7511OooOOOO;
            oooO0O0.f7657OooOo00 = layoutParams.f7515OooOOoo;
            oooO0O0.f7656OooOo0 = layoutParams.f7518OooOo00;
            oooO0O0.f7658OooOo0O = layoutParams.f7517OooOo0;
            oooO0O0.f7659OooOo0o = layoutParams.f7519OooOo0O;
            oooO0O0.f7655OooOo = layoutParams.f7527OooOooo;
            oooO0O0.f7661OooOoO0 = layoutParams.f7530Oooo000;
            oooO0O0.f7660OooOoO = layoutParams.f7531Oooo00O;
            oooO0O0.f7662OooOoOO = layoutParams.f7512OooOOOo;
            oooO0O0.f7664OooOoo0 = layoutParams.f7514OooOOo0;
            oooO0O0.f7663OooOoo = layoutParams.f7513OooOOo;
            oooO0O0.f7665OooOooO = layoutParams.f7539OoooO;
            oooO0O0.f7666OooOooo = layoutParams.f7543OoooOO0;
            oooO0O0.f7669Oooo000 = layoutParams.f7558o000oOoO;
            oooO0O0.f7643OooO0oO = layoutParams.f7500OooO0OO;
            oooO0O0.f7642OooO0o0 = layoutParams.f7498OooO00o;
            oooO0O0.f7641OooO0o = layoutParams.f7499OooO0O0;
            oooO0O0.f7639OooO0OO = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            oooO0O0.f7640OooO0Oo = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            oooO0O0.f7670Oooo00O = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            oooO0O0.f7671Oooo00o = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            oooO0O0.f7668Oooo0 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            oooO0O0.f7672Oooo0O0 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            oooO0O0.f7674Oooo0o = layoutParams.f7526OooOooO;
            oooO0O0.f7682OoooOO0 = layoutParams.f7529Oooo0;
            oooO0O0.f7697o000oOoO = layoutParams.f7532Oooo00o;
            oooO0O0.f7684OoooOOo = layoutParams.f7534Oooo0OO;
            oooO0O0.f7683OoooOOO = layoutParams.f7533Oooo0O0;
            oooO0O0.f7698o00O0O = layoutParams.f7544OoooOOO;
            oooO0O0.f7699o00Oo0 = layoutParams.f7545OoooOOo;
            oooO0O0.f7685OoooOo0 = layoutParams.f7536Oooo0o0;
            oooO0O0.f7686OoooOoO = layoutParams.f7535Oooo0o;
            oooO0O0.f7687OoooOoo = layoutParams.f7528Oooo;
            oooO0O0.f7688Ooooo00 = layoutParams.f7541OoooO00;
            oooO0O0.f7689Ooooo0o = layoutParams.f7537Oooo0oO;
            oooO0O0.f7690OooooO0 = layoutParams.f7538Oooo0oo;
            oooO0O0.f7691OooooOO = layoutParams.f7540OoooO0;
            oooO0O0.f7692OooooOo = layoutParams.f7542OoooO0O;
            oooO0O0.f7703ooOO = layoutParams.f7546OoooOo0;
            oooO0O0.f7677Oooo0oo = layoutParams.f7516OooOo;
            oooO0O0.f7680OoooO00 = layoutParams.f7521OooOoO;
            oooO0O0.f7676Oooo0oO = layoutParams.f7520OooOo0o;
            oooO0O0.f7667Oooo = layoutParams.f7522OooOoO0;
            oooO0O0.f7681OoooO0O = layoutParams.f7523OooOoOO;
            oooO0O0.f7679OoooO0 = layoutParams.f7525OooOoo0;
            oooO0O0.f7678OoooO = layoutParams.f7524OooOoo;
            oooO0O0.f7701o00o0O = layoutParams.f7547OoooOoO;
            oooO0O0.f7673Oooo0OO = layoutParams.getMarginEnd();
            this.f7620OooO0o0.f7675Oooo0o0 = layoutParams.getMarginStart();
        }

        public final void OooO0Oo(int i, Constraints.LayoutParams layoutParams) {
            OooO0OO(i, layoutParams);
            this.f7617OooO0OO.f7721OooO0Oo = layoutParams.f7588oo000o;
            OooO oooO = this.f7619OooO0o;
            oooO.f7603OooO0O0 = layoutParams.f7585o0ooOO0;
            oooO.f7604OooO0OO = layoutParams.f7586o0ooOOo;
            oooO.f7605OooO0Oo = layoutParams.f7587o0ooOoO;
            oooO.f7607OooO0o0 = layoutParams.f7583o0OOO0o;
            oooO.f7606OooO0o = layoutParams.f7584o0Oo0oo;
            oooO.f7608OooO0oO = layoutParams.f7582o0OO00O;
            oooO.f7609OooO0oo = layoutParams.f7589oo0o0Oo;
            oooO.f7610OooOO0 = layoutParams.f7581o0O0O00;
            oooO.f7611OooOO0O = layoutParams.f7578o000OOo;
            oooO.f7612OooOO0o = layoutParams.f7577o000000;
            oooO.f7613OooOOO = layoutParams.f7579o00oO0O;
            oooO.f7614OooOOO0 = layoutParams.f7580o00oO0o;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public static SparseIntArray f7635o00ooo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7639OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7640OooO0Oo;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int[] f7696Ooooooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public String f7702o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public String f7703ooOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7637OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f7638OooO0O0 = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7642OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7641OooO0o = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f7643OooO0oO = -1.0f;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f7644OooO0oo = true;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7636OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7645OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f7646OooOO0O = -1;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f7647OooOO0o = -1;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f7649OooOOO0 = -1;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f7648OooOOO = -1;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f7650OooOOOO = -1;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f7651OooOOOo = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f7653OooOOo0 = -1;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f7652OooOOo = -1;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f7654OooOOoo = -1;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f7657OooOo00 = -1;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f7656OooOo0 = -1;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f7658OooOo0O = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f7659OooOo0o = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f7655OooOo = 0.5f;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public float f7661OooOoO0 = 0.5f;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public String f7660OooOoO = null;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f7662OooOoOO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f7664OooOoo0 = 0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public float f7663OooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f7665OooOooO = -1;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f7666OooOooo = -1;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f7669Oooo000 = -1;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public int f7670Oooo00O = 0;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f7671Oooo00o = 0;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public int f7668Oooo0 = 0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f7672Oooo0O0 = 0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f7673Oooo0OO = 0;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f7675Oooo0o0 = 0;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f7674Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f7676Oooo0oO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f7677Oooo0oo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f7667Oooo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f7680OoooO00 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f7679OoooO0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f7681OoooO0O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f7678OoooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public float f7682OoooOO0 = -1.0f;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public float f7697o000oOoO = -1.0f;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public int f7683OoooOOO = 0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public int f7684OoooOOo = 0;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f7685OoooOo0 = 0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f7686OoooOoO = 0;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public int f7687OoooOoo = 0;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public int f7688Ooooo00 = 0;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public int f7689Ooooo0o = 0;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public int f7690OooooO0 = 0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public float f7691OooooOO = 1.0f;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public float f7692OooooOo = 1.0f;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f7694Oooooo0 = -1;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f7693Oooooo = 0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f7695OoooooO = -1;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public boolean f7698o00O0O = false;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public boolean f7699o00Oo0 = false;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public boolean f7700o00Ooo = true;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public int f7701o00o0O = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7635o00ooo = sparseIntArray;
            sparseIntArray.append(o000O00.Layout_layout_constraintLeft_toLeftOf, 24);
            f7635o00ooo.append(o000O00.Layout_layout_constraintLeft_toRightOf, 25);
            f7635o00ooo.append(o000O00.Layout_layout_constraintRight_toLeftOf, 28);
            f7635o00ooo.append(o000O00.Layout_layout_constraintRight_toRightOf, 29);
            f7635o00ooo.append(o000O00.Layout_layout_constraintTop_toTopOf, 35);
            f7635o00ooo.append(o000O00.Layout_layout_constraintTop_toBottomOf, 34);
            f7635o00ooo.append(o000O00.Layout_layout_constraintBottom_toTopOf, 4);
            f7635o00ooo.append(o000O00.Layout_layout_constraintBottom_toBottomOf, 3);
            f7635o00ooo.append(o000O00.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f7635o00ooo.append(o000O00.Layout_layout_editor_absoluteX, 6);
            f7635o00ooo.append(o000O00.Layout_layout_editor_absoluteY, 7);
            f7635o00ooo.append(o000O00.Layout_layout_constraintGuide_begin, 17);
            f7635o00ooo.append(o000O00.Layout_layout_constraintGuide_end, 18);
            f7635o00ooo.append(o000O00.Layout_layout_constraintGuide_percent, 19);
            f7635o00ooo.append(o000O00.Layout_guidelineUseRtl, 90);
            f7635o00ooo.append(o000O00.Layout_android_orientation, 26);
            f7635o00ooo.append(o000O00.Layout_layout_constraintStart_toEndOf, 31);
            f7635o00ooo.append(o000O00.Layout_layout_constraintStart_toStartOf, 32);
            f7635o00ooo.append(o000O00.Layout_layout_constraintEnd_toStartOf, 10);
            f7635o00ooo.append(o000O00.Layout_layout_constraintEnd_toEndOf, 9);
            f7635o00ooo.append(o000O00.Layout_layout_goneMarginLeft, 13);
            f7635o00ooo.append(o000O00.Layout_layout_goneMarginTop, 16);
            f7635o00ooo.append(o000O00.Layout_layout_goneMarginRight, 14);
            f7635o00ooo.append(o000O00.Layout_layout_goneMarginBottom, 11);
            f7635o00ooo.append(o000O00.Layout_layout_goneMarginStart, 15);
            f7635o00ooo.append(o000O00.Layout_layout_goneMarginEnd, 12);
            f7635o00ooo.append(o000O00.Layout_layout_constraintVertical_weight, 38);
            f7635o00ooo.append(o000O00.Layout_layout_constraintHorizontal_weight, 37);
            f7635o00ooo.append(o000O00.Layout_layout_constraintHorizontal_chainStyle, 39);
            f7635o00ooo.append(o000O00.Layout_layout_constraintVertical_chainStyle, 40);
            f7635o00ooo.append(o000O00.Layout_layout_constraintHorizontal_bias, 20);
            f7635o00ooo.append(o000O00.Layout_layout_constraintVertical_bias, 36);
            f7635o00ooo.append(o000O00.Layout_layout_constraintDimensionRatio, 5);
            f7635o00ooo.append(o000O00.Layout_layout_constraintLeft_creator, 91);
            f7635o00ooo.append(o000O00.Layout_layout_constraintTop_creator, 91);
            f7635o00ooo.append(o000O00.Layout_layout_constraintRight_creator, 91);
            f7635o00ooo.append(o000O00.Layout_layout_constraintBottom_creator, 91);
            f7635o00ooo.append(o000O00.Layout_layout_constraintBaseline_creator, 91);
            f7635o00ooo.append(o000O00.Layout_android_layout_marginLeft, 23);
            f7635o00ooo.append(o000O00.Layout_android_layout_marginRight, 27);
            f7635o00ooo.append(o000O00.Layout_android_layout_marginStart, 30);
            f7635o00ooo.append(o000O00.Layout_android_layout_marginEnd, 8);
            f7635o00ooo.append(o000O00.Layout_android_layout_marginTop, 33);
            f7635o00ooo.append(o000O00.Layout_android_layout_marginBottom, 2);
            f7635o00ooo.append(o000O00.Layout_android_layout_width, 22);
            f7635o00ooo.append(o000O00.Layout_android_layout_height, 21);
            f7635o00ooo.append(o000O00.Layout_layout_constraintWidth, 41);
            f7635o00ooo.append(o000O00.Layout_layout_constraintHeight, 42);
            f7635o00ooo.append(o000O00.Layout_layout_constrainedWidth, 41);
            f7635o00ooo.append(o000O00.Layout_layout_constrainedHeight, 42);
            f7635o00ooo.append(o000O00.Layout_layout_wrapBehaviorInParent, 76);
            f7635o00ooo.append(o000O00.Layout_layout_constraintCircle, 61);
            f7635o00ooo.append(o000O00.Layout_layout_constraintCircleRadius, 62);
            f7635o00ooo.append(o000O00.Layout_layout_constraintCircleAngle, 63);
            f7635o00ooo.append(o000O00.Layout_layout_constraintWidth_percent, 69);
            f7635o00ooo.append(o000O00.Layout_layout_constraintHeight_percent, 70);
            f7635o00ooo.append(o000O00.Layout_chainUseRtl, 71);
            f7635o00ooo.append(o000O00.Layout_barrierDirection, 72);
            f7635o00ooo.append(o000O00.Layout_barrierMargin, 73);
            f7635o00ooo.append(o000O00.Layout_constraint_referenced_ids, 74);
            f7635o00ooo.append(o000O00.Layout_barrierAllowsGoneWidgets, 75);
        }

        public final void OooO00o(OooO0O0 oooO0O0) {
            this.f7637OooO00o = oooO0O0.f7637OooO00o;
            this.f7639OooO0OO = oooO0O0.f7639OooO0OO;
            this.f7638OooO0O0 = oooO0O0.f7638OooO0O0;
            this.f7640OooO0Oo = oooO0O0.f7640OooO0Oo;
            this.f7642OooO0o0 = oooO0O0.f7642OooO0o0;
            this.f7641OooO0o = oooO0O0.f7641OooO0o;
            this.f7643OooO0oO = oooO0O0.f7643OooO0oO;
            this.f7644OooO0oo = oooO0O0.f7644OooO0oo;
            this.f7636OooO = oooO0O0.f7636OooO;
            this.f7645OooOO0 = oooO0O0.f7645OooOO0;
            this.f7646OooOO0O = oooO0O0.f7646OooOO0O;
            this.f7647OooOO0o = oooO0O0.f7647OooOO0o;
            this.f7649OooOOO0 = oooO0O0.f7649OooOOO0;
            this.f7648OooOOO = oooO0O0.f7648OooOOO;
            this.f7650OooOOOO = oooO0O0.f7650OooOOOO;
            this.f7651OooOOOo = oooO0O0.f7651OooOOOo;
            this.f7653OooOOo0 = oooO0O0.f7653OooOOo0;
            this.f7652OooOOo = oooO0O0.f7652OooOOo;
            this.f7654OooOOoo = oooO0O0.f7654OooOOoo;
            this.f7657OooOo00 = oooO0O0.f7657OooOo00;
            this.f7656OooOo0 = oooO0O0.f7656OooOo0;
            this.f7658OooOo0O = oooO0O0.f7658OooOo0O;
            this.f7659OooOo0o = oooO0O0.f7659OooOo0o;
            this.f7655OooOo = oooO0O0.f7655OooOo;
            this.f7661OooOoO0 = oooO0O0.f7661OooOoO0;
            this.f7660OooOoO = oooO0O0.f7660OooOoO;
            this.f7662OooOoOO = oooO0O0.f7662OooOoOO;
            this.f7664OooOoo0 = oooO0O0.f7664OooOoo0;
            this.f7663OooOoo = oooO0O0.f7663OooOoo;
            this.f7665OooOooO = oooO0O0.f7665OooOooO;
            this.f7666OooOooo = oooO0O0.f7666OooOooo;
            this.f7669Oooo000 = oooO0O0.f7669Oooo000;
            this.f7670Oooo00O = oooO0O0.f7670Oooo00O;
            this.f7671Oooo00o = oooO0O0.f7671Oooo00o;
            this.f7668Oooo0 = oooO0O0.f7668Oooo0;
            this.f7672Oooo0O0 = oooO0O0.f7672Oooo0O0;
            this.f7673Oooo0OO = oooO0O0.f7673Oooo0OO;
            this.f7675Oooo0o0 = oooO0O0.f7675Oooo0o0;
            this.f7674Oooo0o = oooO0O0.f7674Oooo0o;
            this.f7676Oooo0oO = oooO0O0.f7676Oooo0oO;
            this.f7677Oooo0oo = oooO0O0.f7677Oooo0oo;
            this.f7667Oooo = oooO0O0.f7667Oooo;
            this.f7680OoooO00 = oooO0O0.f7680OoooO00;
            this.f7679OoooO0 = oooO0O0.f7679OoooO0;
            this.f7681OoooO0O = oooO0O0.f7681OoooO0O;
            this.f7678OoooO = oooO0O0.f7678OoooO;
            this.f7682OoooOO0 = oooO0O0.f7682OoooOO0;
            this.f7697o000oOoO = oooO0O0.f7697o000oOoO;
            this.f7683OoooOOO = oooO0O0.f7683OoooOOO;
            this.f7684OoooOOo = oooO0O0.f7684OoooOOo;
            this.f7685OoooOo0 = oooO0O0.f7685OoooOo0;
            this.f7686OoooOoO = oooO0O0.f7686OoooOoO;
            this.f7687OoooOoo = oooO0O0.f7687OoooOoo;
            this.f7688Ooooo00 = oooO0O0.f7688Ooooo00;
            this.f7689Ooooo0o = oooO0O0.f7689Ooooo0o;
            this.f7690OooooO0 = oooO0O0.f7690OooooO0;
            this.f7691OooooOO = oooO0O0.f7691OooooOO;
            this.f7692OooooOo = oooO0O0.f7692OooooOo;
            this.f7694Oooooo0 = oooO0O0.f7694Oooooo0;
            this.f7693Oooooo = oooO0O0.f7693Oooooo;
            this.f7695OoooooO = oooO0O0.f7695OoooooO;
            this.f7703ooOO = oooO0O0.f7703ooOO;
            int[] iArr = oooO0O0.f7696Ooooooo;
            if (iArr == null || oooO0O0.f7702o0OoOo0 != null) {
                this.f7696Ooooooo = null;
            } else {
                this.f7696Ooooooo = Arrays.copyOf(iArr, iArr.length);
            }
            this.f7702o0OoOo0 = oooO0O0.f7702o0OoOo0;
            this.f7698o00O0O = oooO0O0.f7698o00O0O;
            this.f7699o00Oo0 = oooO0O0.f7699o00Oo0;
            this.f7700o00Ooo = oooO0O0.f7700o00Ooo;
            this.f7701o00o0O = oooO0O0.f7701o00o0O;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.Layout);
            this.f7638OooO0O0 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f7635o00ooo.get(index);
                switch (i2) {
                    case 1:
                        this.f7653OooOOo0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7653OooOOo0);
                        break;
                    case 2:
                        this.f7672Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7672Oooo0O0);
                        break;
                    case 3:
                        this.f7651OooOOOo = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7651OooOOOo);
                        break;
                    case 4:
                        this.f7650OooOOOO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7650OooOOOO);
                        break;
                    case 5:
                        this.f7660OooOoO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f7665OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7665OooOooO);
                        break;
                    case 7:
                        this.f7666OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7666OooOooo);
                        break;
                    case 8:
                        this.f7673Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7673Oooo0OO);
                        break;
                    case 9:
                        this.f7659OooOo0o = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7659OooOo0o);
                        break;
                    case 10:
                        this.f7658OooOo0O = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7658OooOo0O);
                        break;
                    case 11:
                        this.f7680OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7680OoooO00);
                        break;
                    case 12:
                        this.f7679OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7679OoooO0);
                        break;
                    case 13:
                        this.f7676Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7676Oooo0oO);
                        break;
                    case 14:
                        this.f7667Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7667Oooo);
                        break;
                    case 15:
                        this.f7681OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7681OoooO0O);
                        break;
                    case 16:
                        this.f7677Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7677Oooo0oo);
                        break;
                    case 17:
                        this.f7642OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7642OooO0o0);
                        break;
                    case 18:
                        this.f7641OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7641OooO0o);
                        break;
                    case 19:
                        this.f7643OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f7643OooO0oO);
                        break;
                    case 20:
                        this.f7655OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f7655OooOo);
                        break;
                    case 21:
                        this.f7640OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7640OooO0Oo);
                        break;
                    case 22:
                        this.f7639OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7639OooO0OO);
                        break;
                    case 23:
                        this.f7670Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7670Oooo00O);
                        break;
                    case 24:
                        this.f7636OooO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7636OooO);
                        break;
                    case 25:
                        this.f7645OooOO0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7645OooOO0);
                        break;
                    case 26:
                        this.f7669Oooo000 = typedArrayObtainStyledAttributes.getInt(index, this.f7669Oooo000);
                        break;
                    case 27:
                        this.f7671Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7671Oooo00o);
                        break;
                    case 28:
                        this.f7646OooOO0O = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7646OooOO0O);
                        break;
                    case 29:
                        this.f7647OooOO0o = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7647OooOO0o);
                        break;
                    case 30:
                        this.f7675Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7675Oooo0o0);
                        break;
                    case 31:
                        this.f7657OooOo00 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7657OooOo00);
                        break;
                    case 32:
                        this.f7656OooOo0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7656OooOo0);
                        break;
                    case 33:
                        this.f7668Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7668Oooo0);
                        break;
                    case 34:
                        this.f7648OooOOO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7648OooOOO);
                        break;
                    case 35:
                        this.f7649OooOOO0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7649OooOOO0);
                        break;
                    case 36:
                        this.f7661OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7661OooOoO0);
                        break;
                    case 37:
                        this.f7697o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f7697o000oOoO);
                        break;
                    case 38:
                        this.f7682OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7682OoooOO0);
                        break;
                    case 39:
                        this.f7683OoooOOO = typedArrayObtainStyledAttributes.getInt(index, this.f7683OoooOOO);
                        break;
                    case 40:
                        this.f7684OoooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f7684OoooOOo);
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
                                this.f7662OooOoOO = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7662OooOoOO);
                                break;
                            case 62:
                                this.f7664OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7664OooOoo0);
                                break;
                            case 63:
                                this.f7663OooOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f7663OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f7691OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f7692OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f7694Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, this.f7694Oooooo0);
                                        break;
                                    case 73:
                                        this.f7693Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7693Oooooo);
                                        break;
                                    case 74:
                                        this.f7702o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f7700o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7700o00Ooo);
                                        break;
                                    case 76:
                                        this.f7701o00o0O = typedArrayObtainStyledAttributes.getInt(index, this.f7701o00o0O);
                                        break;
                                    case 77:
                                        this.f7652OooOOo = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7652OooOOo);
                                        break;
                                    case 78:
                                        this.f7654OooOOoo = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7654OooOOoo);
                                        break;
                                    case 79:
                                        this.f7678OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7678OoooO);
                                        break;
                                    case 80:
                                        this.f7674Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7674Oooo0o);
                                        break;
                                    case 81:
                                        this.f7685OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, this.f7685OoooOo0);
                                        break;
                                    case 82:
                                        this.f7686OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f7686OoooOoO);
                                        break;
                                    case 83:
                                        this.f7688Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7688Ooooo00);
                                        break;
                                    case 84:
                                        this.f7687OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7687OoooOoo);
                                        break;
                                    case 85:
                                        this.f7690OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7690OooooO0);
                                        break;
                                    case 86:
                                        this.f7689Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7689Ooooo0o);
                                        break;
                                    case 87:
                                        this.f7698o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, this.f7698o00O0O);
                                        break;
                                    case 88:
                                        this.f7699o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7699o00Oo0);
                                        break;
                                    case 89:
                                        this.f7703ooOO = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f7644OooO0oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7644OooO0oo);
                                        break;
                                    case 91:
                                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unused attribute 0x");
                                        sbOooO0o0.append(Integer.toHexString(index));
                                        sbOooO0o0.append("   ");
                                        sbOooO0o0.append(f7635o00ooo.get(index));
                                        Log.w("ConstraintSet", sbOooO0o0.toString());
                                        break;
                                    default:
                                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Unknown attribute 0x");
                                        sbOooO0o1.append(Integer.toHexString(index));
                                        sbOooO0o1.append("   ");
                                        sbOooO0o1.append(f7635o00ooo.get(index));
                                        Log.w("ConstraintSet", sbOooO0o1.toString());
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
        public static SparseIntArray f7704OooOOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7706OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7707OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7708OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f7709OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7711OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7710OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f7712OooO0oO = Float.NaN;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f7713OooO0oo = Float.NaN;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f7705OooO = Float.NaN;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7714OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f7715OooOO0O = null;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f7716OooOO0o = -3;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f7717OooOOO0 = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7704OooOOO = sparseIntArray;
            sparseIntArray.append(o000O00.Motion_motionPathRotate, 1);
            f7704OooOOO.append(o000O00.Motion_pathMotionArc, 2);
            f7704OooOOO.append(o000O00.Motion_transitionEasing, 3);
            f7704OooOOO.append(o000O00.Motion_drawPath, 4);
            f7704OooOOO.append(o000O00.Motion_animateRelativeTo, 5);
            f7704OooOOO.append(o000O00.Motion_animateCircleAngleTo, 6);
            f7704OooOOO.append(o000O00.Motion_motionStagger, 7);
            f7704OooOOO.append(o000O00.Motion_quantizeMotionSteps, 8);
            f7704OooOOO.append(o000O00.Motion_quantizeMotionPhase, 9);
            f7704OooOOO.append(o000O00.Motion_quantizeMotionInterpolator, 10);
        }

        public final void OooO00o(OooO0OO oooO0OO) {
            this.f7706OooO00o = oooO0OO.f7706OooO00o;
            this.f7707OooO0O0 = oooO0OO.f7707OooO0O0;
            this.f7709OooO0Oo = oooO0OO.f7709OooO0Oo;
            this.f7711OooO0o0 = oooO0OO.f7711OooO0o0;
            this.f7710OooO0o = oooO0OO.f7710OooO0o;
            this.f7713OooO0oo = oooO0OO.f7713OooO0oo;
            this.f7712OooO0oO = oooO0OO.f7712OooO0oO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.Motion);
            this.f7706OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f7704OooOOO.get(index)) {
                    case 1:
                        this.f7713OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7713OooO0oo);
                        break;
                    case 2:
                        this.f7711OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f7711OooO0o0);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f7709OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f7709OooO0Oo = o000000O.f27560OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f7710OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f7707OooO0O0 = OooO00o.OooOO0o(typedArrayObtainStyledAttributes, index, this.f7707OooO0O0);
                        break;
                    case 6:
                        this.f7708OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, this.f7708OooO0OO);
                        break;
                    case 7:
                        this.f7712OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f7712OooO0oO);
                        break;
                    case 8:
                        this.f7714OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, this.f7714OooOO0);
                        break;
                    case 9:
                        this.f7705OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f7705OooO);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f7717OooOOO0 = resourceId;
                            if (resourceId != -1) {
                                this.f7716OooOO0o = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f7715OooOO0O = string;
                            if (string.indexOf("/") > 0) {
                                this.f7717OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f7716OooOO0o = -2;
                            } else {
                                this.f7716OooOO0o = -1;
                            }
                        } else {
                            this.f7716OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, this.f7717OooOOO0);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7718OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7719OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7720OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f7721OooO0Oo = 1.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f7722OooO0o0 = Float.NaN;

        public final void OooO00o(OooO0o oooO0o) {
            this.f7718OooO00o = oooO0o.f7718OooO00o;
            this.f7719OooO0O0 = oooO0o.f7719OooO0O0;
            this.f7721OooO0Oo = oooO0o.f7721OooO0Oo;
            this.f7722OooO0o0 = oooO0o.f7722OooO0o0;
            this.f7720OooO0OO = oooO0o.f7720OooO0OO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.PropertySet);
            this.f7718OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.PropertySet_android_alpha) {
                    this.f7721OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f7721OooO0Oo);
                } else if (index == o000O00.PropertySet_android_visibility) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f7719OooO0O0);
                    this.f7719OooO0O0 = i2;
                    int[] iArr = OooO00o.f7592OooO0oO;
                    this.f7719OooO0O0 = OooO00o.f7592OooO0oO[i2];
                } else if (index == o000O00.PropertySet_visibilityMode) {
                    this.f7720OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f7720OooO0OO);
                } else if (index == o000O00.PropertySet_motionProgress) {
                    this.f7722OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7722OooO0o0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintLeft_toLeftOf, 25);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintLeft_toRightOf, 26);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintRight_toLeftOf, 29);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintRight_toRightOf, 30);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintTop_toTopOf, 36);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintTop_toBottomOf, 35);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintBottom_toTopOf, 4);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintBottom_toBottomOf, 3);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_toTopOf, 91);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f7593OooO0oo.append(o000O00.Constraint_layout_editor_absoluteX, 6);
        f7593OooO0oo.append(o000O00.Constraint_layout_editor_absoluteY, 7);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintGuide_begin, 17);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintGuide_end, 18);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintGuide_percent, 19);
        f7593OooO0oo.append(o000O00.Constraint_guidelineUseRtl, 99);
        f7593OooO0oo.append(o000O00.Constraint_android_orientation, 27);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintStart_toEndOf, 32);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintStart_toStartOf, 33);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintEnd_toStartOf, 10);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintEnd_toEndOf, 9);
        f7593OooO0oo.append(o000O00.Constraint_layout_goneMarginLeft, 13);
        f7593OooO0oo.append(o000O00.Constraint_layout_goneMarginTop, 16);
        f7593OooO0oo.append(o000O00.Constraint_layout_goneMarginRight, 14);
        f7593OooO0oo.append(o000O00.Constraint_layout_goneMarginBottom, 11);
        f7593OooO0oo.append(o000O00.Constraint_layout_goneMarginStart, 15);
        f7593OooO0oo.append(o000O00.Constraint_layout_goneMarginEnd, 12);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintVertical_weight, 40);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHorizontal_weight, 39);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintVertical_chainStyle, 42);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHorizontal_bias, 20);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintVertical_bias, 37);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintDimensionRatio, 5);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintLeft_creator, 87);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintTop_creator, 87);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintRight_creator, 87);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintBottom_creator, 87);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintBaseline_creator, 87);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_marginLeft, 24);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_marginRight, 28);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_marginStart, 31);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_marginEnd, 8);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_marginTop, 34);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_marginBottom, 2);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_width, 23);
        f7593OooO0oo.append(o000O00.Constraint_android_layout_height, 21);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintWidth, 95);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHeight, 96);
        f7593OooO0oo.append(o000O00.Constraint_android_visibility, 22);
        f7593OooO0oo.append(o000O00.Constraint_android_alpha, 43);
        f7593OooO0oo.append(o000O00.Constraint_android_elevation, 44);
        f7593OooO0oo.append(o000O00.Constraint_android_rotationX, 45);
        f7593OooO0oo.append(o000O00.Constraint_android_rotationY, 46);
        f7593OooO0oo.append(o000O00.Constraint_android_rotation, 60);
        f7593OooO0oo.append(o000O00.Constraint_android_scaleX, 47);
        f7593OooO0oo.append(o000O00.Constraint_android_scaleY, 48);
        f7593OooO0oo.append(o000O00.Constraint_android_transformPivotX, 49);
        f7593OooO0oo.append(o000O00.Constraint_android_transformPivotY, 50);
        f7593OooO0oo.append(o000O00.Constraint_android_translationX, 51);
        f7593OooO0oo.append(o000O00.Constraint_android_translationY, 52);
        f7593OooO0oo.append(o000O00.Constraint_android_translationZ, 53);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintWidth_default, 54);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHeight_default, 55);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintWidth_max, 56);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHeight_max, 57);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintWidth_min, 58);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHeight_min, 59);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintCircle, 61);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintCircleRadius, 62);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintCircleAngle, 63);
        f7593OooO0oo.append(o000O00.Constraint_animateRelativeTo, 64);
        f7593OooO0oo.append(o000O00.Constraint_transitionEasing, 65);
        f7593OooO0oo.append(o000O00.Constraint_drawPath, 66);
        f7593OooO0oo.append(o000O00.Constraint_transitionPathRotate, 67);
        f7593OooO0oo.append(o000O00.Constraint_motionStagger, 79);
        f7593OooO0oo.append(o000O00.Constraint_android_id, 38);
        f7593OooO0oo.append(o000O00.Constraint_motionProgress, 68);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintWidth_percent, 69);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintHeight_percent, 70);
        f7593OooO0oo.append(o000O00.Constraint_layout_wrapBehaviorInParent, 97);
        f7593OooO0oo.append(o000O00.Constraint_chainUseRtl, 71);
        f7593OooO0oo.append(o000O00.Constraint_barrierDirection, 72);
        f7593OooO0oo.append(o000O00.Constraint_barrierMargin, 73);
        f7593OooO0oo.append(o000O00.Constraint_constraint_referenced_ids, 74);
        f7593OooO0oo.append(o000O00.Constraint_barrierAllowsGoneWidgets, 75);
        f7593OooO0oo.append(o000O00.Constraint_pathMotionArc, 76);
        f7593OooO0oo.append(o000O00.Constraint_layout_constraintTag, 77);
        f7593OooO0oo.append(o000O00.Constraint_visibilityMode, 78);
        f7593OooO0oo.append(o000O00.Constraint_layout_constrainedWidth, 80);
        f7593OooO0oo.append(o000O00.Constraint_layout_constrainedHeight, 81);
        f7593OooO0oo.append(o000O00.Constraint_polarRelativeTo, 82);
        f7593OooO0oo.append(o000O00.Constraint_transformPivotTarget, 83);
        f7593OooO0oo.append(o000O00.Constraint_quantizeMotionSteps, 84);
        f7593OooO0oo.append(o000O00.Constraint_quantizeMotionPhase, 85);
        f7593OooO0oo.append(o000O00.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f7591OooO;
        int i = o000O00.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f7591OooO.append(i, 7);
        f7591OooO.append(o000O00.ConstraintOverride_android_orientation, 27);
        f7591OooO.append(o000O00.ConstraintOverride_layout_goneMarginLeft, 13);
        f7591OooO.append(o000O00.ConstraintOverride_layout_goneMarginTop, 16);
        f7591OooO.append(o000O00.ConstraintOverride_layout_goneMarginRight, 14);
        f7591OooO.append(o000O00.ConstraintOverride_layout_goneMarginBottom, 11);
        f7591OooO.append(o000O00.ConstraintOverride_layout_goneMarginStart, 15);
        f7591OooO.append(o000O00.ConstraintOverride_layout_goneMarginEnd, 12);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintVertical_weight, 40);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintVertical_bias, 37);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintLeft_creator, 87);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintTop_creator, 87);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintRight_creator, 87);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintBottom_creator, 87);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_marginLeft, 24);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_marginRight, 28);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_marginStart, 31);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_marginEnd, 8);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_marginTop, 34);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_marginBottom, 2);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_width, 23);
        f7591OooO.append(o000O00.ConstraintOverride_android_layout_height, 21);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintWidth, 95);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHeight, 96);
        f7591OooO.append(o000O00.ConstraintOverride_android_visibility, 22);
        f7591OooO.append(o000O00.ConstraintOverride_android_alpha, 43);
        f7591OooO.append(o000O00.ConstraintOverride_android_elevation, 44);
        f7591OooO.append(o000O00.ConstraintOverride_android_rotationX, 45);
        f7591OooO.append(o000O00.ConstraintOverride_android_rotationY, 46);
        f7591OooO.append(o000O00.ConstraintOverride_android_rotation, 60);
        f7591OooO.append(o000O00.ConstraintOverride_android_scaleX, 47);
        f7591OooO.append(o000O00.ConstraintOverride_android_scaleY, 48);
        f7591OooO.append(o000O00.ConstraintOverride_android_transformPivotX, 49);
        f7591OooO.append(o000O00.ConstraintOverride_android_transformPivotY, 50);
        f7591OooO.append(o000O00.ConstraintOverride_android_translationX, 51);
        f7591OooO.append(o000O00.ConstraintOverride_android_translationY, 52);
        f7591OooO.append(o000O00.ConstraintOverride_android_translationZ, 53);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_default, 54);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_default, 55);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_max, 56);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_max, 57);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_min, 58);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_min, 59);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintCircleRadius, 62);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintCircleAngle, 63);
        f7591OooO.append(o000O00.ConstraintOverride_animateRelativeTo, 64);
        f7591OooO.append(o000O00.ConstraintOverride_transitionEasing, 65);
        f7591OooO.append(o000O00.ConstraintOverride_drawPath, 66);
        f7591OooO.append(o000O00.ConstraintOverride_transitionPathRotate, 67);
        f7591OooO.append(o000O00.ConstraintOverride_motionStagger, 79);
        f7591OooO.append(o000O00.ConstraintOverride_android_id, 38);
        f7591OooO.append(o000O00.ConstraintOverride_motionTarget, 98);
        f7591OooO.append(o000O00.ConstraintOverride_motionProgress, 68);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintWidth_percent, 69);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintHeight_percent, 70);
        f7591OooO.append(o000O00.ConstraintOverride_chainUseRtl, 71);
        f7591OooO.append(o000O00.ConstraintOverride_barrierDirection, 72);
        f7591OooO.append(o000O00.ConstraintOverride_barrierMargin, 73);
        f7591OooO.append(o000O00.ConstraintOverride_constraint_referenced_ids, 74);
        f7591OooO.append(o000O00.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f7591OooO.append(o000O00.ConstraintOverride_pathMotionArc, 76);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constraintTag, 77);
        f7591OooO.append(o000O00.ConstraintOverride_visibilityMode, 78);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constrainedWidth, 80);
        f7591OooO.append(o000O00.ConstraintOverride_layout_constrainedHeight, 81);
        f7591OooO.append(o000O00.ConstraintOverride_polarRelativeTo, 82);
        f7591OooO.append(o000O00.ConstraintOverride_transformPivotTarget, 83);
        f7591OooO.append(o000O00.ConstraintOverride_quantizeMotionSteps, 84);
        f7591OooO.append(o000O00.ConstraintOverride_quantizeMotionPhase, 85);
        f7591OooO.append(o000O00.ConstraintOverride_quantizeMotionInterpolator, 86);
        f7591OooO.append(o000O00.ConstraintOverride_layout_wrapBehaviorInParent, 97);
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
        layoutParams.f7531Oooo00O = str;
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
                        layoutParams.f7544OoooOOO = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                        layoutParams.f7545OoooOOo = z;
                        return;
                    }
                }
                if (obj instanceof OooO0O0) {
                    oooO0O0 = (OooO0O0) obj;
                    if (i2 == 0) {
                        oooO0O0.f7639OooO0OO = i4;
                        oooO0O0.f7698o00O0O = z;
                        return;
                    } else {
                        oooO0O0.f7640OooO0Oo = i4;
                        oooO0O0.f7699o00Oo0 = z;
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
                    layoutParams.f7544OoooOOO = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.f7545OoooOOo = z;
                    return;
                }
            }
            if (obj instanceof OooO0O0) {
                oooO0O0 = (OooO0O0) obj;
                if (i2 == 0) {
                    oooO0O0.f7639OooO0OO = i4;
                    oooO0O0.f7698o00O0O = z;
                    return;
                } else {
                    oooO0O0.f7640OooO0Oo = i4;
                    oooO0O0.f7699o00Oo0 = z;
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
                    ((OooO0O0) obj).f7660OooOoO = strTrim2;
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
                            layoutParams3.f7532Oooo00o = f;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f7529Oooo0 = f;
                        }
                    } else if (obj instanceof OooO0O0) {
                        OooO0O0 oooO0O1 = (OooO0O0) obj;
                        if (i2 == 0) {
                            oooO0O1.f7639OooO0OO = 0;
                            oooO0O1.f7697o000oOoO = f;
                        } else {
                            oooO0O1.f7640OooO0Oo = 0;
                            oooO0O1.f7682OoooOO0 = f;
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
                            layoutParams4.f7540OoooO0 = fMax;
                            layoutParams4.f7536Oooo0o0 = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.f7542OoooO0O = fMax;
                            layoutParams4.f7535Oooo0o = 2;
                        }
                    } else if (obj instanceof OooO0O0) {
                        OooO0O0 oooO0O2 = (OooO0O0) obj;
                        if (i2 == 0) {
                            oooO0O2.f7639OooO0OO = 0;
                            oooO0O2.f7691OooooOO = fMax;
                            oooO0O2.f7685OoooOo0 = 2;
                        } else {
                            oooO0O2.f7640OooO0Oo = 0;
                            oooO0O2.f7692OooooOo = fMax;
                            oooO0O2.f7686OoooOoO = 2;
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
        c0043OooO00o.f7622OooO0oo = c0044OooO00o;
        c0043OooO00o.f7618OooO0Oo.f7706OooO00o = false;
        c0043OooO00o.f7620OooO0o0.f7638OooO0O0 = false;
        c0043OooO00o.f7617OooO0OO.f7718OooO00o = false;
        c0043OooO00o.f7619OooO0o.f7602OooO00o = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f7591OooO.get(index)) {
                case 2:
                    c0044OooO00o.OooO0O0(2, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7672Oooo0O0));
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
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown attribute 0x");
                    sbOooO0o0.append(Integer.toHexString(index));
                    sbOooO0o0.append("   ");
                    sbOooO0o0.append(f7593OooO0oo.get(index));
                    Log.w("ConstraintSet", sbOooO0o0.toString());
                    break;
                case 5:
                    c0044OooO00o.OooO0OO(5, typedArray.getString(index));
                    break;
                case 6:
                    c0044OooO00o.OooO0O0(6, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7620OooO0o0.f7665OooOooO));
                    break;
                case 7:
                    c0044OooO00o.OooO0O0(7, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7620OooO0o0.f7666OooOooo));
                    break;
                case 8:
                    c0044OooO00o.OooO0O0(8, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7673Oooo0OO));
                    break;
                case 11:
                    c0044OooO00o.OooO0O0(11, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7680OoooO00));
                    break;
                case 12:
                    c0044OooO00o.OooO0O0(12, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7679OoooO0));
                    break;
                case 13:
                    c0044OooO00o.OooO0O0(13, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7676Oooo0oO));
                    break;
                case 14:
                    c0044OooO00o.OooO0O0(14, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7667Oooo));
                    break;
                case 15:
                    c0044OooO00o.OooO0O0(15, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7681OoooO0O));
                    break;
                case 16:
                    c0044OooO00o.OooO0O0(16, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7677Oooo0oo));
                    break;
                case 17:
                    c0044OooO00o.OooO0O0(17, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7620OooO0o0.f7642OooO0o0));
                    break;
                case 18:
                    c0044OooO00o.OooO0O0(18, typedArray.getDimensionPixelOffset(index, c0043OooO00o.f7620OooO0o0.f7641OooO0o));
                    break;
                case 19:
                    c0044OooO00o.OooO00o(19, typedArray.getFloat(index, c0043OooO00o.f7620OooO0o0.f7643OooO0oO));
                    break;
                case 20:
                    c0044OooO00o.OooO00o(20, typedArray.getFloat(index, c0043OooO00o.f7620OooO0o0.f7655OooOo));
                    break;
                case 21:
                    c0044OooO00o.OooO0O0(21, typedArray.getLayoutDimension(index, c0043OooO00o.f7620OooO0o0.f7640OooO0Oo));
                    break;
                case 22:
                    c0044OooO00o.OooO0O0(22, f7592OooO0oO[typedArray.getInt(index, c0043OooO00o.f7617OooO0OO.f7719OooO0O0)]);
                    break;
                case 23:
                    c0044OooO00o.OooO0O0(23, typedArray.getLayoutDimension(index, c0043OooO00o.f7620OooO0o0.f7639OooO0OO));
                    break;
                case 24:
                    c0044OooO00o.OooO0O0(24, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7670Oooo00O));
                    break;
                case 27:
                    c0044OooO00o.OooO0O0(27, typedArray.getInt(index, c0043OooO00o.f7620OooO0o0.f7669Oooo000));
                    break;
                case 28:
                    c0044OooO00o.OooO0O0(28, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7671Oooo00o));
                    break;
                case 31:
                    c0044OooO00o.OooO0O0(31, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7675Oooo0o0));
                    break;
                case 34:
                    c0044OooO00o.OooO0O0(34, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7668Oooo0));
                    break;
                case 37:
                    c0044OooO00o.OooO00o(37, typedArray.getFloat(index, c0043OooO00o.f7620OooO0o0.f7661OooOoO0));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, c0043OooO00o.f7615OooO00o);
                    c0043OooO00o.f7615OooO00o = resourceId;
                    c0044OooO00o.OooO0O0(38, resourceId);
                    break;
                case 39:
                    c0044OooO00o.OooO00o(39, typedArray.getFloat(index, c0043OooO00o.f7620OooO0o0.f7697o000oOoO));
                    break;
                case 40:
                    c0044OooO00o.OooO00o(40, typedArray.getFloat(index, c0043OooO00o.f7620OooO0o0.f7682OoooOO0));
                    break;
                case 41:
                    c0044OooO00o.OooO0O0(41, typedArray.getInt(index, c0043OooO00o.f7620OooO0o0.f7683OoooOOO));
                    break;
                case 42:
                    c0044OooO00o.OooO0O0(42, typedArray.getInt(index, c0043OooO00o.f7620OooO0o0.f7684OoooOOo));
                    break;
                case 43:
                    c0044OooO00o.OooO00o(43, typedArray.getFloat(index, c0043OooO00o.f7617OooO0OO.f7721OooO0Oo));
                    break;
                case 44:
                    c0044OooO00o.OooO0Oo(44, true);
                    c0044OooO00o.OooO00o(44, typedArray.getDimension(index, c0043OooO00o.f7619OooO0o.f7613OooOOO));
                    break;
                case 45:
                    c0044OooO00o.OooO00o(45, typedArray.getFloat(index, c0043OooO00o.f7619OooO0o.f7604OooO0OO));
                    break;
                case 46:
                    c0044OooO00o.OooO00o(46, typedArray.getFloat(index, c0043OooO00o.f7619OooO0o.f7605OooO0Oo));
                    break;
                case 47:
                    c0044OooO00o.OooO00o(47, typedArray.getFloat(index, c0043OooO00o.f7619OooO0o.f7607OooO0o0));
                    break;
                case 48:
                    c0044OooO00o.OooO00o(48, typedArray.getFloat(index, c0043OooO00o.f7619OooO0o.f7606OooO0o));
                    break;
                case 49:
                    c0044OooO00o.OooO00o(49, typedArray.getDimension(index, c0043OooO00o.f7619OooO0o.f7608OooO0oO));
                    break;
                case 50:
                    c0044OooO00o.OooO00o(50, typedArray.getDimension(index, c0043OooO00o.f7619OooO0o.f7609OooO0oo));
                    break;
                case 51:
                    c0044OooO00o.OooO00o(51, typedArray.getDimension(index, c0043OooO00o.f7619OooO0o.f7610OooOO0));
                    break;
                case 52:
                    c0044OooO00o.OooO00o(52, typedArray.getDimension(index, c0043OooO00o.f7619OooO0o.f7611OooOO0O));
                    break;
                case 53:
                    c0044OooO00o.OooO00o(53, typedArray.getDimension(index, c0043OooO00o.f7619OooO0o.f7612OooOO0o));
                    break;
                case 54:
                    c0044OooO00o.OooO0O0(54, typedArray.getInt(index, c0043OooO00o.f7620OooO0o0.f7685OoooOo0));
                    break;
                case 55:
                    c0044OooO00o.OooO0O0(55, typedArray.getInt(index, c0043OooO00o.f7620OooO0o0.f7686OoooOoO));
                    break;
                case 56:
                    c0044OooO00o.OooO0O0(56, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7687OoooOoo));
                    break;
                case 57:
                    c0044OooO00o.OooO0O0(57, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7688Ooooo00));
                    break;
                case 58:
                    c0044OooO00o.OooO0O0(58, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7689Ooooo0o));
                    break;
                case 59:
                    c0044OooO00o.OooO0O0(59, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7690OooooO0));
                    break;
                case 60:
                    c0044OooO00o.OooO00o(60, typedArray.getFloat(index, c0043OooO00o.f7619OooO0o.f7603OooO0O0));
                    break;
                case 62:
                    c0044OooO00o.OooO0O0(62, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7664OooOoo0));
                    break;
                case 63:
                    c0044OooO00o.OooO00o(63, typedArray.getFloat(index, c0043OooO00o.f7620OooO0o0.f7663OooOoo));
                    break;
                case 64:
                    c0044OooO00o.OooO0O0(64, OooOO0o(typedArray, index, c0043OooO00o.f7618OooO0Oo.f7707OooO0O0));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0044OooO00o.OooO0OO(65, typedArray.getString(index));
                    } else {
                        c0044OooO00o.OooO0OO(65, o000000O.f27560OooO0OO[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0044OooO00o.OooO0O0(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0044OooO00o.OooO00o(67, typedArray.getFloat(index, c0043OooO00o.f7618OooO0Oo.f7713OooO0oo));
                    break;
                case 68:
                    c0044OooO00o.OooO00o(68, typedArray.getFloat(index, c0043OooO00o.f7617OooO0OO.f7722OooO0o0));
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
                    c0044OooO00o.OooO0O0(72, typedArray.getInt(index, c0043OooO00o.f7620OooO0o0.f7694Oooooo0));
                    break;
                case 73:
                    c0044OooO00o.OooO0O0(73, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7693Oooooo));
                    break;
                case 74:
                    c0044OooO00o.OooO0OO(74, typedArray.getString(index));
                    break;
                case 75:
                    c0044OooO00o.OooO0Oo(75, typedArray.getBoolean(index, c0043OooO00o.f7620OooO0o0.f7700o00Ooo));
                    break;
                case 76:
                    c0044OooO00o.OooO0O0(76, typedArray.getInt(index, c0043OooO00o.f7618OooO0Oo.f7711OooO0o0));
                    break;
                case 77:
                    c0044OooO00o.OooO0OO(77, typedArray.getString(index));
                    break;
                case 78:
                    c0044OooO00o.OooO0O0(78, typedArray.getInt(index, c0043OooO00o.f7617OooO0OO.f7720OooO0OO));
                    break;
                case 79:
                    c0044OooO00o.OooO00o(79, typedArray.getFloat(index, c0043OooO00o.f7618OooO0Oo.f7712OooO0oO));
                    break;
                case 80:
                    c0044OooO00o.OooO0Oo(80, typedArray.getBoolean(index, c0043OooO00o.f7620OooO0o0.f7698o00O0O));
                    break;
                case 81:
                    c0044OooO00o.OooO0Oo(81, typedArray.getBoolean(index, c0043OooO00o.f7620OooO0o0.f7699o00Oo0));
                    break;
                case 82:
                    c0044OooO00o.OooO0O0(82, typedArray.getInteger(index, c0043OooO00o.f7618OooO0Oo.f7708OooO0OO));
                    break;
                case 83:
                    c0044OooO00o.OooO0O0(83, OooOO0o(typedArray, index, c0043OooO00o.f7619OooO0o.f7601OooO));
                    break;
                case 84:
                    c0044OooO00o.OooO0O0(84, typedArray.getInteger(index, c0043OooO00o.f7618OooO0Oo.f7714OooOO0));
                    break;
                case 85:
                    c0044OooO00o.OooO00o(85, typedArray.getFloat(index, c0043OooO00o.f7618OooO0Oo.f7705OooO));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        c0043OooO00o.f7618OooO0Oo.f7717OooOOO0 = typedArray.getResourceId(index, -1);
                        c0044OooO00o.OooO0O0(89, c0043OooO00o.f7618OooO0Oo.f7717OooOOO0);
                        OooO0OO oooO0OO = c0043OooO00o.f7618OooO0Oo;
                        if (oooO0OO.f7717OooOOO0 != -1) {
                            oooO0OO.f7716OooOO0o = -2;
                            c0044OooO00o.OooO0O0(88, -2);
                        }
                    } else if (i2 == 3) {
                        c0043OooO00o.f7618OooO0Oo.f7715OooOO0O = typedArray.getString(index);
                        c0044OooO00o.OooO0OO(90, c0043OooO00o.f7618OooO0Oo.f7715OooOO0O);
                        if (c0043OooO00o.f7618OooO0Oo.f7715OooOO0O.indexOf("/") > 0) {
                            c0043OooO00o.f7618OooO0Oo.f7717OooOOO0 = typedArray.getResourceId(index, -1);
                            c0044OooO00o.OooO0O0(89, c0043OooO00o.f7618OooO0Oo.f7717OooOOO0);
                            c0043OooO00o.f7618OooO0Oo.f7716OooOO0o = -2;
                            c0044OooO00o.OooO0O0(88, -2);
                        } else {
                            c0043OooO00o.f7618OooO0Oo.f7716OooOO0o = -1;
                            c0044OooO00o.OooO0O0(88, -1);
                        }
                    } else {
                        OooO0OO oooO0OO2 = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO2.f7716OooOO0o = typedArray.getInteger(index, oooO0OO2.f7717OooOOO0);
                        c0044OooO00o.OooO0O0(88, c0043OooO00o.f7618OooO0Oo.f7716OooOO0o);
                    }
                    break;
                case 87:
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("unused attribute 0x");
                    sbOooO0o1.append(Integer.toHexString(index));
                    sbOooO0o1.append("   ");
                    sbOooO0o1.append(f7593OooO0oo.get(index));
                    Log.w("ConstraintSet", sbOooO0o1.toString());
                    break;
                case 93:
                    c0044OooO00o.OooO0O0(93, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7674Oooo0o));
                    break;
                case 94:
                    c0044OooO00o.OooO0O0(94, typedArray.getDimensionPixelSize(index, c0043OooO00o.f7620OooO0o0.f7678OoooO));
                    break;
                case 95:
                    OooOOO0(c0044OooO00o, typedArray, index, 0);
                    break;
                case 96:
                    OooOOO0(c0044OooO00o, typedArray, index, 1);
                    break;
                case 97:
                    c0044OooO00o.OooO0O0(97, typedArray.getInt(index, c0043OooO00o.f7620OooO0o0.f7701o00o0O));
                    break;
                case 98:
                    if (MotionLayout.f7146o0000OOO) {
                        int resourceId2 = typedArray.getResourceId(index, c0043OooO00o.f7615OooO00o);
                        c0043OooO00o.f7615OooO00o = resourceId2;
                        if (resourceId2 == -1) {
                            c0043OooO00o.f7616OooO0O0 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c0043OooO00o.f7616OooO0O0 = typedArray.getString(index);
                    } else {
                        c0043OooO00o.f7615OooO00o = typedArray.getResourceId(index, c0043OooO00o.f7615OooO00o);
                    }
                    break;
                case 99:
                    c0044OooO00o.OooO0Oo(99, typedArray.getBoolean(index, c0043OooO00o.f7620OooO0o0.f7644OooO0oo));
                    break;
            }
        }
    }

    public final C0043OooO00o OooO(int i) {
        if (this.f7598OooO0o.containsKey(Integer.valueOf(i))) {
            return this.f7598OooO0o.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void OooO00o(ConstraintLayout constraintLayout) {
        C0043OooO00o c0043OooO00o;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f7598OooO0o.containsKey(Integer.valueOf(id))) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("id unknown ");
                sbOooO0o0.append(p060o0000o.OooO.OooO0Oo(childAt));
                Log.w("ConstraintSet", sbOooO0o0.toString());
            } else {
                if (this.f7599OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f7598OooO0o.containsKey(Integer.valueOf(id)) && (c0043OooO00o = this.f7598OooO0o.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.OooO0o(childAt, c0043OooO00o.f7621OooO0oO);
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
        HashSet<Integer> hashSet = new HashSet(this.f7598OooO0o.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f7598OooO0o.containsKey(Integer.valueOf(id))) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("id unknown ");
                sbOooO0o0.append(p060o0000o.OooO.OooO0Oo(childAt));
                Log.w("ConstraintSet", sbOooO0o0.toString());
            } else {
                if (this.f7599OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f7598OooO0o.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0043OooO00o c0043OooO00o = this.f7598OooO0o.get(Integer.valueOf(id));
                        if (c0043OooO00o != null) {
                            if (childAt instanceof Barrier) {
                                c0043OooO00o.f7620OooO0o0.f7695OoooooO = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0043OooO00o.f7620OooO0o0.f7694Oooooo0);
                                barrier.setMargin(c0043OooO00o.f7620OooO0o0.f7693Oooooo);
                                barrier.setAllowsGoneWidget(c0043OooO00o.f7620OooO0o0.f7700o00Ooo);
                                OooO0O0 oooO0O0 = c0043OooO00o.f7620OooO0o0;
                                int[] iArr = oooO0O0.f7696Ooooooo;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = oooO0O0.f7702o0OoOo0;
                                    if (str != null) {
                                        oooO0O0.f7696Ooooooo = OooO0o(barrier, str);
                                        barrier.setReferencedIds(c0043OooO00o.f7620OooO0o0.f7696Ooooooo);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.OooO00o();
                            c0043OooO00o.OooO00o(layoutParams);
                            ConstraintAttribute.OooO0o(childAt, c0043OooO00o.f7621OooO0oO);
                            childAt.setLayoutParams(layoutParams);
                            OooO0o oooO0o = c0043OooO00o.f7617OooO0OO;
                            if (oooO0o.f7720OooO0OO == 0) {
                                childAt.setVisibility(oooO0o.f7719OooO0O0);
                            }
                            childAt.setAlpha(c0043OooO00o.f7617OooO0OO.f7721OooO0Oo);
                            childAt.setRotation(c0043OooO00o.f7619OooO0o.f7603OooO0O0);
                            childAt.setRotationX(c0043OooO00o.f7619OooO0o.f7604OooO0OO);
                            childAt.setRotationY(c0043OooO00o.f7619OooO0o.f7605OooO0Oo);
                            childAt.setScaleX(c0043OooO00o.f7619OooO0o.f7607OooO0o0);
                            childAt.setScaleY(c0043OooO00o.f7619OooO0o.f7606OooO0o);
                            OooO oooO = c0043OooO00o.f7619OooO0o;
                            if (oooO.f7601OooO != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(c0043OooO00o.f7619OooO0o.f7601OooO);
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
                                if (!Float.isNaN(oooO.f7608OooO0oO)) {
                                    childAt.setPivotX(c0043OooO00o.f7619OooO0o.f7608OooO0oO);
                                }
                                if (!Float.isNaN(c0043OooO00o.f7619OooO0o.f7609OooO0oo)) {
                                    childAt.setPivotY(c0043OooO00o.f7619OooO0o.f7609OooO0oo);
                                }
                            }
                            childAt.setTranslationX(c0043OooO00o.f7619OooO0o.f7610OooOO0);
                            childAt.setTranslationY(c0043OooO00o.f7619OooO0o.f7611OooOO0O);
                            childAt.setTranslationZ(c0043OooO00o.f7619OooO0o.f7612OooOO0o);
                            OooO oooO2 = c0043OooO00o.f7619OooO0o;
                            if (oooO2.f7614OooOOO0) {
                                childAt.setElevation(oooO2.f7613OooOOO);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C0043OooO00o c0043OooO00o2 = this.f7598OooO0o.get(num);
            if (c0043OooO00o2 != null) {
                if (c0043OooO00o2.f7620OooO0o0.f7695OoooooO == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    OooO0O0 oooO0O1 = c0043OooO00o2.f7620OooO0o0;
                    int[] iArr2 = oooO0O1.f7696Ooooooo;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = oooO0O1.f7702o0OoOo0;
                        if (str2 != null) {
                            oooO0O1.f7696Ooooooo = OooO0o(barrier2, str2);
                            barrier2.setReferencedIds(c0043OooO00o2.f7620OooO0o0.f7696Ooooooo);
                        }
                    }
                    barrier2.setType(c0043OooO00o2.f7620OooO0o0.f7694Oooooo0);
                    barrier2.setMargin(c0043OooO00o2.f7620OooO0o0.f7693Oooooo);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.OooOo00();
                    c0043OooO00o2.OooO00o(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (c0043OooO00o2.f7620OooO0o0.f7637OooO00o) {
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
        oooO00o.f7598OooO0o.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oooO00o.f7599OooO0o0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!oooO00o.f7598OooO0o.containsKey(Integer.valueOf(id))) {
                oooO00o.f7598OooO0o.put(Integer.valueOf(id), new C0043OooO00o());
            }
            C0043OooO00o c0043OooO00o = oooO00o.f7598OooO0o.get(Integer.valueOf(id));
            if (c0043OooO00o != null) {
                HashMap<String, ConstraintAttribute> map = oooO00o.f7597OooO0Oo;
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
                c0043OooO00o.f7621OooO0oO = map2;
                c0043OooO00o.OooO0OO(id, layoutParams);
                c0043OooO00o.f7617OooO0OO.f7719OooO0O0 = childAt.getVisibility();
                c0043OooO00o.f7617OooO0OO.f7721OooO0Oo = childAt.getAlpha();
                c0043OooO00o.f7619OooO0o.f7603OooO0O0 = childAt.getRotation();
                c0043OooO00o.f7619OooO0o.f7604OooO0OO = childAt.getRotationX();
                c0043OooO00o.f7619OooO0o.f7605OooO0Oo = childAt.getRotationY();
                c0043OooO00o.f7619OooO0o.f7607OooO0o0 = childAt.getScaleX();
                c0043OooO00o.f7619OooO0o.f7606OooO0o = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    OooO oooO = c0043OooO00o.f7619OooO0o;
                    oooO.f7608OooO0oO = pivotX;
                    oooO.f7609OooO0oo = pivotY;
                }
                c0043OooO00o.f7619OooO0o.f7610OooOO0 = childAt.getTranslationX();
                c0043OooO00o.f7619OooO0o.f7611OooOO0O = childAt.getTranslationY();
                c0043OooO00o.f7619OooO0o.f7612OooOO0o = childAt.getTranslationZ();
                OooO oooO2 = c0043OooO00o.f7619OooO0o;
                if (oooO2.f7614OooOOO0) {
                    oooO2.f7613OooOOO = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0043OooO00o.f7620OooO0o0.f7700o00Ooo = barrier.getAllowsGoneWidget();
                    c0043OooO00o.f7620OooO0o0.f7696Ooooooo = barrier.getReferencedIds();
                    c0043OooO00o.f7620OooO0o0.f7694Oooooo0 = barrier.getType();
                    c0043OooO00o.f7620OooO0o0.f7693Oooooo = barrier.getMargin();
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
                    c0043OooO00o.f7618OooO0Oo.f7706OooO00o = true;
                    c0043OooO00o.f7620OooO0o0.f7638OooO0O0 = true;
                    c0043OooO00o.f7617OooO0OO.f7718OooO00o = true;
                    c0043OooO00o.f7619OooO0o.f7602OooO00o = true;
                }
                switch (f7593OooO0oo.get(index)) {
                    case 1:
                        OooO0O0 oooO0O0 = c0043OooO00o.f7620OooO0o0;
                        oooO0O0.f7653OooOOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O0.f7653OooOOo0);
                        break;
                    case 2:
                        OooO0O0 oooO0O1 = c0043OooO00o.f7620OooO0o0;
                        oooO0O1.f7672Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O1.f7672Oooo0O0);
                        break;
                    case 3:
                        OooO0O0 oooO0O2 = c0043OooO00o.f7620OooO0o0;
                        oooO0O2.f7651OooOOOo = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O2.f7651OooOOOo);
                        break;
                    case 4:
                        OooO0O0 oooO0O3 = c0043OooO00o.f7620OooO0o0;
                        oooO0O3.f7650OooOOOO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O3.f7650OooOOOO);
                        break;
                    case 5:
                        c0043OooO00o.f7620OooO0o0.f7660OooOoO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        OooO0O0 oooO0O4 = c0043OooO00o.f7620OooO0o0;
                        oooO0O4.f7665OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O4.f7665OooOooO);
                        break;
                    case 7:
                        OooO0O0 oooO0O5 = c0043OooO00o.f7620OooO0o0;
                        oooO0O5.f7666OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O5.f7666OooOooo);
                        break;
                    case 8:
                        OooO0O0 oooO0O6 = c0043OooO00o.f7620OooO0o0;
                        oooO0O6.f7673Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O6.f7673Oooo0OO);
                        break;
                    case 9:
                        OooO0O0 oooO0O7 = c0043OooO00o.f7620OooO0o0;
                        oooO0O7.f7659OooOo0o = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O7.f7659OooOo0o);
                        break;
                    case 10:
                        OooO0O0 oooO0O8 = c0043OooO00o.f7620OooO0o0;
                        oooO0O8.f7658OooOo0O = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O8.f7658OooOo0O);
                        break;
                    case 11:
                        OooO0O0 oooO0O9 = c0043OooO00o.f7620OooO0o0;
                        oooO0O9.f7680OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O9.f7680OoooO00);
                        break;
                    case 12:
                        OooO0O0 oooO0O10 = c0043OooO00o.f7620OooO0o0;
                        oooO0O10.f7679OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O10.f7679OoooO0);
                        break;
                    case 13:
                        OooO0O0 oooO0O11 = c0043OooO00o.f7620OooO0o0;
                        oooO0O11.f7676Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O11.f7676Oooo0oO);
                        break;
                    case 14:
                        OooO0O0 oooO0O12 = c0043OooO00o.f7620OooO0o0;
                        oooO0O12.f7667Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O12.f7667Oooo);
                        break;
                    case 15:
                        OooO0O0 oooO0O13 = c0043OooO00o.f7620OooO0o0;
                        oooO0O13.f7681OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O13.f7681OoooO0O);
                        break;
                    case 16:
                        OooO0O0 oooO0O14 = c0043OooO00o.f7620OooO0o0;
                        oooO0O14.f7677Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O14.f7677Oooo0oo);
                        break;
                    case 17:
                        OooO0O0 oooO0O15 = c0043OooO00o.f7620OooO0o0;
                        oooO0O15.f7642OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O15.f7642OooO0o0);
                        break;
                    case 18:
                        OooO0O0 oooO0O16 = c0043OooO00o.f7620OooO0o0;
                        oooO0O16.f7641OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O16.f7641OooO0o);
                        break;
                    case 19:
                        OooO0O0 oooO0O17 = c0043OooO00o.f7620OooO0o0;
                        oooO0O17.f7643OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, oooO0O17.f7643OooO0oO);
                        break;
                    case 20:
                        OooO0O0 oooO0O18 = c0043OooO00o.f7620OooO0o0;
                        oooO0O18.f7655OooOo = typedArrayObtainStyledAttributes.getFloat(index, oooO0O18.f7655OooOo);
                        break;
                    case 21:
                        OooO0O0 oooO0O19 = c0043OooO00o.f7620OooO0o0;
                        oooO0O19.f7640OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, oooO0O19.f7640OooO0Oo);
                        break;
                    case 22:
                        OooO0o oooO0o = c0043OooO00o.f7617OooO0OO;
                        oooO0o.f7719OooO0O0 = typedArrayObtainStyledAttributes.getInt(index, oooO0o.f7719OooO0O0);
                        OooO0o oooO0o2 = c0043OooO00o.f7617OooO0OO;
                        oooO0o2.f7719OooO0O0 = f7592OooO0oO[oooO0o2.f7719OooO0O0];
                        break;
                    case 23:
                        OooO0O0 oooO0O20 = c0043OooO00o.f7620OooO0o0;
                        oooO0O20.f7639OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, oooO0O20.f7639OooO0OO);
                        break;
                    case 24:
                        OooO0O0 oooO0O21 = c0043OooO00o.f7620OooO0o0;
                        oooO0O21.f7670Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O21.f7670Oooo00O);
                        break;
                    case 25:
                        OooO0O0 oooO0O22 = c0043OooO00o.f7620OooO0o0;
                        oooO0O22.f7636OooO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O22.f7636OooO);
                        break;
                    case 26:
                        OooO0O0 oooO0O23 = c0043OooO00o.f7620OooO0o0;
                        oooO0O23.f7645OooOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O23.f7645OooOO0);
                        break;
                    case 27:
                        OooO0O0 oooO0O24 = c0043OooO00o.f7620OooO0o0;
                        oooO0O24.f7669Oooo000 = typedArrayObtainStyledAttributes.getInt(index, oooO0O24.f7669Oooo000);
                        break;
                    case 28:
                        OooO0O0 oooO0O25 = c0043OooO00o.f7620OooO0o0;
                        oooO0O25.f7671Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O25.f7671Oooo00o);
                        break;
                    case 29:
                        OooO0O0 oooO0O26 = c0043OooO00o.f7620OooO0o0;
                        oooO0O26.f7646OooOO0O = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O26.f7646OooOO0O);
                        break;
                    case 30:
                        OooO0O0 oooO0O27 = c0043OooO00o.f7620OooO0o0;
                        oooO0O27.f7647OooOO0o = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O27.f7647OooOO0o);
                        break;
                    case 31:
                        OooO0O0 oooO0O28 = c0043OooO00o.f7620OooO0o0;
                        oooO0O28.f7675Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O28.f7675Oooo0o0);
                        break;
                    case 32:
                        OooO0O0 oooO0O29 = c0043OooO00o.f7620OooO0o0;
                        oooO0O29.f7657OooOo00 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O29.f7657OooOo00);
                        break;
                    case 33:
                        OooO0O0 oooO0O30 = c0043OooO00o.f7620OooO0o0;
                        oooO0O30.f7656OooOo0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O30.f7656OooOo0);
                        break;
                    case 34:
                        OooO0O0 oooO0O31 = c0043OooO00o.f7620OooO0o0;
                        oooO0O31.f7668Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O31.f7668Oooo0);
                        break;
                    case 35:
                        OooO0O0 oooO0O32 = c0043OooO00o.f7620OooO0o0;
                        oooO0O32.f7648OooOOO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O32.f7648OooOOO);
                        break;
                    case 36:
                        OooO0O0 oooO0O33 = c0043OooO00o.f7620OooO0o0;
                        oooO0O33.f7649OooOOO0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O33.f7649OooOOO0);
                        break;
                    case 37:
                        OooO0O0 oooO0O34 = c0043OooO00o.f7620OooO0o0;
                        oooO0O34.f7661OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0O34.f7661OooOoO0);
                        break;
                    case 38:
                        c0043OooO00o.f7615OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, c0043OooO00o.f7615OooO00o);
                        break;
                    case 39:
                        OooO0O0 oooO0O35 = c0043OooO00o.f7620OooO0o0;
                        oooO0O35.f7697o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, oooO0O35.f7697o000oOoO);
                        break;
                    case 40:
                        OooO0O0 oooO0O36 = c0043OooO00o.f7620OooO0o0;
                        oooO0O36.f7682OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0O36.f7682OoooOO0);
                        break;
                    case 41:
                        OooO0O0 oooO0O37 = c0043OooO00o.f7620OooO0o0;
                        oooO0O37.f7683OoooOOO = typedArrayObtainStyledAttributes.getInt(index, oooO0O37.f7683OoooOOO);
                        break;
                    case 42:
                        OooO0O0 oooO0O38 = c0043OooO00o.f7620OooO0o0;
                        oooO0O38.f7684OoooOOo = typedArrayObtainStyledAttributes.getInt(index, oooO0O38.f7684OoooOOo);
                        break;
                    case 43:
                        OooO0o oooO0o3 = c0043OooO00o.f7617OooO0OO;
                        oooO0o3.f7721OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0o3.f7721OooO0Oo);
                        break;
                    case 44:
                        OooO oooO = c0043OooO00o.f7619OooO0o;
                        oooO.f7614OooOOO0 = true;
                        oooO.f7613OooOOO = typedArrayObtainStyledAttributes.getDimension(index, oooO.f7613OooOOO);
                        break;
                    case 45:
                        OooO oooO2 = c0043OooO00o.f7619OooO0o;
                        oooO2.f7604OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, oooO2.f7604OooO0OO);
                        break;
                    case 46:
                        OooO oooO3 = c0043OooO00o.f7619OooO0o;
                        oooO3.f7605OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO3.f7605OooO0Oo);
                        break;
                    case 47:
                        OooO oooO4 = c0043OooO00o.f7619OooO0o;
                        oooO4.f7607OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO4.f7607OooO0o0);
                        break;
                    case 48:
                        OooO oooO5 = c0043OooO00o.f7619OooO0o;
                        oooO5.f7606OooO0o = typedArrayObtainStyledAttributes.getFloat(index, oooO5.f7606OooO0o);
                        break;
                    case 49:
                        OooO oooO6 = c0043OooO00o.f7619OooO0o;
                        oooO6.f7608OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, oooO6.f7608OooO0oO);
                        break;
                    case 50:
                        OooO oooO7 = c0043OooO00o.f7619OooO0o;
                        oooO7.f7609OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, oooO7.f7609OooO0oo);
                        break;
                    case 51:
                        OooO oooO8 = c0043OooO00o.f7619OooO0o;
                        oooO8.f7610OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, oooO8.f7610OooOO0);
                        break;
                    case 52:
                        OooO oooO9 = c0043OooO00o.f7619OooO0o;
                        oooO9.f7611OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, oooO9.f7611OooOO0O);
                        break;
                    case 53:
                        OooO oooO10 = c0043OooO00o.f7619OooO0o;
                        oooO10.f7612OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, oooO10.f7612OooOO0o);
                        break;
                    case 54:
                        OooO0O0 oooO0O39 = c0043OooO00o.f7620OooO0o0;
                        oooO0O39.f7685OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, oooO0O39.f7685OoooOo0);
                        break;
                    case 55:
                        OooO0O0 oooO0O40 = c0043OooO00o.f7620OooO0o0;
                        oooO0O40.f7686OoooOoO = typedArrayObtainStyledAttributes.getInt(index, oooO0O40.f7686OoooOoO);
                        break;
                    case 56:
                        OooO0O0 oooO0O41 = c0043OooO00o.f7620OooO0o0;
                        oooO0O41.f7687OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O41.f7687OoooOoo);
                        break;
                    case 57:
                        OooO0O0 oooO0O42 = c0043OooO00o.f7620OooO0o0;
                        oooO0O42.f7688Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O42.f7688Ooooo00);
                        break;
                    case 58:
                        OooO0O0 oooO0O43 = c0043OooO00o.f7620OooO0o0;
                        oooO0O43.f7689Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O43.f7689Ooooo0o);
                        break;
                    case 59:
                        OooO0O0 oooO0O44 = c0043OooO00o.f7620OooO0o0;
                        oooO0O44.f7690OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O44.f7690OooooO0);
                        break;
                    case 60:
                        OooO oooO11 = c0043OooO00o.f7619OooO0o;
                        oooO11.f7603OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, oooO11.f7603OooO0O0);
                        break;
                    case 61:
                        OooO0O0 oooO0O45 = c0043OooO00o.f7620OooO0o0;
                        oooO0O45.f7662OooOoOO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O45.f7662OooOoOO);
                        break;
                    case 62:
                        OooO0O0 oooO0O46 = c0043OooO00o.f7620OooO0o0;
                        oooO0O46.f7664OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O46.f7664OooOoo0);
                        break;
                    case 63:
                        OooO0O0 oooO0O47 = c0043OooO00o.f7620OooO0o0;
                        oooO0O47.f7663OooOoo = typedArrayObtainStyledAttributes.getFloat(index, oooO0O47.f7663OooOoo);
                        break;
                    case 64:
                        OooO0OO oooO0OO = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO.f7707OooO0O0 = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0OO.f7707OooO0O0);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0043OooO00o.f7618OooO0Oo.f7709OooO0Oo = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c0043OooO00o.f7618OooO0Oo.f7709OooO0Oo = o000000O.f27560OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 66:
                        c0043OooO00o.f7618OooO0Oo.f7710OooO0o = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        OooO0OO oooO0OO2 = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO2.f7713OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO2.f7713OooO0oo);
                        break;
                    case 68:
                        OooO0o oooO0o4 = c0043OooO00o.f7617OooO0OO;
                        oooO0o4.f7722OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0o4.f7722OooO0o0);
                        break;
                    case 69:
                        c0043OooO00o.f7620OooO0o0.f7691OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        c0043OooO00o.f7620OooO0o0.f7692OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        OooO0O0 oooO0O48 = c0043OooO00o.f7620OooO0o0;
                        oooO0O48.f7694Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, oooO0O48.f7694Oooooo0);
                        break;
                    case 73:
                        OooO0O0 oooO0O49 = c0043OooO00o.f7620OooO0o0;
                        oooO0O49.f7693Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O49.f7693Oooooo);
                        break;
                    case 74:
                        c0043OooO00o.f7620OooO0o0.f7702o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        OooO0O0 oooO0O50 = c0043OooO00o.f7620OooO0o0;
                        oooO0O50.f7700o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O50.f7700o00Ooo);
                        break;
                    case 76:
                        OooO0OO oooO0OO3 = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO3.f7711OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, oooO0OO3.f7711OooO0o0);
                        break;
                    case 77:
                        c0043OooO00o.f7620OooO0o0.f7703ooOO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        OooO0o oooO0o5 = c0043OooO00o.f7617OooO0OO;
                        oooO0o5.f7720OooO0OO = typedArrayObtainStyledAttributes.getInt(index, oooO0o5.f7720OooO0OO);
                        break;
                    case 79:
                        OooO0OO oooO0OO4 = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO4.f7712OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO4.f7712OooO0oO);
                        break;
                    case 80:
                        OooO0O0 oooO0O51 = c0043OooO00o.f7620OooO0o0;
                        oooO0O51.f7698o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O51.f7698o00O0O);
                        break;
                    case 81:
                        OooO0O0 oooO0O52 = c0043OooO00o.f7620OooO0o0;
                        oooO0O52.f7699o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O52.f7699o00Oo0);
                        break;
                    case 82:
                        OooO0OO oooO0OO5 = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO5.f7708OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO5.f7708OooO0OO);
                        break;
                    case 83:
                        OooO oooO12 = c0043OooO00o.f7619OooO0o;
                        oooO12.f7601OooO = OooOO0o(typedArrayObtainStyledAttributes, index, oooO12.f7601OooO);
                        break;
                    case 84:
                        OooO0OO oooO0OO6 = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO6.f7714OooOO0 = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO6.f7714OooOO0);
                        break;
                    case 85:
                        OooO0OO oooO0OO7 = c0043OooO00o.f7618OooO0Oo;
                        oooO0OO7.f7705OooO = typedArrayObtainStyledAttributes.getFloat(index, oooO0OO7.f7705OooO);
                        break;
                    case 86:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            c0043OooO00o.f7618OooO0Oo.f7717OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            OooO0OO oooO0OO8 = c0043OooO00o.f7618OooO0Oo;
                            if (oooO0OO8.f7717OooOOO0 != -1) {
                                oooO0OO8.f7716OooOO0o = -2;
                            }
                        } else if (i2 == 3) {
                            c0043OooO00o.f7618OooO0Oo.f7715OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                            if (c0043OooO00o.f7618OooO0Oo.f7715OooOO0O.indexOf("/") > 0) {
                                c0043OooO00o.f7618OooO0Oo.f7717OooOOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0043OooO00o.f7618OooO0Oo.f7716OooOO0o = -2;
                            } else {
                                c0043OooO00o.f7618OooO0Oo.f7716OooOO0o = -1;
                            }
                        } else {
                            OooO0OO oooO0OO9 = c0043OooO00o.f7618OooO0Oo;
                            oooO0OO9.f7716OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, oooO0OO9.f7717OooOOO0);
                        }
                        break;
                    case 87:
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unused attribute 0x");
                        sbOooO0o0.append(Integer.toHexString(index));
                        sbOooO0o0.append("   ");
                        sbOooO0o0.append(f7593OooO0oo.get(index));
                        Log.w("ConstraintSet", sbOooO0o0.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Unknown attribute 0x");
                        sbOooO0o1.append(Integer.toHexString(index));
                        sbOooO0o1.append("   ");
                        sbOooO0o1.append(f7593OooO0oo.get(index));
                        Log.w("ConstraintSet", sbOooO0o1.toString());
                        break;
                    case 91:
                        OooO0O0 oooO0O53 = c0043OooO00o.f7620OooO0o0;
                        oooO0O53.f7652OooOOo = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O53.f7652OooOOo);
                        break;
                    case 92:
                        OooO0O0 oooO0O54 = c0043OooO00o.f7620OooO0o0;
                        oooO0O54.f7654OooOOoo = OooOO0o(typedArrayObtainStyledAttributes, index, oooO0O54.f7654OooOOoo);
                        break;
                    case 93:
                        OooO0O0 oooO0O55 = c0043OooO00o.f7620OooO0o0;
                        oooO0O55.f7674Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O55.f7674Oooo0o);
                        break;
                    case 94:
                        OooO0O0 oooO0O56 = c0043OooO00o.f7620OooO0o0;
                        oooO0O56.f7678OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O56.f7678OoooO);
                        break;
                    case 95:
                        OooOOO0(c0043OooO00o.f7620OooO0o0, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        OooOOO0(c0043OooO00o.f7620OooO0o0, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        OooO0O0 oooO0O57 = c0043OooO00o.f7620OooO0o0;
                        oooO0O57.f7701o00o0O = typedArrayObtainStyledAttributes.getInt(index, oooO0O57.f7701o00o0O);
                        break;
                }
            }
            OooO0O0 oooO0O58 = c0043OooO00o.f7620OooO0o0;
            if (oooO0O58.f7702o0OoOo0 != null) {
                oooO0O58.f7696Ooooooo = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0043OooO00o;
    }

    public final C0043OooO00o OooO0oo(int i) {
        if (!this.f7598OooO0o.containsKey(Integer.valueOf(i))) {
            this.f7598OooO0o.put(Integer.valueOf(i), new C0043OooO00o());
        }
        return this.f7598OooO0o.get(Integer.valueOf(i));
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
                        c0043OooO00oOooO0oO.f7620OooO0o0.f7637OooO00o = true;
                    }
                    this.f7598OooO0o.put(Integer.valueOf(c0043OooO00oOooO0oO.f7615OooO00o), c0043OooO00oOooO0oO);
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
                            OooO0O0 oooO0O0 = c0043OooO00oOooO0oO.f7620OooO0o0;
                            oooO0O0.f7637OooO00o = true;
                            oooO0O0.f7638OooO0O0 = true;
                            break;
                        case "Barrier":
                            c0043OooO00oOooO0oO = OooO0oO(context, Xml.asAttributeSet(xmlPullParser), false);
                            c0043OooO00oOooO0oO.f7620OooO0o0.f7695OoooooO = 1;
                            break;
                        case "PropertySet":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7617OooO0OO.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7619OooO0o.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7620OooO0o0.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            c0043OooO00o.f7618OooO0Oo.OooO0O0(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (c0043OooO00o == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            ConstraintAttribute.OooO0o0(context, xmlPullParser, c0043OooO00o.f7621OooO0oO);
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
                        this.f7598OooO0o.put(Integer.valueOf(c0043OooO00o.f7615OooO00o), c0043OooO00o);
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
        OooO0oo(i).f7620OooO0o0.f7655OooOo = f;
    }
}
