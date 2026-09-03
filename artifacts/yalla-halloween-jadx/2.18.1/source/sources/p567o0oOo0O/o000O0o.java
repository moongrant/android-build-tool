package p567o0oOo0O;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.app.base.base.activity.BaseActivity;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p176o00OoooO.oO00OOOo;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostCommentSonModel f45432Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ TextView f45433OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ SVGAView f45434OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f45435OoooO0O;

    public o000O0o(o000Oo0 o000oo1, PostCommentSonModel postCommentSonModel, SVGAView sVGAView, TextView textView) {
        this.f45435OoooO0O = o000oo1;
        this.f45432Oooo = postCommentSonModel;
        this.f45434OoooO00 = sVGAView;
        this.f45433OoooO0 = textView;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        final PostCommentSonModel postCommentSonModel = this.f45432Oooo;
        final SVGAView sVGAView = this.f45434OoooO00;
        final TextView textView = this.f45433OoooO0;
        Function0 onLogin = new Function0() { // from class: o0oOo0O.o000O000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final o000O0o o000o0o2 = this.f45428Oooo0o;
                final PostCommentSonModel postCommentSonModel2 = postCommentSonModel;
                final SVGAView sVGAView2 = sVGAView;
                final TextView textView2 = textView;
                Objects.requireNonNull(o000o0o2);
                o0O00000.OooO0OO("Monents_commentFlower");
                if (OooOOO.f41216OooO00o.OooOo().getValue().longValue() == postCommentSonModel2.getUserid()) {
                    ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.send_reward_self));
                    return null;
                }
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                if (OooOOO0.OooO().OooOO0O()) {
                    o000Oo0.OooO00o(o000o0o2.f45435OoooO0O, postCommentSonModel2, sVGAView2, textView2);
                    return null;
                }
                oO00OOOo.OooO00o((BaseActivity) o000o0o2.f45435OoooO0O.getContext(), new Function0() { // from class: o0oOo0O.o000
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        o000O0o o000o0o3 = o000o0o2;
                        o000Oo0.OooO00o(o000o0o3.f45435OoooO0O, postCommentSonModel2, sVGAView2, textView2);
                        return null;
                    }
                });
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }
}
