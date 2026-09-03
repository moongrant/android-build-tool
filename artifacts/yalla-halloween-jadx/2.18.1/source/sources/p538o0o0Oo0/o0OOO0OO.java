package p538o0o0Oo0;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p043OooooO0.o00O0000;
import p139o00OOOo0.o00000OO;
import p254o00ooO0O.o0000Ooo;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f44045Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(TopicManagerActivity topicManagerActivity) {
        super(0);
        this.f44045Oooo0o = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicManagerActivity activity = this.f44045Oooo0o;
        long j = activity.f22643OooooOO;
        if (activity.OooOoo().getData().size() >= activity.f22644OooooOo) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.topic_info_manage_err_code_4017));
        } else if (o0000Ooo.OooO00o(activity)) {
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
            o0OOo000 onConfirmClick = new o0OOo000(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            activity.showDialog((String) null, o00O0000.OooO0O0(-2305555, true, new o00000OO(onConfirmClick)));
        }
        return Unit.INSTANCE;
    }
}
