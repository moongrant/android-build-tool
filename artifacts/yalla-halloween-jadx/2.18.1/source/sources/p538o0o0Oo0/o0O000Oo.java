package p538o0o0Oo0;

import android.widget.EditText;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p516o0o0O000.o00000O;
import p649o0ooOOoo.wd;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000Oo extends Lambda implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f43995Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(TopicBlackListActivity topicBlackListActivity) {
        super(2);
        this.f43995Oooo0o = topicBlackListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        if (iIntValue == 3) {
            wd wdVar = null;
            TopicBlackListActivity.Oooo000(this.f43995Oooo0o, content);
            wd wdVar2 = this.f43995Oooo0o.f22544OooooOO;
            if (wdVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                wdVar = wdVar2;
            }
            EditText editSearch = wdVar.f50891OooO0O0.getEditSearch();
            TopicBlackListActivity topicBlackListActivity = this.f43995Oooo0o;
            Objects.requireNonNull(topicBlackListActivity);
            o00000O.OooO00o(editSearch, topicBlackListActivity);
        }
        return Unit.INSTANCE;
    }
}
