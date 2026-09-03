package com.google.android.exoplayer2.trackselection;

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
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.OooOo00;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o00000;
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
import p022Oooo00O.o00;
import p203o00o0o0o.o0OoO00O;
import p226o00oOo00.o000O0;
import p226o00oOo00.o000O00O;
import p241o00oo0O.o0000O;
import p241o00oo0O.o000OO;
import p241o00oo0O.o000Oo0;
import p241o00oo0O.o00oOoo;
import p241o00oo0O.o0O0ooO;
import p245o00oo0o.o0O00;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 extends MappingTrackSelector implements RendererCapabilities.OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0O000<Integer> f13615OooOO0 = o0O000.OooO00o(new o000OO());

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o0O000<Integer> f13616OooOO0O = o0O000.OooO00o(new o0000O());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("lock")
    public com.google.android.exoplayer2.audio.OooO00o f13617OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f13618OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Context f13619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f13620OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.OooO0o.OooO0O0 f13621OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("lock")
    public OooO0OO f13622OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public final OooO f13623OooO0oo;

    @RequiresApi(32)
    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Spatializer f13624OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f13625OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Handler f13626OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public com.google.android.exoplayer2.trackselection.OooO0OO f13627OooO0Oo;

        public OooO(Spatializer spatializer) {
            this.f13624OooO00o = spatializer;
            this.f13625OooO0O0 = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean OooO00o(OooOo oooOo, com.google.android.exoplayer2.audio.OooO00o oooO00o) {
            boolean zEquals = "audio/eac3-joc".equals(oooOo.f11211OooOOOO);
            int i = oooOo.f11225OooOoo0;
            if (zEquals && i == 16) {
                i = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(o0O00.OooOOO(i));
            int i2 = oooOo.f11224OooOoo;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return this.f13624OooO00o.canBeSpatialized(oooO00o.OooO00o().f11592OooO00o, channelMask.build());
        }
    }

    public static final class OooO00o extends OooOO0O<OooO00o> implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f13628OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f13629OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final String f13630OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final OooO0OO f13631OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f13632OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f13633OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f13634OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f13635OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f13636OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final int f13637OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final int f13638OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f13639OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final boolean f13640OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final int f13641OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final int f13642OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final int f13643OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f13644OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final boolean f13645OooOoO0;

        public OooO00o(int i, o000O00O o000o00o2, int i2, OooO0OO oooO0OO, int i3, boolean z, o000Oo0 o000oo1) {
            int i4;
            int iOooOO0O;
            int iOooOO0O2;
            boolean z2;
            super(i, i2, o000o00o2);
            this.f13631OooOO0O = oooO0OO;
            this.f13630OooOO0 = OooO0O0.OooOOO(this.f13716OooO0oO.f11202OooO0o);
            int i5 = 0;
            this.f13632OooOO0o = OooO0O0.OooOO0o(i3, false);
            int i6 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i6 >= oooO0OO.f13560OooOOo0.size()) {
                    iOooOO0O = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOooOO0O = OooO0O0.OooOO0O(this.f13716OooO0oO, oooO0OO.f13560OooOOo0.get(i6), false);
                    if (iOooOO0O > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f13633OooOOO = i6;
            this.f13634OooOOO0 = iOooOO0O;
            this.f13635OooOOOO = OooO0O0.OooO0oo(this.f13716OooO0oO.f11205OooO0oo, oooO0OO.f13559OooOOo);
            OooOo oooOo = this.f13716OooO0oO;
            int i7 = oooOo.f11205OooO0oo;
            this.f13636OooOOOo = i7 == 0 || (i7 & 1) != 0;
            this.f13639OooOOoo = (oooOo.f11204OooO0oO & 1) != 0;
            int i8 = oooOo.f11225OooOoo0;
            this.f13642OooOo00 = i8;
            this.f13641OooOo0 = oooOo.f11224OooOoo;
            int i9 = oooOo.f11207OooOO0O;
            this.f13643OooOo0O = i9;
            this.f13628OooO = (i9 == -1 || i9 <= oooO0OO.f13564OooOo00) && (i8 == -1 || i8 <= oooO0OO.f13561OooOOoo) && o000oo1.apply(oooOo);
            String[] strArrOooOoO0 = o0O00.OooOoO0();
            int i10 = 0;
            while (true) {
                if (i10 >= strArrOooOoO0.length) {
                    iOooOO0O2 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOooOO0O2 = OooO0O0.OooOO0O(this.f13716OooO0oO, strArrOooOoO0[i10], false);
                    if (iOooOO0O2 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f13638OooOOo0 = i10;
            this.f13637OooOOo = iOooOO0O2;
            int i11 = 0;
            while (true) {
                ImmutableList<String> immutableList = oooO0OO.f13563OooOo0;
                if (i11 < immutableList.size()) {
                    String str = this.f13716OooO0oO.f11211OooOOOO;
                    if (str != null && str.equals(immutableList.get(i11))) {
                        i4 = i11;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            this.f13644OooOo0o = i4;
            this.f13640OooOo = o0OoO00O.OooO0O0(i3) == 128;
            this.f13645OooOoO0 = o0OoO00O.OooO0OO(i3) == 64;
            OooO0OO oooO0OO2 = this.f13631OooOO0O;
            if (OooO0O0.OooOO0o(i3, oooO0OO2.f13674o00Ooo) && ((z2 = this.f13628OooO) || oooO0OO2.f13670OoooooO)) {
                i5 = (!OooO0O0.OooOO0o(i3, false) || !z2 || this.f13716OooO0oO.f11207OooOO0O == -1 || oooO0OO2.f13569OooOoOO || oooO0OO2.f13567OooOoO || (!oooO0OO2.f13678o00ooo && z)) ? 1 : 2;
            }
            this.f13629OooO0oo = i5;
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f13629OooO0oo;
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O
        public final boolean OooO0O0(OooOO0O oooOO0O) {
            int i;
            String str;
            int i2;
            OooO00o oooO00o = (OooO00o) oooOO0O;
            OooO0OO oooO0OO = this.f13631OooOO0O;
            boolean z = oooO0OO.f13681ooOO;
            OooOo oooOo = oooO00o.f13716OooO0oO;
            OooOo oooOo2 = this.f13716OooO0oO;
            if ((z || ((i2 = oooOo2.f11225OooOoo0) != -1 && i2 == oooOo.f11225OooOoo0)) && ((oooO0OO.f13671Ooooooo || ((str = oooOo2.f11211OooOOOO) != null && TextUtils.equals(str, oooOo.f11211OooOOOO))) && (oooO0OO.f13679o0OoOo0 || ((i = oooOo2.f11224OooOoo) != -1 && i == oooOo.f11224OooOoo)))) {
                if (!oooO0OO.f13672o00O0O) {
                    if (this.f13640OooOo != oooO00o.f13640OooOo || this.f13645OooOoO0 != oooO00o.f13645OooOoO0) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO00o oooO00o) {
            boolean z = this.f13632OooOO0o;
            boolean z2 = this.f13628OooO;
            Object objOooO0O0 = (z2 && z) ? OooO0O0.f13615OooOO0 : OooO0O0.f13615OooOO0.OooO0O0();
            o00000 o00000VarOooO0Oo = o00000.f19395OooO00o.OooO0Oo(z, oooO00o.f13632OooOO0o);
            Integer numValueOf = Integer.valueOf(this.f13633OooOOO);
            Integer numValueOf2 = Integer.valueOf(oooO00o.f13633OooOOO);
            o0O0o.f19585OooO0Oo.getClass();
            o0oO0Ooo o0oo0ooo2 = o0oO0Ooo.f19647OooO0Oo;
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oo0ooo2).OooO00o(this.f13634OooOOO0, oooO00o.f13634OooOOO0).OooO00o(this.f13635OooOOOO, oooO00o.f13635OooOOOO).OooO0Oo(this.f13639OooOOoo, oooO00o.f13639OooOOoo).OooO0Oo(this.f13636OooOOOo, oooO00o.f13636OooOOOo).OooO0OO(Integer.valueOf(this.f13638OooOOo0), Integer.valueOf(oooO00o.f13638OooOOo0), o0oo0ooo2).OooO00o(this.f13637OooOOo, oooO00o.f13637OooOOo).OooO0Oo(z2, oooO00o.f13628OooO).OooO0OO(Integer.valueOf(this.f13644OooOo0o), Integer.valueOf(oooO00o.f13644OooOo0o), o0oo0ooo2);
            int i = this.f13643OooOo0O;
            Integer numValueOf3 = Integer.valueOf(i);
            int i2 = oooO00o.f13643OooOo0O;
            o00000 o00000VarOooO0OO2 = o00000VarOooO0OO.OooO0OO(numValueOf3, Integer.valueOf(i2), this.f13631OooOO0O.f13567OooOoO ? OooO0O0.f13615OooOO0.OooO0O0() : OooO0O0.f13616OooOO0O).OooO0Oo(this.f13640OooOo, oooO00o.f13640OooOo).OooO0Oo(this.f13645OooOoO0, oooO00o.f13645OooOoO0).OooO0OO(Integer.valueOf(this.f13642OooOo00), Integer.valueOf(oooO00o.f13642OooOo00), objOooO0O0).OooO0OO(Integer.valueOf(this.f13641OooOo0), Integer.valueOf(oooO00o.f13641OooOo0), objOooO0O0);
            Integer numValueOf4 = Integer.valueOf(i);
            Integer numValueOf5 = Integer.valueOf(i2);
            if (!o0O00.OooO00o(this.f13630OooOO0, oooO00o.f13630OooOO0)) {
                objOooO0O0 = OooO0O0.f13616OooOO0O;
            }
            return o00000VarOooO0OO2.OooO0OO(numValueOf4, numValueOf5, objOooO0O0).OooO0o();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0214OooO0O0 implements Comparable<C0214OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f13646OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f13647OooO0o0;

        public C0214OooO0O0(OooOo oooOo, int i) {
            this.f13646OooO0Oo = (oooOo.f11204OooO0oO & 1) != 0;
            this.f13647OooO0o0 = OooO0O0.OooOO0o(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0214OooO0O0 c0214OooO0O0) {
            C0214OooO0O0 c0214OooO0O1 = c0214OooO0O0;
            return o00000.f19395OooO00o.OooO0Oo(this.f13647OooO0o0, c0214OooO0O1.f13647OooO0o0).OooO0Oo(this.f13646OooO0Oo, c0214OooO0O1.f13646OooO0Oo).OooO0o();
        }
    }

    public static final class OooO0o implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13701OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f13702OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f13703OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final String f13699OooO0oO = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final String f13700OooO0oo = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f13698OooO = o0O00.Oooo00O(2);

        static {
            new o00();
        }

        public OooO0o(int i, int i2, int[] iArr) {
            this.f13701OooO0Oo = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f13703OooO0o0 = iArrCopyOf;
            this.f13702OooO0o = i2;
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
            return this.f13701OooO0Oo == oooO0o.f13701OooO0Oo && Arrays.equals(this.f13703OooO0o0, oooO0o.f13703OooO0o0) && this.f13702OooO0o == oooO0o.f13702OooO0o;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f13703OooO0o0) + (this.f13701OooO0Oo * 31)) * 31) + this.f13702OooO0o;
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f13699OooO0oO, this.f13701OooO0Oo);
            bundle.putIntArray(f13700OooO0oo, this.f13703OooO0o0);
            bundle.putInt(f13698OooO, this.f13702OooO0o);
            return bundle;
        }
    }

    public static final class OooOO0 extends OooOO0O<OooOO0> implements Comparable<OooOO0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f13704OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f13705OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f13706OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f13707OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f13708OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f13709OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f13710OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f13711OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f13712OooOOOo;

        public OooOO0(int i, o000O00O o000o00o2, int i2, OooO0OO oooO0OO, int i3, @Nullable String str) {
            int iOooOO0O;
            super(i, i2, o000o00o2);
            int i4 = 0;
            this.f13704OooO = OooO0O0.OooOO0o(i3, false);
            int i5 = this.f13716OooO0oO.f11204OooO0oO & (~oooO0OO.f13562OooOo);
            this.f13706OooOO0 = (i5 & 1) != 0;
            this.f13707OooOO0O = (i5 & 2) != 0;
            ImmutableList<String> immutableList = oooO0OO.f13565OooOo0O;
            ImmutableList<String> immutableListOooOOOo = immutableList.isEmpty() ? ImmutableList.OooOOOo("") : immutableList;
            int i6 = 0;
            while (true) {
                if (i6 >= immutableListOooOOOo.size()) {
                    i6 = Integer.MAX_VALUE;
                    iOooOO0O = 0;
                    break;
                } else {
                    iOooOO0O = OooO0O0.OooOO0O(this.f13716OooO0oO, immutableListOooOOOo.get(i6), oooO0OO.f13568OooOoO0);
                    if (iOooOO0O > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f13708OooOO0o = i6;
            this.f13710OooOOO0 = iOooOO0O;
            int iOooO0oo = OooO0O0.OooO0oo(this.f13716OooO0oO.f11205OooO0oo, oooO0OO.f13566OooOo0o);
            this.f13709OooOOO = iOooO0oo;
            this.f13712OooOOOo = (this.f13716OooO0oO.f11205OooO0oo & 1088) != 0;
            int iOooOO0O2 = OooO0O0.OooOO0O(this.f13716OooO0oO, str, OooO0O0.OooOOO(str) == null);
            this.f13711OooOOOO = iOooOO0O2;
            boolean z = iOooOO0O > 0 || (immutableList.isEmpty() && iOooO0oo > 0) || this.f13706OooOO0 || (this.f13707OooOO0O && iOooOO0O2 > 0);
            if (OooO0O0.OooOO0o(i3, oooO0OO.f13674o00Ooo) && z) {
                i4 = 1;
            }
            this.f13705OooO0oo = i4;
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f13705OooO0oo;
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O
        public final /* bridge */ /* synthetic */ boolean OooO0O0(OooOO0O oooOO0O) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooOO0 oooOO1) {
            o00000 o00000VarOooO0Oo = o00000.f19395OooO00o.OooO0Oo(this.f13704OooO, oooOO1.f13704OooO);
            Integer numValueOf = Integer.valueOf(this.f13708OooOO0o);
            Integer numValueOf2 = Integer.valueOf(oooOO1.f13708OooOO0o);
            Object obj = o0O0o.f19585OooO0Oo;
            obj.getClass();
            o0oO0Ooo o0oo0ooo2 = o0oO0Ooo.f19647OooO0Oo;
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oo0ooo2);
            int i = this.f13710OooOOO0;
            o00000 o00000VarOooO00o = o00000VarOooO0OO.OooO00o(i, oooOO1.f13710OooOOO0);
            int i2 = this.f13709OooOOO;
            o00000 o00000VarOooO0Oo2 = o00000VarOooO00o.OooO00o(i2, oooOO1.f13709OooOOO).OooO0Oo(this.f13706OooOO0, oooOO1.f13706OooOO0);
            Boolean boolValueOf = Boolean.valueOf(this.f13707OooOO0O);
            Boolean boolValueOf2 = Boolean.valueOf(oooOO1.f13707OooOO0O);
            if (i != 0) {
                obj = o0oo0ooo2;
            }
            o00000 o00000VarOooO00o2 = o00000VarOooO0Oo2.OooO0OO(boolValueOf, boolValueOf2, obj).OooO00o(this.f13711OooOOOO, oooOO1.f13711OooOOOO);
            if (i2 == 0) {
                o00000VarOooO00o2 = o00000VarOooO00o2.OooO0o0(this.f13712OooOOOo, oooOO1.f13712OooOOOo);
            }
            return o00000VarOooO00o2.OooO0o();
        }
    }

    public static abstract class OooOO0O<T extends OooOO0O<T>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13713OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f13714OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000O00O f13715OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooOo f13716OooO0oO;

        public interface OooO00o<T extends OooOO0O<T>> {
            com.google.common.collect.o0O00 OooO00o(int i, o000O00O o000o00o2, int[] iArr);
        }

        public OooOO0O(int i, int i2, o000O00O o000o00o2) {
            this.f13713OooO0Oo = i;
            this.f13715OooO0o0 = o000o00o2;
            this.f13714OooO0o = i2;
            this.f13716OooO0oO = o000o00o2.f39876OooO0oO[i2];
        }

        public abstract int OooO00o();

        public abstract boolean OooO0O0(T t);
    }

    public static final class OooOOO0 extends OooOO0O<OooOOO0> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final OooO0OO f13717OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f13718OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f13719OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final boolean f13720OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f13721OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f13722OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f13723OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f13724OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f13725OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final int f13726OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f13727OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f13728OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final int f13729OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final boolean f13730OooOo00;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public OooOOO0(int i, o000O00O o000o00o2, int i2, OooO0OO oooO0OO, int i3, int i4, boolean z) {
            boolean z2;
            boolean z3;
            boolean z4;
            OooOo oooOo;
            int i5;
            int i6;
            int i7;
            OooOo oooOo2;
            int i8;
            int i9;
            int i10;
            super(i, i2, o000o00o2);
            this.f13717OooO = oooO0OO;
            int i11 = oooO0OO.f13669Oooooo0 ? 24 : 16;
            int i12 = 1;
            int i13 = 0;
            this.f13727OooOOo0 = oooO0OO.f13667OooooOo && (i4 & i11) != 0;
            if (!z || (((i8 = (oooOo2 = this.f13716OooO0oO).f11218OooOo00) != -1 && i8 > oooO0OO.f13547OooO0Oo) || ((i9 = oooOo2.f11217OooOo0) != -1 && i9 > oooO0OO.f13549OooO0o0))) {
                z2 = false;
            } else {
                float f = oooOo2.f11219OooOo0O;
                if ((f == -1.0f || f <= oooO0OO.f13548OooO0o) && ((i10 = oooOo2.f11207OooOO0O) == -1 || i10 <= oooO0OO.f13550OooO0oO)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f13718OooO0oo = z2;
            if (!z || (((i5 = (oooOo = this.f13716OooO0oO).f11218OooOo00) != -1 && i5 < oooO0OO.f13551OooO0oo) || ((i6 = oooOo.f11217OooOo0) != -1 && i6 < oooO0OO.f13546OooO))) {
                z3 = false;
            } else {
                float f2 = oooOo.f11219OooOo0O;
                if ((f2 == -1.0f || f2 >= oooO0OO.f13552OooOO0) && ((i7 = oooOo.f11207OooOO0O) == -1 || i7 >= oooO0OO.f13553OooOO0O)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f13719OooOO0 = z3;
            this.f13720OooOO0O = OooO0O0.OooOO0o(i3, false);
            OooOo oooOo3 = this.f13716OooO0oO;
            this.f13721OooOO0o = oooOo3.f11207OooOO0O;
            this.f13723OooOOO0 = oooOo3.OooO0O0();
            this.f13724OooOOOO = OooO0O0.OooO0oo(this.f13716OooO0oO.f11205OooO0oo, oooO0OO.f13558OooOOOo);
            int i14 = this.f13716OooO0oO.f11205OooO0oo;
            this.f13725OooOOOo = i14 == 0 || (i14 & 1) != 0;
            int i15 = 0;
            while (true) {
                ImmutableList<String> immutableList = oooO0OO.f13557OooOOOO;
                if (i15 >= immutableList.size()) {
                    i15 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.f13716OooO0oO.f11211OooOOOO;
                if (str != null && str.equals(immutableList.get(i15))) {
                    break;
                } else {
                    i15++;
                }
            }
            this.f13722OooOOO = i15;
            this.f13728OooOOoo = o0OoO00O.OooO0O0(i3) == 128;
            this.f13730OooOo00 = o0OoO00O.OooO0OO(i3) == 64;
            this.f13729OooOo0 = OooO0O0.OooO(this.f13716OooO0oO.f11211OooOOOO);
            OooOo oooOo4 = this.f13716OooO0oO;
            if ((oooOo4.f11205OooO0oo & 16384) == 0) {
                OooO0OO oooO0OO2 = this.f13717OooO;
                if (OooO0O0.OooOO0o(i3, oooO0OO2.f13674o00Ooo) && ((z4 = this.f13718OooO0oo) || oooO0OO2.f13666OooooOO)) {
                    if (OooO0O0.OooOO0o(i3, false) && this.f13719OooOO0 && z4 && oooOo4.f11207OooOO0O != -1 && !oooO0OO2.f13569OooOoOO && !oooO0OO2.f13567OooOoO && (i11 & i3) != 0) {
                        i12 = 2;
                    }
                    i13 = i12;
                }
            }
            this.f13726OooOOo = i13;
        }

        public static int OooO0OO(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            o00000 o00000VarOooO0Oo = o00000.f19395OooO00o.OooO0Oo(oooOOO0.f13720OooOO0O, oooOOO1.f13720OooOO0O).OooO00o(oooOOO0.f13724OooOOOO, oooOOO1.f13724OooOOOO).OooO0Oo(oooOOO0.f13725OooOOOo, oooOOO1.f13725OooOOOo).OooO0Oo(oooOOO0.f13718OooO0oo, oooOOO1.f13718OooO0oo).OooO0Oo(oooOOO0.f13719OooOO0, oooOOO1.f13719OooOO0);
            Integer numValueOf = Integer.valueOf(oooOOO0.f13722OooOOO);
            Integer numValueOf2 = Integer.valueOf(oooOOO1.f13722OooOOO);
            o0O0o.f19585OooO0Oo.getClass();
            o00000 o00000VarOooO0OO = o00000VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, o0oO0Ooo.f19647OooO0Oo);
            boolean z = oooOOO1.f13728OooOOoo;
            boolean z2 = oooOOO0.f13728OooOOoo;
            o00000 o00000VarOooO0Oo2 = o00000VarOooO0OO.OooO0Oo(z2, z);
            boolean z3 = oooOOO1.f13730OooOo00;
            boolean z4 = oooOOO0.f13730OooOo00;
            o00000 o00000VarOooO0Oo3 = o00000VarOooO0Oo2.OooO0Oo(z4, z3);
            if (z2 && z4) {
                o00000VarOooO0Oo3 = o00000VarOooO0Oo3.OooO00o(oooOOO0.f13729OooOo0, oooOOO1.f13729OooOo0);
            }
            return o00000VarOooO0Oo3.OooO0o();
        }

        public static int OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            Object objOooO0O0 = (oooOOO0.f13718OooO0oo && oooOOO0.f13720OooOO0O) ? OooO0O0.f13615OooOO0 : OooO0O0.f13615OooOO0.OooO0O0();
            o00000.OooO00o oooO00o = o00000.f19395OooO00o;
            int i = oooOOO0.f13721OooOO0o;
            return oooO00o.OooO0OO(Integer.valueOf(i), Integer.valueOf(oooOOO1.f13721OooOO0o), oooOOO0.f13717OooO.f13567OooOoO ? OooO0O0.f13615OooOO0.OooO0O0() : OooO0O0.f13616OooOO0O).OooO0OO(Integer.valueOf(oooOOO0.f13723OooOOO0), Integer.valueOf(oooOOO1.f13723OooOOO0), objOooO0O0).OooO0OO(Integer.valueOf(i), Integer.valueOf(oooOOO1.f13721OooOO0o), objOooO0O0).OooO0o();
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O
        public final int OooO00o() {
            return this.f13726OooOOo;
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0O0.OooOO0O
        public final boolean OooO0O0(OooOO0O oooOO0O) {
            OooOOO0 oooOOO0 = (OooOOO0) oooOO0O;
            if (this.f13727OooOOo0 || o0O00.OooO00o(this.f13716OooO0oO.f11211OooOOOO, oooOOO0.f13716OooO0oO.f11211OooOOOO)) {
                if (!this.f13717OooO.f13668Oooooo) {
                    if (this.f13728OooOOoo != oooOOO0.f13728OooOOoo || this.f13730OooOo00 != oooOOO0.f13730OooOo00) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    public OooO0O0(Context context) {
        com.google.android.exoplayer2.trackselection.OooO00o.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.trackselection.OooO00o.OooO0O0();
        String str = OooO0OO.f13662o0ooOO0;
        OooO0OO oooO0OO = new OooO0OO(new OooO0OO.OooO00o(context));
        this.f13618OooO0OO = new Object();
        this.f13619OooO0Oo = context != null ? context.getApplicationContext() : null;
        this.f13621OooO0o0 = oooO0O0;
        this.f13622OooO0oO = oooO0OO;
        this.f13617OooO = com.google.android.exoplayer2.audio.OooO00o.f11580OooOO0;
        boolean z = context != null && o0O00.Oooo0(context);
        this.f13620OooO0o = z;
        if (!z && context != null && o0O00.f40595OooO00o >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f13623OooO0oo = audioManager != null ? new OooO(audioManager.getSpatializer()) : null;
        }
        if (this.f13622OooO0oO.f13673o00Oo0 && context == null) {
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

    public static void OooOO0(o000O0 o000o0, OooO0OO oooO0OO, HashMap map) {
        for (int i = 0; i < o000o0.f39866OooO0Oo; i++) {
            o0O0ooO o0o0ooo = oooO0OO.f13571OooOoo0.get(o000o0.OooO00o(i));
            if (o0o0ooo != null) {
                o000O00O o000o00o2 = o0o0ooo.f40411OooO0Oo;
                o0O0ooO o0o0ooo2 = (o0O0ooO) map.get(Integer.valueOf(o000o00o2.f39874OooO0o));
                if (o0o0ooo2 == null || (o0o0ooo2.f40412OooO0o0.isEmpty() && !o0o0ooo.f40412OooO0o0.isEmpty())) {
                    map.put(Integer.valueOf(o000o00o2.f39874OooO0o), o0o0ooo);
                }
            }
        }
    }

    public static int OooOO0O(OooOo oooOo, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(oooOo.f11202OooO0o)) {
            return 4;
        }
        String strOooOOO = OooOOO(str);
        String strOooOOO2 = OooOOO(oooOo.f11202OooO0o);
        if (strOooOOO2 == null || strOooOOO == null) {
            return (z && strOooOOO2 == null) ? 1 : 0;
        }
        if (strOooOOO2.startsWith(strOooOOO) || strOooOOO.startsWith(strOooOOO2)) {
            return 3;
        }
        int i = o0O00.f40595OooO00o;
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
        for (int i2 = 0; i2 < mappedTrackInfo.f13513OooO00o; i2++) {
            if (i == mappedTrackInfo.f13514OooO0O0[i2]) {
                o000O0 o000o0 = mappedTrackInfo.f13515OooO0OO[i2];
                for (int i3 = 0; i3 < o000o0.f39866OooO0Oo; i3++) {
                    o000O00O o000o00oOooO00o = o000o0.OooO00o(i3);
                    com.google.common.collect.o0O00 o0o00OooO00o = oooO00o.OooO00o(i2, o000o00oOooO00o, iArr[i2][i3]);
                    int i4 = o000o00oOooO00o.f39873OooO0Oo;
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
            iArr2[i7] = ((OooOO0O) list.get(i7)).f13714OooO0o;
        }
        OooOO0O oooOO0O3 = (OooOO0O) list.get(0);
        return Pair.create(new com.google.android.exoplayer2.trackselection.OooO0o.OooO00o(0, oooOO0O3.f13715OooO0o0, iArr2), Integer.valueOf(oooOO0O3.f13713OooO0Oo));
    }

    @Override // p241o00oo0O.o00oOoo
    public final com.google.android.exoplayer2.trackselection.OooO OooO00o() {
        OooO0OO oooO0OO;
        synchronized (this.f13618OooO0OO) {
            oooO0OO = this.f13622OooO0oO;
        }
        return oooO0OO;
    }

    @Override // p241o00oo0O.o00oOoo
    @Nullable
    public final RendererCapabilities.OooO00o OooO0O0() {
        return this;
    }

    @Override // p241o00oo0O.o00oOoo
    public final void OooO0Oo() {
        OooO oooO;
        com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO;
        synchronized (this.f13618OooO0OO) {
            try {
                if (o0O00.f40595OooO00o >= 32 && (oooO = this.f13623OooO0oo) != null && (oooO0OO = oooO.f13627OooO0Oo) != null && oooO.f13626OooO0OO != null) {
                    oooO.f13624OooO00o.removeOnSpatializerStateChangedListener(oooO0OO);
                    oooO.f13626OooO0OO.removeCallbacksAndMessages(null);
                    oooO.f13626OooO0OO = null;
                    oooO.f13627OooO0Oo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.OooO0Oo();
    }

    @Override // p241o00oo0O.o00oOoo
    public final void OooO0o(com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        boolean z;
        synchronized (this.f13618OooO0OO) {
            z = !this.f13617OooO.equals(oooO00o);
            this.f13617OooO = oooO00o;
        }
        if (z) {
            OooOOO0();
        }
    }

    @Override // p241o00oo0O.o00oOoo
    public final void OooO0oO(com.google.android.exoplayer2.trackselection.OooO oooO) {
        OooO0OO oooO0OO;
        if (oooO instanceof OooO0OO) {
            OooOOo0((OooO0OO) oooO);
        }
        synchronized (this.f13618OooO0OO) {
            oooO0OO = this.f13622OooO0oO;
        }
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o(oooO0OO);
        oooO00o.OooO0OO(oooO);
        OooOOo0(new OooO0OO(oooO00o));
    }

    public final void OooOOO0() {
        boolean z;
        o00oOoo.OooO00o oooO00o;
        OooO oooO;
        synchronized (this.f13618OooO0OO) {
            z = this.f13622OooO0oO.f13673o00Oo0 && !this.f13620OooO0o && o0O00.f40595OooO00o >= 32 && (oooO = this.f13623OooO0oo) != null && oooO.f13625OooO0O0;
        }
        if (!z || (oooO00o = this.f40407OooO00o) == null) {
            return;
        }
        ((OooOo00) oooO00o).f11273OooOO0O.OooOO0O(10);
    }

    public final void OooOOOO() {
        boolean z;
        o00oOoo.OooO00o oooO00o;
        synchronized (this.f13618OooO0OO) {
            z = this.f13622OooO0oO.f13680oo000o;
        }
        if (!z || (oooO00o = this.f40407OooO00o) == null) {
            return;
        }
        ((OooOo00) oooO00o).f11273OooOO0O.OooOO0O(26);
    }

    public final void OooOOo0(OooO0OO oooO0OO) {
        boolean z;
        oooO0OO.getClass();
        synchronized (this.f13618OooO0OO) {
            z = !this.f13622OooO0oO.equals(oooO0OO);
            this.f13622OooO0oO = oooO0OO;
        }
        if (z) {
            if (oooO0OO.f13673o00Oo0 && this.f13619OooO0Oo == null) {
                Log.OooO0o("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            o00oOoo.OooO00o oooO00o = this.f40407OooO00o;
            if (oooO00o != null) {
                ((OooOo00) oooO00o).f11273OooOO0O.OooOO0O(10);
            }
        }
    }

    public static final class OooO0OO extends com.google.android.exoplayer2.trackselection.OooO {

        /* JADX INFO: renamed from: o00000, reason: collision with root package name */
        public static final String f13648o00000;

        /* JADX INFO: renamed from: o000000, reason: collision with root package name */
        public static final String f13649o000000;

        /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
        public static final String f13650o000000O;

        /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
        public static final String f13651o000000o;

        /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
        public static final String f13652o00000O;

        /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
        public static final String f13653o00000O0;

        /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
        public static final String f13654o00000OO;

        /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
        public static final String f13655o00000Oo;

        /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
        public static final String f13656o00000o0;

        /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
        public static final String f13657o000OOo;

        /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
        public static final String f13658o0O0O00;

        /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
        public static final String f13659o0OO00O;

        /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
        public static final String f13660o0OOO0o;

        /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
        public static final String f13661o0Oo0oo;

        /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
        public static final String f13662o0ooOO0;

        /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
        public static final String f13663o0ooOOo;

        /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
        public static final String f13664o0ooOoO;

        /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
        public static final String f13665oo0o0Oo;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public final boolean f13666OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public final boolean f13667OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public final boolean f13668Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public final boolean f13669Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public final boolean f13670OoooooO;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public final boolean f13671Ooooooo;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public final boolean f13672o00O0O;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public final boolean f13673o00Oo0;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public final boolean f13674o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public final boolean f13675o00o0O;

        /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
        public final SparseBooleanArray f13676o00oO0O;

        /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
        public final SparseArray<Map<o000O0, OooO0o>> f13677o00oO0o;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public final boolean f13678o00ooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public final boolean f13679o0OoOo0;

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public final boolean f13680oo000o;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public final boolean f13681ooOO;

        static {
            new OooO0OO(new OooO00o());
            f13662o0ooOO0 = o0O00.Oooo00O(1000);
            f13663o0ooOOo = o0O00.Oooo00O(1001);
            f13664o0ooOoO = o0O00.Oooo00O(1002);
            f13660o0OOO0o = o0O00.Oooo00O(1003);
            f13661o0Oo0oo = o0O00.Oooo00O(1004);
            f13659o0OO00O = o0O00.Oooo00O(1005);
            f13665oo0o0Oo = o0O00.Oooo00O(1006);
            f13658o0O0O00 = o0O00.Oooo00O(1007);
            f13657o000OOo = o0O00.Oooo00O(1008);
            f13649o000000 = o0O00.Oooo00O(1009);
            f13650o000000O = o0O00.Oooo00O(1010);
            f13651o000000o = o0O00.Oooo00O(1011);
            f13648o00000 = o0O00.Oooo00O(1012);
            f13653o00000O0 = o0O00.Oooo00O(1013);
            f13652o00000O = o0O00.Oooo00O(1014);
            f13654o00000OO = o0O00.Oooo00O(1015);
            f13655o00000Oo = o0O00.Oooo00O(1016);
            f13656o00000o0 = o0O00.Oooo00O(1017);
        }

        public OooO0OO(OooO00o oooO00o) {
            super(oooO00o);
            this.f13666OooooOO = oooO00o.f13682OooOoOO;
            this.f13667OooooOo = oooO00o.f13684OooOoo0;
            this.f13669Oooooo0 = oooO00o.f13683OooOoo;
            this.f13668Oooooo = oooO00o.f13685OooOooO;
            this.f13670OoooooO = oooO00o.f13686OooOooo;
            this.f13671Ooooooo = oooO00o.f13689Oooo000;
            this.f13679o0OoOo0 = oooO00o.f13690Oooo00O;
            this.f13681ooOO = oooO00o.f13691Oooo00o;
            this.f13672o00O0O = oooO00o.f13688Oooo0;
            this.f13673o00Oo0 = oooO00o.f13692Oooo0O0;
            this.f13674o00Ooo = oooO00o.f13693Oooo0OO;
            this.f13675o00o0O = oooO00o.f13695Oooo0o0;
            this.f13678o00ooo = oooO00o.f13694Oooo0o;
            this.f13680oo000o = oooO00o.f13696Oooo0oO;
            this.f13677o00oO0o = oooO00o.f13697Oooo0oo;
            this.f13676o00oO0O = oooO00o.f13687Oooo;
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO
        public final com.google.android.exoplayer2.trackselection.OooO.OooO00o OooO00o() {
            return new OooO00o(this);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO
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
            if (super.equals(oooO0OO) && this.f13666OooooOO == oooO0OO.f13666OooooOO && this.f13667OooooOo == oooO0OO.f13667OooooOo && this.f13669Oooooo0 == oooO0OO.f13669Oooooo0 && this.f13668Oooooo == oooO0OO.f13668Oooooo && this.f13670OoooooO == oooO0OO.f13670OoooooO && this.f13671Ooooooo == oooO0OO.f13671Ooooooo && this.f13679o0OoOo0 == oooO0OO.f13679o0OoOo0 && this.f13681ooOO == oooO0OO.f13681ooOO && this.f13672o00O0O == oooO0OO.f13672o00O0O && this.f13673o00Oo0 == oooO0OO.f13673o00Oo0 && this.f13674o00Ooo == oooO0OO.f13674o00Ooo && this.f13675o00o0O == oooO0OO.f13675o00o0O && this.f13678o00ooo == oooO0OO.f13678o00ooo && this.f13680oo000o == oooO0OO.f13680oo000o) {
                SparseBooleanArray sparseBooleanArray = this.f13676o00oO0O;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = oooO0OO.f13676o00oO0O;
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
                    SparseArray<Map<o000O0, OooO0o>> sparseArray = this.f13677o00oO0o;
                    int size2 = sparseArray.size();
                    SparseArray<Map<o000O0, OooO0o>> sparseArray2 = oooO0OO.f13677o00oO0o;
                    if (sparseArray2.size() == size2) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map<o000O0, OooO0o> mapValueAt = sparseArray.valueAt(i2);
                                    Map<o000O0, OooO0o> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() == mapValueAt.size()) {
                                        Iterator<Map.Entry<o000O0, OooO0o>> it = mapValueAt.entrySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z3 = true;
                                                break;
                                            }
                                            Map.Entry<o000O0, OooO0o> next = it.next();
                                            o000O0 key = next.getKey();
                                            if (!mapValueAt2.containsKey(key) || !o0O00.OooO00o(next.getValue(), mapValueAt2.get(key))) {
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

        @Override // com.google.android.exoplayer2.trackselection.OooO
        public final int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f13666OooooOO ? 1 : 0)) * 31) + (this.f13667OooooOo ? 1 : 0)) * 31) + (this.f13669Oooooo0 ? 1 : 0)) * 31) + (this.f13668Oooooo ? 1 : 0)) * 31) + (this.f13670OoooooO ? 1 : 0)) * 31) + (this.f13671Ooooooo ? 1 : 0)) * 31) + (this.f13679o0OoOo0 ? 1 : 0)) * 31) + (this.f13681ooOO ? 1 : 0)) * 31) + (this.f13672o00O0O ? 1 : 0)) * 31) + (this.f13673o00Oo0 ? 1 : 0)) * 31) + (this.f13674o00Ooo ? 1 : 0)) * 31) + (this.f13675o00o0O ? 1 : 0)) * 31) + (this.f13678o00ooo ? 1 : 0)) * 31) + (this.f13680oo000o ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO, com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f13662o0ooOO0, this.f13666OooooOO);
            bundle.putBoolean(f13663o0ooOOo, this.f13667OooooOo);
            bundle.putBoolean(f13664o0ooOoO, this.f13669Oooooo0);
            bundle.putBoolean(f13652o00000O, this.f13668Oooooo);
            bundle.putBoolean(f13660o0OOO0o, this.f13670OoooooO);
            bundle.putBoolean(f13661o0Oo0oo, this.f13671Ooooooo);
            bundle.putBoolean(f13659o0OO00O, this.f13679o0OoOo0);
            bundle.putBoolean(f13665oo0o0Oo, this.f13681ooOO);
            bundle.putBoolean(f13654o00000OO, this.f13672o00O0O);
            bundle.putBoolean(f13655o00000Oo, this.f13673o00Oo0);
            bundle.putBoolean(f13658o0O0O00, this.f13674o00Ooo);
            bundle.putBoolean(f13657o000OOo, this.f13675o00o0O);
            bundle.putBoolean(f13649o000000, this.f13678o00ooo);
            bundle.putBoolean(f13656o00000o0, this.f13680oo000o);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            int i = 0;
            while (true) {
                SparseArray<Map<o000O0, OooO0o>> sparseArray2 = this.f13677o00oO0o;
                if (i >= sparseArray2.size()) {
                    break;
                }
                int iKeyAt = sparseArray2.keyAt(i);
                for (Map.Entry<o000O0, OooO0o> entry : sparseArray2.valueAt(i).entrySet()) {
                    OooO0o value = entry.getValue();
                    if (value != null) {
                        sparseArray.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f13650o000000O, com.google.common.primitives.OooO0o.OooO0Oo(arrayList));
                bundle.putParcelableArrayList(f13651o000000o, oOO00O.OooO0O0(arrayList2));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    sparseArray3.put(sparseArray.keyAt(i2), ((com.google.android.exoplayer2.OooO) sparseArray.valueAt(i2)).toBundle());
                }
                bundle.putSparseParcelableArray(f13648o00000, sparseArray3);
                i++;
            }
            SparseBooleanArray sparseBooleanArray = this.f13676o00oO0O;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
                iArr[i3] = sparseBooleanArray.keyAt(i3);
            }
            bundle.putIntArray(f13653o00000O0, iArr);
            return bundle;
        }

        public static final class OooO00o extends com.google.android.exoplayer2.trackselection.OooO.OooO00o {

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public boolean f13682OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public boolean f13683OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public boolean f13684OooOoo0;

            /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
            public boolean f13685OooOooO;

            /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
            public boolean f13686OooOooo;

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final SparseBooleanArray f13687Oooo;

            /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
            public boolean f13688Oooo0;

            /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
            public boolean f13689Oooo000;

            /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
            public boolean f13690Oooo00O;

            /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
            public boolean f13691Oooo00o;

            /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
            public boolean f13692Oooo0O0;

            /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
            public boolean f13693Oooo0OO;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public boolean f13694Oooo0o;

            /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
            public boolean f13695Oooo0o0;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public boolean f13696Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final SparseArray<Map<o000O0, OooO0o>> f13697Oooo0oo;

            public OooO00o(Context context) {
                OooO(context);
                OooOO0(context);
                this.f13697Oooo0oo = new SparseArray<>();
                this.f13687Oooo = new SparseBooleanArray();
                OooO0oo();
            }

            @CanIgnoreReturnValue
            public final void OooO(Context context) {
                CaptioningManager captioningManager;
                int i = o0O00.f40595OooO00o;
                if (i >= 19) {
                    if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                        this.f13593OooOo00 = 1088;
                        Locale locale = captioningManager.getLocale();
                        if (locale != null) {
                            this.f13590OooOOoo = ImmutableList.OooOOOo(i >= 21 ? locale.toLanguageTag() : locale.toString());
                        }
                    }
                }
            }

            @Override // com.google.android.exoplayer2.trackselection.OooO.OooO00o
            public final com.google.android.exoplayer2.trackselection.OooO OooO00o() {
                return new OooO0OO(this);
            }

            @Override // com.google.android.exoplayer2.trackselection.OooO.OooO00o
            @CanIgnoreReturnValue
            public final com.google.android.exoplayer2.trackselection.OooO.OooO00o OooO0O0(int i) {
                super.OooO0O0(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.OooO.OooO00o
            @CanIgnoreReturnValue
            public final com.google.android.exoplayer2.trackselection.OooO.OooO00o OooO0Oo() {
                this.f13592OooOo0 = -3;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.OooO.OooO00o
            @CanIgnoreReturnValue
            public final com.google.android.exoplayer2.trackselection.OooO.OooO00o OooO0o(int i) {
                super.OooO0o(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.OooO.OooO00o
            @CanIgnoreReturnValue
            public final com.google.android.exoplayer2.trackselection.OooO.OooO00o OooO0o0(o0O0ooO o0o0ooo) {
                super.OooO0o0(o0o0ooo);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.OooO.OooO00o
            @CanIgnoreReturnValue
            public final com.google.android.exoplayer2.trackselection.OooO.OooO00o OooO0oO(int i, int i2) {
                super.OooO0oO(i, i2);
                return this;
            }

            public final void OooO0oo() {
                this.f13682OooOoOO = true;
                this.f13684OooOoo0 = false;
                this.f13683OooOoo = true;
                this.f13685OooOooO = false;
                this.f13686OooOooo = true;
                this.f13689Oooo000 = false;
                this.f13690Oooo00O = false;
                this.f13691Oooo00o = false;
                this.f13688Oooo0 = false;
                this.f13692Oooo0O0 = true;
                this.f13693Oooo0OO = true;
                this.f13695Oooo0o0 = false;
                this.f13694Oooo0o = true;
                this.f13696Oooo0oO = false;
            }

            /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
            /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
            @CanIgnoreReturnValue
            public final void OooOO0(Context context) {
                Point point;
                DisplayManager displayManager;
                int i = o0O00.f40595OooO00o;
                Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && o0O00.Oooo0(context)) {
                    String strOooOoO = i < 28 ? o0O00.OooOoO("sys.display-size") : o0O00.OooOoO("vendor.display-size");
                    if (!TextUtils.isEmpty(strOooOoO)) {
                        try {
                            String[] strArrSplit = strOooOoO.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i2 = Integer.parseInt(strArrSplit[0]);
                                int i3 = Integer.parseInt(strArrSplit[1]);
                                if (i2 > 0 && i3 > 0) {
                                    point = new Point(i2, i3);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        Log.OooO0OO("Util", "Invalid display size: " + strOooOoO);
                        if (!"Sony".equals(o0O00.f40597OooO0OO) && o0O00.f40598OooO0Oo.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
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
                    } else if (!"Sony".equals(o0O00.f40597OooO0OO)) {
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
                OooO0oO(point.x, point.y);
            }

            @Deprecated
            public OooO00o() {
                this.f13697Oooo0oo = new SparseArray<>();
                this.f13687Oooo = new SparseBooleanArray();
                OooO0oo();
            }

            public OooO00o(OooO0OO oooO0OO) {
                super(oooO0OO);
                this.f13682OooOoOO = oooO0OO.f13666OooooOO;
                this.f13684OooOoo0 = oooO0OO.f13667OooooOo;
                this.f13683OooOoo = oooO0OO.f13669Oooooo0;
                this.f13685OooOooO = oooO0OO.f13668Oooooo;
                this.f13686OooOooo = oooO0OO.f13670OoooooO;
                this.f13689Oooo000 = oooO0OO.f13671Ooooooo;
                this.f13690Oooo00O = oooO0OO.f13679o0OoOo0;
                this.f13691Oooo00o = oooO0OO.f13681ooOO;
                this.f13688Oooo0 = oooO0OO.f13672o00O0O;
                this.f13692Oooo0O0 = oooO0OO.f13673o00Oo0;
                this.f13693Oooo0OO = oooO0OO.f13674o00Ooo;
                this.f13695Oooo0o0 = oooO0OO.f13675o00o0O;
                this.f13694Oooo0o = oooO0OO.f13678o00ooo;
                this.f13696Oooo0oO = oooO0OO.f13680oo000o;
                SparseArray<Map<o000O0, OooO0o>> sparseArray = new SparseArray<>();
                int i = 0;
                while (true) {
                    SparseArray<Map<o000O0, OooO0o>> sparseArray2 = oooO0OO.f13677o00oO0o;
                    if (i < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i), new HashMap(sparseArray2.valueAt(i)));
                        i++;
                    } else {
                        this.f13697Oooo0oo = sparseArray;
                        this.f13687Oooo = oooO0OO.f13676o00oO0O.clone();
                        return;
                    }
                }
            }
        }
    }
}
