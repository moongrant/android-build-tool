package p293o0O0Oo0O;

import android.media.AudioAttributes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOOO0 f35743OooO0o = new OooOOO0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35744OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35745OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f35746OooO0OO = 1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f35747OooO0Oo = 1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public AudioAttributes f35748OooO0o0;

    @RequiresApi(21)
    public final AudioAttributes OooO00o() {
        if (this.f35748OooO0o0 == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f35744OooO00o).setFlags(this.f35745OooO0O0).setUsage(this.f35746OooO0OO);
            if (o000OOo0.f36740OooO00o >= 29) {
                usage.setAllowedCapturePolicy(this.f35747OooO0Oo);
            }
            this.f35748OooO0o0 = usage.build();
        }
        return this.f35748OooO0o0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOOO0.class != obj.getClass()) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return this.f35744OooO00o == oooOOO0.f35744OooO00o && this.f35745OooO0O0 == oooOOO0.f35745OooO0O0 && this.f35746OooO0OO == oooOOO0.f35746OooO0OO && this.f35747OooO0Oo == oooOOO0.f35747OooO0Oo;
    }

    public final int hashCode() {
        return ((((((527 + this.f35744OooO00o) * 31) + this.f35745OooO0O0) * 31) + this.f35746OooO0OO) * 31) + this.f35747OooO0Oo;
    }
}
