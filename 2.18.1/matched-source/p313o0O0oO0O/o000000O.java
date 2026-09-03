package p313o0O0oO0O;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O extends o0000Ooo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000 f36560OooOOO = new o000();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o000 f36561OooOOOO = new o000();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooO00o f36562OooOOOo = new OooO00o();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Inflater f36563OooOOo0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f36564OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000 f36565OooO00o = new o000();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f36566OooO0O0 = new int[256];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f36567OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f36568OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f36569OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f36570OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f36571OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f36572OooO0oo;

        public final void OooO00o() {
            this.f36568OooO0Oo = 0;
            this.f36570OooO0o0 = 0;
            this.f36569OooO0o = 0;
            this.f36571OooO0oO = 0;
            this.f36572OooO0oo = 0;
            this.f36564OooO = 0;
            this.f36565OooO00o.OooOo(0);
            this.f36567OooO0OO = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    @Override // p324o0O0oo0O.o0000Ooo
    public final o0000O00 OooOO0(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        Cue cue;
        o000 o000Var;
        int i2;
        int iOooOOo0;
        int i3;
        int i4;
        int iOooOOoo;
        boolean z2;
        this.f36560OooOOO.OooOoO0(bArr, i);
        o000 o000Var2 = this.f36560OooOOO;
        int i5 = 2;
        int i6 = 0;
        if (o000Var2.f36663OooO0OO - o000Var2.f36662OooO0O0 > 0 && o000Var2.OooO00o() == 120) {
            if (this.f36563OooOOo0 == null) {
                this.f36563OooOOo0 = new Inflater();
            }
            o000 o000Var3 = this.f36561OooOOOO;
            Inflater inflater = this.f36563OooOOo0;
            int i7 = o000OOo0.f36740OooO00o;
            int i8 = o000Var2.f36663OooO0OO - o000Var2.f36662OooO0O0;
            if (i8 <= 0) {
                z2 = false;
            } else {
                byte[] bArrCopyOf = o000Var3.f36661OooO00o;
                if (bArrCopyOf.length < i8) {
                    bArrCopyOf = new byte[i8 * 2];
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                byte[] bArr2 = o000Var2.f36661OooO00o;
                int i9 = o000Var2.f36662OooO0O0;
                inflater.setInput(bArr2, i9, o000Var2.f36663OooO0OO - i9);
                int iInflate = 0;
                while (true) {
                    try {
                        iInflate += inflater.inflate(bArrCopyOf, iInflate, bArrCopyOf.length - iInflate);
                        if (!inflater.finished()) {
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                if (iInflate == bArrCopyOf.length) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                                }
                            }
                            z2 = false;
                            break;
                        }
                        o000Var3.OooOoO0(bArrCopyOf, iInflate);
                        z2 = true;
                        break;
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
                inflater.reset();
            }
            if (z2) {
                o000 o000Var4 = this.f36561OooOOOO;
                o000Var2.OooOoO0(o000Var4.f36661OooO00o, o000Var4.f36663OooO0OO);
            }
        }
        this.f36562OooOOOo.OooO00o();
        ArrayList arrayList = new ArrayList();
        while (true) {
            o000 o000Var5 = this.f36560OooOOO;
            int i10 = o000Var5.f36663OooO0OO;
            if (i10 - o000Var5.f36662OooO0O0 < 3) {
                return new o00000(Collections.unmodifiableList(arrayList));
            }
            OooO00o oooO00o = this.f36562OooOOOo;
            int iOooOOo1 = o000Var5.OooOOo0();
            int iOooOo0O = o000Var5.OooOo0O();
            int i11 = o000Var5.f36662OooO0O0 + iOooOo0O;
            if (i11 > i10) {
                o000Var5.OooOoOO(i10);
                cue = null;
            } else {
                if (iOooOOo1 != 128) {
                    switch (iOooOOo1) {
                        case 20:
                            Objects.requireNonNull(oooO00o);
                            if (iOooOo0O % 5 == i5) {
                                o000Var5.OooOoo0(i5);
                                Arrays.fill(oooO00o.f36566OooO0O0, i6);
                                int i12 = iOooOo0O / 5;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    int iOooOOo2 = o000Var5.OooOOo0();
                                    int iOooOOo3 = o000Var5.OooOOo0();
                                    double d = iOooOOo3;
                                    double dOooOOo0 = o000Var5.OooOOo0() - 128;
                                    double dOooOOo1 = o000Var5.OooOOo0() - 128;
                                    oooO00o.f36566OooO0O0[iOooOOo2] = o000OOo0.OooO0oo((int) ((dOooOOo1 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE) | (o000OOo0.OooO0oo((int) ((1.402d * dOooOOo0) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (o000Var5.OooOOo0() << 24) | (o000OOo0.OooO0oo((int) ((d - (0.34414d * dOooOOo1)) - (dOooOOo0 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8);
                                    i12 = i12;
                                }
                                oooO00o.f36567OooO0OO = true;
                            }
                            break;
                        case 21:
                            Objects.requireNonNull(oooO00o);
                            if (iOooOo0O >= 4) {
                                o000Var5.OooOoo0(3);
                                int i14 = iOooOo0O - 4;
                                if (!((128 & o000Var5.OooOOo0()) != 0)) {
                                    o000 o000Var6 = oooO00o.f36565OooO00o;
                                    i3 = o000Var6.f36662OooO0O0;
                                    i4 = o000Var6.f36663OooO0OO;
                                    if (i3 < i4 && i14 > 0) {
                                        int iMin = Math.min(i14, i4 - i3);
                                        o000Var5.OooO0OO(oooO00o.f36565OooO00o.f36661OooO00o, i3, iMin);
                                        oooO00o.f36565OooO00o.OooOoOO(i3 + iMin);
                                    }
                                } else if (i14 >= 7 && (iOooOOoo = o000Var5.OooOOoo()) >= 4) {
                                    oooO00o.f36572OooO0oo = o000Var5.OooOo0O();
                                    oooO00o.f36564OooO = o000Var5.OooOo0O();
                                    oooO00o.f36565OooO00o.OooOo(iOooOOoo - 4);
                                    i14 -= 7;
                                    o000 o000Var7 = oooO00o.f36565OooO00o;
                                    i3 = o000Var7.f36662OooO0O0;
                                    i4 = o000Var7.f36663OooO0OO;
                                    if (i3 < i4) {
                                        int iMin2 = Math.min(i14, i4 - i3);
                                        o000Var5.OooO0OO(oooO00o.f36565OooO00o.f36661OooO00o, i3, iMin2);
                                        oooO00o.f36565OooO00o.OooOoOO(i3 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            Objects.requireNonNull(oooO00o);
                            if (iOooOo0O >= 19) {
                                oooO00o.f36568OooO0Oo = o000Var5.OooOo0O();
                                oooO00o.f36570OooO0o0 = o000Var5.OooOo0O();
                                o000Var5.OooOoo0(11);
                                oooO00o.f36569OooO0o = o000Var5.OooOo0O();
                                oooO00o.f36571OooO0oO = o000Var5.OooOo0O();
                            }
                            break;
                        default:
                            break;
                    }
                    i6 = 0;
                    cue = null;
                } else {
                    if (oooO00o.f36568OooO0Oo == 0 || oooO00o.f36570OooO0o0 == 0 || oooO00o.f36572OooO0oo == 0 || oooO00o.f36564OooO == 0 || (i2 = (o000Var = oooO00o.f36565OooO00o).f36663OooO0OO) == 0 || o000Var.f36662OooO0O0 != i2 || !oooO00o.f36567OooO0OO) {
                        i6 = 0;
                        cue = null;
                    } else {
                        i6 = 0;
                        o000Var.OooOoOO(0);
                        int i15 = oooO00o.f36572OooO0oo * oooO00o.f36564OooO;
                        int[] iArr = new int[i15];
                        int i16 = 0;
                        while (i16 < i15) {
                            int iOooOOo4 = oooO00o.f36565OooO00o.OooOOo0();
                            if (iOooOOo4 != 0) {
                                iOooOOo0 = i16 + 1;
                                iArr[i16] = oooO00o.f36566OooO0O0[iOooOOo4];
                            } else {
                                int iOooOOo5 = oooO00o.f36565OooO00o.OooOOo0();
                                if (iOooOOo5 != 0) {
                                    iOooOOo0 = ((iOooOOo5 & 64) == 0 ? iOooOOo5 & 63 : ((iOooOOo5 & 63) << 8) | oooO00o.f36565OooO00o.OooOOo0()) + i16;
                                    Arrays.fill(iArr, i16, iOooOOo0, (iOooOOo5 & 128) == 0 ? 0 : oooO00o.f36566OooO0O0[oooO00o.f36565OooO00o.OooOOo0()]);
                                }
                            }
                            i16 = iOooOOo0;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, oooO00o.f36572OooO0oo, oooO00o.f36564OooO, Bitmap.Config.ARGB_8888);
                        float f = oooO00o.f36569OooO0o;
                        float f2 = oooO00o.f36568OooO0Oo;
                        float f3 = f / f2;
                        float f4 = oooO00o.f36571OooO0oO;
                        float f5 = oooO00o.f36570OooO0o0;
                        cue = new Cue(null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, oooO00o.f36572OooO0oo / f2, oooO00o.f36564OooO / f5, false, -16777216, Integer.MIN_VALUE);
                    }
                    oooO00o.OooO00o();
                }
                o000Var5.OooOoOO(i11);
            }
            if (cue != null) {
                arrayList.add(cue);
            }
            i5 = 2;
        }
    }
}
