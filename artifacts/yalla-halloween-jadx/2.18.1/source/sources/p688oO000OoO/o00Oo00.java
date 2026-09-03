package p688oO000OoO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f52680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f52681OooO0O0;

    public o00Oo00(String str, String str2) {
        this.f52680OooO00o = str;
        this.f52681OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (!(obj instanceof o00Oo00)) {
            return false;
        }
        o00Oo00 o00oo00 = (o00Oo00) obj;
        if (o00oo00 != this) {
            String str = this.f52680OooO00o;
            String str2 = o00oo00.f52680OooO00o;
            if (str == str2) {
                zEquals = true;
            } else {
                zEquals = (str == null || str2 == null) ? false : str.equals(str2);
            }
            if (!zEquals) {
                return false;
            }
            String str3 = this.f52681OooO0O0;
            String str4 = o00oo00.f52681OooO0O0;
            if (str3 == str4) {
                zEquals2 = true;
            } else {
                zEquals2 = (str3 == null || str4 == null) ? false : str3.equals(str4);
            }
            if (!zEquals2) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f52680OooO00o;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this.f52681OooO0O0;
        return ((str2 != null ? str2.hashCode() : 1) * 31) + iHashCode;
    }
}
