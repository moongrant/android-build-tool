package com.yalla.yalla.service.im;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleService;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.data.Oooo000;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.socket.IMSocketManagerOld;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00OO000;
import p143o00OOooo.o00OO00O;
import p159o00OoOO.o000O;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p531o0o0OOO0.o00O0;
import p531o0o0OOO0.oOO00O;
import p531o0o0OOO0.oo00o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/service/im/IMMessageService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class IMMessageService extends LifecycleService {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final /* synthetic */ int f21662Oooo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final oo00o f21663Oooo0o = new oo00o(this);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f21664Oooo0oO = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Job f21665Oooo0oo;

    public static final class OooO00o extends Lambda implements Function0<o00O0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0 invoke() {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            if (OooOOO0.OooO0O0().OooO0O0("socket", 0) == 0) {
                IMMessageService iMMessageService = IMMessageService.this;
                return new oOO00O(iMMessageService, iMMessageService.f21663Oooo0o);
            }
            IMMessageService iMMessageService2 = IMMessageService.this;
            return new IMSocketManagerOld(iMMessageService2, iMMessageService2.f21663Oooo0o);
        }
    }

    public final o00O0 OooO00o() {
        return (o00O0) this.f21664Oooo0oO.getValue();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        SharedMessageVM.INSTANCE.getConnectState();
        int i = 3;
        OooOOO.f41216OooO00o.OooOooO().observe(this, new o000O(this, i));
        LiveEventBus.get("New_Message_Firebase").observeSticky(this, new o00OO00O(this, 2));
        LiveEventBus.get("INTENT_FIREBASE").observeStickyForever(Oooo000.f20626OooO0OO);
        LiveEventBus.get("Check_Connect").observe(this, new o00OO000(this, i));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        OooO00o().disconnect();
    }
}
