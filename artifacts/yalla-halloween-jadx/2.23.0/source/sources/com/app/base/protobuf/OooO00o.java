package com.app.base.protobuf;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.material.internal.OooOOOO;
import java.lang.reflect.Constructor;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.functions.Function1;
import p209o00o0oo0.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements oo00o.OooO00o.InterfaceC0444OooO00o, OooOOOO.OooO00o {
    public static Object OooO0O0(int i) {
        return MessageIM.getDescriptor().getMessageTypes().get(i);
    }

    public static Object OooO0Oo(int[] iArr, int i, Function1 function1) {
        return function1.invoke(UInt.m4302boximpl(UIntArray.m4368getpVg5ArA(iArr, i)));
    }

    @Override // o00o0oo0.oo00o.OooO00o.InterfaceC0444OooO00o
    public Constructor OooO00o() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public void OooO0OO(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }
}
