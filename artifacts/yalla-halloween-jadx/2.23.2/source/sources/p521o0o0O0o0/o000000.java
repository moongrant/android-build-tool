package p521o0o0O0o0;

import android.app.Activity;
import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f52908OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(int i, Activity activity, MomentDetailModel momentDetailModel) {
        super(1);
        this.f52906OooO0Oo = i;
        this.f52908OooO0o0 = activity;
        this.f52907OooO0o = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        Long lValueOf;
        Activity activity = this.f52908OooO0o0;
        boolean z = true;
        MomentDetailModel momentDetailModel = this.f52907OooO0o;
        int i = this.f52906OooO0Oo;
        if (i == 1) {
            String string = activity.getString(p562o0oOo000.o000000.user_top_pinned);
            if (!(string == null || StringsKt.isBlank(string))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            if (momentDetailModel != null) {
                momentDetailModel.setTop(true);
            }
            lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null;
            StringBuilder sb = new StringBuilder();
            sb.append(lValueOf);
            LiveEventBus.get("MOMENT_TOP_OF_USER_POST").post(new OnTopPostForUserPostModel(sb.toString(), momentDetailModel != null ? momentDetailModel.getId() : 0L));
        } else if (i == 2) {
            if (momentDetailModel != null) {
                momentDetailModel.setTop(false);
            }
            String string2 = activity.getString(p562o0oOo000.o000000.user_top_unpinned);
            if (string2 != null && !StringsKt.isBlank(string2)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
            lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getUserId()) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lValueOf);
            LiveEventBus.get("MOMENT_UN_TOP_OF_USER_POST").post(new OnTopPostForUserPostModel(sb2.toString(), 0L));
        }
        return Unit.INSTANCE;
    }
}
