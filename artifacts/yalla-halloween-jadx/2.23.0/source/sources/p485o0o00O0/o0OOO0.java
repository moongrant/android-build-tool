package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f47996OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0(TopicBlackListActivity topicBlackListActivity) {
        super(1);
        this.f47996OooO0Oo = topicBlackListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        Object[] objArr = content.length() == 0;
        t6 t6Var = null;
        o0OOo000 o0ooo001 = null;
        TopicBlackListActivity topicBlackListActivity = this.f47996OooO0Oo;
        if (objArr == true) {
            t6 t6Var2 = topicBlackListActivity.f26280OooOo0o;
            if (t6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                t6Var2 = null;
            }
            t6Var2.f58869OooO0O0.setClearVisibility(8);
            topicBlackListActivity.OooOo().f57485OooO0OO.f21330OooOooO = true;
            o0OOo000 o0ooo002 = topicBlackListActivity.f26277OooOo0;
            if (o0ooo002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                o0ooo002 = null;
            }
            o0ooo002.notifyDataSetChanged();
            o0OOo000 o0ooo003 = topicBlackListActivity.f26277OooOo0;
            if (o0ooo003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            } else {
                o0ooo001 = o0ooo003;
            }
            o0ooo001.OooOoOO(false);
            topicBlackListActivity.OooOoO0(true);
        } else {
            t6 t6Var3 = topicBlackListActivity.f26280OooOo0o;
            if (t6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                t6Var = t6Var3;
            }
            t6Var.f58869OooO0O0.setClearVisibility(0);
            topicBlackListActivity.OooOo().f57485OooO0OO.f21330OooOooO = false;
            ((TopicBlackListVM) topicBlackListActivity.f26278OooOo00.getValue()).searchTopicBlackList(content, true).observe(topicBlackListActivity, new o0oo0000(topicBlackListActivity, true));
        }
        return Unit.INSTANCE;
    }
}
