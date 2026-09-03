package p159o00OoOO;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements Observer<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f32414OooO00o;

    public o0000O0O(MixedRoomActivity mixedRoomActivity) {
        this.f32414OooO00o = mixedRoomActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MixedRoomActivity activity = this.f32414OooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
    }
}
