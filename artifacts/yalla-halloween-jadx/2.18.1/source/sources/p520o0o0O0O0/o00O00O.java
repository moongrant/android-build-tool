package p520o0o0O0O0;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.http.CircleCreateCheck;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicCreateCheckModel;
import com.yalla.yalla.model.TopicState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<TopicCreateCheckModel>, Unit> f42674OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<CircleCreateCheck>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00O00O(Function1<? super Response<TopicCreateCheckModel>, Unit> function1) {
        this.f42674OooO00o = function1;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        this.f42674OooO00o.invoke(new Response<>(false, null, false, null, 14, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        TopicState topicState;
        CircleCreateCheck circleCreateCheck;
        CircleCreateCheck circleCreateCheck2;
        CircleCreateCheck circleCreateCheck3;
        CircleCreateCheck circleCreateCheck4;
        super.onFinish(str);
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
        Response<TopicCreateCheckModel> response = new Response<>(absJavaBeanApi != null, null, false, null, 14, null);
        TopicCreateCheckModel topicCreateCheckModel = new TopicCreateCheckModel(null, null, null, null, 15, null);
        Integer numValueOf = null;
        Integer numValueOf2 = (absJavaBeanApi == null || (circleCreateCheck4 = (CircleCreateCheck) absJavaBeanApi.data) == null) ? null : Integer.valueOf(circleCreateCheck4.getCircleState());
        if (numValueOf2 != null && numValueOf2.intValue() == 0) {
            topicState = TopicState.NULL;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 1) {
            topicState = TopicState.REVIEW;
        } else {
            topicState = (numValueOf2 != null && numValueOf2.intValue() == 2) ? TopicState.CREATED : TopicState.NULL;
        }
        topicCreateCheckModel.setTopicState(topicState);
        topicCreateCheckModel.setKeepLaw((absJavaBeanApi == null || (circleCreateCheck3 = (CircleCreateCheck) absJavaBeanApi.data) == null) ? null : Integer.valueOf(circleCreateCheck3.getCheckPower()));
        topicCreateCheckModel.setRegTime((absJavaBeanApi == null || (circleCreateCheck2 = (CircleCreateCheck) absJavaBeanApi.data) == null) ? null : Integer.valueOf(circleCreateCheck2.getCheckRegTime()));
        if (absJavaBeanApi != null && (circleCreateCheck = (CircleCreateCheck) absJavaBeanApi.data) != null) {
            numValueOf = Integer.valueOf(circleCreateCheck.getCheckUserLevel());
        }
        topicCreateCheckModel.setUserLevel(numValueOf);
        response.setData(topicCreateCheckModel);
        this.f42674OooO00o.invoke(response);
    }
}
