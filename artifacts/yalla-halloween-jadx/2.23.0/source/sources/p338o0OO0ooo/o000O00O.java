package p338o0OO0ooo;

import com.squareup.okhttp.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O {
    public static String OooO00o(o0OoOo0 o0oooo0) {
        int length = o0oooo0.f21631OooO00o.length() + 3;
        String str = o0oooo0.f21638OooO0oo;
        int iIndexOf = str.indexOf(47, length);
        String strSubstring = str.substring(iIndexOf, o0OoOo0.OooO0Oo(iIndexOf, str.length(), str, "?#"));
        String strOooO0o0 = o0oooo0.OooO0o0();
        if (strOooO0o0 == null) {
            return strSubstring;
        }
        return strSubstring + '?' + strOooO0o0;
    }
}
