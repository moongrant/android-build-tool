package p485o0o00O0;

import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f48165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f48166OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f48167OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00o0(int i, TopicManagerActivity topicManagerActivity, String str) {
        super(0);
        this.f48165OooO0Oo = topicManagerActivity;
        this.f48167OooO0o0 = str;
        this.f48166OooO0o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicManagerActivity topicManagerActivity = this.f48165OooO0Oo;
        long j = topicManagerActivity.f26388OooOo0o;
        BaseActivityK.OooOo0o(topicManagerActivity, null, 500L, 1);
        TopicManagerVM topicManagerVM = (TopicManagerVM) topicManagerActivity.f26386OooOo00.getValue();
        String strValueOf = String.valueOf(j);
        String str = this.f48167OooO0o0;
        topicManagerVM.circleAdminDel(str, strValueOf).observe(topicManagerActivity, new o0000OO0(new oOO0OoO0(this.f48166OooO0o, topicManagerActivity, str), null, new ooooO0O0(topicManagerActivity), false, 10));
        return Unit.INSTANCE;
    }
}
