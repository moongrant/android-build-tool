package p538o0o0Oo0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO00O extends Lambda implements Function3<Boolean, Integer, View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43964Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        super(3);
        this.f43964Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Boolean bool, Integer num, View view) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        if (zBooleanValue) {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43964Oooo0o;
            PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity.Oooo000().f49457OooO0o.setImageResource(R.drawable.icon_emoji);
        } else {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity2 = this.f43964Oooo0o;
            PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity2.Oooo000().f49457OooO0o.setImageResource(R.drawable.icon_keyboard);
        }
        return Unit.INSTANCE;
    }
}
