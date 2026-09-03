package com.squareup.okhttp;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String[] f21591OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f21592OooO00o = new ArrayList(20);

        public static void OooO0Oo(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i2), str2));
                }
            }
        }

        public final void OooO00o(String str, String str2) {
            OooO0Oo(str, str2);
            OooO0OO(str, str2);
        }

        public final void OooO0O0(String str) {
            int iIndexOf = str.indexOf(CertificateUtil.DELIMITER, 1);
            if (iIndexOf != -1) {
                OooO0OO(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            } else if (str.startsWith(CertificateUtil.DELIMITER)) {
                OooO0OO("", str.substring(1));
            } else {
                OooO0OO("", str);
            }
        }

        public final void OooO0OO(String str, String str2) {
            ArrayList arrayList = this.f21592OooO00o;
            arrayList.add(str);
            arrayList.add(str2.trim());
        }

        public final void OooO0o(String str, String str2) {
            OooO0Oo(str, str2);
            OooO0o0(str);
            OooO0OO(str, str2);
        }

        public final void OooO0o0(String str) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f21592OooO00o;
                if (i >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    public o000oOoO(OooO00o oooO00o) {
        ArrayList arrayList = oooO00o.f21592OooO00o;
        this.f21591OooO00o = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String OooO00o(String str) {
        String[] strArr = this.f21591OooO00o;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String OooO0O0(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f21591OooO00o;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public final OooO00o OooO0OO() {
        OooO00o oooO00o = new OooO00o();
        Collections.addAll(oooO00o.f21592OooO00o, this.f21591OooO00o);
        return oooO00o;
    }

    public final String OooO0Oo(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f21591OooO00o;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public final List<String> OooO0o0(String str) {
        int length = this.f21591OooO00o.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(OooO0O0(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(OooO0Oo(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f21591OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(OooO0O0(i));
            sb.append(": ");
            sb.append(OooO0Oo(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
