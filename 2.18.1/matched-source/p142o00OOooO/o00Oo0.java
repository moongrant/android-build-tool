package p142o00OOooO;

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
import p186o00o00Oo.o0ooOOo;
import p254o00ooO0O.o00000O;
import p381o0OOoOOO.oo0o0O0;
import p466o0OooO0.o000Oo0;
import p498o0o00Oo0.OooOOO;
import p566o0oOo00O.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements o0ooOOo, OooO0OO.OooO0O0, Continuation, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31964OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31965OooO0o0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f31964OooO0Oo = i;
        this.f31965OooO0o0 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        o000Oo0 o000oo1 = ((OooOO0.OooO0O0) this.f31965OooO0o0).f13238Oooo0o;
        oooO00o.Oooo0o0(o000oo1.f40562OooO0oO, o000oo1.f40563OooO0oo.f36753OooO0OO);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31964OooO0Oo) {
            case 3:
                AccountProtectionActivity activity = (AccountProtectionActivity) this.f31965OooO0o0;
                int i2 = AccountProtectionActivity.f21711OooooO0;
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
                SupportTopActivity this$0 = (SupportTopActivity) this.f31965OooO0o0;
                SupportTopActivity.OooO00o oooO00o = SupportTopActivity.f23411OooooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object obj2 = baseQuickAdapter.getData().get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.common.model.SupportInfo.UserData");
                Objects.requireNonNull(this$0);
                o00O0OO0 onLogin = new o00O0OO0(this$0, (SupportInfo.UserData) obj2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (!Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                } else {
                    onLogin.invoke();
                }
                break;
            default:
                MainMomentsTopicNewFragment.m358initView$lambda5((MainMomentsTopicNewFragment) this.f31965OooO0o0, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        ((FriendsListFragment) this.f31965OooO0o0).freshLoad();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        Objects.requireNonNull((oo0o0O0) this.f31965OooO0o0);
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
