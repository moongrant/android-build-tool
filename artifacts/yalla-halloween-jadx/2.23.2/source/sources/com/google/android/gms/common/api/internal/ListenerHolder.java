package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class ListenerHolder<L> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f14278OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public volatile L f14279OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public volatile ListenerKey<L> f14280OooO0OO;

    @KeepForSdk
    public static final class ListenerKey<L> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final L f14281OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f14282OooO0O0;

        @KeepForSdk
        public ListenerKey(L l, String str) {
            this.f14281OooO00o = l;
            this.f14282OooO0O0 = str;
        }

        @KeepForSdk
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f14281OooO00o == listenerKey.f14281OooO00o && this.f14282OooO0O0.equals(listenerKey.f14282OooO0O0);
        }

        @KeepForSdk
        public int hashCode() {
            return this.f14282OooO0O0.hashCode() + (System.identityHashCode(this.f14281OooO00o) * 31);
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            int iIdentityHashCode = System.identityHashCode(this.f14281OooO00o);
            String str = this.f14282OooO0O0;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("@");
            sb.append(iIdentityHashCode);
            return sb.toString();
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@NonNull L l);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Object obj, @NonNull Looper looper, @NonNull String str) {
        this.f14278OooO00o = new HandlerExecutor(looper);
        this.f14279OooO0O0 = (L) Preconditions.checkNotNull(obj, "Listener must not be null");
        this.f14280OooO0OO = new ListenerKey<>(obj, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.f14279OooO0O0 = null;
        this.f14280OooO0OO = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.f14280OooO0OO;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.f14279OooO0O0 != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.f14278OooO00o.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder listenerHolder = this.zaa;
                ListenerHolder.Notifier notifier2 = notifier;
                L l = listenerHolder.f14279OooO0O0;
                if (l == 0) {
                    notifier2.onNotifyListenerFailed();
                    return;
                }
                try {
                    notifier2.notifyListener(l);
                } catch (RuntimeException e) {
                    notifier2.onNotifyListenerFailed();
                    throw e;
                }
            }
        });
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Object obj, @NonNull Executor executor, @NonNull String str) {
        this.f14278OooO00o = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.f14279OooO0O0 = (L) Preconditions.checkNotNull(obj, "Listener must not be null");
        this.f14280OooO0OO = new ListenerKey<>(obj, Preconditions.checkNotEmpty(str));
    }
}
