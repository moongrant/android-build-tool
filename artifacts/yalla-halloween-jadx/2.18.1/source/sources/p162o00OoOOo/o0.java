package p162o00OoOOo;

import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import p530o0o0OOO.o00O;
import p567o0oOo0O.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32494Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f32495Oooo0oO;

    public /* synthetic */ o0(Object obj, int i) {
        this.f32494Oooo0o = i;
        this.f32495Oooo0oO = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32494Oooo0o) {
            case 0:
                o0OoOoOo o0oooooo2 = (o0OoOoOo) this.f32495Oooo0oO;
                WebPageInfo webPageInfo = (WebPageInfo) obj;
                Objects.requireNonNull(o0oooooo2);
                if (!webPageInfo.f21218Oooo0oo) {
                    WebActivity.f22108OoooooO.OooO00o(o0oooooo2.f32506OooO00o, webPageInfo);
                } else {
                    o00O.f43140OooO00o.OooOOO(webPageInfo);
                }
                break;
            default:
                PostCommentSonModel postCommentSonModel = (PostCommentSonModel) this.f32495Oooo0oO;
                int i = o000Oo0.f45440OooO0oO;
                postCommentSonModel.setSendProp(false);
                break;
        }
        return null;
    }
}
