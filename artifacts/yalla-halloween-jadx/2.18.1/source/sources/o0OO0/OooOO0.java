package o0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f37200OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f37201OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f37202OooO0OO;

    public OooOO0(Object obj, Object obj2, Object obj3) {
        this.f37200OooO00o = obj;
        this.f37201OooO0O0 = obj2;
        this.f37202OooO0OO = obj3;
    }

    public final IllegalArgumentException OooO00o() {
        String strValueOf = String.valueOf(this.f37200OooO00o);
        String strValueOf2 = String.valueOf(this.f37201OooO0O0);
        String strValueOf3 = String.valueOf(this.f37200OooO00o);
        String strValueOf4 = String.valueOf(this.f37202OooO0OO);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + strValueOf3.length() + strValueOf4.length());
        OooO0O0.OooO0O0.OooO00o(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
