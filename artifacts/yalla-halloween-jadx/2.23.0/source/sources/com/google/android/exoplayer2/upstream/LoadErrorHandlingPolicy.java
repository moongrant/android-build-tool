package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface LoadErrorHandlingPolicy {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14184OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14185OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f14186OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f14187OooO0Oo;

        public OooO00o(int i, int i2, int i3, int i4) {
            this.f14184OooO00o = i;
            this.f14185OooO0O0 = i2;
            this.f14186OooO0OO = i3;
            this.f14187OooO0Oo = i4;
        }

        public final boolean OooO00o(int i) {
            if (i == 1) {
                if (this.f14184OooO00o - this.f14185OooO0O0 <= 1) {
                    return false;
                }
            } else if (this.f14186OooO0OO - this.f14187OooO0Oo <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14188OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f14189OooO0O0;

        public OooO0O0(int i, long j) {
            o00O000o.OooO00o(j >= 0);
            this.f14188OooO00o = i;
            this.f14189OooO0O0 = j;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final IOException f14190OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14191OooO0O0;

        public OooO0OO(IOException iOException, int i) {
            this.f14190OooO00o = iOException;
            this.f14191OooO0O0 = i;
        }
    }

    long OooO00o(OooO0OO oooO0OO);

    int OooO0O0(int i);

    @Nullable
    OooO0O0 OooO0OO(OooO00o oooO00o, OooO0OO oooO0OO);

    void OooO0Oo();
}
