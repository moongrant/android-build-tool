package com.yalla.yalla.ui.activity.main;

import com.yalla.yalla.ui.screen.user.MyUserInfoScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0o f25446OooO0Oo = new OooO0o();

    public OooO0o() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("105011");
        MyUserInfoScreen.INSTANCE.navigate();
        return Unit.INSTANCE;
    }
}
