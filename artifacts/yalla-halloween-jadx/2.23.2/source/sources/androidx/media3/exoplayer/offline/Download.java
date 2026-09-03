package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p072o000O0oO.o000000O;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Download {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DownloadRequest f7765OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f7766OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f7767OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f7768OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f7769OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f7770OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f7771OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000000O f7772OooO0oo;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(DownloadRequest downloadRequest, int i, long j, long j2, int i2) {
        this(downloadRequest, i, j, j2, -1L, i2, 0, new o000000O());
    }

    public Download(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, o000000O o000000o2) {
        o000000o2.getClass();
        o00Oo0.OooO00o((i3 == 0) == (i != 4));
        if (i2 != 0) {
            o00Oo0.OooO00o((i == 2 || i == 0) ? false : true);
        }
        this.f7765OooO00o = downloadRequest;
        this.f7766OooO0O0 = i;
        this.f7767OooO0OO = j;
        this.f7768OooO0Oo = j2;
        this.f7770OooO0o0 = j3;
        this.f7769OooO0o = i2;
        this.f7771OooO0oO = i3;
        this.f7772OooO0oo = o000000o2;
    }
}
