package p269o00oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f40423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f40424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f40425OooO0OO;

    public o0O0OO0(Object obj, Object obj2, Object obj3) {
        this.f40423OooO00o = obj;
        this.f40424OooO0O0 = obj2;
        this.f40425OooO0OO = obj3;
    }

    public final IllegalArgumentException OooO00o() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f40423OooO00o;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f40424OooO0O0);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f40425OooO0OO);
        return new IllegalArgumentException(sb.toString());
    }
}
