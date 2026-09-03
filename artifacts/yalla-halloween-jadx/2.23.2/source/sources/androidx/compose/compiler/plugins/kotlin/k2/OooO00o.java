package androidx.compose.compiler.plugins.kotlin.k2;

import android.os.Bundle;
import androidx.media3.common.OooO0OO;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.o0OoOo0;
import java.util.Collections;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements OooO0OO.OooO00o {
    public static KProperty1 OooO00o(Class cls, String str, String str2, int i) {
        return Reflection.property1(new PropertyReference1Impl(cls, str, str2, i));
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public OooO0OO OooO0OO(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(o0OoOo0.f6873OooO0o);
        bundle2.getClass();
        o000oOoO o000oooo2 = (o000oOoO) o000oOoO.f6764OooOO0O.OooO0OO(bundle2);
        int[] intArray = bundle.getIntArray(o0OoOo0.f6874OooO0oO);
        intArray.getClass();
        return new o0OoOo0(o000oooo2, intArray.length == 0 ? Collections.emptyList() : new com.google.common.primitives.OooO0OO.OooO00o(0, intArray.length, intArray));
    }
}
