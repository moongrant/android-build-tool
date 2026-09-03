package com.yalla.yalla.ui.fragment.mainroom;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainRoomFragment f24453Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MainRoomFragment mainRoomFragment) {
        super(0);
        this.f24453Oooo0o = mainRoomFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Room_search");
        Context context = this.f24453Oooo0o.getContext();
        if (context == null) {
            return null;
        }
        MainSearchActivity.OooO00o oooO00o = MainSearchActivity.f21967Oooooo0;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) MainSearchActivity.class));
        return Unit.INSTANCE;
    }
}
