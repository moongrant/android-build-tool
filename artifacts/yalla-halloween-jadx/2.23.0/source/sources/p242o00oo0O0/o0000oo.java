package p242o00oo0O0;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.base.OooO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p230o00oOoO0.o000;
import p230o00oOoO0.o0000OO0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000oo extends o0000OO0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00Oo00 f40444OooOOO0 = new o00Oo00();

    @Override // p230o00oOoO0.o0000OO0
    public final o000 OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        Cue cueOooO00o;
        o00Oo00 o00oo00 = this.f40444OooOOO0;
        o00oo00.OooOooo(i, bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            if (i2 <= 0) {
                return new o0000O0(arrayList);
            }
            if (i2 < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iOooO0o = o00oo00.OooO0o();
            if (o00oo00.OooO0o() == 1987343459) {
                int i3 = iOooO0o - 8;
                CharSequence charSequenceOooO0o = null;
                Cue.OooO00o OooO00o2 = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iOooO0o2 = o00oo00.OooO0o();
                    int iOooO0o3 = o00oo00.OooO0o();
                    int i4 = iOooO0o2 - 8;
                    byte[] bArr2 = o00oo00.f40591OooO00o;
                    int i5 = o00oo00.f40592OooO0O0;
                    int i6 = o0O00.f40595OooO00o;
                    String str = new String(bArr2, i5, i4, OooO.f19059OooO0OO);
                    o00oo00.Oooo00o(i4);
                    i3 = (i3 - 8) - i4;
                    if (iOooO0o3 == 1937011815) {
                        o0000OO0.OooO0o oooO0o = new o0000OO0.OooO0o();
                        o0000OO0.OooO0o0(str, oooO0o);
                        OooO00o2 = oooO0o.OooO00o();
                    } else if (iOooO0o3 == 1885436268) {
                        charSequenceOooO0o = o0000OO0.OooO0o(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceOooO0o == null) {
                    charSequenceOooO0o = "";
                }
                if (OooO00o2 != null) {
                    OooO00o2.f13419OooO00o = charSequenceOooO0o;
                    cueOooO00o = OooO00o2.OooO00o();
                } else {
                    Pattern pattern = o0000OO0.f40420OooO00o;
                    o0000OO0.OooO0o oooO0o2 = new o0000OO0.OooO0o();
                    oooO0o2.f40436OooO0OO = charSequenceOooO0o;
                    cueOooO00o = oooO0o2.OooO00o().OooO00o();
                }
                arrayList.add(cueOooO00o);
            } else {
                o00oo00.Oooo00o(iOooO0o - 8);
            }
        }
    }
}
