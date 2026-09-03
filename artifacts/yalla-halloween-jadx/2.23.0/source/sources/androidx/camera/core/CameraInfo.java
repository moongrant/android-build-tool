package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p028Oooo0oO.o0O0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraInfo {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ImplementationType {
    }

    @NonNull
    LiveData<CameraState> OooO0O0();

    int OooO0OO();

    int OooO0o0();

    int OooOOO(int i);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    String OooOOO0();

    @NonNull
    LiveData<o0O0o> OooOOOo();
}
