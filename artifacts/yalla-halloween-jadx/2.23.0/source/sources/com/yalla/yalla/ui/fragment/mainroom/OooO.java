package com.yalla.yalla.ui.fragment.mainroom;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainRoomFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment$initView$2$1$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomFragment f28495OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MainRoomFragment mainRoomFragment) {
        super(0);
        this.f28495OooO0Oo = mainRoomFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("101031");
        Context context = this.f28495OooO0Oo.getContext();
        if (context != null) {
            int i = MainSearchActivity.f25414OooOoO;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) MainSearchActivity.class));
        }
        return Unit.INSTANCE;
    }
}
