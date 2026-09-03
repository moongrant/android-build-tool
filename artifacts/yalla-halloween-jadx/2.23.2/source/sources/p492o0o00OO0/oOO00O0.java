package p492o0o00OO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f49475OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f49476OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f49477OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49478OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O0(String str, TopicManagerActivity topicManagerActivity, String str2, int i) {
        super(3);
        this.f49475OooO0Oo = str;
        this.f49477OooO0o0 = topicManagerActivity;
        this.f49476OooO0o = str2;
        this.f49478OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(930893164, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicManagerActivity.showDelMemberDialog.<anonymous> (TopicManagerActivity.kt:160)");
            }
            o000O0Oo.OooO0Oo(it, null, o0000O.OooO00o(o0000.OooO0OO(o000000.topic_info_manage_remove_admin), this.f49475OooO0Oo), null, false, false, null, null, null, false, null, false, new oOO000o(this.f49478OooO0oO, this.f49477OooO0o0, this.f49476OooO0o), null, false, false, null, oOO00.f49466OooO0Oo, null, null, composer2, iIntValue & 14, 12582912, 913402);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
