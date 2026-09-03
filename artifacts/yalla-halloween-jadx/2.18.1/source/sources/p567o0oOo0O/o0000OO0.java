package p567o0oOo0O;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeCommentPraise;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o000O000.OooO00o;
import o00OO0O0.o0OOO0o;
import o0o0000.OooOo;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.o00O0O0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostCommentSonModel f45419Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f45420OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PraiseView f45421OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f45422OoooO0O;

    public o0000OO0(o000Oo0 o000oo1, PostCommentSonModel postCommentSonModel, PraiseView praiseView, OooO0o oooO0o) {
        this.f45422OoooO0O = o000oo1;
        this.f45419Oooo = postCommentSonModel;
        this.f45421OoooO00 = praiseView;
        this.f45420OoooO0 = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        final PostCommentSonModel postCommentSonModel = this.f45419Oooo;
        final PraiseView praiseView = this.f45421OoooO00;
        final OooO0o oooO0o = this.f45420OoooO0;
        Function0 onLogin = new Function0() { // from class: o0oOo0O.o000OO
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final o0000OO0 o0000oo1 = this.f45437Oooo0o;
                final PostCommentSonModel postCommentSonModel2 = postCommentSonModel;
                final PraiseView praiseView2 = praiseView;
                final OooO0o oooO0o2 = oooO0o;
                Objects.requireNonNull(o0000oo1);
                boolean zIsPraise = postCommentSonModel2.isPraise();
                LiveData<ApiResult<PraiseCommentResultModel>> liveDataCommentPraise = o0000oo1.f45422OoooO0O.f45446OooO0o0.commentPraise(postCommentSonModel2.getId() + "", zIsPraise ? 1 : 0);
                AppCompatActivity appCompatActivity = o0000oo1.f45422OoooO0O.f45445OooO0o;
                final int i = zIsPraise ? 1 : 0;
                liveDataCommentPraise.observe(appCompatActivity, new OooOo(new Function1() { // from class: o0oOo0O.o0000O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        o0000OO0 o0000oo2 = o0000oo1;
                        PostCommentSonModel postCommentSonModel3 = postCommentSonModel2;
                        PraiseView praiseView3 = praiseView2;
                        int i2 = i;
                        OooO0o oooO0o3 = oooO0o2;
                        PraiseCommentResultModel praiseCommentResultModel = (PraiseCommentResultModel) obj;
                        Objects.requireNonNull(o0000oo2);
                        if (!o0O0O00.OooO(postCommentSonModel3.getParentUserId())) {
                            MomentLogActionTypeCommentPraise momentLogActionTypeCommentPraise = new MomentLogActionTypeCommentPraise();
                            momentLogActionTypeCommentPraise.setObject_userid(postCommentSonModel3.getParentUserId());
                            momentLogActionTypeCommentPraise.setDiscoveryid(o0000oo2.f45422OoooO0O.f45443OooO0OO);
                            momentLogActionTypeCommentPraise.setComment_id(OooO.OooO(Long.valueOf(postCommentSonModel3.getId()), ""));
                            MomentLogActionType actionType = MomentLogActionType.comment_praise;
                            String actionInfo = momentLogActionTypeCommentPraise.toJson();
                            Intrinsics.checkNotNullParameter(actionType, "actionType");
                            Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0O0(actionType, actionInfo, null, null), 3, null);
                        }
                        praiseView3.OooO0Oo(i2 == 0);
                        postCommentSonModel3.setPraiseNum(praiseCommentResultModel.getNum());
                        postCommentSonModel3.setPraise(!postCommentSonModel3.isPraise());
                        oooO0o3.OooOO0(R.id.item_post_detail_comment_son_list_praiseCount, o0O0O00.OooO0oO(postCommentSonModel3.getPraiseNum(), false));
                        if (postCommentSonModel3.isPraise()) {
                            oooO0o3.OooOO0O(R.id.item_post_detail_comment_son_list_praiseCount, OooO00o.OooO0O0(o0000oo2.f45422OoooO0O.getContext(), R.color.color_FE6C6C));
                        } else {
                            oooO0o3.OooOO0O(R.id.item_post_detail_comment_son_list_praiseCount, OooO00o.OooO0O0(o0000oo2.f45422OoooO0O.getContext(), R.color.color_54000000));
                        }
                        return null;
                    }
                }, null, null, false));
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
