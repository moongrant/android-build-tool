package p197o00o0OOo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f38941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38942OooO0O0;

    public o00O(int i, int i2) {
        this.f38941OooO00o = i;
        this.f38942OooO0O0 = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O)) {
            return false;
        }
        o00O o00o2 = (o00O) obj;
        return this.f38941OooO00o == o00o2.f38941OooO00o && this.f38942OooO0O0 == o00o2.f38942OooO0O0;
    }

    public final int hashCode() {
        return (this.f38941OooO00o * 31) + this.f38942OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInfo(textWidth=");
        sb.append(this.f38941OooO00o);
        sb.append(", containerWidth=");
        return OooOO0.OooO00o(sb, this.f38942OooO0O0, ")");
    }
}
