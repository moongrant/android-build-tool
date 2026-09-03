package com.yalla.yalla.ext;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "Landroid/app/Activity;", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nActivityExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityExt.kt\ncom/yalla/yalla/ext/ActivityExtKt$startActivityKt$1\n*L\n1#1,30:1\n*E\n"})
public final class ActivityExtKt$startActivityKt$1 extends Lambda implements Function1<Intent, Unit> {
    static {
        new ActivityExtKt$startActivityKt$1();
    }

    public ActivityExtKt$startActivityKt$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "$this$null");
        return Unit.INSTANCE;
    }
}
