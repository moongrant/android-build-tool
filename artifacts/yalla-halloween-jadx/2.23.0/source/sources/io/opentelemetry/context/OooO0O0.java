package io.opentelemetry.context;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0O0 {
    public static Context OooO00o() {
        ContextStorage contextStorage = LazyStorage.f33082OooO0O0;
        Context contextCurrent = contextStorage.current();
        return contextCurrent != null ? contextCurrent : contextStorage.OooO0OO();
    }
}
