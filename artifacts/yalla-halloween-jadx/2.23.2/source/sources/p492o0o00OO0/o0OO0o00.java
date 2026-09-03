package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.ooooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49321OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(TopicBlackListActivity topicBlackListActivity) {
        super(1);
        this.f49321OooO0Oo = topicBlackListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = true;
        Object[] objArr = content.length() == 0;
        ooooO0O0 ooooo0o0 = null;
        o0OOO00 o0ooo00 = null;
        TopicBlackListActivity topicBlackListActivity = this.f49321OooO0Oo;
        if (objArr == true) {
            ooooO0O0 ooooo0o1 = topicBlackListActivity.f25831OooOo0o;
            if (ooooo0o1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                ooooo0o1 = null;
            }
            ooooo0o1.f45349OooO0O0.setClearVisibility(8);
            topicBlackListActivity.OooOo().f45030OooO0OO.f20857OooOooO = true;
            o0OOO00 o0ooo01 = topicBlackListActivity.f25828OooOo0;
            if (o0ooo01 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                o0ooo01 = null;
            }
            o0ooo01.notifyDataSetChanged();
            o0OOO00 o0ooo02 = topicBlackListActivity.f25828OooOo0;
            if (o0ooo02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            } else {
                o0ooo00 = o0ooo02;
            }
            o0ooo00.OooOoOO(false);
            topicBlackListActivity.OooOoO0(true);
        } else {
            ooooO0O0 ooooo0o2 = topicBlackListActivity.f25831OooOo0o;
            if (ooooo0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                ooooo0o0 = ooooo0o2;
            }
            ooooo0o0.f45349OooO0O0.setClearVisibility(0);
            topicBlackListActivity.OooOo().f45030OooO0OO.f20857OooOooO = false;
            ((TopicBlackListVM) topicBlackListActivity.f25829OooOo00.getValue()).searchTopicBlackList(content, true).observe(topicBlackListActivity, new o0OO0O0(topicBlackListActivity, z));
        }
        return Unit.INSTANCE;
    }
}
