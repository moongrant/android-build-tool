package p538o0o0Oo0;

import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p516o0o0O000.o00000O;
import p649o0ooOOoo.wd;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f43996Oooo;

    public o0O000o0(TopicBlackListActivity topicBlackListActivity) {
        this.f43996Oooo = topicBlackListActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        wd wdVar = this.f43996Oooo.f22544OooooOO;
        if (wdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            wdVar = null;
        }
        EditText editSearch = wdVar.f50891OooO0O0.getEditSearch();
        TopicBlackListActivity topicBlackListActivity = this.f43996Oooo;
        Objects.requireNonNull(topicBlackListActivity);
        o00000O.OooO00o(editSearch, topicBlackListActivity);
        this.f43996Oooo.finish();
    }
}
