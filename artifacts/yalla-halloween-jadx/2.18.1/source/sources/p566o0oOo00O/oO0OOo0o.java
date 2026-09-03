package p566o0oOo00O;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.ItemVipModel;
import com.yalla.yalla.model.VipModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OOo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f45374Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ VipModel f45375Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ItemVipModel f45376Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(VipActivity vipActivity, VipModel vipModel, ItemVipModel itemVipModel) {
        super(0);
        this.f45374Oooo0o = vipActivity;
        this.f45375Oooo0oO = vipModel;
        this.f45376Oooo0oo = itemVipModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipActivity vipActivity = this.f45374Oooo0o;
        VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
        vipActivity.Oooo000().forEachItemKaVipModel(new ooOOOOoo(this.f45376Oooo0oo));
        final VipActivity vipActivity2 = this.f45374Oooo0o;
        final int kaVipLv = this.f45375Oooo0oO.getKaVipLv();
        final int privilegeId = this.f45376Oooo0oo.getPrivilegeId();
        Objects.requireNonNull(vipActivity2);
        SharedUrlManager.INSTANCE.getVipWebDetail().observe(vipActivity2, new Observer() { // from class: o0oOo00O.oO000O0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i = kaVipLv;
                int i2 = privilegeId;
                VipActivity context = vipActivity2;
                String url = (String) obj;
                VipActivity.OooO0O0 oooO0O1 = VipActivity.f23570OoooOOo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (url == null || StringsKt.isBlank(url)) {
                    return;
                }
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.KaVipDetails);
                Intrinsics.checkNotNullExpressionValue(url, "it");
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f21217Oooo0oO = url;
                webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.user_ka_vip_privilege_title));
                webPageInfo.OooO00o("kaVipLevel", String.valueOf(i));
                webPageInfo.OooO00o("privilegeId", String.valueOf(i2));
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                intent.putExtra("pageinfo", webPageInfo);
                context.startActivity(intent);
            }
        });
        return Unit.INSTANCE;
    }
}
