package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import p069o0000ooO.o000000O;
import p080o000OoO.o00;
import p080o000OoO.oo000o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo0 implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f6629OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f6631OooO0o0 = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f6630OooO0o = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f6632OooO0oO = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.compiler.plugins.kotlin.OooO0O0 f6633OooO0oo = new androidx.compose.compiler.plugins.kotlin.OooO0O0();

    public class OooO00o extends Oooo0 {
        @Override // androidx.media3.common.Oooo0
        public final int OooO0o0(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.Oooo0
        public final OooO0O0 OooOO0(int i, OooO0O0 oooO0O0, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOO0o() {
            return 0;
        }

        @Override // androidx.media3.common.Oooo0
        public final Object OooOOOo(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Oooo0
        public final OooO0o OooOOo(int i, OooO0o oooO0o, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOOoo() {
            return 0;
        }
    }

    public static final class OooO0O0 implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f6640OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Object f6641OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f6642OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Object f6643OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @UnstableApi
        public long f6644OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @UnstableApi
        public long f6645OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public AdPlaybackState f6646OooOO0 = AdPlaybackState.f6176OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f6634OooOO0O = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6635OooOO0o = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6637OooOOO0 = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6636OooOOO = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f6638OooOOOO = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.compiler.plugins.kotlin.OooO0OO f6639OooOOOo = new androidx.compose.compiler.plugins.kotlin.OooO0OO();

        public final int OooO(int i) {
            return this.f6646OooOO0.OooO0OO(i).OooO0OO(-1);
        }

        public final long OooO0Oo(int i, int i2) {
            AdPlaybackState.OooO00o oooO00oOooO0OO = this.f6646OooOO0.OooO0OO(i);
            if (oooO00oOooO0OO.f6201OooO0o0 != -1) {
                return oooO00oOooO0OO.f6198OooO[i2];
            }
            return -9223372036854775807L;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x003e  */
        /* JADX WARN: Multi-variable type inference failed */
        public final int OooO0o(long j) {
            Object[] objArr;
            AdPlaybackState adPlaybackState = this.f6646OooOO0;
            long j2 = this.f6644OooO0oO;
            boolean z = true;
            int i = adPlaybackState.f6186OooO0o0 - 1;
            int i2 = i - (adPlaybackState.OooO0Oo(i) ? 1 : 0);
            while (i2 >= 0) {
                if (j == Long.MIN_VALUE) {
                    objArr = false;
                } else {
                    AdPlaybackState.OooO00o oooO00oOooO0OO = adPlaybackState.OooO0OO(i2);
                    long j3 = oooO00oOooO0OO.f6199OooO0Oo;
                    if (j3 != Long.MIN_VALUE ? j >= j3 : j2 != -9223372036854775807L && (!(oooO00oOooO0OO.f6205OooOO0O && oooO00oOooO0OO.f6201OooO0o0 == -1) && j >= j2)) {
                        objArr = false;
                    } else {
                        objArr = true;
                    }
                }
                if (objArr != true) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                AdPlaybackState.OooO00o oooO00oOooO0OO2 = adPlaybackState.OooO0OO(i2);
                int i3 = oooO00oOooO0OO2.f6201OooO0o0;
                if (i3 != -1) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z = false;
                            break;
                        }
                        int i5 = oooO00oOooO0OO2.f6203OooO0oo[i4];
                        if (i5 == 0 || i5 == 1) {
                            break;
                        }
                        i4++;
                    }
                }
                if (z) {
                    return i2;
                }
            }
            return -1;
        }

        public final int OooO0o0(long j) {
            int i;
            AdPlaybackState adPlaybackState = this.f6646OooOO0;
            long j2 = this.f6644OooO0oO;
            adPlaybackState.getClass();
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            int i2 = adPlaybackState.f6188OooO0oo;
            while (true) {
                i = adPlaybackState.f6186OooO0o0;
                if (i2 >= i) {
                    break;
                }
                if (adPlaybackState.OooO0OO(i2).f6199OooO0Oo == Long.MIN_VALUE || adPlaybackState.OooO0OO(i2).f6199OooO0Oo > j) {
                    AdPlaybackState.OooO00o oooO00oOooO0OO = adPlaybackState.OooO0OO(i2);
                    int i3 = oooO00oOooO0OO.f6201OooO0o0;
                    if (i3 == -1 || oooO00oOooO0OO.OooO0OO(-1) < i3) {
                        break;
                    }
                }
                i2++;
            }
            if (i2 < i) {
                return i2;
            }
            return -1;
        }

        public final long OooO0oO(int i) {
            return this.f6646OooOO0.OooO0OO(i).f6199OooO0Oo;
        }

        @UnstableApi
        public final int OooO0oo(int i, int i2) {
            AdPlaybackState.OooO00o oooO00oOooO0OO = this.f6646OooOO0.OooO0OO(i);
            if (oooO00oOooO0OO.f6201OooO0o0 != -1) {
                return oooO00oOooO0OO.f6203OooO0oo[i2];
            }
            return 0;
        }

        public final long OooOO0() {
            return this.f6645OooO0oo;
        }

        @UnstableApi
        public final boolean OooOO0O(int i) {
            AdPlaybackState adPlaybackState = this.f6646OooOO0;
            return i == adPlaybackState.f6186OooO0o0 - 1 && adPlaybackState.OooO0Oo(i);
        }

        @UnstableApi
        public final boolean OooOO0o(int i) {
            return this.f6646OooOO0.OooO0OO(i).f6205OooOO0O;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public final void OooOOO0(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z) {
            this.f6641OooO0Oo = obj;
            this.f6643OooO0o0 = obj2;
            this.f6642OooO0o = i;
            this.f6644OooO0oO = j;
            this.f6645OooO0oo = j2;
            this.f6646OooOO0 = adPlaybackState;
            this.f6640OooO = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooO0O0.class.equals(obj.getClass())) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return o00.OooO00o(this.f6641OooO0Oo, oooO0O0.f6641OooO0Oo) && o00.OooO00o(this.f6643OooO0o0, oooO0O0.f6643OooO0o0) && this.f6642OooO0o == oooO0O0.f6642OooO0o && this.f6644OooO0oO == oooO0O0.f6644OooO0oO && this.f6645OooO0oo == oooO0O0.f6645OooO0oo && this.f6640OooO == oooO0O0.f6640OooO && o00.OooO00o(this.f6646OooOO0, oooO0O0.f6646OooOO0);
        }

        public final int hashCode() {
            Object obj = this.f6641OooO0Oo;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f6643OooO0o0;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f6642OooO0o) * 31;
            long j = this.f6644OooO0oO;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f6645OooO0oo;
            return this.f6646OooOO0.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f6640OooO ? 1 : 0)) * 31);
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.f6642OooO0o;
            if (i != 0) {
                bundle.putInt(f6634OooOO0O, i);
            }
            long j = this.f6644OooO0oO;
            if (j != -9223372036854775807L) {
                bundle.putLong(f6635OooOO0o, j);
            }
            long j2 = this.f6645OooO0oo;
            if (j2 != 0) {
                bundle.putLong(f6637OooOOO0, j2);
            }
            boolean z = this.f6640OooO;
            if (z) {
                bundle.putBoolean(f6636OooOOO, z);
            }
            if (!this.f6646OooOO0.equals(AdPlaybackState.f6176OooOO0)) {
                bundle.putBundle(f6638OooOOOO, this.f6646OooOO0.toBundle());
            }
            return bundle;
        }
    }

    @UnstableApi
    public static final class OooO0OO extends Oooo0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final ImmutableList<OooO0o> f6647OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final ImmutableList<OooO0O0> f6648OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int[] f6649OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int[] f6650OooOO0o;

        public OooO0OO(o0O00 o0o01, o0O00 o0o02, int[] iArr) {
            p080o000OoO.o00Oo0.OooO00o(o0o01.f19062OooO0oO == iArr.length);
            this.f6647OooO = o0o01;
            this.f6648OooOO0 = o0o02;
            this.f6649OooOO0O = iArr;
            this.f6650OooOO0o = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f6650OooOO0o[iArr[i]] = i;
            }
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooO0Oo(boolean z) {
            if (OooOo00()) {
                return -1;
            }
            if (z) {
                return this.f6649OooOO0O[0];
            }
            return 0;
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooO0o(boolean z) {
            if (OooOo00()) {
                return -1;
            }
            if (!z) {
                return OooOOoo() - 1;
            }
            return this.f6649OooOO0O[OooOOoo() - 1];
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooO0o0(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooO0oo(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == OooO0o(z)) {
                if (i2 == 2) {
                    return OooO0Oo(z);
                }
                return -1;
            }
            if (!z) {
                return i + 1;
            }
            return this.f6649OooOO0O[this.f6650OooOO0o[i] + 1];
        }

        @Override // androidx.media3.common.Oooo0
        public final OooO0O0 OooOO0(int i, OooO0O0 oooO0O0, boolean z) {
            OooO0O0 oooO0O1 = this.f6648OooOO0.get(i);
            oooO0O0.OooOOO0(oooO0O1.f6641OooO0Oo, oooO0O1.f6643OooO0o0, oooO0O1.f6642OooO0o, oooO0O1.f6644OooO0oO, oooO0O1.f6645OooO0oo, oooO0O1.f6646OooOO0, oooO0O1.f6640OooO);
            return oooO0O0;
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOO0o() {
            return this.f6648OooOO0.size();
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOOOO(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == OooO0Oo(z)) {
                if (i2 == 2) {
                    return OooO0o(z);
                }
                return -1;
            }
            if (!z) {
                return i - 1;
            }
            return this.f6649OooOO0O[this.f6650OooOO0o[i] - 1];
        }

        @Override // androidx.media3.common.Oooo0
        public final Object OooOOOo(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Oooo0
        public final OooO0o OooOOo(int i, OooO0o oooO0o, long j) {
            OooO0o oooO0o2 = this.f6647OooO.get(i);
            oooO0o.OooO0o0(oooO0o2.f6669OooO0Oo, oooO0o2.f6670OooO0o, oooO0o2.f6672OooO0oO, oooO0o2.f6673OooO0oo, oooO0o2.f6668OooO, oooO0o2.f6674OooOO0, oooO0o2.f6675OooOO0O, oooO0o2.f6676OooOO0o, oooO0o2.f6677OooOOO, oooO0o2.f6680OooOOOo, oooO0o2.f6682OooOOo0, oooO0o2.f6681OooOOo, oooO0o2.f6683OooOOoo, oooO0o2.f6684OooOo00);
            oooO0o.f6679OooOOOO = oooO0o2.f6679OooOOOO;
            return oooO0o;
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOOoo() {
            return this.f6647OooO.size();
        }
    }

    public static final class OooO0o implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final String f6651OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public static final Object f6652OooOo0 = new Object();

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public static final Object f6653OooOo0O = new Object();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooOOO0 f6654OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final String f6655OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final String f6656OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final String f6657OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final String f6658OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final String f6659OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final String f6660OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final String f6661OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public static final String f6662Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final String f6663Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public static final String f6664Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public static final String f6665Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public static final String f6666Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.compiler.plugins.kotlin.inference.OooO00o f6667Oooo0OO;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public long f6668OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f6669OooO0Oo = f6652OooOo0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooOOO0 f6670OooO0o = f6654OooOo0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        @UnstableApi
        @Deprecated
        public Object f6671OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public Object f6672OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f6673OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f6674OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f6675OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f6676OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public OooOOO0.OooOO0 f6677OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @UnstableApi
        @Deprecated
        public boolean f6678OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f6679OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @UnstableApi
        public long f6680OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f6681OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @UnstableApi
        public long f6682OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f6683OooOOoo;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @UnstableApi
        public long f6684OooOo00;

        static {
            OooOOO0.OooO0O0 oooO0O0 = new OooOOO0.OooO0O0();
            oooO0O0.f6519OooO00o = "androidx.media3.common.Timeline";
            oooO0O0.f6520OooO0O0 = Uri.EMPTY;
            f6654OooOo0o = oooO0O0.OooO00o();
            f6651OooOo = o00.Oooo00o(1);
            f6656OooOoO0 = o00.Oooo00o(2);
            f6655OooOoO = o00.Oooo00o(3);
            f6657OooOoOO = o00.Oooo00o(4);
            f6659OooOoo0 = o00.Oooo00o(5);
            f6658OooOoo = o00.Oooo00o(6);
            f6660OooOooO = o00.Oooo00o(7);
            f6661OooOooo = o00.Oooo00o(8);
            f6663Oooo000 = o00.Oooo00o(9);
            f6664Oooo00O = o00.Oooo00o(10);
            f6665Oooo00o = o00.Oooo00o(11);
            f6662Oooo0 = o00.Oooo00o(12);
            f6666Oooo0O0 = o00.Oooo00o(13);
            f6667Oooo0OO = new androidx.compose.compiler.plugins.kotlin.inference.OooO00o();
        }

        public final long OooO0OO() {
            return o00.o000oOoO(this.f6682OooOOo0);
        }

        public final boolean OooO0Oo() {
            p080o000OoO.o00Oo0.OooO0Oo(this.f6678OooOOO0 == (this.f6677OooOOO != null));
            return this.f6677OooOOO != null;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public final void OooO0o0(Object obj, @Nullable OooOOO0 oooOOO0, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable OooOOO0.OooOO0 oooOO1, long j4, long j5, int i, int i2, long j6) {
            OooOOO0.OooOO0O oooOO0O;
            this.f6669OooO0Oo = obj;
            this.f6670OooO0o = oooOOO0 != null ? oooOOO0 : f6654OooOo0o;
            this.f6671OooO0o0 = (oooOOO0 == null || (oooOO0O = oooOOO0.f6486OooO0o0) == null) ? null : oooOO0O.f6581OooOO0O;
            this.f6672OooO0oO = obj2;
            this.f6673OooO0oo = j;
            this.f6668OooO = j2;
            this.f6674OooOO0 = j3;
            this.f6675OooOO0O = z;
            this.f6676OooOO0o = z2;
            this.f6678OooOOO0 = oooOO1 != null;
            this.f6677OooOOO = oooOO1;
            this.f6680OooOOOo = j4;
            this.f6682OooOOo0 = j5;
            this.f6681OooOOo = i;
            this.f6683OooOOoo = i2;
            this.f6684OooOo00 = j6;
            this.f6679OooOOOO = false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooO0o.class.equals(obj.getClass())) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return o00.OooO00o(this.f6669OooO0Oo, oooO0o.f6669OooO0Oo) && o00.OooO00o(this.f6670OooO0o, oooO0o.f6670OooO0o) && o00.OooO00o(this.f6672OooO0oO, oooO0o.f6672OooO0oO) && o00.OooO00o(this.f6677OooOOO, oooO0o.f6677OooOOO) && this.f6673OooO0oo == oooO0o.f6673OooO0oo && this.f6668OooO == oooO0o.f6668OooO && this.f6674OooOO0 == oooO0o.f6674OooOO0 && this.f6675OooOO0O == oooO0o.f6675OooOO0O && this.f6676OooOO0o == oooO0o.f6676OooOO0o && this.f6679OooOOOO == oooO0o.f6679OooOOOO && this.f6680OooOOOo == oooO0o.f6680OooOOOo && this.f6682OooOOo0 == oooO0o.f6682OooOOo0 && this.f6681OooOOo == oooO0o.f6681OooOOo && this.f6683OooOOoo == oooO0o.f6683OooOOoo && this.f6684OooOo00 == oooO0o.f6684OooOo00;
        }

        public final int hashCode() {
            int iHashCode = (this.f6670OooO0o.hashCode() + ((this.f6669OooO0Oo.hashCode() + 217) * 31)) * 31;
            Object obj = this.f6672OooO0oO;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            OooOOO0.OooOO0 oooOO1 = this.f6677OooOOO;
            int iHashCode3 = (iHashCode2 + (oooOO1 != null ? oooOO1.hashCode() : 0)) * 31;
            long j = this.f6673OooO0oo;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f6668OooO;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f6674OooOO0;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f6675OooOO0O ? 1 : 0)) * 31) + (this.f6676OooOO0o ? 1 : 0)) * 31) + (this.f6679OooOOOO ? 1 : 0)) * 31;
            long j4 = this.f6680OooOOOo;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f6682OooOOo0;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f6681OooOOo) * 31) + this.f6683OooOOoo) * 31;
            long j6 = this.f6684OooOo00;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!OooOOO0.f6475OooOO0.equals(this.f6670OooO0o)) {
                bundle.putBundle(f6651OooOo, this.f6670OooO0o.toBundle());
            }
            long j = this.f6673OooO0oo;
            if (j != -9223372036854775807L) {
                bundle.putLong(f6656OooOoO0, j);
            }
            long j2 = this.f6668OooO;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f6655OooOoO, j2);
            }
            long j3 = this.f6674OooOO0;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f6657OooOoOO, j3);
            }
            boolean z = this.f6675OooOO0O;
            if (z) {
                bundle.putBoolean(f6659OooOoo0, z);
            }
            boolean z2 = this.f6676OooOO0o;
            if (z2) {
                bundle.putBoolean(f6658OooOoo, z2);
            }
            OooOOO0.OooOO0 oooOO1 = this.f6677OooOOO;
            if (oooOO1 != null) {
                bundle.putBundle(f6660OooOooO, oooOO1.toBundle());
            }
            boolean z3 = this.f6679OooOOOO;
            if (z3) {
                bundle.putBoolean(f6661OooOooo, z3);
            }
            long j4 = this.f6680OooOOOo;
            if (j4 != 0) {
                bundle.putLong(f6663Oooo000, j4);
            }
            long j5 = this.f6682OooOOo0;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(f6664Oooo00O, j5);
            }
            int i = this.f6681OooOOo;
            if (i != 0) {
                bundle.putInt(f6665Oooo00o, i);
            }
            int i2 = this.f6683OooOOoo;
            if (i2 != 0) {
                bundle.putInt(f6662Oooo0, i2);
            }
            long j6 = this.f6684OooOo00;
            if (j6 != 0) {
                bundle.putLong(f6666Oooo0O0, j6);
            }
            return bundle;
        }
    }

    @UnstableApi
    public Oooo0() {
    }

    public static o0O00 OooO0OO(androidx.media3.common.OooO0OO.OooO00o oooO00o, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
            return o0O00.f19060OooO0oo;
        }
        ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
        o0O00 o0o00OooO00o = o000000O.OooO00o(iBinder);
        for (int i = 0; i < o0o00OooO00o.f19062OooO0oO; i++) {
            oooO00o2.OooO0OO(oooO00o.OooO0OO((Bundle) o0o00OooO00o.get(i)));
        }
        return oooO00o2.OooO0oo();
    }

    public final OooO0O0 OooO(int i, OooO0O0 oooO0O0) {
        return OooOO0(i, oooO0O0, false);
    }

    public int OooO0Oo(boolean z) {
        return OooOo00() ? -1 : 0;
    }

    public int OooO0o(boolean z) {
        if (OooOo00()) {
            return -1;
        }
        return OooOOoo() - 1;
    }

    public abstract int OooO0o0(Object obj);

    public final int OooO0oO(int i, OooO0O0 oooO0O0, OooO0o oooO0o, int i2, boolean z) {
        int i3 = OooOO0(i, oooO0O0, false).f6642OooO0o;
        if (OooOOo0(i3, oooO0o).f6683OooOOoo != i) {
            return i + 1;
        }
        int iOooO0oo = OooO0oo(i3, i2, z);
        if (iOooO0oo == -1) {
            return -1;
        }
        return OooOOo0(iOooO0oo, oooO0o).f6681OooOOo;
    }

    public int OooO0oo(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == OooO0o(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == OooO0o(z) ? OooO0Oo(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public abstract OooO0O0 OooOO0(int i, OooO0O0 oooO0O0, boolean z);

    public OooO0O0 OooOO0O(Object obj, OooO0O0 oooO0O0) {
        return OooOO0(OooO0o0(obj), oooO0O0, true);
    }

    public abstract int OooOO0o();

    @Nullable
    public final Pair<Object, Long> OooOOO(OooO0o oooO0o, OooO0O0 oooO0O0, int i, long j, long j2) {
        p080o000OoO.o00Oo0.OooO0OO(i, OooOOoo());
        OooOOo(i, oooO0o, j2);
        if (j == -9223372036854775807L) {
            j = oooO0o.f6680OooOOOo;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = oooO0o.f6681OooOOo;
        OooO(i2, oooO0O0);
        while (i2 < oooO0o.f6683OooOOoo && oooO0O0.f6645OooO0oo != j) {
            int i3 = i2 + 1;
            if (OooOO0(i3, oooO0O0, false).f6645OooO0oo > j) {
                break;
            }
            i2 = i3;
        }
        OooOO0(i2, oooO0O0, true);
        long jMin = j - oooO0O0.f6645OooO0oo;
        long j3 = oooO0O0.f6644OooO0oO;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = oooO0O0.f6643OooO0o0;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final Pair<Object, Long> OooOOO0(OooO0o oooO0o, OooO0O0 oooO0O0, int i, long j) {
        Pair<Object, Long> pairOooOOO = OooOOO(oooO0o, oooO0O0, i, j, 0L);
        pairOooOOO.getClass();
        return pairOooOOO;
    }

    public int OooOOOO(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == OooO0Oo(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == OooO0Oo(z) ? OooO0o(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object OooOOOo(int i);

    public abstract OooO0o OooOOo(int i, OooO0o oooO0o, long j);

    public final OooO0o OooOOo0(int i, OooO0o oooO0o) {
        return OooOOo(i, oooO0o, 0L);
    }

    public abstract int OooOOoo();

    public final boolean OooOo00() {
        return OooOOoo() == 0;
    }

    public boolean equals(@Nullable Object obj) {
        int iOooO0o;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        if (oooo0.OooOOoo() != OooOOoo() || oooo0.OooOO0o() != OooOO0o()) {
            return false;
        }
        OooO0o oooO0o = new OooO0o();
        OooO0O0 oooO0O0 = new OooO0O0();
        OooO0o oooO0o2 = new OooO0o();
        OooO0O0 oooO0O1 = new OooO0O0();
        for (int i = 0; i < OooOOoo(); i++) {
            if (!OooOOo0(i, oooO0o).equals(oooo0.OooOOo0(i, oooO0o2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < OooOO0o(); i2++) {
            if (!OooOO0(i2, oooO0O0, true).equals(oooo0.OooOO0(i2, oooO0O1, true))) {
                return false;
            }
        }
        int iOooO0Oo = OooO0Oo(true);
        if (iOooO0Oo != oooo0.OooO0Oo(true) || (iOooO0o = OooO0o(true)) != oooo0.OooO0o(true)) {
            return false;
        }
        while (iOooO0Oo != iOooO0o) {
            int iOooO0oo = OooO0oo(iOooO0Oo, 0, true);
            if (iOooO0oo != oooo0.OooO0oo(iOooO0Oo, 0, true)) {
                return false;
            }
            iOooO0Oo = iOooO0oo;
        }
        return true;
    }

    public int hashCode() {
        OooO0o oooO0o = new OooO0o();
        OooO0O0 oooO0O0 = new OooO0O0();
        int iOooOOoo = OooOOoo() + 217;
        for (int i = 0; i < OooOOoo(); i++) {
            iOooOOoo = (iOooOOoo * 31) + OooOOo0(i, oooO0o).hashCode();
        }
        int iOooOO0o = OooOO0o() + (iOooOOoo * 31);
        for (int i2 = 0; i2 < OooOO0o(); i2++) {
            iOooOO0o = (iOooOO0o * 31) + OooOO0(i2, oooO0O0, true).hashCode();
        }
        int iOooO0Oo = OooO0Oo(true);
        while (iOooO0Oo != -1) {
            iOooOO0o = (iOooOO0o * 31) + iOooO0Oo;
            iOooO0Oo = OooO0oo(iOooO0Oo, 0, true);
        }
        return iOooOO0o;
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iOooOOoo = OooOOoo();
        OooO0o oooO0o = new OooO0o();
        for (int i = 0; i < iOooOOoo; i++) {
            arrayList.add(OooOOo(i, oooO0o, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iOooOO0o = OooOO0o();
        OooO0O0 oooO0O0 = new OooO0O0();
        for (int i2 = 0; i2 < iOooOO0o; i2++) {
            arrayList2.add(OooOO0(i2, oooO0O0, false).toBundle());
        }
        int[] iArr = new int[iOooOOoo];
        if (iOooOOoo > 0) {
            iArr[0] = OooO0Oo(true);
        }
        for (int i3 = 1; i3 < iOooOOoo; i3++) {
            iArr[i3] = OooO0oo(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        oo000o.OooO0O0(bundle, f6631OooO0o0, new o000000O(arrayList));
        oo000o.OooO0O0(bundle, f6630OooO0o, new o000000O(arrayList2));
        bundle.putIntArray(f6632OooO0oO, iArr);
        return bundle;
    }
}
