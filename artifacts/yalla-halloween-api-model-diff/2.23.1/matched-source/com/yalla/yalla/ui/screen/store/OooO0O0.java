package com.yalla.yalla.ui.screen.store;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p386o0OOoo0O.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<p182o00o000O.OooO0o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeCustomCreateVM f29160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29161OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29162OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(RoomThemeCustomCreateVM roomThemeCustomCreateVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
        super(1);
        this.f29160OooO0Oo = roomThemeCustomCreateVM;
        this.f29162OooO0o0 = lifecycleOwner;
        this.f29161OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p182o00o000O.OooO0o oooO0o) {
        p182o00o000O.OooO0o oooO0o2 = oooO0o;
        if (oooO0o2 != null) {
            Intrinsics.checkNotNull(oooO0o2);
            String str = oooO0o2.f38399OooO0O0;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = this.f29160OooO0Oo;
            roomThemeCustomCreateVM.purchaseNewTheme(str, roomThemeCustomCreateVM.getCurrentThemeType()).observe(this.f29162OooO0o0, new o0OoOo0(new OooO00o(this.f29161OooO0o), null, null, false, 14));
        }
        return Unit.INSTANCE;
    }
}
