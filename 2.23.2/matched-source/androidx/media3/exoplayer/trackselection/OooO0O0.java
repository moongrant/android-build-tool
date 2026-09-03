package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.o0OoOo0;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o00000;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0O000;
import com.google.common.collect.o0O0o;
import com.google.common.collect.o0oO0Ooo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import o000O.oo0o0Oo;
import o000O00O.o00O;
import p080o000OoO.o00;
import p080o000OoO.o00oO0o;
import p425o0OoO0o.o00O0O;
import p425o0OoO0o.o00Oo0;
import p425o0OoO0o.o00Ooo;
import p425o0OoO0o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 extends MappingTrackSelector implements RendererCapabilities.OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0O000<Integer> f8131OooOO0 = o0O000.OooO00o(new o00O0O());

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o0O000<Integer> f8132OooOO0O = o0O000.OooO00o(new o00Oo0());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("lock")
    public androidx.media3.common.OooO00o f8133OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f8134OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Context f8135OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f8136OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.OooO0o.OooO0O0 f8137OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("lock")
    public OooO0OO f8138OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public final OooO f8139OooO0oo;

    @RequiresApi(32)
    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Spatializer f8140OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f8141OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Handler f8142OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public androidx.media3.exoplayer.trackselection.OooO0OO f8143OooO0Oo;

        public OooO(Spatializer spatializer) {
            this.f8140OooO00o = spatializer;
            this.f8141OooO0O0 = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean OooO00o(androidx.media3.common.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1) {
            boolean zEquals = "audio/eac3-joc".equals(oooOO1.f6412OooOOOO);
            int i = oooOO1.f6426OooOoo0;
            if (zEquals && i == 16) {
                i = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(o00.OooOOOo(i));
            int i2 = oooOO1.f6425OooOoo;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return this.f8140OooO00o.canBeSpatialized(oooO00o.OooO0OO().f6354OooO00o, channelMask.build());
        }
    }

    public static final class OooO00o extends OooOO0O<OooO00o> implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f8144OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f8145OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final String f8146OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final OooO0OO f8147OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f8148OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f8149OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f8150OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f8151OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f8152OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final int f8153OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final int f8154OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f8155OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final boolean f8156OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final int f8157OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final int f8158OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final int f8159OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f8160OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final boolean f8161OooOoO0;

        public OooO00o(int i, o000oOoO o000oooo2, int i2, OooO0OO oooO0OO, int i3, boolean z, o00Ooo o00ooo2) {
            int i4;
            int iOooOO0O;
            int iOooOO0O2;
            boolean z2;
            super(i, i2, o000oooo2);
            this.f8147OooOO0O = oooO0OO;
            this.f8146OooOO0 = OooO0O0.OooOOO(this.f8232OooO0oO.f6403OooO0o);
            int i5 = 0;
            this.f8148OooOO0o = OooO0O0.OooOO0o(i3, false);
            int i6 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i6 >= oooO0OO.f6811OooOOo0.size()) {
                    iOooOO0O = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOooOO0O = OooO0O0.OooOO0O(this.f8232OooO0oO, oooO0OO.f6811OooOOo0.get(i6), false);
                    if (iOooOO0O > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f8149OooOOO = i6;
            this.f8150OooOOO0 = iOooOO0O;
            this.f8151OooOOOO = OooO0O0.OooO0oo(this.f8232OooO0oO.f6406OooO0oo, oooO0OO.f6810OooOOo);
            androidx.media3.common.OooOO0 oooOO1 = this.f8232OooO0oO;
            int i7 = oooOO1.f6406OooO0oo;
            this.f8152OooOOOo = i7 == 0 || (i7 & 1) != 0;
            this.f8155OooOOoo = (oooOO1.f6405OooO0oO & 1) != 0;
            int i8 = oooOO1.f6426OooOoo0;
            this.f8158OooOo00 = i8;
            this.f8157OooOo0 = oooOO1.f6425OooOoo;
            int i9 = oooOO1.f6408OooOO0O;
            this.f8159OooOo0O = i9;
            this.f8144OooO = (i9 == -1 || i9 <= oooO0OO.f6815OooOo00) && (i8 == -1 || i8 <= oooO0OO.f6812OooOOoo) && o00ooo2.apply(oooOO1);
            String[] strArrOooOoO = o00.OooOoO();
            int i10 = 0;
            while (true) {
                if (i10 >= strArrOooOoO.length) {
                    iOooOO0O2 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOooOO0O2 = OooO0O0.OooOO0O(this.f8232OooO0oO, strArrOooOoO[i10], false);
                    if (iOooOO0O2 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f8154OooOOo0 = i10;
            this.f8153OooOOo = iOooOO0O2;
            int i11 = 0;
            while (true) {
                ImmutableList<String> immutableList = oooO0OO.f6814OooOo0;
                if (i11 < immutableList.size()) {
                    String str = this.f8232OooO0oO.f6412OooOOOO;
                    if (str != null && str.equals(immutableList.get(i11))) {
                        i4 = i11;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            this.f8160OooOo0o = i4;
            this.f8156OooOo = o00O.OooO0O0(i3) == 128;
            this.f8161OooOoO0 = o00O.OooO0OO(i3) == 64;
            OooO0OO oooO0OO2 = this.f8147OooOO0O;
            if (OooO0O0.OooOO0o(i3, oooO0OO2.f8190o00Ooo) && ((z2 = this.f8144OooO) || oooO0OO2.f8186OoooooO)) {
                i5 = (!OooO0O0.OooOO0o(i3, false) || !z2 || this.f8232OooO0oO.f6408OooOO0O == -1 || oooO0OO2.f6820OooOoOO || oooO0OO2.f6818OooOoO || (!oooO0OO2.f8194o00ooo && z)) ? 1 : 2;
            }
            this.f8145OooO0oo = i5;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f8145OooO0oo;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final boolean OooO0O0(OooOO0O oooOO0O) {
            int i;
            String str;
            int i2;
            OooO00o oooO00o = (OooO00o) oooOO0O;
            OooO0OO oooO0OO = this.f8147OooOO0O;
            boolean z = oooO0OO.f8197ooOO;
            androidx.media3.common.OooOO0 oooOO1 = oooO00o.f8232OooO0oO;
            androidx.media3.common.OooOO0 oooOO2 = this.f8232OooO0oO;
            if ((z || ((i2 = oooOO2.f6426OooOoo0) != -1 && i2 == oooOO1.f6426OooOoo0)) && ((oooO0OO.f8187Ooooooo || ((str = oooOO2.f6412OooOOOO) != null && TextUtils.equals(str, oooOO1.f6412OooOOOO))) && (oooO0OO.f8195o0OoOo0 || ((i = oooOO2.f6425OooOoo) != -1 && i == oooOO1.f6425OooOoo)))) {
                if (!oooO0OO.f8188o00O0O) {
                    if (this.f8156OooOo != oooO00o.f8156OooOo || this.f8161OooOoO0 != oooO00o.f8161OooOoO0) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO00o oooO00o) {
            boolean z = this.f8148OooOO0o;
            boolean z2 = this.f8144OooO;
            Object objOooO0O0 = (z2 && z) ? OooO0O0.f8131OooOO0 : OooO0O0.f8131OooOO0.OooO0O0();
            o00000 o00000VarOooO0Oo = o00000.f18919OooO00o.OooO0Oo(z, oooO00o.f8148OooOO0o);
            Integer numValueOf = Integer.valueOf(this.f8149OooOOO);
            Integer numValueOf2 = Integer.valueOf(oooO00o.f8149OooOOO);
            o0O0o.f19109OooO0Oo.getClass();
            o0oO0Ooo o0oo0ooo2 = o0oO0Ooo.f19171OooO0Oo;
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oo0ooo2).OooO00o(this.f8150OooOOO0, oooO00o.f8150OooOOO0).OooO00o(this.f8151OooOOOO, oooO00o.f8151OooOOOO).OooO0Oo(this.f8155OooOOoo, oooO00o.f8155OooOOoo).OooO0Oo(this.f8152OooOOOo, oooO00o.f8152OooOOOo).OooO0OO(Integer.valueOf(this.f8154OooOOo0), Integer.valueOf(oooO00o.f8154OooOOo0), o0oo0ooo2).OooO00o(this.f8153OooOOo, oooO00o.f8153OooOOo).OooO0Oo(z2, oooO00o.f8144OooO).OooO0OO(Integer.valueOf(this.f8160OooOo0o), Integer.valueOf(oooO00o.f8160OooOo0o), o0oo0ooo2);
            int i = this.f8159OooOo0O;
            Integer numValueOf3 = Integer.valueOf(i);
            int i2 = oooO00o.f8159OooOo0O;
            o00000 o00000VarOooO0OO2 = o00000VarOooO0OO.OooO0OO(numValueOf3, Integer.valueOf(i2), this.f8147OooOO0O.f6818OooOoO ? OooO0O0.f8131OooOO0.OooO0O0() : OooO0O0.f8132OooOO0O).OooO0Oo(this.f8156OooOo, oooO00o.f8156OooOo).OooO0Oo(this.f8161OooOoO0, oooO00o.f8161OooOoO0).OooO0OO(Integer.valueOf(this.f8158OooOo00), Integer.valueOf(oooO00o.f8158OooOo00), objOooO0O0).OooO0OO(Integer.valueOf(this.f8157OooOo0), Integer.valueOf(oooO00o.f8157OooOo0), objOooO0O0);
            Integer numValueOf4 = Integer.valueOf(i);
            Integer numValueOf5 = Integer.valueOf(i2);
            if (!o00.OooO00o(this.f8146OooOO0, oooO00o.f8146OooOO0)) {
                objOooO0O0 = OooO0O0.f8132OooOO0O;
            }
            return o00000VarOooO0OO2.OooO0OO(numValueOf4, numValueOf5, objOooO0O0).OooO0o();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.trackselection.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0153OooO0O0 implements Comparable<C0153OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f8162OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f8163OooO0o0;

        public C0153OooO0O0(androidx.media3.common.OooOO0 oooOO1, int i) {
            this.f8162OooO0Oo = (oooOO1.f6405OooO0oO & 1) != 0;
            this.f8163OooO0o0 = OooO0O0.OooOO0o(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0153OooO0O0 c0153OooO0O0) {
            C0153OooO0O0 c0153OooO0O1 = c0153OooO0O0;
            return o00000.f18919OooO00o.OooO0Oo(this.f8163OooO0o0, c0153OooO0O1.f8163OooO0o0).OooO0Oo(this.f8162OooO0Oo, c0153OooO0O1.f8162OooO0Oo).OooO0o();
        }
    }

    public static final class OooO0o implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8217OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8218OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f8219OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final String f8215OooO0oO = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final String f8216OooO0oo = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f8214OooO = o00.Oooo00o(2);

        static {
            new oo000o();
        }

        @UnstableApi
        public OooO0o(int i, int i2, int[] iArr) {
            this.f8217OooO0Oo = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8219OooO0o0 = iArrCopyOf;
            this.f8218OooO0o = i2;
            Arrays.sort(iArrCopyOf);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f8217OooO0Oo == oooO0o.f8217OooO0Oo && Arrays.equals(this.f8219OooO0o0, oooO0o.f8219OooO0o0) && this.f8218OooO0o == oooO0o.f8218OooO0o;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f8219OooO0o0) + (this.f8217OooO0Oo * 31)) * 31) + this.f8218OooO0o;
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f8215OooO0oO, this.f8217OooO0Oo);
            bundle.putIntArray(f8216OooO0oo, this.f8219OooO0o0);
            bundle.putInt(f8214OooO, this.f8218OooO0o);
            return bundle;
        }
    }

    public static final class OooOO0 extends OooOO0O<OooOO0> implements Comparable<OooOO0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f8220OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f8221OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f8222OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f8223OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f8224OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f8225OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f8226OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f8227OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f8228OooOOOo;

        public OooOO0(int i, o000oOoO o000oooo2, int i2, OooO0OO oooO0OO, int i3, @Nullable String str) {
            int iOooOO0O;
            super(i, i2, o000oooo2);
            int i4 = 0;
            this.f8220OooO = OooO0O0.OooOO0o(i3, false);
            int i5 = this.f8232OooO0oO.f6405OooO0oO & (~oooO0OO.f6813OooOo);
            this.f8222OooOO0 = (i5 & 1) != 0;
            this.f8223OooOO0O = (i5 & 2) != 0;
            ImmutableList<String> immutableList = oooO0OO.f6816OooOo0O;
            ImmutableList<String> immutableListOooOOOo = immutableList.isEmpty() ? ImmutableList.OooOOOo("") : immutableList;
            int i6 = 0;
            while (true) {
                if (i6 >= immutableListOooOOOo.size()) {
                    i6 = Integer.MAX_VALUE;
                    iOooOO0O = 0;
                    break;
                } else {
                    iOooOO0O = OooO0O0.OooOO0O(this.f8232OooO0oO, immutableListOooOOOo.get(i6), oooO0OO.f6819OooOoO0);
                    if (iOooOO0O > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f8224OooOO0o = i6;
            this.f8226OooOOO0 = iOooOO0O;
            int iOooO0oo = OooO0O0.OooO0oo(this.f8232OooO0oO.f6406OooO0oo, oooO0OO.f6817OooOo0o);
            this.f8225OooOOO = iOooO0oo;
            this.f8228OooOOOo = (this.f8232OooO0oO.f6406OooO0oo & 1088) != 0;
            int iOooOO0O2 = OooO0O0.OooOO0O(this.f8232OooO0oO, str, OooO0O0.OooOOO(str) == null);
            this.f8227OooOOOO = iOooOO0O2;
            boolean z = iOooOO0O > 0 || (immutableList.isEmpty() && iOooO0oo > 0) || this.f8222OooOO0 || (this.f8223OooOO0O && iOooOO0O2 > 0);
            if (OooO0O0.OooOO0o(i3, oooO0OO.f8190o00Ooo) && z) {
                i4 = 1;
            }
            this.f8221OooO0oo = i4;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f8221OooO0oo;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final /* bridge */ /* synthetic */ boolean OooO0O0(OooOO0O oooOO0O) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooOO0 oooOO1) {
            o00000 o00000VarOooO0Oo = o00000.f18919OooO00o.OooO0Oo(this.f8220OooO, oooOO1.f8220OooO);
            Integer numValueOf = Integer.valueOf(this.f8224OooOO0o);
            Integer numValueOf2 = Integer.valueOf(oooOO1.f8224OooOO0o);
            Object obj = o0O0o.f19109OooO0Oo;
            obj.getClass();
            o0oO0Ooo o0oo0ooo2 = o0oO0Ooo.f19171OooO0Oo;
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oo0ooo2);
            int i = this.f8226OooOOO0;
            o00000 o00000VarOooO00o = o00000VarOooO0OO.OooO00o(i, oooOO1.f8226OooOOO0);
            int i2 = this.f8225OooOOO;
            o00000 o00000VarOooO0Oo2 = o00000VarOooO00o.OooO00o(i2, oooOO1.f8225OooOOO).OooO0Oo(this.f8222OooOO0, oooOO1.f8222OooOO0);
            Boolean boolValueOf = Boolean.valueOf(this.f8223OooOO0O);
            Boolean boolValueOf2 = Boolean.valueOf(oooOO1.f8223OooOO0O);
            if (i != 0) {
                obj = o0oo0ooo2;
            }
            o00000 o00000VarOooO00o2 = o00000VarOooO0Oo2.OooO0OO(boolValueOf, boolValueOf2, obj).OooO00o(this.f8227OooOOOO, oooOO1.f8227OooOOOO);
            if (i2 == 0) {
                o00000VarOooO00o2 = o00000VarOooO00o2.OooO0o0(this.f8228OooOOOo, oooOO1.f8228OooOOOo);
            }
            return o00000VarOooO00o2.OooO0o();
        }
    }

    public static abstract class OooOO0O<T extends OooOO0O<T>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8229OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8230OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000oOoO f8231OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final androidx.media3.common.OooOO0 f8232OooO0oO;

        public interface OooO00o<T extends OooOO0O<T>> {
            o0O00 OooO00o(int i, o000oOoO o000oooo2, int[] iArr);
        }

        public OooOO0O(int i, int i2, o000oOoO o000oooo2) {
            this.f8229OooO0Oo = i;
            this.f8231OooO0o0 = o000oooo2;
            this.f8230OooO0o = i2;
            this.f8232OooO0oO = o000oooo2.f6768OooO0oO[i2];
        }

        public abstract int OooO00o();

        public abstract boolean OooO0O0(T t);
    }

    public static final class OooOOO0 extends OooOO0O<OooOOO0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final OooO0OO f8233OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f8234OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f8235OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f8236OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f8237OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f8238OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f8239OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f8240OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f8241OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final int f8242OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f8243OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f8244OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final int f8245OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final boolean f8246OooOo00;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public OooOOO0(int i, o000oOoO o000oooo2, int i2, OooO0OO oooO0OO, int i3, int i4, boolean z) {
            boolean z2;
            boolean z3;
            boolean z4;
            androidx.media3.common.OooOO0 oooOO1;
            int i5;
            int i6;
            int i7;
            androidx.media3.common.OooOO0 oooOO2;
            int i8;
            int i9;
            int i10;
            super(i, i2, o000oooo2);
            this.f8233OooO = oooO0OO;
            int i11 = oooO0OO.f8185Oooooo0 ? 24 : 16;
            int i12 = 1;
            int i13 = 0;
            this.f8243OooOOo0 = oooO0OO.f8183OooooOo && (i4 & i11) != 0;
            if (!z || (((i8 = (oooOO2 = this.f8232OooO0oO).f6419OooOo00) != -1 && i8 > oooO0OO.f6798OooO0Oo) || ((i9 = oooOO2.f6418OooOo0) != -1 && i9 > oooO0OO.f6800OooO0o0))) {
                z2 = false;
            } else {
                float f = oooOO2.f6420OooOo0O;
                if ((f == -1.0f || f <= oooO0OO.f6799OooO0o) && ((i10 = oooOO2.f6408OooOO0O) == -1 || i10 <= oooO0OO.f6801OooO0oO)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f8234OooO0oo = z2;
            if (!z || (((i5 = (oooOO1 = this.f8232OooO0oO).f6419OooOo00) != -1 && i5 < oooO0OO.f6802OooO0oo) || ((i6 = oooOO1.f6418OooOo0) != -1 && i6 < oooO0OO.f6797OooO))) {
                z3 = false;
            } else {
                float f2 = oooOO1.f6420OooOo0O;
                if ((f2 == -1.0f || f2 >= oooO0OO.f6803OooOO0) && ((i7 = oooOO1.f6408OooOO0O) == -1 || i7 >= oooO0OO.f6804OooOO0O)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f8235OooOO0 = z3;
            this.f8236OooOO0O = OooO0O0.OooOO0o(i3, false);
            androidx.media3.common.OooOO0 oooOO3 = this.f8232OooO0oO;
            this.f8237OooOO0o = oooOO3.f6408OooOO0O;
            this.f8239OooOOO0 = oooOO3.OooO0Oo();
            this.f8240OooOOOO = OooO0O0.OooO0oo(this.f8232OooO0oO.f6406OooO0oo, oooO0OO.f6809OooOOOo);
            int i14 = this.f8232OooO0oO.f6406OooO0oo;
            this.f8241OooOOOo = i14 == 0 || (i14 & 1) != 0;
            int i15 = 0;
            while (true) {
                ImmutableList<String> immutableList = oooO0OO.f6808OooOOOO;
                if (i15 >= immutableList.size()) {
                    i15 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.f8232OooO0oO.f6412OooOOOO;
                if (str != null && str.equals(immutableList.get(i15))) {
                    break;
                } else {
                    i15++;
                }
            }
            this.f8238OooOOO = i15;
            this.f8244OooOOoo = o00O.OooO0O0(i3) == 128;
            this.f8246OooOo00 = o00O.OooO0OO(i3) == 64;
            this.f8245OooOo0 = OooO0O0.OooO(this.f8232OooO0oO.f6412OooOOOO);
            androidx.media3.common.OooOO0 oooOO4 = this.f8232OooO0oO;
            if ((oooOO4.f6406OooO0oo & 16384) == 0) {
                OooO0OO oooO0OO2 = this.f8233OooO;
                if (OooO0O0.OooOO0o(i3, oooO0OO2.f8190o00Ooo) && ((z4 = this.f8234OooO0oo) || oooO0OO2.f8182OooooOO)) {
                    if (OooO0O0.OooOO0o(i3, false) && this.f8235OooOO0 && z4 && oooOO4.f6408OooOO0O != -1 && !oooO0OO2.f6820OooOoOO && !oooO0OO2.f6818OooOoO && (i11 & i3) != 0) {
                        i12 = 2;
                    }
                    i13 = i12;
                }
            }
            this.f8242OooOOo = i13;
        }

        public static int OooO0OO(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            Object objOooO0O0 = (oooOOO0.f8234OooO0oo && oooOOO0.f8236OooOO0O) ? OooO0O0.f8131OooOO0 : OooO0O0.f8131OooOO0.OooO0O0();
            o00000.OooO00o oooO00o = o00000.f18919OooO00o;
            int i = oooOOO0.f8237OooOO0o;
            return oooO00o.OooO0OO(Integer.valueOf(i), Integer.valueOf(oooOOO1.f8237OooOO0o), oooOOO0.f8233OooO.f6818OooOoO ? OooO0O0.f8131OooOO0.OooO0O0() : OooO0O0.f8132OooOO0O).OooO0OO(Integer.valueOf(oooOOO0.f8239OooOOO0), Integer.valueOf(oooOOO1.f8239OooOOO0), objOooO0O0).OooO0OO(Integer.valueOf(i), Integer.valueOf(oooOOO1.f8237OooOO0o), objOooO0O0).OooO0o();
        }

        public static int OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            o00000 o00000VarOooO0Oo = o00000.f18919OooO00o.OooO0Oo(oooOOO0.f8236OooOO0O, oooOOO1.f8236OooOO0O).OooO00o(oooOOO0.f8240OooOOOO, oooOOO1.f8240OooOOOO).OooO0Oo(oooOOO0.f8241OooOOOo, oooOOO1.f8241OooOOOo).OooO0Oo(oooOOO0.f8234OooO0oo, oooOOO1.f8234OooO0oo).OooO0Oo(oooOOO0.f8235OooOO0, oooOOO1.f8235OooOO0);
            Integer numValueOf = Integer.valueOf(oooOOO0.f8238OooOOO);
            Integer numValueOf2 = Integer.valueOf(oooOOO1.f8238OooOOO);
            o0O0o.f19109OooO0Oo.getClass();
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oO0Ooo.f19171OooO0Oo);
            boolean z = oooOOO1.f8244OooOOoo;
            boolean z2 = oooOOO0.f8244OooOOoo;
            o00000 o00000VarOooO0Oo2 = o00000VarOooO0OO.OooO0Oo(z2, z);
            boolean z3 = oooOOO1.f8246OooOo00;
            boolean z4 = oooOOO0.f8246OooOo00;
            o00000 o00000VarOooO0Oo3 = o00000VarOooO0Oo2.OooO0Oo(z4, z3);
            if (z2 && z4) {
                o00000VarOooO0Oo3 = o00000VarOooO0Oo3.OooO00o(oooOOO0.f8245OooOo0, oooOOO1.f8245OooOo0);
            }
            return o00000VarOooO0Oo3.OooO0o();
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f8242OooOOo;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final boolean OooO0O0(OooOO0O oooOO0O) {
            OooOOO0 oooOOO0 = (OooOOO0) oooOO0O;
            if (this.f8243OooOOo0 || o00.OooO00o(this.f8232OooO0oO.f6412OooOOOO, oooOOO0.f8232OooO0oO.f6412OooOOOO)) {
                if (!this.f8233OooO.f8184Oooooo) {
                    if (this.f8244OooOOoo != oooOOO0.f8244OooOOoo || this.f8246OooOo00 != oooOOO0.f8246OooOo00) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    public OooO0O0(Context context) {
        androidx.media3.exoplayer.trackselection.OooO00o.OooO0O0 oooO0O0 = new androidx.media3.exoplayer.trackselection.OooO00o.OooO0O0();
        String str = OooO0OO.f8178o0ooOO0;
        OooO0OO oooO0OO = new OooO0OO(new OooO0OO.OooO00o(context));
        this.f8134OooO0OO = new Object();
        this.f8135OooO0Oo = context != null ? context.getApplicationContext() : null;
        this.f8137OooO0o0 = oooO0O0;
        this.f8138OooO0oO = oooO0OO;
        this.f8133OooO = androidx.media3.common.OooO00o.f6341OooOO0;
        boolean z = context != null && o00.Oooo0O0(context);
        this.f8136OooO0o = z;
        if (!z && context != null && o00.f34910OooO00o >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f8139OooO0oo = audioManager != null ? new OooO(audioManager.getSpatializer()) : null;
        }
        if (this.f8138OooO0oO.f8189o00Oo0 && context == null) {
            Log.OooO0o("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int OooO(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    public static int OooO0oo(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static void OooOO0(oo0o0Oo oo0o0oo, OooO0OO oooO0OO, HashMap map) {
        for (int i = 0; i < oo0o0oo.f33893OooO0Oo; i++) {
            o0OoOo0 o0oooo1 = oooO0OO.f6822OooOoo0.get(oo0o0oo.OooO0OO(i));
            if (o0oooo1 != null) {
                o000oOoO o000oooo2 = o0oooo1.f6876OooO0Oo;
                o0OoOo0 o0oooo2 = (o0OoOo0) map.get(Integer.valueOf(o000oooo2.f6766OooO0o));
                if (o0oooo2 == null || (o0oooo2.f6877OooO0o0.isEmpty() && !o0oooo1.f6877OooO0o0.isEmpty())) {
                    map.put(Integer.valueOf(o000oooo2.f6766OooO0o), o0oooo1);
                }
            }
        }
    }

    public static int OooOO0O(androidx.media3.common.OooOO0 oooOO1, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(oooOO1.f6403OooO0o)) {
            return 4;
        }
        String strOooOOO = OooOOO(str);
        String strOooOOO2 = OooOOO(oooOO1.f6403OooO0o);
        if (strOooOOO2 == null || strOooOOO == null) {
            return (z && strOooOOO2 == null) ? 1 : 0;
        }
        if (strOooOOO2.startsWith(strOooOOO) || strOooOOO.startsWith(strOooOOO2)) {
            return 3;
        }
        int i = o00.f34910OooO00o;
        return strOooOOO2.split("-", 2)[0].equals(strOooOOO.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean OooOO0o(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    @Nullable
    public static String OooOOO(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    @Nullable
    public static Pair OooOOOo(int i, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, OooOO0O.OooO00o oooO00o, Comparator comparator) {
        RandomAccess randomAccessOooOOOo;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < mappedTrackInfo.f8121OooO00o; i2++) {
            if (i == mappedTrackInfo.f8122OooO0O0[i2]) {
                oo0o0Oo oo0o0oo = mappedTrackInfo.f8123OooO0OO[i2];
                for (int i3 = 0; i3 < oo0o0oo.f33893OooO0Oo; i3++) {
                    o000oOoO o000ooooOooO0OO = oo0o0oo.OooO0OO(i3);
                    o0O00 o0o00OooO00o = oooO00o.OooO00o(i2, o000ooooOooO0OO, iArr[i2][i3]);
                    int i4 = o000ooooOooO0OO.f6765OooO0Oo;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        OooOO0O oooOO0O = (OooOO0O) o0o00OooO00o.get(i5);
                        int iOooO00o = oooOO0O.OooO00o();
                        if (!zArr[i5] && iOooO00o != 0) {
                            if (iOooO00o == 1) {
                                randomAccessOooOOOo = ImmutableList.OooOOOo(oooOO0O);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oooOO0O);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    OooOO0O oooOO0O2 = (OooOO0O) o0o00OooO00o.get(i6);
                                    if (oooOO0O2.OooO00o() == 2 && oooOO0O.OooO0O0(oooOO0O2)) {
                                        arrayList2.add(oooOO0O2);
                                        z = true;
                                        zArr[i6] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccessOooOOOo = arrayList2;
                            }
                            arrayList.add(randomAccessOooOOOo);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((OooOO0O) list.get(i7)).f8230OooO0o;
        }
        OooOO0O oooOO0O3 = (OooOO0O) list.get(0);
        return Pair.create(new androidx.media3.exoplayer.trackselection.OooO0o.OooO00o(0, oooOO0O3.f8231OooO0o0, iArr2), Integer.valueOf(oooOO0O3.f8229OooO0Oo));
    }

    @Override // p425o0OoO0o.o00000
    public final androidx.media3.common.o00O0O OooO00o() {
        OooO0OO oooO0OO;
        synchronized (this.f8134OooO0OO) {
            oooO0OO = this.f8138OooO0oO;
        }
        return oooO0OO;
    }

    @Override // p425o0OoO0o.o00000
    @Nullable
    public final RendererCapabilities.OooO00o OooO0O0() {
        return this;
    }

    @Override // p425o0OoO0o.o00000
    public final void OooO0Oo() {
        OooO oooO;
        androidx.media3.exoplayer.trackselection.OooO0OO oooO0OO;
        synchronized (this.f8134OooO0OO) {
            try {
                if (o00.f34910OooO00o >= 32 && (oooO = this.f8139OooO0oo) != null && (oooO0OO = oooO.f8143OooO0Oo) != null && oooO.f8142OooO0OO != null) {
                    oooO.f8140OooO00o.removeOnSpatializerStateChangedListener(oooO0OO);
                    oooO.f8142OooO0OO.removeCallbacksAndMessages(null);
                    oooO.f8142OooO0OO = null;
                    oooO.f8143OooO0Oo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.OooO0Oo();
    }

    @Override // p425o0OoO0o.o00000
    public final void OooO0o(androidx.media3.common.OooO00o oooO00o) {
        boolean z;
        synchronized (this.f8134OooO0OO) {
            z = !this.f8133OooO.equals(oooO00o);
            this.f8133OooO = oooO00o;
        }
        if (z) {
            OooOOO0();
        }
    }

    @Override // p425o0OoO0o.o00000
    public final void OooO0oO(androidx.media3.common.o00O0O o00o0o2) {
        OooO0OO oooO0OO;
        if (o00o0o2 instanceof OooO0OO) {
            OooOOo0((OooO0OO) o00o0o2);
        }
        synchronized (this.f8134OooO0OO) {
            oooO0OO = this.f8138OooO0oO;
        }
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o(oooO0OO);
        oooO00o.OooO0OO(o00o0o2);
        OooOOo0(new OooO0OO(oooO00o));
    }

    public final void OooOOO0() {
        boolean z;
        o0OoO0o.o00000.OooO00o oooO00o;
        OooO oooO;
        synchronized (this.f8134OooO0OO) {
            z = this.f8138OooO0oO.f8189o00Oo0 && !this.f8136OooO0o && o00.f34910OooO00o >= 32 && (oooO = this.f8139OooO0oo) != null && oooO.f8141OooO0O0;
        }
        if (!z || (oooO00o = this.f46752OooO00o) == null) {
            return;
        }
        ((androidx.media3.exoplayer.OooOO0O) oooO00o).f7243OooOO0O.OooOO0O(10);
    }

    public final void OooOOOO() {
        boolean z;
        o0OoO0o.o00000.OooO00o oooO00o;
        synchronized (this.f8134OooO0OO) {
            z = this.f8138OooO0oO.f8196oo000o;
        }
        if (!z || (oooO00o = this.f46752OooO00o) == null) {
            return;
        }
        ((androidx.media3.exoplayer.OooOO0O) oooO00o).f7243OooOO0O.OooOO0O(26);
    }

    public final void OooOOo0(OooO0OO oooO0OO) {
        boolean z;
        oooO0OO.getClass();
        synchronized (this.f8134OooO0OO) {
            z = !this.f8138OooO0oO.equals(oooO0OO);
            this.f8138OooO0oO = oooO0OO;
        }
        if (z) {
            if (oooO0OO.f8189o00Oo0 && this.f8135OooO0Oo == null) {
                Log.OooO0o("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            o0OoO0o.o00000.OooO00o oooO00o = this.f46752OooO00o;
            if (oooO00o != null) {
                ((androidx.media3.exoplayer.OooOO0O) oooO00o).f7243OooOO0O.OooOO0O(10);
            }
        }
    }

    public static final class OooO0OO extends androidx.media3.common.o00O0O {

        /* JADX INFO: renamed from: o00000, reason: collision with root package name */
        public static final String f8164o00000;

        /* JADX INFO: renamed from: o000000, reason: collision with root package name */
        public static final String f8165o000000;

        /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
        public static final String f8166o000000O;

        /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
        public static final String f8167o000000o;

        /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
        public static final String f8168o00000O;

        /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
        public static final String f8169o00000O0;

        /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
        public static final String f8170o00000OO;

        /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
        public static final String f8171o00000Oo;

        /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
        public static final String f8172o00000o0;

        /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
        public static final String f8173o000OOo;

        /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
        public static final String f8174o0O0O00;

        /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
        public static final String f8175o0OO00O;

        /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
        public static final String f8176o0OOO0o;

        /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
        public static final String f8177o0Oo0oo;

        /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
        public static final String f8178o0ooOO0;

        /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
        public static final String f8179o0ooOOo;

        /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
        public static final String f8180o0ooOoO;

        /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
        public static final String f8181oo0o0Oo;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public final boolean f8182OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public final boolean f8183OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public final boolean f8184Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public final boolean f8185Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public final boolean f8186OoooooO;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public final boolean f8187Ooooooo;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public final boolean f8188o00O0O;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public final boolean f8189o00Oo0;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public final boolean f8190o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public final boolean f8191o00o0O;

        /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
        public final SparseBooleanArray f8192o00oO0O;

        /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
        public final SparseArray<Map<oo0o0Oo, OooO0o>> f8193o00oO0o;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public final boolean f8194o00ooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public final boolean f8195o0OoOo0;

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public final boolean f8196oo000o;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public final boolean f8197ooOO;

        static {
            new OooO0OO(new OooO00o());
            f8178o0ooOO0 = o00.Oooo00o(1000);
            f8179o0ooOOo = o00.Oooo00o(1001);
            f8180o0ooOoO = o00.Oooo00o(1002);
            f8176o0OOO0o = o00.Oooo00o(1003);
            f8177o0Oo0oo = o00.Oooo00o(1004);
            f8175o0OO00O = o00.Oooo00o(1005);
            f8181oo0o0Oo = o00.Oooo00o(1006);
            f8174o0O0O00 = o00.Oooo00o(1007);
            f8173o000OOo = o00.Oooo00o(1008);
            f8165o000000 = o00.Oooo00o(1009);
            f8166o000000O = o00.Oooo00o(1010);
            f8167o000000o = o00.Oooo00o(1011);
            f8164o00000 = o00.Oooo00o(1012);
            f8169o00000O0 = o00.Oooo00o(1013);
            f8168o00000O = o00.Oooo00o(1014);
            f8170o00000OO = o00.Oooo00o(1015);
            f8171o00000Oo = o00.Oooo00o(1016);
            f8172o00000o0 = o00.Oooo00o(1017);
        }

        public OooO0OO(OooO00o oooO00o) {
            super(oooO00o);
            this.f8182OooooOO = oooO00o.f8198OooOoOO;
            this.f8183OooooOo = oooO00o.f8200OooOoo0;
            this.f8185Oooooo0 = oooO00o.f8199OooOoo;
            this.f8184Oooooo = oooO00o.f8201OooOooO;
            this.f8186OoooooO = oooO00o.f8202OooOooo;
            this.f8187Ooooooo = oooO00o.f8205Oooo000;
            this.f8195o0OoOo0 = oooO00o.f8206Oooo00O;
            this.f8197ooOO = oooO00o.f8207Oooo00o;
            this.f8188o00O0O = oooO00o.f8204Oooo0;
            this.f8189o00Oo0 = oooO00o.f8208Oooo0O0;
            this.f8190o00Ooo = oooO00o.f8209Oooo0OO;
            this.f8191o00o0O = oooO00o.f8211Oooo0o0;
            this.f8194o00ooo = oooO00o.f8210Oooo0o;
            this.f8196oo000o = oooO00o.f8212Oooo0oO;
            this.f8193o00oO0o = oooO00o.f8213Oooo0oo;
            this.f8192o00oO0O = oooO00o.f8203Oooo;
        }

        @Override // androidx.media3.common.o00O0O
        public final androidx.media3.common.o00O0O.OooO00o OooO0OO() {
            return new OooO00o(this);
        }

        @Override // androidx.media3.common.o00O0O
        public final boolean equals(@Nullable Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0OO.class != obj.getClass()) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (super.equals(oooO0OO) && this.f8182OooooOO == oooO0OO.f8182OooooOO && this.f8183OooooOo == oooO0OO.f8183OooooOo && this.f8185Oooooo0 == oooO0OO.f8185Oooooo0 && this.f8184Oooooo == oooO0OO.f8184Oooooo && this.f8186OoooooO == oooO0OO.f8186OoooooO && this.f8187Ooooooo == oooO0OO.f8187Ooooooo && this.f8195o0OoOo0 == oooO0OO.f8195o0OoOo0 && this.f8197ooOO == oooO0OO.f8197ooOO && this.f8188o00O0O == oooO0OO.f8188o00O0O && this.f8189o00Oo0 == oooO0OO.f8189o00Oo0 && this.f8190o00Ooo == oooO0OO.f8190o00Ooo && this.f8191o00o0O == oooO0OO.f8191o00o0O && this.f8194o00ooo == oooO0OO.f8194o00ooo && this.f8196oo000o == oooO0OO.f8196oo000o) {
                SparseBooleanArray sparseBooleanArray = this.f8192o00oO0O;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = oooO0OO.f8192o00oO0O;
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray = this.f8193o00oO0o;
                    int size2 = sparseArray.size();
                    SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray2 = oooO0OO.f8193o00oO0o;
                    if (sparseArray2.size() == size2) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map<oo0o0Oo, OooO0o> mapValueAt = sparseArray.valueAt(i2);
                                    Map<oo0o0Oo, OooO0o> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() == mapValueAt.size()) {
                                        Iterator<Map.Entry<oo0o0Oo, OooO0o>> it = mapValueAt.entrySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z3 = true;
                                                break;
                                            }
                                            Map.Entry<oo0o0Oo, OooO0o> next = it.next();
                                            oo0o0Oo key = next.getKey();
                                            if (!mapValueAt2.containsKey(key) || !o00.OooO00o(next.getValue(), mapValueAt2.get(key))) {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                    } else {
                                        z3 = false;
                                        break;
                                    }
                                    if (z3) {
                                        i2++;
                                    }
                                }
                                z2 = false;
                                break;
                            }
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    break;
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.common.o00O0O
        public final int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f8182OooooOO ? 1 : 0)) * 31) + (this.f8183OooooOo ? 1 : 0)) * 31) + (this.f8185Oooooo0 ? 1 : 0)) * 31) + (this.f8184Oooooo ? 1 : 0)) * 31) + (this.f8186OoooooO ? 1 : 0)) * 31) + (this.f8187Ooooooo ? 1 : 0)) * 31) + (this.f8195o0OoOo0 ? 1 : 0)) * 31) + (this.f8197ooOO ? 1 : 0)) * 31) + (this.f8188o00O0O ? 1 : 0)) * 31) + (this.f8189o00Oo0 ? 1 : 0)) * 31) + (this.f8190o00Ooo ? 1 : 0)) * 31) + (this.f8191o00o0O ? 1 : 0)) * 31) + (this.f8194o00ooo ? 1 : 0)) * 31) + (this.f8196oo000o ? 1 : 0);
        }

        @Override // androidx.media3.common.o00O0O, androidx.media3.common.OooO0OO
        public final Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f8178o0ooOO0, this.f8182OooooOO);
            bundle.putBoolean(f8179o0ooOOo, this.f8183OooooOo);
            bundle.putBoolean(f8180o0ooOoO, this.f8185Oooooo0);
            bundle.putBoolean(f8168o00000O, this.f8184Oooooo);
            bundle.putBoolean(f8176o0OOO0o, this.f8186OoooooO);
            bundle.putBoolean(f8177o0Oo0oo, this.f8187Ooooooo);
            bundle.putBoolean(f8175o0OO00O, this.f8195o0OoOo0);
            bundle.putBoolean(f8181oo0o0Oo, this.f8197ooOO);
            bundle.putBoolean(f8170o00000OO, this.f8188o00O0O);
            bundle.putBoolean(f8171o00000Oo, this.f8189o00Oo0);
            bundle.putBoolean(f8174o0O0O00, this.f8190o00Ooo);
            bundle.putBoolean(f8173o000OOo, this.f8191o00o0O);
            bundle.putBoolean(f8165o000000, this.f8194o00ooo);
            bundle.putBoolean(f8172o00000o0, this.f8196oo000o);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            int i = 0;
            while (true) {
                SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray2 = this.f8193o00oO0o;
                if (i >= sparseArray2.size()) {
                    break;
                }
                int iKeyAt = sparseArray2.keyAt(i);
                for (Map.Entry<oo0o0Oo, OooO0o> entry : sparseArray2.valueAt(i).entrySet()) {
                    OooO0o value = entry.getValue();
                    if (value != null) {
                        sparseArray.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f8166o000000O, com.google.common.primitives.OooO0OO.OooO0Oo(arrayList));
                bundle.putParcelableArrayList(f8167o000000o, o00oO0o.OooO0O0(arrayList2));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    sparseArray3.put(sparseArray.keyAt(i2), ((androidx.media3.common.OooO0OO) sparseArray.valueAt(i2)).toBundle());
                }
                bundle.putSparseParcelableArray(f8164o00000, sparseArray3);
                i++;
            }
            SparseBooleanArray sparseBooleanArray = this.f8192o00oO0O;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
                iArr[i3] = sparseBooleanArray.keyAt(i3);
            }
            bundle.putIntArray(f8169o00000O0, iArr);
            return bundle;
        }

        public static final class OooO00o extends androidx.media3.common.o00O0O.OooO00o {

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public boolean f8198OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public boolean f8199OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public boolean f8200OooOoo0;

            /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
            public boolean f8201OooOooO;

            /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
            public boolean f8202OooOooo;

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final SparseBooleanArray f8203Oooo;

            /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
            public boolean f8204Oooo0;

            /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
            public boolean f8205Oooo000;

            /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
            public boolean f8206Oooo00O;

            /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
            public boolean f8207Oooo00o;

            /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
            public boolean f8208Oooo0O0;

            /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
            public boolean f8209Oooo0OO;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public boolean f8210Oooo0o;

            /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
            public boolean f8211Oooo0o0;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public boolean f8212Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final SparseArray<Map<oo0o0Oo, OooO0o>> f8213Oooo0oo;

            public OooO00o(Context context) {
                OooOO0(context);
                OooOO0O(context);
                this.f8213Oooo0oo = new SparseArray<>();
                this.f8203Oooo = new SparseBooleanArray();
                OooO();
            }

            public final void OooO() {
                this.f8198OooOoOO = true;
                this.f8200OooOoo0 = false;
                this.f8199OooOoo = true;
                this.f8201OooOooO = false;
                this.f8202OooOooo = true;
                this.f8205Oooo000 = false;
                this.f8206Oooo00O = false;
                this.f8207Oooo00o = false;
                this.f8204Oooo0 = false;
                this.f8208Oooo0O0 = true;
                this.f8209Oooo0OO = true;
                this.f8211Oooo0o0 = false;
                this.f8210Oooo0o = true;
                this.f8212Oooo0oO = false;
            }

            @Override // androidx.media3.common.o00O0O.OooO00o
            public final androidx.media3.common.o00O0O OooO00o() {
                return new OooO0OO(this);
            }

            @Override // androidx.media3.common.o00O0O.OooO00o
            @CanIgnoreReturnValue
            public final androidx.media3.common.o00O0O.OooO00o OooO0O0(int i) {
                super.OooO0O0(i);
                return this;
            }

            @Override // androidx.media3.common.o00O0O.OooO00o
            @CanIgnoreReturnValue
            public final androidx.media3.common.o00O0O.OooO00o OooO0o(o0OoOo0 o0oooo1) {
                super.OooO0o(o0oooo1);
                return this;
            }

            @Override // androidx.media3.common.o00O0O.OooO00o
            @CanIgnoreReturnValue
            public final androidx.media3.common.o00O0O.OooO00o OooO0o0() {
                this.f6843OooOo0 = -3;
                return this;
            }

            @Override // androidx.media3.common.o00O0O.OooO00o
            @CanIgnoreReturnValue
            public final androidx.media3.common.o00O0O.OooO00o OooO0oO(int i) {
                super.OooO0oO(i);
                return this;
            }

            @Override // androidx.media3.common.o00O0O.OooO00o
            @CanIgnoreReturnValue
            public final androidx.media3.common.o00O0O.OooO00o OooO0oo(int i, int i2) {
                super.OooO0oo(i, i2);
                return this;
            }

            @CanIgnoreReturnValue
            public final void OooOO0(Context context) {
                CaptioningManager captioningManager;
                int i = o00.f34910OooO00o;
                if (i >= 19) {
                    if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                        this.f6844OooOo00 = 1088;
                        Locale locale = captioningManager.getLocale();
                        if (locale != null) {
                            this.f6841OooOOoo = ImmutableList.OooOOOo(i >= 21 ? locale.toLanguageTag() : locale.toString());
                        }
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
            /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
            @CanIgnoreReturnValue
            public final void OooOO0O(Context context) {
                Point point;
                DisplayManager displayManager;
                int i = o00.f34910OooO00o;
                Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && o00.Oooo0O0(context)) {
                    String strOooOoOO = i < 28 ? o00.OooOoOO("sys.display-size") : o00.OooOoOO("vendor.display-size");
                    if (!TextUtils.isEmpty(strOooOoOO)) {
                        try {
                            String[] strArrSplit = strOooOoOO.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i2 = Integer.parseInt(strArrSplit[0]);
                                int i3 = Integer.parseInt(strArrSplit[1]);
                                if (i2 > 0 && i3 > 0) {
                                    point = new Point(i2, i3);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        Log.OooO0OO("Util", "Invalid display size: " + strOooOoOO);
                        if (!"Sony".equals(o00.f34912OooO0OO) && o00.f34913OooO0Oo.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            point = new Point(3840, 2160);
                        } else {
                            point = new Point();
                            if (i >= 23) {
                                Display.Mode mode = display.getMode();
                                point.x = mode.getPhysicalWidth();
                                point.y = mode.getPhysicalHeight();
                            } else if (i >= 17) {
                                display.getRealSize(point);
                            } else {
                                display.getSize(point);
                            }
                        }
                    } else if (!"Sony".equals(o00.f34912OooO0OO)) {
                        point = new Point();
                        if (i >= 23) {
                            Display.Mode mode2 = display.getMode();
                            point.x = mode2.getPhysicalWidth();
                            point.y = mode2.getPhysicalHeight();
                        } else if (i >= 17) {
                            display.getRealSize(point);
                        } else {
                            display.getSize(point);
                        }
                    } else {
                        point = new Point();
                        if (i >= 23) {
                            Display.Mode mode3 = display.getMode();
                            point.x = mode3.getPhysicalWidth();
                            point.y = mode3.getPhysicalHeight();
                        } else if (i >= 17) {
                            display.getRealSize(point);
                        } else {
                            display.getSize(point);
                        }
                    }
                } else {
                    point = new Point();
                    if (i >= 23) {
                        Display.Mode mode4 = display.getMode();
                        point.x = mode4.getPhysicalWidth();
                        point.y = mode4.getPhysicalHeight();
                    } else if (i >= 17) {
                        display.getRealSize(point);
                    } else {
                        display.getSize(point);
                    }
                }
                OooO0oo(point.x, point.y);
            }

            @Deprecated
            public OooO00o() {
                this.f8213Oooo0oo = new SparseArray<>();
                this.f8203Oooo = new SparseBooleanArray();
                OooO();
            }

            public OooO00o(OooO0OO oooO0OO) {
                super(oooO0OO);
                this.f8198OooOoOO = oooO0OO.f8182OooooOO;
                this.f8200OooOoo0 = oooO0OO.f8183OooooOo;
                this.f8199OooOoo = oooO0OO.f8185Oooooo0;
                this.f8201OooOooO = oooO0OO.f8184Oooooo;
                this.f8202OooOooo = oooO0OO.f8186OoooooO;
                this.f8205Oooo000 = oooO0OO.f8187Ooooooo;
                this.f8206Oooo00O = oooO0OO.f8195o0OoOo0;
                this.f8207Oooo00o = oooO0OO.f8197ooOO;
                this.f8204Oooo0 = oooO0OO.f8188o00O0O;
                this.f8208Oooo0O0 = oooO0OO.f8189o00Oo0;
                this.f8209Oooo0OO = oooO0OO.f8190o00Ooo;
                this.f8211Oooo0o0 = oooO0OO.f8191o00o0O;
                this.f8210Oooo0o = oooO0OO.f8194o00ooo;
                this.f8212Oooo0oO = oooO0OO.f8196oo000o;
                SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray = new SparseArray<>();
                int i = 0;
                while (true) {
                    SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray2 = oooO0OO.f8193o00oO0o;
                    if (i < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i), new HashMap(sparseArray2.valueAt(i)));
                        i++;
                    } else {
                        this.f8213Oooo0oo = sparseArray;
                        this.f8203Oooo = oooO0OO.f8192o00oO0O.clone();
                        return;
                    }
                }
            }
        }
    }
}
