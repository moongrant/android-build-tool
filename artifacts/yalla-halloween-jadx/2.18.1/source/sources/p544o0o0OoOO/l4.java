package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.KickRecordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class l4 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ KickRecordActivity f44267Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(KickRecordActivity kickRecordActivity) {
        super(1);
        this.f44267Oooo0o = kickRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() > 0) {
            KickRecordActivity kickRecordActivity = this.f44267Oooo0o;
            int i = KickRecordActivity.f22842Oooooo;
            kickRecordActivity.OooOooo(false);
        } else {
            KickRecordActivity kickRecordActivity2 = this.f44267Oooo0o;
            int i2 = KickRecordActivity.f22842Oooooo;
            kickRecordActivity2.OooOooO(false);
        }
        return Unit.INSTANCE;
    }
}
