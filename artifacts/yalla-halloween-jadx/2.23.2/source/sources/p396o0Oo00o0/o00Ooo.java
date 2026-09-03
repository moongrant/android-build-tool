package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooO0o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p155o00OoO0.o0OoOo0;
import p191o00o0O0.o00Oo0;
import p368o0OOo0Oo.OooOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43635OooO0Oo;

    public o00Ooo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43635OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43635OooO0Oo;
        OooOo.OooO00o().getClass();
        OooO0o oooO0o = new OooO0o();
        oooO0o.f12949OooO = new o0OoOo0(262144000, "GlideCache", context);
        GeneratedAppGlideModule generatedAppGlideModuleOooO0OO = OooO0OO.OooO0OO(context);
        synchronized (OooO0OO.class) {
            if (OooO0OO.f12939OooOO0o != null) {
                OooO0OO.OooO0o();
            }
            OooO0OO.OooO0o0(context, oooO0o, generatedAppGlideModuleOooO0OO);
        }
    }
}
