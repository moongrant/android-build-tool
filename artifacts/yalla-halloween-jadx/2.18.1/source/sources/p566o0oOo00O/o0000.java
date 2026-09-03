package p566o0oOo00O;

import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.functions.Function0;
import p567o0oOo0O.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements Function0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f45185Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f45186Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f45187Oooo0oo;

    public /* synthetic */ o0000(Object obj, Object obj2, int i) {
        this.f45185Oooo0o = i;
        this.f45186Oooo0oO = obj;
        this.f45187Oooo0oo = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45185Oooo0o) {
            case 0:
                o0000O00 o0000o00 = (o0000O00) this.f45186Oooo0oO;
                FollowerActivity.OooOoO(o0000o00.f45198OoooO00.f45205OooO00o, (UserInfoModel) this.f45187Oooo0oo);
                break;
            default:
                SVGAView sVGAView = (SVGAView) this.f45186Oooo0oO;
                ImageView imageView = (ImageView) this.f45187Oooo0oo;
                int i = o000Oo0.f45440OooO0oO;
                sVGAView.setVisibility(4);
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.icon_reward_red);
                break;
        }
        return null;
    }
}
