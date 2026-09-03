package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;
import p023Oooo00o.oO00o000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o0OOO0o {

    public interface OooO00o {
        @NonNull
        p022Oooo00O.oo0o0Oo OooO00o(@NonNull Context context, @NonNull OooO0OO oooO0OO, @Nullable CameraSelector cameraSelector) throws InitializationException;
    }

    @Nullable
    oO00o000 OooO00o();

    @NonNull
    p022Oooo00O.o000OO OooO0O0(@NonNull String str) throws CameraUnavailableException;

    @NonNull
    LinkedHashSet OooO0OO();

    @NonNull
    p027Oooo0o0.o00O00OO OooO0Oo();
}
