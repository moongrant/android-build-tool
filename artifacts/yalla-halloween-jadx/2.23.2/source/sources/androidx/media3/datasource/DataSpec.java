package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p069o0000ooO.o0000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSpec {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f6968OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f6969OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f6970OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f6971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f6972OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final byte[] f6973OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f6974OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<String, String> f6975OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f6976OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f6977OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Object f6978OooOO0;

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

    static {
        o0000.OooO00o("media3.datasource");
    }

    public DataSpec(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        o00Oo0.OooO00o(j + j2 >= 0);
        o00Oo0.OooO00o(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        o00Oo0.OooO00o(z);
        this.f6970OooO00o = uri;
        this.f6971OooO0O0 = j;
        this.f6972OooO0OO = i;
        this.f6973OooO0Oo = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f6975OooO0o0 = Collections.unmodifiableMap(new HashMap(map));
        this.f6974OooO0o = j2;
        this.f6976OooO0oO = j3;
        this.f6977OooO0oo = str;
        this.f6969OooO = i2;
        this.f6978OooOO0 = obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f6972OooO0OO;
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
        sb.append(this.f6970OooO00o);
        sb.append(", ");
        sb.append(this.f6974OooO0o);
        sb.append(", ");
        sb.append(this.f6976OooO0oO);
        sb.append(", ");
        sb.append(this.f6977OooO0oo);
        sb.append(", ");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f6969OooO, "]");
    }
}
