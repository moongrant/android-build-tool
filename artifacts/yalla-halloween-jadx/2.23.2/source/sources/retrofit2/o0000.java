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
import p254o00ooO0o.o000O00;

/* JADX INFO: loaded from: classes5.dex */
public class o0000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000 f60496OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f60497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Constructor<MethodHandles.Lookup> f60498OooO0O0;

    public static final class OooO00o extends o0000 {

        /* JADX INFO: renamed from: retrofit2.o0000$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class ExecutorC0500OooO00o implements Executor {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Handler f60499OooO0Oo = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f60499OooO0Oo.post(runnable);
            }
        }

        public OooO00o() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.o0000
        public final Executor OooO00o() {
            return new ExecutorC0500OooO00o();
        }

        @Override // retrofit2.o0000
        @Nullable
        public final Object OooO0O0(Class cls, Method method, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.OooO0O0(cls, method, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f60496OooO0OO = "Dalvik".equals(System.getProperty("java.vm.name")) ? new OooO00o() : new o0000(true);
    }

    public o0000(boolean z) {
        this.f60497OooO00o = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = o000O00.OooO00o().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f60498OooO0O0 = declaredConstructor;
    }

    @Nullable
    public Executor OooO00o() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object OooO0O0(Class cls, Method method, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f60498OooO0O0;
        return (constructor != null ? o00000.OooO00o(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
