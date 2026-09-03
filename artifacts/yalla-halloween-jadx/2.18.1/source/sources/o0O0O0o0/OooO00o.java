package o0O0O0o0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p286o0O0O0oO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements o00Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f35418OooO0OO = o000OO.OooO00o.OooO0O0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Set<o0O0O0Oo.OooO0O0> f35419OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f35420OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final String f35421OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f35422OooO0O0;

    static {
        String strOooO0O0 = o000OO.OooO00o.OooO0O0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strOooO0O1 = o000OO.OooO00o.OooO0O0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f35419OooO0Oo = Collections.unmodifiableSet(new HashSet(Arrays.asList(new o0O0O0Oo.OooO0O0("proto"), new o0O0O0Oo.OooO0O0("json"))));
        f35420OooO0o0 = new OooO00o(strOooO0O0, strOooO0O1);
    }

    public OooO00o(@NonNull String str, @Nullable String str2) {
        this.f35421OooO00o = str;
        this.f35422OooO0O0 = str2;
    }

    @NonNull
    public static OooO00o OooO00o(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new OooO00o(str2, str3);
    }

    @Nullable
    public final byte[] OooO0O0() {
        String str = this.f35422OooO0O0;
        if (str == null && this.f35421OooO00o == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f35421OooO00o;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
