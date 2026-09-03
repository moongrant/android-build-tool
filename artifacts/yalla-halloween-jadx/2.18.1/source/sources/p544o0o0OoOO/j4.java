package p544o0o0OoOO;

import android.view.View;
import com.yalla.yalla.ui.activity.room.KickRecordActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.kg;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class j4 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ KickRecordActivity f44256Oooo;

    public j4(KickRecordActivity kickRecordActivity) {
        this.f44256Oooo = kickRecordActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        kg kgVar = this.f44256Oooo.f22849Oooooo0;
        if (kgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            kgVar = null;
        }
        if (StringsKt.isBlank(kgVar.f49873OooO0O0.getSearchText())) {
            this.f44256Oooo.OooOooO(false);
        } else {
            this.f44256Oooo.OooOooo(false);
        }
    }
}
