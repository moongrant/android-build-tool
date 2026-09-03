package p228o00oOo0o;

import androidx.annotation.Nullable;
import com.google.common.base.Oooo000;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39935OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f39936OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39937OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39938OooO0Oo;

    public o00Oo0(int i, int i2, String str, String str2) {
        this.f39935OooO00o = str;
        this.f39936OooO0O0 = str2;
        this.f39937OooO0OO = i;
        this.f39938OooO0Oo = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo1 = (o00Oo0) obj;
        return this.f39937OooO0OO == o00oo1.f39937OooO0OO && this.f39938OooO0Oo == o00oo1.f39938OooO0Oo && Oooo000.OooO00o(this.f39935OooO00o, o00oo1.f39935OooO00o) && Oooo000.OooO00o(this.f39936OooO0O0, o00oo1.f39936OooO0O0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39935OooO00o, this.f39936OooO0O0, Integer.valueOf(this.f39937OooO0OO), Integer.valueOf(this.f39938OooO0Oo)});
    }
}
