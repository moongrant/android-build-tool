package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f14181OooO0o;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.f14181OooO0o = 1;
    }

    public static HttpDataSource$HttpDataSourceException OooO00o(final IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = ZegoConstants.StreamUpdateType.Deleted;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !com.google.common.base.OooO0OO.OooO0O0(message).matches("cleartext.*not permitted.*")) ? ZegoConstants.StreamUpdateType.Added : 2007;
        }
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i) {
        super(str, i == 2000 ? ZegoConstants.StreamUpdateType.Added : i);
        this.f14181OooO0o = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = ZegoConstants.StreamUpdateType.Added;
        }
        super(i, iOException);
        this.f14181OooO0o = i2;
    }

    public HttpDataSource$HttpDataSourceException(String str, @Nullable IOException iOException, int i) {
        super(iOException, i == 2000 ? ZegoConstants.StreamUpdateType.Added : i, str);
        this.f14181OooO0o = 1;
    }
}
