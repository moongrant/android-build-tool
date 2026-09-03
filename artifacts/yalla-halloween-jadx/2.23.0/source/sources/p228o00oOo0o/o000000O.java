package p228o00oOo0o;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String[] f39920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f39921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f39922OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39923OooO0Oo;

    public o000000O(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f39920OooO00o = strArr;
        this.f39921OooO0O0 = iArr;
        this.f39922OooO0OO = strArr2;
        this.f39923OooO0Oo = i;
    }

    public final String OooO00o(String str, long j, long j2, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String[] strArr = this.f39920OooO00o;
            int i3 = this.f39923OooO0Oo;
            if (i2 >= i3) {
                sb.append(strArr[i3]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            int i4 = this.f39921OooO0O0[i2];
            if (i4 == 1) {
                sb.append(str);
            } else {
                String[] strArr2 = this.f39922OooO0OO;
                if (i4 == 2) {
                    sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j)));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, strArr2[i2], Integer.valueOf(i)));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }
}
