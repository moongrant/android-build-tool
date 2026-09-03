package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f44061Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f44062Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f44063Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0000(TopicManagerActivity topicManagerActivity, String str, int i) {
        super(0);
        this.f44061Oooo0o = topicManagerActivity;
        this.f44062Oooo0oO = str;
        this.f44063Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicManagerActivity topicManagerActivity = this.f44061Oooo0o;
        String str = this.f44062Oooo0oO;
        long j = topicManagerActivity.f22643OooooOO;
        int i = this.f44063Oooo0oo;
        BaseActivityK.OooOoo0(topicManagerActivity, null, 500L, 1, null);
        topicManagerActivity.Oooo000().circleAdminDel(str, String.valueOf(j)).observe(topicManagerActivity, new OooOo(new o0OOO00(topicManagerActivity, i, str), null, new o0OOO0(topicManagerActivity), false, 10));
        return Unit.INSTANCE;
    }
}
