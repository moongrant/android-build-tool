package p485o0o00O0;

import android.os.Looper;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.OooO0OO;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p519o0o0O0oO.oO0o0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f48134OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(TopicManagerActivity topicManagerActivity) {
        super(0);
        this.f48134OooO0Oo = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicManagerActivity activity = this.f48134OooO0Oo;
        long j = activity.f26388OooOo0o;
        boolean z = true;
        if (activity.OooOo().f10111OooOOoo.size() >= activity.f26384OooOo) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.topic_info_manage_err_code_4017);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (OooO0OO.OooO00o(activity)) {
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            oOOO00Oo onConfirmClick = new oOOO00Oo(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-1450345690, true, new oO0o0o(onConfirmClick)));
        }
        return Unit.INSTANCE;
    }
}
