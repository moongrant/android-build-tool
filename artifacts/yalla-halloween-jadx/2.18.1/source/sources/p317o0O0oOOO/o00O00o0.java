package p317o0O0oOOO;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p318o0O0oOo.o000;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00o0 extends o0000Ooo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000 f36655OooOOO = new o000();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o00O000 f36656OooOOOO = new o00O000();

    @Override // p324o0O0oo0O.o0000Ooo
    public final o0000O00 OooOO0(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f36655OooOOO.OooOoO0(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            oo00o.OooO0OO(this.f36655OooOOO);
            while (!TextUtils.isEmpty(this.f36655OooOOO.OooO0o0())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                o000 o000Var = this.f36655OooOOO;
                byte b = -1;
                int i2 = 0;
                while (b == -1) {
                    i2 = o000Var.f36662OooO0O0;
                    String strOooO0o0 = o000Var.OooO0o0();
                    if (strOooO0o0 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strOooO0o0)) {
                        b = 2;
                    } else {
                        b = strOooO0o0.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                o000Var.OooOoOO(i2);
                if (b == 0) {
                    return new o00O0O00(arrayList2);
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(this.f36655OooOOO.OooO0o0())) {
                    }
                } else if (b == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f36655OooOOO.OooO0o0();
                    arrayList.addAll(this.f36656OooOOOO.OooO00o(this.f36655OooOOO));
                } else if (b == 3) {
                    o000 o000Var2 = this.f36655OooOOO;
                    Pattern pattern = o00O00OO.f36632OooO00o;
                    String strOooO0o1 = o000Var2.OooO0o0();
                    o00O00O o00o00oOooO0Oo = null;
                    if (strOooO0o1 != null) {
                        Pattern pattern2 = o00O00OO.f36632OooO00o;
                        Matcher matcher = pattern2.matcher(strOooO0o1);
                        if (matcher.matches()) {
                            o00o00oOooO0Oo = o00O00OO.OooO0Oo(null, matcher, o000Var2, arrayList);
                        } else {
                            String strOooO0o2 = o000Var2.OooO0o0();
                            if (strOooO0o2 != null) {
                                Matcher matcher2 = pattern2.matcher(strOooO0o2);
                                if (matcher2.matches()) {
                                    o00o00oOooO0Oo = o00O00OO.OooO0Oo(strOooO0o1.trim(), matcher2, o000Var2, arrayList);
                                }
                            }
                        }
                    }
                    if (o00o00oOooO0Oo != null) {
                        arrayList2.add(o00o00oOooO0Oo);
                    }
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
