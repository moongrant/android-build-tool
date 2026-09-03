package p601o0oo00Oo;

import android.content.Context;
import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeFollow;
import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p034OoooO0O.o0Oo0oo;
import p074o000O0oo.OooOOO;
import p140o00OOOoO.OooO0OO;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p498o0o00Oo0.o00O0OO;
import p569o0oOo0OO.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo0o extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48193OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(MomentDetailView momentDetailView, Context context) {
        super(context);
        this.f48193OooO00o = momentDetailView;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String error, @NotNull String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(error, message);
        if (Intrinsics.areEqual("1032", error)) {
            MomentDetailModel momentDetailModel = this.f48193OooO00o.f24941Oooo0oo;
            if (momentDetailModel != null) {
                momentDetailModel.setFollow(false);
            }
            this.f48193OooO00o.f24939Oooo0o.f50259OooOo0O.OooO0OO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f31885OooO00o = 19;
        MomentDetailModel momentDetailModel = this.f48193OooO00o.f24941Oooo0oo;
        if (momentDetailModel != null && momentDetailModel.getIsFollow()) {
            MomentDetailModel momentDetailModel2 = this.f48193OooO00o.f24941Oooo0oo;
            if (momentDetailModel2 != null) {
                momentDetailModel2.setFollow(false);
            }
            oooO0OO.f31886OooO0O0 = 0;
        } else {
            MomentDetailModel momentDetailModel3 = this.f48193OooO00o.f24941Oooo0oo;
            if (momentDetailModel3 != null) {
                momentDetailModel3.setFollow(true);
            }
            oooO0OO.f31886OooO0O0 = 1;
            String string = this.f48193OooO00o.getResources().getString(R.string.post_list_follow_succeed);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(string == null || StringsKt.isBlank(string))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        }
        this.f48193OooO00o.f24939Oooo0o.f50259OooOo0O.OooO0OO();
        MomentDetailModel momentDetailModel4 = this.f48193OooO00o.f24941Oooo0oo;
        oooO0OO.f31887OooO0OO = momentDetailModel4 != null ? OooO.OooO(Long.valueOf(momentDetailModel4.getUserId()), "") : 0;
        o0Oo0oo.OooO0o(oooO0OO);
        MomentDetailView momentDetailView = this.f48193OooO00o;
        MomentLogSourcePage sourcePage = momentDetailView.f24952Ooooo00 ? MomentLogSourcePage.moments_content : o000O00O.OooO00o(momentDetailView.f24938Oooo);
        if (sourcePage == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel5 = momentDetailView.f24941Oooo0oo;
        sb.append(momentDetailModel5 != null ? Long.valueOf(momentDetailModel5.getUserId()) : null);
        sb.append("");
        if (o0O0O00.OooO(sb.toString())) {
            return;
        }
        if (sourcePage == MomentLogSourcePage.moments_following_recommend || sourcePage == MomentLogSourcePage.moments_featured || sourcePage == MomentLogSourcePage.moments_content) {
            MomentLogActionTypeFollow momentLogActionTypeFollow = new MomentLogActionTypeFollow(null, 1, null);
            StringBuilder sb2 = new StringBuilder();
            MomentDetailModel momentDetailModel6 = momentDetailView.f24941Oooo0oo;
            sb2.append(momentDetailModel6 != null ? Long.valueOf(momentDetailModel6.getUserId()) : null);
            sb2.append("");
            momentLogActionTypeFollow.setObject_userid(sb2.toString());
            MomentLogActionType actionType = MomentLogActionType.follow;
            String actionInfo = momentLogActionTypeFollow.toJson();
            MomentDetailModel momentDetailModel7 = momentDetailView.f24941Oooo0oo;
            String sessionId = momentDetailModel7 != null ? momentDetailModel7.getSessionId() : null;
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(sourcePage, actionType, actionInfo, sessionId, null), 3, null);
        }
    }
}
