package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019OooOooO.o000000;
import p019OooOooO.o000OOo;
import p019OooOooO.o0O0O00;
import p019OooOooO.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "LOooOooO/o000OOo;", "Landroid/content/ComponentName;", "name", "LOooOooO/o0O0O00;", "newClient", "", "onCustomTabsServiceConnected", "componentName", "onServiceDisconnected", "<init>", "()V", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabPrefetchHelper extends o000OOo {

    @Nullable
    private static o0O0O00 client;

    @Nullable
    private static o000000 session;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReentrantLock lock = new ReentrantLock();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$Companion;", "", "", "prepareSession", "Landroid/net/Uri;", "url", "mayLaunchUrl", "LOooOooO/o000000;", "getPreparedSessionOnce", "LOooOooO/o0O0O00;", "client", "LOooOooO/o0O0O00;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "session", "LOooOooO/o000000;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            o0O0O00 o0o0o00;
            o000000 o000000Var;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (o0o0o00 = CustomTabPrefetchHelper.client) != null) {
                p008OooOOo.OooO0OO oooO0OO = o0o0o00.f393OooO00o;
                o0OO00O o0oo00o2 = new o0OO00O();
                try {
                    o000000Var = !oooO0OO.OooOOo0(o0oo00o2) ? null : new o000000(oooO0OO, o0oo00o2, o0o0o00.f394OooO0O0);
                } catch (RemoteException unused) {
                }
                CustomTabPrefetchHelper.session = o000000Var;
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        @JvmStatic
        @Nullable
        public final o000000 getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            o000000 o000000Var = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return o000000Var;
        }

        @JvmStatic
        public final void mayLaunchUrl(@NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            o000000 o000000Var = CustomTabPrefetchHelper.session;
            if (o000000Var != null) {
                try {
                    o000000Var.f389OooO00o.OooO0oO(o000000Var.f390OooO0O0, url, null, null);
                } catch (RemoteException unused) {
                }
            }
            CustomTabPrefetchHelper.lock.unlock();
        }
    }

    @JvmStatic
    @Nullable
    public static final o000000 getPreparedSessionOnce() {
        return INSTANCE.getPreparedSessionOnce();
    }

    @JvmStatic
    public static final void mayLaunchUrl(@NotNull Uri uri) {
        INSTANCE.mayLaunchUrl(uri);
    }

    @Override // p019OooOooO.o000OOo
    public void onCustomTabsServiceConnected(@NotNull ComponentName name, @NotNull o0O0O00 newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.getClass();
        try {
            newClient.f393OooO00o.OooOOOO(0L);
        } catch (RemoteException unused) {
        }
        client = newClient;
        INSTANCE.prepareSession();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
