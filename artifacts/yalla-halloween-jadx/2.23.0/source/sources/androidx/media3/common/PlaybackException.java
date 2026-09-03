package androidx.media3.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    static {
        OooO0o.OooO0oO(0);
        OooO0o.OooO0oO(1);
        OooO0o.OooO0oO(2);
        OooO0o.OooO0oO(3);
        OooO0o.OooO0oO(4);
    }
}
