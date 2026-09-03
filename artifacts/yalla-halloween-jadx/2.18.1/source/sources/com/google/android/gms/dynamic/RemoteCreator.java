package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class RemoteCreator<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15823OooO00o = "com.google.android.gms.common.ui.SignInButtonCreatorImpl";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f15824OooO0O0;

    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@NonNull String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    public RemoteCreator() {
    }

    @NonNull
    @KeepForSdk
    public final T OooO00o(@NonNull Context context) throws RemoteCreatorException {
        if (this.f15824OooO0O0 == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f15824OooO0O0 = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.f15823OooO00o).newInstance());
            } catch (ClassNotFoundException e) {
                throw new RemoteCreatorException("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new RemoteCreatorException("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new RemoteCreatorException("Could not instantiate creator.", e3);
            }
        }
        return (T) this.f15824OooO0O0;
    }

    @NonNull
    @KeepForSdk
    public abstract T getRemoteCreator(@NonNull IBinder iBinder);
}
