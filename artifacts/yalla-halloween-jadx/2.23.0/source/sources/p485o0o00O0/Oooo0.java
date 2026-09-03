package p485o0o00O0;

import android.R;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f47772OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(AddTopicListActivity addTopicListActivity) {
        super(0);
        this.f47772OooO0Oo = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AddTopicListActivity activity = this.f47772OooO0Oo;
        activity.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        activity.finish();
        return Unit.INSTANCE;
    }
}
