package o0O0oo00;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.UByte;
import o0OOOO0o.OooO0o;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends o0000Ooo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000 f36892OooOOO = new o000();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f36893OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f36894OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f36895OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f36896OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f36897OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f36898OooOo00;

    public OooO00o(List<byte[]> list) {
        if (list == null || list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f36894OooOOOo = 0;
            this.f36896OooOOo0 = -1;
            this.f36895OooOOo = "sans-serif";
            this.f36893OooOOOO = false;
            this.f36897OooOOoo = 0.85f;
            return;
        }
        byte[] bArr = list.get(0);
        this.f36894OooOOOo = bArr[24];
        this.f36896OooOOo0 = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
        this.f36895OooOOo = "Serif".equals(o000OOo0.OooOOO0(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f36898OooOo00 = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f36893OooOOOO = z;
        if (!z) {
            this.f36897OooOOoo = 0.85f;
            return;
        }
        float f = ((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i;
        this.f36897OooOOoo = f;
        this.f36897OooOOoo = o000OOo0.OooO0oO(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.95f);
    }

    public static void OooOO0O(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    public static void OooOO0o(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    @Override // p324o0O0oo0O.o0000Ooo
    public final o0000O00 OooOO0(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        String strOooOOOO;
        this.f36892OooOOO.OooOoO0(bArr, i);
        o000 o000Var = this.f36892OooOOO;
        int i2 = 1;
        OooOO0O(o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 >= 2);
        int iOooOo0O = o000Var.OooOo0O();
        if (iOooOo0O == 0) {
            strOooOOOO = "";
        } else {
            int i3 = o000Var.f36663OooO0OO;
            int i4 = o000Var.f36662OooO0O0;
            if (i3 - i4 >= 2) {
                byte[] bArr2 = o000Var.f36661OooO00o;
                char c = (char) ((bArr2[i4 + 1] & UByte.MAX_VALUE) | ((bArr2[i4] & UByte.MAX_VALUE) << 8));
                if (c == 65279 || c == 65534) {
                    strOooOOOO = o000Var.OooOOOO(iOooOo0O, OooO0o.f38234OooO0o0);
                } else {
                    strOooOOOO = o000Var.OooOOOO(iOooOo0O, OooO0o.f38232OooO0OO);
                }
            } else {
                strOooOOOO = o000Var.OooOOOO(iOooOo0O, OooO0o.f38232OooO0OO);
            }
        }
        if (strOooOOOO.isEmpty()) {
            return OooO0O0.f36899Oooo0oO;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooOOOO);
        OooOO0o(spannableStringBuilder, this.f36894OooOOOo, 0, 0, spannableStringBuilder.length(), 16711680);
        int i5 = this.f36896OooOOo0;
        int length = spannableStringBuilder.length();
        if (i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), 0, length, 16711713);
        }
        String str = this.f36895OooOOo;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fOooO0oO = this.f36897OooOOoo;
        while (true) {
            o000 o000Var2 = this.f36892OooOOO;
            int i6 = o000Var2.f36663OooO0OO;
            int i7 = o000Var2.f36662OooO0O0;
            if (i6 - i7 < 8) {
                return new OooO0O0(new Cue(spannableStringBuilder, null, null, fOooO0oO, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE));
            }
            int iOooO0Oo = o000Var2.OooO0Oo();
            int iOooO0Oo2 = this.f36892OooOOO.OooO0Oo();
            if (iOooO0Oo2 == 1937013100) {
                o000 o000Var3 = this.f36892OooOOO;
                OooOO0O(o000Var3.f36663OooO0OO - o000Var3.f36662OooO0O0 >= 2);
                int iOooOo0O2 = this.f36892OooOOO.OooOo0O();
                int i8 = 0;
                while (i8 < iOooOo0O2) {
                    o000 o000Var4 = this.f36892OooOOO;
                    OooOO0O(o000Var4.f36663OooO0OO - o000Var4.f36662OooO0O0 >= 12);
                    int iOooOo0O3 = o000Var4.OooOo0O();
                    int iOooOo0O4 = o000Var4.OooOo0O();
                    o000Var4.OooOoo0(2);
                    int iOooOOo0 = o000Var4.OooOOo0();
                    o000Var4.OooOoo0(i2);
                    int iOooO0Oo3 = o000Var4.OooO0Oo();
                    int i9 = i8;
                    OooOO0o(spannableStringBuilder, iOooOOo0, this.f36894OooOOOo, iOooOo0O3, iOooOo0O4, 0);
                    if (iOooO0Oo3 != this.f36896OooOOo0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan((iOooO0Oo3 >>> 8) | ((iOooO0Oo3 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), iOooOo0O3, iOooOo0O4, 33);
                    }
                    i8 = i9 + 1;
                    i2 = 1;
                }
            } else if (iOooO0Oo2 == 1952608120 && this.f36893OooOOOO) {
                o000 o000Var5 = this.f36892OooOOO;
                OooOO0O(o000Var5.f36663OooO0OO - o000Var5.f36662OooO0O0 >= 2);
                fOooO0oO = o000OOo0.OooO0oO(this.f36892OooOOO.OooOo0O() / this.f36898OooOo00, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.95f);
            }
            this.f36892OooOOO.OooOoOO(i7 + iOooO0Oo);
            i2 = 1;
        }
    }
}
