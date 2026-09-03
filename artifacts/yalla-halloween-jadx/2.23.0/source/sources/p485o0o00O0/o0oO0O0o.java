package p485o0o00O0;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p509o0o0O0.o00O0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f48010OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f48011OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Activity f48012OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f48013OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f48014OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivityVM f48015OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Activity activity, MutableState<Boolean> mutableState2, MomentDetailActivityVM momentDetailActivityVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f48011OooO0Oo = mutableState;
        this.f48013OooO0o0 = momentDetailModel;
        this.f48012OooO0o = activity;
        this.f48014OooO0oO = mutableState2;
        this.f48015OooO0oo = momentDetailActivityVM;
        this.f48010OooO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f48011OooO0Oo.getValue().booleanValue()) {
            MomentDetailModel momentDetailModel = this.f48013OooO0o0;
            if (MomentStateKt.isSystemDelete(momentDetailModel)) {
                o000O00O.OooO00o(oO00OOo0.moment_delete_by_user);
                Activity activity = this.f48012OooO0o;
                if (activity != null) {
                    activity.finish();
                }
            } else if (MomentStateKt.isUnderReview(momentDetailModel)) {
                o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
            } else {
                MomentDetailModel momentDetailModel2 = this.f48013OooO0o0;
                MutableState<Boolean> mutableState = this.f48014OooO0oO;
                o00O0O.OooO0o(momentDetailModel2, mutableState, this.f48015OooO0oo, this.f48010OooO, true, mutableState, new o0O0O0O(momentDetailModel2));
            }
        }
        return Unit.INSTANCE;
    }
}
