package androidx.camera.lifecycle;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.auto.value.AutoValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o000OO.OooOOO0;
import p027Oooo0o0.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class LifecycleCameraRepository {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3853OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final HashMap f3854OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final HashMap f3855OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayDeque<LifecycleOwner> f3856OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public CameraCoordinator f3857OooO0o0;

    public static class LifecycleCameraRepositoryObserver implements LifecycleObserver {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final LifecycleCameraRepository f3858OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final LifecycleOwner f3859OooO0o0;

        public LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f3859OooO0o0 = lifecycleOwner;
            this.f3858OooO0Oo = lifecycleCameraRepository;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            LifecycleCameraRepository lifecycleCameraRepository = this.f3858OooO0Oo;
            synchronized (lifecycleCameraRepository.f3853OooO00o) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverOooO0OO = lifecycleCameraRepository.OooO0OO(lifecycleOwner);
                if (lifecycleCameraRepositoryObserverOooO0OO == null) {
                    return;
                }
                lifecycleCameraRepository.OooO0oo(lifecycleOwner);
                Iterator it = ((Set) lifecycleCameraRepository.f3855OooO0OO.get(lifecycleCameraRepositoryObserverOooO0OO)).iterator();
                while (it.hasNext()) {
                    lifecycleCameraRepository.f3854OooO0O0.remove((OooO00o) it.next());
                }
                lifecycleCameraRepository.f3855OooO0OO.remove(lifecycleCameraRepositoryObserverOooO0OO);
                lifecycleCameraRepositoryObserverOooO0OO.f3859OooO0o0.getLifecycle().removeObserver(lifecycleCameraRepositoryObserverOooO0OO);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.f3858OooO0Oo.OooO0oO(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.f3858OooO0Oo.OooO0oo(lifecycleOwner);
        }
    }

    @AutoValue
    public static abstract class OooO00o {
        @NonNull
        public abstract CameraUseCaseAdapter.OooO00o OooO00o();

        @NonNull
        public abstract LifecycleOwner OooO0O0();
    }

    public final void OooO(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3853OooO00o) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverOooO0OO = OooO0OO(lifecycleOwner);
            if (lifecycleCameraRepositoryObserverOooO0OO == null) {
                return;
            }
            Iterator it = ((Set) this.f3855OooO0OO.get(lifecycleCameraRepositoryObserverOooO0OO)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f3854OooO0O0.get((OooO00o) it.next());
                lifecycleCamera.getClass();
                lifecycleCamera.OooOOo0();
            }
        }
    }

    public final void OooO00o(@NonNull LifecycleCamera lifecycleCamera, @Nullable ViewPort viewPort, @NonNull List list, @NonNull List list2, @Nullable CameraCoordinator cameraCoordinator) {
        synchronized (this.f3853OooO00o) {
            OooOOO0.OooO00o(!list2.isEmpty());
            this.f3857OooO0o0 = cameraCoordinator;
            LifecycleOwner lifecycleOwnerOooO0o0 = lifecycleCamera.OooO0o0();
            Set set = (Set) this.f3855OooO0OO.get(OooO0OO(lifecycleOwnerOooO0o0));
            CameraCoordinator cameraCoordinator2 = this.f3857OooO0o0;
            if (cameraCoordinator2 == null || ((o00O00OO) cameraCoordinator2).f1089OooO0o0 != 2) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.f3854OooO0O0.get((OooO00o) it.next());
                    lifecycleCamera2.getClass();
                    if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.OooOO0O().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.f3850OooO0o.OooOooo(viewPort);
                lifecycleCamera.f3850OooO0o.OooOoo(list);
                lifecycleCamera.OooO0Oo(list2);
                if (lifecycleOwnerOooO0o0.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    OooO0oO(lifecycleOwnerOooO0o0);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    public final LifecycleCamera OooO0O0(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraUseCaseAdapter cameraUseCaseAdapter) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f3853OooO00o) {
            OooOOO0.OooO0O0(this.f3854OooO0O0.get(new androidx.camera.lifecycle.OooO00o(lifecycleOwner, cameraUseCaseAdapter.f3813OooO0oO)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (lifecycleOwner.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
            lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
            if (((ArrayList) cameraUseCaseAdapter.OooOo0o()).isEmpty()) {
                lifecycleCamera.OooOOo0();
            }
            OooO0o(lifecycleCamera);
        }
        return lifecycleCamera;
    }

    public final LifecycleCameraRepositoryObserver OooO0OO(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3853OooO00o) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f3855OooO0OO.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.f3859OooO0o0)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    public final Collection<LifecycleCamera> OooO0Oo() {
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        synchronized (this.f3853OooO00o) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f3854OooO0O0.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final void OooO0o(LifecycleCamera lifecycleCamera) {
        synchronized (this.f3853OooO00o) {
            LifecycleOwner lifecycleOwnerOooO0o0 = lifecycleCamera.OooO0o0();
            androidx.camera.lifecycle.OooO00o oooO00o = new androidx.camera.lifecycle.OooO00o(lifecycleOwnerOooO0o0, lifecycleCamera.f3850OooO0o.f3813OooO0oO);
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverOooO0OO = OooO0OO(lifecycleOwnerOooO0o0);
            Set hashSet = lifecycleCameraRepositoryObserverOooO0OO != null ? (Set) this.f3855OooO0OO.get(lifecycleCameraRepositoryObserverOooO0OO) : new HashSet();
            hashSet.add(oooO00o);
            this.f3854OooO0O0.put(oooO00o, lifecycleCamera);
            if (lifecycleCameraRepositoryObserverOooO0OO == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(lifecycleOwnerOooO0o0, this);
                this.f3855OooO0OO.put(lifecycleCameraRepositoryObserver, hashSet);
                lifecycleOwnerOooO0o0.getLifecycle().addObserver(lifecycleCameraRepositoryObserver);
            }
        }
    }

    public final boolean OooO0o0(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3853OooO00o) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverOooO0OO = OooO0OO(lifecycleOwner);
            if (lifecycleCameraRepositoryObserverOooO0OO == null) {
                return false;
            }
            Iterator it = ((Set) this.f3855OooO0OO.get(lifecycleCameraRepositoryObserverOooO0OO)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f3854OooO0O0.get((OooO00o) it.next());
                lifecycleCamera.getClass();
                if (!lifecycleCamera.OooOO0O().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void OooO0oO(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3853OooO00o) {
            if (OooO0o0(lifecycleOwner)) {
                if (this.f3856OooO0Oo.isEmpty()) {
                    this.f3856OooO0Oo.push(lifecycleOwner);
                } else {
                    CameraCoordinator cameraCoordinator = this.f3857OooO0o0;
                    if (cameraCoordinator == null || ((o00O00OO) cameraCoordinator).f1089OooO0o0 != 2) {
                        LifecycleOwner lifecycleOwnerPeek = this.f3856OooO0Oo.peek();
                        if (!lifecycleOwner.equals(lifecycleOwnerPeek)) {
                            OooO(lifecycleOwnerPeek);
                            this.f3856OooO0Oo.remove(lifecycleOwner);
                            this.f3856OooO0Oo.push(lifecycleOwner);
                        }
                    }
                }
                OooOO0(lifecycleOwner);
            }
        }
    }

    public final void OooO0oo(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3853OooO00o) {
            this.f3856OooO0Oo.remove(lifecycleOwner);
            OooO(lifecycleOwner);
            if (!this.f3856OooO0Oo.isEmpty()) {
                OooOO0(this.f3856OooO0Oo.peek());
            }
        }
    }

    public final void OooOO0(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3853OooO00o) {
            Iterator it = ((Set) this.f3855OooO0OO.get(OooO0OO(lifecycleOwner))).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f3854OooO0O0.get((OooO00o) it.next());
                lifecycleCamera.getClass();
                if (!lifecycleCamera.OooOO0O().isEmpty()) {
                    lifecycleCamera.OooOOoo();
                }
            }
        }
    }
}
