package p094o000o0Oo;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p080o000OoO.o0000OO0;
import p080o000OoO.o000OO00;
import p092o000o0O0.o0OO00O;
import p092o000o0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0000O0O extends o0Oo0oo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Inflater f35257OooOOOo;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o0000OO0 f35255OooOOO0 = new o0000OO0();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o0000OO0 f35254OooOOO = new o0000OO0();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO00o f35256OooOOOO = new OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f35258OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000OO0 f35259OooO00o = new o0000OO0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f35260OooO0O0 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f35261OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35262OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f35263OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f35264OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f35265OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f35266OooO0oo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    @Override // p092o000o0O0.o0Oo0oo
    public final o0OO00O OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        char c;
        Cue cueOooO00o;
        int i2;
        int iOooOo0O;
        int i3;
        int i4;
        int iOooOo;
        o0000OO0 o0000oo1 = this.f35255OooOOO0;
        o0000oo1.OooOooo(i, bArr);
        int i5 = o0000oo1.f34951OooO0OO;
        int i6 = o0000oo1.f34950OooO0O0;
        char c2 = 255;
        if (i5 - i6 > 0 && (o0000oo1.f34949OooO00o[i6] & UByte.MAX_VALUE) == 120) {
            if (this.f35257OooOOOo == null) {
                this.f35257OooOOOo = new Inflater();
            }
            Inflater inflater = this.f35257OooOOOo;
            o0000OO0 o0000oo2 = this.f35254OooOOO;
            if (o000OO00.Oooo00O(o0000oo1, o0000oo2, inflater)) {
                o0000oo1.OooOooo(o0000oo2.f34951OooO0OO, o0000oo2.f34949OooO00o);
            }
        }
        OooO00o oooO00o = this.f35256OooOOOO;
        int i7 = 0;
        oooO00o.f35262OooO0Oo = 0;
        oooO00o.f35264OooO0o0 = 0;
        oooO00o.f35263OooO0o = 0;
        oooO00o.f35265OooO0oO = 0;
        oooO00o.f35266OooO0oo = 0;
        oooO00o.f35258OooO = 0;
        oooO00o.f35259OooO00o.OooOooO(0);
        oooO00o.f35261OooO0OO = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i8 = o0000oo1.f34951OooO0OO;
            if (i8 - o0000oo1.f34950OooO0O0 < 3) {
                return new o000OO(Collections.unmodifiableList(arrayList));
            }
            int iOooOo0O2 = o0000oo1.OooOo0O();
            int iOooOoOO = o0000oo1.OooOoOO();
            int i9 = o0000oo1.f34950OooO0O0 + iOooOoOO;
            if (i9 > i8) {
                o0000oo1.Oooo00O(i8);
                c = c2;
                cueOooO00o = null;
            } else {
                int[] iArr = oooO00o.f35260OooO0O0;
                o0000OO0 o0000oo3 = oooO00o.f35259OooO00o;
                if (iOooOo0O2 != 128) {
                    switch (iOooOo0O2) {
                        case 20:
                            if (iOooOoOO % 5 == 2) {
                                o0000oo1.Oooo00o(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iOooOoOO / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iOooOo0O3 = o0000oo1.OooOo0O();
                                    int[] iArr2 = iArr;
                                    double dOooOo0O = o0000oo1.OooOo0O();
                                    double dOooOo0O2 = o0000oo1.OooOo0O() - 128;
                                    double dOooOo0O3 = o0000oo1.OooOo0O() - 128;
                                    iArr2[iOooOo0O3] = (o000OO00.OooO((int) ((dOooOo0O - (0.34414d * dOooOo0O3)) - (dOooOo0O2 * 0.71414d)), 0, 255) << 8) | (o000OO00.OooO((int) ((1.402d * dOooOo0O2) + dOooOo0O), 0, 255) << 16) | (o0000oo1.OooOo0O() << 24) | o000OO00.OooO((int) ((dOooOo0O3 * 1.772d) + dOooOo0O), 0, 255);
                                    i11++;
                                    iArr = iArr2;
                                    i10 = i10;
                                    c2 = 255;
                                }
                                c = c2;
                                oooO00o.f35261OooO0OO = true;
                            } else {
                                c = c2;
                            }
                            break;
                        case 21:
                            if (iOooOoOO >= 4) {
                                o0000oo1.Oooo00o(3);
                                int i12 = iOooOoOO - 4;
                                if (((128 & o0000oo1.OooOo0O()) != 0 ? 1 : i7) == 0) {
                                    i3 = o0000oo3.f34950OooO0O0;
                                    i4 = o0000oo3.f34951OooO0OO;
                                    if (i3 < i4 && i12 > 0) {
                                        int iMin = Math.min(i12, i4 - i3);
                                        o0000oo1.OooO0Oo(i3, iMin, o0000oo3.f34949OooO00o);
                                        o0000oo3.Oooo00O(i3 + iMin);
                                    }
                                } else if (i12 >= 7 && (iOooOo = o0000oo1.OooOo()) >= 4) {
                                    oooO00o.f35266OooO0oo = o0000oo1.OooOoOO();
                                    oooO00o.f35258OooO = o0000oo1.OooOoOO();
                                    o0000oo3.OooOooO(iOooOo - 4);
                                    i12 -= 7;
                                    i3 = o0000oo3.f34950OooO0O0;
                                    i4 = o0000oo3.f34951OooO0OO;
                                    if (i3 < i4) {
                                        int iMin2 = Math.min(i12, i4 - i3);
                                        o0000oo1.OooO0Oo(i3, iMin2, o0000oo3.f34949OooO00o);
                                        o0000oo3.Oooo00O(i3 + iMin2);
                                    }
                                }
                            }
                            c = c2;
                            break;
                        case 22:
                            if (iOooOoOO >= 19) {
                                oooO00o.f35262OooO0Oo = o0000oo1.OooOoOO();
                                oooO00o.f35264OooO0o0 = o0000oo1.OooOoOO();
                                o0000oo1.Oooo00o(11);
                                oooO00o.f35263OooO0o = o0000oo1.OooOoOO();
                                oooO00o.f35265OooO0oO = o0000oo1.OooOoOO();
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
                    if (oooO00o.f35262OooO0Oo == 0 || oooO00o.f35264OooO0o0 == 0 || oooO00o.f35266OooO0oo == 0 || oooO00o.f35258OooO == 0 || (i2 = o0000oo3.f34951OooO0OO) == 0 || o0000oo3.f34950OooO0O0 != i2 || !oooO00o.f35261OooO0OO) {
                        cueOooO00o = null;
                    } else {
                        o0000oo3.Oooo00O(0);
                        int i13 = oooO00o.f35266OooO0oo * oooO00o.f35258OooO;
                        int[] iArr3 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iOooOo0O4 = o0000oo3.OooOo0O();
                            if (iOooOo0O4 != 0) {
                                iOooOo0O = i14 + 1;
                                iArr3[i14] = iArr[iOooOo0O4];
                            } else {
                                int iOooOo0O5 = o0000oo3.OooOo0O();
                                if (iOooOo0O5 != 0) {
                                    iOooOo0O = ((iOooOo0O5 & 64) == 0 ? iOooOo0O5 & 63 : ((iOooOo0O5 & 63) << 8) | o0000oo3.OooOo0O()) + i14;
                                    Arrays.fill(iArr3, i14, iOooOo0O, (iOooOo0O5 & 128) == 0 ? 0 : iArr[o0000oo3.OooOo0O()]);
                                }
                            }
                            i14 = iOooOo0O;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, oooO00o.f35266OooO0oo, oooO00o.f35258OooO, Bitmap.Config.ARGB_8888);
                        Cue.OooO00o oooO00o2 = new Cue.OooO00o();
                        oooO00o2.f6921OooO0O0 = bitmapCreateBitmap;
                        float f = oooO00o.f35263OooO0o;
                        float f2 = oooO00o.f35262OooO0Oo;
                        oooO00o2.f6927OooO0oo = f / f2;
                        oooO00o2.f6919OooO = 0;
                        float f3 = oooO00o.f35265OooO0oO;
                        float f4 = oooO00o.f35264OooO0o0;
                        oooO00o2.f6925OooO0o0 = f3 / f4;
                        oooO00o2.f6924OooO0o = 0;
                        oooO00o2.f6926OooO0oO = 0;
                        oooO00o2.f6930OooOO0o = oooO00o.f35266OooO0oo / f2;
                        oooO00o2.f6932OooOOO0 = oooO00o.f35258OooO / f4;
                        cueOooO00o = oooO00o2.OooO00o();
                    }
                    i7 = 0;
                    oooO00o.f35262OooO0Oo = 0;
                    oooO00o.f35264OooO0o0 = 0;
                    oooO00o.f35263OooO0o = 0;
                    oooO00o.f35265OooO0oO = 0;
                    oooO00o.f35266OooO0oo = 0;
                    oooO00o.f35258OooO = 0;
                    o0000oo3.OooOooO(0);
                    oooO00o.f35261OooO0OO = false;
                }
                o0000oo1.Oooo00O(i9);
            }
            if (cueOooO00o != null) {
                arrayList.add(cueOooO00o);
            }
            c2 = c;
        }
    }
}
