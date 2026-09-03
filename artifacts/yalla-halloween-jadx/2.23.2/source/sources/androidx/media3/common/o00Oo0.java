package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.Arrays;
import p069o0000ooO.o0000O0;
import p080o000OoO.o00;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f6849OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o00Oo0 f6850OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @UnstableApi
    public static final o0000O0 f6851OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableList<OooO00o> f6852OooO0Oo;

    public static final class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f6853OooO = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f6854OooOO0 = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f6855OooOO0O = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6856OooOO0o = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.compiler.plugins.kotlin.lower.OooO0O0 f6857OooOOO0 = new androidx.compose.compiler.plugins.kotlin.lower.OooO0O0();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f6858OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f6859OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000oOoO f6860OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int[] f6861OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean[] f6862OooO0oo;

        @UnstableApi
        public OooO00o(o000oOoO o000oooo2, boolean z, int[] iArr, boolean[] zArr) {
            int i = o000oooo2.f6765OooO0Oo;
            this.f6858OooO0Oo = i;
            boolean z2 = false;
            p080o000OoO.o00Oo0.OooO00o(i == iArr.length && i == zArr.length);
            this.f6860OooO0o0 = o000oooo2;
            if (z && i > 1) {
                z2 = true;
            }
            this.f6859OooO0o = z2;
            this.f6861OooO0oO = (int[]) iArr.clone();
            this.f6862OooO0oo = (boolean[]) zArr.clone();
        }

        public final int OooO0OO() {
            return this.f6860OooO0o0.f6766OooO0o;
        }

        public final boolean OooO0Oo() {
            for (boolean z : this.f6862OooO0oo) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public final boolean OooO0o(int i) {
            return this.f6861OooO0oO[i] == 4;
        }

        public final boolean OooO0o0() {
            for (int i = 0; i < this.f6861OooO0oO.length; i++) {
                if (OooO0o(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f6859OooO0o == oooO00o.f6859OooO0o && this.f6860OooO0o0.equals(oooO00o.f6860OooO0o0) && Arrays.equals(this.f6861OooO0oO, oooO00o.f6861OooO0oO) && Arrays.equals(this.f6862OooO0oo, oooO00o.f6862OooO0oo);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f6862OooO0oo) + ((Arrays.hashCode(this.f6861OooO0oO) + (((this.f6860OooO0o0.hashCode() * 31) + (this.f6859OooO0o ? 1 : 0)) * 31)) * 31);
        }

        @Override // androidx.media3.common.OooO0OO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f6853OooO, this.f6860OooO0o0.toBundle());
            bundle.putIntArray(f6854OooOO0, this.f6861OooO0oO);
            bundle.putBooleanArray(f6855OooOO0O, this.f6862OooO0oo);
            bundle.putBoolean(f6856OooOO0o, this.f6859OooO0o);
            return bundle;
        }
    }

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        f6850OooO0o0 = new o00Oo0(o0O00.f19060OooO0oo);
        f6849OooO0o = o00.Oooo00o(0);
        f6851OooO0oO = new o0000O0();
    }

    @UnstableApi
    public o00Oo0(o0O00 o0o01) {
        this.f6852OooO0Oo = ImmutableList.OooOO0O(o0o01);
    }

    public final ImmutableList<OooO00o> OooO0OO() {
        return this.f6852OooO0Oo;
    }

    public final boolean OooO0Oo(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList<OooO00o> immutableList = this.f6852OooO0Oo;
            if (i2 >= immutableList.size()) {
                return false;
            }
            OooO00o oooO00o = immutableList.get(i2);
            if (oooO00o.OooO0Oo() && oooO00o.OooO0OO() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean OooO0o0() {
        int i = 0;
        while (true) {
            ImmutableList<OooO00o> immutableList = this.f6852OooO0Oo;
            if (i >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i).OooO0OO() == 2 && immutableList.get(i).OooO0o0()) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00Oo0.class != obj.getClass()) {
            return false;
        }
        return this.f6852OooO0Oo.equals(((o00Oo0) obj).f6852OooO0Oo);
    }

    public final int hashCode() {
        return this.f6852OooO0Oo.hashCode();
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f6849OooO0o, o00oO0o.OooO0O0(this.f6852OooO0Oo));
        return bundle;
    }
}
