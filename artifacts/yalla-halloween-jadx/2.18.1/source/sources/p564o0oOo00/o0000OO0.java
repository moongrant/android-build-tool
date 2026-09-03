package p564o0oOo00;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends o00Oo0 {
    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        VehicleMineActivity.OooO00o oooO00o = VehicleMineActivity.f23249OooooOo;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) VehicleMineActivity.class));
    }
}
