package p485o0o00O0;

import android.os.Handler;
import android.support.v4.media.session.OooO0o;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p367o0OOo0o0.OooOO0O;
import p466o0Oooo0o.oo00o;
import p641o0ooOOOO.t6;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f48000OooO0oO;

    public o0OOOO00(TopicBlackListActivity topicBlackListActivity) {
        this.f48000OooO0oO = topicBlackListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TopicBlackListActivity topicBlackListActivity = this.f48000OooO0oO;
        t6 t6Var = topicBlackListActivity.f26280OooOo0o;
        if (t6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            t6Var = null;
        }
        EditText editSearch = t6Var.f58869OooO0O0.getEditSearch();
        InputMethodManager inputMethodManagerOooO00o = OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context");
        OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editSearch.getWindowToken(), 0);
        topicBlackListActivity.finish();
    }
}
