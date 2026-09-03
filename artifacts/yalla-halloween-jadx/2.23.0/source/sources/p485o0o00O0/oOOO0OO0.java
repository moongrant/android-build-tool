package p485o0o00O0;

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
import p158o00OoOOO.oo000o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OO0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f48169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f48170OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f48171OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f48172OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OO0(String str, TopicManagerActivity topicManagerActivity, String str2, int i) {
        super(3);
        this.f48169OooO0Oo = str;
        this.f48171OooO0o0 = topicManagerActivity;
        this.f48170OooO0o = str2;
        this.f48172OooO0oO = i;
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
                ComposerKt.traceEventStart(930893164, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicManagerActivity.showDelMemberDialog.<anonymous> (TopicManagerActivity.kt:159)");
            }
            oo000o.OooO0Oo(it, null, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.topic_info_manage_remove_admin), this.f48169OooO0Oo), null, false, false, null, null, null, false, null, false, new oOOO00o0(this.f48172OooO0oO, this.f48171OooO0o0, this.f48170OooO0o), null, false, false, null, oOOO0O0o.f48168OooO0Oo, null, null, composer2, iIntValue & 14, 12582912, 913402);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
