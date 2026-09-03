package com.yalla.yalla.util.permission;

import android.app.Activity;
import com.code.android.util.o0000;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o0000O0O;
import p519o0o0O0oO.u;
import p519o0o0O0oO.v;
import p519o0o0O0oO.w;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO extends Lambda implements Function1<List<? extends String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f32876OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f32877OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PermissionGroupReveal.RevealGroupType f32878OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(Activity activity, PermissionGroupReveal.RevealGroupType revealGroupType, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.f32876OooO0Oo = activity;
        this.f32878OooO0o0 = revealGroupType;
        this.f32877OooO0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends String> list) {
        List<? extends String> onDenied = list;
        Intrinsics.checkNotNullParameter(onDenied, "$this$onDenied");
        w wVar = new w(this.f32876OooO0Oo);
        String message = o0000.OooO0OO(this.f32878OooO0o0.f32889OooO0oO);
        Intrinsics.checkNotNullParameter(message, "message");
        Activity activity = wVar.f53178OooO00o;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            Lazy lazy = wVar.f53179OooO0O0;
            o0OO00O o0oo00o2 = (o0OO00O) lazy.getValue();
            if (o0000O0O.OooO0o(message)) {
                o0oo00o2.OooOo00(message);
            }
            o0oo00o2.OooOo0O(new u(wVar));
            o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Open_Settings));
            o0oo00o2.OooOo0(new v(wVar));
            ((o0OO00O) lazy.getValue()).OooOO0o();
        }
        Function1<Boolean, Unit> function1 = this.f32877OooO0o;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
