package com.yalla.yalla.ui.activity.user;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f26661OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(UserCountrySelectActivity userCountrySelectActivity) {
        super(0);
        this.f26661OooO0Oo = userCountrySelectActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        UserCountrySelectActivity userCountrySelectActivity = this.f26661OooO0Oo;
        int i = userCountrySelectActivity.f26742OooOoO;
        userCountrySelectActivity.f26742OooOoO = -1;
        userCountrySelectActivity.OooOo().notifyItemChanged(i);
        return null;
    }
}
