package p515o0o0O0O0;

import android.app.Activity;
import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f51785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51786OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f51787OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(int i, Activity activity, MomentDetailModel momentDetailModel) {
        super(1);
        this.f51785OooO0Oo = i;
        this.f51787OooO0o0 = activity;
        this.f51786OooO0o = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        Long lValueOf;
        Activity activity = this.f51787OooO0o0;
        boolean z = true;
        MomentDetailModel momentDetailModel = this.f51786OooO0o;
        int i = this.f51785OooO0Oo;
        if (i == 1) {
            String string = activity.getString(oO00OOo0.user_top_pinned);
            if (!(string == null || StringsKt.isBlank(string))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
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
            String string2 = activity.getString(oO00OOo0.user_top_unpinned);
            if (string2 != null && !StringsKt.isBlank(string2)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
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
