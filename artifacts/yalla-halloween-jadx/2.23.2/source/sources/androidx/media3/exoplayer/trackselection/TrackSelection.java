package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.OooOO0;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface TrackSelection {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    OooOO0 OooO0O0(int i);

    int OooO0OO(int i);

    int OooO0oO(int i);

    o000oOoO OooO0oo();

    int length();
}
