package io.opentelemetry.context;

import io.opentelemetry.context.internal.shaded.AbstractWeakConcurrentMap;
import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class StrictContextStorage implements ContextStorage, AutoCloseable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Logger f32555OooO0o = Logger.getLogger(StrictContextStorage.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ContextStorage f32556OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PendingScopes f32557OooO0o0 = new PendingScopes(new ConcurrentHashMap());

    public static class CallerStackTrace extends Throwable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f32558OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Context f32559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f32560OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile boolean f32561OooO0oO;

        public CallerStackTrace(Context context) {
            super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + context + " here:");
            this.f32558OooO0Oo = Thread.currentThread().getName();
            this.f32560OooO0o0 = Thread.currentThread().getId();
            this.f32559OooO0o = context;
        }
    }

    public static class PendingScopes extends WeakConcurrentMap<Scope, CallerStackTrace> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final ConcurrentHashMap<AbstractWeakConcurrentMap.WeakKey<Scope>, CallerStackTrace> f32562OooO0oO;

        public PendingScopes(ConcurrentHashMap<AbstractWeakConcurrentMap.WeakKey<Scope>, CallerStackTrace> concurrentHashMap) {
            super(false, concurrentHashMap);
            this.f32562OooO0oO = concurrentHashMap;
            Thread thread = new Thread(this);
            thread.setName("weak-ref-cleaner-strictcontextstorage");
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.start();
        }

        @Override // io.opentelemetry.context.internal.shaded.AbstractWeakConcurrentMap, java.lang.Runnable
        public final void run() {
            while (!Thread.interrupted()) {
                try {
                    CallerStackTrace callerStackTraceRemove = this.f32562OooO0oO.remove(remove());
                    if (callerStackTraceRemove != null && !callerStackTraceRemove.f32561OooO0oO) {
                        StrictContextStorage.f32555OooO0o.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) StrictContextStorage.OooO0oO(callerStackTraceRemove));
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public final class StrictScope implements Scope {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Scope f32563OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final CallerStackTrace f32565OooO0o0;

        public StrictScope(Scope scope, CallerStackTrace callerStackTrace) {
            this.f32563OooO0Oo = scope;
            this.f32565OooO0o0 = callerStackTrace;
            StrictContextStorage.this.f32557OooO0o0.OooO0Oo(this, callerStackTrace);
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            this.f32565OooO0o0.f32561OooO0oO = true;
            StrictContextStorage.this.f32557OooO0o0.OooO0o0(this);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals(StrictScope.class.getName()) && stackTraceElement.getMethodName().equals("close")) {
                    int i2 = i + 2;
                    int i3 = i + 1;
                    if (i3 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i3];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i2 < stackTrace.length) {
                            i2 = i + 3;
                        }
                    }
                    if (stackTrace[i2].getMethodName().equals("invokeSuspend")) {
                        i2++;
                    }
                    if (i2 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i2];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() != this.f32565OooO0o0.f32560OooO0o0) {
                throw new IllegalStateException(String.format("Thread [%s] opened scope, but thread [%s] closed it", this.f32565OooO0o0.f32558OooO0Oo, Thread.currentThread().getName()), this.f32565OooO0o0);
            }
            this.f32563OooO0Oo.close();
        }

        public final String toString() {
            String message = this.f32565OooO0o0.getMessage();
            return message != null ? message : super.toString();
        }
    }

    public StrictContextStorage(ContextStorage contextStorage) {
        this.f32556OooO0Oo = contextStorage;
    }

    public static AssertionError OooO0oO(CallerStackTrace callerStackTrace) {
        AssertionError assertionError = new AssertionError("Thread [" + callerStackTrace.f32558OooO0Oo + "] opened a scope of " + callerStackTrace.f32559OooO0o + " here:");
        assertionError.setStackTrace(callerStackTrace.getStackTrace());
        return assertionError;
    }

    @Override // io.opentelemetry.context.ContextStorage
    public final Scope OooO00o(Context context) {
        int i;
        Scope scopeOooO00o = this.f32556OooO0Oo.OooO00o(context);
        CallerStackTrace callerStackTrace = new CallerStackTrace(context);
        StackTraceElement[] stackTrace = callerStackTrace.getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement.getClassName().equals(Context.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i = i2 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i3 = 1;
        while (i3 < stackTrace.length) {
            String className = stackTrace[i3].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i3++;
        }
        callerStackTrace.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3, stackTrace.length));
        return new StrictScope(scopeOooO00o, callerStackTrace);
    }

    @Override // io.opentelemetry.context.ContextStorage
    public final /* synthetic */ Context OooO0OO() {
        return ArrayBasedContext.f32543OooO0O0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f32557OooO0o0.OooO00o();
        PendingScopes pendingScopes = this.f32557OooO0o0;
        pendingScopes.getClass();
        ArrayList arrayList = new ArrayList();
        for (CallerStackTrace callerStackTrace : pendingScopes.f32562OooO0oO.values()) {
            if (!callerStackTrace.f32561OooO0oO) {
                arrayList.add(callerStackTrace);
            }
        }
        pendingScopes.f32562OooO0oO.clear();
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() > 1) {
            f32555OooO0o.log(Level.SEVERE, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f32555OooO0o.log(Level.SEVERE, "Scope leaked", (Throwable) OooO0oO((CallerStackTrace) it.next()));
            }
        }
        throw OooO0oO((CallerStackTrace) arrayList.get(0));
    }

    @Override // io.opentelemetry.context.ContextStorage
    @Nullable
    public final Context current() {
        return this.f32556OooO0Oo.current();
    }
}
