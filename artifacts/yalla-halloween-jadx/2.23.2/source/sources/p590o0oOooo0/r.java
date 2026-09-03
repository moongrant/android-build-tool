package p590o0oOooo0;

import com.yalla.yalla.model.MomentSelectMedia;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Lambda implements Function1<MomentSelectMedia, String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final r f57269OooO0Oo = new r();

    public r() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(MomentSelectMedia momentSelectMedia) {
        MomentSelectMedia it = momentSelectMedia;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPath();
    }
}
