package p538o0o0Oo0;

import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p188o00o00o0.OooO0OO;
import p649o0ooOOoo.wd;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOoOo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f44060Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(TopicBlackListActivity topicBlackListActivity) {
        super(1);
        this.f44060Oooo0o = topicBlackListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        wd wdVar = null;
        OooO0OO<TopicBlackUserModel> oooO0OO = null;
        if (content.length() == 0) {
            wd wdVar2 = this.f44060Oooo0o.f22544OooooOO;
            if (wdVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                wdVar2 = null;
            }
            wdVar2.f50891OooO0O0.setClearVisibility(8);
            this.f44060Oooo0o.OooOoo().f50808OooO0OO.f19541o00O0O = true;
            OooO0OO<TopicBlackUserModel> oooO0OO2 = this.f44060Oooo0o.f22542Ooooo0o;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                oooO0OO2 = null;
            }
            oooO0OO2.notifyDataSetChanged();
            OooO0OO<TopicBlackUserModel> oooO0OO3 = this.f44060Oooo0o.f22542Ooooo0o;
            if (oooO0OO3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            } else {
                oooO0OO = oooO0OO3;
            }
            oooO0OO.hindEmptyView(false);
            this.f44060Oooo0o.OooOooo(true);
        } else {
            wd wdVar3 = this.f44060Oooo0o.f22544OooooOO;
            if (wdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                wdVar = wdVar3;
            }
            wdVar.f50891OooO0O0.setClearVisibility(0);
            this.f44060Oooo0o.OooOoo().f50808OooO0OO.f19541o00O0O = false;
            TopicBlackListActivity.Oooo000(this.f44060Oooo0o, content);
        }
        return Unit.INSTANCE;
    }
}
