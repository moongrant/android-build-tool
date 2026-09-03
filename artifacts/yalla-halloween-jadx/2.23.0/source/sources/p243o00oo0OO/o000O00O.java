package p243o00oo0OO;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.appcompat.widget.o0000O0;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Log;
import com.google.common.base.OooO;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.UByte;
import p046Oooooo0.o0O00o0;
import p230o00oOoO0.o000;
import p230o00oOoO0.o0000OO0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O00O extends o0000OO0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f40454OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00Oo00 f40455OooOOO0 = new o00Oo00();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f40456OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f40457OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float f40458OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final String f40459OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f40460OooOOoo;

    public o000O00O(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f40456OooOOOO = 0;
            this.f40457OooOOOo = -1;
            this.f40459OooOOo0 = "sans-serif";
            this.f40454OooOOO = false;
            this.f40458OooOOo = 0.85f;
            this.f40460OooOOoo = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f40456OooOOOO = bArr[24];
        this.f40457OooOOOo = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
        int length = bArr.length - 43;
        int i = o0O00.f40595OooO00o;
        this.f40459OooOOo0 = "Serif".equals(new String(bArr, 43, length, OooO.f19059OooO0OO)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.f40460OooOOoo = i2;
        boolean z = (bArr[0] & 32) != 0;
        this.f40454OooOOO = z;
        if (z) {
            this.f40458OooOOo = o0O00.OooO0oo(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.f40458OooOOo = 0.85f;
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

    @Override // p230o00oOoO0.o0000OO0
    public final o000 OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        String strOooOo00;
        float f;
        int i2;
        o00Oo00 o00oo00 = this.f40455OooOOO0;
        o00oo00.OooOooo(i, bArr);
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        if (!(o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= 2)) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
        int iOooOoOO = o00oo00.OooOoOO();
        if (iOooOoOO == 0) {
            strOooOo00 = "";
        } else {
            int i6 = o00oo00.f40592OooO0O0;
            Charset charsetOooOoo = o00oo00.OooOoo();
            int i7 = iOooOoOO - (o00oo00.f40592OooO0O0 - i6);
            if (charsetOooOoo == null) {
                charsetOooOoo = OooO.f19059OooO0OO;
            }
            strOooOo00 = o00oo00.OooOo00(i7, charsetOooOoo);
        }
        if (strOooOo00.isEmpty()) {
            return o000O0.f40452OooO0o0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooOo00);
        OooO0oo(spannableStringBuilder, this.f40456OooOOOO, 0, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i8 = this.f40457OooOOOo;
        if (i8 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i8 & 255) << 24) | (i8 >>> 8)), 0, length, 16711713);
        }
        int length2 = spannableStringBuilder.length();
        String str = this.f40459OooOOo0;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fOooO0oo = this.f40458OooOOo;
        while (true) {
            int i9 = o00oo00.f40593OooO0OO;
            int i10 = o00oo00.f40592OooO0O0;
            if (i9 - i10 < 8) {
                float f2 = fOooO0oo;
                Cue.OooO00o oooO00o = new Cue.OooO00o();
                oooO00o.f13419OooO00o = spannableStringBuilder;
                oooO00o.f13424OooO0o0 = f2;
                oooO00o.f13423OooO0o = 0;
                oooO00o.f13425OooO0oO = 0;
                return new o000O0(oooO00o.OooO00o());
            }
            int iOooO0o = o00oo00.OooO0o();
            int iOooO0o2 = o00oo00.OooO0o();
            if (iOooO0o2 == 1937013100) {
                if ((o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= i3 ? i4 : i5) == 0) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                int iOooOoOO2 = o00oo00.OooOoOO();
                int i11 = i5;
                while (i5 < iOooOoOO2) {
                    if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= 12) {
                        i11 = i4;
                    }
                    if (i11 == 0) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    int iOooOoOO3 = o00oo00.OooOoOO();
                    int iOooOoOO4 = o00oo00.OooOoOO();
                    o00oo00.Oooo00o(i3);
                    int iOooOo0O = o00oo00.OooOo0O();
                    o00oo00.Oooo00o(i4);
                    int iOooO0o3 = o00oo00.OooO0o();
                    if (iOooOoOO4 > spannableStringBuilder.length()) {
                        StringBuilder sbOooO00o = o0000O0.OooO00o("Truncating styl end (", iOooOoOO4, ") to cueText.length() (");
                        sbOooO00o.append(spannableStringBuilder.length());
                        sbOooO00o.append(").");
                        Log.OooO0o("Tx3gDecoder", sbOooO00o.toString());
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
                        OooO0oo(spannableStringBuilder, iOooOo0O, this.f40456OooOOOO, iOooOoOO3, i12, 0);
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
                if (iOooO0o2 == 1952608120 && this.f40454OooOOO) {
                    i3 = 2;
                    if (!(o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= 2)) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    fOooO0oo = o0O00.OooO0oo(o00oo00.OooOoOO() / this.f40460OooOOoo, 0.0f, 0.95f);
                } else {
                    i3 = 2;
                    fOooO0oo = f3;
                }
            }
            o00oo00.Oooo00O(i10 + iOooO0o);
            i4 = 1;
            i5 = 0;
        }
    }
}
