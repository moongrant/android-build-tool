package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static KProperty1 OooO00o(Class cls, String str, String str2, int i) {
        return Reflection.property1(new PropertyReference1Impl(cls, str, str2, i));
    }
}
