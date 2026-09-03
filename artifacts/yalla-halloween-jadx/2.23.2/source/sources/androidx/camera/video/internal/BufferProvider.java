package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.oo00o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface BufferProvider<T> extends oo00o<State> {

    public enum State {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    o000Oo0.OooO0o OooO0Oo();
}
