package p568o0oOo00O;

import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.functions.Function0;
import p569o0oOo0O.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000Ooo implements Function0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45216Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f45217OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f45218OoooO00;

    public /* synthetic */ o0000Ooo(Object obj, Object obj2, int i) {
        this.f45216Oooo = i;
        this.f45218OoooO00 = obj;
        this.f45217OoooO0 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45216Oooo) {
            case 0:
                o0000 o0000Var = (o0000) this.f45218OoooO00;
                FollowerActivity.OooOoO(o0000Var.f45200OoooO.f45212OooO00o, (UserInfoModel) this.f45217OoooO0);
                break;
            default:
                SVGAView sVGAView = (SVGAView) this.f45218OoooO00;
                ImageView imageView = (ImageView) this.f45217OoooO0;
                int i = o000Oo0.f45456OooO0oO;
                sVGAView.setVisibility(4);
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.icon_reward_red);
                break;
        }
        return null;
    }
}
