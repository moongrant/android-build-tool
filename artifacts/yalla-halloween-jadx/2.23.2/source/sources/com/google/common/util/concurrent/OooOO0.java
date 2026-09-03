package com.google.common.util.concurrent;

import androidx.media3.session.SessionResult;
import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class OooOO0<V> implements OooOO0O<V> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Logger f19311OooO0o0 = Logger.getLogger(OooOO0.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ParametricNullness
    public final V f19312OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0(@ParametricNullness SessionResult sessionResult) {
        this.f19312OooO0Oo = sessionResult;
    }

    @Override // com.google.common.util.concurrent.OooOO0O
    public final void OooO0oo(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw new NullPointerException("Runnable was null.");
        }
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            f19311OooO0o0.log(level, sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public final V get() {
        return this.f19312OooO0Oo;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f19312OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + com.google.common.base.OooO0o.OooO00o(string, 27));
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f19312OooO0Oo;
    }
}
