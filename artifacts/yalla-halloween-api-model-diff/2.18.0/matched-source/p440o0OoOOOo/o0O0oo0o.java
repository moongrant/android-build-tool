package p440o0OoOOOo;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.model.TagListModel;
import com.twitter.sdk.android.tweetcomposer.ComposerView;
import com.twitter.sdk.android.tweetcomposer.OooO00o;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import o00OO0O0.o0OOO0o;
import p255o00ooO0O.o00000O;
import p500o0o00Oo0.OooOOO;
import p508o0o00oO0.o00OOO00;
import p508o0o00oO0.o00OOO0O;
import p603o0oo00Oo.o00O;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0oo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f40110Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f40111OoooO00;

    public /* synthetic */ o0O0oo0o(Object obj, int i) {
        this.f40110Oooo = i;
        this.f40111OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f40110Oooo) {
            case 0:
                ComposerView composerView = (ComposerView) this.f40111OoooO00;
                ((OooO00o.OooO0O0) composerView.f20091OoooOo0).OooO00o(composerView.getTweetText());
                break;
            case 1:
                o00OOO00.OooO00o this$0 = (o00OOO00.OooO00o) this.f40111OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout constraintLayout = this$0.OooOO0O().f49463OooO0OO;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutBg");
                o0O0O00.OooO0OO(this$0.f41656OoooOOO, oo0o0Oo.f48625OooO0OO, null, new o00OOO0O(this$0, constraintLayout));
                break;
            case 2:
                UserInfoTagActivity this$1 = (UserInfoTagActivity) this.f40111OoooO00;
                UserInfoTagActivity.OooO00o oooO00o = UserInfoTagActivity.f23557o00oO0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                SparseArray<TagListModel.TagInfo> sparseArray = this$1.f23566o00Oo0;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                TagListModel.TagInfo tagInfo = sparseArray.get(((Integer) tag).intValue());
                ArrayList<TagListModel.TagInfo> arrayList = this$1.f23573ooOO;
                Intrinsics.checkNotNull(arrayList);
                TypeIntrinsics.asMutableCollection(arrayList).remove(this$1.Oooo00o(tagInfo.tagId));
                this$1.Oooo00O().f50684OooO0O0.removeView(view);
                TagListModel tagListModel = this$1.f23560OooooOo;
                Intrinsics.checkNotNull(tagListModel);
                int size = tagListModel.data.size();
                for (int i = 0; i < size; i++) {
                    TagListModel tagListModel2 = this$1.f23560OooooOo;
                    Intrinsics.checkNotNull(tagListModel2);
                    if (tagListModel2.data.get(i).tagId == tagInfo.typeId) {
                        this$1.Oooo000().notifyItemChanged(i);
                        if (this$1.f23561Oooooo == i) {
                            this$1.Oooo000().notifyItemChanged(this$1.f23563OoooooO);
                        }
                    }
                }
                ArrayList<TagListModel.TagInfo> arrayList2 = this$1.f23573ooOO;
                Intrinsics.checkNotNull(arrayList2);
                if (arrayList2.size() == 0) {
                    this$1.Oooo00O().f50688OooO0o0.setVisibility(0);
                    this$1.Oooo00O().f50684OooO0O0.setVisibility(8);
                }
                this$1.Oooo0OO();
                this$1.Oooo0o();
                break;
            default:
                MomentDetailPollView this$2 = (MomentDetailPollView) this.f40111OoooO00;
                int i2 = MomentDetailPollView.f24910OooooOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                o00O onLogin = new o00O(this$2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o2 = LoginActivity.f21771Oooooo0;
                        o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                }
                break;
        }
    }
}
