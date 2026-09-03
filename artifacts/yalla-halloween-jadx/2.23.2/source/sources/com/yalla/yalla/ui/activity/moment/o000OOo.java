package com.yalla.yalla.ui.activity.moment;

import com.yalla.yalla.ui.view.UserTagView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicManagerActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicManagerActivity$adapter$2$1$convert$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
public final class o000OOo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserTagView f25976OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(UserTagView userTagView) {
        super(1);
        this.f25976OooO0Oo = userTagView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        this.f25976OooO0Oo.setName(str2);
        return null;
    }
}
