package io.opentelemetry.context;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
enum ThreadLocalContextStorage implements ContextStorage {
    INSTANCE;

    private static final Logger logger = Logger.getLogger(ThreadLocalContextStorage.class.getName());
    private static final ThreadLocal<Context> THREAD_LOCAL_STORAGE = new ThreadLocal<>();

    public enum NoopScope implements Scope {
        INSTANCE;

        @Override // java.lang.AutoCloseable
        public final void close() {
        }
    }

    public static /* synthetic */ void OooO0O0(ThreadLocalContextStorage threadLocalContextStorage, Context context, Context context2) {
        if (threadLocalContextStorage.current() != context) {
            logger.log(Level.FINE, "Context in storage not the expected context, Scope.close was not called correctly");
        }
        THREAD_LOCAL_STORAGE.set(context2);
    }

    @Override // io.opentelemetry.context.ContextStorage
    public final Scope OooO00o(final Context context) {
        if (context == null) {
            return NoopScope.INSTANCE;
        }
        final Context contextCurrent = current();
        if (context == contextCurrent) {
            return NoopScope.INSTANCE;
        }
        THREAD_LOCAL_STORAGE.set(context);
        return new Scope() { // from class: io.opentelemetry.context.OooO0o
            @Override // java.lang.AutoCloseable
            public final void close() {
                ThreadLocalContextStorage.OooO0O0(this.f33085OooO0Oo, context, contextCurrent);
            }
        };
    }

    @Override // io.opentelemetry.context.ContextStorage
    public final /* synthetic */ Context OooO0OO() {
        return ArrayBasedContext.f33076OooO0O0;
    }

    @Override // io.opentelemetry.context.ContextStorage
    @Nullable
    public final Context current() {
        return THREAD_LOCAL_STORAGE.get();
    }
}
