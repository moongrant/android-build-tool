package androidx.lifecycle;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import p096o000o0o.o00oO0o;
import p096o000o0o.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements o00oO0o<LifecycleOwner> {
    @Override // p096o000o0o.o00oO0o
    @NonNull
    public List<Class<? extends o00oO0o<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<java.lang.Class<? extends o000o0o.o00oO0o<?>>>] */
    @Override // p096o000o0o.o00oO0o
    @NonNull
    public LifecycleOwner create(@NonNull Context context) {
        if (!oo000o.OooO0OO(context).f29299OooO0O0.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        LifecycleDispatcher.init(context);
        ProcessLifecycleOwner.init(context);
        return ProcessLifecycleOwner.get();
    }
}
