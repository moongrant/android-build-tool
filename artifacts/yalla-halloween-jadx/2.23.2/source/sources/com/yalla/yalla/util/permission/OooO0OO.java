package com.yalla.yalla.util.permission;

import android.app.Activity;
import com.code.android.util.o0000;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p423o0OoO0OO.o00O00OO;
import p562o0oOo000.o000000;
import p650o0ooo.x;
import p650o0ooo.y;
import p650o0ooo.z;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function1<List<? extends String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f32332OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f32333OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PermissionGroupReveal.RevealGroupType f32334OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(Activity activity, PermissionGroupReveal.RevealGroupType revealGroupType, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.f32332OooO0Oo = activity;
        this.f32334OooO0o0 = revealGroupType;
        this.f32333OooO0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends String> list) {
        List<? extends String> onDenied = list;
        Intrinsics.checkNotNullParameter(onDenied, "$this$onDenied");
        z zVar = new z(this.f32332OooO0Oo);
        String message = o0000.OooO0OO(this.f32334OooO0o0.f32345OooO0oO);
        Intrinsics.checkNotNullParameter(message, "message");
        Activity activity = zVar.f59243OooO00o;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            Lazy lazy = zVar.f59244OooO0O0;
            o000O o000o = (o000O) lazy.getValue();
            if (o00O00OO.OooO0o(message)) {
                o000o.OooOo00(message);
            }
            o000o.OooOo0O(new x(zVar));
            o000o.OooOOOo(o0000.OooO0OO(o000000.Open_Settings));
            o000o.OooOo0(new y(zVar));
            ((o000O) lazy.getValue()).OooOO0o();
        }
        Function1<Boolean, Unit> function1 = this.f32333OooO0o;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
