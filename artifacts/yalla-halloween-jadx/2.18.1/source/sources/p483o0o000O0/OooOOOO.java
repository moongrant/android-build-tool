package p483o0o000O0;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oOO00O.OooO00o;
import oOO00O.OooO0O0;
import oOO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o00Oo0;
import p115o00O00oO.o00Ooo;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40873OooO0OO;

    public OooOOOO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40873OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f40873OooO0OO);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            o00Ooo decoder = new o00Ooo(this.f40873OooO0OO);
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            arrayList4.add(decoder);
        } else {
            o00Oo0 decoder2 = new o00Oo0();
            Intrinsics.checkNotNullParameter(decoder2, "decoder");
            arrayList4.add(decoder2);
        }
        OooO0O0 registry = new OooO0O0(CollectionsKt.toList(arrayList), CollectionsKt.toList(arrayList2), CollectionsKt.toList(arrayList3), CollectionsKt.toList(arrayList4), null);
        Intrinsics.checkNotNullParameter(registry, "registry");
        oooO00o.f52982OooO0OO = registry;
        OooOO0 imageLoader = oooO00o.OooO00o();
        synchronized (OooO00o.class) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            OooO00o.f52968OooO0O0 = imageLoader;
        }
    }
}
