package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.OooO0OO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;
import p650o0ooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f49355OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO(TopicManagerActivity topicManagerActivity) {
        super(0);
        this.f49355OooO0Oo = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicManagerActivity activity = this.f49355OooO0Oo;
        long j = activity.f25937OooOo0o;
        boolean z = true;
        if (activity.OooOo().f13189OooOOoo.size() >= activity.f25933OooOo) {
            String strOooO0OO = o0000.OooO0OO(o000000.topic_info_manage_err_code_4017);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (OooO0OO.OooO00o(activity)) {
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            oOO000 onConfirmClick = new oOO000(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-1450345690, true, new o0OO000(onConfirmClick)));
        }
        return Unit.INSTANCE;
    }
}
