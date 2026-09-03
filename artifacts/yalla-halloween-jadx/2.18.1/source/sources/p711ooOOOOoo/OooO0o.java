package p711ooOOOOoo;

import oO000Oo.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f53511OooO00o;

    public OooO0o(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f53511OooO00o = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0o) {
            return OooO00o.OooO0O0(this.f53511OooO00o, ((OooO0o) obj).f53511OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return OooO00o.OooO0oo(this.f53511OooO00o);
    }
}
