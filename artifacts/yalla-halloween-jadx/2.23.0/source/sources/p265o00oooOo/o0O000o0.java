package p265o00oooOo;

import com.google.android.gms.internal.common.zzab;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class o0O000o0 extends zzab {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object[] f41071OooO00o = new Object[4];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f41072OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f41073OooO0OO;

    @CanIgnoreReturnValue
    public final o0O000o0 zza(Object obj) {
        obj.getClass();
        int i = this.f41072OooO0O0 + 1;
        Object[] objArr = this.f41071OooO00o;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int iHighestOneBit = Integer.highestOneBit(i - 1);
                i2 = iHighestOneBit + iHighestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f41071OooO00o = Arrays.copyOf(objArr, i2);
            this.f41073OooO0OO = false;
        } else if (this.f41073OooO0OO) {
            this.f41071OooO00o = (Object[]) objArr.clone();
            this.f41073OooO0OO = false;
        }
        Object[] objArr2 = this.f41071OooO00o;
        int i3 = this.f41072OooO0O0;
        this.f41072OooO0O0 = i3 + 1;
        objArr2[i3] = obj;
        return this;
    }
}
