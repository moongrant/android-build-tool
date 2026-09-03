package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p265o00ooo00.Oooo0;
import p709oo0oOOo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpDataSource extends com.google.android.exoplayer2.upstream.OooO00o {

    public static class HttpDataSourceException extends IOException {

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException(String str) {
            super(str);
        }

        public HttpDataSourceException(IOException iOException) {
            super(iOException);
        }

        public HttpDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f14814Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Map<String, List<String>> f14815Oooo0oO;

        public InvalidResponseCodeException(int i, Map map, DataSpec dataSpec) {
            super(Oooo0.OooO00o(26, "Response code: ", i));
            this.f14814Oooo0o = i;
            this.f14815Oooo0oO = map;
        }
    }

    public static abstract class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f14816OooO00o = new OooO0OO();

        @Override // com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0104OooO00o
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final HttpDataSource OooO00o() {
            OooO oooO = (OooO) this;
            OooO0o oooO0o = new OooO0o(oooO.f14837OooO0O0, oooO.f14839OooO0Oo, oooO.f14840OooO0o0, false, this.f14816OooO00o);
            o000oOoO o000oooo2 = oooO.f14838OooO0OO;
            if (o000oooo2 != null) {
                oooO0o.OooOO0O(o000oooo2);
            }
            return oooO0o;
        }
    }

    public interface OooO0O0 extends com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0104OooO00o {
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<String, String> f14817OooO00o = new HashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Map<String, String> f14818OooO0O0;

        public final synchronized Map<String, String> OooO00o() {
            if (this.f14818OooO0O0 == null) {
                this.f14818OooO0O0 = Collections.unmodifiableMap(new HashMap(this.f14817OooO00o));
            }
            return this.f14818OooO0O0;
        }
    }
}
