package io.opentelemetry.context;

import com.yalla.yalla.data.db.model.NewFriendsOld;
import io.opentelemetry.compat.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
final class LazyStorage {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f33081OooO00o = Logger.getLogger(LazyStorage.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ContextStorage f33082OooO0O0;

    static {
        ContextStorage strictContextStorage;
        ArrayList arrayList;
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (!NewFriendsOld.State_Default.equals(property)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(ContextStorageProvider.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    if (!arrayList2.isEmpty()) {
                        if (!property.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    atomicReference.set(new IllegalStateException("io.opentelemetry.context.ContextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                                    strictContextStorage = ThreadLocalContextStorage.INSTANCE;
                                    break;
                                }
                                ContextStorageProvider contextStorageProvider = (ContextStorageProvider) it2.next();
                                if (contextStorageProvider.getClass().getName().equals(property)) {
                                    strictContextStorage = contextStorageProvider.get();
                                    break;
                                }
                            }
                        } else {
                            if (arrayList2.size() != 1) {
                                atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.ContextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                                strictContextStorage = ThreadLocalContextStorage.INSTANCE;
                                break;
                            }
                            strictContextStorage = ((ContextStorageProvider) arrayList2.get(0)).get();
                            break;
                        }
                    } else {
                        strictContextStorage = ThreadLocalContextStorage.INSTANCE;
                        break;
                    }
                } else {
                    ContextStorageProvider contextStorageProvider2 = (ContextStorageProvider) it.next();
                    if (contextStorageProvider2.getClass().getName().equals("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider")) {
                        strictContextStorage = contextStorageProvider2.get();
                        break;
                    }
                    arrayList2.add(contextStorageProvider2);
                }
            }
        } else {
            strictContextStorage = ThreadLocalContextStorage.INSTANCE;
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            strictContextStorage = new StrictContextStorage(strictContextStorage);
        }
        synchronized (ContextStorageWrappers.f33079OooO0O0) {
            arrayList = ContextStorageWrappers.f33078OooO00o;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            strictContextStorage = (ContextStorage) ((Function) it3.next()).apply(strictContextStorage);
        }
        f33082OooO0O0 = strictContextStorage;
        ContextStorageWrappers.OooO00o();
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            f33081OooO00o.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }

    private LazyStorage() {
    }
}
