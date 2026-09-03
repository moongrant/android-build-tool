package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p203o00o0o0o.o00OOO0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DataSpec {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f14159OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f14160OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f14161OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f14162OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f14163OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final byte[] f14164OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f14165OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<String, String> f14166OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f14167OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f14168OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Object f14169OooOO0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Uri f14170OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f14173OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public String f14174OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f14176OooO0oO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14171OooO0O0 = 1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Map<String, String> f14172OooO0OO = Collections.emptyMap();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f14175OooO0o0 = -1;

        public final DataSpec OooO00o() {
            o00O000o.OooO0o(this.f14170OooO00o, "The uri must be set.");
            return new DataSpec(this.f14170OooO00o, 0L, this.f14171OooO0O0, null, this.f14172OooO0OO, this.f14173OooO0Oo, this.f14175OooO0o0, this.f14174OooO0o, this.f14176OooO0oO, null);
        }

        @CanIgnoreReturnValue
        public final void OooO0O0(int i) {
            this.f14176OooO0oO = i;
        }

        @CanIgnoreReturnValue
        public final void OooO0OO(@Nullable String str) {
            this.f14174OooO0o = str;
        }
    }

    static {
        o00OOO0.OooO00o("goog.exo.datasource");
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    public final DataSpec OooO00o(long j, long j2) {
        return (j == 0 && this.f14167OooO0oO == j2) ? this : new DataSpec(this.f14161OooO00o, this.f14162OooO0O0, this.f14163OooO0OO, this.f14164OooO0Oo, this.f14166OooO0o0, this.f14165OooO0o + j, j2, this.f14168OooO0oo, this.f14160OooO, this.f14169OooOO0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f14163OooO0OO;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(this.f14161OooO00o);
        sb.append(", ");
        sb.append(this.f14165OooO0o);
        sb.append(", ");
        sb.append(this.f14167OooO0oO);
        sb.append(", ");
        sb.append(this.f14168OooO0oo);
        sb.append(", ");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f14160OooO, "]");
    }

    public DataSpec(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        o00O000o.OooO00o(j + j2 >= 0);
        o00O000o.OooO00o(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        o00O000o.OooO00o(z);
        this.f14161OooO00o = uri;
        this.f14162OooO0O0 = j;
        this.f14163OooO0OO = i;
        this.f14164OooO0Oo = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14166OooO0o0 = Collections.unmodifiableMap(new HashMap(map));
        this.f14165OooO0o = j2;
        this.f14167OooO0oO = j3;
        this.f14168OooO0oo = str;
        this.f14160OooO = i2;
        this.f14169OooOO0 = obj;
    }
}
