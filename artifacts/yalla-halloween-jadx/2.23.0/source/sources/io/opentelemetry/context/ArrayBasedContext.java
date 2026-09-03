package io.opentelemetry.context;

import java.util.Arrays;
import java.util.concurrent.Callable;
import javax.annotation.Nullable;
import o0O0OOO0.OooOo;

/* JADX INFO: loaded from: classes5.dex */
final class ArrayBasedContext implements Context {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Context f33076OooO0O0 = new ArrayBasedContext(new Object[0]);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f33077OooO00o;

    public ArrayBasedContext(Object[] objArr) {
        this.f33077OooO00o = objArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.opentelemetry.context.OooO00o] */
    @Override // io.opentelemetry.context.Context
    public final OooO00o OooO00o(final Callable callable) {
        return new Callable() { // from class: io.opentelemetry.context.OooO00o
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                Callable callable2 = callable;
                Scope scopeOooO0o = this.OooO0o();
                try {
                    Object objCall = callable2.call();
                    if (scopeOooO0o != null) {
                        scopeOooO0o.close();
                    }
                    return objCall;
                } catch (Throwable th) {
                    if (scopeOooO0o != null) {
                        try {
                            scopeOooO0o.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        };
    }

    @Override // io.opentelemetry.context.Context
    public final OooOo OooO0O0(Runnable runnable) {
        return new OooOo(this, runnable);
    }

    @Override // io.opentelemetry.context.Context
    @Nullable
    public final <V> V OooO0OO(ContextKey<V> contextKey) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f33077OooO00o;
            if (i >= objArr.length) {
                return null;
            }
            if (objArr[i] == contextKey) {
                return (V) objArr[i + 1];
            }
            i += 2;
        }
    }

    @Override // io.opentelemetry.context.Context
    public final Context OooO0Oo(ContextKey contextKey, ImplicitContextKeyed implicitContextKeyed) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f33077OooO00o;
            if (i >= objArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 2);
                objArrCopyOf[objArrCopyOf.length - 2] = contextKey;
                objArrCopyOf[objArrCopyOf.length - 1] = implicitContextKeyed;
                return new ArrayBasedContext(objArrCopyOf);
            }
            if (objArr[i] == contextKey) {
                int i2 = i + 1;
                if (objArr[i2] == implicitContextKeyed) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i2] = implicitContextKeyed;
                return new ArrayBasedContext(objArr2);
            }
            i += 2;
        }
    }

    @Override // io.opentelemetry.context.Context
    public final Scope OooO0o() {
        return LazyStorage.f33082OooO0O0.OooO00o(this);
    }

    @Override // io.opentelemetry.context.Context
    public final Context OooO0o0(ImplicitContextKeyed implicitContextKeyed) {
        return implicitContextKeyed.OooO0o0(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.f33077OooO00o;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append('=');
            sb.append(objArr[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
