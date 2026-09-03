package com.yalla.yalla.ui.activity.message;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 extends ClickableSpan {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25364OooO0Oo;

    public o000O0O0(PrivateChatActivity privateChatActivity) {
        this.f25364OooO0Oo = privateChatActivity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        int i = PrivateChatActivity.f25239Oooo000;
        PrivateChatActivity privateChatActivity = this.f25364OooO0Oo;
        privateChatActivity.OooOo().updateRiskFriend();
        privateChatActivity.OooOo0().f44885OooO0oO.f45306OooO0O0.setVisibility(8);
        ReportScreen reportScreen = ReportScreen.INSTANCE;
        UserInfo userInfo = privateChatActivity.OooOo().userInfo();
        Intrinsics.checkNotNull(userInfo);
        p532o0o0OOo0.o00O00.OooO0o0(reportScreen, ReportScreen.bundleOf(2, userInfo.getUserId(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.f25364OooO0Oo.getResources().getColor(p562o0oOo000.o0OOO0o.colorPrimary));
        ds.setUnderlineText(false);
        ds.clearShadowLayer();
    }
}
