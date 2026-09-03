package com.yalla.yalla.ui.activity.main;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.model.user.UserEditResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25437OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f25438OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(int i, ChangeRegionActivity changeRegionActivity) {
        super(1);
        this.f25437OooO0Oo = i;
        this.f25438OooO0o0 = changeRegionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            int i = this.f25437OooO0Oo;
            o0OO000.OooO0O0("205005", MapsKt.mapOf(new Pair("oldregion", o000000O.OooOOO0().getValue()), new Pair("newregion", Integer.valueOf(i))));
            App app = App.f22702OooO0o;
            Intrinsics.checkNotNullExpressionValue(app, "getContext()");
            p591o0oo000O.OooO.OooO0o(app);
            o000000O.OooOOO0().postValue(Integer.valueOf(i));
            LiveEventBus.get("RegionChange").postDelay(Boolean.TRUE, 500L);
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            o0OOO0o.OooO00o();
            int i2 = ChangeRegionActivity.f25377OooOoO0;
            ChangeRegionActivity changeRegionActivity = this.f25438OooO0o0;
            changeRegionActivity.getClass();
            o000000O.f46677OooO0Oo = false;
            changeRegionActivity.finish();
            int i3 = StartActivity.f25535OooO0o0;
            StartActivity.OooO00o.OooO0O0(changeRegionActivity);
        }
        return Unit.INSTANCE;
    }
}
