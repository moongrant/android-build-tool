package p538o0o0Oo0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 extends Lambda implements Function3<Boolean, Integer, View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailActivity f43903Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(PostDetailActivity postDetailActivity) {
        super(3);
        this.f43903Oooo0o = postDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Boolean bool, Integer num, View view) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        if (zBooleanValue) {
            PostDetailActivity postDetailActivity = this.f43903Oooo0o;
            PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
            postDetailActivity.OooOooO().f50583OooO0oo.setImageResource(R.drawable.icon_emoji);
        } else {
            PostDetailActivity postDetailActivity2 = this.f43903Oooo0o;
            PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22417o0O0O00;
            postDetailActivity2.OooOooO().f50583OooO0oo.setImageResource(R.drawable.icon_keyboard);
        }
        return Unit.INSTANCE;
    }
}
