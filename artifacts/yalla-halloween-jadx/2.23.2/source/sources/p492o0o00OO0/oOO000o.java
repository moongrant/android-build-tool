package p492o0o00OO0;

import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f49470OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f49471OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f49472OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000o(int i, TopicManagerActivity topicManagerActivity, String str) {
        super(0);
        this.f49470OooO0Oo = topicManagerActivity;
        this.f49472OooO0o0 = str;
        this.f49471OooO0o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicManagerActivity topicManagerActivity = this.f49470OooO0Oo;
        long j = topicManagerActivity.f25937OooOo0o;
        BaseActivityK.OooOo0o(topicManagerActivity, null, 500L, 1);
        TopicManagerVM topicManagerVM = (TopicManagerVM) topicManagerActivity.f25935OooOo00.getValue();
        String strValueOf = String.valueOf(j);
        String str = this.f49472OooO0o0;
        topicManagerVM.circleAdminDel(str, strValueOf).observe(topicManagerActivity, new o000oOoO(new oO0oO000(this.f49471OooO0o, topicManagerActivity, str), null, new oOo00o00(topicManagerActivity), false, 10));
        return Unit.INSTANCE;
    }
}
