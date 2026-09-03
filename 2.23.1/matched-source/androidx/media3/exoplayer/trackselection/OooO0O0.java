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
import o000O00O.o00OO000;
import p080o000OoO.o000OO00;
import p427o0OoO0o.o00O0O;
import p427o0OoO0o.o00Oo0;
import p427o0OoO0o.o00Ooo;
import p427o0OoO0o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 extends MappingTrackSelector implements RendererCapabilities.OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0O000<Integer> f8136OooOO0 = o0O000.OooO00o(new o00O0O());

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o0O000<Integer> f8137OooOO0O = o0O000.OooO00o(new o00Oo0());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("lock")
    public androidx.media3.common.OooO00o f8138OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f8139OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Context f8140OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f8141OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.OooO0o.OooO0O0 f8142OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("lock")
    public OooO0OO f8143OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public final OooO f8144OooO0oo;

    @RequiresApi(32)
    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Spatializer f8145OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f8146OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Handler f8147OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public androidx.media3.exoplayer.trackselection.OooO0OO f8148OooO0Oo;

        public OooO(Spatializer spatializer) {
            this.f8145OooO00o = spatializer;
            this.f8146OooO0O0 = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean OooO00o(androidx.media3.common.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1) {
            boolean zEquals = "audio/eac3-joc".equals(oooOO1.f6417OooOOOO);
            int i = oooOO1.f6431OooOoo0;
            if (zEquals && i == 16) {
                i = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(o000OO00.OooOOOo(i));
            int i2 = oooOO1.f6430OooOoo;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return this.f8145OooO00o.canBeSpatialized(oooO00o.OooO0OO().f6359OooO00o, channelMask.build());
        }
    }

    public static final class OooO00o extends OooOO0O<OooO00o> implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f8149OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f8150OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final String f8151OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final OooO0OO f8152OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f8153OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f8154OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f8155OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f8156OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f8157OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final int f8158OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final int f8159OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f8160OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final boolean f8161OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final int f8162OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final int f8163OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final int f8164OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f8165OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final boolean f8166OooOoO0;

        public OooO00o(int i, o000oOoO o000oooo2, int i2, OooO0OO oooO0OO, int i3, boolean z, o00Ooo o00ooo2) {
            int i4;
            int iOooOO0O;
            int iOooOO0O2;
            boolean z2;
            super(i, i2, o000oooo2);
            this.f8152OooOO0O = oooO0OO;
            this.f8151OooOO0 = OooO0O0.OooOOO(this.f8237OooO0oO.f6408OooO0o);
            int i5 = 0;
            this.f8153OooOO0o = OooO0O0.OooOO0o(i3, false);
            int i6 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i6 >= oooO0OO.f6816OooOOo0.size()) {
                    iOooOO0O = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOooOO0O = OooO0O0.OooOO0O(this.f8237OooO0oO, oooO0OO.f6816OooOOo0.get(i6), false);
                    if (iOooOO0O > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f8154OooOOO = i6;
            this.f8155OooOOO0 = iOooOO0O;
            this.f8156OooOOOO = OooO0O0.OooO0oo(this.f8237OooO0oO.f6411OooO0oo, oooO0OO.f6815OooOOo);
            androidx.media3.common.OooOO0 oooOO1 = this.f8237OooO0oO;
            int i7 = oooOO1.f6411OooO0oo;
            this.f8157OooOOOo = i7 == 0 || (i7 & 1) != 0;
            this.f8160OooOOoo = (oooOO1.f6410OooO0oO & 1) != 0;
            int i8 = oooOO1.f6431OooOoo0;
            this.f8163OooOo00 = i8;
            this.f8162OooOo0 = oooOO1.f6430OooOoo;
            int i9 = oooOO1.f6413OooOO0O;
            this.f8164OooOo0O = i9;
            this.f8149OooO = (i9 == -1 || i9 <= oooO0OO.f6820OooOo00) && (i8 == -1 || i8 <= oooO0OO.f6817OooOOoo) && o00ooo2.apply(oooOO1);
            String[] strArrOooOoO = o000OO00.OooOoO();
            int i10 = 0;
            while (true) {
                if (i10 >= strArrOooOoO.length) {
                    iOooOO0O2 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOooOO0O2 = OooO0O0.OooOO0O(this.f8237OooO0oO, strArrOooOoO[i10], false);
                    if (iOooOO0O2 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f8159OooOOo0 = i10;
            this.f8158OooOOo = iOooOO0O2;
            int i11 = 0;
            while (true) {
                ImmutableList<String> immutableList = oooO0OO.f6819OooOo0;
                if (i11 < immutableList.size()) {
                    String str = this.f8237OooO0oO.f6417OooOOOO;
                    if (str != null && str.equals(immutableList.get(i11))) {
                        i4 = i11;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            this.f8165OooOo0o = i4;
            this.f8161OooOo = o00OO000.OooO0O0(i3) == 128;
            this.f8166OooOoO0 = o00OO000.OooO0OO(i3) == 64;
            OooO0OO oooO0OO2 = this.f8152OooOO0O;
            if (OooO0O0.OooOO0o(i3, oooO0OO2.f8195o00Ooo) && ((z2 = this.f8149OooO) || oooO0OO2.f8191OoooooO)) {
                i5 = (!OooO0O0.OooOO0o(i3, false) || !z2 || this.f8237OooO0oO.f6413OooOO0O == -1 || oooO0OO2.f6825OooOoOO || oooO0OO2.f6823OooOoO || (!oooO0OO2.f8199o00ooo && z)) ? 1 : 2;
            }
            this.f8150OooO0oo = i5;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f8150OooO0oo;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final boolean OooO0O0(OooOO0O oooOO0O) {
            int i;
            String str;
            int i2;
            OooO00o oooO00o = (OooO00o) oooOO0O;
            OooO0OO oooO0OO = this.f8152OooOO0O;
            boolean z = oooO0OO.f8202ooOO;
            androidx.media3.common.OooOO0 oooOO1 = oooO00o.f8237OooO0oO;
            androidx.media3.common.OooOO0 oooOO2 = this.f8237OooO0oO;
            if ((z || ((i2 = oooOO2.f6431OooOoo0) != -1 && i2 == oooOO1.f6431OooOoo0)) && ((oooO0OO.f8192Ooooooo || ((str = oooOO2.f6417OooOOOO) != null && TextUtils.equals(str, oooOO1.f6417OooOOOO))) && (oooO0OO.f8200o0OoOo0 || ((i = oooOO2.f6430OooOoo) != -1 && i == oooOO1.f6430OooOoo)))) {
                if (!oooO0OO.f8193o00O0O) {
                    if (this.f8161OooOo != oooO00o.f8161OooOo || this.f8166OooOoO0 != oooO00o.f8166OooOoO0) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO00o oooO00o) {
            boolean z = this.f8153OooOO0o;
            boolean z2 = this.f8149OooO;
            Object objOooO0O0 = (z2 && z) ? OooO0O0.f8136OooOO0 : OooO0O0.f8136OooOO0.OooO0O0();
            o00000 o00000VarOooO0Oo = o00000.f18924OooO00o.OooO0Oo(z, oooO00o.f8153OooOO0o);
            Integer numValueOf = Integer.valueOf(this.f8154OooOOO);
            Integer numValueOf2 = Integer.valueOf(oooO00o.f8154OooOOO);
            o0O0o.f19114OooO0Oo.getClass();
            o0oO0Ooo o0oo0ooo2 = o0oO0Ooo.f19176OooO0Oo;
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oo0ooo2).OooO00o(this.f8155OooOOO0, oooO00o.f8155OooOOO0).OooO00o(this.f8156OooOOOO, oooO00o.f8156OooOOOO).OooO0Oo(this.f8160OooOOoo, oooO00o.f8160OooOOoo).OooO0Oo(this.f8157OooOOOo, oooO00o.f8157OooOOOo).OooO0OO(Integer.valueOf(this.f8159OooOOo0), Integer.valueOf(oooO00o.f8159OooOOo0), o0oo0ooo2).OooO00o(this.f8158OooOOo, oooO00o.f8158OooOOo).OooO0Oo(z2, oooO00o.f8149OooO).OooO0OO(Integer.valueOf(this.f8165OooOo0o), Integer.valueOf(oooO00o.f8165OooOo0o), o0oo0ooo2);
            int i = this.f8164OooOo0O;
            Integer numValueOf3 = Integer.valueOf(i);
            int i2 = oooO00o.f8164OooOo0O;
            o00000 o00000VarOooO0OO2 = o00000VarOooO0OO.OooO0OO(numValueOf3, Integer.valueOf(i2), this.f8152OooOO0O.f6823OooOoO ? OooO0O0.f8136OooOO0.OooO0O0() : OooO0O0.f8137OooOO0O).OooO0Oo(this.f8161OooOo, oooO00o.f8161OooOo).OooO0Oo(this.f8166OooOoO0, oooO00o.f8166OooOoO0).OooO0OO(Integer.valueOf(this.f8163OooOo00), Integer.valueOf(oooO00o.f8163OooOo00), objOooO0O0).OooO0OO(Integer.valueOf(this.f8162OooOo0), Integer.valueOf(oooO00o.f8162OooOo0), objOooO0O0);
            Integer numValueOf4 = Integer.valueOf(i);
            Integer numValueOf5 = Integer.valueOf(i2);
            if (!o000OO00.OooO00o(this.f8151OooOO0, oooO00o.f8151OooOO0)) {
                objOooO0O0 = OooO0O0.f8137OooOO0O;
            }
            return o00000VarOooO0OO2.OooO0OO(numValueOf4, numValueOf5, objOooO0O0).OooO0o();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.trackselection.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0153OooO0O0 implements Comparable<C0153OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f8167OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f8168OooO0o0;

        public C0153OooO0O0(androidx.media3.common.OooOO0 oooOO1, int i) {
            this.f8167OooO0Oo = (oooOO1.f6410OooO0oO & 1) != 0;
            this.f8168OooO0o0 = OooO0O0.OooOO0o(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0153OooO0O0 c0153OooO0O0) {
            C0153OooO0O0 c0153OooO0O1 = c0153OooO0O0;
            return o00000.f18924OooO00o.OooO0Oo(this.f8168OooO0o0, c0153OooO0O1.f8168OooO0o0).OooO0Oo(this.f8167OooO0Oo, c0153OooO0O1.f8167OooO0Oo).OooO0o();
        }
    }

    public static final class OooO0o implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8223OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f8224OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final String f8220OooO0oO = o000OO00.Oooo00o(0);

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final String f8221OooO0oo = o000OO00.Oooo00o(1);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f8219OooO = o000OO00.Oooo00o(2);

        static {
            new oo000o();
        }

        @UnstableApi
        public OooO0o(int i, int i2, int[] iArr) {
            this.f8222OooO0Oo = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8224OooO0o0 = iArrCopyOf;
            this.f8223OooO0o = i2;
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
            return this.f8222OooO0Oo == oooO0o.f8222OooO0Oo && Arrays.equals(this.f8224OooO0o0, oooO0o.f8224OooO0o0) && this.f8223OooO0o == oooO0o.f8223OooO0o;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f8224OooO0o0) + (this.f8222OooO0Oo * 31)) * 31) + this.f8223OooO0o;
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f8220OooO0oO, this.f8222OooO0Oo);
            bundle.putIntArray(f8221OooO0oo, this.f8224OooO0o0);
            bundle.putInt(f8219OooO, this.f8223OooO0o);
            return bundle;
        }
    }

    public static final class OooOO0 extends OooOO0O<OooOO0> implements Comparable<OooOO0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f8225OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f8226OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f8227OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f8228OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f8229OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f8230OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f8231OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f8232OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f8233OooOOOo;

        public OooOO0(int i, o000oOoO o000oooo2, int i2, OooO0OO oooO0OO, int i3, @Nullable String str) {
            int iOooOO0O;
            super(i, i2, o000oooo2);
            int i4 = 0;
            this.f8225OooO = OooO0O0.OooOO0o(i3, false);
            int i5 = this.f8237OooO0oO.f6410OooO0oO & (~oooO0OO.f6818OooOo);
            this.f8227OooOO0 = (i5 & 1) != 0;
            this.f8228OooOO0O = (i5 & 2) != 0;
            ImmutableList<String> immutableList = oooO0OO.f6821OooOo0O;
            ImmutableList<String> immutableListOooOOOo = immutableList.isEmpty() ? ImmutableList.OooOOOo("") : immutableList;
            int i6 = 0;
            while (true) {
                if (i6 >= immutableListOooOOOo.size()) {
                    i6 = Integer.MAX_VALUE;
                    iOooOO0O = 0;
                    break;
                } else {
                    iOooOO0O = OooO0O0.OooOO0O(this.f8237OooO0oO, immutableListOooOOOo.get(i6), oooO0OO.f6824OooOoO0);
                    if (iOooOO0O > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f8229OooOO0o = i6;
            this.f8231OooOOO0 = iOooOO0O;
            int iOooO0oo = OooO0O0.OooO0oo(this.f8237OooO0oO.f6411OooO0oo, oooO0OO.f6822OooOo0o);
            this.f8230OooOOO = iOooO0oo;
            this.f8233OooOOOo = (this.f8237OooO0oO.f6411OooO0oo & 1088) != 0;
            int iOooOO0O2 = OooO0O0.OooOO0O(this.f8237OooO0oO, str, OooO0O0.OooOOO(str) == null);
            this.f8232OooOOOO = iOooOO0O2;
            boolean z = iOooOO0O > 0 || (immutableList.isEmpty() && iOooO0oo > 0) || this.f8227OooOO0 || (this.f8228OooOO0O && iOooOO0O2 > 0);
            if (OooO0O0.OooOO0o(i3, oooO0OO.f8195o00Ooo) && z) {
                i4 = 1;
            }
            this.f8226OooO0oo = i4;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f8226OooO0oo;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final /* bridge */ /* synthetic */ boolean OooO0O0(OooOO0O oooOO0O) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooOO0 oooOO1) {
            o00000 o00000VarOooO0Oo = o00000.f18924OooO00o.OooO0Oo(this.f8225OooO, oooOO1.f8225OooO);
            Integer numValueOf = Integer.valueOf(this.f8229OooOO0o);
            Integer numValueOf2 = Integer.valueOf(oooOO1.f8229OooOO0o);
            Object obj = o0O0o.f19114OooO0Oo;
            obj.getClass();
            o0oO0Ooo o0oo0ooo2 = o0oO0Ooo.f19176OooO0Oo;
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oo0ooo2);
            int i = this.f8231OooOOO0;
            o00000 o00000VarOooO00o = o00000VarOooO0OO.OooO00o(i, oooOO1.f8231OooOOO0);
            int i2 = this.f8230OooOOO;
            o00000 o00000VarOooO0Oo2 = o00000VarOooO00o.OooO00o(i2, oooOO1.f8230OooOOO).OooO0Oo(this.f8227OooOO0, oooOO1.f8227OooOO0);
            Boolean boolValueOf = Boolean.valueOf(this.f8228OooOO0O);
            Boolean boolValueOf2 = Boolean.valueOf(oooOO1.f8228OooOO0O);
            if (i != 0) {
                obj = o0oo0ooo2;
            }
            o00000 o00000VarOooO00o2 = o00000VarOooO0Oo2.OooO0OO(boolValueOf, boolValueOf2, obj).OooO00o(this.f8232OooOOOO, oooOO1.f8232OooOOOO);
            if (i2 == 0) {
                o00000VarOooO00o2 = o00000VarOooO00o2.OooO0o0(this.f8233OooOOOo, oooOO1.f8233OooOOOo);
            }
            return o00000VarOooO00o2.OooO0o();
        }
    }

    public static abstract class OooOO0O<T extends OooOO0O<T>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8234OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000oOoO f8236OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final androidx.media3.common.OooOO0 f8237OooO0oO;

        public interface OooO00o<T extends OooOO0O<T>> {
            o0O00 OooO00o(int i, o000oOoO o000oooo2, int[] iArr);
        }

        public OooOO0O(int i, int i2, o000oOoO o000oooo2) {
            this.f8234OooO0Oo = i;
            this.f8236OooO0o0 = o000oooo2;
            this.f8235OooO0o = i2;
            this.f8237OooO0oO = o000oooo2.f6773OooO0oO[i2];
        }

        public abstract int OooO00o();

        public abstract boolean OooO0O0(T t);
    }

    public static final class OooOOO0 extends OooOO0O<OooOOO0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final OooO0OO f8238OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f8239OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f8240OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f8241OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f8242OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f8243OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f8244OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f8245OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f8246OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final int f8247OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f8248OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f8249OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final int f8250OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final boolean f8251OooOo00;

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
            this.f8238OooO = oooO0OO;
            int i11 = oooO0OO.f8190Oooooo0 ? 24 : 16;
            int i12 = 1;
            int i13 = 0;
            this.f8248OooOOo0 = oooO0OO.f8188OooooOo && (i4 & i11) != 0;
            if (!z || (((i8 = (oooOO2 = this.f8237OooO0oO).f6424OooOo00) != -1 && i8 > oooO0OO.f6803OooO0Oo) || ((i9 = oooOO2.f6423OooOo0) != -1 && i9 > oooO0OO.f6805OooO0o0))) {
                z2 = false;
            } else {
                float f = oooOO2.f6425OooOo0O;
                if ((f == -1.0f || f <= oooO0OO.f6804OooO0o) && ((i10 = oooOO2.f6413OooOO0O) == -1 || i10 <= oooO0OO.f6806OooO0oO)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f8239OooO0oo = z2;
            if (!z || (((i5 = (oooOO1 = this.f8237OooO0oO).f6424OooOo00) != -1 && i5 < oooO0OO.f6807OooO0oo) || ((i6 = oooOO1.f6423OooOo0) != -1 && i6 < oooO0OO.f6802OooO))) {
                z3 = false;
            } else {
                float f2 = oooOO1.f6425OooOo0O;
                if ((f2 == -1.0f || f2 >= oooO0OO.f6808OooOO0) && ((i7 = oooOO1.f6413OooOO0O) == -1 || i7 >= oooO0OO.f6809OooOO0O)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f8240OooOO0 = z3;
            this.f8241OooOO0O = OooO0O0.OooOO0o(i3, false);
            androidx.media3.common.OooOO0 oooOO3 = this.f8237OooO0oO;
            this.f8242OooOO0o = oooOO3.f6413OooOO0O;
            this.f8244OooOOO0 = oooOO3.OooO0Oo();
            this.f8245OooOOOO = OooO0O0.OooO0oo(this.f8237OooO0oO.f6411OooO0oo, oooO0OO.f6814OooOOOo);
            int i14 = this.f8237OooO0oO.f6411OooO0oo;
            this.f8246OooOOOo = i14 == 0 || (i14 & 1) != 0;
            int i15 = 0;
            while (true) {
                ImmutableList<String> immutableList = oooO0OO.f6813OooOOOO;
                if (i15 >= immutableList.size()) {
                    i15 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.f8237OooO0oO.f6417OooOOOO;
                if (str != null && str.equals(immutableList.get(i15))) {
                    break;
                } else {
                    i15++;
                }
            }
            this.f8243OooOOO = i15;
            this.f8249OooOOoo = o00OO000.OooO0O0(i3) == 128;
            this.f8251OooOo00 = o00OO000.OooO0OO(i3) == 64;
            this.f8250OooOo0 = OooO0O0.OooO(this.f8237OooO0oO.f6417OooOOOO);
            androidx.media3.common.OooOO0 oooOO4 = this.f8237OooO0oO;
            if ((oooOO4.f6411OooO0oo & 16384) == 0) {
                OooO0OO oooO0OO2 = this.f8238OooO;
                if (OooO0O0.OooOO0o(i3, oooO0OO2.f8195o00Ooo) && ((z4 = this.f8239OooO0oo) || oooO0OO2.f8187OooooOO)) {
                    if (OooO0O0.OooOO0o(i3, false) && this.f8240OooOO0 && z4 && oooOO4.f6413OooOO0O != -1 && !oooO0OO2.f6825OooOoOO && !oooO0OO2.f6823OooOoO && (i11 & i3) != 0) {
                        i12 = 2;
                    }
                    i13 = i12;
                }
            }
            this.f8247OooOOo = i13;
        }

        public static int OooO0OO(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            Object objOooO0O0 = (oooOOO0.f8239OooO0oo && oooOOO0.f8241OooOO0O) ? OooO0O0.f8136OooOO0 : OooO0O0.f8136OooOO0.OooO0O0();
            o00000.OooO00o oooO00o = o00000.f18924OooO00o;
            int i = oooOOO0.f8242OooOO0o;
            return oooO00o.OooO0OO(Integer.valueOf(i), Integer.valueOf(oooOOO1.f8242OooOO0o), oooOOO0.f8238OooO.f6823OooOoO ? OooO0O0.f8136OooOO0.OooO0O0() : OooO0O0.f8137OooOO0O).OooO0OO(Integer.valueOf(oooOOO0.f8244OooOOO0), Integer.valueOf(oooOOO1.f8244OooOOO0), objOooO0O0).OooO0OO(Integer.valueOf(i), Integer.valueOf(oooOOO1.f8242OooOO0o), objOooO0O0).OooO0o();
        }

        public static int OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            o00000 o00000VarOooO0Oo = o00000.f18924OooO00o.OooO0Oo(oooOOO0.f8241OooOO0O, oooOOO1.f8241OooOO0O).OooO00o(oooOOO0.f8245OooOOOO, oooOOO1.f8245OooOOOO).OooO0Oo(oooOOO0.f8246OooOOOo, oooOOO1.f8246OooOOOo).OooO0Oo(oooOOO0.f8239OooO0oo, oooOOO1.f8239OooO0oo).OooO0Oo(oooOOO0.f8240OooOO0, oooOOO1.f8240OooOO0);
            Integer numValueOf = Integer.valueOf(oooOOO0.f8243OooOOO);
            Integer numValueOf2 = Integer.valueOf(oooOOO1.f8243OooOOO);
            o0O0o.f19114OooO0Oo.getClass();
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oO0Ooo.f19176OooO0Oo);
            boolean z = oooOOO1.f8249OooOOoo;
            boolean z2 = oooOOO0.f8249OooOOoo;
            o00000 o00000VarOooO0Oo2 = o00000VarOooO0OO.OooO0Oo(z2, z);
            boolean z3 = oooOOO1.f8251OooOo00;
            boolean z4 = oooOOO0.f8251OooOo00;
            o00000 o00000VarOooO0Oo3 = o00000VarOooO0Oo2.OooO0Oo(z4, z3);
            if (z2 && z4) {
                o00000VarOooO0Oo3 = o00000VarOooO0Oo3.OooO00o(oooOOO0.f8250OooOo0, oooOOO1.f8250OooOo0);
            }
            return o00000VarOooO0Oo3.OooO0o();
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f8247OooOOo;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0O
        public final boolean OooO0O0(OooOO0O oooOO0O) {
            OooOOO0 oooOOO0 = (OooOOO0) oooOO0O;
            if (this.f8248OooOOo0 || o000OO00.OooO00o(this.f8237OooO0oO.f6417OooOOOO, oooOOO0.f8237OooO0oO.f6417OooOOOO)) {
                if (!this.f8238OooO.f8189Oooooo) {
                    if (this.f8249OooOOoo != oooOOO0.f8249OooOOoo || this.f8251OooOo00 != oooOOO0.f8251OooOo00) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    public OooO0O0(Context context) {
        androidx.media3.exoplayer.trackselection.OooO00o.OooO0O0 oooO0O0 = new androidx.media3.exoplayer.trackselection.OooO00o.OooO0O0();
        String str = OooO0OO.f8183o0ooOO0;
        OooO0OO oooO0OO = new OooO0OO(new OooO0OO.OooO00o(context));
        this.f8139OooO0OO = new Object();
        this.f8140OooO0Oo = context != null ? context.getApplicationContext() : null;
        this.f8142OooO0o0 = oooO0O0;
        this.f8143OooO0oO = oooO0OO;
        this.f8138OooO = androidx.media3.common.OooO00o.f6346OooOO0;
        boolean z = context != null && o000OO00.Oooo0O0(context);
        this.f8141OooO0o = z;
        if (!z && context != null && o000OO00.f34965OooO00o >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f8144OooO0oo = audioManager != null ? new OooO(audioManager.getSpatializer()) : null;
        }
        if (this.f8143OooO0oO.f8194o00Oo0 && context == null) {
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
        for (int i = 0; i < oo0o0oo.f33890OooO0Oo; i++) {
            o0OoOo0 o0oooo1 = oooO0OO.f6827OooOoo0.get(oo0o0oo.OooO0OO(i));
            if (o0oooo1 != null) {
                o000oOoO o000oooo2 = o0oooo1.f6881OooO0Oo;
                o0OoOo0 o0oooo2 = (o0OoOo0) map.get(Integer.valueOf(o000oooo2.f6771OooO0o));
                if (o0oooo2 == null || (o0oooo2.f6882OooO0o0.isEmpty() && !o0oooo1.f6882OooO0o0.isEmpty())) {
                    map.put(Integer.valueOf(o000oooo2.f6771OooO0o), o0oooo1);
                }
            }
        }
    }

    public static int OooOO0O(androidx.media3.common.OooOO0 oooOO1, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(oooOO1.f6408OooO0o)) {
            return 4;
        }
        String strOooOOO = OooOOO(str);
        String strOooOOO2 = OooOOO(oooOO1.f6408OooO0o);
        if (strOooOOO2 == null || strOooOOO == null) {
            return (z && strOooOOO2 == null) ? 1 : 0;
        }
        if (strOooOOO2.startsWith(strOooOOO) || strOooOOO.startsWith(strOooOOO2)) {
            return 3;
        }
        int i = o000OO00.f34965OooO00o;
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
        for (int i2 = 0; i2 < mappedTrackInfo.f8126OooO00o; i2++) {
            if (i == mappedTrackInfo.f8127OooO0O0[i2]) {
                oo0o0Oo oo0o0oo = mappedTrackInfo.f8128OooO0OO[i2];
                for (int i3 = 0; i3 < oo0o0oo.f33890OooO0Oo; i3++) {
                    o000oOoO o000ooooOooO0OO = oo0o0oo.OooO0OO(i3);
                    o0O00 o0o00OooO00o = oooO00o.OooO00o(i2, o000ooooOooO0OO, iArr[i2][i3]);
                    int i4 = o000ooooOooO0OO.f6770OooO0Oo;
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
            iArr2[i7] = ((OooOO0O) list.get(i7)).f8235OooO0o;
        }
        OooOO0O oooOO0O3 = (OooOO0O) list.get(0);
        return Pair.create(new androidx.media3.exoplayer.trackselection.OooO0o.OooO00o(0, oooOO0O3.f8236OooO0o0, iArr2), Integer.valueOf(oooOO0O3.f8234OooO0Oo));
    }

    @Override // p427o0OoO0o.o00000
    public final androidx.media3.common.o00O0O OooO00o() {
        OooO0OO oooO0OO;
        synchronized (this.f8139OooO0OO) {
            oooO0OO = this.f8143OooO0oO;
        }
        return oooO0OO;
    }

    @Override // p427o0OoO0o.o00000
    @Nullable
    public final RendererCapabilities.OooO00o OooO0O0() {
        return this;
    }

    @Override // p427o0OoO0o.o00000
    public final void OooO0Oo() {
        OooO oooO;
        androidx.media3.exoplayer.trackselection.OooO0OO oooO0OO;
        synchronized (this.f8139OooO0OO) {
            try {
                if (o000OO00.f34965OooO00o >= 32 && (oooO = this.f8144OooO0oo) != null && (oooO0OO = oooO.f8148OooO0Oo) != null && oooO.f8147OooO0OO != null) {
                    oooO.f8145OooO00o.removeOnSpatializerStateChangedListener(oooO0OO);
                    oooO.f8147OooO0OO.removeCallbacksAndMessages(null);
                    oooO.f8147OooO0OO = null;
                    oooO.f8148OooO0Oo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.OooO0Oo();
    }

    @Override // p427o0OoO0o.o00000
    public final void OooO0o(androidx.media3.common.OooO00o oooO00o) {
        boolean z;
        synchronized (this.f8139OooO0OO) {
            z = !this.f8138OooO.equals(oooO00o);
            this.f8138OooO = oooO00o;
        }
        if (z) {
            OooOOO0();
        }
    }

    @Override // p427o0OoO0o.o00000
    public final void OooO0oO(androidx.media3.common.o00O0O o00o0o2) {
        OooO0OO oooO0OO;
        if (o00o0o2 instanceof OooO0OO) {
            OooOOo0((OooO0OO) o00o0o2);
        }
        synchronized (this.f8139OooO0OO) {
            oooO0OO = this.f8143OooO0oO;
        }
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o(oooO0OO);
        oooO00o.OooO0OO(o00o0o2);
        OooOOo0(new OooO0OO(oooO00o));
    }

    public final void OooOOO0() {
        boolean z;
        o0OoO0o.o00000.OooO00o oooO00o;
        OooO oooO;
        synchronized (this.f8139OooO0OO) {
            z = this.f8143OooO0oO.f8194o00Oo0 && !this.f8141OooO0o && o000OO00.f34965OooO00o >= 32 && (oooO = this.f8144OooO0oo) != null && oooO.f8146OooO0O0;
        }
        if (!z || (oooO00o = this.f46752OooO00o) == null) {
            return;
        }
        ((androidx.media3.exoplayer.OooOO0O) oooO00o).f7248OooOO0O.OooOO0O(10);
    }

    public final void OooOOOO() {
        boolean z;
        o0OoO0o.o00000.OooO00o oooO00o;
        synchronized (this.f8139OooO0OO) {
            z = this.f8143OooO0oO.f8201oo000o;
        }
        if (!z || (oooO00o = this.f46752OooO00o) == null) {
            return;
        }
        ((androidx.media3.exoplayer.OooOO0O) oooO00o).f7248OooOO0O.OooOO0O(26);
    }

    public final void OooOOo0(OooO0OO oooO0OO) {
        boolean z;
        oooO0OO.getClass();
        synchronized (this.f8139OooO0OO) {
            z = !this.f8143OooO0oO.equals(oooO0OO);
            this.f8143OooO0oO = oooO0OO;
        }
        if (z) {
            if (oooO0OO.f8194o00Oo0 && this.f8140OooO0Oo == null) {
                Log.OooO0o("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            o0OoO0o.o00000.OooO00o oooO00o = this.f46752OooO00o;
            if (oooO00o != null) {
                ((androidx.media3.exoplayer.OooOO0O) oooO00o).f7248OooOO0O.OooOO0O(10);
            }
        }
    }

    public static final class OooO0OO extends androidx.media3.common.o00O0O {

        /* JADX INFO: renamed from: o00000, reason: collision with root package name */
        public static final String f8169o00000;

        /* JADX INFO: renamed from: o000000, reason: collision with root package name */
        public static final String f8170o000000;

        /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
        public static final String f8171o000000O;

        /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
        public static final String f8172o000000o;

        /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
        public static final String f8173o00000O;

        /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
        public static final String f8174o00000O0;

        /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
        public static final String f8175o00000OO;

        /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
        public static final String f8176o00000Oo;

        /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
        public static final String f8177o00000o0;

        /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
        public static final String f8178o000OOo;

        /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
        public static final String f8179o0O0O00;

        /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
        public static final String f8180o0OO00O;

        /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
        public static final String f8181o0OOO0o;

        /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
        public static final String f8182o0Oo0oo;

        /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
        public static final String f8183o0ooOO0;

        /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
        public static final String f8184o0ooOOo;

        /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
        public static final String f8185o0ooOoO;

        /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
        public static final String f8186oo0o0Oo;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public final boolean f8187OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public final boolean f8188OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public final boolean f8189Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public final boolean f8190Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public final boolean f8191OoooooO;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public final boolean f8192Ooooooo;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public final boolean f8193o00O0O;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public final boolean f8194o00Oo0;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public final boolean f8195o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public final boolean f8196o00o0O;

        /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
        public final SparseBooleanArray f8197o00oO0O;

        /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
        public final SparseArray<Map<oo0o0Oo, OooO0o>> f8198o00oO0o;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public final boolean f8199o00ooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public final boolean f8200o0OoOo0;

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public final boolean f8201oo000o;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public final boolean f8202ooOO;

        static {
            new OooO0OO(new OooO00o());
            f8183o0ooOO0 = o000OO00.Oooo00o(1000);
            f8184o0ooOOo = o000OO00.Oooo00o(1001);
            f8185o0ooOoO = o000OO00.Oooo00o(1002);
            f8181o0OOO0o = o000OO00.Oooo00o(1003);
            f8182o0Oo0oo = o000OO00.Oooo00o(1004);
            f8180o0OO00O = o000OO00.Oooo00o(1005);
            f8186oo0o0Oo = o000OO00.Oooo00o(1006);
            f8179o0O0O00 = o000OO00.Oooo00o(1007);
            f8178o000OOo = o000OO00.Oooo00o(1008);
            f8170o000000 = o000OO00.Oooo00o(1009);
            f8171o000000O = o000OO00.Oooo00o(1010);
            f8172o000000o = o000OO00.Oooo00o(1011);
            f8169o00000 = o000OO00.Oooo00o(1012);
            f8174o00000O0 = o000OO00.Oooo00o(1013);
            f8173o00000O = o000OO00.Oooo00o(1014);
            f8175o00000OO = o000OO00.Oooo00o(1015);
            f8176o00000Oo = o000OO00.Oooo00o(1016);
            f8177o00000o0 = o000OO00.Oooo00o(1017);
        }

        public OooO0OO(OooO00o oooO00o) {
            super(oooO00o);
            this.f8187OooooOO = oooO00o.f8203OooOoOO;
            this.f8188OooooOo = oooO00o.f8205OooOoo0;
            this.f8190Oooooo0 = oooO00o.f8204OooOoo;
            this.f8189Oooooo = oooO00o.f8206OooOooO;
            this.f8191OoooooO = oooO00o.f8207OooOooo;
            this.f8192Ooooooo = oooO00o.f8210Oooo000;
            this.f8200o0OoOo0 = oooO00o.f8211Oooo00O;
            this.f8202ooOO = oooO00o.f8212Oooo00o;
            this.f8193o00O0O = oooO00o.f8209Oooo0;
            this.f8194o00Oo0 = oooO00o.f8213Oooo0O0;
            this.f8195o00Ooo = oooO00o.f8214Oooo0OO;
            this.f8196o00o0O = oooO00o.f8216Oooo0o0;
            this.f8199o00ooo = oooO00o.f8215Oooo0o;
            this.f8201oo000o = oooO00o.f8217Oooo0oO;
            this.f8198o00oO0o = oooO00o.f8218Oooo0oo;
            this.f8197o00oO0O = oooO00o.f8208Oooo;
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
            if (super.equals(oooO0OO) && this.f8187OooooOO == oooO0OO.f8187OooooOO && this.f8188OooooOo == oooO0OO.f8188OooooOo && this.f8190Oooooo0 == oooO0OO.f8190Oooooo0 && this.f8189Oooooo == oooO0OO.f8189Oooooo && this.f8191OoooooO == oooO0OO.f8191OoooooO && this.f8192Ooooooo == oooO0OO.f8192Ooooooo && this.f8200o0OoOo0 == oooO0OO.f8200o0OoOo0 && this.f8202ooOO == oooO0OO.f8202ooOO && this.f8193o00O0O == oooO0OO.f8193o00O0O && this.f8194o00Oo0 == oooO0OO.f8194o00Oo0 && this.f8195o00Ooo == oooO0OO.f8195o00Ooo && this.f8196o00o0O == oooO0OO.f8196o00o0O && this.f8199o00ooo == oooO0OO.f8199o00ooo && this.f8201oo000o == oooO0OO.f8201oo000o) {
                SparseBooleanArray sparseBooleanArray = this.f8197o00oO0O;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = oooO0OO.f8197o00oO0O;
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
                    SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray = this.f8198o00oO0o;
                    int size2 = sparseArray.size();
                    SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray2 = oooO0OO.f8198o00oO0o;
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
                                            if (!mapValueAt2.containsKey(key) || !o000OO00.OooO00o(next.getValue(), mapValueAt2.get(key))) {
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
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f8187OooooOO ? 1 : 0)) * 31) + (this.f8188OooooOo ? 1 : 0)) * 31) + (this.f8190Oooooo0 ? 1 : 0)) * 31) + (this.f8189Oooooo ? 1 : 0)) * 31) + (this.f8191OoooooO ? 1 : 0)) * 31) + (this.f8192Ooooooo ? 1 : 0)) * 31) + (this.f8200o0OoOo0 ? 1 : 0)) * 31) + (this.f8202ooOO ? 1 : 0)) * 31) + (this.f8193o00O0O ? 1 : 0)) * 31) + (this.f8194o00Oo0 ? 1 : 0)) * 31) + (this.f8195o00Ooo ? 1 : 0)) * 31) + (this.f8196o00o0O ? 1 : 0)) * 31) + (this.f8199o00ooo ? 1 : 0)) * 31) + (this.f8201oo000o ? 1 : 0);
        }

        @Override // androidx.media3.common.o00O0O, androidx.media3.common.OooO0OO
        public final Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f8183o0ooOO0, this.f8187OooooOO);
            bundle.putBoolean(f8184o0ooOOo, this.f8188OooooOo);
            bundle.putBoolean(f8185o0ooOoO, this.f8190Oooooo0);
            bundle.putBoolean(f8173o00000O, this.f8189Oooooo);
            bundle.putBoolean(f8181o0OOO0o, this.f8191OoooooO);
            bundle.putBoolean(f8182o0Oo0oo, this.f8192Ooooooo);
            bundle.putBoolean(f8180o0OO00O, this.f8200o0OoOo0);
            bundle.putBoolean(f8186oo0o0Oo, this.f8202ooOO);
            bundle.putBoolean(f8175o00000OO, this.f8193o00O0O);
            bundle.putBoolean(f8176o00000Oo, this.f8194o00Oo0);
            bundle.putBoolean(f8179o0O0O00, this.f8195o00Ooo);
            bundle.putBoolean(f8178o000OOo, this.f8196o00o0O);
            bundle.putBoolean(f8170o000000, this.f8199o00ooo);
            bundle.putBoolean(f8177o00000o0, this.f8201oo000o);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            int i = 0;
            while (true) {
                SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray2 = this.f8198o00oO0o;
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
                bundle.putIntArray(f8171o000000O, com.google.common.primitives.OooO0OO.OooO0Oo(arrayList));
                bundle.putParcelableArrayList(f8172o000000o, p080o000OoO.oo000o.OooO0O0(arrayList2));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    sparseArray3.put(sparseArray.keyAt(i2), ((androidx.media3.common.OooO0OO) sparseArray.valueAt(i2)).toBundle());
                }
                bundle.putSparseParcelableArray(f8169o00000, sparseArray3);
                i++;
            }
            SparseBooleanArray sparseBooleanArray = this.f8197o00oO0O;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
                iArr[i3] = sparseBooleanArray.keyAt(i3);
            }
            bundle.putIntArray(f8174o00000O0, iArr);
            return bundle;
        }

        public static final class OooO00o extends androidx.media3.common.o00O0O.OooO00o {

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public boolean f8203OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public boolean f8204OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public boolean f8205OooOoo0;

            /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
            public boolean f8206OooOooO;

            /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
            public boolean f8207OooOooo;

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final SparseBooleanArray f8208Oooo;

            /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
            public boolean f8209Oooo0;

            /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
            public boolean f8210Oooo000;

            /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
            public boolean f8211Oooo00O;

            /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
            public boolean f8212Oooo00o;

            /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
            public boolean f8213Oooo0O0;

            /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
            public boolean f8214Oooo0OO;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public boolean f8215Oooo0o;

            /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
            public boolean f8216Oooo0o0;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public boolean f8217Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final SparseArray<Map<oo0o0Oo, OooO0o>> f8218Oooo0oo;

            public OooO00o(Context context) {
                OooOO0(context);
                OooOO0O(context);
                this.f8218Oooo0oo = new SparseArray<>();
                this.f8208Oooo = new SparseBooleanArray();
                OooO();
            }

            public final void OooO() {
                this.f8203OooOoOO = true;
                this.f8205OooOoo0 = false;
                this.f8204OooOoo = true;
                this.f8206OooOooO = false;
                this.f8207OooOooo = true;
                this.f8210Oooo000 = false;
                this.f8211Oooo00O = false;
                this.f8212Oooo00o = false;
                this.f8209Oooo0 = false;
                this.f8213Oooo0O0 = true;
                this.f8214Oooo0OO = true;
                this.f8216Oooo0o0 = false;
                this.f8215Oooo0o = true;
                this.f8217Oooo0oO = false;
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
                this.f6848OooOo0 = -3;
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
                int i = o000OO00.f34965OooO00o;
                if (i >= 19) {
                    if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                        this.f6849OooOo00 = 1088;
                        Locale locale = captioningManager.getLocale();
                        if (locale != null) {
                            this.f6846OooOOoo = ImmutableList.OooOOOo(i >= 21 ? locale.toLanguageTag() : locale.toString());
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
                int i = o000OO00.f34965OooO00o;
                Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && o000OO00.Oooo0O0(context)) {
                    String strOooOoOO = i < 28 ? o000OO00.OooOoOO("sys.display-size") : o000OO00.OooOoOO("vendor.display-size");
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
                        if (!"Sony".equals(o000OO00.f34967OooO0OO) && o000OO00.f34968OooO0Oo.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
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
                    } else if (!"Sony".equals(o000OO00.f34967OooO0OO)) {
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
                this.f8218Oooo0oo = new SparseArray<>();
                this.f8208Oooo = new SparseBooleanArray();
                OooO();
            }

            public OooO00o(OooO0OO oooO0OO) {
                super(oooO0OO);
                this.f8203OooOoOO = oooO0OO.f8187OooooOO;
                this.f8205OooOoo0 = oooO0OO.f8188OooooOo;
                this.f8204OooOoo = oooO0OO.f8190Oooooo0;
                this.f8206OooOooO = oooO0OO.f8189Oooooo;
                this.f8207OooOooo = oooO0OO.f8191OoooooO;
                this.f8210Oooo000 = oooO0OO.f8192Ooooooo;
                this.f8211Oooo00O = oooO0OO.f8200o0OoOo0;
                this.f8212Oooo00o = oooO0OO.f8202ooOO;
                this.f8209Oooo0 = oooO0OO.f8193o00O0O;
                this.f8213Oooo0O0 = oooO0OO.f8194o00Oo0;
                this.f8214Oooo0OO = oooO0OO.f8195o00Ooo;
                this.f8216Oooo0o0 = oooO0OO.f8196o00o0O;
                this.f8215Oooo0o = oooO0OO.f8199o00ooo;
                this.f8217Oooo0oO = oooO0OO.f8201oo000o;
                SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray = new SparseArray<>();
                int i = 0;
                while (true) {
                    SparseArray<Map<oo0o0Oo, OooO0o>> sparseArray2 = oooO0OO.f8198o00oO0o;
                    if (i < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i), new HashMap(sparseArray2.valueAt(i)));
                        i++;
                    } else {
                        this.f8218Oooo0oo = sparseArray;
                        this.f8208Oooo = oooO0OO.f8197o00oO0O.clone();
                        return;
                    }
                }
            }
        }
    }
}
