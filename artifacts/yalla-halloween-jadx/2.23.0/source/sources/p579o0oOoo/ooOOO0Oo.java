package p579o0oOoo;

import com.yalla.yalla.model.MomentSelectMedia;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ooOOO0Oo extends Lambda implements Function1<MomentSelectMedia, String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ooOOO0Oo f56723OooO0Oo = new ooOOO0Oo();

    public ooOOO0Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(MomentSelectMedia momentSelectMedia) {
        MomentSelectMedia it = momentSelectMedia;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPath();
    }
}
