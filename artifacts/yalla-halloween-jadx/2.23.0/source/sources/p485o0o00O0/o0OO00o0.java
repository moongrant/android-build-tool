package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f47991OooO0Oo;

    public o0OO00o0(ShowImageActivity showImageActivity) {
        this.f47991OooO0Oo = showImageActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Bitmap?>{ kotlin.collections.TypeAliasesKt.ArrayList<android.graphics.Bitmap?> }");
        ShowImageActivity showImageActivity = this.f47991OooO0Oo;
        showImageActivity.f26261OooOoO0 = (ArrayList) obj;
        showImageActivity.OooOoO0().f49727OooO0oo = showImageActivity.f26261OooOoO0;
    }
}
