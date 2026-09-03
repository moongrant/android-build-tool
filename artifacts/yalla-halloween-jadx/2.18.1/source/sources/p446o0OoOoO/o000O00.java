package p446o0OoOoO;

import com.google.android.gms.internal.common.zzab;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class o000O00 extends zzab {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object[] f40257OooO00o = new Object[4];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f40258OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f40259OooO0OO;

    @CanIgnoreReturnValue
    public final o000O00 zza(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.f40258OooO0O0 + 1;
        Object[] objArr = this.f40257OooO00o;
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
            this.f40257OooO00o = Arrays.copyOf(objArr, i2);
            this.f40259OooO0OO = false;
        } else if (this.f40259OooO0OO) {
            this.f40257OooO00o = (Object[]) objArr.clone();
            this.f40259OooO0OO = false;
        }
        Object[] objArr2 = this.f40257OooO00o;
        int i3 = this.f40258OooO0O0;
        this.f40258OooO0O0 = i3 + 1;
        objArr2[i3] = obj;
        return this;
    }
}
