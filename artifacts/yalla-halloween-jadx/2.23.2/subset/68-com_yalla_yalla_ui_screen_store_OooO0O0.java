package com.yalla.yalla.ui.screen.store;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<p182o00o000O.OooO0o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeCustomCreateVM f29150OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29151OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29152OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(RoomThemeCustomCreateVM roomThemeCustomCreateVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
        super(1);
        this.f29150OooO0Oo = roomThemeCustomCreateVM;
        this.f29152OooO0o0 = lifecycleOwner;
        this.f29151OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p182o00o000O.OooO0o oooO0o) {
        p182o00o000O.OooO0o oooO0o2 = oooO0o;
        if (oooO0o2 != null) {
            Intrinsics.checkNotNull(oooO0o2);
            String str = oooO0o2.f38404OooO0O0;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29150OooO0Oo;
            roomThemeCustomCreateVM.purchaseNewTheme(str, roomThemeCustomCreateVM.getCurrentThemeType()).observe(this.f29152OooO0o0, new o000oOoO(new OooO00o(this.f29151OooO0o), null, null, false, 14));
        }
        return Unit.INSTANCE;
    }
}
