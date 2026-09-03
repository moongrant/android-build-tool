package p347o0OOO0o0;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00oO0o implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f38176OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f38177OooO0O0;

    public o00oO0o(float f, @NonNull o0ooOOo o0ooooo2) {
        while (o0ooooo2 instanceof o00oO0o) {
            o0ooooo2 = ((o00oO0o) o0ooooo2).f38176OooO00o;
            f += ((o00oO0o) o0ooooo2).f38177OooO0O0;
        }
        this.f38176OooO00o = o0ooooo2;
        this.f38177OooO0O0 = f;
    }

    @Override // p347o0OOO0o0.o0ooOOo
    public final float OooO00o(@NonNull RectF rectF) {
        return Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f38176OooO00o.OooO00o(rectF) + this.f38177OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00oO0o)) {
            return false;
        }
        o00oO0o o00oo0o2 = (o00oO0o) obj;
        return this.f38176OooO00o.equals(o00oo0o2.f38176OooO00o) && this.f38177OooO0O0 == o00oo0o2.f38177OooO0O0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38176OooO00o, Float.valueOf(this.f38177OooO0O0)});
    }
}
