package com.yalla.yalla.service.im;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.Observer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000Ooo;
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
import p415o0Oo0oO0.o00Ooo;
import p429o0OoOO.o00O0O;
import p475o0Ooooo0.o0O00oO0;
import p478o0o000.Oooo0;
import p480o0o000O.OooOOOO;
import p480o0o000O.o000oOoO;
import p480o0o000O.o0OoOo0;
import p544o0o0o00O.o0O0OO0;
import p544o0o0o00O.o0O0OOO0;
import p544o0o0o00O.oo0OOoo;
import p598o0oo00Oo.o0000O00;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/service/im/IMMessageService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class IMMessageService extends LifecycleService {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static IMMessageService f24478OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000oOoO f24479OooO0Oo = new o000oOoO(this);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f24480OooO0o0 = LazyKt.lazy(new OooO0OO());

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            final FirebaseMessaging firebaseMessaging;
            Task<String> task;
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            boolean zBooleanValue = bool2.booleanValue();
            IMMessageService iMMessageService = IMMessageService.this;
            if (zBooleanValue) {
                o0000Ooo o0000ooo = FirebaseMessaging.f19758OooOOO0;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(o0OOO0o.OooO0OO());
                }
                o0O0o0.OooO00o oooO00o = firebaseMessaging.f19762OooO0O0;
                if (oooO00o != null) {
                    task = oooO00o.OooO0OO();
                } else {
                    final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f19768OooO0oo.execute(new Runnable() { // from class: com.google.firebase.messaging.o000oOoO
                        @Override // java.lang.Runnable
                        public final void run() {
                            TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                            o0000Ooo o0000ooo2 = FirebaseMessaging.f19758OooOOO0;
                            FirebaseMessaging firebaseMessaging2 = firebaseMessaging;
                            firebaseMessaging2.getClass();
                            try {
                                taskCompletionSource2.setResult(firebaseMessaging2.OooO00o());
                            } catch (Exception e) {
                                taskCompletionSource2.setException(e);
                            }
                        }
                    });
                    task = taskCompletionSource.getTask();
                }
                task.addOnSuccessListener(new o00O0O(Oooo0.f48379OooO0Oo));
                if (!(o0O0OOO0.f55746OooO0OO != null)) {
                    o0O0OOO0.f55746OooO0OO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0O0OO0(false, null), 2, null);
                }
                iMMessageService.f24479OooO0Oo.OooO0OO();
                o0000O00.OooO0OO("IMMessageService", "connect " + iMMessageService);
                ((o0OoOo0) iMMessageService.f24480OooO0o0.getValue()).OooO0OO();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(iMMessageService), Dispatchers.getIO(), null, new com.yalla.yalla.service.im.OooO00o(null), 2, null);
            } else {
                o0000O00.OooO0OO("IMMessageService", "disconnect " + iMMessageService);
                IMMessageService iMMessageService2 = IMMessageService.f24478OooO0o;
                ((o0OoOo0) iMMessageService.f24480OooO0o0.getValue()).disconnect();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new p478o0o000.o000oOoO(null), 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f24482OooO0Oo;

        public OooO0O0(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24482OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f24482OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24482OooO0Oo;
        }

        public final int hashCode() {
            return this.f24482OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24482OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0OoOo0> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OoOo0 invoke() {
            int iOooO0OO = o00Ooo.OooO0O0().OooO0OO("socket", 0);
            IMMessageService iMMessageService = IMMessageService.this;
            return iOooO0OO == 0 ? new OooOOOO(iMMessageService, iMMessageService.f24479OooO0Oo) : new IMSocketManagerOld(iMMessageService, iMMessageService.f24479OooO0Oo);
        }
    }

    public final void OooO00o() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            o0000O00.OooO0OO("IMMessageService", "fixConnect " + this);
            ((o0OoOo0) this.f24480OooO0o0.getValue()).OooO00o();
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        o0000O00.OooO0OO("IMMessageService", "onCreate " + this);
        f24478OooO0o = this;
        SharedMessageVM.INSTANCE.getConnectState();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOo0O().observe(this, new OooO0O0(new OooO00o()));
        LiveEventBus.get("New_Message_Firebase").observeSticky(this, new oo0OOoo(this, 0));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f24478OooO0o = null;
        o0000O00.OooO0OO("IMMessageService", "onDestroy " + this);
        ((o0OoOo0) this.f24480OooO0o0.getValue()).disconnect();
    }
}
