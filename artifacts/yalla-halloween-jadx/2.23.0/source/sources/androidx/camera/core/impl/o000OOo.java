package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class o000OOo {
    @NonNull
    public abstract Executor OooO00o();

    @NonNull
    public abstract Handler OooO0O0();
}
