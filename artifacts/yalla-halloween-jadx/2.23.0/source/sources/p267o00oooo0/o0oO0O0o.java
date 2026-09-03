package p267o00oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f41096OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f41097OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f41098OooO0OO;

    public o0oO0O0o(Object obj, Object obj2, Object obj3) {
        this.f41096OooO00o = obj;
        this.f41097OooO0O0 = obj2;
        this.f41098OooO0OO = obj3;
    }

    public final IllegalArgumentException OooO00o() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f41096OooO00o;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f41097OooO0O0);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f41098OooO0OO);
        return new IllegalArgumentException(sb.toString());
    }
}
