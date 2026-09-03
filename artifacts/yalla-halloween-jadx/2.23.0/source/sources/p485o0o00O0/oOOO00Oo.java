package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p519o0o0O0oO.oO000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo extends Lambda implements Function2<String, oO000O0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f48164OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(TopicManagerActivity topicManagerActivity) {
        super(2);
        this.f48164OooO0Oo = topicManagerActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, oO000O0O oo000o0o) {
        String text = str;
        oO000O0O manager = oo000o0o;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(manager, "manager");
        TopicManagerActivity topicManagerActivity = this.f48164OooO0Oo;
        ((TopicManagerVM) topicManagerActivity.f26386OooOo00.getValue()).circleAdminAdd(text, String.valueOf(topicManagerActivity.f26388OooOo0o)).observe(topicManagerActivity, new o0000OO0(new oOO0OOO(topicManagerActivity, manager), new oOO0Oo00(manager), null, true, 4));
        return Unit.INSTANCE;
    }
}
