package p232o00oOoOo;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p230o00oOoO0.o000;
import p230o00oOoO0.o0000OO0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O0O extends o0000OO0 {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Inflater f40211OooOOOo;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00Oo00 f40209OooOOO0 = new o00Oo00();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00Oo00 f40208OooOOO = new o00Oo00();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO00o f40210OooOOOO = new OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f40212OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00Oo00 f40213OooO00o = new o00Oo00();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f40214OooO0O0 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f40215OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f40216OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f40217OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f40218OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f40219OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f40220OooO0oo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    @Override // p230o00oOoO0.o0000OO0
    public final o000 OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        char c;
        Cue cueOooO00o;
        int i2;
        int iOooOo0O;
        int i3;
        int i4;
        int iOooOo;
        o00Oo00 o00oo00 = this.f40209OooOOO0;
        o00oo00.OooOooo(i, bArr);
        int i5 = o00oo00.f40593OooO0OO;
        int i6 = o00oo00.f40592OooO0O0;
        char c2 = 255;
        if (i5 - i6 > 0 && (o00oo00.f40591OooO00o[i6] & UByte.MAX_VALUE) == 120) {
            if (this.f40211OooOOOo == null) {
                this.f40211OooOOOo = new Inflater();
            }
            Inflater inflater = this.f40211OooOOOo;
            o00Oo00 o00oo01 = this.f40208OooOOO;
            if (o0O00.Oooo000(o00oo00, o00oo01, inflater)) {
                o00oo00.OooOooo(o00oo01.f40593OooO0OO, o00oo01.f40591OooO00o);
            }
        }
        OooO00o oooO00o = this.f40210OooOOOO;
        int i7 = 0;
        oooO00o.f40216OooO0Oo = 0;
        oooO00o.f40218OooO0o0 = 0;
        oooO00o.f40217OooO0o = 0;
        oooO00o.f40219OooO0oO = 0;
        oooO00o.f40220OooO0oo = 0;
        oooO00o.f40212OooO = 0;
        oooO00o.f40213OooO00o.OooOooO(0);
        oooO00o.f40215OooO0OO = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i8 = o00oo00.f40593OooO0OO;
            if (i8 - o00oo00.f40592OooO0O0 < 3) {
                return new o00O0OO0(Collections.unmodifiableList(arrayList));
            }
            int iOooOo0O2 = o00oo00.OooOo0O();
            int iOooOoOO = o00oo00.OooOoOO();
            int i9 = o00oo00.f40592OooO0O0 + iOooOoOO;
            if (i9 > i8) {
                o00oo00.Oooo00O(i8);
                c = c2;
                cueOooO00o = null;
            } else {
                int[] iArr = oooO00o.f40214OooO0O0;
                o00Oo00 o00oo02 = oooO00o.f40213OooO00o;
                if (iOooOo0O2 != 128) {
                    switch (iOooOo0O2) {
                        case 20:
                            if (iOooOoOO % 5 == 2) {
                                o00oo00.Oooo00o(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iOooOoOO / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iOooOo0O3 = o00oo00.OooOo0O();
                                    int[] iArr2 = iArr;
                                    double dOooOo0O = o00oo00.OooOo0O();
                                    double dOooOo0O2 = o00oo00.OooOo0O() - 128;
                                    double dOooOo0O3 = o00oo00.OooOo0O() - 128;
                                    iArr2[iOooOo0O3] = (o0O00.OooO((int) ((dOooOo0O - (0.34414d * dOooOo0O3)) - (dOooOo0O2 * 0.71414d)), 0, 255) << 8) | (o0O00.OooO((int) ((1.402d * dOooOo0O2) + dOooOo0O), 0, 255) << 16) | (o00oo00.OooOo0O() << 24) | o0O00.OooO((int) ((dOooOo0O3 * 1.772d) + dOooOo0O), 0, 255);
                                    i11++;
                                    iArr = iArr2;
                                    i10 = i10;
                                    c2 = 255;
                                }
                                c = c2;
                                oooO00o.f40215OooO0OO = true;
                            } else {
                                c = c2;
                            }
                            break;
                        case 21:
                            if (iOooOoOO >= 4) {
                                o00oo00.Oooo00o(3);
                                int i12 = iOooOoOO - 4;
                                if (((128 & o00oo00.OooOo0O()) != 0 ? 1 : i7) == 0) {
                                    i3 = o00oo02.f40592OooO0O0;
                                    i4 = o00oo02.f40593OooO0OO;
                                    if (i3 < i4 && i12 > 0) {
                                        int iMin = Math.min(i12, i4 - i3);
                                        o00oo00.OooO0Oo(i3, iMin, o00oo02.f40591OooO00o);
                                        o00oo02.Oooo00O(i3 + iMin);
                                    }
                                } else if (i12 >= 7 && (iOooOo = o00oo00.OooOo()) >= 4) {
                                    oooO00o.f40220OooO0oo = o00oo00.OooOoOO();
                                    oooO00o.f40212OooO = o00oo00.OooOoOO();
                                    o00oo02.OooOooO(iOooOo - 4);
                                    i12 -= 7;
                                    i3 = o00oo02.f40592OooO0O0;
                                    i4 = o00oo02.f40593OooO0OO;
                                    if (i3 < i4) {
                                        int iMin2 = Math.min(i12, i4 - i3);
                                        o00oo00.OooO0Oo(i3, iMin2, o00oo02.f40591OooO00o);
                                        o00oo02.Oooo00O(i3 + iMin2);
                                    }
                                }
                            }
                            c = c2;
                            break;
                        case 22:
                            if (iOooOoOO >= 19) {
                                oooO00o.f40216OooO0Oo = o00oo00.OooOoOO();
                                oooO00o.f40218OooO0o0 = o00oo00.OooOoOO();
                                o00oo00.Oooo00o(11);
                                oooO00o.f40217OooO0o = o00oo00.OooOoOO();
                                oooO00o.f40219OooO0oO = o00oo00.OooOoOO();
                            }
                            c = c2;
                            break;
                        default:
                            c = c2;
                            break;
                    }
                    i7 = 0;
                    cueOooO00o = null;
                } else {
                    c = c2;
                    if (oooO00o.f40216OooO0Oo == 0 || oooO00o.f40218OooO0o0 == 0 || oooO00o.f40220OooO0oo == 0 || oooO00o.f40212OooO == 0 || (i2 = o00oo02.f40593OooO0OO) == 0 || o00oo02.f40592OooO0O0 != i2 || !oooO00o.f40215OooO0OO) {
                        cueOooO00o = null;
                    } else {
                        o00oo02.Oooo00O(0);
                        int i13 = oooO00o.f40220OooO0oo * oooO00o.f40212OooO;
                        int[] iArr3 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iOooOo0O4 = o00oo02.OooOo0O();
                            if (iOooOo0O4 != 0) {
                                iOooOo0O = i14 + 1;
                                iArr3[i14] = iArr[iOooOo0O4];
                            } else {
                                int iOooOo0O5 = o00oo02.OooOo0O();
                                if (iOooOo0O5 != 0) {
                                    iOooOo0O = ((iOooOo0O5 & 64) == 0 ? iOooOo0O5 & 63 : ((iOooOo0O5 & 63) << 8) | o00oo02.OooOo0O()) + i14;
                                    Arrays.fill(iArr3, i14, iOooOo0O, (iOooOo0O5 & 128) == 0 ? 0 : iArr[o00oo02.OooOo0O()]);
                                }
                            }
                            i14 = iOooOo0O;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, oooO00o.f40220OooO0oo, oooO00o.f40212OooO, Bitmap.Config.ARGB_8888);
                        Cue.OooO00o oooO00o2 = new Cue.OooO00o();
                        oooO00o2.f13420OooO0O0 = bitmapCreateBitmap;
                        float f = oooO00o.f40217OooO0o;
                        float f2 = oooO00o.f40216OooO0Oo;
                        oooO00o2.f13426OooO0oo = f / f2;
                        oooO00o2.f13418OooO = 0;
                        float f3 = oooO00o.f40219OooO0oO;
                        float f4 = oooO00o.f40218OooO0o0;
                        oooO00o2.f13424OooO0o0 = f3 / f4;
                        oooO00o2.f13423OooO0o = 0;
                        oooO00o2.f13425OooO0oO = 0;
                        oooO00o2.f13429OooOO0o = oooO00o.f40220OooO0oo / f2;
                        oooO00o2.f13431OooOOO0 = oooO00o.f40212OooO / f4;
                        cueOooO00o = oooO00o2.OooO00o();
                    }
                    i7 = 0;
                    oooO00o.f40216OooO0Oo = 0;
                    oooO00o.f40218OooO0o0 = 0;
                    oooO00o.f40217OooO0o = 0;
                    oooO00o.f40219OooO0oO = 0;
                    oooO00o.f40220OooO0oo = 0;
                    oooO00o.f40212OooO = 0;
                    o00oo02.OooOooO(0);
                    oooO00o.f40215OooO0OO = false;
                }
                o00oo00.Oooo00O(i9);
            }
            if (cueOooO00o != null) {
                arrayList.add(cueOooO00o);
            }
            c2 = c;
        }
    }
}
