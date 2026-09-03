package p110o000ooo0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045Oooooo.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o000O00 f35860OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f35861OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000000O f35862OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Executor f35863OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0O0O00 f35865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000000O.OooO0OO f35866OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f35867OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f35868OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o00000O0 f35869OooOO0;

    public static final class OooO00o extends o000000O.OooO0OO {
        public OooO00o(String[] strArr) {
            super(strArr);
        }

        @Override // o000ooo0.o000000O.OooO0OO
        public final void OooO00o(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            o00000O o00000o = o00000O.this;
            if (o00000o.f35868OooO0oo.get()) {
                return;
            }
            try {
                o0O0O00 o0o0o00 = o00000o.f35865OooO0o;
                if (o0o0o00 != null) {
                    int i = o00000o.f35864OooO0Oo;
                    Object[] array = tables.toArray(new String[0]);
                    Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    o0o0o00.OooO0oo(i, (String[]) array);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    public static final class OooO0O0 extends oo0o0Oo.OooO00o {
        public OooO0O0() {
        }

        @Override // p110o000ooo0.oo0o0Oo
        public final void OooO0O0(@NotNull final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            final o00000O o00000o = o00000O.this;
            o00000o.f35863OooO0OO.execute(new Runnable() { // from class: o000ooo0.o00000OO
                @Override // java.lang.Runnable
                public final void run() {
                    o00000O this$0 = o00000o;
                    String[] tables2 = tables;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(tables2, "$tables");
                    o000000O o000000o2 = this$0.f35862OooO0O0;
                    String[] tables3 = (String[]) Arrays.copyOf(tables2, tables2.length);
                    o000000o2.getClass();
                    Intrinsics.checkNotNullParameter(tables3, "tables");
                    synchronized (o000000o2.f35845OooOO0O) {
                        Iterator<Map.Entry<K, V>> it = o000000o2.f35845OooOO0O.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                            o000000O.OooO0OO oooO0OO = (o000000O.OooO0OO) entry.getKey();
                            o000000O.OooO0o oooO0o = (o000000O.OooO0o) entry.getValue();
                            oooO0OO.getClass();
                            if (!(oooO0OO instanceof o00000O.OooO00o)) {
                                oooO0o.OooO0O0(tables3);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            });
        }
    }

    public static final class OooO0OO implements ServiceConnection {
        public OooO0OO() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            o0O0O00 c0412OooO00o;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            int i = o0O0O00.OooO00o.f35950OooO0Oo;
            if (service == null) {
                c0412OooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                c0412OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o0O0O00)) ? new o0O0O00.OooO00o.C0412OooO00o(service) : (o0O0O00) iInterfaceQueryLocalInterface;
            }
            o00000O o00000o = o00000O.this;
            o00000o.f35865OooO0o = c0412OooO00o;
            o00000o.f35863OooO0OO.execute(o00000o.f35860OooO);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            o00000O o00000o = o00000O.this;
            o00000o.f35863OooO0OO.execute(o00000o.f35869OooOO0);
            o00000o.f35865OooO0o = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o000ooo0.o00000O0] */
    public o00000O(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent, @NotNull o000000O invalidationTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f35861OooO00o = name;
        this.f35862OooO0O0 = invalidationTracker;
        this.f35863OooO0OO = executor;
        Context applicationContext = context.getApplicationContext();
        this.f35867OooO0oO = new OooO0O0();
        this.f35868OooO0oo = new AtomicBoolean(false);
        OooO0OO oooO0OO = new OooO0OO();
        this.f35860OooO = new o000O00(this, 1);
        this.f35869OooOO0 = new Runnable() { // from class: o000ooo0.o00000O0
            @Override // java.lang.Runnable
            public final void run() {
                o00000O this$0 = this.f35873OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000000O o000000o2 = this$0.f35862OooO0O0;
                o000000O.OooO0OO oooO0OO2 = this$0.f35866OooO0o0;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("observer");
                    oooO0OO2 = null;
                }
                o000000o2.OooO0Oo(oooO0OO2);
            }
        };
        Object[] array = invalidationTracker.f35839OooO0Oo.keySet().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        OooO00o oooO00o = new OooO00o((String[]) array);
        Intrinsics.checkNotNullParameter(oooO00o, "<set-?>");
        this.f35866OooO0o0 = oooO00o;
        applicationContext.bindService(serviceIntent, oooO0OO, 1);
    }
}
