package p100o000oOoo;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.base.OooOO0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p092o000o0O0.o0OO00O;
import p092o000o0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000O00 extends o0Oo0oo {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000O000 f35350OooOOO0 = new o000O000();

    @Override // p092o000o0O0.o0Oo0oo
    public final o0OO00O OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        Cue cueOooO00o;
        o000O000 o000o001 = this.f35350OooOOO0;
        o000o001.OooOooo(i, bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            if (i2 <= 0) {
                return new o000O00O(arrayList);
            }
            if (i2 < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iOooO0o = o000o001.OooO0o();
            if (o000o001.OooO0o() == 1987343459) {
                int i3 = iOooO0o - 8;
                CharSequence charSequenceOooO0o = null;
                Cue.OooO00o OooO00o2 = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iOooO0o2 = o000o001.OooO0o();
                    int iOooO0o3 = o000o001.OooO0o();
                    int i4 = iOooO0o2 - 8;
                    byte[] bArr2 = o000o001.f34962OooO00o;
                    int i5 = o000o001.f34963OooO0O0;
                    int i6 = o00.f34910OooO00o;
                    String str = new String(bArr2, i5, i4, OooOO0.f18592OooO0OO);
                    o000o001.Oooo00o(i4);
                    i3 = (i3 - 8) - i4;
                    if (iOooO0o3 == 1937011815) {
                        o000O0O0.OooO0o oooO0o = new o000O0O0.OooO0o();
                        o000O0O0.OooO0o0(str, oooO0o);
                        OooO00o2 = oooO0o.OooO00o();
                    } else if (iOooO0o3 == 1885436268) {
                        charSequenceOooO0o = o000O0O0.OooO0o(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceOooO0o == null) {
                    charSequenceOooO0o = "";
                }
                if (OooO00o2 != null) {
                    OooO00o2.f6915OooO00o = charSequenceOooO0o;
                    cueOooO00o = OooO00o2.OooO00o();
                } else {
                    Pattern pattern = o000O0O0.f35352OooO00o;
                    o000O0O0.OooO0o oooO0o2 = new o000O0O0.OooO0o();
                    oooO0o2.f35368OooO0OO = charSequenceOooO0o;
                    cueOooO00o = oooO0o2.OooO00o().OooO00o();
                }
                arrayList.add(cueOooO00o);
            } else {
                o000o001.Oooo00o(iOooO0o - 8);
            }
        }
    }
}
