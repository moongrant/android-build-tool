package com.yalla.yalla.ui.activity.account;

import android.view.View;
import com.yalla.yalla.data.constant.ClientCodeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f25216OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f25216OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = PhoneNumberActivity.f25262OooOoO;
        PhoneNumberActivity phoneNumberActivity = this.f25216OooO0Oo;
        PhoneNumberActivity.OooO00o.OooO00o(phoneNumberActivity, phoneNumberActivity.f25268OooOo0o, ClientCodeType.Register);
        return Unit.INSTANCE;
    }
}
