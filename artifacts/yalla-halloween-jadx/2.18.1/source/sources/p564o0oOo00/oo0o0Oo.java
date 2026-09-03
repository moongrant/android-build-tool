package p564o0oOo00;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p606o0oo0O.OooOo;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f45175Oooo;

    public oo0o0Oo(StoreActivity storeActivity) {
        this.f45175Oooo = storeActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        StoreActivity activity = this.f45175Oooo;
        if (activity.f23244OooooOO != 0) {
            activity.finish();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) TaskActivity.class));
        } else {
            Intrinsics.checkNotNullParameter(activity, "context");
            Intent intent = new Intent(activity, (Class<?>) WalletActivity.class);
            String simpleName = activity.getClass().getSimpleName();
            OooOo.OooO0OO("205001", MapsKt.mapOf(new Pair("url", simpleName)));
            intent.putExtra("FromInfo", simpleName);
            activity.startActivity(intent);
        }
    }
}
