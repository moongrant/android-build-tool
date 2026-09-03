package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import p139o00OOOo0.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOo000 extends Lambda implements Function2<String, o00000O0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f44055Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(TopicManagerActivity topicManagerActivity) {
        super(2);
        this.f44055Oooo0o = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, o00000O0 o00000o1) {
        String text = str;
        o00000O0 manager = o00000o1;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(manager, "manager");
        TopicManagerActivity topicManagerActivity = this.f44055Oooo0o;
        topicManagerActivity.Oooo000().circleAdminAdd(text, String.valueOf(topicManagerActivity.f22643OooooOO)).observe(topicManagerActivity, new OooOo(new o0OO0oO0(topicManagerActivity, manager), new o0OO(manager), null, true, 4));
        return Unit.INSTANCE;
    }
}
