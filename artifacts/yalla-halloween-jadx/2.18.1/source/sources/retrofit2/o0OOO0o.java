package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes4.dex */
public class o0OOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0OOO0o f53846OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f53847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Constructor<MethodHandles.Lookup> f53848OooO0O0;

    public static final class OooO00o extends o0OOO0o {

        /* JADX INFO: renamed from: retrofit2.o0OOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class ExecutorC0450OooO00o implements Executor {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final Handler f53849Oooo0o = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f53849Oooo0o.post(runnable);
            }
        }

        public OooO00o() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.o0OOO0o
        public final Executor OooO00o() {
            return new ExecutorC0450OooO00o();
        }

        @Override // retrofit2.o0OOO0o
        @Nullable
        public final Object OooO0O0(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.OooO0O0(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f53846OooO0OO = "Dalvik".equals(System.getProperty("java.vm.name")) ? new OooO00o() : new o0OOO0o(true);
    }

    public o0OOO0o(boolean z) {
        this.f53847OooO00o = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f53848OooO0O0 = declaredConstructor;
    }

    @Nullable
    public Executor OooO00o() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object OooO0O0(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f53848OooO0O0;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    public final boolean OooO0OO(Method method) {
        return this.f53847OooO00o && method.isDefault();
    }
}
