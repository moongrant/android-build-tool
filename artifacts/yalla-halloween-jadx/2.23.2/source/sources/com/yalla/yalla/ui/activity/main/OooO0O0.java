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
import p429o0OoOO.o0Oo0oo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f24983OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f24984OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(int i, ChangeRegionActivity changeRegionActivity) {
        super(1);
        this.f24983OooO0Oo = i;
        this.f24984OooO0o0 = changeRegionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            int i = this.f24983OooO0Oo;
            o0oo0000.OooO00o.OooO0OO("205005", MapsKt.mapOf(new Pair("oldregion", o0O00oO0.OooOOO0().getValue()), new Pair("newregion", Integer.valueOf(i))));
            App app = App.f22232OooO0o;
            Intrinsics.checkNotNullExpressionValue(app, "getContext(...)");
            p595o0oo00O.OooOo00.OooO0o(app);
            o0O00oO0.OooOOO0().postValue(Integer.valueOf(i));
            LiveEventBus.get("RegionChange").postDelay(Boolean.TRUE, 500L);
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            int i2 = ChangeRegionActivity.f24923OooOoO0;
            ChangeRegionActivity changeRegionActivity = this.f24984OooO0o0;
            changeRegionActivity.getClass();
            o0O00oO0.f47939OooO0Oo = false;
            changeRegionActivity.finish();
            int i3 = StartActivity.f25081OooO0o0;
            StartActivity.OooO00o.OooO0O0(changeRegionActivity);
        }
        return Unit.INSTANCE;
    }
}
