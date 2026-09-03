package com.yalla.yalla.ui.screen.store;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<p136o00OOOo0.OooO0OO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeCustomCreateVM f29688OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29689OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29690OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(RoomThemeCustomCreateVM roomThemeCustomCreateVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
        super(1);
        this.f29688OooO0Oo = roomThemeCustomCreateVM;
        this.f29690OooO0o0 = lifecycleOwner;
        this.f29689OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p136o00OOOo0.OooO0OO oooO0OO) {
        p136o00OOOo0.OooO0OO oooO0OO2 = oooO0OO;
        if (oooO0OO2 != null) {
            Intrinsics.checkNotNull(oooO0OO2);
            String str = oooO0OO2.f37354OooO0O0;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29688OooO0Oo;
            roomThemeCustomCreateVM.purchaseNewTheme(str, roomThemeCustomCreateVM.getCurrentThemeType()).observe(this.f29690OooO0o0, new o0000OO0(new OooO00o(this.f29689OooO0o), null, null, false, 14));
        }
        return Unit.INSTANCE;
    }
}
