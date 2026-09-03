package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainExploreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainExploreFragment.kt\ncom/yalla/yalla/ui/fragment/MainExploreFragment$initView$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n1#2:478\n*E\n"})
public final class o0OOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainExploreFragment f28418OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(MainExploreFragment mainExploreFragment) {
        super(0);
        this.f28418OooO0Oo = mainExploreFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("101031");
        Context context = this.f28418OooO0Oo.getContext();
        if (context != null) {
            int i = MainSearchActivity.f24960OooOoO;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) MainSearchActivity.class));
        }
        return Unit.INSTANCE;
    }
}
