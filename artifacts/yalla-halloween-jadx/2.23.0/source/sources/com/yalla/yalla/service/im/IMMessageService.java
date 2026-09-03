package com.yalla.yalla.service.im;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.Observer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.socket.IMSocketManagerOld;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.o0O0oo00;
import p281o0O0O0oO.OooOO0;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p472o0Ooooo0.oO00000;
import p472o0Ooooo0.oO00000o;
import p473o0OooooO.o0O0O0o0;
import p473o0OooooO.o0O0OO0;
import p542o0o0o00O.o00Ooo;
import p542o0o0o00O.o0OO00O;
import p542o0o0o00O.o0Oo0oo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/service/im/IMMessageService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class IMMessageService extends LifecycleService {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static IMMessageService f24939OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f24940OooO0Oo = new o0Oo0oo(this);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f24941OooO0o0 = LazyKt.lazy(new OooO0o());

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            FirebaseMessaging firebaseMessaging;
            Task<String> task;
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            boolean zBooleanValue = it.booleanValue();
            IMMessageService iMMessageService = IMMessageService.this;
            if (zBooleanValue) {
                o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(OooOO0.OooO0OO());
                }
                o0O0o00O.OooO00o oooO00o = firebaseMessaging.f20234OooO0O0;
                int i = 1;
                if (oooO00o != null) {
                    task = oooO00o.OooO0OO();
                } else {
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f20240OooO0oo.execute(new o0O0oo00(i, firebaseMessaging, taskCompletionSource));
                    task = taskCompletionSource.getTask();
                }
                task.addOnSuccessListener(new com.google.android.material.search.OooO0O0(o0O0O0o0.f47206OooO0Oo));
                if ((oO00000o.f47196OooO0OO == null ? 0 : 1) == 0) {
                    oO00000o.f47196OooO0OO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oO00000(false, null), 2, null);
                }
                iMMessageService.f24940OooO0Oo.OooO0OO();
                OooOOO0.OooO0OO("IMMessageService", "connect " + iMMessageService);
                ((o0OO00O) iMMessageService.f24941OooO0o0.getValue()).OooO0OO();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(iMMessageService), Dispatchers.getIO(), null, new com.yalla.yalla.service.im.OooO00o(null), 2, null);
            } else {
                OooOOO0.OooO0OO("IMMessageService", "disconnect " + iMMessageService);
                IMMessageService iMMessageService2 = IMMessageService.f24939OooO0o;
                ((o0OO00O) iMMessageService.f24941OooO0o0.getValue()).disconnect();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0O0OO0(null), 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Object> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                OooOOO0.OooO0OO("MessageService", "New_Message_Firebase : getMessageFromServer");
                IMMessageService.this.f24940OooO0Oo.OooO0OO();
            }
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24944OooO0Oo;

        public OooO0OO(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24944OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24944OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24944OooO0Oo;
        }

        public final int hashCode() {
            return this.f24944OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24944OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0OO00O> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO00O invoke() {
            int iOooO0OO = o00Oo0.OooO0O0().OooO0OO("socket", 0);
            IMMessageService iMMessageService = IMMessageService.this;
            return iOooO0OO == 0 ? new o00Ooo(iMMessageService, iMMessageService.f24940OooO0Oo) : new IMSocketManagerOld(iMMessageService, iMMessageService.f24940OooO0Oo);
        }
    }

    public final void OooO00o() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            OooOOO0.OooO0OO("IMMessageService", "fixConnect " + this);
            ((o0OO00O) this.f24941OooO0o0.getValue()).OooO00o();
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooOOO0.OooO0OO("IMMessageService", "onCreate " + this);
        f24939OooO0o = this;
        SharedMessageVM.INSTANCE.getConnectState();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(this, new OooO0OO(new OooO00o()));
        LiveEventBus.get("New_Message_Firebase").observeSticky(this, new OooO0O0());
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f24939OooO0o = null;
        OooOOO0.OooO0OO("IMMessageService", "onDestroy " + this);
        ((o0OO00O) this.f24941OooO0o0.getValue()).disconnect();
    }
}
