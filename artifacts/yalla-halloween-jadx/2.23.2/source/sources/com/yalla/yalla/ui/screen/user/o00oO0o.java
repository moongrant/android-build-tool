package com.yalla.yalla.ui.screen.user;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.user.VisitorUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.user.UserVisitorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserVisitorScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserVisitorScreen.kt\ncom/yalla/yalla/ui/screen/user/UserVisitorScreen$Content$1$1$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VisitorUserInfoModel f29644OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserVisitorVM f29645OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(VisitorUserInfoModel visitorUserInfoModel, UserVisitorVM userVisitorVM) {
        super(0);
        this.f29644OooO0Oo = visitorUserInfoModel;
        this.f29645OooO0o0 = userVisitorVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String vid;
        VisitorUserInfoModel visitorUserInfoModel = this.f29644OooO0Oo;
        if (!visitorUserInfoModel.getIsnew() && (vid = visitorUserInfoModel.getVid()) != null) {
            this.f29645OooO0o0.visitorClick(vid);
        }
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activityOooO0O0, String.valueOf(visitorUserInfoModel.getUserId()), false, 12);
        }
        return Unit.INSTANCE;
    }
}
