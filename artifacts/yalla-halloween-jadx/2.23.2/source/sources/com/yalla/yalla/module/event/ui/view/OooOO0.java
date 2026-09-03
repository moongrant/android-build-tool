package com.yalla.yalla.module.event.ui.view;

import androidx.compose.ui.text.AnnotatedString;
import com.yalla.yalla.module.event.ui.screen.EventSettingScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f23591OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f23592OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(AnnotatedString annotatedString, String str) {
        super(1);
        this.f23591OooO0Oo = annotatedString;
        this.f23592OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (((AnnotatedString.Range) CollectionsKt.firstOrNull((List) this.f23591OooO0Oo.getStringAnnotations(this.f23592OooO0o0, iIntValue, iIntValue))) != null) {
            o0oo0000.OooO00o.OooO0O0("101081");
            EventSettingScreen.INSTANCE.navigate();
        }
        return Unit.INSTANCE;
    }
}
