package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import p203o00o0o0o.o0O00oO0;
import p226o00oOo00.o000O00O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O0O00 implements OooO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f12830OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0O0O00 f12831OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableList<OooO00o> f12832OooO0Oo;

    public static final class OooO00o implements OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f12833OooO = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f12834OooOO0 = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f12835OooOO0O = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f12836OooOO0o = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f12837OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f12838OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000O00O f12839OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int[] f12840OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean[] f12841OooO0oo;

        static {
            new o0O00oO0();
        }

        public OooO00o(o000O00O o000o00o2, boolean z, int[] iArr, boolean[] zArr) {
            int i = o000o00o2.f39873OooO0Oo;
            this.f12837OooO0Oo = i;
            boolean z2 = false;
            o00O000o.OooO00o(i == iArr.length && i == zArr.length);
            this.f12839OooO0o0 = o000o00o2;
            if (z && i > 1) {
                z2 = true;
            }
            this.f12838OooO0o = z2;
            this.f12840OooO0oO = (int[]) iArr.clone();
            this.f12841OooO0oo = (boolean[]) zArr.clone();
        }

        public final int OooO00o() {
            return this.f12839OooO0o0.f39874OooO0o;
        }

        public final boolean OooO0O0() {
            for (boolean z : this.f12841OooO0oo) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public final boolean OooO0OO() {
            for (int i = 0; i < this.f12840OooO0oO.length; i++) {
                if (OooO0Oo(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean OooO0Oo(int i) {
            return this.f12840OooO0oO[i] == 4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f12838OooO0o == oooO00o.f12838OooO0o && this.f12839OooO0o0.equals(oooO00o.f12839OooO0o0) && Arrays.equals(this.f12840OooO0oO, oooO00o.f12840OooO0oO) && Arrays.equals(this.f12841OooO0oo, oooO00o.f12841OooO0oo);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f12841OooO0oo) + ((Arrays.hashCode(this.f12840OooO0oO) + (((this.f12839OooO0o0.hashCode() * 31) + (this.f12838OooO0o ? 1 : 0)) * 31)) * 31);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f12833OooO, this.f12839OooO0o0.toBundle());
            bundle.putIntArray(f12834OooOO0, this.f12840OooO0oO);
            bundle.putBooleanArray(f12835OooOO0O, this.f12841OooO0oo);
            bundle.putBoolean(f12836OooOO0o, this.f12838OooO0o);
            return bundle;
        }
    }

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        f12831OooO0o0 = new o0O0O00(com.google.common.collect.o0O00.f19536OooO0oo);
        f12830OooO0o = o0O00.Oooo00O(0);
    }

    public o0O0O00(ImmutableList immutableList) {
        this.f12832OooO0Oo = ImmutableList.OooOO0O(immutableList);
    }

    public final ImmutableList<OooO00o> OooO00o() {
        return this.f12832OooO0Oo;
    }

    public final boolean OooO0O0(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList<OooO00o> immutableList = this.f12832OooO0Oo;
            if (i2 >= immutableList.size()) {
                return false;
            }
            OooO00o oooO00o = immutableList.get(i2);
            if (oooO00o.OooO0O0() && oooO00o.OooO00o() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean OooO0OO() {
        int i = 0;
        while (true) {
            ImmutableList<OooO00o> immutableList = this.f12832OooO0Oo;
            if (i >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i).OooO00o() == 2 && immutableList.get(i).OooO0OO()) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O0O00.class != obj.getClass()) {
            return false;
        }
        return this.f12832OooO0Oo.equals(((o0O0O00) obj).f12832OooO0Oo);
    }

    public final int hashCode() {
        return this.f12832OooO0Oo.hashCode();
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f12830OooO0o, oOO00O.OooO0O0(this.f12832OooO0Oo));
        return bundle;
    }
}
