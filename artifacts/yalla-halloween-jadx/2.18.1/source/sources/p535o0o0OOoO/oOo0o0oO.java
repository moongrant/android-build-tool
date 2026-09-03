package p535o0o0OOoO;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo0o0oO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f43730Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o0oO(MainSearchActivity mainSearchActivity) {
        super(0);
        this.f43730Oooo0o = mainSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainSearchActivity activity = this.f43730Oooo0o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        return Unit.INSTANCE;
    }
}
