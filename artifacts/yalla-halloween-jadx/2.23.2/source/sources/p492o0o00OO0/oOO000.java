package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;
import p650o0ooo.o0O0oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000 extends Lambda implements Function2<String, o0O0oo00, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f49467OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000(TopicManagerActivity topicManagerActivity) {
        super(2);
        this.f49467OooO0Oo = topicManagerActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, o0O0oo00 o0o0oo00) {
        String text = str;
        o0O0oo00 manager = o0o0oo00;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(manager, "manager");
        TopicManagerActivity topicManagerActivity = this.f49467OooO0Oo;
        ((TopicManagerVM) topicManagerActivity.f25935OooOo00.getValue()).circleAdminAdd(text, String.valueOf(topicManagerActivity.f25937OooOo0o)).observe(topicManagerActivity, new o000oOoO(new oO0Oo0o0(topicManagerActivity, manager), new oO0o0000(manager), null, true, 4));
        return Unit.INSTANCE;
    }
}
