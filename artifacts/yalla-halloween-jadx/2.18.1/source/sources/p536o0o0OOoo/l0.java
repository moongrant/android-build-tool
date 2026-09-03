package p536o0o0OOoo;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends ClickableSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43812Oooo0o;

    public l0(PrivateChatActivity privateChatActivity) {
        this.f43812Oooo0o = privateChatActivity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        PrivateChatActivity privateChatActivity = this.f43812Oooo0o;
        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
        privateChatActivity.Oooo0O0().updateRiskFriend();
        this.f43812Oooo0o.Oooo00o().f49099OooO0oo.f49857OooO0O0.setVisibility(8);
        u5 u5Var = u5.f47570OooO00o;
        UserInfo userInfo = this.f43812Oooo0o.Oooo0O0().userInfo();
        Intrinsics.checkNotNull(userInfo);
        o000O.OooO00o(u5Var, u5.OooO0o(2, userInfo.getUserId(), (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.f43812Oooo0o.getResources().getColor(R.color.colorPrimary));
        ds.setUnderlineText(false);
        ds.clearShadowLayer();
    }
}
