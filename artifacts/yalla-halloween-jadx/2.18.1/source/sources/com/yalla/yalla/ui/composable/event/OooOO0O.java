package com.yalla.yalla.ui.composable.event;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23726Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(o0O00OO<Boolean> o0o00oo2) {
        super(1);
        this.f23726Oooo0o = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.event_add_calendar_success));
        this.f23726Oooo0o.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
