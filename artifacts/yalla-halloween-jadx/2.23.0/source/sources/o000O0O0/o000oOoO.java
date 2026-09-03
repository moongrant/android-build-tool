package o000O0O0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final p003OooO0o0.o000000O f34772OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f34773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo f34774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Executor f34775OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34776OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOOOO f34777OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOo.OooO0OO f34778OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f34779OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f34780OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Oooo0 f34781OooOO0;

    public static final class OooO00o extends OooOo.OooO0OO {
        public OooO00o(String[] strArr) {
            super(strArr);
        }

        @Override // o000O0O0.OooOo.OooO0OO
        public final void OooO00o(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            o000oOoO o000oooo2 = o000oOoO.this;
            if (o000oooo2.f34780OooO0oo.get()) {
                return;
            }
            try {
                OooOOOO oooOOOO = o000oooo2.f34777OooO0o;
                if (oooOOOO != null) {
                    int i = o000oooo2.f34776OooO0Oo;
                    Object[] array = tables.toArray(new String[0]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    oooOOOO.OooO0oo(i, (String[]) array);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    public static final class OooO0O0 extends OooOOO.OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final /* synthetic */ int f34783OooO0o0 = 0;

        public OooO0O0() {
        }

        @Override // o000O0O0.OooOOO
        public final void OooO0O0(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            o000oOoO o000oooo2 = o000oOoO.this;
            o000oooo2.f34775OooO0OO.execute(new OooOO0.OooO00o(1, o000oooo2, tables));
        }
    }

    public static final class OooO0OO implements ServiceConnection {
        public OooO0OO() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            OooOOOO c0410OooO00o;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            int i = OooOOOO.OooO00o.f34727OooO0Oo;
            if (service == null) {
                c0410OooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                c0410OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooOOOO)) ? new OooOOOO.OooO00o.C0410OooO00o(service) : (OooOOOO) iInterfaceQueryLocalInterface;
            }
            o000oOoO o000oooo2 = o000oOoO.this;
            o000oooo2.f34777OooO0o = c0410OooO00o;
            o000oooo2.f34775OooO0OO.execute(o000oooo2.f34772OooO);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            o000oOoO o000oooo2 = o000oOoO.this;
            o000oooo2.f34775OooO0OO.execute(o000oooo2.f34781OooOO0);
            o000oooo2.f34777OooO0o = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o000O0O0.Oooo0] */
    public o000oOoO(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent, @NotNull OooOo invalidationTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f34773OooO00o = name;
        this.f34774OooO0O0 = invalidationTracker;
        this.f34775OooO0OO = executor;
        Context applicationContext = context.getApplicationContext();
        this.f34779OooO0oO = new OooO0O0();
        this.f34780OooO0oo = new AtomicBoolean(false);
        OooO0OO oooO0OO = new OooO0OO();
        this.f34772OooO = new p003OooO0o0.o000000O(this, 1);
        this.f34781OooOO0 = new Runnable() { // from class: o000O0O0.Oooo0
            @Override // java.lang.Runnable
            public final void run() {
                o000oOoO this$0 = this.f34757OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOo oooOo = this$0.f34774OooO0O0;
                OooOo.OooO0OO oooO0OO2 = this$0.f34778OooO0o0;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("observer");
                    oooO0OO2 = null;
                }
                oooOo.OooO0Oo(oooO0OO2);
            }
        };
        Object[] array = invalidationTracker.f34734OooO0Oo.keySet().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        OooO00o oooO00o = new OooO00o((String[]) array);
        Intrinsics.checkNotNullParameter(oooO00o, "<set-?>");
        this.f34778OooO0o0 = oooO00o;
        applicationContext.bindService(serviceIntent, oooO0OO, 1);
    }
}
