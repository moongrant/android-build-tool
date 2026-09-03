package io.opentelemetry.context;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface ContextStorage {
    Scope OooO00o(Context context);

    Context OooO0OO();

    @Nullable
    Context current();
}
