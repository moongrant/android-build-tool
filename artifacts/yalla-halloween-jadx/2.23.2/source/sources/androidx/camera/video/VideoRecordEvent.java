package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p039OoooOoo.o000OO00;
import p039OoooOoo.o00OOOOo;
import p039OoooOoo.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class VideoRecordEvent {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oOoo f4028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOOOo f4029OooO0O0;

    @RequiresApi(21)
    public static final class Finalize extends VideoRecordEvent {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f4030OooO0OO;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface VideoRecordError {
        }

        public Finalize(@NonNull o00oOoo o00oooo2, @NonNull o000OO00 o000oo01, int i) {
            super(o00oooo2, o000oo01);
            this.f4030OooO0OO = i;
        }
    }

    @RequiresApi(21)
    public static final class OooO00o extends VideoRecordEvent {
    }

    @RequiresApi(21)
    public static final class OooO0O0 extends VideoRecordEvent {
    }

    @RequiresApi(21)
    public static final class OooO0OO extends VideoRecordEvent {
    }

    public VideoRecordEvent(@NonNull o00oOoo o00oooo2, @NonNull o000OO00 o000oo01) {
        o00oooo2.getClass();
        this.f4028OooO00o = o00oooo2;
        this.f4029OooO0O0 = o000oo01;
    }
}
