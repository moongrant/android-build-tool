package androidx.compose.ui.semantics;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.AppEventsManager;
import com.facebook.internal.FeatureManager;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements FeatureManager.Callback {
    public static KMutableProperty1 OooO00o(Class cls, String str, String str2, int i) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i));
    }

    public static void OooO0O0(float f, Modifier.Companion companion, Composer composer, int i) {
        SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), composer, i);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m4066onSuccess$lambda0(z);
    }
}
