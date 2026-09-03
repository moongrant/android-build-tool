package io.grpc;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import p636o0ooO0OO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Internal
public abstract class ManagedChannelProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public static final Iterable<Class<?>> f26339OooO00o;

    public class OooO00o implements o00Ooo<ManagedChannelProvider> {
    }

    public static final class OooO0O0 implements Iterable<Class<?>> {
        @Override // java.lang.Iterable
        public final Iterator<Class<?>> iterator() {
            ArrayList arrayList = new ArrayList();
            try {
                int i = o000O0Oo.f48859OooO0O0;
                arrayList.add(o000O0Oo.class);
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
            } catch (ClassNotFoundException unused2) {
            }
            return arrayList.iterator();
        }
    }

    public static final class ProviderNotFoundException extends RuntimeException {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    static {
        boolean z;
        ?? Load;
        OooO0O0 oooO0O0 = new OooO0O0();
        f26339OooO00o = oooO0O0;
        ClassLoader classLoader = ManagedChannelProvider.class.getClassLoader();
        OooO00o oooO00o = new OooO00o();
        try {
            Class.forName("android.app.Application", false, classLoader);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            Load = new ArrayList();
            for (Class<?> cls : oooO0O0) {
                try {
                    Load.add(cls.asSubclass(ManagedChannelProvider.class).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls.getName(), th), th);
                }
            }
        } else {
            Load = ServiceLoader.load(ManagedChannelProvider.class, classLoader);
            if (!Load.iterator().hasNext()) {
                Load = ServiceLoader.load(ManagedChannelProvider.class);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            ((ManagedChannelProvider) obj).OooO00o();
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new o00Oo0(oooO00o)));
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
    }

    public abstract void OooO00o();

    public abstract int OooO0O0();
}
