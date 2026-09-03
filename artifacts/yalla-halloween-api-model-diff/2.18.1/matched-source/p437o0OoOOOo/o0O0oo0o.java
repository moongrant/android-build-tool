package p437o0OoOOOo;

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
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p506o0o00oO0.o00OO;
import p506o0o00oO0.o00OOO0;
import p601o0oo00Oo.o00O;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0oo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f40090Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f40091Oooo0oO;

    public /* synthetic */ o0O0oo0o(Object obj, int i) {
        this.f40090Oooo0o = i;
        this.f40091Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f40090Oooo0o) {
            case 0:
                ComposerView composerView = (ComposerView) this.f40091Oooo0oO;
                ((OooO00o.OooO0O0) composerView.f20073o000oOoO).OooO00o(composerView.getTweetText());
                break;
            case 1:
                o00OO.OooO00o this$0 = (o00OO.OooO00o) this.f40091Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout constraintLayout = this$0.OooOO0O().f49526OooO0OO;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutBg");
                o0O0O00.OooO0OO(this$0.f41632OoooO, oo0o0Oo.f48608OooO0OO, null, new o00OOO0(this$0, constraintLayout));
                break;
            case 2:
                UserInfoTagActivity this$1 = (UserInfoTagActivity) this.f40091Oooo0oO;
                UserInfoTagActivity.OooO00o oooO00o = UserInfoTagActivity.f23538o00ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                SparseArray<TagListModel.TagInfo> sparseArray = this$1.f23553o0OoOo0;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                TagListModel.TagInfo tagInfo = sparseArray.get(((Integer) tag).intValue());
                ArrayList<TagListModel.TagInfo> arrayList = this$1.f23547OoooooO;
                Intrinsics.checkNotNull(arrayList);
                TypeIntrinsics.asMutableCollection(arrayList).remove(this$1.Oooo00o(tagInfo.tagId));
                this$1.Oooo00O().f50747OooO0O0.removeView(view);
                TagListModel tagListModel = this$1.f23541Ooooo0o;
                Intrinsics.checkNotNull(tagListModel);
                int size = tagListModel.data.size();
                for (int i = 0; i < size; i++) {
                    TagListModel tagListModel2 = this$1.f23541Ooooo0o;
                    Intrinsics.checkNotNull(tagListModel2);
                    if (tagListModel2.data.get(i).tagId == tagInfo.typeId) {
                        this$1.Oooo000().notifyItemChanged(i);
                        if (this$1.f23543OooooOO == i) {
                            this$1.Oooo000().notifyItemChanged(this$1.f23544OooooOo);
                        }
                    }
                }
                ArrayList<TagListModel.TagInfo> arrayList2 = this$1.f23547OoooooO;
                Intrinsics.checkNotNull(arrayList2);
                if (arrayList2.size() == 0) {
                    this$1.Oooo00O().f50751OooO0o0.setVisibility(0);
                    this$1.Oooo00O().f50747OooO0O0.setVisibility(8);
                }
                this$1.Oooo0OO();
                this$1.Oooo0o();
                break;
            default:
                MomentDetailPollView this$2 = (MomentDetailPollView) this.f40091Oooo0oO;
                int i2 = MomentDetailPollView.f24891Ooooo0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                o00O onLogin = new o00O(this$2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o2 = LoginActivity.f21752OooooO0;
                        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                }
                break;
        }
    }
}
