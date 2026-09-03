package p538o0o0Oo0;

import OooO00o.OooO00o;
import android.os.Looper;
import android.view.View;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p620o0oo0o0O.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43962Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        super(1);
        this.f43962Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43962Oooo0o;
        PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
        int iOooO0Oo = postDetailCommentSonListActivity.Oooo000().f49456OooO0Oo.getSpanManager().OooO0Oo("@");
        PostDetailCommentSonListActivity postDetailCommentSonListActivity2 = this.f43962Oooo0o;
        if (iOooO0Oo >= postDetailCommentSonListActivity2.f22475Ooooo00) {
            String string = postDetailCommentSonListActivity2.getString(R.string.Mention_a_maximum_of_XXX_people);
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
            sbOooO0o0.append(this.f43962Oooo0o.f22475Ooooo00);
            String strOooO00o = OooOo.OooO00o(string, sbOooO0o0.toString());
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!StringsKt.isBlank(strOooO00o)) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        } else {
            postDetailCommentSonListActivity2.f22489o00oO0o = true;
            postDetailCommentSonListActivity2.OoooO00(false);
            oo00o.OooO00o oooO00o2 = oo00o.f48621OooO0OO;
            oo00o oo00oVar = new oo00o(this.f43962Oooo0o);
            oo00oVar.f48623OooO0O0 = AtFriendsActivity.class;
            oo00oVar.OooO00o(new oo0O(this.f43962Oooo0o));
        }
        return Unit.INSTANCE;
    }
}
