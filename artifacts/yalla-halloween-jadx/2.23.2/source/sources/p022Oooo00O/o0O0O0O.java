package p022Oooo00O;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.Oooo0;
import androidx.camera.core.impl.Oooo000;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.o00OO;
import androidx.camera.core.impl.o00Oo00;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o000OO.OooOOO0;
import p023Oooo00o.oO000o00;
import p023Oooo00o.oO00o000;
import p024Oooo0O0.o000O000;
import p025Oooo0OO.o000000;
import p025Oooo0OO.o0000O0;
import p036OoooOOo.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public final class o0O0O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oO000o00 f732OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f739OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOOO0 f740OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000000 f741OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f742OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f743OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f744OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f745OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f746OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f747OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @VisibleForTesting
    public Oooo0 f749OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final o0oOO f750OooOOoo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o0O00o0 f753OooOo0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f733OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f734OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f735OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f736OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f738OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f737OooO0o = new ArrayList();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList f748OooOOo = new ArrayList();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final TargetAspectRatio f752OooOo00 = new TargetAspectRatio();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o0000O0 f751OooOo0 = new o0000O0();

    @RequiresApi(23)
    public static class OooO00o {
        @DoNotInline
        public static Size[] OooO00o(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    @AutoValue
    public static abstract class OooO0O0 {
        public abstract int OooO00o();

        public abstract int OooO0O0();
    }

    public o0O0O0O(@NonNull Context context, @NonNull String str, @NonNull oO00o000 oo00o000, @NonNull OooOOO0 oooOOO0) throws CameraUnavailableException {
        SurfaceConfig.ConfigSize configSize;
        SurfaceConfig.ConfigType configType;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objSingletonList;
        long[] jArr;
        boolean z = false;
        this.f743OooOO0o = false;
        this.f745OooOOO0 = false;
        this.f744OooOOO = false;
        this.f746OooOOOO = false;
        this.f747OooOOOo = false;
        str.getClass();
        this.f739OooO0oO = str;
        oooOOO0.getClass();
        this.f740OooO0oo = oooOOO0;
        this.f741OooOO0 = new o000000();
        this.f750OooOOoo = o0oOO.OooO0O0(context);
        try {
            oO000o00 oo000o00OooO0O0 = oo00o000.OooO0O0(str);
            this.f732OooO = oo000o00OooO0O0;
            Integer num = (Integer) oo000o00OooO0O0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f742OooOO0O = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) oo000o00OooO0O0.OooO00o(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 3) {
                        this.f743OooOO0o = true;
                    } else if (i == 6) {
                        this.f745OooOOO0 = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.f747OooOOOo = true;
                    }
                }
            }
            o0O00o0 o0o00o1 = new o0O00o0(this.f732OooO);
            this.f753OooOo0O = o0o00o1;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            o00OO o00oo2 = new o00OO();
            SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
            SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
            o00oo2.OooO00o(SurfaceConfig.OooO00o(configType2, configSize2));
            arrayList4.add(o00oo2);
            o00OO o00oo3 = new o00OO();
            SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
            o00oo3.OooO00o(SurfaceConfig.OooO00o(configType3, configSize2));
            arrayList4.add(o00oo3);
            o00OO o00oo4 = new o00OO();
            SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.YUV;
            o00oo4.OooO00o(SurfaceConfig.OooO00o(configType4, configSize2));
            arrayList4.add(o00oo4);
            o00OO o00oo5 = new o00OO();
            SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.PREVIEW;
            o00OO o00ooOooO00o = o0O00oO0.OooO00o(configType2, configSize3, o00oo5, configType3, configSize2, arrayList4, o00oo5);
            o00OO o00ooOooO00o2 = o0O00oO0.OooO00o(configType4, configSize3, o00ooOooO00o, configType3, configSize2, arrayList4, o00ooOooO00o);
            o00OO o00ooOooO00o3 = o0O00oO0.OooO00o(configType2, configSize3, o00ooOooO00o2, configType2, configSize3, arrayList4, o00ooOooO00o2);
            o00OO o00ooOooO00o4 = o0O00oO0.OooO00o(configType2, configSize3, o00ooOooO00o3, configType4, configSize3, arrayList4, o00ooOooO00o3);
            o00ooOooO00o4.OooO00o(SurfaceConfig.OooO00o(configType2, configSize3));
            o00ooOooO00o4.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
            o00ooOooO00o4.OooO00o(SurfaceConfig.OooO00o(configType3, configSize2));
            arrayList4.add(o00ooOooO00o4);
            arrayList3.addAll(arrayList4);
            int i2 = this.f742OooOO0O;
            if (i2 == 0 || i2 == 1 || i2 == 3) {
                ArrayList arrayList5 = new ArrayList();
                o00OO o00oo6 = new o00OO();
                o00oo6.OooO00o(SurfaceConfig.OooO00o(configType2, configSize3));
                SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.RECORD;
                o00oo6.OooO00o(SurfaceConfig.OooO00o(configType2, configSize4));
                arrayList5.add(o00oo6);
                o00OO o00oo7 = new o00OO();
                configSize = configSize2;
                configType = configType2;
                o00OO o00ooOooO00o5 = o0O00oO0.OooO00o(configType2, configSize3, o00oo7, configType4, configSize4, arrayList5, o00oo7);
                o00OO o00ooOooO00o6 = o0O00oO0.OooO00o(configType4, configSize3, o00ooOooO00o5, configType4, configSize4, arrayList5, o00ooOooO00o5);
                o00ooOooO00o6.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00ooOooO00o6.OooO00o(SurfaceConfig.OooO00o(configType, configSize4));
                o00ooOooO00o6.OooO00o(SurfaceConfig.OooO00o(configType3, configSize4));
                arrayList5.add(o00ooOooO00o6);
                o00OO o00oo8 = new o00OO();
                o00oo8.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo8.OooO00o(SurfaceConfig.OooO00o(configType4, configSize4));
                o00oo8.OooO00o(SurfaceConfig.OooO00o(configType3, configSize4));
                arrayList5.add(o00oo8);
                o00OO o00oo9 = new o00OO();
                o00oo9.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00oo9.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00oo9.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                arrayList5.add(o00oo9);
                arrayList3.addAll(arrayList5);
            } else {
                configSize = configSize2;
                configType = configType2;
            }
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList6 = new ArrayList();
                o00OO o00oo10 = new o00OO();
                SurfaceConfig.ConfigType configType5 = configType;
                SurfaceConfig.ConfigSize configSize5 = configSize;
                o00OO o00ooOooO00o7 = o0O00oO0.OooO00o(configType5, configSize3, o00oo10, configType, configSize5, arrayList6, o00oo10);
                o00OO o00ooOooO00o8 = o0O00oO0.OooO00o(configType5, configSize3, o00ooOooO00o7, configType4, configSize5, arrayList6, o00ooOooO00o7);
                o00OO o00ooOooO00o9 = o0O00oO0.OooO00o(configType4, configSize3, o00ooOooO00o8, configType4, configSize, arrayList6, o00ooOooO00o8);
                o00ooOooO00o9.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00ooOooO00o9.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00ooOooO00o9.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                arrayList6.add(o00ooOooO00o9);
                o00OO o00oo11 = new o00OO();
                SurfaceConfig.ConfigSize configSize6 = SurfaceConfig.ConfigSize.VGA;
                o00oo11.OooO00o(SurfaceConfig.OooO00o(configType4, configSize6));
                o00oo11.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo11.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                arrayList6.add(o00oo11);
                o00OO o00oo12 = new o00OO();
                o00oo12.OooO00o(SurfaceConfig.OooO00o(configType4, configSize6));
                o00oo12.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00oo12.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                arrayList6.add(o00oo12);
                arrayList3.addAll(arrayList6);
            }
            if (this.f743OooOO0o) {
                ArrayList arrayList7 = new ArrayList();
                o00OO o00oo13 = new o00OO();
                SurfaceConfig.ConfigType configType6 = SurfaceConfig.ConfigType.RAW;
                o00oo13.OooO00o(SurfaceConfig.OooO00o(configType6, configSize));
                arrayList7.add(o00oo13);
                o00OO o00oo14 = new o00OO();
                o00OO o00ooOooO00o10 = o0O00oO0.OooO00o(configType, configSize3, o00oo14, configType6, configSize, arrayList7, o00oo14);
                o00OO o00ooOooO00o11 = o0O00oO0.OooO00o(configType4, configSize3, o00ooOooO00o10, configType6, configSize, arrayList7, o00ooOooO00o10);
                o00ooOooO00o11.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00ooOooO00o11.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00ooOooO00o11.OooO00o(SurfaceConfig.OooO00o(configType6, configSize));
                arrayList7.add(o00ooOooO00o11);
                o00OO o00oo15 = new o00OO();
                o00oo15.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo15.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00oo15.OooO00o(SurfaceConfig.OooO00o(configType6, configSize));
                arrayList7.add(o00oo15);
                o00OO o00oo16 = new o00OO();
                o00oo16.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00oo16.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00oo16.OooO00o(SurfaceConfig.OooO00o(configType6, configSize));
                arrayList7.add(o00oo16);
                o00OO o00oo17 = new o00OO();
                o00oo17.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo17.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                o00oo17.OooO00o(SurfaceConfig.OooO00o(configType6, configSize));
                arrayList7.add(o00oo17);
                o00OO o00oo18 = new o00OO();
                o00oo18.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00oo18.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                o00oo18.OooO00o(SurfaceConfig.OooO00o(configType6, configSize));
                arrayList7.add(o00oo18);
                arrayList3.addAll(arrayList7);
            }
            if (this.f745OooOOO0 && i2 == 0) {
                ArrayList arrayList8 = new ArrayList();
                o00OO o00oo19 = new o00OO();
                SurfaceConfig.ConfigType configType7 = configType;
                SurfaceConfig.ConfigSize configSize7 = configSize;
                o00OO o00ooOooO00o12 = o0O00oO0.OooO00o(configType7, configSize3, o00oo19, configType, configSize7, arrayList8, o00oo19);
                o00OO o00ooOooO00o13 = o0O00oO0.OooO00o(configType7, configSize3, o00ooOooO00o12, configType4, configSize7, arrayList8, o00ooOooO00o12);
                o00ooOooO00o13.OooO00o(SurfaceConfig.OooO00o(configType4, configSize3));
                o00ooOooO00o13.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                arrayList8.add(o00ooOooO00o13);
                arrayList3.addAll(arrayList8);
            }
            if (i2 == 3) {
                ArrayList arrayList9 = new ArrayList();
                o00OO o00oo20 = new o00OO();
                o00oo20.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                SurfaceConfig.ConfigSize configSize8 = SurfaceConfig.ConfigSize.VGA;
                o00oo20.OooO00o(SurfaceConfig.OooO00o(configType, configSize8));
                o00oo20.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                SurfaceConfig.ConfigType configType8 = SurfaceConfig.ConfigType.RAW;
                o00oo20.OooO00o(SurfaceConfig.OooO00o(configType8, configSize));
                arrayList9.add(o00oo20);
                o00OO o00oo21 = new o00OO();
                o00oo21.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo21.OooO00o(SurfaceConfig.OooO00o(configType, configSize8));
                o00oo21.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                o00oo21.OooO00o(SurfaceConfig.OooO00o(configType8, configSize));
                arrayList9.add(o00oo21);
                arrayList3.addAll(arrayList9);
            }
            ArrayList arrayList10 = this.f733OooO00o;
            arrayList10.addAll(arrayList3);
            if (this.f741OooOO0.f1033OooO00o == null) {
                objSingletonList = new ArrayList();
            } else {
                o00OO o00oo22 = o000O000.f1010OooO00o;
                String str2 = Build.DEVICE;
                boolean z2 = "heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2);
                o00OO o00oo23 = o000O000.f1010OooO00o;
                if (z2) {
                    arrayList2 = new ArrayList();
                    if (this.f739OooO0oO.equals("1")) {
                        objSingletonList = arrayList2;
                        arrayList2.add(o00oo23);
                        objSingletonList = arrayList2;
                    }
                } else if (o000O000.OooO0Oo()) {
                    arrayList = new ArrayList();
                    if (i2 == 0) {
                        objSingletonList = arrayList;
                        arrayList.add(o00oo23);
                        arrayList.add(o000O000.f1011OooO0O0);
                        objSingletonList = arrayList;
                    }
                } else {
                    objSingletonList = o000O000.OooO0o0() ? Collections.singletonList(o000O000.f1012OooO0OO) : Collections.emptyList();
                }
            }
            objSingletonList = arrayList;
            objSingletonList = arrayList2;
            arrayList10.addAll(objSingletonList);
            if (this.f747OooOOOo) {
                ArrayList arrayList11 = new ArrayList();
                o00OO o00oo24 = new o00OO();
                SurfaceConfig.ConfigSize configSize9 = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
                o00oo24.OooO00o(SurfaceConfig.OooO00o(configType4, configSize9));
                o00oo24.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                SurfaceConfig.ConfigSize configSize10 = SurfaceConfig.ConfigSize.RECORD;
                o00oo24.OooO00o(SurfaceConfig.OooO00o(configType, configSize10));
                arrayList11.add(o00oo24);
                o00OO o00oo25 = new o00OO();
                o00oo25.OooO00o(SurfaceConfig.OooO00o(configType3, configSize9));
                o00oo25.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo25.OooO00o(SurfaceConfig.OooO00o(configType, configSize10));
                arrayList11.add(o00oo25);
                o00OO o00oo26 = new o00OO();
                SurfaceConfig.ConfigType configType9 = SurfaceConfig.ConfigType.RAW;
                o00oo26.OooO00o(SurfaceConfig.OooO00o(configType9, configSize9));
                o00oo26.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo26.OooO00o(SurfaceConfig.OooO00o(configType, configSize10));
                arrayList11.add(o00oo26);
                o00OO o00oo27 = new o00OO();
                o00oo27.OooO00o(SurfaceConfig.OooO00o(configType4, configSize9));
                o00oo27.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo27.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                arrayList11.add(o00oo27);
                o00OO o00oo28 = new o00OO();
                o00oo28.OooO00o(SurfaceConfig.OooO00o(configType3, configSize9));
                o00oo28.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo28.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                arrayList11.add(o00oo28);
                o00OO o00oo29 = new o00OO();
                o00oo29.OooO00o(SurfaceConfig.OooO00o(configType9, configSize9));
                o00oo29.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo29.OooO00o(SurfaceConfig.OooO00o(configType3, configSize));
                arrayList11.add(o00oo29);
                o00OO o00oo30 = new o00OO();
                o00oo30.OooO00o(SurfaceConfig.OooO00o(configType4, configSize9));
                o00oo30.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo30.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                arrayList11.add(o00oo30);
                o00OO o00oo31 = new o00OO();
                o00oo31.OooO00o(SurfaceConfig.OooO00o(configType3, configSize9));
                o00oo31.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo31.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                arrayList11.add(o00oo31);
                o00OO o00oo32 = new o00OO();
                o00oo32.OooO00o(SurfaceConfig.OooO00o(configType9, configSize9));
                o00oo32.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo32.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                arrayList11.add(o00oo32);
                o00OO o00oo33 = new o00OO();
                o00oo33.OooO00o(SurfaceConfig.OooO00o(configType4, configSize9));
                o00oo33.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo33.OooO00o(SurfaceConfig.OooO00o(configType9, configSize));
                arrayList11.add(o00oo33);
                o00OO o00oo34 = new o00OO();
                o00oo34.OooO00o(SurfaceConfig.OooO00o(configType3, configSize9));
                o00oo34.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo34.OooO00o(SurfaceConfig.OooO00o(configType9, configSize));
                arrayList11.add(o00oo34);
                o00OO o00oo35 = new o00OO();
                o00oo35.OooO00o(SurfaceConfig.OooO00o(configType9, configSize9));
                o00oo35.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo35.OooO00o(SurfaceConfig.OooO00o(configType9, configSize));
                arrayList11.add(o00oo35);
                this.f734OooO0O0.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f744OooOOO = zHasSystemFeature;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = new ArrayList();
                o00OO o00oo36 = new o00OO();
                SurfaceConfig.ConfigSize configSize11 = SurfaceConfig.ConfigSize.s1440p;
                o00oo36.OooO00o(SurfaceConfig.OooO00o(configType4, configSize11));
                arrayList12.add(o00oo36);
                o00OO o00oo37 = new o00OO();
                o00oo37.OooO00o(SurfaceConfig.OooO00o(configType, configSize11));
                arrayList12.add(o00oo37);
                o00OO o00oo38 = new o00OO();
                o00oo38.OooO00o(SurfaceConfig.OooO00o(configType3, configSize11));
                arrayList12.add(o00oo38);
                o00OO o00oo39 = new o00OO();
                SurfaceConfig.ConfigSize configSize12 = SurfaceConfig.ConfigSize.s720p;
                o00OO o00ooOooO00o14 = o0O00oO0.OooO00o(configType4, configSize12, o00oo39, configType3, configSize11, arrayList12, o00oo39);
                o00OO o00ooOooO00o15 = o0O00oO0.OooO00o(configType, configSize12, o00ooOooO00o14, configType3, configSize11, arrayList12, o00ooOooO00o14);
                o00OO o00ooOooO00o16 = o0O00oO0.OooO00o(configType4, configSize12, o00ooOooO00o15, configType4, configSize11, arrayList12, o00ooOooO00o15);
                o00OO o00ooOooO00o17 = o0O00oO0.OooO00o(configType4, configSize12, o00ooOooO00o16, configType, configSize11, arrayList12, o00ooOooO00o16);
                o00OO o00ooOooO00o18 = o0O00oO0.OooO00o(configType, configSize12, o00ooOooO00o17, configType4, configSize11, arrayList12, o00ooOooO00o17);
                o00ooOooO00o18.OooO00o(SurfaceConfig.OooO00o(configType, configSize12));
                o00ooOooO00o18.OooO00o(SurfaceConfig.OooO00o(configType, configSize11));
                arrayList12.add(o00ooOooO00o18);
                this.f735OooO0OO.addAll(arrayList12);
            }
            if (o0o00o1.f729OooO0OO) {
                ArrayList arrayList13 = new ArrayList();
                o00OO o00oo40 = new o00OO();
                o00oo40.OooO00o(SurfaceConfig.OooO00o(configType, configSize));
                arrayList13.add(o00oo40);
                o00OO o00oo41 = new o00OO();
                o00oo41.OooO00o(SurfaceConfig.OooO00o(configType4, configSize));
                arrayList13.add(o00oo41);
                o00OO o00oo42 = new o00OO();
                SurfaceConfig.ConfigType configType10 = configType;
                SurfaceConfig.ConfigSize configSize13 = configSize;
                o00OO o00ooOooO00o19 = o0O00oO0.OooO00o(configType10, configSize3, o00oo42, configType3, configSize13, arrayList13, o00oo42);
                o00OO o00ooOooO00o20 = o0O00oO0.OooO00o(configType10, configSize3, o00ooOooO00o19, configType4, configSize13, arrayList13, o00ooOooO00o19);
                o00OO o00ooOooO00o21 = o0O00oO0.OooO00o(configType4, configSize3, o00ooOooO00o20, configType4, configSize, arrayList13, o00ooOooO00o20);
                o00ooOooO00o21.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                SurfaceConfig.ConfigSize configSize14 = SurfaceConfig.ConfigSize.RECORD;
                o00ooOooO00o21.OooO00o(SurfaceConfig.OooO00o(configType, configSize14));
                arrayList13.add(o00ooOooO00o21);
                o00OO o00oo43 = new o00OO();
                o00oo43.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo43.OooO00o(SurfaceConfig.OooO00o(configType, configSize14));
                o00oo43.OooO00o(SurfaceConfig.OooO00o(configType4, configSize14));
                arrayList13.add(o00oo43);
                o00OO o00oo44 = new o00OO();
                o00oo44.OooO00o(SurfaceConfig.OooO00o(configType, configSize3));
                o00oo44.OooO00o(SurfaceConfig.OooO00o(configType, configSize14));
                o00oo44.OooO00o(SurfaceConfig.OooO00o(configType3, configSize14));
                arrayList13.add(o00oo44);
                this.f738OooO0o0.addAll(arrayList13);
            }
            oO000o00 oo000o00 = this.f732OooO;
            OooO0o oooO0o = o0oO0Ooo.f874OooO00o;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33 && (jArr = (long[]) oo000o00.OooO00o(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
                z = true;
            }
            this.f746OooOOOO = z;
            if (z && i3 >= 33) {
                ArrayList arrayList14 = new ArrayList();
                o00OO o00oo45 = new o00OO();
                SurfaceConfig.ConfigSize configSize15 = SurfaceConfig.ConfigSize.s1440p;
                o00oo45.OooO00o(new Oooo000(configType, configSize15, 4L));
                arrayList14.add(o00oo45);
                o00OO o00oo46 = new o00OO();
                o00oo46.OooO00o(new Oooo000(configType4, configSize15, 4L));
                arrayList14.add(o00oo46);
                o00OO o00oo47 = new o00OO();
                SurfaceConfig.ConfigSize configSize16 = SurfaceConfig.ConfigSize.RECORD;
                o00oo47.OooO00o(new Oooo000(configType, configSize16, 3L));
                arrayList14.add(o00oo47);
                o00OO o00oo48 = new o00OO();
                o00oo48.OooO00o(new Oooo000(configType4, configSize16, 3L));
                arrayList14.add(o00oo48);
                o00OO o00oo49 = new o00OO();
                o00oo49.OooO00o(new Oooo000(configType3, configSize, 2L));
                arrayList14.add(o00oo49);
                o00OO o00oo50 = new o00OO();
                o00oo50.OooO00o(new Oooo000(configType4, configSize, 2L));
                arrayList14.add(o00oo50);
                o00OO o00oo51 = new o00OO();
                o00oo51.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo51.OooO00o(new Oooo000(configType3, configSize, 2L));
                arrayList14.add(o00oo51);
                o00OO o00oo52 = new o00OO();
                o00oo52.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo52.OooO00o(new Oooo000(configType4, configSize, 2L));
                arrayList14.add(o00oo52);
                o00OO o00oo53 = new o00OO();
                o00oo53.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo53.OooO00o(new Oooo000(configType, configSize16, 3L));
                arrayList14.add(o00oo53);
                o00OO o00oo54 = new o00OO();
                o00oo54.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo54.OooO00o(new Oooo000(configType4, configSize16, 3L));
                arrayList14.add(o00oo54);
                o00OO o00oo55 = new o00OO();
                o00oo55.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo55.OooO00o(new Oooo000(configType4, configSize3, 1L));
                arrayList14.add(o00oo55);
                o00OO o00oo56 = new o00OO();
                o00oo56.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo56.OooO00o(new Oooo000(configType, configSize16, 3L));
                o00oo56.OooO00o(new Oooo000(configType3, configSize16, 2L));
                arrayList14.add(o00oo56);
                o00OO o00oo57 = new o00OO();
                o00oo57.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo57.OooO00o(new Oooo000(configType4, configSize16, 3L));
                o00oo57.OooO00o(new Oooo000(configType3, configSize16, 2L));
                arrayList14.add(o00oo57);
                o00OO o00oo58 = new o00OO();
                o00oo58.OooO00o(new Oooo000(configType, configSize3, 1L));
                o00oo58.OooO00o(new Oooo000(configType4, configSize3, 1L));
                o00oo58.OooO00o(new Oooo000(configType3, configSize, 2L));
                arrayList14.add(o00oo58);
                this.f737OooO0o.addAll(arrayList14);
            }
            OooO0O0();
        } catch (CameraAccessExceptionCompat e) {
            throw o00OO000.OooO00o(e);
        }
    }

    public static Size OooO0OO(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] sizeArrOooO00o;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        p031OoooO0.Oooo0 oooo0 = new p031OoooO0.Oooo0(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), oooo0);
        Size size2 = o0000oo.f1445OooO00o;
        if (z && (sizeArrOooO00o = OooO00o.OooO00o(streamConfigurationMap, i)) != null && sizeArrOooO00o.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrOooO00o), oooo0);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), oooo0);
    }

    public static int OooO0o(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static int OooO0o0(Range<Integer> range, Range<Integer> range2) {
        OooOOO0.OooO0o("Ranges must not intersect", (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    @NonNull
    @VisibleForTesting
    public final Oooo0 OooO(int i) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.f748OooOOo;
        if (!arrayList.contains(Integer.valueOf(i))) {
            OooOO0(this.f749OooOOo0.f3604OooO0O0, o0000oo.f1450OooO0o0, i);
            OooOO0(this.f749OooOOo0.f3606OooO0Oo, o0000oo.f1451OooO0oO, i);
            Map<Integer, Size> map = this.f749OooOOo0.f3607OooO0o;
            oO000o00 oo000o00 = this.f732OooO;
            Size sizeOooO0OO = OooO0OO(oo000o00.OooO0O0().f995OooO00o.f971OooO00o, i, true);
            if (sizeOooO0OO != null) {
                map.put(Integer.valueOf(i), sizeOooO0OO);
            }
            Map<Integer, Size> map2 = this.f749OooOOo0.f3609OooO0oO;
            if (Build.VERSION.SDK_INT >= 31 && this.f747OooOOOo && (streamConfigurationMap = (StreamConfigurationMap) oo000o00.OooO00o(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i), OooO0OO(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.f749OooOOo0;
    }

    public final boolean OooO00o(@NonNull OooOO0O oooOO0O, List list) {
        List list2;
        HashMap map = this.f736OooO0Oo;
        if (map.containsKey(oooOO0O)) {
            list2 = (List) map.get(oooOO0O);
        } else {
            ArrayList arrayList = new ArrayList();
            int i = oooOO0O.f443OooO00o;
            int i2 = oooOO0O.f444OooO0O0;
            if (i2 == 8) {
                if (i != 1) {
                    ArrayList arrayList2 = this.f733OooO00o;
                    if (i != 2) {
                        arrayList.addAll(arrayList2);
                    } else {
                        arrayList.addAll(this.f734OooO0O0);
                        arrayList.addAll(arrayList2);
                    }
                } else {
                    arrayList = this.f735OooO0OO;
                }
            } else if (i2 == 10 && i == 0) {
                arrayList.addAll(this.f738OooO0o0);
            }
            map.put(oooOO0O, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = ((o00OO) it.next()).OooO0OO(list) != null;
            if (z) {
                break;
            }
        }
        return z;
    }

    public final void OooO0O0() {
        Size size;
        Size size2;
        Size sizeOooO0o0 = this.f750OooOOoo.OooO0o0();
        try {
            int i = Integer.parseInt(this.f739OooO0oO);
            OooOOO0 oooOOO0 = this.f740OooO0oo;
            CamcorderProfile camcorderProfileOooO00o = null;
            CamcorderProfile camcorderProfileOooO00o2 = oooOOO0.OooO0O0(i, 1) ? oooOOO0.OooO00o(i, 1) : null;
            if (camcorderProfileOooO00o2 != null) {
                size2 = new Size(camcorderProfileOooO00o2.videoFrameWidth, camcorderProfileOooO00o2.videoFrameHeight);
            } else {
                size = o0000oo.f1448OooO0Oo;
                if (oooOOO0.OooO0O0(i, 10)) {
                    camcorderProfileOooO00o = oooOOO0.OooO00o(i, 10);
                } else if (oooOOO0.OooO0O0(i, 8)) {
                    camcorderProfileOooO00o = oooOOO0.OooO00o(i, 8);
                } else if (oooOOO0.OooO0O0(i, 12)) {
                    camcorderProfileOooO00o = oooOOO0.OooO00o(i, 12);
                } else if (oooOOO0.OooO0O0(i, 6)) {
                    camcorderProfileOooO00o = oooOOO0.OooO00o(i, 6);
                } else if (oooOOO0.OooO0O0(i, 5)) {
                    camcorderProfileOooO00o = oooOOO0.OooO00o(i, 5);
                } else if (oooOOO0.OooO0O0(i, 4)) {
                    camcorderProfileOooO00o = oooOOO0.OooO00o(i, 4);
                }
                if (camcorderProfileOooO00o != null) {
                    size = new Size(camcorderProfileOooO00o.videoFrameWidth, camcorderProfileOooO00o.videoFrameHeight);
                }
                size2 = size;
            }
        } catch (NumberFormatException unused) {
            Size[] outputSizes = this.f732OooO.OooO0O0().f995OooO00o.f971OooO00o.getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new p031OoooO0.Oooo0(true));
                int length = outputSizes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size = o0000oo.f1448OooO0Oo;
                        break;
                    }
                    Size size3 = outputSizes[i2];
                    int width = size3.getWidth();
                    Size size4 = o0000oo.f1449OooO0o;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size = size3;
                        break;
                    }
                    i2++;
                }
            } else {
                size = o0000oo.f1448OooO0Oo;
            }
        }
        this.f749OooOOo0 = new Oooo0(o0000oo.f1447OooO0OO, new HashMap(), sizeOooO0o0, new HashMap(), size2, new HashMap(), new HashMap());
    }

    @Nullable
    public final List OooO0Oo(@NonNull OooOO0O oooOO0O, List list) {
        List<SurfaceConfig> listOooO0OO;
        OooO0o oooO0o = o0oO0Ooo.f874OooO00o;
        if (!(oooOO0O.f443OooO00o == 0 && oooOO0O.f444OooO0O0 == 8)) {
            return null;
        }
        for (o00OO o00oo2 : this.f737OooO0o) {
            if (o00oo2.f3725OooO00o.size() == list.size() && (listOooO0OO = o00oo2.OooO0OO(list)) != null) {
                return listOooO0OO;
            }
        }
        return null;
    }

    public final Pair OooO0oO(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, @Nullable HashMap map, @Nullable HashMap map2) {
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.OooO00o oooO00o = (androidx.camera.core.impl.OooO00o) it.next();
            arrayList4.add(oooO00o.OooO0o());
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), oooO00o);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            o00Oo00 o00oo00 = (o00Oo00) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int iOooO0o = o00oo00.OooO0o();
            arrayList4.add(SurfaceConfig.OooO0o0(i, iOooO0o, size, OooO(iOooO0o)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), o00oo00);
            }
            i2 = OooO0oo(i2, o00oo00.OooO0o(), size);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    public final int OooO0oo(int i, int i2, Size size) {
        int outputMinFrameDuration;
        try {
            outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f732OooO.OooO00o(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i2, size));
        } catch (Exception unused) {
            outputMinFrameDuration = 0;
        }
        return Math.min(i, outputMinFrameDuration);
    }

    public final void OooOO0(@NonNull Map<Integer, Size> map, @NonNull Size size, int i) {
        if (this.f744OooOOO) {
            Size sizeOooO0OO = OooO0OO(this.f732OooO.OooO0O0().f995OooO00o.f971OooO00o, i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeOooO0OO != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeOooO0OO), new p031OoooO0.Oooo0(false));
            }
            map.put(numValueOf, size);
        }
    }
}
