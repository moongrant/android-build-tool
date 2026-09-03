package com.google.android.exoplayer2.decoder;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DecoderReuseEvaluation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f11680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo f11681OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo f11682OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f11683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f11684OooO0o0;

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

    public DecoderReuseEvaluation(String str, OooOo oooOo, OooOo oooOo2, int i, int i2) {
        o00O000o.OooO00o(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f11680OooO00o = str;
        oooOo.getClass();
        this.f11681OooO0O0 = oooOo;
        oooOo2.getClass();
        this.f11682OooO0OO = oooOo2;
        this.f11683OooO0Oo = i;
        this.f11684OooO0o0 = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DecoderReuseEvaluation.class != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
        return this.f11683OooO0Oo == decoderReuseEvaluation.f11683OooO0Oo && this.f11684OooO0o0 == decoderReuseEvaluation.f11684OooO0o0 && this.f11680OooO00o.equals(decoderReuseEvaluation.f11680OooO00o) && this.f11681OooO0O0.equals(decoderReuseEvaluation.f11681OooO0O0) && this.f11682OooO0OO.equals(decoderReuseEvaluation.f11682OooO0OO);
    }

    public final int hashCode() {
        return this.f11682OooO0OO.hashCode() + ((this.f11681OooO0O0.hashCode() + o0OO00O.OooO00o(this.f11680OooO00o, (((this.f11683OooO0Oo + 527) * 31) + this.f11684OooO0o0) * 31, 31)) * 31);
    }
}
