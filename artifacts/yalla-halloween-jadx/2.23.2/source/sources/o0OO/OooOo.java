package o0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {
    public static String OooO00o(com.squareup.okhttp.o000oOoO o000oooo2) {
        int length = o000oooo2.f21121OooO00o.length() + 3;
        String str = o000oooo2.f21128OooO0oo;
        int iIndexOf = str.indexOf(47, length);
        String strSubstring = str.substring(iIndexOf, com.squareup.okhttp.o000oOoO.OooO0Oo(iIndexOf, str.length(), str, "?#"));
        String strOooO0o0 = o000oooo2.OooO0o0();
        if (strOooO0o0 == null) {
            return strSubstring;
        }
        return strSubstring + '?' + strOooO0o0;
    }
}
