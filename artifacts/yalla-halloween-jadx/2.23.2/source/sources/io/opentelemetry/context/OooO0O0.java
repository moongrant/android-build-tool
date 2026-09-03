package io.opentelemetry.context;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0O0 {
    public static Context OooO00o() {
        Context contextCurrent = LazyStorage.f32549OooO0O0.current();
        return contextCurrent != null ? contextCurrent : OooO0O0();
    }

    public static Context OooO0O0() {
        return LazyStorage.f32549OooO0O0.OooO0OO();
    }
}
