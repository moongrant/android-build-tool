package p492o0o00OO0;

import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.collections.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p371o0OOo0oO.o00O0O;
import p405o0Oo0OOO.ooooO0O0;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49322OooO0oO;

    public o0OO0oO0(TopicBlackListActivity topicBlackListActivity) {
        this.f49322OooO0oO = topicBlackListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TopicBlackListActivity topicBlackListActivity = this.f49322OooO0oO;
        ooooO0O0 ooooo0o0 = topicBlackListActivity.f25831OooOo0o;
        if (ooooo0o0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooooo0o0 = null;
        }
        EditText editSearch = ooooo0o0.f45349OooO0O0.getEditSearch();
        InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
        OooO00o.OooO0O0(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        topicBlackListActivity.finish();
    }
}
