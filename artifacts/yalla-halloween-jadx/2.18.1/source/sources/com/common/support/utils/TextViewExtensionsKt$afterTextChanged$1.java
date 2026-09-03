package com.common.support.utils;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/text/Editable;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class TextViewExtensionsKt$afterTextChanged$1 extends Lambda implements Function1<Editable, Unit> {
    static {
        new TextViewExtensionsKt$afterTextChanged$1();
    }

    public TextViewExtensionsKt$afterTextChanged$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Editable editable) {
        Editable it = editable;
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
