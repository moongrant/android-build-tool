package com.yalla.yalla.ui.activity.user;

import com.yalla.yalla.model.PremiumLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f27138OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f27139OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(o0OO00O o0oo00o2, UserInfoActivity userInfoActivity) {
        super(0);
        this.f27138OooO0Oo = o0oo00o2;
        this.f27139OooO0o0 = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("105072");
        this.f27138OooO0Oo.OooO0OO();
        int i = PremiumActivity.f27140Oooo0oO;
        UserInfoActivity userInfoActivity = this.f27139OooO0o0;
        userInfoActivity.getClass();
        PremiumActivity.OooO00o.OooO00o(userInfoActivity, PremiumLevel.Premium4);
        return Unit.INSTANCE;
    }
}
