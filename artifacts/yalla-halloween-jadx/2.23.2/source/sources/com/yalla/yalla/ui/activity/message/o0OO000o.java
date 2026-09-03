package com.yalla.yalla.ui.activity.message;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25516OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f25517OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f25518OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(YallaTeamMessageActivity yallaTeamMessageActivity, MutableState<String> mutableState, int i) {
        super(2);
        this.f25516OooO0Oo = yallaTeamMessageActivity;
        this.f25518OooO0o0 = mutableState;
        this.f25517OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25517OooO0o | 1);
        oo0oO0.OooO0O0(this.f25516OooO0Oo, this.f25518OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
