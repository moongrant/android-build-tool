package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function1<UserInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchUserFragment f28905OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(MainSearchUserFragment mainSearchUserFragment) {
        super(1);
        this.f28905OooO0Oo = mainSearchUserFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserInfoModel userInfoModel) {
        UserInfoModel it = userInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f28905OooO0Oo.userFollow(it);
        return Unit.INSTANCE;
    }
}
