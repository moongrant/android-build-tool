package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import p203o00o0o0o.o000;
import p203o00o0o0o.o0O00o00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class oo0o0Oo implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f12895OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f12897OooO0o0 = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f12896OooO0o = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f12898OooO0oO = o0O00.Oooo00O(2);

    public class OooO00o extends oo0o0Oo {
        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooO() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooO0O0(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final OooO0O0 OooO0oO(int i, OooO0O0 oooO0O0, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final Object OooOOO0(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final OooO0OO OooOOOO(int i, OooO0OO oooO0OO, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooOOOo() {
            return 0;
        }
    }

    public static final class OooO0O0 implements OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f12904OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Object f12905OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f12906OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Object f12907OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f12908OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f12909OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public AdPlaybackState f12910OooOO0 = AdPlaybackState.f13125OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f12899OooOO0O = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f12900OooOO0o = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f12902OooOOO0 = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f12901OooOOO = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f12903OooOOOO = o0O00.Oooo00O(4);

        static {
            new o0O00o00();
        }

        public final boolean OooO(int i) {
            return this.f12910OooOO0.OooO00o(i).f13154OooOO0O;
        }

        public final long OooO00o(int i, int i2) {
            AdPlaybackState.OooO00o OooO00o2 = this.f12910OooOO0.OooO00o(i);
            if (OooO00o2.f13150OooO0o0 != -1) {
                return OooO00o2.f13147OooO[i2];
            }
            return -9223372036854775807L;
        }

        public final int OooO0O0(long j) {
            int i;
            AdPlaybackState adPlaybackState = this.f12910OooOO0;
            long j2 = this.f12908OooO0oO;
            adPlaybackState.getClass();
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            int i2 = adPlaybackState.f13137OooO0oo;
            while (true) {
                i = adPlaybackState.f13135OooO0o0;
                if (i2 >= i) {
                    break;
                }
                if (adPlaybackState.OooO00o(i2).f13148OooO0Oo == Long.MIN_VALUE || adPlaybackState.OooO00o(i2).f13148OooO0Oo > j) {
                    AdPlaybackState.OooO00o OooO00o2 = adPlaybackState.OooO00o(i2);
                    int i3 = OooO00o2.f13150OooO0o0;
                    if (i3 == -1 || OooO00o2.OooO00o(-1) < i3) {
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

        /* JADX WARN: Code duplicated, block: B:22:0x003e  */
        /* JADX WARN: Multi-variable type inference failed */
        public final int OooO0OO(long j) {
            Object[] objArr;
            AdPlaybackState adPlaybackState = this.f12910OooOO0;
            long j2 = this.f12908OooO0oO;
            boolean z = true;
            int i = adPlaybackState.f13135OooO0o0 - 1;
            int i2 = i - (adPlaybackState.OooO0O0(i) ? 1 : 0);
            while (i2 >= 0) {
                if (j == Long.MIN_VALUE) {
                    objArr = false;
                } else {
                    AdPlaybackState.OooO00o OooO00o2 = adPlaybackState.OooO00o(i2);
                    long j3 = OooO00o2.f13148OooO0Oo;
                    if (j3 != Long.MIN_VALUE ? j >= j3 : j2 != -9223372036854775807L && (!(OooO00o2.f13154OooOO0O && OooO00o2.f13150OooO0o0 == -1) && j >= j2)) {
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
                AdPlaybackState.OooO00o OooO00o3 = adPlaybackState.OooO00o(i2);
                int i3 = OooO00o3.f13150OooO0o0;
                if (i3 != -1) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z = false;
                            break;
                        }
                        int i5 = OooO00o3.f13152OooO0oo[i4];
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

        public final long OooO0Oo(int i) {
            return this.f12910OooOO0.OooO00o(i).f13148OooO0Oo;
        }

        public final int OooO0o(int i) {
            return this.f12910OooOO0.OooO00o(i).OooO00o(-1);
        }

        public final int OooO0o0(int i, int i2) {
            AdPlaybackState.OooO00o OooO00o2 = this.f12910OooOO0.OooO00o(i);
            if (OooO00o2.f13150OooO0o0 != -1) {
                return OooO00o2.f13152OooO0oo[i2];
            }
            return 0;
        }

        public final long OooO0oO() {
            return this.f12909OooO0oo;
        }

        public final boolean OooO0oo(int i) {
            AdPlaybackState adPlaybackState = this.f12910OooOO0;
            return i == adPlaybackState.f13135OooO0o0 - 1 && adPlaybackState.OooO0O0(i);
        }

        @CanIgnoreReturnValue
        public final void OooOO0(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z) {
            this.f12905OooO0Oo = obj;
            this.f12907OooO0o0 = obj2;
            this.f12906OooO0o = i;
            this.f12908OooO0oO = j;
            this.f12909OooO0oo = j2;
            this.f12910OooOO0 = adPlaybackState;
            this.f12904OooO = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooO0O0.class.equals(obj.getClass())) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return o0O00.OooO00o(this.f12905OooO0Oo, oooO0O0.f12905OooO0Oo) && o0O00.OooO00o(this.f12907OooO0o0, oooO0O0.f12907OooO0o0) && this.f12906OooO0o == oooO0O0.f12906OooO0o && this.f12908OooO0oO == oooO0O0.f12908OooO0oO && this.f12909OooO0oo == oooO0O0.f12909OooO0oo && this.f12904OooO == oooO0O0.f12904OooO && o0O00.OooO00o(this.f12910OooOO0, oooO0O0.f12910OooOO0);
        }

        public final int hashCode() {
            Object obj = this.f12905OooO0Oo;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f12907OooO0o0;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f12906OooO0o) * 31;
            long j = this.f12908OooO0oO;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f12909OooO0oo;
            return this.f12910OooOO0.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f12904OooO ? 1 : 0)) * 31);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.f12906OooO0o;
            if (i != 0) {
                bundle.putInt(f12899OooOO0O, i);
            }
            long j = this.f12908OooO0oO;
            if (j != -9223372036854775807L) {
                bundle.putLong(f12900OooOO0o, j);
            }
            long j2 = this.f12909OooO0oo;
            if (j2 != 0) {
                bundle.putLong(f12902OooOOO0, j2);
            }
            boolean z = this.f12904OooO;
            if (z) {
                bundle.putBoolean(f12901OooOOO, z);
            }
            if (!this.f12910OooOO0.equals(AdPlaybackState.f13125OooOO0)) {
                bundle.putBundle(f12903OooOOOO, this.f12910OooOO0.toBundle());
            }
            return bundle;
        }
    }

    public static final class OooO0OO implements OooO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final String f12911OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public static final Object f12912OooOo0 = new Object();

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public static final Object f12913OooOo0O = new Object();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final o000oOoO f12914OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final String f12915OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final String f12916OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final String f12917OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final String f12918OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final String f12919OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final String f12920OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final String f12921OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public static final String f12922Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final String f12923Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public static final String f12924Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public static final String f12925Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public static final String f12926Oooo0O0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public long f12927OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f12928OooO0Oo = f12912OooOo0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o000oOoO f12929OooO0o = f12914OooOo0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        @Deprecated
        public Object f12930OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public Object f12931OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f12932OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f12933OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f12934OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f12935OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public o000oOoO.OooOO0 f12936OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Deprecated
        public boolean f12937OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f12938OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public long f12939OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f12940OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public long f12941OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f12942OooOOoo;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public long f12943OooOo00;

        static {
            o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
            oooO0O0.f12703OooO00o = "com.google.android.exoplayer2.Timeline";
            oooO0O0.f12704OooO0O0 = Uri.EMPTY;
            f12914OooOo0o = oooO0O0.OooO00o();
            f12911OooOo = o0O00.Oooo00O(1);
            f12916OooOoO0 = o0O00.Oooo00O(2);
            f12915OooOoO = o0O00.Oooo00O(3);
            f12917OooOoOO = o0O00.Oooo00O(4);
            f12919OooOoo0 = o0O00.Oooo00O(5);
            f12918OooOoo = o0O00.Oooo00O(6);
            f12920OooOooO = o0O00.Oooo00O(7);
            f12921OooOooo = o0O00.Oooo00O(8);
            f12923Oooo000 = o0O00.Oooo00O(9);
            f12924Oooo00O = o0O00.Oooo00O(10);
            f12925Oooo00o = o0O00.Oooo00O(11);
            f12922Oooo0 = o0O00.Oooo00O(12);
            f12926Oooo0O0 = o0O00.Oooo00O(13);
            new androidx.compose.ui.graphics.colorspace.OooOOO();
        }

        public final boolean OooO00o() {
            o00O000o.OooO0Oo(this.f12937OooOOO0 == (this.f12936OooOOO != null));
            return this.f12936OooOOO != null;
        }

        @CanIgnoreReturnValue
        public final void OooO0O0(Object obj, @Nullable o000oOoO o000oooo2, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable o000oOoO.OooOO0 oooOO1, long j4, long j5, int i, int i2, long j6) {
            o000oOoO.OooOO0O oooOO0O;
            this.f12928OooO0Oo = obj;
            this.f12929OooO0o = o000oooo2 != null ? o000oooo2 : f12914OooOo0o;
            this.f12930OooO0o0 = (o000oooo2 == null || (oooOO0O = o000oooo2.f12670OooO0o0) == null) ? null : oooOO0O.f12765OooOO0O;
            this.f12931OooO0oO = obj2;
            this.f12932OooO0oo = j;
            this.f12927OooO = j2;
            this.f12933OooOO0 = j3;
            this.f12934OooOO0O = z;
            this.f12935OooOO0o = z2;
            this.f12937OooOOO0 = oooOO1 != null;
            this.f12936OooOOO = oooOO1;
            this.f12939OooOOOo = j4;
            this.f12941OooOOo0 = j5;
            this.f12940OooOOo = i;
            this.f12942OooOOoo = i2;
            this.f12943OooOo00 = j6;
            this.f12938OooOOOO = false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooO0OO.class.equals(obj.getClass())) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return o0O00.OooO00o(this.f12928OooO0Oo, oooO0OO.f12928OooO0Oo) && o0O00.OooO00o(this.f12929OooO0o, oooO0OO.f12929OooO0o) && o0O00.OooO00o(this.f12931OooO0oO, oooO0OO.f12931OooO0oO) && o0O00.OooO00o(this.f12936OooOOO, oooO0OO.f12936OooOOO) && this.f12932OooO0oo == oooO0OO.f12932OooO0oo && this.f12927OooO == oooO0OO.f12927OooO && this.f12933OooOO0 == oooO0OO.f12933OooOO0 && this.f12934OooOO0O == oooO0OO.f12934OooOO0O && this.f12935OooOO0o == oooO0OO.f12935OooOO0o && this.f12938OooOOOO == oooO0OO.f12938OooOOOO && this.f12939OooOOOo == oooO0OO.f12939OooOOOo && this.f12941OooOOo0 == oooO0OO.f12941OooOOo0 && this.f12940OooOOo == oooO0OO.f12940OooOOo && this.f12942OooOOoo == oooO0OO.f12942OooOOoo && this.f12943OooOo00 == oooO0OO.f12943OooOo00;
        }

        public final int hashCode() {
            int iHashCode = (this.f12929OooO0o.hashCode() + ((this.f12928OooO0Oo.hashCode() + 217) * 31)) * 31;
            Object obj = this.f12931OooO0oO;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            o000oOoO.OooOO0 oooOO1 = this.f12936OooOOO;
            int iHashCode3 = (iHashCode2 + (oooOO1 != null ? oooOO1.hashCode() : 0)) * 31;
            long j = this.f12932OooO0oo;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f12927OooO;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f12933OooOO0;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f12934OooOO0O ? 1 : 0)) * 31) + (this.f12935OooOO0o ? 1 : 0)) * 31) + (this.f12938OooOOOO ? 1 : 0)) * 31;
            long j4 = this.f12939OooOOOo;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f12941OooOOo0;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f12940OooOOo) * 31) + this.f12942OooOOoo) * 31;
            long j6 = this.f12943OooOo00;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!o000oOoO.f12659OooOO0.equals(this.f12929OooO0o)) {
                bundle.putBundle(f12911OooOo, this.f12929OooO0o.toBundle());
            }
            long j = this.f12932OooO0oo;
            if (j != -9223372036854775807L) {
                bundle.putLong(f12916OooOoO0, j);
            }
            long j2 = this.f12927OooO;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f12915OooOoO, j2);
            }
            long j3 = this.f12933OooOO0;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f12917OooOoOO, j3);
            }
            boolean z = this.f12934OooOO0O;
            if (z) {
                bundle.putBoolean(f12919OooOoo0, z);
            }
            boolean z2 = this.f12935OooOO0o;
            if (z2) {
                bundle.putBoolean(f12918OooOoo, z2);
            }
            o000oOoO.OooOO0 oooOO1 = this.f12936OooOOO;
            if (oooOO1 != null) {
                bundle.putBundle(f12920OooOooO, oooOO1.toBundle());
            }
            boolean z3 = this.f12938OooOOOO;
            if (z3) {
                bundle.putBoolean(f12921OooOooo, z3);
            }
            long j4 = this.f12939OooOOOo;
            if (j4 != 0) {
                bundle.putLong(f12923Oooo000, j4);
            }
            long j5 = this.f12941OooOOo0;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(f12924Oooo00O, j5);
            }
            int i = this.f12940OooOOo;
            if (i != 0) {
                bundle.putInt(f12925Oooo00o, i);
            }
            int i2 = this.f12942OooOOoo;
            if (i2 != 0) {
                bundle.putInt(f12922Oooo0, i2);
            }
            long j6 = this.f12943OooOo00;
            if (j6 != 0) {
                bundle.putLong(f12926Oooo0O0, j6);
            }
            return bundle;
        }
    }

    public abstract int OooO();

    public int OooO00o(boolean z) {
        return OooOOo0() ? -1 : 0;
    }

    public abstract int OooO0O0(Object obj);

    public int OooO0OO(boolean z) {
        if (OooOOo0()) {
            return -1;
        }
        return OooOOOo() - 1;
    }

    public final int OooO0Oo(int i, OooO0O0 oooO0O0, OooO0OO oooO0OO, int i2, boolean z) {
        int i3 = OooO0oO(i, oooO0O0, false).f12906OooO0o;
        if (OooOOO(i3, oooO0OO).f12942OooOOoo != i) {
            return i + 1;
        }
        int iOooO0o0 = OooO0o0(i3, i2, z);
        if (iOooO0o0 == -1) {
            return -1;
        }
        return OooOOO(iOooO0o0, oooO0OO).f12940OooOOo;
    }

    public final OooO0O0 OooO0o(int i, OooO0O0 oooO0O0) {
        return OooO0oO(i, oooO0O0, false);
    }

    public int OooO0o0(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == OooO0OO(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == OooO0OO(z) ? OooO00o(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public abstract OooO0O0 OooO0oO(int i, OooO0O0 oooO0O0, boolean z);

    public OooO0O0 OooO0oo(Object obj, OooO0O0 oooO0O0) {
        return OooO0oO(OooO0O0(obj), oooO0O0, true);
    }

    public final Pair<Object, Long> OooOO0(OooO0OO oooO0OO, OooO0O0 oooO0O0, int i, long j) {
        Pair<Object, Long> pairOooOO0O = OooOO0O(oooO0OO, oooO0O0, i, j, 0L);
        pairOooOO0O.getClass();
        return pairOooOO0O;
    }

    @Nullable
    public final Pair<Object, Long> OooOO0O(OooO0OO oooO0OO, OooO0O0 oooO0O0, int i, long j, long j2) {
        o00O000o.OooO0OO(i, OooOOOo());
        OooOOOO(i, oooO0OO, j2);
        if (j == -9223372036854775807L) {
            j = oooO0OO.f12939OooOOOo;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = oooO0OO.f12940OooOOo;
        OooO0o(i2, oooO0O0);
        while (i2 < oooO0OO.f12942OooOOoo && oooO0O0.f12909OooO0oo != j) {
            int i3 = i2 + 1;
            if (OooO0oO(i3, oooO0O0, false).f12909OooO0oo > j) {
                break;
            }
            i2 = i3;
        }
        OooO0oO(i2, oooO0O0, true);
        long jMin = j - oooO0O0.f12909OooO0oo;
        long j3 = oooO0O0.f12908OooO0oO;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = oooO0O0.f12907OooO0o0;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int OooOO0o(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == OooO00o(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == OooO00o(z) ? OooO0OO(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public final OooO0OO OooOOO(int i, OooO0OO oooO0OO) {
        return OooOOOO(i, oooO0OO, 0L);
    }

    public abstract Object OooOOO0(int i);

    public abstract OooO0OO OooOOOO(int i, OooO0OO oooO0OO, long j);

    public abstract int OooOOOo();

    public final boolean OooOOo0() {
        return OooOOOo() == 0;
    }

    public final boolean equals(@Nullable Object obj) {
        int iOooO0OO;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0o0Oo)) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        if (oo0o0oo.OooOOOo() != OooOOOo() || oo0o0oo.OooO() != OooO()) {
            return false;
        }
        OooO0OO oooO0OO = new OooO0OO();
        OooO0O0 oooO0O0 = new OooO0O0();
        OooO0OO oooO0OO2 = new OooO0OO();
        OooO0O0 oooO0O1 = new OooO0O0();
        for (int i = 0; i < OooOOOo(); i++) {
            if (!OooOOO(i, oooO0OO).equals(oo0o0oo.OooOOO(i, oooO0OO2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < OooO(); i2++) {
            if (!OooO0oO(i2, oooO0O0, true).equals(oo0o0oo.OooO0oO(i2, oooO0O1, true))) {
                return false;
            }
        }
        int iOooO00o = OooO00o(true);
        if (iOooO00o != oo0o0oo.OooO00o(true) || (iOooO0OO = OooO0OO(true)) != oo0o0oo.OooO0OO(true)) {
            return false;
        }
        while (iOooO00o != iOooO0OO) {
            int iOooO0o0 = OooO0o0(iOooO00o, 0, true);
            if (iOooO0o0 != oo0o0oo.OooO0o0(iOooO00o, 0, true)) {
                return false;
            }
            iOooO00o = iOooO0o0;
        }
        return true;
    }

    public final int hashCode() {
        OooO0OO oooO0OO = new OooO0OO();
        OooO0O0 oooO0O0 = new OooO0O0();
        int iOooOOOo = OooOOOo() + 217;
        for (int i = 0; i < OooOOOo(); i++) {
            iOooOOOo = (iOooOOOo * 31) + OooOOO(i, oooO0OO).hashCode();
        }
        int iOooO = OooO() + (iOooOOOo * 31);
        for (int i2 = 0; i2 < OooO(); i2++) {
            iOooO = (iOooO * 31) + OooO0oO(i2, oooO0O0, true).hashCode();
        }
        int iOooO00o = OooO00o(true);
        while (iOooO00o != -1) {
            iOooO = (iOooO * 31) + iOooO00o;
            iOooO00o = OooO0o0(iOooO00o, 0, true);
        }
        return iOooO;
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iOooOOOo = OooOOOo();
        OooO0OO oooO0OO = new OooO0OO();
        for (int i = 0; i < iOooOOOo; i++) {
            arrayList.add(OooOOOO(i, oooO0OO, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iOooO = OooO();
        OooO0O0 oooO0O0 = new OooO0O0();
        for (int i2 = 0; i2 < iOooO; i2++) {
            arrayList2.add(OooO0oO(i2, oooO0O0, false).toBundle());
        }
        int[] iArr = new int[iOooOOOo];
        if (iOooOOOo > 0) {
            iArr[0] = OooO00o(true);
        }
        for (int i3 = 1; i3 < iOooOOOo; i3++) {
            iArr[i3] = OooO0o0(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        o00O00O.OooO00o(bundle, f12897OooO0o0, new o000(arrayList));
        o00O00O.OooO00o(bundle, f12896OooO0o, new o000(arrayList2));
        bundle.putIntArray(f12898OooO0oO, iArr);
        return bundle;
    }
}
