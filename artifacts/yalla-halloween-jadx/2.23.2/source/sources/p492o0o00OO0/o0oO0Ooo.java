package p492o0o00OO0;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0OO.o000OO00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f49344OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f49345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Activity f49346OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f49347OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f49348OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivityVM f49349OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(MutableState<Boolean> mutableState, MomentDetailModel momentDetailModel, Activity activity, MutableState<Boolean> mutableState2, MomentDetailActivityVM momentDetailActivityVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f49345OooO0Oo = mutableState;
        this.f49347OooO0o0 = momentDetailModel;
        this.f49346OooO0o = activity;
        this.f49348OooO0oO = mutableState2;
        this.f49349OooO0oo = momentDetailActivityVM;
        this.f49344OooO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f49345OooO0Oo.getValue().booleanValue()) {
            MomentDetailModel momentDetailModel = this.f49347OooO0o0;
            if (MomentStateKt.isSystemDelete(momentDetailModel)) {
                o000O00.OooO00o(o000000.moment_delete_by_user);
                Activity activity = this.f49346OooO0o;
                if (activity != null) {
                    activity.finish();
                }
            } else if (MomentStateKt.isUnderReview(momentDetailModel)) {
                o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
            } else {
                MomentDetailModel momentDetailModel2 = this.f49347OooO0o0;
                MutableState<Boolean> mutableState = this.f49348OooO0oO;
                o000OO00.OooO0o(momentDetailModel2, mutableState, this.f49349OooO0oo, this.f49344OooO, true, mutableState, new o0O00OOO(momentDetailModel2));
            }
        }
        return Unit.INSTANCE;
    }
}
