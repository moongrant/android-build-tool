package p190o00o0O00;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import o0000O00.OooO00o;
import p176o00o0.OooOo;
import p191o00o0O0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f38855OooO0OO = OooO00o.OooO0OO("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Set<OooOo> f38856OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO f38857OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final String f38858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f38859OooO0O0;

    static {
        String strOooO0OO = OooO00o.OooO0OO("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strOooO0OO2 = OooO00o.OooO0OO("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f38856OooO0Oo = Collections.unmodifiableSet(new HashSet(Arrays.asList(new OooOo("proto"), new OooOo("json"))));
        f38857OooO0o0 = new OooO(strOooO0OO, strOooO0OO2);
    }

    public OooO(@NonNull String str, @Nullable String str2) {
        this.f38858OooO00o = str;
        this.f38859OooO0O0 = str2;
    }

    @NonNull
    public static OooO OooO00o(@NonNull byte[] bArr) {
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
        return new OooO(str2, str3);
    }

    @Nullable
    public final byte[] OooO0O0() {
        String str = this.f38858OooO00o;
        String str2 = this.f38859OooO0O0;
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
