package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class ListenerHolder<L> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f15255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public volatile L f15256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public volatile ListenerKey<L> f15257OooO0OO;

    @KeepForSdk
    public static final class ListenerKey<L> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final L f15258OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f15259OooO0O0;

        @KeepForSdk
        public ListenerKey(L l, String str) {
            this.f15258OooO00o = l;
            this.f15259OooO0O0 = str;
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
            return this.f15258OooO00o == listenerKey.f15258OooO00o && this.f15259OooO0O0.equals(listenerKey.f15259OooO0O0);
        }

        @KeepForSdk
        public int hashCode() {
            return this.f15259OooO0O0.hashCode() + (System.identityHashCode(this.f15258OooO00o) * 31);
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            String str = this.f15259OooO0O0;
            int iIdentityHashCode = System.identityHashCode(this.f15258OooO00o);
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
    public ListenerHolder(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f15255OooO00o = new HandlerExecutor(looper);
        this.f15256OooO0O0 = (L) Preconditions.checkNotNull(l, "Listener must not be null");
        this.f15257OooO0OO = new ListenerKey<>(l, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.f15256OooO0O0 = null;
        this.f15257OooO0OO = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.f15257OooO0OO;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.f15256OooO0O0 != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.f15255OooO00o.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder listenerHolder = this.zaa;
                ListenerHolder.Notifier notifier2 = notifier;
                L l = listenerHolder.f15256OooO0O0;
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
    public ListenerHolder(@NonNull Executor executor, @NonNull L l, @NonNull String str) {
        this.f15255OooO00o = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.f15256OooO0O0 = (L) Preconditions.checkNotNull(l, "Listener must not be null");
        this.f15257OooO0OO = new ListenerKey<>(l, Preconditions.checkNotEmpty(str));
    }
}
