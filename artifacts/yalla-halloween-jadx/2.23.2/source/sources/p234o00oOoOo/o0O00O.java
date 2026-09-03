package p234o00oOoOo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p233o00oOoOO.o0OoOoOo;
import p238o00oOooo.o0O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O implements o0O0o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f39906OooO0OO = o0O00OOO.OooO00o("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Set<o0OoOoOo> f39907OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0O00O f39908OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final String f39909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f39910OooO0O0;

    static {
        String strOooO00o = o0O00OOO.OooO00o("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strOooO00o2 = o0O00OOO.OooO00o("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f39907OooO0Oo = Collections.unmodifiableSet(new HashSet(Arrays.asList(new o0OoOoOo("proto"), new o0OoOoOo("json"))));
        f39908OooO0o0 = new o0O00O(strOooO00o, strOooO00o2);
    }

    public o0O00O(@NonNull String str, @Nullable String str2) {
        this.f39909OooO00o = str;
        this.f39910OooO0O0 = str2;
    }

    @NonNull
    public static o0O00O OooO00o(@NonNull byte[] bArr) {
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
        return new o0O00O(str2, str3);
    }

    @Nullable
    public final byte[] OooO0O0() {
        String str = this.f39909OooO00o;
        String str2 = this.f39910OooO0O0;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
