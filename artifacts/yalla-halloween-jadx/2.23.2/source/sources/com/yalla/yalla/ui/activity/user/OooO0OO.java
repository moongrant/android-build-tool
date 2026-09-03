package com.yalla.yalla.ui.activity.user;

import com.yalla.yalla.model.SupportInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSupportTopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportTopActivity.kt\ncom/yalla/yalla/ui/activity/user/SupportTopActivity$itemClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f26658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SupportInfo.UserData f26659OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(SupportTopActivity supportTopActivity, SupportInfo.UserData userData) {
        super(0);
        this.f26658OooO0Oo = supportTopActivity;
        this.f26659OooO0o0 = userData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SupportTopActivity supportTopActivity = this.f26658OooO0Oo;
        supportTopActivity.getClass();
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, supportTopActivity, String.valueOf(this.f26659OooO0o0.getUserId()), false, 12);
        return Unit.INSTANCE;
    }
}
