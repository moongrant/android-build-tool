package com.yalla.support.common.util;

import android.net.ConnectivityManager;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/yalla/support/common/util/NetworkUtil$netStatusLiveData$1", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/support/common/util/NetworkUtil$NetStatus;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeForever", "removeObserver", "Common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetworkUtil$netStatusLiveData$1 extends MutableLiveData<NetworkUtil.NetStatus> {
    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super NetworkUtil.NetStatus> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!hasObservers()) {
            NetworkUtil.f20498OooO00o.OooO0o0();
        }
        super.observe(owner, observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NotNull Observer<? super NetworkUtil.NetStatus> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!hasObservers()) {
            NetworkUtil.f20498OooO00o.OooO0o0();
        }
        super.observeForever(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NotNull Observer<? super NetworkUtil.NetStatus> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.removeObserver(observer);
        if (hasObservers()) {
            return;
        }
        NetworkUtil networkUtil = NetworkUtil.f20498OooO00o;
        Objects.requireNonNull(networkUtil);
        try {
            ConnectivityManager connectivityManagerOooO00o = networkUtil.OooO00o();
            if (connectivityManagerOooO00o != null) {
                connectivityManagerOooO00o.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) NetworkUtil.f20501OooO0Oo.getValue());
            }
        } catch (IllegalArgumentException unused) {
            Log.d("NetworkUtils", "NetworkCallback was already unregistered");
        }
    }
}
