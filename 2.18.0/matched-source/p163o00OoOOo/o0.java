package p163o00OoOOo;

import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import p532o0o0OOO.o00OO000;
import p569o0oOo0O.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32516Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32517OoooO00;

    public /* synthetic */ o0(Object obj, int i) {
        this.f32516Oooo = i;
        this.f32517OoooO00 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32516Oooo) {
            case 0:
                o0OoOoOo o0oooooo2 = (o0OoOoOo) this.f32517OoooO00;
                WebPageInfo webPageInfo = (WebPageInfo) obj;
                Objects.requireNonNull(o0oooooo2);
                if (!webPageInfo.f21236OoooO0) {
                    WebActivity.f22127ooOO.OooO00o(o0oooooo2.f32528OooO00o, webPageInfo);
                } else {
                    o00OO000.f43171OooO00o.OooOOO(webPageInfo);
                }
                break;
            default:
                PostCommentSonModel postCommentSonModel = (PostCommentSonModel) this.f32517OoooO00;
                int i = o000Oo0.f45456OooO0oO;
                postCommentSonModel.setSendProp(false);
                break;
        }
        return null;
    }
}
