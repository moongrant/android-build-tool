package androidx.media3.common;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p069o0000ooO.o00000;
import p069o0000ooO.o00000O;
import p069o0000ooO.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public interface Player {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    o000.OooO00o OooO();

    o00000 OooO00o();

    void OooO0O0();

    void OooO0OO();

    boolean OooO0Oo();

    void OooO0o();

    void OooO0oO();

    o00000OO OooO0oo();

    OooO0OO OooOO0();

    Looper OooOO0O();

    o00000O OooOO0o();

    boolean OooOOO();

    void OooOOO0();

    long OooOOOO();

    long OooOOo();

    long OooOOo0();

    int OooOOoo();

    void OooOo();

    int OooOo0();

    int OooOo00();

    boolean OooOo0O();

    long OooOo0o();

    long OooOoO();

    void OooOoO0();

    boolean OooOoOO();

    void OooOoo();

    @Nullable
    PlaybackException OooOoo0();

    void OooOooO();

    void OooOooo();

    void Oooo0();

    void Oooo000();

    void Oooo00O();

    void Oooo00o();

    void Oooo0O0();

    void Oooo0OO();

    void Oooo0o0();

    boolean isPlaying();

    void pause();
}
