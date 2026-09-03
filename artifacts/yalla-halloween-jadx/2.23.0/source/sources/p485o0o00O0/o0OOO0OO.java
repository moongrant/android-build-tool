package p485o0o00O0;

import android.os.Handler;
import android.support.v4.media.session.OooO0o;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p367o0OOo0o0.OooOO0O;
import p641o0ooOOOO.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0OO extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f47998OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(TopicBlackListActivity topicBlackListActivity) {
        super(2);
        this.f47998OooO0Oo = topicBlackListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        if (iIntValue == 3) {
            TopicBlackListActivity topicBlackListActivity = this.f47998OooO0Oo;
            ((TopicBlackListVM) topicBlackListActivity.f26278OooOo00.getValue()).searchTopicBlackList(content, true).observe(topicBlackListActivity, new o0oo0000(topicBlackListActivity, true));
            t6 t6Var = topicBlackListActivity.f26280OooOo0o;
            if (t6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                t6Var = null;
            }
            EditText editSearch = t6Var.f58869OooO0O0.getEditSearch();
            InputMethodManager inputMethodManagerOooO00o = OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context");
            OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        }
        return Unit.INSTANCE;
    }
}
