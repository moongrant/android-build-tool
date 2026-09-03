package io.opentelemetry.context;

import java.util.ArrayList;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
final class ContextStorageWrappers {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f32545OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f32546OooO0O0;

    static {
        Logger.getLogger(ContextStorageWrappers.class.getName());
        f32545OooO00o = new ArrayList();
        f32546OooO0O0 = new Object();
    }

    private ContextStorageWrappers() {
    }

    public static void OooO00o() {
        synchronized (f32546OooO0O0) {
        }
    }
}
