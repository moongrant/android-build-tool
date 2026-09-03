package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DecoderReuseEvaluation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f7100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.media3.common.OooOO0 f7101OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final androidx.media3.common.OooOO0 f7102OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f7103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f7104OooO0o0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, androidx.media3.common.OooOO0 oooOO1, androidx.media3.common.OooOO0 oooOO2, int i, int i2) {
        o00Oo0.OooO00o(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f7100OooO00o = str;
        oooOO1.getClass();
        this.f7101OooO0O0 = oooOO1;
        oooOO2.getClass();
        this.f7102OooO0OO = oooOO2;
        this.f7103OooO0Oo = i;
        this.f7104OooO0o0 = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DecoderReuseEvaluation.class != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
        return this.f7103OooO0Oo == decoderReuseEvaluation.f7103OooO0Oo && this.f7104OooO0o0 == decoderReuseEvaluation.f7104OooO0o0 && this.f7100OooO00o.equals(decoderReuseEvaluation.f7100OooO00o) && this.f7101OooO0O0.equals(decoderReuseEvaluation.f7101OooO0O0) && this.f7102OooO0OO.equals(decoderReuseEvaluation.f7102OooO0OO);
    }

    public final int hashCode() {
        return this.f7102OooO0OO.hashCode() + ((this.f7101OooO0O0.hashCode() + androidx.compose.animation.OooO0O0.OooO00o(this.f7100OooO00o, (((this.f7103OooO0Oo + 527) * 31) + this.f7104OooO0o0) * 31, 31)) * 31);
    }
}
