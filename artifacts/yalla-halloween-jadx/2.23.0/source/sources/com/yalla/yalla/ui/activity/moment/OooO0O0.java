package com.yalla.yalla.ui.activity.moment;

import android.R;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity.OooO00o f26219OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(AddTopicListActivity.OooO00o oooO00o) {
        super(1);
        this.f26219OooO0Oo = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        AddTopicListActivity.OooO00o oooO00o = this.f26219OooO0Oo;
        AddTopicListActivity activity = oooO00o.f26020OooOoo0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        oooO00o.Oooo0o0(zBooleanValue);
        return Unit.INSTANCE;
    }
}
