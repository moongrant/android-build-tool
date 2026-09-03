package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;
import com.umeng.analytics.pro.d;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019OooOoo0.o00O0O;
import p019OooOoo0.o00Oo0;
import p019OooOoo0.o00Ooo;
import p019OooOoo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "LOooOoo0/o00Ooo;", "Landroid/content/ComponentName;", "name", "LOooOoo0/o00Oo0;", "newClient", "", "onCustomTabsServiceConnected", "componentName", "onServiceDisconnected", "<init>", "()V", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabPrefetchHelper extends o00Ooo {

    @Nullable
    private static o00Oo0 client;

    @Nullable
    private static oo000o session;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReentrantLock lock = new ReentrantLock();

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$Companion;", "", "", "prepareSession", "Landroid/net/Uri;", "url", "mayLaunchUrl", "LOooOoo0/oo000o;", "getPreparedSessionOnce", "LOooOoo0/o00Oo0;", "client", "LOooOoo0/o00Oo0;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", d.aw, "LOooOoo0/oo000o;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            o00Oo0 o00oo1;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (o00oo1 = CustomTabPrefetchHelper.client) != null) {
                Companion companion = CustomTabPrefetchHelper.INSTANCE;
                oo000o oo000oVar = null;
                o00O0O o00o0o2 = new o00O0O();
                try {
                    if (o00oo1.f373OooO00o.OooO0oo(o00o0o2)) {
                        oo000oVar = new oo000o(o00oo1.f373OooO00o, o00o0o2, o00oo1.f374OooO0O0);
                    }
                } catch (RemoteException unused) {
                }
                CustomTabPrefetchHelper.session = oo000oVar;
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        @JvmStatic
        @Nullable
        public final oo000o getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            oo000o oo000oVar = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return oo000oVar;
        }

        @JvmStatic
        public final void mayLaunchUrl(@NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            oo000o oo000oVar = CustomTabPrefetchHelper.session;
            if (oo000oVar != null) {
                try {
                    oo000oVar.f377OooO00o.OooO0Oo(oo000oVar.f378OooO0O0, url);
                } catch (RemoteException unused) {
                }
            }
            CustomTabPrefetchHelper.lock.unlock();
        }
    }

    @JvmStatic
    @Nullable
    public static final oo000o getPreparedSessionOnce() {
        return INSTANCE.getPreparedSessionOnce();
    }

    @JvmStatic
    public static final void mayLaunchUrl(@NotNull Uri uri) {
        INSTANCE.mayLaunchUrl(uri);
    }

    @Override // p019OooOoo0.o00Ooo
    public void onCustomTabsServiceConnected(@NotNull ComponentName name, @NotNull o00Oo0 newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        Objects.requireNonNull(newClient);
        try {
            newClient.f373OooO00o.OooOOO();
        } catch (RemoteException unused) {
        }
        Companion companion = INSTANCE;
        client = newClient;
        companion.prepareSession();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
