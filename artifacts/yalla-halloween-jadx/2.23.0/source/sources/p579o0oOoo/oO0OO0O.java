package p579o0oOoo;

import com.yalla.yalla.model.MomentSelectMedia;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0OO0O extends Lambda implements Function1<MomentSelectMedia, String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0OO0O f56605OooO0Oo = new oO0OO0O();

    public oO0OO0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(MomentSelectMedia momentSelectMedia) {
        MomentSelectMedia it = momentSelectMedia;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPath();
    }
}
