package p319o0O0oOo0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.trackselection.OooO0OO;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f36755OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO[] f36756OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36757OooO0OO;

    public o0000O(OooO0OO... oooO0OOArr) {
        this.f36756OooO0O0 = oooO0OOArr;
        this.f36755OooO00o = oooO0OOArr.length;
    }

    public final OooO0OO[] OooO00o() {
        return (OooO0OO[]) this.f36756OooO0O0.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0000O.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f36756OooO0O0, ((o0000O) obj).f36756OooO0O0);
    }

    public final int hashCode() {
        if (this.f36757OooO0OO == 0) {
            this.f36757OooO0OO = 527 + Arrays.hashCode(this.f36756OooO0O0);
        }
        return this.f36757OooO0OO;
    }
}
