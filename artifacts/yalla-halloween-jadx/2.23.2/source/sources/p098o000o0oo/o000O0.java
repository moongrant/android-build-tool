package p098o000o0oo;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.appcompat.widget.o0000O0;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.base.OooOO0;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.UByte;
import p046Oooooo0.o0O00o0;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p092o000o0O0.o0OO00O;
import p092o000o0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000O0 extends o0Oo0oo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f35328OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000O000 f35329OooOOO0 = new o000O000();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f35330OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f35331OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float f35332OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final String f35333OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f35334OooOOoo;

    public o000O0(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f35330OooOOOO = 0;
            this.f35331OooOOOo = -1;
            this.f35333OooOOo0 = "sans-serif";
            this.f35328OooOOO = false;
            this.f35332OooOOo = 0.85f;
            this.f35334OooOOoo = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f35330OooOOOO = bArr[24];
        this.f35331OooOOOo = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
        int length = bArr.length - 43;
        int i = o00.f34910OooO00o;
        this.f35333OooOOo0 = "Serif".equals(new String(bArr, 43, length, OooOO0.f18592OooO0OO)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.f35334OooOOoo = i2;
        boolean z = (bArr[0] & 32) != 0;
        this.f35328OooOOO = z;
        if (z) {
            this.f35332OooOOo = o00.OooO0oo(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.f35332OooOOo = 0.85f;
        }
    }

    public static void OooO0oo(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // p092o000o0O0.o0Oo0oo
    public final o0OO00O OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        String strOooOo00;
        float f;
        int i2;
        o000O000 o000o001 = this.f35329OooOOO0;
        o000o001.OooOooo(i, bArr);
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        if (!(o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 >= 2)) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
        int iOooOoOO = o000o001.OooOoOO();
        if (iOooOoOO == 0) {
            strOooOo00 = "";
        } else {
            int i6 = o000o001.f34963OooO0O0;
            Charset charsetOooOoo = o000o001.OooOoo();
            int i7 = iOooOoOO - (o000o001.f34963OooO0O0 - i6);
            if (charsetOooOoo == null) {
                charsetOooOoo = OooOO0.f18592OooO0OO;
            }
            strOooOo00 = o000o001.OooOo00(i7, charsetOooOoo);
        }
        if (strOooOo00.isEmpty()) {
            return o000O0Oo.f35335OooO0o0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooOo00);
        OooO0oo(spannableStringBuilder, this.f35330OooOOOO, 0, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i8 = this.f35331OooOOOo;
        if (i8 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i8 & 255) << 24) | (i8 >>> 8)), 0, length, 16711713);
        }
        int length2 = spannableStringBuilder.length();
        String str = this.f35333OooOOo0;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fOooO0oo = this.f35332OooOOo;
        while (true) {
            int i9 = o000o001.f34964OooO0OO;
            int i10 = o000o001.f34963OooO0O0;
            if (i9 - i10 < 8) {
                float f2 = fOooO0oo;
                Cue.OooO00o oooO00o = new Cue.OooO00o();
                oooO00o.f6915OooO00o = spannableStringBuilder;
                oooO00o.f6920OooO0o0 = f2;
                oooO00o.f6919OooO0o = 0;
                oooO00o.f6921OooO0oO = 0;
                return new o000O0Oo(oooO00o.OooO00o());
            }
            int iOooO0o = o000o001.OooO0o();
            int iOooO0o2 = o000o001.OooO0o();
            if (iOooO0o2 == 1937013100) {
                if ((o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 >= i3 ? i4 : i5) == 0) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                int iOooOoOO2 = o000o001.OooOoOO();
                int i11 = i5;
                while (i5 < iOooOoOO2) {
                    if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 >= 12) {
                        i11 = i4;
                    }
                    if (i11 == 0) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    int iOooOoOO3 = o000o001.OooOoOO();
                    int iOooOoOO4 = o000o001.OooOoOO();
                    o000o001.Oooo00o(i3);
                    int iOooOo0O = o000o001.OooOo0O();
                    o000o001.Oooo00o(i4);
                    int iOooO0o3 = o000o001.OooO0o();
                    if (iOooOoOO4 > spannableStringBuilder.length()) {
                        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Truncating styl end (", iOooOoOO4, ") to cueText.length() (");
                        sbOooO0O0.append(spannableStringBuilder.length());
                        sbOooO0O0.append(").");
                        Log.OooO0o("Tx3gDecoder", sbOooO0O0.toString());
                        iOooOoOO4 = spannableStringBuilder.length();
                    }
                    int i12 = iOooOoOO4;
                    if (iOooOoOO3 >= i12) {
                        Log.OooO0o("Tx3gDecoder", o0O00o0.OooO00o("Ignoring styl with start (", iOooOoOO3, ") >= end (", i12, ")."));
                        i2 = iOooOoOO2;
                        f = fOooO0oo;
                    } else {
                        f = fOooO0oo;
                        i2 = iOooOoOO2;
                        OooO0oo(spannableStringBuilder, iOooOo0O, this.f35330OooOOOO, iOooOoOO3, i12, 0);
                        if (iOooO0o3 != i8) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((iOooO0o3 >>> 8) | ((iOooO0o3 & 255) << 24)), iOooOoOO3, i12, 33);
                        }
                    }
                    i5++;
                    i3 = 2;
                    i4 = 1;
                    i11 = 0;
                    fOooO0oo = f;
                    iOooOoOO2 = i2;
                }
            } else {
                float f3 = fOooO0oo;
                if (iOooO0o2 == 1952608120 && this.f35328OooOOO) {
                    i3 = 2;
                    if (!(o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 >= 2)) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    fOooO0oo = o00.OooO0oo(o000o001.OooOoOO() / this.f35334OooOOoo, 0.0f, 0.95f);
                } else {
                    i3 = 2;
                    fOooO0oo = f3;
                }
            }
            o000o001.Oooo00O(i10 + iOooO0o);
            i4 = 1;
            i5 = 0;
        }
    }
}
