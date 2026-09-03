package p143o00OOooO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.app.base.fragment.FriendsListFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.SupportInfo;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicNewFragment;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p187o00o00Oo.o0ooOOo;
import p255o00ooO0O.o00000O;
import p383o0OOoOOO.oo0o0O0;
import p468o0OooO0.o000Oo0;
import p500o0o00Oo0.OooOOO;
import p568o0oOo00O.o00O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements o0ooOOo, OooO0OO.OooO0O0, Continuation, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31985Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31986OoooO00;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f31985Oooo = i;
        this.f31986OoooO00 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        o000Oo0 o000oo1 = ((OooOO0.OooO0O0) this.f31986OoooO00).f13254Oooo;
        oooO00o.Oooo0o0(o000oo1.f40581OooO0oO, o000oo1.f40582OooO0oo.f36783OooO0OO);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31985Oooo) {
            case 3:
                AccountProtectionActivity activity = (AccountProtectionActivity) this.f31986OoooO00;
                int i2 = AccountProtectionActivity.f21730Oooooo0;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                Object obj = baseQuickAdapter.getData().get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.TrustedDevice");
                TrustedDevice item = (TrustedDevice) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(item, "item");
                Intent intent = new Intent(activity, (Class<?>) ProtectionDetailActivity.class);
                intent.putExtra("TrustedDevice", item);
                activity.startActivity(intent);
                break;
            case 4:
                SupportTopActivity this$0 = (SupportTopActivity) this.f31986OoooO00;
                SupportTopActivity.OooO00o oooO00o = SupportTopActivity.f23430Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object obj2 = baseQuickAdapter.getData().get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.common.model.SupportInfo.UserData");
                Objects.requireNonNull(this$0);
                o00O0O0O onLogin = new o00O0O0O(this$0, (SupportInfo.UserData) obj2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (!Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                } else {
                    onLogin.invoke();
                }
                break;
            default:
                MainMomentsTopicNewFragment.m358initView$lambda5((MainMomentsTopicNewFragment) this.f31986OoooO00, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        ((FriendsListFragment) this.f31986OoooO00).freshLoad();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        Objects.requireNonNull((oo0o0O0) this.f31986OoooO00);
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
