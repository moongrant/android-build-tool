package p317o0O0oOOO;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o extends o0000Ooo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000 f36628OooOOO = new o000();

    @Override // p324o0O0oo0O.o0000Ooo
    public final o0000O00 OooOO0(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        Cue cueOooO00o;
        this.f36628OooOOO.OooOoO0(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            o000 o000Var = this.f36628OooOOO;
            int i2 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            if (i2 <= 0) {
                return new o00O00(arrayList);
            }
            if (i2 < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iOooO0Oo = o000Var.OooO0Oo();
            if (this.f36628OooOOO.OooO0Oo() == 1987343459) {
                o000 o000Var2 = this.f36628OooOOO;
                int i3 = iOooO0Oo - 8;
                CharSequence charSequenceOooO0o = null;
                Cue.OooO00o OooO00o2 = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iOooO0Oo2 = o000Var2.OooO0Oo();
                    int iOooO0Oo3 = o000Var2.OooO0Oo();
                    int i4 = iOooO0Oo2 - 8;
                    String strOooOOO0 = o000OOo0.OooOOO0(o000Var2.f36661OooO00o, o000Var2.f36662OooO0O0, i4);
                    o000Var2.OooOoo0(i4);
                    i3 = (i3 - 8) - i4;
                    if (iOooO0Oo3 == 1937011815) {
                        Pattern pattern = o00O00OO.f36632OooO00o;
                        o00O00OO.OooO0o oooO0o = new o00O00OO.OooO0o();
                        o00O00OO.OooO0o0(strOooOOO0, oooO0o);
                        OooO00o2 = oooO0o.OooO00o();
                    } else if (iOooO0Oo3 == 1885436268) {
                        charSequenceOooO0o = o00O00OO.OooO0o(null, strOooOOO0.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceOooO0o == null) {
                    charSequenceOooO0o = "";
                }
                if (OooO00o2 != null) {
                    OooO00o2.f14634OooO00o = charSequenceOooO0o;
                    cueOooO00o = OooO00o2.OooO00o();
                } else {
                    Pattern pattern2 = o00O00OO.f36632OooO00o;
                    o00O00OO.OooO0o oooO0o2 = new o00O00OO.OooO0o();
                    oooO0o2.f36647OooO0OO = charSequenceOooO0o;
                    cueOooO00o = oooO0o2.OooO00o().OooO00o();
                }
                arrayList.add(cueOooO00o);
            } else {
                this.f36628OooOOO.OooOoo0(iOooO0Oo - 8);
            }
        }
    }
}
