package p509o0o0O0;

import android.content.Context;
import com.yalla.netimage.NetImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function1<Context, NetImageView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O00 f50966OooO0Oo = new o0O00();

    public o0O00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NetImageView invoke(Context context) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        return new NetImageView(context2);
    }
}
