package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class MediaSpec {

    @AutoValue.Builder
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class OooO00o {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface OutputFormat {
    }

    @NonNull
    public static OooO0O0.OooO00o OooO00o() {
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        oooO00o.f3900OooO0OO = -1;
        oooO00o.f3899OooO0O0 = AudioSpec.OooO00o().OooO00o();
        oooO00o.OooO0O0(OooOo.OooO00o().OooO00o());
        return oooO00o;
    }

    @NonNull
    public abstract AudioSpec OooO0O0();

    public abstract int OooO0OO();

    @NonNull
    public abstract OooOo OooO0Oo();
}
