package p492o0o00OO0;

import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import kotlin.Unit;
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p371o0OOo0oO.o00O0O;
import p405o0Oo0OOO.ooooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49320OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(TopicBlackListActivity topicBlackListActivity) {
        super(2);
        this.f49320OooO0Oo = topicBlackListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        if (iIntValue == 3) {
            TopicBlackListActivity topicBlackListActivity = this.f49320OooO0Oo;
            ((TopicBlackListVM) topicBlackListActivity.f25829OooOo00.getValue()).searchTopicBlackList(content, true).observe(topicBlackListActivity, new o0OO0O0(topicBlackListActivity, true));
            ooooO0O0 ooooo0o0 = topicBlackListActivity.f25831OooOo0o;
            if (ooooo0o0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                ooooo0o0 = null;
            }
            EditText editSearch = ooooo0o0.f45349OooO0O0.getEditSearch();
            InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
            OooO00o.OooO0O0(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        }
        return Unit.INSTANCE;
    }
}
