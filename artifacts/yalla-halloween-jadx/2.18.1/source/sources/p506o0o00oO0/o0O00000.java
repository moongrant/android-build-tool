package p506o0o00oO0;

import android.content.Intent;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 extends Lambda implements Function3<Integer, Integer, Intent, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f41660Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(o0oOOo o0oooo2) {
        super(3);
        this.f41660Oooo0o = o0oooo2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Integer num2, Intent intent) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (iIntValue == this.f41660Oooo0o.f41686OooO0o0) {
            if (iIntValue2 == -1) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Share_Shared_successfully));
            } else if (iIntValue2 != 0) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Share_Failed_to_share));
            } else {
                o00O00.OooO0O0("Share Twitter onCancel");
            }
        }
        return Unit.INSTANCE;
    }
}
